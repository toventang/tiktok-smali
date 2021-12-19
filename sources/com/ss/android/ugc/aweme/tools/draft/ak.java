package com.ss.android.ugc.aweme.tools.draft;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a;
import com.bytedance.tux.dialog.b;
import com.ss.android.ugc.aweme.df.e;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.experiment.ce;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cx;
import com.ss.android.ugc.aweme.shortvideo.cy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d;
import com.ss.android.ugc.aweme.shortvideo.upload.r;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.z;
import java.io.File;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;

public final class ak {

    /* renamed from: a  reason: collision with root package name */
    private static AtomicInteger f139369a = new AtomicInteger(0);

    static {
        Covode.recordClassIndex(91111);
    }

    private static void a(ProgressDialog progressDialog) {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    private static String a(c cVar) {
        if (cVar == null) {
            return "";
        }
        if (cVar.W.aN) {
            return "slideshow";
        }
        if (cVar.k()) {
            return "mv";
        }
        return "video";
    }

    private static void b(c cVar) {
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) new a((byte) 0).a(i.f115645a, IVideoRecordPreferences.class);
        if (!TextUtils.isEmpty(iVideoRecordPreferences.getUploadRecoverPath("")) && iVideoRecordPreferences.getUploadRecoverPath("").equals(cVar.r())) {
            iVideoRecordPreferences.setUploadRecoverPath("");
            l.f115658a.j().a(false);
        }
    }

    public static Intent a(VideoPublishEditModel videoPublishEditModel, int i2, long j2, c cVar) {
        Intent a2 = az.a(videoPublishEditModel, i2);
        a2.putExtra("shoot_way", videoPublishEditModel.mShootWay);
        a2.putExtra("translation_type", 3);
        a2.putExtra("args", (Serializable) videoPublishEditModel);
        e.a("GoPublishActivity from draft");
        a2.putExtra("fromDraft", 1);
        a2.putExtra("draft_to_edit_from", i2);
        a2.putExtra("edit_publish_session_end_together", true);
        a2.putExtra("draft_to_edit_start_time", j2);
        a2.putExtra("draft_modify_time", cVar.I);
        com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
        aVar.a(cVar);
        a2.putExtra("draft_file_size", aVar.a());
        a2.putExtra("auto_selected_anchor", videoPublishEditModel.autoAttachedAnchor);
        a2.putExtra("open_platform_extra", videoPublishEditModel.openPlatformExtra);
        a2.putExtra("open_platform_client_key", videoPublishEditModel.openPlatformClientKey);
        return a2;
    }

