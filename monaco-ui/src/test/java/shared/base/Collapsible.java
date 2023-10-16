package shared.base;

import elemental2.dom.Element;
import shared.CollapsibleHandlers;
import shared.IsCollapsible;
import org.monacokit.monacoui.IsElement;

/**
 * 显示和隐藏元素的组件，该组件可以包装任何元素，以提供显示和隐藏被包装元素的功能，也允许在元素显示和隐藏时附加回调
 *
 * @author fushuwei
 */
public abstract class Collapsible implements IsElement<Element>, IsCollapsible<Collapsible> {

    private Element element;
    private CollapsibleHandlers handlers;

    private boolean isCollapsed = false;
    private boolean forceCollapse = false;

    @Override
    public Element element() {
        return element;
    }
}
