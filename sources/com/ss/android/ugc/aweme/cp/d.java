package com.ss.android.ugc.aweme.cp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.b;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.ss.android.ugc.aweme.utils.ag;
import h.f.b.l;
import h.g.a;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    public View f78255a;

    /* renamed from: b  reason: collision with root package name */
    public View f78256b;

    /* renamed from: c  reason: collision with root package name */
    public View f78257c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f78258d;

    static {
        Covode.recordClassIndex(48524);
    }

    public static Drawable d() {
        if (!b()) {
            return null;
        }
        Drawable a2 = a(2131233109);
        Drawable a3 = a(2131232310);
        if (a2 == null || a3 == null) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842913}, a2);
        stateListDrawable.addState(new int[]{16842913}, a3);
        return stateListDrawable;
    }

    @Override // com.ss.android.ugc.aweme.cp.a
    public final void a() {
        View view = this.f78255a;
        if (view != null) {
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            i.b(view, null, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 9.5f, system.getDisplayMetrics()))), null, false, 27);
        }
        View view2 = this.f78256b;
        if (view2 != null) {
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            int a2 = a.a(TypedValue.applyDimension(1, 45.0f, system2.getDisplayMetrics()));
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            i.a(view2, a2, a.a(TypedValue.applyDimension(1, 45.0f, system3.getDisplayMetrics())));
        }
        View view3 = this.f78257c;
        if (view3 != null) {
            Resources system4 = Resources.getSystem();
            l.a((Object) system4, "");
            int a3 = a.a(TypedValue.applyDimension(1, 45.0f, system4.getDisplayMetrics()));
            Resources system5 = Resources.getSystem();
            l.a((Object) system5, "");
            i.a(view3, a3, a.a(TypedValue.applyDimension(1, 45.0f, system5.getDisplayMetrics())));
        }
        TextView textView = this.f78258d;
        if (textView != null) {
            textView.setTextSize(1, 11.0f);
            Resources system6 = Resources.getSystem();
            l.a((Object) system6, "");
            i.a((View) textView, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 12.0f, system6.getDisplayMetrics()))), false, 23);
            Resources system7 = Resources.getSystem();
            l.a((Object) system7, "");
            i.b(textView, null, Integer.valueOf(a.a(TypedValue.applyDimension(1, 2.0f, system7.getDisplayMetrics()))), null, null, false, 29);
        }
    }

    private static Drawable a(int i2) {
        MethodCollector.i(9068);
        Drawable a2 = b.a(com.bytedance.ies.ugc.appcontext.d.a(), i2);
        if (a2 == null) {
            MethodCollector.o(9068);
            return null;
        }
        l.b(a2, "");
        int intrinsicWidth = a2.getIntrinsicWidth();
        int intrinsicHeight = a2.getIntrinsicHeight();
        Bitmap a3 = ag.a(a2);
        Matrix matrix = new Matrix();
        matrix.postScale(0.9f, 0.9f);
        Bitmap createBitmap = Bitmap.createBitmap(a3, 0, 0, intrinsicWidth, intrinsicHeight, matrix, true);
        l.b(a3, "");
        if (!a3.isRecycled()) {
            a3.recycle();
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(Resources.getSystem(), createBitmap);
        bitmapDrawable.setTargetDensity(n.d(com.bytedance.ies.ugc.appcontext.d.a()));
        MethodCollector.o(9068);
        return bitmapDrawable;
    }
}
