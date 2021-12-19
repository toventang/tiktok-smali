package com.bytedance.android.live.slot;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.aq.d;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class FrameSlotWidget extends LiveRecyclableWidget implements IFrameSlot.a, bq, WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    FrameSlotController f12696a;

    /* renamed from: b  reason: collision with root package name */
    View f12697b;

    /* renamed from: c  reason: collision with root package name */
    IFrameSlot.c f12698c;

    /* renamed from: d  reason: collision with root package name */
    Queue<ah> f12699d;

    /* renamed from: e  reason: collision with root package name */
    Map<ah, IFrameSlot.SlotViewModel> f12700e;

    /* renamed from: f  reason: collision with root package name */
    private IFrameSlot.SlotViewModel f12701f;

    static {
        Covode.recordClassIndex(7064);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final void a(Throwable th) {
        br.a(this, th);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return 0;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.bq
    public final String g() {
        return getClass().getName();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IFrameSlot.SlotViewModel slotViewModel = this.f12701f;
        if (slotViewModel != null) {
            slotViewModel.a(this);
        }
        Map<ah, IFrameSlot.SlotViewModel> map = this.f12700e;
        if (map != null) {
            for (IFrameSlot.SlotViewModel slotViewModel2 : map.values()) {
                slotViewModel2.a(this);
            }
            this.f12700e.clear();
        }
        if (this.f12696a != null) {
            getLifecycle().b(this.f12696a);
            this.f12696a.onDestroy();
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.a
    public final void a(IFrameSlot.c cVar) {
        this.f12698c = cVar;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel.b(di.class) != null) {
            this.f12699d = new PriorityBlockingQueue(3, new Comparator<ah>() {
                /* class com.bytedance.android.live.slot.FrameSlotWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(7065);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // java.util.Comparator
                public final /* bridge */ /* synthetic */ int compare(ah ahVar, ah ahVar2) {
                    return ahVar.f12757a - ahVar2.f12757a;
                }
            });
            this.f12700e = new HashMap();
            g.b(new s(this), this);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.a
    public final void a(final ah ahVar, final IFrameSlot.SlotViewModel slotViewModel) {
        this.f12699d.add(ahVar);
        this.f12700e.put(ahVar, slotViewModel);
        final IFrameSlot iFrameSlot = (IFrameSlot) ahVar.f12758b.f();
        if (this.f12698c == IFrameSlot.c.LAST) {
            slotViewModel.f12709a.observe(this, new u<Pair<Boolean, String>>() {
                /* class com.bytedance.android.live.slot.FrameSlotWidget.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(7066);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // androidx.lifecycle.u
                public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                    MethodCollector.i(10787);
                    Pair<Boolean, String> pair2 = pair;
                    if (FrameSlotWidget.this.getView() == null || pair2 == null) {
                        MethodCollector.o(10787);
                        return;
                    }
                    if (Boolean.TRUE.equals(slotViewModel.f12710b.getValue()) || Boolean.TRUE.equals(pair2.first)) {
                        if (!Boolean.TRUE.equals(slotViewModel.f12710b.getValue()) && Boolean.TRUE.equals(pair2.first)) {
                            for (ah ahVar : FrameSlotWidget.this.f12699d) {
                                IFrameSlot.SlotViewModel slotViewModel = FrameSlotWidget.this.f12700e.get(ahVar);
                                if (ahVar != ahVar && Boolean.TRUE.equals(slotViewModel.f12710b.getValue())) {
                                    slotViewModel.f12710b.setValue(false);
                                }
                            }
                            slotViewModel.f12710b.setValue(true);
                        }
                        if (Boolean.TRUE.equals(pair2.first)) {
                            if (FrameSlotWidget.this.dataChannel != null) {
                                FrameSlotWidget.this.dataChannel.b(d.class, (Object) true);
                            }
                            ahVar.f12758b.a("during_live");
                            FrameSlotWidget.this.show();
                            if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                ((ViewGroup) FrameSlotWidget.this.getView()).removeAllViews();
                            }
                            FrameSlotWidget frameSlotWidget = FrameSlotWidget.this;
                            frameSlotWidget.f12697b = iFrameSlot.a(frameSlotWidget.getContext());
                            if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                ((ViewGroup) FrameSlotWidget.this.getView()).addView(FrameSlotWidget.this.f12697b);
                            }
                            FrameSlotWidget.this.f12697b.startAnimation(iFrameSlot.a());
                            if (FrameSlotWidget.this.f12697b != null && !FrameSlotWidget.this.f12697b.hasOnClickListeners()) {
                                FrameSlotWidget.this.f12697b.setOnClickListener(new View.OnClickListener() {
                                    /* class com.bytedance.android.live.slot.FrameSlotWidget.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(7067);
                                    }

                                    public final void onClick(View view) {
                                        if (!TextUtils.isEmpty(null)) {
                                            ((IHostAction) a.a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameSlotWidget.this.getContext());
                                        }
                                    }
                                });
                            }
                            MethodCollector.o(10787);
                            return;
                        } else if (FrameSlotWidget.this.f12697b != null) {
                            if (FrameSlotWidget.this.dataChannel != null) {
                                FrameSlotWidget.this.dataChannel.b(d.class, (Object) false);
                            }
                            Animation b2 = iFrameSlot.b();
                            if ("visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                                if (FrameSlotWidget.this.getView() instanceof ViewGroup) {
                                    ((ViewGroup) FrameSlotWidget.this.getView()).removeAllViews();
                                }
                                FrameSlotWidget.this.hide();
                                MethodCollector.o(10787);
                                return;
                            }
                            b2.setAnimationListener(new Animation.AnimationListener() {
                                /* class com.bytedance.android.live.slot.FrameSlotWidget.AnonymousClass2.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(7068);
                                }

                                public final void onAnimationRepeat(Animation animation) {
                                }

                                public final void onAnimationStart(Animation animation) {
                                }

                                public final void onAnimationEnd(Animation animation) {
                                    View view = FrameSlotWidget.this.getView();
                                    if (view != null) {
                                        view.post(new t(this, view));
                                    }
                                }
                            });
                            FrameSlotWidget.this.f12697b.startAnimation(b2);
                        }
                    }
                    MethodCollector.o(10787);
                }
            });
        }
    }
}
