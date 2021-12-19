package com.bytedance.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.au;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;

public class Widget implements m, au {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f46123a = {new y(ab.a(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;"), new y(ab.a(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;")};

    /* renamed from: b  reason: collision with root package name */
    public b f46124b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f46125c;

    /* renamed from: d  reason: collision with root package name */
    protected ViewGroup f46126d;

    /* renamed from: e  reason: collision with root package name */
    public View f46127e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46128f = true;

    /* renamed from: g  reason: collision with root package name */
    private final h f46129g = h.i.a((h.f.a.a) new b(this));

    /* renamed from: h  reason: collision with root package name */
    private final h f46130h = h.i.a((h.f.a.a) new a(this));

    private final n k() {
        return (n) this.f46129g.getValue();
    }

    public int b() {
        return 0;
    }

    public void c() {
        this.f46125c = false;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
        this.f46125c = true;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            create$widget_release();
        } else if (aVar == i.a.ON_START) {
            start$widget_release();
        } else if (aVar == i.a.ON_RESUME) {
            resume$widget_release();
        } else if (aVar == i.a.ON_PAUSE) {
            pause$widget_release();
        } else if (aVar == i.a.ON_STOP) {
            stop$widget_release();
        } else if (aVar == i.a.ON_DESTROY) {
            destroy$widget_release();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ Widget this$0;

        static {
            Covode.recordClassIndex(28185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return k();
    }

    public final ViewGroup a() {
        ViewGroup viewGroup = this.f46126d;
        if (viewGroup == null) {
            l.a("container");
        }
        return viewGroup;
    }

    @v(a = i.a.ON_CREATE)
    public final void create$widget_release() {
        c();
        k().a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy$widget_release() {
        i();
        k().a(i.a.ON_DESTROY);
    }

    @v(a = i.a.ON_PAUSE)
    public final void pause$widget_release() {
        g();
        k().a(i.a.ON_PAUSE);
    }

    @v(a = i.a.ON_RESUME)
    public final void resume$widget_release() {
        f();
        k().a(i.a.ON_RESUME);
    }

    @v(a = i.a.ON_START)
    public final void start$widget_release() {
        e();
        k().a(i.a.ON_START);
    }

    @v(a = i.a.ON_STOP)
    public final void stop$widget_release() {
        h();
        k().a(i.a.ON_STOP);
    }

    static final class a extends h.f.b.m implements h.f.a.a<c> {
        final /* synthetic */ Widget this$0;

        static {
            Covode.recordClassIndex(28184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return c.a.a(this.this$0.getLifecycle(), this.this$0.j(), this.this$0.f46127e);
        }
    }

    public final b j() {
        b bVar = this.f46124b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    static {
        Covode.recordClassIndex(28183);
    }

    public final void a(ViewGroup viewGroup) {
        l.c(viewGroup, "");
        this.f46126d = viewGroup;
    }
}
