package com.bytedance.ies.xbridge.platform.lynx;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.b;
import com.bytedance.ies.xbridge.f;
import com.bytedance.ies.xbridge.platform.lynx.a.g;
import com.lynx.jsbridge.LynxModule;
import com.lynx.jsbridge.d;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import h.f.b.l;
import java.util.Map;

public final class LynxBridgeModule extends LynxModule {
    public static final a Companion = new a((byte) 0);

    static {
        Covode.recordClassIndex(21808);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(21809);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f36401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableMap f36402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f36403c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f36404d;

        static {
            Covode.recordClassIndex(21810);
        }

        b(String str, ReadableMap readableMap, Callback callback, f fVar) {
            this.f36401a = str;
            this.f36402b = readableMap;
            this.f36403c = callback;
            this.f36404d = fVar;
        }

        public final void run() {
            try {
                a aVar = (a) com.bytedance.ies.xbridge.a.a(a.class);
                if (aVar != null) {
                    String str = this.f36401a;
                    g gVar = new g(this.f36402b);
                    AnonymousClass1 r1 = new b.AbstractC0814b(this) {
                        /* class com.bytedance.ies.xbridge.platform.lynx.LynxBridgeModule.b.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ b f36405a;

                        static {
                            Covode.recordClassIndex(21811);
                        }

                        /* JADX WARN: Incorrect args count in method signature: ()V */
                        {
                            this.f36405a = r1;
                        }

                        @Override // com.bytedance.ies.xbridge.b.AbstractC0814b
                        public final void a(Map<String, Object> map) {
                            l.c(map, "");
                            this.f36405a.f36403c.invoke(com.lynx.jsbridge.a.a(map));
                        }
                    };
                    f fVar = this.f36404d;
                    l.c(str, "");
                    l.c(gVar, "");
                    l.c(r1, "");
                    l.c(fVar, "");
                    aVar.a(str, gVar, r1, fVar);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBridgeModule(Context context) {
        super(context);
        l.c(context, "");
    }

    @d
    public final void call(String str, ReadableMap readableMap, Callback callback, f fVar) {
        l.c(str, "");
        l.c(readableMap, "");
        l.c(callback, "");
        l.c(fVar, "");
        if (!TextUtils.isEmpty(str)) {
            new Handler().post(new b(str, readableMap, callback, fVar));
        }
    }
}
