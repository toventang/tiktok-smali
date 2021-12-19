package com.ss.android.ugc.aweme.feed.model.livesplash;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class LiveAwesomeSplashInfo implements Serializable {
    @c(a = "end_time")
    public long endTime;
    @c(a = "feed_show_time")
    public int feedShowTime;
    public boolean hasShown;
    @c(a = "is_topview_data")
    public boolean isTopViewData;
    @c(a = "live_info")
    public String liveData;
    @c(a = "start_time")
    public long startTime;
    @c(a = "topview_valid")
    public boolean topviewValid = true;

    static {
        Covode.recordClassIndex(59518);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getFeedShowTime() {
        return this.feedShowTime;
    }

    public final boolean getHasShown() {
        return this.hasShown;
    }

    public final String getLiveData() {
        return this.liveData;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getTopviewValid() {
        return this.topviewValid;
    }

    public final boolean isTopViewData() {
        return this.isTopViewData;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setFeedShowTime(int i2) {
        this.feedShowTime = i2;
    }

    public final void setHasShown(boolean z) {
        this.hasShown = z;
    }

    public final void setLiveData(String str) {
        this.liveData = str;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setTopViewData(boolean z) {
        this.isTopViewData = z;
    }

    public final void setTopviewValid(boolean z) {
        this.topviewValid = z;
    }
}
