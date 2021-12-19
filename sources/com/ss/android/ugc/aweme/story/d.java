package com.ss.android.ugc.aweme.story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.aa;
import com.ss.android.ugc.aweme.canvas.y;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.ds;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.util.al;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.utils.bh;
import com.ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.ag;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import h.u;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class d implements com.ss.android.ugc.aweme.story.h.c.a.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f137000b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    com.ss.android.ugc.tools.view.e.b f137001a;

    /* renamed from: c  reason: collision with root package name */
    private Activity f137002c;

    /* renamed from: d  reason: collision with root package name */
    private bz f137003d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f137004e;

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89540);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, h.c.d dVar2) {
            super(dVar2);
            this.this$0 = dVar;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a((String) null, (List<? extends MediaModel>) null, this);
        }
    }

    static {
        Covode.recordClassIndex(89538);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(89539);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final boolean b() {
        return this.f137004e;
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final a c() {
        return com.ss.android.ugc.aweme.story.draft.b.f137027a;
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final void a(androidx.fragment.app.e eVar, ArrayList<MediaModel> arrayList, Intent intent) {
        l.d(eVar, "");
        l.d(intent, "");
        bz bzVar = this.f137003d;
        if (bzVar != null) {
            bzVar.a((CancellationException) null);
        }
        this.f137002c = eVar;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (MediaModel mediaModel : arrayList) {
                if (!com.ss.android.ugc.tools.utils.i.a(mediaModel.f109390b)) {
                    arrayList2.add(mediaModel);
                }
            }
            arrayList.removeAll(arrayList2);
            if (a(arrayList)) {
                ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                EditContext editContext = (EditContext) intent.getParcelableExtra("key_story_edit_context");
                if (shortVideoContext != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList, 10));
                    for (MediaModel mediaModel2 : arrayList) {
                        try {
                            mediaModel2 = mediaModel2.a();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                        arrayList3.add(mediaModel2);
                    }
                    this.f137003d = kotlinx.coroutines.i.a(bs.f159054a, com.ss.android.ugc.asve.editor.d.f62009a, null, new g(this, shortVideoContext, n.g((Collection) arrayList3), editContext, currentTimeMillis, eVar, null), 2);
                }
            }
        }
    }

    public final void d() {
        String str;
        Activity activity = this.f137002c;
        if (activity != null && !activity.isFinishing()) {
            com.ss.android.ugc.tools.view.e.b bVar = this.f137001a;
            if (bVar == null || !bVar.isShowing()) {
                Activity activity2 = this.f137002c;
                if (activity2 != null) {
                    str = activity2.getString(R.string.g4k);
                } else {
                    str = null;
                }
                com.ss.android.ugc.tools.view.e.b b2 = com.ss.android.ugc.tools.view.e.b.b(activity2, str);
                this.f137001a = b2;
                if (b2 != null) {
                    b2.setIndeterminate(true);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final void a() {
        MethodCollector.i(2064);
        com.ss.android.ugc.aweme.story.base.e.f136896b.a().d().b();
        com.ss.android.ugc.aweme.story.base.e.f136896b.a().b().c();
        synchronized (com.ss.android.ugc.aweme.story.base.e.f136896b) {
            try {
                com.ss.android.ugc.aweme.filter.d.a aVar = com.ss.android.ugc.aweme.story.base.e.f136895a;
                if (aVar != null) {
                    aVar.g();
                }
                com.ss.android.ugc.aweme.story.base.e.f136895a = null;
            } finally {
                MethodCollector.o(2064);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final void a(boolean z) {
        this.f137004e = z;
    }

    /* access modifiers changed from: package-private */
    public static final class h extends k implements m<am, h.c.d<? super Map<String, ? extends CanvasVideoData>>, Object> {
        final /* synthetic */ List $selectedMediaData;
        final /* synthetic */ String $sessionId;
        Object L$0;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89552);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar, List list, String str, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$selectedMediaData = list;
            this.$sessionId = str;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new h(this.this$0, this.$selectedMediaData, this.$sessionId, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super Map<String, ? extends CanvasVideoData>> dVar) {
            return ((h) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f137005a = new a();

            static {
                Covode.recordClassIndex(89553);
            }

            a() {
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$h$d  reason: collision with other inner class name */
        public static final class C3584d<T, R> implements f.a.d.g {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ MediaModel f137009a;

            static {
                Covode.recordClassIndex(89556);
            }

            C3584d(MediaModel mediaModel) {
                this.f137009a = mediaModel;
            }

            @Override // f.a.d.g
            public final /* synthetic */ Object apply(Object obj) {
                l.d(obj, "");
                return new p(this.f137009a, obj);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.c.d f137008a;

            static {
                Covode.recordClassIndex(89555);
            }

            c(h.c.d dVar) {
                this.f137008a = dVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                bj.b("prepare photo canvas failed " + z.f158842a);
                this.f137008a.resumeWith(q.m223constructorimpl(ag.a()));
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.canvas.i f137006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.c.d f137007b;

            static {
                Covode.recordClassIndex(89554);
            }

            b(com.ss.android.ugc.aweme.canvas.i iVar, h.c.d dVar) {
                this.f137006a = iVar;
                this.f137007b = dVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Object[] objArr = (Object[]) obj;
                this.f137006a.a();
                h.c.d dVar = this.f137007b;
                l.b(objArr, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap(h.j.h.b(ag.a(objArr.length), 16));
                for (Object obj2 : objArr) {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Pair<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.canvas.PhotoPrepareInfo>");
                    p pVar = (p) obj2;
                    String str = ((MediaModel) pVar.getFirst()).f109390b;
                    l.b(str, "");
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Pair<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.canvas.PhotoPrepareInfo>");
                    linkedHashMap.put(str, com.ss.android.ugc.aweme.canvas.g.a((y) pVar.getSecond(), null));
                }
                dVar.resumeWith(q.m223constructorimpl(linkedHashMap));
            }
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            p a2;
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.L$0 = this;
                this.label = 1;
                h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                if (aa.f69665a) {
                    a2 = v.a(h.c.b.a.b.a(dl.f126472a), h.c.b.a.b.a(dl.f126473b));
                } else {
                    a2 = v.a(h.c.b.a.b.a(dl.f126474c), h.c.b.a.b.a(dl.f126475d));
                }
                int intValue = ((Number) a2.component1()).intValue();
                int intValue2 = ((Number) a2.component2()).intValue();
                List list = this.$selectedMediaData;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((MediaModel) obj2).b()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<MediaModel> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
                for (MediaModel mediaModel : arrayList2) {
                    String str = mediaModel.f109390b;
                    com.ss.android.ugc.aweme.canvas.f fVar = new com.ss.android.ugc.aweme.canvas.f(new com.ss.android.ugc.aweme.canvas.z(), true);
                    l.b(str, "");
                    arrayList3.add(fVar.a(str, intValue, intValue2, false, com.ss.android.ugc.aweme.story.base.b.b.a(this.$sessionId, "canvas")).d(new C3584d(mediaModel)));
                }
                ArrayList arrayList4 = arrayList3;
                if (arrayList4.isEmpty()) {
                    hVar.resumeWith(q.m223constructorimpl(ag.a()));
                } else {
                    this.this$0.d();
                    com.ss.android.ugc.aweme.canvas.i iVar = new com.ss.android.ugc.aweme.canvas.i(true, arrayList4.size());
                    iVar.f69700a = System.currentTimeMillis();
                    t.a(arrayList4, a.f137005a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(iVar, hVar), new c(hVar));
                }
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends k implements m<am, h.c.d<? super List<? extends u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>>, Object> {
        final /* synthetic */ List $selectedMediaData;
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89544);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar, List list, ShortVideoContext shortVideoContext, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$selectedMediaData = list;
            this.$shortVideoContext = shortVideoContext;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            e eVar = new e(this.this$0, this.$selectedMediaData, this.$shortVideoContext, dVar);
            eVar.L$0 = obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super List<? extends u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements m<am, h.c.d<? super VideoFileInfo>, Object> {
            final /* synthetic */ MediaModel $mediaModel;
            final /* synthetic */ am $this_coroutineScope$inlined;
            int label;
            final /* synthetic */ e this$0;

            static {
                Covode.recordClassIndex(89545);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(MediaModel mediaModel, h.c.d dVar, e eVar, am amVar) {
                super(2, dVar);
                this.$mediaModel = mediaModel;
                this.this$0 = eVar;
                this.$this_coroutineScope$inlined = amVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.$mediaModel, dVar, this.this$0, this.$this_coroutineScope$inlined);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super VideoFileInfo> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    String str = this.$mediaModel.f109390b;
                    l.b(str, "");
                    return d.a(str, this.$mediaModel);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
            // Method dump skipped, instructions count: 410
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements m<am, h.c.d<? super z>, Object> {
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d dVar, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new c(this.this$0, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                this.this$0.d();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static com.ss.android.ugc.aweme.shortvideo.edit.model.h a(String str) {
        return new com.ss.android.ugc.aweme.shortvideo.edit.model.h(com.ss.android.ugc.aweme.port.in.g.a().i().getVideoWidth(), com.ss.android.ugc.aweme.port.in.g.a().i().getVideoHeight(), str, 12);
    }

    /* access modifiers changed from: package-private */
    public static final class f extends k implements m<am, h.c.d<? super ArrayList<u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>>, Object> {
        final /* synthetic */ MediaModel $mediaModel;
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        long J$0;
        long J$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89546);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar, MediaModel mediaModel, ShortVideoContext shortVideoContext, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$mediaModel = mediaModel;
            this.$shortVideoContext = shortVideoContext;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            f fVar = new f(this.this$0, this.$mediaModel, this.$shortVideoContext, dVar);
            fVar.L$0 = obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super ArrayList<u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements m<am, h.c.d<? super VideoFileInfo>, Object> {
            int label;
            final /* synthetic */ f this$0;

            static {
                Covode.recordClassIndex(89547);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(f fVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = fVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super VideoFileInfo> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    String str = this.this$0.$mediaModel.f109390b;
                    l.b(str, "");
                    return d.a(str, this.this$0.$mediaModel);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x007d  */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
            // Method dump skipped, instructions count: 263
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends k implements m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ androidx.fragment.app.e $activity;
        final /* synthetic */ EditContext $editContext;
        final /* synthetic */ List $newSelectedMediaList;
        final /* synthetic */ ShortVideoContext $shortVideoContext;
        final /* synthetic */ long $startTime;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(89548);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar, ShortVideoContext shortVideoContext, List list, EditContext editContext, long j2, androidx.fragment.app.e eVar, h.c.d dVar2) {
            super(2, dVar2);
            this.this$0 = dVar;
            this.$shortVideoContext = shortVideoContext;
            this.$newSelectedMediaList = list;
            this.$editContext = editContext;
            this.$startTime = j2;
            this.$activity = eVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            g gVar = new g(this.this$0, this.$shortVideoContext, this.$newSelectedMediaList, this.$editContext, this.$startTime, this.$activity, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((g) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        public static final class a extends k implements m<am, h.c.d<? super p<? extends Long, ? extends List<? extends MediaModel>>>, Object> {
            int label;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(89550);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = gVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super p<? extends Long, ? extends List<? extends MediaModel>>> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    d dVar = this.this$0.this$0;
                    String str = this.this$0.$shortVideoContext.p;
                    List<? extends MediaModel> list = this.this$0.$newSelectedMediaList;
                    this.label = 1;
                    obj = dVar.a(str, list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b extends k implements m<am, h.c.d<? super Map<String, ? extends CanvasVideoData>>, Object> {
            int label;
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(89551);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(g gVar, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = gVar;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new b(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super Map<String, ? extends CanvasVideoData>> dVar) {
                return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    r.a(obj);
                    d dVar = this.this$0.this$0;
                    String str = this.this$0.$shortVideoContext.p;
                    List list = this.this$0.$newSelectedMediaList;
                    this.label = 1;
                    obj = kotlinx.coroutines.i.a(com.ss.android.ugc.asve.editor.d.f62009a, new h(dVar, list, str, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i2 == 1) {
                    r.a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01b8 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
            // Method dump skipped, instructions count: 449
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.d.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private static Map<MediaModel, VideoSegment> b(List<? extends MediaModel> list) {
        HashMap hashMap = new HashMap();
        for (T t : list) {
            if (t.b()) {
                Object obj = com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i.a(n.a((Object) t), false, null, 6).get(0);
                l.b(obj, "");
                VideoSegment videoSegment = (VideoSegment) obj;
                if (!al.a(videoSegment)) {
                    hashMap.put(t, videoSegment);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$d  reason: collision with other inner class name */
    public static final class C3583d extends k implements m<am, h.c.d<? super p<? extends Boolean, ? extends String>>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.ak.c $compressHelper;
        final /* synthetic */ String $outputPath;
        final /* synthetic */ VideoSegment $segment;
        Object L$0;
        int label;

        static {
            Covode.recordClassIndex(89542);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3583d(com.ss.android.ugc.aweme.ak.c cVar, String str, VideoSegment videoSegment, h.c.d dVar) {
            super(2, dVar);
            this.$compressHelper = cVar;
            this.$outputPath = str;
            this.$segment = videoSegment;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C3583d(this.$compressHelper, this.$outputPath, this.$segment, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super p<? extends Boolean, ? extends String>> dVar) {
            return ((C3583d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                this.L$0 = this;
                this.label = 1;
                h.c.h hVar = new h.c.h(h.c.a.b.a(this));
                this.$compressHelper.a(this.$outputPath, this.$segment, null, new a(hVar));
                obj = hVar.a();
                if (obj == h.c.a.a.COROUTINE_SUSPENDED) {
                    l.d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$d$a */
        public static final class a extends h.f.b.m implements m<Boolean, String, z> {
            final /* synthetic */ h.c.d $continuation;

            static {
                Covode.recordClassIndex(89543);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(h.c.d dVar) {
                super(2);
                this.$continuation = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final /* synthetic */ z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                l.d(str, "");
                bh.a(this.$continuation, v.a(Boolean.valueOf(booleanValue), str));
                return z.f158842a;
            }
        }
    }

    private final boolean a(List<? extends MediaModel> list) {
        int i2;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i3 = 0;
        for (T t : list) {
            if (t.b()) {
                i2 = (int) t.f109396h;
            } else {
                i2 = 0;
            }
            i3 += i2;
        }
        if (((long) i3) <= 3600000) {
            return true;
        }
        Activity activity = this.f137002c;
        if (activity != null) {
            new com.bytedance.tux.g.b(activity).e(R.string.d6e).b();
        }
        return false;
    }

    public static final class i extends com.ss.android.ugc.aweme.shortvideo.publish.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.q f137010a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137011b;

        static {
            Covode.recordClassIndex(89557);
        }

        i(h.f.a.q qVar, String str) {
            this.f137010a = qVar;
            this.f137011b = str;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
        public final void onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d dVar, Object obj) {
            l.d(dVar, "");
            super.onFinish(dVar, obj);
            this.f137010a.invoke(this.f137011b, dVar, obj);
        }
    }

    public static VideoFileInfo a(String str, MediaModel mediaModel) {
        VEUtils.VEVideoFileInfo a2 = com.ss.android.ugc.aweme.shortvideo.cut.u.a(str);
        if (a2 != null) {
            return new VideoFileInfo(a2.width, a2.height, (long) a2.duration, a2.fps, a2.bitrate, 0, 0, 0, 224, null);
        }
        return new VideoFileInfo(mediaModel.f109400l, mediaModel.f109401m, mediaModel.f109396h, 30, 0, 0, 0, 0, 240, null);
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final String a(Bundle bundle, VideoPublishEditModel videoPublishEditModel, h.f.a.q<? super String, Object, Object, z> qVar) {
        l.d(bundle, "");
        l.d(videoPublishEditModel, "");
        l.d(qVar, "");
        ArrayList arrayList = new ArrayList();
        l.d(bundle, "");
        com.ss.android.ugc.tools.utils.q.a("ParallelStoryPublishScheduler,startPublish");
        com.ss.android.ugc.aweme.story.publish.a.c a2 = com.ss.android.ugc.aweme.story.publish.a.a.a(bundle);
        com.ss.android.ugc.aweme.story.publish.a.a.f138047e.a(a2);
        String str = a2.f138092d;
        com.ss.android.ugc.aweme.story.publish.a.a.a(new com.ss.android.ugc.aweme.shortvideo.bj(bundle), str, true);
        com.ss.android.ugc.aweme.story.publish.a.a.a(new com.ss.android.ugc.aweme.scheduler.f(new ds(0, videoPublishEditModel)), str, true);
        com.ss.android.ugc.aweme.story.publish.a.a.a(new i(qVar, str), str, true);
        com.ss.android.ugc.aweme.story.publish.a.a.a(new com.ss.android.ugc.aweme.story.publish.foreground.a(arrayList), str, false);
        arrayList.add(new ScheduleInfo(str, bundle));
        new StoryPublishEvent(arrayList, false, 2, null).post();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r17, java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> r18, h.c.d<? super h.p<java.lang.Long, ? extends java.util.List<? extends com.ss.android.ugc.aweme.mediachoose.helper.MediaModel>>> r19) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.d.a(java.lang.String, java.util.List, h.c.d):java.lang.Object");
    }

    @Override // com.ss.android.ugc.aweme.story.h.c.a.a
    public final void a(Activity activity, VideoPublishEditModel videoPublishEditModel, int i2) {
        l.d(activity, "");
        l.d(videoPublishEditModel, "");
        com.ss.android.ugc.aweme.shortvideo.eventtrack.e.a(activity, videoPublishEditModel, null, i2, null, null, null, null, com.ss.android.ugc.aweme.port.in.l.f115658a.z().a(videoPublishEditModel.commerceData), "", true, 0);
    }
}
