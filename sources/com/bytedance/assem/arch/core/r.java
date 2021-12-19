package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.d.b;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.a;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.List;

public final class r implements k {

    /* renamed from: a  reason: collision with root package name */
    public c<? extends b> f25601a;

    /* renamed from: b  reason: collision with root package name */
    public b f25602b;

    /* renamed from: c  reason: collision with root package name */
    public List<o> f25603c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f25604d;

    /* renamed from: e  reason: collision with root package name */
    public l f25605e = l.SYNC;

    /* renamed from: f  reason: collision with root package name */
    private h f25606f = h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14898);
    }

    /* renamed from: b */
    public final b a() {
        l lVar;
        boolean z;
        b bVar = this.f25602b;
        if (bVar == null) {
            c<? extends b> cVar = this.f25601a;
            if (cVar == null) {
                l.a(StringSet.type);
            }
            bVar = (b) a.a(cVar).newInstance();
        }
        bVar.f25610i = this.f25604d;
        l lVar2 = this.f25605e;
        l.c(lVar2, "");
        if (lVar2 == l.ASYNC && ((Boolean) b.f25608l.getValue()).booleanValue()) {
            lVar = l.ASYNC;
        } else if (lVar2 != l.X2C || !((Boolean) b.f25609m.getValue()).booleanValue()) {
            lVar = l.SYNC;
        } else {
            lVar = l.X2C;
        }
        bVar.f25611j = lVar;
        if (this.f25606f == h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        bVar.f25545c = z;
        return bVar;
    }
}
