package com.bytedance.android.monitorV2.k;

import com.bytedance.covode.number.Covode;
import h.a.ag;
import h.f.b.l;
import h.v;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f24009a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24010b;

    /* renamed from: c  reason: collision with root package name */
    public final String f24011c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24012d;

    static {
        Covode.recordClassIndex(14151);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f24009a != bVar.f24009a || !l.a((Object) this.f24010b, (Object) bVar.f24010b) || !l.a((Object) this.f24011c, (Object) bVar.f24011c) || !l.a((Object) this.f24012d, (Object) bVar.f24012d)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.f24009a * 31;
        String str = this.f24010b;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24011c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24012d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        return "ContainerError(errCode=" + this.f24009a + ", errorMsg=" + this.f24010b + ", virtualAid=" + this.f24011c + ", biz=" + this.f24012d + ")";
    }

    public final com.bytedance.android.monitorV2.d.b a() {
        return new com.bytedance.android.monitorV2.d.b(ag.a(v.a("container_load_error_code", Integer.valueOf(this.f24009a)), v.a("container_load_error_msg", this.f24010b)));
    }

    public /* synthetic */ b(String str) {
        this(str, "", "");
    }

    private b(String str, String str2, String str3) {
        l.c(str, "");
        l.c(str2, "");
        l.c(str3, "");
        this.f24009a = 100;
        this.f24010b = str;
        this.f24011c = str2;
        this.f24012d = str3;
    }
}
