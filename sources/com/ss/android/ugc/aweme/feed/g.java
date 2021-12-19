package com.ss.android.ugc.aweme.feed;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.f.b;
import com.ss.android.ugc.aweme.comment.f.d;
import com.ss.android.ugc.aweme.comment.i.c;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.favorites.ui.r;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.n.e;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.u.o;
import com.ss.android.ugc.aweme.feed.u.p;
import com.ss.android.ugc.aweme.feed.ui.j;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.im.service.c.k;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.mix.api.f;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.cg;
import com.ss.android.ugc.aweme.share.af;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.utils.z;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

public final class g extends e implements b, f {

    /* renamed from: a  reason: collision with root package name */
    public p f93160a;

    /* renamed from: k  reason: collision with root package name */
    private s<ag> f93161k;

    /* renamed from: l  reason: collision with root package name */
    private e f93162l;

    /* renamed from: m  reason: collision with root package name */
    private Dialog f93163m;
    private String n;
    private String o;
    private String p;
    private String q;
    private String r = "";

    static {
        Covode.recordClassIndex(59098);
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final Activity c() {
        return this.f92897b;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final Context d() {
        return this.f92897b;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final Fragment e() {
        return this.f92898c;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final String f() {
        return this.f92901f;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void b() {
        super.b();
        p pVar = this.f93160a;
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.q
    public final void g() {
        Dialog dialog = this.f93163m;
        if (dialog != null && dialog.isShowing()) {
            this.f93163m.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e
    public final void a() {
        p pVar = new p(this.f92897b);
        this.f93160a = pVar;
        pVar.a(new o());
        try {
            i i2 = i();
            Fragment a2 = i2.a(UGCMonitor.EVENT_COMMENT);
            if (a2 != null) {
                n a3 = i2.a();
                a3.a(a2);
                a3.b();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.e
    public final void a(String str) {
        this.r = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.e.d
    public final void b(String str) {
        this.f92901f = str;
    }

    private JSONObject c(Aweme aweme) {
        return a(RequestIdService.a().b(aweme, this.f92900e), aweme);
    }

    private static int a(Aweme aweme) {
        if (z.c(aweme)) {
            return 2;
        }
        if (aweme.getAuthor().isSecret()) {
            return 1;
        }
        return -1;
    }

    private void d(Aweme aweme) {
        Activity activity = this.f92897b;
        if (activity != null && !activity.isFinishing() && (activity instanceof androidx.fragment.app.e)) {
            r.a.a((androidx.fragment.app.e) activity, aweme, this.f92899d);
        }
    }

    private static boolean b(Aweme aweme) {
        boolean z;
        boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().c().booleanValue();
        boolean d2 = z.d(aweme);
        if (aweme.getAuthor() == null || !m.a(com.ss.android.ugc.aweme.account.b.g().getCurUserId(), aweme.getAuthor().getUid())) {
            z = false;
        } else {
            z = true;
        }
        if (!booleanValue || !d2 || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.b
    public final void a(c cVar) {
        String str;
        com.ss.android.ugc.aweme.commercialize.model.s aid;
        long commentCount;
        String e2;
        Aweme aweme = cVar.f71987a;
        if (aweme != null) {
            if (this.f92897b == null) {
                com.ss.android.ugc.aweme.comment.a.e.b("getActivity() is null");
                return;
            }
            boolean z = true;
            if (!ac.h(aweme) || !aweme.isProhibited()) {
                h requestId = new h(aweme.getAid()).setRequestId(c(aweme).optString("request_id"));
                if (aweme.getAuthor() != null) {
                    str = aweme.getAuthor().getUid();
                } else {
                    str = "";
                }
                h enableComment = ((h) requestId.setAuthorUid(str)).setEventType(this.f92899d).setSource(0).setMyProfile(this.f92903h).setPlayListId(this.p).setPlayListIdKey(this.o).setPlayListType(this.n).setPageType(this.f92900e).setTabName(this.q).setEnableComment(!aweme.isCmtSwt());
                if (aweme.getAdCommentStruct() == null) {
                    aid = null;
                } else {
                    aid = aweme.getAdCommentStruct().setAid(aweme.getAid());
                }
                h commentClose = enableComment.setAdCommentStruct(aid).setCommentClose(CommentServiceImpl.e().c(aweme));
                if (CommentServiceImpl.e().c(aweme) || CommentServiceImpl.e().b(aweme)) {
                    z = false;
                }
                h isLongItem = commentClose.setCommentLimited(z).setForceHideKeyboard(cVar.f71991e).forceRefresh(cVar.f71993g).setScrollToTop(cVar.f71989c).setCreationId(cVar.n).setIsLongItem(0);
                if (aweme.getStatistics() == null) {
                    commentCount = 0;
                } else {
                    commentCount = aweme.getStatistics().getCommentCount();
                }
                h newsId = isLongItem.setCommentCount(commentCount).setSearchId(FeedParamProvider.a.a(this.f92897b).getSearchId()).setNeedAutoLikeComment(cVar.A).setNeedShowReplyPanel(cVar.B).setSearchResultId(FeedParamProvider.a.a(this.f92897b).getSearchResultId()).setLocatePageType(cVar.r).setEnterMethod(cVar.f71994h).setCommentEnterMethod(this.f92899d).setLastGroupId(FeedParamProvider.a.a(this.f92897b).getLastGroupId()).setPreviousPage(this.f92904i).setFromGroupId(this.f92905j).setNewsId(FeedParamProvider.a.a(this.f92897b).getNewsId());
                if (!TextUtils.isEmpty(cVar.f71988b)) {
                    newsId.setInsertCids(cVar.f71988b, cVar.f71990d, cVar.f71992f);
                }
                if (!TextUtils.isEmpty(cVar.C)) {
                    newsId.setInsertVid(cVar.C);
                }
                if (!TextUtils.isEmpty(cVar.s)) {
                    newsId.setInsertLikeUserIds(cVar.s);
                    newsId.setLikeUserCount(cVar.t);
                }
                if (TextUtils.equals("click_comment_chain", this.f92899d)) {
                    newsId.setEnterMethod(this.f92901f);
                }
                if (!TextUtils.isEmpty(cVar.w)) {
                    newsId.setSearchId(cVar.w);
                }
                if (TextUtils.equals("click_comment_icon", cVar.f71994h) && TextUtils.equals("challenge", this.f92899d)) {
                    newsId.setTagId(cVar.y);
                    newsId.setParentTagId(cVar.z);
                }
                if (!TextUtils.isEmpty(cVar.x)) {
                    e2 = cVar.x;
                } else {
                    e2 = ac.e(aweme);
                }
                newsId.setSearchResultId(e2);
                d a2 = CommentServiceImpl.e().a(this.f92897b, aweme, newsId);
                if (a2 != null) {
                    if (!a2.isAdded() && aweme.getAuthor() != null && aweme.isCmtSwt()) {
                        if (aweme.getAuthor().isAdFake() || aweme.isAd()) {
                            a.b("CommentForbidRight", " aweme id = " + aweme.getAid() + " author id = " + aweme.getAuthorUid() + " current uid = " + com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                        } else {
                            a.b("CommentForbidError", " aweme id = " + aweme.getAid() + " author id = " + aweme.getAuthorUid() + " current uid = " + com.ss.android.ugc.aweme.account.b.g().getCurUserId());
                        }
                    }
                    a2.a(new h(this, aweme));
                    return;
                }
                return;
            }
            new com.bytedance.tux.g.b(this.f92897b).e(R.string.a9_).b();
        }
    }

    private JSONObject a(JSONObject jSONObject, Aweme aweme) {
        boolean z;
        if (this.f92902g != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("enter_from", this.f92899d);
                if ("like_banner".equals(this.f92902g)) {
                    jSONObject.put("previous_page", this.f92902g);
                } else {
                    jSONObject.put("enter_method", this.f92902g);
                }
                if (aweme == null || aweme.getAwemeType() != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    jSONObject.put("is_photo", 1);
                } else {
                    jSONObject.put("is_photo", 0);
                }
                jSONObject.put("author_id", aweme.getAuthorUid());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(final Aweme aweme, ag agVar) {
        if (agVar.f93450a == 20) {
            this.f93160a.a(aweme, 0);
            if (aweme.getStatus() == null || aweme.getStatus().isPrivate()) {
                String uid = com.ss.android.ugc.aweme.account.b.g().getCurUser().getUid();
                User author = aweme.getAuthor();
                if (author != null && TextUtils.equals(author.getUid(), uid)) {
                    new a.C0731a(this.f92897b).b(R.string.evi).b(R.string.a9e, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.feed.g.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(59100);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            com.ss.android.ugc.aweme.common.r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                        }
                    }, false).a(R.string.cui, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.feed.g.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(59099);
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            g.this.f93160a.a(aweme.getAid(), 1);
                            com.ss.android.ugc.aweme.common.r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                        }
                    }, false).a().b();
                }
            }
        }
        if (!TextUtils.equals("homepage_follow", this.f92899d)) {
            CommentServiceImpl.e().a(this.f92899d, aweme, c(aweme), ForwardStatisticsServiceImpl.b().a());
        }
    }

    private void c(Activity activity, Aweme aweme, af afVar) {
        Bundle bundle = new Bundle();
        bundle.putString("play_list_type", this.n);
        bundle.putString("play_list_id_key", this.o);
        bundle.putString("play_list_id_value", this.p);
        bundle.putString("play_list_id", this.p);
        bundle.putString("play_list_type", this.n);
        bundle.putString("play_list_id_key", this.o);
        bundle.putString("tab_name", this.q);
        bundle.putString("event_type", this.f93162l.a_(true));
        bundle.putString("enter_method", this.f92902g);
        bundle.putInt("share_im_limit_tip_type", a(aweme));
        bundle.putString("author_user_name", aweme.getAuthor().getUniqueId());
        bundle.putString("creation_id", this.r);
        bundle.putString("previousPage", FeedParamProvider.a.a(this.f92897b).getPreviousPage());
        bundle.putString("previousPagePosition", FeedParamProvider.a.a(this.f92897b).getPreviousPagePosition());
        bundle.putString("category_name", FeedParamProvider.a.a(this.f92897b).getCategoryName());
        if (afVar != null) {
            afVar.a(bundle);
        }
        this.f93163m = ah.f123352a.a(activity, this.f92898c, aweme, b(aweme), this.f93161k, bundle);
    }

    @Override // com.ss.android.ugc.aweme.share.q
    public final void a(Activity activity, Aweme aweme, af afVar) {
        Activity activity2 = activity;
        if (activity2 == null) {
            activity2 = this.f92897b;
        }
        if (activity2 != null && !activity2.isFinishing() && aweme.getVideo() != null) {
            if (k.c()) {
                if (com.ss.android.ugc.aweme.feed.share.a.a(aweme)) {
                    new com.bytedance.tux.g.b(activity2).e(R.string.a_0).b();
                } else {
                    c(activity2, aweme, afVar);
                }
            } else if (com.ss.android.ugc.aweme.favorites.i.b.a(aweme, this.f92899d)) {
                d(aweme);
            } else if ((!ac.h(aweme) || !aweme.isProhibited()) && !com.ss.android.ugc.aweme.login.b.a.b(aweme)) {
                if (b(aweme)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("play_list_type", this.n);
                    bundle.putString("play_list_id_key", this.o);
                    bundle.putString("play_list_id_value", this.p);
                    bundle.putString("play_list_id", this.p);
                    bundle.putString("play_list_type", this.n);
                    bundle.putString("play_list_id_key", this.o);
                    bundle.putString("tab_name", this.q);
                    bundle.putString("event_type", this.f93162l.a_(true));
                    bundle.putString("enter_method", this.f92902g);
                    if (afVar != null) {
                        afVar.a(bundle);
                    }
                    this.f93163m = ah.f123352a.a(activity2, this.f92898c, aweme, this.f93161k, bundle);
                    return;
                }
                com.ss.android.ugc.aweme.cc.c.a("share_panel");
                c(activity2, aweme, afVar);
            } else if (activity2 instanceof androidx.fragment.app.e) {
                j.a.a((androidx.fragment.app.e) activity2, aweme, this.f93161k);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.q
    public final void b(Activity activity, Aweme aweme, af afVar) {
        Activity activity2 = activity;
        if (activity2 == null) {
            activity2 = this.f92897b;
        }
        if (activity2 != null && !activity2.isFinishing()) {
            if (com.ss.android.ugc.aweme.favorites.i.b.a(aweme, this.f92899d)) {
                d(aweme);
            } else if ((!ac.h(aweme) || !aweme.isProhibited()) && !com.ss.android.ugc.aweme.login.b.a.b(aweme)) {
                Bundle bundle = new Bundle();
                bundle.putString("play_list_type", this.n);
                bundle.putString("play_list_id_key", this.o);
                bundle.putString("play_list_id_value", this.p);
                bundle.putString("play_list_id", this.p);
                bundle.putString("play_list_type", this.n);
                bundle.putString("play_list_id_key", this.o);
                bundle.putString("tab_name", this.q);
                bundle.putString("event_type", this.f93162l.a_(true));
                bundle.putString("enter_method", this.f92902g);
                bundle.putString("creation_id", this.r);
                if (afVar != null) {
                    afVar.a(bundle);
                }
                this.f93163m = ah.f123352a.b(activity2, this.f92898c, aweme, this.f93161k, bundle);
            } else if (activity2 instanceof androidx.fragment.app.e) {
                j.a.a((androidx.fragment.app.e) activity2, aweme, this.f93161k);
            }
        }
    }

    public g(String str, int i2, s<ag> sVar, e eVar) {
        super(str, i2);
        this.f93161k = sVar;
        this.f93162l = eVar;
        cg.a();
    }

    @Override // com.ss.android.ugc.aweme.mix.api.f
    public final void a(Activity activity, Aweme aweme, com.ss.android.ugc.aweme.mix.api.a aVar, String str, String str2) {
        MixFeedService.k().a(activity, aweme, aVar, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.mix.api.f
    public final void a(Activity activity, Aweme aweme, String str, String str2, String str3, String str4) {
        MixFeedService.k().a(activity, aweme, str, str2, str3, str4);
    }
}
