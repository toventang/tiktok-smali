package com.bytedance.hox;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.a;
import com.bytedance.hox.a.b;
import com.bytedance.hox.a.c;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class d {

    /* renamed from: e  reason: collision with root package name */
    public b f31043e;

    /* renamed from: f  reason: collision with root package name */
    public LinkedList<d> f31044f;

    /* renamed from: g  reason: collision with root package name */
    public List<com.bytedance.hox.a.d> f31045g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public List<a> f31046h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public List<b> f31047i = new ArrayList();

    static {
        Covode.recordClassIndex(18031);
    }

    public abstract String d();

    public String e() {
        return "";
    }

    public abstract Class<? extends Fragment> f();

    public abstract Bundle g();

    public d() {
        LinkedList<d> linkedList = new LinkedList<>();
        this.f31044f = linkedList;
        linkedList.add(this);
    }

    public final void b(c cVar) {
        l.c(cVar, "");
        a(cVar);
    }

    /* access modifiers changed from: protected */
    public void a(c cVar) {
        l.c(cVar, "");
        if (!n.a((Iterable) this.f31045g, (Object) cVar)) {
            if (cVar instanceof com.bytedance.hox.a.d) {
                this.f31045g.add(cVar);
            }
            if (cVar instanceof a) {
                this.f31046h.add(cVar);
            }
            if (cVar instanceof b) {
                this.f31047i.add(cVar);
                return;
            }
            return;
        }
        throw new RuntimeException("have been added, cannot add again");
    }
}