    public static void a(androidx.fragment.app.e eVar, c cVar, int i2, long j2, IDraftService.DraftListener draftListener) {
        String str;
        if (cVar != null) {
            if (!g.a().o().c()) {
                cr.a();
                if (!cr.a(eVar)) {
                    return;
                }
            }
            if (cVar.l() || cVar.m()) {
                b bVar = new b(eVar);
                com.bytedance.tux.dialog.b.b bVar2 = new com.bytedance.tux.dialog.b.b(eVar);
                bVar2.a(R.string.g5u, new al(cVar));
                bVar2.b(R.string.g5v, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, z>) null);
                if (cVar.l()) {
                    str = eVar.getString(R.string.g5w);
                } else if (cVar.m()) {
                    str = eVar.getString(R.string.g1e);
                } else {
                    str = "";
                }
                ((b) bVar.a(R.string.g5x)).d(str).a(bVar2).a().b().show();
            } else if (!com.ss.android.ugc.aweme.draft.e.a(cVar, true).isSuc()) {
                new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.co8).a();
            } else {
                if (cVar.n()) {
                    d.b();
                }
                ProgressDialog a2 = com.ss.android.ugc.aweme.tools.draft.e.a.a(eVar, am.f139371a);
                com.ss.android.ugc.aweme.shortvideo.c cVar2 = cVar.f83185f;
                if (cVar2 == null || cVar.W.f83175i == 1) {
                    a(cVar, a2, eVar, i2, j2, true);
                } else {
                    e.a("editDraft() musicModel path = [" + com.ss.android.ugc.aweme.port.in.c.f115623b.b(cVar2) + "]");
                    if (!((cVar.T == null && cVar.g() == null) || cVar.f83187h == null)) {
                        File file = new File(cVar.f83187h);
                        boolean exists = file.exists();
                        e.a("editDraft() duet music path = [" + cVar.f83187h + "], isMusicExist: " + exists);
                        if ((exists && file.length() > 0) || com.ss.android.ugc.aweme.shortvideo.af.b.a(eVar, Uri.parse(cVar.f83187h))) {
                            a(cVar, a2, eVar, i2, j2, true);
                            return;
                        }
                    }
                    ay.a(eVar, cVar, new an(cVar, draftListener, a2, eVar, i2, j2), ao.f139378a).a();
                }
                e.a("editDraft() called with: view = [" + cVar + "]");
            }
        }
    }

    private static void a(c cVar, ProgressDialog progressDialog, androidx.fragment.app.e eVar, int i2, long j2, boolean z) {
        String str;
        cVar.s(new SecureRandom().nextInt(Integer.MAX_VALUE));
        a(progressDialog);
        b(cVar);
        if (TextUtils.isEmpty(cVar.W.f83172f)) {
            cVar.p(com.ss.android.ugc.aweme.tools.draft.e.b.a());
            b.i.b(new ap(cVar), b.i.f4824a);
        }
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", cVar.f()).a("shoot_way", cVar.W.f83170d).a("draft_list_order", cVar.f83191l + 1).a("since_first_save_time", Double.valueOf(aw.a(cVar.J)));
        if (cVar.W.f83171e != 0) {
            a2.a("draft_id", cVar.W.f83171e);
        }
        if (!TextUtils.isEmpty(cVar.W.f83172f)) {
            a2.a("new_draft_id", cVar.W.f83172f);
        }
        r.b(cVar.f());
        com.ss.android.ugc.tools.f.b a3 = a2.a("content_type", a(cVar));
        if (cVar.k() || cVar.W.f83168b == 1 || cVar.W.f83168b == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        a3.a("content_source", str);
        if (cVar.f83185f != null) {
            a2.a("music_id", cVar.f83185f.id);
        }
        com.ss.android.ugc.aweme.common.r.a("edit_draft", a2.a("is_available_sound", z ? 1 : 0).f149193a);
        new bn("AwemeDraftViewHolder");
        VideoPublishEditModel a4 = bn.a(cVar);
        a4.mDraftToEditFrom = i2;
        boolean a5 = g.a().A().a();
        if (ce.a() && !com.ss.android.ugc.gamora.recorder.m.d.a(a4)) {
            a4.isShoutout();
        }
        if (!ce.a() || com.ss.android.ugc.gamora.recorder.m.d.a(a4) || a4.isShoutout() || a5) {
            Intent intent = new Intent();
            intent.putExtra("shoot_way", "edit_draft");
            intent.putExtra("translation_type", 3);
            intent.putExtra("args", (Serializable) a4);
            e.a("GoPublishActivity from draft");
            intent.putExtra("fromDraft", 1);
            intent.putExtra("draft_to_edit_from", i2);
            intent.putExtra("edit_publish_session_end_together", true);
            intent.putExtra("draft_to_edit_start_time", j2);
            intent.putExtra("draft_modify_time", cVar.I);
            com.ss.android.ugc.aweme.cs.d.a.a aVar = new com.ss.android.ugc.aweme.cs.d.a.a();
            aVar.a(cVar);
            intent.putExtra("draft_file_size", aVar.a());
            cy.a(new cx("edit_draft", cVar.f(), "fromDraft"));
            com.ss.android.ugc.aweme.shortvideo.r.a.a().b((Context) eVar, intent);
            q.d("DraftEditHelper after openVideoPublishPage");
        } else {
            Intent a6 = a(a4, i2, j2, cVar);
            cy.a(new cx("edit_draft", cVar.f(), "fromDraft"));
            az.a(a4, eVar, new aq(eVar, a6));
        }
        cr.a().a(cVar.f83185f);
    }

    static final /* synthetic */ z a(c cVar, IDraftService.DraftListener draftListener, ProgressDialog progressDialog, androidx.fragment.app.e eVar, int i2, long j2, Boolean bool) {
        if (!bool.booleanValue()) {
            boolean isPgc = cVar.f83185f.isPgc();
            cVar.f83185f = null;
            cVar.f83187h = null;
            cVar.n = 0;
            cVar.f83190k = 50;
            cVar.q(true);
            cVar.f83183d = 2;
            com.ss.android.ugc.aweme.port.in.c.C.c().a(cVar);
            draftListener.onDraftUpdate(cVar);
            com.ss.android.ugc.aweme.common.r.a("delete_draft_unavailable_sound", new com.ss.android.ugc.tools.f.b().a("enter_from", "enter_personal_homepage").a("creation_id", cVar.f()).a("user_id", com.ss.android.ugc.aweme.port.in.c.u.e().c()).a("delete_cause", isPgc ? 1 : 0).f149193a);
            bz.a(cVar);
        }
        a(cVar, progressDialog, eVar, i2, j2, bool.booleanValue());
        return null;
    }
}
