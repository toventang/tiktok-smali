package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CommerceEggConfig {
    @c(a = "enable_comment_egg_refactor")
    private Boolean enableCommentEggRefactor = false;
    @c(a = "enable_digg_egg_refactor")
    private Boolean enableDiggEggRefactor = false;
    @c(a = "enable_search_egg_refactor")
    private Boolean enableSearchEggRefactor = false;

    static {
        Covode.recordClassIndex(63023);
    }

    public Boolean getEnableCommentEggRefactor() {
        Boolean bool = this.enableCommentEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableDiggEggRefactor() {
        Boolean bool = this.enableDiggEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }

    public Boolean getEnableSearchEggRefactor() {
        Boolean bool = this.enableSearchEggRefactor;
        if (bool != null) {
            return bool;
        }
        throw new a();
    }
}
