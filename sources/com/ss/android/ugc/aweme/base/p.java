package com.ss.android.ugc.aweme.base;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements Serializable, Runnable {
    private final String arg$1;
    private final String arg$2;

    static {
        Covode.recordClassIndex(42033);
    }

    p(String str, String str2) {
        this.arg$1 = str;
        this.arg$2 = str2;
    }

    public final void run() {
        try {
            b.a(this.arg$1, new JSONObject(this.arg$2));
        } catch (Exception unused) {
        }
    }
}
