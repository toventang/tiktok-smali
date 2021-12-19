package com.ss.android.ugc.aweme.im.sdk.group.a.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.j;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102633a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65707);
    }

    private static void a(Context context) {
        l.d(context, "");
        new a(context).a(R.string.bpa).a();
    }

    public static final void a(Context context, u uVar) {
        String str;
        String statusMsg;
        l.d(context, "");
        if (uVar == null || (str = uVar.f38027e) == null || str.length() == 0) {
            a(context);
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.group.b.b.a aVar = (com.ss.android.ugc.aweme.im.sdk.group.b.b.a) j.a(uVar.f38027e, com.ss.android.ugc.aweme.im.sdk.group.b.b.a.class);
        if (aVar == null || (statusMsg = aVar.getStatusMsg()) == null || statusMsg.length() == 0) {
            a(context);
            return;
        }
        String statusMsg2 = aVar.getStatusMsg();
        if (statusMsg2 != null) {
            new a(context).a(statusMsg2).a();
        }
    }
}
