package com.ss.android.ugc.aweme.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.z;

public final class iv {
    static {
        Covode.recordClassIndex(93685);
    }

    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f143120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143121b;

        static {
            Covode.recordClassIndex(93686);
        }

        public final void onGlobalLayout() {
            this.f143120a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f143121b.invoke();
        }

        public a(View view, h.f.a.a aVar) {
            this.f143120a = view;
            this.f143121b = aVar;
        }
    }

    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f143122a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f143123b;

        static {
            Covode.recordClassIndex(93687);
        }

        b(View view, h.f.a.a aVar) {
            this.f143122a = view;
            this.f143123b = aVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            this.f143122a.removeOnLayoutChangeListener(this);
            this.f143123b.invoke();
        }
    }

    public static final void a(View view, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        if (view != null) {
            view.addOnLayoutChangeListener(new b(view, aVar));
        }
    }
}
