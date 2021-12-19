package com.bytedance.ies.dmt.ui.dialog;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33443a;

    static {
        Covode.recordClassIndex(19954);
    }

    h(a aVar) {
        this.f33443a = aVar;
    }

    public final void onClick(View view) {
        a aVar = this.f33443a;
        if (!aVar.f33395f) {
            a.a(false, aVar.f33390a);
            new Handler().postDelayed(new f(aVar), 100);
        }
        if (aVar.f33392c != null) {
            aVar.f33392c.onClick(aVar.f33397i, 0);
        }
    }
}
