package com.ss.android.ugc.aweme.compliance.common.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.z;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.u;
import com.ss.android.ugc.aweme.services.RetrofitService;
import f.a.t;
import h.f.b.l;
import l.b.f;
import l.b.o;

public interface ComplianceApi {

    /* renamed from: a */
    public static final a f77285a = a.f77286a;

    public static final class b {
        static {
            Covode.recordClassIndex(47801);
        }
    }

    static {
        Covode.recordClassIndex(47799);
    }

    @f(a = "/aweme/v1/algo/free/settings/")
    t<AlgoFreeSettings> getAlgoFreeSettings();

    @f(a = "/aweme/v1/compliance/settings/")
    t<ComplianceSetting> getComplianceSetting(@z(a = "teen_mode_status") int i2, @z(a = "ftc_child_mode") int i3);

    @f(a = "/tiktok/v1/ultimate/cmpl/settings/")
    t<u> getUltimateComplianceSettings();

    @o(a = "/aweme/v1/cmpl/set/settings/")
    t<CmplRespForEncrypt> setComplianceSettings(@z(a = "settings") String str);

    @f(a = "/aweme/v1/user/set/settings/")
    t<BaseResponse> setUserSetting(@z(a = "field") String str, @z(a = "value") int i2);

    @f(a = "/aweme/v1/user/set/settings/")
    t<BaseResponse> setVPAContentChoice(@z(a = "field") String str, @z(a = "vpa_content_choice") int i2);

    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f77286a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(47800);
        }

        public static ComplianceApi a() {
            Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(ComplianceApi.class);
            l.b(create, "");
            return (ComplianceApi) create;
        }
    }
}
