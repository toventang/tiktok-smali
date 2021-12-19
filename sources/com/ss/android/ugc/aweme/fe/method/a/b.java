package com.ss.android.ugc.aweme.fe.method.a;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class b implements b.AbstractC1579b {

    /* renamed from: a  reason: collision with root package name */
    private final a f91232a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f91233b;

    static {
        Covode.recordClassIndex(57415);
    }

    b(a aVar, Activity activity) {
        this.f91232a = aVar;
        this.f91233b = activity;
    }

    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
    public final void a(String[] strArr, int[] iArr) {
        a aVar = this.f91232a;
        Activity activity = this.f91233b;
        if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            new a(activity).a(R.string.dow).a();
            aVar.f91216b.a(-1, "uploadFailed");
            return;
        }
        aVar.a(activity);
    }
}
