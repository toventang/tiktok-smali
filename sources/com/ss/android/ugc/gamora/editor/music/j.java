package com.ss.android.ugc.gamora.editor.music;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.a.c;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.tools.f.b;

public final class j implements c {

    /* renamed from: a  reason: collision with root package name */
    public final VideoPublishEditModel f146253a;

    /* renamed from: b  reason: collision with root package name */
    public final e f146254b;

    static {
        Covode.recordClassIndex(96130);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a() {
        bl.a(this.f146253a, c());
    }

    private static int c() {
        Integer b2 = l.f115658a.b().k().a().b();
        if (b2 != null) {
            return b2.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void b() {
        b a2 = new b().a("creation_id", this.f146253a.creationId).a("enter_from", "video_edit_page").a("shoot_way", this.f146253a.mShootWay).a("content_type", es.c(this.f146253a)).a("content_source", es.a(this.f146253a)).a("volume", Float.valueOf(this.f146253a.voiceVolume));
        if (this.f146253a.draftId != 0) {
            a2.a("draft_id", this.f146253a.draftId);
        }
        r.a("edit_volume", a2.f149193a);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void b(boolean z) {
        String str;
        VideoPublishEditModel videoPublishEditModel = this.f146253a;
        if (z) {
            str = "recommend";
        } else {
            str = "favorite";
        }
        bl.f(videoPublishEditModel, str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a(boolean z) {
        String str;
        b a2 = new b().a("enter_from", this.f146253a.enterFrom).a("creation_id", this.f146253a.creationId).a("shoot_way", this.f146253a.mShootWay).a("content_type", es.c(this.f146253a)).a("content_source", es.a(this.f146253a));
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        r.a("click_original_sound", a2.a("status", str).f149193a);
    }

    public j(VideoPublishEditModel videoPublishEditModel, e eVar) {
        h.f.b.l.d(videoPublishEditModel, "");
        h.f.b.l.d(eVar, "");
        this.f146253a = videoPublishEditModel;
        this.f146254b = eVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a(MusicModel musicModel, String str) {
        String str2 = "";
        h.f.b.l.d(musicModel, str2);
        h.f.b.l.d(str, str2);
        VideoPublishEditModel videoPublishEditModel = this.f146253a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        bl.a(videoPublishEditModel, str2, str);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a(boolean z, MusicModel musicModel) {
        h.f.b.l.d(musicModel, "");
        String musicId = musicModel.getMusicId();
        if (musicId == null) {
            musicId = "";
        }
        bl.a(musicId, z, c(), this.f146253a, "");
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a(MusicModel musicModel, boolean z, int i2) {
        String str;
        String str2 = "";
        h.f.b.l.d(musicModel, str2);
        VideoPublishEditModel videoPublishEditModel = this.f146253a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        int c2 = c();
        if (z) {
            str = "recommend";
        } else {
            str = "favorite";
        }
        bl.a(videoPublishEditModel, str2, c2, str, i2);
    }

    @Override // com.ss.android.ugc.aweme.port.in.a.c
    public final void a(MusicModel musicModel, int i2, String str, boolean z) {
        String str2 = "";
        h.f.b.l.d(musicModel, str2);
        h.f.b.l.d(str, str2);
        VideoPublishEditModel videoPublishEditModel = this.f146253a;
        String musicId = musicModel.getMusicId();
        if (musicId != null) {
            str2 = musicId;
        }
        bl.a(videoPublishEditModel, str2, i2 + 1, c(), str, z);
    }
}
