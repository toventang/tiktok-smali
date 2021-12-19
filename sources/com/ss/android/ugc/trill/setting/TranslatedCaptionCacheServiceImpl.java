package com.ss.android.ugc.trill.setting;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.ss.android.ugc.b;
import h.a.am;
import h.f.b.l;
import java.util.HashSet;
import java.util.Set;

public final class TranslatedCaptionCacheServiceImpl implements ITranslatedCaptionService {
    static {
        Covode.recordClassIndex(98998);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean d() {
        return c.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean b() {
        return i.f150594a.getBoolean("hide_caption", false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final String c() {
        String string = i.f150594a.getString("show_original_caption_video_id", "");
        l.b(string, "");
        return string;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean e() {
        if (!i.b() || !c.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final String f() {
        if (TextUtils.equals(i.c(), "3")) {
            return "3";
        }
        return "2";
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean h() {
        return i.f150594a.getBoolean("translate_onboard", false);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final void i() {
        i.f150594a.storeBoolean("translate_onboard", true);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean a() {
        return i.a();
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean g() {
        Set<String> stringSet = i.f150594a.getStringSet("non_onboarded_user_edit_translations_exposure_videos", new HashSet());
        l.b(stringSet, "");
        if (stringSet.size() < 5) {
            return true;
        }
        return false;
    }

    public static ITranslatedCaptionService j() {
        MethodCollector.i(6678);
        Object a2 = b.a(ITranslatedCaptionService.class, false);
        if (a2 != null) {
            ITranslatedCaptionService iTranslatedCaptionService = (ITranslatedCaptionService) a2;
            MethodCollector.o(6678);
            return iTranslatedCaptionService;
        }
        if (b.eL == null) {
            synchronized (ITranslatedCaptionService.class) {
                try {
                    if (b.eL == null) {
                        b.eL = new TranslatedCaptionCacheServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6678);
                    throw th;
                }
            }
        }
        TranslatedCaptionCacheServiceImpl translatedCaptionCacheServiceImpl = (TranslatedCaptionCacheServiceImpl) b.eL;
        MethodCollector.o(6678);
        return translatedCaptionCacheServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final void a(boolean z) {
        i.f150594a.storeBoolean("hide_caption", z);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final void a(String str) {
        l.d(str, "");
        l.d(str, "");
        i.f150594a.storeString("show_original_caption_video_id", str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final boolean d(String str) {
        l.d(str, "");
        l.d(str, "");
        return i.f150595b.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final void c(String str) {
        l.d(str, "");
        l.d(str, "");
        i.f150595b.add(str);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService
    public final void b(String str) {
        l.d(str, "");
        l.d(str, "");
        Set<String> stringSet = i.f150594a.getStringSet("non_onboarded_user_edit_translations_exposure_videos", new HashSet());
        if (stringSet != null) {
            stringSet.add(str);
        } else {
            stringSet = am.a(str);
        }
        i.f150594a.storeStringSet("non_onboarded_user_edit_translations_exposure_videos", stringSet);
    }
}
