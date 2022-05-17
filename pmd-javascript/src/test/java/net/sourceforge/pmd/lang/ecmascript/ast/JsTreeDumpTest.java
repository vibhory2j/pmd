/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */


package net.sourceforge.pmd.lang.ecmascript.ast;

import org.junit.Test;

import net.sourceforge.pmd.lang.ast.test.BaseParsingHelper;
import net.sourceforge.pmd.lang.ast.test.BaseTreeDumpTest;
import net.sourceforge.pmd.lang.ast.test.NodePrintersKt;

public class JsTreeDumpTest extends BaseTreeDumpTest {
    public JsTreeDumpTest() {
        super(NodePrintersKt.getSimpleNodePrinter(), ".js");
    }

    @Override
    public BaseParsingHelper<JsParsingHelper, ASTAstRoot> getParser() {
        return JsParsingHelper.DEFAULT.withResourceContext(JsTreeDumpTest.class, "testdata");
    }

    @Test
    public void simpleJavascriptFile() {
        doTest("SimpleJavascriptFile");
    }

    @Test
    public void jquerySelector() {
        doTest("jquery-selector");
    }

    @Test
    public void decorators() {
        doTest("decorators");
    }

    @Test
    public void templateStrings() {
        doTest("templateStrings");
    }

    @Test
    public void issue3948() {
        // https://github.com/pmd/pmd/issues/3948
        doTest("issue3948");
    }

    @Test
    public void issuegetset() {
        // https://github.com/pmd/pmd/issues/3948
        doTest("issuegetset");
    }

    @Test
    public void issuedot() {
        // https://github.com/pmd/pmd/issues/3948
        doTest("issuedot");
    }
}
