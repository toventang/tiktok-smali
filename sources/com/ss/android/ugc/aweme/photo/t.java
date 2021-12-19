package com.ss.android.ugc.aweme.photo;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.av;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cut.k;
import com.ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import h.a.n;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final a f114898a = new a((byte) 0);

    static {
        Covode.recordClassIndex(73903);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73904);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static Intent a(u uVar) {
        String str;
        String str2;
        String str3;
        l.d(uVar, "");
        ShortVideoContext shortVideoContext = uVar.f114906h;
        av.a(uVar.f114905g, shortVideoContext);
        Intent intent = new Intent();
        if (shortVideoContext.A != null) {
            intent.putExtra("extra_share_context", shortVideoContext.A);
        }
        intent.putExtra("av_et_parameter", shortVideoContext.j());
        cr a2 = cr.a();
        l.b(a2, "");
        List list = a2.f125298d;
        if (list == null) {
            list = new ArrayList();
        }
        List<AVChallenge> list2 = uVar.f114899a;
        if (list2 != null && !list2.isEmpty()) {
            list.addAll(uVar.f114899a);
        }
        intent.putExtra("challenge", (Serializable) list);
        if (TextUtils.equals(shortVideoContext.x, "open_platform_share") && shortVideoContext.A != null) {
            intent.putExtra("extra_share_context", shortVideoContext.A);
            ArrayList arrayList = shortVideoContext.A.mHashTags;
            if (arrayList != null && (!arrayList.isEmpty())) {
                Iterator it = shortVideoContext.A.mHashTags.iterator();
                while (it.hasNext()) {
                    AVChallenge aVChallenge = new AVChallenge();
                    aVChallenge.challengeName = (String) it.next();
                    list.add(aVChallenge);
                }
            }
        }
        intent.putExtra("voice_volume", 0.0f);
        intent.putExtra("extract_model", shortVideoContext.f124757b.w);
        intent.putExtra("shoot_way", shortVideoContext.r);
        intent.putExtra("creation_id", shortVideoContext.q);
        intent.putExtra("shoot_mode", shortVideoContext.Z);
        intent.putExtra("draft_id", shortVideoContext.C);
        intent.putExtra("new_draft_id", shortVideoContext.D);
        intent.putExtra("origin", uVar.f114907i ? 1 : 0);
        intent.putExtra("content_type", "slideshow");
        if (uVar.f114907i) {
            str = "shoot";
        } else {
            str = "upload";
        }
        intent.putExtra("content_source", str);
        intent.putExtra("tag_id", shortVideoContext.Y);
        intent.putExtra("shout_out_data", shortVideoContext.ab);
        intent.putExtra("share_id", shortVideoContext.f124763h);
        intent.putExtra("channel", shortVideoContext.B);
        intent.putExtra("comment_video_model", shortVideoContext.f124767l);
        intent.putExtra("question_answer_video_model", shortVideoContext.f124768m);
        intent.putExtra("extra_start_enter_edit_page", uVar.f114910l);
        intent.putExtra("use_music_before_edit", true);
        FaceStickerBean faceStickerBean = uVar.f114909k;
        if (faceStickerBean != null && (!l.a(faceStickerBean, FaceStickerBean.NONE))) {
            intent.putExtra("sticker_id", String.valueOf(faceStickerBean.getStickerId()));
        }
        String str4 = uVar.f114901c;
        MusicModel musicModel = uVar.f114900b;
        if (!(str4 == null || musicModel == null)) {
            intent.putExtra("path", uVar.f114901c);
            intent.putExtra("music_model", uVar.f114900b);
            if (uVar.f114902d) {
                str3 = shortVideoContext.f124765j;
            } else {
                str3 = "slideshow_rec";
            }
            intent.putExtra("music_origin", str3);
            intent.putExtra("first_sticker_music_ids", new f().b(n.a(musicModel.getMusicId())));
            intent.putExtra("id", musicModel.getMusicId());
            if (!uVar.f114907i) {
                intent.putExtra("is_photo_mv_music", shortVideoContext.P);
            }
            intent.putExtra("preset_music_source", !uVar.f114902d ? 1 : 0);
            intent.putExtra("need_clean_music_when_back", !uVar.f114902d);
        }
        intent.putExtra("workspace", shortVideoContext.f124757b.f124713h);
        if (shortVideoContext.ah != null || CommentUtils.isDataValid(shortVideoContext.f124767l)) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList2 = new ArrayList();
            k.a(shortVideoContext.ah, sb, arrayList2);
            intent.putExtra("struct_list", arrayList2);
            shortVideoContext.H = sb.toString();
            intent.putExtra("video_title", shortVideoContext.H);
            intent.putExtra("video_title_chain", shortVideoContext.H);
            intent.putExtra("disable_delete_title_chain", true);
        }
        intent.putExtra("commerce_data_in_tools_line", shortVideoContext.af.f124735c);
        intent.putExtra("extra_request_code", 12346);
        intent.putExtra("enter_from", shortVideoContext.x);
        intent.putExtra("is_rivate", shortVideoContext.L);
        intent.putExtra("micro_app_info", shortVideoContext.ah);
        intent.putExtra("enter_method", shortVideoContext.y);
        String str5 = shortVideoContext.f124759d;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("upload_method", str5);
        boolean z = uVar.f114907i;
        l.d(shortVideoContext, "");
        l.d(intent, "");
        if (z) {
            if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.aq)) {
                intent.putStringArrayListExtra("extra_ar_text", shortVideoContext.aq);
            }
            if (!com.ss.android.ugc.tools.utils.k.a(shortVideoContext.at)) {
                intent.putStringArrayListExtra("extra_sticker_text", shortVideoContext.at);
            }
        }
        String str6 = shortVideoContext.q;
        if (str6 == null || str6.length() == 0) {
            str2 = shortVideoContext.j().getCreationId();
        } else {
            str2 = shortVideoContext.q;
        }
        intent.putExtra("creation_id", str2);
        return intent;
    }
}
