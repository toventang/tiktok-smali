package com.ss.android.ugc.aweme.shortvideo.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class j extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f132935a;

    static {
        Covode.recordClassIndex(86947);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.f132935a;
            if (dmtStatusView == null) {
                l.a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            DmtStatusView dmtStatusView = this.f132935a;
            if (dmtStatusView == null) {
                l.a("mDmtStatusView");
            }
            dmtStatusView.d();
            DmtStatusView dmtStatusView2 = this.f132935a;
            if (dmtStatusView2 == null) {
                l.a("mDmtStatusView");
            }
            dmtStatusView2.f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(Activity activity) {
        super(activity, R.style.o_);
        l.d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ahy);
        View findViewById = findViewById(R.id.e_o);
        l.b(findViewById, "");
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById;
        this.f132935a = dmtStatusView;
        if (dmtStatusView == null) {
            l.a("mDmtStatusView");
        }
        dmtStatusView.setBuilder(DmtStatusView.a.a(getContext()));
    }
}
