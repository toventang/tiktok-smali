package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.cohost.a.a.f;
import com.bytedance.android.live.liveinteract.cohost.a.d.y;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class e extends v implements f.b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f10274c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a f10275a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10276b;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f10277d;

    static {
        Covode.recordClassIndex(5417);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f10277d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f10277d == null) {
            this.f10277d = new HashMap();
        }
        View view = (View) this.f10277d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f10277d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5418);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7w);
        bVar.f22380g = 80;
        bVar.f22379f = 0.0f;
        bVar.f22381h = -1;
        bVar.f22382i = -2;
        return bVar;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10278a;

        static {
            Covode.recordClassIndex(5419);
        }

        b(e eVar) {
            this.f10278a = eVar;
        }

        public final void onClick(View view) {
            this.f10278a.dismiss();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10279a;

        static {
            Covode.recordClassIndex(5420);
        }

        c(e eVar) {
            this.f10279a = eVar;
        }

        public final void onClick(View view) {
            f.a aVar = this.f10279a.f10275a;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f10280a;

        static {
            Covode.recordClassIndex(5421);
        }

        d(e eVar) {
            this.f10280a = eVar;
        }

        public final void onClick(View view) {
            f.a aVar = this.f10280a.f10275a;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String a2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        y yVar = new y(this.p);
        l.d(this, "");
        yVar.f10157a = this;
        this.f10275a = yVar;
        LiveTextView liveTextView = (LiveTextView) view.findViewById(R.id.f5a);
        com.bytedance.android.live.liveinteract.match.b.b.c a3 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        if (a3.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.START) < 0 || a3.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) >= 0) {
            a2 = com.bytedance.android.live.core.f.y.a((int) R.string.dy8);
        } else {
            a2 = com.bytedance.android.live.core.f.y.a((int) R.string.dyi);
        }
        liveTextView.setText(a2);
        LiveButton liveButton = (LiveButton) view.findViewById(R.id.xb);
        if (com.bytedance.android.live.liveinteract.cohost.a.e.d.b()) {
            liveButton.setText(com.bytedance.android.live.core.f.y.a((int) R.string.e06));
            liveButton.setOnClickListener(new b(this));
        } else {
            liveButton.setText(com.bytedance.android.live.core.f.y.a((int) R.string.dtz));
            liveButton.setOnClickListener(new c(this));
        }
        ((LiveButton) view.findViewById(R.id.xc)).setOnClickListener(new d(this));
        if (this.f10276b) {
            View findViewById = view.findViewById(R.id.c9c);
            l.b(findViewById, "");
            ((LinearLayout) findViewById).setVisibility(0);
        }
    }
}
