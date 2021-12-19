package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.b.a.a;
import com.bytedance.android.live.core.a.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import h.f.b.l;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f17626a = new c();

    static {
        Covode.recordClassIndex(9767);
    }

    private c() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null && pair.second != null && ((b.a) pair.second).f8897a == 1) {
            List<V> list = ((b.a) pair.second).f8899c;
            Object obj2 = pair.first;
            a aVar = a.f6785g;
            l.d(list, "");
            aVar.b().addAll(list);
        }
    }
}
