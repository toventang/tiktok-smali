package com.ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;
import com.ss.android.ugc.aweme.commerce.model.e;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.commercialize.link.a.a;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.miniapp_api.model.b.a;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.miniapp_api.services.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class CommentHeaderWidget extends BaseCommentWidget implements View.OnClickListener, au {
    private static final a C = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ i[] f73051i = {new y(CommentHeaderWidget.class, "mLinkTag", "getMLinkTag()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mLinkIcon", "getMLinkIcon()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new y(CommentHeaderWidget.class, "mLinkTitle", "getMLinkTitle()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mLinkAdTag", "getMLinkAdTag()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mLinkAdTagDivider", "getMLinkAdTagDivider()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mLinkDesc", "getMLinkDesc()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mCommerceArea", "getMCommerceArea()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mCommerceLogo", "getMCommerceLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new y(CommentHeaderWidget.class, "mCommerceTitle", "getMCommerceTitle()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mCommerceDescriptionLayout", "getMCommerceDescriptionLayout()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mCommercePrice", "getMCommercePrice()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mCommerceBottomDivider", "getMCommerceBottomDivider()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mCommerceSales", "getMCommerceSales()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mCommerceBottomDivider2", "getMCommerceBottomDivider2()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mPosCouponText", "getMPosCouponText()Landroid/widget/TextView;", 0), new y(CommentHeaderWidget.class, "mCommerceDivider", "getMCommerceDivider()Landroid/view/View;", 0), new y(CommentHeaderWidget.class, "mCommerceLogoRight", "getMCommerceLogoRight()Landroid/widget/ImageView;", 0)};
    private final BaseCommentWidget.a A = a((int) R.id.abg);
    private h.f.a.b<? super View, z> B = b.f73056a;

    /* renamed from: j  reason: collision with root package name */
    public final h.f.a.a<z> f73052j;

    /* renamed from: k  reason: collision with root package name */
    private final BaseCommentWidget.a f73053k = a((int) R.id.caz);

    /* renamed from: l  reason: collision with root package name */
    private final BaseCommentWidget.a f73054l = a((int) R.id.caw);

    /* renamed from: m  reason: collision with root package name */
    private final BaseCommentWidget.a f73055m = a((int) R.id.cb0);
    private final BaseCommentWidget.a n = a((int) R.id.gm);
    private final BaseCommentWidget.a o = a((int) R.id.go);
    private final BaseCommentWidget.a p = a((int) R.id.cav);
    private final BaseCommentWidget.a q = a((int) R.id.aav);
    private final BaseCommentWidget.a r = a((int) R.id.abf);
    private final BaseCommentWidget.a s = a((int) R.id.abt);
    private final BaseCommentWidget.a t = a((int) R.id.c59);
    private final BaseCommentWidget.a u = a((int) R.id.abi);
    private final BaseCommentWidget.a v = a((int) R.id.aax);
    private final BaseCommentWidget.a w = a((int) R.id.abj);
    private final BaseCommentWidget.a x = a((int) R.id.aay);
    private final BaseCommentWidget.a y = a((int) R.id.ag_);
    private final BaseCommentWidget.a z = a((int) R.id.ab6);

    static {
        Covode.recordClassIndex(44993);
    }

    private final TextView A() {
        return (TextView) this.y.a(this, f73051i[14]);
    }

    private final View o() {
        return this.f73053k.a(this, f73051i[0]);
    }

    private final RemoteImageView p() {
        return (RemoteImageView) this.f73054l.a(this, f73051i[1]);
    }

    private final TextView q() {
        return (TextView) this.n.a(this, f73051i[3]);
    }

    private final View r() {
        return this.o.a(this, f73051i[4]);
    }

    private final View s() {
        return this.q.a(this, f73051i[6]);
    }

    private final RemoteImageView t() {
        return (RemoteImageView) this.r.a(this, f73051i[7]);
    }

    private final TextView u() {
        return (TextView) this.s.a(this, f73051i[8]);
    }

    private final View v() {
        return this.t.a(this, f73051i[9]);
    }

    private final TextView w() {
        return (TextView) this.u.a(this, f73051i[10]);
    }

    private final View x() {
        return this.v.a(this, f73051i[11]);
    }

    private final TextView y() {
        return (TextView) this.w.a(this, f73051i[12]);
    }

    private final View z() {
        return this.x.a(this, f73051i[13]);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int c() {
        return R.layout.bkl;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static final class a {
        static {
            Covode.recordClassIndex(44994);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void k() {
        o().setOnClickListener(this);
        s().setOnClickListener(this);
    }

    private final boolean l() {
        if (!f() || !com.ss.android.ugc.aweme.commercialize.link.b.a("company_link", e(), true) || bh.a(e()) == null) {
            return false;
        }
        return true;
    }

    private final boolean m() {
        if (!f() || !com.ss.android.ugc.aweme.commercialize.link.b.a(e(), true, 4) || e().getMicroAppInfo() == null) {
            return false;
        }
        return true;
    }

    private final boolean n() {
        if (!f() || !com.ss.android.ugc.aweme.commercialize.link.b.a("shopping_cart", e(), true) || e().getPromotion() == null) {
            return false;
        }
        return true;
    }

    static final class b extends h.f.b.m implements h.f.a.b<View, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73056a = new b();

        static {
            Covode.recordClassIndex(44995);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            l.d(view, "");
            return z.f158842a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    private final boolean a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1648893033) {
            if (hashCode == -309942941 && str.equals("iron_man")) {
                return m();
            }
            return false;
        } else if (str.equals("shopping_cart")) {
            return n();
        } else {
            return false;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ CommentHeaderWidget this$0;

        static {
            Covode.recordClassIndex(44996);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(CommentHeaderWidget commentHeaderWidget) {
            super(1);
            this.this$0 = commentHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            l.d(view, "");
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.X(this.this$0.e())) {
                Context context = this.this$0.f67007b;
                Aweme e2 = this.this$0.e();
                String str2 = "comment_first_ad";
                if (TextUtils.equals(this.this$0.i(), "general_search")) {
                    str = str2;
                } else {
                    str = null;
                }
                JSONObject a2 = j.a(context, e2, false, (Map<String, String>) j.c(e2));
                try {
                    a2.put("refer", str);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                j.a(context, "comment_ad", "click_product", e2, a2);
                a.C0791a a3 = com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "click_product", this.this$0.e().getAwemeRawAd());
                if (!TextUtils.equals(this.this$0.i(), "general_search")) {
                    str2 = null;
                }
                a3.b("refer", str2).c();
            } else if (com.ss.android.ugc.aweme.commercialize.e.a.b.W(this.this$0.e()) || com.ss.android.ugc.aweme.commercialize.e.a.b.Y(this.this$0.e())) {
                Context context2 = this.this$0.f67007b;
                Aweme e4 = this.this$0.e();
                JSONObject a4 = j.a(context2, e4, true, (Map<String, String>) j.c(e4));
                try {
                    a4.put("refer", "cart");
                } catch (JSONException unused) {
                }
                j.a(context2, "comment_ad", "click", e4, a4);
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(e4)) {
                    AwemeRawAd awemeRawAd = e4.getAwemeRawAd();
                    aj.a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new com.ss.android.ugc.aweme.commercialize.log.z(awemeRawAd));
                }
            }
            return z.f158842a;
        }
    }

    public CommentHeaderWidget(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.f73052j = aVar;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.caz) {
                ac a2 = bh.a(e());
                j.a(this.f67007b, new a.C1683a().a("click").a(a2).a(e()).a(true).a());
                w.a(this.f67007b, a2, e(), true);
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.X(e())) {
                    j.a(this.f67007b, a2, e(), true);
                }
                if (l() && com.ss.android.ugc.aweme.commercialize.e.a.b.Z(e())) {
                    Context context = this.f67007b;
                    Aweme e2 = e();
                    JSONObject a3 = j.a(context, e2, false, (Map<String, String>) null);
                    if (!TextUtils.isEmpty("common_link")) {
                        try {
                            a3.put("refer", "common_link");
                        } catch (JSONException unused) {
                        }
                    }
                    if (j.z(context, e2)) {
                        j.a(context, "comment_ad", "otherclick", a3, e2.getAwemeRawAd());
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "otherclick", e().getAwemeRawAd()).b("refer", "common_link").c();
                }
            } else if (valueOf.intValue() == R.id.aav) {
                this.B.invoke(view);
            }
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.miniapp_api.model.b $microAppInfo;
        final /* synthetic */ IMiniAppService $miniService;
        final /* synthetic */ CommentHeaderWidget this$0;

        static {
            Covode.recordClassIndex(44997);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CommentHeaderWidget commentHeaderWidget, IMiniAppService iMiniAppService, com.ss.android.ugc.aweme.miniapp_api.model.b bVar) {
            super(1);
            this.this$0 = commentHeaderWidget;
            this.$miniService = iMiniAppService;
            this.$microAppInfo = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            String str;
            String str2;
            l.d(view, "");
            a.C2810a aVar = new a.C2810a();
            aVar.f109680b = this.this$0.h();
            aVar.f109679a = "comment_page";
            aVar.f109683e = this.this$0.e().getAid();
            aVar.f109681c = "023002";
            if (this.$miniService.openMiniApp(this.this$0.f67007b, com.ss.android.ugc.aweme.miniapp_api.d.a(this.$microAppInfo), aVar.a())) {
                this.this$0.f73052j.invoke();
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.this$0.h()).a("position", "comment_top").a("group_id", this.this$0.e().getAid()).a("author_id", this.this$0.e().getAuthorUid());
            if (this.$microAppInfo.isApp()) {
                str = "micro_app";
            } else {
                str = "micro_game";
            }
            r.a("mp_click", a2.a("_param_for_special", str).a("mp_id", this.$microAppInfo.getAppId()).f66730a);
            if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(this.this$0.e())) {
                Context context = this.this$0.f67007b;
                Aweme e2 = this.this$0.e();
                String str3 = "comment_first_ad";
                if (TextUtils.equals(this.this$0.i(), "general_search")) {
                    str2 = str3;
                } else {
                    str2 = null;
                }
                JSONObject a3 = j.a(context, e2, false, (Map<String, String>) null);
                try {
                    a3.put("refer", str2);
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
                j.a(context, "comment_ad", "applet_click", e2, a3);
                a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_ad", "applet_click", this.this$0.e().getAwemeRawAd());
                if (!TextUtils.equals(this.this$0.i(), "general_search")) {
                    str3 = null;
                }
                a4.b("refer", str3).c();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        e promotion;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.onChanged(bVar);
        if (bVar != null) {
            String str6 = bVar.f67014a;
            if (str6.hashCode() == 2016314694 && str6.equals("comment_aweme_and_params") && f() && g() && f()) {
                a(v());
                BaseCommentWidget.a aVar = this.z;
                h.k.i<?>[] iVarArr = f73051i;
                b(s(), w(), x(), y(), z(), aVar.a(this, iVarArr[15]), (ImageView) this.A.a(this, iVarArr[16]), A(), o(), q(), r());
                if (l()) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.ae(e())) {
                        b(o());
                    } else {
                        ac a2 = bh.a(e());
                        if (a2 != null) {
                            a(o());
                            TextView textView = (TextView) this.f73055m.a(this, iVarArr[2]);
                            ac.a aVar2 = a2.commentArea;
                            if (aVar2 == null || (str4 = aVar2.title) == null) {
                                str4 = "";
                            }
                            textView.setText(str4);
                            TextView textView2 = (TextView) this.p.a(this, iVarArr[5]);
                            ac.a aVar3 = a2.commentArea;
                            if (aVar3 == null || (str5 = aVar3.featureLabel) == null) {
                                str5 = "";
                            }
                            textView2.setText(str5);
                            ((com.facebook.drawee.f.a) p().getHierarchy()).d(R.color.f159926j);
                            String str7 = a2.label;
                            if (str7 == null || str7.length() == 0) {
                                b(q(), r());
                            } else {
                                q().setText(a2.label);
                                a(q(), r());
                            }
                            com.ss.android.ugc.aweme.base.e.a(p(), a2.getCommentAvatarIcon());
                            j.a(this.f67007b, new a.C1683a().a("comment_show").a(a2).a(e()).a(true).a());
                        }
                    }
                } else if (a("iron_man")) {
                    com.ss.android.ugc.aweme.miniapp_api.model.b microAppInfo = e().getMicroAppInfo();
                    if (microAppInfo != null) {
                        a(s(), w());
                        TextView u2 = u();
                        String title = microAppInfo.getTitle();
                        if (title == null || title.length() == 0) {
                            str = microAppInfo.getName();
                        } else {
                            str = microAppInfo.getTitle();
                        }
                        u2.setText(str);
                        int type = microAppInfo.getType();
                        if (type == 1) {
                            t().setImageURI(new Uri.Builder().scheme("res").path("2131232649").build());
                        } else if (type == 2) {
                            t().setImageURI(new Uri.Builder().scheme("res").path("2131232652").build());
                        } else if (type == 3) {
                            com.ss.android.ugc.aweme.base.e.a(t(), 2131232651);
                        }
                        TextView w2 = w();
                        String desc = microAppInfo.getDesc();
                        if (desc != null && desc.length() != 0) {
                            str2 = microAppInfo.getDesc();
                        } else if (microAppInfo.isApp()) {
                            str2 = "";
                        } else {
                            str2 = this.f67007b.getString(R.string.d4h);
                            l.b(str2, "");
                        }
                        w2.setText(str2);
                        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", h()).a("position", "comment_top").a("group_id", e().getAid()).a("author_id", e().getAuthorUid()).a("mp_id", microAppInfo.getAppId());
                        if (microAppInfo.isApp()) {
                            str3 = "micro_app";
                        } else {
                            str3 = "micro_game";
                        }
                        r.a("mp_show", a3.a("_param_for_special", str3).f66730a);
                        com.ss.android.ugc.aweme.miniapp_api.services.c cVar = c.a.f109704a;
                        l.b(cVar, "");
                        this.B = new d(this, cVar.a(), microAppInfo);
                    }
                } else if (a("shopping_cart") && (promotion = e().getPromotion()) != null) {
                    l.b(promotion, "");
                    a(w(), s());
                    w().setText(promotion.getCommentArea());
                    t().setImageURI(new Uri.Builder().scheme("res").path("2131232535").build());
                    u().setText(promotion.getShortTitle());
                    this.B = new c(this);
                    Context context = w().getContext();
                    l.b(context, "");
                    String fromGroupId = FeedParamProvider.a.a(context).getFromGroupId();
                    Context context2 = w().getContext();
                    l.b(context2, "");
                    String referCommodityId = FeedParamProvider.a.a(context2).getReferCommodityId();
                    Long a4 = com.ss.android.ugc.aweme.commerce.d.a.a(j());
                    String a5 = com.ss.android.ugc.aweme.commerce.d.a.a(e(), j());
                    ICommerceService a6 = com.ss.android.ugc.aweme.commerce.service.a.a();
                    com.ss.android.ugc.aweme.commerce.service.a.a aVar4 = new com.ss.android.ugc.aweme.commerce.service.a.a();
                    aVar4.f73499d = e().getAuthorUid();
                    aVar4.f73505j = "comment_cart_tag";
                    aVar4.f73502g = promotion.getPromotionId();
                    aVar4.f73503h = Long.valueOf((long) promotion.getPromotionSource());
                    aVar4.f73501f = fromGroupId;
                    aVar4.f73507l = referCommodityId;
                    aVar4.f73497b = i();
                    aVar4.f73498c = e().getAid();
                    aVar4.I = Integer.valueOf(e().getFollowStatus());
                    aVar4.s = a4;
                    aVar4.t = a5;
                    a6.logCommerceEvents("product_entrance_show", aVar4);
                    ICommerceService a7 = com.ss.android.ugc.aweme.commerce.service.a.a();
                    com.ss.android.ugc.aweme.commerce.service.a.a aVar5 = new com.ss.android.ugc.aweme.commerce.service.a.a();
                    aVar5.f73499d = e().getAuthorUid();
                    aVar5.f73505j = "comment_cart_tag";
                    aVar5.f73502g = promotion.getPromotionId();
                    aVar5.f73503h = Long.valueOf((long) promotion.getPromotionSource());
                    aVar5.f73497b = i();
                    aVar5.f73498c = e().getAid();
                    aVar5.f73506k = "click_comment";
                    aVar5.f73504i = i();
                    aVar5.I = Integer.valueOf(e().getFollowStatus());
                    a7.logCommerceEvents("show_product", aVar5);
                }
                if (w().getVisibility() != 0 && x().getVisibility() != 0 && y().getVisibility() != 0 && z().getVisibility() != 0 && A().getVisibility() != 0) {
                    b(v());
                }
            }
        }
    }
}
