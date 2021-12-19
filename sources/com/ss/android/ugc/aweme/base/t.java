package com.ss.android.ugc.aweme.base;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements Serializable, Runnable {
    private final String arg$1;
    private final String arg$2;
    private final String arg$3;

    static {
        Covode.recordClassIndex(42039);
    }

    t(String str, String str2, String str3) {
        this.arg$1 = str;
        this.arg$2 = str2;
        this.arg$3 = str3;
    }

    public final void run() {
        String str = this.arg$1;
        String str2 = this.arg$2;
        String str3 = this.arg$3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.put("service", str2);
            b.a(str3, jSONObject);
        } catch (Exception unused) {
        }
    }
}
