package com.ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.i.ae;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.i.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoEvent;
import com.ss.android.ugc.aweme.feed.model.InteractionTagLabelEvent;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

public final class VideoEventDispatchViewModel extends AssemViewModel<bb> implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: l  reason: collision with root package name */
    public static final a f91526l = new a((byte) 0);

    /* renamed from: j  reason: collision with root package name */
    public h.f.a.b<? super Aweme, z> f91527j;

    /* renamed from: k  reason: collision with root package name */
    public h.f.a.b<? super Aweme, z> f91528k;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f91529m = true;

    public static final class a {

        /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel$a$a  reason: collision with other inner class name */
        public static final class C2207a extends h.f.b.m implements h.f.a.b<bb, bb> {
            public static final C2207a INSTANCE = new C2207a();

            static {
                Covode.recordClassIndex(57587);
            }

            public C2207a() {
                super(1);
            }

            public final bb invoke(bb bbVar) {
                h.f.b.l.c(bbVar, "");
                return bbVar;
            }
        }

        static {
            Covode.recordClassIndex(57586);
        }

        public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.b.g> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;

            static {
                Covode.recordClassIndex(57590);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(com.bytedance.assem.arch.b.g gVar) {
                super(0);
                this.$this_holderViewModel = gVar;
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.arch.b.g invoke() {
                return this.$this_holderViewModel;
            }
        }

        private a() {
        }

        public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
            public static final c INSTANCE = new c();

            static {
                Covode.recordClassIndex(57589);
            }

            public c() {
                super(0);
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
                return new com.bytedance.assem.jedi_vm.viewModel.b<>();
            }
        }

        public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
            public static final e INSTANCE = new e();

            static {
                Covode.recordClassIndex(57591);
            }

            public e() {
                super(0);
            }

            @Override // h.f.a.a
            public final com.bytedance.assem.arch.viewModel.c invoke() {
                return new com.bytedance.assem.arch.viewModel.c();
            }
        }

        public static final class b extends h.f.b.m implements h.f.a.a<String> {
            final /* synthetic */ com.bytedance.assem.arch.b.g $this_holderViewModel;
            final /* synthetic */ h.k.c $viewModelClass;

            static {
                Covode.recordClassIndex(57588);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(com.bytedance.assem.arch.b.g gVar, h.k.c cVar) {
                super(0);
                this.$this_holderViewModel = gVar;
                this.$viewModelClass = cVar;
            }

            @Override // h.f.a.a
            public final String invoke() {
                return h.f.b.l.a(this.$viewModelClass.b(), (Object) String.valueOf(this.$this_holderViewModel.hashCode()));
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(57585);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(1, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onTopViewLiveEndEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(2, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onVideoEvent", ag.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(3, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onFollowStatus", FollowStatusEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(4, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onInteractionTagLabel", InteractionTagLabelEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(5, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onCommentEvent", com.ss.android.ugc.aweme.comment.c.c.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(6, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onVideoPlayerEvent", com.ss.android.ugc.aweme.shortvideo.j.j.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(7, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onEventDiggUpdate", r.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(8, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onPlayerControllerVideoPlayProgressEvent", com.ss.android.ugc.aweme.feed.ui.seekbar.e.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(9, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onLiveStatusEvent", com.bytedance.android.live.base.a.a.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(10, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onShareEndEvent", ae.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(11, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onInteractionTagInfo", InteractionTagInfoEvent.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(12, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onAwesomeSplashEvent", com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a.class, ThreadMode.BACKGROUND, 0, false));
        hashMap.put(13, new org.greenrobot.eventbus.g(VideoEventDispatchViewModel.class, "onProfileFollowEvent", com.ss.android.ugc.aweme.challenge.d.c.class, ThreadMode.BACKGROUND, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final boolean bL_() {
        return this.f91529m;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ bb f() {
        return new bb();
    }

    public VideoEventDispatchViewModel() {
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        EventBus.a().b(this);
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onAwesomeSplashEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
        h.f.b.l.d(aVar, "");
        a(new b(aVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onCommentEvent(com.ss.android.ugc.aweme.comment.c.c cVar) {
        a(new c(cVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onEventDiggUpdate(r rVar) {
        a(new d(rVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onFollowStatus(FollowStatusEvent followStatusEvent) {
        a(new e(followStatusEvent));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onInteractionTagLabel(InteractionTagLabelEvent interactionTagLabelEvent) {
        Aweme aweme;
        h.f.a.b<? super Aweme, z> bVar;
        if (interactionTagLabelEvent != null && (aweme = interactionTagLabelEvent.aweme) != null && (bVar = this.f91528k) != null) {
            bVar.invoke(aweme);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onLiveStatusEvent(com.bytedance.android.live.base.a.a aVar) {
        h.f.b.l.d(aVar, "");
        a(new g(aVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onPlayerControllerVideoPlayProgressEvent(com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar) {
        h.f.b.l.d(eVar, "");
        a(new h(eVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onProfileFollowEvent(com.ss.android.ugc.aweme.challenge.d.c cVar) {
        a(new i(cVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onShareEndEvent(ae aeVar) {
        a(new j(aeVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onTopViewLiveEndEvent(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
        h.f.b.l.d(gVar, "");
        a(new k(gVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onVideoEvent(ag agVar) {
        a(new l(agVar));
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onVideoPlayerEvent(com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
        h.f.b.l.d(jVar, "");
        a(new m(jVar));
    }

    static final class b extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a $event;

        static {
            Covode.recordClassIndex(57592);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar) {
            super(1);
            this.$event = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, this.$event, null, null, null, null, null, null, 4063);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.ss.android.ugc.aweme.comment.c.c $event;

        static {
            Covode.recordClassIndex(57593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.comment.c.c cVar) {
            super(1);
            this.$event = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, this.$event, null, null, null, null, null, null, null, null, null, null, 4093);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ r $event;

        static {
            Covode.recordClassIndex(57594);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar) {
            super(1);
            this.$event = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, this.$event, null, null, null, null, null, null, null, null, null, 4091);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ FollowStatusEvent $event;

        static {
            Covode.recordClassIndex(57595);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(FollowStatusEvent followStatusEvent) {
            super(1);
            this.$event = followStatusEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, null, null, this.$event, null, null, null, 3839);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ InteractionTagInfoEvent $event;

        static {
            Covode.recordClassIndex(57596);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(InteractionTagInfoEvent interactionTagInfoEvent) {
            super(1);
            this.$event = interactionTagInfoEvent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, null, null, null, null, null, this.$event, 2047);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.bytedance.android.live.base.a.a $event;

        static {
            Covode.recordClassIndex(57597);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(com.bytedance.android.live.base.a.a aVar) {
            super(1);
            this.$event = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, null, null, null, this.$event, null, null, 3583);
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.seekbar.e $event;

        static {
            Covode.recordClassIndex(57598);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(com.ss.android.ugc.aweme.feed.ui.seekbar.e eVar) {
            super(1);
            this.$event = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, null, this.$event, null, null, null, null, 3967);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.ss.android.ugc.aweme.challenge.d.c $event;

        static {
            Covode.recordClassIndex(57599);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.ss.android.ugc.aweme.challenge.d.c cVar) {
            super(1);
            this.$event = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, this.$event, null, null, null, null, null, null, null, null, 4087);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ ae $event;

        static {
            Covode.recordClassIndex(57600);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(ae aeVar) {
            super(1);
            this.$event = aeVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, this.$event, null, null, null, null, null, 4031);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g $event;

        static {
            Covode.recordClassIndex(57601);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
            super(1);
            this.$event = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, null, null, null, null, null, null, this.$event, null, 3071);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ ag $event;

        static {
            Covode.recordClassIndex(57602);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(ag agVar) {
            super(1);
            this.$event = agVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, this.$event, null, null, null, null, null, null, null, null, null, null, null, 4094);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<bb, bb> {
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.j.j $status;

        static {
            Covode.recordClassIndex(57603);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(com.ss.android.ugc.aweme.shortvideo.j.j jVar) {
            super(1);
            this.$status = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ bb invoke(bb bbVar) {
            bb bbVar2 = bbVar;
            h.f.b.l.d(bbVar2, "");
            return bb.a(bbVar2, null, null, null, null, this.$status, null, null, null, null, null, null, null, 4079);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.BACKGROUND)
    public final void onInteractionTagInfo(InteractionTagInfoEvent interactionTagInfoEvent) {
        Aweme aweme;
        h.f.a.b<? super Aweme, z> bVar;
        a(new f(interactionTagInfoEvent));
        if (interactionTagInfoEvent != null && (aweme = interactionTagInfoEvent.aweme) != null && (bVar = this.f91527j) != null) {
            bVar.invoke(aweme);
        }
    }
}
