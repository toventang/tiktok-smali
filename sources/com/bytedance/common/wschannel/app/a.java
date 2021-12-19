package com.bytedance.common.wschannel.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.j;
import com.bytedance.covode.number.Covode;

public abstract class a extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    protected WeakHandler f27013a;

    /* renamed from: b  reason: collision with root package name */
    private Messenger f27014b;

    static {
        Covode.recordClassIndex(15941);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onCreate() {
        j.a(getApplication(), null);
        this.f27013a = new WeakHandler(this);
        this.f27014b = new Messenger(this.f27013a);
    }

    public IBinder onBind(Intent intent) {
        return this.f27014b.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
}
