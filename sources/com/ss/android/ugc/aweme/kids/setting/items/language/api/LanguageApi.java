package com.ss.android.ugc.aweme.kids.setting.items.language.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.ss.android.ugc.aweme.kids.setting.items.language.c.c;

public interface LanguageApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f107048a = a.f107049a;

    static {
        Covode.recordClassIndex(68469);
    }

    @t(a = "/tiktok/v1/kids/edit/user/")
    @g
    f.a.t<c> editLanguageConfig(@e(a = "language_change") String str);

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f107049a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(68470);
        }
    }
}
