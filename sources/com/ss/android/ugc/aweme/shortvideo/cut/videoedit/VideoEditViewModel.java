package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.g.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.tools.i;
import java.util.HashMap;
import java.util.List;

public class VideoEditViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public boolean f126128a;

    /* renamed from: b  reason: collision with root package name */
    public t<Integer> f126129b = new t<>();

    /* renamed from: c  reason: collision with root package name */
    public t<Boolean> f126130c = new t<>();

    /* renamed from: d  reason: collision with root package name */
    public t<Float> f126131d = new t<>();

    /* renamed from: e  reason: collision with root package name */
    public t<Long> f126132e = new t<>();

    /* renamed from: f  reason: collision with root package name */
    public t<Void> f126133f = new t<>();

    /* renamed from: g  reason: collision with root package name */
    public t<Void> f126134g = new t<>();

    /* renamed from: h  reason: collision with root package name */
    public t<Void> f126135h = new t<>();

    /* renamed from: i  reason: collision with root package name */
    public t<Void> f126136i = new t<>();

    /* renamed from: j  reason: collision with root package name */
    public t<Void> f126137j = new t<>();

    /* renamed from: k  reason: collision with root package name */
    public t<Void> f126138k = new t<>();

    /* renamed from: l  reason: collision with root package name */
    public t<Void> f126139l = new t<>();

    /* renamed from: m  reason: collision with root package name */
    public t<Void> f126140m = new t<>();
    public t<Float> n = new t<>();
    public t<e<Integer, Integer>> o = new t<>();
    public t<Void> p = new t<>();
    public t<Void> q = new t<>();
    public t<VideoSegment> r = new t<>();
    public t<Boolean> s = new t<>();
    public t<Void> t = new t<>();
    public t<Void> u = new t<>();
    public t<Void> v = new t<>();
    public t<CutVideoContext> w = new t<>();
    HashMap<String, Integer> x = new HashMap<>();
    public a y;
    private HashMap<String, Integer> z = new HashMap<>();

    public interface a {
        static {
            Covode.recordClassIndex(82822);
        }

        void a(VideoSegment videoSegment);

        void b(VideoSegment videoSegment);
    }

    static {
        Covode.recordClassIndex(82821);
    }

    public final void a(boolean z2) {
        this.f126130c.setValue(Boolean.valueOf(z2));
    }

    public final void a(List<MediaModel> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(i.a(list));
        cutVideoContext.totalSpeed = i.NORMAL.value();
        a(cutVideoContext);
    }

    public final void a(d dVar, int i2) {
        VideoSegment videoSegment = this.w.getValue().getVideoSegmentList().get(i2);
        videoSegment.a(dVar.f125506d);
        videoSegment.a(dVar.f125503a);
        videoSegment.b(dVar.f125504b);
        videoSegment.f125486j = dVar.f125505c;
        a aVar = this.y;
        if (aVar != null) {
            aVar.a(videoSegment);
        }
    }

    public final void b() {
        this.f126133f.setValue(null);
    }

    public final void c() {
        this.f126135h.setValue(null);
    }

    public final void d() {
        this.f126138k.setValue(null);
    }

    public final void e() {
        this.t.setValue(null);
    }

    public final void f() {
        this.f126139l.setValue(null);
    }

    public final void g() {
        this.f126140m.setValue(null);
    }

    public final void h() {
        this.p.setValue(null);
    }

    public final void i() {
        this.q.setValue(null);
    }

    public final void a() {
        this.f126134g.setValue(null);
    }

    public final List<VideoSegment> j() {
        return this.w.getValue().getVideoSegmentList();
    }

    public final List<VideoSegment> k() {
        return this.w.getValue().getVideoSegmentList();
    }

    public final float l() {
        return this.w.getValue().totalSpeed;
    }

    public final boolean m() {
        for (VideoSegment videoSegment : this.w.getValue().getVideoSegmentList()) {
            if (videoSegment.f() != i.NORMAL.value()) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        if (!(this.w.getValue() == null || this.w.getValue().getVideoSegmentList() == null || this.w.getValue().getVideoSegmentList().isEmpty())) {
            VideoSegment videoSegment = this.w.getValue().getVideoSegmentList().get(0);
            if (videoSegment.f125482f <= 0 || videoSegment.f125483g <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    private void a(CutVideoContext cutVideoContext) {
        this.w.setValue(cutVideoContext);
    }

    public final void b(float f2) {
        this.n.setValue(Float.valueOf(f2));
    }

    public final void c(float f2) {
        this.w.getValue().totalSpeed = f2;
    }

    public final void a(float f2) {
        this.f126131d.setValue(Float.valueOf(f2));
    }

    public final void b(List<VideoSegment> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(list);
        cutVideoContext.totalSpeed = i.NORMAL.value();
        a(cutVideoContext);
    }

    public final VideoSegment c(int i2) {
        return this.w.getValue().getVideoSegmentList().get(i2);
    }

    public final int a(String str) {
        int i2 = 0;
        for (VideoSegment videoSegment : this.w.getValue().getVideoSegmentList()) {
            if (videoSegment.a(true).equals(str)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final int b(int i2) {
        VideoSegment videoSegment = this.w.getValue().getVideoSegmentList().get(i2);
        if (this.z.containsKey(videoSegment.a(true))) {
            return this.z.get(videoSegment.a(true)).intValue();
        }
        return 0;
    }

    public final void c(List<VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            this.w.getValue().getVideoSegmentList().addAll(list);
            t<CutVideoContext> tVar = this.w;
            tVar.postValue(tVar.getValue());
        }
    }

    public final void a(int i2) {
        this.f126129b.setValue(Integer.valueOf(i2));
    }

    public final void b(String str) {
        for (VideoSegment videoSegment : this.w.getValue().getVideoSegmentList()) {
            if (videoSegment.a(true).equals(str)) {
                videoSegment.f125485i = true;
                return;
            }
        }
    }

    public final void a(long j2) {
        this.f126132e.setValue(Long.valueOf(j2));
    }

    public final void a(e<Integer, Integer> eVar) {
        this.o.setValue(eVar);
    }

    public final void a(VideoSegment videoSegment) {
        this.r.setValue(videoSegment);
    }

    public final void a(int i2, int i3) {
        this.z.put(this.w.getValue().getVideoSegmentList().get(i2).a(true), Integer.valueOf(i3));
    }
}
