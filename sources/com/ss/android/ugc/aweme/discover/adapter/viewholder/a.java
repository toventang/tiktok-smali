package com.ss.android.ugc.aweme.discover.adapter.viewholder;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.discover.ui.al;
import com.ss.android.ugc.aweme.discover.viewmodel.SearchEnterViewModel;
import com.ss.android.ugc.aweme.search.k.bj;
import com.ss.android.ugc.aweme.search.k.bk;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.f;
import com.zhiliaoapp.musically.R;
import h.a.am;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.Objects;
import org.json.JSONObject;

public abstract class a extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener {

    /* renamed from: g  reason: collision with root package name */
    public static final C1879a f80617g = new C1879a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f80618a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationImageView f80619b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f80620c;

    /* renamed from: d  reason: collision with root package name */
    public final al.d f80621d;

    /* renamed from: e  reason: collision with root package name */
    public final SearchIntermediateViewModel f80622e;

    /* renamed from: f  reason: collision with root package name */
    public final Fragment f80623f;

    /* renamed from: h  reason: collision with root package name */
    private final h f80624h;

    static {
        Covode.recordClassIndex(50145);
    }

    public final String a() {
        return (String) this.f80624h.getValue();
    }

    public void onViewAttachedToWindow(View view) {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$a  reason: collision with other inner class name */
    public static final class C1879a {
        static {
            Covode.recordClassIndex(50147);
        }

        private C1879a() {
        }

        public /* synthetic */ C1879a(byte b2) {
            this();
        }
    }

    public static final class c implements Animator.AnimatorListener {
        static {
            Covode.recordClassIndex(50149);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
        }

        c() {
        }
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        this.f80619b.e();
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        if (this.f80620c) {
            this.f80619b.b();
        }
    }

    static final class d extends m implements h.f.a.a<String> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50150);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            com.ss.android.ugc.aweme.arch.widgets.base.c<com.ss.android.ugc.aweme.search.model.d> openSearchParam;
            com.ss.android.ugc.aweme.search.model.d value;
            com.ss.android.ugc.aweme.search.model.b searchEnterParam;
            String enterSearchFrom;
            SearchIntermediateViewModel searchIntermediateViewModel = this.this$0.f80622e;
            if (searchIntermediateViewModel == null || (openSearchParam = searchIntermediateViewModel.getOpenSearchParam()) == null || (value = openSearchParam.getValue()) == null || (searchEnterParam = value.getSearchEnterParam()) == null || (enterSearchFrom = searchEnterParam.getEnterSearchFrom()) == null) {
                return "";
            }
            return enterSearchFrom;
        }
    }

    public void onViewDetachedFromWindow(View view) {
        onPause();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f80626a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Word f80627b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f80628c;

        static {
            Covode.recordClassIndex(50148);
        }

        b(a aVar, Word word, String str) {
            this.f80626a = aVar;
            this.f80627b = word;
            this.f80628c = str;
        }

        public final void onClick(View view) {
            com.ss.android.ugc.aweme.search.n.a searchCommonModel;
            ClickAgent.onClick(view);
            al.d dVar = this.f80626a.f80621d;
            if (dVar != null) {
                dVar.a(this.f80627b, this.f80626a.getPosition());
            }
            int position = this.f80626a.getPosition();
            Word word = this.f80627b;
            String str = this.f80628c;
            String str2 = this.f80626a.f80618a;
            String str3 = null;
            if (str2 == null || str2.length() <= 0) {
                str2 = this.f80626a.a();
            }
            View view2 = this.f80626a.itemView;
            l.b(view2, "");
            Context context = view2.getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            e eVar = (e) context;
            l.d(str, "");
            l.d(str2, "");
            l.d(eVar, "");
            if (word != null) {
                ((bk) ((bk) new bj().i(word.getId())).w(word.getWord()).d(str)).y(str2).a(SearchEnterViewModel.a.a(eVar).b().obtainLogData("tab_name")).v("recom_search").d(Integer.valueOf(position)).w(word.getWord()).A(word.getWordType()).i(word.getId()).f();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", this.f80626a.a());
            View view3 = this.f80626a.itemView;
            l.b(view3, "");
            f b2 = d.a.b((e) view3.getContext());
            if (!(b2 == null || (searchCommonModel = b2.getSearchCommonModel()) == null)) {
                str3 = searchCommonModel.getEnterFrom();
            }
            jSONObject.put("enter_from_x", str3);
            c.a.a("ref_base_suggest_word_enter_from", jSONObject, am.c("enter_from"));
        }
    }

    public void a(Word word, String str) {
        SearchIntermediateViewModel searchIntermediateViewModel;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState;
        Integer value;
        l.d(str, "");
        this.itemView.setOnClickListener(new b(this, word, str));
        this.f80619b.setVisibility(8);
        this.f80620c = false;
        if (word != null) {
            l.d(word, "");
            if (l.a((Object) word.getWordType(), (Object) "10") || l.a((Object) word.getWordType(), (Object) "2") || l.a((Object) word.getWordType(), (Object) "6")) {
                this.f80619b.setVisibility(0);
                AnimationImageView animationImageView = this.f80619b;
                View view = this.itemView;
                l.b(view, "");
                animationImageView.setImageDrawable(view.getResources().getDrawable(com.ss.android.ugc.aweme.search.s.d.a(word)));
                if (l.a((Object) word.getWordType(), (Object) "10") && (searchIntermediateViewModel = this.f80622e) != null && (intermediateState = searchIntermediateViewModel.getIntermediateState()) != null && (value = intermediateState.getValue()) != null && value.intValue() == 1 && !((LottieAnimationView) this.f80619b).f5109b.g()) {
                    hashCode();
                    this.f80620c = true;
                    this.f80619b.setAnimation("search_LIVE_1color.json");
                    this.f80619b.a();
                    this.f80619b.setRepeatMode(1);
                    this.f80619b.setRepeatCount(-1);
                    this.f80619b.a(new c());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, al.d dVar, SearchIntermediateViewModel searchIntermediateViewModel, Fragment fragment) {
        super(view);
        String str;
        com.ss.android.ugc.aweme.arch.widgets.base.c<Integer> intermediateState;
        l.d(view, "");
        this.f80621d = dVar;
        this.f80622e = searchIntermediateViewModel;
        this.f80623f = fragment;
        view.getContext();
        if (!(fragment == null || searchIntermediateViewModel == null || (intermediateState = searchIntermediateViewModel.getIntermediateState()) == null)) {
            intermediateState.observe(fragment, new u(this) {
                /* class com.ss.android.ugc.aweme.discover.adapter.viewholder.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f80625a;

                static {
                    Covode.recordClassIndex(50146);
                }

                {
                    this.f80625a = r1;
                }

                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Object obj) {
                    Integer num = (Integer) obj;
                    if (num != null) {
                        if (num.intValue() == 1) {
                            this.f80625a.onResume();
                        } else if (num.intValue() == 2) {
                            this.f80625a.onPause();
                        } else if (num.intValue() == 0) {
                            this.f80625a.onPause();
                        }
                    }
                }
            });
        }
        view.addOnAttachStateChangeListener(this);
        com.ss.android.ugc.aweme.search.n.h b2 = d.a.b();
        if (b2 != null) {
            str = b2.getSearchPosition();
        } else {
            str = null;
        }
        this.f80618a = str;
        View findViewById = view.findViewById(R.id.fna);
        l.b(findViewById, "");
        this.f80619b = (AnimationImageView) findViewById;
        this.f80624h = h.i.a((h.f.a.a) new d(this));
    }
}
