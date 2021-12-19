package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.app.a.b;
import com.bytedance.android.live.e;
import com.bytedance.android.live.liveinteract.api.o;
import com.bytedance.android.live.liveinteract.multiguest.a.c.a;
import com.bytedance.android.live.liveinteract.multiguest.a.f.g;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multilive.a.c.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastAgeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.ad;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MultiGuestAsGuestWidget extends LiveWidget implements g.b, WeakHandler.IHandler, au {

    /* renamed from: g  reason: collision with root package name */
    public static final a f11456g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b f11457a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c f11458b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.g.c.a f11459c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f11460d;

    /* renamed from: e  reason: collision with root package name */
    public a.EnumC0216a f11461e = a.EnumC0216a.SEND_REQUEST;

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multilive.a.a.i f11462f;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.android.live.liveinteract.multilive.a.c.b f11463h;

    /* renamed from: i  reason: collision with root package name */
    private com.bytedance.android.live.liveinteract.multiguest.g.a.a f11464i;

    /* renamed from: j  reason: collision with root package name */
    private LiveDialog f11465j;

    /* renamed from: k  reason: collision with root package name */
    private WeakHandler f11466k;

    /* renamed from: l  reason: collision with root package name */
    private Room f11467l;

    /* renamed from: m  reason: collision with root package name */
    private final h.f.a.b<com.bytedance.android.livesdk.chatroom.c.q, z> f11468m = new b(this);
    private final com.bytedance.android.live.liveinteract.multiguest.a.d.a n = new com.bytedance.android.live.liveinteract.multiguest.a.d.b();
    private final FrameLayout o;

    static {
        Covode.recordClassIndex(6176);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bfa;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6177);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final a.EnumC0216a h() {
        return this.f11461e;
    }

    public final void a(boolean z) {
        com.bytedance.android.live.liveinteract.multiguest.a.c.d i2;
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        h.f.b.l.b(b2, "");
        if (!b2.e()) {
            com.bytedance.android.livesdk.at.f b3 = u.a().b();
            Context context = this.context;
            j.a a2 = com.bytedance.android.livesdk.at.j.a();
            a2.f14158a = y.a((int) R.string.grm);
            a2.f14161d = "interact";
            a2.f14160c = 0;
            b3.a(context, a2.a()).a(getAutoUnbindTransformer()).b(new com.bytedance.android.livesdk.at.g());
        } else if (!u.a().b().a(com.bytedance.android.livesdk.at.h.INTERACT)) {
            if (com.bytedance.android.live.liveinteract.multilive.a.e()) {
                ao.a(y.e(), (int) R.string.dxw);
            } else if (com.bytedance.android.live.liveinteract.multilive.a.b(this.f11467l)) {
                ao.a(y.e(), (int) R.string.eoi);
            } else {
                if (z) {
                    this.f11462f = null;
                }
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
                if (cVar == null || !cVar.q()) {
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar2 = this.f11458b;
                    if (cVar2 == null || (i2 = cVar2.i()) == null || i2.f() <= 0) {
                        com.bytedance.android.live.liveinteract.api.a.c a3 = com.bytedance.android.live.liveinteract.api.a.c.a();
                        h.f.b.l.b(a3, "");
                        T t = a3.n;
                        if (t != null && t.intValue() == 0) {
                            j();
                            return;
                        }
                    }
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar3 = this.f11458b;
                    if (cVar3 != null) {
                        cVar3.n();
                        return;
                    }
                    return;
                }
                j();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(List<? extends com.bytedance.android.livesdk.chatroom.model.b.d> list, String str) {
        a(false, list, str);
    }

    private final androidx.fragment.app.i k() {
        return (androidx.fragment.app.i) this.dataChannel.b(com.bytedance.android.livesdk.j.ao.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.c("rtc_error", false);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        super.onDetachWidget();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void d() {
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.c(true);
        }
        Runnable runnable = this.f11460d;
        if (runnable != null) {
            runnable.run();
        }
        this.f11460d = null;
    }

    public static final class l implements IBroadcastService.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsGuestWidget f11477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f11478b;

        static {
            Covode.recordClassIndex(6188);
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a() {
            com.bytedance.android.live.core.c.a.a(3, "LinkInRoomVideoGuestWid", "canceled dialog for edit dob");
            b.a.a("livesdk_add_birth_popup_window_click").a("request_page", com.bytedance.android.live.liveinteract.platform.common.g.h.a(this.f11478b)).a("click_type", "cancel").a().b();
            this.f11477a.dataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.e.class);
            return z.f158842a;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a(String str) {
            if (h.f.b.l.a((Object) str, (Object) "") && this.f11478b == 2) {
                this.f11477a.dataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.f.class);
            }
            com.bytedance.android.live.core.c.a.a(6, "LinkInRoomVideoGuestWid", "edit dob failed and msg:".concat(String.valueOf(str)));
            return z.f158842a;
        }

        l(MultiGuestAsGuestWidget multiGuestAsGuestWidget, int i2) {
            this.f11477a = multiGuestAsGuestWidget;
            this.f11478b = i2;
        }

        @Override // com.bytedance.android.live.broadcast.api.IBroadcastService.a
        public final /* synthetic */ z a(String str, String str2) {
            com.bytedance.android.live.core.c.a.a(3, "LinkInRoomVideoGuestWid", " enter edit dob succeed and dob:" + str + ", appealUrl:" + str2);
            com.bytedance.android.livesdk.g.e.f17823a = true;
            com.bytedance.android.livesdk.g.e.f17824b = true;
            if (this.f11478b == 2) {
                this.f11477a.dataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.g.class);
            }
            return z.f158842a;
        }
    }

    private final void j() {
        long j2;
        User owner;
        FollowInfo followInfo;
        this.f11461e = a.EnumC0216a.SEND_REQUEST;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.a(0);
        }
        Room room = this.f11467l;
        if (room == null || (owner = room.getOwner()) == null || (followInfo = owner.getFollowInfo()) == null) {
            j2 = 0;
        } else {
            j2 = followInfo.getFollowStatus();
        }
        com.bytedance.android.live.liveinteract.platform.common.g.b.a("connection_button", j2);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void c() {
        com.bytedance.android.livesdk.l.b a2 = new b.a(this.context).b(R.string.gro).a(R.string.gwr, (DialogInterface.OnClickListener) i.f11472a, false).a();
        h.f.b.l.b(a2, "");
        a2.show();
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.c("leave_with_money_not_enough", false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final boolean e() {
        boolean z;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            z = cVar.q();
        } else {
            z = false;
        }
        if (z) {
            com.bytedance.android.live.liveinteract.multilive.a.c.b bVar = this.f11463h;
            if (bVar == null || !bVar.n()) {
                return false;
            }
            return true;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar = this.f11464i;
        if (aVar == null || !aVar.isShowing()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void f() {
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar;
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar;
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2 = this.f11463h;
        if (!(bVar2 == null || !bVar2.n() || (bVar = this.f11463h) == null)) {
            bVar.dismiss();
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar2 = this.f11464i;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f11464i) != null) {
            aVar.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void i() {
        if (e() && this.f11461e == a.EnumC0216a.GO_LIVE) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
            if (cVar == null || !cVar.q()) {
                com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar = this.f11464i;
                if (aVar != null) {
                    aVar.dismiss();
                    return;
                }
                return;
            }
            com.bytedance.android.live.liveinteract.multilive.a.c.b bVar = this.f11463h;
            if (bVar != null) {
                bVar.dismiss();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void b() {
        Object obj;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            obj = dataChannel.b(cn.class);
        } else {
            obj = null;
        }
        if (!h.f.b.l.a(obj, (Object) true)) {
            if (this.f11465j == null) {
                this.f11465j = new LiveDialog.a(this.context).b(R.string.e4y).a(R.string.eh7, m.f11479a).a();
            }
            LiveDialog liveDialog = this.f11465j;
            if (liveDialog != null) {
                liveDialog.show();
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        com.bytedance.android.live.liveinteract.platform.c.c h2;
        WeakHandler weakHandler;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.l();
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar2 = this.f11458b;
        if (!(cVar2 == null || (h2 = cVar2.h()) == null || !h2.f11889d || (weakHandler = this.f11466k) == null)) {
            weakHandler.sendEmptyMessageDelayed(140000, 180000);
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar = this.f11464i;
        if (aVar != null && aVar.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar2 = this.f11464i;
            if ((aVar2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.a.a) && aVar2 != null) {
                aVar2.a(false, PrivacyCert.Builder.with("bpea-464").usage("").tag("link mic camera inactive").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
        super.onPause();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        WeakHandler weakHandler = this.f11466k;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.k();
        }
        if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
            com.bytedance.android.live.liveinteract.platform.common.g.z.c(null);
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar = this.f11464i;
        if (aVar != null && aVar.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar2 = this.f11464i;
            if ((aVar2 instanceof com.bytedance.android.live.liveinteract.multiguest.g.a.a) && aVar2 != null) {
                aVar2.a(true, PrivacyCert.Builder.with("bpea-463").usage("").tag("link mic camera active").policies(PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy()).build());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0082, code lost:
        if (r4 == null) goto L_0x0084;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
        // Method dump skipped, instructions count: 254
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.widget.MultiGuestAsGuestWidget.onCreate():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        boolean z;
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar;
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar;
        com.bytedance.android.live.liveinteract.platform.common.g.a.a("LinkIn_Guest_Widget_onDestroy");
        Room room = this.f11467l;
        com.bytedance.android.livesdk.chatroom.model.c.a a2 = com.bytedance.android.live.liveinteract.multilive.a.a();
        if (!com.bytedance.android.live.liveinteract.multilive.a.a(a2) || (com.bytedance.android.live.liveinteract.multilive.a.b(a2) && !com.bytedance.android.live.liveinteract.multilive.a.a(room))) {
            z = true;
        } else {
            z = false;
        }
        if (z && com.bytedance.android.live.liveinteract.platform.common.g.z.f12040a > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - com.bytedance.android.live.liveinteract.platform.common.g.z.f12040a;
            Map<String, String> a3 = com.bytedance.android.live.liveinteract.platform.common.g.z.a();
            String str = com.bytedance.android.live.liveinteract.platform.common.g.z.f12042c;
            if (str == null) {
                str = "live_over";
            }
            a3.put("trigger", str);
            com.bytedance.android.live.liveinteract.platform.common.g.z.a(null);
            com.bytedance.android.live.liveinteract.multilive.b.a.a(a3, com.bytedance.android.live.liveinteract.multilive.b.a.b());
            a3.put("duration", String.valueOf(uptimeMillis));
            a3.put("permission_type", com.bytedance.android.live.liveinteract.multilive.a.d());
            com.bytedance.android.live.liveinteract.platform.common.g.z.a("livesdk_guest_connection_mode_view_duration", a3);
            com.bytedance.android.live.liveinteract.platform.common.g.z.f12040a = 0;
        }
        if (com.bytedance.android.livesdk.b.a.d.a().u > 0) {
            com.bytedance.android.live.liveinteract.platform.common.g.z.d(null);
        }
        com.bytedance.android.livesdk.b.a.d.a().a((Object) false);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.b();
        }
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar2 = this.f11459c;
        if (aVar2 != null) {
            aVar2.b();
        }
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2 = this.f11463h;
        if (!(bVar2 == null || !bVar2.n() || (bVar = this.f11463h) == null)) {
            bVar.dismiss();
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar3 = this.f11464i;
        if (!(aVar3 == null || !aVar3.isShowing() || (aVar = this.f11464i) == null)) {
            aVar.dismiss();
        }
        this.dataChannel.b(this);
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar3 = this.f11457a;
        if (bVar3 != null) {
            bVar3.dismiss();
        }
        com.bytedance.android.livesdk.b.a.d.a().b();
        LiveDialog liveDialog = this.f11465j;
        if (liveDialog != null && liveDialog.isShowing()) {
            LiveDialog liveDialog2 = this.f11465j;
            if (liveDialog2 != null) {
                liveDialog2.dismiss();
            }
            this.f11465j = null;
        }
        super.onDestroy();
    }

    static final class q implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsGuestWidget f11483a;

        static {
            Covode.recordClassIndex(6193);
        }

        q(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            this.f11483a = multiGuestAsGuestWidget;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f11483a.f11457a = null;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(a.EnumC0216a aVar) {
        h.f.b.l.d(aVar, "");
        this.f11461e = aVar;
    }

    public final void b(boolean z) {
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.b(z);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ MultiGuestAsGuestWidget this$0;

        static {
            Covode.recordClassIndex(6181);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.this$0 = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            this.this$0.b(bool.booleanValue());
            return z.f158842a;
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<a.EnumC0216a, z> {
        final /* synthetic */ MultiGuestAsGuestWidget this$0;

        static {
            Covode.recordClassIndex(6183);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.this$0 = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a.EnumC0216a aVar) {
            a.EnumC0216a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            this.this$0.f11461e = aVar2;
            return z.f158842a;
        }
    }

    static final class k implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f11476a;

        static {
            Covode.recordClassIndex(6187);
        }

        k(int i2) {
            this.f11476a = i2;
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(this.f11476a, "ok");
        }
    }

    static final class m implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final m f11479a = new m();

        static {
            Covode.recordClassIndex(6189);
        }

        m() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements LiveDialog.b {

        /* renamed from: a  reason: collision with root package name */
        public static final p f11482a = new p();

        static {
            Covode.recordClassIndex(6192);
        }

        p() {
        }

        @Override // com.bytedance.android.live.design.app.LiveDialog.b
        public final void a(DialogInterface dialogInterface) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.multilive.a.a.i, z> {
        final /* synthetic */ MultiGuestAsGuestWidget this$0;

        static {
            Covode.recordClassIndex(6182);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.this$0 = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.liveinteract.multilive.a.a.i iVar) {
            com.bytedance.android.live.liveinteract.multilive.a.a.i iVar2 = iVar;
            h.f.b.l.d(iVar2, "");
            this.this$0.f11461e = a.EnumC0216a.SEND_REQUEST;
            this.this$0.f11462f = iVar2;
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    public MultiGuestAsGuestWidget(FrameLayout frameLayout) {
        h.f.b.l.d(frameLayout, "");
        this.o = frameLayout;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(com.bytedance.android.live.liveinteract.multilive.c.m mVar) {
        h.f.b.l.d(mVar, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.a(mVar);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void b(Throwable th) {
        h.f.b.l.d(th, "");
        com.bytedance.android.livesdk.utils.f.a(this.context, th);
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            cVar.c("join_channel_error", false);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar;
        h.f.b.l.d(message, "");
        if (isViewValid() && 140000 == message.what && (cVar = this.f11458b) != null) {
            cVar.c("leave_with_background", false);
        }
    }

    private final void b(String str) {
        LiveDialog.a aVar = new LiveDialog.a(this.context);
        aVar.r = true;
        aVar.q = false;
        aVar.a(str).a(R.string.eh7, p.f11482a).a().show();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(com.bytedance.android.livesdk.chatroom.model.c.b bVar) {
        h.f.b.l.d(bVar, "");
        if (bVar.f15744a) {
            com.bytedance.android.live.liveinteract.api.b.n a2 = com.bytedance.android.live.liveinteract.multilive.anchor.e.c.a(bVar.f15745b, bVar.f15746c);
            com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
            if (aVar != null) {
                aVar.a(a2);
            }
        }
    }

    static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.q, z> {
        final /* synthetic */ MultiGuestAsGuestWidget this$0;

        static {
            Covode.recordClassIndex(6178);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.this$0 = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.c.q qVar) {
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar2;
            com.bytedance.android.livesdk.chatroom.c.q qVar2 = qVar;
            h.f.b.l.d(qVar2, "");
            MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.this$0;
            int i2 = qVar2.f15140a;
            if (i2 == 0) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar3 = multiGuestAsGuestWidget.f11458b;
                if (cVar3 != null) {
                    cVar3.n();
                }
            } else if (i2 == 1) {
                Object obj = qVar2.f15141b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguest.ui.dialog.InteractApplyDialogMt.ApplyDialogType");
                multiGuestAsGuestWidget.f11461e = (a.EnumC0216a) obj;
                int i3 = a.f11484a[multiGuestAsGuestWidget.f11461e.ordinal()];
                if (i3 == 1) {
                    com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar4 = multiGuestAsGuestWidget.f11458b;
                    if (cVar4 != null) {
                        cVar4.a(1);
                    }
                } else if (i3 == 2 && (cVar = multiGuestAsGuestWidget.f11458b) != null) {
                    cVar.a(0);
                }
            } else if (i2 == 5 && (cVar2 = multiGuestAsGuestWidget.f11458b) != null) {
                cVar2.c("leave_normally", true);
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<View, z> {
        final /* synthetic */ MultiGuestAsGuestWidget this$0;

        static {
            Covode.recordClassIndex(6184);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            super(1);
            this.this$0 = multiGuestAsGuestWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            boolean z;
            View view2 = view;
            h.f.b.l.d(view2, "");
            MultiGuestAsGuestWidget multiGuestAsGuestWidget = this.this$0;
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            h.f.b.l.b(a2, "");
            if (!a2.f14182c) {
                com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = multiGuestAsGuestWidget.f11459c;
                if (aVar != null) {
                    if (view2.getVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.d(z);
                }
                if (view2.getVisibility() != 0) {
                    View view3 = multiGuestAsGuestWidget.getView();
                    if (view3 != null) {
                        view3.setVisibility(0);
                    }
                } else {
                    View view4 = multiGuestAsGuestWidget.getView();
                    if (view4 != null) {
                        view4.setVisibility(8);
                    }
                }
            }
            return z.f158842a;
        }
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsGuestWidget f11473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LiveDialog f11474b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f11475c;

        static {
            Covode.recordClassIndex(6186);
        }

        j(MultiGuestAsGuestWidget multiGuestAsGuestWidget, LiveDialog liveDialog, int i2) {
            this.f11473a = multiGuestAsGuestWidget;
            this.f11474b = liveDialog;
            this.f11475c = i2;
        }

        public final void onClick(View view) {
            this.f11474b.dismiss();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(this.f11475c, "appeal");
            com.bytedance.android.livesdk.browser.c.d webViewManager = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).webViewManager();
            Context context = this.f11473a.context;
            d.a b2 = com.bytedance.android.livesdk.browser.c.e.b("https://webcast.tiktokv.com/falcon/webcast_mt/page/appeal_v3/index.html?enter_from=" + com.bytedance.android.live.liveinteract.platform.common.g.h.a(this.f11475c));
            b2.f14292c = true;
            b2.f14291b = y.a((int) R.string.dv9);
            webViewManager.a(context, b2);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(String str) {
        h.f.b.l.d(str, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    public final void c(boolean z) {
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar = this.f11463h;
        if (bVar != null && bVar.n()) {
            com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2 = this.f11463h;
            if (bVar2 != null) {
                bVar2.dismiss();
            }
            if (z) {
                String a2 = y.a((int) R.string.eoi);
                h.f.b.l.b(a2, "");
                b(a2);
                return;
            }
            String a3 = y.a((int) R.string.dxw);
            h.f.b.l.b(a3, "");
            b(a3);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void b(List<? extends com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        boolean z;
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar;
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar2;
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar3;
        DataChannel dataChannel;
        h.f.b.l.d(list, "");
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            z = cVar.q();
        } else {
            z = false;
        }
        if (z) {
            if (isViewValid() && (bVar3 = this.f11463h) != null && bVar3.n() && (dataChannel = this.dataChannel) != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.multilive.a.a.k.class, list);
            }
        } else if (isViewValid() && (bVar = this.f11457a) != null && bVar.isShowing() && (bVar2 = this.f11457a) != null) {
            List d2 = ad.d(list);
            if (d2 != null) {
                com.bytedance.android.live.liveinteract.multiguest.a.a.a aVar = bVar2.f11423b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : d2) {
                    if (((com.bytedance.android.livesdk.chatroom.model.b.e) obj).f15724e == 1) {
                        arrayList.add(obj);
                    }
                }
                aVar.a(arrayList);
                bVar2.e();
                return;
            }
            try {
                throw new IllegalArgumentException("Required value was null.".toString());
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(g.b.a aVar) {
        User owner;
        h.f.b.l.d(aVar, "");
        Throwable th = aVar.f11153a;
        if (!(th instanceof com.bytedance.android.live.a.a.b.a)) {
            com.bytedance.android.livesdk.utils.f.a(this.context, th);
            return;
        }
        com.bytedance.android.live.a.a.b.a aVar2 = (com.bytedance.android.live.a.a.b.a) th;
        String str = null;
        switch (aVar2.getErrorCode()) {
            case 20048:
                String a2 = y.a((int) R.string.ea3);
                h.f.b.l.b(a2, "");
                String a3 = com.a.a(a2, Arrays.copyOf(new Object[]{String.valueOf(LiveAudienceLinkmicLowestAgeSetting.INSTANCE.getValue())}, 1));
                h.f.b.l.b(a3, "");
                b.a aVar3 = new b.a(getContext());
                aVar3.f18296m = true;
                aVar3.f18285b = a3;
                aVar3.a(R.string.gn0, (DialogInterface.OnClickListener) new n(this), false).b(R.string.gn1, (DialogInterface.OnClickListener) o.f11481a, false).a().show();
                com.bytedance.android.live.liveinteract.platform.common.g.h.b("guest_connection_underage_popup", null, "show");
                return;
            case 31002:
                com.bytedance.android.livesdk.chatroom.model.b.a aVar4 = (com.bytedance.android.livesdk.chatroom.model.b.a) e.a.f9628b.a(aVar2.getExtra(), com.bytedance.android.livesdk.chatroom.model.b.a.class);
                if (aVar4 != null) {
                    List<com.bytedance.android.livesdk.chatroom.model.b.d> list = aVar4.f15692a;
                    String str2 = aVar4.f15693b;
                    if (list == null || list.isEmpty()) {
                        ao.a(y.e(), (int) R.string.gow);
                        return;
                    } else {
                        a(true, list, str2);
                        return;
                    }
                } else {
                    return;
                }
            case 31011:
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
                if (cVar != null) {
                    cVar.m();
                    return;
                }
                return;
            case 4003036:
                ao.a(y.e(), y.a((int) R.string.ecj), 0);
                return;
            case 4003037:
                o.a aVar5 = o.a.BAN_FOR_BROADCASTING;
                if (aVar5 != null) {
                    ((LinkReviewApi) com.bytedance.android.live.network.e.a().a(LinkReviewApi.class)).bannedInfo(aVar5.type).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.c(aVar5), a.d.f11057a);
                    return;
                } else {
                    try {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            case 4003088:
                int i2 = aVar.f11154b;
                Activity a4 = com.bytedance.android.live.core.f.a.a(this.context);
                if (a4 != null) {
                    h.f.b.l.b(a4, "");
                    ((IBroadcastService) com.bytedance.android.live.t.a.a(IBroadcastService.class)).showGuideBirthdayEditDialog(a4, "multi_live", com.bytedance.android.live.liveinteract.platform.common.g.h.a(i2), new l(this, i2));
                    b.a.a("livesdk_add_birth_popup_window_show").a("request_page", com.bytedance.android.live.liveinteract.platform.common.g.h.a(i2)).a().b();
                    return;
                }
                return;
            case 4003089:
                int i3 = aVar.f11154b;
                SpannableString spannableString = new SpannableString(y.a((int) R.string.dv9));
                spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), 0, spannableString.length(), 33);
                Room room = (Room) this.dataChannel.b(df.class);
                LiveDialog.a aVar6 = new LiveDialog.a(this.context);
                aVar6.r = false;
                aVar6.q = false;
                aVar6.f9375c = y.a((int) R.string.dvc, String.valueOf(LiveBroadcastAgeThresholdSetting.INSTANCE.getValue()));
                String a5 = y.a((int) R.string.dvb);
                h.f.b.l.b(a5, "");
                String a6 = h.m.p.a(a5, "{username}", "%s");
                Object[] objArr = new Object[1];
                if (!(room == null || (owner = room.getOwner()) == null)) {
                    str = owner.displayId;
                }
                objArr[0] = str;
                String a7 = com.a.a(a6, Arrays.copyOf(objArr, 1));
                h.f.b.l.b(a7, "");
                LiveDialog a8 = aVar6.a(a7).a(R.string.e5f, new k(i3)).a();
                b.a aVar7 = new b.a();
                aVar7.f9389a = spannableString;
                aVar7.f9390b = new j(this, a8, i3);
                a8.a(aVar7.a());
                a8.show();
                b.a.a("livesdk_appeal_popup_window_show").a("request_page", com.bytedance.android.live.liveinteract.platform.common.g.h.a(i3)).a().b();
                return;
            default:
                com.bytedance.android.livesdk.utils.f.a(this.context, th);
                return;
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        boolean z;
        Room room;
        int i2;
        com.bytedance.android.live.liveinteract.multiguest.a.c.d i3;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            z = cVar.q();
        } else {
            z = false;
        }
        if (z) {
            if (this.f11463h == null) {
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar2 = this.f11458b;
                if (cVar2 != null) {
                    room = cVar2.t;
                } else {
                    room = null;
                }
                com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar3 = this.f11458b;
                if (cVar3 == null || (i3 = cVar3.i()) == null) {
                    i2 = 0;
                } else {
                    i2 = i3.g();
                }
                com.bytedance.android.live.liveinteract.multiguest.a.f.a aVar = new com.bytedance.android.live.liveinteract.multiguest.a.f.a(room, false, null, "", i2, this.dataChannel);
                DataChannel dataChannel = this.dataChannel;
                h.f.b.l.b(dataChannel, "");
                this.f11463h = b.a.a(dataChannel, aVar, this.f11458b, this.f11461e, null);
            }
            androidx.fragment.app.i k2 = k();
            if (k2 != null) {
                com.bytedance.android.live.liveinteract.multilive.a.c.b bVar = this.f11463h;
                if (bVar != null) {
                    bVar.a(this.f11461e, this.f11462f);
                }
                com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2 = this.f11463h;
                if (bVar2 != null) {
                    bVar2.show(k2, "MultiLiveGuestUserInfoDialog");
                }
            }
        } else if (isViewValid() && this.f11457a == null) {
            if (list == null) {
                list = new ArrayList<>();
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar4 = this.f11458b;
            if (cVar4 != null) {
                Context context = this.context;
                h.f.b.l.b(context, "");
                this.f11457a = new com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b(context, cVar4, list);
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar3 = this.f11457a;
            if (bVar3 != null) {
                bVar3.setOnDismissListener(new q(this));
            }
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar4 = this.f11457a;
            if (bVar4 != null) {
                bVar4.show();
            }
        }
    }

    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11471a = new d();

        static {
            Covode.recordClassIndex(6180);
        }

        d() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class i implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final i f11472a = new i();

        static {
            Covode.recordClassIndex(6185);
        }

        i() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    static final class o implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final o f11481a = new o();

        static {
            Covode.recordClassIndex(6191);
        }

        o() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(true);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void b(String str, SurfaceView surfaceView) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(surfaceView, "");
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.a(str, surfaceView);
        }
    }

    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsGuestWidget f11469a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f11470b;

        static {
            Covode.recordClassIndex(6179);
        }

        public c(MultiGuestAsGuestWidget multiGuestAsGuestWidget, Runnable runnable) {
            this.f11469a = multiGuestAsGuestWidget;
            this.f11470b = runnable;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11469a.f11460d = this.f11470b;
            com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11469a.f11458b;
            if (cVar != null) {
                cVar.c("live_end", false);
            }
            com.bytedance.android.live.liveinteract.platform.common.g.z.b("live_over");
            com.bytedance.android.live.liveinteract.platform.common.g.z.a("live_over");
        }
    }

    static final class n implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MultiGuestAsGuestWidget f11480a;

        static {
            Covode.recordClassIndex(6190);
        }

        n(MultiGuestAsGuestWidget multiGuestAsGuestWidget) {
            this.f11480a = multiGuestAsGuestWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            h.f.b.l.d(dialogInterface, "");
            dialogInterface.dismiss();
            String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
            if (TextUtils.isEmpty(value)) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                h.f.b.l.b(a2, "");
                if (((IHostApp) a2).isInMusicallyRegion()) {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                } else {
                    value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
                }
            }
            ((IActionHandlerService) com.bytedance.android.live.t.a.a(IActionHandlerService.class)).handle(this.f11480a.context, value);
            if (u.a().b() != null) {
                HashMap hashMap = new HashMap();
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                h.f.b.l.b(b2, "");
                hashMap.put("user_id", String.valueOf(b2.c()));
                b.a.a("livesdk_user_click_contact_us").a((Map<String, String>) hashMap).a(this.f11480a.dataChannel).b();
            }
            com.bytedance.android.live.liveinteract.platform.common.g.h.a(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.b
    public final void a(String str, SurfaceView surfaceView) {
        com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar;
        com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2;
        if (str == null || str.length() == 0 || surfaceView == null) {
            String str2 = "onStartInteract encounter an exception, linkMicId: " + str + ", surfaceView:" + surfaceView;
            com.bytedance.android.live.core.c.a.a(6, "LinkInRoomVideoGuestWid", str2);
            com.bytedance.android.live.core.d.c.a(new Throwable(), str2);
            return;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar == null || !cVar.q()) {
            com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b bVar3 = this.f11457a;
            if (!(bVar3 == null || !bVar3.isShowing() || (bVar = this.f11457a) == null)) {
                bVar.dismiss();
            }
        } else {
            com.bytedance.android.live.liveinteract.multilive.a.c.b bVar4 = this.f11463h;
            if (!(bVar4 == null || !bVar4.n() || (bVar2 = this.f11463h) == null)) {
                bVar2.dismiss();
            }
        }
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar = this.f11459c;
        if (aVar != null) {
            aVar.c(false);
        }
        com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar2 = this.f11459c;
        if (aVar2 != null) {
            com.bytedance.android.livesdk.b.a.d a2 = com.bytedance.android.livesdk.b.a.d.a();
            String str3 = "";
            h.f.b.l.b(a2, str3);
            String str4 = a2.f14185f;
            if (str4 != null) {
                str3 = str4;
            }
            if (surfaceView == null) {
                h.f.b.l.b();
            }
            aVar2.a(str3, surfaceView);
        }
    }

    private final void a(boolean z, List<? extends com.bytedance.android.livesdk.chatroom.model.b.d> list, String str) {
        boolean z2;
        Room room;
        int i2;
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar;
        int i3;
        com.bytedance.android.live.liveinteract.multiguest.a.c.d i4;
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar = this.f11458b;
        if (cVar != null) {
            z2 = cVar.q();
        } else {
            z2 = false;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar2 = this.f11458b;
        if (cVar2 != null) {
            room = cVar2.t;
        } else {
            room = null;
        }
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar3 = this.f11458b;
        if (cVar3 == null || (i4 = cVar3.i()) == null) {
            i2 = 0;
        } else {
            i2 = i4.g();
        }
        com.bytedance.android.live.liveinteract.multiguest.a.f.a aVar2 = new com.bytedance.android.live.liveinteract.multiguest.a.f.a(room, z, list, str, i2, this.dataChannel);
        if (z2) {
            com.bytedance.android.live.liveinteract.multilive.a.c.b bVar = this.f11463h;
            if (bVar == null || !bVar.n()) {
                com.bytedance.android.live.liveinteract.multilive.a.a.i iVar = this.f11462f;
                int i5 = -1;
                if (iVar != null) {
                    i3 = iVar.f11486a;
                } else {
                    i3 = -1;
                }
                com.bytedance.android.live.liveinteract.multiguest.g.c.a aVar3 = this.f11459c;
                if (aVar3 != null) {
                    i5 = aVar3.e();
                }
                com.bytedance.android.live.liveinteract.multilive.a.a.i iVar2 = new com.bytedance.android.live.liveinteract.multilive.a.a.i(i3, i5);
                DataChannel dataChannel = this.dataChannel;
                h.f.b.l.b(dataChannel, "");
                this.f11463h = b.a.a(dataChannel, aVar2, this.f11458b, this.f11461e, iVar2);
                androidx.fragment.app.i k2 = k();
                if (k2 != null) {
                    com.bytedance.android.live.liveinteract.multilive.a.c.b bVar2 = this.f11463h;
                    if (bVar2 != null) {
                        bVar2.a(this.f11461e, this.f11462f);
                    }
                    com.bytedance.android.live.liveinteract.multilive.a.c.b bVar3 = this.f11463h;
                    if (bVar3 != null) {
                        bVar3.show(k2, "MultiLiveGuestUserInfoDialog");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar4 = this.f11464i;
        if (aVar4 == null || !aVar4.isShowing()) {
            com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar5 = new com.bytedance.android.live.liveinteract.multiguest.g.a.a(com.bytedance.android.livesdk.utils.p.a(this.context), aVar2, this.dataChannel, this.f11461e);
            this.f11464i = aVar5;
            aVar5.show();
            if (this.f11461e == a.EnumC0216a.GO_LIVE && (aVar = this.f11464i) != null) {
                aVar.setCancelable(false);
            }
            com.bytedance.android.live.liveinteract.multiguest.g.a.a aVar6 = this.f11464i;
            Objects.requireNonNull(aVar6, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multiguest.ui.dialog.InteractApplyDialogMt");
            aVar6.f11198i = this.n;
        }
    }
}
