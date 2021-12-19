package com.ss.android.ugc.aweme.ecommerce.util;

import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class j {
    static {
        Covode.recordClassIndex(55048);
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ h.f.a.a $onClick$inlined;
        final /* synthetic */ boolean $showImage$inlined;

        static {
            Covode.recordClassIndex(55049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h.f.a.a aVar, boolean z) {
            super(1);
            this.$onClick$inlined = aVar;
            this.$showImage$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.util.j.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f87581a;

                static {
                    Covode.recordClassIndex(55050);
                }

                {
                    this.f87581a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f87581a.$onClick$inlined.invoke();
                }
            });
            tuxButton2.setTuxFont(42);
            tuxButton2.setText(tuxButton2.getContext().getString(R.string.bgc));
            tuxButton2.setButtonSize(3);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ h.f.a.a $onClick$inlined;
        final /* synthetic */ boolean $showImage$inlined;

        static {
            Covode.recordClassIndex(55051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h.f.a.a aVar, boolean z) {
            super(1);
            this.$onClick$inlined = aVar;
            this.$showImage$inlined = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.util.j.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f87582a;

                static {
                    Covode.recordClassIndex(55052);
                }

                {
                    this.f87582a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f87582a.$onClick$inlined.invoke();
                }
            });
            tuxButton2.setTuxFont(42);
            tuxButton2.setText(tuxButton2.getContext().getString(R.string.bgc));
            tuxButton2.setButtonSize(3);
            return z.f158842a;
        }
    }

    public static final TuxStatusView.c a(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        TuxStatusView.c cVar = new TuxStatusView.c();
        cVar.f45362j = new a(aVar, z);
        String string = g.c().getString(R.string.bge);
        l.b(string, "");
        cVar.a(string);
        String string2 = g.c().getString(R.string.bgd);
        l.b(string2, "");
        cVar.a((CharSequence) string2);
        if (z) {
            cVar.a(0, R.drawable.yu);
        }
        return cVar;
    }

    public static final TuxStatusView.c b(boolean z, h.f.a.a<z> aVar) {
        l.d(aVar, "");
        TuxStatusView.c cVar = new TuxStatusView.c();
        cVar.f45362j = new b(aVar, z);
        String string = g.c().getString(R.string.bgb);
        l.b(string, "");
        cVar.a(string);
        String string2 = g.c().getString(R.string.bga);
        l.b(string2, "");
        cVar.a((CharSequence) string2);
        if (z) {
            cVar.a(0, R.drawable.zd);
        }
        return cVar;
    }
}
