package com.bytedance.android.livesdk.a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.live.adminsetting.RoomSwitchApi;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.blockword.BlockWordView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.bb;
import com.bytedance.android.livesdk.j.ci;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.q;
import com.bytedance.android.livesdk.j.r;
import com.bytedance.android.livesdk.j.s;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.HashMap;

public final class o extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13313a;

    /* renamed from: b  reason: collision with root package name */
    private final h.h f13314b = com.bytedance.android.livesdkapi.m.d.a(new b(this));

    /* renamed from: c  reason: collision with root package name */
    private final h.h f13315c = com.bytedance.android.livesdkapi.m.d.a(new a(this));

    /* renamed from: d  reason: collision with root package name */
    private HashMap f13316d;

    static {
        Covode.recordClassIndex(7412);
    }

    private final Room c() {
        return (Room) this.f13314b.getValue();
    }

    public final View a(int i2) {
        if (this.f13316d == null) {
            this.f13316d = new HashMap();
        }
        View view = (View) this.f13316d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f13316d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return ((Boolean) this.f13315c.getValue()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final long b() {
        Room c2 = c();
        if (c2 != null) {
            return c2.getId();
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13316d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class a extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(7413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            Boolean bool;
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.this$0);
            if (a2 != null) {
                bool = (Boolean) a2.b(ee.class);
            } else {
                bool = null;
            }
            return Boolean.valueOf(p.a(bool));
        }
    }

    static final class b extends m implements h.f.a.a<Room> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(7414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(o oVar) {
            super(0);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Room invoke() {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.this$0);
            if (a2 != null) {
                return a2.b(df.class);
            }
            return null;
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final j f13324a = new j();

        static {
            Covode.recordClassIndex(7422);
        }

        j() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ao.a(y.e(), (int) R.string.e8a);
        }
    }

    static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final l f13327a = new l();

        static {
            Covode.recordClassIndex(7424);
        }

        l() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ao.a(y.e(), (int) R.string.e8a);
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13319a;

        static {
            Covode.recordClassIndex(7417);
        }

        e(o oVar) {
            this.f13319a = oVar;
        }

        public final void onClick(View view) {
            if (this.f13319a.f13313a) {
                ((BlockWordView) this.f13319a.a(R.id.u5)).a();
                return;
            }
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13319a);
            if (a2 != null) {
                a2.b(r.class, s.a(q.GUIDE));
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13320a;

        static {
            Covode.recordClassIndex(7418);
        }

        f(o oVar) {
            this.f13320a = oVar;
        }

        public final void onClick(View view) {
            DataChannel a2 = com.bytedance.ies.sdk.datachannel.f.a(this.f13320a);
            if (a2 != null) {
                a2.b(r.class, s.b(q.TEMPORARY_MUTE));
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bK;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) false);
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13321a;

        static {
            Covode.recordClassIndex(7419);
        }

        g(o oVar) {
            this.f13321a = oVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            LiveTextView liveTextView;
            com.bytedance.android.live.broadcast.model.j jVar = (com.bytedance.android.live.broadcast.model.j) obj;
            Context context = this.f13321a.getContext();
            if (context != null && (liveTextView = (LiveTextView) this.f13321a.a(R.id.aj0)) != null) {
                h.f.b.l.b(jVar, "");
                h.f.b.l.b(context, "");
                liveTextView.setText(e.a(jVar, context));
            }
        }
    }

    static final class h extends m implements h.f.a.b<com.bytedance.android.live.broadcast.model.j, z> {
        final /* synthetic */ o this$0;

        static {
            Covode.recordClassIndex(7420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(o oVar) {
            super(1);
            this.this$0 = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.model.j jVar) {
            LiveTextView liveTextView;
            com.bytedance.android.live.broadcast.model.j jVar2 = jVar;
            h.f.b.l.d(jVar2, "");
            Context context = this.this$0.getContext();
            if (!(context == null || (liveTextView = (LiveTextView) this.this$0.a(R.id.aj0)) == null)) {
                h.f.b.l.b(context, "");
                liveTextView.setText(e.a(jVar2, context));
            }
            return z.f158842a;
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13325a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13326b;

        static {
            Covode.recordClassIndex(7423);
        }

        k(o oVar, boolean z) {
            this.f13325a = oVar;
            this.f13326b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            boolean z = this.f13326b;
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_tns_filter_switch");
            if (z) {
                str = "switch_on";
            } else {
                str = "switch_off";
            }
            a2.a("click_switch", str).b();
            DataChannelGlobal.f34575d.a(bb.class, Boolean.valueOf(this.f13326b));
        }
    }

    static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f13323b;

        static {
            Covode.recordClassIndex(7421);
        }

        i(o oVar, boolean z) {
            this.f13322a = oVar;
            this.f13323b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            if (((com.bytedance.android.live.network.response.d) obj).statusCode == 0) {
                o oVar = this.f13322a;
                boolean z = this.f13323b;
                HashMap hashMap = new HashMap();
                String str2 = "open";
                if (z) {
                    str = str2;
                } else {
                    str = "close";
                }
                hashMap.put("status", str);
                hashMap.put("situation", "comment_setting");
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_set_comment_status");
                if (!z) {
                    str2 = "close";
                }
                a2.a("status", str2).a("situation", "comment_setting").a(com.bytedance.ies.sdk.datachannel.f.a(oVar)).d("live_detail").b();
                com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bR;
                h.f.b.l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(this.f13323b));
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.b(this.f13323b));
                return;
            }
            ao.a(y.e(), (int) R.string.e8a);
        }
    }

    public final void a(boolean z) {
        int i2;
        LinearLayout linearLayout = (LinearLayout) a(R.id.c_6);
        h.f.b.l.b(linearLayout, "");
        int i3 = 0;
        if (!z || !a()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        BlockWordView blockWordView = (BlockWordView) a(R.id.u5);
        h.f.b.l.b(blockWordView, "");
        if (!z) {
            i3 = 8;
        }
        blockWordView.setVisibility(i3);
        if (!z) {
            ((BlockWordView) a(R.id.u5)).a();
        }
    }

    static final class c implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13317a;

        static {
            Covode.recordClassIndex(7415);
        }

        c(o oVar) {
            this.f13317a = oVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f13317a.a(z);
            o oVar = this.f13317a;
            ((RoomSwitchApi) com.bytedance.android.live.network.e.a().a(RoomSwitchApi.class)).updateSwitch(oVar.b(), 3, z).a(new i(oVar, z), j.f13324a);
        }
    }

    static final class d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o f13318a;

        static {
            Covode.recordClassIndex(7416);
        }

        d(o oVar) {
            this.f13318a = oVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            o oVar = this.f13318a;
            ((RoomSwitchApi) com.bytedance.android.live.network.e.a().a(RoomSwitchApi.class)).updateSwitch(oVar.b(), 4, z).a(new k(oVar, z), l.f13327a);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Boolean bool;
        boolean z;
        View a2;
        RoomAuthStatus roomAuthStatus;
        User owner;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        BlockWordView blockWordView = (BlockWordView) a(R.id.u5);
        boolean a3 = a();
        Room c2 = c();
        if (c2 == null || (owner = c2.getOwner()) == null || (str = owner.getSecUid()) == null) {
            str = "";
        }
        blockWordView.a(a3, str, b(), "live_take_detail");
        ((FrameLayout) a(R.id.q9)).setOnClickListener(new e(this));
        LiveSwitch liveSwitch = (LiveSwitch) a(R.id.a_9);
        Room c3 = c();
        if (c3 == null || (roomAuthStatus = c3.getRoomAuthStatus()) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(roomAuthStatus.enableChat);
        }
        liveSwitch.setChecked(p.d(bool));
        a(liveSwitch.isChecked());
        liveSwitch.setOnCheckedChangeListener(new c(this));
        LiveSwitch liveSwitch2 = (LiveSwitch) a(R.id.c_7);
        Boolean bool2 = (Boolean) DataChannelGlobal.f34575d.b(bb.class);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            z = true;
        }
        liveSwitch2.setChecked(z);
        liveSwitch2.setOnCheckedChangeListener(new d(this));
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.bK;
        h.f.b.l.b(bVar, "");
        Boolean a4 = bVar.a();
        h.f.b.l.b(a4, "");
        if (a4.booleanValue() && (a2 = a(R.id.eit)) != null) {
            p.b(a2);
        }
        ((LinearLayout) a(R.id.eis)).setOnClickListener(new f(this));
        register(((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getMuteDuration().d(new g(this)));
        DataChannelGlobal.f34575d.a(this, this, ci.class, new h(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h.f.b.l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.b8a, viewGroup, false);
    }
}
