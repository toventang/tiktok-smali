package com.ss.android.ugc.aweme.feed.assem.review;

import android.view.View;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.a.m;
import h.f.b.l;
import h.z;

public final class a implements j {

    /* renamed from: h  reason: collision with root package name */
    public static final C2246a f92421h = new C2246a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f92422a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92423b;

    /* renamed from: c  reason: collision with root package name */
    public final int f92424c;

    /* renamed from: d  reason: collision with root package name */
    public final String f92425d;

    /* renamed from: e  reason: collision with root package name */
    public final String f92426e;

    /* renamed from: f  reason: collision with root package name */
    public final b<String, z> f92427f;

    /* renamed from: g  reason: collision with root package name */
    public final m<View, String, z> f92428g;

    static {
        Covode.recordClassIndex(58496);
    }

    public static a a(int i2, int i3, int i4, String str, String str2, b<? super String, z> bVar, m<? super View, ? super String, z> mVar) {
        l.d(str, "");
        l.d(str2, "");
        return new a(i2, i3, i4, str, str2, bVar, mVar);
    }

    public static /* synthetic */ a a(a aVar, int i2, int i3, int i4, String str, String str2, b bVar, m mVar, int i5) {
        m mVar2 = mVar;
        b bVar2 = bVar;
        String str3 = str2;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        String str4 = str;
        if ((i5 & 1) != 0) {
            i6 = aVar.f92422a;
        }
        if ((i5 & 2) != 0) {
            i7 = aVar.f92423b;
        }
        if ((i5 & 4) != 0) {
            i8 = aVar.f92424c;
        }
        if ((i5 & 8) != 0) {
            str4 = aVar.f92425d;
        }
        if ((i5 & 16) != 0) {
            str3 = aVar.f92426e;
        }
        if ((i5 & 32) != 0) {
            bVar2 = aVar.f92427f;
        }
        if ((i5 & 64) != 0) {
            mVar2 = aVar.f92428g;
        }
        return a(i6, i7, i8, str4, str3, bVar2, mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f92422a == aVar.f92422a && this.f92423b == aVar.f92423b && this.f92424c == aVar.f92424c && l.a(this.f92425d, aVar.f92425d) && l.a(this.f92426e, aVar.f92426e) && l.a(this.f92427f, aVar.f92427f) && l.a(this.f92428g, aVar.f92428g);
    }

    public final int hashCode() {
        int i2 = ((((this.f92422a * 31) + this.f92423b) * 31) + this.f92424c) * 31;
        String str = this.f92425d;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f92426e;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        b<String, z> bVar = this.f92427f;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        m<View, String, z> mVar = this.f92428g;
        if (mVar != null) {
            i3 = mVar.hashCode();
        }
        return hashCode3 + i3;
    }

    public final String toString() {
        return "VideoReviewState(type=" + this.f92422a + ", bgColorRes=" + this.f92423b + ", iconRes=" + this.f92424c + ", title=" + this.f92425d + ", url=" + this.f92426e + ", showAction=" + this.f92427f + ", clickAction=" + this.f92428g + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.a$a  reason: collision with other inner class name */
    public static final class C2246a {
        static {
            Covode.recordClassIndex(58497);
        }

        private C2246a() {
        }

        public /* synthetic */ C2246a(byte b2) {
            this();
        }
    }

    public /* synthetic */ a() {
        this(0, -1, -1, "", "", null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.m<? super android.view.View, ? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private a(int i2, int i3, int i4, String str, String str2, b<? super String, z> bVar, m<? super View, ? super String, z> mVar) {
        l.d(str, "");
        l.d(str2, "");
        this.f92422a = i2;
        this.f92423b = i3;
        this.f92424c = i4;
        this.f92425d = str;
        this.f92426e = str2;
        this.f92427f = bVar;
        this.f92428g = mVar;
    }
}
