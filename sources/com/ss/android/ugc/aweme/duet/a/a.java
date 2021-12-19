package com.ss.android.ugc.aweme.duet.a;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.api.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;

public final class a extends BaseResponse {
    @b
    @c(a = "aweme_list")

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Aweme> f84116a;
    @c(a = "cursor")

    /* renamed from: b  reason: collision with root package name */
    public long f84117b;
    @c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public int f84118c;
    @c(a = "log_pb")

    /* renamed from: d  reason: collision with root package name */
    public LogPbBean f84119d;

    static {
        Covode.recordClassIndex(52440);
    }
}
