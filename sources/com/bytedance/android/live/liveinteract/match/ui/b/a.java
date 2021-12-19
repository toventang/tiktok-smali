package com.bytedance.android.live.liveinteract.match.ui.b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.match.b.a.a;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.liveinteract.platform.common.g.w;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class a extends a.c {

    /* renamed from: f  reason: collision with root package name */
    public static final C0204a f10824f = new C0204a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public int f10825d;

    /* renamed from: e  reason: collision with root package name */
    public long f10826e;

    /* renamed from: g  reason: collision with root package name */
    private WaveEffectView f10827g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f10828h;

    static {
        Covode.recordClassIndex(5789);
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.a.a.c
    public final void a() {
        HashMap hashMap = this.f10828h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment, com.bytedance.android.live.liveinteract.match.b.a.a.c
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.match.ui.b.a$a  reason: collision with other inner class name */
    public static final class C0204a {
        static {
            Covode.recordClassIndex(5790);
        }

        private C0204a() {
        }

        public /* synthetic */ C0204a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        e.a aVar = new e.a();
        String string = getString(R.string.e_v);
        l.b(string, "");
        e.a a2 = aVar.a(string);
        a2.f10038b = 263;
        a2.f10042f = false;
        return a2;
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.a.a.c
    public final void a(Throwable th) {
        l.d(th, "");
        ao.a(y.e(), (int) R.string.go2);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10829a;

        static {
            Covode.recordClassIndex(5791);
        }

        b(a aVar) {
            this.f10829a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.match.c.a.a(this.f10829a.f10825d, "decline");
            ((a.b) this.f10829a.f10034b).a(this.f10829a.f10825d, this.f10829a.f10826e);
            d.e eVar = this.f10829a.f10033a;
            if (eVar != null) {
                eVar.dismiss();
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10830a;

        static {
            Covode.recordClassIndex(5792);
        }

        c(a aVar) {
            this.f10830a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.match.b.b.b bVar;
            if (this.f10830a.f10825d == 1) {
                bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10675b;
            } else {
                bVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a;
            }
            bVar.n = System.currentTimeMillis();
            com.bytedance.android.live.liveinteract.match.c.a.a(this.f10830a.f10825d, "accept");
            ((a.b) this.f10830a.f10034b).b(this.f10830a.f10825d, this.f10830a.f10826e);
            d.e eVar = this.f10830a.f10033a;
            if (eVar != null) {
                eVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.a.a.c
    public final void b(Throwable th) {
        l.d(th, "");
        if (!(th instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) th).getErrorCode() != 4004048) {
            ao.a(y.e(), (int) R.string.go2);
        } else {
            ao.a(y.e(), (int) R.string.e_e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        View a2 = com.a.a(layoutInflater, R.layout.b9a, viewGroup, false);
        HashMap hashMap = new HashMap();
        com.bytedance.android.live.liveinteract.platform.common.g.b.b(hashMap);
        w.a(hashMap, b.a.a().p, false);
        com.bytedance.android.live.liveinteract.platform.common.g.b.f11948b = System.currentTimeMillis();
        hashMap.put("time_stamp", String.valueOf(com.bytedance.android.live.liveinteract.platform.common.g.b.f11948b));
        hashMap.put("connection_type", b.c.MANUAL_PK.getType());
        com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_connected_popup_show", hashMap);
        View findViewById = a2.findViewById(R.id.fiy);
        l.b(findViewById, "");
        WaveEffectView waveEffectView = (WaveEffectView) findViewById;
        this.f10827g = waveEffectView;
        if (waveEffectView == null) {
            l.a("mWaveEffectView");
        }
        waveEffectView.a();
        a2.findViewById(R.id.xe).setOnClickListener(new b(this));
        a2.findViewById(R.id.x4).setOnClickListener(new c(this));
        l.b(a2, "");
        User user = (User) com.bytedance.android.live.liveinteract.api.a.b.c("data_guest_user");
        if (user != null) {
            VHeadView vHeadView = (VHeadView) a2.findViewById(R.id.bxj);
            ImageModel avatarThumb = user.getAvatarThumb();
            l.b(vHeadView, "");
            g.a(vHeadView, avatarThumb, vHeadView.getWidth(), vHeadView.getHeight(), 2131234424);
            TextView textView = (TextView) a2.findViewById(R.id.f3f);
            l.b(textView, "");
            textView.setText(user.displayId);
        }
        return a2;
    }
}
