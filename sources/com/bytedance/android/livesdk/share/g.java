package com.bytedance.android.livesdk.share;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.liveinteract.api.ar;
import com.bytedance.android.live.p.f;
import com.bytedance.android.live.p.l;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ISlotService;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.g.a.d;
import com.bytedance.android.livesdk.chatroom.g.n;
import com.bytedance.android.livesdk.j.bk;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dl;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.watchlive.ShowAudienceDefinitionSelectionSetting;
import com.bytedance.android.livesdk.model.message.ca;
import com.bytedance.android.livesdk.model.message.cd;
import com.bytedance.android.livesdk.share.c;
import com.bytedance.android.livesdk.toolbar.h;
import com.bytedance.android.livesdk.utils.aj;
import com.bytedance.android.livesdkapi.depend.e.c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdkapi.model.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.b.a;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g implements f, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    boolean f21455a;

    /* renamed from: b  reason: collision with root package name */
    String f21456b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21457c;

    /* renamed from: d  reason: collision with root package name */
    public Room f21458d;

    /* renamed from: e  reason: collision with root package name */
    AnimatorSet f21459e;

    /* renamed from: f  reason: collision with root package name */
    ObjectAnimator f21460f;

    /* renamed from: g  reason: collision with root package name */
    e f21461g;

    /* renamed from: h  reason: collision with root package name */
    public Context f21462h;

    /* renamed from: i  reason: collision with root package name */
    public DataChannel f21463i;

    /* renamed from: j  reason: collision with root package name */
    public m f21464j;

    /* renamed from: k  reason: collision with root package name */
    protected final a f21465k = new a();

    /* renamed from: l  reason: collision with root package name */
    public ImageView f21466l;

    /* renamed from: m  reason: collision with root package name */
    cd f21467m;
    boolean n = false;
    LiveAutoRtlTextView o;
    private i p;
    private IMessageManager q;
    private Dialog r;

    static {
        Covode.recordClassIndex(12634);
    }

    @Override // com.bytedance.android.live.p.f
    public final void a() {
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(boolean z) {
    }

    @Override // com.bytedance.android.live.p.f
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z e() {
        cd cdVar = this.f21467m;
        if (cdVar != null) {
            a(cdVar);
        }
        return z.f158842a;
    }

    public final void d() {
        f();
        this.f21466l.setImageDrawable(null);
        this.f21455a = false;
        this.f21456b = null;
        this.f21466l.setScaleX(1.0f);
        this.f21466l.setScaleY(1.0f);
    }

    private void f() {
        if (this.n) {
            Integer a2 = h.a(l.SHARE);
            if (a2 != null) {
                this.f21466l.setBackgroundResource(a2.intValue());
                return;
            }
            return;
        }
        this.f21466l.setBackgroundResource(l.SHARE.getDrawable());
    }

    public final void c() {
        Animation animation = this.f21466l.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        AnimatorSet animatorSet = this.f21459e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.f21460f;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.f21466l.clearAnimation();
        d();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof cd) {
            a((cd) iMessage);
        } else if ((iMessage instanceof ca) && ((ca) iMessage).f19455a > 100 && this.f21455a) {
            c();
        }
    }

    private void a(final cd cdVar) {
        Context context = this.f21462h;
        if (context != null) {
            this.f21467m = cdVar;
            if (!this.f21457c) {
                this.f21465k.a(n.a(context).a(this.f21458d.getIdStr()).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new f.a.d.f<Long>() {
                    /* class com.bytedance.android.livesdk.share.g.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(12638);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Long l2) {
                        if (l2.longValue() != g.this.f21458d.getId()) {
                            g.this.a(cdVar, -1);
                        }
                    }
                }));
            } else if (this.p == i.VIDEO) {
                a(cdVar, 300);
            }
        }
    }

    public final void onClick(View view) {
        IIconSlot.b bVar;
        String str;
        String str2;
        if (this.f21461g != null && this.f21458d != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j2 = uptimeMillis - aj.f22236a;
            aj.f22236a = uptimeMillis;
            boolean z = true;
            if (j2 > 500) {
                String str3 = (String) this.f21463i.b(com.bytedance.android.livesdk.j.cd.class);
                String a2 = com.bytedance.android.livesdk.ab.e.a();
                String d2 = com.bytedance.android.livesdk.ab.e.d();
                Room room = this.f21458d;
                if (room == null || room.getOwner() == null || this.f21458d.getOwner().getSecret() != 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("position", "detail_bottom_bar");
                    String str4 = "";
                    hashMap.putAll(b.a.a(str4).d());
                    Room room2 = this.f21458d;
                    c.a a3 = com.bytedance.android.live.share.e.a(room2, this.f21463i, com.bytedance.android.live.share.e.a(room2.getOwner()), "live_room_share_button", hashMap);
                    HashMap hashMap2 = new HashMap();
                    Room room3 = this.f21458d;
                    if (room3 == null || room3.mRoomAuthStatus == null || !this.f21458d.mRoomAuthStatus.isEnablePromote()) {
                        z = false;
                    }
                    hashMap2.put("param_broadcast_room_auth_promote_bool", Boolean.valueOf(z));
                    ISlotService iSlotService = (ISlotService) com.bytedance.android.live.t.a.a(ISlotService.class);
                    if (this.f21457c) {
                        bVar = IIconSlot.b.SLOT_BROADCAST_SHARE;
                    } else {
                        bVar = IIconSlot.b.SLOT_AUDIENCE_SHARE;
                    }
                    c.a a4 = a3.a(iSlotService.getLiveShareSheetAction(hashMap2, bVar));
                    i iVar = this.p;
                    Room room4 = this.f21458d;
                    h.f.b.l.d(iVar, str4);
                    ArrayList arrayList = new ArrayList();
                    boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
                    if (isEnable && (iVar == i.THIRD_PARTY || iVar == i.SCREEN_RECORD)) {
                        if (room4 == null || (str2 = String.valueOf(room4.getId())) == null) {
                            str2 = str4;
                        }
                        if (iVar != null) {
                            str4 = j.a(iVar);
                        }
                        com.bytedance.android.livesdk.definition.a.a(str2, str4, "0");
                        arrayList.add(new c.a());
                    }
                    com.bytedance.android.live.core.c.a.a(4, "LiveSheetActionProvider", "provideLiveSheetActions(). enable=" + isEnable + ", liveMode=" + iVar + ", listSize=" + arrayList.size());
                    a4.a(arrayList);
                    l.SHARE.setRedDotVisible(this.f21463i, false);
                    HashMap hashMap3 = new HashMap();
                    if (this.f21457c) {
                        hashMap3.put("request_page", "live_room");
                        hashMap3.put("position", "detail_bottom_bar");
                        str = "anchor_share_click";
                    } else {
                        Integer num = (Integer) this.f21463i.b(dl.class);
                        if (num == null) {
                            num = 0;
                        }
                        hashMap3.put("share_num", num.toString());
                        str = "user_share_click";
                    }
                    b.a.a(str).a(this.f21463i).a("live_type", j.a(this.f21458d.getStreamType())).a((Map<String, String>) hashMap3).b();
                    a3.L = (String) this.f21463i.b(bk.class);
                    a3.O = com.bytedance.android.livesdk.utils.a.a(this.f21463i);
                    a3.N = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                    final com.bytedance.android.livesdkapi.depend.e.c a5 = a3.a();
                    Dialog dialog = this.r;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    Dialog b2 = ((com.bytedance.android.live.share.c) com.bytedance.android.live.t.a.a(com.bytedance.android.live.share.c.class)).share().b(this.f21461g, a5, new com.bytedance.android.livesdkapi.depend.e.b() {
                        /* class com.bytedance.android.livesdk.share.g.AnonymousClass7 */

                        static {
                            Covode.recordClassIndex(12642);
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.e.b
                        public final void a(Throwable th) {
                        }

                        @Override // com.bytedance.android.livesdkapi.depend.e.b
                        public final void a(String str, String str2, Bundle bundle) {
                            com.bytedance.ies.f.b a2;
                            com.bytedance.android.live.share.e.a(g.this.f21458d, g.this.f21463i, g.this.f21464j, str2, g.this.f21458d.getLabels(), bundle);
                            HashMap hashMap = null;
                            if (!g.this.f21457c && ((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                                hashMap = new HashMap();
                                hashMap.put("connection_type", "manual_pk");
                                hashMap.put("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId()));
                            }
                            com.bytedance.android.live.share.e.a(g.this.f21458d, g.this.f21463i, str, str2, bundle, a5.B, hashMap);
                            com.bytedance.android.live.share.e.a(g.this.f21458d, g.this.f21463i, str);
                            if (g.this.f21462h != null && (a2 = com.bytedance.ies.f.b.a(g.this.f21462h, com.bytedance.ies.f.b.f33816b)) != null) {
                                a2.b("live.mt.lastest.share.channel", str);
                            }
                        }
                    });
                    this.r = b2;
                    if (b2 != null) {
                        b2.show();
                    }
                    if (this.f21455a && !com.bytedance.common.utility.m.a(this.f21456b)) {
                        b.a.a("livesdk_share_button_click").a(this.f21463i).a("share_platform", this.f21456b).b();
                    }
                    if (this.f21455a && this.f21457c) {
                        b.a.a("livesdk_anchor_share_button_click").a(this.f21463i).a("share_platform", "chat_merge").b();
                    }
                    if (this.f21455a) {
                        c();
                    }
                    n.a(view.getContext()).a(this.f21458d.getIdStr(), this.f21458d.getId());
                    return;
                }
                d dVar = new d(this.f21458d.getId(), this.f21458d.getOwnerUserId(), this.f21458d.getOwnerUserId(), this.f21458d.getOwner().getSecUid(), "anchor_profile", a2, d2, str3, "report_anchor", this.f21458d.getRequestId());
                dVar.s = ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).getReportScene();
                ((com.bytedance.android.live.s.e) com.bytedance.android.live.t.a.a(com.bytedance.android.live.s.e.class)).report(this.f21462h, dVar);
            }
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void b(View view, DataChannel dataChannel) {
        c();
        IMessageManager iMessageManager = this.q;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        dataChannel.b(this);
        AnimatorSet animatorSet = this.f21459e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator = this.f21460f;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.f21465k.a();
        this.f21467m = null;
    }

    public final void a(cd cdVar, final int i2) {
        com.bytedance.ies.f.b bVar;
        Context context = this.f21462h;
        String str = null;
        if (context != null) {
            bVar = com.bytedance.ies.f.b.a(context, com.bytedance.ies.f.b.f33816b);
        } else {
            bVar = null;
        }
        String str2 = "";
        if (bVar != null) {
            str = bVar.a("live.mt.lastest.share.channel", str2);
        }
        if (((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).isImChannel(str)) {
            ((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getUrlModelAndShowAnim(new IHostShare.a() {
                /* class com.bytedance.android.livesdk.share.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12635);
                }

                @Override // com.bytedance.android.livesdkapi.host.IHostShare.a
                public final void a(final List<com.bytedance.android.live.base.model.b> list) {
                    if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                        d.a.b().a(new com.bytedance.android.livesdk.chatroom.g.a.a() {
                            /* class com.bytedance.android.livesdk.share.g.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(12636);
                            }

                            @Override // com.bytedance.android.livesdk.chatroom.g.a.b
                            public final void a() {
                                g gVar = g.this;
                                List list = list;
                                long j2 = (long) i2;
                                d.a.b().a();
                                if (gVar.f21466l != null && gVar.f21461g != null && !gVar.f21461g.isFinishing() && !com.bytedance.common.utility.m.a(gVar.f21456b, "copy")) {
                                    if ((gVar.f21458d == null || gVar.f21458d.getOwner() == null || gVar.f21458d.getOwner().getSecret() != 1) && !gVar.f21455a) {
                                        gVar.f21455a = true;
                                        b.a.a("livesdk_share_button_show").a(gVar.f21463i).a("share_platform", "chat_merge").b();
                                        if (gVar.f21457c) {
                                            b.a.a("livesdk_anchor_share_button_show").a(gVar.f21463i).a("share_platform", "chat_merge").b();
                                        }
                                        AnonymousClass5 r4 = new p.a() {
                                            /* class com.bytedance.android.livesdk.share.g.AnonymousClass5 */

                                            static {
                                                Covode.recordClassIndex(12640);
                                            }

                                            @Override // com.bytedance.android.live.core.f.p.a
                                            public final void a(ImageModel imageModel) {
                                            }

                                            @Override // com.bytedance.android.live.core.f.p.a
                                            public final void a(ImageModel imageModel, int i2, int i3) {
                                            }

                                            @Override // com.bytedance.android.live.core.f.p.a
                                            public final void a(ImageModel imageModel, Exception exc) {
                                                g.this.c();
                                            }
                                        };
                                        com.bytedance.android.livesdk.chatroom.g.g.a(gVar.f21466l, ((com.bytedance.android.live.base.model.b) list.get(0)).a(), r4);
                                        gVar.f21466l.setBackground(null);
                                        long j3 = -1;
                                        if (j2 != -1) {
                                            j3 = (j2 * 1000) / 600;
                                        }
                                        gVar.f21459e = new AnimatorSet();
                                        gVar.f21460f = ObjectAnimator.ofFloat(gVar.f21466l, "scaleX", 1.05f, 0.9f).setDuration(600L);
                                        ObjectAnimator duration = ObjectAnimator.ofFloat(gVar.f21466l, "scaleY", 1.05f, 0.9f).setDuration(600L);
                                        gVar.f21460f.setRepeatMode(2);
                                        duration.setRepeatMode(2);
                                        if (gVar.f21457c) {
                                            int i2 = (int) j3;
                                            gVar.f21460f.setRepeatCount(i2);
                                            duration.setRepeatCount(i2);
                                        } else {
                                            gVar.f21460f.setRepeatCount(-1);
                                            duration.setRepeatCount(-1);
                                        }
                                        gVar.f21459e.playTogether(gVar.f21460f, duration);
                                        gVar.f21460f.addListener(new AnimatorListenerAdapter(list, r4) {
                                            /* class com.bytedance.android.livesdk.share.g.AnonymousClass6 */

                                            /* renamed from: a  reason: collision with root package name */
                                            int f21479a;

                                            /* renamed from: b  reason: collision with root package name */
                                            final /* synthetic */ int f21480b = 16;

                                            /* renamed from: c  reason: collision with root package name */
                                            final /* synthetic */ List f21481c;

                                            /* renamed from: d  reason: collision with root package name */
                                            final /* synthetic */ p.a f21482d;

                                            static {
                                                Covode.recordClassIndex(12641);
                                            }

                                            public final void onAnimationEnd(Animator animator) {
                                                super.onAnimationEnd(animator);
                                                g.this.d();
                                            }

                                            public final void onAnimationRepeat(Animator animator) {
                                                super.onAnimationRepeat(animator);
                                                int i2 = this.f21479a + 1;
                                                this.f21479a = i2;
                                                if (i2 % this.f21480b == 0) {
                                                    if (i2 == this.f21481c.size() * this.f21480b) {
                                                        this.f21479a = 0;
                                                    }
                                                    com.bytedance.android.livesdk.chatroom.g.g.a(g.this.f21466l, ((com.bytedance.android.live.base.model.b) this.f21481c.get(this.f21479a / this.f21480b)).a(), this.f21482d);
                                                    g.this.f21466l.setBackground(null);
                                                }
                                            }

                                            {
                                                this.f21481c = r3;
                                                this.f21482d = r4;
                                            }
                                        });
                                        gVar.f21459e.start();
                                    }
                                }
                            }
                        });
                    }
                }
            });
            return;
        }
        Pair<String, Drawable> breathShareAnimShareRes = ((IHostShare) com.bytedance.android.live.t.a.a(IHostShare.class)).getBreathShareAnimShareRes(this.f21461g, str, cdVar.f19469a);
        if (breathShareAnimShareRes != null) {
            if (!com.bytedance.common.utility.m.a((String) breathShareAnimShareRes.first)) {
                str2 = (String) breathShareAnimShareRes.first;
            }
            this.f21456b = str2;
            final Drawable drawable = (Drawable) breathShareAnimShareRes.second;
            if (drawable != null) {
                d.a.b().a(new com.bytedance.android.livesdk.chatroom.g.a.a() {
                    /* class com.bytedance.android.livesdk.share.g.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(12637);
                    }

                    @Override // com.bytedance.android.livesdk.chatroom.g.a.b
                    public final void a() {
                        g gVar = g.this;
                        Drawable drawable = drawable;
                        long j2 = (long) i2;
                        d.a.b().a();
                        if (gVar.f21466l != null && gVar.f21461g != null && !gVar.f21461g.isFinishing() && !com.bytedance.common.utility.m.a(gVar.f21456b, "copy")) {
                            if ((gVar.f21458d == null || gVar.f21458d.getOwner() == null || gVar.f21458d.getOwner().getSecret() != 1) && !gVar.f21455a) {
                                gVar.f21455a = true;
                                if (!com.bytedance.common.utility.m.a(gVar.f21456b)) {
                                    b.a.a("livesdk_share_button_show").a(gVar.f21463i).a("share_platform", gVar.f21456b).b();
                                    if (gVar.f21457c) {
                                        b.a.a("livesdk_anchor_share_button_show").a(gVar.f21463i).a("share_platform", gVar.f21456b).b();
                                    }
                                }
                                gVar.f21466l.setBackground(drawable);
                                long j3 = -1;
                                if (j2 != -1) {
                                    j3 = (j2 * 1000) / 600;
                                }
                                gVar.f21459e = new AnimatorSet();
                                gVar.f21460f = ObjectAnimator.ofFloat(gVar.f21466l, "scaleX", 1.05f, 0.9f).setDuration(600L);
                                ObjectAnimator duration = ObjectAnimator.ofFloat(gVar.f21466l, "scaleY", 1.05f, 0.9f).setDuration(600L);
                                gVar.f21460f.setRepeatMode(2);
                                duration.setRepeatMode(2);
                                if (gVar.f21457c) {
                                    int i2 = (int) j3;
                                    gVar.f21460f.setRepeatCount(i2);
                                    duration.setRepeatCount(i2);
                                } else {
                                    gVar.f21460f.setRepeatCount(-1);
                                    duration.setRepeatCount(-1);
                                }
                                gVar.f21459e.playTogether(gVar.f21460f, duration);
                                gVar.f21460f.addListener(new AnimatorListenerAdapter() {
                                    /* class com.bytedance.android.livesdk.share.g.AnonymousClass4 */

                                    static {
                                        Covode.recordClassIndex(12639);
                                    }

                                    public final void onAnimationEnd(Animator animator) {
                                        super.onAnimationEnd(animator);
                                        g.this.d();
                                    }
                                });
                                gVar.f21459e.start();
                            }
                        }
                    }
                });
            }
        }
    }

    @Override // com.bytedance.android.live.p.f
    public final void a(View view, DataChannel dataChannel) {
        this.f21463i = dataChannel;
        this.f21457c = ((Boolean) dataChannel.b(ee.class)).booleanValue();
        this.n = Boolean.TRUE.equals(dataChannel.b(ea.class));
        this.f21458d = (Room) dataChannel.b(df.class);
        this.f21466l = (ImageView) view.findViewById(R.id.enf);
        if (!this.f21457c || !(this.p == i.THIRD_PARTY || this.p == i.SCREEN_RECORD)) {
            f();
        } else {
            this.f21466l.setBackgroundResource(2131234563);
        }
        if (this.n) {
            this.o = (LiveAutoRtlTextView) view.findViewById(R.id.enr);
            dataChannel.b(dl.class, (h.f.a.b) new h(this));
        }
        this.f21455a = false;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.b(cg.class);
        this.q = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SHARE_GUIDE_MESSAGE.getIntType(), this);
            if (this.f21457c && this.p == i.VIDEO) {
                this.q.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.USER_SEQ.getIntType(), this);
            }
        }
        dataChannel.a(ar.class, (h.f.a.b) new i(this));
        boolean isEnable = ShowAudienceDefinitionSelectionSetting.INSTANCE.isEnable();
        if (!this.f21457c && isEnable) {
            if (this.p == i.THIRD_PARTY || this.p == i.SCREEN_RECORD) {
                l.SHARE.setRedDotVisible(dataChannel, !com.bytedance.android.livesdk.ap.a.cP.a().booleanValue());
            }
        }
    }

    public g(e eVar, Context context, i iVar, m mVar) {
        this.f21461g = eVar;
        this.f21462h = context;
        this.p = iVar;
        this.f21464j = mVar;
    }
}
