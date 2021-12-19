package com.bytedance.tux.tooltip;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tooltip.b;
import com.bytedance.tux.tooltip.b.a;
import com.bytedance.tux.tooltip.c;
import com.bytedance.tux.tooltip.popup.TuxTooltipPopupWindow;
import h.f.b.l;
import h.w;
import h.z;

public abstract class b<T extends b<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final d f45511a = new d();

    /* renamed from: b  reason: collision with root package name */
    public final Activity f45512b;

    /* renamed from: c  reason: collision with root package name */
    private a f45513c;

    public interface a {
        static {
            Covode.recordClassIndex(27706);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(27705);
    }

    public final T a(boolean z) {
        this.f45511a.v = z;
        return this;
    }

    public final T a(boolean z, View.OnClickListener onClickListener) {
        this.f45511a.y = z;
        this.f45511a.x = onClickListener;
        return this;
    }

    /* renamed from: com.bytedance.tux.tooltip.b$b  reason: collision with other inner class name */
    public static final class C1120b implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45527a;

        static {
            Covode.recordClassIndex(27707);
        }

        @Override // com.bytedance.tux.tooltip.c.b
        public final void a() {
            this.f45527a.invoke();
        }

        C1120b(h.f.a.a aVar) {
            this.f45527a = aVar;
        }
    }

    public static final class c implements c.AbstractC1121c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f45529a;

        static {
            Covode.recordClassIndex(27708);
        }

        @Override // com.bytedance.tux.tooltip.c.AbstractC1121c
        public final void onShow() {
            this.f45529a.invoke();
        }

        c(h.f.a.a aVar) {
            this.f45529a = aVar;
        }
    }

    public final T a() {
        this.f45511a.f45541k = true;
        return this;
    }

    public final T b() {
        this.f45511a.n = true;
        return this;
    }

    public a d() {
        a aVar = this.f45513c;
        if (aVar != null) {
            return aVar;
        }
        if (this.f45511a.f45534d != null) {
            return new a(this.f45512b, this.f45511a);
        }
        return new TuxTooltipPopupWindow(this.f45512b, this.f45511a);
    }

    public final T c() {
        d dVar = this.f45511a;
        Activity activity = this.f45512b;
        if (activity != null) {
            Window window = activity.getWindow();
            l.a((Object) window, "");
            View decorView = window.getDecorView();
            if (decorView != null) {
                dVar.f45534d = (ViewGroup) decorView;
                return this;
            }
            throw new w("null cannot be cast to non-null type");
        }
        throw new w("null cannot be cast to non-null type");
    }

    public final T c(int i2) {
        this.f45511a.f45538h = i2;
        return this;
    }

    public final T d(int i2) {
        this.f45511a.f45540j = i2;
        return this;
    }

    public final T a(int i2) {
        this.f45511a.f45532b = Integer.valueOf(i2);
        return this;
    }

    public final T b(int i2) {
        this.f45511a.f45537g = i2;
        return this;
    }

    public final T b(long j2) {
        this.f45511a.f45542l = j2;
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r1 == null) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        h.f.b.l.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.c(r3, r0)
            r2.<init>()
            com.bytedance.tux.tooltip.d r0 = new com.bytedance.tux.tooltip.d
            r0.<init>()
            r2.f45511a = r0
        L_0x000f:
            r1 = 0
            if (r3 == 0) goto L_0x001b
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0021
            r1 = r3
            android.app.Activity r1 = (android.app.Activity) r1
            if (r1 != 0) goto L_0x001e
        L_0x001b:
            h.f.b.l.a()
        L_0x001e:
            r2.f45512b = r1
            return
        L_0x0021:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x001b
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tux.tooltip.b.<init>(android.content.Context):void");
    }

    public final T a(long j2) {
        this.f45511a.f45539i = j2;
        return this;
    }

    public final T b(View view) {
        l.c(view, "");
        this.f45511a.f45533c = view;
        return this;
    }

    public final T a(View view) {
        l.c(view, "");
        this.f45511a.u = view;
        return this;
    }

    public final T b(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f45511a.A = new c(aVar);
        return this;
    }

    public final T a(a aVar) {
        l.c(aVar, "");
        this.f45511a.q = aVar;
        return this;
    }

    public final T b(boolean z) {
        this.f45511a.w = z;
        return this;
    }

    public final T a(c.AbstractC1121c cVar) {
        l.c(cVar, "");
        this.f45511a.A = cVar;
        return this;
    }

    public final T a(h hVar) {
        l.c(hVar, "");
        this.f45511a.a(hVar);
        return this;
    }

    public final T a(h.f.a.a<z> aVar) {
        l.c(aVar, "");
        this.f45511a.z = new C1120b(aVar);
        return this;
    }

    public final T a(int i2, int i3) {
        this.f45511a.r = i2;
        this.f45511a.s = i3;
        return this;
    }
}
