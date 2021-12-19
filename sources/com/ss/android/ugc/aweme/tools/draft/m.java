package com.ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import com.bytedance.covode.number.Covode;
import h.f.a.a;

final /* synthetic */ class m implements a {

    /* renamed from: a  reason: collision with root package name */
    private final i f139844a;

    /* renamed from: b  reason: collision with root package name */
    private final ProgressDialog f139845b;

    static {
        Covode.recordClassIndex(91399);
    }

    m(i iVar, ProgressDialog progressDialog) {
        this.f139844a = iVar;
        this.f139845b = progressDialog;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        ProgressDialog progressDialog = this.f139845b;
        if (progressDialog == null) {
            return null;
        }
        progressDialog.dismiss();
        return null;
    }
}
