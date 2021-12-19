package com.ss.android.ugc.aweme.setting.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b.h;
import com.ss.android.c.b;
import f.a.t;

public interface DoBStatusApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122047a = a.f122048a;

    static {
        Covode.recordClassIndex(80011);
    }

    @h(a = "/tiktok/v1/edibility/birthdate/")
    t<com.ss.android.ugc.aweme.setting.model.h> getDoBStatus();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122048a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final DoBStatusApi f122049b = ((DoBStatusApi) RetrofitFactory.a().b(b.f59141e).d().a(DoBStatusApi.class));

        private a() {
        }

        public static t<com.ss.android.ugc.aweme.setting.model.h> a() {
            return f122049b.getDoBStatus();
        }

        static {
            Covode.recordClassIndex(80012);
        }
    }
}
