package com.ss.android.ugc.aweme.question.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.tux.c.f;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;

public final class a extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public final Context f120018a;

    /* renamed from: b  reason: collision with root package name */
    public final View f120019b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3097a f120020c;

    /* renamed from: d  reason: collision with root package name */
    private final View f120021d;

    /* renamed from: com.ss.android.ugc.aweme.question.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC3097a {
        static {
            Covode.recordClassIndex(77992);
        }

        void s();
    }

    static {
        Covode.recordClassIndex(77991);
    }

    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f120025a;

        static {
            Covode.recordClassIndex(77996);
        }

        public e(a aVar) {
            this.f120025a = aVar;
        }

        public final void run() {
            this.f120025a.dismiss();
        }
    }

    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f120024a;

        static {
            Covode.recordClassIndex(77995);
        }

        public d(a aVar) {
            this.f120024a = aVar;
        }

        public final void run() {
            int i2;
            a aVar = this.f120024a;
            View view = aVar.f120019b;
            Context context = aVar.f120018a;
            int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i2 = context.getResources().getDimensionPixelSize(identifier);
            } else {
                i2 = 0;
            }
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar.showAtLocation(view, 80, 0, (int) (((float) i2) + TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f120023a;

        static {
            Covode.recordClassIndex(77994);
        }

        c(a aVar) {
            this.f120023a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC3097a aVar = this.f120023a.f120020c;
            if (aVar != null) {
                aVar.s();
            }
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f120022a = new b();

        static {
            Covode.recordClassIndex(77993);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44776b = Integer.valueOf((int) R.attr.a2);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44777c = Float.valueOf(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, View view, AbstractC3097a aVar) {
        super(context);
        int i2;
        l.d(context, "");
        l.d(view, "");
        MethodCollector.i(12276);
        this.f120020c = aVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ari, (ViewGroup) null);
        this.f120021d = inflate;
        this.f120018a = context;
        this.f120019b = view;
        setContentView(inflate);
        Resources resources = context.getResources();
        l.a((Object) resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            i2 = displayMetrics.widthPixels;
        } else {
            i2 = 0;
        }
        setWidth(i2 - (((int) n.b(context, 12.0f)) * 2));
        setHeight(-2);
        setTouchable(true);
        setFocusable(false);
        setOutsideTouchable(false);
        setAnimationStyle(R.style.a0n);
        l.b(inflate, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.ahw);
        l.b(constraintLayout, "");
        constraintLayout.setBackground(f.a(b.f120022a).a(context));
        String string = g.c().getString(R.string.f5s);
        l.b(string, "");
        String a2 = p.a(p.a(string, "[", "<b><front>"), "]", "</front></b>");
        if (Build.VERSION.SDK_INT >= 24) {
            l.b(inflate, "");
            ((TuxTextView) inflate.findViewById(R.id.ahy)).setText(Html.fromHtml(a2, 63));
        } else {
            l.b(inflate, "");
            ((TuxTextView) inflate.findViewById(R.id.ahy)).setText(Html.fromHtml(a2));
        }
        l.b(inflate, "");
        ((TuxTextView) inflate.findViewById(R.id.ahy)).setOnClickListener(new c(this));
        setBackgroundDrawable(new ColorDrawable(0));
        MethodCollector.o(12276);
    }
}
