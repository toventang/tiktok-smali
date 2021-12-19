package com.ss.android.ugc.aweme.search;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

public final class m extends BaseResponse {
    @c(a = "hotspot_items")

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f121441a;
    @c(a = "billboard_info")

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<l> f121442b;
    @c(a = "item_related_event_id")

    /* renamed from: c  reason: collision with root package name */
    public String f121443c;
    @c(a = "billboard_type")

    /* renamed from: d  reason: collision with root package name */
    public int f121444d;
    @c(a = "has_more")

    /* renamed from: e  reason: collision with root package name */
    public int f121445e;
    @c(a = "offset")

    /* renamed from: f  reason: collision with root package name */
    public int f121446f;
    @c(a = "total")

    /* renamed from: g  reason: collision with root package name */
    public int f121447g;

    static {
        Covode.recordClassIndex(79121);
    }

    public final boolean a() {
        if (this.f121445e == 1) {
            return true;
        }
        return false;
    }
}
