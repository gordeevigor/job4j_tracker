package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("User \"" + login + "\" not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User \"" + user.getUsername()
                    + "\" is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", true)};
        String login = "Petr Arsentev";
        try {
            User user = findUser(users, login); // Найденного пользователя передаем в validate
            validate(user);
            System.out.println("Found user \"" + login + "\" in status: " + user.isValid());
        } catch (UserInvalidException ue) {
            ue.printStackTrace();
        } catch (UserNotFoundException ne) {
            ne.printStackTrace();
        }
    }
}
