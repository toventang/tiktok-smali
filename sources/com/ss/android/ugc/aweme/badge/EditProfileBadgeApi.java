package com.ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import f.a.ab;
import h.f.b.l;
import l.b.f;
import l.b.t;

public final class EditProfileBadgeApi {

    /* renamed from: a  reason: collision with root package name */
    public static Api f67878a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f67879b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final String f67880c = "https://api-va.tiktokv.com";

    interface Api {
        static {
            Covode.recordClassIndex(41780);
        }

        @f(a = "/tiktok/v1/user/profile/self/badges/")
        ab<i> getProfileBadgeList(@t(a = "app_language") String str, @t(a = "region") String str2, @t(a = "locale") String str3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41781);
        }

        private a() {
        }

        public static ab<i> a() {
            Api api = EditProfileBadgeApi.f67878a;
            IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
            l.b(createIAVSettingServicebyMonsterPlugin, "");
            String appLanguage = createIAVSettingServicebyMonsterPlugin.getAppLanguage();
            l.b(appLanguage, "");
            IAVSettingService createIAVSettingServicebyMonsterPlugin2 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
            l.b(createIAVSettingServicebyMonsterPlugin2, "");
            String appLogRegion = createIAVSettingServicebyMonsterPlugin2.getAppLogRegion();
            l.b(appLogRegion, "");
            String b2 = com.ss.android.ugc.aweme.i18n.language.a.b();
            l.b(b2, "");
            return api.getProfileBadgeList(appLanguage, appLogRegion, b2);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(41779);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        f67878a = (Api) createIAVServiceProxybyMonsterPlugin.getNetworkService().createRetrofit("https://api-va.tiktokv.com", false, Api.class);
    }
}
