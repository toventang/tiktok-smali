package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.jedi.arch.ah;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.n;
import com.ss.android.ugc.aweme.themechange.base.AVDmtCheckableImageButton;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;

public final class r extends a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ h.k.i[] f128200a = {new y(r.class, "adjustClipsModel", "getAdjustClipsModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/model/EditAdjustClipsModel;", 0), new y(r.class, "editViewModel", "getEditViewModel()Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VideoEditViewModel;", 0), new y(r.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0), new y(r.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f128201g = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public TextView f128202b;

    /* renamed from: c  reason: collision with root package name */
    public AVDmtCheckableImageButton f128203c;

    /* renamed from: d  reason: collision with root package name */
    public View f128204d;

    /* renamed from: e  reason: collision with root package name */
    public View f128205e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f128206f;

    /* renamed from: h  reason: collision with root package name */
    private final String f128207h = "EditToolbarScene";

    /* renamed from: i  reason: collision with root package name */
    private final h.h.d f128208i = com.bytedance.o.b.a.a(getDiContainer(), com.ss.android.ugc.aweme.shortvideo.editcut.a.a.class);

    /* renamed from: j  reason: collision with root package name */
    private final h.h.d f128209j = com.bytedance.o.b.a.a(getDiContainer(), VideoEditViewModel.class);

    /* renamed from: k  reason: collision with root package name */
    private final h.h.d f128210k = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: l  reason: collision with root package name */
    private final h.h.d f128211l = com.bytedance.o.b.a.a(getDiContainer(), n.class);

    static {
        Covode.recordClassIndex(84023);
    }

    private final EditAdjustClipsBottomViewModel E() {
        return (EditAdjustClipsBottomViewModel) this.f128210k.a(this, f128200a[2]);
    }

    public final com.ss.android.ugc.aweme.shortvideo.editcut.a.a C() {
        return (com.ss.android.ugc.aweme.shortvideo.editcut.a.a) this.f128208i.a(this, f128200a[0]);
    }

    public final n D() {
        return (n) this.f128211l.a(this, f128200a[3]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84024);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128207h;
    }

    public static final class g extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f128214a;

        static {
            Covode.recordClassIndex(84030);
        }

        static final class a extends m implements h.f.a.a<z> {
            final /* synthetic */ g this$0;

            static {
                Covode.recordClassIndex(84031);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar) {
                super(0);
                this.this$0 = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f128214a.D().t();
                return z.f158842a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(r rVar) {
            this.f128214a = rVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            r rVar = this.f128214a;
            a aVar = new a(this);
            Activity activity = rVar.f42913m;
            if (activity != null) {
                new a.C0731a(activity).b(R.string.b69).b(R.string.d6h, (DialogInterface.OnClickListener) null, false).a(R.string.b5g, (DialogInterface.OnClickListener) new i(aVar), false).a().b().show();
            }
        }
    }

    public static final class f extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f128213a;

        static {
            Covode.recordClassIndex(84029);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        f(r rVar) {
            this.f128213a = rVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            r.a(this.f128213a).toggle();
            this.f128213a.D().b(r.a(this.f128213a).isChecked());
        }
    }

    public static final class h extends com.ss.android.ugc.aweme.views.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f128215a;

        static {
            Covode.recordClassIndex(84032);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(r rVar) {
            this.f128215a = rVar;
        }

        @Override // com.ss.android.ugc.aweme.views.d
        public final void a(View view) {
            this.f128215a.D().s();
        }
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(84026);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.f128206f = bool.booleanValue();
            return z.f158842a;
        }
    }

    public static final /* synthetic */ AVDmtCheckableImageButton a(r rVar) {
        AVDmtCheckableImageButton aVDmtCheckableImageButton = rVar.f128203c;
        if (aVDmtCheckableImageButton == null) {
            l.a("ivSpeed");
        }
        return aVDmtCheckableImageButton;
    }

    public static final /* synthetic */ View b(r rVar) {
        View view = rVar.f128205e;
        if (view == null) {
            l.a("ivRetake");
        }
        return view;
    }

    public static final /* synthetic */ View c(r rVar) {
        View view = rVar.f128204d;
        if (view == null) {
            l.a("ivDelete");
        }
        return view;
    }

    static final class d extends m implements h.f.a.b<Float, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(84027);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Float f2) {
            float floatValue = f2.floatValue();
            TextView textView = this.this$0.f128202b;
            if (textView == null) {
                l.a("tvSelectedTime");
            }
            Activity t = this.this$0.t();
            l.b(t, "");
            textView.setText(com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.d.a(t, floatValue, this.this$0.f128206f));
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(84028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar) {
            super(1);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            r.a(this.this$0).setEnabled(!booleanValue);
            r.c(this.this$0).setEnabled(!booleanValue);
            r.b(this.this$0).setEnabled(!booleanValue);
            return z.f158842a;
        }
    }

    static final class b<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f128212a;

        static {
            Covode.recordClassIndex(84025);
        }

        b(r rVar) {
            this.f128212a = rVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            int i3;
            Integer num = (Integer) obj;
            View b2 = r.b(this.f128212a);
            int i4 = 0;
            if (com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(this.f128212a.C()) || num == null || num.intValue() != 2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            b2.setVisibility(i2);
            AVDmtCheckableImageButton a2 = r.a(this.f128212a);
            if (!com.ss.android.ugc.aweme.shortvideo.editcut.a.b.a(this.f128212a.C()) || ((num != null && num.intValue() == 1) || this.f128212a.f128206f)) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            a2.setVisibility(i3);
            View c2 = r.c(this.f128212a);
            if (num == null || num.intValue() != 2) {
                i4 = 8;
            }
            c2.setVisibility(i4);
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.f71);
        l.b(c2, "");
        this.f128202b = (TextView) c2;
        View c3 = c(R.id.c1b);
        l.b(c3, "");
        this.f128203c = (AVDmtCheckableImageButton) c3;
        View c4 = c(R.id.bw7);
        l.b(c4, "");
        this.f128204d = c4;
        View c5 = c(R.id.c0i);
        l.b(c5, "");
        this.f128205e = c5;
        ((VideoEditViewModel) this.f128209j.a(this, f128200a[1])).f126129b.observe(this, new b(this));
        f.a.b.b unused = E().a(this, s.f128218a, new ah(), new c(this));
        f.a.b.b unused2 = E().a(this, t.f128220a, new ah(), new d(this));
        f.a.b.b unused3 = E().a(this, u.f128221a, new ah(), new e(this));
        AVDmtCheckableImageButton aVDmtCheckableImageButton = this.f128203c;
        if (aVDmtCheckableImageButton == null) {
            l.a("ivSpeed");
        }
        aVDmtCheckableImageButton.setOnClickListener(new f(this));
        View view = this.f128204d;
        if (view == null) {
            l.a("ivDelete");
        }
        view.setOnClickListener(new g(this));
        View view2 = this.f128205e;
        if (view2 == null) {
            l.a("ivRetake");
        }
        view2.setOnClickListener(new h(this));
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f128216a;

        static {
            Covode.recordClassIndex(84033);
        }

        i(h.f.a.a aVar) {
            this.f128216a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f128216a.invoke();
        }
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.d1, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar, R.id.b6m);
        l.d(fVar, "");
        l.d(bVar, "");
    }
}
