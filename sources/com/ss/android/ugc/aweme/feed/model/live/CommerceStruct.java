package com.ss.android.ugc.aweme.feed.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class CommerceStruct implements Serializable {
    @c(a = "commerce_permission")
    public int commercePermission;
    @c(a = "oec_live_enter_room_init_data")
    public String oecInitDataString;

    static {
        Covode.recordClassIndex(59484);
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public String toString() {
        return "CommerceStruct{commercePermission=" + this.commercePermission + ", commercePack=" + this.oecInitDataString + '}';
    }

    public void setCommercePermission(int i2) {
        this.commercePermission = i2;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
