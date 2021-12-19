package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
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
import com.ss.android.ugc.aweme.editSticker.interact.d;
import com.ss.android.ugc.aweme.editSticker.interact.h;
import com.ss.android.ugc.aweme.editSticker.interact.view.e;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.effect.s;
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
import com.ss.android.ugc.aweme.shortvideo.edit.bl;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.ss.android.ugc.gamora.editor.corner.EditCornerViewModel;
import com.ss.android.ugc.gamora.editor.progress.EditProgressViewModel;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.List;
import java.util.Map;

public final class i implements d, b {
    public FrameLayout A;
    public t<Bitmap> B;
    public t<Boolean> C;
    public int D;
    int E;
    public Rect F;
    public e G;
    public Runnable H = new Runnable() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83406);
        }

        public final void run() {
            if (i.this.s != null) {
                i.this.f127163l.f125327b.setValue(Long.valueOf((long) i.this.s.r((int) ((long) i.this.s.k()))));
                i.this.y.postDelayed(i.this.H, 30);
            }
        }
    };
    public c I;
    public a J;
    public com.ss.android.ugc.aweme.editSticker.interact.c K;
    public Map<h, com.ss.android.ugc.aweme.sticker.data.e> L = new androidx.c.a();
    boolean M;
    boolean N;
    public com.ss.android.ugc.aweme.shortvideo.edit.d.a O;
    public EditCornerViewModel P;
    public EditProgressViewModel Q;
    public com.ss.android.ugc.aweme.shortvideo.preview.a R;
    public boolean S;
    public com.ss.android.ugc.gamora.editor.progressbar.a T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private p Y;

    /* renamed from: a  reason: collision with root package name */
    public boolean f127152a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f127153b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.fragment.app.e f127154c;

    /* renamed from: d  reason: collision with root package name */
    public InfoStickerEditView f127155d;

    /* renamed from: e  reason: collision with root package name */
    public View f127156e;

    /* renamed from: f  reason: collision with root package name */
    public View f127157f;

    /* renamed from: g  reason: collision with root package name */
    public AVDmtTextView f127158g;

    /* renamed from: h  reason: collision with root package name */
    public VideoEditView f127159h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f127160i;

    /* renamed from: j  reason: collision with root package name */
    public ImageView f127161j;

    /* renamed from: k  reason: collision with root package name */
    public ImageView f127162k;

    /* renamed from: l  reason: collision with root package name */
    public CutMultiVideoViewModel f127163l;

    /* renamed from: m  reason: collision with root package name */
    public View f127164m;
    public TextView n;
    public TextView o;
    public SeekBar p;
    public ViewGroup q;
    public int r = 30;
    public g s;
    public InfoStickerViewModel t;
    public VideoPublishEditModel u;
    public View v;
    public boolean w;
    public List<MediaModel> x;
    public SafeHandler y;
    public com.ss.android.ugc.aweme.editSticker.interact.e z;

    public interface a {
        static {
            Covode.recordClassIndex(83410);
        }

        void a(boolean z);

        void b(boolean z);
    }

    public interface b {
        static {
            Covode.recordClassIndex(83411);
        }
    }

    public interface c {
        static {
            Covode.recordClassIndex(83412);
        }

        int a(aj ajVar, boolean z, boolean z2);

        PointF a(aj ajVar, float f2, float f3);

        Float a(float f2);

        void a(aj ajVar, int i2, int i3, boolean z, boolean z2);
    }

    static {
        Covode.recordClassIndex(83405);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b
    public final boolean a() {
        t<Boolean> tVar = this.t.f127091c;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    public final boolean a(int i2) {
        if (this.f127155d.getStickNumber() + i2 < this.r) {
            return false;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f127155d.getContext()).a(R.string.cn6).a();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, h hVar, boolean z3) {
        this.N = z2;
        b(!z2);
        if (!this.U) {
            this.U = true;
            this.o.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            this.n.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            this.n.setOnClickListener(new ae(this));
            this.o.setOnClickListener(new af(this));
            k();
            this.p.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                /* class com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(83408);
                }

                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                    long d2;
                    if (z) {
                        i iVar = i.this;
                        if (iVar.N && iVar.K != null && (iVar.K instanceof h)) {
                            int i3 = 0;
                            float a2 = ((float) ((h) iVar.K).a(0)) + (((float) ((((h) iVar.K).b(iVar.s.j()) - ((h) iVar.K).a(0)) * i2)) / 100.0f);
                            t<dmt.av.video.t> a3 = iVar.t.a();
                            List<VideoSegment> k2 = iVar.f127159h.getVideoEditViewModel().k();
                            float l2 = iVar.f127159h.getVideoEditViewModel().l();
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
        if (z2) {
            EditProgressViewModel editProgressViewModel = this.Q;
            if (editProgressViewModel != null) {
                editProgressViewModel.a(1003);
            }
        } else {
            com.ss.android.ugc.gamora.editor.progressbar.a aVar = this.T;
            if (aVar != null) {
                aVar.a(1, -1);
            }
        }
        a(hVar, 1);
        int height = this.f127164m.getHeight();
        this.X = height;
        if (height == 0) {
            this.X = (int) n.b(this.f127154c, 120.0f);
        }
        this.p.setProgress((int) ((((float) this.s.k()) * 100.0f) / ((float) this.s.j())));
        View view = this.f127164m;
        s.a(view, z2, this.X, view, new w(this, z2, z3));
        a aVar2 = this.J;
        if (aVar2 != null) {
            aVar2.a(z2);
        }
        if (z2) {
            this.t.b().setValue(u.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), this.X, n(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), z3));
            ImageView imageView = this.f127162k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231566));
            this.f127162k.setEnabled(true);
            return;
        }
        this.f127162k.setEnabled(false);
        this.y.removeCallbacks(this.H);
        this.t.a().setValue(dmt.av.video.t.b());
        this.t.b().setValue(u.a(this.f127155d.getResources().getColor(R.color.a2), dh.c(this.f127154c), this.X, n(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), z3));
        this.W = false;
    }

    public final void a(boolean z2, h hVar) {
        EditProgressViewModel editProgressViewModel;
        this.M = z2;
        if (z2 && (editProgressViewModel = this.Q) != null) {
            editProgressViewModel.a(1003);
        }
        com.ss.android.ugc.gamora.editor.progressbar.a aVar = this.T;
        if (aVar != null) {
            aVar.a(1, -1);
        }
        if (z2 && this.S && this.V) {
            this.S = false;
            this.x = this.u.getMediaModelList();
            p pVar = this.Y;
            if (pVar != null) {
                pVar.b();
            }
            this.f127159h.a((androidx.core.g.e<Float, Float>) null, com.ss.android.ugc.aweme.shortvideo.cut.videoedit.i.a(this.x, true, null, 4));
        }
        b(!z2);
        if (!this.w) {
            this.w = true;
            this.f127160i.setOnClickListener(new ag(this));
            this.f127161j.setOnClickListener(new l(this));
            this.f127162k.setOnClickListener(new m(this));
            k();
            VideoEditViewModel videoEditViewModel = this.f127159h.getVideoEditViewModel();
            videoEditViewModel.f126130c.observe(this.f127154c, new n(this));
            videoEditViewModel.f126133f.observe(this.f127154c, new o(this));
            videoEditViewModel.f126138k.observe(this.f127154c, new p(this));
            videoEditViewModel.f126136i.observe(this.f127154c, new q(this));
            videoEditViewModel.f126137j.observe(this.f127154c, new r(this));
            videoEditViewModel.f126134g.observe(this.f127154c, new s(this));
            videoEditViewModel.f126135h.observe(this.f127154c, new t(this));
            videoEditViewModel.f126132e.observe(this.f127154c, new u(this));
        }
        a(!z2);
        a(hVar);
        int height = this.f127157f.getHeight();
        this.X = height;
        if (height == 0) {
            this.X = (int) n.b(this.f127154c, 208.0f);
        }
        int b2 = this.X + ((int) n.b(this.f127154c, 16.0f));
        this.X = b2;
        View view = this.f127157f;
        s.a(view, z2, b2, view, new x(this, z2));
        a aVar2 = this.J;
        if (aVar2 != null) {
            aVar2.a(z2);
        }
        if (z2) {
            this.t.b().setValue(u.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), dh.c(this.f127154c), this.X, m(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
            ImageView imageView = this.f127162k;
            imageView.setImageDrawable(imageView.getContext().getResources().getDrawable(2131231566));
            this.f127162k.setEnabled(true);
            this.f127159h.setEnabled(true);
            this.f127159h.c(true);
            this.t.a().setValue(dmt.av.video.t.b(0));
            return;
        }
        this.f127162k.setEnabled(false);
        this.f127159h.setEnabled(false);
        this.y.removeCallbacks(this.H);
        this.t.a().setValue(dmt.av.video.t.b());
        this.t.b().setValue(u.b(this.f127155d.getResources().getColor(R.color.a2), dh.c(this.f127154c), this.X, m(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
        this.W = false;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, h hVar) {
        boolean a2 = this.f127159h.a(i2, i3);
        l();
        if (a2 && hVar != null) {
            this.f127163l.f125327b.setValue(Long.valueOf((long) hVar.a(0)));
            this.t.a().setValue(dmt.av.video.t.b((long) hVar.a(0)));
        }
        return a2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @Override // com.ss.android.ugc.aweme.editSticker.interact.d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.graphics.RectF r11) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.a(android.graphics.RectF):boolean");
    }

    public final void g() {
        if (this.W) {
            f();
        }
    }

    private int m() {
        return ((dh.e(this.f127154c) - this.X) - dh.c(this.f127154c)) - dh.d(this.f127154c);
    }

    private int n() {
        return (dh.e(this.f127154c) - this.X) - dh.d(this.f127154c);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.edit.infosticker.b
    public final boolean b() {
        t<Boolean> tVar = this.t.f127092d;
        if (tVar == null || tVar.getValue() == null) {
            return false;
        }
        return tVar.getValue().booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
        if (cVar instanceof aj) {
            return true;
        }
        if ((cVar instanceof q) || (cVar instanceof CommentStickerView)) {
            return false;
        }
        boolean z2 = cVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e;
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        if (h()) {
            boolean z2 = false;
            com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
            if (cVar instanceof aj) {
                z2 = ((aj) cVar).f127124m;
            }
            bl.b(this.u, z2);
        } else if (this.K instanceof q) {
            bl.j(this.u);
        }
    }

    private void l() {
        this.f127159h.setHitTest(Boolean.valueOf(com.ss.android.ugc.gamora.editor.sticker.read.h.a()));
        com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
        if (cVar instanceof q) {
            TextStickerData data = ((q) cVar).getData();
            if (this.f127159h == null) {
                return;
            }
            if (data == null || !data.getHasReadTextAudio()) {
                this.f127159h.q();
            } else {
                this.f127159h.b(data.getAudioTrackDuration(), this.s.G());
            }
        } else {
            this.f127159h.q();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        int i2;
        if (this.M) {
            androidx.core.g.e<Long, Long> playBoundary = this.f127159h.getPlayBoundary();
            this.t.a().setValue(dmt.av.video.t.a((long) this.s.s(playBoundary.f2397a.intValue())));
            if ((this.s.j() - playBoundary.f2398b.intValue()) - 30 < 150) {
                i2 = 120;
            } else {
                i2 = 0;
            }
            a(Math.max(playBoundary.f2397a.intValue() - 30, 0), Math.min(playBoundary.f2398b.intValue() + 30 + i2, this.s.j()), false, true);
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.M) {
            g();
            androidx.core.g.e<Long, Long> playBoundary = this.f127159h.getPlayBoundary();
            long s2 = (long) this.s.s(this.f127159h.getPlayBoundary().f2397a.intValue());
            a(Math.max(playBoundary.f2397a.intValue() - 30, 0), Math.min(playBoundary.f2398b.intValue() + 30, this.s.j()), true, false);
            this.t.a().setValue(dmt.av.video.t.a(s2));
        }
    }

    public final boolean j() {
        this.f127155d.E.b();
        InfoStickerEditView infoStickerEditView = this.f127155d;
        if (infoStickerEditView == null || infoStickerEditView.f127073g == null || this.f127155d.f127073g.f127131a == null || this.f127155d.f127073g.f127131a.size() <= 0) {
            return false;
        }
        boolean z2 = false;
        for (aj ajVar : this.f127155d.f127073g.f127131a) {
            if (ajVar.f127115d) {
                ajVar.f127115d = false;
                z2 = true;
            }
        }
        if (z2) {
            this.f127155d.B = false;
            this.f127155d.invalidate();
        }
        return z2;
    }

    private void k() {
        x.a aVar;
        p pVar;
        if (!this.V) {
            this.V = true;
            int j2 = this.s.j();
            this.f127163l = (CutMultiVideoViewModel) ae.a(this.f127154c, (ad.b) null).a(CutMultiVideoViewModel.class);
            this.f127159h.setCanEdit(false);
            this.f127159h.setMinVideoLength(1000);
            this.f127159h.setMaxVideoLength((long) j2);
            this.f127163l.f125336k = this.u.isMvThemeVideoType();
            this.f127163l.f125337l = j2;
            this.f127159h.setFirstFrameVisibleLiveData(this.C);
            this.f127159h.setFirstFrameBitmapLiveData(this.B);
            this.f127159h.setVeEditor(this.s);
            int frameWidth = this.f127159h.getFrameWidth();
            int frameHeight = this.f127159h.getFrameHeight();
            int ceil = (int) Math.ceil((double) (((float) (n.a(this.f127154c) - (this.f127159h.getLeftRightMargin() * 2))) / (((float) frameWidth) * 1.0f)));
            if (bt.a()) {
                aVar = x.a.GET_FRAMES_MODE_NORMAL;
            } else {
                aVar = x.a.GET_FRAMES_MODE_NOEFFECT;
            }
            if (this.u.isMultiVideoEdit()) {
                pVar = new p(new VEMultiEditVideoCoverGeneratorImpl(this.s, this.f127154c, ceil, this.s.j(), (int) this.u.getMultiEditVideoStartTime(), aVar), frameWidth, frameHeight, ceil);
            } else {
                pVar = new p(new VEVideoCoverGeneratorImpl(this.s, this.f127154c, ceil, aVar, "sticker_select_time"), frameWidth, frameHeight, ceil);
            }
            this.Y = pVar;
            this.f127159h.a(this.f127154c, this.f127163l, pVar, this.x);
            this.f127159h.setEnableBoundaryText(true);
            this.f127159h.setPointerType(2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        boolean z2 = !this.W;
        this.W = z2;
        a(z2);
        i();
        a aVar = this.J;
        if (aVar != null) {
            aVar.b(this.W);
        }
        if (!this.W) {
            this.f127162k.setImageDrawable(this.f127154c.getResources().getDrawable(2131231566));
            this.t.a().setValue(dmt.av.video.t.a((long) this.s.k()));
            this.t.a().setValue(dmt.av.video.t.b());
            this.y.removeCallbacks(this.H);
            com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
            if (cVar != null) {
                cVar.setAlpha(true);
                com.ss.android.ugc.aweme.editSticker.interact.c cVar2 = this.K;
                if (cVar2 instanceof q) {
                    TextStickerData data = ((q) cVar2).getData();
                    if (!(this.f127159h == null || data == null || !data.getHasReadTextAudio())) {
                        VideoEditView videoEditView = this.f127159h;
                        videoEditView.A.getViewTreeObserver().addOnGlobalLayoutListener(
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0089: INVOKE  
                              (wrap: android.view.ViewTreeObserver : 0x0080: INVOKE  (r1v11 android.view.ViewTreeObserver) = 
                              (wrap: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView : 0x007e: IGET  (r0v27 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView) = (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView) com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.A com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView)
                             type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.AudioTrackView.getViewTreeObserver():android.view.ViewTreeObserver)
                              (wrap: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3 : 0x0086: CONSTRUCTOR  (r0v28 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3) = 
                              (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView)
                              (wrap: int : 0x0074: INVOKE  (r4v0 int) = (r1v10 'data' com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData) type: VIRTUAL call: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.getAudioTrackDuration():int)
                              (wrap: int : 0x007a: INVOKE  (r2v3 int) = 
                              (wrap: com.ss.android.ugc.asve.editor.g : 0x0078: IGET  (r0v26 com.ss.android.ugc.asve.editor.g) = (r6v0 'this' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.s com.ss.android.ugc.asve.editor.g)
                             type: INTERFACE call: com.ss.android.ugc.asve.editor.g.G():int)
                             call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.3.<init>(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, int, int):void type: CONSTRUCTOR)
                             type: VIRTUAL call: android.view.ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener):void in method: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.f():void, file: classes7.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0086: CONSTRUCTOR  (r0v28 com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView$3) = 
                              (r5v0 'videoEditView' com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView)
                              (wrap: int : 0x0074: INVOKE  (r4v0 int) = (r1v10 'data' com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData) type: VIRTUAL call: com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData.getAudioTrackDuration():int)
                              (wrap: int : 0x007a: INVOKE  (r2v3 int) = 
                              (wrap: com.ss.android.ugc.asve.editor.g : 0x0078: IGET  (r0v26 com.ss.android.ugc.asve.editor.g) = (r6v0 'this' com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i A[IMMUTABLE_TYPE, THIS]) com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.s com.ss.android.ugc.asve.editor.g)
                             type: INTERFACE call: com.ss.android.ugc.asve.editor.g.G():int)
                             call: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView.3.<init>(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, int, int):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.f():void, file: classes7.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                            	... 34 more
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView, state: GENERATED_AND_UNLOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                            	... 40 more
                            */
                        /*
                        // Method dump skipped, instructions count: 193
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.f():void");
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
                    public final void i() {
                        /*
                        // Method dump skipped, instructions count: 161
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.i.i():void");
                    }

                    private void b(boolean z2) {
                        EditCornerViewModel editCornerViewModel = this.P;
                        if (editCornerViewModel != null) {
                            editCornerViewModel.a(z2);
                        }
                    }

                    public final void a(com.ss.android.ugc.aweme.editSticker.c.b bVar) {
                        InfoStickerEditView infoStickerEditView = this.f127155d;
                        if (infoStickerEditView != null) {
                            infoStickerEditView.setMotionInterceptor(bVar);
                        }
                    }

                    static String a(com.ss.android.ugc.aweme.editSticker.interact.c cVar) {
                        if (cVar instanceof aj) {
                            return ((aj) cVar).f127114c.stickerId;
                        }
                        if (cVar instanceof q) {
                            return "text_sticker";
                        }
                        return "";
                    }

                    private void a(com.ss.android.ugc.aweme.sticker.data.e eVar) {
                        if (eVar instanceof TextStickerData) {
                            TextStickerData textStickerData = (TextStickerData) eVar;
                            if (textStickerData.getHasReadTextAudio() && textStickerData.getAudioTrackIndex() >= 0) {
                                this.s.a(textStickerData.getAudioTrackIndex(), 0, textStickerData.getAudioTrackDuration(), textStickerData.getStartTime(), textStickerData.getStartTime() + textStickerData.getAudioTrackDuration(), false);
                            }
                        }
                    }

                    private void b(h hVar) {
                        this.p.setProgress((int) ((((float) (this.s.k() - hVar.a(0))) / ((float) (hVar.b(this.s.j()) - hVar.a(0)))) * 100.0f));
                    }

                    private void d(h hVar) {
                        int d2 = hVar.d();
                        int c2 = hVar.c(this.s.G());
                        if (d2 >= 0 && c2 >= 0 && !a(d2, c2, hVar)) {
                            this.y.postDelayed(new y(this, d2, c2, hVar), 300);
                        }
                        i();
                    }

                    private void c(h hVar) {
                        String str;
                        String str2;
                        if (hVar != null && (hVar instanceof aj)) {
                            boolean z2 = ((aj) hVar).f127124m;
                            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("prop_id", a((com.ss.android.ugc.aweme.editSticker.interact.c) hVar)).a("creation_id", this.u.creationId);
                            if (this.K == null) {
                                str = "click";
                            } else {
                                str = "change";
                            }
                            com.ss.android.ugc.tools.f.b a3 = a2.a("method", str).a("content_type", this.u.getAvetParameter().getContentType()).a("content_source", this.u.getAvetParameter().getContentSource()).a("shoot_entrance", this.u.mShootWay);
                            if (this.f127152a) {
                                str2 = "edit_post_page";
                            } else {
                                str2 = "video_edit_page";
                            }
                            com.ss.android.ugc.tools.f.b a4 = a3.a("enter_from", str2).a("is_diy_prop", z2 ? 1 : 0);
                            if (this.u.draftId != 0) {
                                a4.a("draft_id", this.u.draftId);
                            }
                            if (!TextUtils.isEmpty(this.u.newDraftId)) {
                                a4.a("new_draft_id", this.u.newDraftId);
                            }
                            com.ss.android.ugc.aweme.utils.d.a("prop_time_set", a4.f149193a);
                        }
                    }

                    public final void a(h hVar) {
                        a(hVar, 0);
                        l();
                    }

                    public final void a(InfoStickerModel infoStickerModel) {
                        this.f127155d.a(infoStickerModel, true);
                    }

                    public final void a(boolean z2) {
                        this.f127155d.a(z2);
                        if (this.K != null && h()) {
                            this.K.setAlpha(true);
                        }
                    }

                    /* access modifiers changed from: package-private */
                    public final void a(int i2, int i3) {
                        a(i2, i3, false, false);
                    }

                    public i(com.ss.android.ugc.aweme.shortvideo.preview.a aVar, com.ss.android.ugc.gamora.editor.progressbar.a aVar2) {
                        this.R = aVar;
                        this.T = aVar2;
                    }

                    private void a(FormatFlagsConversionMismatchException formatFlagsConversionMismatchException, String str) {
                        try {
                            com.ss.android.ugc.aweme.df.q.a("info_sticker_string_format_event", new ar().a("exception", m.c(formatFlagsConversionMismatchException)).a("event", "normal_str=" + str + ", error_str=" + this.f127158g.getContext().getResources().getString(R.string.cn9)).a());
                        } catch (Exception e2) {
                            bj.b(e2.getLocalizedMessage());
                        }
                    }

                    public final void a(h hVar, int i2) {
                        if (hVar != this.K) {
                            if (hVar != null) {
                                if (!this.L.containsKey(hVar)) {
                                    this.L.put(hVar, hVar.c());
                                }
                                hVar.setAlpha(true);
                                if (hVar instanceof aj) {
                                    this.y.post(new ac(this));
                                }
                                if (this.w && i2 == 0) {
                                    d(hVar);
                                }
                                com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
                                if (cVar != null) {
                                    if (i2 != 0) {
                                        if (i2 == 1 && this.U) {
                                            cVar.setAlpha(false);
                                        }
                                    } else if (this.w) {
                                        cVar.setAlpha(false);
                                    }
                                    if (this.K instanceof aj) {
                                        this.s.w();
                                    }
                                }
                                if (i2 == 0) {
                                    c(hVar);
                                } else if (i2 == 1) {
                                    b(hVar);
                                }
                            } else {
                                for (Map.Entry<h, com.ss.android.ugc.aweme.sticker.data.e> entry : this.L.entrySet()) {
                                    h key = entry.getKey();
                                    com.ss.android.ugc.aweme.sticker.data.e value = entry.getValue();
                                    if (!(key == null || value == null)) {
                                        key.a(value, this.f127155d.f127069c, this.f127155d.f127070d);
                                        a(value);
                                    }
                                }
                                this.L.clear();
                            }
                            this.K = hVar;
                            l();
                        }
                    }

                    private void a(int i2, int i3, boolean z2, boolean z3) {
                        i();
                        if (this.K != null) {
                            int s2 = this.s.s(i2);
                            int s3 = this.s.s(i3);
                            if (h()) {
                                this.f127155d.a((aj) this.K, s2, s3);
                                return;
                            }
                            com.ss.android.ugc.aweme.editSticker.interact.c cVar = this.K;
                            if (cVar instanceof q) {
                                TextStickerData data = ((q) cVar).getData();
                                if (data != null) {
                                    data.setStartTime(s2);
                                    data.setEndTime(s3);
                                    data.setUiStartTime(i2);
                                    data.setUiEndTime(i3);
                                    if (z2) {
                                        l();
                                    }
                                    if (z3 && data.getHasReadTextAudio() && data.getAudioTrackIndex() >= 0) {
                                        this.s.a(data.getAudioTrackIndex(), 0, data.getAudioTrackDuration(), s2, s2 + data.getAudioTrackDuration(), false);
                                    }
                                }
                            } else if (cVar instanceof CommentStickerView) {
                                CommentVideoModel data2 = ((CommentStickerView) cVar).getData();
                                if (data2 != null) {
                                    data2.setStartTime(s2);
                                    data2.setEndTime(s3);
                                }
                            } else if (cVar instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) {
                                ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) cVar).setStartTime(s2);
                                ((com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.e) this.K).setEndTime(s3);
                            }
                        }
                    }
                }
