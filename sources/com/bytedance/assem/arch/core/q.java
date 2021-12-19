package com.bytedance.assem.arch.core;

import android.view.View;
import com.bytedance.assem.arch.d.a;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import h.k.c;
import java.util.ArrayList;
import java.util.List;

public final class q implements k {

    /* renamed from: a  reason: collision with root package name */
    public c<? extends a> f25595a;

    /* renamed from: b  reason: collision with root package name */
    public a f25596b;

    /* renamed from: c  reason: collision with root package name */
    List<o> f25597c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f25598d;

    /* renamed from: e  reason: collision with root package name */
    public View f25599e;

    /* renamed from: f  reason: collision with root package name */
    private h f25600f = h.IMMEDIATE;

    static {
        Covode.recordClassIndex(14897);
    }

    /* renamed from: b */
    public final a a() {
        boolean z;
        a aVar = this.f25596b;
        if (aVar == null) {
            c<? extends a> cVar = this.f25595a;
            if (cVar == null) {
                l.a(StringSet.type);
            }
            aVar = (a) h.f.a.a(cVar).newInstance();
        }
        aVar.f25607i = this.f25598d;
        View view = this.f25599e;
        if (view != null) {
            aVar.a(view);
        }
        if (this.f25600f == h.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        aVar.f25545c = z;
        return aVar;
    }

    public final void a(c<? extends a> cVar) {
        l.c(cVar, "");
        this.f25595a = cVar;
    }
}
