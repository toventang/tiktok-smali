package com.ss.android.ugc.aweme.sticker.repository.internals.d;

import android.os.Looper;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.h;
import com.ss.android.ugc.aweme.sticker.g;
import com.ss.android.ugc.aweme.sticker.g.f;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.concurrent.Callable;

public final class b implements f, IEffectDownloadProgressListener {

    /* renamed from: a  reason: collision with root package name */
    public long f135564a;

    /* renamed from: b  reason: collision with root package name */
    public final Effect f135565b;

    /* renamed from: c  reason: collision with root package name */
    public final IEffectDownloadProgressListener f135566c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f135567d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f135568e;

    /* renamed from: f  reason: collision with root package name */
    private volatile int f135569f;

    /* renamed from: g  reason: collision with root package name */
    private volatile int f135570g;

    static {
        Covode.recordClassIndex(88598);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f135571a;

        static {
            Covode.recordClassIndex(88599);
        }

        a(h.f.a.a aVar) {
            this.f135571a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            this.f135571a.invoke();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.repository.internals.d.b$b  reason: collision with other inner class name */
    public static final class C3531b extends m implements h.f.a.a<z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3531b(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f135566c.onSuccess(this.this$0.f135565b);
            return z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ ExceptionResult $e;
        final /* synthetic */ Effect $effect;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Effect effect, ExceptionResult exceptionResult) {
            super(0);
            this.this$0 = bVar;
            this.$effect = effect;
            this.$e = exceptionResult;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f135566c.onFail(this.$effect, this.$e);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, Effect effect) {
            super(0);
            this.this$0 = bVar;
            this.$effect = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f135566c.onStart(this.$effect);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a() {
        this.f135568e = true;
        h.a(this.f135565b.getEffectId());
        b();
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.a<z> {
        final /* synthetic */ int $progress;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(88603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, int i2) {
            super(0);
            this.this$0 = bVar;
            this.$progress = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f135566c.onProgress(this.this$0.f135565b, this.$progress, this.this$0.f135564a);
            return z.f158842a;
        }
    }

    private final void b() {
        if (this.f135567d && this.f135568e) {
            a(new C3531b(this));
        }
    }

    private final void c() {
        int i2 = 100;
        if (!this.f135567d && !this.f135568e) {
            i2 = (this.f135570g + this.f135569f) / 2;
        } else if (!this.f135568e) {
            i2 = (this.f135570g + 100) / 2;
        } else if (!this.f135567d) {
            i2 = (this.f135569f + 100) / 2;
        }
        a(new e(this, i2));
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a(int i2) {
        this.f135570g = i2;
        c();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(Effect effect) {
        this.f135567d = true;
        b();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onStart(Effect effect) {
        a(new d(this, effect));
    }

    private static void a(h.f.a.a<z> aVar) {
        if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            i.a(new a(aVar), i.f4826c);
        }
    }

    public b(Effect effect, IEffectDownloadProgressListener iEffectDownloadProgressListener) {
        l.d(effect, "");
        l.d(iEffectDownloadProgressListener, "");
        this.f135565b = effect;
        this.f135566c = iEffectDownloadProgressListener;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
    public final void onFail(Effect effect, ExceptionResult exceptionResult) {
        l.d(exceptionResult, "");
        a(new c(this, effect, exceptionResult));
    }

    @Override // com.ss.android.ugc.aweme.sticker.g.f
    public final void a(g gVar, String str) {
        l.d(gVar, "");
        this.f135568e = true;
        h.a(this.f135565b.getEffectId(), gVar, str);
        if (str != null) {
            com.ss.android.ugc.aweme.sticker.p.e.a(gVar.getMusicId(), str);
        }
        b();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
    public final void onProgress(Effect effect, int i2, long j2) {
        this.f135564a = j2;
        this.f135569f = i2;
        c();
    }
}
