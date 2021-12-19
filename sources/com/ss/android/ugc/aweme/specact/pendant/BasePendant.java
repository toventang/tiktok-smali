package com.ss.android.ugc.aweme.specact.pendant;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.specact.pendant.a.a;
import com.ss.android.ugc.aweme.specact.pendant.e.h;
import com.ss.android.ugc.aweme.specact.pendant.h.i;
import com.ss.android.ugc.aweme.specact.popup.a.k;
import com.ss.android.ugc.aweme.specact.popup.c.a;
import h.f.b.l;
import h.i;
import java.util.List;
import java.util.Objects;

public abstract class BasePendant implements au, com.ss.android.ugc.aweme.specact.pendant.e.b, h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f134067g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UgAwemeActivitySetting f134068a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f134069b;

    /* renamed from: c  reason: collision with root package name */
    public m f134070c;

    /* renamed from: d  reason: collision with root package name */
    public int f134071d = 1;

    /* renamed from: e  reason: collision with root package name */
    public Aweme f134072e;

    /* renamed from: f  reason: collision with root package name */
    public String f134073f = "ForYou";

    /* renamed from: h  reason: collision with root package name */
    private final h.h f134074h = i.a((h.f.a.a) new b(this));

    /* renamed from: i  reason: collision with root package name */
    private final h.h f134075i = i.a((h.f.a.a) new d(this));

    static {
        Covode.recordClassIndex(87697);
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.specact.pendant.e.a a() {
        return (com.ss.android.ugc.aweme.specact.pendant.e.a) this.f134074h.getValue();
    }

    /* access modifiers changed from: protected */
    public final com.ss.android.ugc.aweme.specact.pendant.e.d b() {
        return (com.ss.android.ugc.aweme.specact.pendant.e.d) this.f134075i.getValue();
    }

    public boolean c() {
        return true;
    }

    public abstract void d(UgAwemeActivitySetting ugAwemeActivitySetting);

    public abstract boolean h();

    public abstract void i();

    public abstract void j();

    public abstract com.ss.android.ugc.aweme.specact.pendant.e.a k();

    public abstract com.ss.android.ugc.aweme.specact.pendant.e.d l();

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87698);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public void e() {
        s();
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.pendant.e.a> {
        final /* synthetic */ BasePendant this$0;

        static {
            Covode.recordClassIndex(87699);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BasePendant basePendant) {
            super(0);
            this.this$0 = basePendant;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.pendant.e.a invoke() {
            return this.this$0.k();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.specact.pendant.e.d> {
        final /* synthetic */ BasePendant this$0;

        static {
            Covode.recordClassIndex(87701);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(BasePendant basePendant) {
            super(0);
            this.this$0 = basePendant;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.specact.pendant.e.d invoke() {
            com.ss.android.ugc.aweme.specact.pendant.e.d l2 = this.this$0.l();
            l2.a(this.this$0);
            return l2;
        }
    }

    private boolean p() {
        if (this.f134070c == null || this.f134069b == null) {
            return false;
        }
        return true;
    }

    private void s() {
        if (t()) {
            a().c();
        }
    }

    private boolean t() {
        return a().a();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void d() {
        if (this.f134068a != null) {
            e();
            this.f134068a = null;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestory() {
        u();
        s();
        this.f134069b = null;
    }

    public static final class c implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BasePendant f134076a;

        static {
            Covode.recordClassIndex(87700);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a(int i2, String str, Boolean bool, Integer num) {
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void b() {
            a.C3498a.a().a(this.f134076a.g(), com.ss.android.ugc.aweme.specact.pendant.h.c.a());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(BasePendant basePendant) {
            this.f134076a = basePendant;
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.h.i.a
        public final void a(List<k.i> list) {
            a.C3477a.a().a(list);
        }
    }

    private void r() {
        if (n()) {
            com.ss.android.ugc.aweme.specact.pendant.e.d b2 = b();
            Context f2 = f();
            UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
            if (ugAwemeActivitySetting == null) {
                l.b();
            }
            b2.a(f2, ugAwemeActivitySetting);
        }
    }

    private final void u() {
        androidx.lifecycle.i lifecycle;
        m mVar = this.f134070c;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.b(this);
        }
        this.f134070c = null;
    }

    /* access modifiers changed from: protected */
    public final Activity g() {
        m mVar = this.f134070c;
        if (mVar instanceof Activity) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.app.Activity");
            return (Activity) mVar;
        } else if (!(mVar instanceof Fragment)) {
            return null;
        } else {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            return ((Fragment) mVar).getActivity();
        }
    }

    private boolean n() {
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
        if (ugAwemeActivitySetting == null || com.ss.android.ugc.aweme.specact.pendant.h.a.c(ugAwemeActivitySetting)) {
            return false;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting2 = this.f134068a;
        if (ugAwemeActivitySetting2 == null) {
            l.b();
        }
        if (com.ss.android.ugc.aweme.specact.pendant.h.a.a(ugAwemeActivitySetting2) && com.ss.android.ugc.aweme.specact.pendant.h.a.p(this.f134068a).length() != 0) {
            return true;
        }
        return false;
    }

    private boolean q() {
        if (!n()) {
            return false;
        }
        if (!c()) {
            return true;
        }
        com.ss.android.ugc.aweme.specact.pendant.e.d b2 = b();
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
        if (ugAwemeActivitySetting == null) {
            l.b();
        }
        String activityId = ugAwemeActivitySetting.getActivityId();
        l.b(activityId, "");
        return b2.a(activityId);
    }

    /* access modifiers changed from: protected */
    public final Context f() {
        Context a2;
        m mVar = this.f134070c;
        if (mVar instanceof Activity) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type android.content.Context");
            a2 = (Context) mVar;
        } else if (mVar instanceof Fragment) {
            Objects.requireNonNull(mVar, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            a2 = ((Fragment) mVar).getContext();
        } else {
            a2 = com.bytedance.ies.ugc.appcontext.d.a();
        }
        if (a2 == null) {
            return com.bytedance.ies.ugc.appcontext.d.a();
        }
        return a2;
    }

    private final void o() {
        if (!n()) {
            LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
            l.b(localTestApi, "");
            localTestApi.getSpecActDebugService().a("SpecPendant", "init pendant error: setting is not ready");
            return;
        }
        UgAwemeActivitySetting ugAwemeActivitySetting = this.f134068a;
        if (ugAwemeActivitySetting == null) {
            l.b();
        }
        d(ugAwemeActivitySetting);
        if (!p()) {
            LocalTestApi localTestApi2 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi2, "");
            localTestApi2.getSpecActDebugService().a("SpecPendant", "init pendant error: page is not ready");
        } else if (!q()) {
            LocalTestApi localTestApi3 = a.C2792a.f108997a.f108996a;
            l.b(localTestApi3, "");
            localTestApi3.getSpecActDebugService().a("SpecPendant", "init pendant error: resource is not ready");
            r();
        } else {
            ViewGroup viewGroup = this.f134069b;
            if (viewGroup == null) {
                l.b();
            }
            a(viewGroup);
            com.ss.android.ugc.aweme.specact.pendant.h.b.a(6, this.f134071d);
            if (!h()) {
                i();
            } else {
                j();
            }
        }
    }

    public final void a(String str) {
        l.d(str, "");
        this.f134073f = str;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.h
    public final void c(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        if (!t()) {
            o();
        }
    }

    private void a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        if (!t()) {
            a().a(viewGroup);
            a().a(this.f134068a);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.h
    public final void b(UgAwemeActivitySetting ugAwemeActivitySetting) {
        l.d(ugAwemeActivitySetting, "");
        LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
        l.b(localTestApi, "");
        localTestApi.getSpecActDebugService().a("SpecPendant", "onResourceLoadFailure, request task/page again");
        com.ss.android.ugc.aweme.specact.pendant.h.i a2 = i.b.a();
        Activity g2 = g();
        if (g2 == null) {
            l.b();
        }
        a2.a(g2, new c(this));
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        if (n()) {
            d();
        }
        this.f134068a = ugAwemeActivitySetting;
        o();
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.b
    public final void a(m mVar, ViewGroup viewGroup) {
        androidx.lifecycle.i lifecycle;
        if (p()) {
            if (!l.a(this.f134070c, mVar)) {
                u();
                this.f134069b = null;
                s();
            } else {
                return;
            }
        }
        this.f134070c = mVar;
        this.f134069b = viewGroup;
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        o();
    }
}
