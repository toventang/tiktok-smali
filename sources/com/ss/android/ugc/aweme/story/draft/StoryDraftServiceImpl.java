package com.ss.android.ugc.aweme.story.draft;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.draft.j;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.tools.utils.q;
import h.a.ag;
import h.a.n;
import h.a.z;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.i;
import h.p;
import h.r;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class StoryDraftServiceImpl implements IStoryDraftService {

    /* renamed from: d  reason: collision with root package name */
    public static final a f137012d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> f137013a = e.f137018a;

    /* renamed from: b  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> f137014b = d.f137017a;

    /* renamed from: c  reason: collision with root package name */
    public final h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> f137015c = new c(this);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f137016e = i.a((h.f.a.a) h.f137019a);

    static {
        Covode.recordClassIndex(89559);
    }

    private final boolean b() {
        return ((Boolean) this.f137016e.getValue()).booleanValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89560);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final List<com.ss.android.ugc.aweme.draft.model.c> queryDraftList() {
        if (!b()) {
            return z.INSTANCE;
        }
        return b.a(this.f137015c);
    }

    static final class h extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f137019a = new h();

        static {
            Covode.recordClassIndex(89571);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (com.ss.android.ugc.aweme.story.base.a.a.a()) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                l.b(createIAVServiceProxybyMonsterPlugin, "");
                if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static IStoryDraftService a() {
        MethodCollector.i(1378);
        Object a2 = com.ss.android.ugc.b.a(IStoryDraftService.class, false);
        if (a2 != null) {
            IStoryDraftService iStoryDraftService = (IStoryDraftService) a2;
            MethodCollector.o(1378);
            return iStoryDraftService;
        }
        if (com.ss.android.ugc.b.en == null) {
            synchronized (IStoryDraftService.class) {
                try {
                    if (com.ss.android.ugc.b.en == null) {
                        com.ss.android.ugc.b.en = new StoryDraftServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1378);
                    throw th;
                }
            }
        }
        StoryDraftServiceImpl storyDraftServiceImpl = (StoryDraftServiceImpl) com.ss.android.ugc.b.en;
        MethodCollector.o(1378);
        return storyDraftServiceImpl;
    }

    static final class e extends m implements h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f137018a = new e();

        static {
            Covode.recordClassIndex(89565);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.draft.model.c cVar) {
            boolean z;
            com.ss.android.ugc.aweme.draft.model.c cVar2 = cVar;
            l.d(cVar2, "");
            if (System.currentTimeMillis() - cVar2.J <= 86400000) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final String getDraftDirPath(com.ss.android.ugc.aweme.draft.model.c cVar) {
        l.d(cVar, "");
        String str = cVar.W.bD;
        if (str != null) {
            return com.ss.android.ugc.aweme.story.base.b.b.a(str, null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public static final class g extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
        final /* synthetic */ h.f.a.b $onResult;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ StoryDraftServiceImpl this$0;

        static {
            Covode.recordClassIndex(89568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StoryDraftServiceImpl storyDraftServiceImpl, h.f.a.b bVar, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = storyDraftServiceImpl;
            this.$onResult = bVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new g(this.this$0, this.$onResult, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends m implements h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> {
            final /* synthetic */ List $outOfDateDrafts;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(89570);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, List list) {
                super(1);
                this.this$0 = gVar;
                this.$outOfDateDrafts = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.draft.model.c cVar) {
                l.d(cVar, "");
                boolean booleanValue = this.this$0.this$0.f137015c.invoke(cVar).booleanValue();
                if (!booleanValue) {
                    this.$outOfDateDrafts.add(cVar);
                }
                return Boolean.valueOf(booleanValue);
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            final List<com.ss.android.ugc.aweme.draft.model.c> arrayList;
            final List list;
            String str;
            p a2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                final z.c cVar = new z.c();
                cVar.element = 0;
                Collection<com.ss.android.ugc.aweme.story.publish.a.c> values = com.ss.android.ugc.aweme.story.publish.a.a.f138046d.values();
                l.b(values, "");
                List<com.ss.android.ugc.aweme.story.publish.a.c> k2 = n.k(values);
                ArrayList arrayList2 = new ArrayList();
                for (com.ss.android.ugc.aweme.story.publish.a.c cVar2 : k2) {
                    BaseShortVideoContext baseShortVideoContext = cVar2.a().f129882k;
                    if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                        baseShortVideoContext = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                    if (!(videoPublishEditModel == null || (str = videoPublishEditModel.sessionId) == null || (a2 = v.a(str, cVar2)) == null)) {
                        arrayList2.add(a2);
                    }
                }
                final Map a3 = ag.a(arrayList2);
                arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.draft.model.c> a4 = b.a(new a(this, arrayList));
                cVar.element = a4.size();
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) a4, 10));
                for (T t : a4) {
                    new bn("StoryDraftServiceImpl");
                    VideoPublishEditModel a5 = bn.a((com.ss.android.ugc.aweme.draft.model.c) t);
                    Workspace a6 = com.ss.android.ugc.aweme.shortvideo.WorkSpace.c.a(null, null, a5.mMusicPath, a5.reverseVideoPath());
                    a5.mIsFromDraft = true;
                    a5.isStoryEditMode = true;
                    File h2 = a6.h();
                    l.b(h2, "");
                    a5.mOutputFile = h2.getPath();
                    File i3 = a6.i();
                    l.b(i3, "");
                    a5.mEncodedAudioOutputFile = i3.getPath();
                    File j2 = a6.j();
                    l.b(j2, "");
                    a5.mParallelUploadOutputFile = j2.getPath();
                    arrayList3.add(v.a(t, a5));
                }
                ArrayList<p> arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(n.a((Iterable) arrayList4, 10));
                for (p pVar : arrayList4) {
                    VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) pVar.component2();
                    l.b(videoPublishEditModel2, "");
                    Bundle a7 = com.ss.android.ugc.aweme.story.edit.a.a(videoPublishEditModel2);
                    a7.putString("publish_last_output_file_cache", ((com.ss.android.ugc.aweme.draft.model.c) pVar.component1()).W.bF);
                    arrayList5.add(v.a(videoPublishEditModel2.sessionId, a7));
                }
                ArrayList<p> arrayList6 = arrayList5;
                List arrayList7 = new ArrayList(n.a((Iterable) arrayList6, 10));
                for (p pVar2 : arrayList6) {
                    Object component1 = pVar2.component1();
                    Bundle bundle = (Bundle) pVar2.component2();
                    com.ss.android.ugc.aweme.story.publish.a.c cVar3 = (com.ss.android.ugc.aweme.story.publish.a.c) a3.get(component1);
                    if (cVar3 == null) {
                        cVar3 = com.ss.android.ugc.aweme.story.publish.a.a.a(bundle);
                        com.ss.android.ugc.aweme.story.publish.a.a.a(new com.ss.android.ugc.aweme.story.publish.c(bundle), cVar3.f138092d, true);
                        com.ss.android.ugc.aweme.shortvideo.p.d.a(com.ss.android.ugc.aweme.shortvideo.p.c.f129554a).a(1);
                    }
                    arrayList7.add(new ScheduleInfo(cVar3.f138092d, bundle));
                }
                list = arrayList7;
                kotlinx.coroutines.android.b bVar = com.ss.android.ugc.asve.editor.d.f62009a;
                AnonymousClass1 r8 = new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                    /* class com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.g.AnonymousClass1 */
                    int label;
                    final /* synthetic */ g this$0;

                    static {
                        Covode.recordClassIndex(89569);
                    }

                    {
                        this.this$0 = r2;
                    }

                    @Override // h.c.b.a.a
                    public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                        l.d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        public static final class b extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                            final /* synthetic */ h.f.a.b $onResult;
                            int label;
                            final /* synthetic */ StoryDraftServiceImpl this$0;

                            static {
                                Covode.recordClassIndex(89561);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            b(StoryDraftServiceImpl storyDraftServiceImpl, h.f.a.b bVar, h.c.d dVar) {
                                super(2, dVar);
                                this.this$0 = storyDraftServiceImpl;
                                this.$onResult = bVar;
                            }

                            @Override // h.c.b.a.a
                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                l.d(dVar, "");
                                return new b(this.this$0, this.$onResult, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // h.f.a.m
                            public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                return ((b) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                            }

                            @Override // h.c.b.a.a
                            public final Object invokeSuspend(Object obj) {
                                final boolean z;
                                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                int i2 = this.label;
                                if (i2 == 0) {
                                    r.a(obj);
                                    List<com.ss.android.ugc.aweme.draft.model.c> queryDraftList = this.this$0.queryDraftList();
                                    if (queryDraftList == null || queryDraftList.isEmpty()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    kotlinx.coroutines.android.b bVar = com.ss.android.ugc.asve.editor.d.f62009a;
                                    AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                                        /* class com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.b.AnonymousClass1 */
                                        int label;
                                        final /* synthetic */ b this$0;

                                        static {
                                            Covode.recordClassIndex(89562);
                                        }

                                        {
                                            this.this$0 = r2;
                                        }

                                        @Override // h.c.b.a.a
                                        public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                            l.d(dVar, "");
                                            return 

                                            static final class c extends m implements h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> {
                                                final /* synthetic */ StoryDraftServiceImpl this$0;

                                                static {
                                                    Covode.recordClassIndex(89563);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                c(StoryDraftServiceImpl storyDraftServiceImpl) {
                                                    super(1);
                                                    this.this$0 = storyDraftServiceImpl;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // h.f.a.b
                                                public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.draft.model.c cVar) {
                                                    boolean z;
                                                    l.d(cVar, "");
                                                    if (!this.this$0.f137013a.invoke(cVar).booleanValue() || !this.this$0.f137014b.invoke(cVar).booleanValue()) {
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    return Boolean.valueOf(z);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            public static final class f extends k implements h.f.a.m<am, h.c.d<? super h.z>, Object> {
                                                final /* synthetic */ h.f.a.b $onResult;
                                                int label;
                                                final /* synthetic */ StoryDraftServiceImpl this$0;

                                                static {
                                                    Covode.recordClassIndex(89566);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                f(StoryDraftServiceImpl storyDraftServiceImpl, h.f.a.b bVar, h.c.d dVar) {
                                                    super(2, dVar);
                                                    this.this$0 = storyDraftServiceImpl;
                                                    this.$onResult = bVar;
                                                }

                                                @Override // h.c.b.a.a
                                                public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                                    l.d(dVar, "");
                                                    return new f(this.this$0, this.$onResult, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // h.f.a.m
                                                public final Object invoke(am amVar, h.c.d<? super h.z> dVar) {
                                                    return ((f) create(amVar, dVar)).invokeSuspend(h.z.f158842a);
                                                }

                                                @Override // h.c.b.a.a
                                                public final Object invokeSuspend(Object obj) {
                                                    h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                                                    int i2 = this.label;
                                                    if (i2 == 0) {
                                                        r.a(obj);
                                                        final List<com.ss.android.ugc.aweme.draft.model.c> queryDraftList = this.this$0.queryDraftList();
                                                        kotlinx.coroutines.android.b bVar = com.ss.android.ugc.asve.editor.d.f62009a;
                                                        AnonymousClass1 r1 = new h.f.a.m<am, h.c.d<? super h.z>, Object>(this, null) {
                                                            /* class com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.f.AnonymousClass1 */
                                                            int label;
                                                            final /* synthetic */ f this$0;

                                                            static {
                                                                Covode.recordClassIndex(89567);
                                                            }

                                                            {
                                                                this.this$0 = r2;
                                                            }

                                                            @Override // h.c.b.a.a
                                                            public final h.c.d<h.z> create(Object obj, h.c.d<?> dVar) {
                                                                l.d(dVar, "");
                                                                return 

                                                                @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void checkIfStoryDraftExisted(h.f.a.b<? super Boolean, h.z> bVar) {
                                                                    l.d(bVar, "");
                                                                    q.a("StoryDraftServiceImpl:checkIfStoryDraftExisted");
                                                                    if (!b()) {
                                                                        bVar.invoke(false);
                                                                    } else {
                                                                        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new b(this, bVar, null), 3);
                                                                    }
                                                                }

                                                                @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void queryDraftList(h.f.a.b<? super List<? extends com.ss.android.ugc.aweme.draft.model.c>, h.z> bVar) {
                                                                    l.d(bVar, "");
                                                                    if (!b()) {
                                                                        bVar.invoke(h.a.z.INSTANCE);
                                                                    } else {
                                                                        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new f(this, bVar, null), 3);
                                                                    }
                                                                }

                                                                @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void restoreScheduleInfoFromDraft(h.f.a.b<? super List<ScheduleInfo>, h.z> bVar) {
                                                                    l.d(bVar, "");
                                                                    q.a("StoryDraftServiceImpl:restoreScheduleInfoFromDraft");
                                                                    if (!b()) {
                                                                        q.a("StoryDraftServiceImpl:draft disable,directly return");
                                                                        bVar.invoke(h.a.z.INSTANCE);
                                                                        return;
                                                                    }
                                                                    bz unused = kotlinx.coroutines.i.a(an.a(bf.f159041b), null, null, new g(this, bVar, null), 3);
                                                                }

                                                                static final class d extends m implements h.f.a.b<com.ss.android.ugc.aweme.draft.model.c, Boolean> {

                                                                    /* renamed from: a  reason: collision with root package name */
                                                                    public static final d f137017a = new d();

                                                                    static {
                                                                        Covode.recordClassIndex(89564);
                                                                    }

                                                                    d() {
                                                                        super(1);
                                                                    }

                                                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                    @Override // h.f.a.b
                                                                    public final /* synthetic */ Boolean invoke(com.ss.android.ugc.aweme.draft.model.c cVar) {
                                                                        EditPreviewInfo h2;
                                                                        List<EditVideoSegment> videoList;
                                                                        com.ss.android.ugc.aweme.draft.model.c cVar2 = cVar;
                                                                        l.d(cVar2, "");
                                                                        String str = cVar2.W.bD;
                                                                        boolean z = true;
                                                                        z = true;
                                                                        if (str == null || str.length() == 0 || !com.ss.android.ugc.tools.utils.i.a(com.ss.android.ugc.aweme.story.base.b.b.a(cVar2.W.bD, null)) || (h2 = com.ss.android.ugc.aweme.draft.model.d.h(cVar2)) == null || (videoList = h2.getVideoList()) == null) {
                                                                            z = false;
                                                                        } else if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
                                                                            Iterator<T> it = videoList.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    if (!com.ss.android.ugc.tools.utils.i.a(it.next().getVideoPath())) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        String f2 = cVar2.f();
                                                                        l.b(f2, "");
                                                                        int a2 = com.ss.android.ugc.aweme.draft.model.h.a(cVar2);
                                                                        String a3 = j.a(cVar2.I);
                                                                        long j2 = cVar2.W.bs;
                                                                        int i2 = z ? 1 : 0;
                                                                        int i3 = z ? 1 : 0;
                                                                        int i4 = z ? 1 : 0;
                                                                        int i5 = z ? 1 : 0;
                                                                        com.ss.android.ugc.aweme.port.in.g.a().c().a().a(new DraftLoadResult(f2, a2, a3, j2, new DraftCheckResult(i2, null, null, 0, 14, null), cVar2.W.bG));
                                                                        return Boolean.valueOf(z);
                                                                    }
                                                                }
                                                            }
