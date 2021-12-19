package com.bytedance.falconx.statistic;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class StatisticData {
    @c(a = "common")
    public Common mCommon;
    @c(a = "offline")
    public List<InterceptorModel> offline;

    static {
        Covode.recordClassIndex(16932);
    }
}
