package shared;

/**
 * 组件是否可折叠，带有展开与折叠效果的组件应该实现这个接口
 *
 * @author fushuwei
 */
public interface IsCollapsible<T> {

    /**
     * 展开组件
     *
     * @return 组件实例
     */
    T expand();

    /**
     * 折叠组件
     *
     * @return 组件实例
     */
    T collapse();

    /**
     * 切换展开与折叠状态，如果组件是可见的，那么隐藏它，否则显示它
     *
     * @return 组件实例
     */
    T toggleCollapse();

    /**
     * 切换展开与折叠状态，根据提供的标志切换状态
     *
     * @param state 如果为true则显示组件，false则隐藏组件
     * @return 组件实例
     */
    T toggleCollapse(boolean state);

    /**
     * 判断组件是否展开状态
     *
     * @return boolean
     */
    default boolean isExpanded() {
        return !isCollapsed();
    }

    /**
     * 判断组件是否折叠状态
     *
     * @return boolean
     */
    boolean isCollapsed();
}
