package com.ss.android.token;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f61014a;

    /* renamed from: b  reason: collision with root package name */
    public final String f61015b;

    static {
        Covode.recordClassIndex(37588);
    }

    public final int hashCode() {
        int i2;
        String str = this.f61014a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f61015b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f61014a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f61015b;
        if (str3 != null) {
            str2 = str3;
        }
        return append.append(str2).toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        String str = this.f61014a;
        if (str == null ? cVar.f61014a != null : !str.equals(cVar.f61014a)) {
            return false;
        }
        String str2 = this.f61015b;
        String str3 = cVar.f61015b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public c(String str, String str2) {
        this.f61014a = str;
        this.f61015b = str2;
    }
}
