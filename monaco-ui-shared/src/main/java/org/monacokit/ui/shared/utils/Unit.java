package org.monacokit.ui.shared.utils;

import static java.util.Objects.isNull;

/**
 * 定义CSS样式表中的单位
 *
 * @author fushuwei
 */
public enum Unit {

    /**
     * 绝对长度单位
     */
    cm(value -> value + "cm", unitParser(2)),
    mm(value -> value + "mm", unitParser(2)),
    q(value -> value + "Q", unitParser(1)),
    in(value -> value + "in", unitParser(2)),
    pc(value -> value + "pc", unitParser(2)),
    pt(value -> value + "pt", unitParser(2)),
    px(value -> value + "px", unitParser(2)),

    /**
     * 相对长度单位
     */
    em(value -> value + "em", unitParser(2)),
    ex(value -> value + "ex", unitParser(2)),
    ch(value -> value + "ch", unitParser(2)),
    rem(value -> value + "rem", unitParser(3)),
    lh(value -> value + "lh", unitParser(2)),
    rlh(value -> value + "rlh", unitParser(3)),
    vw(value -> value + "vw", unitParser(2)),
    vh(value -> value + "vh", unitParser(2)),
    vmin(value -> value + "vmin", unitParser(4)),
    vmax(value -> value + "vmax", unitParser(4)),
    vb(value -> value + "vb", unitParser(2)),
    vi(value -> value + "vi", unitParser(2)),
    svw(value -> value + "svw", unitParser(3)),
    svh(value -> value + "svh", unitParser(3)),
    lvw(value -> value + "lvw", unitParser(3)),
    lvh(value -> value + "lvh", unitParser(3)),
    dvw(value -> value + "dvw", unitParser(3)),
    dvh(value -> value + "dvh", unitParser(3)),

    /**
     * 百分比
     */
    percent(value -> value + "%", unitParser(1)),

    /**
     * 数字
     */
    number(value -> value + "", unitParser(0)),

    /**
     * 无单位
     */
    none(value -> value + "", unitParser(0));

    final UnitFormatter unitFormatter;
    final UnitParser unitParser;

    Unit(UnitFormatter unitFormatter, UnitParser unitParser) {
        this.unitFormatter = unitFormatter;
        this.unitParser = unitParser;
    }

    public String of(Number value) {
        return unitFormatter.format(value);
    }

    public Number parse(String value) {
        return unitParser.parse(value);
    }

    @FunctionalInterface
    interface UnitFormatter {
        String format(Number value);
    }

    @FunctionalInterface
    interface UnitParser {
        Number parse(String value);
    }

    private static UnitParser unitParser(int numOfChars) {
        return value -> isNull(value) ? 0 : Double.parseDouble(value.substring(0, value.length() - numOfChars));
    }
}

