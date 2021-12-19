package com.bytedance.android.live.liveinteract.cohost.ui.c;

import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.cohost.a.a.c;
import com.bytedance.android.live.liveinteract.cohost.a.a.e;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.livesdk.ap.b;
import com.bytedance.android.livesdk.utils.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class c extends c.b implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    public static final a f10326d = new a((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private SwitchCompat f10327e;

    /* renamed from: f  reason: collision with root package name */
    private SwitchCompat f10328f;

    /* renamed from: g  reason: collision with root package name */
    private View f10329g;

    /* renamed from: h  reason: collision with root package name */
    private HashMap f10330h;

    static {
        Covode.recordClassIndex(5445);
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.b
    public final void c() {
        HashMap hashMap = this.f10330h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.live.liveinteract.cohost.a.a.c.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5446);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private c() {
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.b
    public final void b() {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f10327e;
            if (switchCompat == null) {
                l.a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f10328f;
            if (switchCompat2 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bT;
            l.b(bVar, "");
            SwitchCompat switchCompat3 = this.f10328f;
            if (switchCompat3 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(switchCompat3.isChecked()));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.d.b
    public final e.a d() {
        e.a aVar = new e.a();
        String string = getString(R.string.emk);
        l.b(string, "");
        e.a a2 = aVar.a(string);
        double e2 = (double) y.e(y.b());
        Double.isNaN(e2);
        a2.f10038b = (int) (e2 * 0.7d);
        a2.f10039c = true;
        return a2;
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.b
    public final void a() {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f10327e;
            if (switchCompat == null) {
                l.a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f10328f;
            if (switchCompat2 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bS;
            l.b(bVar, "");
            SwitchCompat switchCompat3 = this.f10327e;
            if (switchCompat3 == null) {
                l.a("mSwitchApplyInvitations");
            }
            com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(switchCompat3.isChecked()));
            b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bT;
            l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
        }
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.b
    public final void a(Throwable th) {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f10327e;
            if (switchCompat == null) {
                l.a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f10328f;
            if (switchCompat2 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            f.a(getContext(), th);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.cohost.a.a.c.b
    public final void b(Throwable th) {
        if (this.mStatusViewValid) {
            SwitchCompat switchCompat = this.f10327e;
            if (switchCompat == null) {
                l.a("mSwitchApplyInvitations");
            }
            switchCompat.setClickable(true);
            SwitchCompat switchCompat2 = this.f10328f;
            if (switchCompat2 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(true);
            f.a(getContext(), th);
        }
    }

    public final void onClick(View view) {
        l.d(view, "");
        if (view instanceof SwitchCompat) {
            SwitchCompat switchCompat = this.f10327e;
            if (switchCompat == null) {
                l.a("mSwitchApplyInvitations");
            }
            int i2 = 0;
            switchCompat.setClickable(false);
            SwitchCompat switchCompat2 = this.f10328f;
            if (switchCompat2 == null) {
                l.a("mSwitchAllowBeSuggested");
            }
            switchCompat2.setClickable(false);
            int id = view.getId();
            if (id == R.id.egn) {
                SwitchCompat switchCompat3 = this.f10327e;
                if (switchCompat3 == null) {
                    l.a("mSwitchApplyInvitations");
                }
                boolean isChecked = switchCompat3.isChecked();
                SwitchCompat switchCompat4 = this.f10328f;
                if (switchCompat4 == null) {
                    l.a("mSwitchAllowBeSuggested");
                }
                switchCompat4.setChecked(false);
                View view2 = this.f10329g;
                if (view2 == null) {
                    l.a("mLayoutAllowBeSuggested");
                }
                if (!isChecked) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
                c.a aVar = (c.a) this.f10034b;
                if (aVar != null) {
                    aVar.a(isChecked);
                }
                SwitchCompat switchCompat5 = this.f10327e;
                if (switchCompat5 == null) {
                    l.a("mSwitchApplyInvitations");
                }
                boolean isChecked2 = switchCompat5.isChecked();
                HashMap hashMap = new HashMap();
                hashMap.put("is_open", String.valueOf(isChecked2 ? 1 : 0));
                h.a("anchor_connection_open", hashMap);
            } else if (id == R.id.egm) {
                SwitchCompat switchCompat6 = this.f10328f;
                if (switchCompat6 == null) {
                    l.a("mSwitchAllowBeSuggested");
                }
                boolean isChecked3 = switchCompat6.isChecked();
                c.a aVar2 = (c.a) this.f10034b;
                if (aVar2 != null) {
                    aVar2.b(isChecked3);
                }
                h.a(isChecked3, "settings");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0099  */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 222
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.cohost.ui.c.c.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
