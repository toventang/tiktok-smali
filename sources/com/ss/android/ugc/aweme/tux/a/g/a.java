package com.ss.android.ugc.aweme.tux.a.g;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.status.TuxStatusView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a {
    static {
        Covode.recordClassIndex(92495);
    }

    public static final class d extends com.bytedance.tux.f.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f141568a;

        static {
            Covode.recordClassIndex(92500);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
        }

        d(h.f.a.a aVar) {
            this.f141568a = aVar;
        }

        public final void onClick(View view) {
            l.d(view, "");
            this.f141568a.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tux.a.g.a$a  reason: collision with other inner class name */
    public static final class C3759a extends m implements h.f.a.b<TuxButton, z> {
        final /* synthetic */ h.f.a.a $retryFunc;

        static {
            Covode.recordClassIndex(92496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3759a(h.f.a.a aVar) {
            super(1);
            this.$retryFunc = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(TuxButton tuxButton) {
            TuxButton tuxButton2 = tuxButton;
            l.d(tuxButton2, "");
            tuxButton2.setText(R.string.fan);
            tuxButton2.setButtonVariant(1);
            tuxButton2.setButtonSize(3);
            tuxButton2.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.tux.a.g.a.C3759a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C3759a f141565a;

                static {
                    Covode.recordClassIndex(92497);
                }

                {
                    this.f141565a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f141565a.$retryFunc.invoke();
                }
            });
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f141566a = new b();

        static {
            Covode.recordClassIndex(92498);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_wifi_slash;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f141567a = new c();

        static {
            Covode.recordClassIndex(92499);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_magnify_glass;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    public static final TuxStatusView.c a(TuxStatusView.c cVar) {
        l.d(cVar, "");
        TuxStatusView.c a2 = cVar.a(com.bytedance.tux.c.c.a(b.f141566a));
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.de2);
        l.b(string, "");
        TuxStatusView.c a3 = a2.a(string);
        String string2 = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.ad7);
        l.b(string2, "");
        return a3.a((CharSequence) string2);
    }

    public static final TuxStatusView.c b(TuxStatusView.c cVar) {
        l.d(cVar, "");
        TuxStatusView.c a2 = cVar.a(com.bytedance.tux.c.c.a(c.f141567a));
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.chu);
        l.b(string, "");
        TuxStatusView.c a3 = a2.a(string);
        String string2 = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cht);
        l.b(string2, "");
        return a3.a((CharSequence) string2);
    }

    public static final TuxStatusView.c a(TuxStatusView.c cVar, h.f.a.a<z> aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        TuxStatusView.c a2 = a(cVar);
        a2.f45362j = new C3759a(aVar);
        return a2;
    }

    public static final TuxStatusView.c b(TuxStatusView.c cVar, h.f.a.a<z> aVar) {
        l.d(cVar, "");
        l.d(aVar, "");
        String string = com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.cyv);
        l.b(string, "");
        com.bytedance.tux.f.d dVar = new com.bytedance.tux.f.d(string);
        dVar.a(51);
        dVar.setSpan(new d(aVar), 0, string.length(), 18);
        return cVar.a(dVar);
    }
}
