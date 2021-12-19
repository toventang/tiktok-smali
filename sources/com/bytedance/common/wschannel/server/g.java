package com.bytedance.common.wschannel.server;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.wschannel.a.b;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.common.wschannel.channel.a;
import com.bytedance.common.wschannel.client.c;
import com.bytedance.common.wschannel.e;
import com.bytedance.common.wschannel.l;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public b f27357a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f27358b;

    /* renamed from: c  reason: collision with root package name */
    private final a f27359c;

    /* renamed from: d  reason: collision with root package name */
    private c.a f27360d = new e();

    /* renamed from: e  reason: collision with root package name */
    private c f27361e = new c(this.f27360d);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicInteger f27362f = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(16099);
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a() {
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void b() {
        Intent intent = new Intent();
        intent.setAction("com.bytedance.article.wschannel.syncconnectstate");
        intent.putParcelableArrayListExtra("connection", new ArrayList<>(this.f27359c.f27323c.values()));
        this.f27361e.a(intent, (com.bytedance.common.wschannel.model.a) null);
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(SocketState socketState) {
        if (socketState != null) {
            this.f27359c.f27323c.put(Integer.valueOf(socketState.f27270d), socketState);
            try {
                Intent intent = new Intent();
                intent.setAction("com.bytedance.article.wschannel.receive.connection");
                intent.putExtra("connection", socketState);
                this.f27361e.a(intent, (com.bytedance.common.wschannel.model.a) null);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(WsChannelMsg wsChannelMsg, boolean z) {
        this.f27360d.b(wsChannelMsg);
    }

    g(Context context, a aVar) {
        this.f27358b = context;
        this.f27359c = aVar;
    }

    @Override // com.bytedance.common.wschannel.channel.a
    public final void a(int i2, byte[] bArr) {
        if (bArr != null) {
            WsChannelService.a aVar = new WsChannelService.a(i2, bArr, 0);
            if (aVar.f27319b != null) {
                try {
                    byte[] bArr2 = aVar.f27319b;
                    Logger.debug();
                    WsChannelMsg a2 = b.f27011a.a(bArr2);
                    if (a2 != WsChannelMsg.f27294c) {
                        a2.f27304m = aVar.f27318a;
                        a2.f27303l = new ComponentName(this.f27358b, WsChannelService.class);
                        Logger.debug();
                        if (this.f27359c.f27321a == null) {
                            return;
                        }
                        if (this.f27359c.f27321a.size() > 0) {
                            for (Map.Entry<Integer, IWsApp> entry : this.f27359c.f27321a.entrySet()) {
                                IWsApp value = entry.getValue();
                                if (value != null && value.a() == a2.f27304m) {
                                    Intent intent = new Intent();
                                    intent.setAction("com.bytedance.article.wschannel.receive.payload");
                                    intent.putExtra("payload", a2);
                                    if (Logger.debug()) {
                                        intent.putExtra("msg_count", this.f27362f.addAndGet(1));
                                    }
                                    this.f27361e.a(intent, (com.bytedance.common.wschannel.model.a) null);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
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
            if (l.a(this.f27358b).b()) {
                this.f27357a.a(iWsChannelClient);
            }
        }
    }
}
