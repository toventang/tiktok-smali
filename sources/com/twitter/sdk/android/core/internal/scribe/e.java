package com.twitter.sdk.android.core.internal.scribe;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class e {
    @c(a = "client")

    /* renamed from: a  reason: collision with root package name */
    public final String f156061a;
    @c(a = "page")

    /* renamed from: b  reason: collision with root package name */
    public final String f156062b;
    @c(a = "section")

    /* renamed from: c  reason: collision with root package name */
    public final String f156063c;
    @c(a = "component")

    /* renamed from: d  reason: collision with root package name */
    public final String f156064d;
    @c(a = "element")

    /* renamed from: e  reason: collision with root package name */
    public final String f156065e;
    @c(a = "action")

    /* renamed from: f  reason: collision with root package name */
    public final String f156066f;

    static {
        Covode.recordClassIndex(103678);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f156067a;

        /* renamed from: b  reason: collision with root package name */
        public String f156068b;

        /* renamed from: c  reason: collision with root package name */
        public String f156069c;

        /* renamed from: d  reason: collision with root package name */
        public String f156070d;

        /* renamed from: e  reason: collision with root package name */
        public String f156071e;

        /* renamed from: f  reason: collision with root package name */
        public String f156072f;

        static {
            Covode.recordClassIndex(103679);
        }

        public final e a() {
            return new e(this.f156067a, this.f156068b, this.f156069c, this.f156070d, this.f156071e, this.f156072f);
        }
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str = this.f156061a;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = i2 * 31;
        String str2 = this.f156062b;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.f156063c;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        String str4 = this.f156064d;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        String str5 = this.f156065e;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i12 = (i11 + i6) * 31;
        String str6 = this.f156066f;
        if (str6 != null) {
            i7 = str6.hashCode();
        }
        return i12 + i7;
    }

    public final String toString() {
        return "client=" + this.f156061a + ", page=" + this.f156062b + ", section=" + this.f156063c + ", component=" + this.f156064d + ", element=" + this.f156065e + ", action=" + this.f156066f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f156066f;
        if (str == null ? eVar.f156066f != null : !str.equals(eVar.f156066f)) {
            return false;
        }
        String str2 = this.f156061a;
        if (str2 == null ? eVar.f156061a != null : !str2.equals(eVar.f156061a)) {
            return false;
        }
        String str3 = this.f156064d;
        if (str3 == null ? eVar.f156064d != null : !str3.equals(eVar.f156064d)) {
            return false;
        }
        String str4 = this.f156065e;
        if (str4 == null ? eVar.f156065e != null : !str4.equals(eVar.f156065e)) {
            return false;
        }
        String str5 = this.f156062b;
        if (str5 == null ? eVar.f156062b != null : !str5.equals(eVar.f156062b)) {
            return false;
        }
        String str6 = this.f156063c;
        String str7 = eVar.f156063c;
        if (str6 == null ? str7 == null : str6.equals(str7)) {
            return true;
        }
        return false;
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f156061a = str;
        this.f156062b = str2;
        this.f156063c = str3;
        this.f156064d = str4;
        this.f156065e = str5;
        this.f156066f = str6;
    }
}
