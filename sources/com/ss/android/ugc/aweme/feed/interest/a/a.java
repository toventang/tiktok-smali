package com.ss.android.ugc.aweme.feed.interest.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.journey.af;

public final class a implements d {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public Integer f93512a = 0;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public String f93513b = "";
    @c(a = "interest_list")

    /* renamed from: c  reason: collision with root package name */
    public af f93514c;
    @c(a = "aweme")

    /* renamed from: d  reason: collision with root package name */
    public Aweme f93515d;
    @c(a = "is_active_device")

    /* renamed from: e  reason: collision with root package name */
    public Integer f93516e = 0;
    @c(a = "rid")

    /* renamed from: f  reason: collision with root package name */
    public String f93517f = "";
    @c(a = "log_pb")

    /* renamed from: g  reason: collision with root package name */
    public LogPbBean f93518g;

    static {
        Covode.recordClassIndex(59244);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        return this.f93517f;
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.f93517f = str;
    }
}
