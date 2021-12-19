package com.ss.android.ugc.aweme.setting.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.setting.bn;
import com.ss.android.ugc.aweme.setting.y;
import com.ss.android.ugc.aweme.setting.z;
import com.ss.android.ugc.aweme.utils.is;
import com.ss.android.ugc.b;
import h.a.am;
import h.f.b.l;
import java.util.HashSet;
import java.util.Set;

public final class VideoGiftService implements IVideoGiftService {
    static {
        Covode.recordClassIndex(80514);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final String a() {
        y a2 = z.a();
        if (a2 != null) {
            return a2.f123069a;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final String b() {
        bn bnVar;
        y a2 = z.a();
        if (a2 == null || (bnVar = a2.f123071c) == null) {
            return null;
        }
        return bnVar.f122096a;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean d() {
        if (is.b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(is.a("vgv_first_gift_sent"), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void e() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(is.a("vgv_first_gift_sent"), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean f() {
        if (is.b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(is.a("vgv_promotion_dialog_has_shown"), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void g() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(is.a("vgv_promotion_dialog_has_shown"), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean h() {
        if (is.b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(is.a("vgv_promotion_tooltip_has_shown"), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void i() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(is.a("vgv_promotion_tooltip_has_shown"), true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean j() {
        if (is.b()) {
            return true;
        }
        return Keva.getRepo("video_gift_settings_keva_repo").getBoolean(is.a(is.f143111a), false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void k() {
        Keva.getRepo("video_gift_settings_keva_repo").storeBoolean(is.a(is.f143111a), true);
    }

    public static IVideoGiftService l() {
        MethodCollector.i(8061);
        Object a2 = b.a(IVideoGiftService.class, false);
        if (a2 != null) {
            IVideoGiftService iVideoGiftService = (IVideoGiftService) a2;
            MethodCollector.o(8061);
            return iVideoGiftService;
        }
        if (b.dR == null) {
            synchronized (IVideoGiftService.class) {
                try {
                    if (b.dR == null) {
                        b.dR = new VideoGiftService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8061);
                    throw th;
                }
            }
        }
        VideoGiftService videoGiftService = (VideoGiftService) b.dR;
        MethodCollector.o(8061);
        return videoGiftService;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final Set<String> c() {
        if (is.b()) {
            return am.a((Object[]) new String[]{"1", "2", "3"});
        }
        Set<String> stringSet = Keva.getRepo("video_gift_settings_keva_repo").getStringSet(is.a("vgv_video_strip_visibility_counter"), new HashSet());
        l.b(stringSet, "");
        return stringSet;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void a(boolean z) {
        is.a(z);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final void a(Set<String> set) {
        l.d(set, "");
        l.d(set, "");
        Keva.getRepo("video_gift_settings_keva_repo").storeStringSet(is.a("vgv_video_strip_visibility_counter"), set);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IVideoGiftService
    public final boolean a(Aweme aweme) {
        y a2 = z.a();
        if (a2 != null && a2.f123070b) {
            return true;
        }
        if (aweme != null) {
            return aweme.getAllowGift();
        }
        return false;
    }
}
