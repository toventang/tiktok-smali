package com.bytedance.sdk.xbridge.protocol.impl.b;

import android.os.Handler;
import android.os.Looper;
import android.webkit.ValueCallback;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a.b;
import com.bytedance.sdk.xbridge.protocol.c;
import com.bytedance.sdk.xbridge.protocol.c.f;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import h.f.b.l;
import h.m.d;
import h.q;
import h.r;
import h.w;
import h.z;
import java.nio.charset.Charset;
import org.json.JSONObject;

public abstract class e extends com.bytedance.sdk.xbridge.protocol.c.e implements com.bytedance.sdk.xbridge.protocol.c.a {

    /* renamed from: a  reason: collision with root package name */
    public f f44018a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f44019b = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final String f44020d = "WebJSBridge";

    static {
        Covode.recordClassIndex(26881);
    }

    public abstract String a(com.bytedance.sdk.xbridge.protocol.a.a aVar, com.bytedance.sdk.xbridge.protocol.a.b bVar);

    public abstract void a(String str, JSONObject jSONObject);

    public abstract String b();

    public abstract com.bytedance.sdk.xbridge.protocol.a.a d(String str);

    @Override // com.bytedance.sdk.xbridge.protocol.c.e
    public void a() {
        f fVar = this.f43955c.f43921c;
        if (fVar != null) {
            fVar.a(this, b());
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f44021a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44022b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a.d.C1071a f44023c;

        static {
            Covode.recordClassIndex(26882);
        }

        a(e eVar, String str, a.d.C1071a aVar) {
            this.f44021a = eVar;
            this.f44022b = str;
            this.f44023c = aVar;
        }

        public final void run() {
            Object obj;
            z zVar;
            long currentTimeMillis = System.currentTimeMillis();
            String str = this.f44022b;
            if (str == null) {
                com.bytedance.sdk.xbridge.protocol.a.b f2 = e.f("invoke msg is empty");
                com.bytedance.sdk.xbridge.protocol.c.b bVar = this.f44021a.f43955c.f43920b;
                if (bVar != null) {
                    bVar.a();
                }
                this.f44021a.a(f2, null, null);
                return;
            }
            com.bytedance.sdk.xbridge.protocol.a.a d2 = this.f44021a.d(str);
            a.d.C1071a aVar = this.f44023c;
            if (aVar != null) {
                aVar.f43997k = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                aVar.f43995i = Long.valueOf(d2.f43935i);
                aVar.f43996j = Long.valueOf(currentTimeMillis);
                if (!(aVar.f43996j == null || aVar.f43995i == null)) {
                    Long l2 = aVar.f43996j;
                    if (l2 == null) {
                        l.a();
                    }
                    long longValue = l2.longValue();
                    Long l3 = aVar.f43995i;
                    if (l3 == null) {
                        l.a();
                    }
                    aVar.f43998l = Long.valueOf(longValue - l3.longValue());
                }
                String str2 = this.f44022b;
                Charset charset = d.f158808a;
                if (str2 != null) {
                    byte[] bytes = str2.getBytes(charset);
                    l.a((Object) bytes, "");
                    aVar.f43994h = Integer.valueOf(bytes.length);
                    String str3 = d2.f43928b;
                    l.c(str3, "");
                    aVar.f43987a = str3;
                    String str4 = d2.f43929c;
                    l.c(str4, "");
                    aVar.f43993g = str4;
                    String str5 = com.bytedance.sdk.xbridge.protocol.impl.a.a.f43962b;
                    l.c(str5, "");
                    aVar.f43989c = str5;
                } else {
                    throw new w("null cannot be cast to non-null type");
                }
            }
            try {
                com.bytedance.sdk.xbridge.protocol.b.a aVar2 = this.f44021a.f43955c.f43919a;
                if (aVar2 != null) {
                    e eVar = this.f44021a;
                    aVar2.a(d2, eVar, eVar.f43955c, this.f44023c);
                    zVar = z.f158842a;
                } else {
                    zVar = null;
                }
                obj = q.m223constructorimpl(zVar);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            Throwable r2 = q.m226exceptionOrNullimpl(obj);
            if (r2 != null) {
                com.bytedance.sdk.xbridge.protocol.a.b f3 = e.f("invoke msg exception," + r2.getMessage());
                com.bytedance.sdk.xbridge.protocol.c.b bVar2 = this.f44021a.f43955c.f43920b;
                if (bVar2 != null) {
                    bVar2.a();
                }
                this.f44021a.a(f3, null, null);
            }
        }
    }

    public static com.bytedance.sdk.xbridge.protocol.a.b f(String str) {
        l.c(str, "");
        return b.a.a(0, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.bytedance.sdk.xbridge.protocol.a aVar) {
        super(aVar);
        l.c(aVar, "");
        this.f44018a = aVar.f43921c;
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements ValueCallback<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.d.C1071a f44024a;

        static {
            Covode.recordClassIndex(26883);
        }

        b(a.d.C1071a aVar) {
            this.f44024a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(String str) {
            Object obj;
            String str2 = str;
            if (str2 != null && !str2.equals("null")) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    a.d.C1071a aVar = this.f44024a;
                    if (aVar != null) {
                        aVar.p = Long.valueOf(jSONObject.optLong("__timestamp"));
                        if (!(aVar.p == null || aVar.o == null)) {
                            Long l2 = aVar.p;
                            if (l2 == null) {
                                l.a();
                            }
                            long longValue = l2.longValue();
                            Long l3 = aVar.o;
                            if (l3 == null) {
                                l.a();
                            }
                            aVar.q = Long.valueOf(longValue - l3.longValue());
                        }
                        if (!(aVar.p == null || aVar.f43995i == null)) {
                            Long l4 = aVar.p;
                            if (l4 == null) {
                                l.a();
                            }
                            long longValue2 = l4.longValue();
                            Long l5 = aVar.f43995i;
                            if (l5 == null) {
                                l.a();
                            }
                            aVar.f43992f = Long.valueOf(longValue2 - l5.longValue());
                        }
                        byte[] bytes = str2.getBytes(d.f158808a);
                        l.a((Object) bytes, "");
                        aVar.f43999m = Integer.valueOf(bytes.length);
                        String type = a.c.H5.getType();
                        l.c(type, "");
                        aVar.f43991e = type;
                        String str3 = com.bytedance.sdk.xbridge.protocol.impl.a.a.f43963c;
                        l.c(str3, "");
                        aVar.f43990d = str3;
                        com.bytedance.sdk.xbridge.protocol.impl.a.a aVar2 = c.f43952c;
                        if (aVar2 != null) {
                            a.d dVar = new a.d(aVar.f43987a, aVar.f43988b, aVar.f43989c, aVar.f43990d, aVar.f43991e, aVar.f43992f, aVar.f43993g, aVar.f43994h, aVar.f43995i, aVar.f43996j, aVar.f43997k, aVar.f43998l, aVar.f43999m, aVar.n, aVar.o, aVar.p, aVar.q);
                            l.c(dVar, "");
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject2.put("code", dVar.f43975b);
                            jSONObject2.put("app_id", dVar.f43976c);
                            jSONObject2.put("url", dVar.f43980g);
                            jSONObject2.put("channel", dVar.f43977d);
                            jSONObject2.put("method", dVar.f43974a);
                            jSONObject2.put("container_type", dVar.f43978e);
                            jSONObject3.put("duration", dVar.f43979f);
                            jSONObject3.put("request_data_length", dVar.f43981h);
                            jSONObject3.put("request_send_timestamp", dVar.f43982i);
                            jSONObject3.put("request_receive_timestamp", dVar.f43983j);
                            jSONObject3.put("request_decode_duration", dVar.f43984k);
                            jSONObject3.put("request_duration", dVar.f43985l);
                            jSONObject3.put("response_data_length", dVar.f43986m);
                            jSONObject3.put("response_send_timestamp", dVar.o);
                            jSONObject3.put("response_receive_timestamp", dVar.p);
                            jSONObject3.put("response_encode_duration", dVar.n);
                            jSONObject3.put("response_duration", dVar.q);
                            aVar2.f43965a.a("bdxbridge_performance", jSONObject2, jSONObject3, (JSONObject) null);
                        }
                    } else {
                        aVar = null;
                    }
                    obj = q.m223constructorimpl(aVar);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                q.m226exceptionOrNullimpl(obj);
            }
        }
    }

    public final void a(String str, ValueCallback<String> valueCallback) {
        l.c(str, "");
        f fVar = this.f44018a;
        if (fVar != null) {
            fVar.a(str, valueCallback);
        }
    }

    public final void a(String str, a.d.C1071a aVar) {
        this.f44019b.post(new a(this, str, aVar));
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.e
    public final void a(String str, Object obj) {
        l.c(str, "");
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        a(str, (JSONObject) obj);
    }

    @Override // com.bytedance.sdk.xbridge.protocol.c.a
    public final void a(com.bytedance.sdk.xbridge.protocol.a.b bVar, com.bytedance.sdk.xbridge.protocol.a.a aVar, a.d.C1071a aVar2) {
        l.c(bVar, "");
        com.bytedance.sdk.xbridge.protocol.d.e.b(this.f44020d, "onBridgeResult,result:" + bVar + ",call:" + aVar);
        if (aVar == null) {
            com.bytedance.sdk.xbridge.protocol.d.e.a(this.f44020d, "onBridgeResult,result:" + bVar + ",call:" + aVar);
            return;
        }
        JSONObject a2 = bVar.a();
        com.bytedance.sdk.xbridge.protocol.impl.a.c cVar = new com.bytedance.sdk.xbridge.protocol.impl.a.c();
        cVar.f44000a = aVar.f43928b;
        cVar.f44003d = aVar.f43929c;
        cVar.f44004e = Long.valueOf(aVar.f43935i);
        Object opt = a2.opt("code");
        Integer num = null;
        if (!(opt instanceof Integer)) {
            opt = null;
        }
        cVar.f44001b = (Integer) opt;
        Object opt2 = a2.opt("msg");
        if (!(opt2 instanceof String)) {
            opt2 = null;
        }
        cVar.f44002c = (String) opt2;
        cVar.f44005f = a2;
        Integer num2 = cVar.f44001b;
        if (num2 != null && num2.intValue() == 1) {
            com.bytedance.sdk.xbridge.protocol.impl.a.b bVar2 = this.f43955c.f43925g;
            if (bVar2 != null) {
                bVar2.b(cVar);
            }
        } else {
            com.bytedance.sdk.xbridge.protocol.impl.a.b bVar3 = this.f43955c.f43925g;
            if (bVar3 != null) {
                bVar3.a(cVar);
            }
        }
        if (bVar.f43940a instanceof JSONObject) {
            Object opt3 = ((JSONObject) bVar.f43940a).opt("code");
            if (opt3 instanceof Integer) {
                num = opt3;
            }
            Integer num3 = num;
            if (num3 != null) {
                int intValue = num3.intValue();
                if (aVar2 != null) {
                    aVar2.f43988b = Integer.valueOf(intValue);
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        String a3 = a(aVar, bVar);
        if (aVar2 != null) {
            aVar2.n = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            aVar2.o = Long.valueOf(System.currentTimeMillis());
        }
        a(a3, (ValueCallback<String>) new b(aVar2));
    }
}
