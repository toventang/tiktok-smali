package com.ss.android.ugc.aweme.shortvideo.editcut;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.scene.j;
import com.ss.android.ugc.aweme.effect.s;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.dh;
import com.zhiliaoapp.musically.R;
import dmt.av.video.u;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.z;
import java.util.Objects;

public final class k extends com.bytedance.scene.group.b implements com.bytedance.o.a {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ i[] f128334b = {new y(k.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new y(k.class, "editAdjustApi", "getEditAdjustApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsApi;", 0), new y(k.class, "editAdjustClipsModel", "getEditAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(k.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(k.class, "videoEditViewModel", "getVideoEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new y(k.class, "playerController", "getPlayerController()Lcom/ss/android/ugc/aweme/shortvideo/editcut/IPlayerController;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f128335h = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    final h.h.d f128336c = com.bytedance.o.b.a.a(getDiContainer(), r.class);

    /* renamed from: d  reason: collision with root package name */
    public View f128337d;

    /* renamed from: e  reason: collision with root package name */
    public View f128338e;

    /* renamed from: f  reason: collision with root package name */
    public View f128339f;

    /* renamed from: g  reason: collision with root package name */
    public View f128340g;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f128341i = h.i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f128342j = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.preview.a.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f128343k = com.bytedance.o.b.a.a(getDiContainer(), f.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f128344l = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);
    private final h.h.d t = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);
    private final h.h.d u = com.bytedance.o.b.a.a(getDiContainer(), VideoEditViewModel.class);
    private View v;
    private final com.bytedance.o.f w;

    static {
        Covode.recordClassIndex(84173);
    }

    private final com.ss.android.ugc.aweme.shortvideo.preview.a G() {
        return (com.ss.android.ugc.aweme.shortvideo.preview.a) this.f128342j.a(this, f128334b[0]);
    }

    private final EditAdjustClipsBottomViewModel H() {
        return (EditAdjustClipsBottomViewModel) this.t.a(this, f128334b[3]);
    }

    public final f E() {
        return (f) this.f128343k.a(this, f128334b[1]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a F() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.f128344l.a(this, f128334b[2]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84174);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.o.a
    public final com.bytedance.o.f getDiContainer() {
        return this.w;
    }

    private final int I() {
        return (int) n.b(this.f42913m, 52.0f);
    }

    private final int J() {
        float f2;
        Activity activity = this.f42913m;
        if (F().f128080b) {
            f2 = 320.0f;
        } else {
            f2 = 265.0f;
        }
        return (int) n.b(activity, f2);
    }

    private final int K() {
        return (((dh.e(this.f42913m) - I()) - J()) - dh.c(this.f42913m)) - dh.d(this.f42913m);
    }

    static final class b extends m implements h.f.a.a<com.ss.android.ugc.aweme.shortvideo.editcut.b.a> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(84175);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.editcut.b.a invoke() {
            if (this.this$0.F().f128080b) {
                return new com.ss.android.ugc.aweme.shortvideo.editcut.b.e(this.this$0.getDiContainer(), this.this$0);
            }
            return new com.ss.android.ugc.aweme.shortvideo.editcut.b.k(this.this$0.getDiContainer(), this.this$0);
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128345a;

        static {
            Covode.recordClassIndex(84176);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(k kVar) {
            this.f128345a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128345a.E().a(false);
        }
    }

    public static final class d extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128346a;

        static {
            Covode.recordClassIndex(84177);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(k kVar) {
            this.f128346a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128346a.E().a(true);
        }
    }

    public static final class e extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128347a;

        static {
            Covode.recordClassIndex(84178);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(k kVar) {
            this.f128347a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            int i2;
            k kVar = this.f128347a;
            boolean d2 = ((r) kVar.f128336c.a(kVar, k.f128334b[5])).d();
            View view2 = this.f128347a.f128338e;
            if (view2 == null) {
                l.a("ivPlay");
            }
            if (d2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }

    public static final /* synthetic */ View a(k kVar) {
        View view = kVar.f128337d;
        if (view == null) {
            l.a("titleBar");
        }
        return view;
    }

    static final class f<T> implements com.bytedance.als.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128348a;

        static {
            Covode.recordClassIndex(84179);
        }

        f(k kVar) {
            this.f128348a = kVar;
        }

        @Override // androidx.lifecycle.u, com.bytedance.als.m
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Integer num = (Integer) obj;
            View a2 = k.a(this.f128348a);
            if (num != null && num.intValue() == 2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            a2.setVisibility(i2);
        }
    }

    static final class g extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(84180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.f128340g;
            if (view == null) {
                l.a("tvSave");
            }
            view.setEnabled(!booleanValue);
            View view2 = this.this$0.f128339f;
            if (view2 == null) {
                l.a("tvCancel");
            }
            view2.setEnabled(!booleanValue);
            return z.f158842a;
        }
    }

    static final class h<T> implements androidx.core.g.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128349a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f128350b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128351c;

        static {
            Covode.recordClassIndex(84181);
        }

        h(k kVar, boolean z, h.f.a.a aVar) {
            this.f128349a = kVar;
            this.f128350b = z;
            this.f128351c = aVar;
        }

        @Override // androidx.core.g.a
        public final /* synthetic */ void a(Object obj) {
            int i2;
            com.bytedance.scene.group.b bVar;
            View a2 = k.a(this.f128349a);
            if (this.f128350b) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            a2.setVisibility(i2);
            if (!this.f128350b && (bVar = (com.bytedance.scene.group.b) this.f128349a.o) != null) {
                bVar.d(this.f128349a);
            }
            h.f.a.a aVar = this.f128351c;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public k(com.bytedance.o.f fVar) {
        l.d(fVar, "");
        this.w = fVar;
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        com.ss.android.ugc.aweme.shortvideo.editcut.b.a aVar = (com.ss.android.ugc.aweme.shortvideo.editcut.b.a) this.f128341i.getValue();
        if (!aVar.f128104f.f(aVar)) {
            aVar.f128104f.a(aVar.f128105g, aVar, aVar.a());
        }
        if (!aVar.f128104f.g(aVar)) {
            aVar.f128104f.e(aVar);
        }
        View c2 = c(R.id.dp_);
        l.b(c2, "");
        this.f128337d = c2;
        View c3 = c(R.id.bzv);
        l.b(c3, "");
        this.f128338e = c3;
        View c4 = c(R.id.wg);
        l.b(c4, "");
        this.v = c4;
        View c5 = c(R.id.ewf);
        l.b(c5, "");
        this.f128339f = c5;
        if (c5 == null) {
            l.a("tvCancel");
        }
        c5.setOnClickListener(new c(this));
        View c6 = c(R.id.f6c);
        l.b(c6, "");
        this.f128340g = c6;
        if (c6 == null) {
            l.a("tvSave");
        }
        c6.setOnClickListener(new d(this));
        c(R.id.af0).setOnClickListener(new e(this));
        ((VideoEditViewModel) this.u.a(this, f128334b[4])).f126129b.observe(this, new f(this));
        f.a.b.b unused = H().a(this, l.f128352a, new ah(), new g(this));
    }

    @Override // com.bytedance.scene.j, com.bytedance.scene.group.b
    public final /* synthetic */ View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a(layoutInflater, viewGroup);
    }

    @Override // com.bytedance.scene.group.b
    public final ViewGroup b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.d4, viewGroup, false);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) a2;
    }

    public final void a(boolean z, h.f.a.a<z> aVar) {
        if (z) {
            j jVar = this.o;
            com.bytedance.scene.group.b bVar = null;
            if (!(jVar instanceof com.bytedance.scene.group.b)) {
                jVar = null;
            }
            com.bytedance.scene.group.b bVar2 = (com.bytedance.scene.group.b) jVar;
            if (bVar2 == null || !bVar2.g(this)) {
                j jVar2 = this.o;
                if (jVar2 instanceof com.bytedance.scene.group.b) {
                    bVar = jVar2;
                }
                com.bytedance.scene.group.b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.e(this);
                }
            }
            G().a(u.a.a(com.ss.android.ugc.aweme.themechange.base.c.a(true, false, false, false), I() + dh.c(this.f42913m), J(), K(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d(), false, false, 960).a());
            H().b(((float) K()) / ((float) com.ss.android.ugc.aweme.adaptation.a.f66177a.b(com.ss.android.ugc.aweme.adaptation.a.c())));
        } else {
            G().a(u.a.a(t().getResources().getColor(R.color.a2), I() + dh.c(this.f42913m), J(), K(), com.ss.android.ugc.aweme.adaptation.a.f66177a.d()));
        }
        View view = this.f128338e;
        if (view == null) {
            l.a("ivPlay");
        }
        view.setVisibility(8);
        if (!z) {
            View view2 = this.f128337d;
            if (view2 == null) {
                l.a("titleBar");
            }
            view2.setVisibility(4);
        }
        View view3 = this.v;
        if (view3 == null) {
            l.a("bottomView");
        }
        s.a(view3, z, J(), this.n, new h(this, z, aVar));
    }
}
