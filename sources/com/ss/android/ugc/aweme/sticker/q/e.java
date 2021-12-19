package com.ss.android.ugc.aweme.sticker.q;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.presenter.d;
import com.ss.android.medialib.presenter.g;
import com.ss.android.ugc.aweme.sticker.presenter.handler.o;
import h.f.b.l;

public final class e implements o {

    /* renamed from: a  reason: collision with root package name */
    private final com.ss.android.ugc.asve.recorder.effect.a f135444a;

    static {
        Covode.recordClassIndex(88486);
    }

    static final class a implements g.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o.a f135445a;

        static {
            Covode.recordClassIndex(88487);
        }

        a(o.a aVar) {
            this.f135445a = aVar;
        }

        @Override // com.ss.android.medialib.presenter.d.a
        public final void a() {
            this.f135445a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.o
    public final void a() {
        d c2 = this.f135444a.c();
        if (c2 != null) {
            c2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.o
    public final void b() {
        d c2 = this.f135444a.c();
        if (c2 != null) {
            c2.b();
        }
    }

    public e(com.ss.android.ugc.asve.recorder.effect.a aVar) {
        l.d(aVar, "");
        this.f135444a = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.o
    public final void a(o.a aVar) {
        a aVar2;
        d c2 = this.f135444a.c();
        if (c2 != null) {
            if (aVar != null) {
                aVar2 = new a(aVar);
            } else {
                aVar2 = null;
            }
            c2.a(aVar2);
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.o
    public final void a(boolean z) {
        d c2 = this.f135444a.c();
        if (c2 != null) {
            c2.a(z);
        }
    }
}
