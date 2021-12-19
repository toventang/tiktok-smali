package com.ss.android.ugc.aweme.setting.ui.c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public TuxDualBallView f122891a;

    static {
        Covode.recordClassIndex(80675);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            TuxDualBallView tuxDualBallView = this.f122891a;
            if (tuxDualBallView == null) {
                l.a("mDualBallView");
            }
            tuxDualBallView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            TuxDualBallView tuxDualBallView = this.f122891a;
            if (tuxDualBallView == null) {
                l.a("mDualBallView");
            }
            tuxDualBallView.setVisibility(0);
            TuxDualBallView tuxDualBallView2 = this.f122891a;
            if (tuxDualBallView2 == null) {
                l.a("mDualBallView");
            }
            tuxDualBallView2.b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity) {
        super(activity, R.style.wv);
        l.d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aym);
        View findViewById = findViewById(R.id.aq5);
        l.b(findViewById, "");
        this.f122891a = (TuxDualBallView) findViewById;
    }
}
