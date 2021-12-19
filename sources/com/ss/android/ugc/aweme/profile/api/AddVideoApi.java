package com.ss.android.ugc.aweme.profile.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import f.a.t;
import h.f.b.l;

public final class AddVideoApi implements IAddVideoApi {

    /* renamed from: a  reason: collision with root package name */
    public static final AddVideoApi f115974a = new AddVideoApi();

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ IAddVideoApi f115975b;

    @Override // com.ss.android.ugc.aweme.profile.api.IAddVideoApi
    @h(a = "/aweme/v1/aweme/post/")
    public final t<FeedItemList> getMyPublishVideos(@z(a = "source") int i2, @z(a = "user_avatar_shrink") String str, @z(a = "video_cover_shrink") String str2, @z(a = "filter_private") int i3, @z(a = "max_cursor") long j2, @z(a = "sec_user_id") String str3, @z(a = "count") int i4) {
        return this.f115975b.getMyPublishVideos(i2, str, str2, i3, j2, str3, i4);
    }

    static {
        Covode.recordClassIndex(74791);
    }

    private AddVideoApi() {
        Object a2 = RetrofitFactory.a().a(b.f59141e).a(IAddVideoApi.class);
        l.b(a2, "");
        this.f115975b = (IAddVideoApi) a2;
    }
}
