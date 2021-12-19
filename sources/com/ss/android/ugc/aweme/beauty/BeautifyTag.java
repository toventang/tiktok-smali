package com.ss.android.ugc.aweme.beauty;

import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class BeautifyTag {
    private final String tag;
    private final float value;

    static {
        Covode.recordClassIndex(42219);
    }

    public BeautifyTag() {
        this(null, 0.0f, 3, null);
    }

    public static /* synthetic */ BeautifyTag copy$default(BeautifyTag beautifyTag, String str, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = beautifyTag.tag;
        }
        if ((i2 & 2) != 0) {
            f2 = beautifyTag.value;
        }
        return beautifyTag.copy(str, f2);
    }

    public final String component1() {
        return this.tag;
    }

    public final float component2() {
        return this.value;
    }

    public final BeautifyTag copy(String str, float f2) {
        l.d(str, "");
        return new BeautifyTag(str, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BeautifyTag)) {
            return false;
        }
        BeautifyTag beautifyTag = (BeautifyTag) obj;
        return l.a(this.tag, beautifyTag.tag) && Float.compare(this.value, beautifyTag.value) == 0;
    }

    public final int hashCode() {
        String str = this.tag;
        return ((str != null ? str.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_beauty_BeautifyTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.value);
    }

    public final String toString() {
        return "BeautifyTag(tag=" + this.tag + ", value=" + this.value + ")";
    }

    public final String getTag() {
        return this.tag;
    }

    public final float getValue() {
        return this.value;
    }

    public static int com_ss_android_ugc_aweme_beauty_BeautifyTag_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public BeautifyTag(String str, float f2) {
        l.d(str, "");
        this.tag = str;
        this.value = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BeautifyTag(String str, float f2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f2);
    }
}
