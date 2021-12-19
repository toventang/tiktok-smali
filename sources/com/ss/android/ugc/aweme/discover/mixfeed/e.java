package com.ss.android.ugc.aweme.discover.mixfeed;

import android.os.Handler;
import android.os.Message;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

public final class e<TTaskResult> implements g<TTaskResult, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Handler f81750a;

    /* renamed from: b  reason: collision with root package name */
    private int f81751b = 0;

    static {
        Covode.recordClassIndex(50785);
    }

    public e(Handler handler) {
        this.f81750a = handler;
    }

    @Override // b.g
    public final Object then(i<TTaskResult> iVar) {
        if (!(this.f81750a == null || iVar == null || iVar.b())) {
            Message obtainMessage = this.f81750a.obtainMessage(this.f81751b);
            if (iVar.c()) {
                obtainMessage.obj = iVar.e();
            } else {
                obtainMessage.obj = iVar.d();
                if (obtainMessage.obj == null) {
                    return null;
                }
            }
            this.f81750a.sendMessage(obtainMessage);
        }
        return null;
    }
}
