package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class a<T> implements u<c<? extends T>> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T, z> f100528a;

    static {
        Covode.recordClassIndex(64274);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.b<? super T, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public a(b<? super T, z> bVar) {
        l.d(bVar, "");
        this.f100528a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Object obj) {
        c cVar = (c) obj;
        if (cVar != null && !cVar.f100529a) {
            cVar.f100529a = true;
            T t = cVar.f100530b;
            if (t != null) {
                this.f100528a.invoke(t);
            }
        }
    }
}
