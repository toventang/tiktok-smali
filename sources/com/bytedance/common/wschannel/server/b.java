package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.a;
import com.bytedance.common.wschannel.d.c;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.notice.api.e.ac;
import com.ss.android.ugc.aweme.notice.api.e.p;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public class b implements WeakHandler.IHandler, d.a {

    /* renamed from: a  reason: collision with root package name */
    final WeakHandler f27324a;

    /* renamed from: b  reason: collision with root package name */
    final Context f27325b;

    /* renamed from: c  reason: collision with root package name */
    final Object f27326c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final e f27327d;

    /* renamed from: e  reason: collision with root package name */
    final a f27328e;

    /* renamed from: f  reason: collision with root package name */
    final a f27329f;

    /* renamed from: g  reason: collision with root package name */
    AtomicLong f27330g = new AtomicLong(0);

    /* renamed from: h  reason: collision with root package name */
    public boolean f27331h = false;

    /* renamed from: i  reason: collision with root package name */
    private d f27332i;

    static {
        Covode.recordClassIndex(16082);
    }

    /* access modifiers changed from: package-private */
    public final void a(IWsApp iWsApp) {
        a(this, iWsApp);
    }

    /* access modifiers changed from: package-private */
    public final void b(IWsApp iWsApp) {
        b(this, iWsApp);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f27332i.b();
    }

    /* access modifiers changed from: package-private */
    public final byte[] a() {
        String str;
        WsChannelMsg.a a2 = WsChannelMsg.a.a(Integer.MAX_VALUE);
        a2.f27309c = 4;
        a2.f27308b = 9000;
        a2.f27307a = 1008601;
        a2.f27310d = new byte[0];
        a2.f27312f = "pb";
        a2.f27311e = "pb";
        if (this.f27331h) {
            str = "0";
        } else {
            str = "1";
        }
        return com.bytedance.common.wschannel.a.b.f27011a.a(a2.a("IsBackground", str).a());
    }

    private void a(Runnable runnable) {
        this.f27324a.post(runnable);
    }

    /* access modifiers changed from: package-private */
    public final void a(final IWsChannelClient iWsChannelClient) {
        this.f27324a.post(new Runnable() {
            /* class com.bytedance.common.wschannel.server.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(16085);
            }

            public final void run() {
                iWsChannelClient.sendMessage(b.this.a());
            }
        });
    }

    private void a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("param_name", str);
        c.a(this.f27325b, "wschannel_param_null", bundle);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        final Message obtain = Message.obtain(message);
        if (message.what == 1 || this.f27332i.b()) {
            a(new Runnable() {
                /* class com.bytedance.common.wschannel.server.b.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(16084);
                }

                /* JADX WARNING: Code restructure failed: missing block: B:106:0x0201, code lost:
                    if (r8 == false) goto L_0x020e;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 537
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.b.AnonymousClass2.run():void");
                }
            });
        } else if (message.what == 0) {
            a("CM_HANDLEMSH_DISABLE", 1);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Collection<IWsChannelClient> collection) {
        if (l.a(this.f27325b).b()) {
            byte[] a2 = a();
            for (IWsChannelClient iWsChannelClient : collection) {
                try {
                    iWsChannelClient.sendMessage(a2);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private Map<String, Object> c(IWsApp iWsApp) {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("app_key", iWsApp.h());
        hashMap.put("fpid", Integer.valueOf(iWsApp.i()));
        hashMap.put("sdk_version", 2);
        hashMap.put("platform", 0);
        hashMap.put("app_version", Integer.valueOf(iWsApp.e()));
        hashMap.put("aid", Integer.valueOf(iWsApp.b()));
        hashMap.put("device_id", iWsApp.c());
        hashMap.put("iid", iWsApp.d());
        hashMap.put("channel_id", Integer.valueOf(iWsApp.a()));
        String j2 = iWsApp.j();
        if (j2 == null) {
            a("extra");
            j2 = "";
        }
        if (l.a(this.f27325b).b()) {
            String[] split = j2.split("&");
            StringBuilder sb = new StringBuilder("is_background=");
            if (this.f27331h) {
                str = "0";
            } else {
                str = "1";
            }
            String sb2 = sb.append(str).toString();
            if (split.length <= 0 || TextUtils.isEmpty(split[0])) {
                j2 = sb2;
            } else {
                j2 = j2 + "&" + sb2;
            }
        }
        hashMap.put("extra", j2);
        if (iWsApp.c() == null) {
            a("device_id");
        }
        if (iWsApp.d() == null) {
            a("install_id");
        }
        if (m.a(iWsApp.h())) {
            a("app_key");
        }
        return hashMap;
    }

    private void d(IWsApp iWsApp) {
        IWsChannelClient iWsChannelClient;
        MethodCollector.i(6521);
        Logger.debug();
        synchronized (this.f27326c) {
            try {
                iWsChannelClient = this.f27329f.f27322b.get(Integer.valueOf(iWsApp.a()));
                if (iWsChannelClient == null) {
                    iWsChannelClient = com.bytedance.common.wschannel.channel.b.a(iWsApp.a(), this.f27328e, this.f27324a);
                    iWsChannelClient.init(this.f27325b, iWsChannelClient);
                    this.f27329f.f27322b.put(Integer.valueOf(iWsApp.a()), iWsChannelClient);
                }
            } finally {
                MethodCollector.o(6521);
            }
        }
        int i2 = 99;
        if (iWsChannelClient.isConnected()) {
            SocketState socketState = this.f27329f.f27323c.get(Integer.valueOf(iWsApp.a()));
            if (socketState != null) {
                try {
                    this.f27328e.a(socketState);
                    if (2 == socketState.f27268b) {
                        i2 = 1;
                    } else if (4 == socketState.f27268b) {
                        i2 = 0;
                    }
                    a("CM_TRYOPENCONNECTION_HAS_CONNECT", i2);
                } catch (Throwable unused) {
                    MethodCollector.o(6521);
                    return;
                }
            }
            return;
        }
        try {
            Logger.debug();
            iWsChannelClient.openConnection(c(iWsApp), iWsApp.k());
            a("CM_TRYOPENCONNECTION_OPEN", 99);
            MethodCollector.o(6521);
        } catch (Throwable unused2) {
            MethodCollector.o(6521);
        }
    }

    public final void a(Map<Integer, IWsApp> map) {
        l a2;
        Context context = this.f27325b;
        if ((context == null || (a2 = l.a(context)) == null || !a2.f27243a.a("key_enable_offline_detect", false) || h.a(this.f27325b)) && this.f27332i.b() && map != null) {
            for (IWsApp iWsApp : map.values()) {
                if (iWsApp != null) {
                    b(this, iWsApp);
                    a("CM_TRYCONNECT_DOREGISTER", 98);
                }
            }
        }
    }

    @Override // com.bytedance.common.wschannel.server.d.a
    public final void a(boolean z) {
        MethodCollector.i(6528);
        if (z) {
            a(this.f27327d.a());
            MethodCollector.o(6528);
            return;
        }
        try {
            synchronized (this.f27326c) {
                try {
                    for (Map.Entry<Integer, IWsChannelClient> entry : this.f27329f.f27322b.entrySet()) {
                        IWsChannelClient value = entry.getValue();
                        if (value != null) {
                            value.destroy();
                        }
                    }
                    this.f27329f.f27322b.clear();
                } catch (Throwable th) {
                    MethodCollector.o(6528);
                    throw th;
                }
            }
            this.f27329f.f27321a.clear();
            MethodCollector.o(6528);
        } catch (Throwable unused) {
            MethodCollector.o(6528);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lp_status", i2);
            this.f27328e.a(str, jSONObject);
        } catch (Exception unused) {
        }
    }

    private static void a(b bVar, IWsApp iWsApp) {
        MethodCollector.i(6509);
        ac.a("5.2->doOnParamChange");
        Logger.debug();
        int a2 = WsChannelService.a(iWsApp);
        if (bVar.b()) {
            try {
                IWsChannelClient iWsChannelClient = bVar.f27329f.f27322b.get(Integer.valueOf(iWsApp.a()));
                synchronized (WsChannelService.class) {
                    try {
                        IWsApp iWsApp2 = bVar.f27329f.f27321a.get(Integer.valueOf(a2));
                        if (iWsChannelClient == null) {
                            bVar.a("CM_DOONPARAMECHANGE_CLIENT_NULL", 1);
                        } else if (!iWsApp.equals(iWsApp2) || !iWsChannelClient.isConnected()) {
                            bVar.f27329f.f27321a.put(Integer.valueOf(a2), iWsApp);
                            bVar.f27327d.a(bVar.f27329f.f27321a);
                            iWsChannelClient.onParameterChange(bVar.c(iWsApp), iWsApp.k());
                            bVar.a("CM_DOONPARAMECHANGE_CHANGE", 99);
                            MethodCollector.o(6509);
                            return;
                        } else {
                            bVar.a("CM_DOONPARAMECHANGE_HAS_CONNECT", 0);
                        }
                        return;
                    } finally {
                        MethodCollector.o(6509);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        MethodCollector.o(6509);
    }

    private static void b(b bVar, IWsApp iWsApp) {
        boolean z;
        MethodCollector.i(6515);
        ac.a("5.0->doRegisterChannel");
        int a2 = WsChannelService.a(iWsApp);
        boolean z2 = true;
        if (!bVar.b()) {
            bVar.a("CM_DOREGISTERCHANNEL_DISABLE", 1);
            MethodCollector.o(6515);
            return;
        }
        synchronized (WsChannelService.class) {
            try {
                IWsApp iWsApp2 = bVar.f27329f.f27321a.get(Integer.valueOf(a2));
                IWsChannelClient iWsChannelClient = bVar.f27329f.f27322b.get(Integer.valueOf(a2));
                if (iWsApp2 != null) {
                    if (!iWsApp.equals(iWsApp2)) {
                        z = true;
                    } else if (iWsChannelClient != null) {
                        z = false;
                    }
                    z2 = false;
                } else {
                    bVar.f27329f.f27321a.put(Integer.valueOf(a2), iWsApp);
                    bVar.f27327d.a(bVar.f27329f.f27321a);
                }
                z = false;
            } catch (Throwable th) {
                MethodCollector.o(6515);
                throw th;
            }
        }
        if (z2) {
            p.a(iWsApp.j());
            ac.a("5.1->tryOpenConnection");
            bVar.d(iWsApp);
            MethodCollector.o(6515);
        } else if (z) {
            a(bVar, iWsApp);
            MethodCollector.o(6515);
        } else {
            bVar.a("CM_DOREGISTERCHANNEL_HAS_CONNECT", 0);
            MethodCollector.o(6515);
        }
    }

    b(Context context, Looper looper, e eVar, a aVar, a aVar2, final d dVar) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f27325b = applicationContext;
        this.f27324a = new WeakHandler(looper, this);
        this.f27327d = eVar;
        this.f27329f = aVar;
        this.f27328e = aVar2;
        this.f27332i = dVar;
        dVar.a(this);
        a(new Runnable() {
            /* class com.bytedance.common.wschannel.server.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16083);
            }

            public final void run() {
                dVar.a();
                b bVar = b.this;
                bVar.a(bVar.f27327d.a());
            }
        });
    }
}
