package com.bytedance.frameworks.baselib.network.http.d.a.b;

import android.net.Uri;
import com.bytedance.covode.number.Covode;

public abstract class f {

    /* renamed from: b  reason: collision with root package name */
    private static final String f29191b = f.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public a f29192a;

    public abstract String a(Uri uri);

    static {
        Covode.recordClassIndex(17064);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.d.a.b.f$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f29193a;

        static {
            Covode.recordClassIndex(17065);
            int[] iArr = new int[a.values().length];
            f29193a = iArr;
            try {
                iArr[a.STATIC_DISPATCH_STRATEGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum a {
        UNKNOWN_DISPATCH_STRATEGY,
        STATIC_DISPATCH_STRATEGY,
        WRR_DISPATCH_STRATEGY,
        CONSERVATIVE_DISPATCH_STRATEGY,
        OPTIMIZED_DISPATCH_STRATEGY,
        ROUTE_SELECTION_DISPATCH_STRATEGY,
        DISPATCH_STRATEGY_SUPPORTED_LAST;

        static {
            Covode.recordClassIndex(17066);
        }
    }

    public f(a aVar) {
        this.f29192a = aVar;
    }
}
