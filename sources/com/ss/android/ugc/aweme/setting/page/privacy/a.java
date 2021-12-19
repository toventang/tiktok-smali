package com.ss.android.ugc.aweme.setting.page.privacy;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.ui.bv;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final com.ss.android.ugc.aweme.setting.serverpush.a f122527a = new C3178a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f122528b = new a();

    /* renamed from: com.ss.android.ugc.aweme.setting.page.privacy.a$a  reason: collision with other inner class name */
    public static final class C3178a implements com.ss.android.ugc.aweme.setting.serverpush.a {
        static {
            Covode.recordClassIndex(80370);
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(Exception exc) {
            l.d(exc, "");
        }

        C3178a() {
        }

        @Override // com.ss.android.ugc.aweme.setting.serverpush.a
        public final void a(f fVar) {
            l.d(fVar, "");
            s sVar = s.a.f66880a;
            l.b(sVar, "");
            aj<Integer> c2 = sVar.c();
            l.b(c2, "");
            c2.b(Integer.valueOf(fVar.J));
            c.a(new bv());
        }
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(80369);
    }
}
