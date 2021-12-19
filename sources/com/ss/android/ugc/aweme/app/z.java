package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.f.i;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.launcher.a;
import com.ss.android.ugc.aweme.main.MainActivity;

final /* synthetic */ class z implements a.AbstractC2756a {

    /* renamed from: a  reason: collision with root package name */
    private final InitAllServiceImpl f66913a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f66914b;

    static {
        Covode.recordClassIndex(41238);
    }

    z(InitAllServiceImpl initAllServiceImpl, Context context) {
        this.f66913a = initAllServiceImpl;
        this.f66914b = context;
    }

    @Override // com.ss.android.ugc.aweme.launcher.a.AbstractC2756a
    public final String a(String str, Intent intent) {
        InitAllServiceImpl initAllServiceImpl = this.f66913a;
        Context context = this.f66914b;
        if (!initAllServiceImpl.f66492a && intent != null && TextUtils.equals(MainActivity.class.getName(), str)) {
            initAllServiceImpl.f66492a = true;
            i.a(intent);
            if (i.f34787c && !i.f34795k) {
                i.f34795k = true;
                g.c().execute(new aa(context));
            }
        }
        return str;
    }
}
