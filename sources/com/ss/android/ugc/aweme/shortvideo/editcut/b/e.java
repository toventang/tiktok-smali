package com.ss.android.ugc.aweme.shortvideo.editcut.b;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.b.a.r;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.db;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class e extends a {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f128224h = {new y(e.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(e.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new y(e.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new y(e.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new y(e.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};
    public static final a u = new a((byte) 0);
    private final h.h A;
    private final h.h B;
    private final h.h.d C;
    private final h.h.d D;
    private final h.h.d E;
    private final h.h.d F;
    private final h.h.d G;
    private View H;

    /* renamed from: i  reason: collision with root package name */
    public int f128225i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f128226j;

    /* renamed from: k  reason: collision with root package name */
    public int f128227k;

    /* renamed from: l  reason: collision with root package name */
    public int f128228l;
    public TextView t;
    private final String v = "MultiClipsAdjustBottomScene";
    private boolean w = true;
    private final h.h x;
    private final h.h y;
    private final h.h z;

    static {
        Covode.recordClassIndex(84040);
    }

    private final r T() {
        return (r) this.x.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o U() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o) this.y.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d V() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d) this.z.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k W() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k) this.A.getValue();
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m X() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m) this.B.getValue();
    }

    private final VideoEditViewModel Y() {
        return (VideoEditViewModel) this.D.a(this, f128224h[1]);
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.n Z() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.n) this.F.a(this, f128224h[3]);
    }

    private final EditAdjustClipsBottomViewModel aa() {
        return (EditAdjustClipsBottomViewModel) this.G.a(this, f128224h[4]);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final int E() {
        return R.layout.d5;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84041);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.v;
    }

    static final class b extends h.f.b.m implements h.f.a.a<r> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, com.bytedance.o.f fVar) {
            super(0);
            this.this$0 = eVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ r invoke() {
            return new r(this.$diContainer, this.this$0);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(e eVar, com.bytedance.o.f fVar) {
            super(0);
            this.this$0 = eVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.o(this.$diContainer, this.this$0);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(e eVar, com.bytedance.o.f fVar) {
            super(0);
            this.this$0 = eVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.d(this.$diContainer, this.this$0);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84055);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(e eVar, com.bytedance.o.f fVar) {
            super(0);
            this.this$0 = eVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k(this.$diContainer, this.this$0);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m> {
        final /* synthetic */ com.bytedance.o.f $diContainer;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(e eVar, com.bytedance.o.f fVar) {
            super(0);
            this.this$0 = eVar;
            this.$diContainer = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m invoke() {
            return new com.ss.android.ugc.aweme.shortvideo.editcut.b.a.m(this.$diContainer, this.this$0);
        }
    }

    private final boolean R() {
        if (!com.ss.android.ugc.aweme.shortvideo.editcut.a.b.b((com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.C.a(this, f128224h[0])) || !this.w) {
            return false;
        }
        return true;
    }

    private final boolean S() {
        if (aa().a().getCurrentTabIndex() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final void P() {
        super.P();
        View c2 = c(R.id.b5_);
        h.f.b.l.b(c2, "");
        this.H = c2;
        View c3 = c(R.id.ffa);
        h.f.b.l.b(c3, "");
        a((com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a) c3);
        View c4 = c(R.id.eyw);
        h.f.b.l.b(c4, "");
        this.t = (TextView) c4;
    }

    public final void Q() {
        int i2 = 8;
        if (!S() || this.f128225i == 1) {
            View view = this.H;
            if (view == null) {
                h.f.b.l.a("editViewContainer");
            }
            view.setVisibility(0);
            X().d();
            if (R()) {
                U().b();
            } else {
                T().b();
            }
            V().b();
            TextView textView = this.t;
            if (textView == null) {
                h.f.b.l.a("tvDurationIndicator");
            }
            if (R()) {
                i2 = 0;
            }
            textView.setVisibility(i2);
            return;
        }
        View view2 = this.H;
        if (view2 == null) {
            h.f.b.l.a("editViewContainer");
        }
        view2.setVisibility(8);
        X().b();
        V().d();
        T().d();
        if (R()) {
            U().b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.e$e  reason: collision with other inner class name */
    static final class C3344e<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128230a;

        static {
            Covode.recordClassIndex(84045);
        }

        C3344e(e eVar) {
            this.f128230a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128230a.a(false, false);
        }
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128231a;

        static {
            Covode.recordClassIndex(84046);
        }

        f(e eVar) {
            this.f128231a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128231a.a(true, false);
        }
    }

    static final class g<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128232a;

        static {
            Covode.recordClassIndex(84047);
        }

        g(e eVar) {
            this.f128232a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128232a.a(false, true);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            num.intValue();
            this.this$0.Q();
            return z.f158842a;
        }
    }

    static final class d<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128229a;

        static {
            Covode.recordClassIndex(84044);
        }

        d(e eVar) {
            this.f128229a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            androidx.core.g.e eVar = (androidx.core.g.e) obj;
            e eVar2 = this.f128229a;
            F f2 = eVar.f2397a;
            if (f2 == null) {
                h.f.b.l.b();
            }
            S s = eVar.f2398b;
            if (s == null) {
                h.f.b.l.b();
            }
            eVar2.a(v.a(f2, s));
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>>, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>> dVar) {
            com.bytedance.jedi.arch.d<? extends List<? extends VideoSegment>> dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            this.this$0.G().a(dVar2.f39404b);
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.p, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84050);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.p pVar) {
            h.f.b.l.d(pVar, "");
            this.this$0.G().e();
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<Integer, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.f128225i = num.intValue();
            this.this$0.Q();
            return z.f158842a;
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<Float, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(84043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Float f2) {
            float floatValue = f2.floatValue();
            StringBuilder sb = new StringBuilder();
            String a2 = com.a.a(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
            h.f.b.l.b(a2, "");
            String sb2 = sb.append(a2).append("s").toString();
            TextView textView = this.this$0.t;
            if (textView == null) {
                h.f.b.l.a("tvDurationIndicator");
            }
            textView.setText(sb2);
            return z.f158842a;
        }
    }

    static final class h<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f128233a;

        static {
            Covode.recordClassIndex(84048);
        }

        h(e eVar) {
            this.f128233a = eVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            com.ss.android.ugc.aweme.shortvideo.cut.model.f fVar = (com.ss.android.ugc.aweme.shortvideo.cut.model.f) obj;
            if (fVar != null && (valueOf = Integer.valueOf(fVar.f125510d)) != null) {
                if (valueOf.intValue() == 0) {
                    if (this.f128233a.f128226j) {
                        this.f128233a.f128227k = fVar.f125511e;
                        this.f128233a.f128228l = fVar.f125508b;
                        this.f128233a.K().a(new com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a(2, false));
                    }
                    this.f128233a.f128226j = false;
                } else if (valueOf != null && valueOf.intValue() != 1 && valueOf.intValue() == 2) {
                    e eVar = this.f128233a;
                    eVar.a(v.a(Integer.valueOf(eVar.f128227k), Integer.valueOf(fVar.f125512f)), v.a(Integer.valueOf(this.f128233a.f128228l), Integer.valueOf(fVar.f125509c)));
                    this.f128233a.f128226j = true;
                }
            }
        }
    }

    @Override // com.bytedance.scene.j, com.ss.android.ugc.aweme.shortvideo.editcut.b.a
    public final void a(Bundle bundle) {
        super.a(bundle);
        f.a.b.b unused = aa().a(this, f.f128234a, new ah(), new i(this));
        f.a.b.b unused2 = aa().a(this, g.f128235a, new ah(), new j(this));
        f.a.b.b unused3 = aa().a(this, h.f128236a, new ah(), new k(this));
        f.a.b.b unused4 = aa().a(this, i.f128237a, new ah(), new l(this));
        f.a.b.b unused5 = aa().a(this, j.f128238a, new ah(), new c(this));
        Y().o.observe(this, new d(this));
        Y().p.observe(this, new C3344e(this));
        Y().q.observe(this, new f(this));
        Y().r.observe(this, new g(this));
        H().f125335j.observe(this, new h(this));
        Q();
    }

    public final void a(h.p<Integer, Integer> pVar) {
        String str;
        TextView textView = this.t;
        if (textView == null) {
            h.f.b.l.a("tvDurationIndicator");
        }
        textView.setVisibility(8);
        VideoSegment videoSegment = Y().k().get(pVar.getSecond().intValue());
        this.w = false;
        U().d();
        V().d();
        T().b();
        if (!S()) {
            O().d();
        } else {
            O().C();
        }
        com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k W = W();
        W.b();
        h.f.b.l.b(videoSegment, "");
        h.f.b.l.d(videoSegment, "");
        if (TextUtils.isEmpty(videoSegment.f125484h)) {
            str = videoSegment.a(false);
        } else {
            str = videoSegment.f125484h;
        }
        h.f.b.l.b(str, "");
        SimpleDraweeView simpleDraweeView = W.f128165b;
        if (simpleDraweeView == null) {
            h.f.b.l.a("ivCover");
        }
        Drawable a2 = com.ss.android.ugc.tools.view.a.a(637534207, 637534207, 0, en.a(2.0d, com.ss.android.ugc.aweme.port.in.i.f115645a));
        h.f.b.l.b(a2, "");
        com.ss.android.ugc.aweme.shortvideo.editcut.m.a(simpleDraweeView, str, a2, en.a(48.0d, com.ss.android.ugc.aweme.port.in.i.f115645a), (db) W.f128168e.a(W, com.ss.android.ugc.aweme.shortvideo.editcut.b.a.k.f128163a[2]));
        Z().b(pVar.getFirst().intValue(), pVar.getSecond().intValue());
    }

    public final void a(h.p<Integer, Integer> pVar, h.p<Integer, Integer> pVar2) {
        G().c();
        Z().a(pVar, pVar2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar);
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.x = h.i.a((h.f.a.a) new b(this, fVar));
        this.y = h.i.a((h.f.a.a) new m(this, fVar));
        this.z = h.i.a((h.f.a.a) new n(this, fVar));
        this.A = h.i.a((h.f.a.a) new o(this, fVar));
        this.B = h.i.a((h.f.a.a) new p(this, fVar));
        this.f128225i = 1;
        this.f128226j = true;
        this.f128227k = -1;
        this.f128228l = -1;
        this.C = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);
        this.D = com.bytedance.o.b.a.a(getDiContainer(), VideoEditViewModel.class);
        this.E = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.f.class);
        this.F = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.n.class);
        this.G = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);
    }

    public final void a(boolean z2, boolean z3) {
        int i2;
        ArrayList arrayList;
        if (z3) {
            VideoEditViewModel Y = Y();
            h.f.b.l.d(Y, "");
            h.f.b.l.d(Y, "");
            List<VideoSegment> j2 = Y.j();
            if (j2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t2 : j2) {
                    if (!t2.f125485i) {
                        arrayList2.add(t2);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = h.a.z.INSTANCE;
            }
            if (arrayList.isEmpty()) {
                ((com.ss.android.ugc.aweme.shortvideo.editcut.f) this.E.a(this, f128224h[2])).v();
                return;
            }
        }
        this.w = true;
        O().C();
        W().d();
        if (R()) {
            T().d();
            U().b();
        }
        V().b();
        Z().a(z2, z3);
        TextView textView = this.t;
        if (textView == null) {
            h.f.b.l.a("tvDurationIndicator");
        }
        if (R()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
    }
}
