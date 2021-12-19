package com.ss.android.ugc.aweme.influencer.ecommercelive.business.common.c;

import android.os.Looper;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.e;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(66989);
    }

    private static boolean b() {
        Looper mainLooper = Looper.getMainLooper();
        l.b(mainLooper, "");
        if (mainLooper.getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    private static boolean a() {
        return l.a((Object) e.a().f104587a, (Object) true);
    }

    public static final void a(IIconSlot.SlotViewModel slotViewModel) {
        l.d(slotViewModel, "");
        t<Boolean> tVar = slotViewModel.f12714b;
        l.b(tVar, "");
        a(tVar);
    }

    private static final void a(t<Boolean> tVar) {
        boolean a2 = a();
        if (b()) {
            tVar.setValue(Boolean.valueOf(a2));
        } else {
            tVar.postValue(Boolean.valueOf(a2));
        }
    }
}
