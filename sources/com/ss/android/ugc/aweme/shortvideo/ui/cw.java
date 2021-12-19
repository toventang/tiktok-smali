package com.ss.android.ugc.aweme.shortvideo.ui;

import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.g.a;
import com.ss.android.ugc.aweme.shortvideo.g.c;
import h.f.b.l;
import java.util.Iterator;

final /* synthetic */ class cw implements m {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131668a;

    static {
        Covode.recordClassIndex(86224);
    }

    cw(cj cjVar) {
        this.f131668a = cjVar;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        T next;
        cj cjVar = this.f131668a;
        if (((Boolean) obj).booleanValue()) {
            c cVar = cjVar.ad;
            Iterator<T> it = cVar.b().iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    int i2 = next.f128526c;
                    do {
                        T next2 = it.next();
                        int i3 = next2.f128526c;
                        if (i2 < i3) {
                            next = next2;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            }
            T t = next;
            if (t != null) {
                t.f128527d.invoke();
                a a2 = cVar.a();
                l.d(t, "");
                int a3 = a2.a(t) + 1;
                a2.a().storeInt(t.f128524a, a3);
                a.C3352a.a().put(t.f128524a, Integer.valueOf(a3));
            }
            cVar.b().clear();
        }
    }
}
