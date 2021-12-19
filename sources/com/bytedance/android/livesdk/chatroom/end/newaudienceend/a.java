package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.network.e;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.api.EndPageRecommendRetrofitApi;
import com.bytedance.android.livesdk.chatroom.api.c;
import com.bytedance.android.livesdk.chatroom.end.h;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewRecommendView;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.l;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsDaysSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsEnableSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveFinishPagePushTipsMaxSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveNewAudienceFinishPageSetting;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.ad;
import com.bytedance.android.livesdk.utils.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class a extends h implements View.OnClickListener, LiveNewRecommendView.a, l.a, com.bytedance.android.livesdkapi.depend.a.a {
    private View A;
    private LiveTextView B;
    private View C;
    private ImageView D;
    private boolean E;
    private final int F = 1;
    private final int G = 2;
    private final int H = 3;
    private Runnable I = new c(this);

    /* renamed from: a  reason: collision with root package name */
    DataChannel f15462a;

    /* renamed from: b  reason: collision with root package name */
    Handler f15463b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    Room f15464c;

    /* renamed from: i  reason: collision with root package name */
    public Room f15465i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.android.livesdkapi.depend.a.a f15466j;

    /* renamed from: k  reason: collision with root package name */
    public long f15467k = 0;

    /* renamed from: l  reason: collision with root package name */
    LiveTextView f15468l;

    /* renamed from: m  reason: collision with root package name */
    int f15469m = 0;
    public volatile boolean n;
    Runnable o = new b(this);
    private l p;
    private LiveTextView q;
    private ImageView r;
    private HSImageView s;
    private LiveNewRecommendView t;
    private LiveTextView u;
    private ImageView v;
    private View w;
    private LottieAnimationView x;
    private HSAnimImageView y;
    private View z;

    static {
        Covode.recordClassIndex(8538);
    }

    private static boolean k() {
        return ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).getPushLiveState();
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewRecommendView.a
    public final void e() {
        Handler handler = this.f15463b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.a.a
    public final boolean i_() {
        com.bytedance.android.livesdkapi.depend.a.a aVar = this.f15466j;
        if (aVar == null || !aVar.i_()) {
            return false;
        }
        return true;
    }

    private boolean j() {
        return ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).isNotificationEnabled(getContext());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f() {
        this.f15468l.setText(y.a((int) R.string.e1o));
        this.f15463b.removeCallbacksAndMessages(null);
        a(this.f15465i);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h() {
        b.a.a("livesdk_exit_liveroom_click").a(this.f15462a).b();
        d();
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Handler handler = this.f15463b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        l lVar = this.p;
        if (lVar.f15483a != null) {
            lVar.f15483a.removeCallbacks(m.f15491a);
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        Handler handler = this.f15463b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f15468l.setText(y.a((int) R.string.e1o));
    }

    @Override // com.bytedance.android.livesdk.ui.a, com.bytedance.android.livesdk.chatroom.end.h, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.n) {
            Handler handler = this.f15463b;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        this.p.a(this.f15467k);
        i();
    }

    private void i() {
        l lVar = this.p;
        if (lVar != null) {
            long j2 = this.f15467k;
            if (lVar.f15483a != null) {
                WeakHandler weakHandler = lVar.f15483a;
                ((EndPageRecommendRetrofitApi) e.a().a(EndPageRecommendRetrofitApi.class)).getLive(j2).a(new f()).a(new com.bytedance.android.livesdk.chatroom.api.b(weakHandler), new c(weakHandler));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.a
    public final void b() {
        LottieAnimationView lottieAnimationView;
        if (this.v != null && (lottieAnimationView = this.x) != null && this.y != null) {
            lottieAnimationView.setVisibility(8);
            this.y.setVisibility(8);
            this.v.setVisibility(0);
            this.v.setBackgroundResource(2131234659);
            a(false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        if (this.f15465i != null) {
            this.v.setVisibility(8);
            this.y.setVisibility(0);
            com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
            if (aVar == null || !aVar.isMicRoomForRoom(this.f15465i) || !aVar.isMicAudience()) {
                l lVar = this.p;
                Room room = this.f15465i;
                String str = this.f15449g;
                if (room != null) {
                    lVar.f15486d.a(room.getOwner().getId(), room, str, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0071: INVOKE  
                          (wrap: com.bytedance.android.livesdk.chatroom.end.g : 0x0062: IGET  (r4v0 com.bytedance.android.livesdk.chatroom.end.g) = (r3v3 'lVar' com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.d com.bytedance.android.livesdk.chatroom.end.g)
                          (wrap: long : 0x0068: INVOKE  (r5v0 long) = 
                          (wrap: com.bytedance.android.live.base.model.user.User : 0x0064: INVOKE  (r0v4 com.bytedance.android.live.base.model.user.User) = (r7v0 'room' com.bytedance.android.livesdkapi.depend.model.live.Room) type: VIRTUAL call: com.bytedance.android.livesdkapi.depend.model.live.Room.getOwner():com.bytedance.android.live.base.model.user.User)
                         type: VIRTUAL call: com.bytedance.android.live.base.model.user.User.getId():long)
                          (r7v0 'room' com.bytedance.android.livesdkapi.depend.model.live.Room)
                          (r8v0 'str' java.lang.String)
                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$3 : 0x006e: CONSTRUCTOR  (r9v0 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$3) = (r3v3 'lVar' com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.3.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l):void type: CONSTRUCTOR)
                         type: VIRTUAL call: com.bytedance.android.livesdk.chatroom.end.g.a(long, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, com.bytedance.android.livesdk.chatroom.end.g$a):void in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.g():void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006e: CONSTRUCTOR  (r9v0 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$3) = (r3v3 'lVar' com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.3.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.g():void, file: classes6.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 29 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 35 more
                        */
                    /*
                    // Method dump skipped, instructions count: 117
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.g():void");
                }

                public final void b(int i2) {
                    int i3 = 2131234498;
                    if (i2 == 1) {
                        i3 = 2131234499;
                    } else if (i2 != 2 && i2 == 3) {
                        i3 = 2131234500;
                    }
                    ImageView imageView = this.D;
                    if (imageView != null) {
                        imageView.setBackgroundResource(i3);
                    }
                }

                @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
                public final void onCreate(Bundle bundle) {
                    super.onCreate(bundle);
                    this.f15462a = com.bytedance.ies.sdk.datachannel.f.a(this);
                    l lVar = new l(this);
                    this.p = lVar;
                    lVar.f15485c = this.f15466j;
                }

                @Override // androidx.fragment.app.Fragment
                public final void setUserVisibleHint(boolean z2) {
                    super.setUserVisibleHint(z2);
                    if (!z2) {
                        Handler handler = this.f15463b;
                        if (handler != null) {
                            handler.removeCallbacksAndMessages(null);
                        }
                        LiveTextView liveTextView = this.f15468l;
                        if (liveTextView != null) {
                            liveTextView.setText(y.a((int) R.string.e1o));
                        }
                    } else if (!this.n) {
                        l lVar = this.p;
                        if (lVar != null) {
                            lVar.a(this.f15467k);
                        }
                        i();
                    }
                }

                @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.a
                public final void c(Room room) {
                    if (room != null && this.v != null && this.x != null && this.y != null) {
                        if (room.getOwner() == null || room.getOwner().getFollowInfo().getFollowStatus() == 1 || room.getOwner().getFollowInfo().getFollowStatus() == 2) {
                            this.v.setVisibility(8);
                        } else {
                            this.v.setVisibility(0);
                        }
                        this.x.setVisibility(8);
                        this.y.setVisibility(8);
                    }
                }

                private void a(boolean z2) {
                    int intValue;
                    String str;
                    this.A.setVisibility(8);
                    this.C.setVisibility(8);
                    if (LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue()) {
                        if (z2) {
                            this.C.setVisibility(0);
                            if (!j() || !k()) {
                                this.D.setBackgroundResource(2131234500);
                            }
                        }
                        if (!this.E) {
                            if (System.currentTimeMillis() - com.bytedance.android.livesdk.ap.a.cB.a().longValue() < ((long) (LiveFinishPagePushTipsDaysSetting.INSTANCE.getValue() * 24 * 60 * 60 * 1000)) || (intValue = com.bytedance.android.livesdk.ap.a.cC.a().intValue()) > LiveFinishPagePushTipsMaxSetting.INSTANCE.getValue()) {
                                return;
                            }
                            if (!j() || !k()) {
                                this.A.setVisibility(0);
                                com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.cB, Long.valueOf(System.currentTimeMillis()));
                                com.bytedance.android.livesdk.ap.c.a(com.bytedance.android.livesdk.ap.a.cC, Integer.valueOf(intValue + 1));
                                Room room = this.f15465i;
                                String str2 = "-1";
                                if (room == null || room.getOwner() == null) {
                                    str = str2;
                                } else {
                                    str = String.valueOf(this.f15465i.getOwner().getId());
                                }
                                Room room2 = this.f15465i;
                                if (room2 != null) {
                                    str2 = String.valueOf(room2.getId());
                                }
                                b.a.a("livesdk_notification_setting_alert_show").a("enter_from_merge", "live_end").a("room_id", str2).a("anchor_id", str).b();
                            }
                        }
                    }
                }

                @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.a
                public final void a(List<Room> list) {
                    boolean z2;
                    Room room;
                    if (this.q != null && this.t != null && this.w != null) {
                        if (n.c(getContext(), ((float) n.b(getContext())) - this.q.getY()) < 549) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (n.c(getContext(), ((float) n.b(getContext())) - this.q.getY()) >= 349) {
                            LiveNewRecommendView liveNewRecommendView = this.t;
                            if (list != null) {
                                if (!(list.size() == 0 || liveNewRecommendView.f15458c == null || liveNewRecommendView.f15458c.size() != 4)) {
                                    if (list.size() <= 3 && list.size() >= 2) {
                                        liveNewRecommendView.a(list, 2);
                                    } else if (list.size() > 3) {
                                        if (z2) {
                                            liveNewRecommendView.a(list, 2);
                                        } else {
                                            liveNewRecommendView.a(list, 4);
                                            liveNewRecommendView.f15460e.setVisibility(0);
                                        }
                                    }
                                }
                                if (list.size() > 1 && this.f15463b != null) {
                                    this.w.setVisibility(0);
                                    if (LiveNewAudienceFinishPageSetting.INSTANCE.getValue().enableCountDown == 1) {
                                        int i2 = LiveNewAudienceFinishPageSetting.INSTANCE.getValue().timeJumpRoom;
                                        this.f15469m = i2;
                                        this.f15469m = i2 + 1;
                                        this.f15464c = list.get(0);
                                        if ((!LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue() || this.f15450h == null || !this.f15450h.toLowerCase(Locale.US).contains("push") || (room = this.f15465i) == null || room.getOwner() == null || !this.f15465i.getOwner().isFollowing()) && !this.n) {
                                            this.f15463b.removeCallbacksAndMessages(null);
                                            this.f15463b.postDelayed(this.I, (long) (LiveNewAudienceFinishPageSetting.INSTANCE.getValue().timeCountDown * 1000));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
                    r4 = r0.getOwner();
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onClick(android.view.View r19) {
                    /*
                    // Method dump skipped, instructions count: 275
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.onClick(android.view.View):void");
                }

                @Override // com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.a
                public final void b(Room room) {
                    int i2;
                    View view;
                    boolean z2;
                    User user;
                    String str;
                    String str2;
                    String string;
                    ImageModel imageModel;
                    if (isAdded()) {
                        this.f15465i = room;
                        if (room == null || room.getStats() == null) {
                            i2 = 0;
                        } else {
                            i2 = room.getStats().replayViewers;
                        }
                        String str3 = ad.a((long) i2) + " " + y.a((int) R.string.gny);
                        LiveTextView liveTextView = this.u;
                        if (liveTextView != null) {
                            liveTextView.setText(str3);
                        }
                        if (this.r != null && this.s != null && (view = this.z) != null) {
                            view.setVisibility(8);
                            com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                            if (aVar == null || !aVar.isMicRoomForRoom(this.f15465i) || !aVar.isMicAudienceForRoom(this.f15465i)) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            Room room2 = this.f15465i;
                            ImageModel imageModel2 = null;
                            if (room2 != null) {
                                user = room2.getOwner();
                                if (!(user == null || this.f15463b == null || this.f15468l == null)) {
                                    if (z2) {
                                        Room room3 = this.f15465i;
                                        if (room3 == null || room3.officialChannelInfo == null || this.f15465i.officialChannelInfo.f18978a == null) {
                                            imageModel = null;
                                        } else {
                                            imageModel = this.f15465i.officialChannelInfo.f18978a.getAvatarMedium();
                                        }
                                        g.a(this.r, imageModel, 2131234621);
                                    } else {
                                        g.a(this.r, user.getAvatarMedium(), 2131234621);
                                    }
                                    this.r.setOnClickListener(new f(this));
                                    if (this.q != null) {
                                        Room room4 = this.f15465i;
                                        if (room4 == null || room4.officialChannelInfo == null || this.f15465i.officialChannelInfo.f18978a == null) {
                                            str2 = "";
                                        } else {
                                            str2 = this.f15465i.officialChannelInfo.f18978a.displayId;
                                        }
                                        if (z2) {
                                            this.q.setText(str2);
                                            string = getString(R.string.e32, str2);
                                        } else {
                                            this.q.setText(user.displayId);
                                            string = getString(R.string.e32, user.displayId);
                                        }
                                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                                        int length = spannableStringBuilder.length();
                                        spannableStringBuilder.append((CharSequence) (" " + getString(R.string.e33)));
                                        com.bytedance.android.live.design.widget.c.a(getContext(), spannableStringBuilder, 0, length, 3, 400);
                                        int i3 = length + 1;
                                        com.bytedance.android.live.design.widget.c.a(getContext(), spannableStringBuilder, i3, spannableStringBuilder.length(), 3, 600);
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.android.live.design.b.a(this.B, (int) R.attr.am5)), i3, spannableStringBuilder.length(), 33);
                                        this.B.setText(spannableStringBuilder);
                                    }
                                }
                            } else {
                                user = null;
                            }
                            float a2 = ((float) n.a(getContext())) / ((float) n.b(getContext()));
                            if (user != null) {
                                if (z2) {
                                    Room room5 = this.f15465i;
                                    if (!(room5 == null || room5.officialChannelInfo == null || this.f15465i.officialChannelInfo.f18978a == null)) {
                                        imageModel2 = this.f15465i.officialChannelInfo.f18978a.getAvatarLarge();
                                    }
                                    k.a(this.s, imageModel2, new z(8, a2));
                                } else {
                                    k.a(this.s, user.getAvatarLarge(), new z(8, a2));
                                }
                            }
                            Room room6 = this.f15465i;
                            if (!(room6 == null || this.v == null || this.x == null || this.y == null || room6.getOwner().getFollowInfo().getFollowStatus() == 1 || this.f15465i.getOwner().getFollowInfo().getFollowStatus() == 2)) {
                                this.v.setVisibility(0);
                                this.x.setVisibility(8);
                                this.y.setVisibility(8);
                            }
                            if (LiveFinishPagePushTipsEnableSetting.INSTANCE.getValue()) {
                                if (!(user == null || user.getFollowInfo() == null)) {
                                    if (user.getFollowInfo().getFollowStatus() == 1 || user.getFollowInfo().getFollowStatus() == 2) {
                                        a(true);
                                    } else {
                                        a(false);
                                    }
                                }
                                if (this.p != null && user != null) {
                                    HashMap<String, String> hashMap = new HashMap<>();
                                    hashMap.put("target_uid", String.valueOf(user.getId()));
                                    hashMap.put("sec_target_uid", u.a().b().a(user.getId()));
                                    hashMap.put("packed_level", "2");
                                    hashMap.put("current_room_id", String.valueOf(this.f15465i.getId()));
                                    hashMap.put("request_from", "live_push_settings");
                                    if (this.f15465i.getOwner() != null) {
                                        str = String.valueOf(this.f15465i.getOwner().getId());
                                    } else {
                                        str = "0";
                                    }
                                    hashMap.put("anchor_id", str);
                                    hashMap.put("sec_anchor_id", u.a().b().a(this.f15465i.getOwnerUserId()));
                                    u.a().b().a(hashMap).a_(
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0278: INVOKE  
                                          (wrap: f.a.ab<com.bytedance.android.live.base.model.user.User> : 0x026f: INVOKE  (r1v15 f.a.ab<com.bytedance.android.live.base.model.user.User>) = 
                                          (wrap: com.bytedance.android.livesdk.at.f : 0x026b: INVOKE  (r0v39 com.bytedance.android.livesdk.at.f) = 
                                          (wrap: com.bytedance.android.livesdk.userservice.u : 0x0267: INVOKE  (r0v38 com.bytedance.android.livesdk.userservice.u) =  type: STATIC call: com.bytedance.android.livesdk.userservice.u.a():com.bytedance.android.livesdk.userservice.u)
                                         type: VIRTUAL call: com.bytedance.android.livesdk.userservice.u.b():com.bytedance.android.livesdk.at.f)
                                          (r4v1 'hashMap' java.util.HashMap<java.lang.String, java.lang.String>)
                                         type: INTERFACE call: com.bytedance.android.livesdk.at.f.a(java.util.HashMap):f.a.ab)
                                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2 : 0x0275: CONSTRUCTOR  (r0v40 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2) = 
                                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l : 0x0260: IGET  (r3v1 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.p com.bytedance.android.livesdk.chatroom.end.newaudienceend.l)
                                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1 : 0x0264: CONSTRUCTOR  (r2v6 com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.1.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.a):void type: CONSTRUCTOR)
                                         call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.2.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$b):void type: CONSTRUCTOR)
                                         type: VIRTUAL call: f.a.ab.a_(f.a.ae):void in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.b(com.bytedance.android.livesdkapi.depend.model.live.Room):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0275: CONSTRUCTOR  (r0v40 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$2) = 
                                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l : 0x0260: IGET  (r3v1 com.bytedance.android.livesdk.chatroom.end.newaudienceend.l) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.p com.bytedance.android.livesdk.chatroom.end.newaudienceend.l)
                                          (wrap: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1 : 0x0264: CONSTRUCTOR  (r2v6 com.bytedance.android.livesdk.chatroom.end.newaudienceend.a$1) = (r22v0 'this' com.bytedance.android.livesdk.chatroom.end.newaudienceend.a A[IMMUTABLE_TYPE, THIS]) call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.1.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.a):void type: CONSTRUCTOR)
                                         call: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l.2.<init>(com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, com.bytedance.android.livesdk.chatroom.end.newaudienceend.l$b):void type: CONSTRUCTOR in method: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.b(com.bytedance.android.livesdkapi.depend.model.live.Room):void, file: classes6.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                                        	... 42 more
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.livesdk.chatroom.end.newaudienceend.l, state: GENERATED_AND_UNLOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                                        	... 48 more
                                        */
                                    /*
                                    // Method dump skipped, instructions count: 712
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.end.newaudienceend.a.b(com.bytedance.android.livesdkapi.depend.model.live.Room):void");
                                }

                                @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
                                public final void onViewCreated(View view, Bundle bundle) {
                                    super.onViewCreated(view, bundle);
                                    View a2 = a(R.id.ci9);
                                    this.z = a2;
                                    a2.setVisibility(0);
                                    this.q = (LiveTextView) a(R.id.jy);
                                    this.r = (ImageView) a(R.id.jk);
                                    this.s = (HSImageView) a(R.id.qr);
                                    LiveNewRecommendView liveNewRecommendView = (LiveNewRecommendView) a(R.id.din);
                                    this.t = liveNewRecommendView;
                                    if (liveNewRecommendView != null) {
                                        liveNewRecommendView.setDataChannel(this.f15462a);
                                        this.t.setIView(this);
                                    }
                                    this.u = (LiveTextView) a(R.id.dmw);
                                    this.w = a(R.id.cwk);
                                    this.f15468l = (LiveTextView) a(R.id.cwp);
                                    a(R.id.ah9).setOnClickListener(new d(this));
                                    this.v = (ImageView) a(R.id.b7n);
                                    this.x = (LottieAnimationView) a(R.id.b7d);
                                    HSAnimImageView hSAnimImageView = (HSAnimImageView) a(R.id.b7e);
                                    this.y = hSAnimImageView;
                                    hSAnimImageView.a(HSAnimImageView.a("tiktok_live_watch_resource", "ttlive_anim_follow_success.webp"));
                                    ImageView imageView = this.v;
                                    if (!(imageView == null || this.x == null)) {
                                        imageView.setOnClickListener(new e(this));
                                    }
                                    this.C = a(R.id.cxy);
                                    this.D = (ImageView) a(R.id.cxz);
                                    this.A = a(R.id.ee4);
                                    this.B = (LiveTextView) a(R.id.ee7);
                                    this.C.setOnClickListener(this);
                                    this.A.setOnClickListener(this);
                                    com.bytedance.android.live.liveinteract.api.a.c.a().a((Integer) 0);
                                    b.a.a("livesdk_finish_show").a().b();
                                }

                                @Override // androidx.fragment.app.Fragment
                                public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
                                    return com.a.a(LayoutInflater.from(getContext()), R.layout.b94, viewGroup, false);
                                }
                            }
