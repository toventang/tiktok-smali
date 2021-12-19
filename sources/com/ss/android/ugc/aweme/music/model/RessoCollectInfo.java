package com.ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class RessoCollectInfo implements Serializable {
    @c(a = "added_on_resso")
    private final boolean addedOnResso;
    @c(a = "deep_link")
    private final String deepLink;

    static {
        Covode.recordClassIndex(71684);
    }

    public static /* synthetic */ RessoCollectInfo copy$default(RessoCollectInfo ressoCollectInfo, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ressoCollectInfo.addedOnResso;
        }
        if ((i2 & 2) != 0) {
            str = ressoCollectInfo.deepLink;
        }
        return ressoCollectInfo.copy(z, str);
    }

    public final boolean component1() {
        return this.addedOnResso;
    }

    public final String component2() {
        return this.deepLink;
    }

    public final RessoCollectInfo copy(boolean z, String str) {
        l.d(str, "");
        return new RessoCollectInfo(z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RessoCollectInfo)) {
            return false;
        }
        RessoCollectInfo ressoCollectInfo = (RessoCollectInfo) obj;
        return this.addedOnResso == ressoCollectInfo.addedOnResso && l.a(this.deepLink, ressoCollectInfo.deepLink);
    }

    public final int hashCode() {
        boolean z = this.addedOnResso;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.deepLink;
        return i5 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RessoCollectInfo(addedOnResso=" + this.addedOnResso + ", deepLink=" + this.deepLink + ")";
    }

    public final boolean getAddedOnResso() {
        return this.addedOnResso;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public RessoCollectInfo(boolean z, String str) {
        l.d(str, "");
        this.addedOnResso = z;
        this.deepLink = str;
    }
}
