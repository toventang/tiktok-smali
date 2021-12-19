package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.zhiliaoapp.musically.R;

/* access modifiers changed from: package-private */
public final /* synthetic */ class dt implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131697a;

    static {
        Covode.recordClassIndex(86249);
    }

    dt(cj cjVar) {
        this.f131697a = cjVar;
    }

    public final void onClick(View view) {
        MethodCollector.i(10186);
        ClickAgent.onClick(view);
        cj cjVar = this.f131697a;
        if (cjVar.B.isChecked()) {
            cjVar.B.setChecked(true);
            View inflate = View.inflate(cjVar.getContext(), R.layout.agn, null);
            inflate.findViewById(R.id.cpq).setOnClickListener(du.f131698a);
            a.C0731a aVar = new a.C0731a(cjVar.getContext());
            aVar.s = inflate;
            a.C0731a b2 = aVar.a(R.string.et5, (DialogInterface.OnClickListener) new dv(cjVar), false).b(R.string.et3, (DialogInterface.OnClickListener) new dw(cjVar), false);
            b2.M = false;
            b2.a().c();
            MethodCollector.o(10186);
            return;
        }
        cjVar.B.setChecked(true);
        MethodCollector.o(10186);
    }
}
