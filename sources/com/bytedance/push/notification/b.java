package com.bytedance.push.notification;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.b.a;
import com.bytedance.push.b.c;

public final class b implements Handler.Callback, c {

    /* renamed from: a  reason: collision with root package name */
    public final a f42244a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f42245b;

    static {
        Covode.recordClassIndex(25810);
    }

    public final boolean handleMessage(Message message) {
        return false;
    }

    b(a aVar) {
        this.f42244a = aVar;
    }

    @Override // com.bytedance.push.b.a
    public final Bitmap a(c cVar) {
        return this.f42244a.a(cVar);
    }
}
