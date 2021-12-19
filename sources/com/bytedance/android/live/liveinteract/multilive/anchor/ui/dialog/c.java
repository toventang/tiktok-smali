package com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.liveinteract.api.c.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.livesdk.chatroom.model.b.e;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class c extends com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a {
    @d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11740c;

    /* renamed from: d  reason: collision with root package name */
    private View f11741d;

    /* renamed from: e  reason: collision with root package name */
    private View f11742e;

    /* renamed from: f  reason: collision with root package name */
    private View f11743f;

    /* renamed from: g  reason: collision with root package name */
    private final m f11744g;

    static {
        Covode.recordClassIndex(6394);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a, com.bytedance.android.livesdk.widget.g
    public final int b() {
        return R.layout.b7l;
    }

    public final void f() {
        View view = this.f11742e;
        if (view == null) {
            l.a("mPromptView");
        }
        view.setVisibility(8);
        View view2 = this.f11743f;
        if (view2 == null) {
            l.a("mShadowLineView");
        }
        view2.setVisibility(8);
    }

    public final void g() {
        i iVar;
        DataChannel dataChannel = this.f11410b.o;
        d.AbstractC0159d a2 = com.bytedance.android.live.liveinteract.platform.common.h.a.a(this.f11744g);
        if (dataChannel != null && (iVar = (i) dataChannel.b(ao.class)) != null) {
            a2.show(iVar, "LinkDialog");
        }
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11745a;

        static {
            Covode.recordClassIndex(6395);
        }

        a(c cVar) {
            this.f11745a = cVar;
        }

        public final void onClick(View view) {
            this.f11745a.f();
            this.f11745a.dismiss();
            this.f11745a.g();
            com.bytedance.android.live.liveinteract.multilive.b.a.a("icon");
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f11746a;

        static {
            Covode.recordClassIndex(6396);
        }

        b(c cVar) {
            this.f11746a = cVar;
        }

        public final void onClick(View view) {
            this.f11746a.f();
            this.f11746a.dismiss();
            this.f11746a.g();
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cV;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
            com.bytedance.android.live.liveinteract.multilive.b.a.a("notification");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a, com.bytedance.android.livesdk.widget.g
    public final void onCreate(Bundle bundle) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11740c;
        if (aVar == null) {
            l.a("mMultiGuestDataHolder");
        }
        super.a(bundle, aVar.q);
        View findViewById = findViewById(R.id.yx);
        l.b(findViewById, "");
        this.f11741d = findViewById;
        View findViewById2 = findViewById(R.id.c82);
        l.b(findViewById2, "");
        this.f11742e = findViewById2;
        View findViewById3 = findViewById(R.id.fjl);
        l.b(findViewById3, "");
        this.f11743f = findViewById3;
        View view = this.f11741d;
        if (view == null) {
            l.a("mSettingsView");
        } else {
            view.setOnClickListener(new a(this));
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cV;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (!a2.booleanValue()) {
            View view2 = this.f11742e;
            if (view2 == null) {
                l.a("mPromptView");
            }
            view2.setVisibility(0);
            View view3 = this.f11743f;
            if (view3 == null) {
                l.a("mShadowLineView");
            }
            view3.setVisibility(0);
            View view4 = this.f11742e;
            if (view4 == null) {
                l.a("mPromptView");
            } else {
                view4.setOnClickListener(new b(this));
            }
        } else {
            f();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(m mVar, Context context, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar, List<e> list) {
        super(context, bVar, list);
        l.d(mVar, "");
        l.d(context, "");
        l.d(bVar, "");
        this.f11744g = mVar;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }
}
