package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.preload.api.l;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    n f143707a = n.Busy;

    /* renamed from: b  reason: collision with root package name */
    final g f143708b;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.playerkit.simapicommon.a.i f143709c;

    static {
        Covode.recordClassIndex(94023);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a() {
        this.f143709c = null;
        a(n.Busy);
    }

    public i(l lVar) {
        this.f143708b = new g(lVar);
    }

    private final void a(n nVar) {
        MethodCollector.i(6564);
        if (nVar == this.f143707a) {
            MethodCollector.o(6564);
            return;
        }
        synchronized (this) {
            try {
                this.f143707a = nVar;
                if (nVar == n.Busy) {
                    this.f143708b.c();
                } else if (nVar == n.Idle) {
                    this.f143708b.b();
                }
            } finally {
                MethodCollector.o(6564);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2) {
        h.f.b.l.c(iVar, "");
        String dashVideoId = iVar.getDashVideoId();
        if (dashVideoId != null) {
            dashVideoId.length();
        }
        iVar.getSourceId();
        if (this.f143708b.a(iVar)) {
            this.f143708b.a(iVar, i2);
            return;
        }
        this.f143709c = iVar;
        a(n.Busy);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, b bVar) {
        h.f.b.l.c(iVar, "");
        h.f.b.l.c(bVar, "");
        iVar.getSourceId();
        if (this.f143708b.a(iVar)) {
            this.f143708b.a(iVar, bVar);
        } else if (h.f.b.l.a(iVar, this.f143709c)) {
            this.f143709c = null;
            a(n.Idle);
        }
    }
}
