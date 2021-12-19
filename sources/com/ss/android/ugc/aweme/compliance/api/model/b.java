package com.ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class b implements Serializable {
    @c(a = "ban_platform")
    private final Integer banPlatform;
    @c(a = "ban_type")
    private final Integer banType;

    static {
        Covode.recordClassIndex(47346);
    }

    public b() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ b copy$default(b bVar, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = bVar.banType;
        }
        if ((i2 & 2) != 0) {
            num2 = bVar.banPlatform;
        }
        return bVar.copy(num, num2);
    }

    public final Integer component1() {
        return this.banType;
    }

    public final Integer component2() {
        return this.banPlatform;
    }

    public final b copy(Integer num, Integer num2) {
        return new b(num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.banType, bVar.banType) && l.a(this.banPlatform, bVar.banPlatform);
    }

    public final int hashCode() {
        Integer num = this.banType;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.banPlatform;
        if (num2 != null) {
            i2 = num2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BanInfo(banType=" + this.banType + ", banPlatform=" + this.banPlatform + ")";
    }

    public final Integer getBanPlatform() {
        return this.banPlatform;
    }

    public final Integer getBanType() {
        return this.banType;
    }

    public b(Integer num, Integer num2) {
        this.banType = num;
        this.banPlatform = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Integer num, Integer num2, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0 : num, (i2 & 2) != 0 ? 0 : num2);
    }
}
