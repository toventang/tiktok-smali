package com.ss.android.ugc.aweme.friends.widget.contact;

import com.bytedance.covode.number.Covode;

public final class h extends a {

    /* renamed from: b  reason: collision with root package name */
    public final int f97346b;

    static {
        Covode.recordClassIndex(61844);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof h) && this.f97346b == ((h) obj).f97346b;
        }
        return true;
    }

    public final int hashCode() {
        return this.f97346b;
    }

    public final String toString() {
        return "TitleContactPod(title=" + this.f97346b + ")";
    }

    private /* synthetic */ h() {
        this(-1);
    }

    public h(int i2) {
        super(2);
        this.f97346b = i2;
    }
}
