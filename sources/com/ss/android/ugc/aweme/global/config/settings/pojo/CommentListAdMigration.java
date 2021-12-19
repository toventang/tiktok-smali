package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class CommentListAdMigration {
    @c(a = "enterprise_tag")
    private String enterpriseTag;
    @c(a = "link_tag")
    private String linkTag;
    @c(a = "star_atlas_tag")
    private String starAtlasTag;
    @c(a = "task_tag")
    private String taskTag;

    static {
        Covode.recordClassIndex(63022);
    }

    public String getEnterpriseTag() {
        String str = this.enterpriseTag;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getLinkTag() {
        String str = this.linkTag;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getStarAtlasTag() {
        String str = this.starAtlasTag;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getTaskTag() {
        String str = this.taskTag;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
