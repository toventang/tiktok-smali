package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import com.bytedance.covode.number.Covode;
import h.a.n;
import java.util.List;

public final class o {

    /* renamed from: d  reason: collision with root package name */
    public static final List<Integer> f137510d = n.b(1, 2, 3, 4, 5, 0);

    /* renamed from: e  reason: collision with root package name */
    public static final a f137511e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f137512a;

    /* renamed from: b  reason: collision with root package name */
    public final int f137513b;

    /* renamed from: c  reason: collision with root package name */
    public final int f137514c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f137512a == oVar.f137512a && this.f137513b == oVar.f137513b && this.f137514c == oVar.f137514c;
    }

    public final int hashCode() {
        return (((this.f137512a * 31) + this.f137513b) * 31) + this.f137514c;
    }

    public final String toString() {
        return "ToolbarItemModel(type=" + this.f137512a + ", iconRes=" + this.f137513b + ", textRes=" + this.f137514c + ")";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89954);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(89953);
    }

    public o(int i2, int i3, int i4) {
        this.f137512a = i2;
        this.f137513b = i3;
        this.f137514c = i4;
    }
}
