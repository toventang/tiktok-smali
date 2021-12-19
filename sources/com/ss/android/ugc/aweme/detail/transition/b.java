package com.ss.android.ugc.aweme.detail.transition;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79870a;

    /* renamed from: b  reason: collision with root package name */
    public static final b f79871b = new b();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static boolean f79872a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f79873b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final boolean f79874c = true;

        private a() {
        }

        static {
            Covode.recordClassIndex(49689);
            boolean z = true;
            if (!com.bytedance.ies.abmock.b.a().a(true, "feed_detail_transition_enable", false)) {
                z = false;
            }
            f79872a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.transition.b$b  reason: collision with other inner class name */
    public static final class C1864b {

        /* renamed from: a  reason: collision with root package name */
        public static final boolean f79875a = SettingsManager.a().a("feed_detail_transition_local_enable", true);

        /* renamed from: b  reason: collision with root package name */
        public static final C1864b f79876b = new C1864b();

        private C1864b() {
        }

        static {
            Covode.recordClassIndex(49690);
        }
    }

    private b() {
    }

    static {
        boolean z;
        Covode.recordClassIndex(49688);
        if (Build.VERSION.SDK_INT < 21 || !C1864b.f79875a || !a.f79872a) {
            z = false;
        } else {
            z = true;
        }
        f79870a = z;
    }

    public static final void a(Activity activity) {
        l.d(activity, "");
        if (f79870a) {
            activity.getWindow().requestFeature(12);
        }
    }

    public static final void a(Activity activity, boolean z) {
        l.d(activity, "");
        if (f79870a) {
            Window window = activity.getWindow();
            l.b(window, "");
            window.setSharedElementsUseOverlay(z);
        }
    }

    public static Bundle a(Activity activity, View[] viewArr) {
        l.d(viewArr, "");
        if (!f79870a || activity == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (View view : viewArr) {
            arrayList.add(e.a(view, view != null ? view.getTransitionName() : null));
        }
        int size = arrayList.size();
        e[] eVarArr = new e[size];
        arrayList.toArray(eVarArr);
        androidx.core.app.b a2 = androidx.core.app.b.a(activity, (e[]) Arrays.copyOf(eVarArr, size));
        l.b(a2, "");
        return a2.a();
    }
}
