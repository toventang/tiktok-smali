package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bp;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.EditAdjustClipsState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditTrimState;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.r;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ap;
import com.ss.android.vesdk.filterparam.VERepeatFilterParam;
import com.ss.android.vesdk.filterparam.VESlowMotionFilterParam;
import com.ss.android.vesdk.x;
import h.a.n;
import h.f.b.ad;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.f.b.z;
import h.h;
import h.h.d;
import h.k.i;
import h.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class o implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f128358a = {new y(o.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new y(o.class, "editAdjustModel", "getEditAdjustModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(o.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new y(o.class, "musicSyncController", "getMusicSyncController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditMusicSyncController;", 0), new y(o.class, "videoImageMixedPresenter", "getVideoImageMixedPresenter()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/videoimagemixed/VideoImageMixedPresenter;", 0), new y(o.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(o.class, "cutVideoSpeedViewModel", "getCutVideoSpeedViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/scene/CutVideoSpeedViewModel;", 0), new y(o.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};
    private final d A = com.bytedance.o.b.a.a(getDiContainer(), CutVideoSpeedViewModel.class);
    private final d B = com.bytedance.o.b.a.a(getDiContainer(), r.class);
    private int C;
    private final f D;

    /* renamed from: b  reason: collision with root package name */
    public boolean f128359b;

    /* renamed from: c  reason: collision with root package name */
    public float f128360c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f128361d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    boolean f128362e;

    /* renamed from: f  reason: collision with root package name */
    g f128363f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.cut.i f128364g;

    /* renamed from: h  reason: collision with root package name */
    p<Integer, Integer> f128365h;

    /* renamed from: i  reason: collision with root package name */
    MultiEditVideoRecordData f128366i;

    /* renamed from: j  reason: collision with root package name */
    MultiEditVideoRecordData f128367j;

    /* renamed from: k  reason: collision with root package name */
    MultiEditVideoRecordData f128368k;

    /* renamed from: l  reason: collision with root package name */
    ArrayList<TimeSpeedModelExtension> f128369l;

    /* renamed from: m  reason: collision with root package name */
    ArrayList<TimeSpeedModelExtension> f128370m;
    ArrayList<TimeSpeedModelExtension> n;
    ArrayList<TimeSpeedModelExtension> o;
    final d p = com.bytedance.o.b.a.a(getDiContainer(), CutMultiVideoViewModel.class);
    float q = 1.0f;
    p<Long, Long> r;
    p<Long, Long> s;
    boolean t;
    private final h u = h.i.a((h.f.a.a) new a(this));
    private final d v = com.bytedance.o.b.a.a(getDiContainer(), VideoPublishEditModel.class);
    private final d w = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);
    private final d x = com.bytedance.o.b.a.a(getDiContainer(), p.class);
    private final d y = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g.class);
    private final d z = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    static {
        Covode.recordClassIndex(84187);
    }

    private final CutVideoSpeedViewModel n() {
        return (CutVideoSpeedViewModel) this.A.a(this, f128358a[6]);
    }

    public final List<VideoSegment> c() {
        return (List) this.u.getValue();
    }

    /* access modifiers changed from: package-private */
    public final VideoPublishEditModel e() {
        return (VideoPublishEditModel) this.v.a(this, f128358a[0]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a f() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.w.a(this, f128358a[1]);
    }

    /* access modifiers changed from: package-private */
    public final p g() {
        return (p) this.x.a(this, f128358a[3]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g h() {
        return (com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.g) this.y.a(this, f128358a[4]);
    }

    /* access modifiers changed from: package-private */
    public final EditAdjustClipsBottomViewModel i() {
        return (EditAdjustClipsBottomViewModel) this.z.a(this, f128358a[5]);
    }

    public final r j() {
        return (r) this.B.a(this, f128358a[7]);
    }

    @Override // com.bytedance.o.a
    public final f getDiContainer() {
        return this.D;
    }

    public final void a(boolean z2, boolean z3) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        g gVar;
        ArrayList<TimeSpeedModelExtension> arrayList;
        this.t = false;
        if ((!z2 || (multiEditVideoRecordData = this.f128368k) == null) && (multiEditVideoRecordData = this.f128366i) == null) {
            l.a("restoreRecordData");
        }
        ArrayList<TimeSpeedModelExtension> arrayList2 = (!z2 || (arrayList = this.n) == null || arrayList.isEmpty()) ? this.f128370m : this.n;
        boolean z4 = d().hasRetake;
        e().multiEditVideoRecordData.curMultiEditVideoRecordData = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData, d());
        e().multiEditVideoRecordData.isMultiEditRetake = false;
        d().hasRetake = z4;
        List g2 = arrayList2 != null ? n.g((Collection) arrayList2) : null;
        if (!(g2 instanceof ArrayList)) {
            g2 = null;
        }
        this.o = (ArrayList) g2;
        List<VideoSegment> c2 = c();
        if (ad.c(c2) && c2 != null) {
            c2.clear();
            c2.addAll(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.c(d()));
        }
        if (!f().f128080b) {
            CutVideoSpeedViewModel n2 = n();
            List<MultiEditVideoSegmentRecordData> list = d().segmentDataList;
            l.b(list, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) n.b((List) list, 0);
            com.ss.android.ugc.aweme.tools.i fromValue = com.ss.android.ugc.aweme.tools.i.fromValue(multiEditVideoSegmentRecordData != null ? multiEditVideoSegmentRecordData.getVideoSpeed() : 1.0f);
            l.b(fromValue, "");
            n2.a(fromValue);
        }
        if (z3) {
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128364g;
            if (!(iVar instanceof d)) {
                iVar = null;
            }
            d dVar = (d) iVar;
            if (dVar != null) {
                i.a.a(dVar, true, null, 2);
            }
            if (this.f128362e && (gVar = this.f128363f) != null) {
                gVar.H();
            }
        }
    }

    public final void a(boolean z2, p<Long, Long> pVar) {
        this.f128362e = z2;
        Iterator<T> it = c().iterator();
        while (it.hasNext()) {
            it.next().o = this.f128362e;
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(d(), c());
        h().f129509b = z2;
        h().a(c());
        d dVar = null;
        if (z2) {
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128364g;
            if (!(iVar instanceof d)) {
                iVar = null;
            }
            d dVar2 = (d) iVar;
            if (dVar2 != null) {
                i.a.a(dVar2, false, null, 3);
            }
            r.a.a(j(), 0, null, false, 6);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = this.f128364g;
        if (iVar2 instanceof d) {
            dVar = iVar2;
        }
        d dVar3 = dVar;
        if (dVar3 != null) {
            i.a.a(dVar3, false, pVar, 1);
        }
        r.a.a(j(), -1, null, false, 6);
    }

    static final class a extends m implements h.f.a.a<List<VideoSegment>> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(84188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<VideoSegment> invoke() {
            return n.g((Collection) com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.c(this.this$0.d()));
        }
    }

    public final MultiEditVideoRecordData d() {
        MultiEditVideoRecordData multiEditVideoRecordData = f().f128082d.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData, "");
        return multiEditVideoRecordData;
    }

    public final long a() {
        return Math.min(m(), com.ss.android.ugc.aweme.shortvideo.cut.p.a());
    }

    public final long b() {
        Iterator<T> it = c().iterator();
        long j2 = 0;
        while (it.hasNext()) {
            j2 += it.next().f125478b;
        }
        return j2;
    }

    public final void l() {
        EffectPointModel effectPointModel;
        if (bp.r(e()) && (effectPointModel = e().mTimeEffect) != null) {
            int index = effectPointModel.getIndex();
            g gVar = this.f128363f;
            if (gVar != null) {
                gVar.t(index);
            }
        }
    }

    private final long m() {
        List<MultiEditVideoSegmentRecordData> list = d().segmentDataList;
        l.b(list, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t2 : list) {
            if (t2.enable) {
                arrayList.add(t2);
            }
        }
        long j2 = 0;
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            l.b(multiEditVideoSegmentRecordData, "");
            j2 += (long) ((int) (((float) (multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime())) / multiEditVideoSegmentRecordData.getVideoSpeed()));
        }
        return j2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: com.ss.android.vesdk.filterparam.VERepeatFilterParam */
    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        EffectPointModel effectPointModel;
        g gVar;
        g gVar2;
        if (bp.r(e()) && (effectPointModel = e().mTimeEffect) != null) {
            VESlowMotionFilterParam vESlowMotionFilterParam = null;
            int startPoint = effectPointModel.getStartPoint();
            int endPoint = effectPointModel.getEndPoint() - effectPointModel.getStartPoint();
            if (l.a((Object) effectPointModel.getKey(), (Object) "2")) {
                VERepeatFilterParam vERepeatFilterParam = new VERepeatFilterParam();
                vERepeatFilterParam.seqIn = startPoint;
                vERepeatFilterParam.repeatDuration = endPoint;
                vERepeatFilterParam.repeatTime = 3;
                vERepeatFilterParam.timeMode = x.h.EDITOR_SLOMO_MODE.ordinal();
                vESlowMotionFilterParam = vERepeatFilterParam;
            } else if (l.a((Object) effectPointModel.getKey(), (Object) "3")) {
                VESlowMotionFilterParam vESlowMotionFilterParam2 = new VESlowMotionFilterParam();
                vESlowMotionFilterParam2.seqIn = startPoint;
                vESlowMotionFilterParam2.slowMotionDuration = endPoint;
                vESlowMotionFilterParam2.slowMotionSpeed = 0.5f;
                vESlowMotionFilterParam2.timeMode = x.h.EDITOR_SLOMO_MODE.ordinal();
                vESlowMotionFilterParam = vESlowMotionFilterParam2;
            }
            int i2 = -1;
            if (!(vESlowMotionFilterParam == null || (gVar = this.f128363f) == null)) {
                i2 = gVar.a(vESlowMotionFilterParam);
            }
            effectPointModel.setIndex(i2);
            if (this.f128362e && (gVar2 = this.f128363f) != null) {
                gVar2.H();
            }
        }
    }

    private final void o() {
        long j2;
        long j3;
        boolean z2;
        List list;
        p<Long, Long> pVar = this.r;
        p<Long, Long> pVar2 = this.s;
        List list2 = null;
        if (!this.f128362e) {
            if (f().f128080b) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(d(), c());
            } else {
                List<MultiEditVideoSegmentRecordData> list3 = d().segmentDataList;
                l.b(list3, "");
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) n.b((List) list3, 0);
                if (multiEditVideoSegmentRecordData != null) {
                    multiEditVideoSegmentRecordData.setStartTime(0);
                    multiEditVideoSegmentRecordData.setEndTime(multiEditVideoSegmentRecordData.videoLength / 1000);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128364g;
            if (!(iVar instanceof d)) {
                iVar = null;
            }
            d dVar = (d) iVar;
            if (dVar != null) {
                dVar.a(true, pVar);
            }
        }
        if (!this.t) {
            MultiEditVideoRecordData d2 = d();
            MultiEditVideoRecordData multiEditVideoRecordData = this.f128366i;
            if (multiEditVideoRecordData == null) {
                l.a("restoreRecordData");
            }
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(d2, multiEditVideoRecordData);
            ArrayList<TimeSpeedModelExtension> arrayList = this.o;
            if (arrayList != null) {
                list = n.g((Collection) arrayList);
            } else {
                list = null;
            }
            this.f128370m = (ArrayList) list;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = e().multiEditVideoRecordData;
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.o;
            if (arrayList2 != null) {
                list2 = n.g((Collection) arrayList2);
            }
            multiEditVideoStatusRecordData.editSegments = (ArrayList) list2;
        }
        if (this.f128362e || pVar2 == null) {
            j2 = 0;
        } else {
            j2 = pVar2.getFirst().longValue();
        }
        if (this.f128362e || pVar2 == null) {
            j3 = 0;
        } else {
            j3 = pVar2.getSecond().longValue() - pVar2.getFirst().longValue();
        }
        EditAdjustClipsBottomViewModel i2 = i();
        if (c().size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        i2.a(new t(z2, j2, j3));
        if (pVar != null) {
            b(pVar);
        }
        r.a.a(j(), -1, null, false, 6);
    }

    private final void p() {
        boolean z2;
        int i2 = 0;
        if (!e().mIsFromDraft || e().mFromCut) {
            z2 = false;
        } else {
            z2 = true;
        }
        e().setPreviewInfo(new com.ss.android.ugc.aweme.shortvideo.edit.model.d(e().getPreviewInfo().getPreviewWidth(), e().getPreviewInfo().getPreviewHeight(), true, e().getPreviewInfo().getReverseAudioArray(), e().getPreviewInfo().getReverseVideoArray(), z2, e().getPreviewInfo().getDraftDir(), 12).a(d()));
        if (e().mFromCut) {
            VideoPublishEditModel e2 = e();
            List<EditVideoSegment> videoList = e().getPreviewInfo().getVideoList();
            if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
                Iterator<T> it = videoList.iterator();
                while (it.hasNext()) {
                    if (com.ss.android.ugc.tools.utils.h.a(it.next().getVideoPath(), true) && (i2 = i2 + 1) < 0) {
                        n.b();
                    }
                }
            }
            e2.photoCount = i2;
            e().videoCount = e().getPreviewInfo().getVideoList().size() - e().photoCount;
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f128371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f128372b = 0;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f128373c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f128374d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f128375e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f128376f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f128377g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f128378h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f128379i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f128380j;

        static {
            Covode.recordClassIndex(84189);
        }

        b(o oVar, z.b bVar, float f2, int i2, int i3, float f3, int i4, p pVar) {
            this.f128371a = oVar;
            this.f128373c = bVar;
            this.f128374d = f2;
            this.f128375e = 0;
            this.f128376f = i2;
            this.f128377g = i3;
            this.f128378h = f3;
            this.f128379i = i4;
            this.f128380j = pVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128371a.f128364g;
            if (iVar != null) {
                iVar.a((90.0f * animatedFraction) + ((float) this.f128372b), (this.f128374d * animatedFraction) + this.f128373c.element, this.f128373c.element + (this.f128374d * animatedFraction), this.f128375e, this.f128376f);
            }
        }
    }

    public o(f fVar) {
        l.d(fVar, "");
        this.D = fVar;
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f128381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f128382b = 0;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f128383c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f128384d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f128385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f128386f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f128387g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ float f128388h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f128389i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ p f128390j;

        static {
            Covode.recordClassIndex(84190);
        }

        public final void onAnimationEnd(Animator animator) {
            float f2;
            g gVar;
            super.onAnimationEnd(animator);
            long a2 = this.f128381a.j().a();
            o oVar = this.f128381a;
            ((CutMultiVideoViewModel) oVar.p.a(oVar, o.f128358a[2])).b();
            g gVar2 = this.f128381a.f128363f;
            if (gVar2 != null) {
                f2 = ((float) com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127974c) / ((float) gVar2.b().width);
            } else {
                f2 = 1.0f;
            }
            if (!ap.a(-1.0f, this.f128381a.f128361d, 1.0E-5f) && !ap.a(this.f128381a.f128361d, f2, 1.0E-5f)) {
                o oVar2 = this.f128381a;
                oVar2.a(this.f128387g, (this.f128388h * f2) / oVar2.f128361d);
                this.f128381a.f128361d = f2;
            }
            int i2 = (this.f128389i + 90) % 360;
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128381a.f128364g;
            if (iVar != null) {
                iVar.b(this.f128387g, i2);
            }
            o oVar3 = this.f128381a;
            if (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127975d > 0 && com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127974c > 0 && com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127972a >= 0 && com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127973b >= 0 && (gVar = oVar3.f128363f) != null) {
                gVar.a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127972a, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127973b, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127974c, com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.b.f127975d);
            }
            com.ss.android.ugc.aweme.shortvideo.cut.i iVar2 = this.f128381a.f128364g;
            if (iVar2 != null) {
                iVar2.c((int) ((Number) this.f128390j.getFirst()).longValue(), (int) ((Number) this.f128390j.getSecond()).longValue());
            }
            r.a.a(this.f128381a.j(), a2, null, false, 6);
        }

        c(o oVar, z.b bVar, float f2, int i2, int i3, float f3, int i4, p pVar) {
            this.f128381a = oVar;
            this.f128383c = bVar;
            this.f128384d = f2;
            this.f128385e = 0;
            this.f128386f = i2;
            this.f128387g = i3;
            this.f128388h = f3;
            this.f128389i = i4;
            this.f128390j = pVar;
        }
    }

    public final void b(p<Long, Long> pVar) {
        float videoSpeed;
        l.d(pVar, "");
        if (!this.f128362e) {
            Integer editState = i().a().getEditState();
            if (editState == null || editState.intValue() != 2) {
                if (f().f128080b) {
                    videoSpeed = 1.0f;
                } else {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = d().segmentDataList.get(0);
                    l.b(multiEditVideoSegmentRecordData, "");
                    videoSpeed = multiEditVideoSegmentRecordData.getVideoSpeed();
                }
                a((int) (pVar.getFirst().floatValue() / videoSpeed), (int) (pVar.getSecond().floatValue() / videoSpeed));
            } else if (!com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(f())) {
                a(this.C, (int) pVar.getFirst().longValue(), (int) (pVar.getSecond().longValue() - pVar.getFirst().longValue()));
            }
        }
    }

    public final void a(p<Long, Long> pVar) {
        p<Long, Long> pVar2 = pVar;
        if (pVar2 == null) {
            pVar2 = this.r;
        }
        long j2 = 0;
        if (pVar2 != null) {
            if (!this.f128362e) {
                long m2 = m();
                if (pVar2.getFirst().longValue() == 0 && pVar2.getSecond().longValue() == m2) {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = e().multiEditVideoRecordData;
                    if (!(multiEditVideoStatusRecordData == null || multiEditVideoStatusRecordData.editSegments == null)) {
                        multiEditVideoStatusRecordData.editCutSegments = new ArrayList<>(multiEditVideoStatusRecordData.editSegments);
                    }
                } else {
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(d(), pVar2.getFirst().longValue(), pVar2.getSecond().longValue());
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = e().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData2 != null) {
                        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoStatusRecordData2, pVar2.getFirst().longValue(), pVar2.getSecond().longValue());
                    }
                }
                com.ss.android.ugc.aweme.shortvideo.cut.i iVar = this.f128364g;
                if (!(iVar instanceof d)) {
                    iVar = null;
                }
                d dVar = (d) iVar;
                if (dVar != null) {
                    i.a.a(dVar, false, null, 2);
                }
            } else {
                List<MultiEditVideoSegmentRecordData> list = d().segmentDataList;
                l.b(list, "");
                for (T t2 : list) {
                    MultiEditTrimState multiEditTrimState = t2.multiEditTrimState;
                    t2.multiEditTrimState = multiEditTrimState != null ? MultiEditTrimState.copy$default(multiEditTrimState, t2.enable, 0, 0, 6, null) : null;
                }
            }
        }
        d().startTime = 0;
        List<MultiEditVideoSegmentRecordData> list2 = d().segmentDataList;
        l.b(list2, "");
        ArrayList<MultiEditVideoSegmentRecordData> arrayList = new ArrayList();
        for (T t3 : list2) {
            if (t3.enable) {
                arrayList.add(t3);
            }
        }
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : arrayList) {
            l.b(multiEditVideoSegmentRecordData, "");
            j2 += multiEditVideoSegmentRecordData.getEndTime() - multiEditVideoSegmentRecordData.getStartTime();
        }
        d().endTime = j2;
    }

    public final void a(int i2, float f2) {
        List<MultiEditVideoSegmentRecordData> list = d().segmentDataList;
        l.b(list, "");
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) n.b((List) list, i2);
        if (multiEditVideoSegmentRecordData != null) {
            multiEditVideoSegmentRecordData.scale = f2;
        }
    }

    private void a(int i2, int i3) {
        int i4;
        if (d().musicIndex != -1) {
            if (i3 <= 0) {
                i4 = (int) a();
            } else {
                i4 = i3;
            }
            g gVar = this.f128363f;
            if (gVar != null && i3 > gVar.j()) {
                i4 = gVar.j();
            }
            int i5 = i4 - i2;
            if (i5 > d().musicDuration) {
                i5 = d().musicDuration;
            }
            g gVar2 = this.f128363f;
            if (gVar2 != null) {
                gVar2.a(d().musicIndex, d().musicTrimIn, d().musicTrimIn + i5, i2, i2 + i5, false);
            }
        }
    }

    public final void a(p<Long, Long> pVar, p<Long, Long> pVar2) {
        l.d(pVar, "");
        l.d(pVar2, "");
        this.t = false;
        this.r = pVar;
        this.s = pVar2;
        a(pVar);
        e().multiEditVideoRecordData.isMultiEditRetake = false;
        e().multiEditVideoRecordData.adjustClipsState = new EditAdjustClipsState(this.r, pVar2);
        p();
    }

    public final void a(boolean z2, h.f.a.a<p<Long, Long>> aVar) {
        p<Long, Long> pVar;
        if (z2) {
            if (this.r == null) {
                if (aVar != null) {
                    pVar = aVar.invoke();
                } else {
                    pVar = null;
                }
                this.r = pVar;
            }
            o();
        }
    }

    public static /* synthetic */ void a(o oVar, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        oVar.a(0, i2);
    }

    public final void a(int i2, int i3, int i4) {
        if (d().musicIndex != -1) {
            this.C = i2;
            int i5 = i2 + d().musicTrimIn;
            if (i5 > d().musicDuration) {
                i5 %= d().musicDuration;
            }
            g gVar = this.f128363f;
            if (gVar != null) {
                gVar.a(d().musicIndex, i5, i5 + i4, i3, i3 + i4, false);
            }
        }
    }
}
