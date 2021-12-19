package com.ss.android.ugc.aweme.feed.assem.avatar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    public final int f92027a;

    /* renamed from: b  reason: collision with root package name */
    public final String f92028b;

    static {
        Covode.recordClassIndex(57966);
    }

    public static h a(int i2, String str) {
        return new h(i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f92027a == hVar.f92027a && l.a(this.f92028b, hVar.f92028b);
    }

    public final int hashCode() {
        int i2 = this.f92027a * 31;
        String str = this.f92028b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FeedAvatarDefaultState(followViewVisibility=" + this.f92027a + ", profileWidgetBadgeUrl=" + this.f92028b + ")";
    }

    public /* synthetic */ h() {
        this(0, null);
    }

    private h(int i2, String str) {
        this.f92027a = i2;
        this.f92028b = str;
    }
}
