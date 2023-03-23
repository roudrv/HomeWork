import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int action;
        Scanner scanner = new Scanner(System.in);
        Reader[] readers = new Reader[10];

        do {
            System.out.println("1 -- Добавить нового читателя");
            System.out.println("2 -- Читатель хочет взять книгу");
            System.out.println("3 -- Читатель хочет вернуть книгу");
            System.out.println("4 -- Вывести статус читателя");
            System.out.println("5 -- Вывести статус всех читателей");
            System.out.println("6 -- Выйти из программы");
            System.out.println("Введите номер действия:");

            action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 1: {
                    boolean isFull = true;
                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] == null) {
                            System.out.println("Введите фамилию");
                            String surname = scanner.nextLine();
                            System.out.println("Введите имя");
                            String firstName = scanner.nextLine();
                            System.out.println("Введите Отчество");
                            String patronymic = scanner.nextLine();
                            System.out.println("Введите номер читательского билета(числа)");
                            int numReadTicket = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Введите факультет");
                            String faculty = scanner.nextLine();
                            System.out.println("Введите дату рождения");
                            String dateBirth = scanner.nextLine();
                            System.out.println("Введите телефон");
                            String phoneNumber = scanner.nextLine();


                            readers[i] = new Reader(firstName, surname, patronymic, numReadTicket, faculty, dateBirth, phoneNumber);
                            isFull = false;
                            System.out.println();
                            break;
                        }
                    }
                    if (isFull) {
                        System.out.println("Количество читателей уже максимальное");
                        System.out.println();
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите данные книги:");
                    System.out.println("название");
                    String nameBook = scanner.nextLine();
                    System.out.println("автор");
                    String authorName = scanner.nextLine();
                    System.out.println("содержание");
                    String text = scanner.nextLine();

                    Book newBook = new Book(nameBook, authorName, text);
                    System.out.println("Введите номер билета");
                    int numReadTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumReadTicket() == numReadTicket) {
                            readers[i].takeBook(newBook);
                            found = true;
                            System.out.println();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    System.out.println("Введите название книги");
                    String nameBook = scanner.nextLine();
                    System.out.println("Введите номер билета");
                    int numReadTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumReadTicket() == numReadTicket) {
                            readers[i].returnBook(nameBook);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                        System.out.println();
                    }
                    break;
                }

                case 4: {
                    System.out.println("Введите номер билета");
                    int numReadTicket = scanner.nextInt();
                    scanner.nextLine();
                    boolean found = false;

                    for (int i = 0; i < readers.length; i++) {
                        if (readers[i] != null && readers[i].getNumReadTicket() == numReadTicket) {
                            readers[i].printStatus();
                            found = true;
                            System.out.println();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Такого пользователя нет");
                        System.out.println();
                    }
                    break;
                }

                case 5: {
                    for (Reader reader : readers) {
                        if (reader != null) {
                            reader.printStatus();
                        }
                    }
                    System.out.println();
                    break;
                }

                case 6: {
                    System.out.println("Завершаем программу");
                    break;
                }

                default: {
                    System.out.println("Нет такой команды");
                    System.out.println();
                }
            }

        } while (action != 6);
    }
}