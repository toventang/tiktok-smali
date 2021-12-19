package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.util.List;

public final class o {
    @c(a = "text_stickers")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends av> f15797a;
    @c(a = "pic_stickers")

    /* renamed from: b  reason: collision with root package name */
    public List<? extends av> f15798b;

    static {
        Covode.recordClassIndex(8710);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f15797a, oVar.f15797a) && l.a(this.f15798b, oVar.f15798b);
    }

    public final int hashCode() {
        List<? extends av> list = this.f15797a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<? extends av> list2 = this.f15798b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "StickerResponse(textStickers=" + this.f15797a + ", picStickers=" + this.f15798b + ")";
    }
}
