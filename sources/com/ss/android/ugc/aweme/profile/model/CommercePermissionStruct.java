package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class CommercePermissionStruct implements Serializable {
    @c(a = "e_homepage_tab_management")
    public int eHomepageTabManagement = -1;
    @c(a = "elite_login")
    public int eliteLogin = -1;
    @c(a = "enterprise")
    public int enterprise = -1;
    @c(a = "head_image")
    public int headImage = -1;
    @c(a = "star_atlas_order")
    public int starAtlasOrder = -1;
    @c(a = "top_item")
    public int topItem = -1;

    static {
        Covode.recordClassIndex(75212);
    }
}
