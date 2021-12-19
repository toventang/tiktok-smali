package com.bytedance.ug.a;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.ic;

final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final Context f45737a;

    /* renamed from: b  reason: collision with root package name */
    public final String f45738b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f45739c = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(27828);
    }

    @Override // com.bytedance.ug.a.l
    public final void a(final a aVar) {
        if (aVar.f45723f != 0) {
            final AnonymousClass1 r2 = new Runnable() {
                /* class com.bytedance.ug.a.h.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(27829);
                }

                public final void run() {
                    Toast makeText = Toast.makeText(h.this.f45737a, h.this.f45738b + " " + aVar.f45722e, 1);
                    if (Build.VERSION.SDK_INT == 25) {
                        ic.a(makeText);
                    }
                    makeText.show();
                }
            };
            if (Looper.getMainLooper() == Looper.myLooper()) {
                r2.run();
            } else {
                this.f45739c.post(new Runnable() {
                    /* class com.bytedance.ug.a.h.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(27830);
                    }

                    public final void run() {
                        r2.run();
                    }
                });
            }
        }
    }

    h(Context context, String str) {
        this.f45737a = context;
        this.f45738b = "[UGCloud " + str + "]";
    }
}
