package com.ss.android.ugc.aweme.following.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

public class c extends BaseResponse {
    @com.google.gson.a.c(a = "followings")

    /* renamed from: a  reason: collision with root package name */
    public List<User> f96327a = new ArrayList();
    @com.google.gson.a.c(a = "max_time")

    /* renamed from: b  reason: collision with root package name */
    public long f96328b;
    @com.google.gson.a.c(a = "has_more")

    /* renamed from: c  reason: collision with root package name */
    public boolean f96329c;
    @com.google.gson.a.c(a = "total")

    /* renamed from: d  reason: collision with root package name */
    public int f96330d;
    @com.google.gson.a.c(a = "min_time")

    /* renamed from: e  reason: collision with root package name */
    public long f96331e;
    @com.google.gson.a.c(a = "offset")

    /* renamed from: f  reason: collision with root package name */
    public int f96332f;
    @com.google.gson.a.c(a = "rec_has_more")

    /* renamed from: g  reason: collision with root package name */
    public boolean f96333g = true;
    @com.google.gson.a.c(a = "vcd_count")

    /* renamed from: h  reason: collision with root package name */
    public int f96334h;
    @com.google.gson.a.c(a = "hotsoon_text")

    /* renamed from: i  reason: collision with root package name */
    public String f96335i;
    @com.google.gson.a.c(a = "hotsoon_has_more")

    /* renamed from: j  reason: collision with root package name */
    public int f96336j;

    static {
        Covode.recordClassIndex(60992);
    }

    public final boolean a() {
        if (this.f96336j == 1) {
            return true;
        }
        return false;
    }
}
