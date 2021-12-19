package com.ss.android.ugc.aweme.aabplugin.core.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.m.a.b;
import com.bytedance.tux.dialog.e;
import com.google.android.play.core.e.f;
import com.ss.android.ugc.aweme.aabplugin.core.base.a.c;
import com.ss.android.ugc.aweme.aabplugin.core.base.l;
import com.ss.android.ugc.aweme.aabplugin.core.base.m;
import com.ss.android.ugc.aweme.aabplugin.core.base.n;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

public final class a extends l<d> {
    static {
        Covode.recordClassIndex(38430);
    }

    private static boolean b() {
        try {
            if (d.a().getPackageManager().getPackageInfo("com.android.vending", 0).versionCode < 81510000) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.aabplugin.core.base.l
    public final boolean a() {
        Activity validTopActivity;
        d dVar = (d) this.f62492a;
        com.ss.android.ugc.aweme.aabplugin.core.base.a.d.a(dVar);
        Locale locale = dVar.q;
        if (a(locale)) {
            c.a(dVar, 5);
            dVar.d();
            return true;
        }
        f a2 = e.a(locale.getLanguage());
        if (a2 != null) {
            c.a(dVar, a2.b());
            if (a2.b() == 2 || a2.b() == 4) {
                m<?> b2 = com.ss.android.ugc.aweme.aabplugin.core.base.a.a().b(dVar.f62518l);
                if (b2 != null) {
                    b2.b(dVar);
                }
                return false;
            }
        } else {
            c.a(dVar, 0);
        }
        if (!TextUtils.equals("ceb", locale.getLanguage()) || !b()) {
            com.ss.android.ugc.aweme.aabplugin.core.base.a.a().a(dVar.f62518l, this.f62493b);
            com.ss.android.ugc.aweme.aabplugin.core.base.a.a().a(dVar);
            return false;
        }
        if (!dVar.f62507a && (validTopActivity = ActivityStack.getValidTopActivity()) != null) {
            ((e) new e(validTopActivity).b(R.string.dr3)).a(R.string.asg, (DialogInterface.OnClickListener) null).a().b().show();
        }
        dVar.a((n) 3, (int) dVar.f62507a);
        return false;
    }

    public a(d dVar) {
        super(dVar, new b(dVar.f62518l));
    }

    public static boolean a(Locale locale) {
        String language = locale.getLanguage();
        if (TextUtils.equals("en", language)) {
            return true;
        }
        return b.b().f41313c.a().contains(language);
    }
}
