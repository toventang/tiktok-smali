package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.commercialize.e.a.b;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.a.a;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Iterator;
import java.util.List;

public class ar extends h<ar> {
    public int X = 1;
    public boolean Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public String f109518a;
    private String aA;
    private String aB;
    private String aC;
    private boolean aD;
    private String aE;
    private String aF;
    private String aG;
    private int aH;
    private AwemeRelationRecommendModel aI;
    private int aJ;
    private String aK = "";
    private int aL;
    private String aM = "";
    private String aN = "";
    private int aO;
    private Long aP = 0L;
    public String aa;
    public String ab;
    public String ac;
    public String ad;
    protected int ae;
    public String af;
    public String ag = "";
    public String ah;
    public String ai = "";
    public int aj = -1;
    public String ak = "";
    public String al = "";
    public String am = "";
    public String an = "";
    public String ao = "";
    public String ap = "";
    public int aq = 0;
    public int ar = 0;
    public String as = "";
    public int at = 0;
    private String au = "";
    private int av;
    private String aw;
    private boolean ax;
    private String ay;
    private String az;

    /* renamed from: b  reason: collision with root package name */
    public String f109519b;

    /* renamed from: c  reason: collision with root package name */
    public String f109520c;

    /* renamed from: d  reason: collision with root package name */
    public String f109521d;

    /* renamed from: e  reason: collision with root package name */
    public String f109522e;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public boolean u;
    public String v;

