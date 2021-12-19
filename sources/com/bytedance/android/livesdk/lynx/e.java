package com.bytedance.android.livesdk.lynx;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.lynx.b.a;
import com.bytedance.android.livesdk.lynx.ui.c;
import com.bytedance.android.livesdk.lynx.ui.d;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.q;
import h.r;
import java.io.PrintWriter;
import java.io.StringWriter;

public class e implements c {
    static {
        Covode.recordClassIndex(11109);
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public void tryInitEnvIfNeeded() {
        ((IHostAction) a.a(IHostAction.class)).initLynxEnv();
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public com.bytedance.android.livesdk.lynx.ui.a createLynxFragment(Context context, Bundle bundle) {
        l.d(context, "");
        l.d(bundle, "");
        d dVar = new d();
        dVar.setArguments(bundle);
        return dVar;
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public b create(Activity activity, Integer num, String str, d dVar, String str2) {
        Object obj;
        l.d(activity, "");
        try {
            obj = q.m223constructorimpl(new c(activity, null, num, str, null, dVar, false, str2, 82));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Throwable r3 = q.m226exceptionOrNullimpl(obj);
        if (r3 != null) {
            a.EnumC0392a aVar = a.EnumC0392a.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            r3.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            l.b(stringWriter2, "");
            com.bytedance.android.livesdk.lynx.b.a.a(aVar, stringWriter2);
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (b) obj;
    }

    @Override // com.bytedance.android.livesdk.lynx.c
    public b createAndLoad(Activity activity, String str, Integer num, String str2, String str3, d dVar) {
        Object obj;
        l.d(activity, "");
        l.d(str, "");
        try {
            obj = q.m223constructorimpl(new c(activity, str, num, str2, str3, dVar, true, null, 128));
        } catch (Throwable th) {
            obj = q.m223constructorimpl(r.a(th));
        }
        Throwable r3 = q.m226exceptionOrNullimpl(obj);
        if (r3 != null) {
            a.EnumC0392a aVar = a.EnumC0392a.INIT_FAILED;
            StringWriter stringWriter = new StringWriter();
            r3.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            l.b(stringWriter2, "");
            com.bytedance.android.livesdk.lynx.b.a.a(aVar, stringWriter2);
        }
        if (q.m228isFailureimpl(obj)) {
            obj = null;
        }
        return (b) obj;
    }
}
