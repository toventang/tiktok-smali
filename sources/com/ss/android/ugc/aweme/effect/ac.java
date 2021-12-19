package com.ss.android.ugc.aweme.effect;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.viewpager.widget.ViewPager;
import b.i;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.effect.c.b.b;
import com.ss.android.ugc.aweme.experiment.ep;
import com.ss.android.ugc.aweme.experiment.eq;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.x;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.widget.ChooseVideoCoverView;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.aweme.themechange.base.AVDmtTabLayout;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
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
import org.json.JSONException;
import org.json.JSONObject;

public class ac {

    /* renamed from: a  reason: collision with root package name */
    public static final String f88778a = ac.class.getSimpleName();
    public g A;
    public a B;
    p C;
    public r D;
    public int E;
    public int F;
    public b G;
    public a H;
    public View I;
    public r J;
    boolean K;
    public e L;
    public EffectPointModel M;
    w N;
    public com.ss.android.ugc.aweme.effect.c.a O = new com.ss.android.ugc.aweme.effect.c.a();
    public String P;
    public ArrayList<EffectPointModel> Q;
    ArrayList<EffectPointModel> R;
    int S = -1;
    public t<Bitmap> T;
    public t<Boolean> U;
    public SafeHandler V;
    public EditEffectVideoModel W;
    public com.ss.android.ugc.aweme.effect.e.a X;
    public com.ss.android.ugc.aweme.effect.e.b Y;
    public ViewPager.e Z;
    public int aa;
    public boolean ab = false;
    public boolean ac = false;
    public boolean ad = false;
    public c ae;
    com.ss.android.ugc.tools.view.a.a af = new ad(this);
    public Runnable ag = new Runnable() {
        /* class com.ss.android.ugc.aweme.effect.ac.AnonymousClass5 */

        static {
            Covode.recordClassIndex(55853);
        }

        public final void run() {
            if (ac.this.A != null) {
                ac.this.a((int) ac.this.B.d(), false);
                ac.this.V.postDelayed(ac.this.ag, 0);
            }
        }
    };
    private EffectPointModel ah;

    /* renamed from: b  reason: collision with root package name */
    public VideoPublishEditModel f88779b;

    /* renamed from: c  reason: collision with root package name */
    public x f88780c;

    /* renamed from: d  reason: collision with root package name */
    public t<dmt.av.video.p> f88781d;

    /* renamed from: e  reason: collision with root package name */
    public t<dmt.av.video.t> f88782e;

    /* renamed from: f  reason: collision with root package name */
    public t<w> f88783f;

    /* renamed from: g  reason: collision with root package name */
    public t<Boolean> f88784g;

    /* renamed from: h  reason: collision with root package name */
    public SafeHandler f88785h;

    /* renamed from: i  reason: collision with root package name */
    public m f88786i;

    /* renamed from: j  reason: collision with root package name */
    public VEEffectSeekLayout f88787j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f88788k;

    /* renamed from: l  reason: collision with root package name */
    public FrameLayout f88789l;

    /* renamed from: m  reason: collision with root package name */
    public ImageView f88790m;
    public RelativeLayout n;
    public TextView o;
    public RelativeLayout p;
    public LinearLayout q;
    public AVStatusView r;
    public TextView s;
    public TextView t;
    public NoScrollViewPager u;
    public AVDmtTabLayout v;
    public ChooseVideoCoverView w;
    public VideoEditView x;
    CutMultiVideoViewModel y;
    com.ss.android.ugc.aweme.shortvideo.cover.a z;

    public final boolean a() {
        if (this.f88779b.canvasVideoData == null && !this.f88779b.isStitchMode() && !this.f88779b.isMvThemeVideoType()) {
            return true;
        }
        return false;
    }

    public final boolean a(List<EffectCategoryResponse> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (!eq.a()) {
            a(list, "trending");
        } else if (this.f88779b.isTemplateMv()) {
            c(list);
        }
        if (this.f88779b.isMvThemeVideoType() && !this.f88779b.isPhotoMvMode) {
            a(list, "sticker");
        }
        if (!p().booleanValue()) {
            a(list, "motion");
        }
        if (!a()) {
            return false;
        }
        EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse();
        effectCategoryResponse.setName(this.L.getString(R.string.gbt));
        list.add(effectCategoryResponse);
        return true;
    }

    public final void a(boolean z2, List<EffectCategoryResponse> list) {
        ViewPager.e eVar;
        if (z2 && list != null && list.size() == 1 && (eVar = this.Z) != null) {
            eVar.onPageSelected(0);
        }
    }

    static {
        Covode.recordClassIndex(55848);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.G = null;
        this.H = null;
        this.f88785h.removeCallbacksAndMessages(null);
        this.V.removeCallbacksAndMessages(null);
    }

