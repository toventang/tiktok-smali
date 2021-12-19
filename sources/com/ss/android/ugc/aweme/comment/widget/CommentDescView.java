package com.ss.android.ugc.aweme.comment.widget;

import android.content.Context;
import android.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.h.v;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.gc;
import com.ss.android.ugc.aweme.feed.experiment.ad;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.ui.bf;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.ib;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import h.z;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.List;

public final class CommentDescView extends LinearLayout {
    public static final a y = new a((byte) 0);
    private final boolean A = com.ss.android.ugc.aweme.adaptation.c.f66191a;
    private boolean B;
    private boolean C;
    private Integer D;
    private boolean E;
    private h.f.a.a<z> F;

    /* renamed from: a  reason: collision with root package name */
    public final MentionTextView f72970a;

    /* renamed from: b  reason: collision with root package name */
    public final TuxTextView f72971b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f72972c;

    /* renamed from: d  reason: collision with root package name */
    public String f72973d = "";

    /* renamed from: e  reason: collision with root package name */
    public int f72974e;

    /* renamed from: f  reason: collision with root package name */
    public SpannableStringBuilder f72975f;

    /* renamed from: g  reason: collision with root package name */
    public int f72976g;

    /* renamed from: h  reason: collision with root package name */
    public SpannableStringBuilder f72977h;

    /* renamed from: i  reason: collision with root package name */
    public int f72978i;

    /* renamed from: j  reason: collision with root package name */
    int f72979j;

    /* renamed from: k  reason: collision with root package name */
    boolean f72980k;

    /* renamed from: l  reason: collision with root package name */
    public Aweme f72981l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.barrage.b f72982m;
    public final int n = AVExternalServiceImpl.a().publishService().getAddVideosExperiConsuSideCode();
    public Integer o;
    int p = 4;
    boolean q = true;
    public final boolean r = gc.a();
    public SpannableStringBuilder s;
    public List<? extends TextExtraStruct> t;
    public String[] u;
    public int v;
    public int w;
    public boolean x;
    private String z = "";

    static final class f implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f72995a = new f();

        static {
            Covode.recordClassIndex(44958);
        }

