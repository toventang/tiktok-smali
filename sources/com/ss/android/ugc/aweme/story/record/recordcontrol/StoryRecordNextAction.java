package com.ss.android.ugc.aweme.story.record.recordcontrol;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.n;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.c.a.j;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.canvas.aa;
import com.ss.android.ugc.aweme.canvas.y;
import com.ss.android.ugc.aweme.canvas.z;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.property.an;
import com.ss.android.ugc.aweme.record.f;
import com.ss.android.ugc.aweme.shortvideo.dl;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.ui.EmbaddedWindowInfo;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.x.a;
import com.ss.android.ugc.aweme.story.base.model.ETParams;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.base.ui.StoryEditActivity;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditModel;
import com.ss.android.ugc.aweme.tools.extract.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VERecordData;
import f.a.t;
import f.a.w;
import h.f.b.l;
import h.i;
import h.p;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public final class StoryRecordNextAction implements n, au, f.a {

    /* renamed from: a  reason: collision with root package name */
    f.a.b.b f138382a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.fragment.app.e f138383b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.story.record.a.b f138384c;

    /* renamed from: d  reason: collision with root package name */
    public final com.bytedance.creativex.recorder.sticker.a.a f138385d;

    /* renamed from: e  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.story.record.f.a f138386e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.w.f f138387f;

    /* renamed from: g  reason: collision with root package name */
    final h.f.a.a<String> f138388g;

    /* renamed from: h  reason: collision with root package name */
    private final int f138389h = com.ss.android.ugc.aweme.photo.g.f114866a;

    /* renamed from: i  reason: collision with root package name */
    private final int f138390i = com.ss.android.ugc.aweme.photo.g.f114867b;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f138391j = i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    private StoryEditModel f138392k;

    public static final class a {
        static {
            Covode.recordClassIndex(90509);
        }
    }

    static {
        Covode.recordClassIndex(90508);
    }

    public final com.ss.android.ugc.aweme.record.f a() {
        return (com.ss.android.ugc.aweme.record.f) this.f138391j.getValue();
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(com.bytedance.creativex.recorder.b.a.i iVar) {
        l.d(iVar, "");
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        f.a.b.b bVar = this.f138382a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        StoryEditModel storyEditModel = this.f138392k;
        if (storyEditModel != null) {
            StoryEditActivity.a.a(this.f138383b, storyEditModel);
            this.f138392k = null;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.record.f> {
        final /* synthetic */ StoryRecordNextAction this$0;

        static {
            Covode.recordClassIndex(90515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(StoryRecordNextAction storyRecordNextAction) {
            super(0);
            this.this$0 = storyRecordNextAction;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.record.f invoke() {
            return com.ss.android.ugc.aweme.port.in.g.a().l().getPhotoModule(this.this$0.f138383b, this.this$0.f138384c.w.getMediaController(), this.this$0);
        }
    }

    public final void a(StoryEditModel storyEditModel) {
        androidx.lifecycle.i lifecycle = this.f138383b.getLifecycle();
        l.b(lifecycle, "");
        if (lifecycle.a().isAtLeast(i.b.RESUMED)) {
            StoryEditActivity.a.a(this.f138383b, storyEditModel);
        } else {
            this.f138392k = storyEditModel;
        }
    }

    static final class e<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordNextAction f138396a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f138397b;

        static {
            Covode.recordClassIndex(90513);
        }

        e(StoryRecordNextAction storyRecordNextAction, String str) {
            this.f138396a = storyRecordNextAction;
            this.f138397b = str;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<j<MultiEditVideoStatusRecordData>> vVar) {
            l.d(vVar, "");
            if (this.f138396a.f138384c.w.i()) {
                com.ss.android.ugc.aweme.df.f.a("fail to stopRecord before goNext(story quick shoot)");
            }
            vVar.a(j.fromNullable(StoryRecordNextAction.a(this.f138396a.f138386e, this.f138397b)));
            vVar.a();
        }
    }

    static final class h<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordNextAction f138404a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138405b;

        static {
            Covode.recordClassIndex(90516);
        }

        h(StoryRecordNextAction storyRecordNextAction, int i2) {
            this.f138404a = storyRecordNextAction;
            this.f138405b = i2;
        }

        @Override // f.a.w
        public final void subscribe(f.a.v<Object> vVar) {
            l.d(vVar, "");
            if (this.f138405b > 0) {
                ((com.bytedance.creativex.recorder.sticker.a.a) this.f138404a.f138384c.getDiContainer().a((Type) com.bytedance.creativex.recorder.sticker.a.a.class, (String) null)).o();
            }
            vVar.a(new Object());
            vVar.a();
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordNextAction f138398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.canvas.i f138399b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f138400c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f138401d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f138402e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List f138403f;

        static {
            Covode.recordClassIndex(90514);
        }

        f(StoryRecordNextAction storyRecordNextAction, com.ss.android.ugc.aweme.canvas.i iVar, int i2, int i3, String str, List list) {
            this.f138398a = storyRecordNextAction;
            this.f138399b = iVar;
            this.f138400c = i2;
            this.f138401d = i3;
            this.f138402e = str;
            this.f138403f = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ETParams eTParams;
            String str;
            List<String> list;
            List<String> list2;
            y yVar = (y) obj;
            this.f138399b.a();
            EditContext copy$default = EditContext.copy$default(this.f138398a.f138386e.f(), null, null, null, false, null, null, null, null, 0, null, null, null, null, false, 0, null, 57215, null);
            String str2 = this.f138398a.f138386e.f138279b;
            String str3 = this.f138398a.f138386e.f138280c;
            if (str3 == null) {
                str3 = "";
            }
            ETParams etParams = copy$default.getEtParams();
            if (etParams != null) {
                eTParams = ETParams.copy$default(etParams, null, null, null, this.f138398a.f138387f.f132676a.f132749b, 0, 0.0f, 55, null);
            } else {
                eTParams = null;
            }
            Effect a2 = com.ss.android.ugc.aweme.sticker.f.e.a(this.f138398a.f138385d);
            if (a2 != null) {
                str = a2.getEffectId();
            } else {
                str = null;
            }
            ExtractFramesModel d2 = this.f138398a.f138386e.d();
            if (com.ss.android.ugc.aweme.sticker.p.g.k(com.ss.android.ugc.aweme.sticker.f.e.a(this.f138398a.f138385d))) {
                list = this.f138398a.a().a();
            } else {
                list = null;
            }
            if (com.ss.android.ugc.aweme.sticker.p.g.m(com.ss.android.ugc.aweme.sticker.f.e.a(this.f138398a.f138385d))) {
                list2 = this.f138398a.a().a();
            } else {
                list2 = null;
            }
            StoryEditModel storyEditModel = new StoryEditModel(str2, str3, 1, false, EditContext.copy$default(copy$default, eTParams, str, d2, false, null, list, list2, null, this.f138398a.f138384c.z.g(), RecordScene.getCameraIdsStringByModel(this.f138398a.f138386e.f138288k.j()), h.a.n.a(this.f138398a.f138384c.ad()), null, null, false, 0, null, 57496, null));
            EditPreviewInfo a3 = new com.ss.android.ugc.aweme.shortvideo.edit.model.h(this.f138400c, this.f138401d, com.ss.android.ugc.aweme.story.base.b.b.a(this.f138398a.f138386e.a(), null), 12).a(new EditVideoSegment(this.f138402e, null, new VideoFileInfo(this.f138400c, this.f138401d, 5000, 30, 0, 0, 0, 0, 240, null)));
            StoryEditClipModel storyEditClipModel = new StoryEditClipModel(this.f138398a.f138386e.a(), a3, 11, 2, null, 16, null);
            storyEditClipModel.setAiMusicRequestTaskId(com.ss.android.ugc.aweme.story.e.a(2, a3, this.f138398a.f138386e.e()));
            l.b(yVar, "");
            storyEditClipModel.setCanvasVideoData(com.ss.android.ugc.aweme.canvas.g.a(yVar, this.f138403f));
            storyEditModel.add(storyEditClipModel, 0);
            this.f138398a.a(storyEditModel);
        }
    }

    @Override // com.bytedance.creativex.recorder.b.a.n
    public final void a(com.ss.android.ugc.aweme.tools.h hVar) {
        String str;
        String str2;
        l.d(hVar, "");
        this.f138387f.a();
        boolean z = true;
        if (this.f138386e.f138288k.f124712g < 1000) {
            a().a(com.ss.android.ugc.aweme.story.base.b.b.a(this.f138386e.a(), UGCMonitor.TYPE_PHOTO));
            if (an.a()) {
                com.bytedance.creativex.recorder.sticker.a.a aVar = this.f138385d;
                if ((aVar instanceof com.ss.android.ugc.gamora.recorder.sticker.c.j) && ((com.ss.android.ugc.gamora.recorder.sticker.c.j) aVar).I() != null) {
                    ArrayList arrayList = new ArrayList();
                    o H = this.f138384c.H();
                    l.b(H, "");
                    com.ss.android.ugc.aweme.story.record.d.a.a(H, arrayList, (com.ss.android.ugc.gamora.recorder.sticker.c.j) this.f138385d);
                    com.ss.android.ugc.aweme.record.f a2 = a();
                    int i2 = this.f138386e.f138288k.f124708c;
                    int i3 = this.f138386e.f138288k.f124709d;
                    if (com.ss.android.ugc.aweme.sticker.f.e.a(this.f138385d) == null) {
                        z = false;
                    }
                    a2.a(i2, i3, z, arrayList);
                    return;
                }
            }
            com.ss.android.ugc.aweme.record.f a3 = a();
            int i4 = this.f138386e.f138288k.f124708c;
            int i5 = this.f138386e.f138288k.f124709d;
            if (com.ss.android.ugc.aweme.sticker.f.e.a(this.f138385d) == null) {
                z = false;
            }
            a3.a(i4, i5, z);
            return;
        }
        this.f138384c.an();
        a.C3440a aVar2 = new a.C3440a();
        File a4 = this.f138386e.b().a();
        if (a4 != null) {
            str = a4.getPath();
        } else {
            str = null;
        }
        aVar2.f132972a = str;
        File b2 = this.f138386e.b().b();
        if (b2 != null) {
            str2 = b2.getPath();
        } else {
            str2 = null;
        }
        aVar2.f132973b = str2;
        aVar2.f132976e = this.f138384c.w.getMediaController();
        aVar2.f132975d = false;
        aVar2.f132978g = true;
        aVar2.f132977f = com.ss.android.ugc.aweme.port.in.g.a().l().getABService().getEnablePreReleaseGPUResource();
        File a5 = this.f138386e.b().a();
        l.b(a5, "");
        aVar2.f132974c = com.ss.android.ugc.aweme.shortvideo.i.n.a(a5.getPath(), Integer.valueOf((int) this.f138386e.f138288k.f124712g), Integer.valueOf(this.f138386e.f138288k.f124708c), Integer.valueOf(this.f138386e.f138288k.f124709d), (List<EmbaddedWindowInfo>) null);
        aVar2.a(new b(this));
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordNextAction f138395a;

        static {
            Covode.recordClassIndex(90512);
        }

        d(StoryRecordNextAction storyRecordNextAction) {
            this.f138395a = storyRecordNextAction;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00ba  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x011f A[LOOP:0: B:23:0x0119->B:25:0x011f, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0178  */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r28) {
            /*
            // Method dump skipped, instructions count: 618
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.record.recordcontrol.StoryRecordNextAction.d.accept(java.lang.Object):void");
        }
    }

    static final class c<T1, T2, R> implements f.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f138394a = new c();

        static {
            Covode.recordClassIndex(90511);
        }

        c() {
        }

        @Override // f.a.d.c
        public final /* synthetic */ Object a(Object obj, Object obj2) {
            l.d(obj, "");
            l.d(obj2, "");
            return new p(obj, obj2);
        }
    }

    public static MultiEditVideoStatusRecordData a(com.ss.android.ugc.aweme.story.record.f.a aVar, String str) {
        boolean z = false;
        VERecordData a2 = VERecordData.a((com.ss.android.vesdk.runtime.e) new com.ss.android.ugc.asve.recorder.l(new com.ss.android.ugc.aweme.shortvideo.record.c(aVar.b())), false);
        if (a2 == null) {
            r.a("ve_create_record_data", new com.ss.android.ugc.tools.f.b().a("status", -1).f149193a);
            q.b("record data == null");
            return null;
        }
        r.a("ve_create_record_data", new com.ss.android.ugc.tools.f.b().a("status", 0).f149193a);
        File a3 = aVar.b().a();
        l.b(a3, "");
        a2.f150792d = a3.getAbsolutePath();
        File b2 = aVar.b().b();
        l.b(b2, "");
        a2.f150793e = b2.getAbsolutePath();
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        File e2 = aVar.b().e();
        l.b(e2, "");
        String absolutePath = e2.getAbsolutePath();
        l.b(absolutePath, "");
        MultiEditVideoRecordData a4 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(a2, absolutePath);
        if (a4 == null) {
            return null;
        }
        List<MultiEditVideoSegmentRecordData> list = a4.segmentDataList;
        if (list != null && list.size() == 1) {
            z = true;
        }
        a4.isSingleVideo = z;
        multiEditVideoStatusRecordData.originMultiEditRecordData = a4.cloneData();
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = a4;
        multiEditVideoStatusRecordData.videoMetaData = str;
        return multiEditVideoStatusRecordData;
    }

    @Override // com.ss.android.ugc.aweme.record.f.a
    public final void a(String str, List<String> list) {
        String str2;
        p a2;
        l.d(str, "");
        this.f138384c.H().c();
        this.f138386e.a(this.f138384c.H().e());
        com.ss.android.ugc.aweme.story.record.f.a aVar = this.f138386e;
        if (aVar.f138288k.f124712g > 0) {
            str2 = this.f138388g.invoke();
        } else {
            str2 = "take_photo";
        }
        aVar.f138285h = str2;
        if (aa.f69665a) {
            a2 = h.v.a(Integer.valueOf(dl.f126472a), Integer.valueOf(dl.f126473b));
        } else {
            a2 = h.v.a(Integer.valueOf(dl.f126474c), Integer.valueOf(dl.f126475d));
        }
        int intValue = ((Number) a2.component1()).intValue();
        int intValue2 = ((Number) a2.component2()).intValue();
        com.ss.android.ugc.aweme.canvas.i iVar = new com.ss.android.ugc.aweme.canvas.i(true);
        iVar.f69700a = System.currentTimeMillis();
        this.f138382a = new com.ss.android.ugc.aweme.canvas.f(new z(), true).a(str, intValue, intValue2, true, com.ss.android.ugc.aweme.story.base.b.b.a(this.f138386e.a(), "canvas")).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f(this, iVar, intValue, intValue2, str, list));
    }

    static final class b implements com.ss.android.ugc.aweme.shortvideo.x.j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryRecordNextAction f138393a;

        static {
            Covode.recordClassIndex(90510);
        }

        b(StoryRecordNextAction storyRecordNextAction) {
            this.f138393a = storyRecordNextAction;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.x.j
        public final void a(String str, String str2, String str3, int i2) {
            q.a("MultiEditLog: concat statusCode".concat(String.valueOf(i2)));
            b.a.f132249a.step("av_video_edit", "concatEnd");
            StoryRecordNextAction storyRecordNextAction = this.f138393a;
            t a2 = t.a(new h(storyRecordNextAction, i2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            l.b(a2, "");
            t a3 = t.a(new e(storyRecordNextAction, str3)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
            l.b(a3, "");
            storyRecordNextAction.f138382a = t.a(a2, a3, c.f138394a).d(new d(storyRecordNextAction));
        }
    }

    public StoryRecordNextAction(androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.story.record.a.b bVar, com.bytedance.creativex.recorder.sticker.a.a aVar, com.ss.android.ugc.aweme.story.record.f.a aVar2, com.ss.android.ugc.aweme.shortvideo.w.f fVar, h.f.a.a<String> aVar3) {
        l.d(eVar, "");
        l.d(bVar, "");
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(fVar, "");
        l.d(aVar3, "");
        this.f138383b = eVar;
        this.f138384c = bVar;
        this.f138385d = aVar;
        this.f138386e = aVar2;
        this.f138387f = fVar;
        this.f138388g = aVar3;
        eVar.getLifecycle().a(this);
    }
}
