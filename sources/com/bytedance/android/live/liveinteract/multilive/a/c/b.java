package com.bytedance.android.live.liveinteract.multilive.a.c;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.liveinteract.multiguest.a.b.a;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multilive.a.a.i;
import com.bytedance.android.live.liveinteract.multilive.a.d.j;
import com.bytedance.android.live.liveinteract.multilive.a.d.l;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.h;
import h.n;
import h.z;
import java.util.HashMap;
import java.util.Objects;

public final class b extends l {

    /* renamed from: e  reason: collision with root package name */
    public static final a f11489e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a.AbstractC0206a f11490a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c f11491b;

    /* renamed from: c  reason: collision with root package name */
    public a.EnumC0216a f11492c;

    /* renamed from: d  reason: collision with root package name */
    public i f11493d;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f11494f;

    /* renamed from: g  reason: collision with root package name */
    private final h f11495g;

    /* renamed from: h  reason: collision with root package name */
    private final h f11496h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f11497i;

    static {
        Covode.recordClassIndex(6211);
    }

    private final j e() {
        return (j) this.f11495g.getValue();
    }

    private final com.bytedance.android.live.liveinteract.multilive.a.d.a f() {
        return (com.bytedance.android.live.liveinteract.multilive.a.d.a) this.f11496h.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.a.d.l, com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f11497i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.a.d.l, com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f11497i == null) {
            this.f11497i = new HashMap();
        }
        View view = (View) this.f11497i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f11497i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.live.liveinteract.multilive.a.d.l, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6212);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b a(DataChannel dataChannel, a.AbstractC0206a aVar, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar, a.EnumC0216a aVar2, i iVar) {
            h.f.b.l.d(dataChannel, "");
            b bVar = new b((byte) 0);
            bVar.p = dataChannel;
            bVar.f11490a = aVar;
            bVar.f11491b = cVar;
            bVar.f11492c = aVar2;
            bVar.f11493d = iVar;
            return bVar;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.a.c.b$b  reason: collision with other inner class name */
    static final class RunnableC0226b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11498a;

        static {
            Covode.recordClassIndex(6213);
        }

        RunnableC0226b(b bVar) {
            this.f11498a = bVar;
        }

        public final void run() {
            b.super.dismiss();
        }
    }

    public final boolean d() {
        if (this.f11492c == a.EnumC0216a.GO_LIVE) {
            return true;
        }
        return false;
    }

    static final class c extends m implements h.f.a.a<com.bytedance.android.live.liveinteract.multilive.a.d.a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6214);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.multilive.a.d.a invoke() {
            b bVar = this.this$0;
            DataChannel dataChannel = bVar.p;
            a.AbstractC0206a aVar = this.this$0.f11490a;
            a.EnumC0216a aVar2 = this.this$0.f11492c;
            com.bytedance.android.live.liveinteract.multilive.a.d.a aVar3 = new com.bytedance.android.live.liveinteract.multilive.a.d.a();
            aVar3.f11505e = bVar;
            aVar3.f11510j = dataChannel;
            aVar3.f11506f = aVar;
            aVar3.f11512l = aVar2;
            return aVar3;
        }
    }

    private b() {
        this.f11495g = h.i.a((h.f.a.a) new d(this));
        this.f11496h = h.i.a((h.f.a.a) new c(this));
    }

    private final Fragment g() {
        Fragment e2;
        if (d()) {
            e2 = f();
            h.f.b.l.b(e2, "");
        } else {
            e2 = e();
        }
        return e2;
    }

    @Override // com.bytedance.android.livesdk.v
    public final boolean i() {
        com.bytedance.android.live.liveinteract.multilive.a.d.a f2 = f();
        h.f.b.l.b(f2, "");
        if (!f2.mStatusActive) {
            return super.i();
        }
        f().c();
        return true;
    }

    static final class d extends m implements h.f.a.a<j> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6215);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            b bVar = this.this$0;
            DataChannel dataChannel = bVar.p;
            a.AbstractC0206a aVar = this.this$0.f11490a;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.this$0.f11491b;
            a.EnumC0216a aVar2 = this.this$0.f11492c;
            i iVar = this.this$0.f11493d;
            j jVar = new j((byte) 0);
            jVar.f11527a = bVar;
            jVar.f11530d = dataChannel;
            jVar.f11532f = aVar;
            jVar.f11533g = cVar;
            jVar.f11531e = aVar2;
            jVar.f11534h = iVar;
            return jVar;
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7n);
        bVar.f22375b = R.style.a2d;
        bVar.a(new ColorDrawable(0));
        bVar.f22380g = 80;
        bVar.f22382i = -1;
        bVar.f22378e = !d();
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void dismiss() {
        Fragment fragment = this.f11494f;
        if (fragment instanceof com.bytedance.android.live.liveinteract.multilive.a.d.a) {
            Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment");
            com.bytedance.android.live.liveinteract.multilive.a.d.a aVar = (com.bytedance.android.live.liveinteract.multilive.a.d.a) fragment;
            if (aVar.f11503c != null) {
                aVar.f11503c.setVisibility(0);
            }
            if (aVar.f11502b != null) {
                ((View) aVar.f11502b).setVisibility(4);
            }
            Fragment fragment2 = this.f11494f;
            Objects.requireNonNull(fragment2, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment");
            View view = ((com.bytedance.android.live.liveinteract.multilive.a.d.a) fragment2).f11503c;
            if (view != null) {
                view.post(new RunnableC0226b(this));
                return;
            }
            return;
        }
        super.dismiss();
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11499a;

        static {
            Covode.recordClassIndex(6216);
        }

        e(b bVar) {
            this.f11499a = bVar;
        }

        public final void onClick(View view) {
            if (!this.f11499a.d()) {
                this.f11499a.dismiss();
            }
        }
    }

    static final /* synthetic */ class f extends h.f.b.j implements h.f.a.b<a, z> {
        static {
            Covode.recordClassIndex(6217);
        }

        f(b bVar) {
            super(1, bVar, b.class, "switchPage", "switchPage(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveDialogPage;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            ((b) this.receiver).a(aVar2);
            return z.f158842a;
        }
    }

    public final void a(a aVar) {
        Fragment e2;
        int i2 = c.f11500a[aVar.ordinal()];
        if (i2 == 1) {
            e().a(this.f11492c, this.f11493d);
            e2 = e();
        } else if (i2 == 2) {
            e2 = f();
        } else {
            throw new n();
        }
        this.f11494f = e2;
        androidx.fragment.app.n a2 = getChildFragmentManager().a();
        if (aVar.getGoNextPage()) {
            a2.a(R.anim.er, R.anim.en);
        } else {
            a2.a(R.anim.em, R.anim.es);
        }
        Fragment fragment = this.f11494f;
        if (fragment != null) {
            a2.b(R.id.b94, fragment).b();
        }
    }

    public final void a(a.EnumC0216a aVar, i iVar) {
        this.f11492c = aVar;
        this.f11493d = iVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void show(androidx.fragment.app.i iVar, String str) {
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(str, "");
        if (!g().isAdded()) {
            try {
                super.show(iVar, str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        a_(R.id.d0w).setOnClickListener(new e(this));
        Fragment g2 = g();
        this.f11494f = g2;
        if (g2 instanceof j) {
            ((j) g2).a(this.f11492c, this.f11493d);
        }
        getChildFragmentManager().a().a(R.id.b94, g2).b();
        DataChannel dataChannel = this.p;
        if (dataChannel != null) {
            dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.liveinteract.multilive.a.a.d.class, (h.f.a.b) new f(this));
        }
    }
}
