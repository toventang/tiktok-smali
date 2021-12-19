package com.ss.android.ugc.asve.editor;

import com.bytedance.covode.number.Covode;

public enum f {
    VEEditorTYPE("type_ve_editor"),
    NLEEditorType("type_NLE_editor");
    
    private final String type;

    public final String getType() {
        return this.type;
    }

    static {
        Covode.recordClassIndex(38125);
    }

    private f(String str) {
        this.type = str;
    }
}
