package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.z;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface NotificationGameApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114288a = a.f114289a;

    static {
        Covode.recordClassIndex(73483);
    }

    @o(a = "/tiktok/v1/ad/notice/update/")
    @e
    t<h> changeOptions(@c(a = "enable_notice") boolean z, @c(a = "creative_id") String str, @z(a = "log_id") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f114289a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(73484);
        }
    }
}
