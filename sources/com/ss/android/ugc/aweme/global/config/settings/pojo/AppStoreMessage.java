package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class AppStoreMessage {
    @c(a = "section")
    private Integer section;
    @c(a = "switcher")
    private Integer switcher = 1;
    @c(a = "text")
    private String text;
    @c(a = "threshold")
    private Integer threshold;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(63012);
    }

    public Integer getSection() {
        Integer num = this.section;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getSwitcher() {
        Integer num = this.switcher;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getThreshold() {
        Integer num = this.threshold;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
