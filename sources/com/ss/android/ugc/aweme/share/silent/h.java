package com.ss.android.ugc.aweme.share.silent;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bg;
import com.ss.android.ugc.aweme.share.a;

public final class h implements bg {
    static {
        Covode.recordClassIndex(81644);
    }

    private bg.a a(final b bVar) {
        return new bg.a() {
            /* class com.ss.android.ugc.aweme.share.silent.h.AnonymousClass1 */

            static {
                Covode.recordClassIndex(81645);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final View c() {
                return bVar;
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final String a() {
                return bVar.c();
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final int b() {
                return bVar.getSaveUploadType();
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void d() {
                bVar.setSaveLocalEnabled(false);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void a(int i2) {
                bVar.a(i2);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void a(Fragment fragment) {
                bVar.f124328h = fragment;
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void a(bg.b bVar) {
                b bVar2 = bVar;
                bVar.getClass();
                bVar2.a(new i(bVar));
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void a(String str) {
                bVar.setSyncShareViewTitle(str);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bg.a
            public final void a(boolean z) {
                bVar.a(z);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.port.in.bg
    public final bg.a a(e eVar) {
        b jVar;
        if (a.C3192a.a()) {
            jVar = new s(eVar);
        } else {
            jVar = new j(eVar);
        }
        return a(jVar);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bg
    public final bg.a b(e eVar) {
        b fVar;
        if (a.C3192a.a()) {
            fVar = new g(eVar);
        } else {
            fVar = new f(eVar);
        }
        return a(fVar);
    }
}
