package com.ss.android.ugc.aweme.mix.addfeed;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import h.f.b.l;

public final class b extends AddFeedToMixFragment.d {

    /* renamed from: a  reason: collision with root package name */
    public String f109769a;

    /* renamed from: b  reason: collision with root package name */
    boolean f109770b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f109771c;

    static {
        Covode.recordClassIndex(70290);
    }

    public /* synthetic */ b() {
        this("");
    }

    @Override // com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.d
    public final boolean a() {
        return this.f109770b;
    }

    public final int hashCode() {
        int i2;
        String str = this.f109769a;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i3 = i2 * 31;
        boolean z = this.f109770b;
        int i4 = 1;
        if (z) {
            z = true;
        }
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = z ? 1 : 0;
        int i8 = (i3 + i5) * 31;
        if (!this.f109771c) {
            i4 = 0;
        }
        return i8 + i4;
    }

    public final String toString() {
        return "DefaultMixListItem(mixId=" + this.f109769a + ", select=" + this.f109770b + ", isNameValid=" + this.f109771c + ")";
    }

    @Override // com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment.d
    public final void a(boolean z) {
        this.f109770b = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private b(String str) {
        super((byte) 0);
        l.d(str, "");
        this.f109769a = str;
        this.f109770b = false;
        this.f109771c = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (l.a((Object) this.f109769a, (Object) bVar.f109769a) && this.f109770b == bVar.f109770b && this.f109771c == bVar.f109771c) {
            return true;
        }
        return false;
    }
}
