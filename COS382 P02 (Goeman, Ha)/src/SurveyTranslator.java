import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class SurveyTranslator implements SurveyGeneratorListener {
	public StringBuilder stringbuilder;
	public SurveyTranslator() {
		stringbuilder = new StringBuilder();
	}
	private StringBuilder javascriptcode = new StringBuilder();
	private String qname;
	private int min, max;
	private String minlabel, maxlabel;
	private String nestedchoice;
	private boolean isRandom;
	private String[] randomArray;

	private String dequote(String somestring){
		return somestring.substring(1,somestring.length()-1);
	}

	@Override
	public void enterS(SurveyGeneratorParser.SContext ctx) {
		stringbuilder.append("\n" +
				"<!DOCTYPE html>\n" +
				"<html>\n" +
				"<head>\n" +
				"<title>Generated by SurveyGenerator</title>\n" +
				"    <style type=\"text/css\">\n" +
				"    .likert ul\n" +
				"    {\n" +
				"        list-style-type: none;\n" +
				"        margin: 0;\n" +
				"        padding: 0;\n" +
				"    }\n" +
				"\n" +
				"    .likert li\n" +
				"    {\n" +
				"        float: left;\n" +
				"        text-align: left;\n" +
				"        list-style-type: none;\n" +
				"    }\n\n" +
				"    .hidden {\n" +
				"        visibility: hidden;\n" +
				"    }\n"+
				"    </style>\n" +
				"</head>\n" +
				"<body>");
	}

	@Override
	public void exitS(SurveyGeneratorParser.SContext ctx) {
		stringbuilder.append("<br>\n" +
				"<script>" +
				javascriptcode+
				"</script>\n" +
						"\n" +
				"</body>\n" +
				"</html>");
	}

	@Override
	public void enterTitle(SurveyGeneratorParser.TitleContext ctx) {
		stringbuilder.append("\n<h1>" +
				dequote(ctx.getText()) +
				"\n" +
				"</h1>\n" +
				"<br>\n");
	}

	@Override
	public void exitTitle(SurveyGeneratorParser.TitleContext ctx) {

	}

	@Override
	public void enterPage(SurveyGeneratorParser.PageContext ctx) {

	}

	@Override
	public void exitPage(SurveyGeneratorParser.PageContext ctx) {

	}

	@Override
	public void enterPagetitle(SurveyGeneratorParser.PagetitleContext ctx) {
		stringbuilder.append("<h2>\n" +
				dequote(ctx.getText()) +
				"\n" +
				"</h2>\n" +
				"<br>\n");
	}

	@Override
	public void exitPagetitle(SurveyGeneratorParser.PagetitleContext ctx) {

	}

	@Override
	public void enterQtype(SurveyGeneratorParser.QtypeContext ctx) {

	}

	@Override
	public void exitQtype(SurveyGeneratorParser.QtypeContext ctx) {

	}

	@Override
	public void enterQuestion(SurveyGeneratorParser.QuestionContext ctx) {
		stringbuilder.append("<div>");
	}

	@Override
	public void exitQuestion(SurveyGeneratorParser.QuestionContext ctx) {
		stringbuilder.append("</div>");
	}

	@Override
	public void enterQuestiontitle(SurveyGeneratorParser.QuestiontitleContext ctx) {
		qname = ctx.getText();

		stringbuilder.append("<h3>\n" +
				dequote(ctx.getText()) +
				"\n"+
				"</h3>\n" +
				"<br>\n");
	}

	@Override
	public void exitQuestiontitle(SurveyGeneratorParser.QuestiontitleContext ctx) {

	}

	@Override
	public void enterSubquestion(SurveyGeneratorParser.SubquestionContext ctx) {
		stringbuilder.append("<div class = \"hidden\" name = \""+ nestedchoice +"\" style=\"margin-left: 100px\n\">");
		javascriptcode.append("\n\nvar " +
				nestedchoice +
				" = document.querySelector(\"input[id=" + nestedchoice + "]\");\n" +
				"\n" +
				nestedchoice+".addEventListener( 'change', function() {\n" +
				"    if(!this.checked) {\n" +
				"        document.getElementsByName(\""+ nestedchoice +"\")[0].classList.add(\"hidden\");	\n"+
				"    } else {\n" +
				"       document.getElementsByName(\""+ nestedchoice +"\")[0].classList.remove(\"hidden\");\n" +
				"    }\n" +
				"});\n");
	}

	@Override
	public void exitSubquestion(SurveyGeneratorParser.SubquestionContext ctx) {
		stringbuilder.append("</div>");
	}

	@Override
	public void enterMulti(SurveyGeneratorParser.MultiContext ctx) {
		stringbuilder.append("<form>\n");

	}

	@Override
	public void exitMulti(SurveyGeneratorParser.MultiContext ctx) {
		stringbuilder.append("</form>\n");
	}

	@Override
	public void enterMultiplechoiceoption(SurveyGeneratorParser.MultiplechoiceoptionContext ctx) {
		stringbuilder.append("<input type=\"checkbox\" id =" +
				ctx.getText() + ">" +
				dequote(ctx.getText()) +
				"<br>\n");

	}

	@Override
	public void exitMultiplechoiceoption(SurveyGeneratorParser.MultiplechoiceoptionContext ctx) {

	}

	@Override
	public void enterNestedchoice(SurveyGeneratorParser.NestedchoiceContext ctx) {
		nestedchoice = dequote(ctx.getText());
	}

	@Override
	public void exitNestedchoice(SurveyGeneratorParser.NestedchoiceContext ctx) {

	}

	@Override
	public void enterSingle(SurveyGeneratorParser.SingleContext ctx) {
		stringbuilder.append("<form>\n");
	}

	@Override
	public void exitSingle(SurveyGeneratorParser.SingleContext ctx) {

		stringbuilder.append("</form>\n");
	}

	@Override
	public void enterRandomizer(SurveyGeneratorParser.RandomizerContext ctx) {

		isRandom = true;
	}

	@Override
	public void exitRandomizer(SurveyGeneratorParser.RandomizerContext ctx) {

	}

	@Override
	public void enterSinglechoiceoption(SurveyGeneratorParser.SinglechoiceoptionContext ctx) {

		stringbuilder.append("<input type=\"radio\"" +
				" name =" +
				qname +
				" id =" +
				ctx.getText() + ">" +
				dequote(ctx.getText()) +
				"<br>\n");
	}

	@Override
	public void exitSinglechoiceoption(SurveyGeneratorParser.SinglechoiceoptionContext ctx) {

	}

	@Override
	public void enterNestedchoice2(SurveyGeneratorParser.Nestedchoice2Context ctx) {
		nestedchoice = dequote(ctx.getText());
	}

	@Override
	public void exitNestedchoice2(SurveyGeneratorParser.Nestedchoice2Context ctx) {

	}

	@Override
	public void enterTextentry(SurveyGeneratorParser.TextentryContext ctx) {
		stringbuilder.append("<form>\n");
		stringbuilder.append("<textarea id=" +
				qname +
				" "
		);
	}

	@Override
	public void exitTextentry(SurveyGeneratorParser.TextentryContext ctx) {
		stringbuilder.append(">");
		stringbuilder.append("</textarea></form>\n");
	}

	@Override
	public void enterMaxlength(SurveyGeneratorParser.MaxlengthContext ctx) {

		int val = parseInt(ctx.getText());
		int row;
		int col;
		if (val < 80){
			col = val;
		}
		else{
			col = 80;
		}
		row = val/80;
		if (row == 0){
			row = 1;
		}

		stringbuilder.append("rows = \""+
				row+
				"\""+
				"cols = \" "+
				col+
				"\""
				);

	}

	@Override
	public void exitMaxlength(SurveyGeneratorParser.MaxlengthContext ctx) {

	}

	@Override
	public void enterNumber(SurveyGeneratorParser.NumberContext ctx) {

		//<form>Quantity (Min: 1, Max: 5): <input type="number" name="quantity" min="1" max="5">
		//</form>
	min = 1 << 31;
	max = ((1 << 31) >> 31) ^ min;
	}

	@Override
	public void exitNumber(SurveyGeneratorParser.NumberContext ctx) {
		stringbuilder.append("<form>" +
			"(Min: " +	min + ", Max: " + max + ") <input type=\"number\" name=\"" + dequote(qname) + "\" min=" + min + " max=" + max +
			"></form>");
	}

	@Override
	public void enterMinimum(SurveyGeneratorParser.MinimumContext ctx) {
		min = parseInt(ctx.getText());
	}

	@Override
	public void exitMinimum(SurveyGeneratorParser.MinimumContext ctx) {

	}

	@Override
	public void enterMaximum(SurveyGeneratorParser.MaximumContext ctx) {
	max = parseInt(ctx.getText());
	}

	@Override
	public void exitMaximum(SurveyGeneratorParser.MaximumContext ctx) {

	}

	@Override
	public void enterDate(SurveyGeneratorParser.DateContext ctx) {
		stringbuilder.append("<form>" +
				"<input type=\"date\" name=\"" + dequote(qname) + "\"></form>");

	}

	@Override
	public void exitDate(SurveyGeneratorParser.DateContext ctx) {

	}

	@Override
	public void enterUpload(SurveyGeneratorParser.UploadContext ctx) {
		stringbuilder.append("<form>\n" +
				"<input type=\"file\" name=\"" + dequote(qname) + "\">\n"+
		"</form>\n");
	}

	@Override
	public void exitUpload(SurveyGeneratorParser.UploadContext ctx) {

	}

	@Override
	public void enterScale(SurveyGeneratorParser.ScaleContext ctx) {

	}

	@Override
	public void exitScale(SurveyGeneratorParser.ScaleContext ctx) {
		stringbuilder.append("<form>\n" +
				"\t<ul class = \"likert\">\n" +
				"\t\t <li class = \"likert\"> " + dequote(minlabel) +
						"<input id=\"rad" + dequote(qname) + "Start\" type=\"radio\" name=\""+dequote(qname)+"\" value=\"1\" />\n"+
				"\t\t <li class = \"likert\"><input type=\"radio\" name=\""+dequote(qname) +"\" value=\"2\" />\n"+
				"\t\t <li class = \"likert\"><input type=\"radio\" name=\""+dequote(qname) +"\" value=\"3\" />\n"+
				"\t\t <li class = \"likert\"><input type=\"radio\" name=\""+dequote(qname) +"\" value=\"4\" />\n"+
				"\t\t <li class = \"likert\"><input id=\"rad" + dequote(qname) + "End\" type=\"radio\" name=\""+dequote(qname)+"\" value=\"5\" />"+ dequote(maxlabel) + "\n"+
				"\t</ul>\n</form>\n<br>\n");

	}

	@Override
	public void enterMinlabel(SurveyGeneratorParser.MinlabelContext ctx) {
		minlabel = ctx.getText();
	}

	@Override
	public void exitMinlabel(SurveyGeneratorParser.MinlabelContext ctx) {

	}

	@Override
	public void enterMaxlabel(SurveyGeneratorParser.MaxlabelContext ctx) {
		maxlabel = ctx.getText();
	}

	@Override
	public void exitMaxlabel(SurveyGeneratorParser.MaxlabelContext ctx) {

	}

	@Override
	public void visitTerminal(TerminalNode terminalNode) {

	}

	@Override
	public void visitErrorNode(ErrorNode errorNode) {

	}

	@Override
	public void enterEveryRule(ParserRuleContext parserRuleContext) {

	}

	@Override
	public void exitEveryRule(ParserRuleContext parserRuleContext) {

	}
}
