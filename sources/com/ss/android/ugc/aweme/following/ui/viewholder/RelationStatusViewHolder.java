package com.ss.android.ugc.aweme.following.ui.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.following.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class RelationStatusViewHolder extends JediSimpleViewHolder<e> implements au {

    /* renamed from: g  reason: collision with root package name */
    public static final a f96615g = new a((byte) 0);

    /* renamed from: f  reason: collision with root package name */
    public final Context f96616f;

    /* renamed from: j  reason: collision with root package name */
    private final TuxStatusView f96617j = ((TuxStatusView) this.itemView.findViewById(R.id.e_o));

    /* renamed from: k  reason: collision with root package name */
    private final DmtStatusView.a f96618k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f96619l;

    static {
        Covode.recordClassIndex(61250);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(61251);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RelationStatusViewHolder f96621a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f96622b;

        static {
            Covode.recordClassIndex(61253);
        }

        c(RelationStatusViewHolder relationStatusViewHolder, e eVar) {
            this.f96621a = relationStatusViewHolder;
            this.f96622b = eVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (this.f96622b.f96337a == 9) {
                str = "following";
            } else {
                str = "fans";
            }
            SmartRouter.buildRoute(this.f96621a.f96616f, "//friends/find").withParam("previous_page", str).open();
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f96620a = new b();

        static {
            Covode.recordClassIndex(61252);
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
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 70.0f, system2.getDisplayMetrics()));
            aVar2.f44749a = R.raw.icon_large_person;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RelationStatusViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131560357(0x7f0d07a5, float:1.8746084E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            android.content.Context r0 = r5.getContext()
            h.f.b.l.b(r0, r3)
            r4.f96616f = r0
            android.view.View r1 = r4.itemView
            r0 = 2131368657(0x7f0a1ad1, float:1.835727E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.status.TuxStatusView r0 = (com.bytedance.tux.status.TuxStatusView) r0
            r4.f96617j = r0
            android.content.Context r0 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.ui.widget.DmtStatusView.a.a(r0)
            h.f.b.l.b(r0, r3)
            r4.f96618k = r0
            r0 = 1
            r4.f96619l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewholder.RelationStatusViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(e eVar) {
        int a2;
        int i2;
        int i3;
        e eVar2 = eVar;
        l.d(eVar2, "");
        switch (eVar2.f96337a) {
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                if (this.f96619l) {
                    TuxStatusView tuxStatusView = this.f96617j;
                    TuxStatusView.c a3 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(b.f96620a));
                    Context context = this.f96616f;
                    int i4 = ((e) aI_()).f96337a;
                    if (i4 != 7) {
                        if (i4 != 8) {
                            i2 = R.string.h32;
                        } else if (((e) aI_()).f96338b) {
                            i2 = R.string.h30;
                        } else {
                            i2 = R.string.h3f;
                        }
                    } else if (((e) aI_()).f96338b) {
                        i2 = R.string.byr;
                    } else {
                        i2 = R.string.h3d;
                    }
                    String string = context.getString(i2);
                    l.b(string, "");
                    TuxStatusView.c a4 = a3.a(string);
                    Context context2 = this.f96616f;
                    int i5 = ((e) aI_()).f96337a;
                    if (i5 != 7) {
                        if (i5 != 8) {
                            i3 = R.string.h33;
                        } else if (((e) aI_()).f96338b) {
                            i3 = R.string.h31;
                        } else {
                            i3 = R.string.h3g;
                        }
                    } else if (((e) aI_()).f96338b) {
                        i3 = R.string.c0g;
                    } else {
                        i3 = R.string.h3e;
                    }
                    String string2 = context2.getString(i3);
                    l.b(string2, "");
                    tuxStatusView.setStatus(a4.a((CharSequence) string2));
                    this.f96619l = false;
                }
                TuxStatusView tuxStatusView2 = this.f96617j;
                l.b(tuxStatusView2, "");
                ViewGroup.LayoutParams layoutParams = tuxStatusView2.getLayoutParams();
                if (TextUtils.isEmpty(eVar2.f96339c)) {
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 320.0f, system.getDisplayMetrics()));
                } else {
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    a2 = h.g.a.a(TypedValue.applyDimension(1, 400.0f, system2.getDisplayMetrics()));
                }
                layoutParams.height = a2;
                TuxStatusView tuxStatusView3 = this.f96617j;
                l.b(tuxStatusView3, "");
                tuxStatusView3.setLayoutParams(layoutParams);
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                View a5 = com.a.a(LayoutInflater.from(this.f96616f), R.layout.aqq, null, false);
                this.f96618k.b(a5);
                ((TextView) a5.findViewById(R.id.hd)).setOnClickListener(new c(this, eVar2));
                TuxStatusView tuxStatusView4 = this.f96617j;
                l.b(tuxStatusView4, "");
                ViewGroup.LayoutParams layoutParams2 = tuxStatusView4.getLayoutParams();
                Resources system3 = Resources.getSystem();
                l.a((Object) system3, "");
                layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, 155.0f, system3.getDisplayMetrics()));
                TuxStatusView tuxStatusView5 = this.f96617j;
                l.b(tuxStatusView5, "");
                tuxStatusView5.setLayoutParams(layoutParams2);
                return;
            default:
                return;
        }
    }
}
