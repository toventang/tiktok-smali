package com.ss.android.ugc.aweme.homepage.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.homepage.story.b.a;
import f.a.t;
import h.f.b.l;

public final class HomepageStoryApi implements IHomepageStoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static final HomepageStoryApi f99230a = new HomepageStoryApi();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ IHomepageStoryApi f99231c;

    @Override // com.ss.android.ugc.aweme.homepage.story.IHomepageStoryApi
    @h(a = "/tiktok/v1/story/get_feed")
    public final t<a> getFeed(@z(a = "refresh") boolean z) {
        return this.f99231c.getFeed(z);
    }

    static {
        Covode.recordClassIndex(63219);
    }

    private HomepageStoryApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IHomepageStoryApi.class);
        l.b(a2, "");
        this.f99231c = (IHomepageStoryApi) a2;
    }
}
