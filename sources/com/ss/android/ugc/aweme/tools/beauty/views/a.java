package com.ss.android.ugc.aweme.tools.beauty.views;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(91044);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC3676a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog f139250a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C3665a f139251b;

        static {
            Covode.recordClassIndex(91045);
        }

        View$OnClickListenerC3676a(AlertDialog alertDialog, a.C3665a aVar) {
            this.f139250a = alertDialog;
            this.f139251b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.b bVar = this.f139251b.f138930f;
            if (bVar != null) {
                bVar.b();
            }
            this.f139250a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AlertDialog f139252a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C3665a f139253b;

        static {
            Covode.recordClassIndex(91046);
        }

        b(AlertDialog alertDialog, a.C3665a aVar) {
            this.f139252a = alertDialog;
            this.f139253b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a.b bVar = this.f139253b.f138930f;
            if (bVar != null) {
                bVar.a();
            }
            this.f139252a.dismiss();
        }
    }

    public static void a(a.C3665a aVar) {
        MethodCollector.i(11927);
        l.d(aVar, "");
        Context context = aVar.f138925a;
        if (context != null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.lx, (ViewGroup) null);
            l.b(inflate, "");
            View findViewById = inflate.findViewById(R.id.f9l);
            l.b(findViewById, "");
            TextView textView = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.exf);
            l.b(findViewById2, "");
            TextView textView2 = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.f1p);
            l.b(findViewById3, "");
            TextView textView3 = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.f67);
            l.b(findViewById4, "");
            TextView textView4 = (TextView) findViewById4;
            AlertDialog show = new AlertDialog.Builder(context).setCancelable(false).setView(inflate).show();
            l.b(show, "");
            Window window = show.getWindow();
            if (window != null) {
                l.b(window, "");
                window.setLayout(r.a(context) - ((int) r.a(context, 80.0f)), window.getAttributes().height);
            }
            textView.setText(aVar.f138926b);
            textView2.setText(aVar.f138927c);
            textView3.setText(aVar.f138929e);
            textView4.setText(aVar.f138928d);
            textView3.setOnClickListener(new View$OnClickListenerC3676a(show, aVar));
            textView4.setOnClickListener(new b(show, aVar));
            MethodCollector.o(11927);
            return;
        }
        MethodCollector.o(11927);
    }
}
