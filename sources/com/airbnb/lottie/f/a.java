package com.airbnb.lottie.f;

import com.airbnb.lottie.d;
import com.bytedance.covode.number.Covode;

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
        Covode.recordClassIndex(2313);
    }

    public static a forFile(String str) {
        a[] values = values();
        for (a aVar : values) {
            if (str.endsWith(aVar.extension)) {
                return aVar;
            }
        }
        d.a("Unable to find correct extension for ".concat(String.valueOf(str)));
        return Json;
    }

    private a(String str) {
        this.extension = str;
    }
}
