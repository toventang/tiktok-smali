package com.bytedance.android.livesdk.drawerfeed;

import android.app.Activity;
import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.android.livesdk.q;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static List<DrawerLayout.c> f17129a;

    static {
        Covode.recordClassIndex(9506);
    }

    public static void a(Activity activity, boolean z) {
        if (activity != null && (activity instanceof q)) {
            q qVar = (q) activity;
            if (qVar.a() != null && !activity.isFinishing()) {
                qVar.a().a(z, true);
            }
        }
    }

    public static void a(Activity activity, Boolean bool) {
        if (activity != null && (activity instanceof q)) {
            q qVar = (q) activity;
            if (qVar.a() != null && !activity.isFinishing()) {
                qVar.a().a(bool.booleanValue());
            }
        }
    }

    public static void a(Activity activity, Boolean bool, Bundle bundle, String str) {
        if (activity instanceof e) {
            i supportFragmentManager = ((e) activity).getSupportFragmentManager();
            if (bool.booleanValue()) {
                if (supportFragmentManager.a("LiveDrawerDialog") instanceof a) {
                    d dVar = (d) supportFragmentManager.a("LiveDrawerDialog");
                    if (!dVar.isAdded()) {
                        dVar.showNow(supportFragmentManager, "LiveDrawerDialog");
                        return;
                    }
                    return;
                }
                a.a(f17129a, bundle, str).showNow(supportFragmentManager, "LiveDrawerDialog");
            } else if (supportFragmentManager.a("LiveDrawerDialog") instanceof a) {
                d dVar2 = (d) supportFragmentManager.a("LiveDrawerDialog");
                if (dVar2.isAdded()) {
                    dVar2.dismiss();
                }
            }
        }
    }
}
