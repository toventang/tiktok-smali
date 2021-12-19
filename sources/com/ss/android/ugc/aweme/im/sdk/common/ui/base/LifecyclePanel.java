package com.ss.android.ugc.aweme.im.sdk.common.ui.base;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.f.b.l;
import h.h;
import h.i;

public abstract class LifecyclePanel implements m, au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f102499a;

    /* renamed from: b  reason: collision with root package name */
    private final h f102500b = i.a((h.f.a.a) new a(this));
    public boolean s;
    public final m t;

    static {
        Covode.recordClassIndex(65644);
    }

    private final n a() {
        return (n) this.f102500b.getValue();
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_START) {
            onStart();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_STOP) {
            onStop();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ LifecyclePanel this$0;

        static {
            Covode.recordClassIndex(65645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(LifecyclePanel lifecyclePanel) {
            super(0);
            this.this$0 = lifecyclePanel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return a();
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        this.f102499a = false;
        a().a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a().a(i.a.ON_DESTROY);
    }

    @v(a = i.a.ON_PAUSE)
    public void onPause() {
        this.s = false;
        a().a(i.a.ON_PAUSE);
    }

    @v(a = i.a.ON_RESUME)
    public void onResume() {
        this.s = true;
        a().a(i.a.ON_RESUME);
    }

    @v(a = i.a.ON_START)
    public void onStart() {
        a().a(i.a.ON_START);
    }

    @v(a = i.a.ON_STOP)
    public void onStop() {
        this.f102499a = true;
        a().a(i.a.ON_STOP);
    }

    public LifecyclePanel(m mVar) {
        l.d(mVar, "");
        this.t = mVar;
    }
}
