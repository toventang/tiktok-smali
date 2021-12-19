package com.ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public class c {
    private String panel;

    static {
        Covode.recordClassIndex(102480);
    }

    public c() {
        this(null, 1, null);
    }

    public String getPanel() {
        return this.panel;
    }

    public void setPanel(String str) {
        this.panel = str;
    }

    public c(String str) {
        this.panel = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}
