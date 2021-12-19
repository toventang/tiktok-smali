package com.ss.android.ugc.aweme.search.h;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.discover.a.j;
import com.ss.android.ugc.aweme.discover.a.k;
import com.ss.android.ugc.aweme.search.model.FeedSearchIconViewModel;
import f.a.d.f;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.lang.ref.WeakReference;

public final class a extends Handler {

    /* renamed from: e  reason: collision with root package name */
    public static final C3134a f121135e = new C3134a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    WeakReference<e> f121136a;

    /* renamed from: b  reason: collision with root package name */
    f.a.b.b f121137b;

    /* renamed from: c  reason: collision with root package name */
    public long f121138c;

    /* renamed from: d  reason: collision with root package name */
    public long f121139d;

    /* renamed from: f  reason: collision with root package name */
    private final h f121140f = i.a((h.f.a.a) c.f121142a);

    static {
        Covode.recordClassIndex(78910);
    }

    public final long a() {
        return ((Number) this.f121140f.getValue()).longValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.h.a$a  reason: collision with other inner class name */
    public static final class C3134a {
        static {
            Covode.recordClassIndex(78911);
        }

        private C3134a() {
        }

        public /* synthetic */ C3134a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f121142a = new c();

        static {
            Covode.recordClassIndex(78913);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            long j2;
            Long l2;
            j b2 = k.b();
            if (b2 == null || (l2 = b2.f80208c) == null) {
                j2 = 30000;
            } else {
                j2 = l2.longValue();
            }
            return Long.valueOf(j2);
        }
    }

    public final void b() {
        removeCallbacksAndMessages(null);
        a(false);
        f.a.b.b bVar = this.f121137b;
        if (bVar != null && !bVar.isDisposed()) {
            f.a.b.b bVar2 = this.f121137b;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            this.f121137b = null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Looper looper) {
        super(looper);
        l.d(looper, "");
    }

    public final void a(long j2) {
        removeMessages(1);
        sendEmptyMessageDelayed(1, h.j.h.a(j2, 0L));
        a(true);
        this.f121139d = SystemClock.elapsedRealtime();
        WeakReference<e> weakReference = this.f121136a;
        if (weakReference != null) {
            weakReference.get();
        }
    }

    private final void a(boolean z) {
        e eVar;
        WeakReference<e> weakReference = this.f121136a;
        if (weakReference != null && (eVar = weakReference.get()) != null) {
            l.b(eVar, "");
            FeedSearchIconViewModel a2 = FeedSearchIconViewModel.a.a(eVar);
            a2.b().postValue(Boolean.valueOf(z));
            if (z) {
                a2.c().postValue(false);
            }
        }
    }

    public final void handleMessage(Message message) {
        e eVar;
        l.d(message, "");
        if (message.what == 1) {
            a();
            WeakReference<e> weakReference = this.f121136a;
            if (weakReference != null) {
                weakReference.get();
            }
            b();
            WeakReference<e> weakReference2 = this.f121136a;
            if (weakReference2 != null && (eVar = weakReference2.get()) != null) {
                l.b(eVar, "");
                FeedSearchIconViewModel.a.a(eVar).c().postValue(true);
            }
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121141a;

        static {
            Covode.recordClassIndex(78912);
        }

        b(a aVar) {
            this.f121141a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long a2;
            if (((f.b) obj).f34642b) {
                this.f121141a.removeCallbacksAndMessages(null);
                Long valueOf = Long.valueOf(this.f121141a.f121138c);
                if (valueOf.longValue() <= 0 || valueOf == null) {
                    a2 = this.f121141a.a();
                } else {
                    a2 = valueOf.longValue();
                }
                this.f121141a.f121138c = a2 - (SystemClock.elapsedRealtime() - this.f121141a.f121139d);
                return;
            }
            a aVar = this.f121141a;
            aVar.a(aVar.f121138c);
        }
    }
}
