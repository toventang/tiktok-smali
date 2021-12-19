package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.snapchat.kit.sdk.creative.CreativeComponent;
import com.snapchat.kit.sdk.creative.a;
import com.snapchat.kit.sdk.creative.api.a;
import dagger.a.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static CreativeComponent f57076a;

    static {
        Covode.recordClassIndex(35559);
    }

    public static a a(Context context) {
        return c(context).getApi();
    }

    public static com.snapchat.kit.sdk.creative.c.b b(Context context) {
        return c(context).getMediaFactory();
    }

    private static synchronized CreativeComponent c(Context context) {
        CreativeComponent creativeComponent;
        synchronized (b.class) {
            MethodCollector.i(2125);
            if (f57076a == null) {
                a.C1274a aVar = new a.C1274a((byte) 0);
                aVar.f57279a = (SnapKitComponent) f.a(c.a(context));
                if (aVar.f57279a != null) {
                    f57076a = new com.snapchat.kit.sdk.creative.a(aVar, (byte) 0);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(SnapKitComponent.class.getCanonicalName() + " must be set");
                    MethodCollector.o(2125);
                    throw illegalStateException;
                }
            }
            creativeComponent = f57076a;
            MethodCollector.o(2125);
        }
        return creativeComponent;
    }
}
