package com.ss.android.ugc.aweme.story.edit.business.shared.effect.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.b.a;
import com.ss.android.ugc.aweme.filter.view.internal.main.j;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.q;
import h.f.b.l;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class StoryEditEffectView implements au {

    /* renamed from: a  reason: collision with root package name */
    AVStatusView f137379a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.tools.view.base.d f137380b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f137381c;

    /* renamed from: d  reason: collision with root package name */
    public b f137382d;

    /* renamed from: e  reason: collision with root package name */
    public final a f137383e;

    /* renamed from: f  reason: collision with root package name */
    private final h f137384f = i.a((h.f.a.a) a.f137386a);

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f137385g;

    static {
        Covode.recordClassIndex(89851);
    }

    private final com.ss.android.ugc.aweme.effect.b.a c() {
        return (com.ss.android.ugc.aweme.effect.b.a) this.f137384f.getValue();
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.effect.b.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f137386a = new a();

        static {
            Covode.recordClassIndex(89852);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.effect.b.a invoke() {
            a.b bVar = new a.b();
            bVar.f88842a = 3;
            bVar.f88843b = new com.ss.android.ugc.aweme.effect.b.a.a();
            return bVar.a();
        }
    }

    @v(a = i.a.ON_DESTROY)
    private final void onDestroy() {
        b bVar = this.f137382d;
        if (bVar == null) {
            l.a("viewAdapter");
        }
        bVar.f137396e.b(bVar);
        c().c();
    }

    public final void a() {
        com.ss.android.ugc.tools.view.base.d dVar = this.f137380b;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.c();
    }

    public final void b() {
        AVStatusView aVStatusView = this.f137379a;
        if (aVStatusView == null) {
            l.a("statusView");
        }
        aVStatusView.setVisibility(0);
        RecyclerView recyclerView = this.f137381c;
        if (recyclerView == null) {
            l.a("effectRecyclerView");
        }
        recyclerView.setVisibility(8);
        AVStatusView aVStatusView2 = this.f137379a;
        if (aVStatusView2 == null) {
            l.a("statusView");
        }
        aVStatusView2.b();
        this.f137383e.b().a(new f(this));
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEditEffectView f137389a;

        static {
            Covode.recordClassIndex(89856);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(StoryEditEffectView storyEditEffectView) {
            this.f137389a = storyEditEffectView;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f137389a.f137383e.h();
        }
    }

    public static final class f implements IFetchEffectChannelListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEditEffectView f137390a;

        static {
            Covode.recordClassIndex(89857);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(StoryEditEffectView storyEditEffectView) {
            this.f137390a = storyEditEffectView;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
        public final void onFail(ExceptionResult exceptionResult) {
            AVStatusView aVStatusView = this.f137390a.f137379a;
            if (aVStatusView == null) {
                l.a("statusView");
            }
            aVStatusView.d();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
            EffectCategoryResponseTemplate effectCategoryResponseTemplate;
            List<Effect> totalEffects;
            EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
            if (effectChannelResponse2 != null) {
                List<EffectCategoryResponse> categoryResponseList = effectChannelResponse2.getCategoryResponseList();
                int i2 = 0;
                if (!(categoryResponseList == null || categoryResponseList.isEmpty() || (effectCategoryResponseTemplate = (EffectCategoryResponseTemplate) n.b((List) effectChannelResponse2.getCategoryResponseList(), 0)) == null || (totalEffects = effectCategoryResponseTemplate.getTotalEffects()) == null || totalEffects.isEmpty())) {
                    StoryEditEffectView storyEditEffectView = this.f137390a;
                    AVStatusView aVStatusView = storyEditEffectView.f137379a;
                    if (aVStatusView == null) {
                        l.a("statusView");
                    }
                    aVStatusView.a();
                    AVStatusView aVStatusView2 = storyEditEffectView.f137379a;
                    if (aVStatusView2 == null) {
                        l.a("statusView");
                    }
                    aVStatusView2.setVisibility(8);
                    RecyclerView recyclerView = storyEditEffectView.f137381c;
                    if (recyclerView == null) {
                        l.a("effectRecyclerView");
                    }
                    recyclerView.setVisibility(0);
                    b a2 = StoryEditEffectView.a(this.f137390a);
                    List<Effect> totalEffects2 = effectChannelResponse2.getCategoryResponseList().get(0).getTotalEffects();
                    l.d(totalEffects2, "");
                    a2.f137395d = -1;
                    a2.f137393a.clear();
                    a2.f137393a.add(b.f137391g);
                    if (true ^ totalEffects2.isEmpty()) {
                        a2.f137393a.addAll(totalEffects2);
                    }
                    List<Effect> list = a2.f137393a;
                    ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                    for (T t : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            n.a();
                        }
                        arrayList.add(com.ss.android.ugc.aweme.effect.i.a(i2, t, ""));
                        i2 = i3;
                    }
                    a2.a(arrayList);
                    return;
                }
            }
            AVStatusView aVStatusView3 = this.f137390a.f137379a;
            if (aVStatusView3 == null) {
                l.a("statusView");
            }
            aVStatusView3.c();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEditEffectView f137387a;

        static {
            Covode.recordClassIndex(89854);
        }

        c(StoryEditEffectView storyEditEffectView) {
            this.f137387a = storyEditEffectView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137387a.b();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryEditEffectView f137388a;

        static {
            Covode.recordClassIndex(89855);
        }

        d(StoryEditEffectView storyEditEffectView) {
            this.f137388a = storyEditEffectView;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f137388a.a();
        }
    }

    public static final /* synthetic */ b a(StoryEditEffectView storyEditEffectView) {
        b bVar = storyEditEffectView.f137382d;
        if (bVar == null) {
            l.a("viewAdapter");
        }
        return bVar;
    }

    public final void a(String str) {
        if (this.f137382d != null) {
            b bVar = this.f137382d;
            if (bVar == null) {
                l.a("viewAdapter");
            }
            b bVar2 = this.f137382d;
            if (bVar2 == null) {
                l.a("viewAdapter");
            }
            bVar.a(bVar2.a(str));
        }
    }

    static final class b extends h.f.b.m implements q<Effect, EffectModel, Integer, z> {
        final /* synthetic */ StoryEditEffectView this$0;

        static {
            Covode.recordClassIndex(89853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(StoryEditEffectView storyEditEffectView) {
            super(3);
            this.this$0 = storyEditEffectView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(Effect effect, EffectModel effectModel, Integer num) {
            EffectModel effectModel2 = effectModel;
            StoryEditEffectView.a(this.this$0).b(num.intValue());
            if (effectModel2 == null) {
                this.this$0.f137383e.g();
            } else {
                this.this$0.f137383e.a(effectModel2);
            }
            return z.f158842a;
        }
    }

    public StoryEditEffectView(m mVar, ViewGroup viewGroup, a aVar) {
        l.d(mVar, "");
        l.d(viewGroup, "");
        l.d(aVar, "");
        MethodCollector.i(2940);
        this.f137385g = viewGroup;
        this.f137383e = aVar;
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b34, viewGroup, false);
        viewGroup.addView(a2);
        l.b(a2, "");
        this.f137380b = new j(a2, a2.findViewById(R.id.cf8));
        View findViewById = a2.findViewById(R.id.au0);
        l.b(findViewById, "");
        this.f137381c = (RecyclerView) findViewById;
        a2.findViewById(R.id.fk2).setOnClickListener(new d(this));
        a2.findViewById(R.id.b6f).setOnClickListener(new e(this));
        RecyclerView recyclerView = this.f137381c;
        if (recyclerView == null) {
            l.a("effectRecyclerView");
        }
        this.f137382d = new b(recyclerView, c(), new b(this));
        viewGroup.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        b bVar = this.f137382d;
        if (bVar == null) {
            l.a("viewAdapter");
        }
        recyclerView.setAdapter(bVar);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.eq, (ViewGroup) null);
        inflate.findViewById(R.id.f61).setOnClickListener(new c(this));
        ((TextView) inflate.findViewById(R.id.f62)).setText(R.string.g8b);
        View findViewById2 = a2.findViewById(R.id.ci4);
        l.b(findViewById2, "");
        AVStatusView aVStatusView = (AVStatusView) findViewById2;
        this.f137379a = aVStatusView;
        if (aVStatusView == null) {
            l.a("statusView");
        }
        AVStatusView.a a3 = AVStatusView.a.a(viewGroup.getContext()).a(R.string.g8a).a(inflate);
        a3.f150227g = 1;
        aVStatusView.setBuilder(a3);
        com.ss.android.ugc.tools.view.base.d dVar = this.f137380b;
        if (dVar == null) {
            l.a("transitionView");
        }
        dVar.f();
        b();
        mVar.getLifecycle().a(this);
        MethodCollector.o(2940);
    }
}
