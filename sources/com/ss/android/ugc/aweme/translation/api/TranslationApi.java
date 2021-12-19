package com.ss.android.ugc.aweme.translation.api;

import com.bytedance.covode.number.Covode;
import com.google.c.h.a.q;
import com.ss.android.c.b;
import com.ss.android.ugc.aweme.translation.a.a;
import java.util.concurrent.ExecutionException;
import l.b.c;
import l.b.e;
import l.b.f;
import l.b.o;
import l.b.t;

public final class TranslationApi {

    public interface RealApi {
        static {
            Covode.recordClassIndex(92061);
        }

        @o(a = "/aweme/v1/contents/translation/")
        @e
        q<a> getMultiTranslation(@c(a = "trg_lang") String str, @c(a = "translation_info") String str2, @t(a = "scene") int i2);

        @f(a = "/aweme/v1/content/translation/")
        q<com.ss.android.ugc.aweme.translation.a.c> getTranslation(@t(a = "content") String str, @t(a = "src_lang") String str2, @t(a = "trg_lang") String str3, @t(a = "group_id") String str4, @t(a = "scene") int i2);
    }

    static {
        Covode.recordClassIndex(92060);
    }

    private static RealApi a() {
        return (RealApi) com.bytedance.ies.ugc.aweme.network.ext.a.a(b.f59141e, RealApi.class);
    }

    public static q<a> a(String str, String str2, int i2) {
        return a().getMultiTranslation(str, str2, i2);
    }

    public static com.ss.android.ugc.aweme.translation.a.c a(String str, String str2, String str3, String str4, int i2) {
        try {
            return a().getTranslation(str, str2, str3, str4, i2).get();
        } catch (ExecutionException e2) {
            throw com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2);
        }
    }
}
