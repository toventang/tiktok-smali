package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.List;

public final class e {
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f126514a;
    @c(a = "change_direction_mode")

    /* renamed from: b  reason: collision with root package name */
    public final int f126515b;
    @c(a = "direction_status")

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f126516c;
    @c(a = "safety_status")

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f126517d;

    static {
        Covode.recordClassIndex(82991);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f126514a, eVar.f126514a) && this.f126515b == eVar.f126515b && l.a(this.f126516c, eVar.f126516c) && l.a(this.f126517d, eVar.f126517d);
    }

    public final int hashCode() {
        String str = this.f126514a;
        int i2 = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f126515b) * 31;
        List<String> list = this.f126516c;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f126517d;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "DuetLayoutBean(name=" + this.f126514a + ", changeDirectionMode=" + this.f126515b + ", directionStatus=" + this.f126516c + ", safetyStatus=" + this.f126517d + ")";
    }
}
