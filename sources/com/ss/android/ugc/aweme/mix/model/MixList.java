package com.ss.android.ugc.aweme.mix.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;

public class MixList implements Serializable {
    @c(a = "cursor")
    public long cursor;
    @c(a = "has_more")
    public int hasMore;
    @c(a = "log_pb")
    public LogPbBean logPb;
    @c(a = "mix_list")
    public List<d> mixList;
    @c(a = "status_code")
    public int statusCode;
    @c(a = "status_msg")
    public String statusMsg;

    static {
        Covode.recordClassIndex(70704);
    }
}
