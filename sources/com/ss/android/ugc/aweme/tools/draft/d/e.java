package com.ss.android.ugc.aweme.tools.draft.d;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;

public final class e {
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public int f139491a;
    @c(a = "is_need_show")

    /* renamed from: b  reason: collision with root package name */
    public boolean f139492b;
    @c(a = "free_up_space")

    /* renamed from: c  reason: collision with root package name */
    public long f139493c;
    @c(a = "is_update_sticker")

    /* renamed from: d  reason: collision with root package name */
    public boolean f139494d;

    static {
        Covode.recordClassIndex(91210);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f139491a == eVar.f139491a && this.f139492b == eVar.f139492b && this.f139493c == eVar.f139493c && this.f139494d == eVar.f139494d;
    }

    public final String toString() {
        return "DraftOperationInfo(type=" + this.f139491a + ", isNeedShow=" + this.f139492b + ", freeUpSpace=" + this.f139493c + ", isUpdateSticker=" + this.f139494d + ")";
    }

    private e() {
        this.f139491a = -1;
        this.f139492b = true;
        this.f139493c = 0;
        this.f139494d = false;
    }

    public final int hashCode() {
        int i2 = this.f139491a * 31;
        boolean z = this.f139492b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        long j2 = this.f139493c;
        int i7 = (((i2 + i4) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        if (!this.f139494d) {
            i3 = 0;
        }
        return i7 + i3;
    }

    public /* synthetic */ e(byte b2) {
        this();
    }
}
