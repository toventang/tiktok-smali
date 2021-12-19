package com.ss.android.ugc.aweme.effect.b;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.b.a.b;
import com.ss.android.ugc.aweme.effect.b.a.c;
import com.ss.android.ugc.aweme.effect.b.b;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.effectplatform.f f88830f;

    /* renamed from: g  reason: collision with root package name */
    public static final C2148a f88831g = new C2148a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Queue<Effect> f88832a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f88833b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f88834c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f88835d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f88836e;

    /* renamed from: h  reason: collision with root package name */
    private Queue<Effect> f88837h;

    /* renamed from: i  reason: collision with root package name */
    private Queue<Effect> f88838i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f88839j;

    /* renamed from: k  reason: collision with root package name */
    private final c f88840k;

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final C2149a f88841c = new C2149a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public Integer f88842a = 0;

        /* renamed from: b  reason: collision with root package name */
        public c f88843b;

        static {
            Covode.recordClassIndex(55883);
        }

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$b$a  reason: collision with other inner class name */
        public static final class C2149a {
            static {
                Covode.recordClassIndex(55884);
            }

            private C2149a() {
            }

            public /* synthetic */ C2149a(byte b2) {
                this();
            }
        }

        public final a a() {
            int i2;
            Integer num = this.f88842a;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 3;
            }
            c cVar = this.f88843b;
            if (cVar == null) {
                cVar = new com.ss.android.ugc.aweme.effect.b.a.a();
            }
            return new a(i2, cVar, (byte) 0);
        }
    }

    static {
        Covode.recordClassIndex(55881);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.b.a$a  reason: collision with other inner class name */
    public static final class C2148a {
        static {
            Covode.recordClassIndex(55882);
        }

        private C2148a() {
        }

        public static com.ss.android.ugc.aweme.effectplatform.f a() {
            if (a.f88830f == null) {
                Application application = i.f115645a;
                l.b(application, "");
                a.f88830f = com.ss.android.ugc.aweme.effectplatform.c.a(application, null);
            }
            return a.f88830f;
        }

        public /* synthetic */ C2148a(byte b2) {
            this();
        }
    }

    public static final class g implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88854a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f88855b;

        static {
            Covode.recordClassIndex(55889);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* renamed from: com.ss.android.ugc.aweme.effect.b.a$g$a  reason: collision with other inner class name */
        static final class RunnableC2150a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f88856a;

            static {
                Covode.recordClassIndex(55890);
            }

            RunnableC2150a(g gVar) {
                this.f88856a = gVar;
            }

            public final void run() {
                this.f88856a.f88854a.a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            this.f88854a.f88832a.remove(this.f88855b);
            this.f88854a.f88835d.incrementAndGet();
            a aVar = this.f88854a;
            Effect effect3 = this.f88855b;
            l.d(effect3, "");
            if (a.b()) {
                aVar.f88836e.post(new d(aVar, effect3, effect2));
            } else {
                List<b> list = aVar.f88833b;
                l.b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().b(effect3);
                }
            }
            l.a(this.f88855b, effect2);
            this.f88855b.getName();
            this.f88854a.f88834c.set(true);
            this.f88854a.f88836e.post(new RunnableC2150a(this));
        }

        g(a aVar, Effect effect) {
            this.f88854a = aVar;
            this.f88855b = effect;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            l.d(exceptionResult, "");
            this.f88854a.f88832a.remove(this.f88855b);
            this.f88854a.f88835d.incrementAndGet();
            a aVar = this.f88854a;
            if (a.b()) {
                aVar.f88836e.post(new c(aVar, effect, exceptionResult));
            } else {
                List<b> list = aVar.f88833b;
                l.b(list, "");
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    it.next().c(effect);
                }
            }
            l.a(this.f88855b, effect);
            if (effect != null) {
                effect.getName();
            }
            exceptionResult.getMsg();
            Log.getStackTraceString(exceptionResult.getException());
            this.f88854a.f88834c.set(!this.f88854a.f88832a.isEmpty());
        }
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88853a;

        static {
            Covode.recordClassIndex(55888);
        }

        f(a aVar) {
            this.f88853a = aVar;
        }

        public final void run() {
            this.f88853a.f88834c.set(true);
            this.f88853a.a();
        }
    }

    static boolean b() {
        return !l.a(Looper.myLooper(), Looper.getMainLooper());
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f88845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ExceptionResult f88846c;

        static {
            Covode.recordClassIndex(55885);
        }

        c(a aVar, Effect effect, ExceptionResult exceptionResult) {
            this.f88844a = aVar;
            this.f88845b = effect;
            this.f88846c = exceptionResult;
        }

        public final void run() {
            List<b> list = this.f88844a.f88833b;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(this.f88845b);
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88847a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f88848b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Effect f88849c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f88850d = true;

        static {
            Covode.recordClassIndex(55886);
        }

        d(a aVar, Effect effect, Effect effect2) {
            this.f88847a = aVar;
            this.f88848b = effect;
            this.f88849c = effect2;
        }

        public final void run() {
            List<b> list = this.f88847a.f88833b;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().b(this.f88848b);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f88851a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Effect f88852b;

        static {
            Covode.recordClassIndex(55887);
        }

        e(a aVar, Effect effect) {
            this.f88851a = aVar;
            this.f88852b = effect;
        }

        public final void run() {
            List<b> list = this.f88851a.f88833b;
            l.b(list, "");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(this.f88852b);
            }
        }
    }

    public final void c() {
        com.ss.android.ugc.aweme.effectplatform.f a2 = C2148a.a();
        if (a2 != null) {
            a2.destroy();
        }
        f88830f = null;
        this.f88832a.clear();
        this.f88837h.clear();
        this.f88833b.clear();
        this.f88834c.set(false);
    }

    public final void a() {
        Effect a2;
        boolean z = true;
        while (this.f88834c.get() && this.f88835d.get() > 0 && z) {
            if (!this.f88837h.isEmpty()) {
                a2 = this.f88837h.poll();
            } else if (!(!this.f88838i.isEmpty())) {
                if (this.f88840k.a()) {
                    a2 = this.f88840k.a(this.f88832a);
                }
                z = false;
                this.f88834c.set(!this.f88832a.isEmpty());
            } else if (this.f88840k.a()) {
                a2 = this.f88840k.a(this.f88832a);
            } else {
                a2 = this.f88838i.poll();
            }
            if (a2 != null) {
                if (b(a2)) {
                    c(a2);
                }
                z = true;
                this.f88834c.set(!this.f88832a.isEmpty());
            }
            z = false;
            this.f88834c.set(!this.f88832a.isEmpty());
        }
    }

    public final void a(b bVar) {
        this.f88833b.add(bVar);
    }

    public final void b(b bVar) {
        this.f88833b.remove(bVar);
    }

    private final void b(List<? extends Effect> list) {
        for (T t : list) {
            if (!this.f88838i.contains(t)) {
                this.f88838i.add(t);
            }
        }
    }

    private final void c(Effect effect) {
        this.f88835d.decrementAndGet();
        d(effect);
        com.ss.android.ugc.aweme.effectplatform.f a2 = C2148a.a();
        if (a2 != null) {
            a2.a(effect, b.a.a("edit_effect_download_error_rate", "edit_effect", new g(this, effect)));
        }
    }

    public final void a(List<? extends Effect> list) {
        l.d(list, "");
        b(list);
        this.f88834c.set(true);
        this.f88839j.set(true);
        a();
    }

    private final boolean b(Effect effect) {
        if (this.f88832a.contains(effect)) {
            return false;
        }
        this.f88832a.add(effect);
        return true;
    }

    private final void d(Effect effect) {
        if (b()) {
            this.f88836e.post(new e(this, effect));
            return;
        }
        List<com.ss.android.ugc.aweme.effect.b.a.b> list = this.f88833b;
        l.b(list, "");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(effect);
        }
    }

    public final void a(Effect effect) {
        if (effect != null) {
            if (!this.f88837h.contains(effect) && !this.f88832a.contains(effect)) {
                this.f88837h.add(effect);
            }
            d(effect);
            if (!this.f88834c.get()) {
                this.f88836e.post(new f(this));
            }
        }
    }

    public final boolean b(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (T t : this.f88837h) {
            if (t != null) {
                str = t.getName();
            } else {
                str = null;
            }
            if (l.a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(EffectModel effectModel) {
        String str;
        if (effectModel == null) {
            return false;
        }
        for (T t : this.f88832a) {
            if (t != null) {
                str = t.getName();
            } else {
                str = null;
            }
            if (l.a((Object) str, (Object) effectModel.name)) {
                return true;
            }
        }
        return false;
    }

    private a(int i2, c cVar) {
        this.f88840k = cVar;
        this.f88832a = new ConcurrentLinkedQueue();
        this.f88837h = new ConcurrentLinkedQueue();
        this.f88838i = new ConcurrentLinkedQueue();
        this.f88833b = Collections.synchronizedList(new ArrayList());
        this.f88839j = new AtomicBoolean(false);
        this.f88834c = new AtomicBoolean(false);
        this.f88835d = new AtomicInteger(i2);
        this.f88836e = new Handler(Looper.getMainLooper());
    }

    public /* synthetic */ a(int i2, c cVar, byte b2) {
        this(i2, cVar);
    }
}
