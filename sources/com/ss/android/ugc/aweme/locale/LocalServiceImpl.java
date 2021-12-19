package com.ss.android.ugc.aweme.locale;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.i18n.language.i18n.c;
import com.ss.android.ugc.b;

public class LocalServiceImpl implements ILocalService {
    static {
        Covode.recordClassIndex(69794);
    }

    public static ILocalService a() {
        MethodCollector.i(2662);
        Object a2 = b.a(ILocalService.class, false);
        if (a2 != null) {
            ILocalService iLocalService = (ILocalService) a2;
            MethodCollector.o(2662);
            return iLocalService;
        }
        if (b.cu == null) {
            synchronized (ILocalService.class) {
                try {
                    if (b.cu == null) {
                        b.cu = new LocalServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2662);
                    throw th;
                }
            }
        }
        LocalServiceImpl localServiceImpl = (LocalServiceImpl) b.cu;
        MethodCollector.o(2662);
        return localServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.locale.ILocalService
    public final String a(Context context) {
        String language = c.a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }
}
