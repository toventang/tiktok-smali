package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.x.v;
import com.ss.android.ugc.aweme.feed.x.y;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.a.a;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Iterator;
import java.util.List;

public class as extends h<as> {
    public boolean X;
    public int Y = -1;
    public boolean Z;

    /* renamed from: a  reason: collision with root package name */
    public long f109523a;
    public int aA;
    public int aB = 0;
    private String aC;
    private String aD;
    private String aE = "";
    private String aF;
    private int aG;
    private String aH;
    private boolean aI;
    private String aJ;
    private String aK;
    private String aL;
    private String aM;
    private String aN;
    private int aO;
    private boolean aP;
    private String aQ;
    private String aR;
    private String aS;
    private String aT;
    private int aU = -1;
    private int aV;
    private int aW;
    private int aX;
    private String aY;
    private int aZ;
    public String aa;
    public String ab;
    public String ac;
    public String ad;
    public String ae;
    public String af;
    public String ag;
    public String ah;
    public String ai;
    public String aj;
    public String ak;
    public String al;
    public String am;
    public String an;
    public String ao = "";
    public String ap;
    public String aq = "";
    public int ar = -1;
    public String as = "";
    public String at = "";
    public String au = "";
    public String av = "";
    public String aw = "";
    public String ax = "";
    public String ay = "";
    public int az;

    /* renamed from: b  reason: collision with root package name */
    public int f109524b = 1;
    private int ba;
    private AwemeRelationRecommendModel bb;
    private int bc;
    private String bd = "";
    private int be;
    private String bf = "";
    private int bg;
    private Long bh = 0L;
    private int bi = 0;

    /* renamed from: c  reason: collision with root package name */
    public String f109525c;

    /* renamed from: d  reason: collision with root package name */
    public String f109526d;

