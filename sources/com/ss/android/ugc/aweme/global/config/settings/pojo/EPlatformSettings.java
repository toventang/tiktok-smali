package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.List;

public class EPlatformSettings {
    @c(a = "block_hint")
    private String blockHint;
    @c(a = "block_mode")
    private Integer blockMode;
    @c(a = "jump_block_list")
    private List<String> jumpBlockList = new ArrayList();
    @c(a = "jump_redirect_url")
    private String jumpRedirectUrl;
    @c(a = "lite_link")
    private String liteLink;
    @c(a = "profile_add_contact_info_text")
    private String profileAddContactInfoText;

    static {
        Covode.recordClassIndex(63031);
    }

    public List<String> getJumpBlockList() {
        return this.jumpBlockList;
    }

    public String getBlockHint() {
        String str = this.blockHint;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getBlockMode() {
        Integer num = this.blockMode;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getJumpRedirectUrl() {
        String str = this.jumpRedirectUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getLiteLink() {
        String str = this.liteLink;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getProfileAddContactInfoText() {
        String str = this.profileAddContactInfoText;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
