package com.ss.android.ugc.aweme.specact.popup.b;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.specact.popup.a.i;
import com.ss.android.ugc.aweme.specact.popup.b.e;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.n;
import h.z;

public final class j extends o {

    /* renamed from: f  reason: collision with root package name */
    public static final a f134571f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ImageView f134572a;

    /* renamed from: b  reason: collision with root package name */
    TextView f134573b;

    /* renamed from: c  reason: collision with root package name */
    RotateAnimation f134574c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f134575d;

    /* renamed from: e  reason: collision with root package name */
    public final e f134576e;

    static {
        Covode.recordClassIndex(87937);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87940);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void show() {
        super.show();
        i iVar = this.f134576e.n;
        l.d(iVar, "");
        r.a("referral_dialog_pop_show", a.b(iVar, null).f66730a);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f134580a;

        static {
            Covode.recordClassIndex(87942);
        }

        c(j jVar) {
            this.f134580a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            j jVar = this.f134580a;
            l.b(view, "");
            jVar.a(view);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f134581a;

        static {
            Covode.recordClassIndex(87943);
        }

        d(j jVar) {
            this.f134581a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            j jVar = this.f134581a;
            l.b(view, "");
            jVar.a(view);
        }
    }

    public final void a(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
            String str = "ok";
            if (this.f134576e.f134532m != null) {
                i iVar = this.f134576e.n;
                Boolean bool = this.f134576e.f134532m;
                if (bool == null) {
                    l.b();
                }
                if (!bool.booleanValue()) {
                    str = "add_to_calendar";
                }
                a.a(iVar, str);
            } else {
                a.a(this.f134576e.n, str);
            }
            m<? super j, ? super e, z> mVar = this.f134576e.f134531l;
            if (mVar != null) {
                mVar.invoke(this, this.f134576e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f134579a = new b();

        static {
            Covode.recordClassIndex(87941);
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
            aVar2.f44749a = R.raw.icon_calendar;
            aVar2.f44753e = Integer.valueOf((int) R.attr.f159902m);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    private final Drawable a(e.d dVar) {
        int i2 = k.f134583b[dVar.ordinal()];
        if (i2 == 1) {
            return androidx.core.content.b.a(getContext(), 2131233830);
        }
        if (i2 == 2) {
            return androidx.core.content.b.a(getContext(), 2131233832);
        }
        if (i2 == 3) {
            com.bytedance.tux.c.a a2 = com.bytedance.tux.c.c.a(b.f134579a);
            Context context = getContext();
            l.b(context, "");
            return a2.a(context);
        }
        throw new n();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0447, code lost:
        if (r0 == null) goto L_0x0449;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x051d, code lost:
        if (r0 == null) goto L_0x051f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(android.app.Activity r14, com.ss.android.ugc.aweme.specact.popup.b.e r15) {
        /*
        // Method dump skipped, instructions count: 1324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.specact.popup.b.j.<init>(android.app.Activity, com.ss.android.ugc.aweme.specact.popup.b.e):void");
    }
}
