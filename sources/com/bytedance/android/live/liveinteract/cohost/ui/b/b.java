package com.bytedance.android.live.liveinteract.cohost.ui.b;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Space;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.api.m;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.liveinteract.platform.common.g.h;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCoHostInviteePanelDismissSetting;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class b extends v {

    /* renamed from: j  reason: collision with root package name */
    public static final a f10240j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f10241a;

    /* renamed from: b  reason: collision with root package name */
    public String f10242b;

    /* renamed from: c  reason: collision with root package name */
    public int f10243c;

    /* renamed from: d  reason: collision with root package name */
    public String f10244d;

    /* renamed from: e  reason: collision with root package name */
    public String f10245e;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.cohost.a.d.d f10246f;

    /* renamed from: g  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.api.a.b f10247g;

    /* renamed from: h  reason: collision with root package name */
    com.bytedance.android.live.liveinteract.match.b.g.b f10248h;

    /* renamed from: i  reason: collision with root package name */
    public int f10249i;

    /* renamed from: k  reason: collision with root package name */
    private HashMap f10250k;

    static {
        Covode.recordClassIndex(5394);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f10250k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f10250k == null) {
            this.f10250k = new HashMap();
        }
        View view = (View) this.f10250k.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f10250k.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5395);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f10246f = null;
        this.f10248h = null;
        this.f10247g = null;
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b8x);
        bVar.f22375b = R.style.a29;
        bVar.f22380g = 80;
        bVar.f22382i = -2;
        return bVar;
    }

    public final b a(com.bytedance.android.live.liveinteract.match.b.g.b bVar) {
        l.d(bVar, "");
        this.f10248h = bVar;
        return this;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.b.b$b  reason: collision with other inner class name */
    static final class View$OnClickListenerC0169b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10251a;

        static {
            Covode.recordClassIndex(5396);
        }

        View$OnClickListenerC0169b(b bVar) {
            this.f10251a = bVar;
        }

        public final void onClick(View view) {
            this.f10251a.dismiss();
            h.a("keep_connect", this.f10251a.f10249i);
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10252a;

        static {
            Covode.recordClassIndex(5397);
        }

        c(b bVar) {
            this.f10252a = bVar;
        }

        public final void onClick(View view) {
            b bVar = this.f10252a;
            int i2 = bVar.f10243c;
            if (i2 != 1) {
                if (i2 == 2) {
                    com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
                    if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.INVITED) {
                        if (bVar.f10248h != null) {
                            HashMap hashMap = new HashMap();
                            com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
                            com.bytedance.android.live.liveinteract.platform.common.g.b.a(true, false, (Map<String, String>) hashMap);
                            hashMap.put("invitee_id", String.valueOf(b.a.a().f9941f));
                            com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_match_cancel_click", hashMap);
                            com.bytedance.android.live.liveinteract.match.b.g.b bVar2 = bVar.f10248h;
                            if (bVar2 != null) {
                                bVar2.a((h.f.a.a<z>) null);
                            }
                        }
                    } else if (com.bytedance.android.live.liveinteract.match.b.b.c.START.compareTo((Enum) a2) <= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) < 0) {
                        com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.a.POSITIVE_OVER);
                        com.bytedance.android.live.liveinteract.match.b.g.b bVar3 = bVar.f10248h;
                        if (bVar3 != null) {
                            bVar3.a(101, true, false, null);
                        }
                    }
                }
            } else if (bVar.f10246f != null) {
                ao.a(y.e(), (int) R.string.dyh);
                com.bytedance.android.live.liveinteract.api.a.b bVar4 = bVar.f10247g;
                if (bVar4 != null) {
                    bVar4.Q = true;
                }
                JSONObject jSONObject = new JSONObject();
                com.bytedance.android.live.liveinteract.cohost.c.b bVar5 = com.bytedance.android.live.liveinteract.cohost.c.b.f10210e;
                com.bytedance.android.live.liveinteract.cohost.c.b.a((com.bytedance.android.live.liveinteract.cohost.c.b) "finish_click", (String) jSONObject, (JSONObject) 0);
                com.bytedance.android.live.liveinteract.cohost.a.d.d dVar = bVar.f10246f;
                if (dVar != null) {
                    dVar.b(201);
                }
            }
            this.f10252a.dismiss();
            h.a("disconnect", this.f10252a.f10249i);
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f10253a;

        static {
            Covode.recordClassIndex(5398);
        }

        d(b bVar) {
            this.f10253a = bVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f10253a.f10249i = z ? 1 : 0;
            b.a.a().ah = z;
            b bVar = this.f10253a;
            if (z) {
                LiveButton liveButton = (LiveButton) bVar.a_(R.id.cu4);
                l.b(liveButton, "");
                liveButton.setVisibility(8);
                Space space = (Space) bVar.a_(R.id.e7t);
                l.b(space, "");
                space.setVisibility(8);
                return;
            }
            LiveButton liveButton2 = (LiveButton) bVar.a_(R.id.cu4);
            l.b(liveButton2, "");
            liveButton2.setVisibility(0);
            Space space2 = (Space) bVar.a_(R.id.e7t);
            l.b(space2, "");
            space2.setVisibility(0);
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        LiveTextView liveTextView = (LiveTextView) a_(R.id.f9l);
        l.b(liveTextView, "");
        liveTextView.setText(this.f10241a);
        LiveTextView liveTextView2 = (LiveTextView) a_(R.id.eye);
        l.b(liveTextView2, "");
        liveTextView2.setText(this.f10242b);
        boolean z2 = false;
        if (b.a.a().p.getType() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z || LiveCoHostInviteePanelDismissSetting.INSTANCE.getValue() == 0 || this.f10243c != 1) {
            View a_ = a_(R.id.fj2);
            l.b(a_, "");
            a_.setVisibility(8);
            LiveCheckBox liveCheckBox = (LiveCheckBox) a_(R.id.a36);
            l.b(liveCheckBox, "");
            liveCheckBox.setVisibility(8);
        } else {
            View a_2 = a_(R.id.fj2);
            l.b(a_2, "");
            a_2.setVisibility(0);
            LiveCheckBox liveCheckBox2 = (LiveCheckBox) a_(R.id.a36);
            l.b(liveCheckBox2, "");
            liveCheckBox2.setVisibility(0);
        }
        LiveButton liveButton = (LiveButton) a_(R.id.cu4);
        l.b(liveButton, "");
        liveButton.setText(this.f10245e);
        LiveButton liveButton2 = (LiveButton) a_(R.id.d7p);
        l.b(liveButton2, "");
        liveButton2.setText(this.f10244d);
        ((LiveButton) a_(R.id.cu4)).setOnClickListener(new View$OnClickListenerC0169b(this));
        ((LiveButton) a_(R.id.d7p)).setOnClickListener(new c(this));
        ((LiveCheckBox) view.findViewById(R.id.a36)).setOnCheckedChangeListener(new d(this));
        HashMap hashMap = new HashMap();
        if (b.a.a().p == m.FOLLOW_INVITE) {
            str = "mutual_follow";
        } else {
            str = "recommend";
        }
        hashMap.put("invitee_list", str);
        if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() != com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
            z2 = true;
        }
        if (!z2) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        h.a("cancel_connection_popup", hashMap);
    }
}
