package com.ss.android.ugc.aweme.ftc.components.audioeffect;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(62025);
    }

    public static final boolean a(Effect effect) {
        String effectId;
        Integer e2;
        if (effect == null || (effectId = effect.getEffectId()) == null || (e2 = p.e(effectId)) == null || e2.intValue() < 0) {
            return true;
        }
        return false;
    }

    public static final String b(Effect effect) {
        List<String> tags;
        Boolean bool;
        boolean z;
        if (!(effect == null || (tags = effect.getTags()) == null)) {
            Iterator<T> it = tags.iterator();
            while (true) {
                bool = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (t != null) {
                    if (t.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                if (bool.booleanValue()) {
                    bool = next;
                    break;
                }
            }
            String str = (String) bool;
            if (str == null) {
                return "";
            }
            return str;
        }
        return "";
    }

    public static final boolean a(Effect effect, String str) {
        List<String> tags;
        if (str != null && effect != null && (tags = effect.getTags()) != null) {
            Iterator<T> it = tags.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (l.a((Object) next, (Object) str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
