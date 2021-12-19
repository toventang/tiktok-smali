package com.ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import h.f.b.l;

public final class b implements a {

    /* renamed from: a */
    public final String f111133a;

    /* renamed from: b */
    public final String f111134b;

    /* renamed from: c */
    public final boolean f111135c;

    /* renamed from: d */
    public final boolean f111136d;

    /* renamed from: e */
    public final boolean f111137e;

    /* renamed from: f */
    public final boolean f111138f;

    /* renamed from: g */
    public final com.bytedance.assem.arch.extensions.a<Boolean> f111139g;

    /* renamed from: h */
    public final PinnedMusicList f111140h;

    static {
        Covode.recordClassIndex(71329);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f111133a, bVar.f111133a) && l.a(this.f111134b, bVar.f111134b) && this.f111135c == bVar.f111135c && this.f111136d == bVar.f111136d && this.f111137e == bVar.f111137e && this.f111138f == bVar.f111138f && l.a(this.f111139g, bVar.f111139g) && l.a(this.f111140h, bVar.f111140h);
    }

    public final int hashCode() {
        String str = this.f111133a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f111134b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f111135c;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode2 + i4) * 31;
        boolean z2 = this.f111136d;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.f111137e;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (i11 + i12) * 31;
        if (!this.f111138f) {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        com.bytedance.assem.arch.extensions.a<Boolean> aVar = this.f111139g;
        int hashCode3 = (i16 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        PinnedMusicList pinnedMusicList = this.f111140h;
        if (pinnedMusicList != null) {
            i2 = pinnedMusicList.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "OriginMusicCommonData(userId=" + this.f111133a + ", secUserId=" + this.f111134b + ", isPrivateAccount=" + this.f111135c + ", isMe=" + this.f111136d + ", canPin=" + this.f111137e + ", fromSearch=" + this.f111138f + ", onVisibleChanged=" + this.f111139g + ", pinnedMusicList=" + this.f111140h + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, String str2, boolean z, boolean z2, boolean z3, PinnedMusicList pinnedMusicList, int i2) {
        this(str, str2, false, z, z2, z3, null, (i2 & 128) != 0 ? null : pinnedMusicList);
    }

    private b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, com.bytedance.assem.arch.extensions.a<Boolean> aVar, PinnedMusicList pinnedMusicList) {
        this.f111133a = str;
        this.f111134b = str2;
        this.f111135c = z;
        this.f111136d = z2;
        this.f111137e = z3;
        this.f111138f = z4;
        this.f111139g = aVar;
        this.f111140h = pinnedMusicList;
    }

    public static /* synthetic */ b a(b bVar, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, com.bytedance.assem.arch.extensions.a aVar, PinnedMusicList pinnedMusicList, int i2) {
        PinnedMusicList pinnedMusicList2 = pinnedMusicList;
        com.bytedance.assem.arch.extensions.a aVar2 = aVar;
        boolean z5 = z4;
        boolean z6 = z3;
        String str3 = str;
        String str4 = str2;
        boolean z7 = z;
        boolean z8 = z2;
        if ((i2 & 1) != 0) {
            str3 = bVar.f111133a;
        }
        if ((i2 & 2) != 0) {
            str4 = bVar.f111134b;
        }
        if ((i2 & 4) != 0) {
            z7 = bVar.f111135c;
        }
        if ((i2 & 8) != 0) {
            z8 = bVar.f111136d;
        }
        if ((i2 & 16) != 0) {
            z6 = bVar.f111137e;
        }
        if ((i2 & 32) != 0) {
            z5 = bVar.f111138f;
        }
        if ((i2 & 64) != 0) {
            aVar2 = bVar.f111139g;
        }
        if ((i2 & 128) != 0) {
            pinnedMusicList2 = bVar.f111140h;
        }
        return new b(str3, str4, z7, z8, z6, z5, aVar2, pinnedMusicList2);
    }
}
