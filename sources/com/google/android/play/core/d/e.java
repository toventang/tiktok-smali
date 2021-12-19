package com.google.android.play.core.d;

import com.bytedance.covode.number.Covode;
import java.io.File;

final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f53197a;

    static {
        Covode.recordClassIndex(32879);
    }

    e(f fVar) {
        this.f53197a = fVar;
    }

    @Override // com.google.android.play.core.d.j
    public final void a(k kVar, File file, boolean z) {
        this.f53197a.f53199b.add(file);
        if (!z) {
            this.f53197a.f53200c.set(false);
        }
    }
}
