package com.ss.android.ugc.aweme.hybridkit.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hybrid.spark.a.i;
import com.bytedance.hybrid.spark.d.l;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public View f99738a;

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final a f99739a = new a();

        static {
            Covode.recordClassIndex(63576);
        }

        a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.hybridkit.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC2444b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final View$OnClickListenerC2444b f99740a = new View$OnClickListenerC2444b();

        static {
            Covode.recordClassIndex(63577);
        }

        View$OnClickListenerC2444b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f99741a = new c();

        static {
            Covode.recordClassIndex(63578);
        }

        c() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(63575);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void b(int i2) {
        View view = this.f99738a;
        if (view == null) {
            l.a("rootView");
        }
        view.setBackgroundColor(i2);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void a(int i2) {
        View view = this.f99738a;
        if (view == null) {
            l.a("rootView");
        }
        ((TuxTextView) view.findViewById(R.id.f9l)).setTextColor(i2);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void b(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        View view = this.f99738a;
        if (view == null) {
            l.a("rootView");
        }
        view.findViewById(R.id.bhq).setOnClickListener(onClickListener);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final View a(Context context) {
        MethodCollector.i(10104);
        l.d(context, "");
        View inflate = LayoutInflater.from(context).inflate(R.layout.b19, (ViewGroup) null);
        l.b(inflate, "");
        this.f99738a = inflate;
        if (inflate == null) {
            l.a("rootView");
        }
        inflate.setMinimumHeight((int) context.getResources().getDimension(R.dimen.tn));
        View view = this.f99738a;
        if (view == null) {
            l.a("rootView");
        }
        MethodCollector.o(10104);
        return view;
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void a(View.OnClickListener onClickListener) {
        l.d(onClickListener, "");
        View view = this.f99738a;
        if (view == null) {
            l.a("rootView");
        }
        view.findViewById(R.id.bhp).setOnClickListener(onClickListener);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void a(l.a.EnumC0657a aVar) {
        h.f.b.l.d(aVar, "");
        View view = this.f99738a;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById = view.findViewById(R.id.y5);
        View view2 = this.f99738a;
        if (view2 == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.zg);
        View view3 = this.f99738a;
        if (view3 == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.zo);
        findViewById.setOnClickListener(a.f99739a);
        findViewById2.setOnClickListener(View$OnClickListenerC2444b.f99740a);
        findViewById3.setOnClickListener(c.f99741a);
        int i2 = c.f99742a[aVar.ordinal()];
        if (i2 == 1) {
            h.f.b.l.b(findViewById, "");
            findViewById.setVisibility(0);
        } else if (i2 == 2) {
            h.f.b.l.b(findViewById2, "");
            findViewById2.setVisibility(0);
        } else if (i2 == 3) {
            h.f.b.l.b(findViewById3, "");
            findViewById3.setVisibility(0);
        }
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void a(String str) {
        h.f.b.l.d(str, "");
        View view = this.f99738a;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById = view.findViewById(R.id.f9l);
        h.f.b.l.b(findViewById, "");
        ((TuxTextView) findViewById).setText(str);
    }

    @Override // com.bytedance.hybrid.spark.a.i
    public final void a(boolean z) {
        int i2;
        View view = this.f99738a;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        View findViewById = view.findViewById(R.id.bhq);
        h.f.b.l.b(findViewById, "");
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }
}
