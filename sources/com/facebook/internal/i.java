package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.facebook.FacebookActivity;
import com.facebook.internal.q;
import com.facebook.internal.y;
import com.facebook.j;
import com.facebook.m;

public final class i {

    public interface a {
        static {
            Covode.recordClassIndex(29319);
        }

        Bundle a();

        Bundle b();
    }

    static {
        Covode.recordClassIndex(29318);
    }

    public static boolean a(h hVar) {
        if (b(hVar).f48707b != -1) {
            return true;
        }
        return false;
    }

    private static y.f b(h hVar) {
        ae.a();
        String str = m.f48915a;
        String action = hVar.getAction();
        return y.a(action, a(str, action, hVar));
    }

    public static void a(a aVar, j jVar) {
        ae.a();
        ae.b(m.f48921g, true);
        Intent intent = new Intent();
        ae.a();
        intent.setClass(m.f48921g, FacebookActivity.class);
        intent.setAction(FacebookActivity.f46518a);
        y.a(intent, aVar.b().toString(), (String) null, y.a(), y.a(jVar));
        aVar.a(intent);
    }

    private static int[] a(String str, String str2, h hVar) {
        q.a a2 = q.a(str, str2, hVar.name());
        if (a2 != null) {
            return a2.f48656d;
        }
        return new int[]{hVar.getMinVersion()};
    }

    public static void a(a aVar, a aVar2, h hVar) {
        Bundle b2;
        ae.a();
        Context context = m.f48921g;
        String action = hVar.getAction();
        y.f b3 = b(hVar);
        int i2 = b3.f48707b;
        if (i2 != -1) {
            if (y.a(i2)) {
                b2 = aVar2.a();
            } else {
                b2 = aVar2.b();
            }
            if (b2 == null) {
                b2 = new Bundle();
            }
            Intent a2 = y.a(context, aVar.b().toString(), action, b3, b2);
            if (a2 != null) {
                aVar.a(a2);
                return;
            }
            throw new j("Unable to create Intent; this likely means theFacebook app is not installed.");
        }
        throw new j("Cannot present this dialog. This likely means that the Facebook app is not installed.");
    }

    public static void a(a aVar, String str, Bundle bundle) {
        ae.a();
        ae.b(m.f48921g, true);
        ae.a();
        ae.a(m.f48921g, true);
        Bundle bundle2 = new Bundle();
        bundle2.putString("action", str);
        bundle2.putBundle("params", bundle);
        Intent intent = new Intent();
        y.a(intent, aVar.b().toString(), str, y.a(), bundle2);
        ae.a();
        intent.setClass(m.f48921g, FacebookActivity.class);
        intent.setAction("FacebookDialogFragment");
        aVar.a(intent);
    }
}
