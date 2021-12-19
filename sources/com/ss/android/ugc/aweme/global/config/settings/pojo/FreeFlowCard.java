package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FreeFlowCard {
    @c(a = "entry_url")
    private String entryUrl;
    @c(a = "entry_url_text")
    private String entryUrlText;
    @c(a = "toast_slogan")
    private String toastSlogan;
    @c(a = "toast_title")
    private String toastTitle;
    @c(a = "toast_type")
    private Integer toastType;
    @c(a = "toast_url")
    private String toastUrl;
    @c(a = "toast_url_text")
    private String toastUrlText;

    static {
        Covode.recordClassIndex(63039);
    }

    public String getEntryUrl() {
        String str = this.entryUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getEntryUrlText() {
        String str = this.entryUrlText;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getToastSlogan() {
        String str = this.toastSlogan;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getToastTitle() {
        String str = this.toastTitle;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getToastType() {
        Integer num = this.toastType;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public String getToastUrl() {
        String str = this.toastUrl;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getToastUrlText() {
        String str = this.toastUrlText;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
