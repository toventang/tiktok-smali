package com.bytedance.assem.arch.core;

import android.view.View;
import com.bytedance.assem.arch.b.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.tiktok.proxy.d;
import com.kakao.usermgmt.StringSet;
import h.f.a;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.List;

public final class m implements k {

    /* renamed from: a  reason: collision with root package name */
    public c<? extends w<? extends d>> f25577a;

    /* renamed from: b  reason: collision with root package name */
    public w<? extends d> f25578b;

    /* renamed from: c  reason: collision with root package name */
    h f25579c = h.IMMEDIATE;

    /* renamed from: d  reason: collision with root package name */
    public int f25580d;

    /* renamed from: e  reason: collision with root package name */
    public int f25581e;

    /* renamed from: f  reason: collision with root package name */
    public View f25582f;

    /* renamed from: g  reason: collision with root package name */
    public l f25583g = l.SYNC;

    /* renamed from: h  reason: collision with root package name */
    private List<o> f25584h = new ArrayList();

    static {
        Covode.recordClassIndex(14893);
    }

    /* renamed from: b */
    public final w<? extends d> a() {
        boolean z;
        w<? extends d> wVar = this.f25578b;
        if (wVar == null) {
            c<? extends w<? extends d>> cVar = this.f25577a;
            if (cVar == null) {
                l.a(StringSet.type);
            }
            wVar = (w) a.a(cVar).newInstance();
        }
        wVar.o = this.f25580d;
        wVar.p = this.f25581e;
        wVar.a(this.f25583g);
        View view = this.f25582f;
        if (view != null) {
            wVar.a(view);
        }
        if (this.f25579c == h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        wVar.f25545c = z;
        return wVar;
    }

    public final void a(h hVar) {
        l.c(hVar, "");
        this.f25579c = hVar;
    }

    public final void a(c<? extends w<? extends d>> cVar) {
        l.c(cVar, "");
        this.f25577a = cVar;
    }
}
