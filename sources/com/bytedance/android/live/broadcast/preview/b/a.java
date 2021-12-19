package com.bytedance.android.live.broadcast.preview.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class a extends com.bytedance.android.live.broadcast.a.a {

    /* renamed from: a  reason: collision with root package name */
    private final h.h f8116a = com.bytedance.android.livesdkapi.m.d.a(e.f8129a);

    /* renamed from: b  reason: collision with root package name */
    private final h.h f8117b = com.bytedance.android.livesdkapi.m.d.a(c.f8126a);

    /* renamed from: c  reason: collision with root package name */
    private final h.h f8118c = com.bytedance.android.livesdkapi.m.d.a(C0118a.f8122a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f8119d = com.bytedance.android.livesdkapi.m.d.a(new d(this));

    /* renamed from: e  reason: collision with root package name */
    private final b f8120e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private HashMap f8121f;

    static {
        Covode.recordClassIndex(4042);
    }

    @Override // com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f8121f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f8121f == null) {
            this.f8121f = new HashMap();
        }
        View view = (View) this.f8121f.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f8121f.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final c c() {
        return (c) this.f8116a.getValue();
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.broadcast.a.a, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    static final class e extends m implements h.f.a.a<c> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f8129a = new e();

        static {
            Covode.recordClassIndex(4050);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return new c();
        }
    }

    public static final class b implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8123a;

        /* renamed from: b  reason: collision with root package name */
        private final h.h f8124b = i.a((h.f.a.a) C0119a.f8125a);

        static {
            Covode.recordClassIndex(4044);
        }

        /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$b$a  reason: collision with other inner class name */
        static final class C0119a extends m implements h.f.a.a<Float> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0119a f8125a = new C0119a();

            static {
                Covode.recordClassIndex(4045);
            }

            C0119a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Float invoke() {
                return Float.valueOf(((float) y.b()) * 0.75f);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.f8123a = aVar;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            boolean z;
            int i10;
            int i11;
            int i12;
            int i13;
            l.d(view, "");
            if (this.f8123a.o) {
                int i14 = 0;
                if (((float) i5) < ((Number) this.f8124b.getValue()).floatValue()) {
                    z = true;
                } else {
                    z = false;
                }
                c c2 = this.f8123a.c();
                if (c2.isViewValid()) {
                    ((BlockWordView) c2.a(R.id.u5)).a(z);
                    LinearLayout linearLayout = (LinearLayout) c2.a(R.id.a_8);
                    l.b(linearLayout, "");
                    int i15 = 8;
                    if (z) {
                        i10 = 8;
                    } else {
                        i10 = 0;
                    }
                    linearLayout.setVisibility(i10);
                    ConstraintLayout constraintLayout = (ConstraintLayout) c2.a(R.id.dh_);
                    l.b(constraintLayout, "");
                    if (z || c2.f8134b == 0) {
                        i11 = 8;
                    } else {
                        i11 = 0;
                    }
                    constraintLayout.setVisibility(i11);
                    LinearLayout linearLayout2 = (LinearLayout) c2.a(R.id.cnb);
                    l.b(linearLayout2, "");
                    if (z) {
                        i12 = 8;
                    } else {
                        i12 = 0;
                    }
                    linearLayout2.setVisibility(i12);
                    LinearLayout linearLayout3 = (LinearLayout) c2.a(R.id.bb1);
                    l.b(linearLayout3, "");
                    if (z || !c2.f8135c) {
                        i13 = 8;
                    } else {
                        i13 = 0;
                    }
                    linearLayout3.setVisibility(i13);
                    LiveTextView liveTextView = (LiveTextView) c2.a(R.id.f9h);
                    l.b(liveTextView, "");
                    if (!z) {
                        i15 = 0;
                    }
                    liveTextView.setVisibility(i15);
                    BlockWordView blockWordView = (BlockWordView) c2.a(R.id.u5);
                    l.b(blockWordView, "");
                    ViewGroup.LayoutParams layoutParams = blockWordView.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (z) {
                        i14 = y.a(30.0f);
                    }
                    layoutParams2.topMargin = i14;
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.a$a  reason: collision with other inner class name */
    static final class C0118a extends m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0118a f8122a = new C0118a();

        static {
            Covode.recordClassIndex(4043);
        }

        C0118a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.k.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.k.a.class)).getAddModeratorFragment();
        }
    }

    static final class c extends m implements h.f.a.a<Fragment> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f8126a = new c();

        static {
            Covode.recordClassIndex(4046);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.k.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.k.a.class)).getModeratorListFragment();
        }
    }

    static final class d extends m implements h.f.a.a<Fragment> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(4047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Fragment invoke() {
            return ((com.bytedance.android.live.adminsetting.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.adminsetting.b.class)).getMuteDurationSettingFragment(new View.OnClickListener(this) {
                /* class com.bytedance.android.live.broadcast.preview.b.a.d.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ d f8127a;

                static {
                    Covode.recordClassIndex(4048);
                }

                {
                    this.f8127a = r1;
                }

                public final void onClick(View view) {
                    DataChannel dataChannel = this.f8127a.this$0.p;
                    if (dataChannel != null) {
                        dataChannel.b(r.class, s.a(q.GUIDE));
                    }
                }
            }, AnonymousClass2.f8128a);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b64);
        bVar.f22375b = R.style.a2d;
        bVar.a(new ColorDrawable(0));
        bVar.f22380g = 80;
        bVar.f22382i = -1;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.by;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.by;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
            Context a3 = com.bytedance.android.live.design.a.a.a(getContext());
            l.b(a3, "");
            p.a(new d(a3));
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f8130a;

        static {
            Covode.recordClassIndex(4051);
        }

        f(a aVar) {
            this.f8130a = aVar;
        }

        public final void onClick(View view) {
            this.f8130a.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.android.live.broadcast.api.blockword.b.f7517a = true;
    }

    static final class h extends m implements h.f.a.b<z, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(4053);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final /* synthetic */ class g extends j implements h.f.a.b<q, z> {
        static {
            Covode.recordClassIndex(4052);
        }

        g(a aVar) {
            super(1, aVar, a.class, "switchPage", "switchPage(Lcom/bytedance/android/livesdk/dataChannel/BroadcastDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(q qVar) {
            q qVar2 = qVar;
            l.d(qVar2, "");
            ((a) this.receiver).a(qVar2);
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.bytedance.android.live.broadcast.api.blockword.b.f7517a = false;
        if (this.o) {
            c c2 = c();
            if (c2.isViewValid()) {
                ((BlockWordView) c2.a(R.id.u5)).a();
            }
        }
    }

    public final void a(q qVar) {
        Fragment fragment;
        n a2 = getChildFragmentManager().a();
        if (qVar.getGoNextPage()) {
            a2.a(R.anim.er, R.anim.en);
        } else {
            a2.a(R.anim.em, R.anim.es);
        }
        int i2 = b.f8132a[qVar.ordinal()];
        if (i2 == 1) {
            fragment = c();
        } else if (i2 == 2) {
            fragment = (Fragment) this.f8117b.getValue();
        } else if (i2 == 3) {
            fragment = (Fragment) this.f8118c.getValue();
        } else if (i2 == 4) {
            fragment = (Fragment) this.f8119d.getValue();
        } else {
            return;
        }
        if (fragment != null) {
            a2.b(R.id.b94, fragment).b();
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        View decorView;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null)) {
            decorView.addOnLayoutChangeListener(this.f8120e);
        }
        a_(R.id.d0w).setOnClickListener(new f(this));
        getChildFragmentManager().a().a(R.id.b94, c()).b();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, r.class, (h.f.a.b) new g(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.h.class, (h.f.a.b) new h(this));
        }
    }
}
