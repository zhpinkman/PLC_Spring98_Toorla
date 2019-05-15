package toorla.ast.expression;

import toorla.symbolTable.SymbolTable;
import toorla.types.Type;
import toorla.types.singleType.SingleType;
import toorla.visitor.Visitor;

public class NewArray extends Expression {
    private Expression length;
    private SingleType type;

    public NewArray(SingleType type, Expression length) {
        this.length = length;
        this.type = type;
    }

    public Expression getLength() {
        return length;
    }

    public SingleType getType() {
        return type;
    }

    public void setType(SingleType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "NewArray";
    }

    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }

    @Override
    public Type type_check(SymbolTable symbolTable) {
        return null;
    }

    @Override
    public Boolean lvalue_check(SymbolTable symbolTable) {
        return true;
    }
}
