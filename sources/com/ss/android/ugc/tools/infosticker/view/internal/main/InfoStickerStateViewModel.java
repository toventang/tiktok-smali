package com.ss.android.ugc.tools.infosticker.view.internal.main;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.a.a.d;
import com.ss.android.ugc.tools.infosticker.a.a.h;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class InfoStickerStateViewModel extends BaseInfoStickerStateViewModel<Effect> implements au {

    /* renamed from: d  reason: collision with root package name */
    private final d f149653d;

    static {
        Covode.recordClassIndex(98544);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final /* synthetic */ t<am<Effect, c, Integer>> b(Effect effect) {
        Effect effect2 = effect;
        l.d(effect2, "");
        t d2 = this.f149653d.a(effect2, true).d(a.f149654a);
        l.b(d2, "");
        return d2;
    }

    static final class a<T, R> implements g<h, am<Effect, c, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149654a = new a();

        static {
            Covode.recordClassIndex(98545);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ am<Effect, c, Integer> apply(h hVar) {
            c cVar;
            h hVar2 = hVar;
            l.d(hVar2, "");
            Effect effect = hVar2.f149357a;
            int i2 = i.f149728a[hVar2.f149358b.f149380a.ordinal()];
            if (i2 == 1) {
                cVar = c.UNKNOWN;
            } else if (i2 == 2) {
                cVar = c.DOWNLOADING;
            } else if (i2 == 3) {
                cVar = c.NOT_DOWNLOAD;
            } else if (i2 == 4) {
                cVar = c.DOWNLOAD_SUCCESS;
            } else if (i2 != 5) {
                cVar = c.UNKNOWN;
            } else {
                cVar = c.DOWNLOAD_FAILED;
            }
            return new am(effect, cVar, hVar2.f149359c);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InfoStickerStateViewModel(m mVar, d dVar) {
        super(mVar);
        l.d(mVar, "");
        l.d(dVar, "");
        this.f149653d = dVar;
    }
}
