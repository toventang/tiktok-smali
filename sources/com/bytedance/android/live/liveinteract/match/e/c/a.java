package com.bytedance.android.live.liveinteract.match.e.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.publicscreen.a.d.h;
import com.bytedance.android.live.publicscreen.a.g;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.j.az;
import com.bytedance.android.livesdk.j.bg;
import com.bytedance.android.livesdk.model.message.b.e;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class a extends com.bytedance.android.live.publicscreen.a.f.b<com.bytedance.android.live.liveinteract.match.d.a.a> {

    /* renamed from: a  reason: collision with root package name */
    private final View f10813a;

    /* renamed from: d  reason: collision with root package name */
    private final ImageView f10814d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveTextView f10815e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveTextView f10816f;

    static {
        Covode.recordClassIndex(5782);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.e.c.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC0202a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10817a;

        static {
            Covode.recordClassIndex(5783);
        }

        View$OnClickListenerC0202a(g gVar) {
            this.f10817a = gVar;
        }

        public final void onClick(View view) {
            if (view != null && view.getContext() != null && this.f10817a.f12208l != null) {
                if (b.a.a().b() == k.CONNECTION_SUCCEED) {
                    DataChannel dataChannel = this.f10817a.f12208l;
                    if (dataChannel != null) {
                        dataChannel.c(bg.class, "");
                        return;
                    }
                    return;
                }
                ao.a(y.e(), (int) R.string.e9g);
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.EnumC0251b.PK_GUIDE, false);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
        View findViewById = view.findViewById(R.id.adh);
        l.b(findViewById, "");
        this.f10813a = findViewById;
        View findViewById2 = view.findViewById(R.id.acs);
        l.b(findViewById2, "");
        this.f10814d = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.bdp);
        l.b(findViewById3, "");
        this.f10815e = (LiveTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.br1);
        l.b(findViewById4, "");
        this.f10816f = (LiveTextView) findViewById4;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f10818a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f10819b;

        static {
            Covode.recordClassIndex(5784);
        }

        b(g gVar, e eVar) {
            this.f10818a = gVar;
            this.f10819b = eVar;
        }

        public final void onClick(View view) {
            if (view != null && view.getContext() != null && this.f10818a.f12208l != null) {
                Context context = this.f10818a.f12200d;
                int e2 = (int) y.e(ap.a(context));
                d webViewManager = ((f) com.bytedance.android.live.t.a.a(f.class)).webViewManager();
                d.b a2 = com.bytedance.android.livesdk.browser.c.e.a(this.f10819b.f19262c);
                a2.f14301b = e2;
                a2.f14302c = 402;
                d.b a3 = a2.a(8, 8, 0, 0);
                a3.f14309j = 80;
                com.bytedance.android.live.core.widget.a.a(p.a(context), webViewManager.a(a3));
                com.bytedance.android.live.base.a a4 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class);
                l.b(a4, "");
                if (((com.bytedance.android.live.liveinteract.api.b) a4).isRoomInBattle()) {
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cl;
                    l.b(bVar, "");
                    c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.f.a
    public final /* synthetic */ void a(g gVar, h hVar) {
        boolean z;
        float f2;
        Boolean bool;
        com.bytedance.android.live.publicscreen.a.d.k kVar = (com.bytedance.android.live.publicscreen.a.d.k) hVar;
        l.d(gVar, "");
        l.d(kVar, "");
        this.f10814d.setImageResource(2131234626);
        DataChannel dataChannel = gVar.f12208l;
        if (dataChannel == null || (bool = (Boolean) dataChannel.b(az.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        ViewGroup.LayoutParams layoutParams = this.f10813a.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
        if (z) {
            f2 = 0.99f;
        } else {
            f2 = 0.8f;
        }
        aVar.O = f2;
        this.f10813a.setLayoutParams(aVar);
        int i2 = ((com.bytedance.android.livesdk.model.message.ao) kVar.f12190d).f19174a;
        if (i2 == 0) {
            com.bytedance.android.livesdk.model.message.b.c cVar = ((com.bytedance.android.livesdk.model.message.ao) kVar.f12190d).f19175f;
            l.b(cVar, "");
            this.f10815e.setText(cVar.f19257a.f19264a);
            this.f10816f.setText(cVar.f19258b.f19264a);
            this.f10813a.setOnClickListener(new View$OnClickListenerC0202a(gVar));
        } else if (i2 == 4) {
            e eVar = ((com.bytedance.android.livesdk.model.message.ao) kVar.f12190d).f19179j;
            l.b(eVar, "");
            this.f10815e.setText(eVar.f19260a.f19264a);
            this.f10816f.setText(eVar.f19261b.f19264a);
            b.a.a("livesdk_match_rule_notice_show").a().b();
            this.f10813a.setOnClickListener(new b(gVar, eVar));
        }
    }
}
