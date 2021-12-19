package com.facebook.c.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;
import java.util.List;

public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    public final List<e> f46954a;

    static {
        Covode.recordClassIndex(28574);
    }

    @Override // com.facebook.c.a.e
    public final int hashCode() {
        return this.f46954a.hashCode();
    }

    @Override // com.facebook.c.a.e
    public final String a() {
        return this.f46954a.get(0).a();
    }

    @Override // com.facebook.c.a.e
    public final String toString() {
        return "MultiCacheKey:" + this.f46954a.toString();
    }

    public g(List<e> list) {
        this.f46954a = (List) i.a(list);
    }

    @Override // com.facebook.c.a.e
    public final boolean a(Uri uri) {
        for (int i2 = 0; i2 < this.f46954a.size(); i2++) {
            if (this.f46954a.get(i2).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.c.a.e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return this.f46954a.equals(((g) obj).f46954a);
        }
        return false;
    }
}
