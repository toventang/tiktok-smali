package com.ss.android.ugc.aweme.shortvideo.settings;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class UploaderRetryOptimizedStrategy {
    @c(a = "max_req_count")
    private final int maxRequestCount;
    @c(a = "protect_timeout")
    private final int protectTimeout;
    @c(a = "socket_connect_timeout")
    private final int socketConnectTimeout;
    @c(a = "socket_read_timeout")
    private final int socketReadTimeout;
    @c(a = "socket_write_timeout")
    private final int socketWriteTimeout;

    static {
        Covode.recordClassIndex(85403);
    }

    public UploaderRetryOptimizedStrategy() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ UploaderRetryOptimizedStrategy copy$default(UploaderRetryOptimizedStrategy uploaderRetryOptimizedStrategy, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = uploaderRetryOptimizedStrategy.maxRequestCount;
        }
        if ((i7 & 2) != 0) {
            i3 = uploaderRetryOptimizedStrategy.socketConnectTimeout;
        }
        if ((i7 & 4) != 0) {
            i4 = uploaderRetryOptimizedStrategy.socketReadTimeout;
        }
        if ((i7 & 8) != 0) {
            i5 = uploaderRetryOptimizedStrategy.socketWriteTimeout;
        }
        if ((i7 & 16) != 0) {
            i6 = uploaderRetryOptimizedStrategy.protectTimeout;
        }
        return uploaderRetryOptimizedStrategy.copy(i2, i3, i4, i5, i6);
    }

    public final int component1() {
        return this.maxRequestCount;
    }

    public final int component2() {
        return this.socketConnectTimeout;
    }

    public final int component3() {
        return this.socketReadTimeout;
    }

    public final int component4() {
        return this.socketWriteTimeout;
    }

    public final int component5() {
        return this.protectTimeout;
    }

    public final UploaderRetryOptimizedStrategy copy(int i2, int i3, int i4, int i5, int i6) {
        return new UploaderRetryOptimizedStrategy(i2, i3, i4, i5, i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploaderRetryOptimizedStrategy)) {
            return false;
        }
        UploaderRetryOptimizedStrategy uploaderRetryOptimizedStrategy = (UploaderRetryOptimizedStrategy) obj;
        return this.maxRequestCount == uploaderRetryOptimizedStrategy.maxRequestCount && this.socketConnectTimeout == uploaderRetryOptimizedStrategy.socketConnectTimeout && this.socketReadTimeout == uploaderRetryOptimizedStrategy.socketReadTimeout && this.socketWriteTimeout == uploaderRetryOptimizedStrategy.socketWriteTimeout && this.protectTimeout == uploaderRetryOptimizedStrategy.protectTimeout;
    }

    public final int hashCode() {
        return (((((((com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.maxRequestCount) * 31) + com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.socketConnectTimeout)) * 31) + com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.socketReadTimeout)) * 31) + com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.socketWriteTimeout)) * 31) + com_ss_android_ugc_aweme_shortvideo_settings_UploaderRetryOptimizedStrategy_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.protectTimeout);
    }

    public final String toString() {
        return "UploaderRetryOptimizedStrategy(maxRequestCount=" + this.maxRequestCount + ", socketConnectTimeout=" + this.socketConnectTimeout + ", socketReadTimeout=" + this.socketReadTimeout + ", socketWriteTimeout=" + this.socketWriteTimeout + ", protectTimeout=" + this.protectTimeout + ")";
    }

    public final int getMaxRequestCount() {
        return this.maxRequestCount;
    }

    public final int getProtectTimeout() {
        return this.protectTimeout;
    }

    public final int getSocketConnectTimeout() {
        return this.socketConnectTimeout;
    }

    public final int getSocketReadTimeout() {
        return this.socketReadTimeout;
    }

    public final int getSocketWriteTimeout() {
        return this.socketWriteTimeout;
    }

    public UploaderRetryOptimizedStrategy(int i2, int i3, int i4, int i5, int i6) {
        this.maxRequestCount = i2;
        this.socketConnectTimeout = i3;
        this.socketReadTimeout = i4;
        this.socketWriteTimeout = i5;
        this.protectTimeout = i6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UploaderRetryOptimizedStrategy(int i2, int i3, int i4, int i5, int i6, int i7, g gVar) {
        this((i7 & 1) != 0 ? 0 : i2, (i7 & 2) != 0 ? 0 : i3, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0 : i5, (i7 & 16) != 0 ? 0 : i6);
    }
}
