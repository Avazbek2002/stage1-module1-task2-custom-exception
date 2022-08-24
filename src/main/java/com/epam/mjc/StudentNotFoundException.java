package com.epam.mjc;

class StudentNotFoundException extends Exception {
    public StudentNotFoundException (String cause) {
        super(cause);
    }

    public StudentNotFoundException (String cause, Throwable clause) {
        super (cause, clause);
    }
}
