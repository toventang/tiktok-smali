package com.bytedance.android.livesdk.client;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.e.a.a.d;
import com.bytedance.android.e.a.a.f;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.h;
import com.bytedance.android.livesdk.MessageApi;
import com.bytedance.android.livesdk.ak;
import com.bytedance.android.livesdk.al;
import com.bytedance.android.livesdk.as;
import com.bytedance.android.livesdk.j.dh;
import com.bytedance.android.livesdk.livesetting.message.HotLiveMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveWsMessageDecodeUploadLarkCloudSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.android.livesdk.z;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.android.livesdkapi.ws.a;
import com.bytedance.android.livesdkapi.ws.b;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.kakao.usermgmt.StringSet;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c implements IMessageWsClient {

    /* renamed from: f  reason: collision with root package name */
    private static final int f16698f = HotLiveMessageSizeSetting.INSTANCE.getValue();

    /* renamed from: a  reason: collision with root package name */
    public IMessageWsClient.Callback f16699a;

    /* renamed from: b  reason: collision with root package name */
    public long f16700b;

    /* renamed from: c  reason: collision with root package name */
    public String f16701c;

    /* renamed from: d  reason: collision with root package name */
    public ak f16702d = new ak();

    /* renamed from: e  reason: collision with root package name */
    public a f16703e;

    /* renamed from: g  reason: collision with root package name */
    private long f16704g;

    /* renamed from: h  reason: collision with root package name */
    private Context f16705h;

    /* renamed from: i  reason: collision with root package name */
    private MessageApi f16706i = ((MessageApi) e.a().a(MessageApi.class));

    /* renamed from: j  reason: collision with root package name */
    private long f16707j;

    /* renamed from: k  reason: collision with root package name */
    private String f16708k;

    /* renamed from: l  reason: collision with root package name */
    private String f16709l;

    /* renamed from: m  reason: collision with root package name */
    private long f16710m;
    private long n;
    private long o;
    private boolean p = true;
    private boolean q = true;
    private f r = new f();
    private com.bytedance.android.livesdk.f s = new com.bytedance.android.livesdk.f();
    private String t;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private long x = 0;
    private final as y;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStartMessage() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onStopMessage() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final long getUserId() {
        return this.f16704g;
    }

    static {
        Covode.recordClassIndex(9263);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final boolean isWsConnected() {
        a aVar = this.f16703e;
        if (aVar != null) {
            return aVar.a();
        }
        return false;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void onRelease() {
        z.a(this.u, this.v);
        z.a(this.x, (long) this.w);
    }

    private void a() {
        this.f16710m = -1;
        this.n = 0;
        this.o = 0;
    }

    /* renamed from: com.bytedance.android.livesdk.client.c$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16717a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 9265(0x2431, float:1.2983E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.ws.b[] r0 = com.bytedance.android.livesdkapi.ws.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.client.c.AnonymousClass2.f16717a = r2
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.ws.b.CONNECTION_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.client.c.AnonymousClass2.f16717a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.ws.b.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.client.c.AnonymousClass2.f16717a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.ws.b.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.client.c.AnonymousClass2.f16717a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.ws.b.CONNECT_CLOSED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.client.c.AnonymousClass2.f16717a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdkapi.ws.b r0 = com.bytedance.android.livesdkapi.ws.b.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.c.AnonymousClass2.<clinit>():void");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setCallback(IMessageWsClient.Callback callback) {
        this.f16699a = callback;
    }

    private static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void setWebSocketServerTimeGap(long j2) {
        if (isWsConnected()) {
            an.f22242a = j2;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeHostWebSocketPayload(PayloadItem payloadItem) {
        try {
            ProtoApiResult a2 = a(d.a(al.a(payloadItem)), false, true, 2);
            a2.payloadType = payloadItem.getPayloadType();
            a2.logId = payloadItem.getLogId();
            IMessageWsClient.Callback callback = this.f16699a;
            if (callback != null) {
                callback.onHostWebSocketPayloadDecoded(a2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void decodeWebSocketPayload(PayloadItem payloadItem) {
        try {
            ProtoApiResult a2 = a(d.a(al.a(payloadItem)), false, true, 1);
            a2.payloadType = payloadItem.getPayloadType();
            a2.logId = payloadItem.getLogId();
            IMessageWsClient.Callback callback = this.f16699a;
            if (callback != null) {
                callback.onWebSocketPayloadDecoded(a2);
            }
            if (LiveWsMessageDecodeUploadLarkCloudSetting.INSTANCE.getValue()) {
                l.d(a2, "");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void disconnectFromWebSocket(String str) {
        this.s.f17210a = null;
        a aVar = this.f16703e;
        if (aVar != null) {
            aVar.b();
        }
        if (TextUtils.equals(str, "ws_connect_timeout")) {
            this.f16702d.a(this.f16700b, -1, str, this.t, null);
        } else if (TextUtils.equals(str, "retry_count_over")) {
            this.f16702d.a(this.f16700b, str, this.t);
        } else if (TextUtils.equals(str, "service_close_cmd")) {
            this.f16702d.a(this.f16700b, str, this.t);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendUplinkPacket(PayloadItem payloadItem) {
        a aVar = this.f16703e;
        if (aVar != null && aVar.a() && "uplink_im_gateway".equals(payloadItem.getPayloadType())) {
            LiveWsMessage.a a2 = LiveWsMessage.a.a();
            a2.f23396b = payloadItem.getLogId();
            a2.f23402h = payloadItem.getSeqId();
            a2.f23397c = 20045;
            a2.f23398d = 1;
            a2.f23399e = payloadItem.getPayload();
            a2.f23400f = payloadItem.getPayloadType();
            a2.f23401g = payloadItem.getPayloadEncoding();
            this.f16703e.a(a2.b());
        }
    }

    public final void a(long j2, Context context) {
        Context applicationContext;
        this.f16700b = j2;
        if (context != null) {
            applicationContext = a(context);
        } else {
            applicationContext = GlobalContext.getApplicationContext();
        }
        this.f16705h = applicationContext;
    }

    public c(boolean z, long j2) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "audience";
        }
        this.f16708k = str;
        this.f16704g = j2;
        this.y = (as) com.bytedance.android.live.t.a.a(IMessageService.class);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void connectToWebSocket(Map<String, String> map, String str) {
        String str2 = this.t;
        if (TextUtils.isEmpty(str2)) {
            this.f16699a.onWebSocketDisconnected();
            return;
        }
        String uri = Uri.parse(str2).buildUpon().appendQueryParameter("live_region", (String) DataChannelGlobal.f34575d.b(dh.class)).build().toString();
        HashMap hashMap = new HashMap(h.a().b());
        hashMap.put("room_id", String.valueOf(this.f16700b));
        hashMap.put("rid", String.valueOf(this.f16700b));
        hashMap.put("aid", String.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).appId()));
        hashMap.put("identity", this.f16708k);
        hashMap.put("live_id", String.valueOf(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).liveId()));
        hashMap.put("compress", "gzip");
        HashMap hashMap2 = new HashMap(hashMap);
        if (map != null) {
            hashMap2.putAll(map);
        }
        hashMap2.put("cursor", str);
        this.f16702d.a();
        this.s.f17210a = new com.bytedance.android.livesdkapi.ws.d(uri, hashMap2) {
            /* class com.bytedance.android.livesdk.client.c.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final HashMap<String, String> f16711a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ String f16712b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ HashMap f16713c;

            /* renamed from: e  reason: collision with root package name */
            private boolean f16715e;

            /* renamed from: f  reason: collision with root package name */
            private String f16716f;

            static {
                Covode.recordClassIndex(9264);
            }

            /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
            @Override // com.bytedance.android.livesdkapi.ws.d
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(com.bytedance.android.livesdkapi.ws.LiveWsMessage r13) {
                /*
                // Method dump skipped, instructions count: 149
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.c.AnonymousClass1.a(com.bytedance.android.livesdkapi.ws.LiveWsMessage):void");
            }

            @Override // com.bytedance.android.livesdkapi.ws.d
            public final void a(b bVar, JSONObject jSONObject) {
                String str;
                int i2;
                int i3 = AnonymousClass2.f16717a[bVar.ordinal()];
                if (i3 == 1) {
                    com.bytedance.android.live.core.c.a.a(4, "LiveWs", "CONNECTION_UNKNOWN");
                } else if (i3 == 2) {
                    com.bytedance.android.live.core.c.a.a(4, "LiveWs", "CONNECTING");
                    c.this.f16702d.a();
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 == 5) {
                            com.bytedance.android.live.core.c.a.a(4, "LiveWs", "CONNECTED");
                            if (c.this.f16699a != null) {
                                this.f16715e = true;
                                if (c.this.f16703e != null) {
                                    com.bytedance.android.livesdkapi.ws.c a2 = com.bytedance.android.livesdkapi.ws.c.a();
                                    a2.f23407a = new WeakReference<>(c.this.f16703e);
                                    if (!(a2.f23408b == null || a2.f23408b.get() == null)) {
                                        a2.f23408b.get();
                                    }
                                }
                                ak akVar = c.this.f16702d;
                                long j2 = c.this.f16700b;
                                long b2 = akVar.b();
                                JSONObject jSONObject2 = new JSONObject();
                                com.bytedance.android.live.core.performance.b.a(jSONObject2, "room_id", j2);
                                com.bytedance.android.live.core.d.c.a(ak.f13930a, 0, b2, jSONObject2);
                                c.this.f16699a.onWebSocketConnected();
                                com.bytedance.android.live.core.c.a.a(4, "LiveWs", "callback.onWebSocketConnected");
                            }
                        }
                    } else if (c.this.f16699a != null) {
                        if (jSONObject != null) {
                            com.bytedance.android.live.core.c.a.a(4, "LiveWs", "CONNECT_CLOSED: " + jSONObject.toString());
                            int optInt = jSONObject.optInt("error_code", 0);
                            String jSONObject3 = jSONObject.toString();
                            if (optInt != 0) {
                                c.this.f16702d.a(c.this.f16700b, optInt, jSONObject3, this.f16716f, this.f16711a);
                            }
                        }
                        if (this.f16715e) {
                            if (c.this.f16703e != null) {
                                c.this.f16703e.b();
                            }
                            com.bytedance.android.livesdkapi.ws.c.a().b();
                            c.this.f16699a.onWebSocketDisconnected();
                            com.bytedance.android.live.core.c.a.a(4, "LiveWs", "callback.onWebSocketDisconnected");
                        }
                        this.f16715e = false;
                    }
                } else if (c.this.f16699a != null) {
                    if (jSONObject != null) {
                        com.bytedance.android.live.core.c.a.a(4, "LiveWs", "CONNECT_FAILED: " + jSONObject.toString());
                        int optInt2 = jSONObject.optInt("channel_type");
                        int optInt3 = jSONObject.optInt(StringSet.type, 1);
                        String optString = jSONObject.optString("error", "");
                        if (optInt2 != 1 || optInt3 != 1 || !TextUtils.isEmpty(optString)) {
                            i2 = jSONObject.optInt("error_code", -1);
                            str = jSONObject.toString();
                        } else {
                            return;
                        }
                    } else {
                        str = "connect failed reason unknow";
                        i2 = -1;
                    }
                    if (TextUtils.equals(str.trim(), "internet is down, skip...")) {
                        c.this.f16702d.a(c.this.f16700b, "ttnet no internet check", this.f16716f);
                    } else {
                        c.this.f16702d.a(c.this.f16700b, i2, str, this.f16716f, this.f16711a);
                    }
                    if (c.this.f16703e != null) {
                        c.this.f16703e.b();
                    }
                    com.bytedance.android.livesdkapi.ws.c.a().b();
                    c.this.f16699a.onWebSocketDisconnected();
                    com.bytedance.android.live.core.c.a.a(4, "LiveWs", "callback.onWebSocketDisconnected");
                    this.f16715e = false;
                }
            }

            {
                this.f16712b = r2;
                this.f16713c = r3;
                this.f16716f = r2;
                this.f16711a = r3;
            }
        };
        h.a();
        this.f16703e = ((IHostNetwork) com.bytedance.android.live.t.a.a(IHostNetwork.class)).registerWsChannel(this.f16705h, uri, hashMap2, this.s);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 2 */
    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void apiCall(java.util.Map<java.lang.String, java.lang.String> r11, int r12) {
        /*
        // Method dump skipped, instructions count: 485
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.c.apiCall(java.util.Map, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x022b A[Catch:{ all -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.ss.ugc.live.sdk.message.data.ProtoApiResult a(com.bytedance.android.e.a.a.d.b r18, boolean r19, boolean r20, int r21) {
        /*
        // Method dump skipped, instructions count: 793
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.client.c.a(com.bytedance.android.e.a.a.d$b, boolean, boolean, int):com.ss.ugc.live.sdk.message.data.ProtoApiResult");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final void sendWebSocketMessage(String str, String str2, byte[] bArr, long j2, long j3) {
        a aVar = this.f16703e;
        if (aVar != null && aVar.a()) {
            LiveWsMessage.a a2 = LiveWsMessage.a.a();
            a2.f23396b = j2;
            a2.f23397c = 1;
            a2.f23398d = 1;
            a2.f23399e = bArr;
            a2.f23400f = str2;
            a2.f23401g = str;
            this.f16703e.a(a2.b());
        }
    }
}
