package com.bytedance.android.livesdk.chatroom.model.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class a {
    @c(a = "block_list")

    /* renamed from: a  reason: collision with root package name */
    public List<String> f15683a = null;
    @c(a = "multi_list")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f15684b = null;
    @c(a = "single_list")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f15685c = null;

    static {
        Covode.recordClassIndex(8667);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f15683a, aVar.f15683a) && l.a(this.f15684b, aVar.f15684b) && l.a(this.f15685c, aVar.f15685c);
    }

    public final int hashCode() {
        List<String> list = this.f15683a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f15684b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.f15685c;
        if (list3 != null) {
            i2 = list3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "BackRoomListSettingConfig(blockList=" + this.f15683a + ", multiList=" + this.f15684b + ", singleList=" + this.f15685c + ")";
    }
}
