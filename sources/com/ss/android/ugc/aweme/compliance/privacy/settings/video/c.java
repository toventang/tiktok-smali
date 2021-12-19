package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.comment.b.a;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f77877a;

    static {
        Covode.recordClassIndex(48265);
    }

    c(a aVar) {
        this.f77877a = aVar;
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        a aVar = this.f77877a;
        if (b.U(aVar.f77828c)) {
            aVar.c(R.string.og);
        }
        aVar.getContext();
        if (!a.e()) {
            aVar.c(R.string.de7);
            return;
        }
        String str2 = "";
        if (aVar.f77830e) {
            com.ss.android.ugc.aweme.common.c cVar = aVar.f77829d;
            Object[] objArr = new Object[3];
            objArr[0] = "item_comment";
            objArr[1] = Integer.valueOf(a.f71516d);
            objArr[2] = aVar.f77828c != null ? aVar.f77828c.getAid() : str2;
            cVar.a(objArr);
            aVar.f77830e = false;
            str = "off";
        } else {
            com.ss.android.ugc.aweme.common.c cVar2 = aVar.f77829d;
            Object[] objArr2 = new Object[3];
            objArr2[0] = "item_comment";
            objArr2[1] = Integer.valueOf(a.f71513a);
            objArr2[2] = aVar.f77828c != null ? aVar.f77828c.getAid() : str2;
            cVar2.a(objArr2);
            aVar.f77830e = true;
            str = "on";
        }
        r.a("disable_video_comment", new d().a("enter_from", "privacy_settings").a("group_id", aVar.f77828c != null ? aVar.f77828c.getAid() : str2).a("story_type", (aVar.f77828c == null || aVar.f77828c.getAwemeType() != 40) ? UGCMonitor.TYPE_POST : "story").a("to_status", str).f66730a);
        aVar.f77834i.a(new o(aVar));
        if (aVar.f77828c != null) {
            AwemeService.b().b(aVar.f77828c, aVar.f77830e ? a.f71513a : a.f71516d);
        }
        if (aVar.f77828c != null) {
            str2 = aVar.f77828c.getAid();
        }
        com.ss.android.ugc.aweme.comment.c.c cVar3 = new com.ss.android.ugc.aweme.comment.c.c(8, str2);
        cVar3.f71749d = aVar.f77828c;
        com.ss.android.ugc.d.a.c.a(cVar3);
    }
}
