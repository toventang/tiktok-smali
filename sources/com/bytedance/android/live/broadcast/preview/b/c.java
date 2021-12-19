package com.bytedance.android.live.broadcast.preview.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.ae;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.broadcast.model.o;
import com.bytedance.android.live.broadcast.preview.aj;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ci;
import com.bytedance.android.livesdk.j.dg;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastLiveAnchorIntroSetting;
import com.bytedance.android.livesdk.livesetting.gift.TTliveStartGiftConfigSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class c extends com.bytedance.android.live.broadcast.a.b {

    /* renamed from: a  reason: collision with root package name */
    public int f8133a;

    /* renamed from: b  reason: collision with root package name */
    int f8134b;

    /* renamed from: c  reason: collision with root package name */
    boolean f8135c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8136d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f8137e;

    static {
        Covode.recordClassIndex(4055);
    }

    @Override // com.bytedance.android.live.broadcast.a.b
    public final View a(int i2) {
        if (this.f8137e == null) {
            this.f8137e = new HashMap();
        }
        View view = (View) this.f8137e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f8137e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.a.b
    public final void a() {
        HashMap hashMap = this.f8137e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.broadcast.a.b, com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    private final void a(com.bytedance.android.live.broadcast.model.f fVar) {
        if (TTliveStartGiftConfigSetting.INSTANCE.getValue() && fVar != null) {
            this.f8133a = fVar.f7906a;
            this.f8136d = fVar.a();
            this.f8135c = fVar.b();
            this.f8134b = fVar.f7911f;
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8141a;

        static {
            Covode.recordClassIndex(4059);
        }

        d(c cVar) {
            this.f8141a = cVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bz;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f8141a);
            if (a2 != null) {
                a2.b(r.class, s.b(q.MODERATOR_LIST));
            }
            p.a(this.f8141a.a(R.id.cnc));
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8145a;

        static {
            Covode.recordClassIndex(4063);
        }

        f(c cVar) {
            this.f8145a = cVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LiveTextView liveTextView;
            com.bytedance.android.live.broadcast.model.j jVar = (com.bytedance.android.live.broadcast.model.j) obj;
            Context context = this.f8145a.getContext();
            if (context != null && (liveTextView = (LiveTextView) this.f8145a.a(R.id.aj0)) != null) {
                l.b(jVar, "");
                l.b(context, "");
                liveTextView.setText(c.a(jVar, context));
            }
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.android.live.broadcast.model.j, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(4064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(1);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.j jVar) {
            LiveTextView liveTextView;
            com.bytedance.android.live.broadcast.model.j jVar2 = jVar;
            l.d(jVar2, "");
            Context context = this.this$0.getContext();
            if (!(context == null || (liveTextView = (LiveTextView) this.this$0.a(R.id.aj0)) == null)) {
                l.b(context, "");
                liveTextView.setText(c.a(jVar2, context));
            }
            return z.f158842a;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8146a;

        static {
            Covode.recordClassIndex(4065);
        }

        h(c cVar) {
            this.f8146a = cVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bJ;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f8146a);
            if (a2 != null) {
                a2.b(r.class, s.b(q.TEMPORARY_MUTE));
            }
            p.a(this.f8146a.a(R.id.eit));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.b.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC0121c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8140a;

        static {
            Covode.recordClassIndex(4058);
        }

        View$OnClickListenerC0121c(c cVar) {
            this.f8140a = cVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f8140a);
            if (a2 != null) {
                a2.c(com.bytedance.android.live.broadcast.h.class);
            }
            androidx.fragment.app.d a3 = aj.a(true);
            if (a3 != null) {
                com.bytedance.android.live.core.widget.a.a(p.a(this.f8140a.getContext()), a3);
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cL;
            l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
            p.a(this.f8140a.a(R.id.bqx));
            b.a.a("livesdk_room_detail_setting").a().f("click").b();
        }
    }

    public final void b(boolean z) {
        String str;
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        h.p[] pVarArr = new h.p[3];
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        pVarArr[0] = v.a("send_gift_type", str);
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 == null || (iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) a2.b(x.class)) == null) {
            iVar = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
        }
        pVarArr[1] = v.a("live_type", com.bytedance.android.livesdkapi.depend.model.live.j.a(iVar));
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        pVarArr[2] = v.a("anchor_id", String.valueOf(b2.c()));
        b.a.a("anchor_click_gift_icon").a().d("start_broadcast").e("start_broadcast").b("live").c("click").a((Map<String, String>) ag.c(pVarArr)).b();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8142a;

        static {
            Covode.recordClassIndex(4060);
        }

        e(c cVar) {
            this.f8142a = cVar;
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            com.bytedance.android.live.base.model.user.b a2 = b2.a();
            l.b(a2, "");
            if (a2.getSecret() == 1) {
                LiveSwitch liveSwitch = (LiveSwitch) this.f8142a.a(R.id.dh8);
                l.b(liveSwitch, "");
                if (!liveSwitch.isChecked()) {
                    b.a b3 = new b.a(this.f8142a.getContext()).a(R.string.e78).b(R.string.e7a).a(R.string.eca, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.bytedance.android.live.broadcast.preview.b.c.e.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f8143a;

                        static {
                            Covode.recordClassIndex(4061);
                        }

                        {
                            this.f8143a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            dialogInterface.dismiss();
                            this.f8143a.f8142a.a(true);
                            this.f8143a.f8142a.a("livesdk_turn_on_ranking_popup_click").a("button_click_type", "turn_on").b();
                        }
                    }, false).b(R.string.e7_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                        /* class com.bytedance.android.live.broadcast.preview.b.c.e.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ e f8144a;

                        static {
                            Covode.recordClassIndex(4062);
                        }

                        {
                            this.f8144a = r1;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            dialogInterface.dismiss();
                            this.f8144a.f8142a.a("livesdk_turn_on_ranking_popup_click").a("button_click_type", "cancel").b();
                        }
                    }, false);
                    b3.f18296m = false;
                    b3.a().show();
                    this.f8142a.a("livesdk_turn_on_ranking_popup_show").b();
                    return;
                }
            }
            c cVar = this.f8142a;
            LiveSwitch liveSwitch2 = (LiveSwitch) cVar.a(R.id.dh8);
            l.b(liveSwitch2, "");
            cVar.a(!liveSwitch2.isChecked());
        }
    }

    public final com.bytedance.android.livesdk.ab.b a(String str) {
        return b.a.a(str).a(com.bytedance.ies.sdk.datachannel.f.a(this)).a("enter_from", "live_take_page").a("user_type", "anchor");
    }

    public final void a(boolean z) {
        int i2;
        String str;
        ((LiveSwitch) a(R.id.dh8)).toggle();
        if (z) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f8134b = i2;
        DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a2 != null) {
            a2.b(ae.class, Integer.valueOf(this.f8134b));
        }
        com.bytedance.android.livesdk.ab.b a3 = a("livesdk_live_rankings_setting_click");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        a3.a("ranking_status", str).b();
    }

    static final class j implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final j f8148a = new j();

        static {
            Covode.recordClassIndex(4067);
        }

        j() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8138a;

        static {
            Covode.recordClassIndex(4056);
        }

        a(c cVar) {
            this.f8138a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            int i2;
            String str;
            c cVar = this.f8138a;
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(cVar);
            if (a2 != null) {
                a2.b(com.bytedance.android.live.broadcast.e.class, Boolean.valueOf(z));
            }
            BlockWordView blockWordView = (BlockWordView) cVar.a(R.id.u5);
            l.b(blockWordView, "");
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            blockWordView.setVisibility(i2);
            if (!z) {
                ((BlockWordView) cVar.a(R.id.u5)).a();
            }
            h.p[] pVarArr = new h.p[2];
            if (z) {
                str = "open";
            } else {
                str = "close";
            }
            pVarArr[0] = v.a("status", str);
            pVarArr[1] = v.a("situation", "comment_setting");
            b.a.a("livesdk_set_comment_status").a().d("live_take_page").a((Map<String, String>) ag.c(pVarArr)).b();
        }
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8147a;

        static {
            Covode.recordClassIndex(4066);
        }

        i(c cVar) {
            this.f8147a = cVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (value == null || value.length() <= 0) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                l.b(a2, "");
                if (((IHostApp) a2).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f8147a.getContext(), value);
            com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_anchor_click_contact_us").a();
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            l.b(b2, "");
            a3.a("user_id", b2.c()).b();
        }
    }

    public static String a(com.bytedance.android.live.broadcast.model.j jVar, Context context) {
        if (jVar.f7925a == -1) {
            String string = context.getString(R.string.egc);
            l.b(string, "");
            return string;
        } else if (jVar.f7925a < 60) {
            String quantityString = context.getResources().getQuantityString(R.plurals.ge, (int) jVar.f7925a, Integer.valueOf((int) jVar.f7925a));
            l.b(quantityString, "");
            return quantityString;
        } else {
            Resources resources = context.getResources();
            int i2 = (int) (jVar.f7925a / 60);
            String quantityString2 = resources.getQuantityString(R.plurals.gd, i2, Integer.valueOf(i2));
            l.b(quantityString2, "");
            return quantityString2;
        }
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f8139a;

        static {
            Covode.recordClassIndex(4057);
        }

        b(c cVar) {
            this.f8139a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                this.f8139a.f8136d = false;
                this.f8139a.b(false);
            } else if (this.f8139a.f8133a == 5) {
                LiveSwitch liveSwitch = (LiveSwitch) this.f8139a.a(R.id.bb2);
                l.b(liveSwitch, "");
                liveSwitch.setChecked(false);
                c cVar = this.f8139a;
                String string = cVar.getString(R.string.glu);
                l.b(string, "");
                String a2 = com.a.a(string, Arrays.copyOf(new Object[]{LowAgeAnchorLimitSetting.INSTANCE.getValue()}, 1));
                l.b(a2, "");
                b.a aVar = new b.a(cVar.getContext());
                aVar.f18296m = true;
                aVar.f18285b = a2;
                aVar.a(R.string.gn0, (DialogInterface.OnClickListener) new i(cVar), false).b(R.string.gn1, (DialogInterface.OnClickListener) j.f8148a, false).a().show();
            } else {
                this.f8139a.f8136d = true;
                this.f8139a.b(true);
            }
            if (this.f8139a.f8133a != 1) {
                DataChannel a3 = com.bytedance.ies.sdk.datachannel.f.a(this.f8139a);
                if (a3 != null) {
                    a3.b(com.bytedance.android.live.broadcast.l.class, Integer.valueOf(this.f8139a.f8133a));
                }
            } else if (this.f8139a.f8136d) {
                DataChannel a4 = com.bytedance.ies.sdk.datachannel.f.a(this.f8139a);
                if (a4 != null) {
                    a4.b(com.bytedance.android.live.broadcast.l.class, (Object) 1);
                }
            } else {
                DataChannel a5 = com.bytedance.ies.sdk.datachannel.f.a(this.f8139a);
                if (a5 != null) {
                    a5.b(com.bytedance.android.live.broadcast.l.class, (Object) 2);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.bytedance.android.live.broadcast.model.f fVar;
        String str;
        com.bytedance.android.live.broadcast.model.f fVar2;
        o oVar;
        com.bytedance.android.live.base.model.user.b a2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel a3 = com.bytedance.ies.sdk.datachannel.f.a(this);
        Boolean bool = null;
        if (a3 != null) {
            fVar = (com.bytedance.android.live.broadcast.model.f) a3.b(com.bytedance.android.live.broadcast.c.class);
        } else {
            fVar = null;
        }
        a(fVar);
        BlockWordView blockWordView = (BlockWordView) a(R.id.u5);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        if (b2 == null || (a2 = b2.a()) == null || (str = a2.getSecUid()) == null) {
            str = "";
        }
        blockWordView.a(true, str, 0L, "live_take_page");
        LinearLayout linearLayout = (LinearLayout) a(R.id.a_8);
        l.b(linearLayout, "");
        linearLayout.setVisibility(0);
        ((LiveSwitch) a(R.id.a_9)).setOnCheckedChangeListener(new a(this));
        DataChannel a4 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a4 != null) {
            fVar2 = (com.bytedance.android.live.broadcast.model.f) a4.b(com.bytedance.android.live.broadcast.c.class);
        } else {
            fVar2 = null;
        }
        a(fVar2);
        if (this.f8135c) {
            LinearLayout linearLayout2 = (LinearLayout) a(R.id.bb1);
            l.b(linearLayout2, "");
            linearLayout2.setVisibility(0);
            LiveSwitch liveSwitch = (LiveSwitch) a(R.id.bb2);
            l.b(liveSwitch, "");
            liveSwitch.setChecked(this.f8136d);
            ((LiveSwitch) a(R.id.bb2)).setOnCheckedChangeListener(new b(this));
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bz;
        l.b(bVar, "");
        Boolean a5 = bVar.a();
        l.b(a5, "");
        if (a5.booleanValue()) {
            p.b(a(R.id.cnc));
        }
        ((LinearLayout) a(R.id.cnb)).setOnClickListener(new d(this));
        if (this.f8134b == 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.dh_);
            l.b(constraintLayout, "");
            constraintLayout.setVisibility(8);
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) a(R.id.dh_);
            l.b(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            LiveSwitch liveSwitch2 = (LiveSwitch) a(R.id.dh8);
            l.b(liveSwitch2, "");
            boolean z = true;
            if (this.f8134b != 1) {
                z = false;
            }
            liveSwitch2.setChecked(z);
            ((FrameLayout) a(R.id.dha)).setOnClickListener(new e(this));
        }
        DataChannel a6 = com.bytedance.ies.sdk.datachannel.f.a(this);
        if (a6 != null) {
            a6.b(ae.class, Integer.valueOf(this.f8134b));
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bJ;
        l.b(bVar2, "");
        Boolean a7 = bVar2.a();
        l.b(a7, "");
        if (a7.booleanValue()) {
            p.b(a(R.id.eit));
        }
        register(((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new f(this)));
        DataChannelGlobal.f34575d.a(this, this, ci.class, new g(this));
        ((LinearLayout) a(R.id.eis)).setOnClickListener(new h(this));
        if (BroadcastLiveAnchorIntroSetting.INSTANCE.enable()) {
            DataChannel a8 = com.bytedance.ies.sdk.datachannel.f.a(this);
            if (!(a8 == null || (oVar = (o) a8.b(dg.class)) == null)) {
                bool = Boolean.valueOf(oVar.q);
            }
            if (p.b(bool)) {
                LinearLayout linearLayout3 = (LinearLayout) a(R.id.bqu);
                l.b(linearLayout3, "");
                linearLayout3.setVisibility(0);
                com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.cL;
                l.b(bVar3, "");
                Boolean a9 = bVar3.a();
                l.b(a9, "");
                if (a9.booleanValue()) {
                    p.b(a(R.id.bqx));
                }
                b.a.a("livesdk_room_detail_setting").a().f("show").b();
                ((LinearLayout) a(R.id.bqu)).setOnClickListener(new View$OnClickListenerC0121c(this));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b9v, viewGroup, false);
    }
}
