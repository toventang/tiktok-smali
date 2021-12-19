package com.ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import f.a.t;
import l.b.c;
import l.b.e;
import l.b.o;

public interface TranslationLanguageApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f150543a = a.f150544a;

    static {
        Covode.recordClassIndex(98999);
    }

    @o(a = "/aweme/v1/user/set/settings/")
    @e
    t<BaseResponse> setTranslationLanguage(@c(a = "field") String str, @c(a = "value") String str2);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f150544a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(99000);
        }
    }
}
