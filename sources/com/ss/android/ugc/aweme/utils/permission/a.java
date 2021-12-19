package com.ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.content.Context;
import androidx.core.content.b;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.a$a  reason: collision with other inner class name */
    public interface AbstractC3816a {
        static {
            Covode.recordClassIndex(93709);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(93707);
    }

    public static boolean a(int[] iArr) {
        for (int i2 : iArr) {
            if (i2 != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Context context, String[] strArr) {
        List<String> a2 = a(context, strArr);
        if (a2 == null || a2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static List<String> a(Context context, String... strArr) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (b.a(context, str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void a(Activity activity, int i2, int[] iArr) {
        PermissionViewModel.a aVar = ((PermissionViewModel) ae.a((e) activity, (ad.b) null).a(PermissionViewModel.class)).f143166a;
        if (aVar != null && aVar.f143168b != -1 && i2 == aVar.f143168b && aVar.f143167a != null) {
            if (a(iArr)) {
                aVar.f143167a.a();
            } else {
                aVar.f143167a.b();
            }
        }
    }

    public static void a(Activity activity, String[] strArr, AbstractC3816a aVar) {
        if (activity != null) {
            PermissionViewModel.a aVar2 = new PermissionViewModel.a();
            aVar2.f143167a = aVar;
            aVar2.f143168b = 1001;
            ((PermissionViewModel) ae.a((e) activity, (ad.b) null).a(PermissionViewModel.class)).f143166a = aVar2;
            List<String> a2 = a(activity, strArr);
            if (a2 == null || a2.isEmpty()) {
                aVar.a();
            } else {
                androidx.core.app.a.a(activity, (String[]) a2.toArray(new String[a2.size()]), 1001);
            }
        }
    }
}
