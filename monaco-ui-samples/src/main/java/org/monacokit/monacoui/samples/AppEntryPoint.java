package org.monacokit.monacoui.samples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import elemental2.dom.HTMLBodyElement;
import org.jboss.elemento.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 *
 * @author fushuwei
 */
public class AppEntryPoint implements EntryPoint {

    private static final Logger logger = LoggerFactory.getLogger(AppEntryPoint.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        // Initialize uncaught exception handler
        GWT.setUncaughtExceptionHandler(e -> logger.error("PANIC! -> UncaughtException Handler called", e));

        // Cancel loading
        Element element = DomGlobal.document.getElementById("LoadingSpinner");
        if (element != null) {
            element.remove();
        }

        HTMLBodyElement body = DomGlobal.document.body;
        body.appendChild(Elements.h(1, "GWT Ultimate Material Design (abbreviated to gwt-ultimaterial、ultimaterial-ui or umd4gwt ...)").element());
        body.appendChild(Elements.label("Showcase:").element());

        logger.info("Monaco UI samples have been initialized.");
    }
}
