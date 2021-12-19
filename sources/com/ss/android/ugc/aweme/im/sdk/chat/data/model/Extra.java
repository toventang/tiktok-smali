package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class Extra {
    private final boolean bold;
    @c(a = "color_type")
    private final int colorType;

    static {
        Covode.recordClassIndex(64034);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = extra.colorType;
        }
        if ((i3 & 2) != 0) {
            z = extra.bold;
        }
        return extra.copy(i2, z);
    }

    public final int component1() {
        return this.colorType;
    }

    public final boolean component2() {
        return this.bold;
    }

    public final Extra copy(int i2, boolean z) {
        return new Extra(i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) obj;
        return this.colorType == extra.colorType && this.bold == extra.bold;
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.colorType) * 31;
        boolean z = this.bold;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return com_ss_android_ugc_aweme_im_sdk_chat_data_model_Extra_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2;
    }

    public final String toString() {
        return "Extra(colorType=" + this.colorType + ", bold=" + this.bold + ")";
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public Extra(int i2, boolean z) {
        this.colorType = i2;
        this.bold = z;
    }
}
