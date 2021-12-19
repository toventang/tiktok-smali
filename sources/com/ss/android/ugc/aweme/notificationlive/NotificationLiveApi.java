package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface NotificationLiveApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114295a = a.f114296a;

    static {
        Covode.recordClassIndex(73491);
    }

    @o(a = "/webcast/user/relation/live_push_status/update/")
    @e
    t<w> changeOptions(@c(a = "push_status") int i2, @c(a = "sec_to_user_id") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f114296a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(73492);
        }
    }
}
