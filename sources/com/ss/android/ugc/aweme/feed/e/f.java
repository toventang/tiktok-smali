package com.ss.android.ugc.aweme.feed.e;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics;
import com.ss.android.ugc.aweme.feed.adapter.ah;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.background.c;
import com.ss.android.ugc.aweme.feed.helper.o;
import com.ss.android.ugc.aweme.feed.helper.t;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.feed.q.al;
import com.ss.android.ugc.aweme.feed.x.g;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.ar;
import com.ss.android.ugc.aweme.metrics.h;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.player.a.e;
import com.ss.android.ugc.aweme.shortvideo.j.j;
import com.ss.android.ugc.aweme.story.b.i;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.video.util.d;
import com.ss.android.ugc.playerkit.model.l;
import com.ss.android.ugc.playerkit.model.n;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends o {
    static {
        Covode.recordClassIndex(58934);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean g() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean k() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean l() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean m() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean o() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean p() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean n() {
        return a(true);
    }

    public static boolean q() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final void a(Aweme aweme) {
        super.a(aweme);
        a(aweme, M(), true);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final boolean a(boolean z) {
        boolean z2;
        if (!z || !t()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f92898c.getUserVisibleHint() || c.a()) && ((this.f92923a || c.a()) && z2 && !AVExternalServiceImpl.a().publishService().needRestore())) {
            return true;
        }
        return false;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(b bVar, h hVar) {
        if (bVar.extra != null) {
            HashMap<String, String> hashMap = bVar.extra;
            if (hashMap.containsKey("token_type")) {
                hVar.a("token_type", hashMap.get("token_type"));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final void a(l lVar, aj ajVar) {
        Video video;
        Audio audio;
        long j2;
        super.a(lVar, ajVar);
        if (h()) {
            if (a(ajVar, lVar.f148746a)) {
                ah p = ajVar.p();
                if (a(p)) {
                    p.onPlayFailed(lVar);
                } else if (g.e(ajVar)) {
                    com.ss.android.ugc.aweme.commercialize.g.h().a(ajVar.b(), lVar);
                    if (!com.ss.android.ugc.aweme.commercialize.e.a.b.aw(ajVar.b()) || r().a() == null) {
                        video = ajVar.b().getVideo();
                        audio = ajVar.b().getAudio();
                    } else {
                        video = r().a();
                        audio = null;
                    }
                    if (lVar.f148748c && video.getVideoModelStr() != null) {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(ajVar.b())) {
                            video.setRationAndSourceId(r().b());
                        } else {
                            video.setRationAndSourceId(c(ajVar));
                        }
                        a(c(ajVar), false);
                        M().a(p.x());
                        M().a(video, audio, d.a(ajVar.b()), true, 0, true, false, b(video, ajVar.X()));
                        b(lVar, ajVar);
                        return;
                    } else if (lVar.f148747b) {
                        if (com.ss.android.ugc.aweme.commercialize.e.a.b.aw(ajVar.b())) {
                            video.setRationAndSourceId(r().b());
                        } else {
                            video.setRationAndSourceId(c(ajVar));
                        }
                        a(video, false);
                        a(c(ajVar), false);
                        M().a(p.x());
                        if (!(ajVar.b() == null || ajVar.b().getVideo() == null)) {
                            ajVar.b().getVideo().setBitRate(null);
                            VideoUrlModel playAddrH264 = ajVar.b().getVideo().getPlayAddrH264();
                            if (playAddrH264 != null) {
                                playAddrH264.setBitRate(null);
                            }
                            M().a(playAddrH264, video.isNeedSetCookie(), b(ajVar.b().getVideo(), ajVar.X()));
                        }
                        b(lVar, ajVar);
                        return;
                    } else {
                        new a(c()).a(com.ss.android.ugc.aweme.base.utils.h.b(R.string.dqz)).a();
                        p.onPlayFailed(lVar);
                        al s = s();
                        if (s != null) {
                            s.at();
                        }
                        b(lVar, ajVar);
                        if (video != null && video.getPlayAddr() != null) {
                            if (this.u != 0) {
                                j2 = SystemClock.elapsedRealtime() - this.u;
                                this.u = 0;
                            } else {
                                j2 = 0;
                            }
                            new e.a().a(String.valueOf(j2)).a(e()).a(video).a(ajVar).a(0).b(v()).a(c.a()).f114995a.a();
                            com.ss.android.b.a.a.a.a(new g(this, lVar, video, ajVar));
                            if (s != null) {
                                s.b(0);
                            }
                            this.u = 0;
                        } else {
                            return;
                        }
                    }
                }
            }
            a(new j(1));
        }
    }

    public f(String str, int i2, al alVar) {
        super(str, i2, alVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final void a(String str, al alVar, Aweme aweme) {
        boolean z;
        String str2;
        boolean z2;
        String str3;
        String str4;
        boolean z3;
        super.a(str, alVar, aweme);
        if (alVar != null) {
            try {
                alVar.az();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return;
            }
        }
        JSONObject u = u();
        if (alVar != null) {
            u.put("enter_from", alVar.a_(false));
            u.put("content_source", alVar.aj());
            if (!TextUtils.isEmpty(alVar.ak())) {
                u.put("enter_method", alVar.ak());
            }
        }
        u.put("has_tts", com.ss.android.ugc.aweme.feed.x.ah.i(aweme));
        u.put("has_cla", com.ss.android.ugc.aweme.feed.x.ah.h(aweme));
        String str5 = "0";
        if (!com.ss.android.ugc.aweme.feed.experiment.c.d()) {
            d();
            r.a("video_play", "finish", str, str5, u);
        }
        if (aweme == null || aweme.getBottomBarModel() == null) {
            z = false;
        } else {
            z = true;
        }
        if (!this.r) {
            if (aweme == null || aweme.getMusic() == null) {
                str2 = "";
            } else {
                str2 = String.valueOf(aweme.getMusic().getId());
            }
            if (alVar != null) {
                if (!com.ss.android.ugc.aweme.feed.experiment.c.d()) {
                    b as = alVar.as();
                    if (TextUtils.isEmpty(this.q) && aweme != null) {
                        this.q = ar.c(aweme);
                    }
                    ar a2 = new ar().a(this.f92899d);
                    a2.f109521d = this.f92902g;
                    ar f2 = a2.g(aweme);
                    f2.u = z;
                    f2.ab = as.getChallengeId();
                    f2.ag = as.getTagLine();
                    f2.aa = String.valueOf(alVar.aE());
                    f2.Z = as.getProcessId();
                    String str6 = this.q;
                    f2.f109518a = str;
                    f2.f109519b = str6;
                    f2.f109520c = ac.a(aweme, this.f92900e);
                    f2.ac = as.getmImprId();
                    ar arVar = (ar) f2.a(Boolean.valueOf(m.b(aweme)));
                    if (aweme == null || !aweme.isHighlighted()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    arVar.Y = z2;
                    arVar.ah = str2;
                    arVar.ak = as.getPlaylistSearchId();
                    arVar.aj = as.getIsFromVideo();
                    arVar.ai = as.getCategoryName();
                    if (com.ss.android.ugc.aweme.feed.x.ah.j(aweme)) {
                        str3 = "1";
                    } else {
                        str3 = str5;
                    }
                    arVar.ap = str3;
                    if (com.ss.android.ugc.aweme.feed.x.ah.k(aweme)) {
                        str4 = "1";
                    } else {
                        str4 = str5;
                    }
                    arVar.ao = str4;
                    arVar.al = this.f92899d;
                    arVar.an = as.getPlaylistPreviousPage();
                    arVar.at = as.getIsFromPlaylist();
                    arVar.am = as.getLastGroupId();
                    if (as.getNewsId() != null) {
                        arVar.as = as.getNewsId();
                    }
                    a(as, arVar);
                    if (a(this.f92899d, alVar.M())) {
                        if (aweme != null && aweme.isTop()) {
                            str5 = "1";
                        }
                        arVar.e(str5);
                    }
                    if (com.ss.android.ugc.aweme.story.d.a.d(aweme)) {
                        com.ss.android.ugc.aweme.metrics.c unused = com.ss.android.ugc.aweme.story.b.h.a(arVar, com.ss.android.ugc.aweme.story.g.f137757a.e().a(aweme.getAuthorUid()), aweme, i.a(as), null, null);
                    }
                    if (!TextUtils.isEmpty(((o) this).f92899d) && aweme != null && !TextUtils.isEmpty(aweme.getAid())) {
                        t.a(new o(aweme.getAid(), 0, System.currentTimeMillis(), ((o) this).f92899d));
                    }
                    arVar.s = alVar.ah();
                    ar arVar2 = (ar) arVar.c(alVar.M());
                    arVar2.u = z;
                    arVar2.t = FeedParamProvider.a.a(d()).getPreviousPagePosition();
                    arVar2.q = alVar.aq();
                    arVar2.r = alVar.ar();
                    arVar2.p = alVar.ap();
                    ((ar) arVar2.c(alVar.M()).d(ac.b(aweme, this.f92900e))).a(as).f109522e = alVar.aj();
                    if (!TextUtils.isEmpty(alVar.ak())) {
                        arVar.f109521d = alVar.ak();
                    }
                    arVar.a(y.b(as.getPreviousPage(), as.getFromGroupId()));
                    arVar.i(as.getListItemId());
                    arVar.g(as.getListResultType());
                    arVar.j(as.getSearchThirdItemId());
                    arVar.ac = as.getmImprId();
                    arVar.af = as.getSearchType();
                    arVar.ad = as.getSearchKeyword();
                    arVar.l(as.getSearchId());
                    String searchResultId = as.getSearchResultId();
                    if (TextUtils.equals(this.f92899d, "general_search") && TextUtils.isEmpty(searchResultId)) {
                        searchResultId = ac.e(aweme);
                    }
                    arVar.f(searchResultId);
                    if (aweme != null) {
                        arVar.aq = aweme.getCaptionReturnCount();
                        arVar.ar = aweme.getCaptionLength();
                    }
                    arVar.a(w.a(aweme, "video_play_finish", this.f92899d));
                    if (!(com.ss.android.ugc.aweme.poi_api.service.c.f115540d == null || com.ss.android.ugc.aweme.poi_api.service.c.a() == null)) {
                        arVar.a(com.ss.android.ugc.aweme.poi_api.service.c.a().a(as.getPagePoiId(), aweme));
                    }
                    if (aweme != null) {
                        com.ss.android.ugc.aweme.upvote.event.c.a(arVar, aweme, this.f92899d);
                    }
                    if (!com.bytedance.ies.ugc.appcontext.f.f34637l) {
                        arVar.f();
                    }
                    String ah = alVar.ah();
                    String previousPagePosition = FeedParamProvider.a.a(d()).getPreviousPagePosition();
                    if (this.f92899d.equals("playlist")) {
                        ah = as.getPlaylistPreviousPage();
                    }
                    if (TextUtils.equals(ah, "search_result") || TextUtils.equals(ah, "general_search") || TextUtils.equals(ah, "search_for_you_list")) {
                        long playlistOffset = as.getPlaylistOffset() + ((long) alVar.g(aweme));
                        ISearchResultStatistics a3 = SearchResultStatisticsImpl.a();
                        String str7 = this.f92899d;
                        if (TextUtils.equals(ah, "search_result") || TextUtils.equals(ah, "search_for_you_list")) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a3.a(new com.ss.android.ugc.aweme.discover.mob.r("search_video_play_finish", aweme, str7, -1, z3, ah, previousPagePosition, playlistOffset));
                    }
                } else if (aweme != null) {
                    String a_ = alVar.a_(true);
                    h.f.b.l.d(aweme, "");
                    h.f.b.l.d(a_, "");
                    com.ss.android.ugc.aweme.feed.helper.a.a(aweme, a_, "audio_play_finish", (Map<String, String>) null);
                }
            }
            this.r = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.e.o
    public final void a(n nVar, aj ajVar, String str, al alVar, Aweme aweme, JSONObject jSONObject) {
        Intent intent;
        super.a(nVar, ajVar, str, alVar, aweme, jSONObject);
        Context d2 = d();
        int i2 = this.f92900e;
        if (!this.r) {
            String str2 = null;
            if ((d2 instanceof Activity) && (intent = ((Activity) d2).getIntent()) != null && intent.getBooleanExtra("from_notification", false)) {
                str2 = a(intent, "rule_id");
            }
            if (aweme != null) {
                aweme.getAid();
            }
            b.i.b(new h(this, aweme, d2, str, i2, alVar, jSONObject, str2), r.a());
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x037a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object a(com.ss.android.ugc.aweme.feed.model.Aweme r22, android.content.Context r23, java.lang.String r24, int r25, com.ss.android.ugc.aweme.feed.q.al r26, org.json.JSONObject r27, java.lang.String r28) {
        /*
        // Method dump skipped, instructions count: 1149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.e.f.a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, java.lang.String, int, com.ss.android.ugc.aweme.feed.q.al, org.json.JSONObject, java.lang.String):java.lang.Object");
    }
}
