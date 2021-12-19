package com.ss.android.ugc.aweme.commercialize.track;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.framework.a.a;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements RawURLGetter.a {

    /* renamed from: a  reason: collision with root package name */
    private final e f75359a;

    /* renamed from: b  reason: collision with root package name */
    private final String f75360b;

    /* renamed from: c  reason: collision with root package name */
    private final long f75361c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f75362d;

    static {
        Covode.recordClassIndex(46505);
    }

    c(e eVar, String str, long j2, JSONObject jSONObject) {
        this.f75359a = eVar;
        this.f75360b = str;
        this.f75361c = j2;
        this.f75362d = jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.a
    public final void a(int i2, boolean z, Exception exc) {
        e eVar = this.f75359a;
        String str = this.f75360b;
        long j2 = this.f75361c;
        JSONObject jSONObject = this.f75362d;
        if (eVar != null) {
            eVar.a(str, String.valueOf(i2), j2);
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
        if (com.bytedance.ies.android.base.runtime.a.f31873b != null) {
            com.bytedance.ies.android.base.runtime.a.f31873b.monitorStatusRate("aweme_third_party_track_url_succeed_rate", z ? 1 : 0, jSONObject);
        }
    }
}
