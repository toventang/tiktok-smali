package com.ss.android.ugc.aweme.search.theme;

import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.theme.a.e;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3147a f121659d = new C3147a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final u<Integer> f121660a = new c(this);

    /* renamed from: b  reason: collision with root package name */
    public final androidx.fragment.app.e f121661b;

    /* renamed from: c  reason: collision with root package name */
    public final b f121662c;

    /* renamed from: e  reason: collision with root package name */
    private final h f121663e = i.a((h.f.a.a) new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f121664f = i.a((h.f.a.a) new e(this));

    public interface b {
        static {
            Covode.recordClassIndex(79247);
        }

        void a(float f2);

        void a(boolean z);

        void b(boolean z);

        void c(boolean z);
    }

    static {
        Covode.recordClassIndex(79245);
    }

    public final SearchIntermediateViewModel a() {
        return (SearchIntermediateViewModel) this.f121663e.getValue();
    }

    public final ViewPager.e c() {
        return (ViewPager.e) this.f121664f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.search.theme.a$a  reason: collision with other inner class name */
    static final class C3147a {
        static {
            Covode.recordClassIndex(79246);
        }

        private C3147a() {
        }

        public /* synthetic */ C3147a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(79250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new ViewPager.e(this) {
                /* class com.ss.android.ugc.aweme.search.theme.a.e.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ e f121693a;

                /* renamed from: b  reason: collision with root package name */
                private boolean f121694b;

                /* renamed from: c  reason: collision with root package name */
                private Integer f121695c;

                static {
                    Covode.recordClassIndex(79251);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f121693a = r1;
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageScrollStateChanged(int i2) {
                    if (i2 == 0) {
                        this.f121694b = false;
                        this.f121695c = null;
                    } else if (i2 == 1) {
                        if (!this.f121694b) {
                            this.f121695c = Integer.valueOf(this.f121693a.this$0.b());
                        }
                        this.f121694b = true;
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageSelected(int i2) {
                    boolean z = false;
                    if (this.f121695c != null) {
                        h.j.g gVar = new h.j.g(0, 1);
                        Integer num = this.f121695c;
                        if (num != null && gVar.a(num.intValue())) {
                            b bVar = this.f121693a.this$0.f121662c;
                            if (i2 == 0) {
                                z = true;
                            }
                            bVar.a(z);
                        }
                    } else if (i2 != 0) {
                        this.f121693a.this$0.f121662c.c(true);
                    } else {
                        this.f121693a.this$0.f121662c.b(true);
                    }
                }

                @Override // androidx.viewpager.widget.ViewPager.e
                public final void onPageScrolled(int i2, float f2, int i3) {
                    float f3;
                    if (this.f121694b && i2 == 0) {
                        Float valueOf = Float.valueOf(f2);
                        if (valueOf.floatValue() > 0.99f || valueOf == null) {
                            f3 = 1.0f;
                        } else {
                            f3 = valueOf.floatValue();
                        }
                        this.f121693a.this$0.f121662c.a(f3);
                    }
                }
            };
        }
    }

    static final class d extends m implements h.f.a.a<SearchIntermediateViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(79249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchIntermediateViewModel invoke() {
            return ae.a(this.this$0.f121661b, (ad.b) null).a(SearchIntermediateViewModel.class);
        }
    }

    public final void d() {
        this.f121661b.runOnUiThread(new f(this));
    }

    public final void e() {
        this.f121661b.runOnUiThread(new g(this));
    }

    public final int b() {
        Integer value = a().getSearchTabIndex().getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121696a;

        static {
            Covode.recordClassIndex(79252);
        }

        f(a aVar) {
            this.f121696a = aVar;
        }

        public final void run() {
            this.f121696a.a().getIntermediateState().observe(this.f121696a.f121661b, this.f121696a.f121660a);
            com.ss.android.ugc.d.a.c.a(new e(true, this.f121696a.c()));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121697a;

        static {
            Covode.recordClassIndex(79253);
        }

        g(a aVar) {
            this.f121697a = aVar;
        }

        public final void run() {
            this.f121697a.a().getIntermediateState().removeObserver(this.f121697a.f121660a);
            com.ss.android.ugc.d.a.c.a(new e(false, this.f121697a.c()));
        }
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121670a;

        static {
            Covode.recordClassIndex(79248);
        }

        c(a aVar) {
            this.f121670a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            if (num.intValue() == 1 || num.intValue() == 2) {
                this.f121670a.f121662c.c(false);
            } else if (num.intValue() != 0) {
            } else {
                if (this.f121670a.b() == j.f121154b) {
                    this.f121670a.f121662c.b(false);
                } else {
                    this.f121670a.f121662c.c(false);
                }
            }
        }
    }

    public a(androidx.fragment.app.e eVar, b bVar) {
        l.d(eVar, "");
        l.d(bVar, "");
        this.f121661b = eVar;
        this.f121662c = bVar;
    }
}
