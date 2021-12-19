package com.ss.android.ugc.trill.setting;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import f.a.d.f;
import h.f.b.l;
import java.util.ArrayList;

public final class TranslationLanguageViewModel extends ac {

    /* renamed from: d  reason: collision with root package name */
    public static final a f150555d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    t<ArrayList<com.ss.android.ugc.aweme.i18n.language.b>> f150556a;

    /* renamed from: b  reason: collision with root package name */
    int f150557b = -1;

    /* renamed from: c  reason: collision with root package name */
    final TranslationLanguageApi f150558c;

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f150559a = new b();

        static {
            Covode.recordClassIndex(99005);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f150560a = new c();

        static {
            Covode.recordClassIndex(99006);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(99003);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(99004);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public TranslationLanguageViewModel() {
        Object a2 = RetrofitFactory.a().b(Api.f66569d).d().a(TranslationLanguageApi.class);
        l.b(a2, "");
        this.f150558c = (TranslationLanguageApi) a2;
    }
}
