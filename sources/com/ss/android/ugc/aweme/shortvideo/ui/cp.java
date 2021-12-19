package com.ss.android.ugc.aweme.shortvideo.ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.shortvideo.publish.i;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cp implements bg.b {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131642a;

    static {
        Covode.recordClassIndex(86208);
    }

    cp(cj cjVar) {
        this.f131642a = cjVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.bg.b
    public final boolean a(View view) {
        cj cjVar = this.f131642a;
        if (cjVar.H.f129529a.b() == 1) {
            cjVar.H.f129529a.a(false);
        } else {
            cjVar.a(new i.b() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass14 */

                static {
                    Covode.recordClassIndex(86191);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                public final void b() {
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                public final void a() {
                    cj.this.H.f129529a.a(true);
                }
            });
        }
        return false;
    }
}
