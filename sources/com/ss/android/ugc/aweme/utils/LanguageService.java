package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.i18n.language.a;
import com.ss.android.ugc.b;

public final class LanguageService implements LanguageProvider {
    static {
        Covode.recordClassIndex(93251);
    }

    public static LanguageProvider a() {
        MethodCollector.i(7316);
        Object a2 = b.a(LanguageProvider.class, false);
        if (a2 != null) {
            LanguageProvider languageProvider = (LanguageProvider) a2;
            MethodCollector.o(7316);
            return languageProvider;
        }
        if (b.ez == null) {
            synchronized (LanguageProvider.class) {
                try {
                    if (b.ez == null) {
                        b.ez = new LanguageService();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7316);
                    throw th;
                }
            }
        }
        LanguageService languageService = (LanguageService) b.ez;
        MethodCollector.o(7316);
        return languageService;
    }

    @Override // com.ss.android.ugc.aweme.utils.LanguageProvider
    public final void a(Activity activity) {
        a.a(activity);
    }
}
