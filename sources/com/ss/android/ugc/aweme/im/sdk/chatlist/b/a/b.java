package com.ss.android.ugc.aweme.im.sdk.chatlist.b.a;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f101874a = new b();

    @Override // com.ss.android.ugc.aweme.im.service.k.a, com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.d
    public final String bF_() {
        return "empty_session_id_for_session_list";
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final int c() {
        return 99;
    }

    public static final class a implements com.ss.android.ugc.aweme.im.service.k.b {
        static {
            Covode.recordClassIndex(65171);
        }

        @Override // com.ss.android.ugc.aweme.im.service.k.b
        public final void a(e eVar, com.ss.android.ugc.aweme.im.service.k.a aVar, int i2) {
            l.d(eVar, "");
            l.d(aVar, "");
        }

        a() {
        }
    }

    private b() {
    }

    @Override // com.ss.android.ugc.aweme.im.service.k.a
    public final com.ss.android.ugc.aweme.im.service.k.b b() {
        return new a();
    }

    static {
        Covode.recordClassIndex(65170);
    }
}
