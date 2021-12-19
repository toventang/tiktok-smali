package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f49951a;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<IBinder> f49952b = new LinkedBlockingQueue();

    static {
        Covode.recordClassIndex(31180);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f49952b.add(iBinder);
    }
}
