package com.ss.android.ugc.aweme.commercialize.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.commercialize.model.t;
import com.ss.android.ugc.aweme.services.RetrofitService;
import h.f.b.m;
import h.h;
import h.i;
import l.b.f;

public final class CommerceSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static t f73696a;

    /* renamed from: b  reason: collision with root package name */
    public static final CommerceSettingsApi f73697b = new CommerceSettingsApi();

    /* renamed from: c  reason: collision with root package name */
    private static final h f73698c = i.a((h.f.a.a) a.f73699a);

    interface IApi {
        static {
            Covode.recordClassIndex(45342);
        }

        @f(a = "/aweme/v1/commerce/settings")
        q<t> getSettings();
    }

    private CommerceSettingsApi() {
    }

    static final class a extends m implements h.f.a.a<IApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f73699a = new a();

        static {
            Covode.recordClassIndex(45343);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ IApi invoke() {
            return RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(IApi.class);
        }
    }

    static {
        Covode.recordClassIndex(45341);
    }
}
