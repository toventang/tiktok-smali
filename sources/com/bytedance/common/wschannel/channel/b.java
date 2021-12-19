package com.bytedance.common.wschannel.channel;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.channel.a.a.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class b implements IWsChannelClient {

    /* renamed from: a  reason: collision with root package name */
    private static String f27166a = "";

    /* renamed from: h  reason: collision with root package name */
    private static boolean f27167h = true;

    /* renamed from: b  reason: collision with root package name */
    private final int f27168b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f27169c;

    /* renamed from: d  reason: collision with root package name */
    private List<String> f27170d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f27171e = true;

    /* renamed from: f  reason: collision with root package name */
    private IWsChannelClient f27172f;

    /* renamed from: g  reason: collision with root package name */
    private a f27173g;

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void stopConnection() {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            iWsChannelClient.stopConnection();
        }
    }

    static {
        Covode.recordClassIndex(16008);
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean isConnected() {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            return iWsChannelClient.isConnected();
        }
        return false;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void destroy() {
        String str;
        MethodCollector.i(9592);
        synchronized (this) {
            try {
                IWsChannelClient iWsChannelClient = this.f27172f;
                if (iWsChannelClient != null) {
                    iWsChannelClient.destroy();
                    if (!(this.f27172f instanceof a)) {
                        JSONObject jSONObject = new JSONObject();
                        List<String> list = this.f27170d;
                        if (list == null || list.size() <= 0) {
                            str = "";
                        } else {
                            str = this.f27170d.get(0);
                        }
                        try {
                            jSONObject.put(StringSet.type, 0);
                            jSONObject.put("state", 3);
                            jSONObject.put("url", str);
                            jSONObject.put("channel_type", 1);
                            a(jSONObject);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            } finally {
                MethodCollector.o(9592);
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onAppStateChanged(int i2) {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onAppStateChanged(i2);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onNetworkStateChanged(int i2) {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onNetworkStateChanged(i2);
        }
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onMessage(byte[] bArr) {
        a aVar = this.f27173g;
        if (aVar != null) {
            aVar.a(this.f27168b, bArr);
        }
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final boolean sendMessage(byte[] bArr) {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            return iWsChannelClient.sendMessage(bArr);
        }
        return false;
    }

    private void a(JSONObject jSONObject) {
        a aVar = this.f27173g;
        if (aVar != null) {
            aVar.a(this, this.f27168b, jSONObject);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0032 */
    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onConnection(org.json.JSONObject r6) {
        /*
            r5 = this;
            r4 = 9754(0x261a, float:1.3668E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r4)
            monitor-enter(r5)
            r5.a(r6)     // Catch:{ all -> 0x003c }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0032 }
            r3.<init>()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "state"
            int r2 = r6.optInt(r0)     // Catch:{ Exception -> 0x0032 }
            r1 = 2
            r0 = 99
            if (r1 != r2) goto L_0x001b
            r1 = 1
            goto L_0x001f
        L_0x001b:
            r0 = 4
            if (r0 != r2) goto L_0x0032
            r1 = 0
        L_0x001f:
            java.lang.String r0 = "lp_status"
            r3.put(r0, r1)     // Catch:{ Exception -> 0x0032 }
            com.bytedance.common.wschannel.channel.a r1 = r5.f27173g     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "WSCHANNEL_CLIENT_ON_CONNECTION"
            r1.a(r0, r3)     // Catch:{ Exception -> 0x0032 }
            com.bytedance.common.wschannel.d.b r1 = com.bytedance.common.wschannel.d.b.a.f27211a     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = "LP_WSCHANNEL_CLIENT_ON_CONNECTION_DIRECT"
            r1.a(r0, r3)     // Catch:{ Exception -> 0x0032 }
        L_0x0032:
            com.bytedance.common.wschannel.d.a r0 = com.bytedance.common.wschannel.d.a.C0584a.f27209a     // Catch:{ Exception -> 0x0037 }
            r0.a(r6)     // Catch:{ Exception -> 0x0037 }
        L_0x0037:
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            return
        L_0x003c:
            r0 = move-exception
            monitor-exit(r5)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.channel.b.onConnection(org.json.JSONObject):void");
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void onParameterChange(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            iWsChannelClient.onParameterChange(map, list);
        }
        this.f27170d = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void openConnection(Map<String, Object> map, List<String> list) {
        IWsChannelClient iWsChannelClient = this.f27172f;
        if (iWsChannelClient != null) {
            iWsChannelClient.openConnection(map, list);
        }
        this.f27170d = list;
    }

    @Override // com.bytedance.common.wschannel.channel.IWsChannelClient
    public final void init(Context context, IWsChannelClient iWsChannelClient) {
        IWsChannelClient iWsChannelClient2 = this.f27172f;
        if (iWsChannelClient2 != null) {
            try {
                iWsChannelClient2.init(context, iWsChannelClient);
            } catch (Throwable th) {
                if (!(this.f27172f instanceof a)) {
                    a aVar = new a(this.f27168b, this.f27169c);
                    this.f27172f = aVar;
                    aVar.init(context, iWsChannelClient);
                    return;
                }
                throw th;
            }
        }
    }

    public static b a(int i2, a aVar, Handler handler) {
        return new b(i2, aVar, handler);
    }

    private b(int i2, a aVar, Handler handler) {
        Class<?> cls;
        this.f27168b = i2;
        this.f27173g = aVar;
        this.f27169c = handler;
        if (f27167h) {
            try {
                if (this.f27172f == null) {
                    if (m.a(f27166a) || (cls = a(f27166a)) == null) {
                        cls = a("org.chromium.wschannel.MySelfChannelImpl");
                        this.f27171e = true;
                        if (cls == null) {
                            cls = a("com.b.c.ws.MySelfChannelImpl");
                            this.f27171e = false;
                            if (cls == null) {
                                throw new ClassNotFoundException("plugin class not found");
                            }
                        }
                    }
                    Object newInstance = cls.newInstance();
                    if (newInstance instanceof IWsChannelClient) {
                        this.f27172f = (IWsChannelClient) newInstance;
                    }
                }
                if (!this.f27171e) {
                    f27167h = false;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        if (this.f27172f == null) {
            this.f27172f = new a(i2, handler);
        }
    }
}