    static {
        Covode.recordClassIndex(70113);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h
    public final String j() {
        return this.f109518a;
    }

    public ar() {
        super("video_play_finish");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        a("group_id", this.f109518a, c.a.f109563b);
        a("author_id", this.f109519b, c.a.f109563b);
        a("request_id", this.f109520c, c.a.f109563b);
        if (TextUtils.isEmpty(this.f109520c) && !TextUtils.isEmpty(this.ac)) {
            a("request_id", this.ac, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.au)) {
            a("is_auto_play", this.au, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            a("district_code", this.aA, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            a("sub_class", this.aB, c.a.f109562a);
        }
        a("is_highlighted", this.Y);
        if (ac.a(this.f109556h)) {
            h(a.a(this.f109520c, this.ac));
            if (!TextUtils.isEmpty(this.ac)) {
                a("impr_id", this.ac);
            } else {
                a("impr_id", this.f109520c);
            }
        }
        if ("like".equals(this.f109522e) || "discovery".equals(this.f109556h) || this.aO == 1) {
            a("enter_method", this.f109521d, c.a.f109562a);
        }
        a("content_source", this.f109522e, c.a.f109562a);
        if (g.a().a(this.f109518a)) {
            a("previous_page", "push", c.a.f109562a);
        } else {
            a("previous_page", this.s, c.a.f109562a);
            a("previous_page_position", this.t, c.a.f109562a);
        }
        if (this.u) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (this.av != 0) {
            a("is_long_item", new StringBuilder().append(this.av).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a(this.q, this.r, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.p)) {
            a("playlist_type", this.p, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.v)) {
            a("video_type", this.v, c.a.f109562a);
        }
        a("is_promoted", this.aJ);
        if (!TextUtils.isEmpty(this.aw)) {
            a("impr_type", this.aw, c.a.f109562a);
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            a("is_teen_mode", "1", c.a.f109562a);
        }
        if (ac.b(this.f109556h)) {
            a("is_auto_play", ad.a(this.ax), c.a.f109562a);
            a("enter_fullscreen", String.valueOf(this.X), c.a.f109562a);
            a("notice_type", com.ss.android.ugc.aweme.follow.e.a.f96227a);
            a("show_cnt", com.ss.android.ugc.aweme.follow.e.a.f96228b);
            a("yellow_dot_logid", com.ss.android.ugc.aweme.follow.e.a.f96229c);
        }
        if (!TextUtils.isEmpty(this.ay)) {
            a("is_reposted", "1", c.a.f109562a);
            a("repost_from_group_id", this.ay, c.a.f109562a);
            a("repost_from_user_id", this.az, c.a.f109562a);
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.aD) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            a("relation_type", str);
            a("video_type", this.aE);
            a("rec_uid", this.aF);
        }
        if (!TextUtils.isEmpty(this.aC)) {
            a("compilation_id", this.aC, c.a.f109562a);
        }
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        if (this.A.booleanValue()) {
            a("is_fullscreen", "0");
        }
        String str2 = this.f109556h;
        String str3 = this.Z;
        String str4 = this.aa;
        String str5 = this.ab;
        if (TextUtils.equals("challenge", str2)) {
            a("process_id", str3);
            a("tag_id", str5);
            a("rank_index", str4);
        }
        if (TextUtils.equals("single_song", this.f109556h)) {
            a("process_id", this.Z);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            a("search_keyword", this.ad, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.F)) {
            a("search_result_id", this.F, c.a.f109562a);
            if (TextUtils.isEmpty(this.H)) {
                a("list_item_id", this.f109518a, c.a.f109562a);
            } else {
                a("list_item_id", this.H, c.a.f109562a);
                a("search_third_item_id", this.f109518a, c.a.f109562a);
            }
        }
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        if (!TextUtils.isEmpty(this.aG)) {
            a("follow_status", this.aG);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            a("impr_id", this.ac);
        }
        if ((TextUtils.equals(this.f109556h, "general_search") || TextUtils.equals(this.f109556h, "search_result") || TextUtils.equals(this.f109556h, "trending_page")) && !TextUtils.isEmpty(this.O)) {
            a("search_id", this.O);
        }
        if (e.b() && this.aH != 0) {
            a("is_avatar", e.c());
        }
        a("relation_tag", new StringBuilder().append(this.ae).toString());
        if (!TextUtils.isEmpty(this.af)) {
            a("search_type", this.af);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.aI;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.aI.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.ag)) {
            a("tag_line", this.ag);
        }
        if (!TextUtils.isEmpty(this.ah)) {
            a("music_id", this.ah);
        }
        if (!TextUtils.isEmpty(this.as)) {
            a("news_id", this.as);
        }
        if (this.aO == 1) {
            a("question_id", String.valueOf(this.aP));
            a("qa_type", this.aN);
            a("enter_from", this.f109556h);
        }
        if (!TextUtils.isEmpty(this.al) && (TextUtils.equals(this.al, "click_comment_chain") || TextUtils.equals(this.al, "click_comment_bubble") || TextUtils.equals(this.al, "push"))) {
            a("comment_enter_method", this.al);
            a("last_group_id", this.am);
        } else if (!TextUtils.isEmpty(this.al) && TextUtils.equals(this.al, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.am);
        } else if (!TextUtils.isEmpty(this.al) && TextUtils.equals(this.al, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.am);
        }
        if (!TextUtils.isEmpty(this.aK)) {
            a("playlist_id", this.aK);
            if (!TextUtils.isEmpty(this.ak) && TextUtils.equals(this.f109556h, "playlist")) {
                a("search_id", this.ak);
                a("is_from_video", this.aj);
            }
            if (TextUtils.equals(this.f109556h, "playlist")) {
                a("playlist_previous_page", this.an);
                a("from_group_id", this.aM);
            }
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("category_name", this.ai);
        }
        int i2 = this.at;
        if (i2 == 1) {
            a("is_from_playlist", i2);
        }
        a("is_long", this.aL);
        a("is_ad", b.s(this.U) ? 1 : 0);
        a("is_splash", b.G(this.U) ? 1 : 0);
        a("has_cla", this.ap);
        a("has_tts", this.ao);
        a("caption_length", this.ar);
        a("caption_return_count", this.aq);
    }

    public final ar a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ ar k(String str) {
        this.ac = str;
        return this;
    }

    public final ar a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        if (bVar != null) {
            this.f109560l = bVar.getCreationId();
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void b(Aweme aweme) {
        super.b(aweme);
        if (TextUtils.isEmpty(this.n)) {
            this.n = b(aweme, 1);
        }
    }

    /* renamed from: f */
    public final ar g(Aweme aweme) {
        int i2;
        super.g(aweme);
        if (aweme != null) {
            this.f109518a = aweme.getAid();
            this.f109519b = c(aweme);
            this.f109520c = ac.b(aweme);
            this.aw = ac.j(aweme);
            this.ax = aweme.isImage();
            this.ay = aweme.getRepostFromGroupId();
            this.az = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.aC = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.aH = aweme.getMutualRelation().getMutualType();
            }
            this.aD = in.a(aweme);
            this.aE = ac.k(aweme);
            this.aF = ac.l(aweme);
            this.aG = aa.a(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            if (aweme.getAuthor() != null) {
                i2 = aweme.getAuthor().getFollowStatus();
            } else {
                i2 = -2;
            }
            this.ae = i2;
            if (TextUtils.isEmpty(this.y)) {
                this.y = b(aweme, 1);
            }
            this.aI = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.aJ = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.aK = aweme.playlist_info.getMixId();
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.aL = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.aL = 1;
            }
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InteractStickerStruct next = it.next();
                    if (next.getQaStruct() != null) {
                        this.aO = 1;
                        this.aP = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.aN = "answer";
                        } else {
                            this.aN = "question";
                        }
                    }
                }
            }
        }
        return this;
    }
}
