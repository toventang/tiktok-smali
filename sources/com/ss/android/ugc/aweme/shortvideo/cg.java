package com.ss.android.ugc.aweme.shortvideo;

import android.content.DialogInterface;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ui.j;

/* access modifiers changed from: package-private */
public final /* synthetic */ class cg implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cf f125117a;

    /* renamed from: b  reason: collision with root package name */
    private final ce f125118b;

    /* renamed from: c  reason: collision with root package name */
    private final j f125119c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f125120d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f125121e;

    /* renamed from: f  reason: collision with root package name */
    private final DialogInterface.OnDismissListener f125122f;

    static {
        Covode.recordClassIndex(82182);
    }

    cg(cf cfVar, ce ceVar, j jVar, boolean z, boolean z2, DialogInterface.OnDismissListener onDismissListener) {
        this.f125117a = cfVar;
        this.f125118b = ceVar;
        this.f125119c = jVar;
        this.f125120d = z;
        this.f125121e = z2;
        this.f125122f = onDismissListener;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        cf cfVar = this.f125117a;
        ce ceVar = this.f125118b;
        j jVar = this.f125119c;
        boolean z = this.f125120d;
        boolean z2 = this.f125121e;
        DialogInterface.OnDismissListener onDismissListener = this.f125122f;
        if (cfVar.f125113e != null) {
            cfVar.a(ceVar, jVar, z, z2);
            cfVar.f125113e.a(cfVar.f125109a, null, onDismissListener);
        }
    }
}
