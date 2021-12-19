package com.ss.android.ugc.aweme.cq.a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.canvas.LynxHelium;
import com.lynx.tasm.f;
import com.lynx.tasm.j;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;

public final class a extends com.bytedance.lynx.hybrid.e.a {
    static {
        Covode.recordClassIndex(48533);
    }

    /* renamed from: com.ss.android.ugc.aweme.cq.a.a$a  reason: collision with other inner class name */
    static final class C1818a implements LynxHelium.ErrorHandler {

        /* renamed from: a  reason: collision with root package name */
        public static final C1818a f78278a = new C1818a();

        static {
            Covode.recordClassIndex(48534);
        }

        C1818a() {
        }

        @Override // com.lynx.tasm.behavior.ui.canvas.LynxHelium.ErrorHandler
        public final void onReceivedError(j jVar) {
            ALog.e("LynxCanvas", jVar.toString());
        }
    }

    @Override // com.bytedance.lynx.hybrid.e.a
    public final void a(Application application, f fVar) {
        l.d(application, "");
        LynxHelium.getInstance().setSmashUrlFallback("https://sf16-muse-va.ibytedtos.com/obj/developer-alisg/misc/", true);
        LynxHelium.getInstance().init(application, fVar, C1818a.f78278a, null);
        LynxEnv b2 = LynxEnv.b();
        l.b(b2, "");
        b2.q = LynxHelium.getInstance();
    }
}
