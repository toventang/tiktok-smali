package com.ss.android.ugc.aweme.account.util;

import android.os.Handler;
import android.os.Message;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

public final class j<TTaskResult> implements g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    Handler f65488a;

    /* renamed from: b  reason: collision with root package name */
    int f65489b = 0;

    static {
        Covode.recordClassIndex(40274);
    }

    public j(Handler handler) {
        this.f65488a = handler;
    }

    @Override // b.g
    public final Object then(i<TTaskResult> iVar) {
        Handler handler = this.f65488a;
        if (handler == null) {
            return null;
        }
        Message obtainMessage = handler.obtainMessage(this.f65489b);
        if (iVar.b()) {
            obtainMessage.obj = null;
        } else if (iVar.c()) {
            obtainMessage.obj = iVar.e();
        } else {
            obtainMessage.obj = iVar.d();
        }
        this.f65488a.sendMessage(obtainMessage);
        return null;
    }
}
