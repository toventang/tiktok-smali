package com.ss.android.ugc.aweme.shortvideo.edit.c;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.port.in.g;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126996a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(83327);
    }

    public static void a(j jVar) {
        l.d(jVar, "");
        View b2 = jVar.b(R.id.ara);
        if (b2 == null) {
            l.b();
        }
        b2.setVisibility(8);
    }

    public static String a(Context context, com.ss.android.ugc.aweme.account.model.a aVar) {
        String str;
        l.d(context, "");
        String string = context.getResources().getString(R.string.dnk);
        String str2 = null;
        if (aVar != null) {
            str = aVar.b();
            str2 = aVar.a();
            aVar.h();
        } else {
            str = null;
        }
        String obj = context.getResources().getText(R.string.uh).toString();
        StringBuilder append = new StringBuilder().append(string).append(" - @");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (!TextUtils.isEmpty(str)) {
            obj = str;
        }
        String sb = append.append(obj).toString();
        l.b(sb, "");
        return sb;
    }

    public static String a(com.ss.android.ugc.aweme.account.model.a aVar, Resources resources) {
        String str = "";
        l.d(resources, str);
        String str2 = null;
        if (!g.a().y().b().booleanValue()) {
            if (aVar != null) {
                str2 = aVar.a();
            }
            if (!TextUtils.isEmpty(str2)) {
                if (aVar != null) {
                    str = aVar.a();
                }
                return resources.getText(R.string.uh).toString();
            } else if (!(aVar == null || aVar.b() == null)) {
                str = aVar.b();
            }
        } else {
            if (aVar != null) {
                str = aVar.h();
            }
            return resources.getText(R.string.uh).toString();
        }
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        return resources.getText(R.string.uh).toString();
    }
}
