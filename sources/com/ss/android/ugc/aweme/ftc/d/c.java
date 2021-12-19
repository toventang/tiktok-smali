package com.ss.android.ugc.aweme.ftc.d;

import android.content.DialogInterface;
import androidx.appcompat.app.c;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.b.a.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    private final e f98424a;

    /* renamed from: b  reason: collision with root package name */
    private final m f98425b;

    static {
        Covode.recordClassIndex(62592);
    }

    @Override // com.ss.android.ugc.aweme.ftc.d.e
    public final void b() {
        this.f98425b.c(true);
    }

    @Override // com.ss.android.ugc.aweme.ftc.d.e
    public final void a() {
        com.ss.android.ugc.aweme.ah.c.a();
        this.f98425b.a(false);
    }

    static final class a extends h.f.b.m implements h.f.a.b<com.bytedance.tux.dialog.b.b, z> {
        final /* synthetic */ h.f.a.a $drop;

        static {
            Covode.recordClassIndex(62593);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.a aVar) {
            super(1);
            this.$drop = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.b(R.string.cu6, AnonymousClass1.f98426a);
            bVar2.c(R.string.cu5, new h.f.a.b<com.bytedance.tux.dialog.b.a, z>(this) {
                /* class com.ss.android.ugc.aweme.ftc.d.c.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(62595);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.bytedance.tux.dialog.b.a aVar) {
                    l.d(aVar, "");
                    this.this$0.$drop.invoke();
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.ftc.d.e
    public final void a(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        com.bytedance.tux.dialog.b.c.a((com.bytedance.tux.dialog.b) new com.bytedance.tux.dialog.b(this.f98424a).b(R.string.cu4), new a(aVar)).a().b().show();
    }

    static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98427a;

        static {
            Covode.recordClassIndex(62596);
        }

        b(h.f.a.a aVar) {
            this.f98427a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f98427a.invoke();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.d.c$c  reason: collision with other inner class name */
    static final class DialogInterface$OnClickListenerC2382c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98428a;

        static {
            Covode.recordClassIndex(62597);
        }

        DialogInterface$OnClickListenerC2382c(h.f.a.a aVar) {
            this.f98428a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f98428a.invoke();
        }
    }

    static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f98429a;

        static {
            Covode.recordClassIndex(62598);
        }

        d(h.f.a.a aVar) {
            this.f98429a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f98429a.invoke();
        }
    }

    public c(e eVar, m mVar) {
        l.d(eVar, "");
        l.d(mVar, "");
        this.f98424a = eVar;
        this.f98425b = mVar;
    }

    @Override // com.ss.android.ugc.aweme.ftc.d.e
    public final void a(h.f.a.a<z> aVar, h.f.a.a<z> aVar2, h.f.a.a<z> aVar3) {
        l.d(aVar, "");
        l.d(aVar2, "");
        l.d(aVar3, "");
        try {
            new c.a(this.f98424a, R.style.wt).b(R.string.c55).b(R.string.a9e, new b(aVar)).a(R.string.ym, new DialogInterface$OnClickListenerC2382c(aVar2)).c(R.string.yf, new d(aVar3)).b();
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.df.e.a(e2.toString());
        }
    }
}
