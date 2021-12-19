package com.ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.draft.AwemeDraftNewViewHolder;
import h.f.a.a;

final /* synthetic */ class t implements a {

    /* renamed from: a  reason: collision with root package name */
    private final AwemeDraftNewViewHolder.AnonymousClass1 f139867a;

    /* renamed from: b  reason: collision with root package name */
    private final ProgressDialog f139868b;

    static {
        Covode.recordClassIndex(91415);
    }

    t(AwemeDraftNewViewHolder.AnonymousClass1 r1, ProgressDialog progressDialog) {
        this.f139867a = r1;
        this.f139868b = progressDialog;
    }

    @Override // h.f.a.a
    public final Object invoke() {
        ProgressDialog progressDialog = this.f139868b;
        if (progressDialog == null) {
            return null;
        }
        progressDialog.dismiss();
        return null;
    }
}
