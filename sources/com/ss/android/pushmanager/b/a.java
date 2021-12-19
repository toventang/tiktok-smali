package com.ss.android.pushmanager.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.f;
import com.ss.android.message.d;
import java.lang.ref.WeakReference;

public final class a implements WeakHandler.IHandler {

    /* renamed from: f  reason: collision with root package name */
    private static a f60099f;

    /* renamed from: a  reason: collision with root package name */
    public Messenger f60100a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<Context> f60101b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f60102c;

    /* renamed from: d  reason: collision with root package name */
    private Messenger f60103d;

    /* renamed from: e  reason: collision with root package name */
    private long f60104e;

    /* renamed from: g  reason: collision with root package name */
    private ServiceConnection f60105g = new ServiceConnection() {
        /* class com.ss.android.pushmanager.b.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37137);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            a.this.f60100a = null;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            a.this.f60100a = new Messenger(iBinder);
            a.this.a();
        }
    };

    static {
        Covode.recordClassIndex(37136);
    }

    private void c() {
        Logger.debug();
        if (this.f60100a != null) {
            try {
                if (this.f60101b.get() != null) {
                    this.f60101b.get().unbindService(this.f60105g);
                }
            } catch (Throwable unused) {
            }
            try {
                this.f60100a = null;
            } catch (Exception unused2) {
            }
        }
    }

    private void b() {
        WeakReference<Context> weakReference = this.f60101b;
        if (weakReference != null && weakReference.get() != null) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(this.f60101b.get(), "com.ss.android.message.log.LogService"));
                a(this.f60101b.get(), intent, this.f60105g);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a() {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.replyTo = this.f60103d;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f60104e);
            Logger.debug();
            obtain.obj = bundle;
            this.f60100a.send(obtain);
        } catch (Throwable unused) {
            c();
        }
    }

    public static void a(Context context) {
        if (f.a(context) && context != null) {
            a aVar = f60099f;
            if (aVar == null) {
                f60099f = new a(context);
            } else if (aVar.f60100a == null) {
                aVar.b();
            }
        }
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f60101b = new WeakReference<>(applicationContext);
        d.a();
        Looper looper = d.f59825b.getLooper();
        this.f60102c = new WeakHandler(looper == null ? Looper.getMainLooper() : looper, this);
        this.f60103d = new Messenger(this.f60102c);
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f  */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r22) {
        /*
        // Method dump skipped, instructions count: 230
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.b.a.handleMsg(android.os.Message):void");
    }

    private static boolean a(Context context, Intent intent, ServiceConnection serviceConnection) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, 1);
        }
        if (com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, 1);
    }
}
