package com.ss.android.vesdk.runtime;

import android.content.Context;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.VideoSdkCore;
import com.ss.android.ttve.monitor.IMonitor;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.g;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public class VERuntime {

    /* renamed from: a  reason: collision with root package name */
    public Context f151396a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f151397b;

    /* renamed from: c  reason: collision with root package name */
    public f f151398c;

    /* renamed from: d  reason: collision with root package name */
    public c f151399d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f151400e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f151401f;

    /* renamed from: g  reason: collision with root package name */
    public VESize f151402g;

    /* renamed from: h  reason: collision with root package name */
    public i f151403h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f151404i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f151405j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f151406k;

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<VEListener.ac> f151407l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<VEListener.d> f151408m;
    public VEListener.u n;
    public IMonitor o;
    public b.a p;
    public g.a q;
    public com.ss.android.vesdk.runtime.a.a r;
    private boolean s;

    static {
        Covode.recordClassIndex(99567);
    }

    public static native void nativeEnableAudioSDKApiV2(boolean z);

    public static native void nativeEnableCrossPlatGLBaseFBO(boolean z);

    private static native void nativeEnableEditorHdr2Sdr(boolean z);

    public static native void nativeEnableImport10BitByteVC1Video(boolean z);

    public static native void nativeEnableRenderLib(boolean z);

    private static native void nativeEnableTitanReleaseGPUResource(boolean z);

    private static native void nativeEnableTransitionKeyFrame(boolean z);

    static native double nativeGetVirtualMemInfo();

    static native boolean nativeIsArm64();

    public static native void nativeSetNativeLibraryDir(String str);

    public native void nativeEnableHDByteVC1HWDecoder(boolean z, int i2);

    public native void nativeEnableHDH264HWDecoder(boolean z, int i2);

    public native void nativeEnableHDMpeg24VP89HWDecoder(boolean z);

    public native void nativeEnableHighFpsByteVC1HWDecoder(boolean z, int i2, int i3);

    public native void nativeEnableHighFpsH264HWDecoder(boolean z, int i2, int i3);

    public native void nativeEnableTTByteVC1Decoder(boolean z);

    public native long nativeGetNativeContext();

    public enum a {
        INSTANCE;
        
        public VERuntime veRuntime = new VERuntime((byte) 0);

        static {
            Covode.recordClassIndex(99572);
        }

        private a(String str) {
        }
    }

    private VERuntime() {
        this.f151402g = new VESize(0, 0);
        this.f151406k = false;
        this.o = new IMonitor() {
            /* class com.ss.android.vesdk.runtime.VERuntime.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99568);
            }

            @Override // com.ss.android.ttve.monitor.IMonitor
            public final void monitorLog(String str, JSONObject jSONObject) {
                if (VERuntime.this.f151407l != null && VERuntime.this.f151407l.get() != null) {
                    VERuntime.this.f151407l.get().a(str, jSONObject);
                }
            }
        };
        this.p = new b.a() {
            /* class com.ss.android.vesdk.runtime.VERuntime.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99569);
            }

            @Override // com.ss.android.ttve.monitor.b.a
            public final void a(String str, JSONObject jSONObject, String str2) {
                if (VERuntime.this.f151408m != null && VERuntime.this.f151408m.get() != null) {
                    VERuntime.this.f151408m.get().a(str, jSONObject, str2);
                }
            }
        };
        this.q = new g.a() {
            /* class com.ss.android.vesdk.runtime.VERuntime.AnonymousClass3 */

            static {
                Covode.recordClassIndex(99570);
            }

            @Override // com.ss.android.ttve.monitor.g.a
            public final void a(Throwable th) {
                if (VERuntime.this.n != null) {
                    VERuntime.this.n.a(th);
                }
            }
        };
    }

    public final int a() {
        MethodCollector.i(1733);
        if (!this.f151406k) {
            an.d("VERuntime", "runtime not init");
            MethodCollector.o(1733);
            return -108;
        }
        nativeEnableTransitionKeyFrame(true);
        this.f151401f = true;
        MethodCollector.o(1733);
        return 0;
    }

    /* synthetic */ VERuntime(byte b2) {
        this();
    }

    public static boolean a(String str) {
        VideoSdkCore.setEffectJsonConfig(str);
        VEEffectConfig.setEffectJsonConfig(str);
        return true;
    }

    public final boolean a(ResourceFinder resourceFinder) {
        VideoSdkCore.setResourceFinder(resourceFinder);
        VEEffectConfig.setResourceFinder(resourceFinder);
        this.f151397b = false;
        this.s = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }
}
