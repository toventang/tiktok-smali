package com.ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;

public final class PluginDownloading extends PluginState {
    private final long currentDownload;
    private final long total;

    static {
        Covode.recordClassIndex(79537);
    }

    public static int com_ss_android_ugc_aweme_services_PluginDownloading_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ PluginDownloading copy$default(PluginDownloading pluginDownloading, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = pluginDownloading.currentDownload;
        }
        if ((i2 & 2) != 0) {
            j3 = pluginDownloading.total;
        }
        return pluginDownloading.copy(j2, j3);
    }

    public final long component1() {
        return this.currentDownload;
    }

    public final long component2() {
        return this.total;
    }

    public final PluginDownloading copy(long j2, long j3) {
        return new PluginDownloading(j2, j3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginDownloading)) {
            return false;
        }
        PluginDownloading pluginDownloading = (PluginDownloading) obj;
        return this.currentDownload == pluginDownloading.currentDownload && this.total == pluginDownloading.total;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_services_PluginDownloading_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.currentDownload) * 31) + com_ss_android_ugc_aweme_services_PluginDownloading_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total);
    }

    public final String toString() {
        return "PluginDownloading(currentDownload=" + this.currentDownload + ", total=" + this.total + ")";
    }

    public final long getCurrentDownload() {
        return this.currentDownload;
    }

    public final long getTotal() {
        return this.total;
    }

    public PluginDownloading(long j2, long j3) {
        super(null);
        this.currentDownload = j2;
        this.total = j3;
    }
}
