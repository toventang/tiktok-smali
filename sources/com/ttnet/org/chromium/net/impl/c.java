package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.ab;
import com.ttnet.org.chromium.net.g;
import com.ttnet.org.chromium.net.h;
import com.ttnet.org.chromium.net.t;
import com.ttnet.org.chromium.net.w;
import com.ttnet.org.chromium.net.x;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

public abstract class c extends g {
    static {
        Covode.recordClassIndex(103490);
    }

    /* access modifiers changed from: protected */
    public abstract p a(String str, ab.b bVar, Executor executor, int i2, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4, t.a aVar);

    /* access modifiers changed from: protected */
    public abstract w a(w.b bVar, Executor executor, int i2, List<String> list, int i3, int i4);

    /* access modifiers changed from: protected */
    public abstract x a(x.b bVar, Executor executor, List<String> list, int i2, String str, long j2, int i3, long j3, String str2, int i4, String str3, Map<String, String> map, Map<String, String> map2, boolean z);

    /* access modifiers changed from: protected */
    public abstract x a(x.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z);

    @Override // com.ttnet.org.chromium.net.c
    public final w.a a(w.b bVar) {
        return new n(bVar, this);
    }

    @Override // com.ttnet.org.chromium.net.c
    public final x.a a(x.b bVar, Executor executor) {
        return new o(bVar, executor, this);
    }

    @Override // com.ttnet.org.chromium.net.g, com.ttnet.org.chromium.net.c
    public final /* synthetic */ ab.a a(String str, ab.b bVar, Executor executor) {
        return a(str, bVar, executor);
    }

    @Override // com.ttnet.org.chromium.net.g
    public final h.a b(String str, ab.b bVar, Executor executor) {
        return new q(str, bVar, executor, this);
    }
}
