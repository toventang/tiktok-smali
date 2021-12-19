package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public class BALinkStruct implements Serializable {
    @c(a = "ba_link_data")
    public String baLinkData;
    @c(a = "ba_link_permission")
    public int baLinkPermission;

    static {
        Covode.recordClassIndex(13646);
    }

    public String getBaLinkData() {
        return this.baLinkData;
    }

    public int getBaLinkPermission() {
        return this.baLinkPermission;
    }

    public String toString() {
        return "BALinkStruct{baLinkPermission=" + this.baLinkPermission + ", baLinkData='" + this.baLinkData + '\'' + '}';
    }

    public void setBaLinkData(String str) {
        this.baLinkData = str;
    }

    public void setBaLinkPermission(int i2) {
        this.baLinkPermission = i2;
    }
}
