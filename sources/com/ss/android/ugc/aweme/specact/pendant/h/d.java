package com.ss.android.ugc.aweme.specact.pendant.h;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.main.j;
import com.ss.android.ugc.aweme.main.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f134287a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(87821);
    }

    public static String c() {
        if (a()) {
            return "feed";
        }
        if (b()) {
            return "follow";
        }
        return "others";
    }

    public static boolean a() {
        Fragment curFragment;
        e a2 = e.a();
        if (a2 instanceof j) {
            j jVar = (j) a2;
            if ((jVar.getCurFragment() instanceof l) && (curFragment = jVar.getCurFragment()) != null) {
                return ((l) curFragment).m();
            }
        }
        return false;
    }

    public static boolean b() {
        Fragment curFragment;
        e a2 = e.a();
        if (a2 instanceof j) {
            j jVar = (j) a2;
            if ((jVar.getCurFragment() instanceof l) && (curFragment = jVar.getCurFragment()) != null) {
                return ((l) curFragment).n();
            }
        }
        return false;
    }
}
