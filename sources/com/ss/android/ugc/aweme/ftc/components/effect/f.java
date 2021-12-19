package com.ss.android.ugc.aweme.ftc.components.effect;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.viewpager.widget.ViewPager;
import b.i;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.ss.android.ugc.aweme.effect.VEEffectSeekLayout;
import com.ss.android.ugc.aweme.effect.c.b.b;
import com.ss.android.ugc.aweme.effect.s;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.x;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.tools.view.a.c;
import com.ss.android.ugc.tools.view.widget.AVStatusView;
import com.ss.android.vesdk.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import dmt.av.video.w;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f97848a = f.class.getSimpleName();
    public g A;
    public com.ss.android.ugc.aweme.effect.a B;
    p C;
    r D;
    public int E;
    public int F;
    b G;
    a H;
    View I;
    public e J;
    boolean K;
    public e L;
    public EffectPointModel M;
    w N;
    public com.ss.android.ugc.aweme.effect.c.a O = new com.ss.android.ugc.aweme.effect.c.a();
    public String P;
    ArrayList<EffectPointModel> Q;
    ArrayList<EffectPointModel> R;
    int S = -1;
    t<Bitmap> T;
    t<Boolean> U;
    public SafeHandler V;
    public EditEffectVideoModel W;
    public com.ss.android.ugc.aweme.effect.e.a X;
    com.ss.android.ugc.aweme.effect.e.b Y;
    ViewPager.e Z;
    c aa;
    com.ss.android.ugc.tools.view.a.a ab = new g(this);
    public Runnable ac = new Runnable() {
        /* class com.ss.android.ugc.aweme.ftc.components.effect.f.AnonymousClass5 */

        static {
            Covode.recordClassIndex(62195);
        }

        public final void run() {
            if (f.this.A != null) {
                f.this.a((int) f.this.B.d(), false);
                f.this.V.postDelayed(f.this.ac, 0);
            }
        }
    };
    private EffectPointModel ad;

    /* renamed from: b  reason: collision with root package name */
    public VideoPublishEditModel f97849b;

    /* renamed from: c  reason: collision with root package name */
    x f97850c;

    /* renamed from: d  reason: collision with root package name */
    t<dmt.av.video.p> f97851d;

    /* renamed from: e  reason: collision with root package name */
    public t<dmt.av.video.t> f97852e;

    /* renamed from: f  reason: collision with root package name */
    t<w> f97853f;

    /* renamed from: g  reason: collision with root package name */
    t<Boolean> f97854g;

    /* renamed from: h  reason: collision with root package name */
    public SafeHandler f97855h;

    /* renamed from: i  reason: collision with root package name */
    m f97856i;

    /* renamed from: j  reason: collision with root package name */
    public VEEffectSeekLayout f97857j;

    /* renamed from: k  reason: collision with root package name */
    LinearLayout f97858k;

    /* renamed from: l  reason: collision with root package name */
    FrameLayout f97859l;

    /* renamed from: m  reason: collision with root package name */
    ImageView f97860m;
    RelativeLayout n;
    TextView o;
    RelativeLayout p;
    LinearLayout q;
    AVStatusView r;
    TextView s;
    TextView t;
    public NoScrollViewPager u;
    AVDmtTabLayout v;
    ChooseVideoCoverView w;
    VideoEditView x;
    CutMultiVideoViewModel y;
    com.ss.android.ugc.aweme.shortvideo.cover.a z;

    public final boolean a(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (this.f97849b.isMvThemeVideoType() && !this.f97849b.isPhotoMvMode) {
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                } else if (list.get(i2) == null || !l.a((Object) "sticker", (Object) list.get(i2).getKey())) {
                    i2++;
                } else if (i2 != -1) {
                    list.remove(i2);
                }
            }
        }
        if (!a()) {
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.L.getString(R.string.gbt));
        list.add(effectCategoryResponse);
        return true;
    }

    static {
        Covode.recordClassIndex(62190);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.G = null;
        this.H = null;
        this.f97855h.removeCallbacksAndMessages(null);
        this.V.removeCallbacksAndMessages(null);
    }

    public final void j() {
        this.f97852e.setValue(dmt.av.video.t.b());
        k();
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        s.a(this.f97860m, true);
        ImageView imageView = this.f97860m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f97870a;

        static {
            Covode.recordClassIndex(62198);
        }

        public final void run() {
            f.this.f97857j.a(this.f97870a, (int) f.this.B.d());
            f.this.f97855h.post(this);
        }

        b(int i2) {
            this.f97870a = i2;
        }
    }

    public final void d() {
        this.f97850c.a().a(new i(this), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.W.e().setValue(Float.valueOf(this.x.getSelectedTime()));
        h(true);
    }

    /* access modifiers changed from: package-private */
    public final int g() {
        int height;
        if (this.f97859l.getHeight() == 0) {
            height = (int) n.b(this.L, 276.0f);
        } else {
            height = this.f97859l.getHeight();
        }
        return height + 16;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        this.f97852e.setValue(dmt.av.video.t.a());
        s.a(this.f97860m, false);
        ImageView imageView = this.f97860m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final int m() {
        return (((dh.e(this.L) - f()) - g()) - dh.c(this.L)) - dh.d(this.L);
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(62197);
        }

        public final void run() {
            f.this.a((int) f.this.B.d(), false);
            if (!f.this.c()) {
                f.this.f97855h.postDelayed(this, 0);
            }
        }

        a() {
        }
    }

    public final boolean c() {
        if (!this.K) {
            return true;
        }
        if (!this.B.b()) {
            return false;
        }
        this.f97852e.setValue(dmt.av.video.t.b(this.O.a()));
        a((int) this.O.f88903b, false);
        j();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int f() {
        if (this.p.getHeight() == 0) {
            return (int) n.b(this.L, 52.0f);
        }
        return this.p.getHeight();
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.R = new ArrayList<>(this.Q);
        EffectPointModel effectPointModel = this.M;
        if (effectPointModel != null) {
            this.ad = effectPointModel.clone();
        }
        if (this.f97853f.getValue() != null) {
            this.N = this.f97853f.getValue().clone();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (r1.equals("3") == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        if (r1.equals("2") == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ee, code lost:
        r10.f97857j.setOverlayColor(r10.F);
        d(true);
        r1 = dmt.av.video.t.b(0);
        a(0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0101, code lost:
        if (r1 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0103, code lost:
        r10.f97852e.setValue(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.effect.f.h():void");
    }

    public final boolean a() {
        if (this.f97849b.isStitchMode() || this.f97849b.isMvThemeVideoType()) {
            return false;
        }
        return true;
    }

    private void e(boolean z2) {
        f(z2);
        g(z2);
    }

    private void g(boolean z2) {
        this.x.b(z2);
    }

    public final void d(boolean z2) {
        this.x.c(z2);
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        int i2;
        VEEffectSeekLayout vEEffectSeekLayout = this.f97857j;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        vEEffectSeekLayout.setVisibility(i2);
    }

    private void f(boolean z2) {
        ChooseVideoCoverView.a aVar;
        if ((this.w.getAdapter() instanceof ChooseVideoCoverView.a) && (aVar = (ChooseVideoCoverView.a) this.w.getAdapter()) != null) {
            aVar.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(boolean z2) {
        int i2;
        VideoEditView videoEditView = this.x;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        videoEditView.setVisibility(i2);
    }

    private void h(boolean z2) {
        com.ss.android.ugc.aweme.effect.c.b.b b2;
        if (z2) {
            b2 = b.a.a(this.x.getSelectedTime());
        } else {
            b2 = b.a.b((float) this.A.G());
        }
        this.W.f().setValue(b2);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        ArrayList<EffectPointModel> effectPointModels = this.f97857j.getEffectPointModels();
        if (!h.a(effectPointModels)) {
            x.j f2 = this.A.f();
            this.f97857j.a(i2);
            if (effectPointModels.isEmpty()) {
                this.f97852e.setValue(dmt.av.video.t.b(0));
                a((int) this.B.a(0), false);
            } else {
                EffectPointModel effectPointModel = effectPointModels.get(effectPointModels.size() - 1);
                int uiEndPoint = effectPointModel.getUiEndPoint();
                if (effectPointModel.isFromEnd() ^ this.B.c()) {
                    uiEndPoint = this.A.G() - uiEndPoint;
                }
                a(uiEndPoint, false);
                this.f97852e.setValue(dmt.av.video.t.b((long) uiEndPoint));
            }
            if (f2 == x.j.STARTED) {
                j();
            }
        }
    }

    public final void b(List<EffectCategoryResponse> list) {
        if (!(list == null || list.isEmpty())) {
            this.v.b();
            this.v.setMaxTabModeForCount(list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                com.ss.android.ugc.aweme.themechange.base.a a2 = AVDmtTabLayout.a.a(this.L);
                a2.setText(list.get(i2).getName());
                a2.a(i2, list.size());
                a2.setTag(Integer.valueOf(i2));
                a2.setOnClickListener(new w(this));
                AVDmtTabLayout aVDmtTabLayout = this.v;
                aVDmtTabLayout.a(aVDmtTabLayout.a().a(a2));
            }
        }
    }

    private void i(boolean z2) {
        if (z2) {
            this.f97849b.mEffectList = new ArrayList<>(this.X.g());
            this.f97849b.mTimeEffect = this.M;
            if (!(this.f97849b.mTimeEffect == null || !this.f97849b.mTimeEffect.getKey().equals("1") || this.X.e().getValue() == null)) {
                this.f97849b.getPreviewInfo().updateReverseVideoContent(this.f97850c.c(), this.f97850c.d(), this.f97850c.e());
            }
            if (this.f97849b.mTimeEffect != null) {
                this.f97849b.mEffectList.add(this.f97849b.mTimeEffect);
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f97849b.creationId).a("shoot_way", this.f97849b.mShootWay).a("draft_id", this.f97849b.draftId);
            if (this.f97849b.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it = this.f97849b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    a2.a("effect_name", sb.substring(0, sb.length() - 1));
                    return;
                }
                return;
            }
            return;
        }
        this.f97849b.mEffectList = new ArrayList<>(this.X.g());
        this.f97849b.mTimeEffect = this.M;
        if (this.f97849b.mTimeEffect != null) {
            this.f97849b.mEffectList.add(this.f97849b.mTimeEffect);
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            this.q.setVisibility(0);
            this.f97858k.setVisibility(8);
            AVStatusView aVStatusView = this.r;
            if (aVStatusView != null) {
                aVStatusView.b();
                return;
            }
            return;
        }
        AVStatusView aVStatusView2 = this.r;
        if (aVStatusView2 != null) {
            aVStatusView2.a();
        }
        this.q.setVisibility(8);
        this.f97858k.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i2 >= 0 && i3 >= 0 && !this.x.a(i2, i3, false)) {
            this.x.postDelayed(new aa(this, i2, i3), 300);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z2) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        VEEffectSeekLayout vEEffectSeekLayout = this.f97857j;
        if (vEEffectSeekLayout != null) {
            vEEffectSeekLayout.c(i2);
        }
        if (this.x != null && (cutMultiVideoViewModel = this.y) != null && !z2) {
            cutMultiVideoViewModel.f125327b.setValue(Long.valueOf((long) i2));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, long j3) {
        String str;
        e();
        int currentItem = this.u.getCurrentItem();
        if (currentItem < this.J.getCount()) {
            str = this.J.b(currentItem).getKey();
        } else {
            str = null;
        }
        if (com.ss.android.ugc.aweme.effect.c.b.a.a(this.u, this.J, a())) {
            w value = this.f97853f.getValue();
            if (value != null) {
                this.M.setStartPoint((int) j2);
                this.M.setEndPoint((int) j3);
                this.f97853f.setValue(w.a(value.f156971a, j2, j3));
                this.f97852e.setValue(dmt.av.video.t.b(j2));
                EffectPointModel effectPointModel = this.M;
                if (!(effectPointModel == null || effectPointModel.getKey() == null)) {
                    String key = this.M.getKey();
                    this.O.f88904c.put(key, Long.valueOf(j2));
                    this.O.f88905d.put(key, Long.valueOf(Math.abs(j3 - j2)));
                }
            } else {
                return;
            }
        } else if (l.a((Object) "sticker", (Object) str)) {
            dmt.av.video.p a2 = dmt.av.video.p.a(this.B.a(j2), this.B.a(j3));
            a2.f156929e = j2;
            a2.f156930f = j3;
            a2.f156932h = this.B.c();
            this.f97851d.setValue(a2);
        }
        i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [dmt.av.video.t] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ftc.components.effect.f.b(int, boolean):void");
    }

    public final void a(boolean z2, List<EffectCategoryResponse> list) {
        ViewPager.e eVar;
        if (z2 && list != null && list.size() == 1 && (eVar = this.Z) != null) {
            eVar.onPageSelected(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<EffectPointModel> list, boolean z2, boolean z3) {
        b(z2);
        c(!z2);
        if (!z2) {
            return;
        }
        if (!h.a(list)) {
            a(list.get(0).getUiStartPoint(), list.get(0).getUiEndPoint());
            this.x.a(true, z3, (androidx.core.g.a<Void>) null);
            return;
        }
        this.x.a(false, z3, (androidx.core.g.a<Void>) null);
    }
}
