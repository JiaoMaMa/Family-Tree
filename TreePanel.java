import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import static java.awt.geom.AffineTransform.*;
import java.awt.geom.AffineTransform;
/**
 * Write a description of class TreePanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TreePanel extends JPanel
{
    private Family family;
    /**
     * Constructor for objects of class TreePanel
     */
    public TreePanel(Family family)
    {
        this.family = family;
        setLayout(new BorderLayout());
        DisplayTree tree = new DisplayTree(family);
        add(tree);
    }

}
