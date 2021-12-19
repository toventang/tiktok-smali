package com.ss.android.ugc.aweme.social.widget.card;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.e;
import com.ss.android.ugc.aweme.social.widget.a;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import com.ss.android.ugc.aweme.social.widget.card.rec.f;
import com.ss.android.ugc.aweme.social.widget.card.rec.g;
import com.ss.android.ugc.aweme.social.widget.card.view.LegacyPermissionLayout;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class SocialCardServiceImp implements ISocialCardService {
    static {
        Covode.recordClassIndex(87482);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final g a() {
        return h.f133799a;
    }

    public static ISocialCardService b() {
        MethodCollector.i(13702);
        Object a2 = b.a(ISocialCardService.class, false);
        if (a2 != null) {
            ISocialCardService iSocialCardService = (ISocialCardService) a2;
            MethodCollector.o(13702);
            return iSocialCardService;
        }
        if (b.ek == null) {
            synchronized (ISocialCardService.class) {
                try {
                    if (b.ek == null) {
                        b.ek = new SocialCardServiceImp();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(13702);
                    throw th;
                }
            }
        }
        SocialCardServiceImp socialCardServiceImp = (SocialCardServiceImp) b.ek;
        MethodCollector.o(13702);
        return socialCardServiceImp;
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final RecyclerView.a<?> b(a aVar, i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return new f(aVar, iVar);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final e a(a aVar, i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return new g(aVar, iVar);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final d a(a aVar, int i2) {
        l.d(aVar, "");
        return new com.ss.android.ugc.aweme.social.widget.card.view.b(aVar, i2);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.ISocialCardService
    public final LinearLayout a(a aVar, int i2, i iVar) {
        l.d(aVar, "");
        l.d(iVar, "");
        return new LegacyPermissionLayout(aVar, iVar, i2, (byte) 0);
    }
}
