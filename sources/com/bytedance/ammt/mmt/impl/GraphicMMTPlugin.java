package com.bytedance.ammt.mmt.impl;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ammt.mmt.a.a;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import java.io.File;

public class GraphicMMTPlugin extends a {

    /* renamed from: d  reason: collision with root package name */
    private static GraphicMMTPlugin f6492d;

    /* renamed from: e  reason: collision with root package name */
    private static String f6493e = "gmt";

    /* renamed from: h  reason: collision with root package name */
    private static String f6494h = "_usage";

    /* renamed from: i  reason: collision with root package name */
    private static String f6495i = "_profile";

    /* renamed from: f  reason: collision with root package name */
    private String f6496f;

    /* renamed from: g  reason: collision with root package name */
    private String f6497g;

    private static native void gmt_native_dump(String str, String str2);

    private static native void gmt_native_setConfigParams(int i2);

    private static native void gmt_native_setMemoryThreshold(long j2, long j3);

    private static native void gmt_native_start();

    private static native void gmt_native_stop();

    private GraphicMMTPlugin() {
    }

    static {
        Covode.recordClassIndex(3133);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("mmt", false, (Context) null);
        m.a(uptimeMillis, "mmt");
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a() {
        MethodCollector.i(10101);
        super.a();
        ByteHook.a();
        gmt_native_start();
        this.f6477c = true;
        MethodCollector.o(10101);
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void b() {
        MethodCollector.i(10572);
        super.b();
        gmt_native_dump(this.f6496f, this.f6497g);
        MethodCollector.o(10572);
    }

    public static GraphicMMTPlugin c() {
        MethodCollector.i(9947);
        if (f6492d == null) {
            synchronized (GraphicMMTPlugin.class) {
                try {
                    f6492d = new GraphicMMTPlugin();
                } catch (Throwable th) {
                    MethodCollector.o(9947);
                    throw th;
                }
            }
        }
        GraphicMMTPlugin graphicMMTPlugin = f6492d;
        MethodCollector.o(9947);
        return graphicMMTPlugin;
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(int i2) {
        MethodCollector.i(10265);
        super.a(i2);
        gmt_native_setConfigParams(i2);
        MethodCollector.o(10265);
    }

    public final void a(Context context) {
        String str = this.f6496f + File.separator + this.f6497g + f6494h;
        String str2 = this.f6496f + File.separator + this.f6497g + f6495i;
        File file = new File(str);
        File file2 = new File(str2);
        if (file.exists() && file2.exists()) {
            new Thread(new Runnable(str2, str, context) {
                /* class com.bytedance.ammt.mmt.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ String f6486a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ String f6487b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ Context f6488c;

                static {
                    Covode.recordClassIndex(3130);
                }

                /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3 A[SYNTHETIC, Splitter:B:41:0x00c3] */
                /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
                /* JADX WARNING: Removed duplicated region for block: B:48:0x00f8  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                    // Method dump skipped, instructions count: 283
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ammt.mmt.c.AnonymousClass1.run():void");
                }

                {
                    this.f6486a = r1;
                    this.f6487b = r2;
                    this.f6488c = r3;
                }
            }).start();
        }
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(long j2, long j3) {
        MethodCollector.i(10420);
        super.a(j2, j3);
        gmt_native_setMemoryThreshold(j2, j3);
        MethodCollector.o(10420);
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(String str, String str2) {
        super.a(str, str2);
        this.f6496f = str + File.separator + f6493e;
        this.f6497g = str2;
    }
}
