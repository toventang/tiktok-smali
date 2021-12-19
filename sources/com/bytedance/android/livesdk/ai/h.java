package com.bytedance.android.livesdk.ai;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.g;
import com.bytedance.android.livesdk.j.db;
import com.bytedance.android.livesdk.rank.api.c;
import com.bytedance.android.livesdk.rank.api.d;
import com.bytedance.android.livesdk.rank.api.i;
import com.bytedance.android.livesdk.s.k;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class h extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final String f13786b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f13787c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f13788a;

    /* renamed from: d  reason: collision with root package name */
    private LiveSwitch f13789d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f13790e;

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f13790e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f13790e == null) {
            this.f13790e = new HashMap();
        }
        View view = (View) this.f13790e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13790e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(7666);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(7665);
        String simpleName = h.class.getSimpleName();
        l.b(simpleName, "");
        f13786b = simpleName;
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.be4);
        bVar.f22381h = -1;
        bVar.f22382i = y.a(372.0f);
        bVar.f22375b = R.style.a2d;
        bVar.f22380g = 80;
        return bVar;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "unknown";
        if (!(arguments == null || (string = arguments.getString("enter_from", str)) == null)) {
            str = string;
        }
        this.f13788a = str;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        l.b(cloneInContext, "");
        return cloneInContext;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f13792a;

        static {
            Covode.recordClassIndex(7668);
        }

        c(h hVar) {
            this.f13792a = hVar;
        }

        public final void onClick(View view) {
            i iVar;
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(d.class);
            l.b(a2, "");
            com.bytedance.android.livesdk.rank.api.c rankOptOutPresenter = ((d) a2).getRankOptOutPresenter();
            if (rankOptOutPresenter != null) {
                Context context = this.f13792a.getContext();
                LiveSwitch liveSwitch = (LiveSwitch) this.f13792a.a_(R.id.egy);
                l.b(liveSwitch, "");
                if (!liveSwitch.isChecked()) {
                    iVar = i.RANKINGS_SWITCH_STATUS_ON;
                } else {
                    iVar = i.RANKINGS_SWITCH_STATUS_OFF;
                }
                rankOptOutPresenter.a(context, 6, iVar.getValue(), this.f13792a.p, "user", new c.b(this) {
                    /* class com.bytedance.android.livesdk.ai.h.c.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f13793a;

                    static {
                        Covode.recordClassIndex(7669);
                    }

                    @Override // com.bytedance.android.livesdk.rank.api.c.b
                    public final void b() {
                        ao.a(y.e(), (int) R.string.e8a);
                    }

                    @Override // com.bytedance.android.livesdk.rank.api.c.b
                    public final void a() {
                        i iVar;
                        String str;
                        ((LiveSwitch) this.f13793a.f13792a.a_(R.id.egy)).toggle();
                        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.f34575d;
                        LiveSwitch liveSwitch = (LiveSwitch) this.f13793a.f13792a.a_(R.id.egy);
                        l.b(liveSwitch, "");
                        if (liveSwitch.isChecked()) {
                            iVar = i.RANKINGS_SWITCH_STATUS_ON;
                        } else {
                            iVar = i.RANKINGS_SWITCH_STATUS_OFF;
                        }
                        dataChannelGlobal.a(db.class, Long.valueOf(iVar.getValue()));
                        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_live_rankings_setting_click").a();
                        String str2 = this.f13793a.f13792a.f13788a;
                        if (str2 == null) {
                            l.a("mEnterFrom");
                        }
                        com.bytedance.android.livesdk.ab.b a3 = a2.a("enter_from", str2);
                        LiveSwitch liveSwitch2 = (LiveSwitch) this.f13793a.f13792a.a_(R.id.egy);
                        l.b(liveSwitch2, "");
                        if (liveSwitch2.isChecked()) {
                            str = "open";
                        } else {
                            str = "close";
                        }
                        a3.a("ranking_status", str).a("user_type", "user").b();
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f13793a = r1;
                    }
                });
            }
        }
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f13791a;

        static {
            Covode.recordClassIndex(7667);
        }

        b(h hVar) {
            this.f13791a = hVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cs;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
            if (!z) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cr;
                l.b(bVar2, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "PipSwitcherDialog LIVE_PIP_SWITCHER_OPEN -> false");
                b.a.a("livesdk_pip_switch_click").a(this.f13791a.p).a("switch_selection", "close").b();
            } else if (a.b()) {
                com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.cr;
                l.b(bVar3, "");
                com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar3, (Object) true);
                com.bytedance.android.live.core.c.a.a(4, "picture_in_picture", "PipSwitcherDialog LIVE_PIP_SWITCHER_OPEN -> true");
                l.b(compoundButton, "");
                Context context = compoundButton.getContext();
                l.b(context, "");
                if (!a.a(context)) {
                    k.c(compoundButton.getContext());
                    this.f13791a.dismissAllowingStateLoss();
                    g.a().c();
                }
                b.a.a("livesdk_pip_switch_click").a(this.f13791a.p).a("switch_selection", "open").b();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        boolean z = false;
        if (a.b()) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a_(R.id.c70);
            l.b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            LiveSwitch liveSwitch = (LiveSwitch) view.findViewById(R.id.d50);
            this.f13789d = liveSwitch;
            if (liveSwitch != null) {
                liveSwitch.setChecked(a.b(view.getContext()));
            }
            LiveSwitch liveSwitch2 = this.f13789d;
            if (liveSwitch2 != null) {
                liveSwitch2.setOnCheckedChangeListener(new b(this));
            }
        }
        Long l2 = (Long) DataChannelGlobal.f34575d.b(db.class);
        if (l2 != null) {
            long longValue = l2.longValue();
            if (longValue > i.RANKINGS_SWITCH_STATUS_HIDE.getValue()) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) a_(R.id.c96);
                l.b(constraintLayout2, "");
                constraintLayout2.setVisibility(0);
                LiveSwitch liveSwitch3 = (LiveSwitch) a_(R.id.egy);
                l.b(liveSwitch3, "");
                if (longValue == i.RANKINGS_SWITCH_STATUS_ON.getValue()) {
                    z = true;
                }
                liveSwitch3.setChecked(z);
                ((FrameLayout) a_(R.id.dha)).setOnClickListener(new c(this));
            }
        }
    }
}
