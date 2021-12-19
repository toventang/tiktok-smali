package com.ss.android.ugc.aweme.ftc;

import android.content.Intent;
import com.bytedance.als.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.ftc.aa;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.cu;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.b;
import com.ss.android.ugc.aweme.shortvideo.ui.creationflow.c;
import com.ss.android.ugc.aweme.shortvideo.w.a;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.lang.reflect.Type;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;

final /* synthetic */ class v implements m {

    /* renamed from: a  reason: collision with root package name */
    private final FTCVideoRecordNewActivity f98907a;

    static {
        Covode.recordClassIndex(62885);
    }

    v(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
        this.f98907a = fTCVideoRecordNewActivity;
    }

    @Override // androidx.lifecycle.u, com.bytedance.als.m
    public final void onChanged(Object obj) {
        FTCVideoRecordNewActivity fTCVideoRecordNewActivity = this.f98907a;
        a aVar = (a) obj;
        l.d(fTCVideoRecordNewActivity, "");
        l.d(aVar, "");
        ShortVideoContext shortVideoContext = fTCVideoRecordNewActivity.f97381g;
        Object a2 = fTCVideoRecordNewActivity.f97380f.a((Type) c.class, (String) null);
        l.b(a2, "");
        c cVar = (c) a2;
        l.b(shortVideoContext, "");
        if (shortVideoContext.f124757b.f124706a == 1 && shortVideoContext.f124758c == 0 && !shortVideoContext.f124757b.f124714i && !shortVideoContext.q()) {
            cr.a().q = "";
            b a3 = new b().a("enter_from", "video_shoot_page").a("creation_id", shortVideoContext.q);
            if (shortVideoContext.C != 0) {
                a3.a("creation_id", shortVideoContext.q);
            }
            if (shortVideoContext.f124758c == 0) {
                a3.a("draft_way", "general_draft_list");
            }
            d.a("click_draft_edit_cancel", a3.f149193a);
            if (shortVideoContext.f124758c == 0) {
                g.a().r().c().a();
                SmartRouter.buildRoute(fTCVideoRecordNewActivity, "//kids/main").withParam("key_init_page_index", 4).open();
            }
        }
        if (fTCVideoRecordNewActivity.getIntent().getBooleanExtra("navigate_back_to_main", false)) {
            Intent intent = new Intent(fTCVideoRecordNewActivity, com.ss.android.ugc.aweme.port.in.c.f115624c.d());
            try {
                com.ss.android.ugc.tiktok.security.a.a.a(intent, fTCVideoRecordNewActivity);
                fTCVideoRecordNewActivity.startActivity(intent);
            } catch (Exception unused) {
                q.a("returnmain", new ar().a("event", "crash").a());
            }
        }
        if (shortVideoContext.ai) {
            fTCVideoRecordNewActivity.setResult(-1);
        }
        if (shortVideoContext.f124757b.f124714i) {
            cVar.a(new b.C3421b(fTCVideoRecordNewActivity, fTCVideoRecordNewActivity.B.a(), shortVideoContext, fTCVideoRecordNewActivity.A.N()));
        } else if (shortVideoContext.c()) {
            cVar.a(new b.d(fTCVideoRecordNewActivity, aVar.f132671a));
        } else if (shortVideoContext.f124757b.f124706a != 1) {
            com.ss.android.ugc.tools.utils.q.b("current restoreType is " + shortVideoContext.f124757b.f124706a);
            cVar.a(new b.c(fTCVideoRecordNewActivity));
            if (cu.a()) {
                bz unused2 = i.a(bs.f159054a, bf.f159041b, null, new aa.a(shortVideoContext, null), 2);
            }
        } else {
            cVar.a(new b.c(fTCVideoRecordNewActivity));
        }
    }
}
