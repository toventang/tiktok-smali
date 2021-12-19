package com.ss.android.ugc.aweme.story.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;

public final class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Aweme f136853a;

    /* renamed from: b  reason: collision with root package name */
    public final int f136854b;

    /* renamed from: c  reason: collision with root package name */
    public final int f136855c;

    /* renamed from: d  reason: collision with root package name */
    public final int f136856d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f136857e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f136858f;

    static {
        Covode.recordClassIndex(89440);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f136853a, jVar.f136853a) && this.f136854b == jVar.f136854b && this.f136855c == jVar.f136855c && this.f136856d == jVar.f136856d && this.f136857e == jVar.f136857e && this.f136858f == jVar.f136858f;
    }

    public final int hashCode() {
        Aweme aweme = this.f136853a;
        int hashCode = (((((((aweme != null ? aweme.hashCode() : 0) * 31) + this.f136854b) * 31) + this.f136855c) * 31) + this.f136856d) * 31;
        boolean z = this.f136857e;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        if (!this.f136858f) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "StoryPageSelectParam(aweme=" + this.f136853a + ", storyListPosition=" + this.f136854b + ", storyPosition=" + this.f136855c + ", totalCount=" + this.f136856d + ", isSlideToSelect=" + this.f136857e + ", shouldPlay=" + this.f136858f + ")";
    }

    public /* synthetic */ j(Aweme aweme, int i2, int i3, int i4, boolean z) {
        this(aweme, i2, i3, i4, z, true);
    }

    public j(Aweme aweme, int i2, int i3, int i4, boolean z, boolean z2) {
        l.d(aweme, "");
        this.f136853a = aweme;
        this.f136854b = i2;
        this.f136855c = i3;
        this.f136856d = i4;
        this.f136857e = z;
        this.f136858f = z2;
    }
}
