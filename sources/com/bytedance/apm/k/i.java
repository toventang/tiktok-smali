package com.bytedance.apm.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public float f25150a;

    /* renamed from: b  reason: collision with root package name */
    public int f25151b;

    /* renamed from: c  reason: collision with root package name */
    public int f25152c;

    /* renamed from: d  reason: collision with root package name */
    private BroadcastReceiver f25153d;

    /* renamed from: e  reason: collision with root package name */
    private IntentFilter f25154e;

    static {
        Covode.recordClassIndex(14664);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f25156a = new i((byte) 0);

        static {
            Covode.recordClassIndex(14666);
        }
    }

    private i() {
        this.f25153d = new BroadcastReceiver() {
            /* class com.bytedance.apm.k.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(14665);
            }

            public final void onReceive(Context context, Intent intent) {
                if (intent != null) {
                    i.this.f25150a = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
                    i.this.f25151b = intent.getIntExtra("status", 1);
                    i.this.f25152c = intent.getIntExtra("plugged", -1);
                }
            }
        };
        this.f25154e = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    /* synthetic */ i(byte b2) {
        this();
    }
}
