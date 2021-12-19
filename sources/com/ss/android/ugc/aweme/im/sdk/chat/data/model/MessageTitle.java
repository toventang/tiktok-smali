package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class MessageTitle {
    private final boolean bold;
    @c(a = "color_type")
    private final int colorType;
    private final String title;

    static {
        Covode.recordClassIndex(64052);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_chat_data_model_MessageTitle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ MessageTitle copy$default(MessageTitle messageTitle, boolean z, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = messageTitle.bold;
        }
        if ((i3 & 2) != 0) {
            str = messageTitle.title;
        }
        if ((i3 & 4) != 0) {
            i2 = messageTitle.colorType;
        }
        return messageTitle.copy(z, str, i2);
    }

    public final boolean component1() {
        return this.bold;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.colorType;
    }

    public final MessageTitle copy(boolean z, String str, int i2) {
        l.d(str, "");
        return new MessageTitle(z, str, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTitle)) {
            return false;
        }
        MessageTitle messageTitle = (MessageTitle) obj;
        return this.bold == messageTitle.bold && l.a(this.title, messageTitle.title) && this.colorType == messageTitle.colorType;
    }

    public final int hashCode() {
        boolean z = this.bold;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.title;
        return ((i5 + (str != null ? str.hashCode() : 0)) * 31) + com_ss_android_ugc_aweme_im_sdk_chat_data_model_MessageTitle_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.colorType);
    }

    public final String toString() {
        return "MessageTitle(bold=" + this.bold + ", title=" + this.title + ", colorType=" + this.colorType + ")";
    }

    public final boolean getBold() {
        return this.bold;
    }

    public final int getColorType() {
        return this.colorType;
    }

    public final String getTitle() {
        return this.title;
    }

    public MessageTitle(boolean z, String str, int i2) {
        l.d(str, "");
        this.bold = z;
        this.title = str;
        this.colorType = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessageTitle(boolean z, String str, int i2, int i3, g gVar) {
        this(z, str, (i3 & 4) != 0 ? 0 : i2);
    }
}
