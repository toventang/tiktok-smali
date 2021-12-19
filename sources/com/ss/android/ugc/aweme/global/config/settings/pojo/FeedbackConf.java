package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;

public class FeedbackConf {
    @c(a = "disable_upload_region")
    private String[] disableUploadRegion;
    @c(a = "fe_help")
    private String feHelp;
    @c(a = "fe_record")
    private String feRecord;
    @c(a = "help")
    private String help;
    @c(a = "normal_entry")
    private String normalEntry;
    @c(a = "not_logged_in")
    private String notLoggedIn;

    static {
        Covode.recordClassIndex(63035);
    }

    public String[] getDisableUploadRegion() {
        String[] strArr = this.disableUploadRegion;
        if (strArr == null) {
            return null;
        }
        return strArr;
    }

    public String getFeHelp() {
        String str = this.feHelp;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getFeRecord() {
        String str = this.feRecord;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getHelp() {
        String str = this.help;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNormalEntry() {
        String str = this.normalEntry;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getNotLoggedIn() {
        String str = this.notLoggedIn;
        if (str != null) {
            return str;
        }
        throw new a();
    }
}
