package com.ss.android.ugc.aweme.commerce.a.a.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce.a.a.b.c;
import f.a.d.f;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
public final /* synthetic */ class e implements f {

    /* renamed from: a  reason: collision with root package name */
    static final f f73370a = new e();

    static {
        Covode.recordClassIndex(45164);
    }

    private e() {
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        c.a aVar = (c.a) obj;
        c cVar = c.f73342a;
        if (aVar.f73346c != null) {
            if (!cVar.f73343b.containsKey(aVar.f73346c)) {
                cVar.f73343b.put(aVar.f73346c, new ArrayList<>());
            }
            cVar.f73343b.get(aVar.f73346c).add(aVar);
        }
    }
}
