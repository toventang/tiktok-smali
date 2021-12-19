package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f47170a = d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver f47171b = new a(this, (byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public final LocalBroadcastManager f47172c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f47173d;

    /* access modifiers changed from: protected */
    public abstract void a();

    static {
        Covode.recordClassIndex(28701);
    }

    public final void b() {
        if (!this.f47173d) {
            c();
            this.f47173d = true;
        }
    }

    public d() {
        ae.a();
        ae.a();
        this.f47172c = LocalBroadcastManager.getInstance(m.f48921g);
        b();
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        this.f47172c.registerReceiver(this.f47171b, intentFilter);
    }

    class a extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(28702);
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }

        public final void onReceive(Context context, Intent intent) {
            if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction())) {
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN");
                intent.getParcelableExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN");
                d.this.a();
            }
        }
    }
}
