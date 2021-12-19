package com.ss.android.ugc.aweme.commercialize.live.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.commercialize.live.a.c;

public interface LiveAdCardApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74543a = a.f74545b;

    static {
        Covode.recordClassIndex(45967);
    }

    @h(a = "/tiktok/v1/ad/live/component/detail/")
    b<c> getLiveAdCardInfo(@z(a = "room_id") String str, @z(a = "author_id") String str2, @z(a = "sec_author_id") String str3);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final String f74544a = ("https://" + d.f34604k.f34586a);

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f74545b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(45968);
        }
    }
}
