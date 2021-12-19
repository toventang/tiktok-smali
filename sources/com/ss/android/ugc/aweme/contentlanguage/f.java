package com.ss.android.ugc.aweme.contentlanguage;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.setting.serverpush.a.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final d f78168a;

    /* renamed from: b  reason: collision with root package name */
    private final a f78169b;

    static {
        Covode.recordClassIndex(48469);
    }

    f(d dVar, a aVar) {
        this.f78168a = dVar;
        this.f78169b = aVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        d dVar = this.f78168a;
        a aVar = this.f78169b;
        if (aVar != null) {
            a.C0731a aVar2 = new a.C0731a(dVar.f78163b);
            aVar2.f33402b = dVar.f78163b.getString(R.string.fbx, new Object[]{aVar.getLocalName()});
            g gVar = new g(dVar, aVar);
            aVar2.b(dVar.f78163b.getString(R.string.a9e), (DialogInterface.OnClickListener) gVar, false);
            aVar2.a(dVar.f78163b.getString(R.string.fbo), (DialogInterface.OnClickListener) gVar, false);
            aVar2.a().b().setCancelable(false);
        }
    }
}
