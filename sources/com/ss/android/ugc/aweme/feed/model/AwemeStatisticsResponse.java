package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class AwemeStatisticsResponse implements Serializable {
    @c(a = "status_msg")
    private String message;
    @c(a = "statistics_list")
    private List<AwemeStatisticsBackup> statisticsList;
    @c(a = "status_code")
    private Integer status = 0;

    static {
        Covode.recordClassIndex(59334);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<AwemeStatisticsBackup> getStatisticsList() {
        return this.statisticsList;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String toString() {
        return "AwemeStatisticsResponse(status=" + this.status + ", message=" + this.message + ", statisticsList=" + this.statisticsList + ')';
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatisticsList(List<AwemeStatisticsBackup> list) {
        this.statisticsList = list;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }
}
