package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.view.a;
import com.ss.android.ugc.aweme.util.o;
import com.zhiliaoapp.musically.R;

public class q implements o.a {

    /* renamed from: a  reason: collision with root package name */
    private Activity f142549a;

    /* renamed from: b  reason: collision with root package name */
    private a f142550b;

    static {
        Covode.recordClassIndex(93223);
    }

    @Override // com.ss.android.ugc.aweme.util.o.a
    public final void a() {
        Activity activity = this.f142549a;
        if (this.f142550b == null && activity != null) {
            a a2 = a.a(activity, activity.getResources().getString(R.string.fe8));
            this.f142550b = a2;
            a2.setIndeterminate(false);
        }
        a aVar = this.f142550b;
        if (aVar != null && !aVar.isShowing()) {
            this.f142550b.show();
            this.f142550b.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.util.o.a
    public final void b() {
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f142549a).a(R.string.fg3).a();
        a aVar = this.f142550b;
        if (aVar != null && aVar.isShowing()) {
            this.f142550b.dismiss();
        }
    }

    public q(Activity activity) {
        this.f142549a = activity;
    }

    @Override // com.ss.android.ugc.aweme.util.o.a
    public void a(String str) {
        a aVar = this.f142550b;
        if (aVar != null && aVar.isShowing()) {
            this.f142550b.dismiss();
        }
    }
}
