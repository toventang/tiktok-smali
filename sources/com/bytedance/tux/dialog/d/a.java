package com.bytedance.tux.dialog.d;

import android.view.View;
import com.bytedance.covode.number.Covode;
import h.o;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final View f44848a;

    static {
        Covode.recordClassIndex(27385);
    }

    @Override // com.bytedance.tux.dialog.internal.c
    public final View a() {
        return this.f44848a;
    }

    @Override // com.bytedance.tux.dialog.d.c
    public final void a(CharSequence charSequence) {
        throw new o("custom caption do not support set title/message");
    }

    @Override // com.bytedance.tux.dialog.d.c
    public final void b(CharSequence charSequence) {
        throw new o("custom caption do not support set title/message");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.view.View r3) {
        /*
            r2 = this;
            java.lang.String r1 = ""
            h.f.b.l.c(r3, r1)
            android.content.Context r0 = r3.getContext()
            h.f.b.l.a(r0, r1)
            r2.<init>(r0)
            r2.f44848a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.dialog.d.a.<init>(android.view.View):void");
    }
}
