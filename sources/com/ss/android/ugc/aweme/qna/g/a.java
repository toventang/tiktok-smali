package com.ss.android.ugc.aweme.qna.g;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a<T> implements u<b<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T, z> f119460a;

    static {
        Covode.recordClassIndex(77647);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super T, z> bVar) {
        l.d(bVar, "");
        this.f119460a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Object obj) {
        b bVar = (b) obj;
        if (bVar != null && !bVar.f119461a) {
            bVar.f119461a = true;
            T t = bVar.f119462b;
            if (t != null) {
                this.f119460a.invoke(t);
            }
        }
    }
}
