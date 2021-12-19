package com.ss.android.ugc.aweme.ax.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class v extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f67750a;

    /* renamed from: b  reason: collision with root package name */
    public final String f67751b;

    static {
        Covode.recordClassIndex(41714);
    }

    @Override // com.ss.android.ugc.aweme.ax.a.t
    public final String b() {
        String uri = new Uri.Builder().scheme(this.f67750a.getScheme()).authority(this.f67750a.getAuthority()).path(this.f67750a.getPath()).build().toString();
        l.b(uri, "");
        return uri;
    }

    @Override // com.ss.android.ugc.aweme.ax.a.p
    public final JSONObject getFormatData() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(this.f67751b + "host", new Uri.Builder().scheme(this.f67750a.getScheme()).authority(this.f67750a.getAuthority()).build());
        jSONObject.put(this.f67751b + "path", this.f67750a.getPath());
        jSONObject.put(this.f67751b + "url", new Uri.Builder().scheme(this.f67750a.getScheme()).authority(this.f67750a.getAuthority()).path(this.f67750a.getPath()).build());
        e.a(jSONObject, a());
        return jSONObject;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private v(Uri uri, String str, Map<String, String> map) {
        super(map);
        l.d(uri, "");
        l.d(str, "");
        this.f67750a = uri;
        this.f67751b = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Uri uri, String str, Map map, int i2) {
        this(uri, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : map);
    }
}
