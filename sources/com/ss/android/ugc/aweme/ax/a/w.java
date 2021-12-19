package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class w extends d {

    /* renamed from: a  reason: collision with root package name */
    public final v f67752a;

    /* renamed from: b  reason: collision with root package name */
    public v f67753b;

    /* renamed from: c  reason: collision with root package name */
    public Uri f67754c;

    /* renamed from: d  reason: collision with root package name */
    public final Uri f67755d;

    static {
        Covode.recordClassIndex(41715);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        e.a(jSONObject, this.f67753b.getFormatData());
        e.a(jSONObject, this.f67752a.getFormatData());
        e.a(jSONObject, a());
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.t
    public final String b() {
        String uri = new Uri.Builder().scheme(this.f67752a.f67750a.getScheme()).authority(this.f67752a.f67750a.getAuthority()).path(this.f67752a.f67750a.getPath()).build().toString();
        l.b(uri, "");
        return uri;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(Uri uri, Uri uri2, Map<String, String> map) {
        super(map);
        l.d(uri, "");
        l.d(uri2, "");
        this.f67755d = uri;
        this.f67752a = new v(uri, "referrer_", null, 4);
        this.f67753b = new v(uri2, "page_", null, 4);
        this.f67754c = uri2;
    }
}
