package com.ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.h.c;
import com.ss.android.ugc.aweme.discover.k.a;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;

public final class aa implements c {

    /* renamed from: b  reason: collision with root package name */
    private final h f81052b = i.a((h.f.a.a) a.f81057a);

    /* renamed from: c  reason: collision with root package name */
    private final h f81053c = i.a((h.f.a.a) new b(this));

    /* renamed from: d  reason: collision with root package name */
    private boolean f81054d;

    /* renamed from: e  reason: collision with root package name */
    private int f81055e;

    /* renamed from: f  reason: collision with root package name */
    private int f81056f = -1;

    static {
        Covode.recordClassIndex(50380);
    }

    private final int c() {
        return ((Number) this.f81053c.getValue()).intValue();
    }

    public final a.C1895a a() {
        return (a.C1895a) this.f81052b.getValue();
    }

    static final class a extends m implements h.f.a.a<a.C1895a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81057a = new a();

        static {
            Covode.recordClassIndex(50381);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a.C1895a invoke() {
            return com.ss.android.ugc.aweme.discover.k.a.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.c
    public final void b() {
        this.f81054d = false;
        this.f81055e = 0;
        this.f81056f = -1;
    }

    static final class b extends m implements h.f.a.a<Integer> {
        final /* synthetic */ aa this$0;

        static {
            Covode.recordClassIndex(50382);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(aa aaVar) {
            super(0);
            this.this$0 = aaVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            int i2;
            a.C1895a a2 = this.this$0.a();
            if (a2 != null) {
                i2 = a2.getPosition();
            } else {
                i2 = -1;
            }
            return Integer.valueOf(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.c
    public final void a(h.f.a.b<? super Integer, z> bVar) {
        int i2;
        l.d(bVar, "");
        if (!this.f81054d && (i2 = this.f81056f) != -1) {
            bVar.invoke(Integer.valueOf(i2));
            this.f81054d = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.h.c
    public final void a(boolean z, h.f.a.a<Integer> aVar, h.f.a.b<? super Integer, Integer> bVar) {
        l.d(aVar, "");
        l.d(bVar, "");
        if (!this.f81054d && a() != null && c() >= 0 && this.f81056f == -1) {
            if (c() == 0) {
                this.f81056f = bVar.invoke(0).intValue();
            } else if (z) {
                this.f81056f = bVar.invoke(1).intValue();
            } else {
                int intValue = this.f81055e + aVar.invoke().intValue();
                this.f81055e = intValue;
                if (intValue >= c()) {
                    this.f81056f = bVar.invoke(1).intValue();
                }
            }
        }
    }
}
