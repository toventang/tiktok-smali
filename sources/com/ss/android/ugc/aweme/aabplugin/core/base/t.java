package com.ss.android.ugc.aweme.aabplugin.core.base;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.aabplugin.core.base.view.c;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.tiktok.security.a.a;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;

final /* synthetic */ class t implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final n f62523a;

    /* renamed from: b  reason: collision with root package name */
    private final int f62524b;

    static {
        Covode.recordClassIndex(38473);
    }

    t(n nVar, int i2) {
        this.f62523a = nVar;
        this.f62524b = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        n nVar = this.f62523a;
        int i2 = this.f62524b;
        boolean z = nVar.f62508b.f35062j;
        c a2 = c.a();
        com.bytedance.ies.ugc.aweme.plugin.c.c cVar = nVar.f62508b.f35063k;
        if (i2 == 0) {
            if (!nVar.f62507a && z) {
                String str2 = nVar.f62518l;
                if (!a2.f62557b) {
                    Activity validTopActivity = ActivityStack.getValidTopActivity();
                    if (validTopActivity != null) {
                        validTopActivity.getLocalClassName();
                        Intent intent = new Intent(validTopActivity, DFInstallBlankActivity.class);
                        intent.putExtra("module_name", str2);
                        intent.putExtra("is_hold_progress_dialog", true);
                        a.a(intent, validTopActivity);
                        validTopActivity.startActivity(intent);
                        validTopActivity.overridePendingTransition(0, 0);
                        a2.f62557b = true;
                    }
                } else if (!(a2.f62556a == null || a2.f62556a.f62550b == null || a2.f62556a.f62550b.isFinishing())) {
                    a2.f62556a.show();
                }
            }
            if (cVar != null) {
                cVar.a(nVar.f62507a);
            }
        } else if (i2 == 1) {
            if (!nVar.f62507a && z) {
                a2.a(nVar.f62513g, nVar.f62512f);
            }
            if (cVar != null) {
                cVar.a(nVar.f62507a, nVar.f62513g, nVar.f62512f);
            }
        } else if (i2 == 2) {
            if (!nVar.f62507a && z) {
                a2.a(nVar.f62513g, nVar.f62512f);
                if (!(a2.f62556a == null || a2.f62556a.f62550b == null)) {
                    Context context = a2.f62556a.getContext();
                    if (nVar.f62509c == null || (str = nVar.f62509c.f35103g) == null) {
                        str = context.getString(R.string.g4k);
                    }
                    a2.f62556a.setMessage(str);
                }
            }
            if (cVar != null) {
                cVar.a(nVar.f62507a, nVar.f62513g, nVar.f62512f);
                cVar.b(nVar.f62507a);
            }
        } else if (i2 == 3) {
            if (z) {
                a2.b();
            }
            if (cVar != null) {
                cVar.c(nVar.f62507a);
            }
        }
        return null;
    }
}
