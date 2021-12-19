package com.ss.android.ugc.aweme.music.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.d.a.b;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final int f111826a;

    /* renamed from: b  reason: collision with root package name */
    public final int f111827b;

    static {
        Covode.recordClassIndex(71886);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f111826a == aVar.f111826a && this.f111827b == aVar.f111827b;
    }

    public final int hashCode() {
        return (this.f111826a * 31) + this.f111827b;
    }

    public final String toString() {
        return "AwemeMusicPlayEvent(pageId=" + this.f111826a + ", senderId=" + this.f111827b + ")";
    }

    public a(int i2, int i3) {
        this.f111826a = i2;
        this.f111827b = i3;
    }
}
