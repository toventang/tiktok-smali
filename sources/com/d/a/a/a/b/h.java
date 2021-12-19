package com.d.a.a.a.b;

import com.bytedance.covode.number.Covode;

public enum h {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String impressionType;

    static {
        Covode.recordClassIndex(28305);
    }

    private h(String str) {
        this.impressionType = str;
    }

    public final String toString() {
        return this.impressionType;
    }
}
