import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Driver {
    public static void main(String[] args) {
        String query = "3.1 * (6.3 - 4.51) + 5";

        CalculatorLexer lexer = new CalculatorLexer(new ANTLRInputStream(query));
        CalculatorParser parser = new CalculatorParser(new CommonTokenStream(lexer));
        CalculatorVisitor visitor = new MyCalculatorVisitor();

        System.out.println(visitor.visit(parser.expr()));
    }
}
