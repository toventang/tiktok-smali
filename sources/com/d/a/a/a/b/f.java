package com.d.a.a.a.b;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;

public enum f {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO(DataType.AUDIO);
    
    private final String creativeType;

    static {
        Covode.recordClassIndex(28303);
    }

    private f(String str) {
        this.creativeType = str;
    }

    public final String toString() {
        return this.creativeType;
    }
}
