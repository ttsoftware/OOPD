package spreadsheet;

import quickcheck.Generator;
import quickcheck.IntegerGenerator;

public class PositionGenerator extends Generator<Position> {

    private final IntegerGenerator columnGen, rowGen;

    public PositionGenerator() {
        this.columnGen = new IntegerGenerator();
        this.rowGen = new IntegerGenerator();
    }

    @Override
    public Position next() {
        return new Position(columnGen.next(), rowGen.next());
    }
}
