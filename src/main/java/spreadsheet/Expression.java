package spreadsheet;

/**
 * Created with IntelliJ IDEA.
 * User: troels
 * Date: 11/21/12
 * Time: 2:18 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Expression {

    public abstract boolean toBoolean();

    public abstract int toInt();

    public abstract String getValue();
}
