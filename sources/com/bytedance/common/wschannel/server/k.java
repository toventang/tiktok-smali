package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.d;
import com.bytedance.common.wschannel.a.b;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.a;
import com.bytedance.common.wschannel.client.WsClientService;
import com.bytedance.common.wschannel.e.c;
import com.bytedance.common.wschannel.model.NewMsgTimeHolder;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.cw.l;
import com.ss.android.ugc.aweme.cw.o;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f27371a = new AtomicBoolean(true);

    /* renamed from: b  reason: collision with root package name */
    final Context f27372b;

    /* renamed from: c  reason: collision with root package name */
    final a f27373c;

    /* renamed from: d  reason: collision with root package name */
    public b f27374d;

    /* renamed from: e  reason: collision with root package name */
    public BlockingQueue<WsChannelService.a> f27375e = new LinkedBlockingQueue();

    /* renamed from: f  reason: collision with root package name */
    private final c f27376f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f27377g;

    /* renamed from: h  reason: collision with root package name */
    private ExecutorService f27378h;

    /* renamed from: i  reason: collision with root package name */
    private Runnable f27379i;

    /* renamed from: j  reason: collision with root package name */
    private Future<?> f27380j;

    private Runnable e() {
        return new Runnable() {
            /* class com.bytedance.common.wschannel.server.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(16107);
            }

            public final void run() {
                try {
                    Thread.currentThread().setName("MessageDispatcher");
                    while (true) {
                        Thread.currentThread();
                        if (Thread.interrupted()) {
                            break;
                        }
                        k.f27371a.getAndSet(true);
                        WsChannelService.a take = k.this.f27375e.take();
                        try {
                            k kVar = k.this;
                            if (take != null) {
                                if (take.f27319b != null) {
                                    byte[] bArr = take.f27319b;
                                    Logger.debug();
                                    long c2 = kVar.c();
                                    WsChannelMsg a2 = b.f27011a.a(bArr);
                                    long c3 = kVar.c();
                                    if (a2 != WsChannelMsg.f27294c) {
                                        a2.n = new NewMsgTimeHolder(take.f27320c, c2, c3);
                                        a2.f27304m = take.f27318a;
                                        a2.f27303l = new ComponentName(kVar.f27372b, WsChannelService.class);
                                        Logger.debug();
                                        if (kVar.f27373c.f27321a != null) {
                                            if (kVar.f27373c.f27321a.size() > 0) {
                                                for (Map.Entry<Integer, IWsApp> entry : kVar.f27373c.f27321a.entrySet()) {
                                                    IWsApp value = entry.getValue();
                                                    if (value != null && value.a() == a2.f27304m) {
                                                        try {
                                                            Intent intent = new Intent();
                                                            intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                                            intent.setComponent(new ComponentName(kVar.f27372b, WsClientService.class));
                                                            intent.putExtra("payload", a2);
                                                            kVar.a(intent);
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable unused3) {
                }
                k.f27371a.getAndSet(false);
            }
        };
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a() {
        this.f27376f.f27339a.a();
    }

    static {
        Covode.recordClassIndex(16106);
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        if (this.f27377g) {
            return c.a();
        }
        return 0;
    }

    private void d() {
        if (this.f27379i == null) {
            this.f27379i = e();
        }
        try {
            this.f27380j = this.f27378h.submit(this.f27379i);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void b() {
        try {
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
            intent.setComponent(new ComponentName(this.f27372b, WsClientService.class));
            intent.putParcelableArrayListExtra("connection", new ArrayList<>(this.f27373c.f27323c.values()));
            a(intent);
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Intent intent) {
        this.f27376f.a(intent);
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(SocketState socketState) {
        if (socketState != null) {
            this.f27373c.f27323c.put(Integer.valueOf(socketState.f27270d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.setComponent(new ComponentName(this.f27372b, WsClientService.class));
                intent.putExtra("connection", socketState);
                a(intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(int i2, byte[] bArr) {
        if (bArr != null) {
            try {
                this.f27375e.offer(new WsChannelService.a(i2, bArr, c()));
                f27371a.getAndSet(true);
                d();
            } catch (Throwable unused) {
            }
        }
    }

    k(Context context, a aVar) {
        l.a a2 = l.a(o.FIXED);
        a2.f79174c = 1;
        this.f27378h = g.a(a2.a());
        this.f27379i = e();
        this.f27380j = null;
        this.f27372b = context;
        this.f27373c = aVar;
        this.f27376f = new c(context, WsClientService.class);
        this.f27377g = true;
        d();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.k.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(WsChannelMsg wsChannelMsg, boolean z) {
        ComponentName componentName = wsChannelMsg.f27303l;
        if (componentName != null) {
            try {
                byte[] a2 = wsChannelMsg.a();
                if (a2 == null) {
                    a2 = new byte[1];
                }
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.send.payload");
                intent.setComponent(componentName);
                intent.putExtra("send_result", z);
                intent.putExtra("payload_md5", d.b(a2));
                Logger.debug();
                a(this.f27372b, intent);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(String str, JSONObject jSONObject) {
        try {
            jSONObject.put("link_progress", str);
            Intent intent = new Intent();
            intent.setAction("com.bytedance.article.wschannel.receive.progress");
            intent.setComponent(new ComponentName(this.f27372b, WsClientService.class));
            intent.putExtra("link_progress", jSONObject.toString());
            a(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(IWsChannelClient iWsChannelClient, int i2, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("channel_id", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a(SocketState.a(jSONObject));
            if (com.bytedance.common.wschannel.l.a(this.f27372b).b()) {
                this.f27374d.a(iWsChannelClient);
            }
            Logger.debug();
        }
    }
}
