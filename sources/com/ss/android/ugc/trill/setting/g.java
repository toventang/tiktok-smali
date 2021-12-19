package com.ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.a.a.b.a;
import com.ss.android.ugc.aweme.net.b;
import com.ss.android.ugc.aweme.net.d;
import com.zhiliaoapp.musically.R;

public final class g extends a<PushSettingActivity> {

    /* renamed from: c  reason: collision with root package name */
    public int f150590c;

    /* renamed from: d  reason: collision with root package name */
    private d<String> f150591d = new d<String>() {
        /* class com.ss.android.ugc.trill.setting.g.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99029);
        }

        @Override // com.ss.android.ugc.aweme.net.d
        public final /* synthetic */ void a() {
            if (g.this.f61889a != null) {
                int i2 = g.this.f150590c;
                if (i2 == 1) {
                    g.this.f61889a.c();
                } else if (i2 == 2) {
                    g.this.f61889a.b();
                } else if (i2 == 3) {
                    g.this.f61889a.d();
                }
            }
        }

        @Override // com.ss.android.ugc.aweme.net.d
        public final void a(Exception exc) {
            com.ss.android.ugc.aweme.app.api.b.a.a(com.bytedance.ies.ugc.appcontext.d.a(), (Throwable) exc, (int) R.string.g4j);
        }
    };

    static {
        Covode.recordClassIndex(99028);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (i2 == R.id.c_u) {
            this.f150590c = 2;
        } else if (i2 == R.id.b7t) {
            this.f150590c = 1;
        } else if (i2 == R.id.a_o) {
            this.f150590c = 3;
        }
        if (this.f61889a != null) {
            b<String> a2 = com.ss.android.ugc.trill.setting.a.a.a(this.f150590c, z ? 1 : 0);
            a2.f112221a = (d<T>) this.f150591d;
            a2.a(com.bytedance.ies.ugc.appcontext.d.a());
        }
    }
}
