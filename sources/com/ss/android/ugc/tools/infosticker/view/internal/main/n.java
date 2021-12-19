package com.ss.android.ugc.tools.infosticker.view.internal.main;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.c.a;
import com.ss.android.ugc.tools.h.a.c;
import com.ss.android.ugc.tools.infosticker.view.internal.base.f;
import com.ss.android.ugc.tools.view.widget.c.b;
import h.f.a.q;
import h.f.b.l;
import h.z;
import java.util.List;

public final class n extends f<Effect> {
    static {
        Covode.recordClassIndex(98642);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.tools.infosticker.view.internal.base.f
    public final /* synthetic */ void a(Effect effect) {
        List<String> urlList;
        String str;
        Effect effect2 = effect;
        l.d(effect2, "");
        UrlModel iconUrl = effect2.getIconUrl();
        if (iconUrl != null && (urlList = iconUrl.getUrlList()) != null && (str = (String) h.a.n.b((List) urlList, 0)) != null) {
            a.a(this.f149601g.getImageView(), str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(View view, b bVar, q<? super Effect, ? super Integer, ? super c, z> qVar) {
        super(view, bVar, qVar);
        l.d(view, "");
        l.d(bVar, "");
        l.d(qVar, "");
    }
}
