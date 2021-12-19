package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.a;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b;

final /* synthetic */ class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f126162a;

    /* renamed from: b  reason: collision with root package name */
    private final int f126163b;

    static {
        Covode.recordClassIndex(82830);
    }

    d(b.a aVar, int i2) {
        this.f126162a = aVar;
        this.f126163b = i2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.model.a
    public final void a(com.facebook.common.h.a aVar) {
        b.a aVar2 = this.f126162a;
        boolean z = true;
        if (this.f126163b != b.this.getItemCount() - 1) {
            z = false;
        }
        aVar2.a(aVar, z);
    }
}
