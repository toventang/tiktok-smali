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

public class NativeMMTPlugin extends a {

    /* renamed from: d  reason: collision with root package name */
    private static volatile NativeMMTPlugin f6498d;

    /* renamed from: e  reason: collision with root package name */
    private static String f6499e = "nmt";

    /* renamed from: f  reason: collision with root package name */
    private String f6500f;

    /* renamed from: g  reason: collision with root package name */
    private String f6501g;

    private static native void native_dump(String str, String str2);

    private static native void native_setConfigParams(int i2);

    private static native void native_setMemoryThreshold(long j2, long j3);

    private static native void native_start();

    private static native void native_stop();

    private NativeMMTPlugin() {
    }

    static {
        Covode.recordClassIndex(3134);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a("mmt", false, (Context) null);
        m.a(uptimeMillis, "mmt");
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a() {
        MethodCollector.i(8116);
        super.a();
        ByteHook.a();
        native_start();
        this.f6477c = true;
        MethodCollector.o(8116);
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void b() {
        MethodCollector.i(8179);
        super.b();
        native_dump(this.f6500f, this.f6501g);
        MethodCollector.o(8179);
    }

    public static NativeMMTPlugin c() {
        MethodCollector.i(8003);
        if (f6498d == null) {
            synchronized (NativeMMTPlugin.class) {
                try {
                    f6498d = new NativeMMTPlugin();
                } catch (Throwable th) {
                    MethodCollector.o(8003);
                    throw th;
                }
            }
        }
        NativeMMTPlugin nativeMMTPlugin = f6498d;
        MethodCollector.o(8003);
        return nativeMMTPlugin;
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(int i2) {
        super.a(i2);
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(long j2, long j3) {
        MethodCollector.i(8118);
        super.a(j2, j3);
        native_setMemoryThreshold(j2, j3);
        MethodCollector.o(8118);
    }

    @Override // com.bytedance.ammt.mmt.a.a
    public final void a(String str, String str2) {
        super.a(str, str2);
        this.f6500f = str + File.separator + f6499e;
        this.f6501g = str2;
    }
}
