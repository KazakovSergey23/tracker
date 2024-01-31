package ru.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user: users) {
            if (user.getUserName().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException();
    }
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUserName().length() < 3) {
            throw new UserInvalidException();
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Ivan Ivanov", true)};
        try {
            User user = findUser(users, "Ivan Ivanov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.err.println("Пользователь не валидный");
        } catch (UserNotFoundException e) {
            System.err.println("Пользователь не найден");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}