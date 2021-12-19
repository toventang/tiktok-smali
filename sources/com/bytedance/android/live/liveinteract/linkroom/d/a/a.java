package com.bytedance.android.live.liveinteract.linkroom.d.a;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.aj;
import com.bytedance.android.live.liveinteract.cohost.a.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.cohost.a.d.w;
import com.bytedance.android.live.liveinteract.linkroom.a.a.a;
import com.bytedance.android.live.liveinteract.platform.common.c.j;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.ap;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class a extends a.b implements View.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public static final C0194a f10596e = new C0194a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public DataChannel f10597d;

    /* renamed from: f  reason: collision with root package name */
    private View f10598f;

    /* renamed from: g  reason: collision with root package name */
    private View f10599g;

    /* renamed from: h  reason: collision with root package name */
    private View f10600h;

    /* renamed from: i  reason: collision with root package name */
    private LiveTextView f10601i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10602j;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f10603k;

    static {
        Covode.recordClassIndex(5647);
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.a.a.b
    public final void b() {
        HashMap hashMap = this.f10603k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.linkroom.a.a.a.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.linkroom.d.a.a$a  reason: collision with other inner class name */
    public static final class C0194a {
        static {
            Covode.recordClassIndex(5648);
        }

        private C0194a() {
        }

        public /* synthetic */ C0194a(byte b2) {
            this();
        }
    }

    private a() {
    }

    private static Room c() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return new Room();
        }
        return room;
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.a.a.b
    public final void a() {
        if (this.mStatusViewValid) {
            if (this.f10602j) {
                if (Build.VERSION.SDK_INT < 21) {
                    ao.a(y.e(), (int) R.string.grs);
                } else {
                    this.f10035c.V = "connection_icon";
                    this.f10033a.a(w.a.INVITE_USER_LIST_FRAGMENT, b.c.a(true));
                }
            }
            this.f10602j = false;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        float b2;
        e.a aVar = new e.a();
        String a2 = y.a((int) R.string.ehb);
        l.b(a2, "");
        e.a a3 = aVar.a(a2);
        if (this.f10600h == null) {
            l.a("mRootView");
        } else {
            View view = this.f10600h;
            if (view == null) {
                l.a("mRootView");
            }
            int height = view.getHeight();
            if (!(height == 0 || getActivity() == null)) {
                b2 = (float) ap.b(getActivity(), (float) height);
                a3.f10038b = (int) b2;
                return a3;
            }
        }
        b2 = 208.0f;
        a3.f10038b = (int) b2;
        return a3;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    static final class b extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(5649);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            this.this$0.a(num.intValue());
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.linkroom.a.a.a.b
    public final void a(Throwable th) {
        if (this.mStatusViewValid) {
            f.a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DataChannel dataChannel = this.f10597d;
        if (dataChannel != null) {
            dataChannel.a(j.class, (h.f.a.b) new b(this));
        }
    }

    public final void a(int i2) {
        if (i2 <= 0) {
            LiveTextView liveTextView = this.f10601i;
            if (liveTextView == null) {
                l.a("redotNumV");
            } else {
                liveTextView.setVisibility(8);
            }
        } else {
            LiveTextView liveTextView2 = this.f10601i;
            if (liveTextView2 == null) {
                l.a("redotNumV");
            } else {
                liveTextView2.setText(String.valueOf(i2));
            }
            LiveTextView liveTextView3 = this.f10601i;
            if (liveTextView3 == null) {
                l.a("redotNumV");
            } else {
                liveTextView3.setVisibility(0);
            }
        }
    }

    public final void onClick(View view) {
        boolean z;
        boolean z2;
        l.d(view, "");
        View view2 = this.f10599g;
        if (view2 == null) {
            l.a("mLinkInRoomBt");
        }
        if (view == view2) {
            z = true;
        } else {
            z = false;
        }
        View view3 = this.f10598f;
        if (view3 == null) {
            l.a("mLinkCrossRoomBt");
        }
        if (view == view3) {
            z2 = true;
        } else {
            z2 = false;
        }
        b.a.a().F = !z;
        if (z) {
            DataChannel dataChannel = this.f10597d;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.m.class);
            }
            DataChannel dataChannel2 = this.f10597d;
            if (dataChannel2 != null) {
                dataChannel2.c(com.bytedance.android.live.liveinteract.platform.common.c.a.class);
            }
            com.bytedance.android.live.liveinteract.platform.common.g.b.b("golive_window");
        } else if (z2) {
            com.bytedance.android.live.liveinteract.linkroom.a.b.a.a(1);
            DataChannel dataChannel3 = this.f10597d;
            if (dataChannel3 != null) {
                dataChannel3.c(com.bytedance.android.live.liveinteract.platform.common.c.l.class);
            }
            if (aj.a(b.a.a().a(), 2) && !TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue()) {
                ao.a(y.e(), (int) R.string.e1x);
                HashMap hashMap = new HashMap();
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
                com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_anchor_close_guest_connection_notice_show", hashMap);
            } else if (!(this.f10033a == null || c().getId() == 0)) {
                this.f10602j = true;
                d.a aVar = this.f10034b;
                if (aVar == null) {
                    l.b();
                }
                ((a.AbstractC0188a) aVar).a(c().getId());
            }
            h.a("panel", "connection_icon", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num;
        l.d(layoutInflater, "");
        int i2 = 0;
        View a2 = com.a.a(layoutInflater, R.layout.b98, viewGroup, false);
        l.b(a2, "");
        this.f10600h = a2;
        if (a2 == null) {
            l.a("mRootView");
        }
        View findViewById = a2.findViewById(R.id.x5);
        l.b(findViewById, "");
        this.f10598f = findViewById;
        View view = this.f10600h;
        if (view == null) {
            l.a("mRootView");
        }
        View findViewById2 = view.findViewById(R.id.x6);
        l.b(findViewById2, "");
        this.f10599g = findViewById2;
        if (findViewById2 == null) {
            l.a("mLinkInRoomBt");
        }
        View findViewById3 = findViewById2.findViewById(R.id.fjh);
        l.b(findViewById3, "");
        this.f10601i = (LiveTextView) findViewById3;
        View view2 = this.f10598f;
        if (view2 == null) {
            l.a("mLinkCrossRoomBt");
        }
        a(view2, R.string.dxz, R.string.dym, 2131234468);
        View view3 = this.f10599g;
        if (view3 == null) {
            l.a("mLinkInRoomBt");
        }
        a(view3, R.string.e51, R.string.e5c, 2131234469);
        DataChannel dataChannel = this.f10597d;
        if (!(dataChannel == null || (num = (Integer) dataChannel.b(j.class)) == null)) {
            i2 = num.intValue();
        }
        a(i2);
        View view4 = this.f10598f;
        if (view4 == null) {
            l.a("mLinkCrossRoomBt");
        }
        view4.setOnClickListener(this);
        View view5 = this.f10599g;
        if (view5 == null) {
            l.a("mLinkInRoomBt");
        }
        view5.setOnClickListener(this);
        View view6 = this.f10600h;
        if (view6 == null) {
            l.a("mRootView");
        }
        return view6;
    }

    private static void a(View view, int i2, int i3, int i4) {
        ((TextView) view.findViewById(R.id.f23)).setText(i2);
        ((TextView) view.findViewById(R.id.f22)).setText(i3);
        ((ImageView) view.findViewById(R.id.byn)).setImageResource(i4);
    }
}
