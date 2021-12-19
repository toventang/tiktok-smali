package com.ss.android.ugc.aweme.ecommercelive.business.common.c;

import android.os.Looper;
import android.util.Pair;
import androidx.lifecycle.t;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommercelive.framework.c.a;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(55319);
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
        return a.a().a();
    }

    public static final void a(IFrameSlot.SlotViewModel slotViewModel, boolean z) {
        l.d(slotViewModel, "");
        t<Pair<Boolean, String>> tVar = slotViewModel.f12709a;
        l.b(tVar, "");
        b(tVar, z);
    }

    public static final void a(IIconSlot.SlotViewModel slotViewModel, boolean z) {
        l.d(slotViewModel, "");
        t<Boolean> tVar = slotViewModel.f12714b;
        l.b(tVar, "");
        a(tVar, z);
    }

    private static final void a(t<Boolean> tVar, boolean z) {
        boolean z2;
        if (!z || !a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (b()) {
            tVar.setValue(Boolean.valueOf(z2));
        } else {
            tVar.postValue(Boolean.valueOf(z2));
        }
    }

    private static final void b(t<Pair<Boolean, String>> tVar, boolean z) {
        boolean z2;
        if (!z || !a()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (b()) {
            tVar.setValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        } else {
            tVar.postValue(new Pair<>(Boolean.valueOf(z2), "shop"));
        }
    }
}
