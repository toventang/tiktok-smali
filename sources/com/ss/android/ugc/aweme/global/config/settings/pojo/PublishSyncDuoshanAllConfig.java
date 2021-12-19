package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class PublishSyncDuoshanAllConfig {
    @c(a = "register_duoshan")
    private PublishSyncDuoshanConfig registerDuoshan;
    @c(a = "ungister_duoshan")
    private PublishSyncDuoshanConfig ungisterDuoshan;

    static {
        Covode.recordClassIndex(63066);
    }

    public PublishSyncDuoshanConfig getRegisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.registerDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new a();
    }

    public PublishSyncDuoshanConfig getUngisterDuoshan() {
        PublishSyncDuoshanConfig publishSyncDuoshanConfig = this.ungisterDuoshan;
        if (publishSyncDuoshanConfig != null) {
            return publishSyncDuoshanConfig;
        }
        throw new a();
    }
}
