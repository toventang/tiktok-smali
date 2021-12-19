package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

public abstract class z implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f48708a;

    /* renamed from: b  reason: collision with root package name */
    public a f48709b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f48710c;

    /* renamed from: d  reason: collision with root package name */
    int f48711d;

    /* renamed from: e  reason: collision with root package name */
    public final int f48712e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f48713f;

    /* renamed from: g  reason: collision with root package name */
    private Messenger f48714g;

    /* renamed from: h  reason: collision with root package name */
    private int f48715h;

    /* renamed from: i  reason: collision with root package name */
    private final String f48716i;

    public interface a {
        static {
            Covode.recordClassIndex(29370);
        }

        void a(Bundle bundle);
    }

    static {
        Covode.recordClassIndex(29368);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        if (this.f48710c) {
            this.f48710c = false;
            a aVar = this.f48709b;
            if (aVar != null) {
                aVar.a(bundle);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f48714g = null;
        try {
            this.f48708a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        if (r1 != null) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            r2.<init>()
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.ss.android.ugc.aweme.lancet.a.a.f107168c
            if (r0 != 0) goto L_0x0028
        L_0x000b:
            if (r1 == 0) goto L_0x000e
        L_0x000d:
            r3 = r1
        L_0x000e:
            r2.f48708a = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2.f48715h = r0
            r0 = 65537(0x10001, float:9.1837E-41)
            r2.f48711d = r0
            r2.f48716i = r4
            r0 = 20121101(0x133060d, float:3.288145E-38)
            r2.f48712e = r0
            com.facebook.internal.z$1 r0 = new com.facebook.internal.z$1
            r0.<init>()
            r2.f48713f = r0
            return
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x000d
        L_0x002b:
            android.app.Application r1 = com.ss.android.ugc.aweme.lancet.a.a.f107166a
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.z.<init>(android.content.Context, java.lang.String):void");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f48714g = new Messenger(iBinder);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f48716i);
        Message obtain = Message.obtain((Handler) null, this.f48715h);
        obtain.arg1 = this.f48712e;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f48713f);
        try {
            this.f48714g.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }
}
