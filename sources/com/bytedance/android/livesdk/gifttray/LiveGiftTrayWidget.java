package com.bytedance.android.livesdk.gifttray;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.gift.n;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.gifttray.a.a;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dj;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.model.message.aw;
import com.bytedance.android.livesdk.model.message.y;
import com.bytedance.android.livesdk.service.c.i.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Iterator;
import java.util.Map;

public final class LiveGiftTrayWidget extends AbsNormalGiftAnimWidget implements au {

    /* renamed from: b  reason: collision with root package name */
    final int f17988b = 1;

    /* renamed from: c  reason: collision with root package name */
    private LiveGiftTrayQueueView f17989c;

    static {
        Covode.recordClassIndex(9991);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bh0;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    public final void a() {
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
        if (liveGiftTrayQueueView != null) {
            b.a.C0467a.f21435a.f21434f += liveGiftTrayQueueView.f17980a.size();
            com.bytedance.android.livesdk.service.c.i.b bVar = b.a.C0467a.f21435a;
            int notCommonShowAmount = liveGiftTrayQueueView.getNotCommonShowAmount();
            bVar.f21432d += notCommonShowAmount;
            bVar.f21431c += notCommonShowAmount;
            com.bytedance.android.livesdk.service.c.i.b bVar2 = b.a.C0467a.f21435a;
            int notEffectShowAmount = liveGiftTrayQueueView.getNotEffectShowAmount();
            bVar2.f21433e += notEffectShowAmount;
            bVar2.f21431c += notEffectShowAmount;
            liveGiftTrayQueueView.f17980a.clear();
            liveGiftTrayQueueView.f17981b.clear();
            liveGiftTrayQueueView.f17984e.clear();
            liveGiftTrayQueueView.f17985f.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    public final void b() {
        DataChannel dataChannel;
        MethodCollector.i(11273);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
        if (liveGiftTrayQueueView != null) {
            Iterator<b> it = liveGiftTrayQueueView.f17982c.iterator();
            while (it.hasNext()) {
                b next = it.next();
                ViewGroup viewGroup = next.f18013f;
                if (viewGroup == null) {
                    l.a("mContainerView");
                }
                viewGroup.removeView(next.f18010c);
                if (next.f18015h) {
                    com.bytedance.android.livesdk.gifttray.c.a aVar = next.f18010c;
                    if (aVar != null) {
                        aVar.b();
                    }
                } else {
                    com.bytedance.android.livesdk.gifttray.c.a aVar2 = next.f18010c;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }
                next.f18010c = null;
                ViewGroup viewGroup2 = next.f18013f;
                if (viewGroup2 == null) {
                    l.a("mContainerView");
                }
                if (viewGroup2.getChildCount() == 0 && (dataChannel = next.f18011d) != null) {
                    dataChannel.c(n.class, true);
                }
                next.f18012e = null;
                next.f18009b = false;
                next.f18008a = true;
                next.f18016i = false;
                next.f18015h = false;
            }
            MethodCollector.o(11273);
            return;
        }
        MethodCollector.o(11273);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        boolean z;
        String str;
        String str2;
        Boolean bool;
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
        if (liveGiftTrayQueueView != null) {
            com.bytedance.android.livesdk.service.c.i.b bVar = b.a.C0467a.f21435a;
            DataChannel dataChannel = liveGiftTrayQueueView.f17983d;
            if (dataChannel == null || (bool = (Boolean) dataChannel.b(ee.class)) == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            int size = liveGiftTrayQueueView.f17980a.size();
            int notEffectShowAmount = liveGiftTrayQueueView.getNotEffectShowAmount();
            int notCommonShowAmount = liveGiftTrayQueueView.getNotCommonShowAmount();
            if (bVar.f21430b) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("gift_tray");
                f b2 = u.a().b();
                l.b(b2, "");
                b2.c();
                Map map = (Map) DataChannelGlobal.f34575d.b(dj.class);
                if (map == null || map.get("anchor_id") == null) {
                    Integer.valueOf(0);
                }
                int i2 = notEffectShowAmount + notCommonShowAmount;
                com.bytedance.android.livesdk.ab.b a3 = a2.a("is_anchor", 0).a().a("gift_tray_show", bVar.f21429a).a("gift_tray_not_show", i2).a("gift_tray_discard_rate", Float.valueOf(((float) i2) / ((float) (i2 + bVar.f21429a))));
                String str3 = "0";
                if (z) {
                    str = "1";
                } else {
                    str = str3;
                }
                com.bytedance.android.livesdk.ab.b a4 = a3.a("is_anchor", str);
                Map map2 = (Map) DataChannelGlobal.f34575d.b(dj.class);
                if (!(map2 == null || (str2 = (String) map2.get("anchor_id")) == null)) {
                    str3 = str2;
                }
                a4.a("anchor_id", str3).a("own_send_not_show", size).a("dropped_common_cnt", bVar.f21432d).a("dropped_effect_cnt", bVar.f21433e).a("not_show_common_cnt", notCommonShowAmount).a("not_show_effect_cnt", notEffectShowAmount).a("gift_tray_drop", bVar.f21431c).a("own_send_drop", bVar.f21434f).b();
                bVar.f21430b = false;
            }
            liveGiftTrayQueueView.f17980a.clear();
            liveGiftTrayQueueView.f17981b.clear();
            Iterator<b> it = liveGiftTrayQueueView.f17982c.iterator();
            while (it.hasNext()) {
                it.next();
            }
            liveGiftTrayQueueView.f17984e.clear();
            liveGiftTrayQueueView.f17985f.clear();
        }
    }

    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f17990a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f17991b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f17992c;

        static {
            Covode.recordClassIndex(9992);
        }

        public final void onAnimationCancel(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationRepeat(Animator animator) {
            l.d(animator, "");
        }

        public final void onAnimationEnd(Animator animator) {
            l.d(animator, "");
            if (!this.f17990a) {
                this.f17992c.setVisibility(8);
            }
        }

        public final void onAnimationStart(Animator animator) {
            l.d(animator, "");
            if (this.f17990a || !this.f17991b) {
                this.f17992c.setVisibility(0);
            }
        }

        a(boolean z, boolean z2, View view) {
            this.f17990a = z;
            this.f17991b = z2;
            this.f17992c = view;
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    public final void a(y yVar) {
        long j2;
        Room room;
        if (yVar != null && yVar.f19711m != 1) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
                j2 = 0;
            } else {
                j2 = room.getOwnerUserId();
            }
            com.bytedance.android.livesdk.gifttray.a.a a2 = com.bytedance.android.livesdk.gifttray.d.a.a(yVar, j2);
            LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
            if (liveGiftTrayQueueView != null) {
                liveGiftTrayQueueView.a(a2);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    public final void b(y yVar) {
        long j2;
        Room room;
        l.d(yVar, "");
        yVar.s = true;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (room = (Room) dataChannel.b(df.class)) == null) {
            j2 = 0;
        } else {
            j2 = room.getOwnerUserId();
        }
        com.bytedance.android.livesdk.gifttray.a.a a2 = com.bytedance.android.livesdk.gifttray.d.a.a(yVar, j2);
        a2.a(a.EnumC0374a.VIDEO_ONLY);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.a(a2);
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LiveGiftTrayWidget f17993a;

        static {
            Covode.recordClassIndex(9993);
        }

        b(LiveGiftTrayWidget liveGiftTrayWidget) {
            this.f17993a = liveGiftTrayWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            if (r3 != false) goto L_0x002e;
         */
        @Override // f.a.d.f
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r7) {
            /*
                r6 = this;
                com.bytedance.android.livesdk.event.g r7 = (com.bytedance.android.livesdk.event.g) r7
                if (r7 == 0) goto L_0x0021
                com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget r2 = r6.f17993a
                android.util.SparseBooleanArray r1 = r7.f17192a
                java.lang.String r0 = ""
                h.f.b.l.b(r1, r0)
                boolean r5 = r7.f17194c
                int r0 = r2.f17988b
                boolean r1 = r1.get(r0)
                android.content.Context r0 = r2.getContext()
                android.view.ViewGroup r4 = r2.containerView
                r3 = r1 ^ 1
                if (r0 == 0) goto L_0x0021
                if (r4 != 0) goto L_0x0022
            L_0x0021:
                return
            L_0x0022:
                if (r3 != 0) goto L_0x002e
                if (r5 == 0) goto L_0x002b
                r0 = 8
                r4.setVisibility(r0)
            L_0x002b:
                r1 = 0
                if (r3 == 0) goto L_0x0030
            L_0x002e:
                r1 = 1065353216(0x3f800000, float:1.0)
            L_0x0030:
                android.view.ViewPropertyAnimator r0 = r4.animate()
                android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
                r0 = 200(0xc8, double:9.9E-322)
                android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
                com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$a r0 = new com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget$a
                r0.<init>(r3, r5, r4)
                android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
                r0.start()
                goto L_0x0021
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gifttray.LiveGiftTrayWidget.b.accept(java.lang.Object):void");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        com.bytedance.android.livesdk.service.c.i.b bVar = b.a.C0467a.f21435a;
        bVar.f21430b = true;
        bVar.f21429a = 0;
        bVar.f21431c = 0;
        bVar.f21432d = 0;
        bVar.f21433e = 0;
        bVar.f21434f = 0;
        View view = this.contentView;
        if (!(view instanceof LiveGiftTrayQueueView)) {
            view = null;
        }
        LiveGiftTrayQueueView liveGiftTrayQueueView = (LiveGiftTrayQueueView) view;
        this.f17989c = liveGiftTrayQueueView;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.setDataCenter(this.dataChannel);
        }
        LiveGiftTrayQueueView liveGiftTrayQueueView2 = this.f17989c;
        if (liveGiftTrayQueueView2 != null) {
            b bVar2 = new b(0);
            b bVar3 = new b(1);
            bVar2.a(liveGiftTrayQueueView2);
            bVar3.a(liveGiftTrayQueueView2);
            bVar2.f18014g = liveGiftTrayQueueView2.f17986g;
            bVar3.f18014g = liveGiftTrayQueueView2.f17986g;
            bVar2.a(liveGiftTrayQueueView2.f17983d);
            bVar3.a(liveGiftTrayQueueView2.f17983d);
            liveGiftTrayQueueView2.f17982c.add(bVar2);
            liveGiftTrayQueueView2.f17982c.add(bVar3);
        }
        ((z) com.bytedance.android.livesdk.an.a.a().a(g.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.a(this))).a(new b(this));
    }

    @Override // com.bytedance.android.livesdk.gifttray.AbsNormalGiftAnimWidget
    public final void a(aw awVar) {
        l.d(awVar, "");
        l.d(awVar, "");
        y yVar = new y();
        yVar.f19707i = -999;
        yVar.n = awVar.f19217h;
        yVar.f19705g = awVar.f19214a;
        yVar.s = true;
        com.bytedance.android.livesdk.gifttray.a.a aVar = new com.bytedance.android.livesdk.gifttray.a.a(yVar);
        aVar.a(a.EnumC0374a.TRAY_ONLY);
        aVar.v = com.bytedance.android.livesdk.gifttray.d.b.a(awVar.f19215f);
        aVar.w = awVar.f19219j;
        aVar.z = awVar.f19214a;
        aVar.a(com.bytedance.android.livesdk.gifttray.d.b.a(awVar.f19216g));
        aVar.A = true;
        aVar.f17997d = awVar.f19217h;
        aVar.f18006m = com.bytedance.android.livesdk.utils.a.a.a();
        com.bytedance.android.livesdk.gifttray.d.a.a(aVar);
        LiveGiftTrayQueueView liveGiftTrayQueueView = this.f17989c;
        if (liveGiftTrayQueueView != null) {
            liveGiftTrayQueueView.a(aVar);
        }
    }
}
