package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f137508a;

    /* renamed from: b  reason: collision with root package name */
    public final String f137509b;

    static {
        Covode.recordClassIndex(89952);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f137508a == nVar.f137508a && l.a(this.f137509b, nVar.f137509b);
    }

    public final int hashCode() {
        int i2 = this.f137508a * 31;
        String str = this.f137509b;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ToolbarClickEvent(type=" + this.f137508a + ", enterMethod=" + this.f137509b + ")";
    }

    public /* synthetic */ n(int i2) {
        this(i2, "click_button");
    }

    public n(int i2, String str) {
        l.d(str, "");
        this.f137508a = i2;
        this.f137509b = str;
    }
}
