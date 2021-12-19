package com.ss.android.ugc.aweme.commentStickerPanel;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.ss.android.ugc.aweme.commentStickerPanel.l;
import com.ss.android.ugc.aweme.property.df;
import com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class e extends Fragment {

    /* renamed from: h  reason: collision with root package name */
    public static final a f73153h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public CommentAndQuestionAndQuestionStickerPanelViewModel f73154a;

    /* renamed from: b  reason: collision with root package name */
    public View f73155b;

    /* renamed from: c  reason: collision with root package name */
    l f73156c;

    /* renamed from: d  reason: collision with root package name */
    l f73157d;

    /* renamed from: e  reason: collision with root package name */
    l f73158e;

    /* renamed from: f  reason: collision with root package name */
    l f73159f;

    /* renamed from: g  reason: collision with root package name */
    l f73160g;

    /* renamed from: i  reason: collision with root package name */
    private String f73161i;

    /* renamed from: j  reason: collision with root package name */
    private CommentAndQuestionAndQuestionStickerPanelViewModel.a f73162j = CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f73163k;

    /* renamed from: l  reason: collision with root package name */
    private View f73164l;

    /* renamed from: m  reason: collision with root package name */
    private View f73165m;
    private View n;
    private t<Boolean> o = new t<>();
    private t<Boolean> p = new t<>();
    private HashMap q;

    static {
        Covode.recordClassIndex(45065);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(45066);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(45069);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commentStickerPanel.e$e  reason: collision with other inner class name */
    public static final class C1630e extends m implements h.f.a.a<z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(45070);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1630e(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c5, code lost:
        if (r0.a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cf, code lost:
        if (r0.a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00df, code lost:
        if (r0.a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e9, code lost:
        if (r0.a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f3, code lost:
        if (r0.a() == false) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00fc, code lost:
        a("normal");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0101, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentStickerPanel.e.a():void");
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f73166a;

        static {
            Covode.recordClassIndex(45067);
        }

        b(e eVar) {
            this.f73166a = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f73166a.a("loading");
            CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73166a.f73154a;
            if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                l.a("commentAndQuestionStickerPanelViewModel");
            }
            commentAndQuestionAndQuestionStickerPanelViewModel.a();
            this.f73166a.a();
        }
    }

    static final class c<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f73167a;

        static {
            Covode.recordClassIndex(45068);
        }

        c(e eVar) {
            this.f73167a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            View view = this.f73167a.f73155b;
            if (view == null) {
                l.a("shallowView");
            }
            l.b(bool, "");
            if (bool.booleanValue()) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view.setVisibility(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        View view = this.f73165m;
        if (view == null) {
            l.a("networkErrorPage");
        }
        ((TuxButton) view.findViewById(R.id.axq)).setOnClickListener(new b(this));
    }

    public final void a(String str) {
        View view;
        switch (str.hashCode()) {
            case -1039745817:
                if (str.equals("normal")) {
                    LinearLayout linearLayout = this.f73163k;
                    if (linearLayout == null) {
                        l.a("normalPage");
                    }
                    linearLayout.setVisibility(0);
                    View view2 = this.f73164l;
                    if (view2 == null) {
                        l.a("emptyStickerPage");
                    }
                    view2.setVisibility(8);
                    View view3 = this.f73165m;
                    if (view3 == null) {
                        l.a("networkErrorPage");
                    }
                    view3.setVisibility(8);
                    View view4 = this.n;
                    if (view4 == null) {
                        l.a("loadingPage");
                    }
                    view4.setVisibility(8);
                    return;
                }
                return;
            case 96634189:
                if (str.equals("empty")) {
                    LinearLayout linearLayout2 = this.f73163k;
                    if (linearLayout2 == null) {
                        l.a("normalPage");
                    }
                    linearLayout2.setVisibility(8);
                    View view5 = this.f73164l;
                    if (view5 == null) {
                        l.a("emptyStickerPage");
                    }
                    view5.setVisibility(0);
                    View view6 = this.f73165m;
                    if (view6 == null) {
                        l.a("networkErrorPage");
                    }
                    view6.setVisibility(8);
                    View view7 = this.n;
                    if (view7 == null) {
                        l.a("loadingPage");
                    }
                    view7.setVisibility(8);
                    View view8 = getView();
                    if (view8 != null) {
                        view = view8.findViewById(R.id.bjc);
                    } else {
                        view = null;
                    }
                    String str2 = this.f73161i;
                    if (str2 == null) {
                        l.a("tabTitle");
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73154a;
                    if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                        l.a("commentAndQuestionStickerPanelViewModel");
                    }
                    if (l.a((Object) str2, (Object) commentAndQuestionAndQuestionStickerPanelViewModel.f73090a.get(0))) {
                        if (view != null) {
                            view.setBackgroundResource(2131232231);
                        }
                        View view9 = this.f73164l;
                        if (view9 == null) {
                            l.a("emptyStickerPage");
                        }
                        View findViewById = view9.findViewById(R.id.a_s);
                        l.b(findViewById, "");
                        ((TuxTextView) findViewById).setText(view9.getContext().getString(R.string.f36));
                        View findViewById2 = view9.findViewById(R.id.a_r);
                        l.b(findViewById2, "");
                        ((TuxTextView) findViewById2).setText(view9.getContext().getString(R.string.f34));
                        return;
                    }
                    String str3 = this.f73161i;
                    if (str3 == null) {
                        l.a("tabTitle");
                    }
                    CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel2 = this.f73154a;
                    if (commentAndQuestionAndQuestionStickerPanelViewModel2 == null) {
                        l.a("commentAndQuestionStickerPanelViewModel");
                    }
                    if (l.a((Object) str3, (Object) commentAndQuestionAndQuestionStickerPanelViewModel2.f73090a.get(1))) {
                        if (view != null) {
                            view.setBackgroundResource(2131232232);
                        }
                        View view10 = this.f73164l;
                        if (view10 == null) {
                            l.a("emptyStickerPage");
                        }
                        View findViewById3 = view10.findViewById(R.id.a_s);
                        l.b(findViewById3, "");
                        ((TuxTextView) findViewById3).setText(view10.getContext().getString(R.string.f33));
                        View findViewById4 = view10.findViewById(R.id.a_r);
                        l.b(findViewById4, "");
                        ((TuxTextView) findViewById4).setText(view10.getContext().getString(R.string.f31));
                        return;
                    }
                    return;
                }
                return;
            case 96784904:
                if (str.equals("error")) {
                    LinearLayout linearLayout3 = this.f73163k;
                    if (linearLayout3 == null) {
                        l.a("normalPage");
                    }
                    linearLayout3.setVisibility(8);
                    View view11 = this.f73164l;
                    if (view11 == null) {
                        l.a("emptyStickerPage");
                    }
                    view11.setVisibility(8);
                    View view12 = this.f73165m;
                    if (view12 == null) {
                        l.a("networkErrorPage");
                    }
                    view12.setVisibility(0);
                    View view13 = this.f73165m;
                    if (view13 == null) {
                        l.a("networkErrorPage");
                    }
                    View findViewById5 = view13.findViewById(R.id.a_y);
                    l.b(findViewById5, "");
                    findViewById5.setVisibility(8);
                    View view14 = this.f73165m;
                    if (view14 == null) {
                        l.a("networkErrorPage");
                    }
                    View findViewById6 = view14.findViewById(R.id.a_t);
                    l.b(findViewById6, "");
                    ((TuxTextView) findViewById6).setText(view14.getContext().getString(R.string.f30));
                    View view15 = this.n;
                    if (view15 == null) {
                        l.a("loadingPage");
                    }
                    view15.setVisibility(8);
                    return;
                }
                return;
            case 336650556:
                if (str.equals("loading")) {
                    LinearLayout linearLayout4 = this.f73163k;
                    if (linearLayout4 == null) {
                        l.a("normalPage");
                    }
                    linearLayout4.setVisibility(8);
                    View view16 = this.f73164l;
                    if (view16 == null) {
                        l.a("emptyStickerPage");
                    }
                    view16.setVisibility(8);
                    View view17 = this.f73165m;
                    if (view17 == null) {
                        l.a("networkErrorPage");
                    }
                    view17.setVisibility(8);
                    View view18 = this.n;
                    if (view18 == null) {
                        l.a("loadingPage");
                    }
                    view18.setVisibility(0);
                    View view19 = this.n;
                    if (view19 == null) {
                        l.a("loadingPage");
                    }
                    View findViewById7 = view19.findViewById(R.id.ci9);
                    l.b(findViewById7, "");
                    ((DoubleColorBallAnimationView) findViewById7).setVisibility(0);
                    return;
                }
                return;
            case 1729423394:
                if (str.equals("noInternet")) {
                    LinearLayout linearLayout5 = this.f73163k;
                    if (linearLayout5 == null) {
                        l.a("normalPage");
                    }
                    linearLayout5.setVisibility(8);
                    View view20 = this.f73164l;
                    if (view20 == null) {
                        l.a("emptyStickerPage");
                    }
                    view20.setVisibility(8);
                    View view21 = this.f73165m;
                    if (view21 == null) {
                        l.a("networkErrorPage");
                    }
                    view21.setVisibility(0);
                    View view22 = this.f73165m;
                    if (view22 == null) {
                        l.a("networkErrorPage");
                    }
                    View findViewById8 = view22.findViewById(R.id.a_u);
                    l.b(findViewById8, "");
                    ((TuxTextView) findViewById8).setText(view22.getContext().getString(R.string.cjw));
                    View findViewById9 = view22.findViewById(R.id.a_t);
                    l.b(findViewById9, "");
                    ((TuxTextView) findViewById9).setText(view22.getContext().getString(R.string.cjv));
                    View view23 = this.n;
                    if (view23 == null) {
                        l.a("loadingPage");
                    }
                    view23.setVisibility(8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        a();
        this.p.observe(this, new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.i(2001);
        l.d(layoutInflater, "");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(activity).a(CommentAndQuestionAndQuestionStickerPanelViewModel.class);
            l.b(a2, "");
            this.f73154a = (CommentAndQuestionAndQuestionStickerPanelViewModel) a2;
            View a3 = com.a.a(layoutInflater, R.layout.nn, viewGroup, false);
            View findViewById = a3.findViewById(R.id.cw_);
            if (findViewById != null) {
                this.f73163k = (LinearLayout) findViewById;
                View findViewById2 = a3.findViewById(R.id.cw1);
                l.b(findViewById2, "");
                this.f73164l = findViewById2;
                View findViewById3 = a3.findViewById(R.id.cu8);
                l.b(findViewById3, "");
                this.f73165m = findViewById3;
                View findViewById4 = a3.findViewById(R.id.chy);
                l.b(findViewById4, "");
                this.n = findViewById4;
                View findViewById5 = a3.findViewById(R.id.aab);
                l.b(findViewById5, "");
                this.f73155b = findViewById5;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    String string = arguments.getString("tabTitle", "");
                    l.b(string, "");
                    this.f73161i = string;
                }
                String str = this.f73161i;
                if (str == null) {
                    l.a("tabTitle");
                }
                CommentAndQuestionAndQuestionStickerPanelViewModel commentAndQuestionAndQuestionStickerPanelViewModel = this.f73154a;
                if (commentAndQuestionAndQuestionStickerPanelViewModel == null) {
                    l.a("commentAndQuestionStickerPanelViewModel");
                }
                if (l.a((Object) str, (Object) commentAndQuestionAndQuestionStickerPanelViewModel.f73090a.get(0))) {
                    this.f73162j = CommentAndQuestionAndQuestionStickerPanelViewModel.a.SuggestTab;
                    Context context = getContext();
                    if (context != null) {
                        if (df.b()) {
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                            l.b(context, "");
                            this.f73156c = new l(context, l.a.InvitationQuestion, (byte) 0);
                            l lVar = this.f73159f;
                            if (lVar != null) {
                                lVar.setLayoutParams(layoutParams);
                            }
                            LinearLayout linearLayout = this.f73163k;
                            if (linearLayout == null) {
                                h.f.b.l.a("normalPage");
                            }
                            linearLayout.addView(this.f73156c);
                        }
                        if (df.c()) {
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                            h.f.b.l.b(context, "");
                            l lVar2 = new l(context, l.a.RecommendQuestion, (byte) 0);
                            this.f73157d = lVar2;
                            lVar2.setLayoutParams(layoutParams2);
                            LinearLayout linearLayout2 = this.f73163k;
                            if (linearLayout2 == null) {
                                h.f.b.l.a("normalPage");
                            }
                            linearLayout2.addView(this.f73157d);
                        }
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        h.f.b.l.b(context, "");
                        l lVar3 = new l(context, l.a.RecommendComment, (byte) 0);
                        this.f73158e = lVar3;
                        lVar3.setLayoutParams(layoutParams3);
                        LinearLayout linearLayout3 = this.f73163k;
                        if (linearLayout3 == null) {
                            h.f.b.l.a("normalPage");
                        }
                        linearLayout3.addView(this.f73158e);
                    }
                } else {
                    this.f73162j = CommentAndQuestionAndQuestionStickerPanelViewModel.a.FavoriteTab;
                    Context context2 = getContext();
                    if (context2 != null) {
                        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                        if (df.d()) {
                            h.f.b.l.b(context2, "");
                            l lVar4 = new l(context2, l.a.FavoriteQuestion, (byte) 0);
                            this.f73159f = lVar4;
                            lVar4.setLayoutParams(layoutParams4);
                            LinearLayout linearLayout4 = this.f73163k;
                            if (linearLayout4 == null) {
                                h.f.b.l.a("normalPage");
                            }
                            linearLayout4.addView(this.f73159f);
                        }
                        h.f.b.l.b(context2, "");
                        this.f73160g = new l(context2, l.a.FavoriteComment, (byte) 0);
                        l lVar5 = this.f73158e;
                        if (lVar5 != null) {
                            lVar5.setLayoutParams(layoutParams4);
                        }
                        LinearLayout linearLayout5 = this.f73163k;
                        if (linearLayout5 == null) {
                            h.f.b.l.a("normalPage");
                        }
                        linearLayout5.addView(this.f73160g);
                    }
                }
                MethodCollector.o(2001);
                return a3;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            MethodCollector.o(2001);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        MethodCollector.o(2001);
        throw nullPointerException2;
    }
}
