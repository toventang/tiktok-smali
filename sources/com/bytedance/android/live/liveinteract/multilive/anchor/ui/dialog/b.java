package com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.a;
import com.bytedance.android.live.liveinteract.cohost.a.a.d;
import com.bytedance.android.live.liveinteract.multilive.anchor.d.b;
import com.bytedance.android.live.liveinteract.multilive.anchor.e.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.p;
import h.v;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class b extends com.bytedance.android.livesdk.widget.g implements com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a, b.AbstractC0236b, com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h {

    /* renamed from: h  reason: collision with root package name */
    public static final a f11718h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final DataChannel f11719a;

    /* renamed from: b  reason: collision with root package name */
    public final j.a.a.f f11720b = new j.a.a.f();

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.anchor.d.c f11721c = new com.bytedance.android.live.liveinteract.multilive.anchor.d.c(this);
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11722d;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "LINK_USER_INFO_CENTER")

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.a.c.d f11723e;

    /* renamed from: f  reason: collision with root package name */
    final m f11724f;

    /* renamed from: g  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b f11725g;

    /* renamed from: j  reason: collision with root package name */
    private RecyclerView f11726j;

    /* renamed from: k  reason: collision with root package name */
    private View f11727k;

    /* renamed from: l  reason: collision with root package name */
    private View f11728l;

    /* renamed from: m  reason: collision with root package name */
    private LiveLoadingView f11729m;
    private int n;
    private final HashMap<String, Boolean> o = new HashMap<>();
    private boolean p;
    private final h.h q;

    static {
        Covode.recordClassIndex(6381);
    }

    private final com.bytedance.android.livesdk.l.a h() {
        return (com.bytedance.android.livesdk.l.a) this.q.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final int b() {
        return R.layout.b7m;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6382);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.d.b.AbstractC0236b
    public final void d() {
        g();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h
    public final void a(boolean z, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
        h.f.b.l.d(eVar, "");
        Context context = getContext();
        h.f.b.l.b(context, "");
        User user = eVar.f15722c;
        h.f.b.l.b(user, "");
        k kVar = new k(this, eVar);
        h.f.b.l.d(context, "");
        h.f.b.l.d(user, "");
        h.f.b.l.d("MultiLive", "");
        h.f.b.l.d(kVar, "");
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            if (z) {
                new LiveDialog.a(context).a(y.a((int) R.string.edd, user.displayId)).a(R.string.edc, new b.c(context, user, room, kVar)).b(R.string.eid, b.d.f11638a).a().show();
                return;
            }
            com.bytedance.android.live.liveinteract.multilive.anchor.e.b.f11628a.a(u.a().b().a(((d.a) new d.c().a(user.getId())).a(room.getRequestId()).b("MultiLive").c("live_anchor_c_audience").b(room.getId()).d(room.getLabels()).c()).a(new b.a(kVar), new b.C0238b(kVar)));
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.android.livesdk.l.a> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(6387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.l.a invoke() {
            a.C0382a aVar = new a.C0382a(this.$context);
            aVar.f18266c = false;
            return aVar.a();
        }
    }

    static final class l implements com.bytedance.android.live.design.view.c {

        /* renamed from: a  reason: collision with root package name */
        public static final l f11739a = new l();

        static {
            Covode.recordClassIndex(6393);
        }

        l() {
        }

        @Override // com.bytedance.android.live.design.view.c
        public final void a() {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cW;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar, (Object) true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a() {
        k();
        if (isShowing()) {
            dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void c() {
        k();
        ao.a(getContext(), (int) R.string.grw);
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a e() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11722d;
        if (aVar == null) {
            h.f.b.l.a("mMultiGuestDataHolder");
        }
        return aVar;
    }

    private static com.bytedance.android.livesdk.chatroom.model.b.e i() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room == null) {
            return null;
        }
        com.bytedance.android.livesdk.chatroom.model.b.e eVar = new com.bytedance.android.livesdk.chatroom.model.b.e();
        eVar.f15730k = 0;
        User owner = room.getOwner();
        if (owner == null) {
            return null;
        }
        eVar.f15722c = owner;
        return eVar;
    }

    private static long j() {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            return room.getOwnerUserId();
        }
        return 0;
    }

    private final void k() {
        if (h().isShowing()) {
            h().dismiss();
        }
    }

    public final void dismiss() {
        super.dismiss();
        this.f11721c.g();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11722d;
        if (aVar == null) {
            h.f.b.l.a("mMultiGuestDataHolder");
        }
        aVar.s = false;
    }

    public final void f() {
        LiveLoadingView liveLoadingView = this.f11729m;
        if (liveLoadingView == null) {
            h.f.b.l.a("mLoadView");
        }
        liveLoadingView.setVisibility(8);
        RecyclerView recyclerView = this.f11726j;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        j.a.a.d dVar = new j.a.a.d();
        com.bytedance.android.livesdk.chatroom.model.b.e i2 = i();
        if (i2 != null) {
            dVar.add(i2);
        }
        dVar.add(new com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.b());
        this.f11720b.a(dVar);
        k();
        this.f11720b.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void b(long j2) {
        boolean z = this.f22610i;
    }

    static final class c implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11731a = new c();

        static {
            Covode.recordClassIndex(6384);
        }

        c() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class e implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11734a = new e();

        static {
            Covode.recordClassIndex(6386);
        }

        e() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(0);
            dialogInterface.dismiss();
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.g();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void b(Throwable th) {
        if (this.f22610i) {
            com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grj);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a(long j2) {
        if (this.f22610i) {
            k();
            if (isShowing()) {
                dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void c(long j2) {
        p<Integer, com.bytedance.android.livesdk.chatroom.model.b.e> e2 = e(j2);
        int intValue = e2.getFirst().intValue();
        com.bytedance.android.livesdk.chatroom.model.b.e second = e2.getSecond();
        if (intValue != -1) {
            second.f15726g = 2;
            this.f11720b.notifyItemChanged(intValue);
        }
    }

    static final class d implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11732a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f11733b;

        static {
            Covode.recordClassIndex(6385);
        }

        d(b bVar, User user) {
            this.f11732a = bVar;
            this.f11733b = user;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            String str = "";
            h.f.b.l.d(dialogInterface, str);
            com.bytedance.android.live.liveinteract.platform.common.g.i.a(1);
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11732a.f11725g;
            long id = this.f11733b.getId();
            String secUid = this.f11733b.getSecUid();
            if (secUid != null) {
                str = secUid;
            }
            bVar.a(id, str, "kickout_with_popup_confirm");
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11735a;

        static {
            Covode.recordClassIndex(6388);
        }

        g(b bVar) {
            this.f11735a = bVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i iVar;
            this.f11735a.dismiss();
            b bVar = this.f11735a;
            DataChannel dataChannel = bVar.f11719a;
            d.AbstractC0159d a2 = com.bytedance.android.live.liveinteract.platform.common.h.a.a(bVar.f11724f);
            if (!(dataChannel == null || (iVar = (androidx.fragment.app.i) dataChannel.b(com.bytedance.android.livesdk.j.ao.class)) == null)) {
                a2.show(iVar, "LinkDialog");
            }
            com.bytedance.android.live.liveinteract.multilive.b.a.a("icon");
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(6390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(String str) {
            h.f.b.l.d(str, "");
            if (this.this$0.e().f11302l > 0 && this.this$0.e().f11294d) {
                this.this$0.e().f11295e = 1;
                this.this$0.f11720b.notifyItemChanged(0);
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        h().a(getContext().getString(i2));
        if (!h().isShowing()) {
            h().show();
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11736a;

        static {
            Covode.recordClassIndex(6389);
        }

        h(b bVar) {
            this.f11736a = bVar;
        }

        public final void onClick(View view) {
            b bVar = this.f11736a;
            if (!com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a()) {
                ao.a(y.e(), (int) R.string.eh6);
            } else {
                new LiveDialog.a(bVar.getContext()).a(R.string.e1m).b(R.string.e0d).a(R.string.e1a, new C0241b(bVar)).b(R.string.emv, c.f11731a).a().show();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h
    public final void b(com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
        h.f.b.l.d(eVar, "");
        if (!this.p) {
            this.p = true;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11725g;
            User user = eVar.f15722c;
            h.f.b.l.b(user, "");
            long id = user.getId();
            User user2 = eVar.f15722c;
            h.f.b.l.b(user2, "");
            String secUid = user2.getSecUid();
            h.f.b.l.b(secUid, "");
            String a2 = eVar.a();
            h.f.b.l.b(a2, "");
            bVar.a(id, secUid, a2, 2, true);
            Set<Long> set = com.bytedance.android.livesdk.b.a.d.a().t;
            User user3 = eVar.f15722c;
            h.f.b.l.b(user3, "");
            set.remove(Long.valueOf(user3.getId()));
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11723e;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            User user4 = eVar.f15722c;
            h.f.b.l.b(user4, "");
            com.bytedance.android.livesdk.chatroom.model.b.e a3 = dVar.a("", user4.getId());
            if (a3 != null) {
                a3.f15724e = 0;
            }
            User user5 = eVar.f15722c;
            h.f.b.l.b(user5, "");
            FollowInfo followInfo = user5.getFollowInfo();
            h.f.b.l.b(followInfo, "");
            com.bytedance.android.live.liveinteract.platform.common.g.b.b("click", followInfo.getFollowStatus());
        }
    }

    public final p<Integer, com.bytedance.android.livesdk.chatroom.model.b.e> e(long j2) {
        List<?> list = this.f11720b.f158845b;
        h.f.b.l.b(list, "");
        int i2 = 0;
        for (T t : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                n.a();
            }
            if (t instanceof com.bytedance.android.livesdk.chatroom.model.b.e) {
                User user = t.f15722c;
                h.f.b.l.b(user, "");
                if (user.getId() == j2) {
                    return v.a(Integer.valueOf(i2), t);
                }
            }
            i2 = i3;
        }
        return v.a(-1, new com.bytedance.android.livesdk.chatroom.model.b.e());
    }

    /* renamed from: com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b$b  reason: collision with other inner class name */
    static final class C0241b implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11730a;

        static {
            Covode.recordClassIndex(6383);
        }

        C0241b(b bVar) {
            this.f11730a = bVar;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            androidx.fragment.app.e b2;
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11730a.a(R.string.grc);
            b bVar = this.f11730a;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = bVar.f11722d;
            if (aVar == null) {
                h.f.b.l.a("mMultiGuestDataHolder");
            }
            if (aVar.f11298h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = bVar.f11722d;
                if (aVar2 == null) {
                    h.f.b.l.a("mMultiGuestDataHolder");
                }
                if (!aVar2.f11294d && (b2 = com.bytedance.android.live.core.f.a.b(bVar.getContext())) != null) {
                    h.f.b.l.b(b2, "");
                    Context context = bVar.getContext();
                    h.f.b.l.b(context, "");
                    new MultiLiveAnchorOpenCameraDialog(context, bVar.f11719a, b2, "close_link").show();
                }
            }
            this.f11730a.f11725g.a(LinkApi.c.USER_CLICK, PrivacyCert.Builder.Companion.with("bpea-527").usage("").tag("turn off guest requests").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            com.bytedance.android.live.liveinteract.platform.common.g.b.d("manual_close");
        }
    }

    public static final class k implements com.bytedance.android.live.liveinteract.multilive.anchor.e.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11737a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.chatroom.model.b.e f11738b;

        static {
            Covode.recordClassIndex(6392);
        }

        @Override // com.bytedance.android.live.liveinteract.multilive.anchor.e.a
        public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
            Integer num;
            FollowInfo followInfo;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f23023e);
            } else {
                num = null;
            }
            long j2 = 1;
            if (num != null) {
                if (num.intValue() == 2) {
                    User user = this.f11738b.f15722c;
                    h.f.b.l.b(user, "");
                    followInfo = user.getFollowInfo();
                    h.f.b.l.b(followInfo, "");
                    j2 = 2;
                } else if (num.intValue() == 1) {
                    User user2 = this.f11738b.f15722c;
                    h.f.b.l.b(user2, "");
                    followInfo = user2.getFollowInfo();
                    h.f.b.l.b(followInfo, "");
                } else if (num.intValue() == 0) {
                    User user3 = this.f11738b.f15722c;
                    h.f.b.l.b(user3, "");
                    followInfo = user3.getFollowInfo();
                    h.f.b.l.b(followInfo, "");
                    User user4 = this.f11738b.f15722c;
                    h.f.b.l.b(user4, "");
                    FollowInfo followInfo2 = user4.getFollowInfo();
                    h.f.b.l.b(followInfo2, "");
                    long followStatus = followInfo2.getFollowStatus();
                    if (followStatus == 1 || followStatus != 2) {
                        j2 = 0;
                    } else {
                        j2 = 3;
                    }
                }
                followInfo.setFollowStatus(j2);
            }
            b bVar = this.f11737a;
            User user5 = this.f11738b.f15722c;
            h.f.b.l.b(user5, "");
            int intValue = bVar.e(user5.getId()).getFirst().intValue();
            if (intValue != -1) {
                this.f11737a.f11720b.notifyItemChanged(intValue);
            }
        }

        k(b bVar, com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
            this.f11737a = bVar;
            this.f11738b = eVar;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h
    public final void a(User user) {
        h.f.b.l.d(user, "");
        if (this.f22610i) {
            String a2 = y.a((int) R.string.e0e, user.displayId);
            LiveDialog.a aVar = new LiveDialog.a(getContext());
            aVar.f9375c = a2;
            aVar.b(R.string.e0f).a(R.string.e1t, new d(this, user)).b(R.string.dxk, e.f11734a).a().show();
            com.bytedance.android.live.liveinteract.platform.common.g.i.c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void d(long j2) {
        this.p = false;
        int intValue = e(j2).getFirst().intValue();
        if (intValue != -1) {
            List<?> list = this.f11720b.f158845b;
            h.f.b.l.b(list, "");
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = 0;
                    break;
                } else if (list.get(i2) instanceof com.bytedance.android.live.liveinteract.cohost.ui.d.f) {
                    break;
                } else {
                    i2++;
                }
            }
            list.remove(intValue);
            this.f11720b.notifyItemChanged(intValue);
            int i3 = this.n - 1;
            this.n = i3;
            if (i3 <= 0) {
                list.remove(i2);
                this.f11720b.notifyItemChanged(i2);
                if (list.size() == 1) {
                    g();
                    return;
                }
                return;
            }
            Object obj = list.get(i2);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.cohost.ui.item.TitleItem");
            com.bytedance.android.live.liveinteract.cohost.ui.d.f fVar = (com.bytedance.android.live.liveinteract.cohost.ui.d.f) obj;
            int i4 = this.n;
            if (i4 == 1) {
                String a2 = y.a((int) R.string.e52, Integer.valueOf(i4));
                h.f.b.l.b(a2, "");
                fVar.a(a2);
            } else {
                String a3 = y.a((int) R.string.e53, Integer.valueOf(i4));
                h.f.b.l.b(a3, "");
                fVar.a(a3);
            }
            this.f11720b.notifyItemChanged(i2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h
    public final void a(com.bytedance.android.livesdk.chatroom.model.b.e eVar) {
        String str;
        h.f.b.l.d(eVar, "");
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11723e;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            h.f.b.l.d(eVar, "");
            Iterator<com.bytedance.android.livesdk.chatroom.model.b.e> it = dVar.f11075c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.android.livesdk.chatroom.model.b.e next = it.next();
                User user = next.f15722c;
                h.f.b.l.b(user, "");
                long id = user.getId();
                User user2 = eVar.f15722c;
                h.f.b.l.b(user2, "");
                if (id == user2.getId()) {
                    next.f15726g = 3;
                    break;
                }
            }
        }
        User user3 = eVar.f15722c;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11722d;
        if (aVar == null) {
            h.f.b.l.a("mMultiGuestDataHolder");
        }
        if (aVar.t == -1) {
            str = "panel_Golive";
        } else {
            str = "panel_plus";
        }
        com.bytedance.android.livesdk.event.a aVar2 = new com.bytedance.android.livesdk.event.a(user3, str);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11722d;
        if (aVar3 == null) {
            h.f.b.l.a("mMultiGuestDataHolder");
        }
        aVar2.f17178c = aVar3.t;
        DataChannel dataChannel = this.f11719a;
        if (dataChannel != null) {
            dataChannel.c(com.bytedance.android.live.liveinteract.api.v.class, aVar2);
        }
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.c7o);
        h.f.b.l.b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        double b2 = (double) y.b();
        Double.isNaN(b2);
        layoutParams.height = (int) (b2 * 0.7d);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.c7o);
        h.f.b.l.b(linearLayout2, "");
        linearLayout2.setLayoutParams(layoutParams);
        View findViewById = findViewById(R.id.djs);
        h.f.b.l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f11726j = recyclerView;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        getContext();
        recyclerView.setLayoutManager(new SSLinearLayoutManager());
        RecyclerView recyclerView2 = this.f11726j;
        if (recyclerView2 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView2.setAdapter(this.f11720b);
        this.f11720b.a(com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.b.class, new com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.d(this.f11721c));
        this.f11720b.a(com.bytedance.android.live.liveinteract.cohost.ui.d.f.class, new com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.e());
        this.f11720b.a(com.bytedance.android.livesdk.chatroom.model.b.e.class, new com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.f(this.f11719a, this));
        View findViewById2 = findViewById(R.id.yx);
        h.f.b.l.b(findViewById2, "");
        this.f11727k = findViewById2;
        View findViewById3 = findViewById(R.id.yv);
        h.f.b.l.b(findViewById3, "");
        this.f11728l = findViewById3;
        View findViewById4 = findViewById(R.id.chc);
        h.f.b.l.b(findViewById4, "");
        this.f11729m = (LiveLoadingView) findViewById4;
        View view = this.f11727k;
        if (view == null) {
            h.f.b.l.a("mSettingsView");
        }
        view.setOnClickListener(new g(this));
        View view2 = this.f11728l;
        if (view2 == null) {
            h.f.b.l.a("mLayoutCloseView");
        }
        view2.setOnClickListener(new h(this));
        if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11723e;
            if (dVar == null) {
                h.f.b.l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(dVar, null, 2);
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11722d;
            if (aVar == null) {
                h.f.b.l.a("mMultiGuestDataHolder");
            }
            aVar.s = true;
        } else {
            this.f11721c.a((b.AbstractC0236b) this);
            this.f11721c.a();
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cW;
        h.f.b.l.b(bVar, "");
        Boolean a2 = bVar.a();
        h.f.b.l.b(a2, "");
        if (!a2.booleanValue()) {
            View view3 = this.f11727k;
            if (view3 == null) {
                h.f.b.l.a("mSettingsView");
            }
            com.bytedance.android.live.design.view.j.a((com.bytedance.android.live.design.view.h) ((a.C0140a) new a.C0140a(view3).c().a(5000).a(l.f11739a)).a(R.string.ds3).b());
        }
        DataChannel dataChannel = this.f11719a;
        if (dataChannel != null) {
            dataChannel.a(com.bytedance.android.live.liveinteract.platform.common.c.e.class, (h.f.a.b) new i(this)).a(com.bytedance.android.live.liveinteract.multilive.c.a.class, (h.f.a.b) new j(this));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.opt.a.a.a
    public final void a(Throwable th) {
        k();
        if (this.f22610i) {
            com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grk);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(m mVar, Context context, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar) {
        super(context);
        h.f.b.l.d(mVar, "");
        h.f.b.l.d(context, "");
        h.f.b.l.d(bVar, "");
        this.f11724f = mVar;
        this.f11725g = bVar;
        this.f11719a = bVar.o;
        this.q = h.i.a((h.f.a.a) new f(context));
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
        bVar.f11308c = this;
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.ui.b.h
    public final void a(long j2, String str, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11722d;
        if (aVar == null) {
            h.f.b.l.a("mMultiGuestDataHolder");
        }
        if (aVar.f11302l >= com.bytedance.android.livesdk.b.a.d.a().x) {
            ao.a(y.e(), (int) R.string.grn);
            return;
        }
        a(R.string.grl);
        this.f11725g.a(j2, str, str2, 1, true);
    }

    public final void b(List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list, List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list2, List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list3) {
        int i2;
        boolean z;
        if (list2 != null) {
            i2 = list2.size();
        } else {
            i2 = 0;
        }
        this.n = i2;
        if ((list == null || list.isEmpty() || (list.size() == 1 && ((com.bytedance.android.livesdk.chatroom.model.b.e) list.get(0)).f15730k == 0)) && ((list2 == null || list2.isEmpty()) && (list3 == null || list3.isEmpty()))) {
            g();
            return;
        }
        j.a.a.d dVar = new j.a.a.d();
        dVar.add(i());
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (T t : list) {
                User user = t.f15722c;
                h.f.b.l.b(user, "");
                if (user.getId() != j()) {
                    t.f15730k = 1;
                    dVar.add(t);
                }
            }
        }
        if (list2 != null && !list2.isEmpty()) {
            if (list2.size() == 1) {
                String a2 = y.a((int) R.string.e52, Integer.valueOf(list2.size()));
                h.f.b.l.b(a2, "");
                dVar.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.f(a2));
            } else {
                String a3 = y.a((int) R.string.e53, Integer.valueOf(list2.size()));
                h.f.b.l.b(a3, "");
                dVar.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.f(a3));
            }
            for (T t2 : list2) {
                t2.f15730k = 2;
                if (!h.f.b.l.a((Object) this.o.get(t2.a()), (Object) true)) {
                    HashMap<String, Boolean> hashMap = this.o;
                    String a4 = t2.a();
                    h.f.b.l.b(a4, "");
                    hashMap.put(a4, true);
                    User user2 = t2.f15722c;
                    h.f.b.l.b(user2, "");
                    FollowInfo followInfo = user2.getFollowInfo();
                    h.f.b.l.b(followInfo, "");
                    com.bytedance.android.live.liveinteract.platform.common.g.b.b("show", followInfo.getFollowStatus());
                }
                dVar.add(t2);
            }
        }
        if (list3 != null && !list3.isEmpty()) {
            String a5 = y.a((int) R.string.eq6);
            h.f.b.l.b(a5, "");
            dVar.add(new com.bytedance.android.live.liveinteract.cohost.ui.d.f(a5));
            for (T t3 : list3) {
                t3.f15730k = 3;
                dVar.add(t3);
            }
        }
        this.f11720b.a(dVar);
        this.f11720b.notifyDataSetChanged();
    }

    @Override // com.bytedance.android.live.liveinteract.multilive.anchor.d.b.AbstractC0236b
    public final void a(List<? extends com.bytedance.android.livesdk.chatroom.model.b.c> list, List<? extends com.bytedance.android.livesdk.chatroom.model.b.c> list2, List<? extends com.bytedance.android.livesdk.chatroom.model.b.c> list3) {
        b(com.bytedance.android.live.liveinteract.multiguest.a.c.e.a(list, 2), com.bytedance.android.live.liveinteract.multiguest.a.c.e.a(list2, 1), com.bytedance.android.live.liveinteract.multiguest.a.c.e.a(list3, 0));
        f();
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = this.f11723e;
        if (dVar == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar.b();
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = this.f11723e;
        if (dVar2 == null) {
            h.f.b.l.a("mInfoCenter");
        }
        dVar2.f11074b.clear();
        if (list != null) {
            for (T t : list) {
                com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar3 = this.f11723e;
                if (dVar3 == null) {
                    h.f.b.l.a("mInfoCenter");
                }
                dVar3.f11074b.add(com.bytedance.android.live.liveinteract.multiguest.a.c.e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t, 2));
            }
        }
        if (list2 != null) {
            for (T t2 : list2) {
                com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar4 = this.f11723e;
                if (dVar4 == null) {
                    h.f.b.l.a("mInfoCenter");
                }
                dVar4.f11074b.add(com.bytedance.android.live.liveinteract.multiguest.a.c.e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t2, 1));
            }
        }
        if (list3 != null) {
            for (T t3 : list3) {
                com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar5 = this.f11723e;
                if (dVar5 == null) {
                    h.f.b.l.a("mInfoCenter");
                }
                dVar5.f11074b.add(com.bytedance.android.live.liveinteract.multiguest.a.c.e.a((com.bytedance.android.livesdk.chatroom.model.b.c) t3, 0));
            }
        }
        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar6 = this.f11723e;
        if (dVar6 == null) {
            h.f.b.l.a("mInfoCenter");
        }
        for (T t4 : dVar6.f11074b) {
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar7 = this.f11723e;
            if (dVar7 == null) {
                h.f.b.l.a("mInfoCenter");
            }
            dVar7.a((com.bytedance.android.livesdk.chatroom.model.b.e) t4);
        }
    }
}
