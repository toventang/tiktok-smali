package com.lynx.tasm.behavior.ui.view;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.UIGroup;

public abstract class UISimpleView<T extends ViewGroup> extends UIGroup<T> {
    static {
        Covode.recordClassIndex(35204);
    }

    public UISimpleView(Context context) {
        this((j) context);
    }

    public UISimpleView(j jVar) {
        this(jVar, null);
    }

    public UISimpleView(j jVar, Object obj) {
        super(jVar, obj);
    }
}
