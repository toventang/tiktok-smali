package com.ss.android.ugc.aweme.editSticker.compile;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.Callable;

final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f88106a;

    /* renamed from: b  reason: collision with root package name */
    private final int f88107b;

    /* renamed from: c  reason: collision with root package name */
    private final int f88108c;

    /* renamed from: d  reason: collision with root package name */
    private final View f88109d;

    /* renamed from: e  reason: collision with root package name */
    private final View f88110e;

    /* renamed from: f  reason: collision with root package name */
    private final int f88111f;

    /* renamed from: g  reason: collision with root package name */
    private final int f88112g;

    static {
        Covode.recordClassIndex(55389);
    }

    d(c cVar, int i2, int i3, View view, View view2, int i4, int i5) {
        this.f88106a = cVar;
        this.f88107b = i2;
        this.f88108c = i3;
        this.f88109d = view;
        this.f88110e = view2;
        this.f88111f = i4;
        this.f88112g = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MethodCollector.i(1946);
        int i2 = this.f88107b;
        int i3 = this.f88108c;
        View view = this.f88109d;
        View view2 = this.f88110e;
        int i4 = this.f88111f;
        int i5 = this.f88112g;
        if (i2 == 0) {
            i2 = com.ss.android.ugc.aweme.editSticker.d.c().f88094a;
        }
        if (i3 == 0) {
            i3 = com.ss.android.ugc.aweme.editSticker.d.c().f88095b;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        f fVar = new f(i2, i3, i4, i5);
        int childCount = viewGroup.getChildCount();
        View[] viewArr = new View[childCount];
        for (int childCount2 = viewGroup.getChildCount() - 1; childCount2 >= 0; childCount2--) {
            if (viewGroup.getChildAt(childCount2) != view2) {
                viewArr[childCount2] = viewGroup.getChildAt(childCount2);
                viewGroup.removeViewAt(childCount2);
            }
        }
        int visibility = view2.getVisibility();
        if (visibility != 0) {
            view2.setVisibility(0);
        }
        view2.invalidate();
        viewGroup.invalidate();
        Object invoke = fVar.invoke(viewGroup);
        if (visibility != 0) {
            view2.setVisibility(visibility);
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View view3 = viewArr[i6];
            if (view3 != null) {
                viewGroup.addView(view3, i6);
            }
        }
        g gVar = new g((Bitmap) invoke, Integer.valueOf(viewGroup.indexOfChild(view2)));
        MethodCollector.o(1946);
        return gVar;
    }
}
