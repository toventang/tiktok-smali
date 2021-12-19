package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class LiveMessageConfig {
    @c(a = "duplicate_size")
    private final int duplicateSize;
    @c(a = "enhance_websocket")
    private final boolean enhanceWebsocket;

    static {
        Covode.recordClassIndex(10786);
    }

    public LiveMessageConfig() {
        this(0, false, 3, null);
    }

    public static int com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ LiveMessageConfig copy$default(LiveMessageConfig liveMessageConfig, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = liveMessageConfig.duplicateSize;
        }
        if ((i3 & 2) != 0) {
            z = liveMessageConfig.enhanceWebsocket;
        }
        return liveMessageConfig.copy(i2, z);
    }

    public final int component1() {
        return this.duplicateSize;
    }

    public final boolean component2() {
        return this.enhanceWebsocket;
    }

    public final LiveMessageConfig copy(int i2, boolean z) {
        return new LiveMessageConfig(i2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveMessageConfig)) {
            return false;
        }
        LiveMessageConfig liveMessageConfig = (LiveMessageConfig) obj;
        return this.duplicateSize == liveMessageConfig.duplicateSize && this.enhanceWebsocket == liveMessageConfig.enhanceWebsocket;
    }

    public final int hashCode() {
        int com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.duplicateSize) * 31;
        boolean z = this.enhanceWebsocket;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        return com_bytedance_android_livesdk_livesetting_message_LiveMessageConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + i2;
    }

    public final String toString() {
        return "LiveMessageConfig(duplicateSize=" + this.duplicateSize + ", enhanceWebsocket=" + this.enhanceWebsocket + ")";
    }

    public final int getDuplicateSize() {
        return this.duplicateSize;
    }

    public final boolean getEnhanceWebsocket() {
        return this.enhanceWebsocket;
    }

    public LiveMessageConfig(int i2, boolean z) {
        this.duplicateSize = i2;
        this.enhanceWebsocket = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LiveMessageConfig(int i2, boolean z, int i3, g gVar) {
        this((i3 & 1) != 0 ? 512 : i2, (i3 & 2) != 0 ? false : z);
    }
}
