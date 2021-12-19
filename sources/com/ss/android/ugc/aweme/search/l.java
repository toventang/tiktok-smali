package com.ss.android.ugc.aweme.search;

import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class l implements Serializable {
    @c(a = "hotlink")
    private String coverUrl;
    @c(a = "event_id")
    private String eventId;
    @c(a = "extra")
    private final String extra;
    @c(a = "heat_value")
    private Long heatValue;
    @c(a = "icon_type")
    private final int iconType;
    @c(a = "online_time")
    private final String onlineTime;
    @c(a = "rank_text")
    private String rankText;
    @c(a = "region")
    private String region;
    @c(a = "schema")
    private final String schema;
    @c(a = "event_name")
    private String trendingName;

    static {
        Covode.recordClassIndex(79063);
    }

    public static /* synthetic */ void getIconType$annotations() {
    }

    public final String getCoverUrl() {
        return this.coverUrl;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final Long getHeatValue() {
        return this.heatValue;
    }

    public final int getIconType() {
        return this.iconType;
    }

    public final String getOnlineTime() {
        return this.onlineTime;
    }

    public final String getRankText() {
        return this.rankText;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getTrendingName() {
        return this.trendingName;
    }

    public final String getType() {
        int i2 = this.iconType;
        if (i2 == 1) {
            return "hot";
        }
        if (i2 != 2) {
            return "none";
        }
        return "up";
    }

    public final String toString() {
        return "event_id:" + this.eventId + " event_name:" + this.trendingName;
    }

    public final Map<String, String> getExtraMap() {
        a aVar = new a();
        try {
            HashMap hashMap = (HashMap) new f().a(this.extra, HashMap.class);
            h.f.b.l.b(hashMap, "");
            for (Map.Entry entry : hashMap.entrySet()) {
                aVar.put(entry.getKey().toString(), entry.getValue().toString());
            }
            return aVar;
        } catch (Exception unused) {
            return new a();
        }
    }

    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public final void setEventId(String str) {
        this.eventId = str;
    }

    public final void setHeatValue(Long l2) {
        this.heatValue = l2;
    }

    public final void setRankText(String str) {
        this.rankText = str;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final void setTrendingName(String str) {
        this.trendingName = str;
    }
}
