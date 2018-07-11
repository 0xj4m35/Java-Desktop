/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupcheck;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Container;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.Scrollable;

/**
 *
 * @author vip
 */
public class ScrollablePane extends JPanel implements Scrollable {
            public ScrollablePane(LayoutManager layout) {
                super(layout);
            }
            public ScrollablePane() {
            }
            @Override
            public Dimension getPreferredScrollableViewportSize() {
                return new Dimension(200, 200);
            }
            @Override
            public boolean getScrollableTracksViewportWidth() {
                boolean track = false;
                Container parent = getParent();
                if (parent instanceof JViewport) {
                    JViewport vp = (JViewport) parent;
                    track = vp.getWidth() > getPreferredSize().width;
                }
                return track;
            }
            @Override
            public boolean getScrollableTracksViewportHeight() {
                boolean track = false;
                Container parent = getParent();
                if (parent instanceof JViewport) {
                    JViewport vp = (JViewport) parent;
                    track = vp.getHeight() > getPreferredSize().height;
                }
                return track;
            }
    @Override
    public int getScrollableUnitIncrement(Rectangle rctngl, int i, int i1) {
        return 32;
    }
    @Override
    public int getScrollableBlockIncrement(Rectangle rctngl, int i, int i1) {
        return 32;
    }

        }