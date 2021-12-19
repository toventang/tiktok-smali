package com.ss.android.ugc.aweme.feed.assem.desc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.VideoReplyStruct;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.ui.aw;
import com.ss.android.ugc.aweme.feed.ui.bf;
import com.ss.android.ugc.aweme.feed.ui.bv;
import com.ss.android.ugc.aweme.feed.widget.b;
import com.ss.android.ugc.aweme.feed.widget.j;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.mix.MixHelperService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.translation.ui.TranslationStatusView;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.views.MentionTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONObject;

public final class c extends com.ss.android.ugc.aweme.feed.assem.base.a<c> {
    public static final h A = new h((byte) 0);
    static final /* synthetic */ h.k.i[] u = {new h.f.b.y(c.class, "videoDescVM", "getVideoDescVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/VideoDescVM;", 0), new h.f.b.y(c.class, "promotedTagVM", "getPromotedTagVM()Lcom/ss/android/ugc/aweme/feed/assem/desc/PromotedTagVM;", 0)};
    public static final boolean y;
    public static final int z;
    private final h.h.d B;
    private final h.h.d C;
    private final h.h D;
    private final h.h E;
    private final h.h F;
    private final h.h G;
    private final h.h H;
    private final h.h I;
    private final h.h J;
    private final h.h K;
    private SparseArray L;
    public aw v;
    public bv w;
    public final int x;

