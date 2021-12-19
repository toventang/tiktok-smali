package com.ss.android.ugc.aweme.shortvideo.util;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.e;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import h.f.b.l;
import h.m.p;
import java.util.Iterator;
import java.util.Set;

public final class az {

    /* renamed from: a  reason: collision with root package name */
    public static final az f132245a = new az();

    private az() {
    }

    static {
        Covode.recordClassIndex(86606);
    }

    public static final boolean a(e eVar) {
        l.d(eVar, "");
        try {
            Reflect.on(eVar.getSupportFragmentManager()).call("dispatchCreate");
            return true;
        } catch (Exception e2) {
            bj.a("tryRedispatchActivityCreate failed, reason: " + Log.getStackTraceString(e2));
            return false;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static final boolean a(Bundle bundle, Exception exc) {
        String message;
        Class<?> cls;
        Class<?> cls2;
        l.d(exc, "");
        if (!SettingsManager.a().a("studio_fix_publish_page_state_restore_crash", true) || bundle == null || !(exc instanceof RuntimeException) || (message = exc.getMessage()) == null || !p.a((CharSequence) message, (CharSequence) "Unmarshalling unknown type code", false)) {
            return false;
        }
        try {
            Set<String> keySet = bundle.keySet();
            l.b(keySet, "");
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                Object a2 = a(bundle, (String) it.next());
                String str = null;
                if (!l.a((Object) ((a2 == null || (cls2 = a2.getClass()) == null) ? null : cls2.getName()), (Object) "androidx.fragment.app.FragmentManagerState")) {
                    if (!(a2 == null || (cls = a2.getClass()) == null)) {
                        str = cls.getName();
                    }
                    if (!l.a((Object) str, (Object) "android.app.FragmentManagerState")) {
                    }
                }
                Object obj = Reflect.on(a2).field("mActive", new Class[0]).get();
                l.b(obj, "");
                for (Object obj2 : (Object[]) obj) {
                    Bundle bundle2 = (Bundle) Reflect.on(obj2).field("mSavedFragmentState", new Class[0]).get();
                    if (bundle2 != null) {
                        bundle2.remove("android:view_state");
                    }
                }
            }
            return true;
        } catch (Exception e2) {
            bj.a("tryFixViewStateRestoreCrash failed, reason: " + Log.getStackTraceString(e2));
            return false;
        }
    }
}
