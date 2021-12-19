package com.ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.a;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.dg.b;
import com.ss.android.ugc.aweme.global.config.settings.c;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.AwemeFEConfigs;
import com.ss.android.ugc.aweme.global.config.settings.pojo.GeckoConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.PublishSyncDuoshanAllConfig;
import com.ss.android.ugc.aweme.global.config.settings.pojo.PushPrePermissionView;
import com.ss.android.ugc.aweme.global.config.settings.pojo.ShowCreatorLicense;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static volatile d f122318a;

    static {
        Covode.recordClassIndex(80208);
    }

    public static AdLandingPageConfig f() {
        try {
            return c.f99077a.f99078b.getAdLandingPageConfig();
        } catch (a unused) {
            return null;
        }
    }

    public static Object g() {
        try {
            return SettingsManager.a().a("download_sdk_config", Object.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean q() {
        return SettingsManager.a().a("enable_twitter_new_key_secret", false);
    }

    public static q c() {
        try {
            return (q) SettingsManager.a().a("share_url_whitelist", q.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.ss.android.ugc.aweme.story.h.b.a.a d() {
        try {
            return (com.ss.android.ugc.aweme.story.h.b.a.a) SettingsManager.a().a("story_publish_sync_duoshan", PublishSyncDuoshanAllConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AwemeFEConfigs e() {
        try {
            return (AwemeFEConfigs) SettingsManager.a().a("aweme_fe_conf", AwemeFEConfigs.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<UrlModel> h() {
        try {
            UrlModel[] urlModelArr = (UrlModel[]) SettingsManager.a().a("default_cover_urls", com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel[].class);
            if (urlModelArr != null) {
                return Arrays.asList(urlModelArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<UrlModel> i() {
        try {
            UrlModel[] urlModelArr = (UrlModel[]) SettingsManager.a().a("white_cover_urls", com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel.class);
            if (urlModelArr != null) {
                return Arrays.asList(urlModelArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String j() {
        String[] strArr;
        try {
            strArr = (String[]) SettingsManager.a().a("search_tab", String[].class);
        } catch (Throwable unused) {
            strArr = null;
        }
        return new f().b(strArr);
    }

    public static ShowCreatorLicense k() {
        try {
            return (ShowCreatorLicense) SettingsManager.a().a("show_creator_license_230", ShowCreatorLicense.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static PushPrePermissionView l() {
        try {
            return (PushPrePermissionView) SettingsManager.a().a("push_pre_permission_view", PushPrePermissionView.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static GeckoConfig m() {
        try {
            return (GeckoConfig) SettingsManager.a().a("aweme_gecko_conf", GeckoConfig.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> n() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("aweme_gecko_offline_host_prefix", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> r() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("covid_19_ids", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static b s() {
        try {
            return (b) SettingsManager.a().a("wallet_conf", b.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static com.ss.android.ugc.aweme.setting.f.b t() {
        try {
            return (com.ss.android.ugc.aweme.setting.f.b) SettingsManager.a().a("hateful", com.ss.android.ugc.aweme.setting.f.b.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> u() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("aweme_ad_link_priority", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static d a() {
        MethodCollector.i(1473);
        if (f122318a == null) {
            synchronized (d.class) {
                try {
                    if (f122318a == null) {
                        f122318a = new d();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1473);
                    throw th;
                }
            }
        }
        d dVar = f122318a;
        MethodCollector.o(1473);
        return dVar;
    }

    public static List<String> b() {
        try {
            String[] strArr = (String[]) SettingsManager.a().a("share_h5_url_whitelist", String[].class);
            if (strArr != null) {
                return Arrays.asList(strArr);
            }
            return Arrays.asList("tiktokcdn.com", "tiktokv.com", "tiktok.com");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Integer> o() {
        try {
            int[] iArr = (int[]) SettingsManager.a().a("self_profile_landing_tabs", int[].class);
            if (iArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(iArr.length);
            try {
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static List<Integer> p() {
        try {
            int[] iArr = (int[]) SettingsManager.a().a("other_profile_landing_tabs", int[].class);
            if (iArr == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(iArr.length);
            try {
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
