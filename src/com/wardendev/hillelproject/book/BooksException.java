package com.wardendev.hillelproject.book;

public abstract class BooksException {
    public static class DuplicateBookException extends Exception {
        public DuplicateBookException(String s) {
            super(s);
        }
    }

    public static class TooAncientBookException extends Exception {
        public TooAncientBookException(String s) {
            super(s);
        }
    }

    public static class TooFutureBookException extends Exception {
        public TooFutureBookException(String s) {
            super(s);
        }
    }

    public static class BookNotFoundException extends Exception {
        public BookNotFoundException(String s) {
            super(s);
        }
    }
}
