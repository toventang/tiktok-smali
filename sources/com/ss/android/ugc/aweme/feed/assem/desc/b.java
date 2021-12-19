package com.ss.android.ugc.aweme.feed.assem.desc;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f92155a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92156b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f92157c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f92158d;

    /* renamed from: e  reason: collision with root package name */
    public final String f92159e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f92160f;

    static {
        Covode.recordClassIndex(58140);
    }

    public static b a(int i2, int i3, Integer num, Integer num2, String str, boolean z) {
        return new b(i2, i3, num, num2, str, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f92155a == bVar.f92155a && this.f92156b == bVar.f92156b && l.a(this.f92157c, bVar.f92157c) && l.a(this.f92158d, bVar.f92158d) && l.a(this.f92159e, bVar.f92159e) && this.f92160f == bVar.f92160f;
    }

    public final int hashCode() {
        int i2 = ((this.f92155a * 31) + this.f92156b) * 31;
        Integer num = this.f92157c;
        int i3 = 0;
        int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f92158d;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str = this.f92159e;
        if (str != null) {
            i3 = str.hashCode();
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z = this.f92160f;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        return i4 + i5;
    }

    public final String toString() {
        return "PromotedTagState(promotedTagVisibility=" + this.f92155a + ", transPromotedTagView=" + this.f92156b + ", bgColor=" + this.f92157c + ", textColor=" + this.f92158d + ", text=" + this.f92159e + ", useTransparent=" + this.f92160f + ")";
    }

    public /* synthetic */ b() {
        this(8, 8, null, null, null, false);
    }

    private b(int i2, int i3, Integer num, Integer num2, String str, boolean z) {
        this.f92155a = i2;
        this.f92156b = i3;
        this.f92157c = num;
        this.f92158d = num2;
        this.f92159e = str;
        this.f92160f = z;
    }
}
