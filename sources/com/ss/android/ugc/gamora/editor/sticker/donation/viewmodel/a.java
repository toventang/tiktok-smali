package com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.c;
import com.ss.android.ugc.gamora.editor.sticker.donation.c.e;
import h.f.b.l;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f146603a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f146604b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e> f146605c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c> f146606d;

    /* renamed from: e  reason: collision with root package name */
    public final String f146607e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.gamora.editor.sticker.donation.c.a f146608f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f146609g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f146610h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f146611i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f146612j;

    static {
        Covode.recordClassIndex(96485);
    }

    public a() {
        this(null, false, null, null, null, null, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f146603a, aVar.f146603a) && this.f146604b == aVar.f146604b && l.a(this.f146605c, aVar.f146605c) && l.a(this.f146606d, aVar.f146606d) && l.a(this.f146607e, aVar.f146607e) && l.a(this.f146608f, aVar.f146608f) && this.f146609g == aVar.f146609g && this.f146610h == aVar.f146610h && this.f146611i == aVar.f146611i && this.f146612j == aVar.f146612j;
    }

    public final int hashCode() {
        String str = this.f146603a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f146604b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode + i4) * 31;
        List<e> list = this.f146605c;
        int hashCode2 = (i7 + (list != null ? list.hashCode() : 0)) * 31;
        List<c> list2 = this.f146606d;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str2 = this.f146607e;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        com.ss.android.ugc.gamora.editor.sticker.donation.c.a aVar = this.f146608f;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        int i8 = (hashCode4 + i2) * 31;
        boolean z2 = this.f146609g;
        if (z2) {
            z2 = true;
        }
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = z2 ? 1 : 0;
        int i12 = (i8 + i9) * 31;
        boolean z3 = this.f146610h;
        if (z3) {
            z3 = true;
        }
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = z3 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean z4 = this.f146611i;
        if (z4) {
            z4 = true;
        }
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = z4 ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        if (!this.f146612j) {
            i3 = 0;
        }
        return i20 + i3;
    }

    public final String toString() {
        return "Result(searchKeyword=" + this.f146603a + ", isSearchRequest=" + this.f146604b + ", searchData=" + this.f146605c + ", data=" + this.f146606d + ", poweredByUrl=" + this.f146607e + ", matchDonationText=" + this.f146608f + ", isLoading=" + this.f146609g + ", loadSuccess=" + this.f146610h + ", isLoadMore=" + this.f146611i + ", hasMore=" + this.f146612j + ")";
    }

    private a(String str, boolean z, List<e> list, List<c> list2, String str2, com.ss.android.ugc.gamora.editor.sticker.donation.c.a aVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f146603a = str;
        this.f146604b = z;
        this.f146605c = list;
        this.f146606d = list2;
        this.f146607e = str2;
        this.f146608f = aVar;
        this.f146609g = z2;
        this.f146610h = z3;
        this.f146611i = z4;
        this.f146612j = z5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(String str, boolean z, List list, List list2, String str2, com.ss.android.ugc.gamora.editor.sticker.donation.c.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : list2, (i2 & 16) != 0 ? null : str2, (i2 & 32) == 0 ? aVar : null, (i2 & 64) != 0 ? true : z2, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) == 0 ? z5 : false);
    }
}
