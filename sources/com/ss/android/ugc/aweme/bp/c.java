package com.ss.android.ugc.aweme.bp;

import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;

public final /* synthetic */ class c implements ICrashCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final ICrashCallback f68746a = new c();

    static {
        Covode.recordClassIndex(42332);
    }

    private c() {
    }

    @Override // com.bytedance.crash.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
        GraphicMMTPlugin.c().b();
    }
}
