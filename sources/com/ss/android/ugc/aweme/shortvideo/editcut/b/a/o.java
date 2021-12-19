package com.ss.android.ugc.aweme.shortvideo.editcut.b.a;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.o.f;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.tabs.TabLayout;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.n;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h.d;
import h.k.i;
import h.z;

public final class o extends a {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ i[] f128185a = {new y(o.class, "editCutInternalApi", "getEditCutInternalApi()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditCutInternalApi;", 0), new y(o.class, "bottomViewModel", "getBottomViewModel()Lcom/ss/android/ugc/aweme/shortvideo/editcut/EditAdjustClipsBottomViewModel;", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f128186d = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public TabLayout f128187b;

    /* renamed from: c  reason: collision with root package name */
    final d f128188c = com.bytedance.o.b.a.a(getDiContainer(), n.class);

    /* renamed from: e  reason: collision with root package name */
    private final d f128189e = com.bytedance.o.b.a.a(getDiContainer(), EditAdjustClipsBottomViewModel.class);

    /* renamed from: f  reason: collision with root package name */
    private final String f128190f = "ModeSwitchScene";

    static {
        Covode.recordClassIndex(84016);
    }

    public final EditAdjustClipsBottomViewModel C() {
        return (EditAdjustClipsBottomViewModel) this.f128189e.a(this, f128185a[1]);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(84017);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.editcut.b.d
    public final String a() {
        return this.f128190f;
    }

    public static final class b implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f128191a;

        static {
            Covode.recordClassIndex(84018);
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void b(TabLayout.f fVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(o oVar) {
            this.f128191a = oVar;
        }

        @Override // com.google.android.material.tabs.TabLayout.b
        public final void a(TabLayout.f fVar) {
            if (fVar != null) {
                this.f128191a.C().d(new EditAdjustClipsBottomViewModel.i(fVar.f52654e));
                o oVar = this.f128191a;
                boolean z = false;
                n nVar = (n) oVar.f128188c.a(oVar, o.f128185a[0]);
                if (fVar.f52654e == 0) {
                    z = true;
                }
                nVar.c(z);
            }
        }
    }

    public static final /* synthetic */ TabLayout a(o oVar) {
        TabLayout tabLayout = oVar.f128187b;
        if (tabLayout == null) {
            l.a("tabLayout");
        }
        return tabLayout;
    }

    static final class c extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(84019);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            TabLayout.f tabAt;
            int i2 = !bool.booleanValue();
            if (!(i2 == o.a(this.this$0).getSelectedTabPosition() || (tabAt = o.a(this.this$0).getTabAt(i2)) == null)) {
                tabAt.a();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.scene.j
    public final void a(Bundle bundle) {
        super.a(bundle);
        View c2 = c(R.id.cn_);
        l.b(c2, "");
        TabLayout tabLayout = (TabLayout) c2;
        this.f128187b = tabLayout;
        if (tabLayout == null) {
            l.a("tabLayout");
        }
        TabLayout tabLayout2 = this.f128187b;
        if (tabLayout2 == null) {
            l.a("tabLayout");
        }
        TabLayout.f newTab = tabLayout2.newTab();
        Activity t = t();
        l.b(t, "");
        TuxTextView tuxTextView = new TuxTextView(t, null, 0, 6);
        tuxTextView.setTuxFont(72);
        tuxTextView.setTextColor(tuxTextView.getResources().getColorStateList(R.color.db));
        tuxTextView.setText(R.string.g7k);
        tabLayout.addTab(newTab.a(tuxTextView));
        TabLayout tabLayout3 = this.f128187b;
        if (tabLayout3 == null) {
            l.a("tabLayout");
        }
        TabLayout tabLayout4 = this.f128187b;
        if (tabLayout4 == null) {
            l.a("tabLayout");
        }
        TabLayout.f newTab2 = tabLayout4.newTab();
        Activity t2 = t();
        l.b(t2, "");
        TuxTextView tuxTextView2 = new TuxTextView(t2, null, 0, 6);
        tuxTextView2.setTuxFont(72);
        tuxTextView2.setTextColor(tuxTextView2.getResources().getColorStateList(R.color.db));
        tuxTextView2.setText(R.string.g7n);
        tabLayout3.addTab(newTab2.a(tuxTextView2));
        TabLayout tabLayout5 = this.f128187b;
        if (tabLayout5 == null) {
            l.a("tabLayout");
        }
        tabLayout5.addOnTabSelectedListener(new b(this));
        f.a.b.b unused = C().a(this, p.f128193a, new ah(), new c(this));
    }

    @Override // com.bytedance.scene.j
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.cz, viewGroup, false);
        l.b(a2, "");
        return a2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(f fVar, com.bytedance.scene.group.b bVar) {
        super(fVar, bVar, R.id.b6m);
        l.d(fVar, "");
        l.d(bVar, "");
    }
}
