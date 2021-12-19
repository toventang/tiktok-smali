package com.ss.android.ugc.aweme.commercialize.profile;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

public interface FakeUserAwemeApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75134a = a.f75135a;

    static {
        Covode.recordClassIndex(46343);
    }

    @h(a = "/tiktok/v1/ad/diversion/post/")
    b<FeedItemList> getFakeUserAwemeList(@z(a = "user_id") String str, @z(a = "sec_user_id") String str2, @z(a = "max_cursor") long j2, @z(a = "min_cursor") long j3, @z(a = "count") int i2, @z(a = "adv_id") String str3, @z(a = "item_id") String str4);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f75135a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(46344);
        }
    }
}
