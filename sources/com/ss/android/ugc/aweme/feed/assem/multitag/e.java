package com.ss.android.ugc.aweme.feed.assem.multitag;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f92274a;

    /* renamed from: b  reason: collision with root package name */
    public final int f92275b;

    static {
        Covode.recordClassIndex(58296);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f92274a, eVar.f92274a) && this.f92275b == eVar.f92275b;
    }

    public final int hashCode() {
        String str = this.f92274a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f92275b;
    }

    public final String toString() {
        return "VideoFeedMultiTagState(awemeId=" + this.f92274a + ", anchorType=" + this.f92275b + ")";
    }

    public /* synthetic */ e() {
        this(null, 0);
    }

    private e(String str, int i2) {
        this.f92274a = str;
        this.f92275b = i2;
    }

    public static /* synthetic */ e a(e eVar, String str, int i2, int i3) {
        if ((i3 & 1) != 0) {
            str = eVar.f92274a;
        }
        if ((i3 & 2) != 0) {
            i2 = eVar.f92275b;
        }
        return new e(str, i2);
    }
}
