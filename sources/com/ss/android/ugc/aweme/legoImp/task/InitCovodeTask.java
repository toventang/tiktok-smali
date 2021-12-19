package com.ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.util.f;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.b;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.f.b.l;
import java.io.File;
import java.util.List;

public final class InitCovodeTask implements w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107788a;

    static {
        Covode.recordClassIndex(68994);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        if (!((Boolean) b.f107385b.getValue()).booleanValue()) {
            return true;
        }
        if (!this.f107788a) {
            b(d.a());
        }
        return this.f107788a;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        b(context);
    }

    public InitCovodeTask(boolean z) {
        this.f107788a = z;
    }

    private final void b(Context context) {
        File a2;
        String path;
        Covode.a a3 = new Covode.a(context).a(f.a(context));
        a3.f27396b = this.f107788a;
        if (!(!this.f107788a || !l.a((Object) d.s, (Object) "local_test") || context == null || (a2 = a(context, "covode")) == null || (path = a2.getPath()) == null)) {
            a3.a(path);
        }
        Covode.startCollecting(a3);
    }

    private static File a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            return context.getExternalFilesDir(str);
        }
        if (com.ss.android.ugc.aweme.lancet.d.f107196d != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107196d;
        }
        File externalFilesDir = context.getExternalFilesDir(str);
        com.ss.android.ugc.aweme.lancet.d.f107196d = externalFilesDir;
        return externalFilesDir;
    }
}
