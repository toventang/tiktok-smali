package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoBottomBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.h;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shortvideo.util.ak;
import com.ss.android.ugc.aweme.shortvideo.util.ap;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.gamora.editor.c.b;
import com.ss.android.ugc.gamora.editor.multiedit.MultiEditViewModel;
import com.ss.android.vesdk.VERecordData;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.x;
import h.f.b.z;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class f implements View.OnClickListener {
    public static final a u = new a((byte) 0);
    private boolean A;
    private MultiEditVideoRecordData B;
    private com.ss.android.ugc.aweme.shortvideo.c C;
    private int D;
    private ArrayList<TimeSpeedModelExtension> E;
    private ArrayList<TimeSpeedModelExtension> F;
    private ArrayList<TimeSpeedModelExtension> G;
    private ArrayList<TimeSpeedModelExtension> H;
    private boolean I;
    private int J;
    private boolean K;
    private com.ss.android.ugc.tools.view.a.c L;
    private final com.ss.android.ugc.tools.view.a.a M = new k(this);
    private com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a N;
    private final String O = "new";

    /* renamed from: a  reason: collision with root package name */
    public CutMultiVideoViewModel f127927a;

    /* renamed from: b  reason: collision with root package name */
    public VideoEditViewModel f127928b;

    /* renamed from: c  reason: collision with root package name */
    public VEVideoCutterViewModel f127929c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f127930d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.fragment.app.e f127931e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a f127932f;

    /* renamed from: g  reason: collision with root package name */
    public d f127933g = new d();

    /* renamed from: h  reason: collision with root package name */
    public h f127934h = new h();

    /* renamed from: i  reason: collision with root package name */
    public e f127935i = new e();

    /* renamed from: j  reason: collision with root package name */
    public int f127936j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<VideoSegment> f127937k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public VideoPublishEditModel f127938l;

    /* renamed from: m  reason: collision with root package name */
    public MultiEditVideoRecordData f127939m;
    MultiEditVideoRecordData n;
    public MultiEditVideoRecordData o;
    ArrayList<TimeSpeedModelExtension> p;
    public boolean q;
    public int r = 1;
    public int s;
    public c t = new c();
    private CutVideoSpeedViewModel v;
    private CutVideoBottomBarViewModel w;
    private MultiEditViewModel x;
    private View y;
    private ArrayList<MediaModel> z = new ArrayList<>();

    static {
        Covode.recordClassIndex(83850);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(83851);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(83852);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.g();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(83853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.d();
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$f  reason: collision with other inner class name */
    public static final class C3336f implements com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127941a;

        static {
            Covode.recordClassIndex(83856);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d
        public final void b() {
            this.f127941a.q = false;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d
        public final void a() {
            if (!this.f127941a.t.f127886g) {
                f fVar = this.f127941a;
                fVar.t.f127889j = 0;
                VideoEditViewModel videoEditViewModel = fVar.f127928b;
                if (videoEditViewModel == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                VideoSegment videoSegment = videoEditViewModel.k().get(fVar.f127936j);
                VideoEditViewModel videoEditViewModel2 = fVar.f127928b;
                if (videoEditViewModel2 == null) {
                    h.f.b.l.a("videoEditViewModel");
                }
                List<VideoSegment> k2 = videoEditViewModel2.k();
                h.f.b.l.b(k2, "");
                int i2 = 0;
                for (T t : k2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        h.a.n.a();
                    }
                    T t2 = t;
                    if (i2 < fVar.f127936j) {
                        c cVar = fVar.t;
                        int i4 = cVar.f127889j;
                        h.f.b.l.b(t2, "");
                        cVar.f127889j = i4 + ((int) (t2.e() - t2.d()));
                    }
                    i2 = i3;
                }
                c cVar2 = fVar.t;
                h.f.b.l.b(videoSegment, "");
                cVar2.f127890k = (int) (videoSegment.e() - videoSegment.d());
                d dVar = fVar.f127933g;
                MultiEditVideoRecordData multiEditVideoRecordData = fVar.f127939m;
                if (multiEditVideoRecordData == null) {
                    h.f.b.l.a("curRecordData");
                }
                int i5 = fVar.f127936j;
                int i6 = fVar.t.f127889j;
                if (!(multiEditVideoRecordData == null || com.ss.android.ugc.tools.utils.k.a(multiEditVideoRecordData.segmentDataList))) {
                    MultiEditVideoRecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData, (MultiEditVideoRecordData) null);
                    a2.resetTimeData();
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = a2.segmentDataList.get(i5);
                    a2.segmentDataList.clear();
                    a2.segmentDataList.add(multiEditVideoSegmentRecordData);
                    long e2 = videoSegment.e() - videoSegment.d();
                    com.ss.android.ugc.asve.editor.g gVar = dVar.f127891a;
                    if (gVar != null) {
                        gVar.r();
                    }
                    com.ss.android.ugc.asve.editor.g gVar2 = dVar.f127891a;
                    if (gVar2 != null) {
                        int unused = gVar2.a(com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(a2), false, true);
                    }
                    if (multiEditVideoRecordData.isPlaySingleSegmentMusic()) {
                        dVar.b(multiEditVideoRecordData);
                        dVar.a(multiEditVideoRecordData, i6, 0, (int) e2);
                    }
                    com.ss.android.ugc.asve.editor.g gVar3 = dVar.f127891a;
                    if (gVar3 != null) {
                        gVar3.a(true);
                    }
                    dVar.d();
                    com.ss.android.ugc.asve.editor.g gVar4 = dVar.f127891a;
                    if (gVar4 != null) {
                        gVar4.p();
                    }
                    dVar.e();
                    com.ss.android.ugc.asve.editor.g gVar5 = dVar.f127891a;
                    if (gVar5 != null) {
                        gVar5.b((int) videoSegment.d(), (int) videoSegment.e());
                    }
                    com.ss.android.ugc.asve.editor.g gVar6 = dVar.f127891a;
                    if (gVar6 != null) {
                        gVar6.a((int) videoSegment.d(), x.f.EDITOR_SEEK_FLAG_LastSeek);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3336f(f fVar) {
            this.f127941a = fVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
            if (r21 == false) goto L_0x019a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00e0  */
        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(boolean r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 467
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f.C3336f.a(boolean, boolean):void");
        }
    }

    public static final class g implements com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127942a;

        static {
            Covode.recordClassIndex(83857);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a
        public final void b() {
            this.f127942a.f127935i.a();
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a
        public final void a() {
            e eVar = this.f127942a.f127935i;
            eVar.f127901h.post(eVar.f127903j);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.a
        public final void c() {
            if (!this.f127942a.t.f127884e) {
                this.f127942a.f127933g.a();
                this.f127942a.f127933g.f127892b = null;
            } else if (!f.c(this.f127942a).b()) {
                this.f127942a.f127933g.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(f fVar) {
            this.f127942a = fVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f127943a = new i();

        static {
            Covode.recordClassIndex(83859);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127946a;

        static {
            Covode.recordClassIndex(83863);
        }

        m(f fVar) {
            this.f127946a = fVar;
        }

        public final void run() {
            this.f127946a.f127933g.b();
        }
    }

    static final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.a f127963b;

        static {
            Covode.recordClassIndex(83867);
        }

        q(f fVar, z.a aVar) {
            this.f127962a = fVar;
            this.f127963b = aVar;
        }

        public final void run() {
            this.f127962a.f127935i.a(this.f127963b.element);
        }
    }

    private final void j() {
        g gVar = new g(this);
        this.N = gVar;
        this.f127933g.f127892b = gVar;
    }

    public static final class d implements com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127940a;

        static {
            Covode.recordClassIndex(83854);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a() {
            this.f127940a.f127934h.a(f.e(this.f127940a), this.f127940a.f127936j, false, true);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void b() {
            this.f127940a.f127934h.a(f.e(this.f127940a), this.f127940a.f127936j, false, false);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void c() {
            this.f127940a.f127934h.a(f.e(this.f127940a), this.f127940a.f127936j, true, false);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void d() {
            if (!f.f(this.f127940a).multiEditVideoRecordData.isMultiEditRetake || f.f(this.f127940a).multiEditVideoRecordData.segmentSizeChange) {
                h hVar = this.f127940a.f127934h;
                androidx.fragment.app.e e2 = f.e(this.f127940a);
                int i2 = this.f127940a.f127936j;
                hVar.b(f.d(this.f127940a).k().get(this.f127940a.f127936j));
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = hVar.f127965a;
                if (aVar == null) {
                    h.f.b.l.a("viewManager");
                }
                aVar.b(e2, i2, new h.a(hVar));
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.d dVar = hVar.f127966b;
                if (dVar == null) {
                    h.f.b.l.a("statusChangeListener");
                }
                dVar.a();
                return;
            }
            h hVar2 = this.f127940a.f127934h;
            f.e(this.f127940a);
            hVar2.a(f.d(this.f127940a).k().get(this.f127940a.f127936j));
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(f fVar) {
            this.f127940a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a(Integer num) {
            int i2;
            f fVar = this.f127940a;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 1;
            }
            fVar.r = i2;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a(androidx.core.g.e<Integer, Integer> eVar) {
            if (eVar != null && this.f127940a.r != 2) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a c2 = f.c(this.f127940a);
                F f2 = eVar.f2397a;
                if (f2 == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(f2, "");
                int intValue = f2.intValue();
                S s = eVar.f2398b;
                if (s == null) {
                    h.f.b.l.b();
                }
                h.f.b.l.b(s, "");
                c2.a(intValue, s.intValue());
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a(float f2) {
            if (!ap.a(f2, 0.0f, 1.0E-5f)) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = f.a(this.f127940a).segmentDataList.get(this.f127940a.f127936j);
                h.f.b.l.b(multiEditVideoSegmentRecordData, "");
                multiEditVideoSegmentRecordData.setVideoSpeed(f2);
                d dVar = this.f127940a.f127933g;
                MultiEditVideoRecordData b2 = f.b(this.f127940a);
                int i2 = this.f127940a.f127936j;
                h.f.b.l.d(b2, "");
                bg b3 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.b(b2);
                b3.f151092i[i2] = (double) f2;
                com.ss.android.ugc.asve.editor.g gVar = dVar.f127891a;
                if (gVar != null) {
                    gVar.a(b3);
                }
                androidx.core.g.e<Long, Long> playBoundary = f.c(this.f127940a).a().getPlayBoundary();
                h.f.b.l.b(playBoundary, "");
                if (!(playBoundary.f2397a == null || playBoundary.f2398b == null)) {
                    long singleSeekTime = f.c(this.f127940a).a().getSingleSeekTime();
                    F f3 = playBoundary.f2397a;
                    if (f3 == null) {
                        h.f.b.l.b();
                    }
                    int longValue = (int) f3.longValue();
                    S s = playBoundary.f2398b;
                    if (s == null) {
                        h.f.b.l.b();
                    }
                    int longValue2 = (int) s.longValue();
                    this.f127940a.f127933g.a(longValue, longValue2, f2);
                    this.f127940a.f127933g.a(f.a(this.f127940a), (int) (((float) longValue) / f2), (int) (((float) longValue2) / f2));
                    VEVideoCutterViewModel vEVideoCutterViewModel = this.f127940a.f127929c;
                    if (vEVideoCutterViewModel == null) {
                        h.f.b.l.a("veVideoCutterViewModel");
                    }
                    vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(singleSeekTime, x.f.EDITOR_SEEK_FLAG_LastSeek));
                }
                f.c(this.f127940a).c();
            }
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a(int i2, int i3) {
            f fVar = this.f127940a;
            VideoEditViewModel videoEditViewModel = fVar.f127928b;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            VideoSegment remove = videoEditViewModel.k().remove(i2);
            VideoEditViewModel videoEditViewModel2 = fVar.f127928b;
            if (videoEditViewModel2 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            videoEditViewModel2.k().add(i3, remove);
            VideoEditViewModel videoEditViewModel3 = fVar.f127928b;
            if (videoEditViewModel3 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            List<VideoSegment> k2 = videoEditViewModel3.k();
            h.f.b.l.b(k2, "");
            int i4 = 0;
            int i5 = 0;
            for (T t : k2) {
                t.f125477a = i4;
                if (i4 < i3) {
                    h.f.b.l.b(t, "");
                    i5 += (int) (t.e() - t.d());
                }
                i4++;
            }
            MultiEditVideoRecordData multiEditVideoRecordData = fVar.f127939m;
            if (multiEditVideoRecordData == null) {
                h.f.b.l.a("curRecordData");
            }
            MultiEditVideoSegmentRecordData remove2 = multiEditVideoRecordData.segmentDataList.remove(i2);
            MultiEditVideoRecordData multiEditVideoRecordData2 = fVar.f127939m;
            if (multiEditVideoRecordData2 == null) {
                h.f.b.l.a("curRecordData");
            }
            multiEditVideoRecordData2.segmentDataList.add(i3, remove2);
            d dVar = fVar.f127933g;
            MultiEditVideoRecordData multiEditVideoRecordData3 = fVar.f127939m;
            if (multiEditVideoRecordData3 == null) {
                h.f.b.l.a("curRecordData");
            }
            if (multiEditVideoRecordData3 != null) {
                com.ss.android.ugc.asve.editor.g gVar = dVar.f127891a;
                if (gVar != null) {
                    gVar.r();
                }
                VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData3);
                com.ss.android.ugc.asve.editor.g gVar2 = dVar.f127891a;
                if (gVar2 != null) {
                    int unused = gVar2.a(a2, false, true);
                }
                dVar.b(multiEditVideoRecordData3);
                com.ss.android.ugc.asve.editor.g gVar3 = dVar.f127891a;
                if (gVar3 != null) {
                    gVar3.a(true);
                }
                dVar.d();
                com.ss.android.ugc.asve.editor.g gVar4 = dVar.f127891a;
                if (gVar4 != null) {
                    gVar4.p();
                }
                dVar.e();
                com.ss.android.ugc.asve.editor.g gVar5 = dVar.f127891a;
                if (gVar5 != null) {
                    gVar5.a(i5, x.f.EDITOR_SEEK_FLAG_LastSeek);
                }
            }
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = fVar.f127932f;
            if (aVar == null) {
                h.f.b.l.a("viewManager");
            }
            aVar.f();
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar2 = fVar.f127932f;
            if (aVar2 == null) {
                h.f.b.l.a("viewManager");
            }
            aVar2.c();
            c cVar = fVar.t;
            MultiEditVideoRecordData multiEditVideoRecordData4 = fVar.n;
            if (multiEditVideoRecordData4 == null) {
                h.f.b.l.a("restoreRecordData");
            }
            cVar.a(multiEditVideoRecordData4);
            ArrayList<TimeSpeedModelExtension> arrayList = fVar.p;
            if (arrayList == null) {
                h.f.b.l.b();
            }
            if (i2 < arrayList.size()) {
                ArrayList<TimeSpeedModelExtension> arrayList2 = fVar.p;
                if (arrayList2 == null) {
                    h.f.b.l.b();
                }
                TimeSpeedModelExtension remove3 = arrayList2.remove(i2);
                h.f.b.l.b(remove3, "");
                ArrayList<TimeSpeedModelExtension> arrayList3 = fVar.p;
                if (arrayList3 != null) {
                    arrayList3.add(i3, remove3);
                }
            }
            r.a("edit_segment_order", com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.c().a("from_order", String.valueOf(i2 + 1)).a("to_order", String.valueOf(i3 + 1)).f149193a);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c
        public final void a(long j2, long j3) {
            float f2;
            if (this.f127940a.t.f127885f) {
                if (this.f127940a.s == 0) {
                    f fVar = this.f127940a;
                    fVar.s = (int) (fVar.t.f127881b - this.f127940a.t.f127880a);
                }
                int i2 = (int) (j3 - j2);
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a(false, true, 0, this.f127940a.s, i2);
                this.f127940a.s = i2;
            } else if (this.f127940a.r == 1) {
                if (this.f127940a.s == 0) {
                    f fVar2 = this.f127940a;
                    fVar2.s = (int) (fVar2.t.f127881b - this.f127940a.t.f127880a);
                }
                int i3 = (int) (j3 - j2);
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a(false, false, 0, this.f127940a.s, i3);
                this.f127940a.s = i3;
            } else {
                if (this.f127940a.s == 0) {
                    f fVar3 = this.f127940a;
                    VideoSegment videoSegment = f.d(fVar3).k().get(this.f127940a.f127936j);
                    h.f.b.l.b(videoSegment, "");
                    long e2 = videoSegment.e();
                    VideoSegment videoSegment2 = f.d(this.f127940a).k().get(this.f127940a.f127936j);
                    h.f.b.l.b(videoSegment2, "");
                    fVar3.s = (int) (e2 - videoSegment2.d());
                }
                int i4 = (int) (j3 - j2);
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a(true, false, this.f127940a.f127936j, this.f127940a.s, i4);
                this.f127940a.s = i4;
            }
            if (this.f127940a.r == 1) {
                this.f127940a.t.f127880a = j2;
                this.f127940a.t.f127881b = j3;
                androidx.core.g.e<Float, Float> d2 = f.c(this.f127940a).d();
                c cVar = this.f127940a.t;
                F f3 = d2.f2397a;
                if (f3 == null) {
                    h.f.b.l.b();
                }
                cVar.f127882c = f3.floatValue();
                c cVar2 = this.f127940a.t;
                S s = d2.f2398b;
                if (s == null) {
                    h.f.b.l.b();
                }
                cVar2.f127883d = s.floatValue();
                if (this.f127940a.f127936j < f.a(this.f127940a).segmentDataList.size()) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = f.a(this.f127940a).segmentDataList.get(this.f127940a.f127936j);
                    h.f.b.l.b(multiEditVideoSegmentRecordData, "");
                    f2 = multiEditVideoSegmentRecordData.getVideoSpeed();
                } else {
                    f2 = 1.0f;
                }
                this.f127940a.f127933g.a(f.a(this.f127940a), (int) (((float) j2) / f2), (int) (((float) j3) / f2));
                return;
            }
            this.f127940a.f127933g.a(f.a(this.f127940a), this.f127940a.t.f127889j, (int) j2, (int) (j3 - j2));
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(83862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            f.g(this.this$0).a(f.d(this.this$0).k().get(this.this$0.f127936j));
            return h.z.f158842a;
        }
    }

    static final class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127961a;

        static {
            Covode.recordClassIndex(83866);
        }

        p(f fVar) {
            this.f127961a = fVar;
        }

        public final void run() {
            this.f127961a.f127933g.a(f.a(this.f127961a), f.b(this.f127961a));
        }
    }

    private final void k() {
        h hVar = this.f127934h;
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        hVar.a(aVar);
        this.f127934h.a(new C3336f(this));
    }

    public final float a() {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        return aVar.a().getSelectedTime();
    }

    public final void b() {
        if (this.A) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
            if (aVar == null) {
                h.f.b.l.a("viewManager");
            }
            aVar.b(true);
        }
    }

    public final void c() {
        if (this.A) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
            if (aVar == null) {
                h.f.b.l.a("viewManager");
            }
            aVar.k();
            this.f127934h.f127967c.a();
        }
        this.A = false;
    }

    public final void d() {
        if (!this.q) {
            this.q = true;
            com.ss.android.ugc.aweme.port.in.g.a().I().a("click_edit_segments_return", (Map<String, String>) null);
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f127927a;
            if (cutMultiVideoViewModel == null) {
                h.f.b.l.a("cutMultiVideoViewModel");
            }
            cutMultiVideoViewModel.c();
        }
    }

    public final void g() {
        d dVar = this.f127933g;
        MultiEditVideoRecordData multiEditVideoRecordData = this.n;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("restoreRecordData");
        }
        dVar.a(multiEditVideoRecordData);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        aVar.a().setCurrentRotate(0);
        MultiEditViewModel multiEditViewModel = this.x;
        if (multiEditViewModel == null) {
            h.f.b.l.a("multiEditViewModel");
        }
        multiEditViewModel.a(false);
        c(false);
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.t.f127887h = false;
        this.t.f127886g = false;
        VideoPublishEditModel videoPublishEditModel = this.f127938l;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("model");
        }
        videoPublishEditModel.multiEditVideoRecordData.isMultiEditRetake = false;
        VideoPublishEditModel videoPublishEditModel2 = this.f127938l;
        if (videoPublishEditModel2 == null) {
            h.f.b.l.a("model");
        }
        videoPublishEditModel2.multiEditVideoRecordData.segmentSizeChange = false;
        VideoPublishEditModel videoPublishEditModel3 = this.f127938l;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("model");
        }
        videoPublishEditModel3.multiEditVideoRecordData.currentEditIndex = -1;
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.a<Long> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(83858);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            f fVar = this.this$0;
            ArrayList<VideoSegment> arrayList = fVar.f127937k;
            VideoEditViewModel videoEditViewModel = fVar.f127928b;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            float l2 = videoEditViewModel.l();
            float f2 = 0.0f;
            for (T t : arrayList) {
                if (!t.f125485i) {
                    f2 += ((float) (t.e() - t.d())) / (t.f() * l2);
                }
            }
            return Long.valueOf(Math.min((long) f2, 60000L));
        }
    }

    private final void l() {
        e eVar = this.f127935i;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f127929c;
        if (vEVideoCutterViewModel == null) {
            h.f.b.l.a("veVideoCutterViewModel");
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f127927a;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        VideoEditViewModel videoEditViewModel = this.f127928b;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        CutVideoSpeedViewModel cutVideoSpeedViewModel = this.v;
        if (cutVideoSpeedViewModel == null) {
            h.f.b.l.a("speedViewModel");
        }
        d dVar = this.f127933g;
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        eVar.a(vEVideoCutterViewModel, cutMultiVideoViewModel, videoEditViewModel, cutVideoSpeedViewModel, dVar, aVar);
        this.f127935i.a(new d(this));
        e eVar2 = this.f127935i;
        androidx.fragment.app.e eVar3 = this.f127931e;
        if (eVar3 == null) {
            h.f.b.l.a("activity");
        }
        eVar2.a(eVar3);
        CutVideoBottomBarViewModel cutVideoBottomBarViewModel = this.w;
        if (cutVideoBottomBarViewModel == null) {
            h.f.b.l.a("bottomBarViewModel");
        }
        androidx.fragment.app.e eVar4 = this.f127931e;
        if (eVar4 == null) {
            h.f.b.l.a("activity");
        }
        f.a.b.b unused = cutVideoBottomBarViewModel.a(eVar4, g.f127964a, new ah(), new e(this));
    }

    public final void e() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.n;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("restoreRecordData");
        }
        if (multiEditVideoRecordData.startTime == this.t.f127880a) {
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.n;
            if (multiEditVideoRecordData2 == null) {
                h.f.b.l.a("restoreRecordData");
            }
            if (multiEditVideoRecordData2.endTime == this.t.f127881b) {
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f127939m;
                if (multiEditVideoRecordData3 == null) {
                    h.f.b.l.a("curRecordData");
                }
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.n;
                if (multiEditVideoRecordData4 == null) {
                    h.f.b.l.a("restoreRecordData");
                }
                if (!(!multiEditVideoRecordData3.isEqual(multiEditVideoRecordData4))) {
                    g();
                    this.B = null;
                    h();
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.b();
                }
            }
        }
        androidx.fragment.app.e eVar = this.f127931e;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a.b(eVar, new b(this));
        this.B = null;
        h();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if ((!h.f.b.l.a((java.lang.Object) r1.segmentDataList.get(r3.f127936j).videoPath, (java.lang.Object) r2)) != false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a r1 = r3.f127932f
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "viewManager"
            h.f.b.l.a(r0)
        L_0x0009:
            boolean r0 = r1.e()
            if (r0 != 0) goto L_0x0040
            boolean r0 = r3.I
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r0 = r3.B
            if (r0 == 0) goto L_0x0058
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r0.segmentDataList
            int r0 = r3.f127936j
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            java.lang.String r2 = r0.videoPath
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData r1 = r3.f127939m
            if (r1 != 0) goto L_0x002c
            java.lang.String r0 = "curRecordData"
            h.f.b.l.a(r0)
        L_0x002c:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData> r1 = r1.segmentDataList
            int r0 = r3.f127936j
            java.lang.Object r0 = r1.get(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData r0 = (com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData) r0
            java.lang.String r0 = r0.videoPath
            boolean r0 = h.f.b.l.a(r0, r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0058
        L_0x0040:
            androidx.fragment.app.e r1 = r3.f127931e
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "activity"
            h.f.b.l.a(r0)
        L_0x0049:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c r0 = new com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f$c
            r0.<init>(r3)
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.a.a(r1, r0)
        L_0x0051:
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a()
            r0 = 0
            r3.I = r0
            return
        L_0x0058:
            r3.d()
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f.f():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0174, code lost:
        if (a(r1) == false) goto L_0x0181;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
        // Method dump skipped, instructions count: 387
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f.i():void");
    }

    private final void m() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f127939m;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("curRecordData");
        }
        if (!com.ss.android.ugc.tools.utils.k.a(multiEditVideoRecordData.segmentDataList)) {
            this.z.clear();
            MultiEditVideoRecordData multiEditVideoRecordData2 = this.f127939m;
            if (multiEditVideoRecordData2 == null) {
                h.f.b.l.a("curRecordData");
            }
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
                this.z.add(multiEditVideoSegmentRecordData.convertModel());
            }
            VideoEditViewModel videoEditViewModel = this.f127928b;
            if (videoEditViewModel == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            videoEditViewModel.a(this.z);
            VideoEditViewModel videoEditViewModel2 = this.f127928b;
            if (videoEditViewModel2 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            List<VideoSegment> k2 = videoEditViewModel2.k();
            this.f127937k.clear();
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f127939m;
            if (multiEditVideoRecordData3 == null) {
                h.f.b.l.a("curRecordData");
            }
            List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData3.segmentDataList;
            h.f.b.l.b(list, "");
            boolean z2 = false;
            int i2 = 0;
            for (T t2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                T t3 = t2;
                VideoSegment videoSegment = new VideoSegment(this.z.get(i2));
                videoSegment.f125477a = i2;
                h.f.b.l.b(t3, "");
                videoSegment.a(t3.getStartTime());
                if (t3.getEndTime() <= 0) {
                    MediaModel mediaModel = this.z.get(i2);
                    h.f.b.l.b(mediaModel, "");
                    t3.setEndTime(mediaModel.f109396h);
                }
                videoSegment.b(t3.getEndTime());
                videoSegment.a(t3.getVideoSpeed());
                videoSegment.f125486j = t3.rotate;
                this.f127937k.add(videoSegment);
                VideoSegment videoSegment2 = k2.get(i2);
                h.f.b.l.b(videoSegment2, "");
                videoSegment2.a(t3.getStartTime());
                VideoSegment videoSegment3 = k2.get(i2);
                h.f.b.l.b(videoSegment3, "");
                videoSegment3.b(t3.getEndTime());
                i2 = i3;
            }
            c cVar = this.t;
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f127939m;
            if (multiEditVideoRecordData4 == null) {
                h.f.b.l.a("curRecordData");
            }
            if (multiEditVideoRecordData4.segmentDataList.size() == 1) {
                MultiEditVideoRecordData multiEditVideoRecordData5 = this.f127939m;
                if (multiEditVideoRecordData5 == null) {
                    h.f.b.l.a("curRecordData");
                }
                if (multiEditVideoRecordData5.isSingleVideo) {
                    z2 = true;
                }
            }
            cVar.f127885f = z2;
        }
    }

    private final void n() {
        String sb;
        this.t.a();
        c cVar = this.t;
        MultiEditVideoRecordData multiEditVideoRecordData = this.f127939m;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("curRecordData");
        }
        cVar.b(multiEditVideoRecordData);
        int i2 = this.f127936j;
        RetakeVideoContext retakeVideoContext = new RetakeVideoContext();
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f127939m;
        if (multiEditVideoRecordData2 == null) {
            h.f.b.l.a("curRecordData");
        }
        retakeVideoContext.f124750d = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoRecordData2);
        retakeVideoContext.f124749c = i2;
        long j2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.f127939m;
            if (multiEditVideoRecordData3 == null) {
                h.f.b.l.a("curRecordData");
            }
            j2 += multiEditVideoRecordData3.segmentDataList.get(i4).videoLength;
        }
        retakeVideoContext.f124748b = j2 / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData4 = this.f127939m;
        if (multiEditVideoRecordData4 == null) {
            h.f.b.l.a("curRecordData");
        }
        retakeVideoContext.f124747a = multiEditVideoRecordData4.segmentDataList.get(i2).videoLength / 1000;
        MultiEditVideoRecordData multiEditVideoRecordData5 = this.f127939m;
        if (multiEditVideoRecordData5 == null) {
            h.f.b.l.a("curRecordData");
        }
        File file = new File(multiEditVideoRecordData5.curRecordingDir);
        String name = file.getName();
        h.f.b.l.b(name, "");
        if (!h.m.p.e((CharSequence) name, (CharSequence) this.O)) {
            StringBuilder sb2 = new StringBuilder();
            String path = file.getPath();
            h.f.b.l.b(path, "");
            sb = sb2.append(a(path)).append(this.O).toString();
        } else {
            String name2 = file.getName();
            h.f.b.l.b(name2, "");
            Integer e2 = h.m.p.e(h.m.p.a(name2, (CharSequence) this.O));
            if (e2 != null) {
                i3 = e2.intValue();
            }
            StringBuilder sb3 = new StringBuilder();
            String parent = file.getParent();
            h.f.b.l.b(parent, "");
            sb = sb3.append(a(parent)).append(this.O).append(i3 + 1).toString();
        }
        retakeVideoContext.a(sb);
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f127939m;
        if (multiEditVideoRecordData6 == null) {
            h.f.b.l.a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = true;
        multiEditVideoStatusRecordData.currentEditIndex = this.f127936j;
        multiEditVideoStatusRecordData.originalSegments = this.E;
        multiEditVideoStatusRecordData.restoreSegments = this.F;
        multiEditVideoStatusRecordData.singleRestoreSegments = this.H;
        multiEditVideoStatusRecordData.editSegments = this.p;
        multiEditVideoStatusRecordData.editCutSegments = this.G;
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f127939m;
        if (multiEditVideoRecordData7 == null) {
            h.f.b.l.a("curRecordData");
        }
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordData7;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.o;
        if (multiEditVideoRecordData8 == null) {
            h.f.b.l.a("originRecordData");
        }
        multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordData8;
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.n;
        if (multiEditVideoRecordData9 == null) {
            h.f.b.l.a("restoreRecordData");
        }
        multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = multiEditVideoRecordData9;
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.f127939m;
        if (multiEditVideoRecordData10 == null) {
            h.f.b.l.a("curRecordData");
        }
        multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData10, (MultiEditVideoRecordData) null);
        multiEditVideoStatusRecordData.recordMusic = this.C;
        multiEditVideoStatusRecordData.originalMusicStart = this.D;
        retakeVideoContext.f124751e = multiEditVideoStatusRecordData;
        VideoPublishEditModel videoPublishEditModel = this.f127938l;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("model");
        }
        if (videoPublishEditModel.isStitchMode()) {
            VideoPublishEditModel videoPublishEditModel2 = this.f127938l;
            if (videoPublishEditModel2 == null) {
                h.f.b.l.a("model");
            }
            retakeVideoContext.f124753g = videoPublishEditModel2.stitchParams;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.f127938l;
        if (videoPublishEditModel3 == null) {
            h.f.b.l.a("model");
        }
        if (videoPublishEditModel3.mIsFromDraft) {
            androidx.fragment.app.e eVar = this.f127931e;
            if (eVar == null) {
                h.f.b.l.a("activity");
            }
            if (eVar instanceof VEVideoPublishEditActivity) {
                androidx.fragment.app.e eVar2 = this.f127931e;
                if (eVar2 == null) {
                    h.f.b.l.a("activity");
                }
                Objects.requireNonNull(eVar2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
                VEVideoPublishEditActivity vEVideoPublishEditActivity = (VEVideoPublishEditActivity) eVar2;
                VideoPublishEditModel videoPublishEditModel4 = this.f127938l;
                if (videoPublishEditModel4 == null) {
                    h.f.b.l.a("model");
                }
                Intent a2 = vEVideoPublishEditActivity.a(videoPublishEditModel4);
                if (a2 != null) {
                    a2.putExtra("retake_video", retakeVideoContext);
                    a2.putExtra("retake_shoot_mode", 1);
                    VideoPublishEditModel videoPublishEditModel5 = this.f127938l;
                    if (videoPublishEditModel5 == null) {
                        h.f.b.l.a("model");
                    }
                    vEVideoPublishEditActivity.a(a2, videoPublishEditModel5);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            androidx.fragment.app.e eVar3 = this.f127931e;
            if (eVar3 == null) {
                h.f.b.l.a("activity");
            }
            com.ss.android.ugc.gamora.editor.c.c.a(new b.d(eVar3, retakeVideoContext));
        }
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.a(this.f127936j);
    }

    public static final class j implements com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127944a;

        static {
            Covode.recordClassIndex(83860);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(f fVar) {
            this.f127944a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.b
        public final void a(int i2) {
            r.a("select_video_section", com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.b.c().a("order", String.valueOf(i2 + 1)).f149193a);
            this.f127944a.a(i2);
        }
    }

    public final void a(com.ss.android.ugc.asve.editor.g gVar) {
        this.f127933g.a(gVar);
    }

    /* access modifiers changed from: package-private */
    public static final class e extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(83855);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(1);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            this.this$0.f127930d = bool.booleanValue();
            return h.z.f158842a;
        }
    }

    public static final class o extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127954a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f127955b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f127956c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f127957d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f127958e = 0;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f127959f = 0;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f127960g;

        static {
            Covode.recordClassIndex(83865);
        }

        public final void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            this.f127960g.setEnabled(true);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f127960g.setEnabled(false);
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f127960g.setEnabled(true);
            f.g(this.f127954a).b();
            f.a(this.f127954a).segmentDataList.get(this.f127954a.f127936j).rotate = (f.a(this.f127954a).segmentDataList.get(this.f127954a.f127936j).rotate + 90) % 360;
        }

        o(f fVar, int i2, z.b bVar, float f2, View view) {
            this.f127954a = fVar;
            this.f127955b = i2;
            this.f127956c = bVar;
            this.f127957d = f2;
            this.f127960g = view;
        }
    }

    public static final /* synthetic */ MultiEditVideoRecordData a(f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.f127939m;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("curRecordData");
        }
        return multiEditVideoRecordData;
    }

    public static final /* synthetic */ MultiEditVideoRecordData b(f fVar) {
        MultiEditVideoRecordData multiEditVideoRecordData = fVar.o;
        if (multiEditVideoRecordData == null) {
            h.f.b.l.a("originRecordData");
        }
        return multiEditVideoRecordData;
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a c(f fVar) {
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = fVar.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        return aVar;
    }

    public static final /* synthetic */ VideoEditViewModel d(f fVar) {
        VideoEditViewModel videoEditViewModel = fVar.f127928b;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    public static final /* synthetic */ androidx.fragment.app.e e(f fVar) {
        androidx.fragment.app.e eVar = fVar.f127931e;
        if (eVar == null) {
            h.f.b.l.a("activity");
        }
        return eVar;
    }

    public static final /* synthetic */ VideoPublishEditModel f(f fVar) {
        VideoPublishEditModel videoPublishEditModel = fVar.f127938l;
        if (videoPublishEditModel == null) {
            h.f.b.l.a("model");
        }
        return videoPublishEditModel;
    }

    public static final /* synthetic */ CutMultiVideoViewModel g(f fVar) {
        CutMultiVideoViewModel cutMultiVideoViewModel = fVar.f127927a;
        if (cutMultiVideoViewModel == null) {
            h.f.b.l.a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    static final class n implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f127948b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.b f127949c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f127950d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f127951e = 0;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f127952f = 0;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ View f127953g;

        static {
            Covode.recordClassIndex(83864);
        }

        n(f fVar, int i2, z.b bVar, float f2, View view) {
            this.f127947a = fVar;
            this.f127948b = i2;
            this.f127949c = bVar;
            this.f127950d = f2;
            this.f127953g = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            h.f.b.l.b(valueAnimator, "");
            float animatedFraction = valueAnimator.getAnimatedFraction();
            d dVar = this.f127947a.f127933g;
            float f2 = ((float) this.f127948b) + (90.0f * animatedFraction);
            float f3 = this.f127949c.element + (this.f127950d * animatedFraction);
            float f4 = this.f127949c.element + (this.f127950d * animatedFraction);
            int i2 = this.f127951e;
            int i3 = this.f127952f;
            com.ss.android.ugc.asve.editor.g gVar = dVar.f127891a;
            if (gVar != null) {
                gVar.a(f4, f3, f2, i2, i3);
            }
        }
    }

    private static String a(String str) {
        String str2 = File.separator;
        h.f.b.l.b(str2, "");
        if (h.m.p.c(str, str2, false)) {
            return str;
        }
        return str + File.separator;
    }

    public final void b(boolean z2) {
        if (z2) {
            this.f127933g.b();
            return;
        }
        if (this.f127932f != null) {
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
            if (aVar == null) {
                h.f.b.l.a("viewManager");
            }
            if (!aVar.b()) {
                this.f127933g.a();
                return;
            }
        }
        if (this.t.f127885f) {
            View view = this.y;
            if (view == null) {
                h.f.b.l.a("rootView");
            }
            view.postDelayed(new m(this), 100);
        }
    }

    private static boolean a(VideoSegment videoSegment) {
        try {
            if (ak.a(Math.min(videoSegment.f125482f, videoSegment.f125483g), Math.max(videoSegment.f125482f, videoSegment.f125483g), (int) (((float) videoSegment.a()) * com.ss.android.ugc.aweme.tools.i.FAST.value())).getFirst().intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            bj.b(e2.getMessage());
            return false;
        }
    }

    public final void a(int i2) {
        this.f127936j = i2;
        if (i2 >= 0) {
            CutMultiVideoViewModel cutMultiVideoViewModel = this.f127927a;
            if (cutMultiVideoViewModel == null) {
                h.f.b.l.a("cutMultiVideoViewModel");
            }
            int i3 = this.f127936j;
            cutMultiVideoViewModel.a(i3, i3);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2 = this.f127939m;
        if (multiEditVideoRecordData2 == null) {
            h.f.b.l.a("curRecordData");
        }
        boolean z3 = multiEditVideoRecordData2.hasRetake;
        if (!z2 || (multiEditVideoRecordData = this.B) == null) {
            MultiEditVideoRecordData multiEditVideoRecordData3 = this.n;
            if (multiEditVideoRecordData3 == null) {
                h.f.b.l.a("restoreRecordData");
            }
            MultiEditVideoRecordData multiEditVideoRecordData4 = this.f127939m;
            if (multiEditVideoRecordData4 == null) {
                h.f.b.l.a("curRecordData");
            }
            this.f127939m = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData3, multiEditVideoRecordData4);
        } else {
            MultiEditVideoRecordData multiEditVideoRecordData5 = this.f127939m;
            if (multiEditVideoRecordData5 == null) {
                h.f.b.l.a("curRecordData");
            }
            this.f127939m = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData, multiEditVideoRecordData5);
        }
        MultiEditVideoRecordData multiEditVideoRecordData6 = this.f127939m;
        if (multiEditVideoRecordData6 == null) {
            h.f.b.l.a("curRecordData");
        }
        multiEditVideoRecordData6.hasRetake = z3;
        if (!z2 || com.ss.android.ugc.tools.utils.k.a(this.H)) {
            ArrayList<TimeSpeedModelExtension> arrayList = this.F;
            this.p = (ArrayList) (arrayList != null ? h.a.n.g((Collection) arrayList) : null);
        } else {
            ArrayList<TimeSpeedModelExtension> arrayList2 = this.H;
            this.p = (ArrayList) (arrayList2 != null ? h.a.n.g((Collection) arrayList2) : null);
        }
        MultiEditVideoRecordData multiEditVideoRecordData7 = this.f127939m;
        if (multiEditVideoRecordData7 == null) {
            h.f.b.l.a("curRecordData");
        }
        MultiEditVideoRecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData7, (MultiEditVideoRecordData) null);
        this.o = a2;
        if (a2 == null) {
            h.f.b.l.a("originRecordData");
        }
        a2.resetTimeData();
        c cVar = this.t;
        MultiEditVideoRecordData multiEditVideoRecordData8 = this.f127939m;
        if (multiEditVideoRecordData8 == null) {
            h.f.b.l.a("curRecordData");
        }
        cVar.a(multiEditVideoRecordData8);
        m();
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
        if (aVar == null) {
            h.f.b.l.a("viewManager");
        }
        VideoEditViewModel videoEditViewModel = this.f127928b;
        if (videoEditViewModel == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        aVar.a(videoEditViewModel.k());
        VideoEditViewModel videoEditViewModel2 = this.f127928b;
        if (videoEditViewModel2 == null) {
            h.f.b.l.a("videoEditViewModel");
        }
        videoEditViewModel2.a(this.z);
        MultiEditVideoRecordData multiEditVideoRecordData9 = this.n;
        if (multiEditVideoRecordData9 == null) {
            h.f.b.l.a("restoreRecordData");
        }
        Float valueOf = Float.valueOf(multiEditVideoRecordData9.leftSlideX);
        MultiEditVideoRecordData multiEditVideoRecordData10 = this.n;
        if (multiEditVideoRecordData10 == null) {
            h.f.b.l.a("restoreRecordData");
        }
        androidx.core.g.e<Float, Float> eVar = new androidx.core.g.e<>(valueOf, Float.valueOf(multiEditVideoRecordData10.rightSlideX));
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar2 = this.f127932f;
        if (aVar2 == null) {
            h.f.b.l.a("viewManager");
        }
        aVar2.a(eVar);
        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar3 = this.f127932f;
        if (aVar3 == null) {
            h.f.b.l.a("viewManager");
        }
        aVar3.c();
        int i2 = 0;
        for (T t2 : this.f127937k) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h.a.n.a();
            }
            T t3 = t2;
            VideoEditViewModel videoEditViewModel3 = this.f127928b;
            if (videoEditViewModel3 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            VideoSegment videoSegment = videoEditViewModel3.k().get(i2);
            h.f.b.l.b(videoSegment, "");
            videoSegment.a(t3.d());
            VideoEditViewModel videoEditViewModel4 = this.f127928b;
            if (videoEditViewModel4 == null) {
                h.f.b.l.a("videoEditViewModel");
            }
            VideoSegment videoSegment2 = videoEditViewModel4.k().get(i2);
            h.f.b.l.b(videoSegment2, "");
            videoSegment2.b(t3.e());
            i2 = i3;
        }
    }

    public final void a(VideoPublishEditModel videoPublishEditModel) {
        h.f.b.l.d(videoPublishEditModel, "");
        if (!this.A) {
            this.f127938l = videoPublishEditModel;
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = videoPublishEditModel.multiEditVideoRecordData;
            if (multiEditVideoStatusRecordData != null && multiEditVideoStatusRecordData.curMultiEditVideoRecordData != null && !com.ss.android.ugc.tools.utils.k.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData.segmentDataList)) {
                if (multiEditVideoStatusRecordData.originalSegments != null) {
                    this.E = multiEditVideoStatusRecordData.originalSegments;
                    ArrayList<TimeSpeedModelExtension> arrayList = multiEditVideoStatusRecordData.restoreSegments;
                    if (arrayList == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList2 = this.E;
                        if (arrayList2 == null) {
                            h.f.b.l.b();
                        }
                        arrayList = new ArrayList<>(arrayList2);
                    }
                    this.F = arrayList;
                    ArrayList<TimeSpeedModelExtension> arrayList3 = multiEditVideoStatusRecordData.editSegments;
                    if (arrayList3 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList4 = this.F;
                        if (arrayList4 == null) {
                            h.f.b.l.b();
                        }
                        arrayList3 = new ArrayList<>(arrayList4);
                    }
                    this.p = arrayList3;
                    ArrayList<TimeSpeedModelExtension> arrayList5 = multiEditVideoStatusRecordData.editCutSegments;
                    if (arrayList5 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList6 = this.F;
                        if (arrayList6 == null) {
                            h.f.b.l.b();
                        }
                        arrayList5 = new ArrayList<>(arrayList6);
                    }
                    this.G = arrayList5;
                    ArrayList<TimeSpeedModelExtension> arrayList7 = multiEditVideoStatusRecordData.singleRestoreSegments;
                    if (arrayList7 == null) {
                        ArrayList<TimeSpeedModelExtension> arrayList8 = this.F;
                        if (arrayList8 == null) {
                            h.f.b.l.b();
                        }
                        arrayList7 = new ArrayList<>(arrayList8);
                    }
                    this.H = arrayList7;
                    if (multiEditVideoStatusRecordData.segmentSizeChange) {
                        this.H = this.p;
                    }
                }
                MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
                h.f.b.l.b(multiEditVideoRecordData, "");
                this.f127939m = multiEditVideoRecordData;
                this.C = multiEditVideoStatusRecordData.recordMusic;
                this.D = multiEditVideoStatusRecordData.originalMusicStart;
                if (multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData == null) {
                    this.n = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
                    h.f.b.l.b(multiEditVideoRecordData2, "");
                    this.n = multiEditVideoRecordData2;
                }
                if (multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData == null) {
                    this.B = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoStatusRecordData.curMultiEditVideoRecordData, (MultiEditVideoRecordData) null);
                } else {
                    this.B = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
                }
                MultiEditVideoRecordData multiEditVideoRecordData3 = this.f127939m;
                if (multiEditVideoRecordData3 == null) {
                    h.f.b.l.a("curRecordData");
                }
                MultiEditVideoRecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData3, (MultiEditVideoRecordData) null);
                this.o = a2;
                if (a2 == null) {
                    h.f.b.l.a("originRecordData");
                }
                a2.resetTimeData();
                c cVar = this.t;
                MultiEditVideoRecordData multiEditVideoRecordData4 = this.f127939m;
                if (multiEditVideoRecordData4 == null) {
                    h.f.b.l.a("curRecordData");
                }
                cVar.a(multiEditVideoRecordData4);
                this.t.f127886g = multiEditVideoStatusRecordData.isMultiEditRetake;
                this.t.f127887h = multiEditVideoStatusRecordData.segmentSizeChange;
                this.t.f127888i = multiEditVideoStatusRecordData.currentEditIndex;
                m();
                i();
                k();
                l();
                if (multiEditVideoStatusRecordData.currentEditIndex >= 0 && !multiEditVideoStatusRecordData.segmentSizeChange) {
                    h hVar = this.f127934h;
                    if (this.f127931e == null) {
                        h.f.b.l.a("activity");
                    }
                    VideoEditViewModel videoEditViewModel = this.f127928b;
                    if (videoEditViewModel == null) {
                        h.f.b.l.a("videoEditViewModel");
                    }
                    hVar.a(videoEditViewModel.k().get(multiEditVideoStatusRecordData.currentEditIndex));
                    a(multiEditVideoStatusRecordData.currentEditIndex);
                }
                this.A = true;
            }
        }
    }

    public final void a(boolean z2) {
        boolean z3;
        if (this.A) {
            this.t.f127884e = z2;
            com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar = this.f127932f;
            if (aVar == null) {
                h.f.b.l.a("viewManager");
            }
            aVar.b(z2);
            j();
            if (z2) {
                if (this.t.f127885f) {
                    MultiEditVideoRecordData multiEditVideoRecordData = this.f127939m;
                    if (multiEditVideoRecordData == null) {
                        h.f.b.l.a("curRecordData");
                    }
                    this.J = multiEditVideoRecordData.segmentDataList.get(this.f127936j).rotate;
                    CutVideoSpeedViewModel cutVideoSpeedViewModel = this.v;
                    if (cutVideoSpeedViewModel == null) {
                        h.f.b.l.a("speedViewModel");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData2 = this.f127939m;
                    if (multiEditVideoRecordData2 == null) {
                        h.f.b.l.a("curRecordData");
                    }
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = multiEditVideoRecordData2.segmentDataList.get(this.f127936j);
                    h.f.b.l.b(multiEditVideoSegmentRecordData, "");
                    com.ss.android.ugc.aweme.tools.i a2 = com.ss.android.ugc.aweme.shortvideo.cut.m.a(multiEditVideoSegmentRecordData.getVideoSpeed());
                    h.f.b.l.b(a2, "");
                    cutVideoSpeedViewModel.a(a2);
                    CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.v;
                    if (cutVideoSpeedViewModel2 == null) {
                        h.f.b.l.a("speedViewModel");
                    }
                    cutVideoSpeedViewModel2.b(this.f127930d);
                    View view = this.y;
                    if (view == null) {
                        h.f.b.l.a("rootView");
                    }
                    view.postDelayed(new p(this), 10);
                } else if (this.t.f127886g) {
                    if (!this.t.f127887h) {
                        this.r = 2;
                        com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar2 = this.f127932f;
                        if (aVar2 == null) {
                            h.f.b.l.a("viewManager");
                        }
                        aVar2.g();
                    }
                    this.f127933g.c();
                } else {
                    d dVar = this.f127933g;
                    MultiEditVideoRecordData multiEditVideoRecordData3 = this.f127939m;
                    if (multiEditVideoRecordData3 == null) {
                        h.f.b.l.a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData4 = this.f127939m;
                    if (multiEditVideoRecordData4 == null) {
                        h.f.b.l.a("curRecordData");
                    }
                    dVar.a(multiEditVideoRecordData3, multiEditVideoRecordData4);
                }
                if (!this.t.f127886g) {
                    MultiEditVideoRecordData multiEditVideoRecordData5 = this.f127939m;
                    if (multiEditVideoRecordData5 == null) {
                        h.f.b.l.a("curRecordData");
                    }
                    MultiEditVideoRecordData multiEditVideoRecordData6 = this.n;
                    if (multiEditVideoRecordData6 == null) {
                        h.f.b.l.a("restoreRecordData");
                    }
                    com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a(multiEditVideoRecordData5, multiEditVideoRecordData6);
                }
                com.ss.android.ugc.tools.view.a.c cVar = this.L;
                if (cVar != null) {
                    cVar.b(this.M);
                }
                this.f127933g.f127892b = this.N;
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.a aVar3 = this.f127932f;
                if (aVar3 == null) {
                    h.f.b.l.a("viewManager");
                }
                aVar3.a(true);
                this.K = false;
                VEVideoCutterViewModel vEVideoCutterViewModel = this.f127929c;
                if (vEVideoCutterViewModel == null) {
                    h.f.b.l.a("veVideoCutterViewModel");
                }
                vEVideoCutterViewModel.a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                MultiEditViewModel multiEditViewModel = this.x;
                if (multiEditViewModel == null) {
                    h.f.b.l.a("multiEditViewModel");
                }
                multiEditViewModel.b(true);
            } else {
                com.ss.android.ugc.tools.view.a.c cVar2 = this.L;
                if (cVar2 != null) {
                    cVar2.c(this.M);
                }
                this.f127935i.a();
                MultiEditViewModel multiEditViewModel2 = this.x;
                if (multiEditViewModel2 == null) {
                    h.f.b.l.a("multiEditViewModel");
                }
                multiEditViewModel2.b(false);
                CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.v;
                if (cutVideoSpeedViewModel3 == null) {
                    h.f.b.l.a("speedViewModel");
                }
                cutVideoSpeedViewModel3.b(false);
            }
            this.f127935i.f127900g = z2;
            if (!this.t.f127886g || this.t.f127887h) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.I = z3;
            z.a aVar4 = new z.a();
            aVar4.element = false;
            if (this.I) {
                aVar4.element = true;
            }
            if (!this.t.f127886g) {
                aVar4.element = true;
            }
            View view2 = this.y;
            if (view2 == null) {
                h.f.b.l.a("rootView");
            }
            view2.postDelayed(new q(this, aVar4), 100);
            if (this.t.f127887h) {
                h();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0342, code lost:
        if (r9 <= ((java.lang.Number) r0).longValue()) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0344, code lost:
        r19 = r19 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03cd, code lost:
        if (r9 <= ((java.lang.Number) r0).longValue()) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0448, code lost:
        if (r5 <= ((java.lang.Number) r0).longValue()) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044a, code lost:
        r13 = r13 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04dd, code lost:
        if (r5 <= ((java.lang.Number) r0).longValue()) goto L_0x044a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0547  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
        // Method dump skipped, instructions count: 1624
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d.f.onClick(android.view.View):void");
    }

    static final class k implements com.ss.android.ugc.tools.view.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f127945a;

        static {
            Covode.recordClassIndex(83861);
        }

        k(f fVar) {
            this.f127945a = fVar;
        }

        @Override // com.ss.android.ugc.tools.view.a.a
        public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || !this.f127945a.t.f127884e) {
                return false;
            }
            if (this.f127945a.r == 1) {
                this.f127945a.e();
            } else {
                this.f127945a.f();
            }
            return true;
        }
    }

    public final void a(androidx.fragment.app.e eVar, View view) {
        h.f.b.l.d(eVar, "");
        h.f.b.l.d(view, "");
        this.f127931e = eVar;
        this.y = view;
        ac a2 = ae.a(eVar, (ad.b) null).a(VideoEditViewModel.class);
        h.f.b.l.b(a2, "");
        this.f127928b = (VideoEditViewModel) a2;
        ac a3 = ae.a(eVar, (ad.b) null).a(CutMultiVideoViewModel.class);
        h.f.b.l.b(a3, "");
        this.f127927a = (CutMultiVideoViewModel) a3;
        ac a4 = ae.a(eVar, (ad.b) null).a(VEVideoCutterViewModel.class);
        h.f.b.l.b(a4, "");
        this.f127929c = (VEVideoCutterViewModel) a4;
        JediViewModel a5 = t.a(eVar).a(CutVideoBottomBarViewModel.class);
        h.f.b.l.b(a5, "");
        this.w = (CutVideoBottomBarViewModel) a5;
        JediViewModel a6 = t.a(eVar).a(CutVideoSpeedViewModel.class);
        h.f.b.l.b(a6, "");
        this.v = (CutVideoSpeedViewModel) a6;
        JediViewModel a7 = t.a(eVar).a(MultiEditViewModel.class);
        h.f.b.l.b(a7, "");
        this.x = (MultiEditViewModel) a7;
        if (!(eVar instanceof com.ss.android.ugc.tools.view.a.c)) {
            eVar = null;
        }
        this.L = (com.ss.android.ugc.tools.view.a.c) eVar;
    }
}
