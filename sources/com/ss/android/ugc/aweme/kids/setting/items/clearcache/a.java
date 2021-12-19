package com.ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends Dialog {
    static {
        Covode.recordClassIndex(68364);
    }

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById(R.id.aq5);
            l.b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(8);
        }
    }

    public final void show() {
        Activity ownerActivity;
        if (!isShowing() && (ownerActivity = getOwnerActivity()) != null && !ownerActivity.isFinishing()) {
            super.show();
            TuxDualBallView tuxDualBallView = (TuxDualBallView) findViewById(R.id.aq5);
            l.b(tuxDualBallView, "");
            tuxDualBallView.setVisibility(0);
            ((TuxDualBallView) findViewById(R.id.aq5)).b();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity) {
        super(activity, R.style.yz);
        l.d(activity, "");
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ae0);
    }
}