    public static final class b extends h.f.b.m implements h.f.a.b<l, l> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58154);
        }

        public b() {
            super(1);
        }

        public final l invoke(l lVar) {
            h.f.b.l.c(lVar, "");
            return lVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<b, b> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58156);
        }

        public d() {
            super(1);
        }

        public final b invoke(b bVar) {
            h.f.b.l.c(bVar, "");
            return bVar;
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58157);
        }

        public e() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    private VideoViewModel P() {
        return (VideoViewModel) this.D.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.t1;
    }

    public final VideoDescVM F() {
        return (VideoDescVM) this.B.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.L == null) {
            this.L = new SparseArray();
        }
        View view = (View) this.L.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.L.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final MentionTextView H() {
        return (MentionTextView) this.E.getValue();
    }

    public final TuxTextView I() {
        return (TuxTextView) this.F.getValue();
    }

    public final TuxTextView J() {
        return (TuxTextView) this.G.getValue();
    }

    public final TuxTag K() {
        return (TuxTag) this.H.getValue();
    }

    public final TranslationStatusView L() {
        return (TranslationStatusView) this.I.getValue();
    }

    public final LinearLayout M() {
        return (LinearLayout) this.J.getValue();
    }

    public final FrameLayout N() {
        return (FrameLayout) this.K.getValue();
    }

    public static final class h {
        static {
            Covode.recordClassIndex(58160);
        }

        private h() {
        }

        public /* synthetic */ h(byte b2) {
            this();
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58158);
        }

        public f() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58159);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    static final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92183a;

        static {
            Covode.recordClassIndex(58168);
        }

        n(c cVar) {
            this.f92183a = cVar;
        }

        public final void run() {
            this.f92183a.O();
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58151);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.B().findViewById(R.id.dch);
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<TuxTag> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTag invoke() {
            return this.this$0.B().findViewById(R.id.epz);
        }
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92181a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92182b;

        static {
            Covode.recordClassIndex(58167);
        }

        m(c cVar, VideoItemParams videoItemParams) {
            this.f92181a = cVar;
            this.f92182b = videoItemParams;
        }

        public final void run() {
            this.f92181a.b(this.f92182b.mAweme);
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58174);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.B().findViewById(R.id.f9q);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.a<MentionTextView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MentionTextView invoke() {
            return this.this$0.B().findViewById(R.id.ak7);
        }
    }

    static final class u extends h.f.b.m implements h.f.a.a<FrameLayout> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58176);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ FrameLayout invoke() {
            return this.this$0.B().findViewById(R.id.akd);
        }
    }

    static final class v extends h.f.b.m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58177);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        v(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            return this.this$0.B().findViewById(R.id.ako);
        }
    }

    static final class w extends h.f.b.m implements h.f.a.a<TranslationStatusView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(58178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TranslationStatusView invoke() {
            return this.this$0.B().findViewById(R.id.eqo);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final void a() {
        F().a((Context) null);
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.desc.c$c  reason: collision with other inner class name */
    public static final class C2234c extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2234c(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92179a;

        static {
            Covode.recordClassIndex(58165);
        }

        k(c cVar) {
            this.f92179a = cVar;
        }

        public final void run() {
            if (this.f92179a.M() != null) {
                this.f92179a.M().invalidate();
            }
        }
    }

    static final class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92184a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92185b;

        static {
            Covode.recordClassIndex(58169);
        }

        o(c cVar, VideoItemParams videoItemParams) {
            this.f92184a = cVar;
            this.f92185b = videoItemParams;
        }

        public final void run() {
            c cVar = this.f92184a;
            Aweme aweme = this.f92185b.mAweme;
            h.f.b.l.b(aweme, "");
            h.f.b.l.b(this.f92185b.mEventType, "");
            int i2 = this.f92185b.mPageType;
            cVar.a(aweme);
        }
    }

    public static final class j implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92174a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f92175b;

        static {
            Covode.recordClassIndex(58162);
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f92178a;

            static {
                Covode.recordClassIndex(58164);
            }

            b(j jVar) {
                this.f92178a = jVar;
            }

            public final void run() {
                MentionTextView H = this.f92178a.f92174a.H();
                h.f.b.l.b(H, "");
                if (H.getLineCount() != 0) {
                    MentionTextView H2 = this.f92178a.f92174a.H();
                    MentionTextView H3 = this.f92178a.f92174a.H();
                    h.f.b.l.b(H3, "");
                    H2.setLines(H3.getLineCount());
                    this.f92178a.f92174a.a(false);
                }
            }
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f92176a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f92177b;

            static {
                Covode.recordClassIndex(58163);
            }

            a(j jVar, int i2) {
                this.f92176a = jVar;
                this.f92177b = i2;
            }

            public final void run() {
                VideoDescVM F = this.f92176a.f92174a.F();
                MentionTextView H = this.f92176a.f92174a.H();
                h.f.b.l.b(H, "");
                F.A = H.getHeight();
                VideoDescVM F2 = this.f92176a.f92174a.F();
                int i2 = this.f92176a.f92174a.F().A * this.f92177b;
                this.f92176a.f92174a.F();
                F2.z = i2 / VideoDescVM.a(this.f92176a.f92175b);
                if (!(!c.y || ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92176a.f92174a)).mAweme == null || this.f92176a.f92174a.L() == null)) {
                    TranslationStatusView L = this.f92176a.f92174a.L();
                    h.f.b.l.b(L, "");
                    if (L.getVisibility() == 0) {
                        TranslationStatusView L2 = this.f92176a.f92174a.L();
                        h.f.b.l.b(L2, "");
                        if (L2.getStatus() == 0) {
                            ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92176a.f92174a)).mAweme.setDescLines(this.f92177b);
                            ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92176a.f92174a)).mAweme.setDescTruncatedTextHeight(this.f92176a.f92174a.F().A);
                            ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92176a.f92174a)).mAweme.setDescFullTextHeight(this.f92176a.f92174a.F().z);
                        }
                    }
                }
                this.f92176a.f92174a.a(true);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:0x027f, code lost:
            if (r0.getLineCount() != r5) goto L_0x0281;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x029a, code lost:
            if (r20.f92175b.isAd() == false) goto L_0x02d7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r14 = r5 - 1;
            r13 = r0.getLayout().getLineEnd(r14);
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r12 = (float) r0.getWidth();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r11 = r0.getPaint();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r9 = r0.getText();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r12 = r12 - r11.measureText(r9, r0.getLayout().getLineStart(r14), r13);
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r16 = r0.getPaint().measureText(r10);
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r16 = r16 - r0.getPaint().measureText("...");
            r11 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x034f, code lost:
            if (r12 >= r16) goto L_0x03cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
            r11 = r11.subSequence(0, r13 - r10.length());
            r20.f92174a.a(new android.text.SpannableStringBuilder(r11).append((java.lang.CharSequence) "..."));
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x0376, code lost:
            if (r0.getLineCount() != r5) goto L_0x03cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x0378, code lost:
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r13 = r0.getLayout().getLineEnd(r14);
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r12 = (float) r0.getWidth();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r15 = r0.getPaint();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r9 = r0.getText();
            r0 = r20.f92174a.H();
            h.f.b.l.b(r0, "");
            r12 = r12 - r15.measureText(r9, r0.getLayout().getLineStart(r14), r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x03c8, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x03ca, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x03cb, code lost:
            r11 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x03cc, code lost:
            com.ss.android.ugc.aweme.framework.a.a.a(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x03d3, code lost:
            if (android.text.TextUtils.equals(r11, r6) == false) goto L_0x03d5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x03d5, code lost:
            r6 = new android.text.SpannableStringBuilder(r11).append((java.lang.CharSequence) "...");
            h.f.b.l.b(r6, "");
         */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x0483  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x04cd  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x0516  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0249  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x02b3  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x03d5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0414  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x044b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onGlobalLayout() {
            /*
            // Method dump skipped, instructions count: 1338
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.c.j.onGlobalLayout():void");
        }

        j(c cVar, Aweme aweme) {
            this.f92174a = cVar;
            this.f92175b = aweme;
        }
    }

    static {
        int i2;
        Covode.recordClassIndex(58141);
        boolean a2 = com.ss.android.ugc.aweme.feed.v.a.a();
        y = a2;
        if (!a2) {
            i2 = 12;
        } else if (com.ss.android.ugc.aweme.feed.experiment.q.d()) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 10;
        }
        z = i2;
    }

    public final void O() {
        try {
            if (gb.a(ar_())) {
                MentionTextView H2 = H();
                h.f.b.l.b(H2, "");
                H2.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.i.a());
            } else {
                MentionTextView H3 = H();
                h.f.b.l.b(H3, "");
                H3.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
            }
            if (gb.a(ar_())) {
                if (y) {
                    MentionTextView H4 = H();
                    h.f.b.l.b(H4, "");
                    H4.setMovementMethod(j.a.a());
                    return;
                }
                MentionTextView H5 = H();
                h.f.b.l.b(H5, "");
                H5.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.i.a());
            } else if (y) {
                MentionTextView H6 = H();
                h.f.b.l.b(H6, "");
                H6.setMovementMethod(b.a.a());
            } else {
                MentionTextView H7 = H();
                h.f.b.l.b(H7, "");
                H7.setMovementMethod(com.ss.android.ugc.aweme.feed.widget.a.a());
            }
        } catch (IndexOutOfBoundsException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("", e2);
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        /*
            r6 = this;
            h.h.d r2 = r6.C
            h.k.i[] r1 = com.ss.android.ugc.aweme.feed.assem.desc.c.u
            r0 = 1
            r0 = r1[r0]
            java.lang.Object r1 = r2.a(r6, r0)
            com.ss.android.ugc.aweme.feed.assem.desc.PromotedTagVM r1 = (com.ss.android.ugc.aweme.feed.assem.desc.PromotedTagVM) r1
            com.ss.android.ugc.aweme.feed.assem.desc.c$x r0 = com.ss.android.ugc.aweme.feed.assem.desc.c.x.f92197a
            com.bytedance.assem.arch.viewModel.f.a.a(r6, r1, r0)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
            h.k.k r2 = com.ss.android.ugc.aweme.feed.assem.desc.e.f92201a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.l.c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$z r4 = com.ss.android.ugc.aweme.feed.assem.desc.c.z.f92199a
            r5 = 4
            r0 = r6
            com.bytedance.assem.arch.viewModel.f.a.a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
            h.k.k r2 = com.ss.android.ugc.aweme.feed.assem.desc.f.f92202a
            com.ss.android.ugc.aweme.feed.assem.desc.c$aa r4 = com.ss.android.ugc.aweme.feed.assem.desc.c.aa.f92161a
            r3 = 0
            r5 = 6
            com.bytedance.assem.arch.viewModel.f.a.a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
            h.k.k r2 = com.ss.android.ugc.aweme.feed.assem.desc.g.f92203a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.l.c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$ab r4 = com.ss.android.ugc.aweme.feed.assem.desc.c.ab.f92162a
            r5 = 4
            com.bytedance.assem.arch.viewModel.f.a.a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
            h.k.k r2 = com.ss.android.ugc.aweme.feed.assem.desc.h.f92204a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.l.c()
            com.ss.android.ugc.aweme.feed.assem.desc.c$ac r4 = com.ss.android.ugc.aweme.feed.assem.desc.c.ac.f92163a
            com.bytedance.assem.arch.viewModel.f.a.a(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
            h.k.k r2 = com.ss.android.ugc.aweme.feed.assem.desc.d.f92200a
            com.bytedance.assem.arch.viewModel.k r3 = com.bytedance.assem.arch.viewModel.l.b()
            com.ss.android.ugc.aweme.feed.assem.desc.c$y r4 = com.ss.android.ugc.aweme.feed.assem.desc.c.y.f92198a
            com.bytedance.assem.arch.viewModel.f.a.a(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.c.x():void");
    }

    public static final class q extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92189a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f92190b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f92192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f92193e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f92194f;

        static {
            Covode.recordClassIndex(58171);
        }

        static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ q f92195a;

            static {
                Covode.recordClassIndex(58172);
            }

            a(q qVar) {
                this.f92195a = qVar;
            }

            public final void run() {
                int lineCount;
                MentionTextView H = this.f92195a.f92189a.H();
                if (!c.y) {
                    MentionTextView H2 = this.f92195a.f92189a.H();
                    h.f.b.l.b(H2, "");
                    lineCount = H2.getLineCount();
                } else if (!com.ss.android.ugc.aweme.feed.experiment.q.d() || this.f92195a.f92192d == 0) {
                    int i2 = c.z;
                    MentionTextView H3 = this.f92195a.f92189a.H();
                    h.f.b.l.b(H3, "");
                    lineCount = Math.min(i2, H3.getLineCount());
                } else {
                    int i3 = this.f92195a.f92193e;
                    TuxTextView I = this.f92195a.f92189a.I();
                    h.f.b.l.b(I, "");
                    int height = i3 + I.getHeight();
                    this.f92195a.f92189a.F();
                    Aweme aweme = this.f92195a.f92191c.mAweme;
                    h.f.b.l.b(aweme, "");
                    int a2 = (height * VideoDescVM.a(aweme)) / this.f92195a.f92192d;
                    MentionTextView H4 = this.f92195a.f92189a.H();
                    h.f.b.l.b(H4, "");
                    lineCount = Math.min(a2, H4.getLineCount());
                }
                H.setLines(lineCount);
            }
        }

        public final void onAnimationStart(Animator animator) {
            aw awVar;
            h.f.b.l.d(animator, "");
            if (this.f92190b) {
                this.f92189a.I().setText(R.string.bv7);
            } else {
                this.f92189a.I().setText(R.string.bv8);
            }
            this.f92189a.I().setVisibility(4);
            if (com.ss.android.ugc.aweme.feed.experiment.q.d() && (awVar = this.f92189a.v) != null) {
                awVar.h(this.f92190b);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            aw awVar;
            int transDescLines;
            h.f.b.l.d(animator, "");
            if (this.f92190b) {
                if (this.f92191c.mAweme.getTransDescLines() != 0) {
                    TranslationStatusView L = this.f92189a.L();
                    h.f.b.l.b(L, "");
                    if (L.getVisibility() == 0) {
                        TranslationStatusView L2 = this.f92189a.L();
                        h.f.b.l.b(L2, "");
                        if (L2.getStatus() == 2) {
                            MentionTextView H = this.f92189a.H();
                            if (c.y) {
                                transDescLines = Math.min(c.z, this.f92191c.mAweme.getTransDescLines());
                            } else {
                                transDescLines = this.f92191c.mAweme.getTransDescLines();
                            }
                            H.setLines(transDescLines);
                        }
                    }
                }
                this.f92189a.H().post(new a(this));
            } else {
                if (c.y) {
                    this.f92189a.H().scrollTo(0, 0);
                }
                MentionTextView H2 = this.f92189a.H();
                h.f.b.l.b(H2, "");
                if (H2.getText().length() > 0) {
                    MentionTextView H3 = this.f92189a.H();
                    this.f92189a.F();
                    Aweme aweme = this.f92191c.mAweme;
                    h.f.b.l.b(aweme, "");
                    H3.setLines(VideoDescVM.a(aweme));
                } else {
                    MentionTextView H4 = this.f92189a.H();
                    h.f.b.l.b(H4, "");
                    H4.setMaxLines(this.f92194f);
                }
            }
            this.f92189a.I().setVisibility(0);
            if (com.ss.android.ugc.aweme.feed.ab.b.b() != 0 && c.y && com.ss.android.ugc.aweme.feed.experiment.q.b() && (awVar = this.f92189a.v) != null) {
                awVar.h(this.f92190b);
            }
        }

        q(c cVar, boolean z, VideoItemParams videoItemParams, int i2, int i3, int i4) {
            this.f92189a = cVar;
            this.f92190b = z;
            this.f92191c = videoItemParams;
            this.f92192d = i2;
            this.f92193e = i3;
            this.f92194f = i4;
        }
    }

    public c() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = h.f.b.ab.a(VideoDescVM.class);
        this.B = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        i.c cVar2 = i.c.f25720a;
        h.k.c a3 = h.f.b.ab.a(PromotedTagVM.class);
        this.C = com.bytedance.ext_power_list.k.a(this, a3, cVar2 == null ? i.c.f25720a : cVar2, new C2234c(a3), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), d.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.D = new com.bytedance.ext_power_list.g(h.f.b.ab.a(VideoViewModel.class), this, f.INSTANCE, g.INSTANCE, e.INSTANCE);
        this.E = h.i.a((h.f.a.a) new t(this));
        this.F = h.i.a((h.f.a.a) new s(this));
        this.G = h.i.a((h.f.a.a) new ai(this));
        this.H = h.i.a((h.f.a.a) new ak(this));
        this.I = h.i.a((h.f.a.a) new w(this));
        this.J = h.i.a((h.f.a.a) new v(this));
        this.K = h.i.a((h.f.a.a) new u(this));
        this.x = AVExternalServiceImpl.a().publishService().getAddVideosExperiConsuSideCode();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    static final class ae implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92165a;

        static {
            Covode.recordClassIndex(58147);
        }

        ae(c cVar) {
            this.f92165a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f92165a.F().j();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends bf {

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<c> f92170c;

        /* renamed from: d  reason: collision with root package name */
        private final SpannableStringBuilder f92171d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f92172e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f92173f;

        static {
            Covode.recordClassIndex(58161);
        }

        public final void updateDrawState(TextPaint textPaint) {
            h.f.b.l.d(textPaint, "");
            textPaint.setColor(-1);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            h.f.b.l.d(view, "");
            c cVar = this.f92170c.get();
            if (cVar == null) {
                return;
            }
            if (this.f92173f) {
                cVar.F().j();
                return;
            }
            VideoDescVM F = cVar.F();
            SpannableStringBuilder spannableStringBuilder = this.f92171d;
            boolean z = this.f92172e;
            TranslationStatusView L = cVar.L();
            h.f.b.l.b(L, "");
            int visibility = L.getVisibility();
            TranslationStatusView L2 = cVar.L();
            h.f.b.l.b(L2, "");
            F.a(spannableStringBuilder, z, visibility, L2.getStatus());
        }

        public i(c cVar, SpannableStringBuilder spannableStringBuilder, boolean z, boolean z2) {
            h.f.b.l.d(cVar, "");
            h.f.b.l.d(spannableStringBuilder, "");
            this.f92171d = spannableStringBuilder;
            this.f92172e = z;
            this.f92173f = z2;
            this.f92170c = new WeakReference<>(cVar);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aj implements MentionTextView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92169a;

        static {
            Covode.recordClassIndex(58152);
        }

        aj(c cVar) {
            this.f92169a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.d
        public final boolean a(TextExtraStruct textExtraStruct) {
            h.f.b.l.d(textExtraStruct, "");
            if (this.f92169a.x == 0 && textExtraStruct.getType() == 5) {
                return true;
            }
            return false;
        }
    }

    static final class ad implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92164a;

        static {
            Covode.recordClassIndex(58146);
        }

        ad(c cVar) {
            this.f92164a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            VideoDescVM F = this.f92164a.F();
            TuxTextView I = this.f92164a.I();
            h.f.b.l.b(I, "");
            String obj = I.getText().toString();
            TranslationStatusView L = this.f92164a.L();
            h.f.b.l.b(L, "");
            int visibility = L.getVisibility();
            TranslationStatusView L2 = this.f92164a.L();
            h.f.b.l.b(L2, "");
            F.a(obj, visibility, L2.getStatus());
        }
    }

    static final class r implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92196a;

        static {
            Covode.recordClassIndex(58173);
        }

        r(c cVar) {
            this.f92196a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.d(valueAnimator, "");
            this.f92196a.I().setVisibility(0);
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            this.f92196a.I().setHeight(((Integer) animatedValue).intValue());
        }
    }

    public final void a(Aweme aweme) {
        MentionTextView H2 = H();
        h.f.b.l.b(H2, "");
        H2.getViewTreeObserver().addOnGlobalLayoutListener(new j(this, aweme));
    }

    static final class p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92186a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f92187b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f92188c;

        static {
            Covode.recordClassIndex(58170);
        }

        p(c cVar, boolean z, int i2) {
            this.f92186a = cVar;
            this.f92187b = z;
            this.f92188c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            aw awVar;
            h.f.b.l.d(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) animatedValue).intValue();
            if (intValue > 0) {
                MentionTextView H = this.f92186a.H();
                h.f.b.l.b(H, "");
                H.setHeight(intValue);
                if (c.y) {
                    if (this.f92187b) {
                        this.f92186a.N().getLayoutParams().height = intValue + this.f92188c;
                    } else {
                        this.f92186a.N().getLayoutParams().height = intValue;
                    }
                    if (com.ss.android.ugc.aweme.feed.experiment.q.c() && (awVar = this.f92186a.v) != null) {
                        awVar.h(this.f92187b);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        if (F().f92142l) {
            H().setFontSize(5);
        }
        TuxTextView I2 = I();
        h.f.b.l.b(I2, "");
        I2.setTextSize(15.0f);
        I().setOnClickListener(new ad(this));
        M().setOnClickListener(new ae(this));
        f.a.a(this, P(), i.f92205a, com.bytedance.assem.arch.viewModel.l.a(), af.f92166a, 4);
        f.a.a(this, P(), j.f92206a, com.bytedance.assem.arch.viewModel.l.a(), ag.f92167a, 4);
        f.a.a(this, P(), k.f92207a, com.bytedance.assem.arch.viewModel.l.a(), ah.f92168a, 4);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    public final void a(SpannableStringBuilder spannableStringBuilder) {
        Aweme aweme;
        Aweme aweme2;
        if (spannableStringBuilder == 0) {
            spannableStringBuilder = "";
        }
        try {
            CharSequence charSequence = (CharSequence) spannableStringBuilder;
            if (com.ss.android.ugc.aweme.feed.experiment.ad.a()) {
                com.ss.android.ugc.aweme.framework.a.a.b(4, "VideoDescView", "VideoDescView_setDescSafely desc:" + charSequence);
            }
            if (y) {
                VideoItemParams videoItemParams = (VideoItemParams) F().g();
                if (videoItemParams != null && (aweme2 = videoItemParams.mAweme) != null) {
                    H().a(charSequence, aweme2.getDescLanguage());
                    return;
                }
                return;
            }
            VideoItemParams videoItemParams2 = (VideoItemParams) F().g();
            if (videoItemParams2 != null && (aweme = videoItemParams2.mAweme) != null) {
                if (aweme.isAd()) {
                    H().setText(charSequence);
                } else {
                    H().a(charSequence, aweme.getDescLanguage());
                }
            }
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        F().a(ar_());
        this.v = videoItemParams.videoDescViewHost;
    }

    public final void b(Aweme aweme) {
        VideoItemParams videoItemParams;
        Context ar_;
        if (!(aweme == null || (videoItemParams = (VideoItemParams) F().g()) == null || (ar_ = ar_()) == null)) {
            if (!aweme.isScheduleVideo()) {
                H().a(aweme.getTextExtra(), new com.ss.android.ugc.aweme.shortvideo.view.f(), new aj(this));
            }
            ICommerceChallengeService e2 = CommerceChallengeServiceImpl.e();
            MentionTextView H2 = H();
            h.f.b.l.b(H2, "");
            e2.a(H2, aweme, videoItemParams.mEventType);
            if (aweme.getTextExtra() != null && !TextUtils.isEmpty(aweme.getDesc())) {
                for (TextExtraStruct textExtraStruct : aweme.getTextExtra()) {
                    VideoDescVM F2 = F();
                    h.f.b.l.b(textExtraStruct, "");
                    if ((F2.a(textExtraStruct) && textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && aweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) || (F().a(textExtraStruct) && this.x == 1 && textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) {
                        com.ss.android.ugc.aweme.commercialize.ad.d dVar = new com.ss.android.ugc.aweme.commercialize.ad.d(ar_, (float) Math.round(((float) com.bytedance.common.utility.n.a(ar_)) - (com.bytedance.common.utility.n.b(ar_, 100.0f) + ar_.getResources().getDimension(R.dimen.g5))), androidx.core.content.b.c(ar_, R.color.a7), -1, textExtraStruct);
                        dVar.f73655b = com.bytedance.common.utility.n.b(ar_, 12.0f);
                        dVar.f73656c = com.bytedance.common.utility.n.b(ar_, 2.0f);
                        dVar.f73654a = com.bytedance.common.utility.n.b(ar_, 13.0f);
                        H().a(textExtraStruct.getStart(), textExtraStruct.getEnd(), dVar);
                        VideoDescVM F3 = F();
                        h.f.b.l.d(textExtraStruct, "");
                        VideoItemParams videoItemParams2 = (VideoItemParams) F3.g();
                        if (videoItemParams2 != null && 4 == textExtraStruct.getSubtype()) {
                            Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams2.mEventType).a("group_id", videoItemParams2.mAweme.getAid()).a("author_id", videoItemParams2.mAweme.getAuthorUid()).a("music_id", com.ss.android.ugc.aweme.metrics.ac.d(videoItemParams2.mAweme)).f66730a;
                            h.f.b.l.b(map, "");
                            com.ss.android.ugc.aweme.common.r.a("duet_with_show", map);
                        }
                    }
                }
            }
            H().setAdHashTag(aweme);
        }
    }

    public final void a(boolean z2) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        boolean z3;
        boolean z4;
        int i2;
        Context ar_ = ar_();
        if (ar_ != null && (videoItemParams = (VideoItemParams) F().g()) != null && (aweme = videoItemParams.mAweme) != null && aweme.getDesc() != null) {
            boolean a2 = gb.a(ar_);
            boolean a3 = androidx.core.f.a.a().a(videoItemParams.mAweme.getDesc());
            int i3 = 1;
            boolean z5 = false;
            if (a2 != a3) {
                z3 = true;
            } else {
                z3 = false;
            }
            try {
                MentionTextView H2 = H();
                h.f.b.l.b(H2, "");
                ViewGroup.LayoutParams layoutParams = H2.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (z2) {
                        if (!F().v) {
                            if (z3) {
                                if (F().w) {
                                    return;
                                }
                            } else if (!F().w) {
                                return;
                            }
                        }
                        F().v = false;
                        VideoDescVM F2 = F();
                        if (!F().w) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        F2.w = z4;
                        MentionTextView H3 = H();
                        if (!a3) {
                            i3 = 0;
                        }
                        androidx.core.h.v.b((View) H3, i3);
                        TuxTextView I2 = I();
                        h.f.b.l.b(I2, "");
                        ViewGroup.LayoutParams layoutParams3 = I2.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            if (a3) {
                                i2 = 83;
                            } else {
                                i2 = 85;
                            }
                            layoutParams4.gravity = i2;
                            layoutParams4.leftMargin = com.ss.android.ugc.aweme.base.utils.n.a(15.0d);
                            int i4 = Build.VERSION.SDK_INT;
                            layoutParams4.setMarginStart((int) com.bytedance.common.utility.n.b(ar_, 15.0f));
                            TuxTextView I3 = I();
                            h.f.b.l.b(I3, "");
                            I3.setLayoutParams(layoutParams4);
                            z5 = z3;
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    } else if (androidx.core.h.v.e(H()) != a2) {
                        F().v = true;
                        MentionTextView H4 = H();
                        if (!a2) {
                            i3 = 0;
                        }
                        androidx.core.h.v.b((View) H4, i3);
                    } else {
                        return;
                    }
                    if (z5) {
                        layoutParams2.rightMargin = com.ss.android.ugc.aweme.base.utils.n.a(15.0d);
                        layoutParams2.leftMargin = com.ss.android.ugc.aweme.base.utils.n.a(0.0d);
                        int i5 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginEnd((int) com.bytedance.common.utility.n.b(ar_, 15.0f));
                        layoutParams2.setMarginStart((int) com.bytedance.common.utility.n.b(ar_, 0.0f));
                    } else {
                        layoutParams2.leftMargin = com.ss.android.ugc.aweme.base.utils.n.a(15.0d);
                        layoutParams2.rightMargin = com.ss.android.ugc.aweme.base.utils.n.a(0.0d);
                        int i6 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginStart((int) com.bytedance.common.utility.n.b(ar_, 15.0f));
                        layoutParams2.setMarginEnd((int) com.bytedance.common.utility.n.b(ar_, 0.0f));
                    }
                    MentionTextView H5 = H();
                    h.f.b.l.b(H5, "");
                    H5.setLayoutParams(layoutParams2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    static final class l implements MentionTextView.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f92180a;

        static {
            Covode.recordClassIndex(58166);
        }

        l(c cVar) {
            this.f92180a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.views.MentionTextView.f
        public final void a(TextExtraStruct textExtraStruct) {
            Context h2;
            boolean z;
            String str;
            String str2;
            String str3;
            boolean z2;
            boolean z3;
            VideoDescVM F = this.f92180a.F();
            VideoItemParams videoItemParams = (VideoItemParams) F.g();
            if (videoItemParams != null && (h2 = F.h()) != null && textExtraStruct != null) {
                boolean z4 = false;
                String str4 = "";
                if (textExtraStruct.getType() == 1) {
                    CommerceChallengeServiceImpl.e().a(textExtraStruct);
                    if (CommerceChallengeServiceImpl.e().a(textExtraStruct.getHashTagName(), textExtraStruct.isCommerce(), false) != null) {
                        CommerceChallengeServiceImpl.e().b(videoItemParams.mEventType, textExtraStruct.getHashTagName());
                    }
                    String uuid = UUID.randomUUID().toString();
                    h.f.b.l.b(uuid, str4);
                    if (MSAdaptionService.c().c(h2)) {
                        SmartRouter.buildRoute(h2, "//duo").withParam("duo_type", "duo_challenge").withParam("aweme_id", videoItemParams.mAweme.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("extra_challenge_from", videoItemParams.mEventType).open();
                    } else {
                        com.bytedance.ies.watcher.c.a("cd_start_activity_to_request_net_duration");
                        com.bytedance.ies.watcher.c.a("cd_start_activity_to_show_header_duration");
                        com.bytedance.ies.watcher.c.a("cd_start_activity_to_show_list_duration");
                        SmartRouter.buildRoute(h2, "//challenge/detail").withParam("aweme_id", videoItemParams.mAweme.getAid()).withParam("id", textExtraStruct.getHashTagName()).withParam("extra_challenge_is_hashtag", true).withParam("process_id", uuid).withParam("extra_challenge_from", videoItemParams.mEventType).open(10086);
                    }
                    com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(videoItemParams.mEventType).setValue(videoItemParams.mAweme.getAid()).setExtValueString(textExtraStruct.getCid()));
                    com.ss.android.ugc.aweme.commercialize.g.a().d(h2, videoItemParams.mAweme);
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "challenge_click", videoItemParams.mAweme.getAwemeRawAd()).c();
                    String searchResultId = FeedParamProvider.a.a(h2).getSearchResultId();
                    if (TextUtils.isEmpty(searchResultId)) {
                        searchResultId = com.ss.android.ugc.aweme.metrics.ac.e(videoItemParams.mAweme);
                    }
                    if (videoItemParams.mAweme.getBottomBarModel() != null) {
                        z4 = true;
                    }
                    com.ss.android.ugc.aweme.metrics.r rVar = (com.ss.android.ugc.aweme.metrics.r) new com.ss.android.ugc.aweme.metrics.r().o(videoItemParams.mEventType).a(h2);
                    if (videoItemParams.mAweme.getAuthor() != null) {
                        str4 = videoItemParams.mAweme.getAuthor().getUid();
                    }
                    rVar.p = str4;
                    rVar.f109595e = videoItemParams.mAweme.getAid();
                    com.ss.android.ugc.aweme.metrics.r f2 = rVar.g(videoItemParams.mAweme);
                    f2.X = FeedParamProvider.a.a(h2).getPreviousPage();
                    f2.Y = FeedParamProvider.a.a(h2).getPreviousPagePosition();
                    f2.Z = z4;
                    f2.r = uuid;
                    com.ss.android.ugc.aweme.metrics.r rVar2 = (com.ss.android.ugc.aweme.metrics.r) f2.d(com.ss.android.ugc.aweme.metrics.ac.b(videoItemParams.mAweme, videoItemParams.mPageType));
                    rVar2.q = textExtraStruct.getCid();
                    com.ss.android.ugc.aweme.metrics.r rVar3 = (com.ss.android.ugc.aweme.metrics.r) ((com.ss.android.ugc.aweme.metrics.r) rVar2.a("click_in_video_name")).p(com.ss.android.ugc.aweme.metrics.ac.a(videoItemParams.mAweme, videoItemParams.mPageType)).f(searchResultId).l(FeedParamProvider.a.a(h2).getSearchId());
                    rVar3.ab = FeedParamProvider.a.a(h2).getCategoryName();
                    com.ss.android.ugc.aweme.upvote.event.c.a(rVar3.a(com.ss.android.ugc.aweme.utils.w.a(videoItemParams.mAweme, "enter_tag_detail", videoItemParams.mEventType)), videoItemParams.mAweme, videoItemParams.mEventType).f();
                    com.ss.android.ugc.aweme.feed.s.a(com.ss.android.ugc.aweme.feed.af.CHALLENGE);
                } else if (textExtraStruct.getType() == 0 && ((!TextUtils.isEmpty(textExtraStruct.getAwemeId()) || 2 == textExtraStruct.getSubtype()) && F.a(textExtraStruct) && videoItemParams.mAweme.getDesc().charAt(textExtraStruct.getStart()) == '@')) {
                    if (2 == textExtraStruct.getSubtype() || 3 == textExtraStruct.getSubtype()) {
                        Aweme aweme = videoItemParams.mAweme;
                        h.f.b.l.b(aweme, str4);
                        VideoReplyStruct videoReplyStruct = aweme.getVideoReplyStruct();
                        if (videoReplyStruct != null) {
                            if (videoReplyStruct.getAwemeId() != 0) {
                                str2 = String.valueOf(videoReplyStruct.getAwemeId());
                            } else {
                                str2 = str4;
                            }
                            if (videoReplyStruct.getCommentId() != 0) {
                                str3 = String.valueOf(videoReplyStruct.getCommentId());
                            } else {
                                str3 = str4;
                            }
                            if (videoReplyStruct.getAliasCommentId() != 0) {
                                str = String.valueOf(videoReplyStruct.getAliasCommentId());
                            } else {
                                str = str4;
                            }
                        } else {
                            str2 = str4;
                            str3 = str2;
                            str = str3;
                        }
                        if (2 == textExtraStruct.getSubtype()) {
                            com.ss.android.ugc.aweme.common.r.a("click_comment_chain", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams.mEventType).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("to_group_id", str2).a("reply_comment_id", str3).a("reply_user_id", textExtraStruct.getUserId()).f66730a);
                        }
                    } else {
                        if (videoItemParams.mAweme.getAwemeType() == 51) {
                            com.ss.android.ugc.aweme.common.r.a("click_duet_icon", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams.mEventType).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).a("chain_type", "duet").f66730a);
                        } else if (videoItemParams.mAweme.getAwemeType() == 52) {
                            com.ss.android.ugc.aweme.common.r.a("click_react_icon", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams.mEventType).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                        } else if (videoItemParams.mAweme.getAwemeType() == 58) {
                            com.ss.android.ugc.aweme.common.r.a("click_duet_icon", new com.ss.android.ugc.aweme.app.f.d().a("chain_type", "stitch").a("enter_from", videoItemParams.mEventType).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("to_group_id", textExtraStruct.getAwemeId()).f66730a);
                        }
                        str = str4;
                        str2 = str;
                        str3 = str2;
                    }
                    if (!VideoDescVM.i()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(h2).a(R.string.de8).a();
                    } else if (2 == textExtraStruct.getSubtype()) {
                        SmartRouter.buildRoute(h2, "aweme://aweme/detail/").withParam("id", str2).withParam("refer", "click_comment_chain").withParam("cid", str3 + ',' + str).withParam("video_from", videoItemParams.mEventType).open();
                    } else if (4 == textExtraStruct.getSubtype()) {
                        Map<String, String> map = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams.mEventType).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("music_id", com.ss.android.ugc.aweme.metrics.ac.d(videoItemParams.mAweme)).a("anchor_type", "duet").f66730a;
                        h.f.b.l.b(map, str4);
                        com.ss.android.ugc.aweme.common.r.a("enter_anchor_detail", map);
                        SmartRouter.buildRoute(h2, "//duet/detail").withParam("id", videoItemParams.mAweme.getAid()).withParam("author_id", videoItemParams.mAweme.getAuthorUid()).withParam("origin_item_id", textExtraStruct.getAwemeId()).withParam("anchor_event_map", new HashMap(map)).open();
                    } else if (7 == textExtraStruct.getSubtype() || textExtraStruct.getSubtype() == 5) {
                        boolean enableQaSticker = AVExternalServiceImpl.a().configService().avsettingsConfig().enableQaSticker();
                        Aweme aweme2 = videoItemParams.mAweme;
                        h.f.b.l.b(aweme2, str4);
                        List<InteractStickerStruct> interactStickerStructs = aweme2.getInteractStickerStructs();
                        if (interactStickerStructs != null && interactStickerStructs.size() > 0) {
                            InteractStickerStruct interactStickerStruct = interactStickerStructs.get(0);
                            h.f.b.l.b(interactStickerStruct, str4);
                            if (interactStickerStruct.getQaStruct() != null) {
                                InteractStickerStruct interactStickerStruct2 = interactStickerStructs.get(0);
                                h.f.b.l.b(interactStickerStruct2, str4);
                                if (interactStickerStruct2.getQaStruct().getQuestionId() != 0) {
                                    z2 = true;
                                    if (enableQaSticker || !z2) {
                                        new com.ss.android.ugc.aweme.tux.a.i.a(h2).a(R.string.f6n).a();
                                    }
                                    Aweme aweme3 = videoItemParams.mAweme;
                                    h.f.b.l.b(aweme3, str4);
                                    InteractStickerStruct interactStickerStruct3 = aweme3.getInteractStickerStructs().get(0);
                                    h.f.b.l.b(interactStickerStruct3, str4);
                                    long questionId = interactStickerStruct3.getQaStruct().getQuestionId();
                                    SmartRoute withParam = SmartRouter.buildRoute(h2, "aweme://qna/detail/").withParam("id", String.valueOf(questionId)).withParam("extra_question_from", videoItemParams.mEventType);
                                    Aweme aweme4 = videoItemParams.mAweme;
                                    h.f.b.l.b(aweme4, str4);
                                    withParam.withParam("aweme_id", aweme4.getAid()).withParam("qid", String.valueOf(questionId)).withParam("enter_from", videoItemParams.mEventType).withParam("process_id", UUID.randomUUID().toString()).open();
                                    return;
                                }
                            }
                        }
                        z2 = false;
                        if (enableQaSticker) {
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(h2).a(R.string.f6n).a();
                    } else {
                        SmartRoute withParam2 = SmartRouter.buildRoute(h2, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", videoItemParams.mEventType).withParam("isChain", true);
                        Aweme aweme5 = videoItemParams.mAweme;
                        if (aweme5 == null || aweme5.getAwemeType() != 51) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        withParam2.withParam("is_from_duet_chain", z3).open();
                    }
                } else if (textExtraStruct.getType() != 5 || textExtraStruct.getSubtype() != 6 || TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                    com.ss.android.ugc.aweme.common.r.a(StringSet.name, "video_at", videoItemParams.mAweme.getAid(), textExtraStruct.getUserId());
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("group_id", str4);
                        jSONObject.put("request_id", videoItemParams.mRequestId.get("request_id"));
                        jSONObject.put("enter_from", videoItemParams.mEventType);
                        jSONObject.put("enter_method", "click_head");
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    if (videoItemParams.mAweme.getAuthor() != null) {
                        com.ss.android.ugc.aweme.common.r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(videoItemParams.mAweme.getAuthor().getUid()).setJsonObject(jSONObject));
                        String searchResultId2 = FeedParamProvider.a.a(h2).getSearchResultId();
                        if (TextUtils.isEmpty(searchResultId2)) {
                            searchResultId2 = com.ss.android.ugc.aweme.metrics.ac.e(videoItemParams.mAweme);
                        }
                        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                        if (textExtraStruct.getSubtype() == 11) {
                            dVar.a("is_from_bc_video", "1");
                        }
                        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", dVar.a("enter_from", videoItemParams.mEventType).a("to_user_id", textExtraStruct.getUserId()).a("group_id", videoItemParams.mAweme.getAid()).a("author_id", videoItemParams.mAweme.getAuthorUid()).a("enter_method", "video_at").a("search_id", FeedParamProvider.a.a(h2).getSearchId()).a("search_result_id", searchResultId2).a(videoItemParams.mAweme, "enter_personal_detail", videoItemParams.mEventType).f66730a);
                    }
                    SmartRouter.buildRoute(h2, "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("sec_user_id", textExtraStruct.getSecUid()).withParam("profile_from", "video_at").withParam("enter_from", videoItemParams.mEventType).withParam("video_id", videoItemParams.mAweme.getAid()).open();
                } else if (!VideoDescVM.i()) {
                    F.b(new VideoDescVM.c(F));
                } else {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", videoItemParams.mEventType);
                    Aweme aweme6 = videoItemParams.mAweme;
                    h.f.b.l.b(aweme6, str4);
                    com.ss.android.ugc.aweme.common.r.a("click_quote_icon", a2.a("group_id", aweme6.getAid()).a("to_group_id", textExtraStruct.getAwemeId()).a("quote_type", "personal").f66730a);
                    Map<String, String> map2 = new com.ss.android.ugc.aweme.app.f.d().a("is_from_add_video_chain", "1").f66730a;
                    SmartRoute withParam3 = SmartRouter.buildRoute(h2, "//aweme/detail").withParam("id", textExtraStruct.getAwemeId()).withParam("refer", videoItemParams.mEventType).withParam("isChain", true);
                    Aweme aweme7 = videoItemParams.mAweme;
                    h.f.b.l.b(aweme7, str4);
                    if (aweme7.getAwemeType() == 51) {
                        z = true;
                    } else {
                        z = false;
                    }
                    withParam3.withParam("is_from_duet_chain", z).withParam("feed_param_extra", new HashMap(map2)).open();
                }
            }
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.m<c, Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f92161a = new aa();

        static {
            Covode.recordClassIndex(58143);
        }

        aa() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, Boolean bool) {
            c cVar2 = cVar;
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(cVar2, "");
            if (booleanValue) {
                MixHelperService.a();
                cVar2.ar_();
                cVar2.F().g();
                cVar2.H();
            }
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f92198a = new y();

        static {
            Covode.recordClassIndex(58180);
        }

        y() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            if (cVar2.H() != null) {
                MentionTextView H = cVar2.H();
                h.f.b.l.b(H, "");
                new com.bytedance.tux.g.b(H).e(R.string.de8).b();
            }
            return h.z.f158842a;
        }
    }

    static final class af extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Integer>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final af f92166a = new af();

        static {
            Covode.recordClassIndex(58148);
        }

        af() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:6:0x0022  */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.desc.c r6, com.bytedance.assem.arch.extensions.a<? extends java.lang.Integer> r7) {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.feed.assem.desc.c r6 = (com.ss.android.ugc.aweme.feed.assem.desc.c) r6
                java.lang.String r0 = ""
                h.f.b.l.d(r6, r0)
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r4 = r6.F()
                com.ss.android.ugc.aweme.feed.ui.bv r3 = r6.w
                r2 = 1
                if (r3 == 0) goto L_0x003a
                r3.o = r2
                java.lang.Object r0 = r4.g()
                com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
                if (r0 != 0) goto L_0x002e
            L_0x001a:
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r6.F()
                com.ss.android.ugc.aweme.feed.ui.aw r0 = r6.v
                if (r0 != 0) goto L_0x0025
                h.f.b.l.b()
            L_0x0025:
                int r0 = r0.aw()
                r1.C = r0
                h.z r0 = h.z.f158842a
                return r0
            L_0x002e:
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$d r1 = new com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$d
                r1.<init>(r4, r0, r3)
                java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.common.r.a()
                b.i.b(r1, r0)
            L_0x003a:
                r4.n = r2
                boolean r0 = r4.f92143m
                if (r0 == 0) goto L_0x001a
                com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$e r1 = new com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM$e
                r1.<init>(r4)
                java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.common.r.a()
                b.i.b(r1, r0)
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.c.af.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static final class ag extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends h.z>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ag f92167a = new ag();

        static {
            Covode.recordClassIndex(58149);
        }

        ag() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends h.z> aVar) {
            String str;
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            VideoDescVM F = cVar2.F();
            bv bvVar = cVar2.w;
            if (bvVar != null) {
                bvVar.o = false;
            }
            F.n = false;
            TuxTextView I = cVar2.I();
            h.f.b.l.b(I, "");
            String obj = I.getText().toString();
            Context ar_ = cVar2.ar_();
            if (ar_ != null) {
                str = ar_.getString(R.string.bv7);
            } else {
                str = null;
            }
            if (obj.equals(str)) {
                VideoDescVM F2 = cVar2.F();
                TuxTextView I2 = cVar2.I();
                h.f.b.l.b(I2, "");
                String obj2 = I2.getText().toString();
                TranslationStatusView L = cVar2.L();
                h.f.b.l.b(L, "");
                int visibility = L.getVisibility();
                TranslationStatusView L2 = cVar2.L();
                h.f.b.l.b(L2, "");
                F2.a(obj2, visibility, L2.getStatus());
            }
            return h.z.f158842a;
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ah f92168a = new ah();

        static {
            Covode.recordClassIndex(58150);
        }

        ah() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            String str;
            c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            boolean d2 = com.ss.android.ugc.aweme.feed.experiment.q.d();
            TuxTextView I = cVar2.I();
            h.f.b.l.b(I, "");
            String obj = I.getText().toString();
            Context ar_ = cVar2.ar_();
            if (ar_ != null) {
                str = ar_.getString(R.string.bv7);
            } else {
                str = null;
            }
            if (d2 && obj.equals(str)) {
                VideoDescVM F = cVar2.F();
                TuxTextView I2 = cVar2.I();
                h.f.b.l.b(I2, "");
                String obj2 = I2.getText().toString();
                TranslationStatusView L = cVar2.L();
                h.f.b.l.b(L, "");
                int visibility = L.getVisibility();
                TranslationStatusView L2 = cVar2.L();
                h.f.b.l.b(L2, "");
                F.a(obj2, visibility, L2.getStatus());
            }
            return h.z.f158842a;
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.m<c, a, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f92162a = new ab();

        static {
            Covode.recordClassIndex(58144);
        }

        ab() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, a aVar) {
            ValueAnimator ofInt;
            aw awVar;
            c cVar2 = cVar;
            a aVar2 = aVar;
            h.f.b.l.d(cVar2, "");
            SpannableStringBuilder spannableStringBuilder = null;
            if (aVar2 != null) {
                if (aVar2.f92150a != null) {
                    if (aVar2 != null) {
                        spannableStringBuilder = aVar2.f92150a;
                    }
                    cVar2.a(spannableStringBuilder);
                }
                if (aVar2 != null) {
                    boolean z = aVar2.f92154e;
                    int i2 = aVar2.f92151b;
                    int i3 = aVar2.f92152c;
                    int i4 = aVar2.f92153d;
                    VideoItemParams videoItemParams = (VideoItemParams) cVar2.F().g();
                    if (videoItemParams != null) {
                        if (cVar2.F().B == 0) {
                            VideoDescVM F = cVar2.F();
                            TuxTextView I = cVar2.I();
                            h.f.b.l.b(I, "");
                            F.B = I.getHeight();
                        }
                        int i5 = cVar2.F().B;
                        if (z) {
                            ofInt = ValueAnimator.ofInt(i3, i2);
                        } else {
                            ofInt = ValueAnimator.ofInt(i2, i3);
                        }
                        ofInt.addUpdateListener(new p(cVar2, z, i5));
                        ofInt.addListener(new q(cVar2, z, videoItemParams, i3, i2, i4));
                        if (cVar2.F().B == 0) {
                            cVar2.F().B = cVar2.I().getHeight();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, cVar2.F().B);
                        ofInt2.addUpdateListener(new r(cVar2));
                        h.f.b.l.b(ofInt2, "");
                        ofInt2.setDuration(100L);
                        ofInt2.setStartDelay(150);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofInt, ofInt2);
                        animatorSet.start();
                        if (com.ss.android.ugc.aweme.feed.ab.b.b() == 0 && c.y && com.ss.android.ugc.aweme.feed.experiment.q.b() && (awVar = cVar2.v) != null) {
                            awVar.h(z);
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class x extends h.f.b.m implements h.f.a.m<c, b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f92197a = new x();

        static {
            Covode.recordClassIndex(58179);
        }

        x() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, b bVar) {
            TuxTextView J;
            c cVar2 = cVar;
            b bVar2 = bVar;
            h.f.b.l.d(cVar2, "");
            h.f.b.l.d(bVar2, "");
            TuxTextView J2 = cVar2.J();
            h.f.b.l.b(J2, "");
            J2.setVisibility(8);
            TuxTag K = cVar2.K();
            h.f.b.l.b(K, "");
            K.setVisibility(8);
            if (!(bVar2.f92155a == 8 && bVar2.f92156b == 8)) {
                if (bVar2.f92160f) {
                    J = cVar2.K();
                } else {
                    J = cVar2.J();
                }
                h.f.b.l.b(J, "");
                J.setVisibility(0);
                J.setText(bVar2.f92159e);
                if (bVar2.f92160f) {
                    com.bytedance.ies.dmt.ui.widget.util.b.a().a(cVar2.K(), com.bytedance.ies.dmt.ui.widget.util.d.f33801g);
                    Integer num = bVar2.f92157c;
                    if (num != null) {
                        cVar2.K().setTagBackgroundColor(num.intValue());
                    }
                } else {
                    Integer num2 = bVar2.f92157c;
                    if (num2 != null) {
                        cVar2.J().setBackgroundColor(num2.intValue());
                    }
                    Integer num3 = bVar2.f92158d;
                    if (num3 != null) {
                        cVar2.J().setTextColor(num3.intValue());
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class ac extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends Boolean>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f92163a = new ac();

        static {
            Covode.recordClassIndex(58145);
        }

        ac() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ h.z invoke(c cVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            Aweme aweme;
            int i2;
            c cVar2 = cVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            h.f.b.l.d(cVar2, "");
            if (aVar2 == null || !aVar2.f25631b.booleanValue()) {
                cVar2.s().setVisibility(8);
            } else {
                cVar2.F().g();
                cVar2.s().setVisibility(0);
                VideoItemParams videoItemParams = (VideoItemParams) cVar2.F().g();
                if (videoItemParams != null) {
                    if (c.y) {
                        cVar2.H().scrollTo(0, 0);
                        cVar2.N().getLayoutParams().height = -2;
                    }
                    cVar2.F().w = false;
                    if (videoItemParams.mAweme.getTextExtra() != null && videoItemParams.mAweme.getTextExtra().size() > 0) {
                        for (TextExtraStruct textExtraStruct : videoItemParams.mAweme.getTextExtra()) {
                            if (textExtraStruct != null) {
                                if (textExtraStruct.getStart() < 0) {
                                    textExtraStruct.setStart(0);
                                }
                                if (textExtraStruct.getEnd() > videoItemParams.mAweme.getDesc().length()) {
                                    textExtraStruct.setEnd(videoItemParams.mAweme.getDesc().length());
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT < 21) {
                        cVar2.M().post(new k(cVar2));
                    }
                    if (cVar2.ar_() != null) {
                        VideoDescVM F = cVar2.F();
                        if (c.y) {
                            i2 = 550;
                        } else {
                            VideoItemParams videoItemParams2 = (VideoItemParams) F.g();
                            if (videoItemParams2 != null) {
                                aweme = videoItemParams2.mAweme;
                            } else {
                                aweme = null;
                            }
                            com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme);
                            i2 = 200;
                        }
                        cVar2.H().setMaxSize(i2);
                        if (cVar2.F().f92142l) {
                            cVar2.H().setSpanSize((float) com.ss.android.ugc.aweme.base.utils.n.c(14.0d));
                        } else {
                            cVar2.H().setSpanSize((float) com.ss.android.ugc.aweme.base.utils.n.c(15.0d));
                        }
                        cVar2.H().setSpanColor(cVar2.H().getCurrentTextColor());
                        cVar2.H().setSpanStyle(1);
                        cVar2.H().setOnSpanClickListener(new l(cVar2));
                        if (com.ss.android.ugc.aweme.feed.assem.a.f91966a) {
                            com.ss.android.ugc.aweme.lego.p.a().post(new m(cVar2, videoItemParams));
                            com.ss.android.ugc.aweme.lego.p.a().post(new n(cVar2));
                        } else {
                            cVar2.b(videoItemParams.mAweme);
                            cVar2.O();
                        }
                        if (com.ss.android.ugc.aweme.feed.assem.a.f91966a || CommerceChallengeServiceImpl.e().d()) {
                            cVar2.H().post(new o(cVar2, videoItemParams));
                        } else {
                            Aweme aweme2 = videoItemParams.mAweme;
                            h.f.b.l.b(aweme2, "");
                            h.f.b.l.b(videoItemParams.mEventType, "");
                            int i3 = videoItemParams.mPageType;
                            cVar2.a(aweme2);
                        }
                    }
                }
            }
            return h.z.f158842a;
        }
    }

    static final class z extends h.f.b.m implements h.f.a.m<c, com.bytedance.assem.arch.extensions.a<? extends SpannableStringBuilder>, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f92199a = new z();

        static {
            Covode.recordClassIndex(58181);
        }

        z() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
            if (r8 == null) goto L_0x0080;
         */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.desc.c r15, com.bytedance.assem.arch.extensions.a<? extends android.text.SpannableStringBuilder> r16) {
            /*
            // Method dump skipped, instructions count: 292
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.c.z.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, boolean z2, boolean z3) {
        i iVar = new i(this, spannableStringBuilder2, z2, z3);
        iVar.f94343a = 0;
        spannableStringBuilder.setSpan(iVar, 0, spannableStringBuilder.length(), 17);
    }

    public final int a(CharSequence charSequence, String str, int i2, int i3, int i4) {
        float f2;
        try {
            float measureText = I().getPaint().measureText(str);
            int width = H().getWidth();
            float measureText2 = H().getPaint().measureText(charSequence, i3, i4);
            if (F().f92142l) {
                f2 = H().getPaint().measureText("...", 0, 3);
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
                while (H().getPaint().measureText(charSequence, i4 - i5, i4) < f3) {
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
