package com.bytedance.android.live.liveinteract.cohost.ui.c;

import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.k;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.cohost.a.a.a;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.live.liveinteract.platform.common.view.WaveEffectView;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class a extends a.b implements View.OnClickListener {

    /* renamed from: j  reason: collision with root package name */
    public static final b f10293j = new b((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public long f10294d;

    /* renamed from: e  reason: collision with root package name */
    public long f10295e;

    /* renamed from: f  reason: collision with root package name */
    public m f10296f;

    /* renamed from: g  reason: collision with root package name */
    public c f10297g;

    /* renamed from: h  reason: collision with root package name */
    public C0171a f10298h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f10299i;

    /* renamed from: k  reason: collision with root package name */
    private View f10300k;

    /* renamed from: l  reason: collision with root package name */
    private WaveEffectView f10301l;

    /* renamed from: m  reason: collision with root package name */
    private LiveButton f10302m;
    private LiveButton n;
    private long o;
    private LiveCheckBox p;
    private HashMap q;

    static {
        Covode.recordClassIndex(5427);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.b
    public final void b() {
        HashMap hashMap = this.q;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public static final class b {
        static {
            Covode.recordClassIndex(5429);
        }

        private b() {
        }

        public static Room a() {
            Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
            if (room == null) {
                return new Room();
            }
            return room;
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    private a() {
        this.f10296f = m.NONE;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.b
    public final void a() {
        this.f10033a.dismiss();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        e.a aVar = new e.a();
        String string = getString(R.string.e_d);
        l.b(string, "");
        e.a a2 = aVar.a(string);
        a2.f10042f = false;
        return a2;
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.live.liveinteract.cohost.a.a.a.b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        WaveEffectView waveEffectView = this.f10301l;
        if (waveEffectView == null) {
            l.b();
        }
        waveEffectView.b();
        d.a aVar = this.f10034b;
        if (aVar == null) {
            l.b();
        }
        ((a.AbstractC0156a) aVar).a();
        b();
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.c.a$a  reason: collision with other inner class name */
    public static final class C0171a {

        /* renamed from: a  reason: collision with root package name */
        public long f10303a;

        static {
            Covode.recordClassIndex(5428);
        }

        public C0171a(long j2) {
            this.f10303a = j2;
        }
    }

    private final void a(int i2) {
        String str;
        boolean z;
        long j2;
        if (this.f10297g != null && this.f10298h != null) {
            if (i2 == 1) {
                str = "accept";
            } else {
                str = "reject";
            }
            LiveCheckBox liveCheckBox = this.p;
            if (liveCheckBox == null || !liveCheckBox.isChecked()) {
                z = false;
            } else {
                z = true;
            }
            System.currentTimeMillis();
            m mVar = this.f10296f;
            c cVar = this.f10297g;
            long j3 = 0;
            if (cVar != null) {
                j2 = cVar.f10304a;
            } else {
                j2 = 0;
            }
            C0171a aVar = this.f10298h;
            if (aVar != null) {
                j3 = aVar.f10303a;
            }
            h.a(mVar, j2, j3, str, this.f10295e, z);
        }
    }

    public final void a(boolean z) {
        if (this.mStatusViewValid) {
            if (z) {
                LiveButton liveButton = this.n;
                if (liveButton == null) {
                    l.a("mAcceptText");
                }
                liveButton.setVisibility(8);
                View view = this.f10300k;
                if (view == null) {
                    l.a("mRootView");
                }
                View findViewById = view.findViewById(R.id.ff7);
                l.b(findViewById, "");
                findViewById.setVisibility(8);
                return;
            }
            LiveButton liveButton2 = this.n;
            if (liveButton2 == null) {
                l.a("mAcceptText");
            }
            liveButton2.setVisibility(0);
            View view2 = this.f10300k;
            if (view2 == null) {
                l.a("mRootView");
            }
            View findViewById2 = view2.findViewById(R.id.ff7);
            l.b(findViewById2, "");
            findViewById2.setVisibility(0);
        }
    }

    public final void onClick(View view) {
        int i2;
        boolean z;
        String str;
        String str2;
        String str3;
        a.AbstractC0156a aVar;
        l.d(view, "");
        if (!this.f10035c.a(k.CONNECTION_FINISH)) {
            int id = view.getId();
            HashMap hashMap = new HashMap();
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(b.a().getId()));
            c cVar = this.f10297g;
            if (cVar != null) {
                hashMap.put("inviter_id", String.valueOf(cVar.f10304a));
            }
            C0171a aVar2 = this.f10298h;
            if (aVar2 != null) {
                hashMap.put("invitee_id", String.valueOf(aVar2.f10303a));
            }
            boolean z2 = true;
            if (id == R.id.f10) {
                i2 = 2;
            } else {
                i2 = 1;
                this.f10035c.C = System.currentTimeMillis();
            }
            JSONObject jSONObject = new JSONObject();
            com.bytedance.android.live.core.d.a.a(jSONObject, "reply_status", String.valueOf(i2));
            com.bytedance.android.live.liveinteract.cohost.c.b bVar = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
            com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "reply_click", (String) jSONObject, (JSONObject) 0);
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            m mVar = this.f10296f;
            LiveCheckBox liveCheckBox = this.p;
            if (liveCheckBox == null || !liveCheckBox.isChecked()) {
                z2 = false;
            }
            HashMap hashMap2 = new HashMap();
            if (z) {
                str = "accept";
            } else {
                str = "refuse";
            }
            hashMap2.put("choose_type", str);
            if (z2) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            hashMap2.put("is_turn_off_invitation", str2);
            if (mVar == m.FOLLOW_INVITE) {
                str3 = "mutual_follow";
            } else if (mVar == m.RECOMMEND_INVITE) {
                str3 = "recommend";
            } else {
                str3 = "weekly_rising_rank";
            }
            hashMap2.put("invitee_list", str3);
            hashMap2.put("enter_from", b.a.a().V);
            h.a("connected_popup_click", hashMap2);
            if (this.f10297g != null) {
                a.AbstractC0156a aVar3 = (a.AbstractC0156a) this.f10034b;
                if (aVar3 != null) {
                    long j2 = this.f10294d;
                    long j3 = this.f10295e;
                    c cVar2 = this.f10297g;
                    if (cVar2 == null) {
                        l.b();
                    }
                    aVar3.a(i2, j2, j3, cVar2.f10304a);
                }
                LiveCheckBox liveCheckBox2 = this.p;
                if (!(liveCheckBox2 == null || !liveCheckBox2.isChecked() || (aVar = (a.AbstractC0156a) this.f10034b) == null)) {
                    aVar.b();
                }
            }
            a.AbstractC0156a aVar4 = (a.AbstractC0156a) this.f10034b;
            if (aVar4 != null) {
                aVar4.a();
            }
            a(i2);
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f10311a;

        static {
            Covode.recordClassIndex(5431);
        }

        d(a aVar) {
            this.f10311a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f10311a.a(z);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.a.b
    public final void a(int i2, int i3) {
        a.AbstractC0156a aVar;
        if (this.mStatusViewValid) {
            int i4 = this.f10035c.Y;
            long j2 = 0;
            if (1 <= i4 && i3 >= i4) {
                a.AbstractC0156a aVar2 = (a.AbstractC0156a) this.f10034b;
                if (aVar2 != null) {
                    long j3 = this.f10294d;
                    long j4 = this.f10295e;
                    c cVar = this.f10297g;
                    if (cVar != null) {
                        j2 = cVar.f10304a;
                    }
                    aVar2.a(5, j3, j4, j2);
                    return;
                }
                return;
            }
            int i5 = i2 - i3;
            int i6 = i5 - 1;
            if (i6 >= 0) {
                LiveButton liveButton = this.f10302m;
                if (liveButton == null) {
                    l.a("mRefuseText");
                }
                liveButton.setText(com.bytedance.android.livesdk.utils.h.a(getString(R.string.dy6), Integer.valueOf(i6)));
            }
            if (i5 == 0) {
                if (this.f10297g != null) {
                    a.AbstractC0156a aVar3 = (a.AbstractC0156a) this.f10034b;
                    if (aVar3 != null) {
                        long j5 = this.f10294d;
                        long j6 = this.f10295e;
                        c cVar2 = this.f10297g;
                        if (cVar2 != null) {
                            j2 = cVar2.f10304a;
                        }
                        aVar3.a(5, j5, j6, j2);
                    }
                    LiveCheckBox liveCheckBox = this.p;
                    if (!(liveCheckBox == null || !liveCheckBox.isChecked() || (aVar = (a.AbstractC0156a) this.f10034b) == null)) {
                        aVar.b();
                    }
                }
                a(5);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0228  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r17, android.view.ViewGroup r18, android.os.Bundle r19) {
        /*
        // Method dump skipped, instructions count: 702
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.ui.c.a.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public long f10304a;

        /* renamed from: b  reason: collision with root package name */
        public ImageModel f10305b;

        /* renamed from: c  reason: collision with root package name */
        public String f10306c;

        /* renamed from: d  reason: collision with root package name */
        public int f10307d;

        /* renamed from: e  reason: collision with root package name */
        public String f10308e;

        /* renamed from: f  reason: collision with root package name */
        public String f10309f;

        /* renamed from: g  reason: collision with root package name */
        public long f10310g;

        static {
            Covode.recordClassIndex(5430);
        }

        public c(long j2, ImageModel imageModel, String str, int i2, String str2, String str3, long j3) {
            l.d(imageModel, "");
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            this.f10304a = j2;
            this.f10305b = imageModel;
            this.f10306c = str;
            this.f10307d = i2;
            this.f10308e = str2;
            this.f10309f = str3;
            this.f10310g = j3;
        }
    }
}
