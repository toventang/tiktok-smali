package com.ss.android.ugc.aweme.homepage.story;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.story.g.c;
import f.a.t;

public interface IHomepageStoryApi {

    /* renamed from: b  reason: collision with root package name */
    public static final a f99232b = a.f99234b;

    static {
        Covode.recordClassIndex(63220);
    }

    @h(a = "/tiktok/v1/story/get_feed")
    t<com.ss.android.ugc.aweme.homepage.story.b.a> getFeed(@z(a = "refresh") boolean z);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f99233a = c.a().f137767d;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f99234b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(63221);
        }
    }
}
