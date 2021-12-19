package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import h.f.b.l;
import java.util.List;

public final class a implements c {
    static {
        Covode.recordClassIndex(84696);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        b bVar = new b();
        String str3 = "";
        if (shortVideoContext == null || (str = shortVideoContext.q) == null) {
            str = str3;
        }
        b a2 = bVar.a("creation_id", str);
        if (!(shortVideoContext == null || (str2 = shortVideoContext.r) == null)) {
            str3 = str2;
        }
        r.a("album_scroll", a2.a("shoot_way", str3).a("enter_method", z ? "click" : "slide").f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a() {
        r.a("select_photo_album", new b().a("content_source", "upload").a("content_type", "mv").a("upload_type", "multiple_content").f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void b(ShortVideoContext shortVideoContext, boolean z) {
        String str;
        String str2;
        String str3;
        b bVar = new b();
        String str4 = "";
        if (shortVideoContext == null || (str = shortVideoContext.q) == null) {
            str = str4;
        }
        b a2 = bVar.a("creation_id", str);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.r) == null)) {
            str4 = str3;
        }
        b a3 = a2.a("shoot_way", str4);
        if (z) {
            str2 = "multiple";
        } else {
            str2 = "single";
        }
        r.a("change_upload_mode", a3.a("to_status", str2).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(long j2, long j3) {
        d.a("upload_page_duration", new b().a("first_selection_duration", System.currentTimeMillis() - j2).a("page_stay_duration", System.currentTimeMillis() - j3).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MediaState mediaState) {
        String str;
        String str2;
        int i2;
        String str3;
        String str4 = "";
        l.d(mediaState, str4);
        if (mediaState.getMedia() != null) {
            b bVar = new b();
            if (shortVideoContext == null || (str = shortVideoContext.q) == null) {
                str = str4;
            }
            b a2 = bVar.a("creation_id", str);
            if (!(shortVideoContext == null || (str3 = shortVideoContext.r) == null)) {
                str4 = str3;
            }
            b a3 = a2.a("shoot_way", str4);
            if (mediaState.getMedia().b()) {
                str2 = "video";
            } else {
                str2 = UGCMonitor.TYPE_PHOTO;
            }
            b a4 = a3.a("content_type", str2);
            if (mediaState.getMedia().v >= 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            r.a("slide_content_detail", a4.a("is_select", i2).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.MyMediaModel myMediaModel) {
        String str;
        String str2;
        int i2;
        String str3;
        String str4 = "";
        l.d(myMediaModel, str4);
        b bVar = new b();
        if (shortVideoContext == null || (str = shortVideoContext.q) == null) {
            str = str4;
        }
        b a2 = bVar.a("creation_id", str);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.r) == null)) {
            str4 = str3;
        }
        b a3 = a2.a("shoot_way", str4);
        if (myMediaModel.b()) {
            str2 = "video";
        } else {
            str2 = UGCMonitor.TYPE_PHOTO;
        }
        b a4 = a3.a("content_type", str2);
        if (myMediaModel.v >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        r.a("click_content_detail", a4.a("is_select", i2).f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, String str) {
        l.d(str, "");
        if (shortVideoContext != null) {
            r.a("click_upload_tab", new b().a("creation_id", shortVideoContext.q).a("shoot_way", shortVideoContext.r).a("tab_name", str).f149193a);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, MvImageChooseAdapter.b bVar, String str) {
        String str2;
        String str3;
        b bVar2 = new b();
        bVar2.a("content_source", "upload");
        bVar2.a("content_type", UGCMonitor.TYPE_PHOTO);
        bVar2.a("upload_type", "multiple_content");
        String str4 = "";
        if (shortVideoContext == null || (str2 = shortVideoContext.q) == null) {
            str2 = str4;
        }
        bVar2.a("creation_id", str2);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.f124760e) == null)) {
            str4 = str3;
        }
        bVar2.a("enter_method", str4);
        if (bVar != null) {
            bVar2.a("in_detail", bVar.value);
        }
        if (str != null) {
            bVar2.a("material_ratio", str);
        }
        r.a("choose_upload_content", bVar2.f149193a);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.b.c
    public final void a(ShortVideoContext shortVideoContext, List<? extends MvImageChooseAdapter.MyMediaModel> list, MvImageChooseAdapter.b bVar, String str) {
        String str2;
        String str3;
        long j2 = 0;
        if (list != null && (!list.isEmpty())) {
            for (MediaModel mediaModel : list) {
                j2 += mediaModel.f109396h;
            }
        }
        b bVar2 = new b();
        bVar2.a("content_type", "video");
        bVar2.a("upload_type", "multiple_content");
        String str4 = "";
        if (shortVideoContext == null || (str2 = shortVideoContext.q) == null) {
            str2 = str4;
        }
        bVar2.a("creation_id", str2);
        if (!(shortVideoContext == null || (str3 = shortVideoContext.f124760e) == null)) {
            str4 = str3;
        }
        bVar2.a("enter_method", str4);
        if (bVar != null) {
            bVar2.a("in_detail", bVar.value);
        }
        if (str != null) {
            bVar2.a("material_ratio", str);
        }
        bVar2.a("duration_ms", j2);
        r.a("choose_upload_content", bVar2.f149193a);
    }
}
