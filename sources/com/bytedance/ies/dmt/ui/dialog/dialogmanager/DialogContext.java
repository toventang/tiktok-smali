package com.bytedance.ies.dmt.ui.dialog.dialogmanager;

import android.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.au;
import java.util.List;

public class DialogContext implements b.c, au {

    /* renamed from: a  reason: collision with root package name */
    public final b.a f33417a;

    /* renamed from: b  reason: collision with root package name */
    public final Enum f33418b;

    /* renamed from: c  reason: collision with root package name */
    public final m f33419c;

    /* renamed from: d  reason: collision with root package name */
    public final b.d f33420d;

    /* renamed from: e  reason: collision with root package name */
    public final b.c f33421e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f33422f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f33423g;

    static {
        Covode.recordClassIndex(19941);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
    public final void a() {
        b.c cVar = this.f33421e;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f33422f = false;
        a.C0732a.f33434a.a(this.f33417a);
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_RESUME)
    public void onResume() {
        m mVar = this.f33419c;
        if (mVar instanceof Fragment) {
            this.f33422f = ((Fragment) mVar).getTargetFragment().getUserVisibleHint();
        } else {
            this.f33422f = true;
        }
    }

    /* access modifiers changed from: package-private */
    @v(a = i.a.ON_STOP)
    public void onStop() {
        m mVar = this.f33419c;
        if (mVar instanceof Fragment) {
            this.f33422f = ((Fragment) mVar).getTargetFragment().getUserVisibleHint();
        } else {
            this.f33422f = false;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f33424a;

        /* renamed from: b  reason: collision with root package name */
        m f33425b;

        /* renamed from: c  reason: collision with root package name */
        Enum f33426c;

        /* renamed from: d  reason: collision with root package name */
        b.c f33427d;

        /* renamed from: e  reason: collision with root package name */
        public b.d f33428e;

        static {
            Covode.recordClassIndex(19942);
        }

        public a(m mVar) {
            this.f33425b = mVar;
        }

        public final DialogContext a(b.c cVar) {
            this.f33427d = cVar;
            return new DialogContext(this, (byte) 0);
        }

        public final DialogContext b(b.c cVar) {
            this.f33427d = cVar;
            return new DialogContext(this, (char) 0);
        }
    }

    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
    public final void a(List<Integer> list) {
        b.c cVar = this.f33421e;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    private DialogContext(a aVar) {
        this.f33423g = true;
        this.f33417a = aVar.f33424a;
        m mVar = aVar.f33425b;
        this.f33419c = mVar;
        this.f33421e = aVar.f33427d;
        this.f33418b = aVar.f33426c;
        mVar.getLifecycle().a(this);
        this.f33420d = aVar.f33428e;
    }

    /* synthetic */ DialogContext(a aVar, byte b2) {
        this(aVar);
    }

    /* synthetic */ DialogContext(a aVar, char c2) {
        this(aVar, true);
    }

    private DialogContext(a aVar, boolean z) {
        this(aVar);
        this.f33423g = true;
    }

    @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
    public final void a(List<Integer> list, int i2) {
        b.c cVar = this.f33421e;
        if (cVar != null) {
            cVar.a(list, i2);
        }
    }
}
