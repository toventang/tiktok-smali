package com.ss.android.ugc.aweme.feed.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.TopViewLiveInfo;
import f.a.t;

public interface FeedTopViewLiveApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91931a = a.f91932a;

    static {
        Covode.recordClassIndex(57878);
    }

    @h(a = "/aweme/v1/topview/live/")
    t<TopViewLiveInfo> getTopViewLiveInfo(@z(a = "sec_uid") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f91932a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(57879);
        }
    }
}
