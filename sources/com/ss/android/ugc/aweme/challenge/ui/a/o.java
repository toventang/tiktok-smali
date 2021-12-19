package com.ss.android.ugc.aweme.challenge.ui.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.ss.android.ugc.aweme.challenge.ui.g;
import com.ss.android.ugc.aweme.challenge.ui.x;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.m.p;
import h.n;
import h.z;
import java.text.Bidi;
import java.util.Objects;

public final class o extends a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f70099h = new a((byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private TextView f70100i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f70101j;

    /* renamed from: k  reason: collision with root package name */
    private View f70102k;

    /* renamed from: l  reason: collision with root package name */
    private View f70103l;

    /* renamed from: m  reason: collision with root package name */
    private View f70104m;
    private TextView n;
    private ViewGroup o;
    private TextView p;
    private TextView q;
    private ImageView r;
    private View s;
    private i t;

    final /* synthetic */ class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f70105a;

        static {
            Covode.recordClassIndex(43238);
        }

        b(h.f.a.a aVar) {
            this.f70105a = aVar;
        }

        public final /* synthetic */ void run() {
            l.b(this.f70105a.invoke(), "");
        }
    }

    static {
        Covode.recordClassIndex(43236);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getLayoutResId() {
        return R.layout.n6;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43237);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final /* synthetic */ class d extends j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(43240);
        }

        d(o oVar) {
            super(0, oVar, o.class, "relayoutButton", "relayoutButton()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((o) this.receiver).e();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void a() {
        l a2 = ChallengeDetailProvicer.b().a();
        l.b(a2, "");
        a(a2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getAttrsResId() {
        int i2 = p.f70107a[getMHeaderParam().f70084b.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return R.layout.mz;
        }
        throw new n();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final int getButtonResId() {
        int i2 = p.f70108b[getMHeaderParam().f70085c.ordinal()];
        if (i2 == 1) {
            return R.layout.n0;
        }
        if (i2 == 2) {
            return R.layout.n1;
        }
        throw new n();
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void b() {
        MethodCollector.i(11366);
        View findViewById = findViewById(R.id.my);
        l.b(findViewById, "");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.n1);
        l.b(findViewById2, "");
        this.f70100i = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.mz);
        l.b(findViewById3, "");
        this.f70101j = (TextView) findViewById3;
        l.b(inflate, "");
        this.f70102k = inflate;
        View findViewById4 = findViewById(R.id.a0z);
        l.b(findViewById4, "");
        ViewStub viewStub2 = (ViewStub) findViewById4;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById5 = inflate2.findViewById(R.id.a8e);
        l.b(findViewById5, "");
        View findViewById6 = inflate2.findViewById(R.id.bvi);
        l.b(findViewById6, "");
        this.t = new i(findViewById5, (CheckableImageView) findViewById6, (TextView) inflate2.findViewById(R.id.ex4), getDetailParam());
        l.b(inflate2, "");
        this.f70103l = inflate2;
        super.b();
        MethodCollector.o(11366);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
        // Method dump skipped, instructions count: 147
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.challenge.ui.a.o.e():void");
    }

    public static final class c extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f70106a;

        static {
            Covode.recordClassIndex(43239);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(o oVar) {
            this.f70106a = oVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
            textPaint.setColor(androidx.core.content.b.c(this.f70106a.getContext(), R.color.c5));
        }

        public final void onClick(View view) {
            l.d(view, "");
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "challenge");
            User author = this.f70106a.getMChallenge().getAuthor();
            l.b(author, "");
            r.a("click_account_button", a2.a("secuid", author.getSecUid()).a("page_type", "challenge").a("tag_id", this.f70106a.getMChallenge().getCid()).f66730a);
            SmartRoute buildRoute = SmartRouter.buildRoute(com.bytedance.ies.ugc.appcontext.d.a(), "aweme://user/profile/");
            User author2 = this.f70106a.getMChallenge().getAuthor();
            l.b(author2, "");
            SmartRoute withParam = buildRoute.withParam("uid", author2.getUid());
            User author3 = this.f70106a.getMChallenge().getAuthor();
            l.b(author3, "");
            withParam.withParam("sec_user_id", author3.getSecUid()).open();
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.a.a
    public final void a(ChallengeDetail challengeDetail) {
        int i2;
        int i3;
        int i4;
        int i5;
        String replaceAll;
        int i6;
        float dimension;
        boolean z;
        String nickname;
        Integer num;
        boolean z2;
        boolean z3;
        int i7;
        int i8;
        MethodCollector.i(11869);
        String str = "";
        l.d(challengeDetail, str);
        if (challengeDetail.challenge == null) {
            MethodCollector.o(11869);
            return;
        }
        super.a(challengeDetail);
        String a2 = com.ss.android.ugc.aweme.i18n.b.a(getMChallenge().getDisplayCount());
        a.C0730a aVar = new a.C0730a();
        Context context = getContext();
        l.b(context, str);
        Resources resources = context.getResources();
        l.b(resources, str);
        l.b(a2, str);
        int i9 = 0;
        com.bytedance.ies.dmt.ui.d.a aVar2 = aVar.a(resources, R.string.aat, a2).f33382a;
        TextView textView = this.f70101j;
        if (textView == null) {
            l.a("mAttrsFirst");
        }
        textView.setText(aVar2);
        TextView textView2 = this.f70100i;
        if (textView2 == null) {
            l.a("mAttrsLink");
        }
        textView2.setVisibility(8);
        String str2 = null;
        if (getMChallenge().isCommerce() && getMChallenge().getAuthor() != null) {
            User author = getMChallenge().getAuthor();
            l.b(author, str);
            String nickname2 = author.getNickname();
            if (!(nickname2 == null || nickname2.length() == 0)) {
                TextView textView3 = this.f70100i;
                if (textView3 == null) {
                    l.a("mAttrsLink");
                }
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                boolean a3 = b.a(getMChallenge().getSponsorLabelText());
                if (!b.a(getMChallenge().getSponsorAdLabel()) || a3) {
                    z = false;
                } else {
                    z = true;
                }
                if (a3) {
                    nickname = getMChallenge().getSponsorLabelText();
                    l.b(nickname, str);
                    User author2 = getMChallenge().getAuthor();
                    l.b(author2, str);
                    String nickname3 = author2.getNickname();
                    l.b(nickname3, str);
                    num = Integer.valueOf(p.a((CharSequence) nickname, nickname3, 0, false, 6));
                } else {
                    if (b.a(getMChallenge().getSponsorAdLabel())) {
                        StringBuilder append = new StringBuilder().append(getMChallenge().getSponsorAdLabel());
                        Context context2 = getContext();
                        l.b(context2, str);
                        StringBuilder append2 = append.append(context2.getResources().getString(R.string.g2t));
                        Context context3 = getContext();
                        l.b(context3, str);
                        StringBuilder append3 = append2.append(context3.getResources().getString(R.string.g2t));
                        User author3 = getMChallenge().getAuthor();
                        l.b(author3, str);
                        nickname = append3.append(author3.getNickname()).toString();
                    } else {
                        User author4 = getMChallenge().getAuthor();
                        l.b(author4, str);
                        nickname = author4.getNickname();
                    }
                    num = null;
                }
                User author5 = getMChallenge().getAuthor();
                if (author5 != null) {
                    str2 = author5.getSecUid();
                }
                if (b.a(str2)) {
                    User author6 = getMChallenge().getAuthor();
                    l.b(author6, str);
                    if (author6.getCommerceUserLevel() == 2) {
                        StringBuilder append4 = new StringBuilder().append(nickname);
                        Context context4 = getContext();
                        l.b(context4, str);
                        nickname = append4.append(context4.getResources().getString(R.string.g2t)).toString();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = true;
                } else {
                    z2 = false;
                    z3 = false;
                }
                l.b(nickname, str);
                if (z) {
                    i7 = 1;
                } else {
                    i7 = 2;
                }
                spannableStringBuilder.append((CharSequence) a(nickname, z, z2, z3, i7));
                if (z) {
                    spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.views.b(getContext(), androidx.core.content.b.c(getContext(), R.color.f159923g), getMChallenge().getSponsorAdLabel(), androidx.core.content.b.c(getContext(), R.color.c6)), 0, getMChallenge().getSponsorAdLabel().length(), 33);
                }
                if (z2) {
                    TextView textView4 = this.f70100i;
                    if (textView4 == null) {
                        l.a("mAttrsLink");
                    }
                    com.bytedance.ies.dmt.ui.common.a aVar3 = new com.bytedance.ies.dmt.ui.common.a(textView4.getContext(), 2131231577);
                    spannableStringBuilder.append((CharSequence) ".");
                    spannableStringBuilder.setSpan(aVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                if (z3) {
                    Context context5 = getContext();
                    l.b(context5, str);
                    Drawable drawable = context5.getResources().getDrawable(2131231578);
                    if (gb.a()) {
                        Context context6 = getContext();
                        l.b(context6, str);
                        drawable = context6.getResources().getDrawable(2131231576);
                    }
                    drawable.setBounds(0, 0, (int) com.bytedance.common.utility.n.b(getContext(), 10.0f), (int) com.bytedance.common.utility.n.b(getContext(), 10.0f));
                    com.bytedance.ies.dmt.ui.common.a aVar4 = new com.bytedance.ies.dmt.ui.common.a(drawable);
                    spannableStringBuilder.append((CharSequence) ".");
                    spannableStringBuilder.setSpan(aVar4, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                }
                if (a3 && num != null && num.intValue() >= 0) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int min = Math.min(num.intValue(), spannableStringBuilder.length() - 1);
                    int intValue = num.intValue();
                    User author7 = getMChallenge().getAuthor();
                    l.b(author7, str);
                    spannableStringBuilder.setSpan(styleSpan, min, Math.min(intValue + author7.getNickname().length(), spannableStringBuilder.length()), 33);
                }
                if (z3) {
                    c cVar = new c(this);
                    if (z) {
                        i8 = getMChallenge().getSponsorAdLabel().length() + 1;
                    } else {
                        i8 = 0;
                    }
                    spannableStringBuilder.setSpan(cVar, i8, spannableStringBuilder.length(), 33);
                    TextView textView5 = this.f70100i;
                    if (textView5 == null) {
                        l.a("mAttrsLink");
                    }
                    textView5.setMovementMethod(LinkMovementMethod.getInstance());
                }
                TextView textView6 = this.f70100i;
                if (textView6 == null) {
                    l.a("mAttrsLink");
                }
                textView6.setText(spannableStringBuilder);
            }
        }
        i iVar = this.t;
        if (iVar == null) {
            l.a("mCollectButtonBlock");
        }
        iVar.a(getMChallenge(), getMHeaderParam());
        View view = this.f70103l;
        if (view == null) {
            l.a("mButtonContainer");
        }
        view.post(new b(new d(this)));
        ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
        if (challengeAnnouncement != null) {
            String title = challengeAnnouncement.getTitle();
            String content = challengeAnnouncement.getContent();
            if (!TextUtils.isEmpty(title) && !TextUtils.isEmpty(content)) {
                if (this.f70104m == null) {
                    View inflate = ((ViewStub) findViewById(R.id.fkw)).inflate();
                    if (inflate != null) {
                        this.f70104m = (ViewGroup) inflate;
                        View findViewById = findViewById(R.id.a42);
                        l.b(findViewById, str);
                        this.n = (TextView) findViewById;
                        View findViewById2 = findViewById(R.id.a40);
                        l.b(findViewById2, str);
                        this.o = (ViewGroup) findViewById2;
                        View findViewById3 = findViewById(R.id.a3y);
                        l.b(findViewById3, str);
                        this.p = (TextView) findViewById3;
                        View findViewById4 = findViewById(R.id.a3z);
                        l.b(findViewById4, str);
                        this.q = (TextView) findViewById4;
                        View findViewById5 = findViewById(R.id.a41);
                        l.b(findViewById5, str);
                        this.r = (ImageView) findViewById5;
                        View findViewById6 = findViewById(R.id.cae);
                        l.b(findViewById6, str);
                        this.s = findViewById6;
                        ImageView imageView = this.r;
                        if (imageView == null) {
                            l.a("mAnnounceExpandIv");
                        }
                        imageView.setImageDrawable(getResources().getDrawable(2131231575));
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                        MethodCollector.o(11869);
                        throw nullPointerException;
                    }
                }
                View view2 = this.s;
                if (view2 == null) {
                    l.a("mAnnounceDivider");
                }
                if (TextUtils.isEmpty(getMChallenge().getDesc())) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                view2.setVisibility(i2);
                TextView textView7 = this.n;
                if (textView7 == null) {
                    l.a("mAnnounceTitle");
                }
                textView7.setText(title);
                View view3 = this.f70104m;
                if (view3 == null) {
                    l.b();
                }
                view3.setVisibility(0);
                Challenge mChallenge = getMChallenge();
                TextView textView8 = this.p;
                if (textView8 == null) {
                    l.a("mAnnounceContent");
                }
                ViewGroup viewGroup = this.o;
                if (viewGroup == null) {
                    l.a("mAnnounceExpandContainer");
                }
                TextView textView9 = this.q;
                if (textView9 == null) {
                    l.a("mAnnounceExpandTv");
                }
                ImageView imageView2 = this.r;
                if (imageView2 == null) {
                    l.a("mAnnounceExpandIv");
                }
                if (mChallenge != null) {
                    boolean a4 = com.ss.android.ugc.aweme.challenge.ui.l.a(SharePrefCache.inst().getShowHashTagBg().c());
                    String content2 = mChallenge.getChallengeAnnouncement().getContent();
                    if (!TextUtils.isEmpty(content2)) {
                        if (gb.a(textView8.getContext())) {
                            i3 = -1;
                        } else {
                            i3 = -2;
                        }
                        boolean baseIsLeftToRight = new Bidi(content2, i3).baseIsLeftToRight();
                        boolean a5 = gb.a(viewGroup.getContext());
                        v.b((View) textView8.getParent(), !baseIsLeftToRight);
                        if (baseIsLeftToRight != 0) {
                            i4 = 3;
                        } else {
                            i4 = 5;
                        }
                        textView8.setGravity(i4);
                        int i10 = Build.VERSION.SDK_INT;
                        if (baseIsLeftToRight != 0) {
                            i5 = 3;
                        } else {
                            i5 = 2;
                        }
                        textView8.setTextDirection(i5);
                        viewGroup.setLayoutDirection(a5 ? 1 : 0);
                        String b2 = androidx.core.f.a.a(!baseIsLeftToRight).b(content2);
                        if (baseIsLeftToRight != 0) {
                            replaceAll = "‭" + b2 + (char) 8237;
                        } else {
                            replaceAll = b2.replaceAll("(?<!^)(#)([a-zA-Z0-9])", "‎$1‎$2");
                        }
                        if (!TextUtils.equals(textView8.getText(), replaceAll)) {
                            if (!TextUtils.isEmpty(textView8.getText())) {
                                imageView2.setSelected(false);
                                if (textView9 != null) {
                                    textView9.setText(h.b(R.string.bqv));
                                }
                                imageView2.setRotation(0.0f);
                                textView8.getLayoutParams().height = -2;
                                if (a4) {
                                    dimension = com.bytedance.common.utility.n.b(imageView2.getContext(), 20.0f);
                                } else {
                                    dimension = imageView2.getResources().getDimension(R.dimen.ed);
                                }
                                int i11 = (int) dimension;
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                                if (a4) {
                                    marginLayoutParams.bottomMargin = i11;
                                } else {
                                    marginLayoutParams.topMargin = i11;
                                }
                                viewGroup.setLayoutParams(marginLayoutParams);
                            }
                            int i12 = 32;
                            if (a4) {
                                i12 = 64;
                            }
                            int a6 = (int) (((float) com.bytedance.common.utility.n.a(textView8.getContext())) - com.bytedance.common.utility.n.b(textView8.getContext(), (float) i12));
                            SpannableString spannableString = new SpannableString(replaceAll);
                            if (textView9 != null) {
                                str = textView9.getText().toString();
                            }
                            g gVar = new g(textView8.getPaint(), a6, str);
                            com.ss.android.ugc.aweme.challenge.b bVar = new com.ss.android.ugc.aweme.challenge.b(mChallenge.getCid(), mChallenge.getChallengeName());
                            bVar.f69870a = gVar;
                            SpannableString a7 = bVar.a(spannableString);
                            boolean z4 = gVar.f70142b;
                            if (bVar.f69903d) {
                                textView8.setText(a7);
                                if (x.f70225a == null) {
                                    x.f70225a = new x();
                                }
                                textView8.setMovementMethod(x.f70225a);
                            } else {
                                textView8.setText(a7);
                            }
                            if (z4) {
                                new DynamicLayout(spannableString.toString(), textView8.getPaint(), a6, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getHeight();
                                if (!TextUtils.isEmpty(replaceAll)) {
                                    i6 = 0;
                                } else {
                                    i6 = 8;
                                }
                                textView9.setVisibility(i6);
                                if (TextUtils.isEmpty(replaceAll)) {
                                    i9 = 8;
                                }
                                imageView2.setVisibility(i9);
                                textView8.post(new com.ss.android.ugc.aweme.challenge.ui.d(textView8, spannableString, imageView2, textView9, viewGroup, a4, a7));
                                MethodCollector.o(11869);
                                return;
                            }
                            imageView2.setVisibility(8);
                            textView9.setVisibility(8);
                        }
                    }
                }
                MethodCollector.o(11869);
                return;
            }
        }
        View view4 = this.f70104m;
        if (view4 != null) {
            view4.setVisibility(8);
            MethodCollector.o(11869);
            return;
        }
        MethodCollector.o(11869);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private o(Context context, j jVar) {
        super(context, jVar, null);
        l.d(context, "");
    }

    public /* synthetic */ o(Context context, j jVar, byte b2) {
        this(context, jVar);
    }

    private static String a(String str, int i2, boolean z) {
        if (z) {
            StringBuilder sb = new StringBuilder();
            int max = Math.max(i2 - 1, 1);
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(0, max);
            l.b(substring, "");
            return sb.append(substring).append("... ").toString();
        }
        StringBuilder sb2 = new StringBuilder();
        int max2 = Math.max(i2, 1);
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring2 = str.substring(0, max2);
        l.b(substring2, "");
        return sb2.append(substring2).append("...").toString();
    }

    private final String a(String str, boolean z, boolean z2, boolean z3, int i2) {
        float f2;
        String str2 = str;
        int b2 = i.b(getContext()) - ((int) com.bytedance.common.utility.n.b(getContext(), 168.0f));
        if (z) {
            f2 = com.bytedance.common.utility.n.b(getContext(), 10.0f);
        } else {
            f2 = 0.0f;
        }
        if (z3) {
            f2 += com.bytedance.common.utility.n.b(getContext(), 10.0f);
            if (z2) {
                f2 += com.bytedance.common.utility.n.b(getContext(), 10.0f);
            }
        }
        TextView textView = this.f70100i;
        if (textView == null) {
            l.a("mAttrsLink");
        }
        DynamicLayout dynamicLayout = new DynamicLayout(str2, textView.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        int lineCount = dynamicLayout.getLineCount();
        if (lineCount >= i2) {
            int i3 = i2 - 1;
            str2 = str2.subSequence(0, dynamicLayout.getLineEnd(i3)).toString();
            if (lineCount > i2) {
                String a2 = a(str2, str2.length() - 2, z2);
                TextView textView2 = this.f70100i;
                if (textView2 == null) {
                    l.a("mAttrsLink");
                }
                str2 = a2;
                b2 = b2;
                dynamicLayout = new DynamicLayout(str2, textView2.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            while (dynamicLayout.getLineCount() > i2) {
                str2 = a(str2, str2.length() - 5, z2);
                TextView textView3 = this.f70100i;
                if (textView3 == null) {
                    l.a("mAttrsLink");
                }
                dynamicLayout = new DynamicLayout(str2, textView3.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            float f3 = (float) b2;
            TextView textView4 = this.f70100i;
            if (textView4 == null) {
                l.a("mAttrsLink");
            }
            float measureText = f3 - textView4.getPaint().measureText(str2, dynamicLayout.getLineStart(i3), dynamicLayout.getLineEnd(i3));
            if (dynamicLayout.getLineCount() == i2 && measureText < f2) {
                str2 = a(str2, str2.length() - 2, z2);
                TextView textView5 = this.f70100i;
                if (textView5 == null) {
                    l.a("mAttrsLink");
                }
                DynamicLayout dynamicLayout2 = new DynamicLayout(str2, textView5.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                while (dynamicLayout2.getLineCount() > i2) {
                    str2 = a(str2, str2.length() - 5, z2);
                    TextView textView6 = this.f70100i;
                    if (textView6 == null) {
                        l.a("mAttrsLink");
                    }
                    dynamicLayout2 = new DynamicLayout(str2, textView6.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                }
            }
            while (measureText < f2) {
                str2 = a(str2, str2.length() - 5, z2);
                TextView textView7 = this.f70100i;
                if (textView7 == null) {
                    l.a("mAttrsLink");
                }
                DynamicLayout dynamicLayout3 = new DynamicLayout(str2, textView7.getPaint(), b2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                TextView textView8 = this.f70100i;
                if (textView8 == null) {
                    l.a("mAttrsLink");
                }
                measureText = f3 - textView8.getPaint().measureText(str2, dynamicLayout3.getLineStart(i3), dynamicLayout3.getLineEnd(i3));
            }
        }
        return str2;
    }
}
