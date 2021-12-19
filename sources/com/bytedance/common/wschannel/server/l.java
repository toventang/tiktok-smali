package com.bytedance.common.wschannel.server;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.wschannel.server.h;
import com.bytedance.covode.number.Covode;

public final class l extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f27382b;

    /* renamed from: a  reason: collision with root package name */
    public b f27383a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27384c = true;

    /* renamed from: d  reason: collision with root package name */
    private h.a f27385d;

    static {
        Covode.recordClassIndex(16108);
    }

    public l() {
    }

    public l(Context context, b bVar) {
        this.f27385d = h.b(context);
        this.f27383a = bVar;
    }

    public final void onReceive(final Context context, Intent intent) {
        if (context != null && intent != null && this.f27383a != null && !TextUtils.isEmpty(intent.getAction()) && "android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (this.f27384c) {
                this.f27384c = false;
                if (h.b(context) == this.f27385d) {
                    return;
                }
            }
            e.a(new Runnable() {
                /* class com.bytedance.common.wschannel.server.l.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(16109);
                }

                public final void run() {
                    try {
                        boolean a2 = com.bytedance.common.wschannel.l.a(context).a();
                        if (a2 != l.f27382b) {
                            l.f27382b = a2;
                        }
                    } catch (Throwable unused) {
                    }
                    if (l.f27382b) {
                        try {
                            Logger.debug();
                            Context context = context;
                            boolean a3 = h.a(context);
                            h.a b2 = h.b(context);
                            int i2 = 1;
                            if (!a3) {
                                i2 = 2;
                            } else if (h.a.WIFI == b2) {
                                i2 = 3;
                            } else if (h.a.NONE != b2) {
                                i2 = 4;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 3;
                            obtain.arg1 = i2;
                            l.this.f27383a.handleMsg(obtain);
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
        }
    }
}
