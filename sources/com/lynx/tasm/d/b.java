package com.lynx.tasm.d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.shadow.text.r;
import com.lynx.tasm.d.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public List<Pair<r.b, Integer>> f56559a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public Set<a> f56560b = new HashSet();

    static {
        Covode.recordClassIndex(35280);
    }

    b() {
    }

    /* access modifiers changed from: package-private */
    public final void a(Pair<r.b, Integer> pair) {
        this.f56559a.add(pair);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        this.f56560b.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(a aVar) {
        if (this.f56560b.contains(aVar)) {
            return true;
        }
        loop0:
        for (a aVar2 : this.f56560b) {
            if (aVar2 != aVar) {
                Iterator<Pair<a.EnumC1269a, String>> it = aVar2.f56556b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Pair<a.EnumC1269a, String> next = it.next();
                        Iterator<Pair<a.EnumC1269a, String>> it2 = aVar.f56556b.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (next.equals(it2.next())) {
                                    break loop0;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
