package com.ss.android.ugc.aweme.requesttask.idle;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120695a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f120696b;

    private a() {
    }

    static {
        Covode.recordClassIndex(78628);
    }

    public static final void a() {
        w initTask = AVExternalServiceImpl.a().initService().initTask(4);
        if (!f120696b) {
            f120696b = true;
            f.c cVar = new f.c();
            if (initTask == null) {
                l.b();
            }
            cVar.b(initTask).a();
        }
    }
}
