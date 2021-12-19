package com.bytedance.im.core.internal.d;

import com.bytedance.covode.number.Covode;

public class i extends a {
    static {
        Covode.recordClassIndex(23101);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public String b() {
        return "ParallelRequestManager";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public String c() {
        return "IM-REQUEST-QUEUE-P";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void d(k kVar) {
        super.d(kVar);
        g(kVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void c(k kVar) {
        if (this.f38688d.contains(kVar)) {
            a(kVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.im.core.internal.d.a
    public final void b(k kVar) {
        if (!this.f38688d.contains(kVar)) {
            this.f38688d.add(kVar);
        }
        a(kVar);
    }
}
