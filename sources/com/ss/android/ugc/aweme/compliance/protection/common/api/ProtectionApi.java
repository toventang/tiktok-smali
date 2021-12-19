package com.ss.android.ugc.aweme.compliance.protection.common.api;

import com.bytedance.covode.number.Covode;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.compliance.protection.common.a.d;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import l.b.f;

public interface ProtectionApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77956a = a.f77958b;

    static {
        Covode.recordClassIndex(48321);
    }

    @f(a = "/tiktok/v1/compliance/guadig/settings/")
    t<d> getProtectionSettings();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final ProtectionApi f77957a = ((ProtectionApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(b.f59141e).create(ProtectionApi.class));

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f77958b = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(48322);
        }
    }
}
