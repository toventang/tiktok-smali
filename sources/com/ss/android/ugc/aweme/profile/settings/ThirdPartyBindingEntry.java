package com.ss.android.ugc.aweme.profile.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class ThirdPartyBindingEntry {
    @c(a = "ins")
    private final boolean ins;
    @c(a = "twitter")
    private final boolean twitter;
    @c(a = "youtube")
    private final boolean youtube;

    static {
        Covode.recordClassIndex(75350);
    }

    public ThirdPartyBindingEntry() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ ThirdPartyBindingEntry copy$default(ThirdPartyBindingEntry thirdPartyBindingEntry, boolean z, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = thirdPartyBindingEntry.twitter;
        }
        if ((i2 & 2) != 0) {
            z2 = thirdPartyBindingEntry.ins;
        }
        if ((i2 & 4) != 0) {
            z3 = thirdPartyBindingEntry.youtube;
        }
        return thirdPartyBindingEntry.copy(z, z2, z3);
    }

    public final boolean component1() {
        return this.twitter;
    }

    public final boolean component2() {
        return this.ins;
    }

    public final boolean component3() {
        return this.youtube;
    }

    public final ThirdPartyBindingEntry copy(boolean z, boolean z2, boolean z3) {
        return new ThirdPartyBindingEntry(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThirdPartyBindingEntry)) {
            return false;
        }
        ThirdPartyBindingEntry thirdPartyBindingEntry = (ThirdPartyBindingEntry) obj;
        return this.twitter == thirdPartyBindingEntry.twitter && this.ins == thirdPartyBindingEntry.ins && this.youtube == thirdPartyBindingEntry.youtube;
    }

    public final int hashCode() {
        boolean z = this.twitter;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.ins;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        if (!this.youtube) {
            i2 = 0;
        }
        return i10 + i2;
    }

    public final String toString() {
        return "ThirdPartyBindingEntry(twitter=" + this.twitter + ", ins=" + this.ins + ", youtube=" + this.youtube + ")";
    }

    public final boolean getIns() {
        return this.ins;
    }

    public final boolean getTwitter() {
        return this.twitter;
    }

    public final boolean getYoutube() {
        return this.youtube;
    }

    public ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3) {
        this.twitter = z;
        this.ins = z2;
        this.youtube = z3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThirdPartyBindingEntry(boolean z, boolean z2, boolean z3, int i2, g gVar) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3);
    }
}
