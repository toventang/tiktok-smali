package com.ss.android.ugc.aweme.services.story;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class StoryCoverExtractConfig {
    private final int height;
    private final int timestamp;
    private final int width;

    static {
        Covode.recordClassIndex(79826);
    }

    public StoryCoverExtractConfig() {
        this(0, 0, 0, 7, null);
    }

    public static int com_ss_android_ugc_aweme_services_story_StoryCoverExtractConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ StoryCoverExtractConfig copy$default(StoryCoverExtractConfig storyCoverExtractConfig, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = storyCoverExtractConfig.width;
        }
        if ((i5 & 2) != 0) {
            i3 = storyCoverExtractConfig.height;
        }
        if ((i5 & 4) != 0) {
            i4 = storyCoverExtractConfig.timestamp;
        }
        return storyCoverExtractConfig.copy(i2, i3, i4);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final int component3() {
        return this.timestamp;
    }

    public final StoryCoverExtractConfig copy(int i2, int i3, int i4) {
        return new StoryCoverExtractConfig(i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryCoverExtractConfig)) {
            return false;
        }
        StoryCoverExtractConfig storyCoverExtractConfig = (StoryCoverExtractConfig) obj;
        return this.width == storyCoverExtractConfig.width && this.height == storyCoverExtractConfig.height && this.timestamp == storyCoverExtractConfig.timestamp;
    }

    public final int hashCode() {
        return (((com_ss_android_ugc_aweme_services_story_StoryCoverExtractConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width) * 31) + com_ss_android_ugc_aweme_services_story_StoryCoverExtractConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height)) * 31) + com_ss_android_ugc_aweme_services_story_StoryCoverExtractConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.timestamp);
    }

    public final String toString() {
        return "StoryCoverExtractConfig(width=" + this.width + ", height=" + this.height + ", timestamp=" + this.timestamp + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getTimestamp() {
        return this.timestamp;
    }

    public final int getWidth() {
        return this.width;
    }

    public StoryCoverExtractConfig(int i2, int i3, int i4) {
        this.width = i2;
        this.height = i3;
        this.timestamp = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StoryCoverExtractConfig(int i2, int i3, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? -1 : i2, (i5 & 2) != 0 ? -1 : i3, (i5 & 4) != 0 ? 0 : i4);
    }
}
