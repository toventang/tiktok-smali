package com.bytedance.android.live.effect.f;

import com.bytedance.android.live.e;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.covode.number.Covode;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f9835a = new c();

    public static final class a extends com.google.gson.b.a<List<? extends a.b>> {
        static {
            Covode.recordClassIndex(5027);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends a.b>> {
        static {
            Covode.recordClassIndex(5028);
        }

        b() {
        }
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(5026);
    }

    public static List<a.b> a(String str) {
        o oVar;
        String str2;
        o oVar2;
        i iVar;
        l c2;
        l c3;
        List<a.b> list = null;
        if (str != null) {
            try {
                l a2 = q.a(str);
                if (a2 != null) {
                    oVar = a2.j();
                } else {
                    oVar = null;
                }
                if (!(oVar == null || (c3 = oVar.c("video_tag")) == null)) {
                    c3.c();
                }
                if (oVar == null || (c2 = oVar.c("beautyConfig")) == null) {
                    str2 = null;
                } else {
                    str2 = c2.c();
                }
                l a3 = q.a(str2);
                if (a3 != null) {
                    oVar2 = a3.j();
                } else {
                    oVar2 = null;
                }
                if (oVar2 != null) {
                    iVar = oVar2.e("items");
                } else {
                    iVar = null;
                }
                list = (List) e.a.f9628b.a((l) iVar, new a().type);
            } catch (Throwable unused) {
            }
        }
        if (list == null) {
            return new ArrayList();
        }
        return list;
    }

    public static com.bytedance.android.livesdkapi.depend.model.a a(Effect effect, com.bytedance.android.livesdkapi.depend.model.a aVar) {
        h.f.b.l.d(effect, "");
        h.f.b.l.d(aVar, "");
        try {
            l a2 = q.a(effect.getExtra());
            h.f.b.l.b(a2, "");
            o j2 = a2.j();
            if (j2.b("ab_group")) {
                int value = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
                l c2 = j2.c("ab_group");
                h.f.b.l.b(c2, "");
                if (value != c2.g()) {
                    return aVar;
                }
            }
            if (j2.b("MakeupType")) {
                l c3 = j2.c("MakeupType");
                h.f.b.l.b(c3, "");
                aVar.f23002h = c3.g();
            }
            if (j2.b("beautyConfig")) {
                l c4 = j2.c("beautyConfig");
                h.f.b.l.b(c4, "");
                l a3 = q.a(c4.c());
                h.f.b.l.b(a3, "");
                List<a.b> list = (List) e.a.f9628b.a((l) a3.j().e("items"), new b().type);
                h.f.b.l.b(list, "");
                aVar.a(list);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    aVar.p.add(it.next().f23010c);
                }
            }
        } catch (Throwable unused) {
        }
        return aVar;
    }
}
