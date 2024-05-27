package exceptions;

public class TaskDontFoundException extends RuntimeException {

    public TaskDontFoundException() {
        super("Departamento não encontrado!");
    }

    public TaskDontFoundException(String msg) {
        super(msg);
    }
}
