package com.bytedance.android.livesdk.function;

import android.text.TextUtils;
import com.bytedance.android.live.a.a.b.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final UserPermissionCheckWidget f17808a;

    static {
        Covode.recordClassIndex(9889);
    }

    p(UserPermissionCheckWidget userPermissionCheckWidget) {
        this.f17808a = userPermissionCheckWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof a) {
            a aVar = (a) th;
            int errorCode = aVar.getErrorCode();
            String prompt = aVar.getPrompt();
            if (errorCode >= 30001 && errorCode <= 30006) {
                if (!TextUtils.isEmpty(prompt)) {
                    ao.a(y.e(), prompt, 0);
                }
                com.bytedance.android.livesdk.an.a.a().a(new r(35));
                return;
            }
        }
        i.b();
        com.bytedance.android.live.core.c.a.a(6, "ttlive_exception", th.getStackTrace());
    }
}
