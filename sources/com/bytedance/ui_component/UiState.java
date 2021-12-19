package com.bytedance.ui_component;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.l;

public class UiState implements af {
    private final a ui;

    static {
        Covode.recordClassIndex(27972);
    }

    public a getUi() {
        return this.ui;
    }

    public UiState(a aVar) {
        l.d(aVar, "");
        this.ui = aVar;
    }
}
