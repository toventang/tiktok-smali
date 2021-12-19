package com.ss.android.ugc.aweme.commercialize.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.ad.AdRatingView;
import com.ss.android.ugc.aweme.commercialize.log.j;
import com.ss.android.ugc.aweme.commercialize.model.aa;
import com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget;
import com.ss.android.ugc.aweme.commercialize.utils.w;
import com.ss.android.ugc.aweme.commercialize.views.FakeUserAdTagView;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakePopUpWebPageWidget;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.feed.x.af;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

public final class AdFakeUserProfileVideoNewDescWidget extends AbsAdProfileWidget implements au {

    /* renamed from: j  reason: collision with root package name */
    public static final a f76287j = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    private final h f76288k = i.a((h.f.a.a) new f(this));

    /* renamed from: l  reason: collision with root package name */
    private ViewStub f76289l;

    /* renamed from: m  reason: collision with root package name */
    private FakeUserAdTagView f76290m;
    private ViewStub n;
    private View o;
    private TextView p;
    private AdRatingView q;

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f76297a = new e();

        static {
            Covode.recordClassIndex(47056);
        }

        e() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(47049);
    }

    private final MentionTextView f() {
        return (MentionTextView) this.f76288k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget, com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47050);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<MentionTextView> {
        final /* synthetic */ AdFakeUserProfileVideoNewDescWidget this$0;

        static {
            Covode.recordClassIndex(47057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(AdFakeUserProfileVideoNewDescWidget adFakeUserProfileVideoNewDescWidget) {
            super(0);
            this.this$0 = adFakeUserProfileVideoNewDescWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MentionTextView invoke() {
            return this.this$0.a(R.id.ffx);
        }
    }

    private static boolean i() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean e() {
        boolean z;
        User author;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        if (aweme == null || (author = aweme.getAuthor()) == null || !author.isAdFake()) {
            z = false;
        } else {
            z = true;
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if ((aweme2 != null && aweme2.isAd()) || !z) {
            return false;
        }
        View view = this.f67008c;
        l.b(view, "");
        new com.bytedance.tux.g.b(view).e(R.string.of).b();
        return true;
    }

    private final int g() {
        AwemeRawAd awemeRawAd;
        aa fakeAuthor;
        String totalRatingsReviews;
        AwemeRawAd awemeRawAd2;
        aa fakeAuthor2;
        String rankLabel;
        AwemeRawAd awemeRawAd3;
        aa fakeAuthor3;
        String categoryLabel;
        AwemeRawAd awemeRawAd4;
        aa fakeAuthor4;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (fakeAuthor = awemeRawAd.getFakeAuthor()) == null || (totalRatingsReviews = fakeAuthor.getTotalRatingsReviews()) == null || totalRatingsReviews.length() == 0) {
            return 3;
        }
        Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme2 != null && (awemeRawAd4 = aweme2.getAwemeRawAd()) != null && (fakeAuthor4 = awemeRawAd4.getFakeAuthor()) != null && fakeAuthor4.getRating() != null) {
            return 1;
        }
        Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme3 != null && (awemeRawAd3 = aweme3.getAwemeRawAd()) != null && (fakeAuthor3 = awemeRawAd3.getFakeAuthor()) != null && (categoryLabel = fakeAuthor3.getCategoryLabel()) != null && categoryLabel.length() != 0) {
            return 2;
        }
        Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
        if (aweme4 == null || (awemeRawAd2 = aweme4.getAwemeRawAd()) == null || (fakeAuthor2 = awemeRawAd2.getFakeAuthor()) == null || (rankLabel = fakeAuthor2.getRankLabel()) == null || rankLabel.length() == 0) {
            return 3;
        }
        return 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: android.text.SpannableString */
    /* JADX WARN: Multi-variable type inference failed */
    private final void h() {
        String desc;
        String str;
        boolean z;
        String str2;
        AwemeRawAd awemeRawAd;
        String buttonText;
        List<TextExtraStruct> textExtra;
        int a2;
        AwemeRawAd awemeRawAd2;
        Aweme aweme = ((AbsAdProfileWidget) this).f75063a;
        if (aweme != null && (desc = aweme.getDesc()) != null) {
            MentionTextView f2 = f();
            if (f2 != null) {
                Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd2.getButtonText();
                }
                if (str == null || str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = desc;
                } else {
                    l.d(desc, "");
                    Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
                    if (aweme3 == null || (awemeRawAd = aweme3.getAwemeRawAd()) == null || (buttonText = awemeRawAd.getButtonText()) == null) {
                        str2 = null;
                    } else {
                        String str3 = desc + ' ';
                        SpannableString spannableString = new SpannableString(str3 + buttonText);
                        Context context = this.f67007b;
                        l.b(context, "");
                        com.ss.android.ugc.aweme.feed.widget.c cVar = new com.ss.android.ugc.aweme.feed.widget.c(context, buttonText, "#80161823", 2131232012, "#0F161823", "#0F161823", 12, 15);
                        spannableString.setSpan(new b(this), str3.length(), buttonText.length() + str3.length(), 18);
                        spannableString.setSpan(cVar, str3.length(), buttonText.length() + str3.length(), 18);
                        str2 = spannableString;
                    }
                }
                f2.setText(str2);
                Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme4 != null && (textExtra = aweme4.getTextExtra()) != null) {
                    a(textExtra, desc);
                    if (this.f67007b != null) {
                        Aweme aweme5 = ((AbsAdProfileWidget) this).f75063a;
                        if (aweme5 == null || !aweme5.isAd()) {
                            a2 = af.a();
                        } else {
                            a2 = 200;
                        }
                        f2.setMaxSize(a2);
                        f2.setSpanSize((float) n.c(15.0d));
                        f2.setSpanColor(f2.getCurrentTextColor());
                        f2.setSpanStyle(1);
                        f2.setOnSpanClickListener(new c(this, desc));
                        f2.a(textExtra, new com.ss.android.ugc.aweme.shortvideo.view.f());
                        if (desc.length() > 0) {
                            Iterator<TextExtraStruct> it = textExtra.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    TextExtraStruct next = it.next();
                                    l.b(next, "");
                                    if (a(next, desc) && next.getType() == 0) {
                                        if (!TextUtils.isEmpty(next.getAwemeId()) || 2 == next.getSubtype()) {
                                            Aweme aweme6 = ((AbsAdProfileWidget) this).f75063a;
                                            if (aweme6 == null) {
                                                l.b();
                                            }
                                            if (aweme6.getDesc().charAt(next.getStart()) == '@') {
                                                Context context2 = this.f67007b;
                                                l.b(context2, "");
                                                float a3 = (float) com.bytedance.common.utility.n.a(this.f67007b);
                                                float b2 = com.bytedance.common.utility.n.b(this.f67007b, 100.0f);
                                                Context context3 = this.f67007b;
                                                l.b(context3, "");
                                                com.ss.android.ugc.aweme.commercialize.ad.d dVar = new com.ss.android.ugc.aweme.commercialize.ad.d(context2, a3 - (b2 + context3.getResources().getDimension(R.dimen.a0z)), androidx.core.content.b.c(this.f67007b, R.color.a7), -1, next);
                                                dVar.f73655b = com.bytedance.common.utility.n.b(this.f67007b, 12.0f);
                                                dVar.f73656c = com.bytedance.common.utility.n.b(this.f67007b, 2.0f);
                                                dVar.f73654a = com.bytedance.common.utility.n.b(this.f67007b, 13.0f);
                                                f2.a(next.getStart(), next.getEnd(), dVar);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            if (gb.a(this.f67007b)) {
                                f2.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.i.a());
                            } else {
                                f2.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            com.ss.android.ugc.aweme.framework.a.a.a((Exception) e2);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            View view = this.f67009d;
            if (view != null) {
                view.setOnClickListener(new d(this));
            }
        }
    }

    public static final class b extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoNewDescWidget f76291a;

        static final class a implements com.ss.android.ugc.aweme.commercialize.j.b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f76292a = new a();

            static {
                Covode.recordClassIndex(47052);
            }

            a() {
            }
        }

        static {
            Covode.recordClassIndex(47051);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdFakeUserProfileVideoNewDescWidget adFakeUserProfileVideoNewDescWidget) {
            this.f76291a = adFakeUserProfileVideoNewDescWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            l.d(view, "");
            Aweme aweme = ((AbsAdProfileWidget) this.f76291a).f75063a;
            androidx.fragment.app.e eVar = null;
            if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null) {
                str = null;
            } else {
                str = awemeRawAd2.getOpenUrl();
            }
            if (!com.ss.android.ugc.aweme.commercialize.e.a.b.c(str)) {
                Aweme aweme2 = ((AbsAdProfileWidget) this.f76291a).f75063a;
                if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                    str2 = null;
                } else {
                    str2 = awemeRawAd.getType();
                }
                if (!l.a((Object) str2, (Object) "app")) {
                    Fragment fragment = ((AbsAdProfileWidget) this.f76291a).f75064h;
                    if (fragment != null) {
                        eVar = fragment.getActivity();
                    }
                    AdFakePopUpWebPageWidget.a.c(eVar);
                    return;
                }
            }
            w.a(this.f76291a.f67007b, ((AbsAdProfileWidget) this.f76291a).f75063a, 37, a.f76292a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements MentionTextView.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoNewDescWidget f76293a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f76294b;

        static {
            Covode.recordClassIndex(47053);
        }

        c(AdFakeUserProfileVideoNewDescWidget adFakeUserProfileVideoNewDescWidget, String str) {
            this.f76293a = adFakeUserProfileVideoNewDescWidget;
            this.f76294b = str;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.f
        public final void a(TextExtraStruct textExtraStruct) {
            l.d(textExtraStruct, "");
            if (textExtraStruct.isClickable()) {
                this.f76293a.a(textExtraStruct);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdFakeUserProfileVideoNewDescWidget f76295a;

        static {
            Covode.recordClassIndex(47054);
        }

        d(AdFakeUserProfileVideoNewDescWidget adFakeUserProfileVideoNewDescWidget) {
            this.f76295a = adFakeUserProfileVideoNewDescWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            AwemeRawAd awemeRawAd;
            AwemeRawAd awemeRawAd2;
            ClickAgent.onClick(view);
            if (!this.f76295a.e()) {
                Aweme aweme = ((AbsAdProfileWidget) this.f76295a).f75063a;
                androidx.fragment.app.e eVar = null;
                if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd2.getOpenUrl();
                }
                if (!com.ss.android.ugc.aweme.commercialize.e.a.b.c(str)) {
                    Aweme aweme2 = ((AbsAdProfileWidget) this.f76295a).f75063a;
                    if (aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null) {
                        str2 = null;
                    } else {
                        str2 = awemeRawAd.getType();
                    }
                    if (!l.a((Object) str2, (Object) "app")) {
                        Fragment fragment = ((AbsAdProfileWidget) this.f76295a).f75064h;
                        if (fragment != null) {
                            eVar = fragment.getActivity();
                        }
                        AdFakePopUpWebPageWidget.a.c(eVar);
                        return;
                    }
                }
                w.a(this.f76295a.f67007b, ((AbsAdProfileWidget) this.f76295a).f75063a, 37, AnonymousClass1.f76296a);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0193, code lost:
        if (r1 != null) goto L_0x0148;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.profile.AbsAdProfileWidget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.commercialize.profile.i r8) {
        /*
        // Method dump skipped, instructions count: 433
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileVideoNewDescWidget.a(com.ss.android.ugc.aweme.commercialize.profile.i):void");
    }

    public final void a(TextExtraStruct textExtraStruct) {
        String str;
        String str2;
        String str3;
        String str4;
        User author;
        String str5;
        String str6;
        Aweme aweme;
        String desc;
        String str7;
        String str8;
        String str9;
        VideoReplyStruct videoReplyStruct;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        AwemeRawAd awemeRawAd;
        String str15;
        String str16;
        User author2;
        if (textExtraStruct != null) {
            String str17 = null;
            if (textExtraStruct.getType() == 1) {
                CommerceChallengeServiceImpl.e().a(textExtraStruct);
                String uuid = UUID.randomUUID().toString();
                l.b(uuid, "");
                SmartRoute buildRoute = SmartRouter.buildRoute(this.f67007b, "//challenge/detail");
                Aweme aweme2 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme2 != null) {
                    str13 = aweme2.getAid();
                } else {
                    str13 = null;
                }
                buildRoute.withParam("aweme_id", str13).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", this.f75065i).open(10086);
                MobClick labelName = MobClick.obtain().setEventName("challenge_click").setLabelName(this.f75065i);
                Aweme aweme3 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme3 != null) {
                    str14 = aweme3.getAid();
                } else {
                    str14 = null;
                }
                r.onEvent(labelName.setValue(str14).setExtValueString(textExtraStruct.getCid()));
                j.o(this.f67007b, ((AbsAdProfileWidget) this).f75063a);
                Aweme aweme4 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme4 != null) {
                    awemeRawAd = aweme4.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "challenge_click", awemeRawAd).c();
                com.ss.android.ugc.aweme.metrics.r rVar = new com.ss.android.ugc.aweme.metrics.r();
                String str18 = this.f75065i;
                if (str18 == null) {
                    str18 = "";
                }
                com.ss.android.ugc.aweme.metrics.r rVar2 = (com.ss.android.ugc.aweme.metrics.r) rVar.o(str18).a(this.f67007b);
                Aweme aweme5 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme5 == null || (author2 = aweme5.getAuthor()) == null || (str15 = author2.getUid()) == null) {
                    str15 = "";
                }
                rVar2.p = str15;
                Aweme aweme6 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme6 != null) {
                    str16 = aweme6.getAid();
                } else {
                    str16 = null;
                }
                rVar2.f109595e = str16;
                com.ss.android.ugc.aweme.metrics.r f2 = rVar2.g(((AbsAdProfileWidget) this).f75063a);
                f2.r = uuid;
                f2.t = (String) this.f67010e.b("playlist_type", "");
                f2.v = (String) this.f67010e.b("playlist_id", "");
                f2.u = (String) this.f67010e.b("playlist_id_key", "");
                com.ss.android.ugc.aweme.metrics.r rVar3 = (com.ss.android.ugc.aweme.metrics.r) f2.c((String) this.f67010e.b("tab_name", ""));
                rVar3.q = textExtraStruct.getCid();
                com.ss.android.ugc.aweme.metrics.r rVar4 = (com.ss.android.ugc.aweme.metrics.r) rVar3.a("click_in_video_name");
                Aweme aweme7 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme7 != null) {
                    str17 = aweme7.getRequestId();
                }
                rVar4.p(str17).f();
                s.a(com.ss.android.ugc.aweme.feed.af.CHALLENGE);
                return;
            }
            if (textExtraStruct.getType() == 0 && (!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype())) {
                Aweme aweme8 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme8 != null) {
                    str6 = aweme8.getDesc();
                } else {
                    str6 = null;
                }
                if (a(textExtraStruct, str6) && (aweme = ((AbsAdProfileWidget) this).f75063a) != null && (desc = aweme.getDesc()) != null && desc.charAt(textExtraStruct.getStart()) == '@') {
                    if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                        Aweme aweme9 = ((AbsAdProfileWidget) this).f75063a;
                        if (aweme9 == null || (videoReplyStruct = aweme9.getVideoReplyStruct()) == null) {
                            str8 = "";
                            str7 = str8;
                            str9 = str7;
                        } else {
                            if (videoReplyStruct.getAwemeId() == 0) {
                                str7 = "";
                            } else {
                                str7 = String.valueOf(videoReplyStruct.getAwemeId());
                            }
                            if (videoReplyStruct.getCommentId() == 0) {
                                str9 = "";
                            } else {
                                str9 = String.valueOf(videoReplyStruct.getCommentId());
                            }
                            str8 = videoReplyStruct.getAliasCommentId() == 0 ? "" : String.valueOf(videoReplyStruct.getAliasCommentId());
                        }
                        if (2 == textExtraStruct.getSubtype()) {
                            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f75065i);
                            Aweme aweme10 = ((AbsAdProfileWidget) this).f75063a;
                            if (aweme10 == null) {
                                l.b();
                            }
                            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme10.getAid());
                            Aweme aweme11 = ((AbsAdProfileWidget) this).f75063a;
                            if (aweme11 == null) {
                                l.b();
                            }
                            r.a("click_comment_chain", a3.a("author_id", aweme11.getAuthorUid()).a("to_group_id", str7).a("reply_comment_id", str9).a("reply_user_id", textExtraStruct.getUserId()).f66730a);
                        }
                    } else {
                        Aweme aweme12 = ((AbsAdProfileWidget) this).f75063a;
                        if (aweme12 == null || aweme12.getAwemeType() != 51) {
                            Aweme aweme13 = ((AbsAdProfileWidget) this).f75063a;
                            if (aweme13 == null || aweme13.getAwemeType() != 52) {
                                Aweme aweme14 = ((AbsAdProfileWidget) this).f75063a;
                                if (aweme14 != null && aweme14.getAwemeType() == 58) {
                                    com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("chain_type", "stitch").a("enter_from", this.f75065i);
                                    Aweme aweme15 = ((AbsAdProfileWidget) this).f75063a;
                                    if (aweme15 != null) {
                                        str10 = aweme15.getAid();
                                    } else {
                                        str10 = null;
                                    }
                                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", str10);
                                    Aweme aweme16 = ((AbsAdProfileWidget) this).f75063a;
                                    if (aweme16 != null) {
                                        str17 = aweme16.getAuthorUid();
                                    }
                                    r.a("click_duet_icon", a5.a("author_id", str17).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                                }
                            } else {
                                com.ss.android.ugc.aweme.app.f.d a6 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f75065i);
                                Aweme aweme17 = ((AbsAdProfileWidget) this).f75063a;
                                if (aweme17 != null) {
                                    str11 = aweme17.getAid();
                                } else {
                                    str11 = null;
                                }
                                com.ss.android.ugc.aweme.app.f.d a7 = a6.a("group_id", str11);
                                Aweme aweme18 = ((AbsAdProfileWidget) this).f75063a;
                                if (aweme18 != null) {
                                    str17 = aweme18.getAuthorUid();
                                }
                                r.a("click_react_icon", a7.a("author_id", str17).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                            }
                        } else {
                            com.ss.android.ugc.aweme.app.f.d a8 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f75065i);
                            Aweme aweme19 = ((AbsAdProfileWidget) this).f75063a;
                            if (aweme19 != null) {
                                str12 = aweme19.getAid();
                            } else {
                                str12 = null;
                            }
                            com.ss.android.ugc.aweme.app.f.d a9 = a8.a("group_id", str12);
                            Aweme aweme20 = ((AbsAdProfileWidget) this).f75063a;
                            if (aweme20 != null) {
                                str17 = aweme20.getAuthorUid();
                            }
                            r.a("click_duet_icon", a9.a("author_id", str17).a("to_group_id", textExtraStruct.getAwemeId()).a("chain_type", "duet").f66730a);
                        }
                        str8 = "";
                        str7 = str8;
                        str9 = str7;
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107229h = i();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107229h) {
                        View view = this.f67008c;
                        l.b(view, "");
                        new com.bytedance.tux.g.b(view).e(R.string.de8).b();
                        return;
                    } else if (2 == textExtraStruct.getSubtype()) {
                        SmartRouter.buildRoute(this.f67007b, "aweme://aweme/detail/").withParam("id", str7).withParam("refer", "click_comment_chain").withParam("cid", str9 + ',' + str8).withParam("video_from", this.f75065i).open();
                        return;
                    } else {
                        SmartRouter.buildRoute(this.f67007b, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", this.f75065i).withParam("isChain", true).open();
                        return;
                    }
                }
            }
            Aweme aweme21 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme21 != null) {
                str = aweme21.getAid();
            } else {
                str = null;
            }
            r.a(StringSet.name, "video_at", str, textExtraStruct.getUserId());
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("group_id", "");
                Aweme aweme22 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme22 != null) {
                    str5 = aweme22.getRequestId();
                } else {
                    str5 = null;
                }
                jSONObject.put("request_id", str5);
                jSONObject.put("enter_from", this.f75065i);
                jSONObject.put("enter_method", "click_head");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            Aweme aweme23 = ((AbsAdProfileWidget) this).f75063a;
            if (!(aweme23 == null || aweme23.getAuthor() == null)) {
                MobClick labelName2 = MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage");
                Aweme aweme24 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme24 == null || (author = aweme24.getAuthor()) == null) {
                    str2 = null;
                } else {
                    str2 = author.getUid();
                }
                r.onEvent(labelName2.setValue(str2).setJsonObject(jSONObject));
                com.ss.android.ugc.aweme.app.f.d a10 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f75065i).a("to_user_id", textExtraStruct.getUserId());
                Aweme aweme25 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme25 != null) {
                    str3 = aweme25.getAid();
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.app.f.d a11 = a10.a("group_id", str3);
                Aweme aweme26 = ((AbsAdProfileWidget) this).f75063a;
                if (aweme26 != null) {
                    str4 = aweme26.getAuthorUid();
                } else {
                    str4 = null;
                }
                r.a("enter_personal_detail", a11.a("author_id", str4).a("enter_method", "video_at").f66730a);
            }
            SmartRoute withParam = SmartRouter.buildRoute(this.f67007b, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", this.f75065i);
            Aweme aweme27 = ((AbsAdProfileWidget) this).f75063a;
            if (aweme27 != null) {
                str17 = aweme27.getAid();
            }
            withParam.withParam("video_id", str17).open();
        }
    }

    private static void a(List<? extends TextExtraStruct> list, String str) {
        for (T t : list) {
            if (t != null) {
                if (t.getStart() < 0) {
                    t.setStart(0);
                }
                if (t.getEnd() > str.length()) {
                    t.setEnd(str.length());
                }
            }
        }
    }

    private static boolean a(TextExtraStruct textExtraStruct, String str) {
        if (str == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > str.length() || textExtraStruct.getStart() >= str.length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }
}
