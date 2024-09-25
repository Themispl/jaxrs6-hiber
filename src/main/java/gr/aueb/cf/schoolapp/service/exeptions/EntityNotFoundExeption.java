package gr.aueb.cf.schoolapp.service.exeptions;

import java.io.Serial;

public class EntityNotFoundExeption extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public EntityNotFoundExeption(String message) {
        super(message);
    }
}
