package com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f101534a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f101535b;

    /* renamed from: c  reason: collision with root package name */
    public final String f101536c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f101537d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f101538e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f101539f;

    /* renamed from: g  reason: collision with root package name */
    public final a f101540g;

    /* renamed from: h  reason: collision with root package name */
    public final a f101541h;

    /* renamed from: i  reason: collision with root package name */
    public final a f101542i;

    /* renamed from: j  reason: collision with root package name */
    public final a f101543j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f101544k;

    /* renamed from: l  reason: collision with root package name */
    public final Pair<Integer, String> f101545l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f101546m;

    static {
        Covode.recordClassIndex(64929);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f101534a == cVar.f101534a && this.f101535b == cVar.f101535b && l.a(this.f101536c, cVar.f101536c) && this.f101537d == cVar.f101537d && this.f101538e == cVar.f101538e && this.f101539f == cVar.f101539f && l.a(this.f101540g, cVar.f101540g) && l.a(this.f101541h, cVar.f101541h) && l.a(this.f101542i, cVar.f101542i) && l.a(this.f101543j, cVar.f101543j) && this.f101544k == cVar.f101544k && l.a(this.f101545l, cVar.f101545l) && this.f101546m == cVar.f101546m;
    }

    public final int hashCode() {
        boolean z = this.f101534a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.f101535b;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        String str = this.f101536c;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z3 = this.f101537d;
        if (z3) {
            z3 = true;
        }
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = z3 ? 1 : 0;
        int i15 = (hashCode + i12) * 31;
        boolean z4 = this.f101538e;
        if (z4) {
            z4 = true;
        }
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int i18 = z4 ? 1 : 0;
        int i19 = (i15 + i16) * 31;
        boolean z5 = this.f101539f;
        if (z5) {
            z5 = true;
        }
        int i20 = z5 ? 1 : 0;
        int i21 = z5 ? 1 : 0;
        int i22 = z5 ? 1 : 0;
        int i23 = (i19 + i20) * 31;
        a aVar = this.f101540g;
        int hashCode2 = (i23 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a aVar2 = this.f101541h;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a aVar3 = this.f101542i;
        int hashCode4 = (hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a aVar4 = this.f101543j;
        int hashCode5 = (hashCode4 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        boolean z6 = this.f101544k;
        if (z6) {
            z6 = true;
        }
        int i24 = z6 ? 1 : 0;
        int i25 = z6 ? 1 : 0;
        int i26 = z6 ? 1 : 0;
        int i27 = (hashCode5 + i24) * 31;
        Pair<Integer, String> pair = this.f101545l;
        if (pair != null) {
            i11 = pair.hashCode();
        }
        int i28 = (i27 + i11) * 31;
        if (!this.f101546m) {
            i2 = 0;
        }
        return i28 + i2;
    }

    public final String toString() {
        return "GroupChatSignalModel(dissolveGroup=" + this.f101534a + ", leaveGroup=" + this.f101535b + ", toast=" + this.f101536c + ", finish=" + this.f101537d + ", jumpToRequestInfo=" + this.f101538e + ", chooseAdminDialog=" + this.f101539f + ", userToBeOperated=" + this.f101540g + ", userToBeBlocked=" + this.f101541h + ", userToBeAppointed=" + this.f101542i + ", userToBeRemoved=" + this.f101543j + ", addGroupMember=" + this.f101544k + ", iconToast=" + this.f101545l + ", showSuicideNoticeDialog=" + this.f101546m + ")";
    }

    public /* synthetic */ c() {
        this(false, false, "", false, false, false, null, null, null, null, false, null, false);
    }

    private c(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, a aVar, a aVar2, a aVar3, a aVar4, boolean z6, Pair<Integer, String> pair, boolean z7) {
        l.d(str, "");
        this.f101534a = z;
        this.f101535b = z2;
        this.f101536c = str;
        this.f101537d = z3;
        this.f101538e = z4;
        this.f101539f = z5;
        this.f101540g = aVar;
        this.f101541h = aVar2;
        this.f101542i = aVar3;
        this.f101543j = aVar4;
        this.f101544k = z6;
        this.f101545l = pair;
        this.f101546m = z7;
    }

    public static /* synthetic */ c a(c cVar, boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, a aVar, a aVar2, a aVar3, a aVar4, boolean z6, Pair pair, boolean z7, int i2) {
        boolean z8 = z7;
        Pair pair2 = pair;
        boolean z9 = z6;
        boolean z10 = z3;
        String str2 = str;
        boolean z11 = z2;
        boolean z12 = z;
        boolean z13 = z4;
        boolean z14 = z5;
        a aVar5 = aVar;
        a aVar6 = aVar2;
        a aVar7 = aVar3;
        a aVar8 = aVar4;
        if ((i2 & 1) != 0) {
            z12 = cVar.f101534a;
        }
        if ((i2 & 2) != 0) {
            z11 = cVar.f101535b;
        }
        if ((i2 & 4) != 0) {
            str2 = cVar.f101536c;
        }
        if ((i2 & 8) != 0) {
            z10 = cVar.f101537d;
        }
        if ((i2 & 16) != 0) {
            z13 = cVar.f101538e;
        }
        if ((i2 & 32) != 0) {
            z14 = cVar.f101539f;
        }
        if ((i2 & 64) != 0) {
            aVar5 = cVar.f101540g;
        }
        if ((i2 & 128) != 0) {
            aVar6 = cVar.f101541h;
        }
        if ((i2 & 256) != 0) {
            aVar7 = cVar.f101542i;
        }
        if ((i2 & 512) != 0) {
            aVar8 = cVar.f101543j;
        }
        if ((i2 & 1024) != 0) {
            z9 = cVar.f101544k;
        }
        if ((i2 & 2048) != 0) {
            pair2 = cVar.f101545l;
        }
        if ((i2 & 4096) != 0) {
            z8 = cVar.f101546m;
        }
        l.d(str2, "");
        return new c(z12, z11, str2, z10, z13, z14, aVar5, aVar6, aVar7, aVar8, z9, pair2, z8);
    }
}
