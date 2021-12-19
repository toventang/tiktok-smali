package com.ss.android.ugc.aweme.comment.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget;
import com.ss.android.ugc.aweme.commercialize.log.aj;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.log.o;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.y;
import h.h;
import h.k.i;
import h.m;
import h.p;
import h.z;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class NewCommentAdWidget extends BaseCommentWidget implements View.OnClickListener, u<com.ss.android.ugc.aweme.arch.widgets.base.b>, au {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ i[] f73057i = {new y(NewCommentAdWidget.class, "mCommentAdLayout", "getMCommentAdLayout()Landroid/widget/LinearLayout;", 0), new y(NewCommentAdWidget.class, "mCommentAdSourceTv", "getMCommentAdSourceTv()Landroid/widget/TextView;", 0), new y(NewCommentAdWidget.class, "mCommentAdDesTv", "getMCommentAdDesTv()Landroid/widget/TextView;", 0), new y(NewCommentAdWidget.class, "mCommentAdUserIv", "getMCommentAdUserIv()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;", 0), new y(NewCommentAdWidget.class, "mCommentAdCloseBtn", "getMCommentAdCloseBtn()Landroid/view/View;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f73058j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final BaseCommentWidget.a f73059k = a((int) R.id.a9s);

    /* renamed from: l  reason: collision with root package name */
    private final BaseCommentWidget.a f73060l = a((int) R.id.a9r);

    /* renamed from: m  reason: collision with root package name */
    private final BaseCommentWidget.a f73061m = a((int) R.id.a9p);
    private final BaseCommentWidget.a n = a((int) R.id.a9t);
    private final BaseCommentWidget.a o = a((int) R.id.a9o);
    private final h p = h.i.a(m.NONE, b.f73062a);
    private boolean q = true;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private final h.f.a.a<z> v;

    static {
        Covode.recordClassIndex(44998);
    }

    private final LinearLayout l() {
        return (LinearLayout) this.f73059k.a(this, f73057i[0]);
    }

    private final View m() {
        return this.o.a(this, f73057i[4]);
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final int c() {
        return R.layout.bkr;
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44999);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.commercialize.j.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f73062a = new b();

        static {
            Covode.recordClassIndex(45000);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ com.ss.android.ugc.aweme.commercialize.j.b invoke() {
            return AnonymousClass1.f73063a;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        o();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        n();
    }

    private final void p() {
        LinearLayout l2 = l();
        Context context = this.f67007b;
        l.b(context, "");
        a(l2, context.getResources().getDimensionPixelOffset(R.dimen.bi), 0, false);
    }

    private final void q() {
        LinearLayout l2 = l();
        Context context = this.f67007b;
        l.b(context, "");
        a(l2, context.getResources().getDimensionPixelOffset(R.dimen.bi), 300, false);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void k() {
        l().setOnClickListener(this);
        m().setOnClickListener(this);
        m().setAlpha(0.5f);
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
        this.f67010e.a("comment_ad_struct", this, true).a("comment_ad_view_state", this, true);
    }

    private final void n() {
        if (f() && e().isAppAd() && !com.ss.android.ugc.aweme.commercialize.e.a.b.av(e()) && !this.r) {
            this.r = true;
        }
    }

    private final void o() {
        if (f() && e().isAppAd() && e().getAwemeRawAd() != null && this.r) {
            this.r = false;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget, androidx.lifecycle.u
    public final /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    private final void b(int i2) {
        if (i2 == 0) {
            if (this.s != 0) {
                this.f67010e.b("comment_shown", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
            }
        } else if (i2 > 0) {
            this.f67010e.a("comment_shown", this, true);
        }
        this.s = i2;
    }

    public NewCommentAdWidget(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        this.v = aVar;
    }

    public final void onClick(View view) {
        ViewGroup.LayoutParams layoutParams;
        AwemeRawAd awemeRawAd;
        ClickAgent.onClick(view);
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null && marginLayoutParams.bottomMargin >= 0 && f() && (awemeRawAd = e().getAwemeRawAd()) != null) {
            l.b(awemeRawAd, "");
            int id = view.getId();
            if (id == R.id.a9s) {
                String type = awemeRawAd.getType();
                if (type != null && type.length() != 0) {
                    Aweme e2 = e();
                    if (e2.isAd()) {
                        com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_end_ad", "click", e2.getAwemeRawAd()).b("refer", "button").a("anchor_id", j.b(e2)).a("room_id", j.a(e2)).b();
                        AwemeRawAd awemeRawAd2 = e2.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            aj.a("click", awemeRawAd2.getClickTrackUrlList(), awemeRawAd2.getCreativeId(), awemeRawAd2.getLogExtra(), new o(awemeRawAd2));
                        }
                    }
                    if (w.a(this.f67007b, e(), 6, (com.ss.android.ugc.aweme.commercialize.j.b) this.p.getValue())) {
                        this.v.invoke();
                    }
                }
            } else if (id == R.id.a9o) {
                this.q = false;
                Context context = this.f67007b;
                JSONObject a2 = j.a(context, awemeRawAd, true, (Map<String, String>) null);
                if (!TextUtils.isEmpty("button")) {
                    try {
                        a2.put("refer", "button");
                    } catch (JSONException unused) {
                    }
                }
                j.b(context, "close", awemeRawAd, a2);
                com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_end_ad", "close", awemeRawAd).b("refer", "button").c();
                q();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.widgets.BaseCommentWidget
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        int i2;
        int i3;
        s sVar;
        Aweme aweme;
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f67014a;
            boolean z = false;
            switch (str.hashCode()) {
                case -1106422991:
                    if (str.equals("comment_shown")) {
                        boolean a2 = bVar.a();
                        if (a2 == null) {
                            a2 = false;
                        }
                        if (l.a(a2, (Object) 0) && (i2 = this.s) > 0 && this.t && (i3 = this.u) < i2) {
                            int i4 = i3 + 1;
                            this.u = i4;
                            if (i4 == i2 && this.q) {
                                a(l(), n.a(16.0d), 300, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case 566175283:
                    if (str.equals("comment_ad_view_state")) {
                        boolean a3 = bVar.a();
                        if (a3 == null) {
                            a3 = false;
                        }
                        if (l.a(a3, (Object) 0)) {
                            p();
                            return;
                        } else if (l.a(a3, (Object) 1)) {
                            q();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case 584899985:
                    if (str.equals("comment_ad_struct") && (sVar = (s) bVar.a()) != null) {
                        b(sVar.getShowButtonNumber());
                        BaseCommentWidget.a aVar = this.f73060l;
                        h.k.i<?>[] iVarArr = f73057i;
                        ((TextView) aVar.a(this, iVarArr[1])).setText(sVar.getSource());
                        ((TextView) this.f73061m.a(this, iVarArr[2])).setText(sVar.getTitle());
                        e.a((RemoteImageView) this.n.a(this, iVarArr[3]), sVar.getAvatarIcon());
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setCornerRadius(com.bytedance.common.utility.n.b(this.f67007b, 4.0f));
                        gradientDrawable.setColor(Color.parseColor(com.ss.android.ugc.aweme.commercialize.e.a.b.ak(e())));
                        l().setBackground(gradientDrawable);
                        return;
                    }
                    return;
                case 2016314694:
                    if (str.equals("comment_aweme_and_params")) {
                        this.q = true;
                        this.u = 0;
                        b(0);
                        p();
                        p pVar = (p) bVar.a();
                        if (pVar != null && (aweme = (Aweme) pVar.getFirst()) != null) {
                            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                            if (awemeRawAd != null) {
                                z = awemeRawAd.isCommentAreaSwitch();
                            }
                            this.t = z;
                            o();
                            n();
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    private final void a(View view, int i2, int i3, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = layoutParams;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (marginLayoutParams2 != null) {
            int i4 = marginLayoutParams2.bottomMargin;
            if (i4 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (!z2) {
                    j.a(this.f67007b, e().getAwemeRawAd());
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("comment_end_ad", "othershow", e().getAwemeRawAd()).c();
                    com.ss.android.ugc.aweme.utils.j.a(view, i4, i2, i3).start();
                }
            } else if (z2) {
                com.ss.android.ugc.aweme.utils.j.a(view, i4, i2, i3).start();
            }
        }
    }
}
