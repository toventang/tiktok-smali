package com.ss.android.ugc.aweme.prop.c;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

public final class b extends BaseResponse {
    @com.ss.android.ugc.aweme.base.api.b
    @c(a = "aweme_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Aweme> f118276a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public long f118277b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f118278c;
    @c(a = "rid")

    /* renamed from: d  reason: collision with root package name */
    public String f118279d;
    @c(a = "log_pb")

    /* renamed from: e  reason: collision with root package name */
    public LogPbBean f118280e;
    @c(a = "is_top")

    /* renamed from: f  reason: collision with root package name */
    public boolean f118281f;

    static {
        Covode.recordClassIndex(76812);
    }

    public final boolean a() {
        if (this.f118278c == 1) {
            return true;
        }
        return false;
    }
}
