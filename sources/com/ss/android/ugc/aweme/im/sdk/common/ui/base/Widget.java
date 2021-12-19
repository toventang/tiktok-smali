package com.ss.android.ugc.aweme.im.sdk.common.ui.base;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import h.h;
import h.i;

public class Widget implements m, au {

    /* renamed from: a  reason: collision with root package name */
    private boolean f102501a;

    /* renamed from: b  reason: collision with root package name */
    private final h f102502b = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(65646);
    }

    private final n b() {
        return (n) this.f102502b.getValue();
    }

    public void a() {
        this.f102501a = true;
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            create();
        } else if (aVar == i.a.ON_START) {
            start();
        } else if (aVar == i.a.ON_RESUME) {
            resume();
        } else if (aVar == i.a.ON_PAUSE) {
            pause();
        } else if (aVar == i.a.ON_STOP) {
            stop();
        } else if (aVar == i.a.ON_DESTROY) {
            destroy();
        }
    }

    static final class a extends h.f.b.m implements h.f.a.a<n> {
        final /* synthetic */ Widget this$0;

        static {
            Covode.recordClassIndex(65647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ n invoke() {
            return new n(this.this$0);
        }
    }

    @Override // androidx.lifecycle.m
    public androidx.lifecycle.i getLifecycle() {
        return b();
    }

    @v(a = i.a.ON_CREATE)
    public final void create() {
        this.f102501a = false;
        b().a(i.a.ON_CREATE);
    }

    @v(a = i.a.ON_DESTROY)
    public final void destroy() {
        a();
        b().a(i.a.ON_DESTROY);
    }

    @v(a = i.a.ON_PAUSE)
    public final void pause() {
        b().a(i.a.ON_PAUSE);
    }

    @v(a = i.a.ON_RESUME)
    public final void resume() {
        b().a(i.a.ON_RESUME);
    }

    @v(a = i.a.ON_START)
    public final void start() {
        b().a(i.a.ON_START);
    }

    @v(a = i.a.ON_STOP)
    public final void stop() {
        b().a(i.a.ON_STOP);
    }
}
