package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.BaseLinkWidget;
import com.bytedance.android.live.liveinteract.api.b.n;
import com.bytedance.android.live.liveinteract.multiguest.a.c.d;
import com.bytedance.android.live.liveinteract.multiguest.a.f.f;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.live.liveinteract.platform.common.c.k;
import com.bytedance.android.live.n.x;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.c.q;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiLiveLinkPanelStyle;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class MultiGuestAsAnchorWidget extends BaseLinkWidget implements f.a, au {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b f11442a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a f11443b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b f11444c;

    /* renamed from: d  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.g.c.a f11445d;

    /* renamed from: e  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a f11446e;
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11447f;

    /* renamed from: g  reason: collision with root package name */
    private x f11448g;

    /* renamed from: h  reason: collision with root package name */
    private Room f11449h;

    /* renamed from: i  reason: collision with root package name */
    private MultiLiveAnchorOpenCameraDialog f11450i;

    /* renamed from: j  reason: collision with root package name */
    private final h.f.a.b<q, z> f11451j = new a(this);

    static {
        Covode.recordClassIndex(6166);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bfb;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, com.bytedance.android.live.liveinteract.api.BaseLinkWidget, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void d() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
        if (bVar != null) {
            bVar.i();
        }
    }

    public MultiGuestAsAnchorWidget() {
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void b() {
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11447f;
        if (aVar2 == null) {
            l.a("mDataHolder");
        }
        if (aVar2.q != n.NORMAL && (aVar = this.f11445d) != null) {
            aVar.c();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void a() {
        ao.a(this.context, (int) R.string.grk);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
        if (bVar != null) {
            bVar.a(LinkApi.c.RTC_ERROR, PrivacyCert.Builder.Companion.with("bpea-530").usage("").tag("stop link mic when error occurs").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Anchor_Widget_onDestroy");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
        if (bVar != null) {
            bVar.b();
        }
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.b();
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar2 = this.f11443b;
        if (aVar2 != null && aVar2.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar3 = this.f11443b;
            if (aVar3 != null) {
                aVar3.e();
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar4 = this.f11443b;
            if (aVar4 != null) {
                aVar4.dismiss();
            }
        }
        this.dataChannel.b(this);
        super.onDestroy();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
        if (bVar != null) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar = bVar.f11311f;
            if (cVar == null) {
                l.a("mRtcController");
            }
            cVar.g();
            if (bVar.f11309d == null) {
                l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(d.c.BACKGROUND);
        }
        super.onPause();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void c() {
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.f11450i;
        if (multiLiveAnchorOpenCameraDialog == null || !multiLiveAnchorOpenCameraDialog.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11447f;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            if (aVar.f11298h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11447f;
                if (aVar2 == null) {
                    l.a("mDataHolder");
                }
                if (!aVar2.f11294d) {
                    com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar3 = this.f11443b;
                    if (aVar3 != null) {
                        aVar3.dismiss();
                    }
                    com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar = this.f11444c;
                    if (bVar != null) {
                        bVar.dismiss();
                    }
                    Context context = this.context;
                    l.b(context, "");
                    MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = new MultiLiveAnchorOpenCameraDialog(context, this.dataChannel, this, "end_link_and_no_guest");
                    this.f11450i = multiLiveAnchorOpenCameraDialog2;
                    multiLiveAnchorOpenCameraDialog2.show();
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        boolean z;
        com.bytedance.android.live.liveinteract.multiguest.g.c.a bVar;
        Room room;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a d2;
        super.onCreate();
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Anchor_Widget_onCreate");
        this.f11449h = (Room) this.dataChannel.b(df.class);
        DataChannelGlobal.f34575d.a(this, k.class, new b(this));
        this.dataChannel.a((Object) this, com.bytedance.android.live.liveinteract.api.l.class, (h.f.a.b) this.f11451j).a((m) this, com.bytedance.android.livesdkapi.e.c.class, (h.f.a.b) new c(this)).a((m) this, com.bytedance.android.live.liveinteract.platform.common.c.b.class, (h.f.a.b) new d(this)).a((m) this, com.bytedance.android.live.liveinteract.multilive.c.f.class, (h.f.a.b) new e(this)).a((m) this, com.bytedance.android.live.liveinteract.platform.common.c.m.class, (h.f.a.b) new f(this)).a((Object) this, com.bytedance.android.live.liveinteract.multilive.anchor.b.b.class, (h.f.a.b) new g(this));
        Room room2 = this.f11449h;
        if (room2 != null) {
            DataChannel dataChannel = this.dataChannel;
            l.b(dataChannel, "");
            this.f11442a = new com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b(room2, dataChannel);
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar2 = this.f11442a;
        if (bVar2 != null) {
            bVar2.a((f.a) this);
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar3 = this.f11442a;
        if (bVar3 == null || (d2 = bVar3.d()) == null) {
            z = false;
        } else {
            z = d2.f11298h;
        }
        ao.a(y.e(), (int) R.string.dvv);
        if (z) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar4 = this.f11442a;
            if (bVar4 == null) {
                l.b();
            }
            Room room3 = bVar4.n;
            View view = this.contentView;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout = (FrameLayout) view;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar5 = this.f11442a;
            if (bVar5 == null) {
                l.b();
            }
            bVar = new com.bytedance.android.live.liveinteract.multilive.e.c(room3, frameLayout, bVar5.a());
        } else {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar6 = this.f11442a;
            com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = null;
            if (bVar6 != null) {
                room = bVar6.n;
            } else {
                room = null;
            }
            View view2 = getView();
            Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.FrameLayout");
            FrameLayout frameLayout2 = (FrameLayout) view2;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar7 = this.f11442a;
            if (bVar7 != null) {
                dVar = bVar7.a();
            }
            bVar = new com.bytedance.android.live.liveinteract.multiguest.g.c.b(room, true, null, frameLayout2, dVar);
        }
        DataChannel dataChannel2 = this.dataChannel;
        l.b(dataChannel2, "");
        bVar.a(dataChannel2);
        bVar.a(false);
        this.f11445d = bVar;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
        if (bVar != null) {
            com.bytedance.android.live.liveinteract.platform.c.c cVar = bVar.f11311f;
            if (cVar == null) {
                l.a("mRtcController");
            }
            cVar.b(false);
            if (bVar.f11309d == null) {
                l.a("mInfoCenter");
            }
            com.bytedance.android.live.liveinteract.multiguest.a.c.d.a(d.c.FOREGROUND);
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog = this.f11450i;
        if (multiLiveAnchorOpenCameraDialog == null || !multiLiveAnchorOpenCameraDialog.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11447f;
            if (aVar == null) {
                l.a("mDataHolder");
            }
            if (aVar.f11298h && MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11447f;
                if (aVar2 == null) {
                    l.a("mDataHolder");
                }
                if (aVar2.f11302l == 0) {
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar3 = this.f11447f;
                    if (aVar3 == null) {
                        l.a("mDataHolder");
                    }
                    aVar3.f11294d = true;
                    com.bytedance.android.livesdk.an.a.a().a(new r(40));
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.c(com.bytedance.android.live.liveinteract.multilive.c.c.class, true);
                    }
                    DataChannel dataChannel2 = this.dataChannel;
                    if (dataChannel2 != null) {
                        dataChannel2.c(com.bytedance.android.live.liveinteract.multilive.anchor.b.a.class, new com.bytedance.android.live.liveinteract.multilive.anchor.b.d(false, "end_link_and_no_guest"));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        MultiLiveAnchorOpenCameraDialog multiLiveAnchorOpenCameraDialog2 = this.f11450i;
        if (multiLiveAnchorOpenCameraDialog2 != null) {
            multiLiveAnchorOpenCameraDialog2.a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.api.f
    public final void a(x xVar) {
        l.d(xVar, "");
        this.f11448g = xVar;
    }

    static final class h implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsAnchorWidget f11452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f11453b;

        static {
            Covode.recordClassIndex(6174);
        }

        h(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget, z.e eVar) {
            this.f11452a = multiGuestAsAnchorWidget;
            this.f11453b = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f11452a.f11444c = null;
            this.f11452a.dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.m.class);
        }
    }

    static final class i implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsAnchorWidget f11454a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f11455b;

        static {
            Covode.recordClassIndex(6175);
        }

        i(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget, z.e eVar) {
            this.f11454a = multiGuestAsAnchorWidget;
            this.f11455b = eVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f11454a.f11443b = null;
            this.f11454a.dataChannel.c(com.bytedance.android.live.liveinteract.platform.common.c.m.class);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void a(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void b(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void d(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.d(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void e(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.d(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void f(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final int h(String str) {
        l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            return aVar.f(str);
        }
        return -1;
    }

    static final class a extends h.f.b.m implements h.f.a.b<q, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6167);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(q qVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar;
            q qVar2 = qVar;
            l.d(qVar2, "");
            MultiGuestAsAnchorWidget multiGuestAsAnchorWidget = this.this$0;
            if (qVar2.f15140a == 0 && (bVar = multiGuestAsAnchorWidget.f11442a) != null) {
                bVar.i();
            }
            return h.z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6168);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            l.d(zVar, "");
            ao.a(y.e(), (int) R.string.eav);
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.this$0.f11442a;
            if (bVar != null) {
                bVar.i();
            }
            return h.z.f158842a;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6172);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            l.d(zVar, "");
            com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.this$0.f11445d;
            if (aVar != null) {
                aVar.d();
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void c(String str) {
        l.d(str, "");
        ao.a(y.e(), y.a((int) R.string.e9r, str), 0);
    }

    static final class c extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6169);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            bool.booleanValue();
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.this$0.f11442a;
            if (bVar != null) {
                bVar.a(LinkApi.c.ILLEGAL_LIVE, PrivacyCert.Builder.Companion.with("bpea-529").usage("").tag("stop link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
            return h.z.f158842a;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<h.z, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6171);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(h.z zVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a d2;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar;
            l.d(zVar, "");
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar2 = this.this$0.f11442a;
            if (!(bVar2 == null || (d2 = bVar2.d()) == null || !d2.f11298h || (bVar = this.this$0.f11442a) == null)) {
                bVar.i();
            }
            return h.z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6173);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a aVar) {
            com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a aVar2 = aVar;
            l.d(aVar2, "");
            if (this.this$0.f11444c == null && this.this$0.f11443b == null) {
                this.this$0.f11446e = aVar2;
                this.this$0.d();
                com.bytedance.android.live.liveinteract.platform.common.g.b.b("plus_button");
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final int g(String str) {
        l.d(str, "");
        com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
        l.b(a2, "");
        if (l.a((Object) str, (Object) a2.f14184e)) {
            return 0;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            return aVar.e(str);
        }
        return -1;
    }

    static final class d extends h.f.b.m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ MultiGuestAsAnchorWidget this$0;

        static {
            Covode.recordClassIndex(6170);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(MultiGuestAsAnchorWidget multiGuestAsAnchorWidget) {
            super(1);
            this.this$0 = multiGuestAsAnchorWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.this$0.f11442a;
                if (bVar != null) {
                    bVar.a(LinkApi.c.INTERRUPT_BY_CO_HOST, PrivacyCert.Builder.Companion.with("bpea-569").usage("").tag("pause link mic").policies(PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
                }
                com.bytedance.android.live.liveinteract.platform.common.g.b.d("accept_anchor_invite");
            }
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void b(List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar;
        l.d(list, "");
        if (isViewValid()) {
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar = this.f11443b;
            if (aVar == null || !aVar.isShowing()) {
                com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar2 = this.f11444c;
                if (bVar2 != null && bVar2.isShowing() && (bVar = this.f11444c) != null) {
                    if (LiveLinkListOptiEnableSetting.INSTANCE.getValue()) {
                        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar = bVar.f11723e;
                        if (dVar == null) {
                            l.a("mInfoCenter");
                        }
                        List<com.bytedance.android.livesdk.chatroom.model.b.e> j2 = dVar.j();
                        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar2 = bVar.f11723e;
                        if (dVar2 == null) {
                            l.a("mInfoCenter");
                        }
                        List<com.bytedance.android.livesdk.chatroom.model.b.e> i2 = dVar2.i();
                        com.bytedance.android.live.liveinteract.multiguest.a.c.d dVar3 = bVar.f11723e;
                        if (dVar3 == null) {
                            l.a("mInfoCenter");
                        }
                        bVar.b(j2, i2, dVar3.f11075c);
                        bVar.f();
                        return;
                    }
                    bVar.f11721c.a();
                    return;
                }
                return;
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar2 = this.f11443b;
            if (aVar2 == null) {
                return;
            }
            if (list != null) {
                aVar2.f11409a.a(com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a.a(list));
                aVar2.d();
                return;
            }
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<com.bytedance.android.livesdk.chatroom.model.b.e> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void a(List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        boolean z;
        int i2;
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar;
        l.d(list, "");
        z.e eVar = new z.e();
        eVar.element = list;
        if (isViewValid() && this.f11443b == null && this.f11444c == null) {
            if (eVar.element == null) {
                eVar.element = (T) new ArrayList();
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.b bVar = this.f11442a;
            if (bVar != null) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a d2 = bVar.d();
                if (d2 != null) {
                    z = d2.f11298h;
                } else {
                    z = false;
                }
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar2 = this.f11447f;
                if (aVar2 == null) {
                    l.a("mDataHolder");
                }
                com.bytedance.android.live.liveinteract.multilive.anchor.ui.a.a aVar3 = this.f11446e;
                if (aVar3 != null) {
                    i2 = aVar3.f11657a;
                } else {
                    i2 = -1;
                }
                aVar2.t = i2;
                if (!z) {
                    Context context = this.context;
                    l.b(context, "");
                    aVar = new com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a(context, bVar, eVar.element);
                } else if (MultiLiveLinkPanelStyle.INSTANCE.getValue() > 0) {
                    Context context2 = this.context;
                    l.b(context2, "");
                    com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar2 = new com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b(this, context2, bVar);
                    this.f11444c = bVar2;
                    bVar2.setOnDismissListener(new h(this, eVar));
                    com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.b bVar3 = this.f11444c;
                    if (bVar3 != null) {
                        bVar3.show();
                    }
                    this.f11446e = null;
                    return;
                } else {
                    Context context3 = this.context;
                    l.b(context3, "");
                    aVar = new com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.c(this, context3, bVar, eVar.element);
                }
                this.f11443b = aVar;
                aVar.setOnDismissListener(new i(this, eVar));
                com.bytedance.android.live.liveinteract.multiguest.opt.b.a.a aVar4 = this.f11443b;
                if (aVar4 != null) {
                    aVar4.show();
                }
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void a(String str, SurfaceView surfaceView) {
        l.d(str, "");
        l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11445d;
        if (aVar != null) {
            aVar.a(str, surfaceView);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.f.a
    public final void a(long j2, long j3) {
        com.bytedance.android.live.core.c.a.a(4, "bitrate_callback", new StringBuilder().append(j2).append(' ').append(j3).toString());
        x xVar = this.f11448g;
        if (xVar != null) {
            xVar.e();
        }
    }
}
