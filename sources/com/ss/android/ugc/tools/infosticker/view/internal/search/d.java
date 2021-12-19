package com.ss.android.ugc.tools.infosticker.view.internal.search;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.e.q;
import com.facebook.drawee.f.a;
import com.ss.android.ugc.aweme.views.CircleDraweeView;
import com.ss.android.ugc.tools.c.b;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.UrlModel;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import h.f.b.l;
import h.z;
import java.util.List;

public final class d extends f<InfoStickerEffect> {
    static {
        Covode.recordClassIndex(98722);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.f
    public final /* synthetic */ void a(InfoStickerEffect infoStickerEffect) {
        ProviderEffect.StickerBean sticker_info;
        String url;
        UrlModel icon_url;
        List<String> url_list;
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        l.d(infoStickerEffect2, "");
        Integer source = infoStickerEffect2.getSource();
        if (source != null) {
            if (source.intValue() == 1) {
                Effect loki_effect = infoStickerEffect2.getLoki_effect();
                if (loki_effect != null && (icon_url = loki_effect.getIcon_url()) != null && (url_list = icon_url.getUrl_list()) != null && (!url_list.isEmpty())) {
                    a aVar = (a) this.f149601g.getImageView().getHierarchy();
                    l.b(aVar, "");
                    aVar.a(q.b.f47438d);
                    CircleDraweeView imageView = this.f149601g.getImageView();
                    com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
                    urlModel.setUrlList(url_list);
                    b.a(imageView, urlModel, Bitmap.Config.ARGB_8888);
                }
            } else if (source.intValue() == 2 && (sticker_info = infoStickerEffect2.getSticker().getSticker_info()) != null && (url = sticker_info.getUrl()) != null && url.length() > 0) {
                a aVar2 = (a) this.f149601g.getImageView().getHierarchy();
                l.b(aVar2, "");
                aVar2.a(q.b.f47438d);
                b.a(this.f149601g.getImageView(), url, Bitmap.Config.ARGB_8888);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, com.ss.android.ugc.tools.view.widget.c.b bVar, h.f.a.q<? super InfoStickerEffect, ? super Integer, ? super c, z> qVar) {
        super(view, bVar, qVar);
        l.d(view, "");
        l.d(bVar, "");
        l.d(qVar, "");
    }
}
