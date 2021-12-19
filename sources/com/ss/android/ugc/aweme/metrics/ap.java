package com.ss.android.ugc.aweme.metrics;

import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.detail.i;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.feed.x.v;
import com.ss.android.ugc.aweme.friends.e;
import com.ss.android.ugc.aweme.metrics.a.a;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.push.g;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.utils.cx;
import com.ss.android.ugc.aweme.utils.eu;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ap extends h<ap> {
    public String X;
    public String Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    public String f109512a;
    private String aA;
    private String aB = "";
    private String aC;
    private String aD;
    private String aE;
    private int aF;
    private String aG;
    private int aH;
    private int aI;
    private boolean aJ;
    private String aK;
    private String aL;
    private boolean aM;
    private String aN;
    private String aO;
    private int aP = -1;
    private String aQ;
    private String aR;
    private String aS;
    private String aT;
    private String aU;
    private String aV;
    private String aW;
    private boolean aX;
    private String aY;
    private String aZ;
    public String aa;
    public String ab;
    public boolean ac;
    public String ad;
    public int ae;
    public String af;
    public boolean ag;
    public String ah;
    public String ai = "";
    public String aj = "";
    public String ak = "";
    public int al = -1;
    public String am = "";
    public String an = "";
    public String ao = "";
    public String ap = "";
    public String aq = "";
    public String ar = "";
    public int as;
    public int at;
    public int au = 0;
    private String av;
    private String aw;
    private String ax;
    private String ay = "0";
    private Integer az;

    /* renamed from: b  reason: collision with root package name */
    public String f109513b;
    private String ba;
    private String bb;
    private int bc;
    private int bd;
    private String be;
    private int bf;
    private String bg;
    private String bh;
    private List<AnchorCommonStruct> bi;
    private int bj;
    private AwemeRelationRecommendModel bk;
    private int bl;
    private String bm = "";
    private int bn;
    private int bo;
    private int bp;
    private int bq = 1;
    private int br = 1;
    private int bs;
    private Boolean bt = false;
    private Long bu = 0L;
    private int bv = 0;

    /* renamed from: c  reason: collision with root package name */
    public String f109514c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f109515d;

    /* renamed from: e  reason: collision with root package name */
    public String f109516e;
    public int p = 1;
    public String q;
    public String r;
    protected String s;
    public String t;
    public String u;
    public String v;

    static {
        Covode.recordClassIndex(70111);
    }

    @Override // com.ss.android.ugc.aweme.metrics.h
    public final String j() {
        return this.aw;
    }

    private void b() {
        try {
            if (Settings.System.getInt(d.a().getContentResolver(), "accelerometer_rotation") == 0) {
                this.aI = 0;
            } else {
                this.aI = 1;
            }
        } catch (Throwable unused) {
        }
    }

    public ap() {
        super("video_play");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        a("has_cla", this.br);
        a("has_tts", this.bq);
        a("author_id", this.ax, c.a.f109563b);
        a("group_id", this.aw, c.a.f109563b);
        a("author_id", this.ax, c.a.f109563b);
        a("player_type", this.f109512a, c.a.f109562a);
        a("request_id", this.K, c.a.f109563b);
        if (TextUtils.isEmpty(this.K) && !TextUtils.isEmpty(this.J)) {
            a("request_id", this.J, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.y)) {
            a("order", this.y, c.a.f109562a);
        }
        a("feed_count", this.aC, c.a.f109562a);
        a("previous_page", this.f109513b, c.a.f109562a);
        a("previous_page_position", this.f109514c, c.a.f109562a);
        String str5 = "1";
        if (this.f109515d) {
            a("is_instructive", str5, c.a.f109562a);
            a("bottom_bar_show", str5, c.a.f109562a);
        }
        a("is_photo", this.ay, c.a.f109562a);
        Integer num = this.az;
        if (num != null) {
            a("detail", String.valueOf(num), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aB)) {
            a("is_auto_play", this.aB, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aA)) {
            a("share_mode", "token", c.a.f109562a);
            a("uid", this.aA, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aN)) {
            a("district_code", this.aN, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aO)) {
            a("sub_class", this.aO, c.a.f109562a);
        }
        int i2 = this.aP;
        if (i2 > 0) {
            a("rank_index", String.valueOf(i2), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aD)) {
            a("enter_from_request", this.aD, c.a.f109563b);
        }
        if (!TextUtils.isEmpty(this.f109516e)) {
            a("search_keyword", this.f109516e, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.F)) {
            a("search_result_id", this.F, c.a.f109562a);
            if (TextUtils.isEmpty(this.H)) {
                a("list_item_id", this.aw, c.a.f109562a);
            } else {
                a("list_item_id", this.H, c.a.f109562a);
                a("search_third_item_id", this.aw, c.a.f109562a);
            }
        }
        if (!TextUtils.isEmpty(this.G)) {
            a("list_result_type", this.G, c.a.f109562a);
        }
        if (ac.a(this.f109556h)) {
            h(this.K);
            if (!TextUtils.isEmpty(this.J)) {
                h(a.a(this.K, this.J));
            } else {
                a("impr_id", this.K);
            }
        }
        if (!TextUtils.isEmpty(this.s)) {
            a("video_type", this.s);
        }
        List<AnchorCommonStruct> list = this.bi;
        if (list != null && list.size() > 0 && this.f109556h.equalsIgnoreCase("anchor_detail")) {
            AnchorCommonStruct anchorCommonStruct = this.bi.get(0);
            if (!TextUtils.isEmpty(anchorCommonStruct.getLogExtra())) {
                try {
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getLogExtra());
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            a(next, (String) obj);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                a("anchor_type", "movie");
                a("anchor_entry", anchorCommonStruct.getKeyword());
            }
        }
        a("is_promoted", this.bl);
        a("is_qa", this.bn);
        a("is_cr", this.bo);
        a("is_ad", this.bp);
        if ("homepage_hot".equals(this.f109556h)) {
            a("has_ad", this.bv);
        }
        if (this.bn == 1) {
            a("question_id", String.valueOf(this.bu));
            a("qa_type", this.bm);
            a("enter_from", this.f109556h);
        }
        if (!TextUtils.isEmpty(this.aE)) {
            a("account_type", this.aE, c.a.f109562a);
        }
        a("is_bytevc1", String.valueOf(this.aH), c.a.f109562a);
        if ("like".equals(this.r) || "homepage_fresh".equalsIgnoreCase(this.f109556h) || "homepage_channel".equals(this.f109556h) || TextUtils.equals("homepage_fresh_topic", this.f109556h) || "homepage_fresh_search".equalsIgnoreCase(this.f109556h) || "ec_impressed_page".equalsIgnoreCase(this.f109556h) || "discovery".equals(this.f109556h) || "from_chat".equals(this.ad) || this.bn == 1) {
            a("enter_method", this.q, c.a.f109562a);
        }
        a("content_source", this.r, c.a.f109562a);
        if (g.a().a(this.aw)) {
            a("previous_page", "push", c.a.f109562a);
        }
        if (this.aF != 0) {
            a("is_long_item", new StringBuilder().append(this.aF).toString(), c.a.f109562a);
        }
        if (this.f109555g.get("enter_play_method") == null) {
            a("enter_play_method", "manul_play", c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.Y)) {
            a(this.Y, this.Z, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.X)) {
            a("playlist_type", this.X, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aa)) {
            a("rule_id", this.aa, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aG)) {
            a("impr_type", this.aG, c.a.f109562a);
        }
        a("is_auto_rotate", String.valueOf(this.aI), c.a.f109562a);
        if (com.ss.android.ugc.aweme.compliance.api.a.o().a()) {
            a("is_teen_mode", str5, c.a.f109562a);
        }
        if (ac.b(this.f109556h)) {
            a("is_auto_play", ad.a(this.aJ), c.a.f109562a);
            a("enter_fullscreen", String.valueOf(this.p), c.a.f109562a);
            a("notice_type", com.ss.android.ugc.aweme.follow.e.a.f96227a);
            a("show_cnt", String.valueOf(com.ss.android.ugc.aweme.follow.e.a.f96228b));
            a("yellow_dot_logid", com.ss.android.ugc.aweme.follow.e.a.f96229c);
        }
        if (!TextUtils.isEmpty(this.aK)) {
            a("is_reposted", str5, c.a.f109562a);
            a("repost_from_group_id", this.aK, c.a.f109562a);
            a("repost_from_user_id", this.aL, c.a.f109562a);
            if (this.aM) {
                str4 = str5;
            } else {
                str4 = "0";
            }
            a("is_text_empty", str4, c.a.f109562a);
        }
        if (TextUtils.equals("homepage_familiar", this.f109556h)) {
            if (this.aX) {
                str3 = "follow";
            } else {
                str3 = "unfollow";
            }
            a("relation_type", str3);
            a("video_type", this.aY);
            a("rec_uid", this.aZ);
        }
        if (TextUtils.equals("challenge", this.f109556h)) {
            String str6 = this.t;
            String str7 = this.u;
            String str8 = this.v;
            a("process_id", str6);
            a("tag_id", str8);
            a("rank_index", str7);
            a("tag_id", this.v);
        }
        if ("from_chat".equals(this.ad)) {
            if ("group_chat".equals(this.f109556h)) {
                str2 = "group";
            } else {
                str2 = "private";
            }
            a("chat_type", str2);
            a("enter_from", "chat", c.a.f109562a);
        }
        if (TextUtils.equals("single_song", this.f109556h)) {
            a("process_id", this.t);
        }
        if (!TextUtils.isEmpty(this.x)) {
            a("tab_name", this.x);
        }
        v.a(this.f109556h, new aq(this));
        if (!TextUtils.isEmpty(this.aQ)) {
            a("compilation_id", this.aQ, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aR)) {
            a("carrier_type", this.aR, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aS)) {
            a("refer_seed_id", this.aS, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aT)) {
            a("refer_seed_name", this.aT, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aU)) {
            a("from_group_id", this.aU, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aV)) {
            a("data_type", this.aV, c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.aW)) {
            a("refer_commodity_id", this.aW);
        }
        if (i.f79764a) {
            a("is_fullscreen", str5);
        }
        if (this.A.booleanValue()) {
            a("is_fullscreen", "0");
        }
        if (!TextUtils.isEmpty(this.f109560l)) {
            a("creation_id", this.f109560l);
        }
        if (!TextUtils.isEmpty(this.bb)) {
            a("region", this.bb);
        }
        a("play_order", String.valueOf(this.ae));
        if (!TextUtils.isEmpty(this.ba)) {
            a("relation_tag", this.ba);
        }
        if (this.bc != 0) {
            a("is_media", new StringBuilder().append(this.bc).toString(), c.a.f109562a);
        }
        if (this.bd != 0) {
            a("is_history", new StringBuilder().append(this.bd).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.be)) {
            a("eid", this.be, c.a.f109562a);
        }
        if (this.bf != 0) {
            a("from_tag_id", new StringBuilder().append(this.bf).toString(), c.a.f109562a);
        }
        if (!TextUtils.isEmpty(this.ab)) {
            a("parent_tag_id", this.ab);
        }
        a("is_highlighted", String.valueOf(this.ac));
        if (!TextUtils.isEmpty(this.bg)) {
            a("follow_status", this.bg);
        }
        if ("compilation_detail".equals(this.f109556h)) {
            if ("from_mix_video".equals(this.ad)) {
                a("page_type", "simple");
            } else {
                a("page_type", "complete");
            }
        }
        if (!TextUtils.isEmpty(this.J)) {
            a("impr_id", this.J);
        } else {
            a("impr_id", this.K);
        }
        if ((TextUtils.equals(this.f109556h, "general_search") || TextUtils.equals(this.f109556h, "search_result") || TextUtils.equals(this.f109556h, "trending_page")) && !TextUtils.isEmpty(this.O)) {
            a("search_id", this.O);
        }
        if (!TextUtils.isEmpty(this.bh)) {
            a("to_user_id", this.bh);
        }
        if (!TextUtils.isEmpty(this.av)) {
            a("content_type", this.av);
        }
        if (!TextUtils.isEmpty(this.af)) {
            a("music_id", this.af);
        }
        if (!TextUtils.isEmpty(this.an) && (TextUtils.equals(this.an, "click_comment_chain") || TextUtils.equals(this.an, "click_comment_bubble") || TextUtils.equals(this.an, "push"))) {
            a("comment_enter_method", this.an);
            a("last_group_id", this.ao);
        } else if (!TextUtils.isEmpty(this.an) && TextUtils.equals(this.an, "notification_page")) {
            a("comment_enter_method", "notification");
            a("last_group_id", this.ao);
        } else if (!TextUtils.isEmpty(this.an) && TextUtils.equals(this.an, UGCMonitor.EVENT_COMMENT)) {
            a("comment_enter_method", "comment_panel");
            a("last_group_id", this.ao);
        }
        if (this.ag) {
            str = str5;
        } else {
            str = "0";
        }
        a("ugc_to_pgc_meta", str);
        if (!TextUtils.isEmpty(this.ah)) {
            a("search_type", this.ah);
        }
        if (e.b() && this.bj != 0) {
            a("is_avatar", e.c());
        }
        AwemeRelationRecommendModel awemeRelationRecommendModel = this.bk;
        if (awemeRelationRecommendModel != null) {
            a("rec_type", awemeRelationRecommendModel.getRecType());
            a("relation_type", this.bk.getFriendTypeStr());
        }
        if (!TextUtils.isEmpty(this.ai)) {
            a("tag_line", this.ai);
        }
        if (!TextUtils.isEmpty(this.aj)) {
            a("playlist_id", this.aj);
            if (!TextUtils.isEmpty(this.am) && TextUtils.equals(this.f109556h, "playlist")) {
                a("search_id", this.am);
                a("is_from_video", this.al);
            }
            if (TextUtils.equals(this.f109556h, "playlist")) {
                a("playlist_previous_page", this.ap);
                a("from_group_id", this.aq);
            }
        }
        int i3 = this.au;
        if (i3 == 1) {
            a("is_from_playlist", i3);
        }
        if (!TextUtils.isEmpty(this.ak)) {
            a("category_name", this.ak);
        }
        if (!TextUtils.isEmpty(this.ar)) {
            a("news_id", this.ar);
        }
        a("is_long", this.bs);
        if (!this.bt.booleanValue()) {
            str5 = "0";
        }
        a("is_giftable", str5);
        a("caption_length", this.as);
        a("caption_return_count", this.at);
    }

    public final ap a(String str) {
        this.f109556h = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ ap m(String str) {
        this.ar = str;
        return this;
    }

    /* Return type fixed from 'com.ss.android.ugc.aweme.metrics.h' to match base method */
    @Override // com.ss.android.ugc.aweme.metrics.h
    public final /* bridge */ /* synthetic */ ap n(String str) {
        this.aU = str;
        return this;
    }

    public final ap o(String str) {
        this.s = str;
        return this;
    }

    public final ap a(boolean z) {
        this.bq = !z ? 1 : 0;
        return this;
    }

    public final ap b(boolean z) {
        this.br = !z ? 1 : 0;
        return this;
    }

    public final ap a(b bVar) {
        if (bVar != null) {
            this.f109560l = bVar.getCreationId();
        }
        return this;
    }

    /* renamed from: f */
    public final ap g(Aweme aweme) {
        super.g(aweme);
        if (aweme != null) {
            h(aweme);
            this.K = ac.b(aweme);
        }
        b();
        return this;
    }

    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void b(Aweme aweme) {
        super.b(aweme);
        if (TextUtils.isEmpty(this.n)) {
            this.n = b(aweme, 1);
        }
    }

    public ap(String str) {
        super(str);
        this.f109559k = true;
    }

    private void h(Aweme aweme) {
        String str;
        if (aweme != null) {
            this.av = aweme.getLiveType();
            this.aw = aweme.getAid();
            this.ax = c(aweme);
            if (aweme.isImage()) {
                str = "1";
            } else {
                str = "0";
            }
            this.ay = str;
            this.aJ = aweme.isImage();
            this.aG = ac.j(aweme);
            this.aK = aweme.getRepostFromGroupId();
            this.aL = aweme.getRepostFromUserId();
            this.aM = cx.a(aweme);
            if (aweme.getMixInfo() != null) {
                this.aQ = aweme.getMixInfo().mixId;
            }
            if (aweme.getMutualRelation() != null) {
                this.bj = aweme.getMutualRelation().getMutualType();
            }
            this.aX = in.a(aweme);
            this.aY = ac.k(aweme);
            this.aZ = ac.l(aweme);
            this.ba = "";
            this.bg = aa.a(aweme);
            this.C = ac.m(aweme);
            this.D = ac.n(aweme);
            this.bk = aweme.getRelationRecommendInfo();
            this.bp = aweme.isAd() ? 1 : 0;
            this.bt = Boolean.valueOf(aweme.getAllowGift());
            if (aweme.getBoost() != null && !TextUtils.isEmpty(aweme.getBoost().getText())) {
                this.bl = 1;
            }
            this.bv = aweme.getHasAd();
            List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
            if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InteractStickerStruct next = it.next();
                    if (next.getQaStruct() != null) {
                        this.bn = 1;
                        this.bu = Long.valueOf(next.getQaStruct().getQuestionId());
                        if (!TextUtils.equals(aweme.getAid(), String.valueOf(next.getQaStruct().getItemId()))) {
                            this.bm = "answer";
                        } else {
                            this.bm = "question";
                        }
                    }
                }
            }
            if (this.U.getTextExtra() != null && this.U.getTextExtra().size() > 0) {
                Iterator<TextExtraStruct> it2 = this.U.getTextExtra().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().getSubtype() == 2) {
                            this.bo = 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            eu.a(this, aweme.getAuthor());
            if (!TextUtils.isEmpty(aweme.partN)) {
                this.bs = 2;
            } else if (aweme.getVideo() != null && aweme.getVideo().isLongVideo()) {
                this.bs = 1;
            }
        }
    }

    public final ap c(Aweme aweme, int i2) {
        super.g(aweme);
        if (aweme != null) {
            h(aweme);
            this.K = a(aweme, i2);
            this.y = b(aweme, i2);
            if (TextUtils.isEmpty(this.y)) {
                this.y = b(aweme, 1);
            }
            this.aC = String.valueOf(aweme.getFeedCount());
            if (aweme.getAnchors() != null) {
                this.bi = aweme.getAnchors();
            }
        }
        b();
        return this;
    }
}
