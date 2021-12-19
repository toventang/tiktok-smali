package com.bytedance.ies.bullet.service.popup.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32905a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static int f32906b;

    /* renamed from: com.bytedance.ies.bullet.service.popup.b.a$a  reason: collision with other inner class name */
    public interface AbstractC0717a {
        static {
            Covode.recordClassIndex(19650);
        }

        void a(int i2);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(19649);
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Window f32907a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f32908b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int[] f32909c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AbstractC0717a f32910d;

        static {
            Covode.recordClassIndex(19651);
        }

        b(Window window, Context context, int[] iArr, AbstractC0717a aVar) {
            this.f32907a = window;
            this.f32908b = context;
            this.f32909c = iArr;
            this.f32910d = aVar;
        }

        public final void onGlobalLayout() {
            int a2 = a.a(this.f32907a, this.f32908b);
            if (this.f32909c[0] != a2) {
                this.f32910d.a(a2);
                this.f32909c[0] = a2;
            }
        }
    }

    public static int a(Window window, Context context) {
        View decorView = window.getDecorView();
        l.a((Object) decorView, "");
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        Resources resources2 = context.getResources();
        l.a((Object) resources2, "");
        if (abs > dimensionPixelSize + resources2.getDimensionPixelSize(resources2.getIdentifier("navigation_bar_height", "dimen", "android"))) {
            return abs - f32906b;
        }
        f32906b = abs;
        return 0;
    }

    public static void a(Window window, Context context, AbstractC0717a aVar) {
        l.c(window, "");
        l.c(context, "");
        l.c(aVar, "");
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(16908290);
        b bVar = new b(window, context, new int[]{a(window, context)}, aVar);
        l.a((Object) frameLayout, "");
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(bVar);
        frameLayout.setTag(-8, bVar);
    }
}
