package com.ss.android.ugc.tiktok.deeplink;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f148971a;

    /* renamed from: b  reason: collision with root package name */
    public final Boolean f148972b;

    static {
        Covode.recordClassIndex(98106);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f148971a, aVar.f148971a) && l.a(this.f148972b, aVar.f148972b);
    }

    public final int hashCode() {
        Uri uri = this.f148971a;
        int i2 = 0;
        int hashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Boolean bool = this.f148972b;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "Input(uri=" + this.f148971a + ", fromPush=" + this.f148972b + ")";
    }

    public a(Uri uri, Boolean bool) {
        this.f148971a = uri;
        this.f148972b = bool;
    }
}
