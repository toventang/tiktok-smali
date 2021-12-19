package com.bytedance.common.wschannel.client;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.b.e;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.client.j;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.model.IntegerParcelable;
import com.bytedance.common.wschannel.model.SsWsApp;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import org.json.JSONObject;

public final class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public long f27189a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f27190b = 0;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<Context> f27191c;

    /* renamed from: d  reason: collision with root package name */
    Messenger f27192d;

    /* renamed from: e  reason: collision with root package name */
    ServiceConnection f27193e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedBlockingDeque<j.a> f27194f = new LinkedBlockingDeque<>();

    /* renamed from: g  reason: collision with root package name */
    private final Runnable f27195g = new Runnable() {
        /* class com.bytedance.common.wschannel.client.k.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16026);
        }

        public final void run() {
            if (k.this.f27192d == null) {
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }
    };

    static {
        Covode.recordClassIndex(16025);
    }

    /* access modifiers changed from: package-private */
    public class a implements ServiceConnection {
        static {
            Covode.recordClassIndex(16029);
        }

        a() {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (componentName != null) {
                Logger.debug();
                try {
                    k.this.f27192d = null;
                    k.this.f27194f.clear();
                } catch (Throwable unused) {
                }
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (componentName != null && iBinder != null) {
                Logger.debug();
                try {
                    k.this.f27192d = new Messenger(iBinder);
                    k.this.a(componentName);
                } catch (Throwable unused) {
                }
                k.this.f27190b = SystemClock.uptimeMillis();
                SystemClock.uptimeMillis();
                WsConstants.getBindWsChannelServiceListener();
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context) {
        b(context, 1);
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void b(Context context) {
        b(context, 2);
    }

    private static Context c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:5|(3:18|7|13)(5:8|9|10|(2:12|21)(1:20)|17)|3|2) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        r5.f27192d = null;
        r5.f27194f.offerFirst(r4);
        android.os.SystemClock.uptimeMillis();
        com.bytedance.common.wschannel.WsConstants.getBindWsChannelServiceListener();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:17:0x0003, LOOP_START, SYNTHETIC, Splitter:B:2:0x0003] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(android.content.ComponentName r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f27194f     // Catch:{ all -> 0x0044 }
            java.lang.Object r0 = r0.peek()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0044
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f27194f     // Catch:{ all -> 0x0044 }
            java.lang.Object r4 = r0.poll()     // Catch:{ all -> 0x0044 }
            com.bytedance.common.wschannel.client.j$a r4 = (com.bytedance.common.wschannel.client.j.a) r4     // Catch:{ all -> 0x0044 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0035
        L_0x0016:
            android.os.Message r3 = new android.os.Message     // Catch:{ all -> 0x0044 }
            r3.<init>()     // Catch:{ all -> 0x0044 }
            int r0 = r4.f27188c     // Catch:{ all -> 0x0044 }
            r3.what = r0     // Catch:{ all -> 0x0044 }
            android.os.Bundle r2 = r3.getData()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.f27186a     // Catch:{ all -> 0x0044 }
            android.os.Parcelable r0 = r4.f27187b     // Catch:{ all -> 0x0044 }
            r2.putParcelable(r1, r0)     // Catch:{ all -> 0x0044 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            android.os.Messenger r0 = r5.f27192d     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            if (r0 == 0) goto L_0x0003
            r0.send(r3)     // Catch:{ DeadObjectException -> 0x0036, all -> 0x0003 }
            goto L_0x0003
        L_0x0035:
            return
        L_0x0036:
            r0 = 0
            r5.f27192d = r0
            java.util.concurrent.LinkedBlockingDeque<com.bytedance.common.wschannel.client.j$a> r0 = r5.f27194f
            r0.offerFirst(r4)
            android.os.SystemClock.uptimeMillis()
            com.bytedance.common.wschannel.WsConstants.getBindWsChannelServiceListener()
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.k.b(android.content.ComponentName):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0045 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060 A[Catch:{ all -> 0x0089 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(android.content.ComponentName r9) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.k.a(android.content.ComponentName):void");
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(final Context context, boolean z) {
        if (z) {
            e.a(new Runnable() {
                /* class com.bytedance.common.wschannel.client.k.AnonymousClass3 */

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f27200b = true;

                static {
                    Covode.recordClassIndex(16028);
                }

                public final void run() {
                    int i2;
                    if (context != null) {
                        if (k.this.f27191c == null || k.this.f27191c.get() == null) {
                            k kVar = k.this;
                            Context applicationContext = context.getApplicationContext();
                            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                            kVar.f27191c = new WeakReference<>(applicationContext);
                        }
                        try {
                            ComponentName componentName = new ComponentName(context, WsChannelService.class);
                            j.a aVar = new j.a();
                            if (this.f27200b) {
                                i2 = 9;
                            } else {
                                i2 = 11;
                            }
                            aVar.f27188c = i2;
                            k.this.f27194f.offer(aVar);
                            k.this.a(componentName);
                        } catch (Throwable unused) {
                        }
                    }
                }
            });
        } else {
            e.a(new Runnable() {
                /* class com.bytedance.common.wschannel.client.k.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(16027);
                }

                public final void run() {
                    try {
                        a(context, new Intent(context, WsChannelService.class));
                    } catch (Throwable unused) {
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
                    /*
                    // Method dump skipped, instructions count: 114
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.k.AnonymousClass2.a(android.content.Context, android.content.Intent):android.content.ComponentName");
                }
            });
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.client.k.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    private void b(Context context, int i2) {
        if (context != null && i2 > 0 && i2 <= 3) {
            WeakReference<Context> weakReference = this.f27191c;
            if (weakReference == null || weakReference.get() == null) {
                this.f27191c = new WeakReference<>(c(context));
            }
            Logger.debug();
            if (l.a(context).a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    Intent intent = new Intent("com.bytedance.article.wschannel.appstate");
                    intent.setComponent(componentName);
                    intent.putExtra("app_state", i2);
                    a(context, intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, int i2) {
        if (context != null) {
            Logger.debug();
            WeakReference<Context> weakReference = this.f27191c;
            if (weakReference == null || weakReference.get() == null) {
                this.f27191c = new WeakReference<>(c(context));
            }
            Logger.debug();
            try {
                ComponentName componentName = new ComponentName(context, WsChannelService.class);
                j.a aVar = new j.a();
                aVar.f27186a = "ws_app";
                aVar.f27187b = new IntegerParcelable(i2);
                aVar.f27188c = 1;
                this.f27194f.offer(aVar);
                a(componentName);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void b(Context context, SsWsApp ssWsApp) {
        if (context != null && ssWsApp != null) {
            WeakReference<Context> weakReference = this.f27191c;
            if (weakReference == null || weakReference.get() == null) {
                this.f27191c = new WeakReference<>(c(context));
            }
            Logger.debug();
            if (l.a(context).a()) {
                WeakReference<Context> weakReference2 = this.f27191c;
                if (weakReference2 == null || weakReference2.get() == null) {
                    this.f27191c = new WeakReference<>(c(context));
                }
                Logger.debug();
                if (l.a(context).a()) {
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        j.a aVar = new j.a();
                        aVar.f27186a = "ws_app";
                        aVar.f27187b = ssWsApp;
                        aVar.f27188c = 4;
                        this.f27194f.offer(aVar);
                        a(componentName);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, SsWsApp ssWsApp) {
        if (context != null) {
            WeakReference<Context> weakReference = this.f27191c;
            if (weakReference == null || weakReference.get() == null) {
                this.f27191c = new WeakReference<>(c(context));
            }
            if (!l.a(context).a()) {
                if (WsConstants.getLinkProgressChangeListener() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("lp_status", 1);
                        WsConstants.getLinkProgressChangeListener().a("WCMP_REGISTERAPP_SETTING_DISABLE", jSONObject);
                    } catch (Exception unused) {
                    }
                }
            } else if (ssWsApp != null) {
                WeakReference<Context> weakReference2 = this.f27191c;
                if (weakReference2 == null || weakReference2.get() == null) {
                    this.f27191c = new WeakReference<>(c(context));
                }
                Logger.debug();
                if (l.a(context).a()) {
                    try {
                        ComponentName componentName = new ComponentName(context, WsChannelService.class);
                        j.a aVar = new j.a();
                        aVar.f27186a = "ws_app";
                        aVar.f27187b = ssWsApp;
                        aVar.f27188c = 0;
                        this.f27194f.offer(aVar);
                        a(componentName);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.j
    public final void a(Context context, WsChannelMsg wsChannelMsg) {
        if (context != null && wsChannelMsg != null) {
            WeakReference<Context> weakReference = this.f27191c;
            if (weakReference == null || weakReference.get() == null) {
                this.f27191c = new WeakReference<>(c(context));
            }
            Logger.debug();
            if (l.a(context).a()) {
                try {
                    ComponentName componentName = new ComponentName(context, WsChannelService.class);
                    j.a aVar = new j.a();
                    aVar.f27186a = "payload";
                    aVar.f27187b = wsChannelMsg;
                    aVar.f27188c = 5;
                    this.f27194f.offer(aVar);
                    a(componentName);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
