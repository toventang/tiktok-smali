package com.ss.android.ugc.tools.a;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.tools.utils.r;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(98200);
    }

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f149081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f149082b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f149083c;

        static {
            Covode.recordClassIndex(98201);
        }

        public final void onGlobalLayout() {
            this.f149081a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = this.f149081a;
            int i2 = this.f149082b;
            int i3 = this.f149083c;
            while (true) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    if (viewGroup.getWidth() < i2 || viewGroup.getHeight() < i3) {
                        view = (View) parent;
                    } else {
                        com.ss.android.ugc.tools.c.f149151f.a("expandViewTouchArea: " + this.f149081a + ", " + viewGroup);
                        View view2 = this.f149081a;
                        int i4 = this.f149082b;
                        int i5 = this.f149083c;
                        TouchDelegate touchDelegate = viewGroup.getTouchDelegate();
                        if (touchDelegate instanceof b) {
                            ((b) touchDelegate).a(new a(i4, i5, viewGroup, view2));
                            return;
                        }
                        b bVar = new b(view2);
                        viewGroup.setTouchDelegate(bVar);
                        bVar.a(new a(i4, i5, viewGroup, view2));
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        a(View view, int i2, int i3) {
            this.f149081a = view;
            this.f149082b = i2;
            this.f149083c = i3;
        }
    }

    public static void a(View view) {
        if (view != null) {
            Context context = view.getContext();
            l.b(context, "");
            int a2 = (int) r.a(context, 48.0f);
            Context context2 = view.getContext();
            l.b(context2, "");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view, a2, (int) r.a(context2, 48.0f)));
        }
    }
}
