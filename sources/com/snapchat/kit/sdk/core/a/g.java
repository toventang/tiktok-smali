package com.snapchat.kit.sdk.core.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Objects;

public class g {
    @c(a = "error")

    /* renamed from: a  reason: collision with root package name */
    public String f57091a;
    @c(a = "error_description")

    /* renamed from: b  reason: collision with root package name */
    public String f57092b;
    @c(a = "message")

    /* renamed from: c  reason: collision with root package name */
    public String f57093c;

    static {
        Covode.recordClassIndex(35571);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.f57091a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode() * 37;
        }
        int i3 = hashCode + 17;
        String str2 = this.f57092b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode() * 37;
        }
        int i4 = i3 + hashCode2;
        String str3 = this.f57093c;
        if (str3 != null) {
            i2 = str3.hashCode() * 37;
        }
        return i4 + i2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof g)) {
            g gVar = (g) obj;
            if (!Objects.equals(this.f57091a, gVar.f57091a) || !Objects.equals(this.f57092b, gVar.f57092b) || !Objects.equals(this.f57093c, gVar.f57093c)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
