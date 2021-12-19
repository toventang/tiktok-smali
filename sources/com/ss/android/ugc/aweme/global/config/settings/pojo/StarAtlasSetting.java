package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class StarAtlasSetting {
    @c(a = "star_atlas_enable")
    private Boolean starAtlasEnable;
    @c(a = "star_atlas_redirect_url")
    private String starAtlasRedirectUrl;
    @c(a = "star_atlas_url")
    private String starAtlasUrl;

    static {
        Covode.recordClassIndex(63083);
    }

    public Boolean getStarAtlasEnable() {
        Boolean bool = this.starAtlasEnable;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public String getStarAtlasRedirectUrl() {
        String str = this.starAtlasRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getStarAtlasUrl() {
        String str = this.starAtlasUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
