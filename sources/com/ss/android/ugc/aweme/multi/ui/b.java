package com.ss.android.ugc.aweme.multi.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.anchor.multi.ui.BoundedRelativeLayout;
import com.ss.android.ugc.aweme.multi.d;
import com.ss.android.ugc.aweme.multi.maker.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends com.google.android.material.bottomsheet.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f111032a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private a f111033b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f111034c;

    /* renamed from: d  reason: collision with root package name */
    private final d f111035d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f111036e;

    static {
        Covode.recordClassIndex(71262);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71263);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f111033b;
        if (aVar != null) {
            l.d(aVar, "");
            com.bytedance.ies.foundation.activity.c cVar = com.bytedance.ies.foundation.activity.a.callback;
            l.d(aVar, "");
            cVar.f33830a.remove(aVar);
            this.f111033b = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final BottomSheetBehavior<View> b() {
        try {
            BoundedRelativeLayout boundedRelativeLayout = (BoundedRelativeLayout) findViewById(R.id.k_);
            l.b(boundedRelativeLayout, "");
            ViewParent parent = boundedRelativeLayout.getParent();
            if (parent != null) {
                return BottomSheetBehavior.a((View) parent);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void dismiss() {
        super.dismiss();
        for (com.ss.android.ugc.aweme.multi.c cVar : this.f111035d.f110896a) {
            Context context = getContext();
            l.b(context, "");
            while (true) {
                if (context == null) {
                    break;
                } else if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    Activity activity = (Activity) context;
                    if (activity != null) {
                        cVar.a(activity, this);
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (com.ss.android.ugc.aweme.multi.c cVar : this.f111035d.f110896a) {
            if (cVar instanceof o) {
                ((o) cVar).f110995i = SystemClock.elapsedRealtime();
            }
        }
        a aVar = new a(this.f111035d, this);
        this.f111033b = aVar;
        a.C0737a.a(aVar);
    }

    private final void c() {
        for (com.ss.android.ugc.aweme.multi.c cVar : this.f111035d.f110896a) {
            if (this.f111036e) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.jj);
                l.b(linearLayout, "");
                cVar.b(linearLayout, this, com.ss.android.ugc.aweme.anchor.multi.a.b.b(this.f111035d, cVar, true));
            } else {
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.jj);
                l.b(linearLayout2, "");
                cVar.a(linearLayout2, this, com.ss.android.ugc.aweme.anchor.multi.a.b.b(this.f111035d, cVar, true));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.ui.b$b  reason: collision with other inner class name */
    public static final class View$OnLayoutChangeListenerC2840b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f111037a;

        static {
            Covode.recordClassIndex(71264);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC2840b(b bVar) {
            this.f111037a = bVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            l.d(view, "");
            b bVar = this.f111037a;
            int measuredHeight = view.getMeasuredHeight();
            BottomSheetBehavior<View> b2 = bVar.b();
            if (b2 != null) {
                b2.b(measuredHeight);
            }
            view.removeOnLayoutChangeListener(this);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f111038a;

        static {
            Covode.recordClassIndex(71265);
        }

        c(b bVar) {
            this.f111038a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f111038a.dismiss();
        }
    }

    @Override // com.google.android.material.bottomsheet.a, androidx.appcompat.app.h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int b2 = n.b(this.f111034c) - n.e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b2 == 0) {
                b2 = -1;
            }
            window.setLayout(-1, b2);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.c9);
            View findViewById = window.findViewById(R.id.akq);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        setContentView(R.layout.x3);
        double b3 = (double) n.b(getContext());
        Double.isNaN(b3);
        ((BoundedRelativeLayout) findViewById(R.id.k_)).setMaxHeight((int) (b3 * 0.73d));
        c();
        ((TuxIconView) findViewById(R.id.k9)).setOnClickListener(new c(this));
        BoundedRelativeLayout boundedRelativeLayout = (BoundedRelativeLayout) findViewById(R.id.k_);
        l.b(boundedRelativeLayout, "");
        boundedRelativeLayout.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC2840b(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, d dVar, boolean z) {
        super(context, R.style.wp);
        l.d(context, "");
        l.d(dVar, "");
        this.f111034c = context;
        this.f111035d = dVar;
        this.f111036e = z;
    }
}
