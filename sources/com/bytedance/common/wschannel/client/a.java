package com.bytedance.common.wschannel.client;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.g;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;

public abstract class a extends Service implements WeakHandler.IHandler, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f27174a = new WeakHandler(this);

    /* renamed from: b  reason: collision with root package name */
    private final c f27175b = new c(this);

    /* renamed from: c  reason: collision with root package name */
    private Messenger f27176c;

    static {
        Covode.recordClassIndex(16010);
    }

    @Override // com.bytedance.common.wschannel.client.c.a
    public void a(WsChannelMsg wsChannelMsg) {
    }

    public void onDestroy() {
        super.onDestroy();
        Logger.debug();
    }

    public void onCreate() {
        super.onCreate();
        this.f27176c = new Messenger(this.f27174a);
    }

    public IBinder onBind(Intent intent) {
        return this.f27176c.getBinder();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        try {
            final long a2 = com.bytedance.common.wschannel.e.c.a();
            if (message != null && message.what == 10123) {
                final Intent intent = (Intent) message.getData().getParcelable("DATA_INTENT");
                Logger.debug();
                if (intent != null) {
                    g.a();
                    g.a(new Runnable() {
                        /* class com.bytedance.common.wschannel.client.a.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(16012);
                        }

                        public final void run() {
                            a.this.a(intent, a2);
                        }
                    });
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void a(Intent intent, long j2) {
        if (intent != null) {
            this.f27175b.a(intent, new com.bytedance.common.wschannel.model.a(j2));
        }
    }

    public int onStartCommand(final Intent intent, int i2, int i3) {
        String str;
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder("onStartCommand intent = ");
            if (intent != null) {
                str = intent.toString();
            } else {
                str = "null";
            }
            Logger.d("AbsWsClientService", sb.append(str).toString());
        }
        final long a2 = com.bytedance.common.wschannel.e.c.a();
        g.a();
        g.a(new Runnable() {
            /* class com.bytedance.common.wschannel.client.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16011);
            }

            public final void run() {
                a.this.a(intent, a2);
            }
        });
        return 2;
    }
}
