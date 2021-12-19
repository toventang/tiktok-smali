package com.ss.android.ugc.gamora.recorder.a;

import android.app.Dialog;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.a.k;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.tools.beauty.e.b.a;
import com.ss.android.ugc.aweme.tools.beauty.service.f;
import h.f.b.l;
import h.f.b.m;

public final class a {

    static final class d extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f147368a = new d();

        static {
            Covode.recordClassIndex(97114);
        }

        d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return 0;
        }
    }

    static {
        Covode.recordClassIndex(97108);
    }

    public static final class b implements com.ss.android.ugc.aweme.tools.beauty.e.b.a {
        static {
            Covode.recordClassIndex(97110);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.tools.beauty.e.b.a
        public final void a(a.C3665a aVar) {
            l.d(aVar, "");
            a.C0731a aVar2 = new a.C0731a(aVar.f138925a);
            aVar2.f33401a = aVar.f138926b;
            aVar2.f33402b = aVar.f138927c;
            aVar2.a(aVar.f138928d, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3955a(aVar), false).b(aVar.f138929e, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC3956b(aVar), false);
            Dialog c2 = aVar2.a().c();
            c2.setCanceledOnTouchOutside(false);
            c2.setCancelable(false);
            c2.show();
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$b$a  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC3955a implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.C3665a f147365a;

            static {
                Covode.recordClassIndex(97111);
            }

            DialogInterface$OnClickListenerC3955a(a.C3665a aVar) {
                this.f147365a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.b bVar = this.f147365a.f138930f;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$b$b  reason: collision with other inner class name */
        static final class DialogInterface$OnClickListenerC3956b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a.C3665a f147366a;

            static {
                Covode.recordClassIndex(97112);
            }

            DialogInterface$OnClickListenerC3956b(a.C3665a aVar) {
                this.f147366a = aVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i2) {
                a.b bVar = this.f147366a.f138930f;
                if (bVar != null) {
                    bVar.b();
                }
            }
        }
    }

    static final class c extends m implements h.f.a.b<f.a, com.ss.android.ugc.aweme.tools.beauty.h.d> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f147367a = new c();

        static {
            Covode.recordClassIndex(97113);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.h.d invoke(f.a aVar) {
            f.a aVar2 = aVar;
            l.d(aVar2, "");
            return new com.ss.android.ugc.aweme.tools.beauty.h.d(aVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.a.a$a  reason: collision with other inner class name */
    public static final class C3954a extends k {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.service.a.b f147359e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.tools.beauty.e.b.a f147360f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f147361g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f147362h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ com.bytedance.scene.group.b f147363i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ com.bytedance.o.f f147364j;

        static {
            Covode.recordClassIndex(97109);
        }

        @Override // com.bytedance.creativex.recorder.a.k
        public final com.bytedance.creativex.recorder.a.m a(com.bytedance.o.f fVar) {
            l.d(fVar, "");
            return new com.bytedance.creativex.recorder.a.m(fVar, this.f147359e, this.f147360f, this.f147361g, this.f147362h);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3954a(com.ss.android.ugc.aweme.tools.beauty.service.a.b bVar, com.ss.android.ugc.aweme.tools.beauty.e.b.a aVar, h.f.a.a aVar2, h.f.a.b bVar2, com.bytedance.scene.group.b bVar3, com.bytedance.o.f fVar, com.bytedance.scene.group.b bVar4, com.bytedance.o.f fVar2) {
            super(bVar4, fVar2);
            this.f147359e = bVar;
            this.f147360f = aVar;
            this.f147361g = aVar2;
            this.f147362h = bVar2;
            this.f147363i = bVar3;
            this.f147364j = fVar;
        }
    }

    public static final k a(com.bytedance.scene.group.b bVar, com.bytedance.o.f fVar) {
        l.d(bVar, "");
        l.d(fVar, "");
        Object a2 = fVar.a(ShortVideoContext.class);
        l.b(a2, "");
        AVETParameter j2 = ((ShortVideoContext) a2).j();
        l.b(j2, "");
        return new C3954a(new com.ss.android.ugc.aweme.tools.beauty.service.a.b(j2), new b(), d.f147368a, c.f147367a, bVar, fVar, bVar, fVar);
    }
}
