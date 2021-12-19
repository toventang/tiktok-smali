package com.ss.android;

import com.bytedance.covode.number.Covode;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f59519a;

    /* renamed from: b  reason: collision with root package name */
    public final String f59520b;

    static {
        Covode.recordClassIndex(36747);
    }

    public final int hashCode() {
        int i2;
        String str = this.f59519a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f59520b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f59519a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f59520b;
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
        g gVar = (g) obj;
        String str = this.f59519a;
        if (str == null ? gVar.f59519a != null : !str.equals(gVar.f59519a)) {
            return false;
        }
        String str2 = this.f59520b;
        String str3 = gVar.f59520b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public g(String str, String str2) {
        this.f59519a = str;
        this.f59520b = str2;
    }
}
