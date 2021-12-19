package com.bytedance.assem.arch.viewModel;

import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bz;

public final class d implements Closeable, am {

    /* renamed from: a  reason: collision with root package name */
    private final f f25710a;

    static {
        Covode.recordClassIndex(14972);
    }

    @Override // kotlinx.coroutines.am
    public final f a() {
        return this.f25710a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bz bzVar = (bz) this.f25710a.get(bz.f159061c);
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
    }

    public d(f fVar) {
        l.c(fVar, "");
        this.f25710a = fVar;
    }
}
