package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.h;
import h.i;

public class m implements f {

    /* renamed from: a  reason: collision with root package name */
    private final h f143714a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    public final f f143715b;

    static {
        Covode.recordClassIndex(94029);
    }

    /* access modifiers changed from: protected */
    public String b() {
        return "preloader";
    }

    /* access modifiers changed from: protected */
    public final Handler c() {
        return (Handler) this.f143714a.getValue();
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f143716a;

        static {
            Covode.recordClassIndex(94031);
        }

        b(m mVar) {
            this.f143716a = mVar;
        }

        public final void run() {
            this.f143716a.f143715b.a();
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f143717a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.playerkit.simapicommon.a.i f143718b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f143719c;

        static {
            Covode.recordClassIndex(94032);
        }

        c(m mVar, com.ss.android.ugc.playerkit.simapicommon.a.i iVar, b bVar) {
            this.f143717a = mVar;
            this.f143718b = iVar;
            this.f143719c = bVar;
        }

        public final void run() {
            this.f143717a.f143715b.a(this.f143718b, this.f143719c);
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f143720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.playerkit.simapicommon.a.i f143721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f143722c;

        static {
            Covode.recordClassIndex(94033);
        }

        d(m mVar, com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2) {
            this.f143720a = mVar;
            this.f143721b = iVar;
            this.f143722c = i2;
        }

        public final void run() {
            this.f143720a.f143715b.a(this.f143721b, this.f143722c);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a() {
        c().post(new b(this));
    }

    static final class a extends h.f.b.m implements h.f.a.a<Handler> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(94030);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread(this.this$0.b());
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    public m(f fVar) {
        l.c(fVar, "");
        this.f143715b = fVar;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2) {
        l.c(iVar, "");
        c().post(new d(this, iVar, i2));
    }

    @Override // com.ss.android.ugc.aweme.video.preload.enginepreloader.f
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, b bVar) {
        l.c(iVar, "");
        l.c(bVar, "");
        c().post(new c(this, iVar, bVar));
    }
}
