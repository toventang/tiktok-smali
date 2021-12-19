package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.w;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import com.snapchat.kit.sdk.j;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.c.b;
import dagger.a.f;
import java.util.Arrays;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    protected static c f57079a;

    /* renamed from: b  reason: collision with root package name */
    private final SnapKitComponent f57080b;

    static {
        Covode.recordClassIndex(35563);
    }

    public static void b(Context context) {
        a(context, SnapKitInitType.INIT_TYPE_DEFERRED);
    }

    static SnapKitComponent a(Context context) {
        return a(context, SnapKitInitType.INIT_TYPE_FEATURE).f57080b;
    }

    static synchronized c a(Context context, SnapKitInitType snapKitInitType) {
        c cVar;
        synchronized (c.class) {
            MethodCollector.i(6281);
            if (f57079a == null) {
                Context applicationContext = context.getApplicationContext();
                if (a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                }
                f57079a = new c(applicationContext, snapKitInitType);
            }
            cVar = f57079a;
            MethodCollector.o(6281);
        }
        return cVar;
    }

    private c(Context context, SnapKitInitType snapKitInitType) {
        ApplicationInfo applicationInfo;
        String[] stringArray;
        KitPluginType kitPluginType;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, d.a().getPackageName())) {
                if (b.f107191a == null) {
                    b.f107191a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = b.f107191a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                String string = bundle.getString("com.snapchat.kit.sdk.clientId");
                String string2 = bundle.getString("com.snapchat.kit.sdk.redirectUrl", "");
                int i2 = bundle.getInt("com.snapchat.kit.sdk.scopes", 0);
                if (i2 == 0) {
                    stringArray = new String[0];
                } else {
                    stringArray = context.getResources().getStringArray(i2);
                }
                if (!TextUtils.isEmpty(string)) {
                    try {
                        kitPluginType = KitPluginType.valueOf(bundle.getString("com.snapchat.kit.sdk.plugin", ""));
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        kitPluginType = KitPluginType.NO_PLUGIN;
                    }
                    String string3 = bundle.getString("com.snapchat.kit.sdk.firebaseExtCustomTokenUrl", null);
                    boolean z = bundle.getBoolean("com.snapchat.kit.sdk.isFromReactNativePlugin", false);
                    j.a aVar = new j.a((byte) 0);
                    aVar.f57339a = (n) f.a(new n(context, string, string2, Arrays.asList(stringArray), snapKitInitType, kitPluginType, z, string3));
                    if (aVar.f57339a != null) {
                        j jVar = new j(aVar, (byte) 0);
                        this.f57080b = jVar;
                        w.f3548i.getLifecycle().a(jVar.snapKitAppLifecycleObserver());
                        return;
                    }
                    throw new IllegalStateException(n.class.getCanonicalName() + " must be set");
                }
                throw new IllegalStateException("client id must be set!");
            }
            throw new IllegalStateException("No metadata for the current app!");
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new IllegalStateException("Could not get metadata for current package");
        }
    }
}
