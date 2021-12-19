package com.ss.android.message.log;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.ss.android.message.d;
import com.ss.android.pushmanager.a.b;
import org.json.JSONArray;

public class LogService extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    private Messenger f59829a;

    static {
        Covode.recordClassIndex(36979);
    }

    public void onCreate() {
        super.onCreate();
        try {
            b.a aVar = (b.a) com.ss.android.ug.bus.b.a(b.a.class);
            if (aVar != null) {
                aVar.a();
            }
        } catch (Throwable unused) {
        }
        d.a();
        this.f59829a = new Messenger(new WeakHandler(d.f59825b.getLooper(), this));
    }

    public IBinder onBind(Intent intent) {
        return this.f59829a.getBinder();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a aVar;
        try {
            aVar = a.a(this);
        } catch (Exception e2) {
            e2.printStackTrace();
            aVar = null;
        } catch (Throwable unused) {
            return;
        }
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1 && message.replyTo != null) {
                Messenger messenger = message.replyTo;
                long[] longArray = ((Bundle) message.obj).getLongArray("event_ids");
                if (longArray == null) {
                    return;
                }
                if (aVar == null) {
                    messenger.send(Message.obtain((Handler) null, 2));
                    return;
                }
                for (long j2 : longArray) {
                    aVar.a(j2);
                }
            }
        } else if (message.replyTo != null) {
            Messenger messenger2 = message.replyTo;
            long j3 = ((Bundle) message.obj).getLong("start_id", 0);
            if (aVar == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            JSONArray b2 = aVar.b(j3);
            if (b2 == null) {
                messenger2.send(Message.obtain((Handler) null, 2));
                return;
            }
            Message obtain = Message.obtain((Handler) null, 0);
            Bundle bundle = new Bundle();
            bundle.putString("events", b2.toString());
            if (b2.length() >= 5) {
                bundle.putBoolean("has_more", true);
            } else {
                bundle.putBoolean("has_more", false);
            }
            obtain.obj = bundle;
            messenger2.send(obtain);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        b.AbstractC1307b a2 = b.a();
        if (a2 == null || a2.g()) {
            return 2;
        }
        return onStartCommand;
    }
}
