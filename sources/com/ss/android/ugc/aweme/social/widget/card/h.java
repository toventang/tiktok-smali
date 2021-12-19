package com.ss.android.ugc.aweme.social.widget.card;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.social.widget.card.a.b;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.b.a;
import com.ss.android.ugc.aweme.social.widget.card.view.c;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static final h f133799a = new h();

    private h() {
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.g
    public final RecyclerView.h a() {
        return new a();
    }

    static {
        Covode.recordClassIndex(87517);
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.g
    public final boolean b() {
        Map<f, Boolean> map = b.a.a(7).f133730d;
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<f, Boolean> entry : map.entrySet()) {
            if (entry.getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.social.widget.card.g
    public final com.ss.android.ugc.aweme.social.widget.card.view.a a(com.ss.android.ugc.aweme.social.widget.a aVar, h.f.a.b<? super com.ss.android.ugc.aweme.social.widget.card.view.a, z> bVar) {
        l.d(aVar, "");
        c cVar = new c(aVar);
        if (bVar != null) {
            bVar.invoke(cVar);
        }
        return cVar;
    }
}
