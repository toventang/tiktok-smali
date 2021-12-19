package com.ss.android.ugc.aweme.shortvideo.editcut;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.c;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.e;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.v;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.editcut.a.a;
import com.ss.android.ugc.aweme.shortvideo.editcut.a.b;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import h.a.n;
import h.c.b.a.k;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, String> f128270a;

    /* renamed from: b  reason: collision with root package name */
    final Map<String, String> f128271b;

    /* renamed from: c  reason: collision with root package name */
    private int f128272c;

    /* renamed from: d  reason: collision with root package name */
    private bg f128273d;

    /* renamed from: e  reason: collision with root package name */
    private c f128274e;

    /* renamed from: f  reason: collision with root package name */
    private bz f128275f;

    /* renamed from: g  reason: collision with root package name */
    private final g f128276g;

    /* renamed from: h  reason: collision with root package name */
    private final a f128277h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f128278i;

    static {
        Covode.recordClassIndex(84091);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(e eVar, VEListener.q qVar) {
        l.d(eVar, "");
        l.d(qVar, "");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final boolean a(int i2, float f2) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment;
        if (z2) {
            List<MultiEditVideoSegmentRecordData> list2 = a().segmentDataList;
            l.b(list2, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) n.b((List) list2, this.f128272c);
            if (multiEditVideoSegmentRecordData != null) {
                multiEditVideoSegmentRecordData.enable = false;
            }
        }
        if (!(!z || list == null || (videoSegment = (VideoSegment) n.b((List) list, this.f128272c)) == null)) {
            List<MultiEditVideoSegmentRecordData> list3 = a().segmentDataList;
            l.b(list3, "");
            MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) n.b((List) list3, this.f128272c);
            if (multiEditVideoSegmentRecordData2 != null) {
                com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(multiEditVideoSegmentRecordData2, videoSegment);
                multiEditVideoSegmentRecordData2.setVideoSpeed(videoSegment.f());
                multiEditVideoSegmentRecordData2.rotate = videoSegment.f125486j;
            }
        }
        i.a.a(this, false, null, 3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list, int i2, long j2, long j3) {
        if (!(list == null || list.isEmpty() || !b.a(this.f128277h))) {
            int size = list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>(size);
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>(size);
            for (T t : list) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = t.a(false);
                vEClipSourceParam.clipWidth = t.f125482f;
                vEClipSourceParam.clipHeight = t.f125483g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) t.f125478b;
                arrayList2.add(vEClipTimelineParam);
            }
            this.f128276g.a(i2 - list.size(), arrayList, arrayList2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final boolean a(float f2, float f3, float f4, int i2, int i3) {
        this.f128276g.a(f3, f4, f2, i2, i3);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list, boolean z) {
        i.a.a(this, false, null, 3);
    }

    public final void a(boolean r7, h.p<java.lang.Long, java.lang.Long> r8) {
        /*
        // Method dump skipped, instructions count: 208
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.d.a(boolean, h.p):void");
    }

    public final MultiEditVideoRecordData a() {
        MultiEditVideoRecordData multiEditVideoRecordData = this.f128277h.f128082d.curMultiEditVideoRecordData;
        l.b(multiEditVideoRecordData, "");
        return multiEditVideoRecordData;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1  reason: invalid class name */
    public static final class AnonymousClass1 extends k implements m<am, h.c.d<? super z>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(84092);
        }

        {
            this.this$0 = r2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            AnonymousClass1 r1 = new AnonymousClass1(this.this$0, dVar);
            r1.L$0 = obj;
            return r1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((AnonymousClass1) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a */
        public static final class a extends k implements m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ AnonymousClass1 this$0;

            static {
                Covode.recordClassIndex(84093);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(AnonymousClass1 r2, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = r2;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new a(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    List<MultiEditVideoSegmentRecordData> list = this.this$0.this$0.a().segmentDataList;
                    l.b(list, "");
                    int i2 = 0;
                    for (T t : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            n.a();
                        }
                        d dVar = this.this$0.this$0;
                        String str = t.audioPath;
                        l.b(str, "");
                        if (dVar.f128271b.get(str) == null) {
                            dVar.f128271b.put(str, dVar.a(1, i2, str));
                        }
                        i2 = i3;
                    }
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b */
        public static final class b extends k implements m<am, h.c.d<? super z>, Object> {
            int label;
            final /* synthetic */ AnonymousClass1 this$0;

            static {
                Covode.recordClassIndex(84094);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(AnonymousClass1 r2, h.c.d dVar) {
                super(2, dVar);
                this.this$0 = r2;
            }

            @Override // h.c.b.a.a
            public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
                l.d(dVar, "");
                return new b(this.this$0, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // h.f.a.m
            public final Object invoke(am amVar, h.c.d<? super z> dVar) {
                return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                if (this.label == 0) {
                    r.a(obj);
                    List<MultiEditVideoSegmentRecordData> list = this.this$0.this$0.a().segmentDataList;
                    l.b(list, "");
                    int i2 = 0;
                    for (T t : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            n.a();
                        }
                        d dVar = this.this$0.this$0;
                        String str = t.videoPath;
                        l.b(str, "");
                        if (dVar.f128270a.get(str) == null) {
                            dVar.f128270a.put(str, dVar.a(0, i2, str));
                        }
                        i2 = i3;
                    }
                    return z.f158842a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                h.c.a.a r7 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r8.label
                r6 = 2
                r5 = 1
                r4 = 0
                if (r0 == 0) goto L_0x0013
                if (r0 == r5) goto L_0x0038
                if (r0 != r6) goto L_0x004a
                h.r.a(r9)
            L_0x0010:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0013:
                h.r.a(r9)
                java.lang.Object r3 = r8.L$0
                kotlinx.coroutines.am r3 = (kotlinx.coroutines.am) r3
                com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.d$1$b
                r0.<init>(r8, r4)
                r1 = 3
                kotlinx.coroutines.av r2 = kotlinx.coroutines.g.a(r3, r4, r0, r1)
                com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a r0 = new com.ss.android.ugc.aweme.shortvideo.editcut.d$1$a
                r0.<init>(r8, r4)
                kotlinx.coroutines.av r1 = kotlinx.coroutines.g.a(r3, r4, r0, r1)
                r8.L$0 = r1
                r8.label = r5
                java.lang.Object r0 = r2.a(r8)
                if (r0 != r7) goto L_0x003f
                return r7
            L_0x0038:
                java.lang.Object r1 = r8.L$0
                kotlinx.coroutines.av r1 = (kotlinx.coroutines.av) r1
                h.r.a(r9)
            L_0x003f:
                r8.L$0 = r4
                r8.label = r6
                java.lang.Object r0 = r1.a(r8)
                if (r0 != r7) goto L_0x0010
                return r7
            L_0x004a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.editcut.d.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list) {
        if (list != null && b.a(this.f128277h)) {
            MultiEditVideoRecordData a2 = a();
            l.d(a2, "");
            l.d(list, "");
            if (!list.isEmpty()) {
                if (a2.segmentDataList == null) {
                    a2.segmentDataList = new ArrayList();
                }
                for (T t : list) {
                    List<MultiEditVideoSegmentRecordData> list2 = a2.segmentDataList;
                    l.d(t, "");
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = new MultiEditVideoSegmentRecordData();
                    multiEditVideoSegmentRecordData.videoPath = t.a(false);
                    multiEditVideoSegmentRecordData.width = t.f125482f;
                    multiEditVideoSegmentRecordData.height = t.f125483g;
                    multiEditVideoSegmentRecordData.setVideoSpeed(t.f());
                    multiEditVideoSegmentRecordData.rotate = t.f125486j;
                    multiEditVideoSegmentRecordData.videoLength = t.f125478b * 1000;
                    multiEditVideoSegmentRecordData.setStartTime(t.d());
                    multiEditVideoSegmentRecordData.setEndTime(t.e());
                    multiEditVideoSegmentRecordData.enable = !t.f125485i;
                    multiEditVideoSegmentRecordData.videoKey = t.f125477a;
                    list2.add(multiEditVideoSegmentRecordData);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void c(int i2, int i3) {
        this.f128276g.b(i2, i3);
    }

    private d(g gVar, a aVar) {
        l.d(gVar, "");
        l.d(aVar, "");
        this.f128276g = gVar;
        this.f128277h = aVar;
        this.f128278i = true;
        this.f128270a = new LinkedHashMap();
        this.f128271b = new LinkedHashMap();
        this.f128272c = -1;
        if (!b.a(aVar)) {
            this.f128275f = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new AnonymousClass1(this, null), 2);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, int i3) {
        this.f128276g.e(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void b(int i2, float f2) {
        if (b.a(this.f128277h)) {
            if (!this.f128277h.f128080b) {
                MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = a().segmentDataList.get(i2);
                l.b(multiEditVideoSegmentRecordData, "");
                multiEditVideoSegmentRecordData.setVideoSpeed(f2);
            }
            bg bgVar = this.f128273d;
            if (bgVar == null) {
                bgVar = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.b(a());
            }
            if (i2 >= 0 && i2 < bgVar.f151092i.length) {
                bgVar.f151092i[i2] = (double) f2;
            }
            this.f128276g.a(bgVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, VideoSegment videoSegment) {
        l.d(videoSegment, "");
        this.f128272c = i2;
        if (b.a(this.f128277h)) {
            bg b2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.b(a());
            com.ss.android.ugc.aweme.tools.c.c.a(b2, i2, videoSegment);
            this.f128273d = b2;
            g gVar = this.f128276g;
            if (b2 == null) {
                l.b();
            }
            gVar.a(b2, (int) videoSegment.d(), (int) videoSegment.e());
            return;
        }
        c a2 = a(a(), false, this.f128270a, this.f128271b, i2);
        l.d(a2, "");
        l.d(videoSegment, "");
        a2.f62000c[0] = 0;
        a2.f62001d[0] = (int) videoSegment.f125478b;
        int[] iArr = a2.f62005h;
        if (iArr != null) {
            iArr[0] = 0;
        }
        int[] iArr2 = a2.f62006i;
        if (iArr2 != null) {
            iArr2[0] = (int) videoSegment.f125478b;
        }
        ROTATE_DEGREE[] rotate_degreeArr = a2.f62008k;
        if (rotate_degreeArr != null) {
            rotate_degreeArr[0] = v.a.a(videoSegment.f125486j);
        }
        float[] fArr = a2.f62002e;
        if (fArr != null) {
            fArr[0] = videoSegment.f();
        }
        this.f128274e = a2;
        this.f128276g.a(a2);
        c((int) (((float) videoSegment.d()) * videoSegment.f()), (int) (((float) videoSegment.e()) * videoSegment.f()));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void b(int i2, int i3) {
        if (!this.f128277h.f128080b) {
            a().segmentDataList.get(i2).rotate = i3;
        }
        if (b.a(this.f128277h)) {
            bg bgVar = this.f128273d;
            if (bgVar == null) {
                bgVar = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.b(a());
            }
            if (i2 >= 0 && i2 < bgVar.f151094k.length) {
                bgVar.f151094k[i2] = v.a.a(i3);
            }
            this.f128276g.a(bgVar);
            return;
        }
        c cVar = this.f128274e;
        if (cVar == null) {
            cVar = a(a(), false, this.f128270a, this.f128271b, i2);
        }
        ROTATE_DEGREE[] rotate_degreeArr = cVar.f62008k;
        if (rotate_degreeArr != null) {
            rotate_degreeArr[0] = v.a.a(i3);
        }
        this.f128276g.a(cVar);
    }

    public /* synthetic */ d(g gVar, a aVar, byte b2) {
        this(gVar, aVar);
    }

    /* access modifiers changed from: package-private */
    public final String a(int i2, int i3, String str) {
        int i4;
        if (i2 == 0) {
            i4 = 0;
        } else {
            i4 = this.f128276g.a().f151435j;
        }
        String a2 = this.f128276g.a(i2, i4, i3, str);
        if (a2 == null) {
            return "";
        }
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, int i3, List<? extends VideoSegment> list) {
        l.d(list, "");
        if (b.a(this.f128277h)) {
            this.f128276g.e(i2, i3);
        } else {
            i.a.a(this, false, null, 3);
        }
    }

    /* access modifiers changed from: private */
    public static c a(MultiEditVideoRecordData multiEditVideoRecordData, boolean z, Map<String, String> map, Map<String, String> map2, int i2) {
        ArrayList arrayList;
        if (i2 < 0 || i2 >= multiEditVideoRecordData.segmentDataList.size()) {
            arrayList = multiEditVideoRecordData.segmentDataList;
            if (!z) {
                l.b(arrayList, "");
                ArrayList arrayList2 = new ArrayList();
                for (T t : arrayList) {
                    if (t.enable) {
                        arrayList2.add(t);
                    }
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = n.a(multiEditVideoRecordData.segmentDataList.get(i2));
        }
        int size = arrayList.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr2[i3] = "";
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        String[] strArr3 = new String[size];
        String[] strArr4 = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr4[i4] = "";
        }
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        l.b(arrayList, "");
        int i5 = 0;
        for (T t2 : arrayList) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                n.a();
            }
            T t3 = t2;
            strArr[i5] = t3.videoPath;
            String str = map.get(t3.videoPath);
            if (str == null) {
                str = "";
            }
            strArr2[i5] = str;
            l.b(t3, "");
            iArr[i5] = (int) t3.getStartTime();
            iArr2[i5] = (int) t3.getEndTime();
            fArr[i5] = t3.getVideoSpeed();
            strArr3[i5] = t3.audioPath;
            String str2 = map2.get(t3.audioPath);
            if (str2 == null) {
                str2 = "";
            }
            strArr4[i5] = str2;
            iArr3[i5] = (int) (((float) t3.getStartTime()) * t3.audioSpeed);
            iArr4[i5] = (int) (((float) t3.getEndTime()) * t3.audioSpeed);
            fArr2[i5] = t3.audioSpeed;
            rotate_degreeArr[i5] = v.a.a(t3.rotate);
            i5 = i6;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            String str3 = strArr3[i7];
            if (!(str3 == null || str3.length() == 0)) {
                arrayList3.add(str3);
            }
        }
        if (arrayList3.isEmpty()) {
            strArr3 = null;
            strArr4 = null;
        }
        return new c(strArr, strArr2, iArr, iArr2, fArr, strArr3, strArr4, iArr3, iArr4, fArr2, rotate_degreeArr);
    }
}
