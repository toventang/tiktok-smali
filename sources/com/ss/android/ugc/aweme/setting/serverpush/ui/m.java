package com.ss.android.ugc.aweme.setting.serverpush.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.utils.fg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class m extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.setting.serverpush.b.a, com.ss.android.ugc.aweme.setting.serverpush.b.d {
    public static com.ss.android.ugc.aweme.setting.serverpush.a.d t;
    public static final a u = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TextView f122638a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f122639b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.f f122640c;

    /* renamed from: d  reason: collision with root package name */
    public n f122641d;

    /* renamed from: e  reason: collision with root package name */
    public n f122642e;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.setting.serverpush.b.k f122643j;

    /* renamed from: k  reason: collision with root package name */
    public com.ss.android.ugc.aweme.setting.serverpush.b.h f122644k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.d f122645l;

    /* renamed from: m  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dc.d f122646m;
    public List<n> n = new ArrayList();
    public n o;
    public boolean p;
    public boolean q;
    public List<Runnable> r = new ArrayList();
    public com.ss.android.ugc.aweme.setting.serverpush.a.d s;
    SparseArray v;
    private final h.h w = h.i.a((h.f.a.a) new k(this));
    private Keva y;

    static {
        Covode.recordClassIndex(80467);
    }

    private final dm d() {
        return (dm) this.w.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(80468);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void g() {
        for (Runnable runnable : this.r) {
            runnable.run();
            this.r.remove(runnable);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.d
    public final void b() {
        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de2).a();
        this.q = false;
        g();
    }

    public final Keva c() {
        if (this.y == null) {
            this.y = Keva.getRepo("push_logout");
        }
        Keva keva = this.y;
        if (keva == null) {
            h.f.b.l.b();
        }
        return keva;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.setting.serverpush.b.k kVar = this.f122643j;
        if (kVar != null) {
            kVar.cd_();
        }
        SparseArray sparseArray = this.v;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class k extends h.f.b.m implements h.f.a.a<dm> {
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(80479);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(m mVar) {
            super(0);
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ dm invoke() {
            m mVar = this.this$0;
            if (mVar.v == null) {
                mVar.v = new SparseArray();
            }
            View view = (View) mVar.v.get(R.id.d7z);
            if (view == null) {
                View view2 = mVar.getView();
                if (view2 == null) {
                    view = null;
                } else {
                    view = view2.findViewById(R.id.d7z);
                    mVar.v.put(R.id.d7z, view);
                }
            }
            PowerList powerList = (PowerList) view;
            h.f.b.l.b(powerList, "");
            return new dm(powerList);
        }
    }

    static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f122654a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f122655b;

        static {
            Covode.recordClassIndex(80476);
        }

        i(m mVar, n nVar) {
            this.f122654a = mVar;
            this.f122655b = nVar;
        }

        public final void run() {
            this.f122654a.o = this.f122655b;
            this.f122654a.p = true;
            com.ss.android.ugc.aweme.setting.serverpush.b.h hVar = this.f122654a.f122644k;
            if (hVar != null) {
                String str = this.f122655b.f122661a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                hVar.a(m.a(str), 1);
            }
            this.f122655b.a((h.f.a.b) AnonymousClass1.f122656a);
            m mVar = this.f122654a;
            String str2 = this.f122655b.f122661a;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
            mVar.a(str2, ((com.ss.android.ugc.aweme.be.h) this.f122655b.l()).f68599c ? 1 : 0);
            this.f122654a.c().storeString("need_sync_channel_push_logout", "");
        }
    }

    private final void e() {
        String string;
        boolean a2 = fg.a(getContext());
        if (a2) {
            string = getString(R.string.frl);
            h.f.b.l.b(string, "");
            com.ss.android.ugc.aweme.dc.f fVar = this.f122640c;
            if (fVar != null) {
                fVar.a(8);
            }
            com.ss.android.ugc.aweme.dc.d dVar = this.f122645l;
            if (dVar != null) {
                dVar.a(C3179m.f122657a);
            }
            com.ss.android.ugc.aweme.dc.d dVar2 = this.f122646m;
            if (dVar2 != null) {
                dVar2.a(n.f122658a);
            }
        } else {
            string = getString(R.string.frk);
            h.f.b.l.b(string, "");
            a(a2);
            com.ss.android.ugc.aweme.dc.f fVar2 = this.f122640c;
            if (fVar2 != null) {
                fVar2.a(0);
            }
            com.ss.android.ugc.aweme.dc.d dVar3 = this.f122645l;
            if (dVar3 != null) {
                dVar3.a(o.f122659a);
            }
            com.ss.android.ugc.aweme.dc.d dVar4 = this.f122646m;
            if (dVar4 != null) {
                dVar4.a(p.f122660a);
            }
        }
        com.ss.android.ugc.aweme.dc.f fVar3 = this.f122640c;
        if (fVar3 != null) {
            fVar3.a(string);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.a
    public final void a() {
        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.de2).a();
        this.p = false;
        n nVar = this.o;
        if (nVar != null) {
            nVar.a((h.f.a.b) f.f122651a);
            String str = nVar.f122661a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            a(str, ((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        int i2;
        Integer valueOf;
        com.ss.android.ugc.aweme.setting.serverpush.a.e eVar;
        com.ss.android.ugc.aweme.setting.serverpush.a.e eVar2;
        super.onResume();
        this.s = t;
        e();
        boolean a2 = fg.a(getContext());
        a(this.f122641d, a2);
        a(this.f122642e, a2);
        for (n nVar : this.n) {
            if (this.s != null) {
                String str = nVar.f122661a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                com.ss.android.ugc.aweme.setting.serverpush.a.d dVar = this.s;
                if (dVar != null) {
                    int hashCode = str.hashCode();
                    if (hashCode != -2075815212) {
                        if (hashCode == 277061569 && str.equals("recommend_video_push") && (eVar2 = dVar.f122559a) != null) {
                            i2 = eVar2.f122560a;
                            valueOf = Integer.valueOf(i2);
                            if (valueOf.intValue() == -1 || valueOf == null) {
                                break;
                            }
                            nVar.a((h.f.a.b) new l(valueOf.intValue(), this, nVar));
                        }
                    } else if (str.equals("other_channel") && (eVar = dVar.f122559a) != null) {
                        i2 = eVar.f122561b;
                        valueOf = Integer.valueOf(i2);
                        nVar.a((h.f.a.b) new l(valueOf.intValue(), this, nVar));
                    }
                }
                i2 = -1;
                valueOf = Integer.valueOf(i2);
                nVar.a((h.f.a.b) new l(valueOf.intValue(), this, nVar));
            }
        }
        c().getString("need_sync_channel_push_logout", "");
        if (!TextUtils.isEmpty(c().getString("need_sync_channel_push_logout", "")) && fg.a(getContext())) {
            String string = c().getString("need_sync_channel_push_logout", "");
            for (n nVar2 : this.n) {
                if (nVar2.f122661a != null) {
                    String str2 = nVar2.f122661a;
                    Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                    if (TextUtils.equals(str2, string) && com.ss.android.ugc.aweme.setting.utils.k.a(string)) {
                        i iVar = new i(this, nVar2);
                        if (this.q) {
                            this.r.add(iVar);
                        } else {
                            iVar.run();
                        }
                    }
                }
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f122648a;

        static {
            Covode.recordClassIndex(80470);
        }

        c(m mVar) {
            this.f122648a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m mVar = this.f122648a;
            n nVar = mVar.f122641d;
            if (nVar == null) {
                h.f.b.l.b();
            }
            mVar.a(nVar);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f122649a;

        static {
            Covode.recordClassIndex(80471);
        }

        d(m mVar) {
            this.f122649a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            m mVar = this.f122649a;
            n nVar = mVar.f122642e;
            if (nVar == null) {
                h.f.b.l.b();
            }
            mVar.a(nVar);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f122650a;

        static {
            Covode.recordClassIndex(80472);
        }

        e(m mVar) {
            this.f122650a = mVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f122650a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.setting.serverpush.ui.m$m  reason: collision with other inner class name */
    public static final class C3179m extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3179m f122657a = new C3179m();

        static {
            Covode.recordClassIndex(80481);
        }

        C3179m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, false, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f122658a = new n();

        static {
            Covode.recordClassIndex(80482);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, true, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f122659a = new o();

        static {
            Covode.recordClassIndex(80483);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, true, null, 11);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.e, com.ss.android.ugc.aweme.be.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f122660a = new p();

        static {
            Covode.recordClassIndex(80484);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.e invoke(com.ss.android.ugc.aweme.be.e eVar) {
            com.ss.android.ugc.aweme.be.e eVar2 = eVar;
            h.f.b.l.d(eVar2, "");
            return com.ss.android.ugc.aweme.be.e.a(eVar2, null, false, false, null, 11);
        }
    }

    private static void a(boolean z) {
        String str;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        com.ss.android.ugc.aweme.common.r.a("notifications_show", dVar.a("status", str).f66730a);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f122647a;

        static {
            Covode.recordClassIndex(80469);
        }

        b(m mVar) {
            this.f122647a = mVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            fg.b(this.f122647a.getContext());
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (fg.a(this.f122647a.getContext())) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.aweme.common.r.a("notifications_click", dVar.a("status", str).f66730a);
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f122651a = new f();

        static {
            Covode.recordClassIndex(80473);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, !hVar2.f68599c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f122652a = new g();

        static {
            Covode.recordClassIndex(80474);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, !hVar2.f68599c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f122653a = new h();

        static {
            Covode.recordClassIndex(80475);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, !hVar2.f68599c, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ boolean $enable;

        static {
            Covode.recordClassIndex(80478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z) {
            super(1);
            this.$enable = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            return com.ss.android.ugc.aweme.be.h.a(hVar2, false, null, null, false, null, null, null, null, null, false, null, this.$enable, false, null, 14335);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ n $item$inlined;
        final /* synthetic */ int $status;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(80480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(int i2, m mVar, n nVar) {
            super(1);
            this.$status = i2;
            this.this$0 = mVar;
            this.$item$inlined = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            boolean z;
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            if (this.$status == 1) {
                String str = this.$item$inlined.f122661a;
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (com.ss.android.ugc.aweme.setting.utils.k.a(str)) {
                    z = true;
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.serverpush.a.e $this_run;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(80485);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(com.ss.android.ugc.aweme.setting.serverpush.a.e eVar, m mVar) {
            super(1);
            this.$this_run = eVar;
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            boolean z;
            String str;
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            if (this.$this_run.f122560a == 1) {
                n nVar = this.this$0.f122641d;
                if (nVar != null) {
                    str = nVar.f122661a;
                } else {
                    str = null;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (com.ss.android.ugc.aweme.setting.utils.k.a(str)) {
                    z = true;
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<com.ss.android.ugc.aweme.be.h, com.ss.android.ugc.aweme.be.h> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.serverpush.a.e $this_run;
        final /* synthetic */ m this$0;

        static {
            Covode.recordClassIndex(80486);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(com.ss.android.ugc.aweme.setting.serverpush.a.e eVar, m mVar) {
            super(1);
            this.$this_run = eVar;
            this.this$0 = mVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.be.h invoke(com.ss.android.ugc.aweme.be.h hVar) {
            boolean z;
            String str;
            com.ss.android.ugc.aweme.be.h hVar2 = hVar;
            h.f.b.l.d(hVar2, "");
            if (this.$this_run.f122561b == 1) {
                n nVar = this.this$0.f122642e;
                if (nVar != null) {
                    str = nVar.f122661a;
                } else {
                    str = null;
                }
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
                if (com.ss.android.ugc.aweme.setting.utils.k.a(str)) {
                    z = true;
                    return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
                }
            }
            z = false;
            return com.ss.android.ugc.aweme.be.h.a(hVar2, z, null, null, false, null, null, null, null, null, false, null, false, false, null, 16382);
        }
    }

    public static String a(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2075815212) {
            if (hashCode == 277061569 && str.equals("recommend_video_push")) {
                return "push_device_recommend_video";
            }
            return null;
        } else if (str.equals("other_channel")) {
            return "push_device_other_channel";
        } else {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.a
    public final void a(BaseResponse baseResponse) {
        n nVar;
        h.f.b.l.d(baseResponse, "");
        this.p = false;
        if (baseResponse.status_code != 0 && (nVar = this.o) != null) {
            nVar.a((h.f.a.b) g.f122652a);
            String str = nVar.f122661a;
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.String");
            a(str, ((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c ? 1 : 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.d
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.d dVar) {
        h.f.b.l.d(dVar, "");
        this.s = dVar;
        com.ss.android.ugc.aweme.setting.serverpush.a.e eVar = dVar.f122559a;
        if (eVar != null) {
            n nVar = this.f122641d;
            if (nVar != null) {
                nVar.a((h.f.a.b) new q(eVar, this));
            }
            n nVar2 = this.f122642e;
            if (nVar2 != null) {
                nVar2.a((h.f.a.b) new r(eVar, this));
            }
        }
        t = dVar;
        this.q = false;
        g();
    }

    public final void a(n nVar) {
        String str;
        if (!this.p) {
            this.o = nVar;
            this.p = true;
            if (!g.a(getContext())) {
                this.p = false;
                return;
            }
            if (!((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c) {
                String str2 = nVar.f122661a;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.String");
                if (!com.ss.android.ugc.aweme.setting.utils.k.a(str2)) {
                    String str3 = nVar.f122661a;
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.String");
                    if (Build.VERSION.SDK_INT >= 26) {
                        String a2 = g.a(str3, com.ss.android.ugc.aweme.setting.utils.j.a());
                        Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                        intent.setFlags(268435456);
                        intent.putExtra("android.provider.extra.APP_PACKAGE", com.bytedance.ies.ugc.appcontext.d.a().getPackageName());
                        intent.putExtra("android.provider.extra.CHANNEL_ID", a2);
                        if (com.bytedance.ies.ugc.appcontext.d.a().getPackageManager().resolveActivity(intent, 65536) != null) {
                            startActivity(intent);
                        }
                    } else {
                        fg.c(com.bytedance.ies.ugc.appcontext.d.a());
                    }
                    Keva c2 = c();
                    String str4 = nVar.f122661a;
                    Objects.requireNonNull(str4, "null cannot be cast to non-null type kotlin.String");
                    c2.storeString("need_sync_channel_push_logout", str4);
                    this.p = false;
                    return;
                }
            }
            nVar.a((h.f.a.b) h.f122653a);
            String str5 = nVar.f122661a;
            Objects.requireNonNull(str5, "null cannot be cast to non-null type kotlin.String");
            a(str5, ((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c ? 1 : 0);
            com.ss.android.ugc.aweme.setting.serverpush.b.h hVar = this.f122644k;
            if (hVar != null) {
                String str6 = nVar.f122661a;
                Objects.requireNonNull(str6, "null cannot be cast to non-null type kotlin.String");
                hVar.a(a(str6), Integer.valueOf(((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c ? 1 : 0));
            }
            String str7 = nVar.f122661a;
            Objects.requireNonNull(str7, "null cannot be cast to non-null type kotlin.String");
            if (((com.ss.android.ugc.aweme.be.h) nVar.l()).f68599c) {
                str = "on";
            } else {
                str = "off";
            }
            com.ss.android.ugc.aweme.common.r.a("notification_switch", new com.ss.android.ugc.aweme.app.f.d().a("label", str7).a("to_status", str).f66730a);
        }
    }

    private static void a(com.ss.android.ugc.aweme.dc.h hVar, boolean z) {
        if (hVar != null) {
            hVar.a(new j(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.f122638a = (TextView) activity.findViewById(R.id.title);
            this.f122639b = (ImageView) activity.findViewById(R.id.qb);
            String string = activity.getString(R.string.fra);
            h.f.b.l.b(string, "");
            com.ss.android.ugc.aweme.dc.f fVar = new com.ss.android.ugc.aweme.dc.f(new com.ss.android.ugc.aweme.be.f("", false, null, string, null, null, false, false, new b(this), null, 6134));
            d().a(fVar);
            this.f122640c = fVar;
            String string2 = activity.getString(R.string.h_p);
            h.f.b.l.b(string2, "");
            com.ss.android.ugc.aweme.dc.d dVar = new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(string2, false, false, 14));
            d().a(dVar);
            this.f122646m = dVar;
            String string3 = activity.getString(R.string.h_p);
            h.f.b.l.b(string3, "");
            com.ss.android.ugc.aweme.dc.d dVar2 = new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(string3, true, false, 12));
            d().a(dVar2);
            this.f122645l = dVar2;
            String string4 = activity.getString(R.string.h_o);
            h.f.b.l.b(string4, "");
            n nVar = new n(new com.ss.android.ugc.aweme.be.h(false, string4, new c(this), false, null, null, null, null, null, false, 16377));
            d().a(nVar);
            this.f122641d = nVar;
            dm d2 = d();
            String string5 = activity.getString(R.string.dmm);
            h.f.b.l.b(string5, "");
            d2.a(new com.ss.android.ugc.aweme.dc.d(new com.ss.android.ugc.aweme.be.e(string5, true, false, 12)));
            String string6 = activity.getString(R.string.dml);
            h.f.b.l.b(string6, "");
            n nVar2 = new n(new com.ss.android.ugc.aweme.be.h(false, string6, new d(this), false, null, null, null, null, null, false, 16377));
            d().a(nVar2);
            this.f122642e = nVar2;
            ImageView imageView = this.f122639b;
            if (imageView != null) {
                imageView.setOnClickListener(new e(this));
            }
        }
        TextView textView = this.f122638a;
        if (textView == null) {
            h.f.b.l.b();
        }
        textView.setText(R.string.fnl);
        e();
        n nVar3 = this.f122641d;
        if (nVar3 != null) {
            nVar3.f122661a = "recommend_video_push";
            this.n.add(nVar3);
        }
        n nVar4 = this.f122642e;
        if (nVar4 != null) {
            nVar4.f122661a = "other_channel";
            this.n.add(nVar4);
        }
        com.ss.android.ugc.aweme.setting.serverpush.b.k kVar = new com.ss.android.ugc.aweme.setting.serverpush.b.k();
        this.f122643j = kVar;
        kVar.a_(this);
        com.ss.android.ugc.aweme.setting.serverpush.b.k kVar2 = this.f122643j;
        if (kVar2 != null) {
            kVar2.a(new Object[0]);
        }
        this.q = true;
        com.ss.android.ugc.aweme.setting.serverpush.b.h hVar = new com.ss.android.ugc.aweme.setting.serverpush.b.h();
        this.f122644k = hVar;
        hVar.a_(this);
    }

    public final void a(String str, int i2) {
        com.ss.android.ugc.aweme.setting.serverpush.a.e eVar;
        com.ss.android.ugc.aweme.setting.serverpush.a.e eVar2;
        com.ss.android.ugc.aweme.setting.serverpush.a.d dVar = this.s;
        if (dVar != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2075815212) {
                if (hashCode == 277061569 && str.equals("recommend_video_push") && (eVar2 = dVar.f122559a) != null) {
                    eVar2.f122560a = i2;
                }
            } else if (str.equals("other_channel") && (eVar = dVar.f122559a) != null) {
                eVar.f122561b = i2;
            }
        }
        t = this.s;
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ayt, viewGroup, false);
    }
}
