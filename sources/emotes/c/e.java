package emotes.c;

import com.bytedance.covode.number.Covode;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f157118a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f157119b;

    static {
        Covode.recordClassIndex(104332);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f157118a == eVar.f157118a && this.f157119b == eVar.f157119b;
    }

    public final int hashCode() {
        boolean z = this.f157118a;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        if (!this.f157119b) {
            i2 = 0;
        }
        return i6 + i2;
    }

    public final String toString() {
        return "EmoteFooterItem(isFollow=" + this.f157118a + ", isSubscribe=" + this.f157119b + ")";
    }

    public e(boolean z, boolean z2) {
        this.f157118a = z;
        this.f157119b = z2;
    }
}
