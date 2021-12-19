package com.facebook.c.a;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.i;

public class j implements e {

    /* renamed from: a  reason: collision with root package name */
    final String f46957a;

    static {
        Covode.recordClassIndex(28577);
    }

    @Override // com.facebook.c.a.e
    public final String a() {
        return this.f46957a;
    }

    @Override // com.facebook.c.a.e
    public String toString() {
        return this.f46957a;
    }

    @Override // com.facebook.c.a.e
    public int hashCode() {
        return this.f46957a.hashCode();
    }

    public j(String str) {
        this.f46957a = (String) i.a(str);
    }

    @Override // com.facebook.c.a.e
    public final boolean a(Uri uri) {
        return this.f46957a.contains(uri.toString());
    }

    @Override // com.facebook.c.a.e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f46957a.equals(((j) obj).f46957a);
        }
        return false;
    }
}
