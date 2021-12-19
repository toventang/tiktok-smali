package com.ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public class d implements Serializable {
    @c(a = "extra")
    public String extra;
    @c(a = "icon")
    public UrlModel icon;
    @c(a = "mix_id")
    public String mixId;
    @c(a = StringSet.name)
    private String mixName;
    @c(a = "mix_type")
    public int mixType;
    @c(a = "moderated_rename_timestamp")
    public long moderatedRenameTimestamp;
    @c(a = "mix_name")
    private String name;
    @c(a = "statistic")
    public b statis;
    @c(a = "status")
    public c status;

    static {
        Covode.recordClassIndex(70709);
    }

    public String getMixName() {
        String str = this.mixName;
        if (str == null || str.equals("")) {
            return this.name;
        }
        return this.mixName;
    }

    public String getName() {
        String str = this.name;
        if (str == null || str.equals("")) {
            return this.mixName;
        }
        return this.name;
    }

    public void setMixName(String str) {
        this.mixName = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
