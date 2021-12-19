package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.commentStickerPanel.itemview.CommentStickerView;
import com.ss.android.ugc.aweme.editSticker.interact.c;
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.effect.s;
import com.ss.android.ugc.aweme.ftc.components.corner.FTCEditCornerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.property.bt;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.cover.VEMultiEditVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class i implements d, com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b {
    public static int O = 1;
    public t<Bitmap> A;
    public t<Boolean> B;
    public int C;
    int D;
    public Rect E;
    public e F;
    public Runnable G = new Runnable() {
        /* class com.ss.android.ugc.aweme.ftc.components.sticker.info.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(62337);
        }

        public final void run() {
            if (i.this.r != null) {
                i.this.f98077l.f125327b.setValue(Long.valueOf((long) i.this.r.r((int) ((long) i.this.r.k()))));
                i.this.x.postDelayed(i.this.G, 30);
            }
        }
    };
    public b H;
    public a I;
    public c J;
    public Map<h, com.ss.android.ugc.aweme.sticker.data.e> K = new androidx.c.a();
    boolean L;
    boolean M;
    public com.ss.android.ugc.aweme.ftc.components.sticker.a.a N;
    FTCEditCornerViewModel P;
    com.ss.android.ugc.aweme.shortvideo.preview.a Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;

    /* renamed from: a  reason: collision with root package name */
    public boolean f98066a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f98067b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.fragment.app.e f98068c;

    /* renamed from: d  reason: collision with root package name */
    public FTCInfoStickerEditView f98069d;

    /* renamed from: e  reason: collision with root package name */
    public View f98070e;

    /* renamed from: f  reason: collision with root package name */
    View f98071f;

    /* renamed from: g  reason: collision with root package name */
    AVDmtTextView f98072g;

    /* renamed from: h  reason: collision with root package name */
    VideoEditView f98073h;

    /* renamed from: i  reason: collision with root package name */
    ImageView f98074i;

    /* renamed from: j  reason: collision with root package name */
    ImageView f98075j;

    /* renamed from: k  reason: collision with root package name */
    ImageView f98076k;

    /* renamed from: l  reason: collision with root package name */
    public CutMultiVideoViewModel f98077l;

    /* renamed from: m  reason: collision with root package name */
    public View f98078m;
    TextView n;
    TextView o;
    SeekBar p;
    ViewGroup q;
    public g r;
    public FTCInfoStickerViewModel s;
    public VideoPublishEditModel t;
    View u;
    boolean v;
    public List<MediaModel> w;
    public SafeHandler x;
    public com.ss.android.ugc.aweme.editSticker.interact.e y;
    FrameLayout z;

    public interface a {
        static {
            Covode.recordClassIndex(62341);
        }

        void a(boolean z);

        void b(boolean z);
    }

    public interface b {
        static {
            Covode.recordClassIndex(62342);
        }

        int a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, boolean z, boolean z2);

        PointF a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, float f2, float f3);

        Float a(float f2);

        void a(com.ss.android.ugc.aweme.ftc.components.sticker.a aVar, int i2, int i3, boolean z, boolean z2);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, h hVar) {
        boolean a2 = this.f98073h.a(i2, i3);
        if (a2 && hVar != null) {
            this.f98077l.f125327b.setValue(Long.valueOf((long) hVar.a(0)));
            this.s.a().setValue(dmt.av.video.t.b((long) hVar.a(0)));
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.graphics.RectF r11) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.i.a(android.graphics.RectF):boolean");
    }

    public final void f() {
        if (this.T) {
            e();
        }
    }

    static {
        Covode.recordClassIndex(62336);
    }

    private boolean k() {
        c cVar = this.J;
        if (cVar instanceof com.ss.android.ugc.aweme.ftc.components.sticker.a) {
            return true;
        }
        if ((cVar instanceof q) || (cVar instanceof CommentStickerView) || (cVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e)) {
            return false;
        }
        com.ss.android.ugc.aweme.port.in.g.a();
        return false;
    }

    private int l() {
        return ((dh.e(this.f98068c) - this.U) - dh.c(this.f98068c)) - dh.d(this.f98068c);
    }

    private int m() {
        return (dh.e(this.f98068c) - this.U) - dh.d(this.f98068c);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b
    public final boolean b() {
        t<Boolean> tVar = this.s.f98015d;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.L) {
            f();
            a(0, this.r.j());
            this.s.a().setValue(dmt.av.video.t.a((long) this.r.s(((Long) Objects.requireNonNull(this.f98073h.getPlayBoundary().f2397a)).intValue())));
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.L) {
            androidx.core.g.e<Long, Long> playBoundary = this.f98073h.getPlayBoundary();
            this.s.a().setValue(dmt.av.video.t.a((long) this.r.s(((Long) Objects.requireNonNull(playBoundary.f2397a)).intValue())));
            a(Math.max(playBoundary.f2397a.intValue() - 30, 0), Math.min(((Long) Objects.requireNonNull(playBoundary.f2398b)).intValue() + 150, this.r.j()));
        }
    }

    public final boolean h() {
        this.f98069d.D.b();
        FTCInfoStickerEditView fTCInfoStickerEditView = this.f98069d;
        if (fTCInfoStickerEditView == null || fTCInfoStickerEditView.f98000g == null || this.f98069d.f98000g.f98055a == null || this.f98069d.f98000g.f98055a.size() <= 0) {
            return false;
        }
        boolean z2 = false;
        for (com.ss.android.ugc.aweme.ftc.components.sticker.a aVar : this.f98069d.f98000g.f98055a) {
            if (aVar.f97895c) {
                aVar.f97895c = false;
                z2 = true;
            }
        }
        if (z2) {
            this.f98069d.A = false;
            this.f98069d.invalidate();
        }
        return z2;
    }

    private void i() {
        x.a aVar;
        p pVar;
        if (!this.S) {
            this.S = true;
            int j2 = this.r.j();
            this.f98077l = (CutMultiVideoViewModel) ae.a(this.f98068c, (ad.b) null).a(CutMultiVideoViewModel.class);
            this.f98073h.setCanEdit(false);
            this.f98073h.setMinVideoLength(1000);
            this.f98073h.setMaxVideoLength((long) j2);
            this.f98077l.f125336k = this.t.isMvThemeVideoType();
            this.f98077l.f125337l = j2;
            this.f98073h.setFirstFrameVisibleLiveData(this.B);
            this.f98073h.setFirstFrameBitmapLiveData(this.A);
            this.f98073h.setVeEditor(this.r);
            int frameWidth = this.f98073h.getFrameWidth();
            int frameHeight = this.f98073h.getFrameHeight();
            int ceil = (int) Math.ceil((double) (((float) (n.a(this.f98068c) - (this.f98073h.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
            if (bt.a()) {
                aVar = x.a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
            }
            if (this.t.isMultiVideoEdit()) {
                pVar = new p(new VEMultiEditVideoCoverGeneratorImpl(this.r, this.f98068c, ceil, this.r.j(), (int) this.t.getMultiEditVideoStartTime(), aVar), frameWidth, frameHeight, ceil);
            } else {
                pVar = new p(new VEVideoCoverGeneratorImpl(this.r, this.f98068c, ceil, aVar, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.f98073h.a(this.f98068c, this.f98077l, pVar, this.w);
            this.f98073h.setEnableBoundaryText(true);
            this.f98073h.setPointerType(2);
        }
    }

    private void j() {
        if (!this.v) {
            this.v = true;
            this.f98074i.setOnClickListener(new ag(this));
            this.f98075j.setOnClickListener(new l(this));
            this.f98076k.setOnClickListener(new m(this));
            i();
            VideoEditViewModel videoEditViewModel = this.f98073h.getVideoEditViewModel();
            videoEditViewModel.f126130c.observe(this.f98068c, new n(this));
            videoEditViewModel.f126133f.observe(this.f98068c, new o(this));
            videoEditViewModel.f126138k.observe(this.f98068c, new p(this));
            videoEditViewModel.f126136i.observe(this.f98068c, new q(this));
            videoEditViewModel.f126137j.observe(this.f98068c, new r(this));
            videoEditViewModel.f126134g.observe(this.f98068c, new s(this));
            videoEditViewModel.f126135h.observe(this.f98068c, new t(this));
            videoEditViewModel.f126132e.observe(this.f98068c, new u(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        boolean z2 = !this.T;
        this.T = z2;
        a(z2);
        g();
        a aVar = this.I;
        if (aVar != null) {
            aVar.b(this.T);
        }
        if (!this.T) {
            this.f98076k.setImageDrawable(this.f98068c.getResources().getDrawable(2131231566));
            this.s.a().setValue(dmt.av.video.t.a((long) this.r.k()));
            this.s.a().setValue(dmt.av.video.t.b());
            this.x.removeCallbacks(this.G);
            c cVar = this.J;
            if (cVar != null) {
                cVar.setAlpha(true);
            }
        } else {
            this.f98076k.setImageDrawable(this.f98068c.getResources().getDrawable(2131231565));
            this.x.post(this.G);
            this.s.a().setValue(dmt.av.video.t.a());
        }
        this.f98073h.c(true ^ this.T);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x007a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.ss.android.ugc.aweme.themechange.base.AVDmtTextView] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.sticker.info.i.g():void");
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b
    public final boolean a() {
        t<Boolean> tVar = this.s.f98014c;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    private void b(boolean z2) {
        FTCEditCornerViewModel fTCEditCornerViewModel = this.P;
        if (fTCEditCornerViewModel != null) {
            fTCEditCornerViewModel.a(z2);
        }
    }

    public i(com.ss.android.ugc.aweme.shortvideo.preview.a aVar) {
        this.Q = aVar;
    }

    public final void a(boolean z2) {
        this.f98069d.a(z2);
        if (this.J != null && k()) {
            this.J.setAlpha(true);
        }
    }

    private void a(h hVar) {
        this.p.setProgress((int) ((((float) (this.r.k() - hVar.a(0))) / ((float) (hVar.b(this.r.j()) - hVar.a(0)))) * 100.0f));
    }

    private void b(h hVar) {
        int d2 = hVar.d();
        int c2 = hVar.c(this.r.G());
        if (d2 >= 0 && c2 >= 0 && !a(d2, c2, hVar)) {
            this.x.postDelayed(new y(this, d2, c2, hVar), 300);
        }
        g();
    }

    private void a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
        try {
            com.ss.android.ugc.aweme.df.q.a("info_sticker_string_format_event", new ar().a("exception", m.c(formatFlagsConversionMismatchException)).a("event", "normal_str=" + str + ", error_str=" + this.f98072g.getContext().getResources().getString(R.string.cn9)).a());
        } catch (Exception e2) {
            bj.b(e2.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        g();
        if (this.J != null) {
            int s2 = this.r.s(i2);
            int s3 = this.r.s(i3);
            if (k()) {
                this.f98069d.a((com.ss.android.ugc.aweme.ftc.components.sticker.a) this.J, s2, s3);
                return;
            }
            c cVar = this.J;
            if (cVar instanceof q) {
                TextStickerData data = ((q) cVar).getData();
                if (data != null) {
                    data.setStartTime(s2);
                    data.setEndTime(s3);
                    data.setUiStartTime(i2);
                    data.setUiEndTime(i3);
                }
            } else if (cVar instanceof CommentStickerView) {
                CommentVideoModel data2 = ((CommentStickerView) cVar).getData();
                if (data2 != null) {
                    data2.setStartTime(s2);
                    data2.setEndTime(s3);
                }
            } else if (cVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) {
                ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) cVar).setStartTime(s2);
                ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) this.J).setEndTime(s3);
            }
        }
    }

    public final void a(h hVar, int i2) {
        if (hVar != this.J) {
            if (hVar != null) {
                if (!this.K.containsKey(hVar)) {
                    this.K.put(hVar, hVar.c());
                }
                hVar.setAlpha(true);
                if (hVar instanceof com.ss.android.ugc.aweme.ftc.components.sticker.a) {
                    this.x.post(new ac(this));
                }
                if (this.v && i2 == 0) {
                    b(hVar);
                }
                c cVar = this.J;
                if (cVar != null) {
                    if (i2 != 0) {
                        if (i2 == 1 && this.R) {
                            cVar.setAlpha(false);
                        }
                    } else if (this.v) {
                        cVar.setAlpha(false);
                    }
                    if (this.J instanceof com.ss.android.ugc.aweme.ftc.components.sticker.a) {
                        this.r.w();
                    }
                }
                if (i2 == 1) {
                    a(hVar);
                }
            } else {
                for (Map.Entry<h, com.ss.android.ugc.aweme.sticker.data.e> entry : this.K.entrySet()) {
                    h key = entry.getKey();
                    com.ss.android.ugc.aweme.sticker.data.e value = entry.getValue();
                    if (!(key == null || value == null)) {
                        key.a(value, this.f98069d.f97996c, this.f98069d.f97997d);
                    }
                }
                this.K.clear();
            }
            this.J = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, h hVar) {
        this.L = z2;
        b(!z2);
        j();
        a(!z2);
        a(hVar, 0);
        int height = this.f98071f.getHeight();
        this.U = height;
        if (height == 0) {
            this.U = (int) n.b(this.f98068c, 208.0f);
        }
        int b2 = this.U + ((int) n.b(this.f98068c, 16.0f));
        this.U = b2;
        View view = this.f98071f;
        s.a(view, z2, b2, view, new x(this, z2));
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(z2);
        }
        if (z2) {
            this.s.b().setValue(u.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), dh.c(this.f98068c), this.U, l(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
            ImageView imageView = this.f98076k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231566));
            this.f98076k.setEnabled(true);
            this.f98073h.setEnabled(true);
            this.f98073h.c(true);
            this.s.a().setValue(dmt.av.video.t.b(0));
            return;
        }
        this.f98076k.setEnabled(false);
        this.f98073h.setEnabled(false);
        this.x.removeCallbacks(this.G);
        this.s.a().setValue(dmt.av.video.t.b());
        this.s.b().setValue(u.b(this.f98069d.getResources().getColor(R.color.a2), dh.c(this.f98068c), this.U, l(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
        this.T = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, h hVar, boolean z3) {
        this.M = z2;
        b(!z2);
        if (!this.R) {
            this.R = true;
            this.o.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            this.n.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            this.n.setOnClickListener(new ae(this));
            this.o.setOnClickListener(new af(this));
            i();
            this.p.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                /* class com.ss.android.ugc.aweme.ftc.components.sticker.info.i.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(62339);
                }

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    long d2;
                    if (z) {
                        i iVar = i.this;
                        if (iVar.M && iVar.J != null && (iVar.J instanceof h)) {
                            int i3 = 0;
                            float a2 = ((float) ((h) iVar.J).a(0)) + (((float) ((((h) iVar.J).b(iVar.r.j()) - ((h) iVar.J).a(0)) * i2)) / 100.0f);
                            t<dmt.av.video.t> a3 = iVar.s.a();
                            List<VideoSegment> k2 = iVar.f98073h.getVideoEditViewModel().k();
                            float l2 = iVar.f98073h.getVideoEditViewModel().l();
                            ArrayList arrayList = new ArrayList();
                            for (int i4 = 0; i4 < k2.size(); i4++) {
                                if (!k2.get(i4).f125485i) {
                                    arrayList.add(k2.get(i4));
                                }
                            }
                            long j2 = 0;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList.size()) {
                                    break;
                                }
                                VideoSegment videoSegment = (VideoSegment) arrayList.get(i5);
                                j2 += videoSegment.f125478b;
                                if (a2 <= ((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * l2)) {
                                    i3 = i5;
                                    break;
                                } else {
                                    a2 -= ((float) (videoSegment.e() - videoSegment.d())) / (videoSegment.f() * l2);
                                    i5++;
                                }
                            }
                            if (i5 == arrayList.size()) {
                                d2 = (j2 - ((VideoSegment) arrayList.get(i3)).f125478b) + ((VideoSegment) arrayList.get(i3)).e();
                            } else {
                                d2 = (long) (((float) ((j2 - ((VideoSegment) arrayList.get(i3)).f125478b) + ((VideoSegment) arrayList.get(i3)).d())) + (a2 * ((VideoSegment) arrayList.get(i3)).f() * l2));
                            }
                            a3.setValue(dmt.av.video.t.a(d2));
                        }
                    }
                }
            });
        }
        a(!z2);
        a(hVar, 1);
        int height = this.f98078m.getHeight();
        this.U = height;
        if (height == 0) {
            this.U = (int) n.b(this.f98068c, 120.0f);
        }
        this.p.setProgress((int) ((((float) this.r.k()) * 100.0f) / ((float) this.r.j())));
        View view = this.f98078m;
        s.a(view, z2, this.U, view, new w(this, z2, z3));
        a aVar = this.I;
        if (aVar != null) {
            aVar.a(z2);
        }
        if (z2) {
            this.s.b().setValue(u.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), this.U, m(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), z3));
            ImageView imageView = this.f98076k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231566));
            this.f98076k.setEnabled(true);
            return;
        }
        this.f98076k.setEnabled(false);
        this.x.removeCallbacks(this.G);
        this.s.a().setValue(dmt.av.video.t.b());
        this.s.b().setValue(u.a(this.f98069d.getResources().getColor(R.color.a2), dh.c(this.f98068c), this.U, m(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), z3));
        this.T = false;
    }
}
