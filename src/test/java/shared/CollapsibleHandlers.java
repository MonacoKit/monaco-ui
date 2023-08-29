package shared;

/**
 * 展开和折叠处理程序
 *
 * @author fushuwei
 */
public interface CollapsibleHandlers {

    /**
     * 展开之前处理程序
     *
     * @return {@link Runnable}
     */
    Runnable onBeforeExpand();

    /**
     * 展开完成后处理程序
     *
     * @return {@link Runnable}
     */
    Runnable onExpandCompleted();

    /**
     * 折叠之前处理程序
     *
     * @return {@link Runnable}
     */
    Runnable onBeforeCollapse();

    /**
     * 折叠完成后处理程序
     *
     * @return {@link Runnable}
     */
    Runnable onCollapseCompleted();
}
