package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.b;

public final class a implements com.ss.android.http.a.a, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f59525a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59526b;

    static {
        Covode.recordClassIndex(36757);
    }

    @Override // com.ss.android.http.a.a
    public final String a() {
        return this.f59525a;
    }

    @Override // com.ss.android.http.a.a
    public final String b() {
        return this.f59526b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    @Override // com.ss.android.http.a.a
    public final b[] c() {
        String str = this.f59526b;
        if (str == null) {
            return new b[0];
        }
        c cVar = c.f59530a;
        com.ss.android.http.a.d.b bVar = new com.ss.android.http.a.d.b(str.length());
        bVar.a(str);
        return cVar.a(bVar, new g(str.length()));
    }

    public final String toString() {
        com.ss.android.http.a.d.b bVar = new com.ss.android.http.a.d.b(64);
        String a2 = a();
        String b2 = b();
        int length = a2.length() + 2;
        if (b2 != null) {
            length += b2.length();
        }
        if (length > bVar.f59540a.length - bVar.f59541b) {
            bVar.a(bVar.f59541b + length);
        }
        bVar.a(a2);
        bVar.a(": ");
        if (b2 != null) {
            bVar.a(b2);
        }
        return bVar.toString();
    }

    public a(String str, String str2) {
        if (str != null) {
            this.f59525a = str;
            this.f59526b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
