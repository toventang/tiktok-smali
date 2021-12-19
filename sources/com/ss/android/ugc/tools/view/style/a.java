package com.ss.android.ugc.tools.view.style;

import com.bytedance.covode.number.Covode;

public enum a {
    REGULAR("regular", 1),
    BOLD("bold", 2),
    BOLD_ITALIC("boldItalic", 3),
    ITALIC("italic", 4),
    LIGHT("light", 5),
    LIGHT_ITALIC("lightItalic", 6),
    MEDIUM("medium", 7),
    MEDIUM_ITALIC("mediumItalic", 8);
    
    private final String FONT_NAME;
    private final int VALUE;

    public final String getFONT_NAME() {
        return this.FONT_NAME;
    }

    public final int getVALUE() {
        return this.VALUE;
    }

    static {
        Covode.recordClassIndex(98825);
    }

    private a(String str, int i2) {
        this.FONT_NAME = str;
        this.VALUE = i2;
    }
}
