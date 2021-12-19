package com.bytedance.android.live.design.app.a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final CharSequence f9387a;

    /* renamed from: b  reason: collision with root package name */
    private final View.OnClickListener f9388b;

    static {
        Covode.recordClassIndex(4781);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f9389a;

        /* renamed from: b  reason: collision with root package name */
        public View.OnClickListener f9390b;

        static {
            Covode.recordClassIndex(4782);
        }

        public final b a() {
            return new b(this, (byte) 0);
        }

        public final a a(Context context) {
            if (context != null) {
                this.f9389a = context.getResources().getString(R.string.e5g);
            }
            return this;
        }
    }

    private b(a aVar) {
        this.f9387a = aVar.f9389a;
        this.f9388b = aVar.f9390b;
    }

    @Override // com.bytedance.android.live.design.app.a.a
    public final View a(Context context) {
        MethodCollector.i(2195);
        com.bytedance.android.live.design.widget.a.a aVar = new com.bytedance.android.live.design.widget.a.a(context);
        aVar.setText(this.f9387a);
        aVar.setOnClickListener(this.f9388b);
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(aVar, layoutParams);
        MethodCollector.o(2195);
        return frameLayout;
    }

    /* synthetic */ b(a aVar, byte b2) {
        this(aVar);
    }
}
