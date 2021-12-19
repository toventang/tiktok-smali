package com.bytedance.ies.bullet.kit.lynx.bridge;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.android.monitor.d.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.g;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.c.a.m;
import com.bytedance.ies.bullet.c.c.a.n;
import com.bytedance.ies.bullet.c.c.a.r;
import com.bytedance.ies.bullet.kit.lynx.i;
import com.bytedance.ies.bullet.service.base.a.j;
import com.bytedance.ies.bullet.service.base.a.p;
import com.bytedance.ies.bullet.service.base.a.q;
import com.bytedance.ies.bullet.service.base.an;
import com.bytedance.ies.bullet.service.base.o;
import com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule;
import com.bytedance.sdk.xbridge.registry.core.f;
import com.bytedance.sdk.xbridge.registry.core_api.a;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableMap;
import com.lynx.tasm.LynxView;
import h.a.ag;
import h.f.b.l;
import h.h;
import h.r;
import h.w;
import h.z;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public final class LynxBridgeModule extends LynxModule implements j {
    public static final a Companion = new a((byte) 0);
    private com.bytedance.sdk.xbridge.registry.core_api.a bdxBridge;
    private LynxBridgeDelegateModule bdxLynxModule;
    private final h loggerWrapper$delegate;
    public final com.bytedance.ies.bullet.c.e.a.b providerFactory;

    static {
        Covode.recordClassIndex(18965);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final q getLoggerWrapper() {
        return (q) this.loggerWrapper$delegate.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18968);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final m getBridgeRegistry() {
        com.bytedance.ies.bullet.c.e.a.b bVar = this.providerFactory;
        if (bVar != null) {
            return (m) bVar.c(m.class);
        }
        return null;
    }

    static final class c extends h.f.b.m implements h.f.a.a<q> {
        final /* synthetic */ LynxBridgeModule this$0;

        static {
            Covode.recordClassIndex(18970);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(LynxBridgeModule lynxBridgeModule) {
            super(0);
            this.this$0 = lynxBridgeModule;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            com.bytedance.ies.bullet.service.base.m mVar;
            com.bytedance.ies.bullet.c.e.a.b bVar = this.this$0.providerFactory;
            if (bVar != null) {
                mVar = (com.bytedance.ies.bullet.service.base.m) bVar.c(com.bytedance.ies.bullet.service.base.m.class);
            } else {
                mVar = null;
            }
            return new q(mVar, "LynxBridgeModule");
        }
    }

    public final i getKitInstanceApi() {
        com.bytedance.ies.bullet.c.c.i iVar;
        com.bytedance.ies.bullet.c.e.a.b bVar = this.providerFactory;
        i iVar2 = null;
        if (bVar != null) {
            iVar = (com.bytedance.ies.bullet.c.c.i) bVar.c(com.bytedance.ies.bullet.c.c.i.class);
        } else {
            iVar = null;
        }
        if (iVar instanceof i) {
            iVar2 = iVar;
        }
        return iVar2;
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBridgeModule f32323a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32324b;

        static {
            Covode.recordClassIndex(18969);
        }

        b(LynxBridgeModule lynxBridgeModule, String str) {
            this.f32323a = lynxBridgeModule;
            this.f32324b = str;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            com.bytedance.ies.bullet.service.base.e.d dVar;
            String str;
            try {
                com.bytedance.ies.bullet.c.e.a.b bVar = this.f32323a.providerFactory;
                String str2 = null;
                if (bVar != null) {
                    dVar = (com.bytedance.ies.bullet.service.base.e.d) bVar.c(com.bytedance.ies.bullet.service.base.e.d.class);
                } else {
                    dVar = null;
                }
                c.a aVar = new c.a("bdx_monitor_bridge_pv");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_name", this.f32324b);
                if (dVar != null) {
                    str2 = dVar.b();
                }
                jSONObject.put("_full_url", str2);
                c.a a2 = aVar.a(jSONObject).a(true);
                if (dVar == null || (str = dVar.a()) == null) {
                    str = "Unknown";
                }
                HybridMonitor.getInstance().customReport(a2.a(str).a(new com.bytedance.android.monitor.webview.h()).a());
                return h.q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                return h.q.m223constructorimpl(r.a(th));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBridgeModule f32325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f32326b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32327c;

        static {
            Covode.recordClassIndex(18971);
        }

        d(LynxBridgeModule lynxBridgeModule, g gVar, String str) {
            this.f32325a = lynxBridgeModule;
            this.f32326b = gVar;
            this.f32327c = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public o call() {
            o oVar;
            i kitInstanceApi = this.f32325a.getKitInstanceApi();
            com.bytedance.ies.bullet.service.base.e.d dVar = null;
            if (kitInstanceApi == null || (oVar = (o) kitInstanceApi.b_(o.class)) == null) {
                return null;
            }
            an anVar = new an("bdx_monitor_bridge_duration", null, null, 254);
            com.bytedance.ies.bullet.c.e.a.b bVar = this.f32325a.providerFactory;
            if (bVar != null) {
                dVar = (com.bytedance.ies.bullet.service.base.e.d) bVar.c(com.bytedance.ies.bullet.service.base.e.d.class);
            }
            anVar.f32550c = dVar;
            anVar.f32555h = this.f32326b.b();
            JSONObject jSONObject = new JSONObject();
            try {
                h.q.m223constructorimpl(jSONObject.put("method_name", this.f32327c));
            } catch (Throwable th) {
                h.q.m223constructorimpl(r.a(th));
            }
            anVar.f32554g = jSONObject;
            anVar.f32553f = "lynx";
            anVar.f32556i = true;
            oVar.a(anVar);
            return oVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBridgeModule f32328a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f32329b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32330c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReadableMap f32331d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Callback f32332e;

        static {
            Covode.recordClassIndex(18972);
        }

        e(LynxBridgeModule lynxBridgeModule, g gVar, String str, ReadableMap readableMap, Callback callback) {
            this.f32328a = lynxBridgeModule;
            this.f32329b = gVar;
            this.f32330c = str;
            this.f32331d = readableMap;
            this.f32332e = callback;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public z call() {
            final LynxView lynxView;
            com.bytedance.ies.bullet.c.c.a.q qVar;
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            com.bytedance.ies.bullet.c.e.a.b bVar = this.f32328a.providerFactory;
            if (bVar != null) {
                lynxView = (LynxView) bVar.c(LynxView.class);
            } else {
                lynxView = null;
            }
            this.f32329b.b(0);
            m bridgeRegistry = this.f32328a.getBridgeRegistry();
            if (bridgeRegistry != null) {
                bridgeRegistry.a(new h.f.a.b<com.bytedance.ies.bullet.c.c.a.q, z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass1 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(18973);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(com.bytedance.ies.bullet.c.c.a.q qVar) {
                        l.c(qVar, "");
                        this.this$0.f32329b.c(0);
                        return z.f158842a;
                    }
                });
            }
            com.bytedance.ies.bullet.c.c.a.a.a("LYNX", new h.f.a.b<Object, JSONObject>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(18974);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.b
                public final /* synthetic */ JSONObject invoke(Object obj) {
                    l.c(obj, "");
                    if (obj instanceof ReadableMap) {
                        return com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a((ReadableMap) obj);
                    }
                    return null;
                }
            });
            m bridgeRegistry2 = this.f32328a.getBridgeRegistry();
            if (bridgeRegistry2 != null) {
                qVar = bridgeRegistry2.a(this.f32330c);
            } else {
                qVar = null;
            }
            if (qVar == null || (qVar instanceof k)) {
                m bridgeRegistry3 = this.f32328a.getBridgeRegistry();
                if (bridgeRegistry3 == null) {
                    return null;
                }
                String str = this.f32330c;
                JSONObject a2 = com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a(this.f32331d);
                JSONObject optJSONObject = a2.optJSONObject("data");
                if (optJSONObject != null) {
                    a2 = optJSONObject;
                }
                bridgeRegistry3.a(str, a2, new k.b(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f32333a;

                    static {
                        Covode.recordClassIndex(18975);
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                    public final void a(JSONObject jSONObject) {
                        l.c(jSONObject, "");
                        this.f32333a.f32329b.f32013e = System.currentTimeMillis();
                        try {
                            this.f32333a.f32332e.invoke(com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a(jSONObject));
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        g gVar = this.f32333a.f32329b;
                        gVar.f32014f = System.currentTimeMillis();
                        gVar.f32015g = System.currentTimeMillis();
                        this.f32333a.f32328a.onReady(gVar, this.f32333a.f32330c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                            com.bytedance.android.monitor.d.h hVar = new com.bytedance.android.monitor.d.h();
                            hVar.f23482b = this.f32333a.f32330c;
                            hVar.f23483c = 0;
                            hVar.f23486f = SystemClock.elapsedRealtime() - elapsedRealtime;
                            bVar.a(lynxView, hVar);
                        }
                    }

                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                    public final void a(int i2, String str) {
                        l.c(str, "");
                        this.f32333a.f32329b.f32013e = System.currentTimeMillis();
                        WritableMap b2 = com.lynx.jsbridge.a.b();
                        b2.putInt("code", i2);
                        b2.putString("message", str);
                        this.f32333a.f32332e.invoke(b2);
                        g gVar = this.f32333a.f32329b;
                        gVar.f32014f = System.currentTimeMillis();
                        gVar.f32015g = System.currentTimeMillis();
                        this.f32333a.f32328a.onReady(gVar, this.f32333a.f32330c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                            com.bytedance.android.monitor.d.g gVar2 = new com.bytedance.android.monitor.d.g();
                            gVar2.f23479e = this.f32333a.f32330c;
                            gVar2.f23477c = 4;
                            gVar2.f23478d = this.f32333a.f32328a.composeErrorMessage(str, i2);
                            bVar.a(lynxView, gVar2);
                        }
                    }

                    {
                        this.f32333a = r1;
                    }

                    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: java.lang.Object */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.bytedance.ies.bullet.c.c.a.k.b
                    public final void a(int i2, String str, JSONObject jSONObject) {
                        String str2;
                        String str3;
                        l.c(str, "");
                        l.c(jSONObject, "");
                        this.f32333a.f32329b.f32013e = System.currentTimeMillis();
                        WritableMap b2 = com.lynx.jsbridge.a.b();
                        b2.putInt("code", i2);
                        b2.putString("msg", str);
                        b2.putString("message", str);
                        try {
                            b2.putMap("data", com.bytedance.ies.bullet.kit.lynx.d.a.f32339a.a(jSONObject));
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        this.f32333a.f32332e.invoke(b2);
                        g gVar = this.f32333a.f32329b;
                        gVar.f32014f = System.currentTimeMillis();
                        gVar.f32015g = System.currentTimeMillis();
                        this.f32333a.f32328a.onReady(gVar, this.f32333a.f32330c);
                        LynxView lynxView = lynxView;
                        if (lynxView != null) {
                            try {
                                if (str.length() <= 0 || str == null || (str + " with [" + jSONObject + ']') == null) {
                                    str3 = jSONObject.toString();
                                    l.a((Object) str3, "");
                                }
                                str2 = h.q.m223constructorimpl(str3);
                            } catch (Throwable th) {
                                str2 = h.q.m223constructorimpl(r.a(th));
                            }
                            if (!h.q.m228isFailureimpl(str2)) {
                                str = str2;
                            }
                            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                            com.bytedance.android.monitor.d.g gVar2 = new com.bytedance.android.monitor.d.g();
                            gVar2.f23479e = this.f32333a.f32330c;
                            gVar2.f23477c = 4;
                            gVar2.f23478d = this.f32333a.f32328a.composeErrorMessage(str, i2);
                            bVar.a(lynxView, gVar2);
                        }
                    }
                }, new h.f.a.b<Throwable, z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass4 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(18976);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Throwable th) {
                        l.c(th, "");
                        j.b.a(this.this$0.f32328a, this.this$0.f32330c + " rejected, reason: " + th, null, null, 6);
                        if (th instanceof n.a) {
                            WritableMap b2 = com.lynx.jsbridge.a.b();
                            b2.putInt("code", 4);
                            b2.putString("message", "bridge method not found");
                            this.this$0.f32332e.invoke(b2);
                            LynxView lynxView = lynxView;
                            if (lynxView != null) {
                                com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                                com.bytedance.android.monitor.d.g gVar = new com.bytedance.android.monitor.d.g();
                                gVar.f23479e = this.this$0.f32330c;
                                gVar.f23477c = 4;
                                gVar.f23478d = "bridge method not found";
                                bVar.a(lynxView, gVar);
                            }
                        }
                        return z.f158842a;
                    }
                });
                return z.f158842a;
            }
            final com.bytedance.ies.bullet.c.c.a.r rVar = (com.bytedance.ies.bullet.c.c.a.r) qVar;
            final h.f.a.m<Object, Class<?>, Object> a3 = com.bytedance.ies.bullet.c.c.a.a.a(ReadableMap.class, Map.class);
            final h.f.a.m<Object, Class<?>, Object> a4 = com.bytedance.ies.bullet.c.c.a.a.a(Map.class, ReadableMap.class);
            new h.f.a.b<Object, Object>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(18977);
                }

                @Override // h.f.a.b
                public final Object invoke(Object obj) {
                    l.c(obj, "");
                    h.f.a.m mVar = a3;
                    if (mVar != null) {
                        Class<?> e2 = rVar.e();
                        if (e2 == null) {
                            e2 = Object.class;
                        }
                        Object invoke = mVar.invoke(obj, e2);
                        if (invoke != null) {
                            return invoke;
                        }
                    }
                    return ag.a();
                }
            };
            new h.f.a.b<Object, Object>() {
                /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(18978);
                }

                @Override // h.f.a.b
                public final Object invoke(Object obj) {
                    l.c(obj, "");
                    h.f.a.m mVar = a4;
                    if (mVar != null) {
                        Class<?> e2 = rVar.e();
                        if (e2 == null) {
                            e2 = Object.class;
                        }
                        Object invoke = mVar.invoke(obj, e2);
                        if (invoke != null) {
                            return invoke;
                        }
                    }
                    WritableMap b2 = com.lynx.jsbridge.a.b();
                    l.a((Object) b2, "");
                    return b2;
                }
            };
            try {
                m bridgeRegistry4 = this.f32328a.getBridgeRegistry();
                if (bridgeRegistry4 == null) {
                    return null;
                }
                bridgeRegistry4.a(this.f32330c, this.f32331d, new r.a<ReadableMap>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass7 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ e f32336a;

                    static {
                        Covode.recordClassIndex(18979);
                    }

                    {
                        this.f32336a = r1;
                    }
                }, new h.f.a.b<Throwable, z>(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.e.AnonymousClass8 */
                    final /* synthetic */ e this$0;

                    static {
                        Covode.recordClassIndex(18980);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ z invoke(Throwable th) {
                        LynxView lynxView;
                        l.c(th, "");
                        j.b.a(this.this$0.f32328a, this.this$0.f32330c + " rejected, reason: " + th, null, null, 6);
                        if ((th instanceof n.a) && (lynxView = lynxView) != null) {
                            com.bytedance.android.monitor.lynx.b bVar = com.bytedance.android.monitor.lynx.b.f23580f;
                            com.bytedance.android.monitor.d.g gVar = new com.bytedance.android.monitor.d.g();
                            gVar.f23479e = this.this$0.f32330c;
                            gVar.f23477c = 4;
                            gVar.f23478d = "bridge method not found";
                            bVar.a(lynxView, gVar);
                        }
                        return z.f158842a;
                    }
                });
                return z.f158842a;
            } catch (Throwable th) {
                this.f32329b.f32013e = System.currentTimeMillis();
                WritableMap b2 = com.lynx.jsbridge.a.b();
                b2.putInt("code", 0);
                b2.putString("message", th.toString());
                this.f32332e.invoke(b2);
                g gVar = this.f32329b;
                gVar.f32014f = System.currentTimeMillis();
                gVar.f32015g = System.currentTimeMillis();
                this.f32328a.onReady(gVar, this.f32330c);
                if (lynxView == null) {
                    return null;
                }
                com.bytedance.android.monitor.lynx.b bVar2 = com.bytedance.android.monitor.lynx.b.f23580f;
                com.bytedance.android.monitor.d.g gVar2 = new com.bytedance.android.monitor.d.g();
                gVar2.f23479e = this.f32330c;
                gVar2.f23477c = 4;
                LynxBridgeModule lynxBridgeModule = this.f32328a;
                String th2 = th.toString();
                if (th2 == null) {
                    th2 = "";
                }
                gVar2.f23478d = lynxBridgeModule.composeErrorMessage(th2, 0);
                bVar2.a(lynxView, gVar2);
                return z.f158842a;
            }
        }
    }

    private final void doMonitorLog(String str, String str2) {
        b.i.a((Callable) new b(this, str));
    }

    public final void onReady(g gVar, String str) {
        b.i.a((Callable) new d(this, gVar, str));
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printReject(Throwable th, String str) {
        l.c(th, "");
        l.c(str, "");
        j.b.a(this, th, str);
    }

    public final String composeErrorMessage(String str, int i2) {
        l.c(str, "");
        try {
            String jSONObject = new JSONObject().putOpt("message", str).putOpt("code", Integer.valueOf(i2)).toString();
            l.a((Object) jSONObject, "");
            return jSONObject;
        } catch (Throwable th) {
            h.q.m223constructorimpl(h.r.a(th));
            return str;
        }
    }

    public final ReadableMap optMap(ReadableMap readableMap, String str) {
        l.c(readableMap, "");
        l.c(str, "");
        try {
            if (!readableMap.hasKey(str)) {
                return new JavaOnlyMap();
            }
            ReadableMap map = readableMap.getMap(str);
            l.a((Object) map, "");
            return map;
        } catch (Exception unused) {
            return new JavaOnlyMap();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context, Object obj) {
        super(context, obj);
        LynxView lynxView;
        com.lynx.tasm.behavior.j lynxContext;
        String str;
        com.bytedance.ies.bullet.c.c.z zVar;
        l.c(context, "");
        l.c(obj, "");
        com.bytedance.sdk.xbridge.protocol.a aVar = null;
        com.bytedance.ies.bullet.c.e.a.b bVar = (com.bytedance.ies.bullet.c.e.a.b) (!(obj instanceof com.bytedance.ies.bullet.c.e.a.b) ? null : obj);
        this.providerFactory = bVar;
        this.loggerWrapper$delegate = h.i.a((h.f.a.a) new c(this));
        a.b.c();
        if (a.b.b() && bVar != null && (lynxView = (LynxView) bVar.c(LynxView.class)) != null && (lynxContext = lynxView.getLynxContext()) != null) {
            com.bytedance.sdk.xbridge.registry.core_api.a aVar2 = new com.bytedance.sdk.xbridge.registry.core_api.a();
            this.bdxBridge = aVar2;
            i kitInstanceApi = getKitInstanceApi();
            if (kitInstanceApi == null || (zVar = kitInstanceApi.f32056h) == null) {
                str = null;
            } else {
                str = zVar.f32074a;
            }
            com.bytedance.sdk.xbridge.registry.core_api.a.a(aVar2, lynxView, str);
            com.bytedance.sdk.xbridge.registry.core_api.a aVar3 = this.bdxBridge;
            this.bdxLynxModule = new LynxBridgeDelegateModule(lynxContext, aVar3 != null ? aVar3.a() : aVar);
            com.bytedance.sdk.xbridge.registry.core_api.a aVar4 = this.bdxBridge;
            if (aVar4 != null) {
                aVar4.a("bullet", new com.bytedance.sdk.xbridge.registry.core_api.a.c(this) {
                    /* class com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ LynxBridgeModule f32321a;

                    static {
                        Covode.recordClassIndex(18966);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f32321a = r1;
                    }

                    /* renamed from: com.bytedance.ies.bullet.kit.lynx.bridge.LynxBridgeModule$1$a */
                    static final class a implements Callback {

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ com.bytedance.sdk.xbridge.registry.core_api.a.b f32322a;

                        static {
                            Covode.recordClassIndex(18967);
                        }

                        a(com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
                            this.f32322a = bVar;
                        }

                        @Override // com.lynx.react.bridge.Callback
                        public final void invoke(Object[] objArr) {
                            try {
                                l.a((Object) objArr, "");
                                Object c2 = h.a.i.c(objArr);
                                com.bytedance.sdk.xbridge.registry.core_api.a.b bVar = this.f32322a;
                                l.a(c2, "");
                                bVar.a(c2);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                    }

                    @Override // com.bytedance.sdk.xbridge.registry.core_api.a.c
                    public final void a(Object obj, String str, String str2, String str3, com.bytedance.sdk.xbridge.registry.core_api.a.b bVar) {
                        l.c(str, "");
                        l.c(str2, "");
                        l.c(str3, "");
                        l.c(bVar, "");
                        LynxBridgeModule lynxBridgeModule = this.f32321a;
                        if (obj != null) {
                            lynxBridgeModule.originCall(str, (ReadableMap) obj, new a(bVar));
                            return;
                        }
                        throw new w("null cannot be cast to non-null type");
                    }
                });
            }
            f.a(lynxView, new com.bytedance.sdk.xbridge.registry.core.a());
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.j
    public final void printLog(String str, p pVar, String str2) {
        l.c(str, "");
        l.c(pVar, "");
        l.c(str2, "");
        j.b.a(this, str, pVar, str2);
    }

    public final boolean optBoolean(ReadableMap readableMap, String str, boolean z) {
        l.c(readableMap, "");
        l.c(str, "");
        try {
            if (readableMap.hasKey(str)) {
                return readableMap.getBoolean(str);
            }
            return z;
        } catch (Exception unused) {
            return z;
        }
    }

    @com.lynx.jsbridge.d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        LynxBridgeDelegateModule lynxBridgeDelegateModule;
        l.c(str, "");
        l.c(readableMap, "");
        l.c(callback, "");
        a.b.c();
        if (!a.b.b() || this.bdxBridge == null || (lynxBridgeDelegateModule = this.bdxLynxModule) == null) {
            originCall(str, readableMap, callback);
        } else {
            lynxBridgeDelegateModule.call(str, readableMap, callback);
        }
    }

    public final void originCall(String str, ReadableMap readableMap, Callback callback) {
        ReadableMap readableMap2;
        Executor executor;
        l.c(str, "");
        l.c(readableMap, "");
        l.c(callback, "");
        if (!TextUtils.isEmpty(str)) {
            if (getBridgeRegistry() == null) {
                j.b.a(this, "Bridge Registry is Empty", null, null, 6);
                return;
            }
            m bridgeRegistry = getBridgeRegistry();
            if (bridgeRegistry == null) {
                l.a();
            }
            if (bridgeRegistry.d()) {
                j.b.a(this, "Bridge Registry has released", null, null, 6);
                return;
            }
            g gVar = new g();
            gVar.a(0);
            if (readableMap.hasKey("data")) {
                readableMap2 = optMap(readableMap, "data");
            } else {
                readableMap2 = readableMap;
            }
            boolean optBoolean = optBoolean(readableMap2, "useUIThread", true);
            j.b.a(this, "call lynx jsb func: " + str + " on useUIThread=" + optBoolean, null, null, 6);
            e eVar = new e(this, gVar, str, readableMap, callback);
            if (optBoolean) {
                executor = b.i.f4826c;
            } else {
                executor = b.i.f4824a;
            }
            b.i.a(eVar, executor);
            doMonitorLog(str, "unknown");
        }
    }

    static /* synthetic */ void doMonitorLog$default(LynxBridgeModule lynxBridgeModule, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        lynxBridgeModule.doMonitorLog(str, str2);
    }
}
