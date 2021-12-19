package com.ss.android.ugc.aweme.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.story.model.d;
import com.ss.android.ugc.aweme.story.model.g;
import f.a.t;
import h.f.b.l;

public final class ProfileStoryApi implements IProfileStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final ProfileStoryApi f136693a = new ProfileStoryApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IProfileStoryApi f136694b;

    @Override // com.ss.android.ugc.aweme.story.IProfileStoryApi
    @h(a = "/tiktok/story/archive/detail/v1")
    public final t<d> getStoryArchDetail() {
        return this.f136694b.getStoryArchDetail();
    }

    @Override // com.ss.android.ugc.aweme.story.IProfileStoryApi
    @h(a = "/tiktok/story/view/info/v1")
    public final t<g> getStoryViewInfo(@z(a = "sec_author_id") String str, @z(a = "author_id") String str2) {
        return this.f136694b.getStoryViewInfo(str, str2);
    }

    static {
        Covode.recordClassIndex(89278);
    }

    private ProfileStoryApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IProfileStoryApi.class);
        l.b(a2, "");
        this.f136694b = (IProfileStoryApi) a2;
    }
}
