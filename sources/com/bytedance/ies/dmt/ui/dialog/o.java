package com.bytedance.ies.dmt.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.R;

public final class o extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    DmtStatusView f33453a;

    static {
        Covode.recordClassIndex(19961);
    }

    public final void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f33453a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
        }
    }

    public final void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f33453a;
            if (dmtStatusView != null) {
                dmtStatusView.d();
                this.f33453a.f();
            }
        }
    }

    public o(Activity activity) {
        super(activity, R.style.wv);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.x_);
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.e_o);
        this.f33453a = dmtStatusView;
        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
    }
}
