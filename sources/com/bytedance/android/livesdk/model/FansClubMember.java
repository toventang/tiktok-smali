package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.Map;

public class FansClubMember {
    @c(a = "data")
    FansClubData data;
    @c(a = "prefer_data")
    Map<Integer, FansClubData> preferData;

    static {
        Covode.recordClassIndex(11273);
    }

    public FansClubData getData() {
        return this.data;
    }

    public Map<Integer, FansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(FansClubData fansClubData) {
        this.data = fansClubData;
    }

    public void setPreferData(Map<Integer, FansClubData> map) {
        this.preferData = map;
    }
}
