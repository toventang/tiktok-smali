package com.bytedance.android.live.effect.f;

import com.bytedance.android.live.effect.b.c;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.j.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(5025);
    }

    public static final boolean a(a aVar) {
        l.d(aVar, "");
        Effect effect = aVar.q;
        if (effect == null || effect.getEffectType() != 1 || com.bytedance.common.utility.collection.b.a((Collection) aVar.o)) {
            return false;
        }
        return true;
    }

    public static final boolean a(Effect effect) {
        l.d(effect, "");
        try {
            com.google.gson.l a2 = q.a(effect.getExtra());
            l.b(a2, "");
            o j2 = a2.j();
            if (!j2.b("is_none")) {
                return false;
            }
            com.google.gson.l c2 = j2.c("is_none");
            l.b(c2, "");
            if (c2.h()) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean b(a aVar) {
        Boolean bool;
        l.d(aVar, "");
        boolean z = true;
        if (a(aVar)) {
            List<a> list = aVar.o;
            if (list != null) {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        if (!next.C && !b(next)) {
                            z = false;
                            break;
                        }
                    }
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = null;
            }
            return p.a(bool);
        }
        List<a.b> list2 = aVar.n;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                c a2 = c.a.a();
                String str = aVar.f23001g;
                String str2 = it2.next().f23010c;
                if (str2 == null) {
                    str2 = "";
                }
                if (a2.b(str, str2) == -1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean a(String str) {
        try {
            com.google.gson.l a2 = q.a(str);
            l.b(a2, "");
            o j2 = a2.j();
            boolean b2 = j2.b("ab_group");
            if (b2) {
                try {
                    int value = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
                    com.google.gson.l c2 = j2.c("ab_group");
                    l.b(c2, "");
                    if (value == c2.g()) {
                    }
                } catch (Throwable unused) {
                    if (!b2 || 0 != 0) {
                        return true;
                    }
                }
                return false;
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static final int a(String str, List<a> list) {
        T t;
        String str2;
        List<a> b2;
        T t2;
        c a2 = c.a.a();
        if (a2 == null || (b2 = a2.b(com.bytedance.android.live.effect.api.a.f9639d)) == null) {
            t = null;
        } else {
            Iterator<T> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it.next();
                if (l.a((Object) t2.B, (Object) str)) {
                    break;
                }
            }
            t = t2;
        }
        if (list == null) {
            return 0;
        }
        Iterator<a> it2 = list.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            }
            String str3 = it2.next().f22997c;
            if (t != null) {
                str2 = t.f22997c;
            } else {
                str2 = null;
            }
            if (l.a((Object) str3, (Object) str2) && p.a(Boolean.valueOf(t.D))) {
                break;
            }
            i2++;
        }
        return h.b(i2, 0);
    }
}
