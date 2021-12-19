package com.ss.android.ugc.aweme.search.theme.dark;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.theme.a;
import com.ss.android.ugc.aweme.search.theme.dark.c;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.eg;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.concurrent.ConcurrentHashMap;

public final class DarkThemeController implements View.OnAttachStateChangeListener, a.b, c.AbstractC3151c, eg {

    /* renamed from: h  reason: collision with root package name */
    public static final a f121711h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f121712a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f121713b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f121714c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.search.theme.c f121715d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.fragment.app.e f121716e;

    /* renamed from: f  reason: collision with root package name */
    public final RecyclerView f121717f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.flowfeed.a.a f121718g;

    /* renamed from: i  reason: collision with root package name */
    private final h f121719i = i.a((h.f.a.a) new e(this));

    /* renamed from: j  reason: collision with root package name */
    private final h f121720j = i.a((h.f.a.a) new c(this));

    /* renamed from: k  reason: collision with root package name */
    private final h f121721k = i.a((h.f.a.a) new f(this));

    /* renamed from: l  reason: collision with root package name */
    private final h f121722l = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(79274);
    }

    private final a g() {
        return (a) this.f121722l.getValue();
    }

    public final com.ss.android.ugc.aweme.search.theme.a a() {
        return (com.ss.android.ugc.aweme.search.theme.a) this.f121719i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void a(float f2) {
    }

    public final c b() {
        return (c) this.f121720j.getValue();
    }

    public final ThemeViewModel c() {
        return (ThemeViewModel) this.f121721k.getValue();
    }

    public final void onViewAttachedToWindow(View view) {
    }

    static final class a {
        static {
            Covode.recordClassIndex(79275);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        eg.a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        eg.a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        eg.a.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_START)
    public final void onStart() {
        eg.a.onStart(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_STOP)
    public final void onStop() {
        eg.a.onStop(this);
    }

    static final class c extends m implements h.f.a.a<c> {
        final /* synthetic */ DarkThemeController this$0;

        static {
            Covode.recordClassIndex(79277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(DarkThemeController darkThemeController) {
            super(0);
            this.this$0 = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c(this.this$0.f121717f, this.this$0.f121718g, this.this$0);
        }
    }

    static final class e extends m implements h.f.a.a<com.ss.android.ugc.aweme.search.theme.a> {
        final /* synthetic */ DarkThemeController this$0;

        static {
            Covode.recordClassIndex(79279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(DarkThemeController darkThemeController) {
            super(0);
            this.this$0 = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.search.theme.a invoke() {
            return new com.ss.android.ugc.aweme.search.theme.a(this.this$0.f121716e, this.this$0);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.theme.dark.c.AbstractC3151c
    public final void f() {
        com.ss.android.ugc.aweme.search.theme.c cVar = this.f121715d;
        if (cVar != null) {
            g().a(cVar);
        }
    }

    static final class f extends m implements h.f.a.a<ThemeViewModel> {
        final /* synthetic */ DarkThemeController this$0;

        static {
            Covode.recordClassIndex(79280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(DarkThemeController darkThemeController) {
            super(0);
            this.this$0 = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ThemeViewModel invoke() {
            ac a2 = ae.a(this.this$0.f121716e, (ad.b) null).a(ThemeViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    private void h() {
        this.f121717f.removeOnAttachStateChangeListener(this);
        a().e();
        b().b();
    }

    public final void d() {
        if (this.f121714c) {
            h();
            this.f121715d = null;
            this.f121712a = false;
            c().a(new com.ss.android.ugc.aweme.search.theme.c("light", -1, (Integer) null, 12));
        }
    }

    @Override // com.ss.android.ugc.aweme.search.theme.dark.c.AbstractC3151c
    public final void e() {
        g().a(new com.ss.android.ugc.aweme.search.theme.c("light", -1, (Integer) null, 12));
    }

    static final class b extends m implements h.f.a.a<a> {
        final /* synthetic */ DarkThemeController this$0;

        static {
            Covode.recordClassIndex(79276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(DarkThemeController darkThemeController) {
            super(0);
            this.this$0 = darkThemeController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            a aVar = new a(this.this$0.c());
            aVar.setFloatValues(0.0f, 1.0f);
            aVar.setDuration(250L);
            return aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onDestroy() {
        Integer num;
        eg.a.onDestroy(this);
        Fragment g2 = this.f121718g.g();
        if (g2 != null) {
            num = Integer.valueOf(g2.hashCode());
        } else {
            num = null;
        }
        ConcurrentHashMap<Integer, com.ss.android.ugc.aweme.search.j.a> concurrentHashMap = b.a().get(num);
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        h();
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void a(boolean z) {
        if (z) {
            b(true);
        } else {
            c(true);
        }
    }

    public final void a(com.ss.android.ugc.aweme.search.theme.c cVar) {
        l.d(cVar, "");
        this.f121715d = cVar;
        if (this.f121713b) {
            c().a(cVar);
            this.f121714c = true;
        } else {
            this.f121712a = true;
        }
        c().b().observe(this.f121716e, new d(this));
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void b(boolean z) {
        com.ss.android.ugc.aweme.search.theme.c cVar;
        b().a();
        com.ss.android.ugc.aweme.search.theme.c cVar2 = this.f121715d;
        if ((cVar2 != null && cVar2.f121706c != null && !b().a()) || (cVar = this.f121715d) == null) {
            return;
        }
        if (z) {
            g().a(cVar);
        } else {
            c().a(cVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.theme.a.b
    public final void c(boolean z) {
        b().a();
        com.ss.android.ugc.aweme.search.theme.c cVar = this.f121715d;
        if (cVar == null || cVar.f121706c == null || b().a()) {
            com.ss.android.ugc.aweme.search.theme.c cVar2 = new com.ss.android.ugc.aweme.search.theme.c("light", -1, (Integer) null, 12);
            if (z) {
                g().a(cVar2);
            } else {
                c().a(cVar2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DarkThemeController f121723a;

        static {
            Covode.recordClassIndex(79278);
        }

        d(DarkThemeController darkThemeController) {
            this.f121723a = darkThemeController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            if (((Boolean) obj).booleanValue() && this.f121723a.f121715d != null) {
                this.f121723a.f121717f.removeOnAttachStateChangeListener(this.f121723a);
                this.f121723a.f121717f.addOnAttachStateChangeListener(this.f121723a);
                this.f121723a.a().d();
                com.ss.android.ugc.aweme.search.theme.c cVar = this.f121723a.f121715d;
                if (cVar != null && (num = cVar.f121706c) != null) {
                    int intValue = num.intValue();
                    c b2 = this.f121723a.b();
                    b2.f121739b = Integer.valueOf(intValue);
                    b2.f121740c.b(b2);
                    b2.f121740c.a(b2);
                }
            }
        }
    }

    public DarkThemeController(androidx.fragment.app.e eVar, RecyclerView recyclerView, com.ss.android.ugc.aweme.flowfeed.a.a aVar) {
        l.d(eVar, "");
        l.d(recyclerView, "");
        l.d(aVar, "");
        this.f121716e = eVar;
        this.f121717f = recyclerView;
        this.f121718g = aVar;
        ef.a(eVar, this);
    }
}
