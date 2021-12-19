package com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f101527a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f101528b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f101529c;

    /* renamed from: d  reason: collision with root package name */
    public final d f101530d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f101531e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f101532f;

    /* renamed from: g  reason: collision with root package name */
    public final e f101533g;

    static {
        Covode.recordClassIndex(64928);
    }

    public b() {
        this(0, false, false, (d) null, false, (List) null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f101527a == bVar.f101527a && this.f101528b == bVar.f101528b && this.f101529c == bVar.f101529c && l.a(this.f101530d, bVar.f101530d) && this.f101531e == bVar.f101531e && l.a(this.f101532f, bVar.f101532f) && l.a(this.f101533g, bVar.f101533g);
    }

    public final int hashCode() {
        int i2 = this.f101527a * 31;
        boolean z = this.f101528b;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.f101529c;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        d dVar = this.f101530d;
        int i12 = 0;
        int hashCode = (i11 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        if (!this.f101531e) {
            i3 = 0;
        }
        int i13 = (hashCode + i3) * 31;
        List<a> list = this.f101532f;
        int hashCode2 = (i13 + (list != null ? list.hashCode() : 0)) * 31;
        e eVar = this.f101533g;
        if (eVar != null) {
            i12 = eVar.hashCode();
        }
        return hashCode2 + i12;
    }

    public final String toString() {
        return "GroupChatDetailModel(groupMemberShowCount=" + this.f101527a + ", muted=" + this.f101528b + ", pined=" + this.f101529c + ", groupNameInfo=" + this.f101530d + ", requireApprovalToJoin=" + this.f101531e + ", members=" + this.f101532f + ", requestInfo=" + this.f101533g + ")";
    }

    private b(int i2, boolean z, boolean z2, d dVar, boolean z3, List<a> list, e eVar) {
        l.d(dVar, "");
        l.d(list, "");
        this.f101527a = i2;
        this.f101528b = z;
        this.f101529c = z2;
        this.f101530d = dVar;
        this.f101531e = z3;
        this.f101532f = list;
        this.f101533g = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, boolean z, boolean z2, d dVar, boolean z3, List list, int i3) {
        this((i3 & 1) != 0 ? 12 : i2, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? false : z2, (i3 & 8) != 0 ? new d(null, false, 15) : dVar, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? z.INSTANCE : list, (e) null);
    }

    public static /* synthetic */ b a(b bVar, int i2, boolean z, boolean z2, d dVar, boolean z3, List list, e eVar, int i3) {
        e eVar2 = eVar;
        List list2 = list;
        boolean z4 = z3;
        int i4 = i2;
        boolean z5 = z;
        boolean z6 = z2;
        d dVar2 = dVar;
        if ((i3 & 1) != 0) {
            i4 = bVar.f101527a;
        }
        if ((i3 & 2) != 0) {
            z5 = bVar.f101528b;
        }
        if ((i3 & 4) != 0) {
            z6 = bVar.f101529c;
        }
        if ((i3 & 8) != 0) {
            dVar2 = bVar.f101530d;
        }
        if ((i3 & 16) != 0) {
            z4 = bVar.f101531e;
        }
        if ((i3 & 32) != 0) {
            list2 = bVar.f101532f;
        }
        if ((i3 & 64) != 0) {
            eVar2 = bVar.f101533g;
        }
        l.d(dVar2, "");
        l.d(list2, "");
        return new b(i4, z5, z6, dVar2, z4, list2, eVar2);
    }
}
