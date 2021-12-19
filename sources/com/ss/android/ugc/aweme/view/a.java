package com.ss.android.ugc.aweme.view;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.R;

public final class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    DmtStatusView f144038a;

    static {
        Covode.recordClassIndex(94267);
    }

    public final void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f144038a;
            if (dmtStatusView != null) {
                dmtStatusView.f();
            }
        }
    }

    public final void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f144038a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
                this.f144038a.setStatus(-1);
            }
        }
    }

    public a(Activity activity) {
        super(activity, R.style.v0);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cy);
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.e_o);
        this.f144038a = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
    }
}
