package com.bytedance.android.live.core.f.b.a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.f.b.c;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

public class d implements c, com.bytedance.android.live.core.f.b.d {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f9053a = Arrays.asList("RLI-AN00");

    @Override // com.bytedance.android.live.core.f.b.d
    public final boolean a() {
        a.a(Build.MODEL);
        return f9053a.contains(Build.MODEL);
    }

    static {
        Covode.recordClassIndex(4623);
    }

    @Override // com.bytedance.android.live.core.f.b.d
    public final int a(Configuration configuration) {
        if (!a()) {
            return -1;
        }
        float f2 = (((float) configuration.screenHeightDp) * 1.0f) / ((float) configuration.screenWidthDp);
        if (f2 < 0.75f || f2 > 1.3333334f) {
            return 1;
        }
        return 0;
    }

    @Override // com.bytedance.android.live.core.f.b.c
    public final boolean a(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException unused) {
            a.a(3, "HW_TAG", "hasNotchInScreen ClassNotFoundException");
            return false;
        } catch (NoSuchMethodException unused2) {
            a.a(3, "HW_TAG", "hasNotchInScreen NoSuchMethodException");
            return false;
        } catch (Exception unused3) {
            a.a(3, "HW_TAG", "hasNotchInScreen Exception");
            return false;
        } catch (Throwable unused4) {
            return false;
        }
    }
}
