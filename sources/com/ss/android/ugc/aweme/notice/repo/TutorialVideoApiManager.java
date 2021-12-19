package com.ss.android.ugc.aweme.notice.repo;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.b.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class TutorialVideoApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static final TutorialVideoApi f112778a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f112779b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f112780c;

    public interface TutorialVideoApi {
        static {
            Covode.recordClassIndex(72497);
        }

        @f(a = "/tiktok/v1/inbox/top/message/")
        i<TutorialVideoResp> getTutorialVideoAndPoint(@t(a = "msg_id") String str, @t(a = "first_show_time") long j2, @t(a = "current_show_time") long j3, @t(a = "clicked") int i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72498);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static i<TutorialVideoResp> a(String str, long j2, long j3, int i2) {
            l.d(str, "");
            return TutorialVideoApiManager.f112778a.getTutorialVideoAndPoint(str, j2, j3, i2);
        }
    }

    static {
        Covode.recordClassIndex(72496);
        String str = a.C2885a.f112790c;
        f112780c = str;
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(str).create(TutorialVideoApi.class);
        l.b(create, "");
        f112778a = (TutorialVideoApi) create;
    }
}
