package net.sourceforge.pmd.examples.java.rules;

import net.sourceforge.pmd.test.SimpleAggregatorTst;

public class VariableNamingRuleTest extends SimpleAggregatorTst {

    @Override
    protected void setUp() {
        addRule("net/sourceforge/pmd/examples/java/rules/VariableNaming.xml", "VariableNaming");
    }
}
