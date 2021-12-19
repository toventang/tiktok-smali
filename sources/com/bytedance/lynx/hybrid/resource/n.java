package com.bytedance.lynx.hybrid.resource;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public a f41232a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f41233b;

    static {
        Covode.recordClassIndex(25254);
    }

    public final e a() {
        a aVar = this.f41232a;
        if (!(aVar instanceof e) || aVar == null) {
            return null;
        }
        return (e) aVar;
    }

    public final p b() {
        a aVar = this.f41232a;
        if (!(aVar instanceof p) || aVar == null) {
            return null;
        }
        return (p) aVar;
    }

    public n(Uri uri) {
        l.c(uri, "");
        this.f41233b = uri;
    }
}
