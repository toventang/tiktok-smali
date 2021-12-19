package com.bytedance.tux.sheet.sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class TuxSheetHandle extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f45285a;

    /* renamed from: b  reason: collision with root package name */
    public float f45286b;

    /* renamed from: c  reason: collision with root package name */
    private int f45287c;

    /* renamed from: d  reason: collision with root package name */
    private final b f45288d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f45289e;

    public enum a {
        DEFAULT,
        BOTTOM,
        TOP;

        static {
            Covode.recordClassIndex(27585);
        }
    }

    static {
        Covode.recordClassIndex(27584);
    }

    public TuxSheetHandle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public final BottomSheetBehavior.a getBottomSheetCallback() {
        return this.f45288d;
    }

    public static final class b extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TuxSheetHandle f45291a;

        static {
            Covode.recordClassIndex(27586);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(TuxSheetHandle tuxSheetHandle) {
            this.f45291a = tuxSheetHandle;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            l.c(view, "");
            if (i2 == 3 || i2 == 4 || i2 == 5 || i2 == 6) {
                this.f45291a.f45285a = false;
                this.f45291a.a(a.DEFAULT);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            a aVar;
            l.c(view, "");
            if (!this.f45291a.f45285a) {
                this.f45291a.f45285a = true;
                this.f45291a.f45286b = f2;
            }
            if (f2 > this.f45291a.f45286b) {
                aVar = a.TOP;
            } else if (f2 < this.f45291a.f45286b) {
                aVar = a.BOTTOM;
            } else {
                aVar = a.DEFAULT;
            }
            this.f45291a.a(aVar);
        }
    }

    private final void setImageDrawable(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        l.a((Object) mutate, "");
        androidx.core.graphics.drawable.a.a(mutate, this.f45287c);
        if (this.f45289e == null) {
            this.f45289e = new HashMap();
        }
        View view = (View) this.f45289e.get(Integer.valueOf((int) R.id.e2p));
        if (view == null) {
            view = findViewById(R.id.e2p);
            this.f45289e.put(Integer.valueOf((int) R.id.e2p), view);
        }
        ((ImageView) view).setImageDrawable(mutate);
    }

    public final void a(a aVar) {
        int i2;
        int i3 = b.f45304a[aVar.ordinal()];
        if (i3 == 1) {
            i2 = R.drawable.f159956l;
        } else if (i3 != 2) {
            i2 = R.drawable.n;
        } else {
            i2 = R.drawable.f159957m;
        }
        Drawable a2 = androidx.core.content.b.a(getContext(), i2);
        if (a2 != null) {
            l.a((Object) a2, "");
            setImageDrawable(a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSheetHandle(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        l.c(context, "");
        MethodCollector.i(8276);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.eu, R.attr.ev, R.attr.ew, R.attr.ex, R.attr.ey, R.attr.ez, R.attr.f0, R.attr.f1, R.attr.f2, R.attr.f3, R.attr.f4, R.attr.f5, R.attr.f6, R.attr.f7, R.attr.f8, R.attr.f9, R.attr.f_, R.attr.fa, R.attr.fb, R.attr.fc}, R.attr.c3, 0);
        l.a((Object) obtainStyledAttributes, "");
        this.f45287c = obtainStyledAttributes.getColor(7, Color.parseColor("#33161823"));
        obtainStyledAttributes.recycle();
        this.f45288d = new b(this);
        com.a.a(LayoutInflater.from(context), R.layout.r, this, true);
        a(a.DEFAULT);
        MethodCollector.o(8276);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxSheetHandle(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? R.attr.c3 : i2);
    }
}
