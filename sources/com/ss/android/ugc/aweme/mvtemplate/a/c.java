package com.ss.android.ugc.aweme.mvtemplate.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

public final class c extends BaseResponse implements d {
    @com.google.gson.a.c(a = "aweme_list")

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Aweme> f112132a;
    @com.google.gson.a.c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public long f112133b;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public Boolean f112134c;
    @com.google.gson.a.c(a = "rid")

    /* renamed from: d  reason: collision with root package name */
    public String f112135d;
    @com.google.gson.a.c(a = "log_pb")

    /* renamed from: e  reason: collision with root package name */
    public LogPbBean f112136e;

    static {
        Covode.recordClassIndex(72052);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.f112135d;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.f112135d = str;
    }
}
