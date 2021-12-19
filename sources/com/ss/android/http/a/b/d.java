package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.c;
import com.ss.android.http.a.d.b;

public final class d implements c, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final String f59532a;

    /* renamed from: b  reason: collision with root package name */
    public final String f59533b;

    static {
        Covode.recordClassIndex(36760);
    }

    @Override // com.ss.android.http.a.c
    public final String a() {
        return this.f59532a;
    }

    @Override // com.ss.android.http.a.c
    public final String b() {
        return this.f59533b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    public final int hashCode() {
        return com.ss.android.http.a.d.c.a(com.ss.android.http.a.d.c.a(17, this.f59532a), this.f59533b);
    }

    public final String toString() {
        int length = this.f59532a.length();
        String str = this.f59533b;
        if (str != null) {
            length += str.length() + 1;
        }
        b bVar = new b(length);
        bVar.a(this.f59532a);
        if (this.f59533b != null) {
            bVar.a("=");
            bVar.a(this.f59533b);
        }
        return bVar.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            d dVar = (d) obj;
            if (!this.f59532a.equals(dVar.f59532a) || !com.ss.android.http.a.d.c.a(this.f59533b, dVar.f59533b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public d(String str, String str2) {
        if (str != null) {
            this.f59532a = str;
            this.f59533b = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
