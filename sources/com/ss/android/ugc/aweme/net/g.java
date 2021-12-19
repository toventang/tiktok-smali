package com.ss.android.ugc.aweme.net;

import android.os.Handler;
import android.os.Message;
import b.i;
import com.bytedance.covode.number.Covode;

public final class g<TTaskResult> implements b.g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Handler f112329a;

    /* renamed from: b  reason: collision with root package name */
    private int f112330b = 0;

    static {
        Covode.recordClassIndex(72179);
    }

    public g(Handler handler) {
        this.f112329a = handler;
    }

    @Override // b.g
    public final Object then(i<TTaskResult> iVar) {
        Handler handler = this.f112329a;
        if (handler == null) {
            return null;
        }
        Message obtainMessage = handler.obtainMessage(this.f112330b);
        if (iVar.b()) {
            obtainMessage.obj = null;
        } else if (iVar.c()) {
            obtainMessage.obj = iVar.e();
        } else {
            obtainMessage.obj = iVar.d();
        }
        this.f112329a.sendMessage(obtainMessage);
        return null;
    }
}
