package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import h.c.f;
import h.f.b.l;
import h.j.h;
import h.z;
import kotlinx.coroutines.bh;
import kotlinx.coroutines.m;

public final class a extends b {
    private volatile a _immediate;

    /* renamed from: a  reason: collision with root package name */
    public final a f159009a;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f159010c;

    /* renamed from: d  reason: collision with root package name */
    private final String f159011d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f159012e;

    static {
        Covode.recordClassIndex(105531);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f159010c);
    }

    /* renamed from: kotlinx.coroutines.android.a$a  reason: collision with other inner class name */
    public static final class C4191a implements bh {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f159013a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f159014b;

        static {
            Covode.recordClassIndex(105532);
        }

        @Override // kotlinx.coroutines.bh
        public final void cJ_() {
            this.f159013a.f159010c.removeCallbacks(this.f159014b);
        }

        C4191a(a aVar, Runnable runnable) {
            this.f159013a = aVar;
            this.f159014b = runnable;
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f159015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ m f159016b;

        static {
            Covode.recordClassIndex(105533);
        }

        public b(a aVar, m mVar) {
            this.f159015a = aVar;
            this.f159016b = mVar;
        }

        public final void run() {
            this.f159016b.a(this.f159015a, z.f158842a);
        }
    }

    @Override // kotlinx.coroutines.ah
    public final String toString() {
        String str = this.f159011d;
        if (str == null) {
            return this.f159010c.toString();
        }
        if (this.f159012e) {
            return this.f159011d + " [immediate]";
        }
        return str;
    }

    static final class c extends h.f.b.m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ Runnable $block;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(105534);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Runnable runnable) {
            super(1);
            this.this$0 = aVar;
            this.$block = runnable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            this.this$0.f159010c.removeCallbacks(this.$block);
            return z.f158842a;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a) || ((a) obj).f159010c != this.f159010c) {
            return false;
        }
        return true;
    }

    @Override // kotlinx.coroutines.ah
    public final boolean isDispatchNeeded(f fVar) {
        if (!this.f159012e || (!l.a(Looper.myLooper(), this.f159010c.getLooper()))) {
            return true;
        }
        return false;
    }

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    @Override // kotlinx.coroutines.ah
    public final void dispatch(f fVar, Runnable runnable) {
        this.f159010c.post(runnable);
    }

    @Override // kotlinx.coroutines.android.b, kotlinx.coroutines.ax
    public final bh invokeOnTimeout(long j2, Runnable runnable) {
        this.f159010c.postDelayed(runnable, h.b(j2, 4611686018427387903L));
        return new C4191a(this, runnable);
    }

    @Override // kotlinx.coroutines.ax
    public final void scheduleResumeAfterDelay(long j2, m<? super z> mVar) {
        b bVar = new b(this, mVar);
        this.f159010c.postDelayed(bVar, h.b(j2, 4611686018427387903L));
        mVar.a((h.f.a.b<? super Throwable, z>) new c(this, bVar));
    }

    private a(Handler handler, String str, boolean z) {
        super((byte) 0);
        a aVar;
        this.f159010c = handler;
        this.f159011d = str;
        this.f159012e = z;
        if (z) {
            aVar = this;
        } else {
            aVar = null;
        }
        this._immediate = aVar;
        a aVar2 = this._immediate;
        if (aVar2 == null) {
            aVar2 = new a(handler, str, true);
            this._immediate = aVar2;
        }
        this.f159009a = aVar2;
    }
}
