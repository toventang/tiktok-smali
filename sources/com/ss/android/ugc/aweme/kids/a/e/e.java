package com.ss.android.ugc.aweme.kids.a.e;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;

public final class e extends BaseResponse {
    @c(a = "music_list")

    /* renamed from: a  reason: collision with root package name */
    public List<Music> f105314a;
    @c(a = "mc_info")

    /* renamed from: b  reason: collision with root package name */
    public d f105315b;
    @c(a = "cursor")

    /* renamed from: c  reason: collision with root package name */
    public int f105316c;
    @c(a = "radio_cursor")

    /* renamed from: d  reason: collision with root package name */
    public int f105317d;
    @c(a = "has_more")

    /* renamed from: e  reason: collision with root package name */
    public int f105318e;
    @c(a = "music_type")

    /* renamed from: f  reason: collision with root package name */
    public int f105319f;
    @c(a = "log_pb")

    /* renamed from: g  reason: collision with root package name */
    public LogPbBean f105320g;
    @c(a = "child_collections")

    /* renamed from: h  reason: collision with root package name */
    public List<d> f105321h;

    static {
        Covode.recordClassIndex(67505);
    }

    public final int a() {
        int i2 = this.f105317d;
        if (i2 > 0) {
            return i2;
        }
        return this.f105316c;
    }
}
