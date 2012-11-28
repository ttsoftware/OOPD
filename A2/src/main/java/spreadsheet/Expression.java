package spreadsheet;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 11/21/12
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Expression {

    private final String value;

    public Expression(final String value) {
        this.value = value;
    }

    public boolean toBoolean() {
        return value.length() > 0;
    }

    public int toInt() {
        return value.length();
    }

    public String getValue() {
        return value;
    }
}
