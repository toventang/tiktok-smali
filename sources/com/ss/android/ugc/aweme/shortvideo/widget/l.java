package com.ss.android.ugc.aweme.shortvideo.widget;

import androidx.fragment.app.e;
import com.bytedance.als.ApiCenter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.bk;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.ss.android.ugc.aweme.sticker.h;
import com.ss.android.ugc.aweme.sticker.types.lock.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.c.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    e f132937a;

    /* renamed from: b  reason: collision with root package name */
    h f132938b;

    /* renamed from: c  reason: collision with root package name */
    OnUnlockShareFinishListener f132939c = new OnUnlockShareFinishListener() {
        /* class com.ss.android.ugc.aweme.shortvideo.widget.l.AnonymousClass1 */

        static {
            Covode.recordClassIndex(86950);
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onVKShareSucceed(Effect effect) {
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppFailed() {
            c.F.a(l.this.f132937a);
        }

        @Override // com.ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener
        public final void onShareAppSucceed(Effect effect) {
            com.ss.android.ugc.aweme.sticker.types.unlock.c cVar = new com.ss.android.ugc.aweme.sticker.types.unlock.c();
            cVar.f136178a = UnLockSticker.STICKER_UNLOCKED;
            cVar.f136179b = effect;
            cVar.f136181d = true;
            com.ss.android.ugc.d.a.c.b(cVar);
        }
    };

    static {
        Covode.recordClassIndex(86949);
    }

    public final boolean a() {
        Effect a2 = a(this.f132937a);
        if (!com.ss.android.ugc.aweme.shortvideo.sticker.c.b(a2) || b.a(a2)) {
            return false;
        }
        this.f132938b.a(a2);
        return true;
    }

    public l(e eVar) {
        this.f132937a = eVar;
        Effect a2 = a(eVar);
        bk bkVar = c.F;
        this.f132938b = bkVar.a(bkVar.a(), eVar, a2, this.f132939c, false);
    }

    private static Effect a(e eVar) {
        j jVar;
        if (eVar == null || (jVar = (j) ApiCenter.a.a(eVar).b(j.class)) == null) {
            return null;
        }
        return jVar.t().n().b().getValue();
    }
}