    public final void l() {
        this.f88782e.setValue(dmt.av.video.t.b());
        m();
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        s.a(this.f88790m, true);
        ImageView imageView = this.f88790m;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    public final Boolean p() {
        boolean z2;
        if (this.aa > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        int f88800a;

        static {
            Covode.recordClassIndex(55856);
        }

        public final void run() {
            ac.this.f88787j.a(this.f88800a, (int) ac.this.B.d());
            ac.this.f88785h.post(this);
        }

        b(int i2) {
            this.f88800a = i2;
        }
    }

    private void q() {
        if (this.J.f88958a != null && (this.J.f88958a instanceof u)) {
            ((u) this.J.f88958a).g();
        }
    }

    public final void e() {
        a(0, false);
        int G2 = this.A.G();
        this.f88787j.setVideoDuration(G2);
        this.x.a(G2);
        this.O.a(G2);
    }

    public final void f() {
        this.f88780c.a().a(new ag(this), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public final int h() {
        if (this.p.getHeight() == 0) {
            return (int) n.b(this.L, 52.0f);
        }
        return this.p.getHeight();
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        int height;
        if (this.f88789l.getHeight() == 0) {
            height = (int) n.b(this.L, 276.0f);
        } else {
            height = this.f88789l.getHeight();
        }
        return height + 16;
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        this.f88782e.setValue(dmt.av.video.t.a());
        s.a(this.f88790m, false);
        ImageView imageView = this.f88790m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    public final int o() {
        return (((dh.e(this.L) - h()) - i()) - dh.c(this.L)) - dh.d(this.L);
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        static {
            Covode.recordClassIndex(55855);
        }

        public final void run() {
            ac.this.a((int) ac.this.B.d(), false);
            if (!ac.this.d()) {
                ac.this.f88785h.postDelayed(this, 0);
            }
        }

        a() {
        }
    }

    public final boolean d() {
        if (!this.K) {
            return true;
        }
        if (!this.B.b()) {
            return false;
        }
        this.f88782e.setValue(dmt.av.video.t.b(this.O.a()));
        a((int) this.O.f88903b, false);
        l();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.W.e().setValue(Float.valueOf(this.x.getSelectedTime()));
        i(true);
    }

    public final void b() {
        EffectPointModel effectPointModel = this.M;
        if (effectPointModel == null || "0".equals(effectPointModel.getKey())) {
            this.f88787j.a(true, this.F);
            a((List<EffectPointModel>) null, false, false);
        } else if (!"1".equals(this.M.getKey())) {
            d(true);
            ArrayList arrayList = new ArrayList();
            EffectPointModel effectPointModel2 = new EffectPointModel();
            int startPoint = this.M.getStartPoint();
            int endPoint = this.M.getEndPoint();
            effectPointModel2.setUiStartPoint(startPoint);
            effectPointModel2.setUiEndPoint(endPoint);
            arrayList.add(effectPointModel2);
            a((List<EffectPointModel>) arrayList, true, false);
        } else {
            this.f88787j.a(true, this.E);
            a((List<EffectPointModel>) null, false, false);
        }
    }

    public final void n() {
        this.R = new ArrayList<>(this.Q);
        EffectPointModel effectPointModel = this.M;
        if (effectPointModel != null) {
            this.ah = effectPointModel.clone();
        }
        if (this.f88783f.getValue() != null) {
            this.N = this.f88783f.getValue().clone();
        }
        EffectPointModel effectPointModel2 = this.ah;
        if (effectPointModel2 == null || !effectPointModel2.getKey().equals("1")) {
            this.W.l().setValue(false);
        } else {
            this.W.l().setValue(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e5, code lost:
        if (r1.equals("3") == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ee, code lost:
        if (r1.equals("2") == false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f1, code lost:
        r10.f88787j.setOverlayColor(r10.F);
        d(true);
        r1 = dmt.av.video.t.b(0);
        a(0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        if (r1 == null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0106, code lost:
        r10.f88782e.setValue(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
        // Method dump skipped, instructions count: 412
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.ac.j():void");
    }

    private void f(boolean z2) {
        g(z2);
        h(z2);
    }

    private void h(boolean z2) {
        this.x.b(z2);
    }

    public final void d(boolean z2) {
        this.x.c(z2);
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

    private void g(boolean z2) {
        ChooseVideoCoverView.a aVar;
        if ((this.w.getAdapter() instanceof ChooseVideoCoverView.a) && (aVar = (ChooseVideoCoverView.a) this.w.getAdapter()) != null) {
            aVar.a(z2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        int i2;
        VEEffectSeekLayout vEEffectSeekLayout = this.f88787j;
        if (z2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        vEEffectSeekLayout.setVisibility(i2);
    }

    private void i(boolean z2) {
        com.ss.android.ugc.aweme.effect.c.b.b b2;
        if (z2) {
            b2 = b.a.a(this.x.getSelectedTime());
        } else {
            b2 = b.a.b((float) this.A.G());
        }
        this.W.f().setValue(b2);
    }

    public final Boolean e(boolean z2) {
        Keva repo = Keva.getRepo("add_motion_tab");
        boolean z3 = true;
        if (this.aa != 2 || !repo.getBoolean("is_first_click_motion_tab", true)) {
            z3 = false;
        } else if (z2) {
            repo.storeBoolean("is_first_click_motion_tab", false);
        }
        return Boolean.valueOf(z3);
    }

    private static void c(List<EffectCategoryResponse> list) {
        for (EffectCategoryResponse effectCategoryResponse : list) {
            ArrayList arrayList = new ArrayList();
            for (Effect effect : effectCategoryResponse.getTotalEffects()) {
                try {
                    if (effect.getExtra() == null || effect.getExtra().isEmpty() || !new JSONObject(effect.getExtra()).optBoolean("if_capcut")) {
                        arrayList.add(effect);
                    }
                } catch (JSONException unused) {
                }
            }
            effectCategoryResponse.setTotal_effects(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        ArrayList<EffectPointModel> effectPointModels = this.f88787j.getEffectPointModels();
        if (!h.a(effectPointModels)) {
            x.j f2 = this.A.f();
            this.f88787j.a(i2);
            if (effectPointModels.isEmpty()) {
                this.f88782e.setValue(dmt.av.video.t.b(0));
                a((int) this.B.a(0), false);
            } else {
                EffectPointModel effectPointModel = effectPointModels.get(effectPointModels.size() - 1);
                int uiEndPoint = effectPointModel.getUiEndPoint();
                if (effectPointModel.isFromEnd() ^ this.B.c()) {
                    uiEndPoint = this.A.G() - uiEndPoint;
                }
                a(uiEndPoint, false);
                this.f88782e.setValue(dmt.av.video.t.b((long) uiEndPoint));
            }
            if (f2 == x.j.STARTED) {
                l();
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
                a2.setOnClickListener(new au(this, list, a2));
                if (l.a((Object) "motion", (Object) list.get(i2).getKey()) && e(false).booleanValue()) {
                    a2.a(true);
                    this.ab = true;
                }
                AVDmtTabLayout aVDmtTabLayout = this.v;
                aVDmtTabLayout.a(aVDmtTabLayout.a().a(a2));
            }
        }
    }

    private void j(boolean z2) {
        if (z2) {
            this.f88779b.mEffectList = new ArrayList<>(this.X.g());
            this.f88779b.mTimeEffect = this.M;
            if (!(this.f88779b.mTimeEffect == null || !this.f88779b.mTimeEffect.getKey().equals("1") || this.X.e().getValue() == null)) {
                this.f88779b.getPreviewInfo().updateReverseVideoContent(this.f88780c.c(), this.f88780c.d(), this.f88780c.e());
            }
            if (this.f88779b.mTimeEffect != null) {
                this.f88779b.mEffectList.add(this.f88779b.mTimeEffect);
            }
            com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("creation_id", this.f88779b.creationId).a("shoot_way", this.f88779b.mShootWay);
            if (this.f88779b.draftId != 0) {
                a2.a("draft_id", this.f88779b.draftId);
            }
            if (!TextUtils.isEmpty(this.f88779b.newDraftId)) {
                a2.a("new_draft_id", this.f88779b.newDraftId);
            }
            if (this.f88779b.mEffectList != null) {
                StringBuilder sb = new StringBuilder();
                Iterator<EffectPointModel> it = this.f88779b.mEffectList.iterator();
                while (it.hasNext()) {
                    EffectPointModel next = it.next();
                    if (!TextUtils.isEmpty(next.getName())) {
                        sb.append(next.getName()).append(",");
                    }
                }
                if (sb.length() > 0) {
                    a2.a("effect_name", sb.substring(0, sb.length() - 1));
                }
            }
            com.ss.android.ugc.aweme.port.in.g.a().I().a("effect_confirm", a2.f149193a);
            return;
        }
        this.f88779b.mEffectList = new ArrayList<>(this.X.g());
        this.f88779b.mTimeEffect = this.M;
        if (this.f88779b.mTimeEffect != null) {
            this.f88779b.mEffectList.add(this.f88779b.mTimeEffect);
        }
    }

    public final void a(boolean z2) {
        if (z2) {
            this.q.setVisibility(0);
            this.f88788k.setVisibility(8);
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
        this.f88788k.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (i2 >= 0 && i3 >= 0 && !this.x.a(i2, i3, false)) {
            this.x.postDelayed(new ay(this, i2, i3), 300);
        }
    }

    private static void a(List<EffectCategoryResponse> list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (list.get(i2) != null && list.get(i2).getKey().equals(str)) {
                if (i2 != -1) {
                    list.remove(i2);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public final void a(int i2, boolean z2) {
        CutMultiVideoViewModel cutMultiVideoViewModel;
        VEEffectSeekLayout vEEffectSeekLayout = this.f88787j;
        if (vEEffectSeekLayout != null) {
            vEEffectSeekLayout.c(i2);
        }
        if (this.x != null && (cutMultiVideoViewModel = this.y) != null && !z2) {
            cutMultiVideoViewModel.f125327b.setValue(Long.valueOf((long) i2));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.effect.ac.a(int, boolean, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, long j3, boolean z2) {
        String str;
        EffectPointModel effectPointModel;
        String str2;
        g();
        long j4 = j3 - j2;
        int currentItem = this.u.getCurrentItem();
        if (currentItem < this.J.getCount()) {
            str = this.J.b(currentItem).getKey();
        } else {
            str = null;
        }
        if (com.ss.android.ugc.aweme.effect.c.b.a.a(this.u, this.J, a())) {
            w value = this.f88783f.getValue();
            if (value != null) {
                int i2 = (int) j2;
                this.M.setStartPoint(i2);
                int i3 = (int) j3;
                this.M.setEndPoint(i3);
                this.M.setUiStartPoint(i2);
                this.M.setUiEndPoint(i3);
                this.f88783f.setValue(w.a(value.f156971a, j2, j3));
                this.f88782e.setValue(dmt.av.video.t.b(j2));
                EffectPointModel effectPointModel2 = this.M;
                if (!(effectPointModel2 == null || effectPointModel2.getKey() == null)) {
                    String key = this.M.getKey();
                    this.O.f88904c.put(key, Long.valueOf(j2));
                    this.O.f88905d.put(key, Long.valueOf(Math.abs(j4)));
                }
            } else {
                return;
            }
        } else if (!ep.a() && l.a((Object) "sticker", (Object) str)) {
            dmt.av.video.p a2 = dmt.av.video.p.a(this.B.a(j2), this.B.a(j3));
            a2.f156929e = j2;
            a2.f156930f = j3;
            a2.f156932h = this.B.c();
            this.f88781d.setValue(a2);
        }
        k();
        if (!z2) {
            NoScrollViewPager noScrollViewPager = this.u;
            r rVar = this.J;
            VideoPublishEditModel videoPublishEditModel = this.f88779b;
            EffectPointModel effectPointModel3 = this.M;
            String str3 = this.P;
            boolean a3 = a();
            if (noScrollViewPager != null && rVar != null && videoPublishEditModel != null) {
                String str4 = "";
                if (com.ss.android.ugc.aweme.effect.c.b.a.a(noScrollViewPager, rVar, a3)) {
                    if (effectPointModel3 != null) {
                        com.ss.android.ugc.tools.f.b a4 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "edit_effect_page").a("content_source", es.a(videoPublishEditModel)).a("content_type", es.c(videoPublishEditModel)).a("effect_name", effectPointModel3.getName()).a("effect_id", effectPointModel3.getKey());
                        if (str3 == null) {
                            str2 = str4;
                        } else {
                            str2 = str3;
                        }
                        d.a("duration_adjust_complete", a4.a("tab_name", str2).a("duration", j4).f149193a);
                    } else {
                        return;
                    }
                }
                EffectCategoryResponse b2 = rVar.b(noScrollViewPager.getCurrentItem());
                if (b2 != null && !ep.a() && l.a((Object) "sticker", (Object) b2.getKey())) {
                    Fragment fragment = rVar.f88958a;
                    if ((fragment instanceof u) && (effectPointModel = (EffectPointModel) h.a.n.h((List) ((u) fragment).d())) != null) {
                        com.ss.android.ugc.tools.f.b a5 = new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel.creationId).a("shoot_way", videoPublishEditModel.mShootWay).a("enter_from", "edit_effect_page").a("content_source", es.a(videoPublishEditModel)).a("content_type", es.c(videoPublishEditModel)).a("effect_name", effectPointModel.getName()).a("effect_id", effectPointModel.getKey());
                        if (str3 != null) {
                            str4 = str3;
                        }
                        d.a("duration_adjust_complete", a5.a("tab_name", str4).a("duration", j4).f149193a);
                    }
                }
            }
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
