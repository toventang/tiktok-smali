package com.ss.android.ugc.aweme.shortvideo.cut;

import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.shortvideo.cut.i;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.b;
import com.ss.android.ugc.aweme.shortvideo.i.n;
import com.ss.android.ugc.aweme.tools.c.c;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.bg;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.x;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final a f126085a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private int f126086b;

    /* renamed from: c  reason: collision with root package name */
    private VideoSegment f126087c;

    /* renamed from: d  reason: collision with root package name */
    private final g f126088d;

    /* renamed from: e  reason: collision with root package name */
    private bg f126089e;

    static {
        Covode.recordClassIndex(82804);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(boolean z, p<Long, Long> pVar) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void b(int i2, int i3) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82805);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(ROTATE_DEGREE rotate_degree) {
            if (rotate_degree == null) {
                return 0;
            }
            int i2 = w.f126292a[rotate_degree.ordinal()];
            if (i2 == 1) {
                return 90;
            }
            if (i2 == 2) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (i2 != 3) {
                return 0;
            }
            return 270;
        }

        public static ROTATE_DEGREE a(int i2) {
            if (i2 == 90) {
                return ROTATE_DEGREE.ROTATE_90;
            }
            if (i2 == 180) {
                return ROTATE_DEGREE.ROTATE_180;
            }
            if (i2 != 270) {
                return ROTATE_DEGREE.ROTATE_NONE;
            }
            return ROTATE_DEGREE.ROTATE_270;
        }

        public static VEVideoEncodeSettings a(e eVar) {
            l.d(eVar, "");
            VEVideoEncodeSettings.a e2 = new VEVideoEncodeSettings.a(2).b(eVar.f125458g).a(eVar.f125459h).a(eVar.f125460i).a(eVar.f125455d, eVar.f125456e).c(eVar.f125462k).f(eVar.f125463l).a(eVar.f125461j).a(VEVideoEncodeSettings.COMPILE_TYPE.COMPILE_TYPE_MP4).a(eVar.f125457f).e(eVar.f125464m);
            if (eVar.n.length() > 0) {
                e2.a(eVar.n);
            }
            VEVideoEncodeSettings d2 = e2.d();
            l.b(d2, "");
            return d2;
        }

        public static void a(List<? extends EditVideoSegment> list, g gVar) {
            l.d(list, "");
            l.d(gVar, "");
            if ((!list.isEmpty()) && list != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                for (T t : list) {
                    String a2 = n.a.a(t.getVideoPath());
                    arrayList2.add(Integer.valueOf((int) t.getVideoFileInfo().getDuration()));
                    arrayList.add(t.getVideoPath());
                    arrayList3.add(Integer.valueOf(t.getVideoFileInfo().getWidth()));
                    arrayList4.add(Integer.valueOf(t.getVideoFileInfo().getHeight()));
                    arrayList5.add(a2);
                }
                String a3 = n.a(false, true, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, null);
                l.b(a3, "");
                gVar.a("description", a3);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final boolean a(int i2, float f2) {
        return this.f126088d.a(i2, a.a((int) f2)) == 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            c.b(this.f126089e, list);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, int i3) {
        this.f126088d.e(i2, i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void c(int i2, int i3) {
        this.f126088d.b(i2, i3);
    }

    public v(g gVar, bg bgVar) {
        l.d(gVar, "");
        l.d(bgVar, "");
        this.f126088d = gVar;
        this.f126089e = bgVar;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void b(int i2, float f2) {
        this.f126089e.f151092i[i2] = (double) f2;
        this.f126088d.a(this.f126089e);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list, boolean z) {
        c.a(this.f126089e, list);
        this.f126088d.a(this.f126089e);
        this.f126088d.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
        i.a.a(this, 0.0f, 0.0f, 0.0f, 30);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, VideoSegment videoSegment) {
        l.d(videoSegment, "");
        this.f126087c = videoSegment;
        this.f126086b = i2;
        int i3 = videoSegment.f125486j;
        videoSegment.f125486j = 0;
        c.a(this.f126089e, i2, videoSegment);
        this.f126088d.a(this.f126089e, (int) videoSegment.d(), (int) videoSegment.e());
        videoSegment.f125486j = i3;
        i.a.a(this, (float) videoSegment.f125486j, videoSegment.f125487k, videoSegment.f125488l, 24);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(e eVar, VEListener.q qVar) {
        l.d(eVar, "");
        l.d(qVar, "");
        VEVideoEncodeSettings a2 = a.a(eVar);
        List<VideoSegment> list = eVar.f125452a;
        ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((VideoSegment) it.next()));
        }
        a.a(arrayList, this.f126088d);
        this.f126088d.a(eVar.f125453b.toString(), eVar.f125454c, a2, qVar);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(int i2, int i3, List<? extends VideoSegment> list) {
        List<? extends VideoSegment> list2;
        l.d(list, "");
        int size = list.size();
        String[] strArr = new String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        int[] iArr3 = new int[size];
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        int i4 = 0;
        if (list2 != null) {
            int i5 = 0;
            for (T t : list2) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    h.a.n.a();
                }
                T t2 = t;
                strArr[i5] = t2.a(false).toString();
                iArr[i5] = (int) t2.d();
                iArr2[i5] = (int) t2.e();
                fArr[i5] = t2.f();
                iArr3[i5] = t2.f125486j;
                i5 = i6;
            }
        }
        bg bgVar = new bg(strArr);
        c.a(bgVar, list, iArr, iArr2, fArr, iArr3);
        this.f126089e = bgVar;
        for (T t3 : list) {
            int i7 = i4 + 1;
            if (i4 < 0) {
                h.a.n.a();
            }
            this.f126089e.f151085b[i4] = t3.f125477a;
            i4 = i7;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(boolean z, boolean z2, List<? extends VideoSegment> list) {
        VideoSegment videoSegment = this.f126087c;
        if (videoSegment != null) {
            bg bgVar = this.f126089e;
            int i2 = this.f126086b;
            l.d(bgVar, "");
            l.d(videoSegment, "");
            bgVar.f151092i[i2] = (double) videoSegment.f();
            bgVar.f151088e[i2] = (int) videoSegment.d();
            bgVar.f151089f[i2] = (int) videoSegment.e();
            bgVar.f151094k[i2] = a.a(videoSegment.f125486j);
            if (list != null) {
                int i3 = 0;
                for (T t : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        h.a.n.a();
                    }
                    bgVar.f151093j[i3] = !t.f125485i;
                    i3 = i4;
                }
            }
            this.f126088d.a(this.f126089e);
            i.a.a(this, 0.0f, 0.0f, 0.0f, 30);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final void a(List<? extends VideoSegment> list, int i2, long j2, long j3) {
        if (!(list == null || list.isEmpty())) {
            int size = list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>(size);
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>(size);
            for (T t : list) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = t.a(false).toString();
                vEClipSourceParam.clipWidth = t.f125482f;
                vEClipSourceParam.clipHeight = t.f125483g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) com.ss.android.ugc.aweme.tools.i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) t.f125478b;
                arrayList2.add(vEClipTimelineParam);
            }
            this.f126088d.a(i2 - list.size(), arrayList, arrayList2);
            this.f126088d.b((int) j2, (int) j3);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.i
    public final boolean a(float f2, float f3, float f4, int i2, int i3) {
        this.f126088d.a(f3, f4, f2, i2, i3);
        return true;
    }
}
