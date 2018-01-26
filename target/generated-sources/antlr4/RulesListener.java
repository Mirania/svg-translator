// Generated from Rules.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RulesParser}.
 */
public interface RulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RulesParser#rotate}.
	 * @param ctx the parse tree
	 */
	void enterRotate(@NotNull RulesParser.RotateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#rotate}.
	 * @param ctx the parse tree
	 */
	void exitRotate(@NotNull RulesParser.RotateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#setvar}.
	 * @param ctx the parse tree
	 */
	void enterSetvar(@NotNull RulesParser.SetvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#setvar}.
	 * @param ctx the parse tree
	 */
	void exitSetvar(@NotNull RulesParser.SetvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(@NotNull RulesParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(@NotNull RulesParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#scale}.
	 * @param ctx the parse tree
	 */
	void enterScale(@NotNull RulesParser.ScaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#scale}.
	 * @param ctx the parse tree
	 */
	void exitScale(@NotNull RulesParser.ScaleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(@NotNull RulesParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(@NotNull RulesParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#rect}.
	 * @param ctx the parse tree
	 */
	void enterRect(@NotNull RulesParser.RectContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#rect}.
	 * @param ctx the parse tree
	 */
	void exitRect(@NotNull RulesParser.RectContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(@NotNull RulesParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(@NotNull RulesParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterTransform(@NotNull RulesParser.TransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitTransform(@NotNull RulesParser.TransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#setClip}.
	 * @param ctx the parse tree
	 */
	void enterSetClip(@NotNull RulesParser.SetClipContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#setClip}.
	 * @param ctx the parse tree
	 */
	void exitSetClip(@NotNull RulesParser.SetClipContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#ellipse}.
	 * @param ctx the parse tree
	 */
	void enterEllipse(@NotNull RulesParser.EllipseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#ellipse}.
	 * @param ctx the parse tree
	 */
	void exitEllipse(@NotNull RulesParser.EllipseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(@NotNull RulesParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(@NotNull RulesParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#addq}.
	 * @param ctx the parse tree
	 */
	void enterAddq(@NotNull RulesParser.AddqContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#addq}.
	 * @param ctx the parse tree
	 */
	void exitAddq(@NotNull RulesParser.AddqContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(@NotNull RulesParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(@NotNull RulesParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#sq}.
	 * @param ctx the parse tree
	 */
	void enterSq(@NotNull RulesParser.SqContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#sq}.
	 * @param ctx the parse tree
	 */
	void exitSq(@NotNull RulesParser.SqContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#regular}.
	 * @param ctx the parse tree
	 */
	void enterRegular(@NotNull RulesParser.RegularContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#regular}.
	 * @param ctx the parse tree
	 */
	void exitRegular(@NotNull RulesParser.RegularContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#addpt}.
	 * @param ctx the parse tree
	 */
	void enterAddpt(@NotNull RulesParser.AddptContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#addpt}.
	 * @param ctx the parse tree
	 */
	void exitAddpt(@NotNull RulesParser.AddptContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#addcurve}.
	 * @param ctx the parse tree
	 */
	void enterAddcurve(@NotNull RulesParser.AddcurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#addcurve}.
	 * @param ctx the parse tree
	 */
	void exitAddcurve(@NotNull RulesParser.AddcurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void enterHyperlink(@NotNull RulesParser.HyperlinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void exitHyperlink(@NotNull RulesParser.HyperlinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(@NotNull RulesParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(@NotNull RulesParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#shape}.
	 * @param ctx the parse tree
	 */
	void enterShape(@NotNull RulesParser.ShapeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#shape}.
	 * @param ctx the parse tree
	 */
	void exitShape(@NotNull RulesParser.ShapeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#star}.
	 * @param ctx the parse tree
	 */
	void enterStar(@NotNull RulesParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#star}.
	 * @param ctx the parse tree
	 */
	void exitStar(@NotNull RulesParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#draw}.
	 * @param ctx the parse tree
	 */
	void enterDraw(@NotNull RulesParser.DrawContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#draw}.
	 * @param ctx the parse tree
	 */
	void exitDraw(@NotNull RulesParser.DrawContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(@NotNull RulesParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(@NotNull RulesParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#polygon}.
	 * @param ctx the parse tree
	 */
	void enterPolygon(@NotNull RulesParser.PolygonContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#polygon}.
	 * @param ctx the parse tree
	 */
	void exitPolygon(@NotNull RulesParser.PolygonContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(@NotNull RulesParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(@NotNull RulesParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#circle}.
	 * @param ctx the parse tree
	 */
	void enterCircle(@NotNull RulesParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#circle}.
	 * @param ctx the parse tree
	 */
	void exitCircle(@NotNull RulesParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RulesParser#polyline}.
	 * @param ctx the parse tree
	 */
	void enterPolyline(@NotNull RulesParser.PolylineContext ctx);
	/**
	 * Exit a parse tree produced by {@link RulesParser#polyline}.
	 * @param ctx the parse tree
	 */
	void exitPolyline(@NotNull RulesParser.PolylineContext ctx);
}