package com.bytedance.ies.bullet.service.base.e;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f32602a;

    static {
        Covode.recordClassIndex(19352);
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final String b() {
        String uri = this.f32602a.toString();
        l.a((Object) uri, "");
        return uri;
    }

    private final Uri d() {
        Object obj;
        Uri uri = null;
        try {
            String a2 = c.a(this.f32602a, "url");
            if (a2 != null) {
                return Uri.parse(a2);
            }
            obj = q.m223constructorimpl(null);
            if (!q.m228isFailureimpl(obj)) {
                uri = obj;
            }
            return uri;
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final String a() {
        String path;
        Uri d2 = d();
        if (d2 == null) {
            return "";
        }
        String authority = d2.getAuthority();
        if ((authority == null || authority.length() == 0) && (((path = d2.getPath()) == null || path.length() == 0) && c() == f.LYNX)) {
            String a2 = c.a(d2, "surl");
            if (a2 == null) {
                return String.valueOf(d2);
            }
            return a2;
        }
        String uri = new Uri.Builder().scheme(d2.getScheme()).authority(d2.getAuthority()).path(d2.getPath()).build().toString();
        l.a((Object) uri, "");
        return uri;
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final f c() {
        String scheme;
        Uri d2 = d();
        if (!(d2 == null || (scheme = d2.getScheme()) == null)) {
            switch (scheme.hashCode()) {
                case -1772600516:
                    if (scheme.equals("lynxview")) {
                        return f.LYNX;
                    }
                    break;
                case 3213448:
                    if (scheme.equals("http")) {
                        return f.WEB;
                    }
                    break;
                case 99617003:
                    if (scheme.equals("https")) {
                        return f.WEB;
                    }
                    break;
                case 828638245:
                    if (scheme.equals("react-native")) {
                        return f.RN;
                    }
                    break;
            }
        }
        return f.UNKNOWN;
    }

    public b(Uri uri) {
        l.c(uri, "");
        this.f32602a = uri;
    }
}
