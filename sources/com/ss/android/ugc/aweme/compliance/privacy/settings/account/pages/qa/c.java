package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import f.a.d.f;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final QAProfileEntranceApi f77761a = ((QAProfileEntranceApi) RetrofitFactory.a().a(com.ss.android.ugc.aweme.compliance.common.a.a.f77273a).a(QAProfileEntranceApi.class));

    /* renamed from: b  reason: collision with root package name */
    public static final c f77762b = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(48159);
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77763a = new a();

        static {
            Covode.recordClassIndex(48160);
        }

        a() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/user/proaccount/edit/", 0);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77764a = new b();

        static {
            Covode.recordClassIndex(48161);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.b(th, "");
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/user/proaccount/edit/", com.ss.android.ugc.aweme.compliance.privacy.utils.a.a(th), com.ss.android.ugc.aweme.compliance.privacy.utils.a.b(th));
        }
    }
}
