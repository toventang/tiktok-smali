package com.bytedance.assem.arch.core;

import com.bytedance.assem.arch.b.x;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.kakao.usermgmt.StringSet;
import h.f.a;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.List;

public final class n implements k {

    /* renamed from: a  reason: collision with root package name */
    public c<? extends x<? extends d>> f25585a;

    /* renamed from: b  reason: collision with root package name */
    public x<? extends d> f25586b;

    /* renamed from: c  reason: collision with root package name */
    h f25587c = h.IMMEDIATE;

    /* renamed from: d  reason: collision with root package name */
    public int f25588d;

    /* renamed from: e  reason: collision with root package name */
    public l f25589e = l.SYNC;

    /* renamed from: f  reason: collision with root package name */
    private List<o> f25590f = new ArrayList();

    static {
        Covode.recordClassIndex(14894);
    }

    /* renamed from: b */
    public final x<? extends d> a() {
        boolean z;
        x<? extends d> xVar = this.f25586b;
        if (xVar == null) {
            c<? extends x<? extends d>> cVar = this.f25585a;
            if (cVar == null) {
                l.a(StringSet.type);
            }
            xVar = (x) a.a(cVar).newInstance();
        }
        xVar.o = this.f25588d;
        xVar.a(this.f25589e);
        if (this.f25587c == h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        xVar.f25545c = z;
        return xVar;
    }

    public final void a(h hVar) {
        l.c(hVar, "");
        this.f25587c = hVar;
    }

    public final void a(l lVar) {
        l.c(lVar, "");
        this.f25589e = lVar;
    }

    public final void a(c<? extends x<? extends d>> cVar) {
        l.c(cVar, "");
        this.f25585a = cVar;
    }
}
