package com.bytedance.retrofit2.client;

import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f42471a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42472b;

    static {
        Covode.recordClassIndex(26011);
    }

    public final int hashCode() {
        int i2;
        String str = this.f42471a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f42472b;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f42471a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        StringBuilder append = sb.append(str).append(": ");
        String str3 = this.f42472b;
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
        b bVar = (b) obj;
        String str = this.f42471a;
        if (str == null ? bVar.f42471a != null : !str.equals(bVar.f42471a)) {
            return false;
        }
        String str2 = this.f42472b;
        String str3 = bVar.f42472b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public b(String str, String str2) {
        this.f42471a = str;
        this.f42472b = str2;
    }
}
