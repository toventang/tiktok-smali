package com.ss.android.ugc.aweme.setting.api;

import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.google.gson.o;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.m;

public interface ABApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f122035a = a.f122036a;

    static {
        Covode.recordClassIndex(80000);
    }

    @h(a = "/aweme/v1/abtest/param/")
    i<o> querySettings();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f122036a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h.h f122037b = h.i.a((h.f.a.a) C3155a.f122038a);

        public static ABApi a() {
            return (ABApi) f122037b.getValue();
        }

        private a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.setting.api.ABApi$a$a  reason: collision with other inner class name */
        static final class C3155a extends m implements h.f.a.a<ABApi> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3155a f122038a = new C3155a();

            static {
                Covode.recordClassIndex(80002);
            }

            C3155a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ ABApi invoke() {
                return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(ABApi.class);
            }
        }

        static {
            Covode.recordClassIndex(80001);
        }
    }
}
