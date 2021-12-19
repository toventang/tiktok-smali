package com.ss.android.ugc.aweme.favorites.c;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.favorites.ui.y;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90478a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(56793);
    }

    public static i a(Fragment fragment) {
        l.d(fragment, "");
        i childFragmentManager = fragment.getChildFragmentManager();
        l.b(childFragmentManager, "");
        return childFragmentManager;
    }

    public static Fragment a(e eVar) {
        l.d(eVar, "");
        Fragment a2 = eVar.getSupportFragmentManager().a("user_favorites_fragment_tag");
        if (a2 == null) {
            a2 = new y();
        }
        a2.setUserVisibleHint(true);
        return a2;
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
