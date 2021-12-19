package com.ss.android.ugc.aweme.dsp.playpage.mainpage;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.dsp.common.arch.a.a;
import com.ss.android.ugc.aweme.dsp.playerservice.b.i;
import com.ss.android.ugc.aweme.dsp.playerservice.c.h;
import com.ss.android.ugc.aweme.dsp.playerservice.e.c;
import com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel;
import f.a.d.f;
import h.f.b.l;
import java.util.List;
import org.greenrobot.eventbus.j;

public final class MainPlayerViewModel extends BasePlayerViewModel implements j {

    /* renamed from: j  reason: collision with root package name */
    public boolean f83712j = true;

    /* renamed from: k  reason: collision with root package name */
    private final int f83713k = 6;

    static {
        Covode.recordClassIndex(52231);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final com.ss.android.ugc.aweme.dsp.playerservice.f.a e() {
        return a.C1960a.a(this.f83687i).f83291b.f83361a;
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void i() {
        if (com.ss.android.ugc.aweme.dsp.playerservice.plugin.a.b.b()) {
            h();
            this.f83680b.setValue(false);
            return;
        }
        c cVar = new c("", new i(null, null, "track_reco", "track_reco", this.f83687i, 3));
        f.a.b.b a2 = cVar.f83538a.b().a(new a(this, cVar), new b(this));
        l.b(a2, "");
        a(a2);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel
    public final void a(String str) {
        l.d(str, "");
        super.a(str);
        e().b(com.ss.android.ugc.aweme.dsp.playerservice.c.c.SEQUENCE);
    }

    @Override // com.ss.android.ugc.aweme.dsp.playpage.base.BasePlayerViewModel, com.ss.android.ugc.aweme.dsp.playerservice.a.q
    public final void b(com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar) {
        l.d(cVar, "");
        super.b(cVar);
        com.ss.android.ugc.aweme.dsp.playerservice.e.b w = e().m();
        if (w != null && w.a(cVar)) {
            f();
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPlayerViewModel f83716a;

        static {
            Covode.recordClassIndex(52233);
        }

        b(MainPlayerViewModel mainPlayerViewModel) {
            this.f83716a = mainPlayerViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ((BasePlayerViewModel) this.f83716a).f83679a.setValue(false);
            this.f83716a.f83680b.setValue(true);
            l.b(th, "");
            com.ss.android.ugc.aweme.dsp.common.b.b.a("MainPlayerViewModel", th);
        }
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MainPlayerViewModel f83714a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f83715b;

        static {
            Covode.recordClassIndex(52232);
        }

        a(MainPlayerViewModel mainPlayerViewModel, c cVar) {
            this.f83714a = mainPlayerViewModel;
            this.f83715b = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.dsp.playerservice.b.c cVar;
            List list = (List) obj;
            l.b(list, "");
            if (!list.isEmpty()) {
                this.f83714a.f83680b.setValue(false);
                MainPlayerViewModel mainPlayerViewModel = this.f83714a;
                mainPlayerViewModel.e().c(this.f83715b);
                com.ss.android.ugc.aweme.dsp.playerservice.b.j a2 = mainPlayerViewModel.e().a((String) null);
                if (a2.f83394a == h.PLAYABLE_LIMITED_UPSELL_RESSO && (cVar = a2.f83395b) != null) {
                    mainPlayerViewModel.e().e(cVar);
                }
            } else {
                this.f83714a.f83680b.setValue(true);
            }
            String.valueOf("MainPlayerViewModel " + (!list.isEmpty()));
        }
    }
}
