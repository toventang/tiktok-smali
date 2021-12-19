package com.ss.android.ugc.aweme.util;

import android.app.Activity;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.qrcode.view.a;
import com.ss.android.ugc.aweme.util.u;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public class v implements u.b {

    /* renamed from: a  reason: collision with root package name */
    private a f142559a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f142560b;

    static {
        Covode.recordClassIndex(93232);
    }

    @Override // com.ss.android.ugc.aweme.util.u.b
    public final void b() {
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f142560b).a(R.string.fg3).a();
        a aVar = this.f142559a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.util.u.b
    public final void a() {
        if (this.f142559a == null) {
            Activity activity = this.f142560b;
            a a2 = a.a(activity, activity.getResources().getString(R.string.fe8));
            this.f142559a = a2;
            if (a2 != null) {
                a2.setIndeterminate(false);
            }
        }
        a aVar = this.f142559a;
        if (aVar != null && !aVar.isShowing()) {
            aVar.show();
            aVar.a();
        }
    }

    public v(Activity activity) {
        l.d(activity, "");
        this.f142560b = activity;
    }

    @Override // com.ss.android.ugc.aweme.util.u.b
    public void a(Uri uri) {
        a aVar = this.f142559a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }
}
