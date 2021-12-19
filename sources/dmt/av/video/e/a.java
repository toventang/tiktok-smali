package dmt.av.video.e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Objects;

public final class a {
    static {
        Covode.recordClassIndex(104206);
    }

    private static final void a() {
        d.a("tools_performance_permission", new b().a("scene", "permission_request").f149193a);
    }

    public static final String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 463403621) {
            if (hashCode != 1365911975) {
                if (hashCode == 1831139720 && str.equals("android.permission.RECORD_AUDIO")) {
                    return "mic";
                }
                return "";
            } else if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return "storage";
            } else {
                return "";
            }
        } else if (str.equals("android.permission.CAMERA")) {
            return "camera";
        } else {
            return "";
        }
    }

    public static final void a(Context context) {
        boolean z;
        boolean z2;
        l.d(context, "");
        boolean z3 = true;
        if (c.D.c().c(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (c.D.c().b(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c.D.c().a(context) != 0) {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            arrayList.add("android.permission.RECORD_AUDIO");
        }
        if (!z2) {
            arrayList.add("android.permission.CAMERA");
        }
        if (!z3) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        for (String str : (String[]) array) {
            r.a("permission_toast_show", new b().a("permission_type", a(str)).a("enter_from", "video_shoot_page").f149193a);
        }
        a();
    }
}
