package com.ss.android.http.a.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.http.a.c;

public final class b implements com.ss.android.http.a.b, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private final String f59527a;

    /* renamed from: b  reason: collision with root package name */
    private final String f59528b;

    /* renamed from: c  reason: collision with root package name */
    private final c[] f59529c;

    static {
        Covode.recordClassIndex(36758);
    }

    @Override // com.ss.android.http.a.b
    public final String a() {
        return this.f59527a;
    }

    @Override // com.ss.android.http.a.b
    public final String b() {
        return this.f59528b;
    }

    @Override // java.lang.Object
    public final Object clone() {
        return super.clone();
    }

    @Override // com.ss.android.http.a.b
    public final c[] c() {
        return (c[]) this.f59529c.clone();
    }

    public final int hashCode() {
        int a2 = com.ss.android.http.a.d.c.a(com.ss.android.http.a.d.c.a(17, this.f59527a), this.f59528b);
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.f59529c;
            if (i2 >= cVarArr.length) {
                return a2;
            }
            a2 = com.ss.android.http.a.d.c.a(a2, cVarArr[i2]);
            i2++;
        }
    }

    public final String toString() {
        com.ss.android.http.a.d.b bVar = new com.ss.android.http.a.d.b(64);
        bVar.a(this.f59527a);
        if (this.f59528b != null) {
            bVar.a("=");
            bVar.a(this.f59528b);
        }
        for (int i2 = 0; i2 < this.f59529c.length; i2++) {
            bVar.a("; ");
            bVar.a(String.valueOf(this.f59529c[i2]));
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
        if (obj instanceof com.ss.android.http.a.b) {
            b bVar = (b) obj;
            if (this.f59527a.equals(bVar.f59527a) && com.ss.android.http.a.d.c.a(this.f59528b, bVar.f59528b)) {
                c[] cVarArr = this.f59529c;
                c[] cVarArr2 = bVar.f59529c;
                if (cVarArr == null) {
                    if (cVarArr2 == null) {
                        return true;
                    }
                } else if (cVarArr2 != null && cVarArr.length == cVarArr2.length) {
                    for (int i2 = 0; i2 < cVarArr.length; i2++) {
                        if (com.ss.android.http.a.d.c.a(cVarArr[i2], cVarArr2[i2])) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public b(String str, String str2, c[] cVarArr) {
        if (str != null) {
            this.f59527a = str;
            this.f59528b = str2;
            if (cVarArr != null) {
                this.f59529c = cVarArr;
            } else {
                this.f59529c = new c[0];
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
