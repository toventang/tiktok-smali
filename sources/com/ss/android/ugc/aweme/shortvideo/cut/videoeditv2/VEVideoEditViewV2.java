package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.core.content.b;
import androidx.core.g.e;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.d;
import com.ss.android.ugc.aweme.shortvideo.cut.p;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.tools.c;
import com.ss.android.ugc.tools.view.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VEVideoEditViewV2 extends l {
    private long N;
    private long O;
    private boolean P;
    private Map<String, Boolean> Q;

    static {
        Covode.recordClassIndex(82870);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void f() {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean g() {
        return false;
    }

    public void setCanEdit(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public int getEditState() {
        return this.u;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getLeftSeekingValue() {
        return this.A;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMultiSeekTime() {
        return this.A;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getRightSeekingValue() {
        return this.B;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getSingleSeekTime() {
        return this.A;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(List<VideoSegment> list) {
        this.u = 1;
        this.n.c(list);
        this.f126277k = di.a();
        this.z = b.a(this.n.k(), this.n.l());
        this.C = b(Math.min(this.z, p.a()));
        this.q.f126236b = this.C;
        b bVar = this.q;
        long j2 = this.z;
        this.n.l();
        bVar.b(j2);
        this.A = 0;
        this.B = this.A + this.C;
        this.f126273g.setVisibility(8);
        this.f126272f.setVisibility(0);
        this.f126272f.b(0);
        c cVar = this.r;
        float f2 = this.q.f126235a;
        l.d(list, "");
        if (!h.a(list)) {
            cVar.f126242c.addAll(list);
            cVar.b(f2, 0.0f);
        }
        this.n.a(0.0f);
        if (this.J.booleanValue()) {
            this.O = 0;
            this.N = 0;
        }
        n();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(e<Float, Float> eVar, List<VideoSegment> list) {
        if (list != null) {
            this.n.b(list);
        }
        if (!this.J.booleanValue()) {
            long j2 = 0;
            this.O = (eVar == null || eVar.f2397a == null) ? 0 : eVar.f2397a.longValue();
            if (!(eVar == null || eVar.f2398b == null)) {
                j2 = eVar.f2398b.longValue();
            }
            this.N = j2;
        }
        e();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(boolean z) {
        if (this.J.booleanValue() != z) {
            if (!this.J.booleanValue()) {
                this.N = this.C;
                this.O = this.A;
                if (getRecyclerView().O) {
                    o();
                }
            }
            this.J = Boolean.valueOf(z);
            if (z) {
                r();
            } else {
                s();
            }
            setFocusOnMode(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a(e<Float, Float> eVar, boolean z) {
        if (!z && eVar.f2397a != null && eVar.f2398b != null && !h.a(this.n.k())) {
            this.u = 2;
            VideoSegment videoSegment = this.n.k().get(0);
            if (this.w == null) {
                this.w = new d(videoSegment);
            } else {
                this.w.a(videoSegment);
            }
            this.A = (long) (eVar.f2397a.floatValue() / videoSegment.f());
            this.B = (long) (eVar.f2398b.floatValue() / videoSegment.f());
            this.z = (long) (((float) videoSegment.f125478b) / videoSegment.f());
            this.C = this.B - this.A;
            this.q.f126236b = this.C;
            this.q.a(videoSegment.f125478b, videoSegment.f());
            b();
            this.f126272f.setVisibility(8);
            this.f126273g.setVisibility(0);
            this.f126273g.b(0);
            this.s.a(this.q.f126235a, videoSegment);
            l();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(VideoSegment videoSegment) {
        a(videoSegment, false);
        this.u = 1;
        this.n.a(1);
        this.n.b(videoSegment.a(true));
        this.f126277k = di.a();
        this.z = b.a(this.n.k(), this.n.l());
        this.C = b(Math.min(this.z, p.a()));
        this.q.f126236b = this.C;
        b bVar = this.q;
        long j2 = this.z;
        this.n.l();
        bVar.b(j2);
        q();
        a(0, this.C, this.z);
        this.f126272f.b(0);
        c cVar = this.r;
        float f2 = this.q.f126235a;
        l.d(videoSegment, "");
        if (!h.a(cVar.f126242c)) {
            cVar.f126242c.remove(videoSegment);
            cVar.b(f2, 0.0f);
        }
        this.n.a(videoSegment);
        if (this.w != null) {
            this.w.a();
        }
        n();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final boolean d() {
        return this.J.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMultiPlayingPosition() {
        return getPlayingPosition();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getSinglePlayingPosition() {
        return getPlayingPosition();
    }

    private Map<String, Boolean> getSingleEditFirstMap() {
        if (this.Q == null) {
            this.Q = new HashMap(8);
        }
        return this.Q;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public int getCurrentRotate() {
        if (this.u == 2 || this.u == 0) {
            return this.w.f125505c;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public e<Long, Long> getPlayBoundary() {
        if (this.u == 1) {
            return getMultiVideoPlayDur();
        }
        return getSingleVideoPlayDur();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public float getCurrentSpeed() {
        if (this.u == 2 || this.u == 0) {
            return this.w.f125506d;
        }
        return this.n.l();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getMaxCutDuration() {
        if (this.u == 1) {
            return c(this.f126278l);
        }
        return (long) (((float) this.f126278l) * this.w.f125506d);
    }

    public e<Long, Long> getMultiVideoPlayDur() {
        return e.a(Long.valueOf(c(this.A)), Long.valueOf(c(this.B)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public long getPlayingPosition() {
        return (long) ((((this.f126271e.getStartX() - this.f126270d.getStartX()) - ((float) d.f126258c)) * this.q.f126235a) + ((float) this.A));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public float getSelectedTime() {
        long j2 = this.C;
        if (this.C > this.f126278l) {
            j2 = this.f126278l;
        }
        return ((float) j2) / 1000.0f;
    }

    public e<Long, Long> getSingleVideoPlayDur() {
        return e.a(Long.valueOf((long) (((float) this.A) * this.w.f125506d)), Long.valueOf((long) (((float) this.B) * this.w.f125506d)));
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public e<Float, Float> getSlideX() {
        return new e<>(Float.valueOf(this.f126270d.getStartX()), Float.valueOf(this.f126269c.getStartX()));
    }

    private void q() {
        int i2 = 0;
        setEditViewHeight(false);
        this.f126273g.setVisibility(8);
        if (this.J.booleanValue()) {
            AutoPollRecyclerView autoPollRecyclerView = this.f126272f;
            if (!this.P) {
                i2 = 8;
            }
            autoPollRecyclerView.setVisibility(i2);
            return;
        }
        this.f126272f.setVisibility(0);
    }

    private void r() {
        this.f126270d.setOnTouchListener(null);
        this.f126269c.setOnTouchListener(null);
        this.f126271e.setOnTouchListener(this);
        this.p = false;
        this.f126270d.setImageDrawable(a((Boolean) true));
        this.f126269c.setImageDrawable(a((Boolean) false));
        n();
    }

    private void s() {
        this.f126270d.setImageResource(2131235000);
        this.f126269c.setImageResource(2131234999);
        this.f126270d.setOnTouchListener(this);
        this.f126270d.setTag("startSlide");
        this.f126269c.setOnTouchListener(this);
        this.f126269c.setTag("endSlide");
        this.f126271e.setOnTouchListener(this);
        this.f126271e.setTag("curPoint");
        this.p = true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        if (this.w != null) {
            this.w.f125505c += 90;
            if (this.w.f125505c >= 360) {
                this.w.f125505c = 0;
            }
            if (this.u == 0) {
                this.n.a(this.w, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l
    public final void h() {
        super.h();
        this.o.f125328c.observe(this.f126279m, new e(this));
        this.o.f125329d.observe(this.f126279m, new f(this));
        this.o.f125330e.observe(this.f126279m, new g(this));
        this.o.f125331f.observe(this.f126279m, new h(this));
        this.o.f125332g.observe(this.f126279m, new i(this));
        this.o.f125333h.observe(this.f126279m, new j(this));
        this.o.f125334i.observe(this.f126279m, new k(this));
        this.O = this.A;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j() {
        this.u = 1;
        this.n.a(1);
        this.f126277k = di.a();
        this.z = b.a(this.n.k(), this.n.l());
        a(this.D, this.E, this.z);
        this.q.f126236b = this.C;
        b bVar = this.q;
        long j2 = this.z;
        this.n.l();
        bVar.b(j2);
        q();
        this.n.h();
        if (this.w != null) {
            this.w.a();
        }
        n();
        this.L.c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void c() {
        this.C = b(Math.min(this.z, p.a()));
        this.q.f126236b = this.C;
        this.A = 0;
        this.B = this.A + this.C;
        if (this.J.booleanValue()) {
            this.O = 0;
            this.N = 0;
        }
        b bVar = this.q;
        long j2 = this.z;
        this.n.l();
        bVar.b(j2);
        this.f126272f.b(0);
        this.n.a(this.t);
        ArrayList arrayList = new ArrayList();
        for (VideoSegment videoSegment : this.n.k()) {
            if (!videoSegment.f125485i) {
                arrayList.add(videoSegment);
            }
        }
        this.r.a(arrayList, this.q.f126235a);
        o();
        n();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i() {
        a(this.n.k().get(this.v), true);
        this.u = 1;
        this.n.a(1);
        this.w.f125503a = (long) (((float) this.A) * this.w.f125506d);
        this.w.f125504b = (long) (((float) this.B) * this.w.f125506d);
        this.n.a(this.w, this.v);
        this.f126277k = di.a();
        this.z = b.a(this.n.k(), this.n.l());
        this.C = b(Math.min(this.z, p.a()));
        this.q.f126236b = this.C;
        this.A = 0;
        this.B = this.C;
        b bVar = this.q;
        long j2 = this.z;
        this.n.l();
        bVar.b(j2);
        q();
        this.f126272f.b(0);
        this.r.b(this.q.f126235a, 0.0f);
        this.n.i();
        if (this.w != null) {
            this.w.a();
        }
        n();
        this.L.c();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void a() {
        if (this.n != null) {
            if (this.u == 0) {
                if (this.s != null) {
                    this.s.a(this.n.k());
                }
            } else if (this.r != null) {
                this.r.a(this.n.k());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public final void e() {
        int i2;
        if (this.J.booleanValue()) {
            AutoPollRecyclerView autoPollRecyclerView = this.f126272f;
            if (this.P) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            autoPollRecyclerView.setVisibility(i2);
            this.z = b.a(this.n.k(), this.n.l());
            this.C = b(Math.min(this.z, p.a()));
            this.A = 0;
            this.B = this.C;
            this.f126273g.setVisibility(8);
            this.q.f126236b = this.C;
            b bVar = this.q;
            long j2 = this.z;
            this.n.l();
            bVar.b(j2);
        } else {
            if (this.u != 1) {
                VideoSegment videoSegment = this.n.k().get(0);
                this.w = new d(videoSegment);
                this.z = (long) (((float) videoSegment.f125478b) / videoSegment.f());
            } else {
                this.z = b.a(this.n.k(), this.n.l());
            }
            this.A = this.O;
            long j3 = this.N;
            if (j3 == 0) {
                this.C = b(Math.min(this.z, p.a()));
            } else {
                this.C = j3;
            }
            this.B = this.A + this.C;
            this.q.f126236b = this.C;
            if (this.u == 1) {
                this.f126273g.setVisibility(8);
                this.f126272f.setVisibility(0);
                b bVar2 = this.q;
                long j4 = this.z;
                this.n.l();
                bVar2.b(j4);
            } else {
                this.f126273g.setVisibility(0);
                this.f126272f.setVisibility(8);
                this.q.a(this.n.k().get(0).f125478b, this.w.f125506d);
            }
        }
        this.f126270d.setStartX((float) this.y);
        this.f126269c.setStartX((float) ((this.f126275i - this.y) - d.f126258c));
        a(this.f126270d.getStartX() + ((float) d.f126258c), false);
        a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
        if (this.u == 1) {
            ArrayList arrayList = new ArrayList();
            for (VideoSegment videoSegment2 : this.n.k()) {
                if (!videoSegment2.f125485i) {
                    arrayList.add(videoSegment2);
                }
            }
            this.r.a(arrayList, this.q.f126235a);
        } else {
            this.s.a(this.q.f126235a, this.w.f125506d);
        }
        l();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setExtractFramesInRoughMode(boolean z) {
        this.F = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setLoadThumbnailDirectly(boolean z) {
        this.x = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMaxVideoLength(long j2) {
        this.f126278l = j2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMinVideoLength(long j2) {
        this.f126277k = j2;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setMultiEditEnableForStickPointMode(boolean z) {
        this.P = z;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setDefaultMode(boolean z) {
        this.J = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoedit.h
    public void setCurrentRotate(int i2) {
        if (this.u == 2 || this.u == 0) {
            this.w.f125505c = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.l, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a
    public void setEditViewHeight(boolean z) {
        super.setEditViewHeight(z);
        if (this.J.booleanValue()) {
            r();
        } else {
            s();
        }
    }

    private long c(long j2) {
        long j3 = 0;
        if (this.n.k() != null && !this.n.k().isEmpty()) {
            for (VideoSegment videoSegment : this.n.k()) {
                if (!videoSegment.f125485i) {
                    float e2 = ((float) (videoSegment.e() - videoSegment.d())) / videoSegment.f();
                    float f2 = (float) j2;
                    if (f2 < e2) {
                        return (long) (((float) j3) + (f2 * videoSegment.f()));
                    }
                    j3 += videoSegment.e() - videoSegment.d();
                    j2 = (long) (f2 - e2);
                }
            }
        }
        return j3;
    }

    private Drawable a(Boolean bool) {
        int c2 = b.c(this.f126279m, R.color.bh);
        float b2 = com.ss.android.ttve.utils.b.b(this.f126279m, 2.0f);
        boolean booleanValue = bool.booleanValue();
        if (getLayoutDirection() != 0 && c.a(this.f126279m)) {
            booleanValue = !booleanValue;
        }
        if (booleanValue) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{a.a(c2, c2, new float[]{b2, b2, 0.0f, 0.0f, 0.0f, 0.0f, b2, b2})});
            layerDrawable.setLayerInset(0, (int) this.f126276j, 0, 0, 0);
            return layerDrawable;
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{a.a(c2, c2, new float[]{0.0f, 0.0f, b2, b2, b2, b2, 0.0f, 0.0f})});
        layerDrawable2.setLayerInset(0, 0, 0, (int) this.f126276j, 0);
        return layerDrawable2;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(float f2) {
        int i2 = this.u;
        if (i2 == 0) {
            a(0, f2);
            b();
        } else if (i2 == 1) {
            this.n.c(f2);
            b bVar = this.q;
            long j2 = this.z;
            this.n.l();
            bVar.b(j2);
            this.r.b(this.q.f126235a, 0.0f);
            this.f126272f.b(0);
        } else if (i2 == 2) {
            a(this.v, f2);
        }
        n();
        this.n.b(f2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(long j2) {
        if (!this.G && !this.H && j2 != -1 && j2 != 1) {
            a(this.f126270d.getStartX() + ((float) d.f126258c) + (((float) (j2 - this.A)) / this.q.f126235a), false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(e eVar) {
        this.u = 2;
        this.n.a(2);
        this.v = eVar.f2398b.intValue();
        this.f126277k = 500;
        VideoSegment videoSegment = this.n.k().get(this.v);
        if (this.w == null) {
            this.w = new d(videoSegment);
        } else {
            this.w.a(videoSegment);
        }
        this.D = this.A;
        this.E = this.B;
        this.z = (long) (((float) videoSegment.f125478b) / videoSegment.f());
        setEditViewHeight(true);
        if (this.J.booleanValue()) {
            this.I = videoSegment.e() - videoSegment.d();
            this.C = videoSegment.e() - videoSegment.d();
            if (this.C < 1000) {
                this.C = 1000;
            }
            this.f126270d.setStartX((float) this.y);
            this.f126269c.setStartX((float) ((this.f126275i - this.y) - d.f126258c));
            a((int) this.f126270d.getStartX(), (int) this.f126269c.getStartX());
            this.q.f126236b = this.C;
            this.q.a(videoSegment.f125478b, videoSegment.f());
            this.A = (long) (((float) videoSegment.d()) / videoSegment.f());
            this.B = this.A + this.C;
        } else {
            VideoSegment videoSegment2 = this.n.k().get(this.v);
            long e2 = (long) (((float) (videoSegment2.e() - videoSegment2.d())) / videoSegment2.f());
            Boolean bool = getSingleEditFirstMap().get(videoSegment2.a(false).toString());
            if (bool == null || !bool.booleanValue()) {
                e2 = Math.min(e2, p.a());
            }
            this.C = b(e2);
            this.q.f126236b = this.C;
            this.q.a(videoSegment.f125478b, videoSegment.f());
            this.A = (long) (((float) videoSegment.d()) / videoSegment.f());
            this.B = this.A + this.C;
        }
        b();
        this.f126272f.setVisibility(8);
        this.f126273g.setVisibility(0);
        this.f126273g.b(0);
        this.s.a(this.q.f126235a, videoSegment);
        l();
        this.n.a(eVar);
    }

    public VEVideoEditViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private void a(VideoSegment videoSegment, boolean z) {
        if (!this.J.booleanValue() && this.u == 2) {
            if (z) {
                getSingleEditFirstMap().put(videoSegment.a(false).toString(), true);
            } else {
                getSingleEditFirstMap().remove(videoSegment.a(false).toString());
            }
        }
    }

    private void a(int i2, float f2) {
        float f3 = this.w.f125506d;
        this.w.f125506d = f2;
        VideoSegment videoSegment = this.n.k().get(i2);
        this.z = (long) (((float) videoSegment.f125478b) / f2);
        this.C = b(Math.max((long) ((((float) this.C) * f3) / f2), this.f126277k));
        this.q.f126236b = this.C;
        this.q.a(videoSegment.f125478b, this.w.f125506d);
        this.s.b(this.q.f126235a, f2);
        m();
        this.A = (long) (((float) this.w.f125503a) / f2);
        this.B = this.A + this.C;
    }

    private VEVideoEditViewV2(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet);
    }
}
