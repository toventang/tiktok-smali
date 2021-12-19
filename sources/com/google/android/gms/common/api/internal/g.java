package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import com.zhiliaoapp.musically.R;

public final class g {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f50256b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static g f50257c;

    /* renamed from: a  reason: collision with root package name */
    public final String f50258a;

    /* renamed from: d  reason: collision with root package name */
    private final Status f50259d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f50260e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f50261f;

    static {
        Covode.recordClassIndex(31307);
    }

    public static boolean a() {
        return a("isMeasurementExplicitlyDisabled").f50261f;
    }

    public static Status a(Context context) {
        Status status;
        MethodCollector.i(11643);
        r.a(context, "Context must not be null.");
        synchronized (f50256b) {
            try {
                if (f50257c == null) {
                    f50257c = new g(context);
                }
                status = f50257c.f50259d;
            } finally {
                MethodCollector.o(11643);
            }
        }
        return status;
    }

    private g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.ao5));
        boolean z = false;
        boolean z2 = true;
        if (identifier != 0) {
            z = a(resources, identifier) != 0 ? true : z;
            this.f50261f = !z;
            z2 = z;
        } else {
            this.f50261f = false;
        }
        this.f50260e = z2;
        ap.a(context);
        String str = ap.f50350a;
        str = str == null ? new t(context).a("google_app_id") : str;
        if (TextUtils.isEmpty(str)) {
            this.f50259d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f50258a = null;
            return;
        }
        this.f50258a = str;
        this.f50259d = Status.f49960a;
    }

    public static g a(String str) {
        g gVar;
        MethodCollector.i(11799);
        synchronized (f50256b) {
            try {
                gVar = f50257c;
                if (gVar == null) {
                    IllegalStateException illegalStateException = new IllegalStateException(new StringBuilder(String.valueOf(str).length() + 34).append("Initialize must be called before ").append(str).append(".").toString());
                    MethodCollector.o(11799);
                    throw illegalStateException;
                }
            } finally {
                MethodCollector.o(11799);
            }
        }
        return gVar;
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }
}
