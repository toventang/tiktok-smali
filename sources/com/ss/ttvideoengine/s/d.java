package com.ss.ttvideoengine.s;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.ttvideoengine.d;
import com.ss.ttvideoengine.j.o;

public final class d {
    static {
        Covode.recordClassIndex(101778);
    }

    public static String a(o oVar) {
        StringBuilder sb = new StringBuilder();
        String b2 = oVar.b(28);
        String str = "";
        if (b2 == null) {
            b2 = str;
        }
        String b3 = oVar.b(29);
        if (b3 != null) {
            str = b3;
        }
        sb.append("fileId=");
        sb.append(b2);
        sb.append("&bitrate=");
        sb.append(oVar.a(3));
        sb.append("&pcrc=");
        sb.append(i.h(str));
        return sb.toString();
    }

    public static String a(o oVar, d.C4065d dVar) {
        StringBuilder sb = new StringBuilder();
        String b2 = oVar.b(28);
        String str = "";
        if (b2 == null) {
            b2 = str;
        }
        String b3 = oVar.b(29);
        if (b3 != null) {
            str = b3;
        }
        int a2 = oVar.a(3);
        sb.append("fileId=");
        sb.append(b2);
        sb.append("&bitrate=");
        sb.append(a2);
        sb.append("&pcrc=");
        sb.append(i.h(str));
        sb.append("&tag=");
        sb.append(i.h(dVar.r));
        if (!TextUtils.isEmpty(dVar.s)) {
            sb.append("&stag=");
            sb.append(i.h(dVar.s));
        }
        return sb.toString();
    }

    public static void a(d.C4065d dVar, d.C4065d.b bVar) {
        if (dVar.r != null) {
            if (bVar.f152428g == null) {
                bVar.f152428g = "tag=" + i.h(dVar.r);
            } else {
                bVar.f152428g += "&tag=" + i.h(dVar.r);
            }
        }
        if (dVar.s == null) {
            return;
        }
        if (bVar.f152428g == null) {
            bVar.f152428g = "stag=" + i.h(dVar.s);
        } else {
            bVar.f152428g += "&stag=" + i.h(dVar.s);
        }
    }
}
