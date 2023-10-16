package org.monacokit.monacoui;

import elemental2.dom.Element;

/**
 * 这是所有MonacoUI组件的基本实现, 该类提供与任何组件交互的通用行为和函数, 还可以将任何html元素包装成MonacoUI组件
 *
 * @author fushuwei
 */
public abstract class AbstractElement<E extends Element, T extends IsElement<E>> implements IsElement<E> {

    // 为组件设置唯一id属性
    private static final String MONACO_UUID = "monaco-uuid";
}
