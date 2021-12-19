package com.ss.android.ugc.aweme.specact.popup.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.specact.pendant.h.m;
import com.ss.android.ugc.aweme.specact.popup.a.i;
import com.ss.android.ugc.aweme.specact.popup.a.j;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f134504a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(87904);
    }

    private static String a(i iVar) {
        String str = null;
        if (l.a((Object) iVar.f134433c, (Object) "task_progress_list") && (!iVar.f134441k.isEmpty())) {
            for (com.ss.android.ugc.aweme.specact.popup.a.a aVar : iVar.f134441k) {
                for (j jVar : aVar.f134407c) {
                    if (str == null) {
                        str = "";
                    }
                    str = str + jVar.f134446c + ',';
                }
            }
        }
        return str;
    }

    public static void a(i iVar, String str) {
        l.d(iVar, "");
        l.d(str, "");
        r.a("referral_dialog_pop_click", b(iVar, str).f66730a);
    }

    static d b(i iVar, String str) {
        d dVar = new d();
        dVar.a("pop_name", iVar.f134433c);
        dVar.a("position", "feed");
        dVar.a("is_login", m.a() ? 1 : 0);
        dVar.a("region", com.ss.android.ugc.aweme.language.d.a());
        String a2 = a(iVar);
        if (a2 != null) {
            dVar.a("task_ids", a2);
        }
        if (str != null) {
            dVar.a("button_name", str);
        }
        l.b(dVar, "");
        return dVar;
    }
}
