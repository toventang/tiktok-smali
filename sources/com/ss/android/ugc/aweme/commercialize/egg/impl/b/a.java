package com.ss.android.ugc.aweme.commercialize.egg.impl.b;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f73984a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.egg.d.a f73985b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.egg.a.a f73986c;

    /* renamed from: d  reason: collision with root package name */
    final h f73987d = i.a((h.f.a.a) new C1665a(this));

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f73988e;

    /* renamed from: f  reason: collision with root package name */
    private final h f73989f = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(45564);
    }

    public final boolean a() {
        return ((Boolean) this.f73989f.getValue()).booleanValue();
    }

    public abstract void b();

    public abstract void c();

    /* access modifiers changed from: protected */
    public final void d() {
        a(true, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.b.a$a  reason: collision with other inner class name */
    static final class C1665a extends m implements h.f.a.a<Integer> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1665a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.this$0.f73985b;
            if (aVar != null) {
                i2 = aVar.f73940h;
            } else {
                i2 = 1;
            }
            return Integer.valueOf(i2);
        }
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(45566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            com.ss.android.ugc.aweme.commercialize.egg.d.a aVar = this.this$0.f73985b;
            if (aVar != null) {
                z = aVar.f73941i;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        a(false, str);
    }

    public a(FrameLayout frameLayout) {
        l.d(frameLayout, "");
        this.f73988e = frameLayout;
        Context context = frameLayout.getContext();
        l.b(context, "");
        this.f73984a = context;
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, String str) {
        com.ss.android.ugc.aweme.commercialize.egg.impl.d.a.a(this.f73985b, z, str);
    }
}
