package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.bytedance.covode.number.Covode;

public final class ag {

    /* renamed from: ɩ  reason: contains not printable characters */
    private a f170 = new a() {
        /* class com.appsflyer.internal.ag.AnonymousClass2 */

        static {
            Covode.recordClassIndex(2715);
        }

        @Override // com.appsflyer.internal.ag.a
        /* renamed from: ǃ  reason: contains not printable characters */
        public final Class<?> m132(String str) {
            return Class.forName(str);
        }
    };

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(2716);
        }

        /* renamed from: ǃ  reason: contains not printable characters */
        Class<?> m133(String str);
    }

    static {
        Covode.recordClassIndex(2714);
    }

    /* renamed from: ı  reason: contains not printable characters */
    public final String m131() {
        c[] values = c.values();
        for (c cVar : values) {
            if (m130(cVar.f181)) {
                return cVar.f180;
            }
        }
        return c.DEFAULT.f180;
    }

    enum c {
        UNITY("android_unity", "com.unity3d.player.UnityPlayer"),
        REACT_NATIVE("android_reactNative", "com.facebook.react.ReactApplication"),
        CORDOVA("android_cordova", "org.apache.cordova.CordovaActivity"),
        SEGMENT("android_segment", "com.segment.analytics.integrations.Integration"),
        COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
        DEFAULT("android_native", "android_native"),
        ADOBE_EX("android_adobe_ex", "com.appsflyer.adobeextension"),
        FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin");
        

        /* renamed from: І  reason: contains not printable characters */
        private String f180;

        /* renamed from: і  reason: contains not printable characters */
        private String f181;

        static {
            Covode.recordClassIndex(2717);
        }

        private c(String str, String str2) {
            this.f180 = str;
            this.f181 = str2;
        }
    }

    /* renamed from: ı  reason: contains not printable characters */
    private boolean m130(String str) {
        try {
            this.f170.m133(str);
            AFLogger.afRDLog(new StringBuilder("Class: ").append(str).append(" is found.").toString());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return false;
        }
    }
}
