package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final /* synthetic */ class eo implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131727a;

    static {
        Covode.recordClassIndex(86271);
    }

    eo(cj cjVar) {
        this.f131727a = cjVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        String str2;
        cj cjVar = this.f131727a;
        c a2 = a.b.a(dialogInterface);
        int permission = cjVar.n.f125110b.getPermission();
        String str3 = cjVar.aa;
        l.d(a2, "");
        l.d(str3, "");
        if (a2 instanceof com.ss.android.ugc.aweme.shortvideo.eventtrack.c) {
            str = "click_post";
        } else if (a2 instanceof c.d) {
            str = "click_cross";
        } else {
            str = a2 instanceof c.a ? "made_choice" : "background";
        }
        b a3 = new b().a("enter_from", "video_post_page").a("enter_method", str3).a("exit_method", str);
        if (permission == 0) {
            str2 = "everyone";
        } else {
            str2 = permission == 2 ? "friends" : permission == 1 ? "private" : "empty";
        }
        r.a("audience_select_bottom_sheet_results", a3.a("audience_choice", str2).f149193a);
    }
}
