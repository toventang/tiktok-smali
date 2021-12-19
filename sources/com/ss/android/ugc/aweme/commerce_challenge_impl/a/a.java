package com.ss.android.ugc.aweme.commerce_challenge_impl.a;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commerce_challenge_impl.view.CommerceRemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tcm.api.service.ITcmService;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;

public final class a implements com.ss.android.ugc.aweme.commerce_challenge_api.c.a {

    /* renamed from: e  reason: collision with root package name */
    public static final C1643a f73515e = new C1643a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CommerceRemoteImageView f73516a;

    /* renamed from: b  reason: collision with root package name */
    public Context f73517b;

    /* renamed from: c  reason: collision with root package name */
    com.ss.android.ugc.aweme.commerce_challenge_api.b.a f73518c;

    /* renamed from: d  reason: collision with root package name */
    public Challenge f73519d;

    /* renamed from: f  reason: collision with root package name */
    private View f73520f;

    /* renamed from: g  reason: collision with root package name */
    private CheckableImageView f73521g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f73522h;

    /* renamed from: i  reason: collision with root package name */
    private ViewStub f73523i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f73524j;

    /* renamed from: k  reason: collision with root package name */
    private View f73525k;

    /* renamed from: l  reason: collision with root package name */
    private ViewStub f73526l;

    /* renamed from: m  reason: collision with root package name */
    private View f73527m;
    private TextView n;
    private View o;
    private TextView p;
    private ViewStub q;
    private View r;
    private TextView s;
    private ViewStub t;
    private View u;
    private TextView v;
    private String w;
    private List<? extends Aweme> x;

    static {
        Covode.recordClassIndex(45252);
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a$a  reason: collision with other inner class name */
    public static final class C1643a {
        static {
            Covode.recordClassIndex(45253);
        }

        private C1643a() {
        }

        public /* synthetic */ C1643a(byte b2) {
            this();
        }

        public static boolean a(Challenge challenge) {
            if (challenge == null || TextUtils.isEmpty(challenge.getLinkText()) || TextUtils.isEmpty(challenge.getLinkAction())) {
                return false;
            }
            return true;
        }

        public static boolean b(Challenge challenge) {
            if (challenge == null || TextUtils.isEmpty(challenge.getRuleDetailDesc()) || TextUtils.isEmpty(challenge.getRuleDetailDesc())) {
                return false;
            }
            return true;
        }

        public static String c(Challenge challenge) {
            l.d(challenge, "");
            if (!d(challenge)) {
                return "";
            }
            ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
            l.b(challengeDisclaimer, "");
            String content = challengeDisclaimer.getContent();
            l.b(content, "");
            return content;
        }

        public static boolean d(Challenge challenge) {
            ChallengeDisclaimer challengeDisclaimer;
            if (challenge != null && (challengeDisclaimer = challenge.getChallengeDisclaimer()) != null && !TextUtils.isEmpty(challengeDisclaimer.getTitle()) && !TextUtils.isEmpty(challengeDisclaimer.getContent())) {
                return true;
            }
            return false;
        }

        public static String a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
            if (str.length() != 0) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("bundle_webview_background", str2).build().toString();
            }
            l.b(str, "");
            return str;
        }

