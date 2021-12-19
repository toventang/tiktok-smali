package com.ss.android.ugc.aweme.notificationlive;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.Api;
import f.a.t;
import h.f.b.l;

public final class e implements com.bytedance.assem.arch.a.a<f> {

    /* renamed from: a  reason: collision with root package name */
    public final f f114318a = new a();

    static {
        Covode.recordClassIndex(73507);
    }

    public static final class a implements f {
        static {
            Covode.recordClassIndex(73508);
        }

        a() {
        }

        @Override // com.ss.android.ugc.aweme.notificationlive.f
        public final t<h> a(boolean z, String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            Object a2 = RetrofitFactory.a().a(Api.f66569d).a(NotificationGameApi.class);
            l.b(a2, "");
            return ((NotificationGameApi) a2).changeOptions(z, str, str2);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.a.a
    public final /* bridge */ /* synthetic */ f a() {
        return this.f114318a;
    }
}