    /* renamed from: e  reason: collision with root package name */
    public String f109527e;
    public String p;
    public String q;
    public String r;
    public String s;
    public double t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70114);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h
    public final String j() {
        return this.aC;
    }

    public as() {
        super("play_time");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        int i2;
        String str;
        a("has_tts", this.ax);
        a("has_cla", this.ay);
        a("group_id", this.aC, c.a.f109563b);
        a("author_id", this.aD, c.a.f109563b);
        a("duration", String.valueOf(this.f109523a), c.a.f109562a);
        a("player_type", this.f109525c, c.a.f109562a);
        a("fps", this.aF, c.a.f109562a);
        a("previous_page", this.u, c.a.f109562a);
        a("previous_page", this.u, c.a.f109562a);
        a("previous_page_position", this.v, c.a.f109562a);
        if ("homepage_hot".equals(this.f109556h)) {
            a("has_ad", this.bi);
        }
        if (this.X) {
            a("is_instructive", "1", c.a.f109562a);
            a("bottom_bar_show", "1", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            a("is_auto_play", this.aE, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aL)) {
            a("district_code", this.aL, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aM)) {
            a("sub_class", this.aM, c.a.f109562a);
        }
        int i3 = this.Y;
        if (i3 != -1) {
            a("rank_index", i3);
        }
        if (ac.a(this.f109556h)) {
            if (!TextUtils.isEmpty(this.al)) {
                a("impr_id", this.al);
            } else {
                a("impr_id", this.f109526d);
            }
            h(a.a(this.f109526d, this.al));
        }
        if ("like".equals(this.p) || "discovery".equals(this.f109556h) || this.bg == 1) {
            a("enter_method", this.f109527e, c.a.f109562a);
        }
        a("content_source", this.p, c.a.f109562a);
        if (g.a().a(this.aC)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (this.aG != 0) {
            a("is_long_item", new StringBuilder().append(this.aG).toString(), c.a.f109562a);
        }
        if (TextUtils.equals(this.f109556h, "homepage_fresh") || TextUtils.equals(this.f109556h, "homepage_channel")) {
            com.ss.android.ugc.aweme.w.a.a();
        }
        if (!TextUtils.isEmpty(this.r)) {
            a(this.r, this.s, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.q)) {
            a("playlist_type", this.q, c.a.f109562a);
        }
        a("volume_value", String.valueOf(this.t), c.a.f109562a);
        if (!TextUtils.isEmpty(this.aH)) {
            a("impr_type", this.aH, c.a.f109562a);
        }
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            a("is_teen_mode", "1", c.a.f109562a);
        }
        if (ac.b(this.f109556h)) {
            a("is_auto_play", ad.a(this.aI), c.a.f109562a);
            a("enter_fullscreen", String.valueOf(this.f109524b), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aJ)) {
            a("is_reposted", new StringBuilder().append(this.aV).toString(), c.a.f109562a);
            a("repost_from_group_id", this.aJ, c.a.f109562a);
            a("repost_from_user_id", this.aK, c.a.f109562a);
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.aP) {
                str = "follow";
            } else {
                str = "unfollow";
            }
            a("relation_type", str);
            a("video_type", this.aQ);
            a("rec_uid", this.aR);
        }
        a("is_promoted", this.bc);
        v.a(this.f109556h, new at(this));
        a("is_highlighted", this.Z);
        if (!TextUtils.isEmpty(this.aN)) {
            a("compilation_id", this.aN, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aa)) {
            a("carrier_type", this.aa, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            a("refer_seed_id", this.ab, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ac)) {
            a("refer_seed_name", this.ac, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ad)) {
            a("from_group_id", this.ad, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ae)) {
            a("data_type", this.ae, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.af)) {
            a("refer_commodity_id", this.af);
        }
        if (i.f79764a) {
            a("is_fullscreen", "1");
        }
        a("request_id", this.f109526d, c.a.f109563b);
        if (TextUtils.isEmpty(this.f109526d) && !TextUtils.isEmpty(this.al)) {
            a("request_id", this.al, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.ag)) {
            a("search_keyword", this.ag, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.F)) {
            a("search_result_id", this.F, c.a.f109562a);
            if (TextUtils.isEmpty(this.H)) {
                a("list_item_id", this.aC, c.a.f109562a);
            } else {
                a("list_item_id", this.H, c.a.f109562a);
                a("search_third_item_id", this.aC, c.a.f109562a);
            }
            if (!TextUtils.isEmpty(this.al)) {
                a("impr_id", this.al);
            }
        }
        if (!TextUtils.isEmpty(this.G)) {
            a("list_result_type", this.G, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        if (TextUtils.equals(this.f109556h, "general_search") && (i2 = this.aO) > 0) {
            float f2 = 1.0f;
            float f3 = (((float) this.f109523a) * 1.0f) / ((float) i2);
            if (f3 <= 1.0f) {
                f2 = f3;
            }
            a("percentage", String.valueOf(f2), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x);
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("region", this.ai);
        }
        if (!TextUtils.isEmpty(this.aS)) {
            a("relation_tag", this.aS);
        }
        if (this.aW != 0) {
            a("is_media", new StringBuilder().append(this.aW).toString(), c.a.f109562a);
        }
        if (this.aX != 0) {
            a("is_history", new StringBuilder().append(this.aX).toString(), c.a.f109562a);
        }
        if (this.aU != -1) {
            a("is_fullscreen", new StringBuilder().append(this.aU).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aY)) {
            a("eid", this.aY, c.a.f109562a);
        }
        if (this.aZ != 0) {
            a("from_tag_id", new StringBuilder().append(this.aZ).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aj)) {
            a("tag_id", this.aj);
        }
        if (!TextUtils.isEmpty(this.ak)) {
            a("parent_tag_id", this.ak);
        }
        if (!TextUtils.isEmpty(this.aT)) {
            a("follow_status", this.aT);
        }
        if ("compilation_detail".equals(this.f109556h)) {
            if ("from_mix_video".equals(this.ah)) {
                a("page_type", "simple");
            } else {
                a("page_type", "complete");
            }
        }
        String str2 = this.al;
        if (str2 != null) {
            a("impr_id", str2);
        }
        if ((TextUtils.equals(this.f109556h, "general_search") || TextUtils.equals(this.f109556h, "search_result") || TextUtils.equals(this.f109556h, "trending_page")) && !TextUtils.isEmpty(this.O)) {
            a("search_id", this.O);
        }
        if (!TextUtils.isEmpty(this.am)) {
            Aweme b2 = AwemeService.b().b(this.am);
            a("feed_group_id", b2.getAid());
            a("feed_author_id", b2.getAuthorUid());
        }
        if (e.b() && this.ba != 0) {
            a("is_avatar", e.c());
        }
        if (!TextUtils.isEmpty(this.an)) {
            a("search_type", this.an);
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.bb;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.bb.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.ao)) {
            a("tag_line", this.ao);
        }
        if (!TextUtils.isEmpty(this.ap)) {
            a("music_id", this.ap);
        }
        if (this.bg == 1) {
            a("question_id", String.valueOf(this.bh));
            a("qa_type", this.bf);
            a("enter_from", this.f109556h);
            a(y.b("homepage_hot", this.ad));
        }
        if (!TextUtils.isEmpty(this.at) && (TextUtils.equals(this.at, "click_comment_chain") || TextUtils.equals(this.at, "click_comment_bubble") || TextUtils.equals(this.at, "push"))) {
            a("comment_enter_method", this.at);
            a("last_group_id", this.au);
        } else if (!TextUtils.isEmpty(this.at) && TextUtils.equals(this.at, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.au);
        } else if (!TextUtils.isEmpty(this.at) && TextUtils.equals(this.at, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.au);
        }
        if (!TextUtils.isEmpty(this.bd)) {
            a("playlist_id", this.bd);
            if (!TextUtils.isEmpty(this.as) && TextUtils.equals(this.f109556h, "playlist")) {
                a("search_id", this.as);
                a("is_from_video", this.ar);
            }
            if (TextUtils.equals(this.f109556h, "playlist")) {
                a("playlist_previous_page", this.av);
                a("from_group_id", this.aw);
            }
        }
        int i4 = this.aB;
        if (i4 == 1) {
            a("is_from_playlist", i4);
        }
        if (!TextUtils.isEmpty(this.aq)) {
            a("category_name", this.aq);
        }
        a("is_long", this.be);
        a("caption_length", this.az);
        a("caption_return_count", this.aA);
    }

    public final as a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ as k(String str) {
        this.al = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ as n(String str) {
        this.ad = str;
        return this;
    }

    public final as o(String str) {
        this.f109560l = str;
        return this;
    }

    public final as a(float f2) {
        try {
            this.aF = String.valueOf(f2);
        } catch (Exception e2) {
            e2.printStackTrace();
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
    public final as g(Aweme aweme) {
        int i2;
        super.g(aweme);
        if (aweme != null) {
            this.aC = aweme.getAid();
            this.aD = c(aweme);
            this.aH = ac.j(aweme);
            this.aI = aweme.isImage();
            this.aV = aweme.isForwardAweme() ? 1 : 0;
            this.aJ = aweme.getRepostFromGroupId();
            this.aK = aweme.getRepostFromUserId();
            if (aweme.getMixInfo() != null) {
                this.aN = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.ba = aweme.getMutualRelation().getMutualType();
            }
            this.aP = in.a(aweme);
            this.aQ = ac.k(aweme);
            this.aR = ac.l(aweme);
            this.aS = "";
            if (aweme.getVideo() != null) {
                i2 = aweme.getVideo().getDuration();
            } else {
                i2 = 0;
            }
            this.aO = i2;
            this.aT = aa.a(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            this.bi = aweme.getHasAd();
            if (TextUtils.isEmpty(this.y)) {
                this.y = b(aweme, 1);
            }
            this.bb = aweme.getRelationRecommendInfo();
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.bc = 1;
            }
            if (!(aweme.playlist_info == null || aweme.playlist_info.getMixId() == null)) {
                this.bd = aweme.playlist_info.getMixId();
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.be = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.be = 1;
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
                        this.bg = 1;
                        this.bh = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.bf = "answer";
                        } else {
                            this.bf = "question";
                        }
                    }
                }
            }
        }
        return this;
    }
}
