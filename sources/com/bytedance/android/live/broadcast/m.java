package com.bytedance.android.live.broadcast;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.avframework.utils.EarlyAVLog;
import com.ss.avframework.utils.LibraryLoader;
import f.a.t;
import java.util.Arrays;

public class m {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f7882b = {"lens", "ttquic", "avframework", "ies_render", "bytertc"};

    /* renamed from: c  reason: collision with root package name */
    private static m f7883c;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f7884e = {"c++_shared", "yuv", "ttffmpeg", "audioeffect", "effect"};

    /* renamed from: a  reason: collision with root package name */
    public Context f7885a = y.e();

    /* renamed from: d  reason: collision with root package name */
    private boolean f7886d;

    private m() {
    }

    static {
        Covode.recordClassIndex(3908);
    }

    public static m a() {
        MethodCollector.i(7178);
        if (f7883c == null) {
            synchronized (m.class) {
                try {
                    if (f7883c == null) {
                        f7883c = new m();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7178);
                    throw th;
                }
            }
        }
        m mVar = f7883c;
        MethodCollector.o(7178);
        return mVar;
    }

    public final void b() {
        try {
            a.a(6, "LiveBroadcastContext", "LibraryLoader.setupLibraryLoader");
            LibraryLoader.setupLibraryLoader(new LibraryLoader.Loader() {
                /* class com.bytedance.android.live.broadcast.m.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(3909);
                }

                @Override // com.ss.avframework.utils.LibraryLoader.Loader
                public final boolean loadLibraryFromPath(String str) {
                    return true;
                }

                @Override // com.ss.avframework.utils.LibraryLoader.Loader
                public final boolean loadLibrary(String str) {
                    boolean loadLibrary;
                    a.a(6, "LiveBroadcastContext", "start sdk load library name:".concat(String.valueOf(str)));
                    if (Arrays.asList(m.f7882b).contains(str)) {
                        loadLibrary = ((IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class)).loadLibrary(0, m.this.f7885a, com.bytedance.android.livesdk.h.a.LiveResource.getPackageName(), str, null);
                    } else {
                        loadLibrary = ((IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class)).loadLibrary(2, m.this.f7885a, "", str, null);
                    }
                    if (loadLibrary) {
                        return loadLibrary;
                    }
                    try {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        Librarian.b(str, false, null);
                        com.ss.android.ugc.aweme.lancet.m.a(uptimeMillis, str);
                        loadLibrary = true;
                        return true;
                    } catch (NullPointerException | SecurityException | UnsatisfiedLinkError unused) {
                        a.a(6, "LiveBroadcastContext", "Fail to load so although retry: ".concat(String.valueOf(str)));
                        return loadLibrary;
                    }
                }
            });
            a.a(6, "LiveBroadcastContext", "EarlyAVLog.setEarlyLogPrint");
            EarlyAVLog.setEarlyLogPrint(n.f7956a);
        } catch (Throwable th) {
            a.a("LiveBroadcastContext", th);
        }
        if (!this.f7886d) {
            com.bytedance.android.livesdk.h.a.LiveResource.preload();
            c();
            t.b((Object) 1);
            try {
                com.bytedance.android.livesdk.h.a.LiveResource.load(this.f7885a, false);
            } catch (Throwable unused) {
            }
            this.f7886d = true;
        }
    }

    private void c() {
        p.INST.loadResources();
        String[] strArr = {"yuv", "NailSLAM_jni", "ttffmpeg", "c++_shared", "audioeffect", "effect", "avframework", "ies_render"};
        IHostPlugin iHostPlugin = (IHostPlugin) com.bytedance.android.live.t.a.a(IHostPlugin.class);
        int i2 = 0;
        do {
            try {
                a.a(6, "LiveBroadcastContext", "start load library:" + strArr[i2]);
                iHostPlugin.loadLibrary(2, this.f7885a, iHostPlugin.getHostPackageName(), strArr[i2], getClass().getClassLoader());
            } catch (Throwable unused) {
            }
            i2++;
        } while (i2 < 8);
    }
}
