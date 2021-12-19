package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.friends.a;
import com.ss.android.ugc.aweme.friends.ui.f;
import com.ss.android.ugc.aweme.utils.permission.c;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bf implements b.AbstractC1579b {

    /* renamed from: a  reason: collision with root package name */
    private final f f142670a;

    /* renamed from: b  reason: collision with root package name */
    private final Activity f142671b;

    static {
        Covode.recordClassIndex(93331);
    }

    bf(f fVar, Activity activity) {
        this.f142670a = fVar;
        this.f142671b = activity;
    }

    @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
    public final void a(String[] strArr, int[] iArr) {
        f fVar = this.f142670a;
        Activity activity = this.f142671b;
        if (iArr != null && iArr.length > 0) {
            if (iArr[0] == 0) {
                if (fVar != null) {
                    fVar.a();
                }
                c.c();
                return;
            }
            if (fVar != null) {
                fVar.b();
            }
            ((a) com.ss.android.ugc.aweme.base.b.a.b.a(activity, a.class)).a(true);
        }
    }
}
