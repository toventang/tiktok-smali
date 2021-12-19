package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.h.g;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.experiment.hh;
import com.ss.android.ugc.aweme.feed.api.RecommendNotInterestedApi;
import com.ss.android.ugc.aweme.feed.j;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.k;
import com.ss.android.ugc.aweme.feed.x.ag;
import com.ss.android.ugc.aweme.follow.NewFollowButton;
import com.ss.android.ugc.aweme.metrics.aa;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;
import java.util.Objects;

public final class x {

    /* renamed from: h  reason: collision with root package name */
    public static final a f95125h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public View f95126a;

    /* renamed from: b  reason: collision with root package name */
    public NewFollowButton f95127b;

    /* renamed from: c  reason: collision with root package name */
    public TuxButton f95128c;

    /* renamed from: d  reason: collision with root package name */
    DataCenter f95129d;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f95130e;

    /* renamed from: f  reason: collision with root package name */
    boolean f95131f;

    /* renamed from: g  reason: collision with root package name */
    public final Context f95132g;

    /* renamed from: i  reason: collision with root package name */
    private final h f95133i;

    static {
        Covode.recordClassIndex(60291);
    }

    /* access modifiers changed from: package-private */
    public final g a() {
        return (g) this.f95133i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(60294);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends m implements h.f.a.a<g> {
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(60299);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(x xVar) {
            super(0);
            this.this$0 = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            return new g(this.this$0.f95132g);
        }
    }

    public final void b() {
        if (this.f95130e != null) {
            View view = this.f95126a;
            if (view != null) {
                view.setVisibility(8);
            }
            NewFollowButton newFollowButton = this.f95127b;
            if (newFollowButton != null) {
                newFollowButton.setVisibility(8);
            }
            TuxButton tuxButton = this.f95128c;
            if (tuxButton != null) {
                tuxButton.setVisibility(8);
            }
        }
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95143a;

        static {
            Covode.recordClassIndex(60298);
        }

        e(x xVar) {
            this.f95143a = xVar;
        }

        public final void run() {
            AnimatorSet animatorSet = new AnimatorSet();
            x xVar = this.f95143a;
            AnimatorSet.Builder play = animatorSet.play(xVar.a(0, xVar.f95127b, 131.0f, 270.0f));
            x xVar2 = this.f95143a;
            play.with(xVar2.a(0, xVar2.f95128c, 131.0f, 0.0f));
            animatorSet.start();
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95141a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FollowStatus f95142b;

        static {
            Covode.recordClassIndex(60297);
        }

        d(x xVar, FollowStatus followStatus) {
            this.f95141a = xVar;
            this.f95142b = followStatus;
        }

        public final void run() {
            TuxButton tuxButton;
            NewFollowButton newFollowButton = this.f95141a.f95127b;
            if (newFollowButton != null) {
                newFollowButton.a(this.f95142b.followStatus, this.f95142b.followerStatus);
            }
            NewFollowButton newFollowButton2 = this.f95141a.f95127b;
            if (newFollowButton2 != null) {
                newFollowButton2.setButtonVariant(2);
            }
            if (!ag.a(this.f95141a.f95130e)) {
                x xVar = this.f95141a;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.play(xVar.a(0, xVar.f95127b, 131.0f, 270.0f)).with(xVar.a(2, xVar.f95128c, 1.0f, 0.0f));
                animatorSet.start();
                TuxButton tuxButton2 = xVar.f95128c;
                if (!(tuxButton2 == null || tuxButton2.getWidth() != 0 || (tuxButton = xVar.f95128c) == null)) {
                    tuxButton.setVisibility(8);
                }
            }
            x xVar2 = this.f95141a;
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(xVar2.a(1, xVar2.f95126a, 48.0f, 0.0f)).with(xVar2.a(2, xVar2.f95126a, 1.0f, 0.0f));
            animatorSet2.setStartDelay(500);
            animatorSet2.addListener(new c(xVar2));
            animatorSet2.start();
            y.a(this.f95141a.f95130e, k.a.FOLLOW, ag.b(this.f95141a.f95130e));
            ag.c(this.f95141a.f95130e);
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f95140b = 500;

        static {
            Covode.recordClassIndex(60296);
        }

        c(x xVar) {
            this.f95139a = xVar;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            View view = this.f95139a.f95126a;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f95136a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f95137b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f95138c;

        static {
            Covode.recordClassIndex(60295);
        }

        b(x xVar, View view, int i2) {
            this.f95136a = xVar;
            this.f95137b = view;
            this.f95138c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            View view = this.f95137b;
            int i2 = this.f95138c;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (i2 == 0) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                layoutParams.width = h.g.a.a(TypedValue.applyDimension(1, floatValue, system.getDisplayMetrics()));
            } else if (i2 == 1) {
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                layoutParams.height = h.g.a.a(TypedValue.applyDimension(1, floatValue, system2.getDisplayMetrics()));
            } else if (i2 == 2) {
                view.setAlpha(floatValue);
            }
            view.setLayoutParams(layoutParams);
        }
    }

    public x(View view, Context context) {
        View view2;
        NewFollowButton newFollowButton;
        TuxButton tuxButton;
        NewFollowButton newFollowButton2;
        l.d(context, "");
        this.f95132g = context;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            view2 = view.findViewById(R.id.dqe);
        } else {
            view2 = null;
        }
        this.f95126a = view2;
        if (view != null) {
            newFollowButton = (NewFollowButton) view.findViewById(R.id.yf);
        } else {
            newFollowButton = null;
        }
        this.f95127b = newFollowButton;
        if (view != null) {
            tuxButton = (TuxButton) view.findViewById(R.id.z9);
        } else {
            tuxButton = null;
        }
        this.f95128c = tuxButton;
        NewFollowButton newFollowButton3 = this.f95127b;
        if (newFollowButton3 != null) {
            newFollowButton3.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.ui.x.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x f95134a;

                static {
                    Covode.recordClassIndex(60292);
                }

                {
                    this.f95134a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    String str;
                    ClickAgent.onClick(view);
                    x xVar = this.f95134a;
                    if (view != null && (aweme = xVar.f95130e) != null && !aweme.isDelete()) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            xVar.a().b();
                        } else {
                            xVar.a().a();
                        }
                        if (xVar.f95129d != null) {
                            User author = aweme.getAuthor();
                            l.b(author, "");
                            if (author.getFollowStatus() == 0) {
                                com.ss.android.ugc.aweme.feed.i.ag agVar = new com.ss.android.ugc.aweme.feed.i.ag(12, aweme);
                                if (ag.a(aweme)) {
                                    str = "expand_card";
                                } else {
                                    str = "small_card";
                                }
                                agVar.n = str;
                                DataCenter dataCenter = xVar.f95129d;
                                if (dataCenter != null) {
                                    dataCenter.a("feed_internal_event", agVar);
                                }
                            }
                        }
                    }
                }
            });
        }
        TuxButton tuxButton2 = this.f95128c;
        if (tuxButton2 != null) {
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.feed.ui.x.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ x f95135a;

                static {
                    Covode.recordClassIndex(60293);
                }

                {
                    this.f95135a = r1;
                }

                public final void onClick(View view) {
                    Aweme aweme;
                    String str;
                    String str2;
                    AwemeRawAd awemeRawAd;
                    ClickAgent.onClick(view);
                    x xVar = this.f95135a;
                    if (view != null && xVar.f95126a != null && (aweme = xVar.f95130e) != null) {
                        ag.c(aweme);
                        j jVar = new j(aweme, "homepage_hot", "small_card");
                        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.fem).a();
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.feed.i.e(jVar.f93522a, jVar.f93523b, com.ss.android.ugc.aweme.feed.i.e.f93471e));
                        u o = new u().g(jVar.f93522a).a(jVar.f93523b).o(jVar.f93524c);
                        o.f109597b = u.a.DISLIKE;
                        u a2 = o.a(jVar.f93522a.getAuthor());
                        User author = jVar.f93522a.getAuthor();
                        String str3 = "";
                        l.b(author, str3);
                        u s = a2.s(author.getRequestId());
                        s.f109596a = u.c.ITEM;
                        s.o(jVar.f93524c).f();
                        com.ss.android.ugc.aweme.metrics.k a3 = new com.ss.android.ugc.aweme.metrics.k().g(jVar.f93522a).a(jVar.f93523b);
                        a3.f109580c = "small_card";
                        a3.f109579b = ac.a(jVar.f93522a);
                        a3.f109578a = ac.e(jVar.f93522a);
                        a3.f109582e = ac.g(jVar.f93522a);
                        a3.t = aa.a(jVar.f93522a);
                        a3.f();
                        RecommendNotInterestedApi.SyncNotInterestedApi syncNotInterestedApi = (RecommendNotInterestedApi.SyncNotInterestedApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(RecommendNotInterestedApi.SyncNotInterestedApi.class);
                        String aid = jVar.f93522a.getAid();
                        l.b(aid, str3);
                        HashMap hashMap = new HashMap();
                        String authorUid = jVar.f93522a.getAuthorUid();
                        l.b(authorUid, str3);
                        hashMap.put("author_id", authorUid);
                        hashMap.put("channel_id", String.valueOf(com.ss.android.ugc.aweme.app.c.c.a(jVar.f93523b)));
                        Aweme aweme2 = jVar.f93522a;
                        if (!aweme2.isAd() || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                            str = str3;
                            str2 = str;
                        } else {
                            l.b(awemeRawAd, str3);
                            String valueOf = String.valueOf(awemeRawAd.getAdId().longValue());
                            str2 = String.valueOf(awemeRawAd.getCreativeId().longValue());
                            str = awemeRawAd.getLogExtra();
                            l.b(str, str3);
                            str3 = valueOf;
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            hashMap.put("ad_id", str3);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            hashMap.put("creative_id", str2);
                        }
                        if (!TextUtils.isEmpty(str)) {
                            hashMap.put("log_extra", str);
                        }
                        syncNotInterestedApi.dislikeRecommend(aid, hashMap).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(j.b.f93525a, j.c.f93526a);
                    }
                }
            });
        }
        if (!(hh.a() != 1 || (newFollowButton2 = this.f95127b) == null || this.f95128c == null || this.f95126a == null)) {
            ViewGroup.LayoutParams layoutParams2 = newFollowButton2.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            TuxButton tuxButton3 = this.f95128c;
            layoutParams = tuxButton3 != null ? tuxButton3.getLayoutParams() : layoutParams;
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.removeRule(21);
            layoutParams3.addRule(20);
            layoutParams4.removeRule(20);
            layoutParams4.addRule(21);
        }
        this.f95133i = i.a((h.f.a.a) new f(this));
    }

    public final ValueAnimator a(int i2, View view, float f2, float f3) {
        if (view == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        l.b(ofFloat, "");
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new b(this, view, i2));
        return ofFloat;
    }
}
