package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.app.api.d;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final class q implements d {
    @c(a = "status_code")

    /* renamed from: a  reason: collision with root package name */
    public final int f74897a;
    @c(a = "status_msg")

    /* renamed from: b  reason: collision with root package name */
    public final String f74898b;
    @c(a = "aweme_list")

    /* renamed from: c  reason: collision with root package name */
    public final List<o> f74899c;
    @c(a = "log_pb")

    /* renamed from: d  reason: collision with root package name */
    public final LogPbBean f74900d;
    @c(a = "extra")

    /* renamed from: e  reason: collision with root package name */
    public final a f74901e;

    /* renamed from: f  reason: collision with root package name */
    private String f74902f;

    public static final class a {
        @c(a = "now")

        /* renamed from: a  reason: collision with root package name */
        public final long f74903a;
        @c(a = "fatal_item_ids")

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f74904b;
        @c(a = "logid")

        /* renamed from: c  reason: collision with root package name */
        public final String f74905c;

        static {
            Covode.recordClassIndex(46185);
        }
    }

    static {
        Covode.recordClassIndex(46184);
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final String getRequestId() {
        String imprId;
        String str = this.f74902f;
        if (str != null && str.length() > 0) {
            return this.f74902f;
        }
        LogPbBean logPbBean = this.f74900d;
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null || imprId.length() <= 0) {
            return null;
        }
        return this.f74900d.getImprId();
    }

    @Override // com.ss.android.ugc.aweme.app.api.d
    public final void setRequestId(String str) {
        this.f74902f = str;
    }
}
