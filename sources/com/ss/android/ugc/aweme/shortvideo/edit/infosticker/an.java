package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.loading.TuxLoadingHUD;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class an extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public TuxLoadingHUD f127130a;

    static {
        Covode.recordClassIndex(83397);
    }

    public final void onBackPressed() {
    }

    public final void show() {
        TuxLoadingHUD tuxLoadingHUD = this.f127130a;
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setVisibility(0);
        }
        super.show();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public an(Context context) {
        super(context, R.style.gf);
        l.d(context, "");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.aia);
        TuxLoadingHUD tuxLoadingHUD = (TuxLoadingHUD) findViewById(R.id.d4x);
        this.f127130a = tuxLoadingHUD;
        if (tuxLoadingHUD != null) {
            tuxLoadingHUD.setMessage(R.string.axz);
        }
        TuxLoadingHUD tuxLoadingHUD2 = this.f127130a;
        if (tuxLoadingHUD2 != null) {
            tuxLoadingHUD2.setVisibility(0);
        }
        setCanceledOnTouchOutside(false);
    }
}
