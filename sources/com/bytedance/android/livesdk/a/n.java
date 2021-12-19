package com.bytedance.android.livesdk.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.k;
import com.bytedance.android.livesdk.ap.c;
import com.bytedance.android.livesdk.j.bx;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.m.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.HashMap;

public final class n extends com.bytedance.android.livesdk.ui.a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final h f13311a = d.a(new a(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f13312b;

    static {
        Covode.recordClassIndex(7410);
    }

    private View a(int i2) {
        if (this.f13312b == null) {
            this.f13312b = new HashMap();
        }
        View view = (View) this.f13312b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13312b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    private final boolean a() {
        return ((Boolean) this.f13311a.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13312b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ n this$0;

        static {
            Covode.recordClassIndex(7411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar) {
            super(0);
            this.this$0 = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            DataChannel a2 = f.a(this.this$0);
            if (a2 != null) {
                bool = (Boolean) a2.b(ee.class);
            } else {
                bool = null;
            }
            return Boolean.valueOf(p.a(bool));
        }
    }

    public final void onClick(View view) {
        q qVar;
        l.d(view, "");
        DataChannel a2 = f.a(this);
        if (a2 != null) {
            int id = view.getId();
            if (id == R.id.cki) {
                b.a.a("livesdk_anchor_admin_list_click").a().b();
                k.a(getContext());
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bA;
                l.b(bVar, "");
                c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
                p.a(a(R.id.cnc));
                qVar = q.MODERATOR_LIST;
            } else if (id == R.id.crp) {
                b.a.a("livesdk_anchor_mute_list_click").a().b();
                qVar = q.MUTE;
            } else if (id == R.id.c3w) {
                b.a.a("livesdk_anchor_blocked_list_click").a().b();
                qVar = q.BLOCK;
            } else if (id == R.id.aa4) {
                b.a.a("livesdk_comment_settings_click").d("live_detail").b();
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bG;
                l.b(bVar2, "");
                c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                p.a(a(R.id.aa5));
                qVar = q.COMMENT_SETTING;
            } else if (id == R.id.dt4) {
                qVar = q.SCREEN_RECORD_SETTING;
            } else if (id == R.id.dh7) {
                qVar = q.RANKINGS_SWITCH;
            } else {
                return;
            }
            a2.b(r.class, s.b(qVar));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        Boolean bool;
        RoomAuthStatus roomAuthStatus;
        i iVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        b.a.a("livesdk_anchor_set_page_show").a().b();
        LiveTextView liveTextView = (LiveTextView) a(R.id.f9l);
        if (a()) {
            i2 = R.string.e7g;
        } else {
            i2 = R.string.ej1;
        }
        liveTextView.setText(i2);
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bA;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            p.b(a(R.id.cnc));
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bG;
        l.b(bVar2, "");
        Boolean a3 = bVar2.a();
        l.b(a3, "");
        if (a3.booleanValue()) {
            p.b(a(R.id.aa5));
        }
        DataChannel a4 = f.a(this);
        Room room = null;
        if (a4 == null || (iVar = (i) a4.b(bx.class)) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(j.g(iVar));
        }
        int i3 = 8;
        if (p.d(bool) || !a()) {
            LiveTextView liveTextView2 = (LiveTextView) a(R.id.dt4);
            l.b(liveTextView2, "");
            liveTextView2.setVisibility(8);
        }
        DataChannel a5 = f.a(this);
        if (a5 != null) {
            room = (Room) a5.b(df.class);
        }
        LiveTextView liveTextView3 = (LiveTextView) a(R.id.dh7);
        l.b(liveTextView3, "");
        if ((room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.getRankingsSwitchStatus() != 0) && a()) {
            i3 = 0;
        }
        liveTextView3.setVisibility(i3);
        ((LinearLayout) a(R.id.aa4)).setOnClickListener(this);
        ((LinearLayout) a(R.id.cki)).setOnClickListener(this);
        ((LiveTextView) a(R.id.dh7)).setOnClickListener(this);
        a(R.id.crp).setOnClickListener(this);
        ((LiveTextView) a(R.id.c3w)).setOnClickListener(this);
        ((LiveTextView) a(R.id.dt4)).setOnClickListener(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b7e, viewGroup, false);
    }
}
