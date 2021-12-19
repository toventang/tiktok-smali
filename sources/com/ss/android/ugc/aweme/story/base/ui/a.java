package com.ss.android.ugc.aweme.story.base.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.p;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.services.story.IStoryView;
import com.ss.android.ugc.aweme.story.record.StoryRecordBaseViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends Fragment implements IStoryView, i, j {

    /* renamed from: c  reason: collision with root package name */
    public static final C3578a f136921c = new C3578a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final t<z> f136922a = new t<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f136923b = true;

    /* renamed from: d  reason: collision with root package name */
    private final t<Boolean> f136924d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    private final h.h f136925e = h.i.a((h.f.a.a) new h(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f136926f = h.i.a((h.f.a.a) new g(this));

    /* renamed from: g  reason: collision with root package name */
    private View f136927g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f136928h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f136929i = h.i.a((h.f.a.a) f.f136932a);

    /* renamed from: j  reason: collision with root package name */
    private final h.h f136930j = h.i.a((h.f.a.a) new b(this));

    /* renamed from: k  reason: collision with root package name */
    private HashMap f136931k;

    static {
        Covode.recordClassIndex(89487);
    }

    private final StoryRecordBaseViewModel b() {
        return (StoryRecordBaseViewModel) this.f136925e.getValue();
    }

    private final com.ss.android.ugc.aweme.story.base.a c() {
        return (com.ss.android.ugc.aweme.story.base.a) this.f136926f.getValue();
    }

    private final EnterStoryParam d() {
        return (EnterStoryParam) this.f136930j.getValue();
    }

    public final StorySlideFragmentLifecycleDispatcher a() {
        return (StorySlideFragmentLifecycleDispatcher) this.f136929i.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(264, new org.greenrobot.eventbus.g(a.class, "onPublishStarted", com.ss.android.ugc.aweme.story.record.j.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.base.ui.a$a  reason: collision with other inner class name */
    public static final class C3578a {
        static {
            Covode.recordClassIndex(89488);
        }

        private C3578a() {
        }

        public /* synthetic */ C3578a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final Fragment asFragment() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final LiveData<z> getCloseEvent() {
        return this.f136922a;
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final LiveData<Boolean> getForbidDrawerScrollEvent() {
        return this.f136924d;
    }

    static final class f extends m implements h.f.a.a<StorySlideFragmentLifecycleDispatcher> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f136932a = new f();

        static {
            Covode.recordClassIndex(89493);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StorySlideFragmentLifecycleDispatcher invoke() {
            return new StorySlideFragmentLifecycleDispatcher();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final void onSlideExitStoryShoot() {
        c().c();
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final boolean onBackPressed() {
        return c().b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
    }

    static final class b extends m implements h.f.a.a<EnterStoryParam> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EnterStoryParam invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getParcelable("enter_story_param");
            }
            return null;
        }
    }

    static final class h extends m implements h.f.a.a<StoryRecordBaseViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ StoryRecordBaseViewModel invoke() {
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity == null) {
                l.b();
            }
            JediViewModel a2 = com.bytedance.jedi.arch.t.a(activity).a(StoryRecordBaseViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.port.in.g.a().n().a(false);
        HashMap hashMap = this.f136931k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final void onOpenCompletely() {
        if (getActivity() != null) {
            b().c(StoryRecordBaseViewModel.g.f138155a);
            com.ss.android.ugc.aweme.port.in.g.a().n().a(false);
        }
    }

    static final class g extends m implements h.f.a.a<com.ss.android.ugc.aweme.story.base.a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89494);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.story.base.a invoke() {
            boolean z = this.this$0.f136923b;
            boolean z2 = true;
            if (com.bytedance.ies.abmock.b.a().a(true, "story_slide_opt_enable", 0) != com.ss.android.ugc.aweme.story.base.a.b.f136870a || (this.this$0.getActivity() instanceof StoryRootActivity)) {
                z2 = false;
            }
            Bundle arguments = this.this$0.getArguments();
            if (arguments == null) {
                arguments = Bundle.EMPTY;
            }
            l.b(arguments, "");
            return new com.ss.android.ugc.aweme.story.base.a(z, z2, arguments);
        }
    }

    @r
    public final void onPublishStarted(com.ss.android.ugc.aweme.story.record.j.a aVar) {
        l.d(aVar, "");
        a().b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        a().a(z);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView
    public final void updateEnterStoryParam(EnterStoryParam enterStoryParam) {
        l.d(enterStoryParam, "");
        c().a(enterStoryParam);
    }

    static final class c extends m implements h.f.a.b<p, z> {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar, Bundle bundle) {
            super(1);
            this.this$0 = aVar;
            this.$savedInstanceState$inlined = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            this.this$0.f136922a.setValue(z.f158842a);
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, Bundle bundle) {
            super(1);
            this.this$0 = aVar;
            this.$savedInstanceState$inlined = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            com.ss.android.ugc.aweme.story.base.widget.a aVar = this.this$0.a().f136913b;
            if (aVar != null) {
                aVar.f136939c = booleanValue;
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<p, z> {
        final /* synthetic */ Bundle $savedInstanceState$inlined;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(89492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, Bundle bundle) {
            super(1);
            this.this$0 = aVar;
            this.$savedInstanceState$inlined = bundle;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p pVar) {
            l.d(pVar, "");
            androidx.fragment.app.e activity = this.this$0.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        super.onSaveInstanceState(bundle);
        StorySlideFragmentLifecycleDispatcher a2 = a();
        l.d(bundle, "");
        com.ss.android.ugc.aweme.story.base.widget.a aVar = a2.f136913b;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        boolean z;
        MethodCollector.i(1696);
        super.onActivityCreated(bundle);
        if (!this.f136928h) {
            EnterStoryParam d2 = d();
            if (d2 != null) {
                z = d2.isStory();
            } else {
                z = true;
            }
            this.f136923b = z;
            View view = getView();
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup != null) {
                StorySlideFragmentLifecycleDispatcher a2 = a();
                com.bytedance.scene.j a3 = c().a();
                l.d(this, "");
                l.d(viewGroup, "");
                l.d(a3, "");
                if (!a2.f136912a) {
                    a2.f136915d = bundle;
                    a2.f136914c = a3;
                    Context context = viewGroup.getContext();
                    l.b(context, "");
                    com.ss.android.ugc.aweme.story.base.widget.a aVar = new com.ss.android.ugc.aweme.story.base.widget.a(context, (byte) 0);
                    viewGroup.addView(aVar, new ViewGroup.LayoutParams(-1, -1));
                    a2.f136913b = aVar;
                    a2.a();
                    getLifecycle().a(a2);
                    a2.f136912a = true;
                    a().a(true);
                    f.a.b.b unused = b().a(this, b.f136933a, new ah(), new c(this, bundle));
                    f.a.b.b unused2 = b().a(this, c.f136934a, new ah(), new d(this, bundle));
                    EnterStoryParam d3 = d();
                    if (d3 != null && d3.getLaunchAsActivity()) {
                        f.a.b.b unused3 = b().a(this, d.f136935a, new ah(), new e(this, bundle));
                    } else if (this.f136923b) {
                        EventBus.a(EventBus.a(), this);
                    }
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("the dispatcher " + a2 + " had been setup before.");
                    MethodCollector.o(1696);
                    throw illegalStateException;
                }
            }
            this.f136928h = true;
        }
        b().c(StoryRecordBaseViewModel.f.f138154a);
        com.ss.android.ugc.aweme.port.in.g.a().n().a(true);
        MethodCollector.o(1696);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryView, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        c().a(i2, i3, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        if (this.f136927g == null) {
            this.f136927g = com.a.a(layoutInflater, R.layout.b26, viewGroup, false);
        }
        a().b(false);
        return this.f136927g;
    }
}
