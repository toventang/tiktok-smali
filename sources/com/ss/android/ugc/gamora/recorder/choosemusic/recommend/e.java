package com.ss.android.ugc.gamora.recorder.choosemusic.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.a;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.b;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.c;
import com.ss.android.ugc.aweme.sticker.presenter.handler.c.d;
import com.ss.android.ugc.aweme.sticker.presenter.handler.m;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.z;

public final class e implements m {

    /* renamed from: a  reason: collision with root package name */
    private final h.f.a.m<Effect, Boolean, z> f147662a;

    static {
        Covode.recordClassIndex(97330);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.ss.android.ugc.effectmanager.effect.model.Effect, ? super java.lang.Boolean, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h.f.a.m<? super Effect, ? super Boolean, z> mVar) {
        l.d(mVar, "");
        this.f147662a = mVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.m
    public final b a(c cVar, m.a aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        b a2 = aVar.a(cVar);
        if (cVar instanceof a) {
            a aVar2 = (a) cVar;
            if (aVar2.f135380c != com.ss.android.ugc.aweme.sticker.d.b.a.RECOVER) {
                this.f147662a.invoke(aVar2.f135378a, true);
            }
        } else if (cVar instanceof d) {
            this.f147662a.invoke(cVar.a(), false);
        }
        return a2;
    }
}
