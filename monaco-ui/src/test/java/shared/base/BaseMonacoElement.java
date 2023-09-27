package shared.base;

import elemental2.dom.Element;
import shared.IsCollapsible;
import shared.IsElement;

/**
 * 这是所有MonacoUI组件的基本实现。该类提供与任何组件交互的通用行为和函数，还可以包装任何html元素，将其视为MonacoUI组件
 *
 * @author fushuwei
 */
public abstract class BaseMonacoElement<E extends Element, T extends IsElement<E>>
    implements IsElement<E>, IsCollapsible<T> {

}
