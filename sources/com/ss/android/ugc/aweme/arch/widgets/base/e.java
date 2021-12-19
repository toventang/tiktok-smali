package com.ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    private static final String f67025d = e.class.getCanonicalName();

    /* renamed from: a  reason: collision with root package name */
    public Fragment f67026a;

    /* renamed from: b  reason: collision with root package name */
    public DataCenter f67027b;

    /* renamed from: c  reason: collision with root package name */
    i.b f67028c = new i.b() {
        /* class com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass2 */

        static {
            Covode.recordClassIndex(41308);
        }

        @Override // androidx.fragment.app.i.b
        public final void onFragmentViewDestroyed(i iVar, Fragment fragment) {
            if (fragment == e.this.f67026a) {
                iVar.a(e.this.f67028c);
                fragment.getChildFragmentManager().a().a(e.this).e();
            }
        }
    };

    /* renamed from: e  reason: collision with root package name */
    private Thread f67029e;

    /* renamed from: f  reason: collision with root package name */
    private Handler f67030f = new Handler(Looper.getMainLooper());

    /* renamed from: g  reason: collision with root package name */
    private Widget.a f67031g = new Widget.a() {
        /* class com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass1 */

        static {
            Covode.recordClassIndex(41307);
        }

        @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget.a
        public final m a() {
            return e.this;
        }

        @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget.a
        public final Activity b() {
            return e.this.getActivity();
        }

        @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget.a
        public final void a(Intent intent, int i2) {
            e.this.startActivityForResult(intent, i2);
        }
    };

    /* renamed from: h  reason: collision with root package name */
    private View f67032h;

    /* renamed from: i  reason: collision with root package name */
    private Context f67033i;

    /* renamed from: j  reason: collision with root package name */
    private a f67034j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f67035k;

    /* renamed from: l  reason: collision with root package name */
    private List<Widget> f67036l = new CopyOnWriteArrayList();

    static {
        Covode.recordClassIndex(41306);
    }

    private boolean a() {
        if (this.f67029e == null) {
            this.f67029e = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == this.f67029e) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.e$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f67044a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 41311(0xa15f, float:5.7889E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                androidx.lifecycle.i$b[] r0 = androidx.lifecycle.i.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.f67044a = r2
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.f67044a     // Catch:{ NoSuchFieldError -> 0x0023 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.f67044a     // Catch:{ NoSuchFieldError -> 0x002e }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.STARTED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.f67044a     // Catch:{ NoSuchFieldError -> 0x0039 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.f67044a     // Catch:{ NoSuchFieldError -> 0x0044 }
                androidx.lifecycle.i$b r0 = androidx.lifecycle.i.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass5.<clinit>():void");
        }
    }

    public final e b(Widget widget) {
        MethodCollector.i(14175);
        if (widget == null) {
            MethodCollector.o(14175);
            return this;
        }
        getLifecycle().b(widget);
        int i2 = AnonymousClass5.f67044a[getLifecycle().a().ordinal()];
        if (i2 == 2) {
            widget.onDestroy();
        } else if (i2 == 3) {
            widget.onStop();
            widget.onDestroy();
        } else if (i2 == 4) {
            widget.onPause();
            widget.onStop();
            widget.onDestroy();
        }
        widget.f67011f = null;
        widget.f67010e = null;
        this.f67036l.remove(widget);
        if (widget.f67008c != widget.f67009d && (widget.f67008c instanceof ViewGroup)) {
            ((ViewGroup) widget.f67008c).removeAllViews();
        }
        MethodCollector.o(14175);
        return this;
    }

    public final e a(DataCenter dataCenter) {
        this.f67027b = dataCenter;
        for (Widget widget : this.f67036l) {
            widget.f67010e = dataCenter;
        }
        return this;
    }

    public final e a(Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f67011f = this.f67031g;
        widget.f67007b = this.f67033i;
        widget.f67010e = this.f67027b;
        this.f67036l.add(widget);
        getLifecycle().a(widget);
        return this;
    }

    public static e a(Fragment fragment, View view) {
        return a(null, fragment, view, fragment.getContext());
    }

    public final e b(int i2, Widget widget) {
        if (widget == null) {
            return this;
        }
        return a(this.f67032h.findViewById(i2), widget);
    }

    public final e a(int i2, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f67011f = this.f67031g;
        widget.f67007b = this.f67033i;
        widget.f67010e = this.f67027b;
        final ViewGroup viewGroup = (ViewGroup) this.f67032h.findViewById(i2);
        widget.f67008c = viewGroup;
        if (widget.c() == 0) {
            a(widget, viewGroup, null);
            return this;
        }
        this.f67034j.a(widget.c(), viewGroup, new a.d() {
            /* class com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass3 */

            static {
                Covode.recordClassIndex(41309);
            }

            @Override // androidx.b.a.a.d
            public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                if (!e.this.isRemoving() && !e.this.isDetached() && e.this.getLifecycle().a() != i.b.DESTROYED) {
                    e.this.a(widget, viewGroup, view);
                }
            }
        });
        return this;
    }

    public final e a(View view, final Widget widget) {
        if (widget == null) {
            return this;
        }
        widget.f67011f = this.f67031g;
        widget.f67007b = this.f67033i;
        widget.f67010e = this.f67027b;
        widget.f67009d = view;
        this.f67036l.add(widget);
        if (!a()) {
            this.f67030f.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.arch.widgets.base.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(41310);
                }

                public final void run() {
                    e.this.getLifecycle().a(widget);
                }
            });
            return this;
        }
        getLifecycle().a(widget);
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (Widget widget : this.f67036l) {
            widget.a(i2, i3, intent);
        }
    }

    public final void a(Widget widget, View view, View view2) {
        MethodCollector.i(14173);
        widget.f67009d = view2;
        if ((view instanceof ViewGroup) && view2 != null) {
            ((ViewGroup) view).addView(view2);
        }
        this.f67036l.add(widget);
        getLifecycle().a(widget);
        MethodCollector.o(14173);
    }

    public static e a(androidx.fragment.app.e eVar, Fragment fragment, View view, Context context) {
        androidx.fragment.app.i childFragmentManager;
        if (eVar != null) {
            childFragmentManager = eVar.getSupportFragmentManager();
        } else if (fragment == null) {
            return null;
        } else {
            childFragmentManager = fragment.getChildFragmentManager();
        }
        e eVar2 = new e();
        eVar2.f67026a = fragment;
        eVar2.f67032h = view;
        eVar2.f67033i = context;
        eVar2.f67034j = new a(eVar2.f67033i);
        eVar2.f67035k = LayoutInflater.from(eVar2.f67033i);
        if (!(fragment == null || fragment.getFragmentManager() == null)) {
            fragment.getFragmentManager().a(eVar2.f67028c, false);
        }
        childFragmentManager.a().a(eVar2, f67025d).e();
        return eVar2;
    }
}
