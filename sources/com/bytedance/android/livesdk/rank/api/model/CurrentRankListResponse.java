package com.bytedance.android.livesdk.rank.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class CurrentRankListResponse {
    @c(a = "has_more")
    public boolean hasMore;
    @c(a = "music_wave")
    public String musicWave;
    @c(a = "ranks")
    public List<h> ranks;
    @c(a = "seats")
    public List<h> seats;
    @c(a = "self_info")
    public h selfInfo;
    @c(a = "total")
    public long total;

    static {
        Covode.recordClassIndex(12169);
    }
}
