
/*
 * 
 */
package gettw.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import gettw.diagram.providers.GettwElementTypes;

/**
 * @generated
 */
public class GettwPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createShapes1Group());
		paletteRoot.add(createText2Group());
		paletteRoot.add(createCustomElements3Group());
	}

	/**
	* Creates "Shapes" palette tool group
	* @generated
	*/
	private PaletteContainer createShapes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Shapes1Group_title);
		paletteContainer.setId("createShapes1Group"); //$NON-NLS-1$
		paletteContainer.add(createRectangle1CreationTool());
		paletteContainer.add(createRoundedRectangle2CreationTool());
		paletteContainer.add(createEllipse3CreationTool());
		paletteContainer.add(createTriangle4CreationTool());
		paletteContainer.add(createTriangleDown5CreationTool());
		paletteContainer.add(createTriangleLeft6CreationTool());
		paletteContainer.add(createTriangleRight7CreationTool());
		paletteContainer.add(createDiamond8CreationTool());
		paletteContainer.add(new PaletteSeparator());
		paletteContainer.add(createActor10CreationTool());
		paletteContainer.add(createPackage11CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Text" palette tool group
	* @generated
	*/
	private PaletteContainer createText2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Text2Group_title);
		paletteContainer.setId("createText2Group"); //$NON-NLS-1$
		paletteContainer.add(createText1CreationTool());
		paletteContainer.add(createTextwIndexes2CreationTool());
		paletteContainer.add(createTextwSuperscript3CreationTool());
		paletteContainer.add(createTextwSubscript4CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Custom Elements" palette tool group
	* @generated
	*/
	private PaletteContainer createCustomElements3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.CustomElements3Group_title);
		paletteContainer.setId("createCustomElements3Group"); //$NON-NLS-1$
		paletteContainer.add(createPicture1CreationTool());
		paletteContainer.add(createShape2CreationTool());
		paletteContainer.add(createLink3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createRectangle1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Rectangle1CreationTool_title,
				Messages.Rectangle1CreationTool_desc, Collections.singletonList(GettwElementTypes.Rectangle_2004));
		entry.setId("createRectangle1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/rectangle16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/rectangle64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRoundedRectangle2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.RoundedRectangle2CreationTool_title,
				Messages.RoundedRectangle2CreationTool_desc,
				Collections.singletonList(GettwElementTypes.RoundedRectangle_2005));
		entry.setId("createRoundedRectangle2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GettwDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.gettw.figures/images/rounded_rectangle16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/rounded_rectangle64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEllipse3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Ellipse3CreationTool_title,
				Messages.Ellipse3CreationTool_desc, Collections.singletonList(GettwElementTypes.Ellipse_2010));
		entry.setId("createEllipse3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/ellipse16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/ellipse64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTriangle4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Triangle4CreationTool_title,
				Messages.Triangle4CreationTool_desc, Collections.singletonList(GettwElementTypes.Triangle_2011));
		entry.setId("createTriangle4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/triangle16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/triangle64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTriangleDown5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TriangleDown5CreationTool_title,
				Messages.TriangleDown5CreationTool_desc,
				Collections.singletonList(GettwElementTypes.TriangleDown_2013));
		entry.setId("createTriangleDown5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GettwDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.gettw.figures/images/triangle_down16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/triangle_down64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTriangleLeft6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TriangleLeft6CreationTool_title,
				Messages.TriangleLeft6CreationTool_desc,
				Collections.singletonList(GettwElementTypes.TriangleLeft_2014));
		entry.setId("createTriangleLeft6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GettwDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.gettw.figures/images/triangle_left16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/triangle_left64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTriangleRight7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TriangleRight7CreationTool_title,
				Messages.TriangleRight7CreationTool_desc,
				Collections.singletonList(GettwElementTypes.TriangleRight_2015));
		entry.setId("createTriangleRight7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(GettwDiagramEditorPlugin
				.findImageDescriptor("/org.chico.uclm.gettw.figures/images/triangle_right16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/triangle_right64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDiamond8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Diamond8CreationTool_title,
				Messages.Diamond8CreationTool_desc, Collections.singletonList(GettwElementTypes.Diamond_2012));
		entry.setId("createDiamond8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/diamond16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/diamond64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createActor10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Actor10CreationTool_title,
				Messages.Actor10CreationTool_desc, Collections.singletonList(GettwElementTypes.Actor_2016));
		entry.setId("createActor10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/actor16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/actor64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPackage11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Package11CreationTool_title,
				Messages.Package11CreationTool_desc, Collections.singletonList(GettwElementTypes.Package_2017));
		entry.setId("createPackage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/package16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/package64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Text1CreationTool_title,
				Messages.Text1CreationTool_desc, Collections.singletonList(GettwElementTypes.Text_2021));
		entry.setId("createText1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/text16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/text64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextwIndexes2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextwIndexes2CreationTool_title,
				Messages.TextwIndexes2CreationTool_desc, Collections.singletonList(GettwElementTypes.TextIndex_2020));
		entry.setId("createTextwIndexes2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/textindex16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/textindex64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextwSuperscript3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextwSuperscript3CreationTool_title,
				Messages.TextwSuperscript3CreationTool_desc,
				Collections.singletonList(GettwElementTypes.Superscript_2018));
		entry.setId("createTextwSuperscript3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/superscript16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/superscript64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTextwSubscript4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.TextwSubscript4CreationTool_title,
				Messages.TextwSubscript4CreationTool_desc, Collections.singletonList(GettwElementTypes.Subscript_2019));
		entry.setId("createTextwSubscript4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/subscript16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/subscript64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPicture1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Picture1CreationTool_title,
				Messages.Picture1CreationTool_desc, Collections.singletonList(GettwElementTypes.Picture_2003));
		entry.setId("createPicture1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/picture16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/picture64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createShape2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Shape2CreationTool_title,
				Messages.Shape2CreationTool_desc, Collections.singletonList(GettwElementTypes.CustomShape_2001));
		entry.setId("createShape2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/shape16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/shape64.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLink3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Link3CreationTool_title,
				Messages.Link3CreationTool_desc, Collections.singletonList(GettwElementTypes.CustomLink_2002));
		entry.setId("createLink3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				GettwDiagramEditorPlugin.findImageDescriptor("/org.chico.uclm.gettw.figures/images/line16.png")); //$NON-NLS-1$
		entry.setLargeIcon(GettwDiagramEditorPlugin.findImageDescriptor("images/line64.png")); //$NON-NLS-1$
		return entry;
	}

}
