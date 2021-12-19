package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class BioSettings {
    @c(a = "enable_bio_email")
    private Boolean enableBioEmail;
    @c(a = "enable_bio_url")
    private Boolean enableBioUrl;

    static {
        Covode.recordClassIndex(63017);
    }

    public Boolean getEnableBioEmail() {
        Boolean bool = this.enableBioEmail;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableBioUrl() {
        Boolean bool = this.enableBioUrl;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
