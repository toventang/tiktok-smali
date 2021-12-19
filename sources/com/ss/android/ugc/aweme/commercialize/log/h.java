package com.ss.android.ugc.aweme.commercialize.log;

import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.log.RawURLGetter;
import com.ss.android.ugc.aweme.framework.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements RawURLGetter.a {

    /* renamed from: a  reason: collision with root package name */
    private final ah f74811a;

    /* renamed from: b  reason: collision with root package name */
    private final String f74812b;

    /* renamed from: c  reason: collision with root package name */
    private final long f74813c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f74814d;

    static {
        Covode.recordClassIndex(46114);
    }

    h(ah ahVar, String str, long j2, JSONObject jSONObject) {
        this.f74811a = ahVar;
        this.f74812b = str;
        this.f74813c = j2;
        this.f74814d = jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.log.RawURLGetter.a
    public final void a(int i2, boolean z, Exception exc) {
        ah ahVar = this.f74811a;
        String str = this.f74812b;
        long j2 = this.f74813c;
        JSONObject jSONObject = this.f74814d;
        if (ahVar != null) {
            ahVar.a(str, String.valueOf(i2), j2);
        }
        if (exc != null) {
            a.a("", exc);
            try {
                jSONObject.put("error_message", exc.getMessage());
            } catch (JSONException unused) {
            }
        }
        try {
            jSONObject.put("status_code", i2);
        } catch (JSONException unused2) {
        }
        b.a("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
    }
}
