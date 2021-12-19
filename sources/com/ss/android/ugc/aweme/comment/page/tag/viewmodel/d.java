package com.ss.android.ugc.aweme.comment.page.tag.viewmodel;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final a<a> f72321a;

    /* renamed from: b  reason: collision with root package name */
    public final a<IMUser> f72322b;

    /* renamed from: c  reason: collision with root package name */
    public final a<IMUser> f72323c;

    /* renamed from: d  reason: collision with root package name */
    public final a<b> f72324d;

    /* renamed from: e  reason: collision with root package name */
    public final a<String> f72325e;

    static {
        Covode.recordClassIndex(44602);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f72321a, dVar.f72321a) && l.a(this.f72322b, dVar.f72322b) && l.a(this.f72323c, dVar.f72323c) && l.a(this.f72324d, dVar.f72324d) && l.a(this.f72325e, dVar.f72325e);
    }

    public final int hashCode() {
        a<a> aVar = this.f72321a;
        int i2 = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        a<IMUser> aVar2 = this.f72322b;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<IMUser> aVar3 = this.f72323c;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<b> aVar4 = this.f72324d;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<String> aVar5 = this.f72325e;
        if (aVar5 != null) {
            i2 = aVar5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "SelectorState(allFriends=" + this.f72321a + ", tagChangedUser=" + this.f72322b + ", blockUser=" + this.f72323c + ", event=" + this.f72324d + ", toast=" + this.f72325e + ")";
    }

    public /* synthetic */ d() {
        this(null, null, null, null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.im.service.model.IMUser> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.b> */
    /* JADX WARN: Multi-variable type inference failed */
    private d(a<a> aVar, a<? extends IMUser> aVar2, a<? extends IMUser> aVar3, a<? extends b> aVar4, a<String> aVar5) {
        this.f72321a = aVar;
        this.f72322b = aVar2;
        this.f72323c = aVar3;
        this.f72324d = aVar4;
        this.f72325e = aVar5;
    }

    public static /* synthetic */ d a(d dVar, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i2) {
        a aVar6 = aVar5;
        a aVar7 = aVar;
        a aVar8 = aVar2;
        a aVar9 = aVar3;
        a aVar10 = aVar4;
        if ((i2 & 1) != 0) {
            aVar7 = dVar.f72321a;
        }
        if ((i2 & 2) != 0) {
            aVar8 = dVar.f72322b;
        }
        if ((i2 & 4) != 0) {
            aVar9 = dVar.f72323c;
        }
        if ((i2 & 8) != 0) {
            aVar10 = dVar.f72324d;
        }
        if ((i2 & 16) != 0) {
            aVar6 = dVar.f72325e;
        }
        return new d(aVar7, aVar8, aVar9, aVar10, aVar6);
    }
}
