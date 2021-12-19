package com.ss.android.ugc.aweme.discover.ui;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b f82542a;

    static {
        Covode.recordClassIndex(51384);
    }

    d(b bVar) {
        this.f82542a = bVar;
    }

    public final void run() {
        b bVar = this.f82542a;
        e activity = bVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            bVar.t();
            bVar.f82355b.setText("");
            bVar.f82355b.requestFocus();
            bVar.f82355b.setSelection(0);
        }
    }
}
