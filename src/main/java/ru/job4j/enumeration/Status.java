package ru.job4j.enumeration;

public enum Status {
    ACCEPTED("Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }
    },
    IN_WORK("В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING("Ожидает клиента") {
        private String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED("Завершен") {
        private String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    private final String info;

    Status(String info) {
        this.info = info;
    }

    public String info() {
        return info;
    }

    public abstract String getMessage();

    public static void main(String[] args) {
        Status toyota = Status.FINISHED;
        Status volvo = Status.WAITING;
        System.out.println("Статус Toyota: " + toyota.info());
        System.out.println("Статус Toyota: " + toyota);
        System.out.println("Статус Volvo: " + volvo.info());
        System.out.println("Статус Volvo: " + volvo);
    }
}