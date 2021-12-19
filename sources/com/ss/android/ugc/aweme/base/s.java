package com.ss.android.ugc.aweme.base;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class s implements Serializable, Runnable {
    private final String arg$1;

    static {
        Covode.recordClassIndex(42036);
    }

    s(String str) {
        this.arg$1 = str;
    }

    public final void run() {
        b.a(this.arg$1, (JSONObject) null);
    }
}
