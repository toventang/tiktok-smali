package com.ss.android.ugc.aweme.qainvitation.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.e.e;
import com.ss.android.ugc.aweme.qainvitation.e.f;
import h.f.a.b;
import h.z;
import java.util.List;

public interface IQAInvitationService {
    static {
        Covode.recordClassIndex(77378);
    }

    f a();

    List<IMUser> a(List<? extends User> list);

    void a(Activity activity, String str, String str2, long j2, long j3, List<? extends User> list);

    void a(Activity activity, String str, String str2, e eVar, Long l2, Long l3, List<? extends IMUser> list, b<? super List<? extends IMUser>, z> bVar);

    void a(Activity activity, String str, String str2, Long l2, Long l3, List<? extends User> list, Boolean bool);

    List<User> b(List<? extends IMUser> list);

    public static final class a {
        static {
            Covode.recordClassIndex(77379);
        }

        public static /* synthetic */ void a(IQAInvitationService iQAInvitationService, Activity activity, String str, String str2, e eVar, Long l2, Long l3, b bVar, int i2) {
            Long l4 = l2;
            Long l5 = l3;
            b bVar2 = null;
            if ((i2 & 16) != 0) {
                l4 = null;
            }
            if ((i2 & 32) != 0) {
                l5 = null;
            }
            if ((i2 & 128) == 0) {
                bVar2 = bVar;
            }
            iQAInvitationService.a(activity, str, str2, eVar, l4, l5, null, bVar2);
        }
    }
}
