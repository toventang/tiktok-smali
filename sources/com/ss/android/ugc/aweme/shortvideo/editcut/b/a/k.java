package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.o.f;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.utils.db;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.k.i;
import h.z;

public final class k extends a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ i[] f128163a = {new y(k.class, "cutMultiVideoViewModel", "getCutMultiVideoViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/CutMultiVideoViewModel;", 0), new y(k.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(k.class, "thumbnailCache", "getThumbnailCache()Lcom/ss/android/ugc/aweme/utils/FrameCache;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f128164f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public SimpleDraweeView f128165b;

    /* renamed from: c  reason: collision with root package name */
    public View f128166c;

    /* renamed from: d  reason: collision with root package name */
    public View f128167d;

    /* renamed from: e  reason: collision with root package name */
    public final h.h.d f128168e = com.bytedance.o.b.a.a(getDiContainer(), db.class);

    /* renamed from: g  reason: collision with root package name */
    private final String f128169g = "SingleEditModeBottomScene";

    /* renamed from: h  reason: collision with root package name */
    private final h.h.d f128170h = com.bytedance.o.b.a.a(getDiContainer(), CutMultiVideoViewModel.class);

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f128171i = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    static {
        Covode.recordClassIndex(84006);
    }

    public final CutMultiVideoViewModel C() {
        return (CutMultiVideoViewModel) this.f128170h.a(this, f128163a[0]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84007);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128169g;
    }

    public static final class b extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128172a;

        static {
            Covode.recordClassIndex(84008);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(k kVar) {
            this.f128172a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128172a.C().c();
        }
    }

    public static final class c extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f128173a;

        static {
            Covode.recordClassIndex(84009);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(k kVar) {
            this.f128173a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128173a.C().d();
        }
    }

    static final class d extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(84010);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            View view = this.this$0.f128166c;
            if (view == null) {
                l.a("ivCancel");
            }
            view.setEnabled(!booleanValue);
            View view2 = this.this$0.f128167d;
            if (view2 == null) {
                l.a("ivSave");
            }
            view2.setEnabled(!booleanValue);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.ffs);
        l.b(c2, "");
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) c2;
        this.f128165b = simpleDraweeView;
        if (simpleDraweeView == null) {
            l.a("ivCover");
        }
        com.ss.android.ugc.aweme.shortvideo.cut.m.a(simpleDraweeView);
        View c3 = c(R.id.bt5);
        l.b(c3, "");
        this.f128166c = c3;
        if (c3 == null) {
            l.a("ivCancel");
        }
        c3.setOnClickListener(new b(this));
        View c4 = c(R.id.bth);
        l.b(c4, "");
        this.f128167d = c4;
        if (c4 == null) {
            l.a("ivSave");
        }
        c4.setOnClickListener(new c(this));
        f.a.b.b unused = ((EditAdjustClipsBottomViewModel) this.f128171i.a(this, f128163a[1])).a(this, l.f128175a, new ah(), new d(this));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.d0, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar, R.id.b4i);
        l.d(fVar, "");
        l.d(bVar, "");
    }
}
