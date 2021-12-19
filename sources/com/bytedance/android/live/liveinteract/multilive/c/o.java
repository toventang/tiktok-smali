package com.bytedance.android.live.liveinteract.multilive.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class o {
    @c(a = "interact_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f11769a;
    @c(a = "position")

    /* renamed from: b  reason: collision with root package name */
    public final int f11770b;
    @c(a = "video_mute")

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11771c;

    static {
        Covode.recordClassIndex(6417);
    }

    public o() {
        this(null, 0, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return l.a(this.f11769a, oVar.f11769a) && this.f11770b == oVar.f11770b && this.f11771c == oVar.f11771c;
    }

    public final int hashCode() {
        String str = this.f11769a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f11770b) * 31;
        boolean z = this.f11771c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return hashCode + i2;
    }

    public final String toString() {
        return "MultiLiveRTCMessageUser(interactId=" + this.f11769a + ", position=" + this.f11770b + ", videoMute=" + this.f11771c + ")";
    }

    public o(String str, int i2, boolean z) {
        l.d(str, "");
        this.f11769a = str;
        this.f11770b = i2;
        this.f11771c = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i2, boolean z, int i3) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? false : z);
    }
}
