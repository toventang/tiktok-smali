package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class ba {
    @c(a = "is_muted")

    /* renamed from: a  reason: collision with root package name */
    public boolean f19029a;
    @c(a = "is_admin")

    /* renamed from: b  reason: collision with root package name */
    public boolean f19030b;
    @c(a = "is_super_admin")

    /* renamed from: c  reason: collision with root package name */
    public boolean f19031c;
    @c(a = "mute_duration")

    /* renamed from: d  reason: collision with root package name */
    public long f19032d;

    static {
        Covode.recordClassIndex(11332);
    }

    public int hashCode() {
        return ((this.f19029a ? 1 : 0) * 31) + (this.f19030b ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ba baVar = (ba) obj;
            if (this.f19029a == baVar.f19029a && this.f19030b == baVar.f19030b) {
                return true;
            }
        }
        return false;
    }
}
