package com.bytedance.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.b.a.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.widget.b;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f46141a = {new y(ab.a(c.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;"), new y(ab.a(c.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;")};

    /* renamed from: h  reason: collision with root package name */
    public static final a f46142h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    final h f46143b;

    /* renamed from: c  reason: collision with root package name */
    final h f46144c;

    /* renamed from: d  reason: collision with root package name */
    public final CopyOnWriteArrayList<Widget> f46145d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    final HashMap<Widget, ViewGroup> f46146e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public b f46147f;

    /* renamed from: g  reason: collision with root package name */
    public final androidx.lifecycle.i f46148g;

    /* renamed from: i  reason: collision with root package name */
    private final View f46149i;

    public static final class a {
        static {
            Covode.recordClassIndex(28193);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static c a(Fragment fragment, View view) {
            l.c(fragment, "");
            if (fragment == null) {
                l.a();
            }
            androidx.fragment.app.i childFragmentManager = fragment.getChildFragmentManager();
            l.a((Object) childFragmentManager, "");
            Fragment a2 = childFragmentManager.a(b.f46132d);
            if (!(a2 instanceof b)) {
                a2 = null;
            }
            b bVar = (b) a2;
            if (bVar == null) {
                bVar = new b();
                bVar.f46134a = fragment;
                androidx.fragment.app.i fragmentManager = fragment.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.a((i.b) new b.a.C1147a(bVar), false);
                }
                childFragmentManager.a().a(bVar, b.f46132d).e();
            }
            androidx.lifecycle.i lifecycle = bVar.getLifecycle();
            l.a((Object) lifecycle, "");
            return a(lifecycle, bVar, view);
        }

        public static c a(androidx.lifecycle.i iVar, b bVar, View view) {
            l.c(iVar, "");
            l.c(bVar, "");
            c a2 = bVar.a(iVar);
            if (a2 != null) {
                return a2;
            }
            c cVar = new c(bVar, view, iVar);
            bVar.a(iVar, cVar);
            return cVar;
        }
    }

    static final class b extends m implements h.f.a.a<androidx.b.a.a> {
        final /* synthetic */ b $widgetHost;

        static {
            Covode.recordClassIndex(28194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(b bVar) {
            super(0);
            this.$widgetHost = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ androidx.b.a.a invoke() {
            return new androidx.b.a.a(this.$widgetHost.a());
        }
    }

    static final class e extends m implements h.f.a.a<LayoutInflater> {
        final /* synthetic */ b $widgetHost;

        static {
            Covode.recordClassIndex(28198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.$widgetHost = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LayoutInflater invoke() {
            return LayoutInflater.from(this.$widgetHost.a());
        }
    }

    public final b a() {
        b bVar = this.f46147f;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static {
        Covode.recordClassIndex(28191);
    }

    /* renamed from: com.bytedance.widget.c$c  reason: collision with other inner class name */
    static final class C1148c extends m implements h.f.a.b<ViewGroup, z> {
        final /* synthetic */ a $inflater;
        final /* synthetic */ Widget $widget;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(28195);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1148c(c cVar, Widget widget, a aVar) {
            super(1);
            this.this$0 = cVar;
            this.$widget = widget;
            this.$inflater = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            c cVar = this.this$0;
            Widget widget = this.$widget;
            cVar.a(widget, viewGroup2, this.$inflater.a(widget.b(), viewGroup2));
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<ViewGroup, z> {
        final /* synthetic */ boolean $asyncInflate;
        final /* synthetic */ Widget $widget;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(28196);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar, boolean z, Widget widget) {
            super(1);
            this.this$0 = cVar;
            this.$asyncInflate = z;
            this.$widget = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(ViewGroup viewGroup) {
            final ViewGroup viewGroup2 = viewGroup;
            l.c(viewGroup2, "");
            if (this.$asyncInflate) {
                ((androidx.b.a.a) this.this$0.f46143b.getValue()).a(this.$widget.b(), viewGroup2, new a.d(this) {
                    /* class com.bytedance.widget.c.d.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ d f46150a;

                    static {
                        Covode.recordClassIndex(28197);
                    }

                    {
                        this.f46150a = r1;
                    }

                    @Override // androidx.b.a.a.d
                    public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                        l.c(view, "");
                        if (this.f46150a.this$0.f46147f != null && !this.f46150a.this$0.a().isDetached() && !this.f46150a.this$0.a().isRemoving() && this.f46150a.this$0.f46148g.a() != i.b.DESTROYED) {
                            this.f46150a.this$0.a(this.f46150a.$widget, viewGroup2, view);
                        }
                    }
                });
            } else {
                c cVar = this.this$0;
                Widget widget = this.$widget;
                View a2 = com.a.a((LayoutInflater) cVar.f46144c.getValue(), this.$widget.b(), viewGroup2, false);
                l.a((Object) a2, "");
                cVar.a(widget, viewGroup2, a2);
            }
            return z.f158842a;
        }
    }

    public final c a(Widget widget) {
        l.c(widget, "");
        if (this.f46145d.contains(widget)) {
            return this;
        }
        widget.f46124b = a();
        this.f46145d.add(widget);
        a().a(widget);
        this.f46148g.a(widget);
        return this;
    }

    public final c a(int i2, Widget widget, boolean z) {
        l.c(widget, "");
        a(i2, widget, new d(this, z, widget));
        return this;
    }

    private final c a(int i2, Widget widget, h.f.a.b<? super ViewGroup, z> bVar) {
        if (widget.b() <= 0) {
            return a(widget);
        }
        View view = this.f46149i;
        if (view != null) {
            widget.f46124b = a();
            ViewGroup viewGroup = (ViewGroup) view.findViewById(i2);
            l.a((Object) viewGroup, "");
            widget.a(viewGroup);
            this.f46146e.put(widget, viewGroup);
            bVar.invoke(viewGroup);
            return this;
        }
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView".toString());
    }

    public c(b bVar, View view, androidx.lifecycle.i iVar) {
        l.c(bVar, "");
        l.c(iVar, "");
        this.f46149i = view;
        this.f46148g = iVar;
        this.f46143b = h.i.a((h.f.a.a) new b(bVar));
        this.f46144c = h.i.a((h.f.a.a) new e(bVar));
        this.f46147f = bVar;
        AnonymousClass1 r1 = new h.f.a.a<z>(this) {
            /* class com.bytedance.widget.c.AnonymousClass1 */
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(28192);
            }

            {
                this.this$0 = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                MethodCollector.i(1973);
                for (T t : this.this$0.f46145d) {
                    c cVar = this.this$0;
                    l.a((Object) t, "");
                    l.c(t, "");
                    cVar.f46148g.b(t);
                    int i2 = d.f46152a[cVar.f46148g.a().ordinal()];
                    if (i2 != 2) {
                        if (i2 == 3) {
                            t.destroy$widget_release();
                        } else if (i2 == 4) {
                            t.stop$widget_release();
                            t.destroy$widget_release();
                        } else if (i2 == 5) {
                            t.pause$widget_release();
                            t.stop$widget_release();
                            t.destroy$widget_release();
                        }
                    } else if (!t.f46125c) {
                        t.destroy$widget_release();
                    }
                    t.f46124b = null;
                    cVar.f46145d.remove(t);
                    if (cVar.f46146e.containsKey(t)) {
                        ViewGroup viewGroup = cVar.f46146e.get(t);
                        if (viewGroup == null) {
                            l.a();
                        }
                        viewGroup.removeAllViews();
                        cVar.f46146e.remove(t);
                    }
                    b a2 = cVar.a();
                    l.c(t, "");
                    Iterator<T> it = a2.f46135b.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
                this.this$0.f46145d.clear();
                this.this$0.f46147f = null;
                z zVar = z.f158842a;
                MethodCollector.o(1973);
                return zVar;
            }
        };
        l.c(r1, "");
        bVar.f46136c.add(r1);
    }

    public final c a(int i2, Widget widget, a aVar) {
        l.c(widget, "");
        l.c(aVar, "");
        a(i2, widget, new C1148c(this, widget, aVar));
        return this;
    }

    public final void a(Widget widget, ViewGroup viewGroup, View view) {
        MethodCollector.i(2716);
        l.c(view, "");
        widget.f46127e = view;
        viewGroup.addView(view);
        this.f46145d.add(widget);
        a().a(widget);
        this.f46148g.a(widget);
        MethodCollector.o(2716);
    }
}
