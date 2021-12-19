package com.ss.android.ugc.aweme.report;

import android.app.Activity;
import android.content.Context;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.d.a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.commercialize.model.v;
import com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.helper.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRiskModel;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.video.i;
import com.ss.android.ugc.aweme.video.simplayer.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f120594a = new f();

    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f120610a = new e();

        static {
            Covode.recordClassIndex(78521);
        }

        e() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(78516);
    }

    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f120595a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f120596b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f120597c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f120598d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TuxTextView f120599e;

        static {
            Covode.recordClassIndex(78517);
        }

        public a(v vVar, Aweme aweme, Activity activity, ViewGroup viewGroup, TuxTextView tuxTextView) {
            this.f120595a = vVar;
            this.f120596b = aweme;
            this.f120597c = activity;
            this.f120598d = viewGroup;
            this.f120599e = tuxTextView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", this.f120596b.getAwemeRawAd()).b("refer", "disclaimer").a("disclaimer_id", this.f120595a.getId()).b();
            AdLightWebPageOpenUtils.a().a(this.f120597c, this.f120595a.getUrl());
        }
    }

    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f120608a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f120609b;

        static {
            Covode.recordClassIndex(78520);
        }

        public d(Aweme aweme, ViewGroup viewGroup) {
            this.f120608a = aweme;
            this.f120609b = viewGroup;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f120608a.getAid());
            AwemeRiskModel awemeRiskModel = this.f120608a.getAwemeRiskModel();
            l.b(awemeRiskModel, "");
            r.a("info_bar_click", a2.a("content", awemeRiskModel.getContent()).f66730a);
            Context context = this.f120609b.getContext();
            AwemeRiskModel awemeRiskModel2 = this.f120608a.getAwemeRiskModel();
            l.b(awemeRiskModel2, "");
            SmartRouter.buildRoute(context, awemeRiskModel2.getUrl()).open();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Aweme f120605a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120606b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f120607c;

        static {
            Covode.recordClassIndex(78519);
        }

        c(Aweme aweme, String str, ConstraintLayout constraintLayout) {
            this.f120605a = aweme;
            this.f120606b = str;
            this.f120607c = constraintLayout;
        }

        public final void onClick(View view) {
            String str;
            float f2;
            float f3;
            String str2;
            String mixId;
            f.d h2;
            f.d h3;
            String str3;
            MixFlowParam mixFlowParam;
            ClickAgent.onClick(view);
            if (view != null) {
                if (view.getContext() instanceof com.ss.android.ugc.aweme.mix.api.e) {
                    Aweme aweme = this.f120605a;
                    if (aweme == null || (mixFlowParam = aweme.mixFlowParam) == null) {
                        str3 = null;
                    } else {
                        str3 = mixFlowParam.getFrom();
                    }
                    if (!l.a((Object) str3, (Object) "from_search_mix")) {
                        Context context = view.getContext();
                        Objects.requireNonNull(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.api.IMixDetailHandleBottomDialog");
                        ((com.ss.android.ugc.aweme.mix.api.e) context).a(this.f120605a);
                        return;
                    }
                }
                Context context2 = view.getContext();
                String str4 = "";
                l.b(context2, str4);
                com.ss.android.ugc.aweme.feed.param.b a2 = FeedParamProvider.a.a(context2);
                com.ss.android.ugc.aweme.mix.e.b bVar = new com.ss.android.ugc.aweme.mix.e.b(a2.getPlaylistSearchId(), Integer.valueOf(a2.getIsFromVideo()), a2.getSearchType(), 0, 8, null);
                IMixFeedService k2 = MixFeedService.k();
                String str5 = this.f120606b;
                PlayListInfo playListInfo = this.f120605a.playlist_info;
                if (playListInfo == null || (str = playListInfo.getMixId()) == null) {
                    str = str4;
                }
                k2.a(str5, str, this.f120605a.getGroupId(), this.f120605a.getAuthorUid(), "click_feed", bVar);
                i O = com.ss.android.ugc.aweme.video.v.O();
                l.b(O, str4);
                com.ss.android.ugc.aweme.video.simplayer.f L = O.L();
                if (L == null || (h3 = L.h()) == null) {
                    f2 = 0.0f;
                } else {
                    f2 = (float) h3.d();
                }
                i O2 = com.ss.android.ugc.aweme.video.v.O();
                l.b(O2, str4);
                com.ss.android.ugc.aweme.video.simplayer.f L2 = O2.L();
                if (L2 == null || (h2 = L2.h()) == null) {
                    f3 = 0.0f;
                } else {
                    f3 = (float) h2.e();
                }
                float f4 = (f3 / f2) * 100.0f;
                if (MixFeedService.k().i() || MixFeedService.k().j()) {
                    h a3 = h.a();
                    l.b(a3, str4);
                    a3.f93338a = com.ss.android.ugc.aweme.video.v.O();
                    h a4 = h.a();
                    l.b(a4, str4);
                    i O3 = com.ss.android.ugc.aweme.video.v.O();
                    l.b(O3, str4);
                    com.ss.android.ugc.aweme.video.simplayer.f L3 = O3.L();
                    l.b(L3, str4);
                    f.d h4 = L3.h();
                    l.b(h4, str4);
                    a4.f93340c = h4.e();
                    h a5 = h.a();
                    l.b(a5, str4);
                    a5.f93339b = this.f120605a.getAid();
                }
                IMixFeedService k3 = MixFeedService.k();
                Context context3 = this.f120607c.getContext();
                String aid = this.f120605a.getAid();
                Aweme aweme2 = this.f120605a;
                PlayListInfo playListInfo2 = aweme2.playlist_info;
                if (playListInfo2 == null || (str2 = playListInfo2.getMixId()) == null) {
                    str2 = str4;
                }
                k3.a(context3, aid, aweme2, "from_mix_detail_item", str2, "", "", bVar, Float.valueOf(f4), this.f120606b);
                IMixFeedService k4 = MixFeedService.k();
                String str6 = this.f120606b;
                PlayListInfo playListInfo3 = this.f120605a.playlist_info;
                if (!(playListInfo3 == null || (mixId = playListInfo3.getMixId()) == null)) {
                    str4 = mixId;
                }
                IMixFeedService.a.a(k4, str6, str4, this.f120605a.getGroupId(), this.f120605a.getAuthorUid(), f3, (com.ss.android.ugc.aweme.mix.e.b) null, 32);
            }
        }
    }

    public static final class b implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SpannableStringBuilder f120600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f120601b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f120602c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ViewGroup f120603d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ TuxTextView f120604e;

        static {
            Covode.recordClassIndex(78518);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Integer num;
            if (motionEvent != null) {
                num = Integer.valueOf(motionEvent.getAction());
            } else {
                num = null;
            }
            if ((view instanceof TextView) && num != null && (num.intValue() == 1 || num.intValue() == 0)) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                TextView textView = (TextView) view;
                float totalPaddingLeft = x - ((float) textView.getTotalPaddingLeft());
                float totalPaddingTop = y - ((float) textView.getTotalPaddingTop());
                float scrollX = totalPaddingLeft + ((float) textView.getScrollX());
                Layout layout = textView.getLayout();
                int lineForVertical = layout.getLineForVertical((int) (totalPaddingTop + ((float) textView.getScrollY())));
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, scrollX);
                Object[] spans = this.f120600a.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                l.b(spans, "");
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
                if (scrollX > textView.getPaint().measureText(textView.getText().subSequence(layout.getLineStart(lineForVertical), layout.getLineEnd(lineForVertical)).toString()) || clickableSpanArr.length == 0) {
                    Selection.removeSelection(this.f120600a);
                } else {
                    if (num.intValue() == 1) {
                        clickableSpanArr[0].onClick(this.f120604e);
                    } else if (num.intValue() == 0) {
                        SpannableStringBuilder spannableStringBuilder = this.f120600a;
                        Selection.setSelection(spannableStringBuilder, spannableStringBuilder.getSpanStart(clickableSpanArr[0]), this.f120600a.getSpanEnd(clickableSpanArr[0]));
                    }
                    return true;
                }
            }
            return false;
        }

        public b(SpannableStringBuilder spannableStringBuilder, Aweme aweme, Activity activity, ViewGroup viewGroup, TuxTextView tuxTextView) {
            this.f120600a = spannableStringBuilder;
            this.f120601b = aweme;
            this.f120602c = activity;
            this.f120603d = viewGroup;
            this.f120604e = tuxTextView;
        }
    }

    public static final void a(Aweme aweme, FrameLayout frameLayout, ConstraintLayout constraintLayout, String str) {
        String str2;
        String str3;
        l.d(frameLayout, "");
        l.d(constraintLayout, "");
        l.d(str, "");
        if (aweme != null && aweme.playlist_info != null) {
            StringBuilder append = new StringBuilder().append(frameLayout.getContext().getString(R.string.dr2)).append(" • ");
            PlayListInfo playListInfo = aweme.playlist_info;
            if (playListInfo == null || (str2 = playListInfo.getMixName()) == null) {
                str2 = "";
            }
            String sb = append.append(str2).toString();
            TextView textView = (TextView) constraintLayout.findViewById(R.id.f6b);
            SmartImageView smartImageView = (SmartImageView) constraintLayout.findViewById(R.id.bi7);
            ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.lk);
            com.bytedance.ies.dmt.ui.d.a aVar = new a.C0730a().a(sb).f33382a;
            l.b(textView, "");
            textView.setText(aVar);
            l.b(smartImageView, "");
            ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
            aVar2.height = n.a(16.0d);
            aVar2.width = n.a(16.0d);
            aVar2.topMargin = 0;
            smartImageView.setLayoutParams(aVar2);
            com.bytedance.lighten.a.v a2 = com.bytedance.lighten.a.r.a(2131231770);
            a2.E = smartImageView;
            a2.c();
            l.b(imageView, "");
            imageView.setVisibility(0);
            String str4 = null;
            if (constraintLayout.getContext() instanceof com.ss.android.ugc.aweme.mix.api.e) {
                MixFlowParam mixFlowParam = aweme.mixFlowParam;
                if (mixFlowParam != null) {
                    str3 = mixFlowParam.getFrom();
                } else {
                    str3 = null;
                }
                if (!l.a((Object) str3, (Object) "from_search_mix")) {
                    if (gb.a()) {
                        imageView.setRotation(90.0f);
                    } else {
                        imageView.setRotation(270.0f);
                    }
                }
            }
            if (constraintLayout.getContext() instanceof com.ss.android.ugc.aweme.mix.api.e) {
                MixFlowParam mixFlowParam2 = aweme.mixFlowParam;
                if (mixFlowParam2 != null) {
                    str4 = mixFlowParam2.getFrom();
                }
                if (l.a((Object) str4, (Object) "from_search_mix") && !com.ss.android.ugc.aweme.search.a.a.a()) {
                    if (gb.a()) {
                        imageView.setRotation(180.0f);
                    } else {
                        imageView.setRotation(0.0f);
                    }
                }
            }
            constraintLayout.setOnClickListener(new c(aweme, str, constraintLayout));
        }
    }
}
