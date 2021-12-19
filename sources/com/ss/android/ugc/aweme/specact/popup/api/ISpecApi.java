package com.ss.android.ugc.aweme.specact.popup.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import com.google.c.h.a.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import h.f.b.l;

public interface ISpecApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134496a = a.f134497a;

    static {
        Covode.recordClassIndex(87897);
    }

    @t(a = "/luckycat/tiktokm/v1/task/done/{task_id}")
    q<com.ss.android.ugc.aweme.specact.pendant.b.a> getTaskAwardByTaskId(@x(a = "task_id") String str, @z(a = "task_time") int i2);

    @h(a = "/luckycat/tiktokm/v1/task/page")
    q<k> getTaskInfo(@z(a = "component") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f134497a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(87898);
        }

        public static ISpecApi a() {
            LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
            l.b(localTestApi, "");
            Object a2 = RetrofitFactory.a().a(localTestApi.getResFakerService().a().getString("spce_api_force_use_host", Api.f66569d)).a(ISpecApi.class);
            l.b(a2, "");
            return (ISpecApi) a2;
        }
    }
}
