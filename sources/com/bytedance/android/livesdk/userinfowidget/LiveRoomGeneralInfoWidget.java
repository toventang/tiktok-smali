package com.bytedance.android.livesdk.userinfowidget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.n.z;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveOnlineAudienceListSetting;
import com.bytedance.android.livesdk.p;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class LiveRoomGeneralInfoWidget extends RoomRecycleWidget implements au {

    /* renamed from: a  reason: collision with root package name */
    public Room f21900a;

    /* renamed from: b  reason: collision with root package name */
    public HSAnimImageView f21901b;

    /* renamed from: c  reason: collision with root package name */
    public View f21902c;

    /* renamed from: d  reason: collision with root package name */
    public View f21903d;

    /* renamed from: e  reason: collision with root package name */
    public ValueAnimator f21904e;

    /* renamed from: f  reason: collision with root package name */
    public HSImageView f21905f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f21906g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f21907h;

    /* renamed from: i  reason: collision with root package name */
    private LottieAnimationView f21908i;

    /* renamed from: j  reason: collision with root package name */
    private final f.a.b.a f21909j = new f.a.b.a();

    /* renamed from: k  reason: collision with root package name */
    private com.bytedance.android.livesdk.at.f f21910k;

    /* renamed from: l  reason: collision with root package name */
    private View f21911l;

    /* renamed from: m  reason: collision with root package name */
    private LiveWidget f21912m;
    private LiveWidget n;
    private final WidgetCreateTimeUtil o = new WidgetCreateTimeUtil(null, 1, null);

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final h f21919a = new h();

        static {
            Covode.recordClassIndex(12903);
        }

        h() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(12895);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bcl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public final void a() {
        if (this.f21900a != null) {
            Room room = this.f21900a;
            if (room == null) {
                l.b();
            }
            User owner = room.getOwner();
            l.b(owner, "");
            UserProfileEvent userProfileEvent = new UserProfileEvent(owner.getId());
            userProfileEvent.mSource = "video_head";
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(z.class, userProfileEvent);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        this.f21907h = false;
        resetAnim();
        this.f21909j.a();
        this.o.send();
        RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.unload(this.f21912m);
        }
        RecyclableWidgetManager recyclableWidgetManager2 = this.subWidgetManager;
        if (recyclableWidgetManager2 != null) {
            recyclableWidgetManager2.unload(this.n);
        }
        View findViewById = findViewById(R.id.n8);
        l.b(findViewById, "");
        ((FrameLayout) findViewById).setVisibility(8);
        View findViewById2 = findViewById(R.id.bh9);
        l.b(findViewById2, "");
        ((FrameLayout) findViewById2).setVisibility(8);
        if (this.f21900a != null) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(p.class);
            if (a2 == null) {
                l.b();
            }
            p pVar = (p) a2;
            Room room = this.f21900a;
            if (room == null) {
                l.b();
            }
            com.bytedance.android.livesdk.like.b likeHelper = pVar.getLikeHelper(room.getId());
            if (likeHelper != null && likeHelper.n() && likeHelper.l()) {
                likeHelper.a((View) null);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01b5, code lost:
        if (r0 == null) goto L_0x01b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b() {
        /*
        // Method dump skipped, instructions count: 524
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget.b():void");
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21916a;

        static {
            Covode.recordClassIndex(12899);
        }

        d(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21916a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            this.f21916a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21917a;

        static {
            Covode.recordClassIndex(12900);
        }

        e(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21917a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            this.f21917a.a();
        }
    }

    public static final class i implements com.facebook.fresco.animation.c.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21920a;

        static {
            Covode.recordClassIndex(12904);
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar) {
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void a(com.facebook.fresco.animation.c.a aVar, int i2) {
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void c(com.facebook.fresco.animation.c.a aVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21920a = liveRoomGeneralInfoWidget;
        }

        static final class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f21921a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f21922b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f21923c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ GradientDrawable f21924d;

            static {
                Covode.recordClassIndex(12905);
            }

            a(i iVar, int i2, int i3, GradientDrawable gradientDrawable) {
                this.f21921a = iVar;
                this.f21922b = i2;
                this.f21923c = i3;
                this.f21924d = gradientDrawable;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l.d(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                View view = this.f21921a.f21920a.f21902c;
                if (view == null) {
                    l.b();
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                l.b(layoutParams, "");
                layoutParams.width = (int) (floatValue * ((float) this.f21922b));
                int i2 = layoutParams.width;
                int i3 = this.f21923c;
                if (i2 <= i3) {
                    layoutParams.height = layoutParams.width;
                    GradientDrawable gradientDrawable = this.f21924d;
                    if (gradientDrawable != null) {
                        gradientDrawable.setCornerRadius((float) (layoutParams.height >> 1));
                    }
                } else {
                    layoutParams.height = i3;
                }
                View view2 = this.f21921a.f21920a.f21902c;
                if (view2 == null) {
                    l.b();
                }
                view2.setLayoutParams(layoutParams);
            }
        }

        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f21925a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GradientDrawable f21926b;

            static {
                Covode.recordClassIndex(12906);
            }

            public final void onAnimationEnd(Animator animator) {
                l.d(animator, "");
                super.onAnimationEnd(animator);
                View view = this.f21925a.f21920a.f21902c;
                if (view == null) {
                    l.b();
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                l.b(layoutParams, "");
                layoutParams.width = -2;
                layoutParams.height = -2;
                View view2 = this.f21925a.f21920a.f21902c;
                if (view2 == null) {
                    l.b();
                }
                view2.setLayoutParams(layoutParams);
                GradientDrawable gradientDrawable = this.f21926b;
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius((float) y.a(12.5f));
                }
                View view3 = this.f21925a.f21920a.f21902c;
                if (view3 == null) {
                    l.b();
                }
                n.a(view3, 8);
            }

            b(i iVar, GradientDrawable gradientDrawable) {
                this.f21925a = iVar;
                this.f21926b = gradientDrawable;
            }
        }

        @Override // com.facebook.fresco.animation.c.b
        public final void b(com.facebook.fresco.animation.c.a aVar) {
            if (this.f21920a.f21902c instanceof View) {
                View view = this.f21920a.f21902c;
                if (view == null) {
                    l.b();
                }
                Drawable background = view.getBackground();
                if (!(background instanceof GradientDrawable)) {
                    background = null;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                View view2 = this.f21920a.f21902c;
                if (view2 == null) {
                    l.b();
                }
                int measuredWidth = view2.getMeasuredWidth();
                View view3 = this.f21920a.f21902c;
                if (view3 == null) {
                    l.b();
                }
                int measuredHeight = view3.getMeasuredHeight();
                this.f21920a.f21904e = ValueAnimator.ofFloat(1.0f, 0.0f);
                ValueAnimator valueAnimator = this.f21920a.f21904e;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new a(this, measuredWidth, measuredHeight, gradientDrawable));
                }
                ValueAnimator valueAnimator2 = this.f21920a.f21904e;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new b(this, gradientDrawable));
                }
                ValueAnimator valueAnimator3 = this.f21920a.f21904e;
                if (valueAnimator3 != null) {
                    valueAnimator3.setDuration(200L);
                }
                ValueAnimator valueAnimator4 = this.f21920a.f21904e;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
        }
    }

    public static final /* synthetic */ HSImageView a(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
        HSImageView hSImageView = liveRoomGeneralInfoWidget.f21905f;
        if (hSImageView == null) {
            l.a("border");
        }
        return hSImageView;
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget
    public final void onGetRoomInfo(Room room) {
        super.onGetRoomInfo(room);
        this.f21900a = room;
        b();
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21915a;

        static {
            Covode.recordClassIndex(12898);
        }

        c(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21915a = liveRoomGeneralInfoWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ao.a(y.e(), (int) R.string.gqu);
            View view = this.f21915a.f21902c;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f21915a.f21903d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.model.j, h.z> {
        final /* synthetic */ LiveRoomGeneralInfoWidget this$0;

        static {
            Covode.recordClassIndex(12902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            super(1);
            this.this$0 = liveRoomGeneralInfoWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.livesdk.model.j jVar) {
            com.bytedance.android.livesdk.model.j jVar2 = jVar;
            l.d(jVar2, "");
            k.a(LiveRoomGeneralInfoWidget.a(this.this$0), jVar2.f19085a);
            LiveRoomGeneralInfoWidget.a(this.this$0).setVisibility(0);
            return h.z.f158842a;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.jh);
        l.b(findViewById, "");
        this.f21905f = (HSImageView) findViewById;
        this.f21906g = objArr;
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21914a;

        static {
            Covode.recordClassIndex(12897);
        }

        b(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21914a = liveRoomGeneralInfoWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
            l.b(aVar, "");
            if (!aVar.b()) {
                ao.a(y.e(), (int) R.string.gqu);
                View view = this.f21914a.f21902c;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.f21914a.f21903d;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r5 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.bytedance.android.livesdkapi.depend.model.live.Room r5) {
        /*
            r3 = 0
            if (r5 == 0) goto L_0x0018
            com.bytedance.android.livesdk.model.aq r0 = r5.officialChannelInfo
            if (r0 == 0) goto L_0x001a
            com.bytedance.android.live.base.model.user.User r0 = r0.f18978a
            if (r0 == 0) goto L_0x001a
            long r1 = r0.getId()
        L_0x0010:
            long r3 = r5.getOwnerUserId()
        L_0x0014:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001f
        L_0x0018:
            r0 = 1
            return r0
        L_0x001a:
            r1 = 0
            if (r5 == 0) goto L_0x0014
            goto L_0x0010
        L_0x001f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.userinfowidget.LiveRoomGeneralInfoWidget.a(com.bytedance.android.livesdkapi.depend.model.live.Room):boolean");
    }

    static final class a<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21913a;

        static {
            Covode.recordClassIndex(12896);
        }

        a(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21913a = liveRoomGeneralInfoWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.livesdk.event.g gVar = (com.bytedance.android.livesdk.event.g) obj;
            if (this.f21913a.isVisibilityToUser() && gVar != null && gVar.f17192a != null && this.f21913a.getView() != null && this.f21913a.isViewValid()) {
                SparseBooleanArray sparseBooleanArray = gVar.f17192a;
                boolean z = false;
                boolean z2 = sparseBooleanArray.get(0);
                boolean z3 = sparseBooleanArray.get(2);
                Context context = this.f21913a.context;
                View view = this.f21913a.getView();
                if (!z2 && !z3) {
                    z = true;
                }
                com.bytedance.android.livesdk.chatroom.g.e.a(context, view, z, gVar.f17194c);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21918a;

        static {
            Covode.recordClassIndex(12901);
        }

        f(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21918a = liveRoomGeneralInfoWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            HSAnimImageView hSAnimImageView;
            Room room;
            com.bytedance.android.livesdkapi.depend.model.b.a aVar = (com.bytedance.android.livesdkapi.depend.model.b.a) obj;
            LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget = this.f21918a;
            l.b(aVar, "");
            DataChannel dataChannel = liveRoomGeneralInfoWidget.dataChannel;
            if (!(dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null)) {
                room.getOwner().setFollowStatus(aVar.a());
                DataChannel dataChannel2 = liveRoomGeneralInfoWidget.dataChannel;
                if (dataChannel2 != null) {
                    dataChannel2.b(df.class, room);
                }
            }
            if (aVar.a() == 1 || aVar.a() == 2) {
                HSAnimImageView hSAnimImageView2 = liveRoomGeneralInfoWidget.f21901b;
                if (hSAnimImageView2 != null && !hSAnimImageView2.c() && (hSAnimImageView = liveRoomGeneralInfoWidget.f21901b) != null) {
                    hSAnimImageView.a();
                    return;
                }
                return;
            }
            View view = liveRoomGeneralInfoWidget.f21902c;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = liveRoomGeneralInfoWidget.f21903d;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveRoomGeneralInfoWidget f21927a;

        static {
            Covode.recordClassIndex(12907);
        }

        j(LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget) {
            this.f21927a = liveRoomGeneralInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            FollowInfo followInfo;
            HSAnimImageView hSAnimImageView = this.f21927a.f21901b;
            if (hSAnimImageView != null) {
                hSAnimImageView.a();
            }
            View view2 = this.f21927a.f21903d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            Room room = this.f21927a.f21900a;
            if (room != null) {
                LiveRoomGeneralInfoWidget liveRoomGeneralInfoWidget = this.f21927a;
                com.bytedance.android.livesdk.ab.e.a();
                com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
                if (aVar == null || aVar.isMicAudience()) {
                    str = "carousel_audience_c_anchor";
                } else {
                    str = "loyal_audience_c_anchor";
                }
                User owner = room.getOwner();
                l.b(owner, "");
                long j2 = 0;
                u.a().b().a(((d.a) new d.b().a(owner.getId())).a(room.getRequestId()).b("live_detail").c("live_over").b(0).d(room.getLabels()).c()).a(new b(liveRoomGeneralInfoWidget), new c(liveRoomGeneralInfoWidget));
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("growth_deepevent", "1");
                    com.bytedance.android.livesdk.chatroom.d a2 = com.bytedance.android.livesdk.chatroom.d.a();
                    l.b(a2, "");
                    if (!com.bytedance.common.utility.m.a(a2.e())) {
                        com.bytedance.android.livesdk.chatroom.d a3 = com.bytedance.android.livesdk.chatroom.d.a();
                        l.b(a3, "");
                        String e2 = a3.e();
                        l.b(e2, "");
                        hashMap.put("enter_live_method", e2);
                    }
                    String g2 = com.bytedance.android.livesdk.ab.e.g();
                    if (TextUtils.isEmpty(g2) || !l.a((Object) "click_push_live_cd_user", (Object) g2)) {
                        hashMap.put("is_subscribe", "0");
                    } else {
                        hashMap.put("is_subscribe", "1");
                    }
                    if (!h.m.p.e((CharSequence) str, (CharSequence) "carousel_audience_c") && !h.m.p.e((CharSequence) str, (CharSequence) "loyal_audience_c")) {
                        str = "live_over";
                    }
                    if (y.f()) {
                        str2 = "portrait";
                    } else {
                        str2 = "landscape";
                    }
                    hashMap.put("room_orientation", str2);
                    User owner2 = room.getOwner();
                    if (!(owner2 == null || (followInfo = owner2.getFollowInfo()) == null)) {
                        j2 = followInfo.getFollowStatus();
                    }
                    if (j2 == 1 || j2 == 3) {
                        hashMap.put("follow_type", "mutual");
                    } else {
                        hashMap.put("follow_type", "single");
                    }
                    com.bytedance.android.livesdk.ab.b a4 = b.a.a("follow").a(liveRoomGeneralInfoWidget.dataChannel).a((Map<String, String>) hashMap);
                    User owner3 = room.getOwner();
                    l.b(owner3, "");
                    a4.a(new com.bytedance.android.livesdk.ab.c.e(str, owner3.getId())).b("live_interact").c("core").b();
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean z;
        Boolean bool;
        Boolean bool2;
        this.o.clear();
        enableSubWidgetManager(this.o, com.bytedance.android.live.u.g.f12827a);
        this.subWidgetManager.load(R.id.d0m, LiveRoomUserInfoWidget.class);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.b(df.class);
        } else {
            room = null;
        }
        this.f21900a = room;
        this.f21910k = u.a().b();
        this.f21911l = findViewById(R.id.cm5);
        com.bytedance.android.live.j.a aVar = (com.bytedance.android.live.j.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.j.a.class);
        DataChannel dataChannel2 = this.dataChannel;
        if (!(dataChannel2 == null || (bool2 = (Boolean) dataChannel2.b(cp.class)) == null || bool2.booleanValue())) {
            this.f21909j.a(((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.event.g.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(this))).a(new a(this)));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 == null || (bool = (Boolean) dataChannel3.b(cp.class)) == null) {
            z = true;
        } else {
            z = bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (!valueOf.booleanValue() && (LiveOnlineAudienceListSetting.INSTANCE.getValue() || (aVar != null && aVar.isMicRoomForCurrentRoom()))) {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class);
            if (a2 == null) {
                l.b();
            }
            this.f21912m = ((com.bytedance.android.livesdk.rank.api.d) a2).getRankWidget();
            this.subWidgetManager.load(R.id.n8, this.f21912m);
            View findViewById = findViewById(R.id.n8);
            l.b(findViewById, "");
            ((FrameLayout) findViewById).setVisibility(0);
        }
        if (com.bytedance.android.livesdk.utils.p.b(valueOf) && !aVar.isMicRoomForCurrentRoom()) {
            com.bytedance.android.livesdk.utils.p.b(findViewById(R.id.bh9));
            this.n = this.subWidgetManager.load(R.id.bh9, (Class) ((com.bytedance.android.livesdk.rank.api.d) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdk.rank.api.d.class)).getRankWidgetClass(4), false);
        }
        b();
    }
}
