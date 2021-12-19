package com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.a.b;
import h.f.b.l;
import h.z;

public final class AutoDismissPermissionDialog implements au {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.dialog.a f131859a;

    /* renamed from: b  reason: collision with root package name */
    public b<? super com.bytedance.tux.dialog.a, z> f131860b;

    /* renamed from: c  reason: collision with root package name */
    public final e f131861c;

    /* renamed from: d  reason: collision with root package name */
    private final com.bytedance.tux.dialog.b f131862d;

    static {
        Covode.recordClassIndex(86389);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_START) {
            onStart();
        }
    }

    @v(a = i.a.ON_START)
    public final void onStart() {
        com.bytedance.tux.dialog.a aVar = this.f131859a;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public final void a() {
        if (this.f131859a == null) {
            this.f131861c.getLifecycle().a(this);
            this.f131862d.a(new a(this));
            com.bytedance.tux.dialog.a a2 = this.f131862d.a();
            this.f131859a = a2;
            if (a2 != null) {
                a2.b().show();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements b<com.bytedance.tux.dialog.a, z> {
        final /* synthetic */ AutoDismissPermissionDialog this$0;

        static {
            Covode.recordClassIndex(86390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AutoDismissPermissionDialog autoDismissPermissionDialog) {
            super(1);
            this.this$0 = autoDismissPermissionDialog;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.a aVar) {
            b<? super com.bytedance.tux.dialog.a, z> bVar;
            l.d(aVar, "");
            com.bytedance.tux.dialog.a aVar2 = this.this$0.f131859a;
            if (!(aVar2 == null || (bVar = this.this$0.f131860b) == null)) {
                bVar.invoke(aVar2);
            }
            this.this$0.f131859a = null;
            this.this$0.f131861c.getLifecycle().b(this.this$0);
            return z.f158842a;
        }
    }

    public AutoDismissPermissionDialog(e eVar, com.bytedance.tux.dialog.b bVar) {
        l.d(eVar, "");
        l.d(bVar, "");
        this.f131861c = eVar;
        this.f131862d = bVar;
    }
}
