package com.bytedance.lottie.d;

import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.e;

public enum a {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        return ".temp" + this.extension;
    }

    static {
        Covode.recordClassIndex(24935);
    }

    public static a forFile(String str) {
        a[] values = values();
        for (a aVar : values) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        e.a("Unable to find correct extension for ".concat(String.valueOf(str)));
        return Json;
    }

    private a(String str) {
        this.extension = str;
    }
}
