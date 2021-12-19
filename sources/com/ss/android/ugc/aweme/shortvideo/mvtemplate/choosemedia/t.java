package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.tools.c.b;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.android.ugc.tools.utils.r;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import h.f.a.q;
import h.f.b.l;
import h.z;

public final class t extends f<ProviderEffect> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f129188c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f129189a;

    /* renamed from: b  reason: collision with root package name */
    public final int f129190b;

    static {
        Covode.recordClassIndex(84805);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84806);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.f
    public final /* synthetic */ void a(ProviderEffect providerEffect) {
        String url;
        ProviderEffect providerEffect2 = providerEffect;
        l.d(providerEffect2, "");
        ProviderEffect.StickerBean sticker_info = providerEffect2.getSticker_info();
        if (sticker_info != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
            b.a(this.f149601g.getImageView(), url, Bitmap.Config.ARGB_8888);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(View view, com.ss.android.ugc.tools.view.widget.c.b bVar, q<? super com.ss.android.ugc.effectmanager.effect.model.ProviderEffect, ? super Integer, ? super c, z> qVar) {
        super(view, bVar, qVar);
        l.d(view, "");
        l.d(bVar, "");
        l.d(qVar, "");
        Context context = view.getContext();
        l.b(context, "");
        int a2 = (int) r.a(context, 1.0f);
        this.f129189a = a2;
        this.f129190b = ((r.a(view.getContext()) + 0) / 2) - (a2 * 2);
    }
}
