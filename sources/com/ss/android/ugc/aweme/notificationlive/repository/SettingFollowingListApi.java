package com.ss.android.ugc.aweme.notificationlive.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.following.a.c;
import f.a.t;
import l.b.f;

public interface SettingFollowingListApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114358a = a.f114359a;

    static {
        Covode.recordClassIndex(73549);
    }

    @f(a = "/aweme/v1/user/following/list/")
    t<c> queryFollowingList(@l.b.t(a = "user_id") String str, @l.b.t(a = "sec_user_id") String str2, @l.b.t(a = "count") int i2, @l.b.t(a = "offset") int i3, @l.b.t(a = "source_type") int i4);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f114359a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(73550);
        }
    }
}
