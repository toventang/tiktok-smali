package com.ss.android.ugc.tools.infosticker.view.internal.main1;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.am;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.a.a.j;
import com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import f.a.d.g;
import f.a.t;
import h.f.b.l;

public final class InfoStickerStateNewViewModel extends BaseInfoStickerStateViewModel<InfoStickerEffect> implements au {

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.tools.infosticker.a.a.a f149859d;

    static {
        Covode.recordClassIndex(98661);
    }

    @Override // com.ss.android.ugc.tools.view.base.HumbleViewModel, com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* Return type fixed from 'f.a.t' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.BaseInfoStickerStateViewModel
    public final /* synthetic */ t<am<InfoStickerEffect, c, Integer>> b(InfoStickerEffect infoStickerEffect) {
        l.d(infoStickerEffect, "");
        t<R> d2 = this.f149859d.a().d(a.f149860a);
        l.b(d2, "");
        return d2;
    }

    static final class a<T, R> implements g<j, am<InfoStickerEffect, c, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f149860a = new a();

        static {
            Covode.recordClassIndex(98662);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.g
        public final /* synthetic */ am<InfoStickerEffect, c, Integer> apply(j jVar) {
            c cVar;
            j jVar2 = jVar;
            l.d(jVar2, "");
            InfoStickerEffect infoStickerEffect = jVar2.f149365a;
            int i2 = c.f149864a[jVar2.f149366b.f149381a.ordinal()];
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
            return new am(infoStickerEffect, cVar, jVar2.f149367c);
        }
    }
}