        public static String a(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str2, "");
            if (str.length() != 0) {
                str = Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).appendQueryParameter("challenge_id", str3).build().toString();
            }
            l.b(str, "");
            return str;
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(View view) {
        this.f73520f = view;
    }

    public static final class b extends com.facebook.drawee.c.c<com.facebook.imagepipeline.j.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73528a;

        static {
            Covode.recordClassIndex(45254);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f73528a = aVar;
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
        }

        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final void onIntermediateImageFailed(String str, Throwable th) {
            super.onIntermediateImageFailed(str, th);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
            com.facebook.imagepipeline.j.f fVar2 = fVar;
            CommerceRemoteImageView commerceRemoteImageView = this.f73528a.f73516a;
            if (commerceRemoteImageView != null) {
                commerceRemoteImageView.b(fVar2);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.c.d, com.facebook.drawee.c.c
        public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
            com.facebook.imagepipeline.j.f fVar2 = fVar;
            CommerceRemoteImageView commerceRemoteImageView = this.f73528a.f73516a;
            if (commerceRemoteImageView != null) {
                commerceRemoteImageView.b(fVar2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(TextView textView) {
        this.f73522h = textView;
    }

    public static final /* synthetic */ Context a(a aVar) {
        Context context = aVar.f73517b;
        if (context == null) {
            l.a("mContext");
        }
        return context;
    }

    public static final /* synthetic */ Challenge b(a aVar) {
        Challenge challenge = aVar.f73519d;
        if (challenge == null) {
            l.a("mChallenge");
        }
        return challenge;
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void c(ViewStub viewStub) {
        this.q = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mw);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void d(ViewStub viewStub) {
        this.t = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mv);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(float f2) {
        boolean z;
        TextView textView = this.n;
        if (textView != null) {
            if (((double) f2) <= 0.9d) {
                z = true;
            } else {
                z = false;
            }
            textView.setClickable(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void b(ViewStub viewStub) {
        this.f73526l = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.mu);
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73533a;

        static {
            Covode.recordClassIndex(45258);
        }

        f(a aVar) {
            this.f73533a = aVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a2 != null) {
                Context a3 = a.a(this.f73533a);
                HTCMissionModule htcMissionModule = a.b(this.f73533a).getHtcMissionModule();
                if (htcMissionModule != null) {
                    str = htcMissionModule.getOpenUrl();
                } else {
                    str = null;
                }
                a2.a(a3, str, false);
            }
            a.a(a.b(this.f73533a).getHtcMissionModule(), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(ViewStub viewStub) {
        this.f73523i = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.n2);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73529a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CommerceChallengeBanner f73530b;

        static {
            Covode.recordClassIndex(45255);
        }

        c(a aVar, CommerceChallengeBanner commerceChallengeBanner) {
            this.f73529a = aVar;
            this.f73530b = commerceChallengeBanner;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73529a.a("banner_click");
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a2 == null) {
                l.b();
            }
            if (!a2.a(a.a(this.f73529a), this.f73530b.getOpenUrl(), false)) {
                com.ss.android.ugc.aweme.commerce_challenge_api.a.a a3 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
                if (a3 == null) {
                    l.b();
                }
                a3.a(a.a(this.f73529a), C1643a.a(this.f73530b.getWebUrl(), "challenge_banner", a.b(this.f73529a).getCid()), "");
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73531a;

        static {
            Covode.recordClassIndex(45256);
        }

        d(a aVar) {
            this.f73531a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("click_contest_page", new com.ss.android.ugc.aweme.app.f.d().a("tag_id", a.b(this.f73531a).getCid()).a("page_type", "challenge").a("enter_from", "challenge").f66730a);
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a2 != null) {
                Context a3 = a.a(this.f73531a);
                Objects.requireNonNull(a3, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                a2.a((androidx.fragment.app.e) a3);
            }
        }
    }

    public final void b(String str) {
        String str2;
        MobClick labelName = MobClick.obtain().setEventName(str).setLabelName("challenge");
        Challenge challenge = this.f73519d;
        if (challenge == null) {
            l.a("mChallenge");
        }
        r.onEvent(labelName.setValue(challenge.getCid()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("link_type", "web_link").a()));
        Challenge challenge2 = this.f73519d;
        if (challenge2 == null) {
            l.a("mChallenge");
        }
        User author = challenge2.getAuthor();
        if (author != null) {
            str2 = author.getUid();
        } else {
            str2 = "";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("author_id", str2);
        Challenge challenge3 = this.f73519d;
        if (challenge3 == null) {
            l.a("mChallenge");
        }
        r.a(str, a2.a("tag_id", challenge3.getCid()).a("link_type", "web_link").a("enter_from", "challenge").f66730a);
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73532a;

        static {
            Covode.recordClassIndex(45257);
        }

        e(a aVar) {
            this.f73532a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73532a.b("click_link");
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a2 != null) {
                a2.a("click_link", a.b(this.f73532a).getCid());
            }
            if (a.b(this.f73532a).isLinkActionAsOpenUrl()) {
                com.ss.android.ugc.aweme.commerce_challenge_api.a.a a3 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
                if (a3 != null) {
                    Context a4 = a.a(this.f73532a);
                    String linkAction = a.b(this.f73532a).getLinkAction();
                    l.b(linkAction, "");
                    a3.a(a4, p.a(linkAction, "aweme://", "sslocal://", false), true);
                    return;
                }
                return;
            }
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a5 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a5 != null) {
                Context a6 = a.a(this.f73532a);
                String linkAction2 = a.b(this.f73532a).getLinkAction();
                l.b(linkAction2, "");
                a5.a(a6, C1643a.a(C1643a.a(linkAction2, "ffffff"), "challenge_link", a.b(this.f73532a).getCid()), a.b(this.f73532a).getLinkTitle());
            }
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f73534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f73535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f73536c;

        static {
            Covode.recordClassIndex(45259);
        }

        g(a aVar, String str, String str2) {
            this.f73534a = aVar;
            this.f73535b = str;
            this.f73536c = str2;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a3 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if ((a3 == null || !a3.a(a.a(this.f73534a), this.f73535b)) && ((a2 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a()) == null || !a2.a(a.a(this.f73534a), this.f73535b, true))) {
                com.ss.android.ugc.aweme.commerce_challenge_api.a.a a4 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
                if (a4 != null) {
                    Context a5 = a.a(this.f73534a);
                    String str = this.f73536c;
                    l.b(str, "");
                    if (!a4.a(a5, C1643a.a(C1643a.a(str, "ffffff"), "challenge_transform_button", a.b(this.f73534a).getCid()), "")) {
                        return;
                    }
                } else {
                    return;
                }
            }
            a aVar = this.f73534a;
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Challenge challenge = aVar.f73519d;
            if (challenge == null) {
                l.a("mChallenge");
            }
            com.ss.android.ugc.aweme.app.f.d a6 = dVar.a("tag_id", challenge.getCid());
            com.ss.android.ugc.aweme.commerce_challenge_api.b.a aVar2 = aVar.f73518c;
            if (aVar2 == null) {
                l.a("mHeaderParam");
            }
            r.a("click_variable_button", a6.a("enter_from", aVar2.f73511b).a("page_type", "challenge").f66730a);
            com.ss.android.ugc.aweme.commerce_challenge_api.a.a a7 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
            if (a7 != null) {
                Challenge challenge2 = aVar.f73519d;
                if (challenge2 == null) {
                    l.a("mChallenge");
                }
                a7.a("click_variable_button", challenge2.getCid());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(CheckableImageView checkableImageView) {
        this.f73521g = checkableImageView;
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        Challenge challenge = this.f73519d;
        if (challenge == null) {
            l.a("mChallenge");
        }
        r.a(str, dVar.a("tag_id", challenge.getCid()).a("enter_from", "challenge").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    public final void a(FrameLayout frameLayout, com.ss.android.ugc.aweme.commerce_challenge_api.b.a aVar) {
        l.d(frameLayout, "");
        l.d(aVar, "");
        Context context = frameLayout.getContext();
        l.b(context, "");
        this.f73517b = context;
        this.f73518c = aVar;
    }

    public static void a(HTCMissionModule hTCMissionModule, boolean z) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        Integer num;
        TcmConfig i2;
        User a2;
        if (z) {
            str = "mission_label_show";
        } else {
            str = "mission_label_click";
        }
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        Integer num2 = null;
        if (hTCMissionModule != null) {
            str2 = hTCMissionModule.getMissionId();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("mission_id", str2);
        if (hTCMissionModule != null) {
            bool = hTCMissionModule.isEligibleUser();
        } else {
            bool = null;
        }
        String str4 = "0";
        if (l.a((Object) bool, (Object) true)) {
            str3 = "1";
        } else {
            str3 = str4;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("eligibility", str3);
        if (hTCMissionModule != null) {
            num = hTCMissionModule.getMissionLabelType();
        } else {
            num = null;
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("status", num).a("current_page", "1");
        com.ss.android.ugc.aweme.commerce_challenge_api.a.a a6 = com.ss.android.ugc.aweme.commerce_challenge_impl.b.a.a();
        if (!(a6 == null || (a2 = a6.a()) == null)) {
            num2 = Integer.valueOf(a2.getFollowerCount());
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a5.a("creator_followers", num2);
        ITcmService j2 = TcmServiceImpl.j();
        if (j2 == null || (i2 = j2.i()) == null || !i2.isTcmCreator()) {
            str4 = "1";
        }
        r.a(str, a7.a("creator_type", str4).f66730a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v68, resolved type: android.widget.TextView */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.ss.android.ugc.aweme.commerce_challenge_api.c.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.model.Challenge r13, java.lang.String r14, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r15) {
        /*
        // Method dump skipped, instructions count: 946
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce_challenge_impl.a.a.a(com.ss.android.ugc.aweme.discover.model.Challenge, java.lang.String, java.util.List):void");
    }
}
