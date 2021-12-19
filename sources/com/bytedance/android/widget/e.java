package com.bytedance.android.widget;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e extends Error {
    private final String message;

    static {
        Covode.recordClassIndex(14289);
    }

    public final String getMessage() {
        return this.message;
    }

    public e(String str) {
        this.message = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Widget widget) {
        this((Class<? extends Widget>) widget.getClass());
        l.c(widget, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e(Class<? extends Widget> cls) {
        this(cls.getSimpleName() + " should use WidgetContainer!");
        l.c(cls, "");
    }
}
