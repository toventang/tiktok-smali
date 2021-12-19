package com.ss.android.ugc.aweme.property;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final h.h f118552a = i.a((h.f.a.a) a.f118553a);

    private static float b() {
        return ((Number) f118552a.getValue()).floatValue();
    }

    static {
        Covode.recordClassIndex(76996);
    }

    static final class a extends m implements h.f.a.a<Float> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f118553a = new a();

        static {
            Covode.recordClassIndex(76997);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Float invoke() {
            float a2 = h.a();
            d.a("tool_performance_brightness", new b().a("max_brightness", Float.valueOf(a2)).f149193a);
            return Float.valueOf(a2);
        }
    }

    public static final float a() {
        if (!f.c() && !l.a()) {
            return 255.0f;
        }
        try {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", "android");
            if (identifier != 0) {
                return (float) a(system, identifier);
            }
            return 255.0f;
        } catch (Exception unused) {
            return -1.0f;
        }
    }

    private static final int a(Context context) {
        ContentResolver contentResolver;
        if (context != null) {
            try {
                contentResolver = context.getContentResolver();
            } catch (Exception unused) {
                return -1;
            }
        } else {
            contentResolver = null;
        }
        return Settings.System.getInt(contentResolver, "screen_brightness");
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

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.fragment.app.e r10, com.ss.android.ugc.aweme.property.m r11) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.property.h.a(androidx.fragment.app.e, com.ss.android.ugc.aweme.property.m):void");
    }
}