        f() {
        }
    }

    static {
        Covode.recordClassIndex(44949);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44951);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Integer getExtraBackgroundSpanColor() {
        return this.D;
    }

    public final boolean getMEnableToggle() {
        return this.q;
    }

    public final int getMMaxLinesWhenFold() {
        return this.p;
    }

    public final boolean getMUnableClickSpan() {
        return this.E;
    }

    public final h.f.a.a<z> getSpanClickInterceptor() {
        return this.F;
    }

    public final Integer getTextColor() {
        return this.o;
    }

    public static final class d implements MentionTextView.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentDescView f72993a;

        static {
            Covode.recordClassIndex(44956);
        }

        public d(CommentDescView commentDescView) {
            this.f72993a = commentDescView;
        }

        /* JADX WARNING: Removed duplicated region for block: B:124:0x0323  */
        @Override // com.ss.android.ugc.aweme.views.MentionTextView.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.model.TextExtraStruct r22) {
            /*
            // Method dump skipped, instructions count: 2235
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widget.CommentDescView.d.a(com.ss.android.ugc.aweme.model.TextExtraStruct):void");
        }
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean b2 = b();
        j.f107229h = b2;
        return b2;
    }

    public final CharSequence getEndTextWhenTruncated() {
        SpannableStringBuilder append = getEndOmitTextAndTime().append("   ").append((CharSequence) getContext().getString(R.string.bv8));
        l.b(append, "");
        return append;
    }

    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentDescView f72988a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f72989b;

        static {
            Covode.recordClassIndex(44953);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f72990a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f72991b;

            static {
                Covode.recordClassIndex(44954);
            }

            a(c cVar, int i2) {
                this.f72990a = cVar;
                this.f72991b = i2;
            }

            public final void run() {
                this.f72990a.f72988a.f72978i = this.f72990a.f72988a.f72970a.getHeight();
                this.f72990a.f72988a.f72976g = (this.f72990a.f72988a.f72978i * (this.f72991b + 10)) / this.f72990a.f72988a.p;
                this.f72990a.f72988a.a(true);
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f72992a;

            static {
                Covode.recordClassIndex(44955);
            }

            b(c cVar) {
                this.f72992a = cVar;
            }

            public final void run() {
                if (this.f72992a.f72988a.f72970a.getLineCount() != 0) {
                    this.f72992a.f72988a.f72970a.setLines(this.f72992a.f72988a.f72970a.getLineCount());
                    this.f72992a.f72988a.a(false);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:77:0x02bd, code lost:
            if (r10 == null) goto L_0x026a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x01d6  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x020e  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0233  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0246  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGlobalLayout() {
            /*
            // Method dump skipped, instructions count: 751
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.widget.CommentDescView.c.onGlobalLayout():void");
        }

        public c(CommentDescView commentDescView, Aweme aweme) {
            this.f72988a = commentDescView;
            this.f72989b = aweme;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentDescView f72994a;

        static {
            Covode.recordClassIndex(44957);
        }

        e(CommentDescView commentDescView) {
            this.f72994a = commentDescView;
        }

        public final void run() {
            int lineCount;
            MentionTextView mentionTextView = this.f72994a.f72970a;
            if (this.f72994a.x) {
                lineCount = Math.min(50, this.f72994a.f72970a.getLineCount());
            } else {
                lineCount = this.f72994a.f72970a.getLineCount();
            }
            mentionTextView.setLines(lineCount);
        }
    }

    public final SpannableStringBuilder getEndOmitTextAndTime() {
        Aweme aweme = this.f72981l;
        if (aweme == null) {
            l.a("mAweme");
        }
        String a2 = a(aweme.getCreateTime() * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "...").append((CharSequence) a2).setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.c5)), 3, a2.length() + 3, 33);
        return spannableStringBuilder;
    }

    public final CharSequence getPostTime() {
        Aweme aweme = this.f72981l;
        if (aweme == null) {
            l.a("mAweme");
        }
        String a2 = a(aweme.getCreateTime() * 1000);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " ".concat(String.valueOf(a2))).setSpan(new ForegroundColorSpan(androidx.core.content.b.c(getContext(), R.color.c5)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final void setExtraBackgroundSpanColor(Integer num) {
        this.D = num;
    }

    public final void setMEnableToggle(boolean z2) {
        this.q = z2;
    }

    public final void setMMaxLinesWhenFold(int i2) {
        this.p = i2;
    }

    public final void setMUnableClickSpan(boolean z2) {
        this.E = z2;
    }

    public final void setSpanClickInterceptor(h.f.a.a<z> aVar) {
        this.F = aVar;
    }

    public final void setTextColor(Integer num) {
        this.o = num;
    }

    public static final class b extends bf {

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<CommentDescView> f72984c;

        /* renamed from: d  reason: collision with root package name */
        private final SpannableStringBuilder f72985d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f72986e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f72987f;

        static {
            Covode.recordClassIndex(44952);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            l.d(view, "");
            CommentDescView commentDescView = this.f72984c.get();
            if (commentDescView == null) {
                return;
            }
            if (this.f72987f) {
                Aweme aweme = commentDescView.f72981l;
                if (aweme == null) {
                    l.a("mAweme");
                }
                boolean E = com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme);
                Aweme aweme2 = commentDescView.f72981l;
                if (aweme2 == null) {
                    l.a("mAweme");
                }
                if (aweme2.isAd() || !E) {
                    ba c2 = com.ss.android.ugc.aweme.commercialize.g.c();
                    Context context = commentDescView.getContext();
                    Aweme aweme3 = commentDescView.f72981l;
                    if (aweme3 == null) {
                        l.a("mAweme");
                    }
                    c2.a(context, aweme3, 1, f.f72995a);
                    return;
                }
                new com.bytedance.tux.g.b(commentDescView.f72970a).e(R.string.of).b();
                return;
            }
            commentDescView.a(this.f72985d, this.f72986e);
        }

        public b(CommentDescView commentDescView, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            l.d(commentDescView, "");
            l.d(spannableStringBuilder, "");
            this.f72985d = spannableStringBuilder;
            this.f72986e = z;
            this.f72987f = z2;
            this.f72984c = new WeakReference<>(commentDescView);
        }
    }

    public static final /* synthetic */ Aweme a(CommentDescView commentDescView) {
        Aweme aweme = commentDescView.f72981l;
        if (aweme == null) {
            l.a("mAweme");
        }
        return aweme;
    }

    static final class g implements MentionTextView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommentDescView f72996a;

        static {
            Covode.recordClassIndex(44959);
        }

        g(CommentDescView commentDescView) {
            this.f72996a = commentDescView;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.d
        public final boolean a(TextExtraStruct textExtraStruct) {
            l.d(textExtraStruct, "");
            if (this.f72996a.n == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    private final String a(long j2) {
        String d2;
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        if (instance.getTimeInMillis() - j2 <= 0) {
            Calendar instance2 = Calendar.getInstance();
            l.b(instance2, "");
            j2 = instance2.getTimeInMillis() - 1;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "standardize_timestamp", false)) {
            aa.a aVar = aa.s;
            d2 = aa.a.a(j2);
        } else {
            d2 = ib.d(getContext(), j2);
        }
        a.C0730a aVar2 = new a.C0730a();
        l.b(d2, "");
        String aVar3 = aVar2.a(p.a(d2, " ", " ", false)).f33382a.toString();
        l.b(aVar3, "");
        return aVar3;
    }

    public final void setDescSafely(CharSequence charSequence) {
        try {
            if (ad.a()) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "CommentDescView", "VideoDescView_setDescSafely desc:" + charSequence);
            }
            if (this.x) {
                Aweme aweme = this.f72981l;
                if (aweme == null) {
                    l.a("mAweme");
                }
                String descLanguage = aweme.getDescLanguage();
                if (!this.r || this.s == null || !p.e((CharSequence) charSequence.toString(), (CharSequence) "\n")) {
                    this.f72970a.a(charSequence, descLanguage);
                } else {
                    this.f72970a.a(this.s, descLanguage);
                }
            } else {
                Aweme aweme2 = this.f72981l;
                if (aweme2 == null) {
                    l.a("mAweme");
                }
                if (aweme2.isAd()) {
                    this.f72970a.setText(charSequence);
                    return;
                }
                Aweme aweme3 = this.f72981l;
                if (aweme3 == null) {
                    l.a("mAweme");
                }
                this.f72970a.a(charSequence, aweme3.getDescLanguage());
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r0v49. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.model.TextExtraStruct> */
    public final void setTextExtraList(Aweme aweme) {
        int c2;
        List list;
        if (aweme != null) {
            List textExtra = aweme.getTextExtra();
            if (this.r && (list = this.t) != null) {
                textExtra = list;
            }
            if (!aweme.isScheduleVideo()) {
                this.f72970a.a(textExtra, new com.ss.android.ugc.aweme.shortvideo.view.f(), new g(this));
            }
            CommerceChallengeServiceImpl.e().a(this.f72970a, aweme, this.f72973d);
            if (textExtra != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : textExtra) {
                    l.b(textExtraStruct, "");
                    if ((a(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype() || 5 == textExtraStruct.getSubtype() || 7 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (a(textExtraStruct) && this.n == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        Integer num = this.D;
                        if (num != null) {
                            c2 = num.intValue();
                        } else {
                            c2 = androidx.core.content.b.c(getContext(), R.color.f159923g);
                        }
                        Context context = getContext();
                        l.b(context, "");
                        com.ss.android.ugc.aweme.commercialize.ad.d dVar = new com.ss.android.ugc.aweme.commercialize.ad.d(context, (float) h.g.a.a(((float) n.a(getContext())) - (n.b(getContext(), 100.0f) + getContext().getResources().getDimension(R.dimen.g5))), c2, androidx.core.content.b.c(getContext(), R.color.bx), textExtraStruct, true);
                        dVar.f73655b = n.b(getContext(), 12.0f);
                        dVar.f73656c = n.b(getContext(), 2.0f);
                        dVar.f73654a = n.b(getContext(), 13.0f);
                        this.f72970a.a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        if (4 == textExtraStruct.getSubtype()) {
                            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f72973d);
                            Aweme aweme2 = this.f72981l;
                            if (aweme2 == null) {
                                l.a("mAweme");
                            }
                            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme2.getAid());
                            Aweme aweme3 = this.f72981l;
                            if (aweme3 == null) {
                                l.a("mAweme");
                            }
                            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", aweme3.getAuthorUid());
                            Aweme aweme4 = this.f72981l;
                            if (aweme4 == null) {
                                l.a("mAweme");
                            }
                            r.a("duet_with_show", a4.a("music_id", ac.d(aweme4)).f66730a);
                        }
                    }
                }
            }
            this.f72970a.setAdHashTag(aweme);
        }
    }

    public final void a(boolean z2) {
        boolean z3;
        boolean z4;
        int i2;
        Context context = getContext();
        if (context != null) {
            Aweme aweme = this.f72981l;
            if (aweme == null) {
                l.a("mAweme");
            }
            if (aweme.getDesc() != null) {
                boolean a2 = gb.a(context);
                boolean isRtl = BidiFormatter.getInstance().isRtl(aweme.getDesc());
                int i3 = 1;
                if (a2 != isRtl) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                try {
                    ViewGroup.LayoutParams layoutParams = this.f72970a.getLayoutParams();
                    if (layoutParams != null) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        if (z2) {
                            if (!this.C) {
                                if (z3) {
                                    if (this.B) {
                                        return;
                                    }
                                } else if (!this.B) {
                                    return;
                                }
                            }
                            this.C = false;
                            if (!this.B) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            this.B = z4;
                            MentionTextView mentionTextView = this.f72970a;
                            if (!isRtl) {
                                i3 = 0;
                            }
                            v.b((View) mentionTextView, i3);
                            ViewGroup.LayoutParams layoutParams3 = this.f72971b.getLayoutParams();
                            if (layoutParams3 != null) {
                                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                                if (isRtl) {
                                    i2 = 83;
                                } else {
                                    i2 = 85;
                                }
                                layoutParams4.gravity = i2;
                                this.f72971b.setLayoutParams(layoutParams4);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                            }
                        } else if (v.e(this.f72970a) != a2) {
                            this.C = true;
                            MentionTextView mentionTextView2 = this.f72970a;
                            if (!a2) {
                                i3 = 0;
                            }
                            v.b((View) mentionTextView2, i3);
                        } else {
                            return;
                        }
                        this.f72970a.setLayoutParams(layoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(TextExtraStruct textExtraStruct) {
        Aweme aweme = this.f72981l;
        if (aweme == null) {
            l.a("mAweme");
        }
        if (aweme.getDesc() == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0) {
            return false;
        }
        int end = textExtraStruct.getEnd();
        Aweme aweme2 = this.f72981l;
        if (aweme2 == null) {
            l.a("mAweme");
        }
        if (end > aweme2.getDesc().length()) {
            return false;
        }
        int start = textExtraStruct.getStart();
        Aweme aweme3 = this.f72981l;
        if (aweme3 == null) {
            l.a("mAweme");
        }
        if (start >= aweme3.getDesc().length() || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    public CommentDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(1342);
        View.inflate(getContext(), R.layout.j9, this);
        View findViewById = findViewById(R.id.ak7);
        l.b(findViewById, "");
        this.f72970a = (MentionTextView) findViewById;
        View findViewById2 = findViewById(R.id.f9q);
        l.b(findViewById2, "");
        TuxTextView tuxTextView = (TuxTextView) findViewById2;
        this.f72971b = tuxTextView;
        View findViewById3 = findViewById(R.id.akd);
        l.b(findViewById3, "");
        this.f72972c = (FrameLayout) findViewById3;
        tuxTextView.setOnClickListener(new View.OnClickListener(this) {
            /* class com.ss.android.ugc.aweme.comment.widget.CommentDescView.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CommentDescView f72983a;

            static {
                Covode.recordClassIndex(44950);
            }

            {
                this.f72983a = r1;
            }

            public final void onClick(View view) {
                CharSequence charSequence;
                ClickAgent.onClick(view);
                if (TextUtils.isEmpty(this.f72983a.f72975f) || TextUtils.isEmpty(this.f72983a.f72977h)) {
                    CommentDescView commentDescView = this.f72983a;
                    Aweme a2 = CommentDescView.a(this.f72983a);
                    CharSequence charSequence2 = null;
                    if (a2 != null) {
                        charSequence = a2.getProcessedDesc();
                    } else {
                        charSequence = null;
                    }
                    commentDescView.f72975f = new SpannableStringBuilder(charSequence);
                    CommentDescView commentDescView2 = this.f72983a;
                    Aweme a3 = CommentDescView.a(this.f72983a);
                    if (a3 != null) {
                        charSequence2 = a3.getEllipsizeDesc();
                    }
                    commentDescView2.f72977h = new SpannableStringBuilder(charSequence2);
                }
                boolean a4 = l.a((Object) this.f72983a.f72971b.getText().toString(), (Object) this.f72983a.getContext().getString(R.string.bv8));
                if (a4) {
                    SpannableStringBuilder spannableStringBuilder = this.f72983a.f72975f;
                    if (spannableStringBuilder != null) {
                        this.f72983a.a(spannableStringBuilder, a4);
                        return;
                    }
                    return;
                }
                SpannableStringBuilder spannableStringBuilder2 = this.f72983a.f72977h;
                if (spannableStringBuilder2 != null) {
                    this.f72983a.a(spannableStringBuilder2, a4);
                }
            }
        });
        this.x = true;
        MethodCollector.o(1342);
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, boolean z2) {
        String str;
        int i2;
        if (z2) {
            str = "spread";
        } else {
            str = "fold";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f72973d);
        Aweme aweme = this.f72981l;
        if (aweme == null) {
            l.a("mAweme");
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", aweme.getAid());
        Aweme aweme2 = this.f72981l;
        if (aweme2 == null) {
            l.a("mAweme");
        }
        r.a("video_detail", a3.a("author_id", aweme2.getAuthorUid()).a("action_type", str).f66730a);
        if (z2) {
            i2 = 50;
        } else {
            if (this.f72981l == null) {
                l.a("mAweme");
            }
            i2 = this.p;
        }
        setDescSafely(spannableStringBuilder);
        if (this.f72979j == 0) {
            this.f72979j = this.f72971b.getHeight();
        }
        int i3 = this.f72972c.getLayoutParams().height;
        if (z2) {
            this.f72970a.post(new e(this));
            this.f72971b.setText(R.string.bv7);
            return;
        }
        if (this.x) {
            this.f72970a.scrollTo(0, 0);
        }
        CharSequence text = this.f72970a.getText();
        l.b(text, "");
        if (text.length() > 0) {
            MentionTextView mentionTextView = this.f72970a;
            if (this.f72981l == null) {
                l.a("mAweme");
            }
            mentionTextView.setLines(this.p);
        } else {
            this.f72970a.setMaxLines(i2);
        }
        this.f72971b.setText(R.string.bv8);
    }

    /* access modifiers changed from: package-private */
    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z2, boolean z3) {
        b bVar = new b(this, spannableStringBuilder2, z2, z3);
        bVar.f94343a = 0;
        spannableStringBuilder.setSpan(bVar, 0, spannableStringBuilder.length(), 17);
    }

    public final int a(CharSequence charSequence, String str, int i2, int i3, int i4) {
        float f2;
        try {
            float measureText = this.f72971b.getPaint().measureText(str);
            int width = this.f72970a.getWidth();
            float measureText2 = this.f72970a.getPaint().measureText(charSequence, i3, i4);
            SpannableStringBuilder endOmitTextAndTime = getEndOmitTextAndTime();
            if (this.A) {
                f2 = this.f72970a.getPaint().measureText(endOmitTextAndTime, 0, str.length());
            } else {
                f2 = 0.0f;
            }
            float f3 = ((measureText2 + measureText) + f2) - ((float) width);
            if (f3 <= 0.0f) {
                return 0;
            }
            int i5 = 1;
            int i6 = (i4 - i3) + 1;
            if (i6 > 0) {
                while (this.f72970a.getPaint().measureText(charSequence, i4 - i5, i4) < f3) {
                    if (i5 != i6) {
                        i5++;
                    }
                }
                return i5;
            }
            return i2 + 1;
        } catch (Exception unused) {
            return i2;
        }
    }
}
