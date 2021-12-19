package com.ss.android.ugc.aweme.editSticker.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f88092a;

    /* renamed from: b  reason: collision with root package name */
    public final Effect f88093b;

    static {
        Covode.recordClassIndex(55377);
    }

    public final boolean b() {
        if (a() || this.f88092a) {
            return true;
        }
        return false;
    }

    public boolean a() {
        if (a(this.f88093b.getEffectId()) < 0) {
            return true;
        }
        return false;
    }

    public a(Effect effect) {
        l.d(effect, "");
        this.f88093b = effect;
    }

    private static int a(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
