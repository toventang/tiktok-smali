package com.ss.android.ugc.aweme.commerce.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "end")
    public float end;
    @c(a = "start")
    public float start;

    static {
        Covode.recordClassIndex(45214);
    }

    public a() {
    }

    public static /* synthetic */ a copy$default(a aVar, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = aVar.start;
        }
        if ((i2 & 2) != 0) {
            f3 = aVar.end;
        }
        return aVar.copy(f2, f3);
    }

    public final float component1() {
        return this.start;
    }

    public final float component2() {
        return this.end;
    }

    public final a copy(float f2, float f3) {
        return new a(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.start, aVar.start) == 0 && Float.compare(this.end, aVar.end) == 0;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_commerce_model_ActivityTimeRange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.start) * 31) + com_ss_android_ugc_aweme_commerce_model_ActivityTimeRange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.end);
    }

    public final String toString() {
        return "ActivityTimeRange(start=" + this.start + ", end=" + this.end + ")";
    }

    public final float getEnd() {
        return this.end;
    }

    public final float getStart() {
        return this.start;
    }

    public static int com_ss_android_ugc_aweme_commerce_model_ActivityTimeRange_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public a(float f2, float f3) {
        this.start = f2;
        this.end = f3;
    }
}
