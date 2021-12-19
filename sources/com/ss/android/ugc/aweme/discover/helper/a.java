package com.ss.android.ugc.aweme.discover.helper;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.base.utils.a;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class a implements a.AbstractC1546a {

    /* renamed from: e  reason: collision with root package name */
    public static final C1891a f81032e = new C1891a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<b> f81033a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f81034b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f81035c;

    /* renamed from: d  reason: collision with root package name */
    final List<f.a.b.b> f81036d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<androidx.fragment.app.e> f81037f;

    public interface b {
        static {
            Covode.recordClassIndex(50372);
        }

        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();
    }

    static {
        Covode.recordClassIndex(50370);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.a$a  reason: collision with other inner class name */
    public static final class C1891a {
        static {
            Covode.recordClassIndex(50371);
        }

        private C1891a() {
        }

        public /* synthetic */ C1891a(byte b2) {
            this();
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81046a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81047b;

        static {
            Covode.recordClassIndex(50377);
        }

        g(a aVar, WeakReference weakReference) {
            this.f81046a = aVar;
            this.f81047b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f81047b.get()) {
                this.f81046a.a(3);
            }
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81049b;

        static {
            Covode.recordClassIndex(50378);
        }

        h(a aVar, WeakReference weakReference) {
            this.f81048a = aVar;
            this.f81049b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f81049b.get()) {
                this.f81048a.a(4);
            }
        }
    }

    public final void a(b bVar) {
        l.d(bVar, "");
        this.f81033a.add(bVar);
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81038a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81039b;

        static {
            Covode.recordClassIndex(50373);
        }

        c(a aVar, WeakReference weakReference) {
            this.f81038a = aVar;
            this.f81039b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity;
            f.a aVar = (f.a) obj;
            if (aVar != null) {
                activity = aVar.f34639a;
            } else {
                activity = null;
            }
            if (activity == this.f81039b.get()) {
                this.f81038a.a(0);
            }
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81044a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81045b;

        static {
            Covode.recordClassIndex(50376);
        }

        f(a aVar, WeakReference weakReference) {
            this.f81044a = aVar;
            this.f81045b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f81045b.get()) {
                this.f81044a.f81035c = false;
                if (this.f81044a.f81034b) {
                    this.f81044a.f81034b = false;
                } else {
                    this.f81044a.a(2);
                }
            }
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81050a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81051b;

        static {
            Covode.recordClassIndex(50379);
        }

        i(a aVar, WeakReference weakReference) {
            this.f81050a = aVar;
            this.f81051b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f81051b.get()) {
                this.f81050a.f81035c = true;
                if (!this.f81050a.f81034b) {
                    this.f81050a.a(6);
                }
            }
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81040a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81041b;

        static {
            Covode.recordClassIndex(50374);
        }

        d(a aVar, WeakReference weakReference) {
            this.f81040a = aVar;
            this.f81041b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj == this.f81041b.get()) {
                this.f81040a.a(7);
                a aVar = this.f81040a;
                for (T t : aVar.f81036d) {
                    if (t.isDisposed()) {
                        t.dispose();
                    }
                }
                l.d(aVar, "");
                com.ss.android.ugc.aweme.base.utils.a.a().remove(aVar);
                aVar.f81033a.clear();
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f81042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WeakReference f81043b;

        static {
            Covode.recordClassIndex(50375);
        }

        e(a aVar, WeakReference weakReference) {
            this.f81042a = aVar;
            this.f81043b = weakReference;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Activity activity;
            f.b bVar = (f.b) obj;
            if (bVar == null) {
                activity = null;
            } else if (bVar.f34642b) {
                if (!this.f81042a.f81035c) {
                    this.f81042a.f81034b = true;
                }
                if (bVar.f34641a == this.f81043b.get()) {
                    this.f81042a.a(5);
                    return;
                }
                return;
            } else {
                activity = bVar.f34641a;
            }
            if (activity == this.f81043b.get()) {
                this.f81042a.a(1);
            }
        }
    }

    public final void a(int i2) {
        for (T t : this.f81033a) {
            switch (i2) {
                case 1:
                    t.f();
                    break;
                case 2:
                    t.a();
                    break;
                case 3:
                    t.b();
                    break;
                case 4:
                    t.c();
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    t.e();
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    t.d();
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    t.g();
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    t.h();
                    break;
            }
        }
    }

    public final void a(WeakReference<androidx.fragment.app.e> weakReference) {
        l.d(weakReference, "");
        this.f81037f = weakReference;
        f.a.b.b d2 = com.bytedance.ies.ugc.appcontext.f.a().d(new c(this, weakReference));
        if (d2 != null) {
            this.f81036d.add(d2);
        }
        f.a.b.b d3 = com.bytedance.ies.ugc.appcontext.f.b().d(new f(this, weakReference));
        if (d3 != null) {
            this.f81036d.add(d3);
        }
        f.a.b.b d4 = com.bytedance.ies.ugc.appcontext.f.c().d(new g(this, weakReference));
        if (d4 != null) {
            this.f81036d.add(d4);
        }
        f.a.b.b d5 = com.bytedance.ies.ugc.appcontext.f.d().d(new h(this, weakReference));
        if (d5 != null) {
            this.f81036d.add(d5);
        }
        f.a.b.b d6 = com.bytedance.ies.ugc.appcontext.f.e().d(new i(this, weakReference));
        if (d6 != null) {
            this.f81036d.add(d6);
        }
        f.a.b.b d7 = com.bytedance.ies.ugc.appcontext.f.f().d(new d(this, weakReference));
        if (d7 != null) {
            this.f81036d.add(d7);
        }
        f.a.b.b d8 = com.bytedance.ies.ugc.appcontext.f.h().d(new e(this, weakReference));
        if (d8 != null) {
            this.f81036d.add(d8);
        }
        com.ss.android.ugc.aweme.base.utils.a.a(this);
    }

    @Override // com.ss.android.ugc.aweme.base.utils.a.AbstractC1546a
    public final void a(Activity activity, boolean z) {
        androidx.fragment.app.e eVar;
        l.d(activity, "");
        WeakReference<androidx.fragment.app.e> weakReference = this.f81037f;
        if (weakReference != null) {
            eVar = weakReference.get();
        } else {
            eVar = null;
        }
        if (activity != eVar) {
            return;
        }
        if (z) {
            a(8);
        } else {
            a(9);
        }
    }
}
