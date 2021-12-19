package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.net.Uri;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.model.c;
import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.android.livesdkapi.ws.d;
import com.bytedance.common.wschannel.a;
import com.bytedance.common.wschannel.app.e;
import com.bytedance.common.wschannel.h;
import com.bytedance.common.wschannel.k;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.q;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.g;
import com.ss.android.ugc.aweme.ttlive.ILiveApi;
import com.ss.android.ugc.aweme.utils.in;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class x implements IHostNetwork {

    /* renamed from: a  reason: collision with root package name */
    private volatile ILiveApi f108499a;

    static {
        Covode.recordClassIndex(69534);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    static class a implements c<com.bytedance.android.livesdkapi.model.a> {

        /* renamed from: a  reason: collision with root package name */
        private b<TypedInput> f108510a;

        static {
            Covode.recordClassIndex(69539);
        }

        @Override // com.bytedance.android.livesdkapi.model.c
        public final void b() {
            this.f108510a.cancel();
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003a A[Catch:{ Exception -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[Catch:{ Exception -> 0x00b0 }, LOOP:0: B:21:0x004f->B:23:0x0055, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0068 A[Catch:{ Exception -> 0x00b0 }] */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0089 A[Catch:{ Exception -> 0x00b0 }] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bytedance.android.livesdkapi.model.a a() {
            /*
            // Method dump skipped, instructions count: 211
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.x.a.a():com.bytedance.android.livesdkapi.model.a");
        }

        a(b<TypedInput> bVar) {
            this.f108510a = bVar;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final Map<String, String> getCommonParams() {
        HashMap hashMap = new HashMap();
        q.b(hashMap, false);
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final String getHostDomain() {
        return ((g) com.bytedance.l.a.a(g.class)).a();
    }

    private ILiveApi a() {
        if (this.f108499a == null) {
            this.f108499a = (ILiveApi) RetrofitFactory.a().b("https://" + LiveHostOuterService.q().a()).d().a(ILiveApi.class);
        }
        return this.f108499a;
    }

    /* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.x$4  reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f108509a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 69538(0x10fa2, float:9.7443E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.common.wschannel.b.c[] r0 = com.bytedance.common.wschannel.b.c.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.f108509a = r2
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECTION_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.f108509a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECTING     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.f108509a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECT_FAILED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.f108509a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECT_CLOSED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.f108509a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.bytedance.common.wschannel.b.c r0 = com.bytedance.common.wschannel.b.c.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass4.<clinit>():void");
        }
    }

    private static Map<String, String> a(List<com.bytedance.android.live.base.model.a> list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            for (com.bytedance.android.live.base.model.a aVar : list) {
                hashMap.put(aVar.getName(), aVar.getValue());
            }
        }
        return hashMap;
    }

    private static void a(String str) {
        if (in.d()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("url", str);
                jSONObject.putOpt("source", "livesdk");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            com.bytedance.apm.b.a("ttlive_minor_mode_live", 1, jSONObject);
        }
    }

    public static byte[] a(InputStream inputStream) {
        MethodCollector.i(1260);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (inputStream != null) {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        MethodCollector.o(1260);
        return byteArray;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final c<com.bytedance.android.livesdkapi.model.a> get(String str, List<com.bytedance.android.live.base.model.a> list, Object obj) {
        b<TypedInput> bVar = a().get(str, a(list), obj);
        a(str);
        return new a(bVar);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final com.bytedance.android.livesdkapi.ws.a registerWsChannel(Context context, String str, Map<String, String> map, final d dVar) {
        map.put("sid", AppLog.getSessionKey());
        try {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            for (String str2 : map.keySet()) {
                buildUpon.appendQueryParameter(str2, map.get(str2));
            }
            str = buildUpon.build().toString();
        } catch (Throwable unused) {
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        HashMap hashMap = new HashMap();
        hashMap.put("ttnet_ignore_offline", "1");
        a.C0580a a2 = a.C0580a.a(10001);
        a2.f27007f = "e1bd35ec9db7b8d846de66ed140b1ad9";
        a2.f27005d = 9;
        a2.f27004c = com.bytedance.ies.ugc.appcontext.d.n;
        a2.f27006e = (int) com.bytedance.ies.ugc.appcontext.d.e();
        a2.f27008g = DeviceRegisterManager.getDeviceId();
        a2.f27009h = DeviceRegisterManager.getInstallId();
        final h a3 = k.a(context, a2.a(arrayList).a(hashMap).a(), new e() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass2 */

            static {
                Covode.recordClassIndex(69536);
            }

            @Override // com.bytedance.common.wschannel.app.e
            public final void a(WsChannelMsg wsChannelMsg) {
                if (wsChannelMsg != null && wsChannelMsg.f27304m == 10001) {
                    LiveWsMessage.a aVar = new LiveWsMessage.a(wsChannelMsg.f27304m);
                    aVar.f23396b = wsChannelMsg.f27296e;
                    aVar.f23398d = wsChannelMsg.f27298g;
                    aVar.f23402h = wsChannelMsg.f27295d;
                    aVar.f23397c = wsChannelMsg.f27297f;
                    aVar.f23400f = wsChannelMsg.f27301j;
                    aVar.f23401g = wsChannelMsg.f27300i;
                    aVar.f23399e = wsChannelMsg.a();
                    aVar.f23403i = wsChannelMsg.f27303l;
                    if (wsChannelMsg.f27299h != null) {
                        for (WsChannelMsg.MsgHeader msgHeader : wsChannelMsg.f27299h) {
                            aVar.f23395a.put(msgHeader.f27305a, msgHeader.f27306b);
                        }
                    }
                    dVar.a(aVar.b());
                }
            }

            @Override // com.bytedance.common.wschannel.app.e
            public final void a(com.bytedance.common.wschannel.b.b bVar, JSONObject jSONObject) {
                if (bVar != null && bVar.f27018c == 10001) {
                    com.bytedance.android.livesdkapi.ws.b bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECTION_UNKNOWN;
                    int i2 = AnonymousClass4.f108509a[bVar.f27017b.ordinal()];
                    if (i2 == 1) {
                        bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECTION_UNKNOWN;
                    } else if (i2 == 2) {
                        bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECTING;
                    } else if (i2 == 3) {
                        bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECT_FAILED;
                    } else if (i2 == 4) {
                        bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECT_CLOSED;
                    } else if (i2 == 5) {
                        bVar2 = com.bytedance.android.livesdkapi.ws.b.CONNECTED;
                    }
                    dVar.a(bVar2, jSONObject);
                }
            }
        });
        return new com.bytedance.android.livesdkapi.ws.a() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69537);
            }

            @Override // com.bytedance.android.livesdkapi.ws.a
            public final boolean a() {
                return a3.b();
            }

            @Override // com.bytedance.android.livesdkapi.ws.a
            public final void b() {
                a3.a();
            }

            @Override // com.bytedance.android.livesdkapi.ws.a
            public final void a(LiveWsMessage liveWsMessage) {
                WsChannelMsg.a aVar = new WsChannelMsg.a(liveWsMessage.f23392k);
                aVar.f27307a = liveWsMessage.f23384c;
                aVar.f27309c = liveWsMessage.f23386e;
                aVar.f27313g = liveWsMessage.f23383b;
                aVar.f27308b = liveWsMessage.f23385d;
                aVar.f27311e = liveWsMessage.f23389h;
                aVar.f27312f = liveWsMessage.f23388g;
                aVar.f27310d = liveWsMessage.a();
                aVar.f27314h = liveWsMessage.f23391j;
                if (liveWsMessage.f23387f != null) {
                    for (LiveWsMessage.MsgHeader msgHeader : liveWsMessage.f23387f) {
                        aVar.a(msgHeader.f23393a, msgHeader.f23394b);
                    }
                }
                a3.a(aVar.a());
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final c<com.bytedance.android.livesdkapi.model.a> downloadFile(boolean z, int i2, String str, List<com.bytedance.android.live.base.model.a> list, Object obj) {
        b<TypedInput> downloadFile = a().downloadFile(z, i2, str, a(list), obj);
        a(str);
        return new a(downloadFile);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final c<com.bytedance.android.livesdkapi.model.a> post(String str, List<com.bytedance.android.live.base.model.a> list, String str2, byte[] bArr, Object obj) {
        b<TypedInput> post = a().post(str, new TypedByteArray(str2, bArr, new String[0]), a(list), obj);
        a(str);
        return new a(post);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostNetwork
    public final c<com.bytedance.android.livesdkapi.model.a> uploadFile(int i2, String str, List<com.bytedance.android.live.base.model.a> list, final String str2, final byte[] bArr, final long j2, final String str3) {
        b<TypedInput> postMultiPart = a().postMultiPart(i2, str, a(list), new TypedOutput() {
            /* class com.ss.android.ugc.aweme.live.livehostimpl.x.AnonymousClass1 */

            static {
                Covode.recordClassIndex(69535);
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String fileName() {
                return null;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final long length() {
                return j2;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String md5Stub() {
                return str3;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final String mimeType() {
                return str2;
            }

            @Override // com.bytedance.retrofit2.mime.TypedOutput
            public final void writeTo(OutputStream outputStream) {
                MethodCollector.i(2798);
                outputStream.write(bArr);
                MethodCollector.o(2798);
            }
        });
        a(str);
        return new a(postMultiPart);
    }
}
