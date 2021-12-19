package com.ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import androidx.lifecycle.u;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.android.livesdkapi.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.feedwidget.FeedLiveWindowWidget;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.e.b;
import com.ss.android.ugc.aweme.live.e.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.go;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Set;
import org.greenrobot.eventbus.j;

public class FollowLiveVideoViewHolder extends FullFeedVideoViewHolder implements j {

    /* renamed from: a  reason: collision with root package name */
    public RoomStruct f91489a;
    private int aL = -1;
    private FeedLiveWindowWidget aM;
    private Animator aN;
    private boolean aO;
    private boolean aP;
    private boolean aQ;
    private boolean aR;
    private Handler aS = new Handler(Looper.getMainLooper()) {
        /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass1 */

        static {
            Covode.recordClassIndex(57567);
        }

        public final void handleMessage(Message message) {
            if (FollowLiveVideoViewHolder.this.f91491c && message.what == 100 && FollowLiveVideoViewHolder.this.f91490b && FollowLiveVideoViewHolder.this.o()) {
                FollowLiveVideoViewHolder.this.I();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public boolean f91490b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f91491c;

    /* renamed from: d  reason: collision with root package name */
    View f91492d;

    /* renamed from: e  reason: collision with root package name */
    public View f91493e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f91494f;

    /* renamed from: g  reason: collision with root package name */
    public Room f91495g;

    /* renamed from: h  reason: collision with root package name */
    public c f91496h = LiveOuterService.s().a(new t(this), new b() {
        /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass2 */

        static {
            Covode.recordClassIndex(57568);
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void firstFrame() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onVideoSizeChange(TextureView textureView, int i2, int i3) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playComplete(String str) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playPrepared(String str) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playerMediaError(String str) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void playing() {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void seiUpdate(String str) {
        }

        @Override // com.ss.android.ugc.aweme.live.e.b
        public final void onPlayerMessage(g.b bVar, Object obj) {
            int i2 = AnonymousClass7.f91505a[bVar.ordinal()];
            if (i2 == 1 || i2 == 2) {
                FollowLiveVideoViewHolder.this.J();
            }
        }
    });

    static {
        Covode.recordClassIndex(57566);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final boolean K() {
        return false;
    }

    private void aM() {
        this.aS.removeMessages(100);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void bj_() {
        super.bj_();
        G();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    private void aP() {
        if (o()) {
            J();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    private void aR() {
        Animator animator = this.aN;
        if (animator != null) {
            animator.cancel();
            this.aN = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void j() {
        super.j();
        this.f91496h.destroy();
        aM();
        aR();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void m() {
        super.m();
        this.f91496h.pause();
        this.aO = false;
    }

    public final boolean o() {
        RoomStruct roomStruct = this.f91489a;
        if (roomStruct == null || !roomStruct.isPullUrlValid()) {
            return false;
        }
        return true;
    }

    public final void J() {
        com.ss.android.ugc.aweme.live.c d2 = LiveOuterService.s().d();
        if (d2 != null) {
            d2.a(this.f91489a.id, new a() {
                /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(57570);
                }

                @Override // com.bytedance.android.livesdkapi.service.a
                public final void a(boolean z) {
                    boolean z2 = true;
                    if (z != FollowLiveVideoViewHolder.this.f91490b) {
                        FollowLiveVideoViewHolder.this.f91490b = z;
                        FollowLiveVideoViewHolder.this.at().a("live_has_end", Boolean.valueOf(!FollowLiveVideoViewHolder.this.f91490b));
                        if (FollowLiveVideoViewHolder.this.f91491c) {
                            FollowLiveVideoViewHolder.this.G();
                        }
                    }
                    if (!z) {
                        FollowLiveVideoViewHolder.this.f91496h.stop();
                        FollowLiveVideoViewHolder followLiveVideoViewHolder = FollowLiveVideoViewHolder.this;
                        if (!followLiveVideoViewHolder.f91491c || !FollowLiveVideoViewHolder.this.f91494f) {
                            z2 = false;
                        }
                        followLiveVideoViewHolder.f(z2);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.FullFeedVideoViewHolder, com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void g() {
        super.g();
        this.f91491c = false;
        this.f91496h.stop();
        f(false);
        this.aO = false;
        this.aQ = false;
        aM();
        aR();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void l() {
        super.l();
        aP();
        if (this.f91494f) {
            I();
        } else if (this.aQ) {
            aO();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f91505a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 57573(0xe0e5, float:8.0677E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.d.g.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass7.f91505a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass7.f91505a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass7.<clinit>():void");
        }
    }

    private void aO() {
        long liveWindowShowTime = this.f91515j.getLiveWindowShowTime() * 1000;
        if (liveWindowShowTime > 0) {
            if (liveWindowShowTime < InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                liveWindowShowTime = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
            }
            Handler handler = this.aS;
            handler.sendMessageDelayed(handler.obtainMessage(100), liveWindowShowTime);
        }
    }

    private void aQ() {
        if (!this.f91494f) {
            if (this.f91493e.getVisibility() == 8) {
                this.f91493e.setVisibility(0);
                this.f91493e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(57569);
                    }

                    public final void onGlobalLayout() {
                        FollowLiveVideoViewHolder.this.f91493e.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        FollowLiveVideoViewHolder.this.f91493e.setTranslationX(FollowLiveVideoViewHolder.b(FollowLiveVideoViewHolder.this.f91493e));
                    }
                });
                return;
            }
            this.f91493e.setVisibility(0);
            View view = this.f91493e;
            view.setTranslationX(b(view));
        }
    }

    private boolean aS() {
        Object b2;
        User author = this.f91515j.getAuthor();
        if (author != null) {
            long j2 = author.roomId;
            if (j2 > 0 && (b2 = at().b("key_open_live_aweme_list", (Object) null)) != null && (b2 instanceof Set)) {
                return ((Set) b2).contains(Long.valueOf(j2));
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void G() {
        this.f91489a = null;
        aN();
        if (this.f91493e.getVisibility() == 0) {
            this.f91493e.setVisibility(4);
        }
        if (this.f91490b) {
            this.aP = aS();
        }
        aP();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void I() {
        if (this.f91490b && this.f91491c && !this.aP && this.aM.e() != null && o() && !this.aO) {
            this.aO = true;
            aQ();
            this.f91496h.play(true, this.f91489a, this.aM.e());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell, com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell
    public final void c() {
        super.c();
        this.f91490b = false;
        this.f91495g = null;
        this.aR = false;
        this.f91494f = false;
        aR();
        if (this.f91493e.getVisibility() == 0) {
            this.f91493e.setVisibility(4);
            this.f91493e.setTranslationX(0.0f);
        }
        if (this.f91492d.getVisibility() != 0) {
            this.f91492d.setVisibility(0);
            this.f91492d.setTranslationX(0.0f);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void n() {
        super.n();
        at().a("dismiss_live_window", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this).a("live_window_clicked", (u<com.ss.android.ugc.aweme.arch.widgets.base.b>) this);
        this.aM = new FeedLiveWindowWidget();
        this.aB.b(R.id.c6f, this.aM);
        this.f91493e = this.aM.f93115a;
    }

    private void aN() {
        boolean z;
        Room room = this.f91495g;
        if (room != null) {
            this.f91489a = go.a(room);
        }
        if (this.f91515j != null && this.f91515j.getAuthor() != null) {
            String str = this.f91515j.getAuthor().roomData;
            if (str != null) {
                SlimRoom slimRoom = (SlimRoom) dg.a(str, SlimRoom.class);
                RoomStruct roomStruct = null;
                if (slimRoom != null) {
                    RoomStruct roomStruct2 = new RoomStruct();
                    roomStruct2.id = slimRoom.getId();
                    roomStruct2.ownerUserId = slimRoom.getOwnerUserId();
                    StreamUrlStruct a2 = go.a(slimRoom.getStreamUrl(), slimRoom.getMultiStreamDefaultQualitySdkKey());
                    if (a2 != null) {
                        roomStruct2.stream_url = a2;
                        roomStruct2.isThirdParty = slimRoom.isThirdParty;
                        roomStruct2.isScreenshot = slimRoom.isScreenshot;
                        if (slimRoom.getStreamType() == i.AUDIO) {
                            z = true;
                        } else {
                            z = false;
                        }
                        roomStruct2.liveTypeAudio = z;
                        roomStruct = roomStruct2;
                    }
                }
                this.f91489a = roomStruct;
            }
            if (this.f91489a == null) {
                long j2 = this.f91515j.getAuthor().roomId;
                if (!this.aR && j2 > 0) {
                    this.aR = true;
                    LiveOuterService.s().d().a(j2, new com.bytedance.android.livesdkapi.service.b() {
                        /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass5 */

                        static {
                            Covode.recordClassIndex(57571);
                        }

                        @Override // com.bytedance.android.livesdkapi.service.b
                        public final void a() {
                        }

                        @Override // com.bytedance.android.livesdkapi.service.b
                        public final void a(Room room) {
                            FollowLiveVideoViewHolder.this.f91495g = room;
                            FollowLiveVideoViewHolder.this.f91489a = go.a(room);
                            if (FollowLiveVideoViewHolder.this.f91491c) {
                                FollowLiveVideoViewHolder.this.G();
                            }
                        }
                    });
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public /* synthetic */ void onChanged(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        onChanged(bVar);
    }

    private static ObjectAnimator c(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", b(view), 0.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private static ObjectAnimator d(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", 0.0f, b(view));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.aj, com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(int i2) {
        super.a(i2);
        this.aL = i2;
        this.f91491c = true;
        aP();
        if (!o() || this.aP) {
            f(false);
        } else {
            aO();
        }
    }

    public final void f(boolean z) {
        this.f91494f = false;
        if (z) {
            a(this.f91493e, this.f91492d);
            return;
        }
        this.f91493e.setVisibility(8);
        this.f91492d.setVisibility(0);
        this.f91492d.setTranslationX(0.0f);
    }

    public FollowLiveVideoViewHolder(cf cfVar) {
        super(cfVar);
        this.f91492d = cfVar.f91766a.findViewById(R.id.q0);
    }

    public static float b(View view) {
        if (view.getContext() != null && gb.a(view.getContext())) {
            return (float) view.getContext().getResources().getDisplayMetrics().widthPixels;
        }
        float f2 = (float) (-view.getWidth());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return f2;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return (f2 - ((float) marginLayoutParams.leftMargin)) - ((float) marginLayoutParams.rightMargin);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        String aid;
        ag agVar;
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -906007925:
                    if (str.equals("live_window_clicked")) {
                        this.f91496h.stop();
                        if (this.f91493e.getVisibility() == 0) {
                            f(true);
                        }
                        if (this.f91515j != null && (aid = this.f91515j.getAid()) != null) {
                            this.aP = true;
                            Object b2 = at().b("key_open_live_aweme_list", (Object) null);
                            if (b2 == null) {
                                HashSet hashSet = new HashSet();
                                hashSet.add(aid);
                                at().a("key_open_live_aweme_list", hashSet);
                                return;
                            } else if (b2 instanceof Set) {
                                ((Set) b2).add(aid);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                case -162745511:
                    if (str.equals("feed_internal_event") && (agVar = (ag) bVar.a()) != null && agVar.f93450a == 19) {
                        this.f91496h.stop();
                        f(false);
                        this.aQ = true;
                        return;
                    }
                    return;
                case 1471092846:
                    if (str.equals("dismiss_live_window")) {
                        f(true);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(final View view, final View view2) {
        aR();
        AnimatorSet animatorSet = new AnimatorSet();
        this.aN = animatorSet;
        animatorSet.playTogether(c(view2), d(view));
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() {
            /* class com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder.AnonymousClass6 */

            static {
                Covode.recordClassIndex(57572);
            }

            public final void onAnimationCancel(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationEnd(Animator animator) {
                view.setVisibility(4);
            }

            public final void onAnimationStart(Animator animator) {
                view2.setVisibility(0);
            }
        });
        animatorSet.start();
    }
}
