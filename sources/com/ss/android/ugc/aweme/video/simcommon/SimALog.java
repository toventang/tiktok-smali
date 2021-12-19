package com.ss.android.ugc.aweme.video.simcommon;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bm.b;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.video.b.q;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IALog;
import h.f.b.l;
import org.json.JSONObject;

public class SimALog implements IALog {
    static {
        Covode.recordClassIndex(94066);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public boolean isEnabled() {
        return q.a();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void d(String str) {
        b.a(str);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void e(String str, String str2) {
        b.a(str, str2);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void d(String str, JSONObject jSONObject) {
        b.b(str, jSONObject);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void e(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (q.a()) {
            String a2 = b.a(str, jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                l.d(a2, "");
                if (q.a()) {
                    a.a(6, b.f68729a, a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void i(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (q.a()) {
            String a2 = b.a(str, jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                l.d(a2, "");
                if (q.a()) {
                    a.a(4, b.f68729a, a2);
                }
            }
        }
    }

    public void v(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (q.a()) {
            String a2 = b.a(str, jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                l.d(a2, "");
                if (q.a()) {
                    a.a(2, b.f68729a, a2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.reporter.IALog
    public void w(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        if (q.a()) {
            String a2 = b.a(str, jSONObject);
            if (!TextUtils.isEmpty(a2)) {
                l.d(a2, "");
                if (q.a()) {
                    a.a(5, b.f68729a, a2);
                }
            }
        }
    }
}
