package com.ss.android.ugc.aweme.feed.ui;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.tag.TuxTag;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.adaptation.c;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ad.d;
import com.ss.android.ugc.aweme.commercialize.g;
import com.ss.android.ugc.aweme.commercialize.j.b;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gc;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import com.ss.android.ugc.aweme.feed.experiment.q;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.widget.b;
import com.ss.android.ugc.aweme.feed.widget.i;
import com.ss.android.ugc.aweme.feed.widget.j;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.legoImp.inflate.e;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.mix.MixHelperService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.view.f;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.w;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class cc extends com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f94462a = com.ss.android.ugc.aweme.feed.v.a.a();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f94463b = gc.a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f94464c;
    private boolean A;
    private boolean B = c.f66191a;
    private List<TextExtraStruct> C;
    private String[] D;
    private View E;
    private View F;

    /* renamed from: d  reason: collision with root package name */
    public MentionTextView f94465d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f94466e;

    /* renamed from: f  reason: collision with root package name */
    public TranslationStatusView f94467f;

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f94468g;

    /* renamed from: h  reason: collision with root package name */
    FrameLayout f94469h;

    /* renamed from: i  reason: collision with root package name */
    public bv f94470i;

    /* renamed from: j  reason: collision with root package name */
    public aw f94471j;

    /* renamed from: k  reason: collision with root package name */
    boolean f94472k;

    /* renamed from: l  reason: collision with root package name */
    boolean f94473l;

    /* renamed from: m  reason: collision with root package name */
    public SpannableStringBuilder f94474m;
    public int n;
    public SpannableStringBuilder o;
    public int p;
    int q;
    TuxTag r;
    TextView s;
    public SpannableStringBuilder t;
    public int u;
    public int v;
    final int w = AVExternalServiceImpl.a().publishService().getAddVideosExperiConsuSideCode();
    boolean x = false;
    private b y;
    private boolean z;

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean l() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.a("on_page_selected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("on_page_unselected", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
            dataCenter.a("on_bottom_layer_clicked", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this.J);
        }
    }

    public final void a(boolean z2) {
        if (this.R != null && this.L != null && this.L.getDesc() != null) {
            boolean a2 = gb.a(this.R);
            boolean a3 = androidx.core.f.a.a().a(this.L.getDesc());
            int i2 = 1;
            boolean z3 = false;
            boolean z4 = a2 != a3;
            try {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f94465d.getLayoutParams();
                if (z2) {
                    if (!this.A) {
                        if (z4) {
                            if (this.z) {
                                return;
                            }
                        } else if (!this.z) {
                            return;
                        }
                    }
                    this.A = false;
                    this.z = !this.z;
                    MentionTextView mentionTextView = this.f94465d;
                    if (!a3) {
                        i2 = 0;
                    }
                    v.b((View) mentionTextView, i2);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f94466e.getLayoutParams();
                    layoutParams2.gravity = a3 ? 83 : 85;
                    layoutParams2.leftMargin = n.a(15.0d);
                    int i3 = Build.VERSION.SDK_INT;
                    layoutParams2.setMarginStart((int) com.bytedance.common.utility.n.b(this.R, 15.0f));
                    this.f94466e.setLayoutParams(layoutParams2);
                    z3 = z4;
                } else if (v.e(this.f94465d) != a2) {
                    this.A = true;
                    MentionTextView mentionTextView2 = this.f94465d;
                    if (!a2) {
                        i2 = 0;
                    }
                    v.b((View) mentionTextView2, i2);
                } else {
                    return;
                }
                if (z3) {
                    layoutParams.rightMargin = n.a(15.0d);
                    layoutParams.leftMargin = n.a(0.0d);
                    int i4 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginEnd((int) com.bytedance.common.utility.n.b(this.R, 15.0f));
                    layoutParams.setMarginStart((int) com.bytedance.common.utility.n.b(this.R, 0.0f));
                } else {
                    layoutParams.leftMargin = n.a(15.0d);
                    layoutParams.rightMargin = n.a(0.0d);
                    int i5 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart((int) com.bytedance.common.utility.n.b(this.R, 15.0f));
                    layoutParams.setMarginEnd((int) com.bytedance.common.utility.n.b(this.R, 0.0f));
                }
                this.f94465d.setLayoutParams(layoutParams);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(CharSequence charSequence) {
        try {
            if (ad.a()) {
                com.ss.android.ugc.aweme.framework.a.a.a(4, "VideoDescView", "VideoDescView_setDescSafely desc:".concat(String.valueOf(charSequence)));
            }
            if (f94462a) {
                String descLanguage = this.L.getDescLanguage();
                if (!f94463b || this.L.getContentDesc() == null || this.t == null || !charSequence.toString().contains("\n")) {
                    this.f94465d.a(charSequence, descLanguage);
                } else {
                    this.f94465d.a(this.t, descLanguage);
                }
            } else if (this.L.isAd()) {
                this.f94465d.setText(charSequence);
            } else {
                this.f94465d.a(charSequence, this.L.getDescLanguage());
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    public final void a(Aweme aweme, boolean z2) {
        List<TextExtraStruct> list;
        if (aweme != null) {
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            if (!(!z2 || aweme.getContentDesc() == null || aweme.getContentDescExtra() == null || (list = this.C) == null)) {
                textExtra = list;
            }
            if (!aweme.isScheduleVideo()) {
                this.f94465d.a(textExtra, new f(), new ci(this));
            }
            CommerceChallengeServiceImpl.e().a(this.f94465d, aweme, this.M);
            if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    if ((b(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (b(textExtraStruct) && this.w == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        d dVar = new d(this.R, (float) Math.round(((float) com.bytedance.common.utility.n.a(this.R)) - (com.bytedance.common.utility.n.b(this.R, 100.0f) + this.R.getResources().getDimension(R.dimen.g5))), androidx.core.content.b.c(this.R, R.color.a7), -1, textExtraStruct, false);
                        dVar.f73655b = com.bytedance.common.utility.n.b(this.R, 12.0f);
                        dVar.f73656c = com.bytedance.common.utility.n.b(this.R, 2.0f);
                        dVar.f73654a = com.bytedance.common.utility.n.b(this.R, 13.0f);
                        this.f94465d.a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        if (4 == textExtraStruct.getSubtype()) {
                            r.a("duet_with_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("music_id", ac.d(this.L)).f66730a);
                        }
                    }
                }
            }
            this.f94465d.setAdHashTag(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(TextExtraStruct textExtraStruct) {
        String str;
        String str2;
        String str3;
        if (textExtraStruct != null) {
            boolean z2 = false;
            String str4 = "";
            if (textExtraStruct.getType() == 1) {
                CommerceChallengeServiceImpl.e().a(textExtraStruct);
                if (CommerceChallengeServiceImpl.e().a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null) {
                    CommerceChallengeServiceImpl.e().b(this.M, textExtraStruct.getHashTagName());
                }
                String uuid = UUID.randomUUID().toString();
                if (MSAdaptionService.c().c(this.R)) {
                    SmartRouter.buildRoute(this.R, "//duo").withParam("duo_type", "duo_challenge").withParam("aweme_id", this.L.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("extra_challenge_from", this.M).open();
                } else {
                    com.bytedance.ies.watcher.c.a("cd_start_activity_to_request_net_duration");
                    com.bytedance.ies.watcher.c.a("cd_start_activity_to_show_header_duration");
                    com.bytedance.ies.watcher.c.a("cd_start_activity_to_show_list_duration");
                    SmartRouter.buildRoute(this.R, "//challenge/detail").withParam("aweme_id", this.L.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.M).open(10086);
                }
                r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(this.M).setValue(this.L.getAid()).setExtValueString(textExtraStruct.getCid()));
                g.a().d(this.R, this.L);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "challenge_click", this.L.getAwemeRawAd()).c();
                String searchResultId = FeedParamProvider.a.a(this.R).getSearchResultId();
                if (TextUtils.isEmpty(searchResultId)) {
                    searchResultId = ac.e(this.L);
                }
                if (this.L.getBottomBarModel() != null) {
                    z2 = true;
                }
                com.ss.android.ugc.aweme.metrics.r rVar = (com.ss.android.ugc.aweme.metrics.r) new com.ss.android.ugc.aweme.metrics.r().o(this.M).a(this.R);
                if (this.L.getAuthor() != null) {
                    str3 = this.L.getAuthor().getUid();
                } else {
                    str3 = str4;
                }
                rVar.p = str3;
                rVar.f109595e = this.L.getAid();
                com.ss.android.ugc.aweme.metrics.r f2 = rVar.g(this.L);
                f2.X = FeedParamProvider.a.a(this.R).getPreviousPage();
                f2.Y = FeedParamProvider.a.a(this.R).getPreviousPagePosition();
                f2.Z = z2;
                f2.r = uuid;
                f2.t = (String) this.Q.b("playlist_type", str4);
                f2.v = (String) this.Q.b("playlist_id", str4);
                f2.u = (String) this.Q.b("playlist_id_key", str4);
                com.ss.android.ugc.aweme.metrics.r rVar2 = (com.ss.android.ugc.aweme.metrics.r) f2.c((String) this.Q.b("tab_name", str4)).d(ac.b(this.L, this.P));
                rVar2.q = textExtraStruct.getCid();
                com.ss.android.ugc.aweme.metrics.r rVar3 = (com.ss.android.ugc.aweme.metrics.r) ((com.ss.android.ugc.aweme.metrics.r) rVar2.a("click_in_video_name")).p(ac.a(this.L, this.P)).f(searchResultId).l(FeedParamProvider.a.a(this.R).getSearchId());
                rVar3.ab = FeedParamProvider.a.a(this.R).getCategoryName();
                com.ss.android.ugc.aweme.metrics.c a2 = rVar3.a(w.a(this.L, "enter_tag_detail", this.M));
                com.ss.android.ugc.aweme.upvote.event.c.a(a2, this.L, this.M);
                a2.f();
                s.a(af.CHALLENGE);
            } else if (textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) && b(textExtraStruct) && this.L.getDesc().charAt(textExtraStruct.getStart()) == '@')) {
                if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                    if (this.L.getVideoReplyStruct() != null) {
                        VideoReplyStruct videoReplyStruct = this.L.getVideoReplyStruct();
                        String valueOf = videoReplyStruct.getAwemeId() != 0 ? String.valueOf(videoReplyStruct.getAwemeId()) : str4;
                        str = videoReplyStruct.getCommentId() != 0 ? String.valueOf(videoReplyStruct.getCommentId()) : str4;
                        if (videoReplyStruct.getAliasCommentId() != 0) {
                            str4 = String.valueOf(videoReplyStruct.getAliasCommentId());
                        }
                        str2 = str4;
                        str4 = valueOf;
                    } else {
                        str2 = str4;
                        str = str2;
                    }
                    if (2 == textExtraStruct.getSubtype()) {
                        r.a("click_comment_chain", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("to_group_id", str4).a("reply_comment_id", str).a("reply_user_id", textExtraStruct.getUserId()).f66730a);
                    }
                } else {
                    if (this.L.getAwemeType() == 51) {
                        r.a("click_duet_icon", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).a("chain_type", "duet").f66730a);
                    } else if (this.L.getAwemeType() == 52) {
                        r.a("click_react_icon", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                    } else if (this.L.getAwemeType() == 58) {
                        r.a("click_duet_icon", new com.ss.android.ugc.aweme.app.f.d().a("chain_type", "stitch").a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                    }
                    str2 = str4;
                    str = str2;
                }
                if (!p()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.de8).a();
                } else if (2 == textExtraStruct.getSubtype()) {
                    SmartRouter.buildRoute(this.R, "aweme://aweme/detail/").withParam("id", str4).withParam("refer", "click_comment_chain").withParam("cid", str + "," + str2).withParam("video_from", this.M).withParam("last_group_id", this.L.getAid()).open();
                } else if (7 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype()) {
                    boolean enableQaSticker = AVExternalServiceImpl.a().configService().avsettingsConfig().enableQaSticker();
                    List<InteractStickerStruct> interactStickerStructs = this.L.getInteractStickerStructs();
                    if (!enableQaSticker || interactStickerStructs == null || interactStickerStructs.isEmpty()) {
                        new com.bytedance.tux.g.b(this.E).e(R.string.f6n).b();
                        return;
                    }
                    Long l2 = 0L;
                    Iterator<InteractStickerStruct> it = interactStickerStructs.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InteractStickerStruct next = it.next();
                        if (next.getQaStruct() != null && next.getQaStruct().getQuestionId() != 0) {
                            l2 = Long.valueOf(next.getQaStruct().getQuestionId());
                            break;
                        }
                    }
                    if (l2.longValue() == 0) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(this.R).a(R.string.f6n).a();
                    } else {
                        SmartRouter.buildRoute(this.R, "aweme://qna/detail/").withParam("id", String.valueOf(l2)).withParam("extra_question_from", this.M).withParam("aweme_id", this.L.getAid()).withParam("qid", String.valueOf(l2)).withParam("enter_from", this.M).withParam("enter_method", "click_anchor").withParam("process_id", UUID.randomUUID().toString()).open();
                    }
                } else if (4 == textExtraStruct.getSubtype()) {
                    Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("music_id", ac.d(this.L)).a("anchor_type", "duet").f66730a;
                    r.a("enter_anchor_detail", map);
                    SmartRouter.buildRoute(this.R, "//duet/detail").withParam("id", this.L.getAid()).withParam("author_id", this.L.getAuthorUid()).withParam("origin_item_id", textExtraStruct.getAwemeId()).withParam("anchor_event_map", new HashMap(map)).open();
                } else {
                    SmartRouter.buildRoute(this.R, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.M).withParam("isChain", true).withParam("is_from_duet_chain", this.L.getAwemeType() == 51).open();
                }
            } else if (textExtraStruct.getType() != 5 || textExtraStruct.getSubtype() != 6 || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                r.a(StringSet.name, "video_at", this.L.getAid(), textExtraStruct.getUserId());
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("group_id", str4);
                    jSONObject.put("request_id", this.N.get("request_id"));
                    jSONObject.put("enter_from", this.M);
                    jSONObject.put("enter_method", "click_head");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                if (this.L.getAuthor() != null) {
                    r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(this.L.getAuthor().getUid()).setJsonObject(jSONObject));
                    String searchResultId2 = FeedParamProvider.a(this.R).getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId2)) {
                        searchResultId2 = ac.e(this.L);
                    }
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    if (textExtraStruct.getSubtype() == 11) {
                        dVar.a("is_from_bc_video", "1");
                    }
                    if (textExtraStruct.getUserId().equals(com.ss.android.ugc.aweme.account.b.g().getCurUserId())) {
                        r.a("self_mention_click", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).f66730a);
                    }
                    r.a("enter_personal_detail", dVar.a("enter_from", this.M).a("self_click", com.ss.android.ugc.aweme.account.b.g().getCurUserId().equals(textExtraStruct.getUserId()) ? 1 : 0).a("to_user_id", textExtraStruct.getUserId()).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("enter_method", "video_at").a("search_id", FeedParamProvider.a(this.R).getSearchId()).a("search_result_id", searchResultId2).a(this.L, "enter_personal_detail", this.M).f66730a);
                }
                SmartRouter.buildRoute(this.R, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.M).withParam("video_id", this.L.getAid()).open();
            } else if (!p()) {
                new com.bytedance.tux.g.b(this.f94465d).e(R.string.de8).b();
            } else {
                r.a("click_quote_icon", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("to_group_id", textExtraStruct.getAwemeId()).a("quote_type", "personal").f66730a);
                SmartRouter.buildRoute(this.R, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.M).withParam("isChain", true).withParam("is_from_duet_chain", this.L.getAwemeType() == 51).withParam("feed_param_extra", new HashMap(new com.ss.android.ugc.aweme.app.f.d().a("is_from_add_video_chain", "1").f66730a)).open();
            }
        }
    }

    private static boolean o() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object c() {
        r.a("video_title", a("show"));
        return null;
    }

    private static boolean p() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean o2 = o();
        j.f107229h = o2;
        return o2;
    }

    public final void b() {
        if (!j() && this.y != null) {
            g.c().a(this.R, this.L, 1, this.y);
        }
    }

    static {
        int i2;
        Covode.recordClassIndex(59988);
        if (!f94462a) {
            i2 = 12;
        } else if (q.d()) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 10;
        }
        f94464c = i2;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean k() {
        if (super.k()) {
            return true;
        }
        if (!br.a(this.L, 3) || !TextUtils.isEmpty(this.L.getAwemeRawAd().getWebUrl())) {
            return false;
        }
        return true;
    }

    private void q() {
        if (!f94463b || this.D == null || this.L.getContentDescExtra() == null) {
            this.C = null;
            return;
        }
        int length = this.D.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = this.D[i2].length();
        }
        List<TextExtraStruct> contentDescExtra = this.L.getContentDescExtra();
        ArrayList arrayList = new ArrayList();
        for (TextExtraStruct textExtraStruct : contentDescExtra) {
            int lineIndex = textExtraStruct.getLineIndex();
            int i3 = 0;
            for (int i4 = 0; i4 < lineIndex; i4++) {
                i3 += iArr[i4];
            }
            int start = textExtraStruct.getStart() + i3 + lineIndex;
            int end = (textExtraStruct.getEnd() + start) - textExtraStruct.getStart();
            TextExtraStruct clone = textExtraStruct.clone();
            clone.setStart(start);
            clone.setEnd(end);
            arrayList.add(clone);
        }
        this.C = arrayList;
    }

    private void r() {
        String contentDesc = this.L.getContentDesc();
        if (!f94463b || contentDesc == null) {
            this.t = null;
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(contentDesc);
            int length = jSONArray.length();
            String[] strArr = new String[length];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = jSONArray.get(i3).toString();
                i2 += strArr[i3].length();
            }
            this.v = length - 1;
            this.u = i2;
            if (length > 1) {
                this.t = new SpannableStringBuilder(TextUtils.join("\n", strArr));
                this.D = strArr;
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void e() {
        int i2;
        if (this.L.getTextExtra() != null && this.L.getTextExtra().size() > 0) {
            for (TextExtraStruct textExtraStruct : this.L.getTextExtra()) {
                if (textExtraStruct != null) {
                    if (textExtraStruct.getStart() < 0) {
                        textExtraStruct.setStart(0);
                    }
                    if (textExtraStruct.getEnd() > this.L.getDesc().length()) {
                        textExtraStruct.setEnd(this.L.getDesc().length());
                    }
                }
            }
        }
        if (this.R != null) {
            if (f94462a) {
                i2 = 550;
            } else {
                com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.L);
                i2 = 200;
            }
            this.f94465d.setMaxSize(i2);
            if (this.B) {
                this.f94465d.setSpanSize((float) n.c(14.0d));
            } else {
                this.f94465d.setSpanSize((float) n.c(15.0d));
            }
            MentionTextView mentionTextView = this.f94465d;
            mentionTextView.setSpanColor(mentionTextView.getCurrentTextColor());
            this.f94465d.setSpanStyle(1);
            this.f94465d.setOnSpanClickListener(new cl(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object d() {
        if (this.L != null && this.f94470i.f94434j == 2) {
            r.a("see_original_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("current_lang", SettingServiceImpl.v().h()).f66730a);
        } else if (this.L != null && this.f94470i.f94434j == 0) {
            r.a("see_translation_show", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("current_lang", this.L.getDescLanguage()).f66730a);
        }
        if (!MixFeedService.k().b(this.L) || this.L == null || this.L.getPlaylist_info() == null || this.M == null || this.M.equals("playlist")) {
            return null;
        }
        String mixId = this.L.getPlaylist_info().getMixId();
        com.ss.android.ugc.aweme.feed.param.b a2 = FeedParamProvider.a.a(this.R);
        MixFeedService.k().a(this.M, mixId, this.L.getGroupId(), this.L.getAuthorUid(), new com.ss.android.ugc.aweme.mix.e.b(a2.getPlaylistSearchId(), Integer.valueOf(a2.getIsFromVideo()), a2.getSearchType(), 0));
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(VideoItemParams videoItemParams) {
        super.a(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final int f(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        return super.f(bVar);
    }

    /* access modifiers changed from: package-private */
    public static class a extends bf {

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<cc> f94481c;

        /* renamed from: d  reason: collision with root package name */
        private SpannableStringBuilder f94482d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f94483e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f94484f;

        static {
            Covode.recordClassIndex(59991);
        }

        public final void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            cc ccVar = this.f94481c.get();
            if (ccVar == null) {
                return;
            }
            if (this.f94484f) {
                ccVar.b();
            } else {
                ccVar.a(this.f94482d, this.f94483e);
            }
        }

        a(cc ccVar, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            this.f94481c = new WeakReference<>(ccVar);
            this.f94482d = spannableStringBuilder;
            this.f94483e = z;
            this.f94484f = z2;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final boolean a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        return com.ss.android.ugc.aweme.feed.x.g.a(bVar, new cj(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(final Aweme aweme) {
        this.f94465d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.ugc.aweme.feed.ui.cc.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59989);
            }

            /* JADX WARNING: Removed duplicated region for block: B:106:0x03da  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x0142  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x01c5  */
            /* JADX WARNING: Removed duplicated region for block: B:54:0x021c  */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x028e A[SYNTHETIC, Splitter:B:64:0x028e] */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x02f4  */
            /* JADX WARNING: Removed duplicated region for block: B:82:0x0342  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onGlobalLayout() {
                /*
                // Method dump skipped, instructions count: 1020
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.cc.AnonymousClass1.onGlobalLayout():void");
            }
        });
    }

    static boolean a(Aweme aweme) {
        if (TextUtils.isEmpty(aweme.getDesc()) || com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
            return false;
        }
        return true;
    }

    public static int c(Aweme aweme) {
        if (f94462a) {
            return com.ss.android.ugc.aweme.feed.x.af.b();
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            return aweme.getAdDescMaxLines();
        }
        return com.ss.android.ugc.aweme.feed.x.af.b();
    }

    /* access modifiers changed from: package-private */
    public final Map<String, String> a(String str) {
        return new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.M).a("group_id", this.L.getAid()).a("author_id", this.L.getAuthorUid()).a("action_type", str).f66730a;
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(VideoItemParams videoItemParams) {
        super.b(videoItemParams);
        if (videoItemParams != null) {
            this.f94471j = videoItemParams.videoDescViewHost;
            this.y = videoItemParams.mAdOpenCallBack;
            new Handler(Looper.getMainLooper()).post(new ce(this, videoItemParams));
        }
    }

    private static InputFilter[] a(InputFilter[] inputFilterArr) {
        int length = inputFilterArr.length;
        if (inputFilterArr.length != 0) {
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (inputFilterArr[i3] instanceof InputFilter.LengthFilter) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            com.ss.android.ugc.aweme.framework.a.a.a(4, "VideoDescView", "descView,InputFilter size:".concat(String.valueOf(length)));
            if (i2 >= 0) {
                int i4 = length - 1;
                Object newInstance = Array.newInstance(InputFilter.class, i4);
                System.arraycopy(inputFilterArr, 0, newInstance, 0, i2);
                if (i2 < i4) {
                    System.arraycopy(inputFilterArr, i2 + 1, newInstance, i2, (length - i2) - 1);
                }
                InputFilter[] inputFilterArr2 = (InputFilter[]) newInstance;
                if (inputFilterArr2 != null) {
                    return inputFilterArr2;
                }
            }
        }
        com.ss.android.ugc.aweme.framework.a.a.a(4, "VideoDescView", "not find InputFilter.LengthFilter,size:".concat(String.valueOf(length)));
        return new InputFilter[0];
    }

    private boolean b(TextExtraStruct textExtraStruct) {
        if (this.L == null || this.L.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > this.L.getDesc().length() || textExtraStruct.getStart() >= this.L.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(com.ss.android.ugc.aweme.arch.widgets.base.b r5) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.cc.c(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void b(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        boolean z2;
        MethodCollector.i(8412);
        boolean z3 = true;
        if (!this.x) {
            View view = this.E;
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).addView(this.F);
                this.x = true;
            }
        }
        if (bVar == null) {
            MethodCollector.o(8412);
        } else if (((Map) bVar.a()).get("aweme_state") == null) {
            com.ss.android.ugc.aweme.framework.a.a.b(6, "VideoDescView", "desc Aweme null and content visible " + this.F.getVisibility());
            MethodCollector.o(8412);
        } else {
            Map map = (Map) bVar.a();
            Aweme aweme = (Aweme) map.get("aweme_state");
            this.f94466e.setVisibility(4);
            this.f94466e.setText(this.R.getString(R.string.bv8));
            if (this.B) {
                this.f94466e.setTextSize(14.0f);
            }
            this.f94465d.setMaxLines(c(aweme));
            a("");
            if (((Boolean) map.get("isShowVideoDesc")).booleanValue()) {
                this.S.setVisibility(0);
                a((CharSequence) map.get("desc"));
                z2 = true;
            } else {
                this.S.setVisibility(8);
                z2 = false;
            }
            this.f94470i.a(aweme);
            this.f94470i.o = false;
            if (((Boolean) map.get("isShowSplitVideoPartDescForFeed")).booleanValue()) {
                if (TextUtils.isEmpty(aweme.getDesc())) {
                    z2 = true;
                }
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) aweme.partN).append((CharSequence) " | ");
                append.append(this.f94465d.getText());
                a(append);
                this.S.setVisibility(0);
            }
            if (((Boolean) map.get("isShowMixDesNumForFeed")).booleanValue()) {
                if (!TextUtils.isEmpty(aweme.getDesc())) {
                    z3 = z2;
                }
                MixHelperService.a();
                this.S.setVisibility(0);
                z2 = z3;
            }
            if (z2) {
                if (f94462a) {
                    this.f94465d.scrollTo(0, 0);
                    this.f94469h.getLayoutParams().height = -2;
                }
                Aweme aweme2 = (Aweme) map.get("aweme_state");
                String str = (String) map.get("event_type_state");
                int intValue = ((Integer) map.get("page_type_state")).intValue();
                if (Build.VERSION.SDK_INT < 21) {
                    this.f94468g.post(new cm(this));
                }
                if (this.R != null) {
                    a(aweme2, false);
                    try {
                        if (gb.a(this.R)) {
                            if (f94462a) {
                                this.f94465d.setMovementMethod(j.a.a());
                            } else {
                                this.f94465d.setMovementMethod(i.a());
                            }
                        } else if (f94462a) {
                            this.f94465d.setMovementMethod(b.a.a());
                        } else {
                            this.f94465d.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
                        }
                    } catch (IndexOutOfBoundsException e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a("", e2);
                    }
                    if (CommerceChallengeServiceImpl.e().d()) {
                        this.f94465d.post(new cn(this, aweme2, str, intValue));
                        MethodCollector.o(8412);
                        return;
                    }
                    b(aweme2);
                }
            }
            MethodCollector.o(8412);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final com.ss.android.ugc.aweme.arch.widgets.base.b e(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        boolean z2;
        Boolean bool;
        if (bVar == null) {
            return null;
        }
        super.e(bVar);
        if (!bVar.f67014a.equals("video_params")) {
            return null;
        }
        HashMap hashMap = new HashMap();
        this.L = CommerceChallengeServiceImpl.e().a(this.L);
        Aweme aweme = this.L;
        hashMap.put("aweme_state", aweme);
        hashMap.put("isShowVideoDesc", Boolean.valueOf(a(this.L)));
        hashMap.put("event_type_state", this.M);
        hashMap.put("page_type_state", Integer.valueOf(this.P));
        r();
        q();
        if (this.L.getDesc() != null) {
            this.L.setCaptionLength(this.L.getDesc().length());
        }
        boolean z3 = false;
        this.f94472k = false;
        com.ss.android.ugc.aweme.framework.a.a.c(4, "VideoDescView", "start to bind aweme des");
        MentionTextView mentionTextView = this.f94465d;
        if (mentionTextView != null) {
            this.f94465d.setFilters(a(mentionTextView.getFilters()));
        }
        if (((Boolean) hashMap.get("isShowVideoDesc")).booleanValue()) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.L.getDesc());
            e();
            hashMap.put("desc", spannableStringBuilder);
        } else {
            com.ss.android.ugc.aweme.framework.a.a.b(4, "VideoDescView", "don't show desc,empty?" + TextUtils.isEmpty(this.L.getDesc()));
        }
        if (this.f94470i == null) {
            bv bvVar = new bv(this.R, this.f94467f, this.f94465d, this.f94466e, this.f94469h);
            this.f94470i = bvVar;
            bvVar.a(this.M, this.P);
        }
        this.f94468g.setOnClickListener(new ck(this));
        if (aweme == null || TextUtils.isEmpty(aweme.partN)) {
            z2 = false;
        } else {
            z2 = true;
        }
        hashMap.put("isShowSplitVideoPartDescForFeed", Boolean.valueOf(z2));
        if (z2 && TextUtils.isEmpty(this.L.getDesc())) {
            e();
        }
        if (!FeedParamProvider.a(this.R).isHotSpot()) {
            MixHelperService.a();
        }
        hashMap.put("isShowMixDesNumForFeed", false);
        if (MixFeedService.k().b(this.L)) {
            Aweme aweme2 = this.L;
            if (aweme2 == null || aweme2.getStatus() == null) {
                bool = false;
            } else {
                if (aweme2.getStatus().getPrivateStatus() == 0) {
                    z3 = true;
                }
                bool = Boolean.valueOf(z3);
            }
            if (bool.booleanValue() && TextUtils.isEmpty(this.L.getDesc())) {
                e();
            }
        }
        return new com.ss.android.ugc.aweme.arch.widgets.base.b("uistate", hashMap);
    }

    @Override // com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a
    public final void a(View view) {
        this.E = view;
        View a2 = com.a.b.c.a((Activity) this.R, (int) R.layout.t1);
        this.F = a2;
        MentionTextView mentionTextView = (MentionTextView) a2.findViewById(R.id.ak7);
        this.f94465d = mentionTextView;
        if (mentionTextView == null) {
            a2 = e.a(getClass().getName(), a2, this.R, R.layout.t1);
        }
        if (this.B) {
            this.f94465d.setFontSize(5);
        }
        TextView textView = (TextView) a2.findViewById(R.id.f9q);
        this.f94466e = textView;
        textView.setTextSize(15.0f);
        this.f94466e.setOnClickListener(new cd(this));
        this.s = (TextView) a2.findViewById(R.id.dch);
        this.r = (TuxTag) a2.findViewById(R.id.epz);
        this.f94467f = (TranslationStatusView) a2.findViewById(R.id.eqo);
        this.f94469h = (FrameLayout) a2.findViewById(R.id.akd);
        this.f94468g = (LinearLayout) a2.findViewById(R.id.ako);
    }

    public cc(View view, boolean z2) {
        super(view, z2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0188, code lost:
        if (r10 != false) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.text.SpannableStringBuilder r9, final boolean r10) {
        /*
        // Method dump skipped, instructions count: 411
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.cc.a(android.text.SpannableStringBuilder, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z2, boolean z3) {
        a aVar = new a(this, spannableStringBuilder2, z2, z3);
        aVar.f94343a = 0;
        spannableStringBuilder.setSpan(aVar, 0, spannableStringBuilder.length(), 17);
    }

    public final int a(CharSequence charSequence, String str, int i2, int i3, int i4) {
        float f2;
        try {
            float measureText = this.f94466e.getPaint().measureText(str);
            int width = this.f94465d.getWidth();
            float measureText2 = this.f94465d.getPaint().measureText(charSequence, i3, i4);
            if (this.B) {
                f2 = this.f94465d.getPaint().measureText("...", 0, 3);
            } else {
                f2 = 0.0f;
            }
            float f3 = ((measureText2 + measureText) + f2) - ((float) width);
            if (f3 <= 0.0f) {
                return 0;
            }
            int i5 = (i4 - i3) + 1;
            for (int i6 = 1; i6 <= i5; i6++) {
                if (this.f94465d.getPaint().measureText(charSequence, i4 - i6, i4) >= f3) {
                    return i6;
                }
            }
            return i2 + 1;
        } catch (Exception unused) {
            return i2;
        }
    }
}
