package com.ss.android.ugc.aweme.homepage.story.feed;

import com.bytedance.assem.arch.extensions.a;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements j {

    /* renamed from: a */
    public final int f99402a;

    /* renamed from: b */
    public final int f99403b;

    /* renamed from: c */
    public final a<b> f99404c;

    /* renamed from: d */
    public final a<String> f99405d;

    /* renamed from: e */
    public final a<Boolean> f99406e;

    /* renamed from: f */
    public final a<Boolean> f99407f;

    /* renamed from: g */
    public final a<String> f99408g;

    static {
        Covode.recordClassIndex(63327);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f99402a == dVar.f99402a && this.f99403b == dVar.f99403b && l.a(this.f99404c, dVar.f99404c) && l.a(this.f99405d, dVar.f99405d) && l.a(this.f99406e, dVar.f99406e) && l.a(this.f99407f, dVar.f99407f) && l.a(this.f99408g, dVar.f99408g);
    }

    public final int hashCode() {
        int i2 = ((this.f99402a * 31) + this.f99403b) * 31;
        a<b> aVar = this.f99404c;
        int i3 = 0;
        int hashCode = (i2 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        a<String> aVar2 = this.f99405d;
        int hashCode2 = (hashCode + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        a<Boolean> aVar3 = this.f99406e;
        int hashCode3 = (hashCode2 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31;
        a<Boolean> aVar4 = this.f99407f;
        int hashCode4 = (hashCode3 + (aVar4 != null ? aVar4.hashCode() : 0)) * 31;
        a<String> aVar5 = this.f99408g;
        if (aVar5 != null) {
            i3 = aVar5.hashCode();
        }
        return hashCode4 + i3;
    }

    public final String toString() {
        return "StoryFeedState(sidebarStatus=" + this.f99402a + ", refreshStatus=" + this.f99403b + ", containerMessage=" + this.f99404c + ", needSidebarOpen=" + this.f99405d + ", needSidebarClose=" + this.f99406e + ", needStoryIconRefresh=" + this.f99407f + ", refreshAvatarEvent=" + this.f99408g + ")";
    }

    public /* synthetic */ d() {
        this(0, 0, new a(new b(false, null, 3)), new a("auto"), new a(false), new a(false), new a(""));
    }

    private d(int i2, int i3, a<b> aVar, a<String> aVar2, a<Boolean> aVar3, a<Boolean> aVar4, a<String> aVar5) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        l.d(aVar4, "");
        l.d(aVar5, "");
        this.f99402a = i2;
        this.f99403b = i3;
        this.f99404c = aVar;
        this.f99405d = aVar2;
        this.f99406e = aVar3;
        this.f99407f = aVar4;
        this.f99408g = aVar5;
    }

    public static /* synthetic */ d a(d dVar, int i2, int i3, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i4) {
        a aVar6 = aVar5;
        a aVar7 = aVar4;
        a aVar8 = aVar3;
        int i5 = i2;
        int i6 = i3;
        a aVar9 = aVar;
        a aVar10 = aVar2;
        if ((i4 & 1) != 0) {
            i5 = dVar.f99402a;
        }
        if ((i4 & 2) != 0) {
            i6 = dVar.f99403b;
        }
        if ((i4 & 4) != 0) {
            aVar9 = dVar.f99404c;
        }
        if ((i4 & 8) != 0) {
            aVar10 = dVar.f99405d;
        }
        if ((i4 & 16) != 0) {
            aVar8 = dVar.f99406e;
        }
        if ((i4 & 32) != 0) {
            aVar7 = dVar.f99407f;
        }
        if ((i4 & 64) != 0) {
            aVar6 = dVar.f99408g;
        }
        l.d(aVar9, "");
        l.d(aVar10, "");
        l.d(aVar8, "");
        l.d(aVar7, "");
        l.d(aVar6, "");
        return new d(i5, i6, aVar9, aVar10, aVar8, aVar7, aVar6);
    }
}
