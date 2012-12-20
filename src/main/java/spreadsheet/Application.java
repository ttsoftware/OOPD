package spreadsheet;

import java.util.ArrayList;

/**
 * A singleton class representing a spreadsheet application.
 * <p/>
 * The instance is initialized on first mention of the class.
 */
public final class Application {

    private ArrayList<Spreadsheet> spreadsheets;
    private Spreadsheet worksheet;

    public static final Application instance = new Application();

    private Application() {
        this.worksheet = new Spreadsheet();
        this.spreadsheets = new ArrayList<>();
        this.spreadsheets.add(this.worksheet);
    }

    public void exit() {
        System.exit(0);
    }

    public void newSpreadsheet() {
        spreadsheets.add(new Spreadsheet());
    }

    public void changeWorkSheet(final String name) {
        try {
            setWorksheet(getSpreadsheet(name));
        }
        catch (NoSuchSpreadsheetException e) {
            // Gør noget relevant, f.eks. fortæl brugeren at det spreadsheet ikke findes
            e.printStackTrace();
        }
    }

    public Spreadsheet getSpreadsheet(final String name) throws NoSuchSpreadsheetException {
        for (Spreadsheet spreadsheet : spreadsheets) {
            if (spreadsheet.getName().equals(name)) {
                return spreadsheet;
            }
        }
        throw new NoSuchSpreadsheetException(name);
    }

    public Iterable<String> listSpreadsheets() {
        ArrayList<String> spreadsheetNames = new ArrayList<>();
        for (Spreadsheet spreadsheet : spreadsheets) {
            spreadsheetNames.add(spreadsheet.getName());
        }
        return spreadsheetNames;
    }

    public Spreadsheet getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(Spreadsheet worksheet) {
        this.worksheet = worksheet;
    }
}