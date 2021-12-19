package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.i;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.p.e;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.h;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.bf;
import com.bytedance.android.livesdk.chatroom.CommentApi;
import com.bytedance.android.livesdk.chatroom.c.ab;
import com.bytedance.android.livesdk.chatroom.c.ae;
import com.bytedance.android.livesdk.chatroom.c.ag;
import com.bytedance.android.livesdk.chatroom.c.ah;
import com.bytedance.android.livesdk.chatroom.c.ai;
import com.bytedance.android.livesdk.chatroom.c.ap;
import com.bytedance.android.livesdk.chatroom.c.m;
import com.bytedance.android.livesdk.chatroom.e.c;
import com.bytedance.android.livesdk.chatroom.e.i;
import com.bytedance.android.livesdk.chatroom.e.j;
import com.bytedance.android.livesdk.chatroom.g.b;
import com.bytedance.android.livesdk.chatroom.g.p;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.chatroom.ui.SweepEffectFrameLayout;
import com.bytedance.android.livesdk.chatroom.ui.ar;
import com.bytedance.android.livesdk.chatroom.ui.bg;
import com.bytedance.android.livesdk.chatroom.viewmodule.bt;
import com.bytedance.android.livesdk.j.aa;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdk.j.at;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.bc;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cn;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.cq;
import com.bytedance.android.livesdk.j.d;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.z;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.comment.ChatNeedBindPhoneSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommunityGuidelineSetting;
import com.bytedance.android.livesdk.livesetting.comment.LiveInputDialogAnimationSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveEnableNormalGiftAndBarrageSelfFirstlySetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRoomChargeTypeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.EnablePreloadFirstScreenFrameSetting;
import com.bytedance.android.livesdk.model.message.cc;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.message.IMessageService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import emotes.a;
import emotes.api.EmoteApi;
import f.a.b.a;
import f.a.t;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class CommentWidget extends RoomRecycleWidget implements c.a, au {
    private static final int F = y.a(8.0f);
    private static final int G = y.a(8.0f);
    private String A;
    private String B;
    private boolean C;
    private final a D = new a();
    private b E;
    private boolean H;
    private boolean I;
    private final ar.b J = new ar.b() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass1 */

        static {
            Covode.recordClassIndex(9010);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.b
        public final void a() {
            DataChannel dataChannel = CommentWidget.this.dataChannel;
            if (dataChannel != null) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_send_button_click");
                a2.a(dataChannel);
                com.bytedance.android.livesdk.chatroom.g.b.a(a2, dataChannel);
                a2.b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.b
        public final void b() {
            DataChannel dataChannel = CommentWidget.this.dataChannel;
            if (dataChannel != null) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_comment_input");
                a2.a(dataChannel);
                com.bytedance.android.livesdk.chatroom.g.b.a(a2, dataChannel);
                a2.b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.b
        public final void a(f fVar) {
            long j2;
            String str;
            if (CommentWidget.this.dataChannel != null) {
                CommentWidget.this.dataChannel.c(e.class, false);
            }
            if (TextUtils.isEmpty(CommentWidget.this.f16268g) || TextUtils.isEmpty(fVar.f15763e) || !fVar.f15763e.contains(CommentWidget.this.f16268g)) {
                j2 = 0;
            } else {
                j2 = CommentWidget.this.f16267f;
            }
            int elapsedRealtime = (int) ((SystemClock.elapsedRealtime() - CommentWidget.this.o) / 1000);
            if (!CommentWidget.this.f16263b) {
                DataChannel dataChannel = CommentWidget.this.dataChannel;
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_comment_pannel_show_duration");
                a2.a(dataChannel);
                a2.a("duration", elapsedRealtime);
                if (j2 != 0) {
                    str = "1";
                } else {
                    str = "0";
                }
                a2.a("is_message_reply", str);
                if (j2 != 0) {
                    a2.a("reply_user_id", j2);
                }
                com.bytedance.android.livesdk.chatroom.g.b.a(a2);
                a2.b();
            }
            bf.a().a(false);
            CommentWidget.this.q = null;
            CommentWidget.this.r = fVar;
            CommentWidget.this.p = false;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.b
        public final void a(List<? extends EmoteModel> list) {
            c cVar = CommentWidget.this.f16265d;
            ag agVar = new ag(list, m.a.CommentWidget, Collections.emptyMap());
            if (cVar.f15341c != null) {
                long insertMessage = ((com.bytedance.android.live.publicscreen.a.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.publicscreen.a.e.class)).insertMessage(cVar.f15340b.getId(), com.bytedance.android.livesdk.chatroom.b.b.a(cVar.f15340b.getId(), agVar.f15083a, -System.currentTimeMillis(), u.a().b().a(), null), true);
                ((c.a) cVar.y).a();
                DataChannel dataChannel = cVar.w;
                List<EmoteModel> list2 = agVar.f15083a;
                l.d(list2, "");
                if (dataChannel != null) {
                    b.a.a("livesdk_audience_live_emote").a(dataChannel).a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("privilege_emotes_label", n.a(list2, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, b.a.f15517a, 30)).b();
                }
                a aVar = cVar.f15341c;
                long id = cVar.f15340b.getId();
                List<EmoteModel> list3 = agVar.f15083a;
                l.d(list3, "");
                t<R> a2 = ((CommentApi) com.bytedance.android.live.network.e.a().a(CommentApi.class)).sendEmote(id, n.a(list3, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, bt.a.f16498a, 30)).a(new com.bytedance.android.livesdk.util.rxutils.f());
                l.b(a2, "");
                aVar.a(a2.a(new i(cVar, agVar, insertMessage), new j(cVar, insertMessage)));
            }
            if (CommentWidget.this.q != null) {
                CommentWidget.this.q.b();
            }
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.b
        public final void a(String str, boolean z, int i2) {
            CommentWidget.this.a(str, z, false, i2);
            if (!LiveInputDialogAnimationSetting.INSTANCE.isALL()) {
                if (CommentWidget.this.p && LiveInputDialogAnimationSetting.INSTANCE.isAt()) {
                    return;
                }
                if ((CommentWidget.this.p || !LiveInputDialogAnimationSetting.INSTANCE.isClick()) && CommentWidget.this.q != null) {
                    CommentWidget.this.q.b();
                }
            }
        }
    };
    private final ar.a K = new ar.a() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass3 */

        static {
            Covode.recordClassIndex(9012);
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.a
        public final boolean a() {
            if (CommentWidget.this.dataChannel != null) {
                return ((Boolean) CommentWidget.this.dataChannel.b(cp.class)).booleanValue();
            }
            return true;
        }

        @Override // com.bytedance.android.livesdk.chatroom.ui.ar.a
        public final void b() {
            if (CommentWidget.this.dataChannel != null) {
                CommentWidget.this.dataChannel.c(cq.class, false);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public TextView f16262a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16263b;

    /* renamed from: c  reason: collision with root package name */
    public Room f16264c;

    /* renamed from: d  reason: collision with root package name */
    public c f16265d;

    /* renamed from: e  reason: collision with root package name */
    boolean f16266e;

    /* renamed from: f  reason: collision with root package name */
    public long f16267f = 0;

    /* renamed from: g  reason: collision with root package name */
    public String f16268g;

    /* renamed from: h  reason: collision with root package name */
    Dialog f16269h;

    /* renamed from: i  reason: collision with root package name */
    boolean f16270i;

    /* renamed from: j  reason: collision with root package name */
    ab f16271j;

    /* renamed from: k  reason: collision with root package name */
    ah f16272k;

    /* renamed from: l  reason: collision with root package name */
    long f16273l;

    /* renamed from: m  reason: collision with root package name */
    Dialog f16274m;
    com.bytedance.android.livesdk.chatroom.c.c n;
    long o;
    boolean p = false;
    public ar q = null;
    public f r = new f();
    public final Runnable s = new Runnable() {
        /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass2 */

        static {
            Covode.recordClassIndex(9011);
        }

        public final void run() {
            if (CommentWidget.this.isViewValid()) {
                new ai("live_detail");
            }
        }
    };
    boolean t;
    private View u;
    private ImageView v;
    private TextView w;
    private AnimatorSet x;
    private boolean y;
    private Activity z;

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.beh;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(com.bytedance.android.livesdk.model.message.i iVar) {
        if (isViewValid()) {
            i();
            if (this.z instanceof androidx.fragment.app.e) {
                ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).checkBindHelpShow((androidx.fragment.app.e) this.z, "live_comment");
            }
            IMessageManager iMessageManager = (IMessageManager) this.dataChannel.b(cg.class);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(iVar, true);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(com.bytedance.android.livesdk.model.message.i iVar, m.a aVar) {
        Room room;
        if (this.dataChannel != null) {
            this.dataChannel.a(com.bytedance.android.livesdk.chatroom.c.class, iVar.f19629f);
        }
        if (TextUtils.isEmpty(this.f16268g) || TextUtils.isEmpty(iVar.f19629f) || !iVar.f19629f.contains(this.f16268g)) {
            h();
        }
        a(e.a.a().f157046b.a(iVar.f19629f), iVar.f19628a, aVar);
        if (this.dataChannel != null && com.bytedance.android.livesdk.utils.a.a(this.dataChannel) && (room = this.f16264c) != null && room.author() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(this.f16264c.author().getId()));
            hashMap.put("room_id", String.valueOf(this.f16264c.getId()));
            com.bytedance.android.livesdk.utils.a.a("live_ad", "live_comment", null, hashMap);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(boolean z2) {
        this.r.f15764f = z2;
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(Barrage barrage) {
        cc a2;
        if (isViewValid()) {
            i();
            if (TextUtils.isEmpty(barrage.getOrderId())) {
                ao.a(y.e(), (int) R.string.gpm);
                return;
            }
            ((IWalletService) com.bytedance.android.live.t.a.a(IWalletService.class)).walletCenter().a((long) barrage.getLeftDiamond());
            if (LiveEnableNormalGiftAndBarrageSelfFirstlySetting.INSTANCE.getValue() && ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get() != null && isViewValid() && (a2 = com.bytedance.android.livesdk.chatroom.b.b.a(barrage)) != null) {
                a2.f13611c = true;
                ((IMessageService) com.bytedance.android.live.t.a.a(IMessageService.class)).get().insertMessage(a2);
            }
            HashMap hashMap = new HashMap();
            try {
                hashMap.put("live_source", this.A);
                if (!TextUtils.isEmpty(this.f16264c.getSourceType())) {
                    hashMap.put("moment_room_source", this.f16264c.getSourceType());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            b.a.a("send_barrage").a(this.dataChannel).a((Map<String, String>) hashMap).b("live_interact").b();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(Exception exc) {
        if (exc instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc;
            int errorCode = aVar.getErrorCode();
            if (50001 == errorCode) {
                ao.a(this.z, aVar.getPrompt(), 0);
            } else if (50004 == errorCode || 50014 == errorCode || 80074 == errorCode) {
                i();
                c();
                ao.a(this.z, aVar.getPrompt(), 0);
            } else if (40001 == errorCode) {
                ao.a(this.z, aVar.getPrompt(), 0);
                if (LiveRoomChargeTypeSetting.INSTANCE.getValue() == 1) {
                    new ai("live_detail");
                }
            } else if (errorCode == 50019) {
                c();
                com.bytedance.android.livesdk.chatroom.g.a.a(this.z, "send_barrage", new com.bytedance.android.livesdkapi.host.m() {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(9015);
                    }
                });
            } else {
                com.bytedance.android.livesdk.utils.f.a(getContext(), aVar);
            }
            a(aVar);
            return;
        }
        ao.a(this.context, (int) R.string.gpm);
        com.bytedance.android.live.core.c.a.a(3, "CommentWidget", "unknown exception " + exc.toString());
    }

    public final void a(String str, boolean z2, boolean z3, int i2) {
        m.a aVar = m.a.CommentWidget;
        if (!u.a().b().e()) {
            com.bytedance.android.livesdk.at.f b2 = u.a().b();
            Context context = this.context;
            j.a a2 = com.bytedance.android.livesdk.at.j.a();
            a2.f14158a = y.a((int) R.string.gm6);
            a2.f14161d = "comment_live";
            a2.f14160c = -1;
            b2.a(context, a2.a()).a(getAutoUnbindTransformer()).b(new g());
            com.bytedance.android.livesdk.chatroom.g.f.a(0);
        } else if (u.a().b().a(h.COMMENT)) {
            com.bytedance.android.livesdk.chatroom.g.f.a(1);
        } else if (!this.H) {
            ao.a(this.z, (int) R.string.e89);
            com.bytedance.android.livesdk.chatroom.g.f.a(2);
        } else if (!z2) {
            c cVar = this.f16265d;
            String str2 = this.B;
            cVar.f15340b = (Room) cVar.w.b(df.class);
            if (!(cVar.f15340b == null || cVar.f15340b.getOwner() == null)) {
                if (u.a().b().c() == cVar.f15340b.getOwner().getId()) {
                    b.a.a("livesdk_anchor_replay_audience_message").a("event_type", "click").a("enter_from", (String) cVar.w.b(d.class)).a(cVar.w).b();
                }
                HashMap hashMap = new HashMap();
                hashMap.put("live.intent.extra.ENTER_LIVE_SOURCE", str2);
                cVar.a(new ah(str, z3, i2, aVar, hashMap));
            }
            if (this.f16272k != null) {
                b.a.a("livesdk_comment_rethink_send_after_edit_ck").a(this.dataChannel).a("user_id", u.a().b().c()).a("comment_hit_model", this.f16272k.b()).a("comment_resend", str).a("edit_duration", SystemClock.uptimeMillis() - this.f16273l).b();
                this.f16272k = null;
            }
        } else if (str.length() > 15) {
            ao.a(this.context, (int) R.string.gpn);
        } else {
            c cVar2 = this.f16265d;
            String str3 = this.B;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("live.intent.extra.ENTER_LIVE_SOURCE", str3);
            cVar2.a(new ae(str, aVar, hashMap2));
        }
    }

    private void h() {
        this.f16267f = 0;
        this.f16268g = null;
    }

    private void i() {
        ar arVar = this.q;
        if (arVar != null) {
            arVar.a("");
        } else {
            this.r.f15763e = "";
        }
    }

    private void j() {
        ar arVar = this.q;
        if (arVar != null) {
            arVar.a();
        } else {
            this.r.a(null);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onPause");
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onResume");
    }

    static {
        Covode.recordClassIndex(9009);
    }

    private void e() {
        ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(this.context, this.f16264c, "");
    }

    private void k() {
        this.f16262a.setText(R.string.e88);
        getView().setClickable(false);
        this.H = false;
        c(m());
    }

    private void l() {
        this.f16262a.setText(R.string.e8e);
        getView().setClickable(true);
        this.H = true;
        c(m());
    }

    private boolean m() {
        Room room = this.f16264c;
        if (room == null || room.getOwner() == null) {
            return false;
        }
        return this.f16264c.getOwner().isSubscribed();
    }

    private boolean n() {
        if (this.f16264c == null || this.dataChannel == null || !this.H || !o()) {
            return false;
        }
        return true;
    }

    private boolean o() {
        Room room = this.f16264c;
        if (room == null || room.getRoomAuthStatus() == null || !this.f16264c.getRoomAuthStatus().chatSubOnly) {
            return false;
        }
        return true;
    }

    public final void c() {
        if (this.q != null && isViewValid()) {
            this.q.b();
            this.dataChannel.c(cq.class, false);
        }
    }

    private void d() {
        this.f16263b = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        Room room = (Room) this.dataChannel.b(df.class);
        this.f16264c = room;
        if (room.getRoomAuthStatus() == null || this.f16264c.getRoomAuthStatus().isEnableChat()) {
            l();
            this.dataChannel.a(aa.class, (Object) true);
        } else {
            k();
        }
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onLoad");
        f();
        this.f16265d.a((c.a) this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.D.a();
        resetAnim();
        emotes.a.f157063b = false;
        if (!emotes.a.f157062a.isDisposed()) {
            emotes.a.f157062a.a();
        }
        this.f16265d.b();
        this.f16266e = false;
        i();
        j();
        ar arVar = this.q;
        if (arVar != null) {
            arVar.dismissAllowingStateLoss();
            this.q = null;
        }
        Dialog dialog = this.f16269h;
        if (dialog != null) {
            dialog.dismiss();
            this.f16269h = null;
        }
        Dialog dialog2 = this.f16274m;
        if (dialog2 != null) {
            dialog2.dismiss();
            this.f16274m = null;
        }
        this.f16271j = null;
        this.n = null;
        this.f16272k = null;
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onUnload");
        this.x.cancel();
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a() {
        if (isViewValid()) {
            j();
            if (this.z instanceof androidx.fragment.app.e) {
                ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).checkBindHelpShow((androidx.fragment.app.e) this.z, "live_comment");
            }
        }
    }

    private void f() {
        if (this.context != null && this.f16262a != null && getView() != null && (getView().getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            if (this.f16266e) {
                int i2 = F;
                marginLayoutParams.rightMargin = i2;
                marginLayoutParams.leftMargin = i2;
                marginLayoutParams.bottomMargin = y.a(12.0f);
            } else if (this.C || !com.bytedance.android.live.uikit.c.a.a(this.context)) {
                marginLayoutParams.leftMargin = F;
                marginLayoutParams.rightMargin = 0;
                marginLayoutParams.bottomMargin = G;
            } else {
                marginLayoutParams.rightMargin = F;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.bottomMargin = G;
            }
            if (this.I) {
                marginLayoutParams.bottomMargin = y.a(12.0f);
            }
            getView().setLayoutParams(marginLayoutParams);
            SweepEffectFrameLayout sweepEffectFrameLayout = (SweepEffectFrameLayout) getView();
            if (this.C) {
                sweepEffectFrameLayout.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.vp));
                sweepEffectFrameLayout.setStrokeWidth(0.0f);
                int c2 = androidx.core.content.b.c(getContext(), R.color.vr);
                this.f16262a.setTextColor(c2);
                this.w.setTextColor(c2);
                androidx.core.widget.e.a(this.v, ColorStateList.valueOf(c2));
            } else {
                sweepEffectFrameLayout.setBackgroundColor(androidx.core.content.b.c(getContext(), R.color.a0));
                sweepEffectFrameLayout.setStrokeColor(androidx.core.content.b.c(getContext(), R.color.a7));
                sweepEffectFrameLayout.setStrokeWidth((float) getContext().getResources().getDimensionPixelSize(R.dimen.v1));
                int c3 = androidx.core.content.b.c(getContext(), R.color.vr);
                this.f16262a.setTextColor(c3);
                this.w.setTextColor(c3);
                androidx.core.widget.e.a(this.v, ColorStateList.valueOf(c3));
            }
            if (this.I) {
                sweepEffectFrameLayout.setBackgroundColor(androidx.core.content.b.c(this.context, R.color.vq));
                this.f16262a.setShadowLayer(this.context.getResources().getDimension(R.dimen.v4), this.context.getResources().getDimension(R.dimen.v2), this.context.getResources().getDimension(R.dimen.v3), androidx.core.content.b.c(this.context, R.color.vs));
            }
        }
    }

    public final void b() {
        if (this.q == null && this.isViewValid) {
            boolean z2 = false;
            if (this.f16263b && !com.bytedance.android.livesdk.ap.a.bR.a().booleanValue()) {
                if (this.E == null) {
                    b.a aVar = new b.a(this.context);
                    aVar.f18293j = true;
                    this.E = aVar.b(R.string.e8d).a(R.string.eca, (DialogInterface.OnClickListener) new z(this), false).b(R.string.gle, aa.f16447a, false).a();
                }
                com.bytedance.android.livesdk.l.b bVar = this.E;
                if (bVar != null && !bVar.isShowing()) {
                    this.E.show();
                }
                com.bytedance.android.livesdk.chatroom.g.c.a("Current user is anchor who disable comment");
            } else if (u.a().b().a(h.COMMENT)) {
                com.bytedance.android.livesdk.chatroom.g.c.a("Anchor closed comment");
            } else if (!this.r.f15761c) {
                Room room = this.f16264c;
                if (!(room == null || room.getOwner() == null || !this.f16264c.getOwner().isAnchorHasSubQualification())) {
                    z2 = true;
                }
                if (this.f16263b || !o() || m()) {
                    this.dataChannel.c(cq.class, true);
                    Room room2 = this.f16264c;
                    if (!(room2 == null || room2.mRoomAuthStatus == null)) {
                        this.r.f15764f = this.f16264c.mRoomAuthStatus.enableDanmaku;
                    }
                    Room room3 = this.f16264c;
                    if (room3 != null && room3.isOfficial()) {
                        this.r.f15765g = true;
                    }
                    this.r.f15766h = z2;
                    f fVar = this.r;
                    ar.a aVar2 = this.K;
                    bg bgVar = new bg();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("live.intent.extra.DANMU_OPEN", fVar.f15759a);
                    bundle.putBoolean("live.intent.extra.IS_BROADCASTER", fVar.f15760b);
                    bundle.putBoolean("live.intent.extra.USER_BANNED", fVar.f15761c);
                    bundle.putBoolean("live.intent.extra.USER_BANNED_WHOLE_LIVE", fVar.f15762d);
                    bundle.putString("live.intent.extra.INPUT", fVar.f15763e);
                    bundle.putBoolean("live.inter.extra.CAN_DANMU", fVar.f15764f);
                    bundle.putBoolean("live.inter.extra.IS_OFFICIAL", fVar.f15765g);
                    bundle.putInt("live.intent.extra.INPUT_MODE", !fVar.f15766h ? 1 : 0);
                    bundle.putParcelableArrayList("live.intent.extra.EMOTES", new ArrayList<>(Collections.unmodifiableList(fVar.f15767i)));
                    bgVar.setArguments(bundle);
                    bgVar.f15944c = aVar2;
                    this.q = bgVar;
                    bgVar.a(this.J);
                    try {
                        this.q.a(this.z, "INPUT");
                        this.o = SystemClock.elapsedRealtime();
                        bf.a().a(true);
                        this.dataChannel.c(z.class);
                    } catch (IllegalStateException e2) {
                        com.bytedance.android.livesdk.chatroom.g.c.a("exception" + e2.getMessage());
                        this.q = null;
                    }
                } else {
                    if (!this.C) {
                        this.dataChannel.a(com.bytedance.android.livesdk.chatroom.e.class, Long.valueOf(this.f16264c.getId()));
                        com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a(1));
                    } else {
                        e();
                    }
                    com.bytedance.android.livesdk.chatroom.g.c.a("Anchor set only subscribed users can comment");
                }
            } else {
                com.bytedance.android.livesdk.chatroom.g.c.a("User is banded");
                if (this.r.f15762d) {
                    ao.a(this.z, (int) R.string.eq3);
                } else {
                    ao.a(this.z, (int) R.string.eq2);
                }
            }
        }
    }

    public void onEvent(ap apVar) {
        b(apVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z a(ap apVar) {
        b(apVar);
        return h.z.f158842a;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget
    public void onVisibilityToUser(boolean z2) {
        super.onVisibilityToUser(z2);
        this.t = z2;
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(com.bytedance.android.livesdk.chatroom.model.d dVar) {
        if (dVar != null) {
            a(false, dVar.f15748a, m.a.CommentWidget);
        }
    }

    private <T> void a(Class<T> cls) {
        com.bytedance.android.livesdk.an.a.a().a(this, cls, this.dataChannel).a(new ak(this));
    }

    public void onEvent(com.bytedance.android.livesdk.chatroom.c.b bVar) {
        if (this.f16263b) {
            if (bVar.f15111a) {
                l();
            } else {
                k();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        d();
        if (this.t && EnablePreloadFirstScreenFrameSetting.INSTANCE.getValue() == 1) {
            com.bytedance.android.livesdk.chatroom.g.f.f15527b = this.f16264c;
            com.bytedance.android.livesdk.chatroom.g.f.a();
        }
    }

    private void a(com.bytedance.android.live.a.a.b.a aVar) {
        if (com.bytedance.android.live.core.e.b.a.a(aVar) && ChatNeedBindPhoneSetting.INSTANCE.getValue()) {
            ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).startBindPhoneDialogFragment(this.z, "live_detail", "live_detail", new aj(this));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void b(Exception exc) {
        c(exc);
        if ((exc instanceof com.bytedance.android.live.a.a.b.a) && ((com.bytedance.android.live.a.a.a) exc).getErrorCode() == 4010024) {
            b.a.a("livesdk_subscribe_expire").a(this.dataChannel).a("click_position", "sub_emote").b();
        }
    }

    private void b(final ap apVar) {
        long id;
        this.dataChannel.a(d.class, apVar.f15110f);
        h();
        if (apVar.f15109e == null) {
            id = 0;
        } else {
            id = apVar.f15109e.getId();
        }
        this.f16267f = id;
        if (apVar.f15105a == 1) {
            getView().postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(9016);
                }

                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        String a2 = com.bytedance.android.livesdk.utils.h.a("@%s ", apVar.f15106b);
                        CommentWidget.this.f16268g = com.bytedance.android.livesdk.utils.h.a("@%s", apVar.f15106b);
                        if (CommentWidget.this.q != null) {
                            CommentWidget.this.q.a(a2);
                            return;
                        }
                        CommentWidget.this.r.f15763e = a2;
                        CommentWidget.this.p = true;
                        CommentWidget.this.b();
                    }
                }
            }, 500);
        } else if (apVar.f15105a == 2) {
            getView().postDelayed(new Runnable() {
                /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(9017);
                }

                public final void run() {
                    if (CommentWidget.this.isViewValid()) {
                        if (CommentWidget.this.q != null) {
                            CommentWidget.this.q.a(apVar.f15107c);
                            return;
                        }
                        CommentWidget.this.r.f15759a = apVar.f15107c;
                        CommentWidget.this.b();
                    }
                }
            }, 500);
        } else {
            if (apVar.f15105a == 3) {
                if (isViewValid()) {
                    ar arVar = this.q;
                    if (arVar != null) {
                        arVar.a(apVar.f15106b);
                        return;
                    } else {
                        this.r.f15763e = apVar.f15106b;
                    }
                } else {
                    return;
                }
            }
            b();
        }
    }

    private void c(Exception exc) {
        if (exc instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) exc;
            int errorCode = aVar.getErrorCode();
            long j2 = 0;
            if (50001 == errorCode) {
                ao.a(this.z, aVar.getPrompt(), 0);
            } else if (50004 == errorCode) {
                i();
                c();
                ao.a(this.z, aVar.getPrompt(), 0);
            } else if (errorCode == 50019) {
                c();
                com.bytedance.android.livesdk.chatroom.g.a.a(this.z, "send_message", new com.bytedance.android.livesdkapi.host.m() {
                    /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass5 */

                    static {
                        Covode.recordClassIndex(9014);
                    }
                });
            } else if (errorCode == 50015) {
                c();
                ao.a(this.z, (int) R.string.e89);
            } else if (errorCode != 4010021) {
                ao.a(this.z, aVar.getPrompt(), 0);
            } else if (!com.bytedance.common.utility.m.a(aVar.getExtra())) {
                try {
                    j2 = (long) ((Integer) new JSONObject(aVar.getExtra()).get("dueDate")).intValue();
                } catch (JSONException unused) {
                }
                a(new com.bytedance.android.livesdk.chatroom.c.c(j2));
            }
            a(aVar);
            return;
        }
        ao.a(y.e(), (int) R.string.e3z);
        com.bytedance.android.live.core.c.a.a(6, "CommentWidget", "unknown exception " + exc.toString());
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void b(boolean z2) {
        if (this.f16263b) {
            if (z2 != com.bytedance.android.livesdk.ap.a.bR.a().booleanValue()) {
                com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.bR, Boolean.valueOf(z2));
                com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdk.chatroom.c.b(z2));
            }
        } else if (z2) {
            l();
        } else {
            k();
        }
    }

    public final void a(ab abVar) {
        if (abVar != null && this.dataChannel != null) {
            if (((Boolean) this.dataChannel.b(cn.class)).booleanValue()) {
                this.f16271j = abVar;
                return;
            }
            b.a.a("livesdk_comment_rethink_sw").a(this.dataChannel).a("user_id", u.a().b().c()).a(UGCMonitor.EVENT_COMMENT, abVar.f15071b).a("resend_same_cmt", abVar.a() ? 1 : 0).b();
            Dialog dialog = this.f16269h;
            if (dialog != null) {
                dialog.dismiss();
            }
            String value = LiveCommunityGuidelineSetting.INSTANCE.getValue();
            ad adVar = null;
            if (!this.f16263b && !TextUtils.isEmpty(value)) {
                adVar = new ad(this, value, abVar);
            }
            this.f16269h = com.bytedance.android.livesdk.am.a.a(getContext(), adVar, new ae(this, abVar), new af(this, abVar));
            bf.a().b();
            this.f16270i = false;
            this.f16269h.show();
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(boolean z2) {
        String str;
        this.v.setScaleX(1.0f);
        this.v.setScaleY(1.0f);
        this.v.setAlpha(1.0f);
        this.w.setScaleX(1.0f);
        this.w.setScaleY(1.0f);
        this.w.setAlpha(1.0f);
        this.f16262a.setScaleX(1.0f);
        this.f16262a.setScaleY(1.0f);
        this.f16262a.setAlpha(1.0f);
        ((SweepEffectFrameLayout) getView()).setSweepRatio(0.0f);
        if (!n()) {
            this.u.setVisibility(8);
            this.f16262a.setVisibility(0);
        } else if (!z2) {
            this.u.setVisibility(0);
            this.f16262a.setVisibility(8);
        } else if (!p.a(this.f16264c.getId()) || this.y) {
            this.u.setVisibility(8);
            this.f16262a.setVisibility(0);
        } else {
            p.b(this.f16264c.getId());
            this.y = true;
            this.u.setVisibility(0);
            this.f16262a.setVisibility(8);
            this.x.start();
        }
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_comment_area_mode").a(this.dataChannel);
        if (n()) {
            str = "sub_only";
        } else {
            str = "normal";
        }
        a2.a("mode", str).b();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        String str;
        this.f16263b = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.f16264c = (Room) this.dataChannel.b(df.class);
        this.C = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.B = (String) this.dataChannel.b(com.bytedance.android.livesdkapi.e.b.class);
        this.z = com.bytedance.android.livesdk.utils.p.a(this.context);
        this.f16265d = new c();
        this.f16262a = (TextView) findViewById(R.id.asf);
        this.u = findViewById(R.id.aaj);
        this.v = (ImageView) findViewById(R.id.aai);
        this.w = (TextView) findViewById(R.id.aak);
        getView().setOnClickListener(new y(this));
        this.r.f15760b = this.f16263b;
        if (com.ss.android.ugc.aweme.bf.d.a(this.z, "feed_live_span", 0).getInt("span_count", 0) > 1) {
            str = "live_small_picture";
        } else {
            str = "live_big_picture";
        }
        this.A = str;
        this.x = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.v, View.SCALE_X, 1.0f, 0.0f);
        ofFloat.setInterpolator(androidx.core.h.b.b.a(0.67f, -1.15f, 0.88f, 0.67f));
        ofFloat.setDuration(667L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.v, View.SCALE_Y, 1.0f, 0.0f);
        ofFloat2.setInterpolator(androidx.core.h.b.b.a(0.67f, -1.15f, 0.88f, 0.67f));
        ofFloat2.setDuration(667L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.v, View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setInterpolator(androidx.core.h.b.b.a(0.34f, 0.0f, 0.7f, 1.0f));
        ofFloat3.setStartDelay(500);
        ofFloat3.setDuration(333L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.w, View.SCALE_X, 1.0f, 0.0f);
        ofFloat4.setInterpolator(androidx.core.h.b.b.a(0.2f, 0.0f, 0.6f, 1.0f));
        ofFloat4.setStartDelay(467);
        ofFloat4.setDuration(300L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.w, View.SCALE_Y, 1.0f, 0.0f);
        ofFloat5.setInterpolator(androidx.core.h.b.b.a(0.2f, 0.0f, 0.6f, 1.0f));
        ofFloat5.setStartDelay(467);
        ofFloat5.setDuration(300L);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.w, View.ALPHA, 1.0f, 0.0f);
        ofFloat6.setInterpolator(androidx.core.h.b.b.a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat6.setStartDelay(467);
        ofFloat6.setDuration(200L);
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f16262a, View.SCALE_X, 1.0f, 1.1f, 1.0f);
        ofFloat7.setInterpolator(androidx.core.h.b.b.a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat7.setStartDelay(533);
        ofFloat7.setDuration(500L);
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.f16262a, View.SCALE_Y, 1.0f, 1.1f, 1.0f);
        ofFloat8.setInterpolator(androidx.core.h.b.b.a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat8.setStartDelay(533);
        ofFloat8.setDuration(500L);
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this.f16262a, View.ALPHA, 0.0f, 1.0f);
        ofFloat9.addListener(new AnimatorListenerAdapter() {
            /* class com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.AnonymousClass4 */

            static {
                Covode.recordClassIndex(9013);
            }

            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                CommentWidget.this.f16262a.setVisibility(0);
            }
        });
        ofFloat9.setInterpolator(androidx.core.h.b.b.a(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat9.setStartDelay(467);
        ofFloat9.setDuration(1033L);
        ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat10.addUpdateListener(new u((SweepEffectFrameLayout) getView()));
        ofFloat10.setInterpolator(androidx.core.h.b.b.a(0.21f, 0.0f, 0.5f, 1.0f));
        ofFloat10.setStartDelay(1333);
        ofFloat10.setDuration(1667L);
        this.x.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ofFloat9, ofFloat10);
        com.bytedance.android.livesdk.ab.i.b();
        com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onInit");
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        Long l2;
        boolean z2;
        boolean z3;
        String str;
        User owner;
        User owner2;
        a(ap.class);
        a(com.bytedance.android.livesdk.chatroom.c.b.class);
        if (this.f16264c != null && getView() != null) {
            h();
            this.f16263b = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
            this.f16264c = (Room) this.dataChannel.b(df.class);
            this.C = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
            this.B = (String) this.dataChannel.b(com.bytedance.android.livesdkapi.e.b.class);
            this.f16266e = ((Boolean) this.dataChannel.b(bc.class)).booleanValue();
            this.z = com.bytedance.android.livesdk.utils.p.a(this.context);
            this.I = Boolean.TRUE.equals(this.dataChannel.b(ea.class));
            d();
            DataChannel dataChannel = this.dataChannel;
            l.d(this.f16264c, "");
            if (dataChannel != null) {
                emotes.a.f157063b = true;
                if (!emotes.a.f157062a.isDisposed()) {
                    emotes.a.f157062a.a();
                }
                Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room == null || (owner2 = room.getOwner()) == null) {
                    z3 = false;
                } else {
                    z3 = owner2.isAnchorHasSubQualification();
                }
                Room room2 = (Room) DataChannelGlobal.f34575d.b(ac.class);
                if (room2 == null || (owner = room2.getOwner()) == null) {
                    str = null;
                } else {
                    str = owner.getSecUid();
                }
                if (!z3 || TextUtils.isEmpty(str)) {
                    com.bytedance.android.live.core.c.a.b("isAnchorHasQualification  = ".concat(String.valueOf(z3)));
                } else {
                    emotes.a.f157062a.a(((EmoteApi) com.bytedance.android.live.network.e.a().a(EmoteApi.class)).getEmotesDetail(false, str).a(f.a.h.a.b(f.a.k.a.f158006c)).d(new a.C4149a()).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(a.b.f157081a, a.c.f157091a));
                }
            }
            this.dataChannel.a((androidx.lifecycle.m) this, com.bytedance.android.live.j.class, (h.f.a.b) new v(this)).a((androidx.lifecycle.m) this, com.bytedance.android.livesdk.j.ah.class, (h.f.a.b) new ag(this)).a((androidx.lifecycle.m) this, com.bytedance.android.livesdk.j.m.class, (h.f.a.b) new an(this)).a((androidx.lifecycle.m) this, ba.class, (h.f.a.b) new ao(this)).b((androidx.lifecycle.m) this, com.bytedance.android.live.gift.d.class, (h.f.a.b) new ap(this)).a((androidx.lifecycle.m) this, com.bytedance.android.livesdk.j.ag.class, (h.f.a.b) new aq(this)).a((androidx.lifecycle.m) this, at.class, (h.f.a.b) new ar(this)).a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.a.class, (h.f.a.b) new as(this)).a((androidx.lifecycle.m) this, cn.class, (h.f.a.b) new at(this));
            com.bytedance.android.livesdk.ab.i.b();
            com.bytedance.android.livesdk.ab.i.b("ttlive_comment", "CommentWidget onLoad");
            f();
            if (!this.C) {
                this.D.a(((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.event.g.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(this))).a(new w(this)));
            }
            if (!this.f16263b) {
                DataChannel dataChannel2 = this.dataChannel;
                boolean z4 = this.H;
                if (dataChannel2 != null) {
                    Boolean bool = (Boolean) dataChannel2.b(ee.class);
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_comment_box_show");
                    a2.a(dataChannel2);
                    if (!z2) {
                        a2.a("is_click_available", z4 ? 1 : 0);
                    }
                    com.bytedance.android.livesdk.chatroom.g.b.a(a2, dataChannel2);
                    a2.b();
                }
            }
            this.y = false;
            DataChannelGlobal.f34575d.a(this, this, com.bytedance.android.live.n.aa.class, new x(this));
            if (this.f16264c != null && (l2 = (Long) this.dataChannel.b(com.bytedance.android.livesdk.chatroom.e.class)) != null && l2.longValue() == this.f16264c.getId()) {
                e();
                this.dataChannel.a(com.bytedance.android.livesdk.chatroom.e.class, (Object) null);
            }
        }
    }

    public final void a(com.bytedance.android.livesdk.chatroom.c.c cVar) {
        if (((Boolean) this.dataChannel.b(cn.class)).booleanValue()) {
            this.n = cVar;
            return;
        }
        Dialog dialog = this.f16274m;
        if (dialog != null) {
            dialog.dismiss();
        }
        String a2 = y.a((int) R.string.dxr);
        b.a aVar = new b.a(getContext());
        aVar.f18284a = y.a((int) R.string.dxt);
        aVar.f18285b = a2;
        b.a a3 = aVar.b(R.string.eh7, (DialogInterface.OnClickListener) new ah(this), false).a(R.string.dxs, (DialogInterface.OnClickListener) new ai(this), false);
        a3.f18296m = false;
        this.f16274m = a3.a();
        bf.a().b();
        this.f16274m.show();
    }

    @Override // com.bytedance.android.livesdk.chatroom.e.c.a
    public final void a(ah ahVar, Exception exc) {
        if (!(exc instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) exc).getErrorCode() != 4010020) {
            c(exc);
        } else if (this.dataChannel != null) {
            a(new ab((String) this.dataChannel.b(com.bytedance.android.livesdk.chatroom.c.class), ahVar.b(), ahVar.c(), ahVar.d(), ahVar.e(), ahVar.f()));
        }
        if (this.dataChannel != null) {
            this.dataChannel.a(com.bytedance.android.livesdk.chatroom.c.class, ahVar.b());
        }
    }

    private void a(boolean z2, long j2, m.a aVar) {
        if (this.f16263b) {
            com.bytedance.android.livesdk.chatroom.g.b.a(this.dataChannel);
            return;
        }
        com.bytedance.android.livesdk.chatroom.g.b.a(this.dataChannel, z2, j2, this.A, this.C, n(), aVar, this.f16267f);
        h();
    }
}
