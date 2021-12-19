package com.ss.android.ugc.aweme.search.survey;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchResultViewModel;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.survey.d;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.ef;
import com.ss.android.ugc.aweme.utils.eg;
import com.ss.android.ugc.aweme.utils.hl;
import com.zhiliaoapp.musically.R;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final class SurveyViewController implements eg {
    public static final b o = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public ViewStub f121612a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.fragment.app.e f121613b;

    /* renamed from: c  reason: collision with root package name */
    public View f121614c;

    /* renamed from: d  reason: collision with root package name */
    View f121615d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f121616e;

    /* renamed from: f  reason: collision with root package name */
    public ViewGroup f121617f;

    /* renamed from: g  reason: collision with root package name */
    List<? extends ImageView> f121618g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f121619h;

    /* renamed from: i  reason: collision with root package name */
    public View f121620i;

    /* renamed from: j  reason: collision with root package name */
    public LottieAnimationView f121621j;

    /* renamed from: k  reason: collision with root package name */
    public SearchSurveyConfig f121622k = new SearchSurveyConfig();

    /* renamed from: l  reason: collision with root package name */
    public d.a f121623l = new d.a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    final h.h f121624m = h.i.a((h.f.a.a) new m(this));
    public int n;
    private final h.h p = h.i.a((h.f.a.a) new d(this));
    private final h.h q = h.i.a((h.f.a.a) new r(this));
    private final h.h r = h.i.a((h.f.a.a) new l(this));
    private boolean s;
    private boolean t;

    /* access modifiers changed from: package-private */
    public static final class a extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private static final C3145a f121625b = new C3145a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        final WeakReference<SurveyViewController> f121626a;

        static {
            Covode.recordClassIndex(79215);
        }

        /* renamed from: com.ss.android.ugc.aweme.search.survey.SurveyViewController$a$a  reason: collision with other inner class name */
        static final class C3145a {
            static {
                Covode.recordClassIndex(79216);
            }

            private C3145a() {
            }

            public /* synthetic */ C3145a(byte b2) {
                this();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(SurveyViewController surveyViewController) {
            super(Looper.getMainLooper());
            h.f.b.l.d(surveyViewController, "");
            this.f121626a = new WeakReference<>(surveyViewController);
        }

        public final void a(int i2) {
            SearchSurveyConfig searchSurveyConfig;
            SurveyViewController surveyViewController = this.f121626a.get();
            if (surveyViewController != null && (searchSurveyConfig = surveyViewController.f121622k) != null) {
                long submitResultDelay = searchSurveyConfig.getSubmitResultDelay();
                removeMessages(2);
                removeMessages(3);
                sendMessageDelayed(obtainMessage(3, Integer.valueOf(i2)), TimeUnit.SECONDS.toMillis(submitResultDelay));
            }
        }

        public final void handleMessage(Message message) {
            SurveyViewController surveyViewController;
            h.f.b.l.d(message, "");
            int i2 = message.what;
            Integer num = null;
            if (i2 == 1) {
                SurveyViewController surveyViewController2 = this.f121626a.get();
                if (surveyViewController2 != null) {
                    surveyViewController2.f121622k.getSurveyId();
                    String surveyId = surveyViewController2.f121622k.getSurveyId();
                    if (surveyId == null) {
                        surveyId = "";
                    }
                    h.f.b.l.d(surveyId, "");
                    SurveyApi.a().fetch(surveyId).a(new c(surveyViewController2), b.i.f4826c, null);
                }
            } else if (i2 == 2) {
                SurveyViewController surveyViewController3 = this.f121626a.get();
                if (surveyViewController3 != null) {
                    surveyViewController3.a(0L);
                }
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof Integer) {
                    num = obj;
                }
                Integer num2 = num;
                SurveyViewController surveyViewController4 = this.f121626a.get();
                if (surveyViewController4 != null) {
                    surveyViewController4.a(num2);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(300L);
                    ofFloat.setInterpolator(androidx.core.h.b.b.a(0.25f, 1.0f, 0.25f, 1.0f));
                    ofFloat.addUpdateListener(new j(surveyViewController4));
                    ofFloat.addListener(new k(surveyViewController4));
                    ofFloat.start();
                }
            } else if (i2 == 4 && (surveyViewController = this.f121626a.get()) != null) {
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                surveyViewController.a(((Integer) obj2).intValue());
            }
        }
    }

    static {
        Covode.recordClassIndex(79214);
    }

    public final a a() {
        return (a) this.p.getValue();
    }

    public final SurveyViewModel b() {
        return (SurveyViewModel) this.q.getValue();
    }

    static final class b {
        static {
            Covode.recordClassIndex(79217);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        eg.a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        eg.a.onDestroy(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        eg.a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_START)
    public final void onStart() {
        eg.a.onStart(this);
    }

    static final class d extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ SurveyViewController this$0;

        static {
            Covode.recordClassIndex(79219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(SurveyViewController surveyViewController) {
            super(0);
            this.this$0 = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a(this.this$0);
        }
    }

    private final boolean g() {
        if (this.f121614c != null) {
            return true;
        }
        return false;
    }

    public final void e() {
        a().removeCallbacksAndMessages(null);
        a(0L);
    }

    static final class l extends h.f.b.m implements h.f.a.a<SearchResultViewModel> {
        final /* synthetic */ SurveyViewController this$0;

        static {
            Covode.recordClassIndex(79228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(SurveyViewController surveyViewController) {
            super(0);
            this.this$0 = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchResultViewModel invoke() {
            return ae.a(SurveyViewController.a(this.this$0), (ad.b) null).a(SearchResultViewModel.class);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<SearchStateViewModel> {
        final /* synthetic */ SurveyViewController this$0;

        static {
            Covode.recordClassIndex(79229);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(SurveyViewController surveyViewController) {
            super(0);
            this.this$0 = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SearchStateViewModel invoke() {
            return ae.a(SurveyViewController.a(this.this$0), (ad.b) null).a(SearchStateViewModel.class);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewModel f121644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121645b;

        static {
            Covode.recordClassIndex(79233);
        }

        q(SurveyViewModel surveyViewModel, SurveyViewController surveyViewController) {
            this.f121644a = surveyViewModel;
            this.f121645b = surveyViewController;
        }

        public final void run() {
            this.f121644a.f121648c.removeObservers(SurveyViewController.a(this.f121645b));
            this.f121644a.f121646a.removeObservers(SurveyViewController.a(this.f121645b));
        }
    }

    static final class r extends h.f.b.m implements h.f.a.a<SurveyViewModel> {
        final /* synthetic */ SurveyViewController this$0;

        static {
            Covode.recordClassIndex(79234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(SurveyViewController surveyViewController) {
            super(0);
            this.this$0 = surveyViewController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SurveyViewModel invoke() {
            return ae.a(SurveyViewController.a(this.this$0), (ad.b) null).a(SurveyViewModel.class);
        }
    }

    public final com.ss.android.ugc.aweme.search.k.q c() {
        androidx.fragment.app.e eVar = this.f121613b;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        return am.a(eVar.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onResume() {
        if (this.s && d()) {
            this.s = false;
            a().a(this.n);
        }
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onStop() {
        View view = this.f121614c;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        if (view.getVisibility() == 0) {
            a().removeCallbacksAndMessages(null);
            this.s = true;
        }
    }

    public final boolean d() {
        if (this.f121614c == null) {
            return false;
        }
        View view = this.f121614c;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        View view2 = this.f121614c;
        if (view2 == null) {
            h.f.b.l.a("rootView");
        }
        if (view2.getAlpha() == 1.0f) {
            return true;
        }
        return false;
    }

    public final void f() {
        if (g()) {
            View view = this.f121614c;
            if (view == null) {
                h.f.b.l.a("rootView");
            }
            view.setVisibility(8);
        }
        this.s = false;
        this.n = 0;
        a().removeCallbacksAndMessages(null);
        a().post(new q(b(), this));
        androidx.fragment.app.e eVar = this.f121613b;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        ef.b(eVar, this);
    }

    public static final class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f121635b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f121636c;

        static {
            Covode.recordClassIndex(79223);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f121634a.f();
        }

        h(SurveyViewController surveyViewController, long j2, float f2) {
            this.f121634a = surveyViewController;
            this.f121635b = j2;
            this.f121636c = f2;
        }
    }

    public static final class i extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121637a;

        static {
            Covode.recordClassIndex(79224);
        }

        i(SurveyViewController surveyViewController) {
            this.f121637a = surveyViewController;
        }

        public final void onAnimationEnd(Animator animator) {
            String str;
            int i2;
            String str2;
            String str3;
            SearchSurveyConfig searchSurveyConfig;
            com.ss.android.ugc.aweme.search.k.ad c2;
            com.ss.android.ugc.aweme.search.k.ad c3;
            String a2 = com.ss.android.ugc.aweme.search.j.a(SurveyViewController.a(this.f121637a));
            com.ss.android.ugc.aweme.search.k.q c4 = this.f121637a.c();
            c cVar = new c();
            String str4 = null;
            if (c4 == null || (c3 = c4.c()) == null) {
                str = null;
            } else {
                str = c3.f121172a;
            }
            com.ss.android.ugc.aweme.search.k.c a3 = cVar.a(str);
            if (c4 != null) {
                i2 = c4.a();
            } else {
                i2 = -1;
            }
            com.ss.android.ugc.aweme.search.k.c f2 = a3.f(com.ss.android.ugc.aweme.search.j.a(i2));
            if (c4 == null || (c2 = c4.c()) == null) {
                str2 = null;
            } else {
                str2 = c2.f121173b;
            }
            com.ss.android.ugc.aweme.search.k.b o = f2.b(str2).o(a2);
            com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
            if (b2 != null) {
                str3 = b2.getSearchKeyword();
            } else {
                str3 = null;
            }
            com.ss.android.ugc.aweme.metrics.c a4 = o.a("search_keyword_x", str3);
            com.ss.android.ugc.aweme.search.n.h b3 = d.a.b();
            if (b3 != null) {
                str4 = b3.getSearchId();
            }
            a4.a("search_id_x", str4).f();
            a a5 = this.f121637a.a();
            SurveyViewController surveyViewController = a5.f121626a.get();
            if (surveyViewController != null && (searchSurveyConfig = surveyViewController.f121622k) != null) {
                long showDuration = searchSurveyConfig.getShowDuration();
                a5.removeMessages(2);
                a5.sendEmptyMessageDelayed(2, TimeUnit.SECONDS.toMillis(showDuration));
            }
        }
    }

    public static final class k extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121639a;

        static {
            Covode.recordClassIndex(79226);
        }

        k(SurveyViewController surveyViewController) {
            this.f121639a = surveyViewController;
        }

        public final void onAnimationEnd(Animator animator) {
            SurveyViewController.d(this.f121639a).a(new AnimatorListenerAdapter(this) {
                /* class com.ss.android.ugc.aweme.search.survey.SurveyViewController.k.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ k f121640a;

                static {
                    Covode.recordClassIndex(79227);
                }

                {
                    this.f121640a = r1;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f121640a.f121639a.a(1000L);
                }

                public final void onAnimationStart(Animator animator) {
                    SurveyViewController.d(this.f121640a.f121639a).setAlpha(1.0f);
                }
            });
            SurveyViewController.d(this.f121639a).a();
        }

        public final void onAnimationStart(Animator animator) {
            SurveyViewController.c(this.f121639a).setVisibility(0);
            SurveyViewController.d(this.f121639a).setAlpha(0.0f);
            ViewGroup viewGroup = this.f121639a.f121617f;
            if (viewGroup == null) {
                h.f.b.l.a("starGroupLayout");
            }
            viewGroup.setVisibility(8);
            TextView textView = this.f121639a.f121619h;
            if (textView == null) {
                h.f.b.l.a("starDesc");
            }
            textView.setVisibility(8);
            SurveyViewController.b(this.f121639a).setText(R.string.f7w);
        }
    }

    public static final /* synthetic */ androidx.fragment.app.e a(SurveyViewController surveyViewController) {
        androidx.fragment.app.e eVar = surveyViewController.f121613b;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        return eVar;
    }

    public static final /* synthetic */ TextView b(SurveyViewController surveyViewController) {
        TextView textView = surveyViewController.f121616e;
        if (textView == null) {
            h.f.b.l.a("titleText");
        }
        return textView;
    }

    public static final /* synthetic */ View c(SurveyViewController surveyViewController) {
        View view = surveyViewController.f121620i;
        if (view == null) {
            h.f.b.l.a("lottieGroup");
        }
        return view;
    }

    public static final /* synthetic */ LottieAnimationView d(SurveyViewController surveyViewController) {
        LottieAnimationView lottieAnimationView = surveyViewController.f121621j;
        if (lottieAnimationView == null) {
            h.f.b.l.a("lottieView");
        }
        return lottieAnimationView;
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121633a;

        static {
            Covode.recordClassIndex(79222);
        }

        g(SurveyViewController surveyViewController) {
            this.f121633a = surveyViewController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f121633a.a().removeCallbacksAndMessages(null);
            this.f121633a.a(0L);
        }
    }

    static final class n<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121641a;

        static {
            Covode.recordClassIndex(79230);
        }

        n(SurveyViewController surveyViewController) {
            this.f121641a = surveyViewController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                SurveyViewController surveyViewController = this.f121641a;
                surveyViewController.a(Integer.valueOf(surveyViewController.n));
                this.f121641a.e();
            }
        }
    }

    static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121642a;

        static {
            Covode.recordClassIndex(79231);
        }

        o(SurveyViewController surveyViewController) {
            this.f121642a = surveyViewController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            h.f.b.l.b(bool, "");
            if (bool.booleanValue()) {
                this.f121642a.e();
            }
        }
    }

    static final class p<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121643a;

        static {
            Covode.recordClassIndex(79232);
        }

        p(SurveyViewController surveyViewController) {
            this.f121643a = surveyViewController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            this.f121643a.d();
            h.f.b.l.b(bool, "");
            if (bool.booleanValue() && this.f121643a.d()) {
                this.f121643a.e();
            }
        }
    }

    static final class j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121638a;

        static {
            Covode.recordClassIndex(79225);
        }

        j(SurveyViewController surveyViewController) {
            this.f121638a = surveyViewController;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            SurveyViewController.b(this.f121638a).setAlpha(floatValue);
            SurveyViewController.c(this.f121638a).setAlpha(floatValue);
        }
    }

    public final void a(int i2) {
        androidx.fragment.app.e eVar = this.f121613b;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        if (com.ss.android.ugc.aweme.search.feedback.a.a(eVar, null, true, null, "survey")) {
            this.t = true;
            return;
        }
        this.t = false;
        a().a(i2);
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121627a;

        static {
            Covode.recordClassIndex(79218);
        }

        c(SurveyViewController surveyViewController) {
            this.f121627a = surveyViewController;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            String str;
            List<String> list;
            h.f.b.l.b(iVar, "");
            iVar.d();
            d.a aVar = ((d) iVar.d()).f121652a;
            if (aVar != null && (str = aVar.f121653a) != null && hl.a(str) && (list = aVar.f121654b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().length() == 0) {
                            break;
                        }
                    } else {
                        this.f121627a.f121623l = aVar;
                        SurveyViewController.b(this.f121627a).setText(aVar.f121653a);
                        SurveyViewController surveyViewController = this.f121627a;
                        View view = surveyViewController.f121614c;
                        if (view == null) {
                            h.f.b.l.a("rootView");
                        }
                        view.setAlpha(0.0f);
                        View view2 = surveyViewController.f121614c;
                        if (view2 == null) {
                            h.f.b.l.a("rootView");
                        }
                        view2.setVisibility(0);
                        View view3 = surveyViewController.f121614c;
                        if (view3 == null) {
                            h.f.b.l.a("rootView");
                        }
                        View view4 = surveyViewController.f121614c;
                        if (view4 == null) {
                            h.f.b.l.a("rootView");
                        }
                        float height = (float) view4.getHeight();
                        View view5 = surveyViewController.f121614c;
                        if (view5 == null) {
                            h.f.b.l.a("rootView");
                        }
                        ViewGroup.LayoutParams layoutParams = view5.getLayoutParams();
                        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        view3.setTranslationY(height + ((float) ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300L);
                        animatorSet.setInterpolator(androidx.core.h.b.b.a(0.25f, 1.0f, 0.25f, 1.0f));
                        Animator[] animatorArr = new Animator[2];
                        View view6 = surveyViewController.f121614c;
                        if (view6 == null) {
                            h.f.b.l.a("rootView");
                        }
                        Property property = View.TRANSLATION_Y;
                        float[] fArr = new float[2];
                        View view7 = surveyViewController.f121614c;
                        if (view7 == null) {
                            h.f.b.l.a("rootView");
                        }
                        fArr[0] = view7.getTranslationY();
                        fArr[1] = 0.0f;
                        animatorArr[0] = ObjectAnimator.ofFloat(view6, property, fArr);
                        View view8 = surveyViewController.f121614c;
                        if (view8 == null) {
                            h.f.b.l.a("rootView");
                        }
                        animatorArr[1] = ObjectAnimator.ofFloat(view8, View.ALPHA, 0.0f, 1.0f);
                        animatorSet.playTogether(animatorArr);
                        animatorSet.addListener(new i(surveyViewController));
                        animatorSet.start();
                    }
                }
            }
            return z.f158842a;
        }
    }

    public final void a(long j2) {
        if (!d()) {
            f();
            return;
        }
        View view = this.f121614c;
        if (view == null) {
            h.f.b.l.a("rootView");
        }
        float height = (float) view.getHeight();
        View view2 = this.f121614c;
        if (view2 == null) {
            h.f.b.l.a("rootView");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        float f2 = height + ((float) ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(j2);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(androidx.core.h.b.b.a(0.25f, 1.0f, 0.25f, 1.0f));
        Animator[] animatorArr = new Animator[2];
        View view3 = this.f121614c;
        if (view3 == null) {
            h.f.b.l.a("rootView");
        }
        animatorArr[0] = ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, 0.0f, f2);
        View view4 = this.f121614c;
        if (view4 == null) {
            h.f.b.l.a("rootView");
        }
        animatorArr[1] = ObjectAnimator.ofFloat(view4, View.ALPHA, 1.0f, 0.0f);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new h(this, j2, f2));
        animatorSet.start();
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f121629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f121630b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f121631c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121632d;

        static {
            Covode.recordClassIndex(79221);
        }

        f(int i2, List list, ViewGroup viewGroup, SurveyViewController surveyViewController) {
            this.f121629a = i2;
            this.f121630b = list;
            this.f121631c = viewGroup;
            this.f121632d = surveyViewController;
        }

        public final void onClick(View view) {
            int i2;
            ClickAgent.onClick(view);
            SurveyViewController surveyViewController = this.f121632d;
            h.f.b.l.b(view, "");
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            surveyViewController.n = intValue + 1;
            List<? extends ImageView> list = surveyViewController.f121618g;
            if (list == null) {
                h.f.b.l.a("starViewList");
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 <= intValue) {
                    i2 = 2131233596;
                } else {
                    i2 = 2131233595;
                }
                List<? extends ImageView> list2 = surveyViewController.f121618g;
                if (list2 == null) {
                    h.f.b.l.a("starViewList");
                }
                ((ImageView) list2.get(i3)).setImageResource(i2);
            }
            TextView textView = surveyViewController.f121619h;
            if (textView == null) {
                h.f.b.l.a("starDesc");
            }
            List<String> list3 = surveyViewController.f121623l.f121654b;
            textView.setText(list3 != null ? list3.get(intValue) : null);
            TextView textView2 = surveyViewController.f121619h;
            if (textView2 == null) {
                h.f.b.l.a("starDesc");
            }
            if (textView2.getAlpha() < 1.0f) {
                TextView textView3 = surveyViewController.f121619h;
                if (textView3 == null) {
                    h.f.b.l.a("starDesc");
                }
                textView3.setAlpha(0.0f);
                textView3.setVisibility(0);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150L);
                animatorSet.setInterpolator(androidx.core.h.b.b.a(0.25f, 1.0f, 0.25f, 1.0f));
                Animator[] animatorArr = new Animator[2];
                TextView textView4 = surveyViewController.f121619h;
                if (textView4 == null) {
                    h.f.b.l.a("starDesc");
                }
                animatorArr[0] = ObjectAnimator.ofFloat(textView4, View.ALPHA, 0.0f, 1.0f);
                ViewGroup viewGroup = surveyViewController.f121617f;
                if (viewGroup == null) {
                    h.f.b.l.a("starGroupLayout");
                }
                animatorArr[1] = ObjectAnimator.ofFloat(viewGroup, View.TRANSLATION_Y, 0.0f, by.a(-10));
                animatorSet.playTogether(animatorArr);
                animatorSet.start();
            }
            surveyViewController.a().removeCallbacksAndMessages(null);
            if (intValue <= 2) {
                a a2 = surveyViewController.a();
                int i4 = surveyViewController.n;
                a2.removeMessages(4);
                a2.sendMessageDelayed(a2.obtainMessage(4, Integer.valueOf(i4)), 250);
                return;
            }
            surveyViewController.a().a(surveyViewController.n);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r7 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r0 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0052, code lost:
        r5 = new com.ss.android.ugc.aweme.search.survey.e(r2, r1, r0, r6);
        r1 = r8.f121613b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        h.f.b.l.a("activity");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r2 = com.ss.android.ugc.aweme.search.j.a(r1);
        r7 = c();
        r1 = new com.ss.android.ugc.aweme.search.survey.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r7 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r0 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r0 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r0 = r0.f121172a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        r1 = r1.a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        if (r7 == null) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007b, code lost:
        r0 = r7.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007f, code lost:
        r1 = r1.f(com.ss.android.ugc.aweme.search.j.a(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0087, code lost:
        if (r7 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0089, code lost:
        r0 = r7.c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        if (r0 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008f, code lost:
        r0 = r0.f121173b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0091, code lost:
        r2 = r1.b(r0).o(r2);
        r2.a("star_num", r6);
        r0 = com.ss.android.ugc.aweme.search.n.d.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r0 == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
        r1 = r0.getSearchKeyword();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        r1 = r2.a("search_keyword_x", r1);
        r0 = com.ss.android.ugc.aweme.search.n.d.a.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r0 == null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r4 = r0.getSearchId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b8, code lost:
        r1.a("search_id_x", r4).f();
        h.f.b.l.d(r5, "");
        com.ss.android.ugc.aweme.search.survey.SurveyApi.a().submit(r5.f121655a, r5.f121656b, r5.f121658d, r5.f121657c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d9, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00db, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Integer r9) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.survey.SurveyViewController.a(java.lang.Integer):void");
    }

    public static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SurveyViewController f121628a;

        static {
            Covode.recordClassIndex(79220);
        }

        public e(SurveyViewController surveyViewController) {
            this.f121628a = surveyViewController;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            SearchSurveyConfig searchSurveyConfig;
            MethodCollector.i(501);
            SearchSurveyConfig searchSurveyConfig2 = (SearchSurveyConfig) obj;
            searchSurveyConfig2.getEnabled();
            searchSurveyConfig2.getSurveyId();
            searchSurveyConfig2.getShowDelay();
            if (searchSurveyConfig2.getEnabled() && hl.a(searchSurveyConfig2.getSurveyId()) && searchSurveyConfig2.getShowDelay() >= 0) {
                SurveyViewController surveyViewController = this.f121628a;
                SurveyViewModel b2 = surveyViewController.b();
                NextLiveData<Boolean> nextLiveData = b2.f121646a;
                androidx.fragment.app.e eVar = surveyViewController.f121613b;
                if (eVar == null) {
                    h.f.b.l.a("activity");
                }
                ef.a(nextLiveData, eVar, new n(surveyViewController));
                NextLiveData<Boolean> nextLiveData2 = b2.f121648c;
                androidx.fragment.app.e eVar2 = surveyViewController.f121613b;
                if (eVar2 == null) {
                    h.f.b.l.a("activity");
                }
                ef.a(nextLiveData2, eVar2, new o(surveyViewController));
                t<Boolean> tVar = ((SearchStateViewModel) surveyViewController.f121624m.getValue()).isRefreshingData;
                androidx.fragment.app.e eVar3 = surveyViewController.f121613b;
                if (eVar3 == null) {
                    h.f.b.l.a("activity");
                }
                ef.a(tVar, eVar3, new p(surveyViewController));
                androidx.fragment.app.e eVar4 = surveyViewController.f121613b;
                if (eVar4 == null) {
                    h.f.b.l.a("activity");
                }
                ef.a(eVar4, surveyViewController);
                SurveyViewController surveyViewController2 = this.f121628a;
                h.f.b.l.b(searchSurveyConfig2, "");
                surveyViewController2.f121622k = searchSurveyConfig2;
                if (this.f121628a.f121614c != null) {
                    SurveyViewController surveyViewController3 = this.f121628a;
                    View view = surveyViewController3.f121614c;
                    if (view == null) {
                        h.f.b.l.a("rootView");
                    }
                    view.setAlpha(0.0f);
                    view.setTranslationY(0.0f);
                    view.setVisibility(0);
                    TextView textView = surveyViewController3.f121619h;
                    if (textView == null) {
                        h.f.b.l.a("starDesc");
                    }
                    textView.setAlpha(0.0f);
                    textView.setVisibility(0);
                    TextView textView2 = surveyViewController3.f121616e;
                    if (textView2 == null) {
                        h.f.b.l.a("titleText");
                    }
                    textView2.setText("");
                    textView2.setAlpha(1.0f);
                    ViewGroup viewGroup = surveyViewController3.f121617f;
                    if (viewGroup == null) {
                        h.f.b.l.a("starGroupLayout");
                    }
                    viewGroup.setAlpha(1.0f);
                    viewGroup.setTranslationY(0.0f);
                    viewGroup.setVisibility(0);
                    List<? extends ImageView> list = surveyViewController3.f121618g;
                    if (list == null) {
                        h.f.b.l.a("starViewList");
                    }
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().setImageResource(2131233595);
                    }
                    View view2 = surveyViewController3.f121620i;
                    if (view2 == null) {
                        h.f.b.l.a("lottieGroup");
                    }
                    view2.setVisibility(8);
                    view2.setAlpha(0.0f);
                    LottieAnimationView lottieAnimationView = surveyViewController3.f121621j;
                    if (lottieAnimationView == null) {
                        h.f.b.l.a("lottieView");
                    }
                    lottieAnimationView.setAlpha(0.0f);
                } else {
                    SurveyViewController surveyViewController4 = this.f121628a;
                    ViewStub viewStub = surveyViewController4.f121612a;
                    if (viewStub == null) {
                        h.f.b.l.a("viewStub");
                    }
                    if (viewStub.getParent() != null) {
                        ViewStub viewStub2 = surveyViewController4.f121612a;
                        if (viewStub2 == null) {
                            h.f.b.l.a("viewStub");
                        }
                        if (viewStub2.getLayoutResource() != 0) {
                            ViewStub viewStub3 = surveyViewController4.f121612a;
                            if (viewStub3 == null) {
                                h.f.b.l.a("viewStub");
                            }
                            if (viewStub3.getLayoutResource() == 0) {
                                ViewStub viewStub4 = surveyViewController4.f121612a;
                                if (viewStub4 == null) {
                                    h.f.b.l.a("viewStub");
                                }
                                viewStub4.setLayoutResource(R.layout.axb);
                            }
                            ViewStub viewStub5 = surveyViewController4.f121612a;
                            if (viewStub5 == null) {
                                h.f.b.l.a("viewStub");
                            }
                            View inflate = viewStub5.inflate();
                            h.f.b.l.b(inflate, "");
                            surveyViewController4.f121614c = inflate;
                            View view3 = surveyViewController4.f121614c;
                            if (view3 == null) {
                                h.f.b.l.a("rootView");
                            }
                            view3.setAlpha(0.0f);
                            View findViewById = view3.findViewById(R.id.dvv);
                            h.f.b.l.b(findViewById, "");
                            surveyViewController4.f121615d = findViewById;
                            View findViewById2 = view3.findViewById(R.id.dvz);
                            h.f.b.l.b(findViewById2, "");
                            surveyViewController4.f121616e = (TextView) findViewById2;
                            View findViewById3 = view3.findViewById(R.id.dvu);
                            h.f.b.l.b(findViewById3, "");
                            surveyViewController4.f121620i = findViewById3;
                            View findViewById4 = view3.findViewById(R.id.dvt);
                            h.f.b.l.b(findViewById4, "");
                            surveyViewController4.f121621j = (LottieAnimationView) findViewById4;
                            View findViewById5 = view3.findViewById(R.id.dvj);
                            h.f.b.l.b(findViewById5, "");
                            surveyViewController4.f121619h = (TextView) findViewById5;
                            View findViewById6 = view3.findViewById(R.id.dvy);
                            h.f.b.l.b(findViewById6, "");
                            surveyViewController4.f121617f = (ViewGroup) findViewById6;
                            ViewGroup viewGroup2 = surveyViewController4.f121617f;
                            if (viewGroup2 == null) {
                                h.f.b.l.a("starGroupLayout");
                            }
                            ArrayList arrayList = new ArrayList();
                            int childCount = viewGroup2.getChildCount();
                            for (int i2 = 0; i2 < childCount; i2++) {
                                View childAt = viewGroup2.getChildAt(i2);
                                if (childAt != null) {
                                    ImageView imageView = (ImageView) childAt;
                                    imageView.setTag(Integer.valueOf(i2));
                                    imageView.setOnClickListener(new f(i2, arrayList, viewGroup2, surveyViewController4));
                                    arrayList.add(imageView);
                                } else {
                                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                                    MethodCollector.o(501);
                                    throw nullPointerException;
                                }
                            }
                            surveyViewController4.f121618g = arrayList;
                            LottieAnimationView lottieAnimationView2 = surveyViewController4.f121621j;
                            if (lottieAnimationView2 == null) {
                                h.f.b.l.a("lottieView");
                            }
                            lottieAnimationView2.setAnimation("search_check.json");
                            View view4 = surveyViewController4.f121615d;
                            if (view4 == null) {
                                h.f.b.l.a("closeView");
                            }
                            view4.setOnClickListener(new g(surveyViewController4));
                        }
                    }
                }
                a a2 = this.f121628a.a();
                SurveyViewController surveyViewController5 = a2.f121626a.get();
                if (surveyViewController5 == null || (searchSurveyConfig = surveyViewController5.f121622k) == null) {
                    MethodCollector.o(501);
                    return;
                }
                long showDelay = searchSurveyConfig.getShowDelay();
                a2.removeMessages(1);
                a2.sendEmptyMessageDelayed(1, TimeUnit.SECONDS.toMillis(showDelay));
            }
            MethodCollector.o(501);
        }
    }
}
