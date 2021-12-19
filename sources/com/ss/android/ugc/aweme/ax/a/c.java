package com.ss.android.ugc.aweme.ax.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import org.json.JSONObject;

public final class c extends Exception implements p {
    private final String type;

    static {
        Covode.recordClassIndex(41684);
    }

    public final String getType() {
        return this.type;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error_type", this.type);
        StringBuilder sb = new StringBuilder();
        Throwable cause = getCause();
        if (cause == null) {
            l.b();
        }
        StringBuilder append = sb.append(cause.getClass().getSimpleName()).append(": ");
        Throwable cause2 = getCause();
        if (cause2 == null) {
            l.b();
        }
        jSONObject.put("error_message", append.append(cause2.getMessage()).toString());
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(String str, Throwable th) {
        super(str, th);
        l.d(str, "");
        l.d(th, "");
        this.type = str;
    }
}
