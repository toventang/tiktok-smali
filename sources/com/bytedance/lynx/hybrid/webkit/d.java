package com.bytedance.lynx.hybrid.webkit;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.a;
import com.bytedance.lynx.hybrid.a.c;
import com.bytedance.lynx.hybrid.c;
import com.bytedance.lynx.hybrid.f;
import com.bytedance.lynx.hybrid.webkit.a.a.e;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public e f41289a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.lynx.hybrid.webkit.a.a.d f41290b;

    /* renamed from: c  reason: collision with root package name */
    public f f41291c;

    /* renamed from: d  reason: collision with root package name */
    public Boolean f41292d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f41293e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Object> f41294f;

    /* renamed from: g  reason: collision with root package name */
    public Map<String, String> f41295g;

    /* renamed from: h  reason: collision with root package name */
    public b f41296h;

    /* renamed from: i  reason: collision with root package name */
    Uri f41297i;

    /* renamed from: j  reason: collision with root package name */
    private c f41298j = c.WEB;

    static {
        Covode.recordClassIndex(25307);
    }

    @Override // com.bytedance.lynx.hybrid.f
    public final c a() {
        return this.f41298j;
    }

    public final int hashCode() {
        Uri uri = this.f41297i;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WebKitInitParams(loadUri=" + this.f41297i + ")";
    }

    @Override // com.bytedance.lynx.hybrid.f
    public final void a(Map<String, ? extends Object> map) {
        if (map != null) {
            this.f41294f.putAll(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || !l.a(this.f41297i, ((d) obj).f41297i)) {
            return false;
        }
        return true;
    }

    public d(Uri uri) {
        this.f41297i = uri;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f41294f = linkedHashMap;
        this.f41295g = new LinkedHashMap();
        a aVar = c.a.a().f40904d;
        if (aVar != null) {
            linkedHashMap.putAll(aVar);
        }
    }
}
