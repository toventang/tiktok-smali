package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class PrivateTab implements Serializable {
    @c(a = "private_tab_style")
    private int privateTabStyle = 1;

    static {
        Covode.recordClassIndex(75248);
    }

    public int getPrivateTabStyle() {
        return this.privateTabStyle;
    }
}
