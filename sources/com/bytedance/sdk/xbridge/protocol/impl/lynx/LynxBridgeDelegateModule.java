package com.bytedance.sdk.xbridge.protocol.impl.lynx;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.protocol.a.a;
import com.bytedance.sdk.xbridge.protocol.impl.a.a;
import com.lynx.jsbridge.LynxContextModule;
import com.lynx.jsbridge.d;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.j;
import h.f.b.l;
import org.json.JSONObject;

public final class LynxBridgeDelegateModule extends LynxContextModule {
    public static final a Companion = new a((byte) 0);
    private final j context;
    private final Handler mHandler;
    private final Object obj;

    static {
        Covode.recordClassIndex(26884);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(26885);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final j getContext() {
        return this.context;
    }

    public final Object getObj() {
        return this.obj;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LynxBridgeDelegateModule f44025a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f44026b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f44027c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callback f44028d;

        static {
            Covode.recordClassIndex(26886);
        }

        b(LynxBridgeDelegateModule lynxBridgeDelegateModule, String str, ReadableMap readableMap, Callback callback) {
            this.f44025a = lynxBridgeDelegateModule;
            this.f44026b = str;
            this.f44027c = readableMap;
            this.f44028d = callback;
        }

        public final void run() {
            com.bytedance.sdk.xbridge.protocol.b.a aVar;
            com.bytedance.sdk.xbridge.protocol.a.a aVar2 = new com.bytedance.sdk.xbridge.protocol.a.a();
            aVar2.a("lynx");
            aVar2.b(this.f44026b);
            aVar2.f43931e = this.f44027c;
            aVar2.a(a.b.Lynx);
            if ((this.f44025a.getObj() instanceof com.bytedance.sdk.xbridge.protocol.a) && (aVar = ((com.bytedance.sdk.xbridge.protocol.a) this.f44025a.getObj()).f43919a) != null) {
                aVar.a(aVar2, new com.bytedance.sdk.xbridge.protocol.c.a(this) {
                    /* class com.bytedance.sdk.xbridge.protocol.impl.lynx.LynxBridgeDelegateModule.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f44029a;

                    static {
                        Covode.recordClassIndex(26887);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f44029a = r1;
                    }

                    @Override // com.bytedance.sdk.xbridge.protocol.c.a
                    public final void a(com.bytedance.sdk.xbridge.protocol.a.b bVar, com.bytedance.sdk.xbridge.protocol.a.a aVar, a.d.C1071a aVar2) {
                        Object javaOnlyMap;
                        l.c(bVar, "");
                        if (bVar.f43940a instanceof JavaOnlyMap) {
                            javaOnlyMap = bVar.f43940a;
                        } else if (bVar.f43940a instanceof JSONObject) {
                            javaOnlyMap = com.bytedance.sdk.xbridge.protocol.d.b.f43958a.a((JSONObject) bVar.f43940a);
                        } else {
                            javaOnlyMap = new JavaOnlyMap();
                        }
                        Callback callback = this.f44029a.f44028d;
                        if (callback != null) {
                            callback.invoke(javaOnlyMap);
                        }
                    }
                }, (com.bytedance.sdk.xbridge.protocol.a) this.f44025a.getObj(), null);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LynxBridgeDelegateModule(j jVar) {
        this(jVar, null);
        l.c(jVar, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeDelegateModule(j jVar, Object obj2) {
        super(jVar, obj2);
        l.c(jVar, "");
        this.context = jVar;
        this.obj = obj2;
        this.mHandler = new Handler(Looper.getMainLooper());
    }

    @d
    public final void call(String str, ReadableMap readableMap, Callback callback) {
        l.c(str, "");
        this.mHandler.post(new b(this, str, readableMap, callback));
    }

    public static /* synthetic */ void call$default(LynxBridgeDelegateModule lynxBridgeDelegateModule, String str, ReadableMap readableMap, Callback callback, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            readableMap = null;
        }
        if ((i2 & 4) != 0) {
            callback = null;
        }
        lynxBridgeDelegateModule.call(str, readableMap, callback);
    }
}
