package emotes.c;

import com.bytedance.covode.number.Covode;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f157131a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f157132b;

    static {
        Covode.recordClassIndex(104337);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f157131a == hVar.f157131a && this.f157132b == hVar.f157132b;
    }

    public final int hashCode() {
        boolean z = this.f157131a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f157132b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EmoteHeaderItem(isFollow=" + this.f157131a + ", isSubscribe=" + this.f157132b + ")";
    }

    public h(boolean z, boolean z2) {
        this.f157131a = z;
        this.f157132b = z2;
    }
}
