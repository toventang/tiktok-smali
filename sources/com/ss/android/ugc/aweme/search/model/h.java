package com.ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final class h {
    @c(a = "sug_list")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends e> f121536a;
    @c(a = "log_pb")

    /* renamed from: b  reason: collision with root package name */
    public LogPbBean f121537b;
    @c(a = "rid")

    /* renamed from: c  reason: collision with root package name */
    public String f121538c;
    @c(a = "has_more")

    /* renamed from: d  reason: collision with root package name */
    public Integer f121539d;

    static {
        Covode.recordClassIndex(79162);
    }

    public final boolean a() {
        Integer num = this.f121539d;
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }
}
