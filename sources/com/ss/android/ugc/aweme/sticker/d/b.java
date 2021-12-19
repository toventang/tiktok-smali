package com.ss.android.ugc.aweme.sticker.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.p.g;
import com.ss.android.ugc.aweme.sticker.presenter.j;
import com.ss.android.ugc.aweme.sticker.presenter.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.a.n;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f134764a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(88082);
    }

    @Override // com.ss.android.ugc.aweme.sticker.d.c
    public final boolean a(Effect effect, o oVar) {
        String str;
        String str2;
        List<String> children;
        String str3;
        l.d(oVar, "");
        if (effect == null || effect.getEffectId() == null) {
            return true;
        }
        j n = oVar.n();
        String effectId = effect.getEffectId();
        Effect value = n.h().getValue();
        String str4 = null;
        if (value != null) {
            str = value.getEffectId();
        } else {
            str = null;
        }
        if (l.a((Object) effectId, (Object) str)) {
            return true;
        }
        String effectId2 = effect.getEffectId();
        Effect value2 = n.i().getValue();
        if (value2 != null) {
            str2 = value2.getEffectId();
        } else {
            str2 = null;
        }
        if (l.a((Object) effectId2, (Object) str2)) {
            return true;
        }
        if (!TextUtils.isEmpty(effect.getParentId())) {
            String parentId = effect.getParentId();
            Effect value3 = n.i().getValue();
            if (value3 != null) {
                str3 = value3.getEffectId();
            } else {
                str3 = null;
            }
            if (p.a(parentId, str3, false)) {
                return true;
            }
        }
        if (g.a(effect) && (children = effect.getChildren()) != null && !children.isEmpty()) {
            Effect value4 = n.h().getValue();
            if (value4 != null) {
                str4 = value4.getEffectId();
            }
            if (n.a((Iterable) children, (Object) str4)) {
                return true;
            }
        }
        return false;
    }
}
