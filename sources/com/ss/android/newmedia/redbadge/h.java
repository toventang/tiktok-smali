package com.ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.covode.number.Covode;

public final class h implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private Intent f60045a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f60046b = true;

    /* renamed from: c  reason: collision with root package name */
    private Context f60047c;

    static {
        Covode.recordClassIndex(37112);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f60047c.unbindService(this);
        } catch (Throwable unused) {
        }
    }

    h(Intent intent, Context context) {
        this.f60045a = intent;
        this.f60047c = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger = new Messenger(iBinder);
        Message message = new Message();
        try {
            message.what = 101;
            message.getData().putParcelable("intent", this.f60045a);
            messenger.send(message);
            try {
                if (this.f60046b) {
                    this.f60047c.unbindService(this);
                }
            } catch (Throwable unused) {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            if (this.f60046b) {
                this.f60047c.unbindService(this);
            }
        } catch (Throwable unused2) {
        }
    }
}
