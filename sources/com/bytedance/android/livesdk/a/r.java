package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.dc;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.c;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.f;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.HashMap;

public final class r extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    private final h f13354a = i.a((h.f.a.a) new a(this));

    /* renamed from: b  reason: collision with root package name */
    private HashMap f13355b;

    static {
        Covode.recordClassIndex(7438);
    }

    public final View a(int i2) {
        if (this.f13355b == null) {
            this.f13355b = new HashMap();
        }
        View view = (View) this.f13355b.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13355b.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Room a() {
        return (Room) this.f13354a.getValue();
    }

    public static final class d implements c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13359b;

        static {
            Covode.recordClassIndex(7442);
        }

        @Override // com.bytedance.android.livesdk.rank.api.c.b
        public final void b() {
            ao.a(y.e(), (int) R.string.e8a);
        }

        @Override // com.bytedance.android.livesdk.rank.api.c.b
        public final void a() {
            String str;
            String str2;
            RoomAuthStatus roomAuthStatus;
            int i2;
            ((LiveSwitch) this.f13358a.a(R.id.dh8)).toggle();
            Room a2 = this.f13358a.a();
            if (!(a2 == null || (roomAuthStatus = a2.getRoomAuthStatus()) == null)) {
                if (this.f13359b) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                roomAuthStatus.setRankingsSwitchStatus(i2);
            }
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_live_rankings_setting_click").a();
            DataChannel a4 = f.a(this.f13358a);
            if (a4 == null || (str = (String) a4.b(dc.class)) == null) {
                str = "unknown";
            }
            com.bytedance.android.livesdk.ab.b a5 = a3.a("enter_from", str);
            if (this.f13359b) {
                str2 = "open";
            } else {
                str2 = "close";
            }
            a5.a("ranking_status", str2).a("user_type", "anchor").b();
        }

        d(r rVar, boolean z) {
            this.f13358a = rVar;
            this.f13359b = z;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13355b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class a extends m implements h.f.a.a<Room> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(7439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Room invoke() {
            DataChannel a2 = f.a(this.this$0);
            if (a2 != null) {
                return a2.b(df.class);
            }
            return null;
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13356a;

        static {
            Covode.recordClassIndex(7440);
        }

        b(r rVar) {
            this.f13356a = rVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = f.a(this.f13356a);
            if (a2 != null) {
                a2.b(com.bytedance.android.livesdk.j.r.class, s.a(q.GUIDE));
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f13357a;

        static {
            Covode.recordClassIndex(7441);
        }

        c(r rVar) {
            this.f13357a = rVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.rank.api.i iVar;
            r rVar = this.f13357a;
            LiveSwitch liveSwitch = (LiveSwitch) rVar.a(R.id.dh8);
            l.b(liveSwitch, "");
            boolean z = !liveSwitch.isChecked();
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class);
            l.b(a2, "");
            com.bytedance.android.livesdk.rank.api.c rankOptOutPresenter = ((com.bytedance.android.livesdk.rank.api.d) a2).getRankOptOutPresenter();
            if (rankOptOutPresenter != null) {
                Context context = rVar.getContext();
                if (z) {
                    iVar = com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_ON;
                } else {
                    iVar = com.bytedance.android.livesdk.rank.api.i.RANKINGS_SWITCH_STATUS_OFF;
                }
                rankOptOutPresenter.a(context, 5, iVar.getValue(), f.a(rVar), "anchor", new d(rVar, z));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i2;
        RoomAuthStatus roomAuthStatus;
        RoomAuthStatus roomAuthStatus2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (a() != null) {
            ((FrameLayout) a(R.id.q9)).setOnClickListener(new b(this));
            LinearLayout linearLayout = (LinearLayout) a(R.id.dh_);
            l.b(linearLayout, "");
            Room a2 = a();
            boolean z = false;
            if (a2 == null || (roomAuthStatus2 = a2.getRoomAuthStatus()) == null || roomAuthStatus2.getRankingsSwitchStatus() != 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
            LiveSwitch liveSwitch = (LiveSwitch) a(R.id.dh8);
            l.b(liveSwitch, "");
            Room a3 = a();
            if (!(a3 == null || (roomAuthStatus = a3.getRoomAuthStatus()) == null || roomAuthStatus.getRankingsSwitchStatus() != 1)) {
                z = true;
            }
            liveSwitch.setChecked(z);
            ((FrameLayout) a(R.id.dha)).setOnClickListener(new c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b88, viewGroup, false);
    }
}
