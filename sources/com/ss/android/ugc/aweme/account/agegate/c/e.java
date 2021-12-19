package com.ss.android.ugc.aweme.account.agegate.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.a.a.d;
import com.bytedance.sdk.a.h.a.p;
import com.bytedance.sdk.a.h.b.a.m;
import com.bytedance.sdk.a.h.b.a.o;
import com.bytedance.sdk.a.h.b.l;
import h.f.b.l;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f62753b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.sdk.a.a.e f62754a;

    static {
        Covode.recordClassIndex(38664);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38665);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends o {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62755c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62756d;

        static {
            Covode.recordClassIndex(38666);
        }

        @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
        public final /* synthetic */ void e(com.bytedance.sdk.a.a.a.b bVar) {
            e((d) bVar);
        }

        @Override // com.bytedance.sdk.a.e
        public final void a(d<p> dVar) {
            if (dVar == null || dVar.f43081j == null || ((p) dVar.f43081j).f43318c == null) {
                this.f62756d.invoke(dVar);
            } else {
                this.f62755c.invoke(dVar);
            }
        }

        b(h.f.a.b bVar, h.f.a.b bVar2) {
            this.f62755c = bVar;
            this.f62756d = bVar2;
        }

        @Override // com.bytedance.sdk.a.e, com.bytedance.sdk.a.c
        public final /* bridge */ /* synthetic */ void a(com.bytedance.sdk.a.a.a.b bVar, int i2) {
            a((d) bVar, i2);
        }

        @Override // com.bytedance.sdk.a.e
        public final void a(d<p> dVar, int i2) {
            this.f62756d.invoke(dVar);
        }
    }

    public e(com.bytedance.sdk.a.a.e eVar) {
        l.d(eVar, "");
        this.f62754a = eVar;
    }

    public static final class c extends m {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f62757c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f62758d;

        static {
            Covode.recordClassIndex(38667);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.a.a.a.a
        public final /* synthetic */ void a(d<l.a> dVar) {
            String str;
            d<l.a> dVar2 = dVar;
            if (dVar2 == null || !dVar2.f43071b) {
                h.f.a.b bVar = this.f62758d;
                if (dVar2 != null) {
                    str = dVar2.f43075f;
                } else {
                    str = null;
                }
                bVar.invoke(str);
                return;
            }
            this.f62757c.invoke();
        }

        c(h.f.a.a aVar, h.f.a.b bVar) {
            this.f62757c = aVar;
            this.f62758d = bVar;
        }
    }
}
