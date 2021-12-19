package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.s;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.f.a;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.n.aa;
import com.bytedance.android.live.n.ae;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.at.e;
import com.bytedance.android.livesdk.at.g;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.like.b;
import com.bytedance.android.livesdk.like.d;
import com.bytedance.android.livesdk.livesetting.other.LiveAnchorInfoAbtestSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveAnchorShareCountShowSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveLikeFirstShowTimeSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRoomUserInfoIconSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRoomUserInfoLanguageSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShareCountShowSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveShareShowTimeSetting;
import com.bytedance.android.livesdk.model.message.ai;
import com.bytedance.android.livesdk.model.message.ce;
import com.bytedance.android.livesdk.subscribe.SubscribeApi;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.ies.xbridge.e.c;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class LiveRoomUserInfoWidget extends RoomRecycleWidget implements a.AbstractC0151a, d, WeakHandler.IHandler, com.bytedance.ies.xbridge.e.d, au, OnMessageListener {
    private static final String B = LiveRoomUserInfoWidget.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public static final int f21928a = LiveLikeFirstShowTimeSetting.INSTANCE.getValue();

    /* renamed from: b  reason: collision with root package name */
    public static final int f21929b = LiveShareShowTimeSetting.INSTANCE.getValue();
    public a A;
    private final int C = LiveRoomUserInfoIconSetting.INSTANCE.getValue();
    private boolean D = false;
    private HSImageView E;
    private LiveTextView F;
    private View G;
    private TextView H;
    private ImageView I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long N;
    private AnimatorSet O;
    private AnimatorSet P;
    private String Q;
    private e R;
    private WeakHandler S;
    private UserInfoLikeHelper T;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f21930c;

    /* renamed from: d  reason: collision with root package name */
    VHeadView f21931d;

    /* renamed from: e  reason: collision with root package name */
    View f21932e;

    /* renamed from: f  reason: collision with root package name */
    TextView f21933f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f21934g;

    /* renamed from: h  reason: collision with root package name */
    public TextView f21935h;

    /* renamed from: i  reason: collision with root package name */
    public TextView f21936i;

    /* renamed from: j  reason: collision with root package name */
    View f21937j;

    /* renamed from: k  reason: collision with root package name */
    public ViewGroup f21938k;

    /* renamed from: l  reason: collision with root package name */
    View f21939l;

    /* renamed from: m  reason: collision with root package name */
    public HSAnimImageView f21940m;
    public ImageView n;
    public TextView o;
    public final f.a.b.a p = new f.a.b.a();
    Room q;
    User r;
    boolean s;
    boolean t = true;
    boolean u = false;
    boolean v = false;
    long w = -1;
    ValueAnimator x;
    AnimatorSet y;
    com.bytedance.android.live.j.a z;

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(b bVar, int i2) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.xbridge.e.d
    public final void a(c cVar) {
        if (cVar.f35926a.equals("js_event_report_log_live_follow")) {
            Map<String, String> map = null;
            try {
                map = (Map) cVar.f35927b.b().get("log_params");
            } catch (Exception unused) {
            }
            a("follow_discount_popup", map);
        }
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar, boolean z2) {
        if (isViewValid()) {
            com.bytedance.android.live.j.a aVar2 = this.z;
            if (aVar2 == null || !aVar2.isMicRoomForCurrentRoom()) {
                Room room = (Room) this.dataChannel.b(df.class);
                room.getOwner().setFollowStatus(aVar.a());
                this.dataChannel.b(df.class, room);
            } else {
                Room room2 = (Room) this.dataChannel.b(df.class);
                if (room2 != null) {
                    room2.officialChannelInfo.f18978a.setFollowStatus(aVar.a());
                }
                this.dataChannel.b(df.class, room2);
            }
            if (aVar.a() == 0) {
                a(a.UNFOLLOW);
            } else if (!s.b(this.dataChannel)) {
                a(a.FOLLOWED);
            } else if (z2) {
                a(a.FOLLOW_ANIM);
            }
            this.dataChannel.c(com.bytedance.android.live.n.c.class, Integer.valueOf(aVar.a()));
        }
    }

    public final void a(a aVar) {
        while (this.A != aVar) {
            if (aVar != a.FOLLOW_ANIM || this.A == a.UNFOLLOW) {
                this.A = aVar;
                f();
                g();
                n.a(this.f21938k, 8);
                n.a(this.f21939l, 8);
                n.a(this.f21940m, 8);
                n.a(this.n, 8);
                n.a(this.I, 8);
                n.a(this.o, 8);
                int i2 = AnonymousClass5.f21950a[aVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        n.a(this.f21938k, 0);
                        n.a(this.f21939l, 0);
                        e();
                        return;
                    } else if (i2 == 3) {
                        n.a(this.f21938k, 0);
                        n.a(this.n, 0);
                        i();
                        h();
                        return;
                    } else if (i2 == 4) {
                        n.a(this.f21938k, 0);
                        n.a(this.I, 0);
                        com.bytedance.android.live.core.f.a.a a2 = com.bytedance.android.live.core.f.a.a.a(this.I.getContext()).a(ImageView.ScaleType.CENTER_INSIDE);
                        a2.f9019d = l();
                        a2.a(this.I);
                        j();
                        return;
                    } else if (!k()) {
                        n.a(this.f21938k, 8);
                        return;
                    } else if (b()) {
                        aVar = a.SUBSCRIBED;
                    } else {
                        aVar = a.UNSUBSCRIBE;
                    }
                } else if (!k() || !b()) {
                    n.a(this.f21938k, 0);
                    n.a(this.f21939l, 0);
                    return;
                } else {
                    aVar = a.SUBSCRIBED;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z c() {
        o();
        return z.f158842a;
    }

    private static boolean d() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private void o() {
        if (this.f21939l.getVisibility() == 0) {
            a();
        }
    }

    static {
        Covode.recordClassIndex(12908);
    }

    private void g() {
        ViewGroup.LayoutParams layoutParams = this.f21938k.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).p = R.id.csf;
        }
        this.f21938k.setLayoutParams(layoutParams);
        n.a(this.f21937j, 8);
    }

    private boolean n() {
        int value;
        if (this.s) {
            value = LiveAnchorShareCountShowSetting.INSTANCE.getValue();
        } else {
            value = LiveShareCountShowSetting.INSTANCE.getValue();
        }
        if (value == 1) {
            return true;
        }
        return false;
    }

    private int q() {
        if (this.M == 0) {
            this.M = findViewById(R.id.cwa).getHeight();
        }
        return this.M;
    }

    private void f() {
        HSAnimImageView hSAnimImageView = this.f21940m;
        if (hSAnimImageView != null && hSAnimImageView.c()) {
            this.f21940m.b();
        }
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.x.cancel();
        }
        AnimatorSet animatorSet = this.y;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.y.cancel();
        }
    }

    private boolean k() {
        Room room;
        if (this.s || (room = this.q) == null || room.getOwner() == null || this.q.getOwner().getSubscribeInfo() == null || !this.q.getOwner().getSubscribeInfo().isAnchorQualified()) {
            return false;
        }
        return true;
    }

    private ImageModel l() {
        Room room = this.q;
        if (room == null || room.getOwner() == null || this.q.getOwner().getSubscribeInfo() == null || this.q.getOwner().getSubscribeInfo().getSubscribeBadge() == null) {
            return null;
        }
        return this.q.getOwner().getSubscribeInfo().getSubscribeBadge().getOriginImage();
    }

    public final boolean b() {
        Room room;
        if (this.s || (room = this.q) == null || room.getOwner() == null || this.q.getOwner().getSubscribeInfo() == null || !this.q.getOwner().isSubscribed()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (((Boolean) this.dataChannel.b(ee.class)).booleanValue()) {
            if (this.C == 0) {
                return R.layout.bcp;
            }
            return R.layout.bcs;
        } else if (this.C == 0) {
            return R.layout.bcq;
        } else {
            return R.layout.bcr;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$5  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f21950a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 12917(0x3275, float:1.81E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a[] r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.f21950a = r2
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.UNFOLLOW     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.f21950a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.FOLLOW_ANIM     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.f21950a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.UNSUBSCRIBE     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.f21950a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.SUBSCRIBED     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.f21950a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget$a r0 = com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.a.FOLLOWED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass5.<clinit>():void");
        }
    }

    public enum a {
        UNFOLLOW,
        FOLLOW_ANIM,
        FOLLOWED,
        UNSUBSCRIBE,
        SUBSCRIBED;

        static {
            Covode.recordClassIndex(12922);
        }
    }

    private void e() {
        n.a(this.f21939l, 4);
        n.a(this.f21940m, 0);
        HSAnimImageView hSAnimImageView = this.f21940m;
        if (hSAnimImageView != null && !hSAnimImageView.c()) {
            if (!k() || b()) {
                this.f21940m.a(HSAnimImageView.a("tiktok_live_basic_resource", a.a()));
                this.f21940m.a(new com.facebook.fresco.animation.c.c() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass9 */

                    static {
                        Covode.recordClassIndex(12921);
                    }

                    @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                    public final void b(com.facebook.fresco.animation.c.a aVar) {
                        n.a(LiveRoomUserInfoWidget.this.f21940m, 8);
                        if (LiveRoomUserInfoWidget.this.b()) {
                            LiveRoomUserInfoWidget.this.a(a.SUBSCRIBED);
                            return;
                        }
                        LiveRoomUserInfoWidget liveRoomUserInfoWidget = LiveRoomUserInfoWidget.this;
                        GradientDrawable gradientDrawable = (GradientDrawable) liveRoomUserInfoWidget.f21938k.getBackground();
                        int measuredWidth = liveRoomUserInfoWidget.f21938k.getMeasuredWidth();
                        int measuredHeight = liveRoomUserInfoWidget.f21938k.getMeasuredHeight();
                        liveRoomUserInfoWidget.x = ValueAnimator.ofFloat(1.0f, 0.0f);
                        liveRoomUserInfoWidget.x.addUpdateListener(new o(liveRoomUserInfoWidget, measuredWidth, measuredHeight, gradientDrawable));
                        liveRoomUserInfoWidget.x.addListener(new AnimatorListenerAdapter(gradientDrawable) {
                            /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass10 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ GradientDrawable f21942a;

                            static {
                                Covode.recordClassIndex(12910);
                            }

                            public final void onAnimationEnd(Animator animator) {
                                ViewGroup.LayoutParams layoutParams = LiveRoomUserInfoWidget.this.f21938k.getLayoutParams();
                                layoutParams.width = -2;
                                layoutParams.height = -2;
                                LiveRoomUserInfoWidget.this.f21938k.setLayoutParams(layoutParams);
                                GradientDrawable gradientDrawable = this.f21942a;
                                if (gradientDrawable != null) {
                                    gradientDrawable.setCornerRadius((float) y.a(13.5f));
                                }
                                LiveRoomUserInfoWidget.this.a(a.FOLLOWED);
                            }

                            {
                                this.f21942a = r2;
                            }
                        });
                        liveRoomUserInfoWidget.x.setDuration(200L);
                        liveRoomUserInfoWidget.x.start();
                    }
                });
            } else {
                this.f21940m.a(HSAnimImageView.a("tiktok_live_basic_resource", "ttlive_user_info_follow_complete2.webp"));
                this.f21940m.a(new com.facebook.fresco.animation.c.c() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass8 */

                    static {
                        Covode.recordClassIndex(12920);
                    }

                    @Override // com.facebook.fresco.animation.c.b, com.facebook.fresco.animation.c.c
                    public final void b(com.facebook.fresco.animation.c.a aVar) {
                        LiveRoomUserInfoWidget liveRoomUserInfoWidget = LiveRoomUserInfoWidget.this;
                        if (liveRoomUserInfoWidget.getView() != null && liveRoomUserInfoWidget.A == a.FOLLOW_ANIM) {
                            n.a(liveRoomUserInfoWidget.f21937j, 0);
                            ViewGroup.LayoutParams layoutParams = liveRoomUserInfoWidget.f21938k.getLayoutParams();
                            if (layoutParams instanceof ConstraintLayout.a) {
                                ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
                                aVar2.p = R.id.bex;
                                aVar2.setMarginStart(y.a(6.0f));
                            }
                            liveRoomUserInfoWidget.f21938k.setLayoutParams(layoutParams);
                            ChangeBounds changeBounds = new ChangeBounds();
                            changeBounds.setDuration(200);
                            TransitionManager.beginDelayedTransition((ViewGroup) liveRoomUserInfoWidget.getView(), changeBounds);
                            n.a(liveRoomUserInfoWidget.f21939l, 8);
                            n.a(liveRoomUserInfoWidget.n, 4);
                            n.a(liveRoomUserInfoWidget.o, 4);
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) liveRoomUserInfoWidget.n.getLayoutParams();
                            layoutParams2.setMarginStart(y.a(-6.0f));
                            liveRoomUserInfoWidget.n.setLayoutParams(layoutParams2);
                            ObjectAnimator duration = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f21932e, View.ALPHA, 1.0f, 0.2f).setDuration(200L);
                            ObjectAnimator duration2 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f21940m, View.ALPHA, 1.0f, 0.0f).setDuration(200L);
                            duration2.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass11 */

                                static {
                                    Covode.recordClassIndex(12911);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    n.a(LiveRoomUserInfoWidget.this.f21940m, 8);
                                    LiveRoomUserInfoWidget.this.f21940m.setAlpha(1.0f);
                                }
                            });
                            ObjectAnimator duration3 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.n, View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
                            duration3.setInterpolator(androidx.core.h.b.b.a(0.17f, 0.89f, 0.32f, 1.77f));
                            duration3.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass12 */

                                static {
                                    Covode.recordClassIndex(12912);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    n.a(LiveRoomUserInfoWidget.this.n, 0);
                                }
                            });
                            duration3.setStartDelay(200);
                            ObjectAnimator duration4 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.n, View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
                            duration4.setInterpolator(androidx.core.h.b.b.a(0.17f, 0.89f, 0.32f, 1.77f));
                            duration4.setStartDelay(200);
                            ObjectAnimator duration5 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.o, View.ALPHA, 0.0f, 1.0f).setDuration(150L);
                            duration5.setStartDelay(200);
                            duration5.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass13 */

                                static {
                                    Covode.recordClassIndex(12913);
                                }

                                public final void onAnimationStart(Animator animator) {
                                    n.a(LiveRoomUserInfoWidget.this.o, 0);
                                }
                            });
                            ObjectAnimator duration6 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.o, View.ALPHA, 1.0f, 0.0f).setDuration(150L);
                            duration6.setStartDelay(3200);
                            duration6.addListener(new AnimatorListenerAdapter() {
                                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(12914);
                                }

                                public final void onAnimationEnd(Animator animator) {
                                    if (LiveRoomUserInfoWidget.this.getView() != null) {
                                        ChangeBounds changeBounds = new ChangeBounds();
                                        changeBounds.setDuration(200);
                                        TransitionManager.beginDelayedTransition((ViewGroup) LiveRoomUserInfoWidget.this.getView(), changeBounds);
                                        n.a(LiveRoomUserInfoWidget.this.o, 8);
                                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) LiveRoomUserInfoWidget.this.n.getLayoutParams();
                                        layoutParams.setMarginStart(0);
                                        LiveRoomUserInfoWidget.this.n.setLayoutParams(layoutParams);
                                        LiveRoomUserInfoWidget.this.p.a(t.b((Object) 1).e(200, TimeUnit.MILLISECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((f.a.d.f) new y(this)).g());
                                    }
                                }
                            });
                            ObjectAnimator duration7 = ObjectAnimator.ofFloat(liveRoomUserInfoWidget.f21932e, View.ALPHA, 0.2f, 1.0f).setDuration(200L);
                            duration7.setStartDelay(3350);
                            liveRoomUserInfoWidget.y = new AnimatorSet();
                            liveRoomUserInfoWidget.y.playTogether(duration, duration2, duration3, duration4, duration5, duration6, duration7);
                            liveRoomUserInfoWidget.y.start();
                        }
                    }
                });
            }
            this.f21940m.a();
        }
    }

    private void h() {
        this.p.a(((SubscribeApi) com.bytedance.android.live.network.e.a().a(SubscribeApi.class)).getSubPrivilegeDetail(this.q.getIdStr(), u.a().b().a(this.q.getOwner().getId())).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new p(this), q.f21982a));
    }

    private void i() {
        Room room = this.q;
        if (room != null && room.getOwner() != null && this.q.getOwner().getSubscribeInfo() != null) {
            b.a.a("livesdk_subscribe_icon_show").a("anchor_id", this.q.getOwnerUserId()).a("room_id", this.q.getId()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).a("action_type", "click").a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("video_id", com.bytedance.android.livesdk.ab.e.f()).a("show_entrance", "live_left_corner").b();
        }
    }

    private void j() {
        Room room = this.q;
        if (room != null && room.getOwner() != null && this.q.getOwner().getSubscribeInfo() != null) {
            b.a.a("livesdk_privilege_badge_show").a("anchor_id", this.q.getOwnerUserId()).a("room_id", this.q.getId()).a("enter_from_merge", com.bytedance.android.livesdk.ab.e.a()).a("enter_method", com.bytedance.android.livesdk.ab.e.d()).a("action_type", "click").a("request_id", com.bytedance.android.livesdk.ab.e.k()).a("video_id", com.bytedance.android.livesdk.ab.e.f()).a("show_entrance", "live_left_corner").b();
        }
    }

    private void m() {
        if (!n()) {
            n.a(this.f21936i, 8);
            Room room = this.q;
            if (room != null) {
                long anchorTabType = room.getAnchorTabType();
                if (anchorTabType == 3) {
                    n.a(this.f21936i, 0);
                } else if (anchorTabType == 4) {
                    n.a(this.f21936i, 8);
                } else if (!this.s) {
                    this.f21936i.setVisibility(0);
                }
            } else if (!this.s) {
                n.a(this.f21936i, 0);
            }
        }
    }

    private void p() {
        AnimatorSet animatorSet = this.O;
        if (animatorSet == null || !animatorSet.isRunning()) {
            int q2 = q();
            this.f21935h.setVisibility(0);
            this.f21936i.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21935h, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21935h, "translationY", (float) q2, 0.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21936i, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21936i, "translationY", 0.0f, (float) (-q2));
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.O = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.O.setDuration(200L);
            this.O.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(12915);
                }

                public final void onAnimationEnd(Animator animator) {
                    LiveRoomUserInfoWidget.this.f21936i.setVisibility(4);
                }
            });
            this.O.start();
            this.N = System.currentTimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IMessageManager iMessageManager;
        com.bytedance.android.livesdk.like.b likeHelper;
        this.v = false;
        this.dataChannel.b(this);
        com.bytedance.ies.xbridge.e.b.b("js_event_report_log_live_follow", this);
        this.p.a();
        p.c(getView());
        this.J = 0;
        this.u = false;
        this.r = null;
        WeakHandler weakHandler = this.S;
        if (weakHandler != null) {
            weakHandler.removeCallbacksAndMessages(null);
        }
        if (this.q != null && (likeHelper = ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeHelper(this.q.getId())) != null && likeHelper.n() && likeHelper.l()) {
            likeHelper.b(this.T);
            likeHelper.b(this);
            likeHelper.a((View) null);
        }
        if (!(this.dataChannel == null || (iMessageManager = (IMessageManager) this.dataChannel.b(cg.class)) == null)) {
            iMessageManager.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
        }
        this.R = null;
        IMessageManager iMessageManager2 = (IMessageManager) this.dataChannel.b(cg.class);
        if (iMessageManager2 != null) {
            iMessageManager2.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
            iMessageManager2.removeMessageListener(com.bytedance.android.livesdk.model.message.a.a.USER_SEQ.getIntType(), this);
        }
        f();
        AnimatorSet animatorSet = this.O;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.O.cancel();
        }
        AnimatorSet animatorSet2 = this.P;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            this.P.cancel();
        }
        ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).xClearStorageItem(this.context, "user_subscribe_entry_info");
    }

    public final void a() {
        com.bytedance.android.live.j.a aVar;
        Room room;
        if (isViewValid()) {
            if (this.R != null) {
                if (!j.f107226e || !j.b() || j.c()) {
                    j.f107226e = d();
                }
                if (!j.f107226e) {
                    ao.a(y.e(), (int) R.string.efp);
                    return;
                }
            }
            if (!u.a().b().e()) {
                Bundle bundle = new Bundle();
                bundle.putString("enter_from", "live_detail");
                bundle.putString("action_type", "follow");
                bundle.putString("source", "live");
                bundle.putString("v1_source", "follow");
                this.u = true;
                com.bytedance.android.livesdk.at.f b2 = u.a().b();
                Context context = this.context;
                j.a a2 = com.bytedance.android.livesdk.at.j.a();
                a2.f14158a = com.bytedance.android.livesdk.ao.a.a();
                a2.f14159b = com.bytedance.android.livesdk.ao.a.b();
                a2.f14162e = "live_detail";
                a2.f14163f = "follow";
                a2.f14161d = "live";
                a2.f14160c = 1;
                b2.a(context, a2.a()).b(new g());
                return;
            }
            if (this.R != null) {
                ((IHostApp) com.bytedance.android.live.t.a.a(IHostApp.class)).checkAndShowGuide(this.R, "live", this.context.getResources().getString(R.string.gxs));
            }
            User owner = this.q.getOwner();
            if (!(this.s || (aVar = this.z) == null || !aVar.isMicRoomForCurrentRoom() || (room = this.q) == null || room.officialChannelInfo == null)) {
                owner = this.q.officialChannelInfo.f18978a;
            }
            if (com.bytedance.android.livesdk.utils.a.a(this.dataChannel) && this.q.author() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("refer", "follow_button");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("anchor_id", String.valueOf(this.q.author().getId()));
                hashMap2.put("room_id", String.valueOf(this.q.getId()));
                com.bytedance.android.livesdk.utils.a.a("live_ad", "follow", hashMap, hashMap2);
            }
            if (this.R != null) {
                u.a().b().a(((e.a) ((e.a) ((e.a) ((e.a) ((d.a) new e.b().a(owner.getId())).a(this.q.getRequestId()).b(this.Q).c("live").b(this.q.getId()).d(this.q.getLabels())).a(this.R)).e("live_detail")).f("follow")).c()).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(getAutoUnbindTransformer()).b(new f.a.z<com.bytedance.android.livesdkapi.depend.model.b.a>() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(12918);
                    }

                    @Override // f.a.z
                    public final void onComplete() {
                    }

                    @Override // f.a.z
                    public final void onSubscribe(f.a.b.b bVar) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // f.a.z
                    public final /* synthetic */ void onNext(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
                        LiveRoomUserInfoWidget.this.a(aVar, false);
                    }

                    @Override // f.a.z
                    public final void onError(Throwable th) {
                        if (LiveRoomUserInfoWidget.this.isViewValid()) {
                            LiveRoomUserInfoWidget.this.a(a.UNFOLLOW);
                            com.bytedance.android.livesdk.utils.f.a(LiveRoomUserInfoWidget.this.context, th);
                        }
                    }
                });
            }
            if (s.b(this.dataChannel)) {
                a(a.FOLLOW_ANIM);
            } else {
                a(a.FOLLOWED);
            }
            a("follow_icon", (Map<String, String>) null);
        }
    }

    @Override // com.bytedance.android.live.f.a.AbstractC0151a
    public final void a(boolean z2) {
        m();
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.q = room;
        onLoad(new Object[]{room});
    }

    private static boolean a(Room room) {
        try {
            if (room.officialChannelInfo.f18978a.getId() == room.getOwnerUserId()) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(Long l2) {
        this.J = l2.longValue();
        this.H.setText(this.context.getString(R.string.gnr, com.bytedance.android.live.core.f.b.b(l2.longValue())));
        o();
        return z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final void a(View view) {
        if (this.dataChannel != null && this.dataChannel.b(cp.class) != null && !((Boolean) this.dataChannel.b(cp.class)).booleanValue()) {
            com.bytedance.android.livesdk.an.a.a().a(new com.bytedance.android.livesdkapi.f.a("subscribe_live_left_corner"));
        } else if (view.getId() == R.id.d9w) {
            ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeState(y.e(), this.q, "live_left_corner");
        } else if (view.getId() == R.id.edu) {
            ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(y.e(), this.q, "live_left_corner");
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            if (iMessage instanceof ai) {
                ai aiVar = (ai) iMessage;
                if (!aiVar.f13611c) {
                    a((long) aiVar.f19133a);
                }
            } else if (iMessage instanceof ce) {
                ce ceVar = (ce) iMessage;
                if (ceVar.f19470a == 3) {
                    b((long) ceVar.f19475j);
                    AnimatorSet animatorSet = this.P;
                    if (animatorSet == null || !animatorSet.isRunning()) {
                        if (this.f21935h.getVisibility() != 0) {
                            p();
                        }
                        this.S.removeMessages(3);
                        this.S.removeMessages(2);
                        this.S.sendEmptyMessageDelayed(3, (long) f21929b);
                        return;
                    }
                    long animatedFraction = (long) ((1.0f - ((ValueAnimator) this.P.getChildAnimations().get(0)).getAnimatedFraction()) * 200.0f);
                    this.S.removeMessages(2);
                    this.S.sendEmptyMessageDelayed(2, animatedFraction);
                }
            }
        }
    }

    private void a(long j2) {
        if (j2 <= 0) {
            this.K = 0;
        } else if (j2 > this.K) {
            long j3 = 2147483647L;
            if (j2 <= 2147483647L) {
                j3 = (long) ((int) j2);
            }
            this.K = j3;
        }
        TextView textView = this.f21936i;
        if (textView != null) {
            int i2 = this.C;
            if (i2 == 2 || (i2 == 1 && this.D)) {
                Drawable c2 = y.c(2131234601);
                c2.setBounds(0, y.a(-1.0f), y.a(11.0f), y.a(10.0f));
                this.f21936i.setCompoundDrawablePadding(y.a(2.0f));
                this.f21936i.setCompoundDrawables(c2, null, null, null);
                this.f21936i.setText(((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).formatLikeNumber(this.K));
                return;
            }
            textView.setCompoundDrawablePadding(0);
            this.f21936i.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f21936i.setText(y.a(R.plurals.fu, (int) this.K, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).formatLikeNumber(this.K)));
        }
    }

    private void b(long j2) {
        if (j2 <= 0) {
            this.L = 0;
        } else if (j2 > this.L) {
            long j3 = 2147483647L;
            if (j2 <= 2147483647L) {
                j3 = (long) ((int) j2);
            }
            this.L = j3;
        }
        TextView textView = this.f21935h;
        if (textView != null) {
            int i2 = this.C;
            if (i2 == 2 || (i2 == 1 && this.D)) {
                Drawable c2 = y.c(2131234602);
                c2.setBounds(0, y.a(-1.0f), y.a(11.0f), y.a(10.0f));
                this.f21935h.setCompoundDrawablePadding(y.a(2.0f));
                this.f21935h.setCompoundDrawables(c2, null, null, null);
                this.f21935h.setText(((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).formatLikeNumber(this.L));
                return;
            }
            textView.setCompoundDrawablePadding(0);
            this.f21935h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f21935h.setText(y.a((int) R.string.ebq, ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).formatLikeNumber(this.L)));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        com.bytedance.android.livesdkapi.depend.model.live.i iVar;
        String str;
        int i2 = message.what;
        if (i2 == 2) {
            AnimatorSet animatorSet = this.P;
            if (animatorSet == null || !animatorSet.isRunning()) {
                p();
                this.S.removeMessages(3);
                this.S.sendEmptyMessageDelayed(3, (long) f21929b);
                return;
            }
            this.S.sendEmptyMessage(2);
        } else if (i2 == 3) {
            AnimatorSet animatorSet2 = this.P;
            if (animatorSet2 == null || !animatorSet2.isRunning()) {
                int q2 = q();
                int i3 = 0;
                this.f21936i.setVisibility(0);
                this.f21935h.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f21936i, "alpha", 0.0f, 1.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f21936i, "translationY", (float) q2, 0.0f);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f21935h, "alpha", 1.0f, 0.0f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f21935h, "translationY", 0.0f, (float) (-q2));
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.P = animatorSet3;
                animatorSet3.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
                this.P.setDuration(200L);
                this.P.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(12916);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        LiveRoomUserInfoWidget.this.f21935h.setVisibility(4);
                    }
                });
                this.P.start();
                Room room = this.q;
                if (room != null) {
                    iVar = room.getStreamType();
                } else {
                    iVar = com.bytedance.android.livesdkapi.depend.model.live.i.VIDEO;
                }
                String a2 = com.bytedance.android.livesdkapi.depend.model.live.j.a(iVar);
                if (this.s) {
                    str = "anchor";
                } else {
                    User user = this.r;
                    if (user == null || user.getUserAttr() == null || !this.r.getUserAttr().f19030b) {
                        str = "viewer";
                    } else {
                        str = "admin";
                    }
                }
                if (this.N > 0) {
                    i3 = (int) ((System.currentTimeMillis() - this.N) / 1000);
                    this.N = 0;
                }
                b.a.a("livesdk_share_count_show").a().a("live_type", a2).a("admin_type", str).a("duration", i3).b();
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        int i2;
        this.f21930c = (ViewGroup) findViewById(R.id.jm);
        this.f21931d = (VHeadView) findViewById(R.id.bex);
        this.E = (HSImageView) findViewById(R.id.buz);
        this.F = (LiveTextView) findViewById(R.id.cm4);
        this.f21932e = findViewById(R.id.csf);
        this.f21930c.setOnClickListener(new b(this));
        this.f21933f = (TextView) findViewById(R.id.fdm);
        this.f21934g = (ImageView) findViewById(R.id.nt);
        this.G = findViewById(R.id.cwa);
        this.H = (TextView) findViewById(R.id.b06);
        this.f21935h = (TextView) findViewById(R.id.e0v);
        this.f21936i = (TextView) findViewById(R.id.c_s);
        this.f21937j = findViewById(R.id.azc);
        this.f21938k = (ViewGroup) findViewById(R.id.b7q);
        if (s.b(this.dataChannel)) {
            i2 = R.id.b7a;
        } else {
            i2 = R.id.b7u;
        }
        View findViewById = findViewById(i2);
        this.f21939l = findViewById;
        findViewById.setOnClickListener(new c(this));
        this.f21940m = (HSAnimImageView) findViewById(R.id.b7w);
        ImageView imageView = (ImageView) findViewById(R.id.edu);
        this.n = imageView;
        imageView.setOnClickListener(new n(this));
        ImageView imageView2 = (ImageView) findViewById(R.id.d9w);
        this.I = imageView2;
        imageView2.setOnClickListener(new r(this));
        TextView textView = (TextView) findViewById(R.id.edw);
        this.o = textView;
        textView.setOnClickListener(null);
        for (String str : LiveRoomUserInfoLanguageSetting.INSTANCE.getValue()) {
            if (str.equals(com.bytedance.android.livesdk.util.d.a(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).currentLocale()))) {
                this.D = true;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        TextView textView;
        long likeCount;
        com.bytedance.android.live.j.a aVar;
        long j2;
        Room room;
        LiveTextView liveTextView;
        Room room2;
        this.z = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        this.q = (Room) this.dataChannel.b(df.class);
        this.s = ((Boolean) this.dataChannel.b(ee.class)).booleanValue();
        this.t = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.Q = (String) this.dataChannel.b(com.bytedance.android.livesdkapi.e.b.class);
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        m();
        com.bytedance.ies.xbridge.e.b.a("js_event_report_log_live_follow", this);
        if (this.s) {
            this.f21933f.setMaxWidth(y.a(131.0f));
        }
        if (!(this.s || this.z == null || (liveTextView = this.F) == null || this.G == null)) {
            n.a(liveTextView, 8);
            n.a(this.G, 0);
            if (!this.s && this.z.isMicRoomForCurrentRoom()) {
                n.a(this.F, 0);
                n.a(this.G, 8);
                if (!(this.F == null || (room2 = this.q) == null || room2.officialChannelInfo == null || this.q.getOfficialChannelInfo().f18979b == null)) {
                    this.F.setText(this.q.getOfficialChannelInfo().f18979b);
                }
            }
        }
        this.R = (androidx.fragment.app.e) this.context;
        if (!this.s) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("anchor_id", new StringBuilder().append(this.q.getOwnerUserId()).toString());
                hashMap.put("room_id", this.q.getIdStr());
                hashMap.put("rank_type", new String[]{"money", "fans", "nothing", "room_money"}[LiveAnchorInfoAbtestSetting.INSTANCE.getValue()]);
                ((com.bytedance.android.livesdkapi.host.g) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.g.class)).a("livesdk_live_room_info", hashMap);
            } catch (Exception e2) {
                com.bytedance.android.live.core.c.a.a("ALogger", e2);
            }
            com.bytedance.android.live.j.a aVar2 = this.z;
            if (aVar2 == null || !aVar2.isMicRoomForCurrentRoom() || (room = this.q) == null || room.getOfficialChannelInfo() == null || this.q.getOfficialChannelInfo().f18978a == null) {
                f.a.b.a aVar3 = this.p;
                Room room3 = this.q;
                if (room3 == null || room3.getOwner() == null) {
                    j2 = 0;
                } else {
                    j2 = this.q.getOwner().getId();
                }
                aVar3.a(b2.d(j2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new u(this), v.f21987a));
            } else {
                this.p.a(b2.d(this.q.getOfficialChannelInfo().f18978a.getId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new s(this), t.f21985a));
            }
        }
        if (this.s) {
            a(a.FOLLOWED);
        }
        if (!(this.H == null || this.q.getOwner() == null || this.q.getOwner().getFollowInfo() == null)) {
            this.J = this.q.getOwner().getFollowInfo().getFollowerCount();
            this.H.setText(this.context.getString(R.string.gnr, com.bytedance.android.live.core.f.b.b(this.J)));
        }
        this.p.a(b2.c(this.q.getOwnerUserId()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new w(this), x.f21989a));
        com.bytedance.android.live.u.g.f12827a.post(new d(this), this);
        this.S = new WeakHandler(this.context.getMainLooper(), this);
        this.dataChannel.a((m) this, dn.class, (h.f.a.b) new e(this)).a((Object) this, com.bytedance.android.livesdk.j.ce.class, (h.f.a.b) new f(this)).a((m) this, ba.class, (h.f.a.b) new g(this)).a((m) this, com.bytedance.android.live.n.d.class, (h.f.a.b) new h(this)).a((m) this, ae.class, (h.f.a.b) new i(this)).a((m) this, com.bytedance.android.livesdk.rank.api.a.class, (h.f.a.b) new j(this));
        DataChannelGlobal.f34575d.a(this, this, aa.class, new k(this));
        if (getView() != null) {
            getView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(12909);
                }

                public final void onGlobalLayout() {
                    if (LiveRoomUserInfoWidget.this.getView() != null) {
                        LiveRoomUserInfoWidget.this.getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        int[] iArr = new int[2];
                        LiveRoomUserInfoWidget.this.getView().getLocationOnScreen(iArr);
                        float height = (float) (iArr[1] + LiveRoomUserInfoWidget.this.getView().getHeight());
                        Context e2 = y.e();
                        if (e2 != null) {
                            ao.f22245a = (int) ((height - ((float) n.e(e2))) - n.b(e2, 52.0f));
                        }
                    }
                }
            });
        }
        ImageView imageView = (ImageView) findViewById(R.id.dsc);
        if (this.f21936i.getVisibility() == 0) {
            textView = this.f21936i;
        } else {
            textView = this.f21935h;
        }
        this.T = new UserInfoLikeHelper(this, imageView, textView);
        this.K = 0;
        Room room4 = this.q;
        if (room4 == null) {
            likeCount = 0;
        } else {
            likeCount = room4.getLikeCount();
        }
        com.bytedance.android.livesdk.like.b bVar = null;
        if (this.q != null) {
            bVar = ((com.bytedance.android.livesdk.p) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.p.class)).getLikeHelper(this.q.getId());
        }
        IMessageManager iMessageManager = (IMessageManager) this.dataChannel.b(cg.class);
        if (bVar != null && bVar.n()) {
            if (bVar.l()) {
                if (this.s || (aVar = this.z) == null || !aVar.isMicRoomForCurrentRoom() || a(this.q)) {
                    bVar.a(this.f21931d);
                }
                if (bVar.o()) {
                    bVar.a(this.T);
                }
                if (bVar.g() > 0) {
                    likeCount += (long) bVar.g();
                }
                bVar.a(this);
            }
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LIKE.getIntType(), this);
            }
        }
        a(likeCount);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.USER_SEQ.getIntType(), this);
        }
        if (this.q != null) {
            ((com.bytedance.android.live.f.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.f.a.class)).addOnUserCountVisibilityChangeListener(this.q.getId(), this);
        }
        if (n()) {
            Room room5 = this.q;
            if (!(room5 == null || room5.getStats() == null)) {
                this.L = (long) this.q.getStats().getShareCount();
            }
            b(this.L);
            this.f21935h.setVisibility(4);
            this.f21936i.setVisibility(0);
            if (this.L > 0) {
                this.S.sendEmptyMessageDelayed(2, (long) f21928a);
            }
            if (iMessageManager != null) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.SOCIAL.getIntType(), this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(com.bytedance.android.livesdk.model.j jVar) {
        com.bytedance.android.live.j.a aVar;
        if (jVar == null || (aVar = this.z) == null || (aVar.isMicRoomForCurrentRoom() && !this.s)) {
            this.E.setImageDrawable(null);
        } else {
            k.a(this.E, jVar.f19085a);
        }
    }

    private void a(String str, Map<String, String> map) {
        String str2;
        String str3;
        Room room;
        try {
            HashMap hashMap = new HashMap();
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("growth_deepevent", "1");
            if (!com.bytedance.common.utility.m.a(com.bytedance.android.livesdk.chatroom.d.a().e())) {
                hashMap.put("enter_live_method", com.bytedance.android.livesdk.chatroom.d.a().e());
            }
            String g2 = com.bytedance.android.livesdk.ab.e.g();
            if (TextUtils.isEmpty(g2) || !"click_push_live_cd_user".equals(g2)) {
                hashMap.put("is_subscribe", "0");
            } else {
                hashMap.put("is_subscribe", "1");
            }
            User owner = this.q.getOwner();
            String valueOf = String.valueOf(owner.getId());
            String str4 = "live_audience_c_anchor";
            com.bytedance.android.live.j.a aVar = this.z;
            if (!(aVar == null || (room = this.q) == null || !aVar.isMicRoomForRoom(room))) {
                if (this.z.isMicAudience()) {
                    str4 = "carousel_audience_c_official_id";
                } else {
                    str4 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.q.officialChannelInfo.f18978a.getId());
            }
            if (!this.s) {
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInCoHost()) {
                    hashMap.put("connection_type", "anchor");
                    hashMap.put("anchor_type", "current");
                    hashMap.put("channel_id", String.valueOf(b.a.a().f9940e));
                }
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isRoomInBattle()) {
                    hashMap.put("connection_type", "manual_pk");
                    hashMap.put("pk_id", String.valueOf(((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).getBattleId()));
                }
                if (((com.bytedance.android.live.liveinteract.api.b) com.bytedance.android.live.t.a.a(com.bytedance.android.live.liveinteract.api.b.class)).isInMultiGuest()) {
                    hashMap.put("connection_type", "audience");
                }
            }
            hashMap.put("to_user_id", valueOf);
            hashMap.put("request_page", str4);
            hashMap.put("click_user_position", str);
            if (this.t) {
                str2 = "portrait";
            } else {
                str2 = "landscape";
            }
            hashMap.put("room_orientation", str2);
            Room room2 = this.q;
            if (!(room2 == null || room2.getOwner() == null || this.q.getOwner().getFollowInfo() == null)) {
                int followStatus = (int) this.q.getOwner().getFollowInfo().getFollowStatus();
                if (followStatus == 1 || followStatus == 3) {
                    str3 = "mutual";
                } else {
                    str3 = "single";
                }
                hashMap.put("follow_type", str3);
            }
            b.a.a("livesdk_follow").a((Map<String, String>) hashMap).a(new com.bytedance.android.livesdk.ab.c.e("live", owner.getId())).a(this.dataChannel).b("live_interact").d("live_detail").b();
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(6, B, e2.toString());
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        a(this.K + 1);
    }
}
