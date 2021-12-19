package com.bytedance.push.frontier.setting;

import android.content.Context;
import android.os.Looper;
import com.bytedance.common.utility.b.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.frontier.a.d;

public final class c implements com.bytedance.push.frontier.a.c {

    /* renamed from: a  reason: collision with root package name */
    public d f42160a = new d();

    static {
        Covode.recordClassIndex(25762);
    }

    @Override // com.bytedance.push.frontier.a.c
    public final void a(final Context context, final d dVar) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            e.a(new Runnable() {
                /* class com.bytedance.push.frontier.setting.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25763);
                }

                public final void run() {
                    c.this.f42160a.a(context, dVar);
                }
            });
        } else {
            this.f42160a.a(context, dVar);
        }
    }
}
