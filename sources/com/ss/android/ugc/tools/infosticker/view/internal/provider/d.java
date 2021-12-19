package com.ss.android.ugc.tools.infosticker.view.internal.provider;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.c.b;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import h.f.b.l;
import h.z;

public final class d extends f<ProviderEffect> {
    static {
        Covode.recordClassIndex(98699);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.f
    public final /* synthetic */ void a(ProviderEffect providerEffect) {
        String url;
        ProviderEffect providerEffect2 = providerEffect;
        l.d(providerEffect2, "");
        ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
            a aVar = (a) this.f149601g.getImageView().getHierarchy();
            l.b(aVar, "");
            aVar.a(q.b.f47438d);
            b.a(this.f149601g.getImageView(), url, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, com.ss.android.ugc.tools.view.widget.c.b bVar, h.f.a.q<? super com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, ? super Integer, ? super c, z> qVar) {
        super(view, bVar, qVar);
        l.d(view, "");
        l.d(bVar, "");
        l.d(qVar, "");
    }
}
