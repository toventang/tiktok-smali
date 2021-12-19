package com.ss.android.ugc.aweme.shortvideo.editcut.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.aw;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.bu;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.b.a.q;
import com.ss.android.ugc.aweme.shortvideo.editcut.r;
import com.ss.android.vesdk.x;
import com.zhiliaoapp.musically.R;
import h.f.b.y;
import h.z;
import java.util.List;
import java.util.Objects;

public abstract class a extends com.bytedance.scene.group.b implements com.bytedance.o.a, d {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f128100b = {new y(a.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(a.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new y(a.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new y(a.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(a.class, "editCutterViewModel", "getEditCutterViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/viewmodel/VEVideoCutterViewModel;", 0), new y(a.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new y(a.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};

    /* renamed from: c  reason: collision with root package name */
    protected View f128101c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a f128102d;

    /* renamed from: e  reason: collision with root package name */
    public final t f128103e = new t(this);

    /* renamed from: f  reason: collision with root package name */
    public final com.bytedance.scene.group.b f128104f;

    /* renamed from: g  reason: collision with root package name */
    public final int f128105g = R.id.wg;

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f128106h = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f128107i = com.bytedance.o.b.a.a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f128108j = com.bytedance.o.b.a.a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f128109k = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f128110l = com.bytedance.o.b.a.a(getDiContainer(), VEVideoCutterViewModel.class);
    private final h.h.d t = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.n.class);
    private final h.h.d u = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.r.class);
    private final h.h v = h.i.a((h.f.a.a) new b(this));
    private final h.h w = h.i.a((h.f.a.a) new C3339a(this));
    private final com.bytedance.o.f x;

    static {
        Covode.recordClassIndex(83960);
    }

    private final com.ss.android.ugc.aweme.shortvideo.editcut.a.a Q() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.f128106h.a(this, f128100b[0]);
    }

    /* access modifiers changed from: protected */
    public abstract int E();

    /* access modifiers changed from: protected */
    public final CutMultiVideoViewModel H() {
        return (CutMultiVideoViewModel) this.f128107i.a(this, f128100b[1]);
    }

    /* access modifiers changed from: package-private */
    public final VideoEditViewModel I() {
        return (VideoEditViewModel) this.f128108j.a(this, f128100b[2]);
    }

    /* access modifiers changed from: package-private */
    public final EditAdjustClipsBottomViewModel J() {
        return (EditAdjustClipsBottomViewModel) this.f128109k.a(this, f128100b[3]);
    }

    /* access modifiers changed from: protected */
    public final VEVideoCutterViewModel K() {
        return (VEVideoCutterViewModel) this.f128110l.a(this, f128100b[4]);
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ugc.aweme.shortvideo.editcut.n L() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.n) this.t.a(this, f128100b[5]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.editcut.r M() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.r) this.u.a(this, f128100b[6]);
    }

    public final SafeHandler N() {
        return (SafeHandler) this.v.getValue();
    }

    /* access modifiers changed from: protected */
    public final q O() {
        return (q) this.w.getValue();
    }

    @Override // com.bytedance.o.a
    public com.bytedance.o.f getDiContainer() {
        return this.x;
    }

    static final class b extends h.f.b.m implements h.f.a.a<SafeHandler> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83963);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ SafeHandler invoke() {
            return new SafeHandler(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$a  reason: collision with other inner class name */
    static final class C3339a extends h.f.b.m implements h.f.a.a<q> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3339a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.b.a$a$a  reason: collision with other inner class name */
        public static final class C3340a implements bu {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C3339a f128114a;

            static {
                Covode.recordClassIndex(83962);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.scene.bu
            public final float G() {
                return this.f128114a.this$0.G().getSelectedTime();
            }

            C3340a(C3339a aVar) {
                this.f128114a = aVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ q invoke() {
            q qVar = new q(this.this$0.getDiContainer(), this.this$0);
            ((aw) qVar).f125649a = new C3340a(this);
            return qVar;
        }
    }

    /* access modifiers changed from: protected */
    public final View F() {
        View view = this.f128101c;
        if (view == null) {
            h.f.b.l.a("ivRotate");
        }
        return view;
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a G() {
        com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = this.f128102d;
        if (aVar == null) {
            h.f.b.l.a("videoEditView");
        }
        return aVar;
    }

    @Override // com.bytedance.scene.j
    public final void v() {
        super.v();
        N().post(this.f128103e);
    }

    @Override // com.bytedance.scene.j
    public final void y() {
        super.y();
        N().removeCallbacks(this.f128103e);
    }

    /* access modifiers changed from: protected */
    public void P() {
        View c2 = c(R.id.c0t);
        h.f.b.l.b(c2, "");
        this.f128101c = c2;
        if (c2 == null) {
            h.f.b.l.a("ivRotate");
        }
        c2.setOnClickListener(new s(this));
    }

    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128219a;

        static {
            Covode.recordClassIndex(83981);
        }

        public final void run() {
            androidx.lifecycle.t<CutVideoContext> tVar = this.f128219a.I().w;
            h.f.b.l.b(tVar, "");
            if (tVar.getValue() != null) {
                long a2 = this.f128219a.M().a();
                if (a2 > 0) {
                    this.f128219a.H().a(a2, this.f128219a.I().j(), this.f128219a.I().l());
                }
                this.f128219a.N().postDelayed(this, 30);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        t(a aVar) {
            this.f128219a = aVar;
        }
    }

    public static final class s extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128217a;

        static {
            Covode.recordClassIndex(83980);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        s(a aVar) {
            this.f128217a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128217a.L().a(this.f128217a.J().a().getCurrentEditOriginIndex(), this.f128217a.G().getCurrentRotate());
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128136a;

        static {
            Covode.recordClassIndex(83965);
        }

        d(a aVar) {
            this.f128136a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128136a;
            a.a(aVar, aVar.G().getLeftSeekingValue(), null, false, 6);
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128150a;

        static {
            Covode.recordClassIndex(83966);
        }

        e(a aVar) {
            this.f128150a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128150a;
            a.a(aVar, aVar.G().getRightSeekingValue(), null, false, 6);
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128154a;

        static {
            Covode.recordClassIndex(83968);
        }

        g(a aVar) {
            this.f128154a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128154a;
            a.a(aVar, aVar.G().getRightSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateOut, false, 4);
            this.f128154a.J().g();
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128156a;

        static {
            Covode.recordClassIndex(83969);
        }

        h(a aVar) {
            this.f128156a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128156a;
            a.a(aVar, aVar.G().getPlayingPosition(), null, false, 6);
        }
    }

    static final class i<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128158a;

        static {
            Covode.recordClassIndex(83970);
        }

        i(a aVar) {
            this.f128158a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128158a;
            a.a(aVar, aVar.G().getSingleSeekTime(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateInOut, false, 4);
            this.f128158a.J().g();
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128160a;

        static {
            Covode.recordClassIndex(83971);
        }

        j(a aVar) {
            this.f128160a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128160a;
            a.a(aVar, aVar.G().getLeftSeekingValue(), null, false, 2);
        }
    }

    static final class k<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128162a;

        static {
            Covode.recordClassIndex(83972);
        }

        k(a aVar) {
            this.f128162a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128162a;
            aVar.a(aVar.G().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateInOut, false);
            this.f128162a.J().g();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83974);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.G().a(bool.booleanValue());
            return z.f158842a;
        }
    }

    static final class o<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128184a;

        static {
            Covode.recordClassIndex(83976);
        }

        o(a aVar) {
            this.f128184a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            View F = this.f128184a.F();
            if (num != null && num.intValue() == 1) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            F.setVisibility(i2);
        }
    }

    static final class p<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128192a;

        static {
            Covode.recordClassIndex(83977);
        }

        p(a aVar) {
            this.f128192a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null && (!bool.booleanValue())) {
                bool.booleanValue();
                a aVar = this.f128192a;
                aVar.a(aVar.G().getPlayingPosition(), x.f.EDITOR_SEEK_FLAG_LastSeek, false);
            }
        }
    }

    static final class q<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128194a;

        static {
            Covode.recordClassIndex(83978);
        }

        q(a aVar) {
            this.f128194a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Long l2 = (Long) obj;
            if (l2 != null) {
                this.f128194a.a(l2.longValue(), x.f.EDITOR_SEEK_FLAG_OnGoing, false);
            }
        }
    }

    static final class r<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128199a;

        static {
            Covode.recordClassIndex(83979);
        }

        r(a aVar) {
            this.f128199a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            this.f128199a.J().a(this.f128199a.G().getSelectedTime());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar) {
        h.f.b.l.d(aVar, "");
        this.f128102d = aVar;
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128118a;

        static {
            Covode.recordClassIndex(83964);
        }

        c(a aVar) {
            this.f128118a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a aVar = (com.ss.android.ugc.aweme.shortvideo.cut.viewmodel.a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f126290d)) != null) {
                if (valueOf.intValue() == 1) {
                    this.f128118a.N().post(this.f128118a.f128103e);
                } else if (valueOf.intValue() == 2 || valueOf.intValue() == 3) {
                    this.f128118a.N().removeCallbacks(this.f128118a.f128103e);
                }
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128152a;

        static {
            Covode.recordClassIndex(83967);
        }

        f(a aVar) {
            this.f128152a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            a aVar = this.f128152a;
            a.a(aVar, aVar.G().getLeftSeekingValue(), x.f.EDITOR_SEEK_FLAG_LAST_UpdateIn, false, 4);
            this.f128152a.H().f125338m = this.f128152a.G().getLeftSeekingValue();
            this.f128152a.J().g();
        }
    }

    static final class l<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f128174a;

        static {
            Covode.recordClassIndex(83973);
        }

        l(a aVar) {
            this.f128174a = aVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            EditAdjustClipsBottomViewModel J = this.f128174a.J();
            h.f.b.l.b(bool, "");
            J.d(new EditAdjustClipsBottomViewModel.l(bool.booleanValue()));
            this.f128174a.G().setEnabled(!bool.booleanValue());
            this.f128174a.F().setEnabled(!bool.booleanValue());
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.shortvideo.editcut.t>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(83975);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.shortvideo.editcut.t> dVar) {
            com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.shortvideo.editcut.t> dVar2 = dVar;
            h.f.b.l.d(dVar2, "");
            T t = dVar2.f39404b;
            if (t == null) {
                this.this$0.G().e();
            } else {
                this.this$0.G().a(new androidx.core.g.e<>(Float.valueOf((float) t.f128413b), Float.valueOf((float) t.f128414c)), (List<VideoSegment>) null);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public void a(Bundle bundle) {
        super.a(bundle);
        P();
        if (this.f128102d != null) {
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = this.f128102d;
            if (aVar == null) {
                h.f.b.l.a("videoEditView");
            }
            com.ss.android.ugc.aweme.shortvideo.edit.c.b.a(aVar);
            boolean z = Q().f128080b;
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar2 = this.f128102d;
            if (aVar2 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar2.setMultiEditEnableForStickPointMode(true);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar3 = this.f128102d;
            if (aVar3 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar3.setExtractFramesInRoughMode(true);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar4 = this.f128102d;
            if (aVar4 == null) {
                h.f.b.l.a("videoEditView");
            }
            boolean z2 = false;
            aVar4.setLayoutDirection(0);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar5 = this.f128102d;
            if (aVar5 == null) {
                h.f.b.l.a("videoEditView");
            }
            Boolean isMusicSyncMode = J().a().isMusicSyncMode();
            if (isMusicSyncMode != null) {
                z2 = isMusicSyncMode.booleanValue();
            }
            aVar5.setDefaultMode(z2);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar6 = this.f128102d;
            if (aVar6 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar6.a(com.bytedance.scene.ktx.c.b(this), H(), I(), L().b(), z ? 1 : 0);
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar7 = this.f128102d;
            if (aVar7 == null) {
                h.f.b.l.a("videoEditView");
            }
            aVar7.setEditViewHeight(!Q().f128080b);
            com.ss.android.ugc.aweme.shortvideo.editcut.n L = L();
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar8 = this.f128102d;
            if (aVar8 == null) {
                h.f.b.l.a("videoEditView");
            }
            L.a(aVar8);
        }
        K().a().observe(this, new c(this));
        f.a.b.b unused = J().a(this, b.f128222a, new ah(), new m(this));
        f.a.b.b unused2 = J().a(this, c.f128223a, new ah(), new n(this));
        I().f126129b.observe(this, new o(this));
        I().f126130c.observe(this, new p(this));
        I().f126132e.observe(this, new q(this));
        I().f126131d.observe(this, new r(this));
        I().f126134g.observe(this, new d(this));
        I().f126133f.observe(this, new e(this));
        I().f126135h.observe(this, new f(this));
        I().f126138k.observe(this, new g(this));
        I().f126139l.observe(this, new h(this));
        I().f126140m.observe(this, new i(this));
        I().f126136i.observe(this, new j(this));
        I().f126137j.observe(this, new k(this));
        I().s.observe(this, new l(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.f.b.l.d(layoutInflater, "");
        h.f.b.l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.d3, viewGroup, false);
        com.a.a(layoutInflater, E(), (FrameLayout) a2.findViewById(R.id.b4k), true);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    public a(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.x = fVar;
        this.f128104f = bVar;
    }

    public final void a(long j2, x.f fVar, boolean z) {
        r.a.a(M(), j2, fVar, false, 4);
        if (z) {
            EditAdjustClipsBottomViewModel J = J();
            com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a aVar = this.f128102d;
            if (aVar == null) {
                h.f.b.l.a("videoEditView");
            }
            J.a(aVar.getSelectedTime());
        }
    }

    static /* synthetic */ void a(a aVar, long j2, x.f fVar, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            fVar = x.f.EDITOR_SEEK_FLAG_OnGoing;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        aVar.a(j2, fVar, z);
    }
}
