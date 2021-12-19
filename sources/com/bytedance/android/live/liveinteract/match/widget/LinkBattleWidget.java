package com.bytedance.android.live.liveinteract.match.widget;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Vibrator;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.i;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.live.liveinteract.cohost.ui.view.LinkCrossTitleLayout;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import com.bytedance.android.live.liveinteract.match.b.g.b;
import com.bytedance.android.live.liveinteract.match.b.g.c;
import com.bytedance.android.live.liveinteract.match.ui.view.BattleHealthBar;
import com.bytedance.android.live.liveinteract.match.ui.view.BattleMvpContainerLayout;
import com.bytedance.android.live.liveinteract.match.ui.view.MatchBonusTaskContainer;
import com.bytedance.android.live.liveinteract.match.ui.view.MatchWinStreaksView;
import com.bytedance.android.live.liveinteract.match.ui.view.MatchWinningStreaksIconView;
import com.bytedance.android.live.liveinteract.match.ui.view.PkBattleUserInfoLayout;
import com.bytedance.android.live.liveinteract.match.ui.view.TaskMarqueeTextView;
import com.bytedance.android.live.liveinteract.platform.common.g.b;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.container.config.base.PopupConfig;
import com.bytedance.android.livesdk.j.bg;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.livesetting.hybrid.LiveBattleContributeListLynxUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableBattleUiNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleContributeListUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import h.f.b.z;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class LinkBattleWidget extends SubWidget implements b.AbstractC0200b, com.bytedance.android.live.liveinteract.match.ui.c.a, com.bytedance.android.livesdk.like.d, com.ss.android.ugc.aweme.au {
    private static final long M;
    private static final long N;
    private static final float O;
    private static final float P;
    private static final float Q;
    private static final float R;
    public static final boolean x;
    public static final a y = new a((byte) 0);
    private final h.h C = h.i.a((h.f.a.a) q.f11017a);
    private com.bytedance.android.live.liveinteract.cohost.ui.b.b D;
    private com.bytedance.android.livesdk.container.e E;
    private com.bytedance.android.live.liveinteract.platform.common.view.a F;
    private MatchWinStreaksView G;
    private MatchWinStreaksView H;
    private MatchBonusTaskContainer I;
    private LinearLayout J;
    private TaskMarqueeTextView K;
    private long L;

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.android.live.liveinteract.match.ui.a.a f10976a;

    /* renamed from: b  reason: collision with root package name */
    com.bytedance.android.livesdk.l.b f10977b;

    /* renamed from: c  reason: collision with root package name */
    com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> f10978c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.live.liveinteract.platform.common.view.b<LinkCrossTitleLayout> f10979d;

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.android.live.liveinteract.platform.common.view.b<BattleMvpContainerLayout> f10980e;

    /* renamed from: f  reason: collision with root package name */
    public AppCompatImageView f10981f;

    /* renamed from: g  reason: collision with root package name */
    public LinearLayout f10982g;

    /* renamed from: h  reason: collision with root package name */
    public HSImageView f10983h;

    /* renamed from: i  reason: collision with root package name */
    public HSImageView f10984i;

    /* renamed from: j  reason: collision with root package name */
    HSImageView f10985j;

    /* renamed from: k  reason: collision with root package name */
    HSImageView f10986k;

    /* renamed from: l  reason: collision with root package name */
    public View f10987l;

    /* renamed from: m  reason: collision with root package name */
    public AppCompatImageView f10988m;
    public AppCompatImageView n;
    public LiveButton o;
    View p;
    public MatchWinningStreaksIconView q;
    public MatchWinningStreaksIconView r;
    com.bytedance.android.livesdk.like.b s;
    View t;
    public boolean u;
    public boolean v = true;
    public SpannableStringBuilder w;

    final /* synthetic */ class au implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ h.f.a.a f11005a;

        static {
            Covode.recordClassIndex(5895);
        }

        au(h.f.a.a aVar) {
            this.f11005a = aVar;
        }

        public final /* synthetic */ void run() {
            h.f.b.l.b(this.f11005a.invoke(), "");
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2, int i3, float f2, float f3, float f4, float f5) {
        h.f.b.l.d(bVar, "");
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    public final com.bytedance.android.live.liveinteract.match.b.g.b b() {
        return (com.bytedance.android.live.liveinteract.match.b.g.b) this.C.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.match.widget.SubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(5874);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class aa extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.match.b.b.c, h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aa(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x072f  */
        @Override // h.f.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.match.b.b.c r24) {
            /*
            // Method dump skipped, instructions count: 2238
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.aa.invoke(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b
    public final void a(com.bytedance.android.livesdk.model.message.b.h hVar, h.f.a.a<h.z> aVar) {
        Integer num;
        h.f.b.l.d(aVar, "");
        if (hVar != null) {
            num = Integer.valueOf(hVar.f19268b);
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                HSImageView hSImageView = this.f10985j;
                if (hSImageView == null) {
                    h.f.b.l.a("ivLeftAnimation");
                }
                a(hSImageView, new ag(this));
                HSImageView hSImageView2 = this.f10986k;
                if (hSImageView2 == null) {
                    h.f.b.l.a("ivRightAnimation");
                }
                b(hSImageView2, new ah(this));
                com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "showWinStreaks");
                if (!x) {
                    com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "pk old ui");
                } else {
                    MatchWinningStreaksIconView matchWinningStreaksIconView = this.q;
                    if (matchWinningStreaksIconView == null) {
                        h.f.b.l.a("winningStreakIconLeft");
                    }
                    if (matchWinningStreaksIconView.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView2 = this.q;
                        if (matchWinningStreaksIconView2 == null) {
                            h.f.b.l.a("winningStreakIconLeft");
                        }
                        matchWinningStreaksIconView2.a(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10682f);
                    }
                    MatchWinningStreaksIconView matchWinningStreaksIconView3 = this.r;
                    if (matchWinningStreaksIconView3 == null) {
                        h.f.b.l.a("winningStreakIconRight");
                    }
                    if (matchWinningStreaksIconView3.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView4 = this.r;
                        if (matchWinningStreaksIconView4 == null) {
                            h.f.b.l.a("winningStreakIconRight");
                        }
                        matchWinningStreaksIconView4.a(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10683g);
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.d dVar = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10682f;
                    if (dVar != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView5 = this.q;
                        if (matchWinningStreaksIconView5 == null) {
                            h.f.b.l.a("winningStreakIconLeft");
                        }
                        if (matchWinningStreaksIconView5.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView = this.G;
                            if (matchWinStreaksView == null) {
                                h.f.b.l.a("leftAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView6 = this.q;
                            if (matchWinningStreaksIconView6 == null) {
                                h.f.b.l.a("winningStreakIconLeft");
                            }
                            matchWinStreaksView.a(matchWinningStreaksIconView6.getInfo(), dVar);
                            MatchWinningStreaksIconView matchWinningStreaksIconView7 = this.q;
                            if (matchWinningStreaksIconView7 == null) {
                                h.f.b.l.a("winningStreakIconLeft");
                            }
                            matchWinningStreaksIconView7.a(dVar, true);
                        }
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.d dVar2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10683g;
                    if (dVar2 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView8 = this.r;
                        if (matchWinningStreaksIconView8 == null) {
                            h.f.b.l.a("winningStreakIconRight");
                        }
                        if (matchWinningStreaksIconView8.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView2 = this.H;
                            if (matchWinStreaksView2 == null) {
                                h.f.b.l.a("rightAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView9 = this.r;
                            if (matchWinningStreaksIconView9 == null) {
                                h.f.b.l.a("winningStreakIconRight");
                            }
                            matchWinStreaksView2.a(matchWinningStreaksIconView9.getInfo(), dVar2);
                            MatchWinningStreaksIconView matchWinningStreaksIconView10 = this.r;
                            if (matchWinningStreaksIconView10 == null) {
                                h.f.b.l.a("winningStreakIconRight");
                            }
                            matchWinningStreaksIconView10.a(dVar2, false);
                        }
                    }
                }
                aVar.invoke();
                return;
            } else if (num.intValue() == 1) {
                HSImageView hSImageView3 = this.f10985j;
                if (hSImageView3 == null) {
                    h.f.b.l.a("ivLeftAnimation");
                }
                b(hSImageView3, new ai(this));
                HSImageView hSImageView4 = this.f10986k;
                if (hSImageView4 == null) {
                    h.f.b.l.a("ivRightAnimation");
                }
                a(hSImageView4, new aj(this));
                com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "showWinStreaks");
                if (!x) {
                    com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "pk old ui");
                } else {
                    MatchWinningStreaksIconView matchWinningStreaksIconView11 = this.q;
                    if (matchWinningStreaksIconView11 == null) {
                        h.f.b.l.a("winningStreakIconLeft");
                    }
                    if (matchWinningStreaksIconView11.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView12 = this.q;
                        if (matchWinningStreaksIconView12 == null) {
                            h.f.b.l.a("winningStreakIconLeft");
                        }
                        matchWinningStreaksIconView12.a(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10682f);
                    }
                    MatchWinningStreaksIconView matchWinningStreaksIconView13 = this.r;
                    if (matchWinningStreaksIconView13 == null) {
                        h.f.b.l.a("winningStreakIconRight");
                    }
                    if (matchWinningStreaksIconView13.getVisibility() != 0) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView14 = this.r;
                        if (matchWinningStreaksIconView14 == null) {
                            h.f.b.l.a("winningStreakIconRight");
                        }
                        matchWinningStreaksIconView14.a(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10683g);
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.d dVar3 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10682f;
                    if (dVar3 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView15 = this.q;
                        if (matchWinningStreaksIconView15 == null) {
                            h.f.b.l.a("winningStreakIconLeft");
                        }
                        if (matchWinningStreaksIconView15.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView3 = this.G;
                            if (matchWinStreaksView3 == null) {
                                h.f.b.l.a("leftAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView16 = this.q;
                            if (matchWinningStreaksIconView16 == null) {
                                h.f.b.l.a("winningStreakIconLeft");
                            }
                            matchWinStreaksView3.a(matchWinningStreaksIconView16.getInfo(), dVar3);
                            MatchWinningStreaksIconView matchWinningStreaksIconView17 = this.q;
                            if (matchWinningStreaksIconView17 == null) {
                                h.f.b.l.a("winningStreakIconLeft");
                            }
                            matchWinningStreaksIconView17.a(dVar3, false);
                        }
                    }
                    com.bytedance.android.livesdkapi.depend.model.live.a.d dVar4 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10683g;
                    if (dVar4 != null) {
                        MatchWinningStreaksIconView matchWinningStreaksIconView18 = this.r;
                        if (matchWinningStreaksIconView18 == null) {
                            h.f.b.l.a("winningStreakIconRight");
                        }
                        if (matchWinningStreaksIconView18.getInfo() != null) {
                            MatchWinStreaksView matchWinStreaksView4 = this.H;
                            if (matchWinStreaksView4 == null) {
                                h.f.b.l.a("rightAnimationStreaks");
                            }
                            MatchWinningStreaksIconView matchWinningStreaksIconView19 = this.r;
                            if (matchWinningStreaksIconView19 == null) {
                                h.f.b.l.a("winningStreakIconRight");
                            }
                            matchWinStreaksView4.a(matchWinningStreaksIconView19.getInfo(), dVar4);
                            MatchWinningStreaksIconView matchWinningStreaksIconView20 = this.r;
                            if (matchWinningStreaksIconView20 == null) {
                                h.f.b.l.a("winningStreakIconRight");
                            }
                            matchWinningStreaksIconView20.a(dVar4, true);
                        }
                    }
                }
                aVar.invoke();
                return;
            }
        }
        HSImageView hSImageView5 = this.f10984i;
        if (hSImageView5 == null) {
            h.f.b.l.a("ivCenterAnimation2");
        }
        hSImageView5.setVisibility(0);
        if (x) {
            HSImageView hSImageView6 = this.f10984i;
            if (hSImageView6 == null) {
                h.f.b.l.a("ivCenterAnimation2");
            }
            ViewGroup.LayoutParams layoutParams = hSImageView6.getLayoutParams();
            layoutParams.width = com.bytedance.android.live.core.f.y.c();
            layoutParams.height = (int) (((float) com.bytedance.android.live.core.f.y.c()) * 0.54933333f);
            HSImageView hSImageView7 = this.f10984i;
            if (hSImageView7 == null) {
                h.f.b.l.a("ivCenterAnimation2");
            }
            hSImageView7.setLayoutParams(layoutParams);
        }
        ak akVar = new ak(this, aVar);
        HSImageView hSImageView8 = this.f10984i;
        if (hSImageView8 == null) {
            h.f.b.l.a("ivCenterAnimation2");
        }
        com.bytedance.android.live.core.f.k.a(hSImageView8, "tiktok_live_interaction_resource", "live_battle_draw_animation_2.webp");
        HSImageView hSImageView9 = this.f10984i;
        if (hSImageView9 == null) {
            h.f.b.l.a("ivCenterAnimation2");
        }
        hSImageView9.postDelayed(new au(akVar), N);
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b
    public final void a(com.bytedance.android.livesdkapi.depend.model.live.a.h hVar) {
        com.bytedance.android.livesdkapi.depend.model.live.a.f fVar;
        h.f.b.l.d(hVar, "");
        if (!this.B) {
            MatchBonusTaskContainer matchBonusTaskContainer = this.I;
            if (matchBonusTaskContainer == null) {
                h.f.b.l.a("pkBonusTaskLayout");
            }
            h.f.b.l.d(hVar, "");
            if (!(hVar.f23087a == null || hVar.f23088b == null || !EnableBattleEggSetting.INSTANCE.getValue())) {
                com.bytedance.android.live.core.c.a.a(3, "BattleTaskContainer", "audience init battleTask ".concat(String.valueOf(hVar)));
                RelativeLayout relativeLayout = matchBonusTaskContainer.f10887b;
                if (relativeLayout == null) {
                    h.f.b.l.a("rootView");
                }
                relativeLayout.post(new MatchBonusTaskContainer.f(matchBonusTaskContainer, hVar));
            }
            com.bytedance.android.livesdkapi.depend.model.live.a.c cVar = hVar.f23088b;
            if (cVar != null && (fVar = cVar.f23065f) != null && !TextUtils.isEmpty(fVar.f23083a)) {
                this.w = com.bytedance.android.live.liveinteract.match.ui.d.a.a(fVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        com.bytedance.android.livesdk.like.b bVar;
        if (!this.B && (bVar = this.s) != null) {
            if (z2) {
                bVar.b(this);
            }
            bVar.i();
            View b2 = bVar.b();
            com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> bVar2 = this.f10978c;
            if (bVar2 == null) {
                h.f.b.l.a("mHealthBarObserverView");
            }
            if (h.f.b.l.a(b2, ((BattleHealthBar) bVar2.f12070b).getLeftTextView())) {
                bVar.a(this.t);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b
    public final void a(com.bytedance.android.livesdk.model.message.an anVar) {
        h.f.b.l.d(anVar, "");
        com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.eck);
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b
    public final void a(String str) {
        h.f.b.l.d(str, "");
        d();
        com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> bVar = this.f10978c;
        if (bVar == null) {
            h.f.b.l.a("mHealthBarObserverView");
        }
        this.L = com.bytedance.android.live.design.view.j.a(bVar.f12070b, str, 15000);
    }

    static final class q extends h.f.b.m implements h.f.a.a<com.bytedance.android.live.liveinteract.match.b.g.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f11017a = new q();

        static {
            Covode.recordClassIndex(5912);
        }

        q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.live.liveinteract.match.b.g.b invoke() {
            return new com.bytedance.android.live.liveinteract.match.b.g.b();
        }
    }

    static final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11019a;

        static {
            Covode.recordClassIndex(5914);
        }

        s(LinkBattleWidget linkBattleWidget) {
            this.f11019a = linkBattleWidget;
        }

        public final void run() {
            this.f11019a.h();
        }
    }

    static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11020a;

        static {
            Covode.recordClassIndex(5915);
        }

        t(LinkBattleWidget linkBattleWidget) {
            this.f11020a = linkBattleWidget;
        }

        public final void run() {
            this.f11020a.h();
        }
    }

    static final class ad extends h.f.b.m implements h.f.a.a<h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f10990a = new ad();

        static {
            Covode.recordClassIndex(5878);
        }

        ad() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            com.bytedance.android.live.liveinteract.match.b.b.a.a("destroy", 0);
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class aq implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HSImageView f10998a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f10999b;

        static {
            Covode.recordClassIndex(5891);
        }

        aq(HSImageView hSImageView, h.f.a.a aVar) {
            this.f10998a = hSImageView;
            this.f10999b = aVar;
        }

        public final void run() {
            this.f10998a.setVisibility(8);
            h.f.a.a aVar = this.f10999b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class as implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HSImageView f11001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f11002b;

        static {
            Covode.recordClassIndex(5893);
        }

        as(HSImageView hSImageView, h.f.a.a aVar) {
            this.f11001a = hSImageView;
            this.f11002b = aVar;
        }

        public final void run() {
            this.f11001a.setVisibility(8);
            h.f.a.a aVar = this.f11002b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $callback;

        static {
            Covode.recordClassIndex(5909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(h.f.a.a aVar) {
            super(0);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            h.f.a.a aVar = this.$callback;
            if (aVar != null) {
                aVar.invoke();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $callback;

        static {
            Covode.recordClassIndex(5910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(h.f.a.a aVar) {
            super(0);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            h.f.a.a aVar = this.$callback;
            if (aVar != null) {
                aVar.invoke();
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $callback;

        static {
            Covode.recordClassIndex(5911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(h.f.a.a aVar) {
            super(0);
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ h.z invoke() {
            h.f.a.a aVar = this.$callback;
            if (aVar != null) {
                aVar.invoke();
            }
            return h.z.f158842a;
        }
    }

    private final void n() {
        com.bytedance.android.live.liveinteract.platform.common.g.b.b(b.a.POSITIVE_OVER);
        com.bytedance.android.live.liveinteract.match.b.g.b.b(b(), 101, true);
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        com.bytedance.android.livesdk.l.b bVar = this.f10977b;
        if (bVar != null && bVar.isShowing()) {
            bVar.dismiss();
        }
    }

    static final class ak extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ h.f.a.a $callback;
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ak(LinkBattleWidget linkBattleWidget, h.f.a.a aVar) {
            super(0);
            this.this$0 = linkBattleWidget;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            HSImageView hSImageView = this.this$0.f10984i;
            if (hSImageView == null) {
                h.f.b.l.a("ivCenterAnimation2");
            }
            hSImageView.setVisibility(8);
            this.$callback.invoke();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ b.EnumC0251b $requestFrom;
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LinkBattleWidget linkBattleWidget, b.EnumC0251b bVar) {
            super(0);
            this.this$0 = linkBattleWidget;
            this.$requestFrom = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            this.this$0.b().a(false, this.$requestFrom);
            b.a.a().aj = this.$requestFrom.getValue();
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (com.bytedance.android.live.design.view.j.b(this.L)) {
            com.bytedance.android.live.design.view.j.a(this.L);
        }
        this.L = 0;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        com.bytedance.android.livesdk.container.e eVar = this.E;
        if (eVar != null) {
            eVar.b();
        }
        this.E = null;
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        com.bytedance.android.live.liveinteract.match.ui.a.a aVar = this.f10976a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
        this.f10976a = null;
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar = this.D;
        if (bVar != null && bVar.n()) {
            bVar.dismiss();
        }
        this.D = null;
    }

    static final class ag extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ag(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
                LinkBattleWidget.d(this.this$0).setVisibility(0);
                AppCompatImageView d2 = LinkBattleWidget.d(this.this$0);
                if (LinkBattleWidget.x) {
                    i2 = 2131234811;
                } else {
                    i2 = 2131234810;
                }
                d2.setImageResource(i2);
            }
            return h.z.f158842a;
        }
    }

    static final class ah extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ah(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
                LinkBattleWidget.e(this.this$0).setVisibility(0);
                AppCompatImageView e2 = LinkBattleWidget.e(this.this$0);
                if (LinkBattleWidget.x) {
                    i2 = 2131234809;
                } else {
                    i2 = 2131234808;
                }
                e2.setImageResource(i2);
            }
            return h.z.f158842a;
        }
    }

    static final class ai extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ai(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
                LinkBattleWidget.d(this.this$0).setVisibility(0);
                AppCompatImageView d2 = LinkBattleWidget.d(this.this$0);
                if (LinkBattleWidget.x) {
                    i2 = 2131234809;
                } else {
                    i2 = 2131234808;
                }
                d2.setImageResource(i2);
            }
            return h.z.f158842a;
        }
    }

    static final class aj extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        aj(LinkBattleWidget linkBattleWidget) {
            super(0);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            int i2;
            if (com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a() == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
                LinkBattleWidget.e(this.this$0).setVisibility(0);
                AppCompatImageView e2 = LinkBattleWidget.e(this.this$0);
                if (LinkBattleWidget.x) {
                    i2 = 2131234811;
                } else {
                    i2 = 2131234810;
                }
                e2.setImageResource(i2);
            }
            return h.z.f158842a;
        }
    }

    static final class al extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ PkBattleUserInfoLayout $layoutPkBattleUserInfo;
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        al(LinkBattleWidget linkBattleWidget, PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(0);
            this.this$0 = linkBattleWidget;
            this.$layoutPkBattleUserInfo = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            PkBattleUserInfoLayout pkBattleUserInfoLayout = this.$layoutPkBattleUserInfo;
            h.f.b.l.b(pkBattleUserInfoLayout, "");
            pkBattleUserInfoLayout.setVisibility(0);
            LinkBattleWidget.f(this.this$0).setVisibility(0);
            LinkBattleWidget.g(this.this$0).setVisibility(0);
            com.bytedance.android.live.core.f.k.a(LinkBattleWidget.f(this.this$0), "tiktok_live_interaction_resource", "live_battle_start_animation_2.webp");
            return h.z.f158842a;
        }
    }

    static final class am extends h.f.b.m implements h.f.a.a<h.z> {
        final /* synthetic */ PkBattleUserInfoLayout $layoutPkBattleUserInfo;
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        am(LinkBattleWidget linkBattleWidget, PkBattleUserInfoLayout pkBattleUserInfoLayout) {
            super(0);
            this.this$0 = linkBattleWidget;
            this.$layoutPkBattleUserInfo = pkBattleUserInfoLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.z invoke() {
            LinkBattleWidget.f(this.this$0).setImageURI((String) null);
            PkBattleUserInfoLayout pkBattleUserInfoLayout = this.$layoutPkBattleUserInfo;
            h.f.b.l.b(pkBattleUserInfoLayout, "");
            pkBattleUserInfoLayout.setVisibility(8);
            LinkBattleWidget.f(this.this$0).setVisibility(8);
            LinkBattleWidget.g(this.this$0).setVisibility(8);
            return h.z.f158842a;
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11018a;

        static {
            Covode.recordClassIndex(5913);
        }

        r(LinkBattleWidget linkBattleWidget) {
            this.f11018a = linkBattleWidget;
        }

        public final void run() {
            LinkBattleWidget.c(this.f11018a).setVisibility(0);
            LinkBattleWidget.c(this.f11018a).b(R.style.sy);
            LinkBattleWidget.c(this.f11018a).setEnabled(true);
        }
    }

    static void f() {
        try {
            com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
            h.f.b.l.b(a2, "");
            ((com.bytedance.android.live.b.f) a2).getHybridDialogManager().a("link_battle");
        } catch (Exception e2) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "dismissMvpDialog, Exception: ".concat(String.valueOf(e2)));
        }
    }

    public final void h() {
        if (this.context != null) {
            boolean a2 = com.bytedance.android.live.liveinteract.match.b.b.a.a();
            com.bytedance.android.livesdk.chatroom.c.p pVar = new com.bytedance.android.livesdk.chatroom.c.p(0);
            pVar.f15138c = a2;
            pVar.f15137b = Integer.valueOf(LinkCrossRoomWidget.f10462a + LinkCrossRoomWidget.f10464c);
            pVar.f15139d = LinkCrossRoomWidget.f10465d;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(com.bytedance.android.live.liveinteract.api.t.class, pVar);
            }
        }
    }

    static {
        long j2;
        float f2;
        float f3;
        float f4;
        Covode.recordClassIndex(5873);
        boolean z2 = false;
        if (EnableBattleUiNewStyleSetting.INSTANCE.getValue() > 0) {
            z2 = true;
        }
        x = z2;
        long j3 = 3000;
        if (z2) {
            j2 = 3800;
        } else {
            j2 = 3000;
        }
        M = j2;
        if (z2) {
            j3 = 2600;
        }
        N = j3;
        if (z2) {
            f2 = 159.5f;
        } else {
            f2 = 187.0f;
        }
        O = f2;
        if (z2) {
            f3 = 192.5f;
        } else {
            f3 = 300.0f;
        }
        P = f3;
        float f5 = 147.0f;
        if (z2) {
            f4 = 147.0f;
        } else {
            f4 = 144.0f;
        }
        Q = f4;
        if (!z2) {
            f5 = 156.0f;
        }
        R = f5;
    }

    private final void l() {
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar;
        j();
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.b.b();
        this.D = bVar2;
        bVar2.f10241a = com.bytedance.android.live.core.f.y.a((int) R.string.e80);
        bVar2.f10242b = com.bytedance.android.live.core.f.y.a((int) R.string.e81);
        bVar2.f10243c = 2;
        bVar2.f10245e = com.bytedance.android.live.core.f.y.a((int) R.string.e9e);
        bVar2.f10244d = com.bytedance.android.live.core.f.y.a((int) R.string.e82);
        bVar2.a(b());
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(com.bytedance.android.livesdk.j.ao.class);
        if (iVar != null && (bVar = this.D) != null) {
            bVar.show(iVar, "InteractDisconnectDialog");
        }
    }

    private final void m() {
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar;
        j();
        com.bytedance.android.live.liveinteract.cohost.ui.b.b bVar2 = new com.bytedance.android.live.liveinteract.cohost.ui.b.b();
        this.D = bVar2;
        bVar2.f10241a = com.bytedance.android.live.core.f.y.a((int) R.string.e_o);
        bVar2.f10242b = com.bytedance.android.live.core.f.y.a((int) R.string.e_p);
        bVar2.f10243c = 2;
        bVar2.f10245e = com.bytedance.android.live.core.f.y.a((int) R.string.e9e);
        bVar2.f10244d = com.bytedance.android.live.core.f.y.a((int) R.string.e_q);
        bVar2.a(b());
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) this.dataChannel.b(com.bytedance.android.livesdk.j.ao.class);
        if (iVar != null && (bVar = this.D) != null) {
            bVar.show(iVar, "InteractDisconnectDialog");
        }
    }

    public final void c() {
        com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "updateMuteView, currentState = " + a2 + ", guestMute = " + this.z.ae);
        if (a2 != com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL && a2 != com.bytedance.android.live.liveinteract.match.b.b.c.END) {
            if (this.z.ae) {
                if (this.v) {
                    AppCompatImageView appCompatImageView = this.f10981f;
                    if (appCompatImageView == null) {
                        h.f.b.l.a("ivMuteView");
                    }
                    appCompatImageView.setVisibility(0);
                }
                AppCompatImageView appCompatImageView2 = this.f10981f;
                if (appCompatImageView2 == null) {
                    h.f.b.l.a("ivMuteView");
                }
                appCompatImageView2.setImageResource(2131234710);
                if (this.B) {
                    com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ea6);
                    return;
                }
                Room room = this.A;
                h.f.b.l.b(room, "");
                User owner = room.getOwner();
                if (owner != null) {
                    String string = this.context.getString(R.string.ea5);
                    h.f.b.l.b(string, "");
                    String a3 = com.a.a(string, Arrays.copyOf(new Object[]{owner.displayId}, 1));
                    h.f.b.l.b(a3, "");
                    com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), a3, 0);
                }
            } else if (this.B) {
                if (this.v) {
                    AppCompatImageView appCompatImageView3 = this.f10981f;
                    if (appCompatImageView3 == null) {
                        h.f.b.l.a("ivMuteView");
                    }
                    appCompatImageView3.setVisibility(0);
                }
                AppCompatImageView appCompatImageView4 = this.f10981f;
                if (appCompatImageView4 == null) {
                    h.f.b.l.a("ivMuteView");
                }
                appCompatImageView4.setImageResource(2131234711);
            } else {
                AppCompatImageView appCompatImageView5 = this.f10981f;
                if (appCompatImageView5 == null) {
                    h.f.b.l.a("ivMuteView");
                }
                appCompatImageView5.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        com.bytedance.android.live.core.c.a.a(3, "LinkPKWidgetTag", "onDestroy,  channelId = " + this.z.f9940e);
        if (!this.B) {
            com.bytedance.android.live.liveinteract.platform.common.g.b.a("onDestroy");
        }
        com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> bVar = this.f10978c;
        if (bVar == null) {
            h.f.b.l.a("mHealthBarObserverView");
        }
        if (bVar.f12070b != null) {
            com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> bVar2 = this.f10978c;
            if (bVar2 == null) {
                h.f.b.l.a("mHealthBarObserverView");
            }
            ((BattleHealthBar) bVar2.f12070b).a();
        }
        i();
        j();
        k();
        d();
        f();
        e();
        if (this.B) {
            a(104, false, (h.f.a.a<h.z>) ad.f10990a);
        } else {
            com.bytedance.android.live.liveinteract.match.b.b.a.a("destroy", 0);
        }
        a(true);
        b().b();
        com.bytedance.android.live.liveinteract.platform.common.view.a aVar = this.F;
        if (aVar == null) {
            h.f.b.l.a("mObserverViewManager");
        }
        aVar.a();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.liveinteract.match.ui.c.a
    public final void a() {
        com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "onBattleClick, state = ".concat(String.valueOf(a2)));
        com.bytedance.android.live.liveinteract.platform.common.g.b.a();
        if (a2 != com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.EnumC0251b.PK_ICON, false);
        }
        if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.NORMAL) {
            a(b.EnumC0251b.PK_ICON);
        } else if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.INVITED) {
            l();
        } else if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.RECEIVED) {
            com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ecz);
        } else if (com.bytedance.android.live.liveinteract.match.b.b.c.START.compareTo((Enum) a2) <= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) < 0) {
            m();
        } else if (com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH.compareTo((Enum) a2) <= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.END) < 0) {
            n();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.widget.SubWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        int i2;
        Boolean bool;
        IMessageManager iMessageManager;
        boolean z2;
        Boolean bool2;
        super.onCreate();
        boolean z3 = false;
        com.bytedance.android.live.liveinteract.match.b.b.a.a("create", 0);
        com.bytedance.android.live.liveinteract.platform.common.view.a aVar = new com.bytedance.android.live.liveinteract.platform.common.view.a(this.dataChannel, getView());
        this.F = aVar;
        b.a a2 = aVar.a(R.id.fiz);
        a2.f12073b = new c(this);
        com.bytedance.android.live.liveinteract.platform.common.view.b<BattleHealthBar> a3 = a2.b(com.bytedance.android.live.liveinteract.match.b.c.d.class, f.f11009a).b(com.bytedance.android.live.liveinteract.match.b.c.j.class, g.f11010a).a();
        h.f.b.l.b(a3, "");
        this.f10978c = a3;
        com.bytedance.android.live.liveinteract.platform.common.view.a aVar2 = this.F;
        if (aVar2 == null) {
            h.f.b.l.a("mObserverViewManager");
        }
        b.a a4 = aVar2.a(R.id.c6c);
        a4.f12073b = h.f11011a;
        com.bytedance.android.live.liveinteract.platform.common.view.b<LinkCrossTitleLayout> a5 = a4.b(com.bytedance.android.live.liveinteract.match.b.c.m.class, i.f11012a).b(com.bytedance.android.live.liveinteract.match.b.c.h.class, j.f11013a).a();
        h.f.b.l.b(a5, "");
        this.f10979d = a5;
        com.bytedance.android.live.liveinteract.platform.common.view.a aVar3 = this.F;
        if (aVar3 == null) {
            h.f.b.l.a("mObserverViewManager");
        }
        b.a a6 = aVar3.a(R.id.c72);
        a6.f12073b = new k(this);
        com.bytedance.android.live.liveinteract.platform.common.view.b<BattleMvpContainerLayout> a7 = a6.b(com.bytedance.android.live.liveinteract.match.b.c.f.class, l.f11015a).b(com.bytedance.android.live.liveinteract.match.b.c.g.class, m.f11016a).b(com.bytedance.android.live.liveinteract.match.b.c.c.class, d.f11007a).b(com.bytedance.android.live.liveinteract.match.b.c.a.class, e.f11008a).a();
        h.f.b.l.b(a7, "");
        this.f10980e = a7;
        View findViewById = findViewById(R.id.c78);
        h.f.b.l.b(findViewById, "");
        this.f10982g = (LinearLayout) findViewById;
        View findViewById2 = findViewById(R.id.bz_);
        h.f.b.l.b(findViewById2, "");
        this.f10981f = (AppCompatImageView) findViewById2;
        if (x) {
            i2 = R.id.buy;
        } else {
            i2 = R.id.bux;
        }
        View findViewById3 = findViewById(i2);
        h.f.b.l.b(findViewById3, "");
        this.f10983h = (HSImageView) findViewById3;
        View findViewById4 = findViewById(R.id.buw);
        h.f.b.l.b(findViewById4, "");
        this.f10984i = (HSImageView) findViewById4;
        View findViewById5 = findViewById(R.id.byj);
        h.f.b.l.b(findViewById5, "");
        this.f10985j = (HSImageView) findViewById5;
        View findViewById6 = findViewById(R.id.c0m);
        h.f.b.l.b(findViewById6, "");
        this.f10986k = (HSImageView) findViewById6;
        View findViewById7 = findViewById(R.id.fmk);
        h.f.b.l.b(findViewById7, "");
        this.G = (MatchWinStreaksView) findViewById7;
        View findViewById8 = findViewById(R.id.fml);
        h.f.b.l.b(findViewById8, "");
        this.H = (MatchWinStreaksView) findViewById8;
        View findViewById9 = findViewById(R.id.d53);
        h.f.b.l.b(findViewById9, "");
        this.f10987l = findViewById9;
        View findViewById10 = findViewById(R.id.byl);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById10;
        h.f.b.l.b(appCompatImageView, "");
        u.a(appCompatImageView);
        h.f.b.l.b(findViewById10, "");
        this.f10988m = appCompatImageView;
        View findViewById11 = findViewById(R.id.c0p);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById11;
        h.f.b.l.b(appCompatImageView2, "");
        u.a(appCompatImageView2);
        h.f.b.l.b(findViewById11, "");
        this.n = appCompatImageView2;
        View findViewById12 = findViewById(R.id.c6a);
        h.f.b.l.b(findViewById12, "");
        MatchWinningStreaksIconView matchWinningStreaksIconView = (MatchWinningStreaksIconView) findViewById12;
        this.q = matchWinningStreaksIconView;
        if (matchWinningStreaksIconView == null) {
            h.f.b.l.a("winningStreakIconLeft");
        }
        matchWinningStreaksIconView.setOnClicked(new x(this));
        View findViewById13 = findViewById(R.id.c7n);
        h.f.b.l.b(findViewById13, "");
        MatchWinningStreaksIconView matchWinningStreaksIconView2 = (MatchWinningStreaksIconView) findViewById13;
        this.r = matchWinningStreaksIconView2;
        if (matchWinningStreaksIconView2 == null) {
            h.f.b.l.a("winningStreakIconRight");
        }
        matchWinningStreaksIconView2.setOnClicked(new y(this));
        View findViewById14 = findViewById(R.id.xw);
        h.f.b.l.b(findViewById14, "");
        this.o = (LiveButton) findViewById14;
        View findViewById15 = findViewById(R.id.c4z);
        h.f.b.l.b(findViewById15, "");
        this.p = findViewById15;
        View findViewById16 = findViewById(R.id.c73);
        h.f.b.l.b(findViewById16, "");
        MatchBonusTaskContainer matchBonusTaskContainer = (MatchBonusTaskContainer) findViewById16;
        this.I = matchBonusTaskContainer;
        if (matchBonusTaskContainer == null) {
            h.f.b.l.a("pkBonusTaskLayout");
        }
        DataChannel dataChannel = this.dataChannel;
        matchBonusTaskContainer.n = dataChannel;
        matchBonusTaskContainer.o = new com.bytedance.android.live.liveinteract.match.b.g.c(dataChannel);
        com.bytedance.android.live.liveinteract.match.b.g.c cVar = matchBonusTaskContainer.o;
        if (cVar == null) {
            h.f.b.l.a("mPresenter");
        }
        h.f.b.l.d(matchBonusTaskContainer, "");
        cVar.f10781c = matchBonusTaskContainer;
        if (EnableBattleEggSetting.INSTANCE.getValue()) {
            DataChannel dataChannel2 = cVar.C;
            if (dataChannel2 != null) {
                iMessageManager = (IMessageManager) dataChannel2.b(cg.class);
            } else {
                iMessageManager = null;
            }
            cVar.f10782d = iMessageManager;
            IMessageManager iMessageManager2 = cVar.f10782d;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.LINK_MIC_BATTLE_TASK.getIntType(), cVar);
            }
            cVar.f10783e = (Room) DataChannelGlobal.f34575d.b(com.bytedance.android.livesdk.j.ac.class);
            DataChannel dataChannel3 = cVar.C;
            if (dataChannel3 == null || (bool2 = (Boolean) dataChannel3.b(ee.class)) == null) {
                z2 = false;
            } else {
                z2 = bool2.booleanValue();
            }
            cVar.f10780b = z2;
            DataChannel dataChannel4 = cVar.C;
            if (dataChannel4 != null) {
                dataChannel4.a(com.bytedance.android.live.liveinteract.match.b.c.m.class, (h.f.a.b) new c.C0201c(cVar)).a(com.bytedance.android.livesdk.gift.d.e.class, (h.f.a.b) new c.d(cVar)).a(com.bytedance.android.live.liveinteract.match.b.c.l.class, (h.f.a.b) new c.e(cVar));
            }
        }
        DataChannel dataChannel5 = matchBonusTaskContainer.n;
        if (!(dataChannel5 == null || (bool = (Boolean) dataChannel5.b(ee.class)) == null)) {
            z3 = bool.booleanValue();
        }
        matchBonusTaskContainer.q = z3;
        if (com.bytedance.android.live.uikit.c.a.a(matchBonusTaskContainer.getContext())) {
            HSAnimImageView hSAnimImageView = matchBonusTaskContainer.f10898m;
            if (hSAnimImageView == null) {
                h.f.b.l.a("supportAnim");
            }
            hSAnimImageView.setRotation(180.0f);
        }
        if (matchBonusTaskContainer.q) {
            HSAnimImageView hSAnimImageView2 = matchBonusTaskContainer.f10898m;
            if (hSAnimImageView2 == null) {
                h.f.b.l.a("supportAnim");
            }
            hSAnimImageView2.setVisibility(8);
        } else {
            HSAnimImageView hSAnimImageView3 = matchBonusTaskContainer.f10898m;
            if (hSAnimImageView3 == null) {
                h.f.b.l.a("supportAnim");
            }
            hSAnimImageView3.a(HSAnimImageView.f9268i.a("tiktok_live_interaction_resource", "ttlive_pk_task_arrow.webp"));
        }
        View findViewById17 = findViewById(R.id.cha);
        h.f.b.l.b(findViewById17, "");
        this.J = (LinearLayout) findViewById17;
        View findViewById18 = findViewById(R.id.f91);
        h.f.b.l.b(findViewById18, "");
        this.K = (TaskMarqueeTextView) findViewById18;
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.a((Object) this, bg.class, (h.f.a.b) new z(this)).a((Object) this, com.bytedance.android.live.liveinteract.match.b.c.l.class, (h.f.a.b) new aa(this)).a((Object) this, com.bytedance.android.live.liveinteract.match.b.c.i.class, (h.f.a.b) new ab(this));
        }
        b().a((b.AbstractC0200b) this);
        LiveButton liveButton = this.o;
        if (liveButton == null) {
            h.f.b.l.a("btnReMatch");
        }
        liveButton.setOnClickListener(new ac(this));
        AppCompatImageView appCompatImageView3 = this.f10981f;
        if (appCompatImageView3 == null) {
            h.f.b.l.a("ivMuteView");
        }
        appCompatImageView3.setOnClickListener(new v(this));
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.g.class).a(WidgetExtendsKt.autoDispose(this))).a(new w(this));
    }

    static final class h<V extends View> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        public static final h f11011a = new h();

        static {
            Covode.recordClassIndex(5902);
        }

        h() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.c
        public final /* synthetic */ void a(View view) {
            h.f.b.l.d(view, "");
        }
    }

    static final class u extends h.f.b.m implements h.f.a.b<AppCompatImageView, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f11021a = new u();

        static {
            Covode.recordClassIndex(5916);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AppCompatImageView appCompatImageView) {
            a(appCompatImageView);
            return h.z.f158842a;
        }

        public static void a(AppCompatImageView appCompatImageView) {
            float f2;
            float f3;
            float f4;
            h.f.b.l.d(appCompatImageView, "");
            ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.a aVar = (ConstraintLayout.a) layoutParams;
            if (LinkBattleWidget.x) {
                f2 = 70.0f;
                f3 = 76.0f;
                f4 = 10.0f;
            } else {
                f2 = 60.0f;
                f3 = 80.0f;
                f4 = 16.0f;
            }
            aVar.width = com.bytedance.android.live.core.f.y.a(f2);
            aVar.height = com.bytedance.android.live.core.f.y.a(f3);
            aVar.bottomMargin = com.bytedance.android.live.core.f.y.a(f4);
            appCompatImageView.setLayoutParams(aVar);
        }
    }

    static final class ac implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f10989a;

        static {
            Covode.recordClassIndex(5877);
        }

        ac(LinkBattleWidget linkBattleWidget) {
            this.f10989a = linkBattleWidget;
        }

        public final void onClick(View view) {
            com.bytedance.android.live.liveinteract.platform.common.g.b.c();
            com.bytedance.android.live.liveinteract.match.c.a.b();
            com.bytedance.android.live.liveinteract.match.b.g.b.a(this.f10989a.b());
        }
    }

    static final class ae implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f10991a = new ae();

        static {
            Covode.recordClassIndex(5879);
        }

        ae() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "openMvpDialog, Fragment on dismiss");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ar implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final ar f11000a = new ar();

        static {
            Covode.recordClassIndex(5892);
        }

        ar() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "openMvpDialog, Fragment on dismiss");
        }
    }

    static final class k<V extends View> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11014a;

        static {
            Covode.recordClassIndex(5905);
        }

        k(LinkBattleWidget linkBattleWidget) {
            this.f11014a = linkBattleWidget;
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.c
        public final /* synthetic */ void a(View view) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            h.f.b.l.d(battleMvpContainerLayout, "");
            battleMvpContainerLayout.setClickCallback(new h.f.a.b<Boolean, h.z>(this) {
                /* class com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget.k.AnonymousClass1 */
                final /* synthetic */ k this$0;

                static {
                    Covode.recordClassIndex(5906);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ h.z invoke(Boolean bool) {
                    boolean z;
                    boolean z2;
                    String str;
                    boolean z3;
                    String queryParameter;
                    boolean booleanValue = bool.booleanValue();
                    LinkBattleWidget linkBattleWidget = this.this$0.f11014a;
                    boolean z4 = false;
                    linkBattleWidget.u = false;
                    String value = LiveInteractBattleContributeListUrlSetting.INSTANCE.getValue();
                    Uri.Builder a2 = linkBattleWidget.a(booleanValue, value);
                    String value2 = LiveBattleContributeListLynxUrlSetting.INSTANCE.getValue();
                    if (value2 == null || value2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "openMvpDialog, lynxurl = ".concat(String.valueOf(value2)));
                        Uri.Builder a3 = linkBattleWidget.a(booleanValue, value2);
                        Uri parse = Uri.parse(a3.toString());
                        if (!(parse == null || (queryParameter = parse.getQueryParameter("fallback_url")) == null)) {
                            value = queryParameter;
                        }
                        Uri.Builder a4 = linkBattleWidget.a(booleanValue, value);
                        com.bytedance.android.live.b.m e2 = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).createLynxDialogBuilder(a3.toString(), a4.toString()).a(LinkBattleWidget.a(parse, "radius", 8), LinkBattleWidget.a(parse, "radius", 8)).b(LinkBattleWidget.a(parse, "height", 402)).a(LinkBattleWidget.a(parse, "width", (int) com.bytedance.android.live.core.f.y.e(com.bytedance.android.live.core.f.y.c()))).c(LinkBattleWidget.a(parse, "margin", 0)).e(80);
                        if (LinkBattleWidget.a(parse, "show_close", 0) == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        com.bytedance.android.live.b.m a5 = e2.d(z2).a("link_battle");
                        if (parse == null || (str = parse.toString()) == null) {
                            str = "";
                        }
                        h.f.b.l.b(str, "");
                        com.bytedance.android.live.b.m c2 = a5.c(str);
                        if (LinkBattleWidget.a(parse, "landscape_custom_height", 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        com.bytedance.android.live.b.m a6 = c2.a(z3).a(new af(linkBattleWidget, a4));
                        int a7 = LinkBattleWidget.a(parse, "show_dim", -1);
                        if (a7 != -1) {
                            if (a7 == 1) {
                                z4 = true;
                            }
                            a6 = a6.b(z4);
                        }
                        com.bytedance.android.live.core.widget.a a8 = a6.a();
                        a8.f9304d = ae.f10991a;
                        Context context = linkBattleWidget.context;
                        if (context != null) {
                            if (!(context instanceof Activity)) {
                                com.bytedance.android.live.base.a a9 = com.bytedance.android.live.t.a.a(IHostApp.class);
                                h.f.b.l.b(a9, "");
                                context = ((IHostApp) a9).getTopActivity();
                            }
                            androidx.fragment.app.e b2 = com.bytedance.android.live.core.f.a.b(context);
                            if (b2 != null) {
                                com.bytedance.android.live.core.widget.a.a(b2, a8);
                            }
                        }
                    } else {
                        com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "openMvpDialog, url = ".concat(String.valueOf(value)));
                        String builder = a2.toString();
                        h.f.b.l.b(builder, "");
                        linkBattleWidget.c(builder);
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    public static final /* synthetic */ MatchWinningStreaksIconView b(LinkBattleWidget linkBattleWidget) {
        MatchWinningStreaksIconView matchWinningStreaksIconView = linkBattleWidget.r;
        if (matchWinningStreaksIconView == null) {
            h.f.b.l.a("winningStreakIconRight");
        }
        return matchWinningStreaksIconView;
    }

    public static final /* synthetic */ LiveButton c(LinkBattleWidget linkBattleWidget) {
        LiveButton liveButton = linkBattleWidget.o;
        if (liveButton == null) {
            h.f.b.l.a("btnReMatch");
        }
        return liveButton;
    }

    public static final /* synthetic */ AppCompatImageView d(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.f10988m;
        if (appCompatImageView == null) {
            h.f.b.l.a("ivLeftResult");
        }
        return appCompatImageView;
    }

    public static final /* synthetic */ AppCompatImageView e(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.n;
        if (appCompatImageView == null) {
            h.f.b.l.a("ivRightResult");
        }
        return appCompatImageView;
    }

    public static final /* synthetic */ HSImageView f(LinkBattleWidget linkBattleWidget) {
        HSImageView hSImageView = linkBattleWidget.f10983h;
        if (hSImageView == null) {
            h.f.b.l.a("ivCenterAnimation");
        }
        return hSImageView;
    }

    public static final /* synthetic */ View g(LinkBattleWidget linkBattleWidget) {
        View view = linkBattleWidget.f10987l;
        if (view == null) {
            h.f.b.l.a("imgPKBgView");
        }
        return view;
    }

    public static final /* synthetic */ AppCompatImageView h(LinkBattleWidget linkBattleWidget) {
        AppCompatImageView appCompatImageView = linkBattleWidget.f10981f;
        if (appCompatImageView == null) {
            h.f.b.l.a("ivMuteView");
        }
        return appCompatImageView;
    }

    public static final /* synthetic */ LinearLayout i(LinkBattleWidget linkBattleWidget) {
        LinearLayout linearLayout = linkBattleWidget.f10982g;
        if (linearLayout == null) {
            h.f.b.l.a("profileLayout");
        }
        return linearLayout;
    }

    static final class x extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            this.this$0.b(str2);
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.this$0.B, LinkBattleWidget.a(this.this$0).getInfo());
            return h.z.f158842a;
        }
    }

    static final class y extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5920);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            String str2 = str;
            h.f.b.l.d(str2, "");
            this.this$0.b(str2);
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.this$0.B, LinkBattleWidget.b(this.this$0).getInfo());
            return h.z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinkBattleWidget(View view) {
        super(view);
        h.f.b.l.d(view, "");
    }

    public static final /* synthetic */ MatchWinningStreaksIconView a(LinkBattleWidget linkBattleWidget) {
        MatchWinningStreaksIconView matchWinningStreaksIconView = linkBattleWidget.q;
        if (matchWinningStreaksIconView == null) {
            h.f.b.l.a("winningStreakIconLeft");
        }
        return matchWinningStreaksIconView;
    }

    static final class af implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f10992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Uri.Builder f10993b;

        static {
            Covode.recordClassIndex(5880);
        }

        af(LinkBattleWidget linkBattleWidget, Uri.Builder builder) {
            this.f10992a = linkBattleWidget;
            this.f10993b = builder;
        }

        @Override // com.bytedance.android.live.b.f.a
        public final void a(String str) {
            com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "openMvpDialog, fallback lynx to webview");
            if (!this.f10992a.u) {
                LinkBattleWidget linkBattleWidget = this.f10992a;
                if (str == null) {
                    str = this.f10993b.toString();
                    h.f.b.l.b(str, "");
                }
                linkBattleWidget.c(str);
                this.f10992a.u = true;
            }
        }
    }

    public static final class at implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ConstraintLayout f11004b;

        static {
            Covode.recordClassIndex(5894);
        }

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            this.f11003a.v = false;
            LinkBattleWidget.h(this.f11003a).setVisibility(8);
            LinkBattleWidget.i(this.f11003a).setVisibility(8);
            LinkBattleWidget.b(this.f11003a).setVisibility(8);
            LinkBattleWidget.a(this.f11003a).setVisibility(8);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f11003a.v = true;
            ConstraintLayout constraintLayout = this.f11004b;
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            if (this.f11003a.B) {
                LinkBattleWidget.h(this.f11003a).setVisibility(0);
            } else if (this.f11003a.z.ae) {
                LinkBattleWidget.h(this.f11003a).setVisibility(0);
            }
            LinkBattleWidget.i(this.f11003a).setVisibility(0);
            LinkBattleWidget.b(this.f11003a).setVisibility(0);
            LinkBattleWidget.a(this.f11003a).setVisibility(0);
            this.f11003a.w = null;
        }

        at(LinkBattleWidget linkBattleWidget, ConstraintLayout constraintLayout) {
            this.f11003a = linkBattleWidget;
            this.f11004b = constraintLayout;
        }
    }

    static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11023a;

        static {
            Covode.recordClassIndex(5918);
        }

        w(LinkBattleWidget linkBattleWidget) {
            this.f11023a = linkBattleWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (TextUtils.equals(((com.bytedance.android.live.liveinteract.api.b.g) obj).f9984a, com.bytedance.android.live.liveinteract.api.b.g.f9981d) && this.f11023a.B && LinkBattleWidget.c(this.f11023a).getVisibility() == 0 && LinkBattleWidget.c(this.f11023a).isEnabled()) {
                com.bytedance.android.live.liveinteract.platform.common.g.b.c();
                com.bytedance.android.live.liveinteract.match.c.a.b();
                com.bytedance.android.live.liveinteract.match.b.g.b.a(this.f11023a.b());
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.match.b.g.b.AbstractC0200b
    public final void b(Throwable th) {
        if (!(th instanceof com.bytedance.android.live.a.a.b.a) || ((com.bytedance.android.live.a.a.a) th).getErrorCode() != 4004049) {
            com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.go2);
        } else {
            com.bytedance.android.live.liveinteract.match.b.g.b.a(b(), 108, true);
        }
    }

    static final class ab extends h.f.b.m implements h.f.a.b<com.bytedance.android.live.liveinteract.match.b.b.c, h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5876);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ab(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.android.live.liveinteract.match.b.b.c cVar) {
            com.bytedance.android.live.liveinteract.match.b.b.c cVar2 = cVar;
            h.f.b.l.d(cVar2, "");
            com.bytedance.android.live.core.c.a.a(4, "LinkPKWidgetTag", "onChanged, current  state = ".concat(String.valueOf(cVar2)));
            if (a.f11024a[cVar2.ordinal()] != 1) {
                LinkBattleWidget.c(this.this$0).b(R.style.ss);
                LinkBattleWidget.c(this.this$0).setEnabled(false);
            } else {
                LinkBattleWidget.c(this.this$0).b(R.style.sy);
                LinkBattleWidget.c(this.this$0).setEnabled(true);
            }
            return h.z.f158842a;
        }
    }

    static final class c<V extends View> implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11006a;

        static {
            Covode.recordClassIndex(5897);
        }

        c(LinkBattleWidget linkBattleWidget) {
            this.f11006a = linkBattleWidget;
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.c
        public final /* synthetic */ void a(View view) {
            Long l2;
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            h.f.b.l.d(battleHealthBar, "");
            Object obj = null;
            battleHealthBar.setLayerType(1, null);
            DataChannel dataChannel = this.f11006a.dataChannel;
            com.bytedance.android.live.liveinteract.api.a.b bVar = this.f11006a.z;
            boolean z = this.f11006a.B;
            battleHealthBar.f10848d = bVar;
            battleHealthBar.f10849e = z;
            battleHealthBar.f10850f = dataChannel;
            DataChannel dataChannel2 = battleHealthBar.f10850f;
            if (dataChannel2 != null) {
                dataChannel2.a(com.bytedance.android.live.liveinteract.match.b.c.m.class, (h.f.a.b) new BattleHealthBar.c(battleHealthBar)).a(com.bytedance.android.live.liveinteract.match.b.c.l.class, (h.f.a.b) new BattleHealthBar.d(battleHealthBar)).a(com.bytedance.android.live.liveinteract.match.b.c.b.class, (h.f.a.b) new BattleHealthBar.e(battleHealthBar));
            }
            DataChannel dataChannel3 = battleHealthBar.f10850f;
            if (dataChannel3 != null) {
                obj = dataChannel3.b(com.bytedance.android.live.liveinteract.match.b.c.l.class);
            }
            if (obj == com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH) {
                battleHealthBar.b();
                return;
            }
            DataChannel dataChannel4 = battleHealthBar.f10850f;
            if (dataChannel4 != null && (l2 = (Long) dataChannel4.b(com.bytedance.android.live.liveinteract.match.b.c.m.class)) != null) {
                long longValue = l2.longValue();
                if (longValue != 0 && longValue < LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue()) {
                    battleHealthBar.b();
                }
            }
        }
    }

    static final class v implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f11022a;

        static {
            Covode.recordClassIndex(5917);
        }

        v(LinkBattleWidget linkBattleWidget) {
            this.f11022a = linkBattleWidget;
        }

        public final void onClick(View view) {
            if (this.f11022a.B) {
                boolean z = !this.f11022a.z.ae;
                DataChannel dataChannel = this.f11022a.dataChannel;
                if (dataChannel != null) {
                    dataChannel.b(com.bytedance.android.live.liveinteract.match.b.c.e.class, Boolean.valueOf(z));
                }
                HashMap hashMap = new HashMap();
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(hashMap);
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(true, false, (Map<String, String>) hashMap);
                hashMap.put("right_user_id", String.valueOf(b.a.a().f9941f));
                com.bytedance.android.live.liveinteract.platform.common.g.b.a("livesdk_pk_mute_button_click", hashMap);
                return;
            }
            this.f11022a.c();
        }
    }

    static final class z extends h.f.b.m implements h.f.a.b<String, h.z> {
        final /* synthetic */ LinkBattleWidget this$0;

        static {
            Covode.recordClassIndex(5921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(LinkBattleWidget linkBattleWidget) {
            super(1);
            this.this$0 = linkBattleWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(String str) {
            h.f.b.l.d(str, "");
            com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
            if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.INVITED || a2 == com.bytedance.android.live.liveinteract.match.b.b.c.START) {
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(b.EnumC0251b.PK_GUIDE, false);
            }
            if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.INVITED) {
                com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.ed0);
            } else if (com.bytedance.android.live.liveinteract.match.b.b.c.START.compareTo((Enum) a2) > 0 || a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.END) >= 0) {
                this.this$0.a(b.EnumC0251b.PK_GUIDE);
            } else {
                com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.e_t);
            }
            return h.z.f158842a;
        }
    }

    public final void c(String str) {
        com.bytedance.android.livesdk.browser.c.d webViewManager;
        com.bytedance.android.live.core.widget.a a2;
        d.b a3 = com.bytedance.android.livesdk.browser.c.e.a(str).a(8, 8, 0, 0);
        a3.f14310k = -1;
        a3.t = true;
        a3.f14302c = 402;
        a3.f14301b = (int) com.bytedance.android.live.core.f.y.e(com.bytedance.android.live.core.f.y.c());
        a3.f14309j = 80;
        a3.D = "link_battle";
        com.bytedance.android.live.b.f fVar = (com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class);
        if (fVar != null && (webViewManager = fVar.webViewManager()) != null && (a2 = webViewManager.a(a3)) != null && (this.context instanceof androidx.fragment.app.e)) {
            a2.f9304d = ar.f11000a;
            com.bytedance.android.live.core.widget.a.a(com.bytedance.android.livesdk.utils.p.a(this.context), a2);
        }
    }

    public final void b(String str) {
        if (this.context != null) {
            com.bytedance.android.livesdk.container.e createHybridDialog = ((com.bytedance.android.live.b.f) com.bytedance.android.live.t.a.a(com.bytedance.android.live.b.f.class)).createHybridDialog(new PopupConfig(Uri.parse(str)));
            if (!(this.context instanceof Activity)) {
                com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IHostApp.class);
                h.f.b.l.b(a2, "");
                this.context = ((IHostApp) a2).getTopActivity();
            }
            androidx.fragment.app.e b2 = com.bytedance.android.live.core.f.a.b(this.context);
            if (b2 != null) {
                e();
                createHybridDialog.a(b2);
                this.E = createHybridDialog;
            }
        }
    }

    public final void a(b.EnumC0251b bVar) {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.bU;
        h.f.b.l.b(bVar2, "");
        Boolean a2 = bVar2.a();
        h.f.b.l.b(a2, "");
        if (a2.booleanValue()) {
            b().a(false, bVar);
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(bVar, true);
            b.a.a().aj = bVar.getValue();
            return;
        }
        Context context = this.context;
        h.f.b.l.b(context, "");
        com.bytedance.android.live.liveinteract.match.ui.a.a aVar = new com.bytedance.android.live.liveinteract.match.ui.a.a(context);
        this.f10976a = aVar;
        aVar.a(bVar);
        com.bytedance.android.live.liveinteract.match.ui.a.a aVar2 = this.f10976a;
        if (aVar2 != null) {
            aVar2.f10820a = new b(this, bVar);
        }
        com.bytedance.android.live.liveinteract.match.ui.a.a aVar3 = this.f10976a;
        if (aVar3 != null) {
            aVar3.show();
        }
        com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.bU;
        h.f.b.l.b(bVar3, "");
        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar3, (Object) true);
    }

    static final class ap implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f10997a;

        static {
            Covode.recordClassIndex(5890);
        }

        ap(z.e eVar) {
            this.f10997a = eVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f10997a.element = (T) Boolean.valueOf(z);
        }
    }

    static final class ao implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.e f10996a;

        static {
            Covode.recordClassIndex(5889);
        }

        ao(z.e eVar) {
            this.f10996a = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cb;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, this.f10996a.element);
            T t = this.f10996a.element;
            h.f.b.l.b(t, "");
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(t.booleanValue(), false);
        }
    }

    static final class f<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f11009a = new f();

        static {
            Covode.recordClassIndex(5900);
        }

        f() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            int intValue = ((Number) obj).intValue();
            h.f.b.l.d(battleHealthBar, "");
            if (battleHealthBar.getLeftValue() != intValue) {
                battleHealthBar.setLeftValue(intValue);
            }
        }
    }

    static final class g<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f11010a = new g();

        static {
            Covode.recordClassIndex(5901);
        }

        g() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleHealthBar battleHealthBar = (BattleHealthBar) view;
            int intValue = ((Number) obj).intValue();
            h.f.b.l.d(battleHealthBar, "");
            if (battleHealthBar.getRightValue() != intValue) {
                battleHealthBar.setRightValue(intValue);
            }
        }
    }

    static final class l<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final l f11015a = new l();

        static {
            Covode.recordClassIndex(5907);
        }

        l() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            List<com.bytedance.android.livesdk.model.message.b.o> list = (List) obj;
            h.f.b.l.d(battleMvpContainerLayout, "");
            h.f.b.l.d(list, "");
            battleMvpContainerLayout.a(true, list);
        }
    }

    static final class m<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final m f11016a = new m();

        static {
            Covode.recordClassIndex(5908);
        }

        m() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            List<com.bytedance.android.livesdk.model.message.b.o> list = (List) obj;
            h.f.b.l.d(battleMvpContainerLayout, "");
            h.f.b.l.d(list, "");
            battleMvpContainerLayout.a(false, list);
        }
    }

    static final class an implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinkBattleWidget f10994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f10995b;

        static {
            Covode.recordClassIndex(5888);
        }

        an(LinkBattleWidget linkBattleWidget, z.e eVar) {
            this.f10994a = linkBattleWidget;
            this.f10995b = eVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cb;
            h.f.b.l.b(bVar, "");
            com.bytedance.android.livesdk.ap.c.a(bVar, this.f10995b.element);
            this.f10994a.b().d();
            T t = this.f10995b.element;
            h.f.b.l.b(t, "");
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(t.booleanValue(), true);
        }
    }

    @Override // com.bytedance.android.livesdk.like.d
    public final void a(com.bytedance.android.livesdk.like.b bVar, int i2) {
        h.f.b.l.d(bVar, "");
        com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.f10689m = false;
        a(false);
    }

    static final class d<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final d f11007a = new d();

        static {
            Covode.recordClassIndex(5898);
        }

        d() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleMvpContainerLayout.b bVar;
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            h.f.b.l.d(battleMvpContainerLayout, "");
            BattleMvpContainerLayout.b bVar2 = battleMvpContainerLayout.f10869c;
            if (bVar2 != null) {
                bVar2.a(false);
            }
            if (booleanValue) {
                bVar = (BattleMvpContainerLayout.b) h.a.n.h((List) battleMvpContainerLayout.f10870d);
            } else {
                bVar = (BattleMvpContainerLayout.b) h.a.n.h((List) battleMvpContainerLayout.f10871e);
            }
            battleMvpContainerLayout.f10869c = bVar;
            BattleMvpContainerLayout.b bVar3 = battleMvpContainerLayout.f10869c;
            if (bVar3 != null && !bVar3.f10878a) {
                if (BattleMvpContainerLayout.f10865f) {
                    battleMvpContainerLayout.postDelayed(new BattleMvpContainerLayout.d(battleMvpContainerLayout), 3800);
                    return;
                }
                BattleMvpContainerLayout.b bVar4 = battleMvpContainerLayout.f10869c;
                if (bVar4 != null) {
                    bVar4.a(true);
                }
            }
        }
    }

    static final class e<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11008a = new e();

        static {
            Covode.recordClassIndex(5899);
        }

        e() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            BattleMvpContainerLayout battleMvpContainerLayout = (BattleMvpContainerLayout) view;
            int intValue = ((Number) obj).intValue();
            h.f.b.l.d(battleMvpContainerLayout, "");
            if (intValue <= 0) {
                battleMvpContainerLayout.setAlpha(1.0f);
            }
            LinearLayout linearLayout = (LinearLayout) battleMvpContainerLayout.a(R.id.c69);
            h.f.b.l.b(linearLayout, "");
            int measuredWidth = linearLayout.getMeasuredWidth();
            LinearLayout linearLayout2 = (LinearLayout) battleMvpContainerLayout.a(R.id.c7l);
            h.f.b.l.b(linearLayout2, "");
            if (((com.bytedance.android.live.core.f.y.c() - measuredWidth) - linearLayout2.getMeasuredWidth()) - com.bytedance.android.live.core.f.y.a(30.0f) < intValue) {
                battleMvpContainerLayout.setAlpha(0.2f);
            } else {
                battleMvpContainerLayout.setAlpha(1.0f);
            }
        }
    }

    static final class j<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final j f11013a = new j();

        static {
            Covode.recordClassIndex(5904);
        }

        j() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
            long longValue = ((Number) obj).longValue();
            h.f.b.l.d(linkCrossTitleLayout, "");
            ConstraintLayout constraintLayout = (ConstraintLayout) linkCrossTitleLayout.a(R.id.c4w);
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) linkCrossTitleLayout.a(R.id.c4x);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(0);
            HSImageView hSImageView = (HSImageView) linkCrossTitleLayout.a(R.id.by6);
            h.f.b.l.b(hSImageView, "");
            hSImageView.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) linkCrossTitleLayout.a(R.id.f4i);
            h.f.b.l.b(liveTextView, "");
            liveTextView.setText(com.bytedance.android.livesdk.utils.an.b(longValue));
        }
    }

    private static void a(HSImageView hSImageView, h.f.a.a<h.z> aVar) {
        hSImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = com.bytedance.android.live.core.f.y.a(O);
        layoutParams2.height = com.bytedance.android.live.core.f.y.a(P);
        if (x) {
            layoutParams2.bottomMargin = com.bytedance.android.live.core.f.y.a(21.0f);
        } else {
            layoutParams2.bottomMargin = com.bytedance.android.live.core.f.y.a(0.0f);
        }
        hSImageView.setLayoutParams(layoutParams2);
        Runnable asVar = new as(hSImageView, aVar);
        com.bytedance.android.live.core.f.k.a(hSImageView, "tiktok_live_interaction_resource", "live_battle_win_animation_2.webp");
        hSImageView.postDelayed(asVar, M);
    }

    private static void b(HSImageView hSImageView, h.f.a.a<h.z> aVar) {
        hSImageView.setVisibility(0);
        ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = com.bytedance.android.live.core.f.y.a(Q);
        layoutParams2.height = com.bytedance.android.live.core.f.y.a(R);
        if (x) {
            layoutParams2.bottomMargin = com.bytedance.android.live.core.f.y.a(21.0f);
        } else {
            layoutParams2.bottomMargin = com.bytedance.android.live.core.f.y.a(0.0f);
        }
        hSImageView.setLayoutParams(layoutParams2);
        Runnable aqVar = new aq(hSImageView, aVar);
        com.bytedance.android.live.core.f.k.a(hSImageView, "tiktok_live_interaction_resource", "live_battle_lose_animation_2.webp");
        hSImageView.postDelayed(aqVar, M);
    }

    /* access modifiers changed from: package-private */
    public final Uri.Builder a(boolean z2, String str) {
        long j2;
        if (z2) {
            Room room = this.A;
            h.f.b.l.b(room, "");
            j2 = room.getOwnerUserId();
        } else {
            j2 = this.z.f9941f;
        }
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        h.f.b.l.b(b2, "");
        long c2 = b2.c();
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("channel_id", String.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.c()));
        buildUpon.appendQueryParameter("anchor_id", String.valueOf(j2));
        buildUpon.appendQueryParameter("is_anchor", String.valueOf(this.B ? 1 : 0));
        buildUpon.appendQueryParameter("user_id", String.valueOf(c2));
        buildUpon.appendQueryParameter("height", "402");
        buildUpon.appendQueryParameter("battle_id", String.valueOf(com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.b()));
        h.f.b.l.b(buildUpon, "");
        return buildUpon;
    }

    static final class i<V extends View, T> implements b.AbstractC0253b {

        /* renamed from: a  reason: collision with root package name */
        public static final i f11012a = new i();

        static {
            Covode.recordClassIndex(5903);
        }

        i() {
        }

        @Override // com.bytedance.android.live.liveinteract.platform.common.view.b.AbstractC0253b
        public final /* synthetic */ void a(View view, Object obj) {
            LinkCrossTitleLayout linkCrossTitleLayout = (LinkCrossTitleLayout) view;
            long longValue = ((Number) obj).longValue();
            h.f.b.l.d(linkCrossTitleLayout, "");
            ConstraintLayout constraintLayout = (ConstraintLayout) linkCrossTitleLayout.a(R.id.c4w);
            h.f.b.l.b(constraintLayout, "");
            constraintLayout.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) linkCrossTitleLayout.a(R.id.c4x);
            h.f.b.l.b(linearLayout, "");
            linearLayout.setVisibility(8);
            HSImageView hSImageView = (HSImageView) linkCrossTitleLayout.a(R.id.by6);
            h.f.b.l.b(hSImageView, "");
            hSImageView.setVisibility(8);
            LiveTextView liveTextView = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
            h.f.b.l.b(liveTextView, "");
            liveTextView.setAlpha(1.0f);
            long value = LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue();
            if (longValue <= value) {
                ((LiveTextView) linkCrossTitleLayout.a(R.id.f4h)).setTextColor(androidx.core.content.b.c(linkCrossTitleLayout.getContext(), R.color.me));
                float f2 = ((((float) (value - longValue)) / ((float) value)) * 6.0f) + 14.0f;
                LiveTextView liveTextView2 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView2, "");
                liveTextView2.setTextSize(f2);
                ((LiveTextView) linkCrossTitleLayout.a(R.id.f4h)).setTextSize(0, (float) com.bytedance.android.live.core.f.y.a(f2));
                LiveTextView liveTextView3 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView3, "");
                liveTextView3.setGravity(17);
                LiveTextView liveTextView4 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView4, "");
                liveTextView4.setText(String.valueOf(longValue));
                ((LiveTextView) linkCrossTitleLayout.a(R.id.f4h)).setTextSize(0, (float) com.bytedance.android.live.core.f.y.a(19.0f));
                if (longValue == 10) {
                    try {
                        Object a2 = LinkCrossTitleLayout.a(linkCrossTitleLayout.getContext(), "vibrator");
                        if (a2 != null) {
                            ((Vibrator) a2).vibrate(50);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
                        }
                    } catch (Exception unused) {
                    }
                }
                LiveTextView liveTextView5 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView5, "");
                LinkCrossTitleLayout.b bVar = new LinkCrossTitleLayout.b(linkCrossTitleLayout);
                LinkCrossTitleLayout.c cVar = new LinkCrossTitleLayout.c(liveTextView5);
                LinkCrossTitleLayout.d dVar = new LinkCrossTitleLayout.d(liveTextView5);
                LinkCrossTitleLayout.e eVar = new LinkCrossTitleLayout.e(cVar);
                LinkCrossTitleLayout.f fVar = new LinkCrossTitleLayout.f(cVar);
                LinkCrossTitleLayout.g gVar = new LinkCrossTitleLayout.g(dVar);
                LinkCrossTitleLayout.h hVar = new LinkCrossTitleLayout.h(dVar);
                LinkCrossTitleLayout.i iVar = new LinkCrossTitleLayout.i(linkCrossTitleLayout, bVar, eVar, gVar);
                LinkCrossTitleLayout.j jVar = new LinkCrossTitleLayout.j(linkCrossTitleLayout, bVar, fVar, hVar);
                if (longValue == 0) {
                    iVar.a();
                } else {
                    jVar.a();
                }
            } else {
                ((LiveTextView) linkCrossTitleLayout.a(R.id.f4h)).setTextColor(androidx.core.content.b.c(linkCrossTitleLayout.getContext(), R.color.w5));
                ((LiveTextView) linkCrossTitleLayout.a(R.id.f4h)).setTextSize(0, (float) com.bytedance.android.live.core.f.y.a(14.0f));
                LiveTextView liveTextView6 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView6, "");
                liveTextView6.setGravity(17);
                LiveTextView liveTextView7 = (LiveTextView) linkCrossTitleLayout.a(R.id.f4h);
                h.f.b.l.b(liveTextView7, "");
                liveTextView7.setText(com.bytedance.android.livesdk.utils.an.b(longValue));
            }
        }
    }

    static int a(Uri uri, String str, int i2) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i2;
        }
        return Integer.parseInt(queryParameter);
    }

    public final void a(int i2, boolean z2, h.f.a.a<h.z> aVar) {
        b.a aVar2;
        b.a aVar3;
        com.bytedance.android.live.liveinteract.match.b.b.c a2 = com.bytedance.android.live.liveinteract.match.b.b.a.f10674a.a();
        if (a2 == com.bytedance.android.live.liveinteract.match.b.b.c.INVITED) {
            b().a(new n(aVar));
        } else if (com.bytedance.android.live.liveinteract.match.b.b.c.START.compareTo((Enum) a2) <= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.FINISH) < 0) {
            if (this.B) {
                if (b.a.a().Q) {
                    aVar3 = b.a.POSITIVE_OVER;
                } else {
                    aVar3 = b.a.NEGATIVE_OVER;
                }
                com.bytedance.android.live.liveinteract.platform.common.g.b.a(aVar3);
            }
            b().a(i2, true, z2, new o(aVar));
        } else if (com.bytedance.android.live.liveinteract.match.b.b.c.PUNISH.compareTo((Enum) a2) <= 0 && a2.compareTo((Enum) com.bytedance.android.live.liveinteract.match.b.b.c.END) < 0) {
            if (b.a.a().Q) {
                aVar2 = b.a.POSITIVE_OVER;
            } else {
                aVar2 = b.a.NEGATIVE_OVER;
            }
            com.bytedance.android.live.liveinteract.platform.common.g.b.b(aVar2);
            b().a(i2, true, (h.f.a.a<h.z>) new p(aVar));
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
