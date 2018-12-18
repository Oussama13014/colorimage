package image;

/**
 * Created by Arnaud Labourel on 25/11/2018.
 */
class NotSupportedException extends RuntimeException {
    NotSupportedException(String message) {
        super(message);
    }
}
