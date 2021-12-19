package com.bytedance.android.live.design.app;

import android.content.Context;
import androidx.appcompat.app.h;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public class LifecycleAwareDialog extends h implements au {

    /* renamed from: a  reason: collision with root package name */
    private m f9359a;

    static {
        Covode.recordClassIndex(4774);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    private void onDestroy() {
        dismiss();
    }

    @Override // androidx.appcompat.app.h
    public void onStop() {
        super.onStop();
        m mVar = this.f9359a;
        if (mVar != null) {
            mVar.getLifecycle().b(this);
        }
    }

    public void show() {
        m mVar = this.f9359a;
        if (mVar == null || mVar.getLifecycle().a() != i.b.DESTROYED) {
            super.show();
        }
    }

    public static class a<T extends a<T>> {

        /* renamed from: a  reason: collision with root package name */
        public m f9360a;

        /* renamed from: b  reason: collision with root package name */
        protected final Context f9361b;

        static {
            Covode.recordClassIndex(4775);
        }

        public a(Context context) {
            this.f9361b = context;
        }
    }

    public LifecycleAwareDialog(Context context, a<?> aVar) {
        super(context);
        if (aVar != null) {
            m mVar = aVar.f9360a;
            m mVar2 = this.f9359a;
            if (mVar2 != null) {
                mVar2.getLifecycle().b(this);
            }
            this.f9359a = mVar;
            if (mVar != null) {
                mVar.getLifecycle().a(this);
            }
        }
    }
}
