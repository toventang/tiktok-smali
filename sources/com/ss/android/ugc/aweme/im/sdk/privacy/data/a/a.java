package com.ss.android.ugc.aweme.im.sdk.privacy.data.a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class a implements Serializable {
    private final int chatSet;
    private final int chatSettingsPanel;
    private final int chatUserType;

    static {
        Covode.recordClassIndex(65986);
    }

    public static int com_ss_android_ugc_aweme_im_sdk_privacy_data_model_ChatUserSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ a copy$default(a aVar, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = aVar.chatSet;
        }
        if ((i5 & 2) != 0) {
            i3 = aVar.chatSettingsPanel;
        }
        if ((i5 & 4) != 0) {
            i4 = aVar.chatUserType;
        }
        return aVar.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.chatSet;
    }

    public final int component2() {
        return this.chatSettingsPanel;
    }

    public final int component3() {
        return this.chatUserType;
    }

    public final a copy(int i2, int i3, int i4) {
        return new a(i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.chatSet == aVar.chatSet && this.chatSettingsPanel == aVar.chatSettingsPanel && this.chatUserType == aVar.chatUserType;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_im_sdk_privacy_data_model_ChatUserSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.chatSet) * 31) + com_ss_android_ugc_aweme_im_sdk_privacy_data_model_ChatUserSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.chatSettingsPanel)) * 31) + com_ss_android_ugc_aweme_im_sdk_privacy_data_model_ChatUserSetting_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.chatUserType);
    }

    public final String toString() {
        return "ChatUserSetting(chatSet=" + this.chatSet + ", chatSettingsPanel=" + this.chatSettingsPanel + ", chatUserType=" + this.chatUserType + ")";
    }

    public final int getChatSet() {
        return this.chatSet;
    }

    public final int getChatSettingsPanel() {
        return this.chatSettingsPanel;
    }

    public final int getChatUserType() {
        return this.chatUserType;
    }

    public a(int i2, int i3, int i4) {
        this.chatSet = i2;
        this.chatSettingsPanel = i3;
        this.chatUserType = i4;
    }
}
