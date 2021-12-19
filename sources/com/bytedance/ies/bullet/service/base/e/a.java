package com.bytedance.ies.bullet.service.base.e;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public String f32600a = "";

    /* renamed from: b  reason: collision with root package name */
    public final Uri f32601b;

    static {
        Covode.recordClassIndex(19351);
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final String b() {
        String uri = this.f32601b.toString();
        l.a((Object) uri, "");
        return uri;
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final String a() {
        boolean z;
        String uri;
        String path;
        String authority = this.f32601b.getAuthority();
        if (authority == null || authority.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !(((path = this.f32601b.getPath()) == null || path.length() == 0) && c() == f.LYNX)) {
            uri = new Uri.Builder().scheme(this.f32601b.getScheme()).authority(this.f32601b.getAuthority()).path(this.f32601b.getPath()).build().toString();
            l.a((Object) uri, "");
        } else {
            uri = c.a(this.f32601b, "surl");
            if (uri == null) {
                uri = String.valueOf(this.f32601b);
            }
        }
        if (!TextUtils.isEmpty(uri)) {
            return uri;
        }
        String uri2 = this.f32601b.toString();
        l.a((Object) uri2, "");
        return uri2;
    }

    @Override // com.bytedance.ies.bullet.service.base.e.d
    public final f c() {
        String scheme = this.f32601b.getScheme();
        if (scheme != null) {
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

    public a(Uri uri) {
        l.c(uri, "");
        this.f32601b = uri;
    }
}
