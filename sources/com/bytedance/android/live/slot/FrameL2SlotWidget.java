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
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.aq.a;
import com.bytedance.android.livesdk.aq.e;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import f.a.b.b;
import java.util.Objects;

public class FrameL2SlotWidget extends LiveRecyclableWidget implements IFrameSlot.a, bq, WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    FrameSlotController f12651a;

    /* renamed from: b  reason: collision with root package name */
    public IFrameSlot f12652b;

    /* renamed from: c  reason: collision with root package name */
    IFrameSlot.SlotViewModel f12653c;

    /* renamed from: d  reason: collision with root package name */
    View f12654d;

    /* renamed from: e  reason: collision with root package name */
    boolean f12655e;

    /* renamed from: f  reason: collision with root package name */
    b f12656f;

    static {
        Covode.recordClassIndex(7048);
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.a
    public final void a(IFrameSlot.c cVar) {
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
        IFrameSlot.SlotViewModel slotViewModel = this.f12653c;
        if (slotViewModel != null) {
            slotViewModel.a(this);
        }
        b bVar = this.f12656f;
        if (bVar != null) {
            bVar.dispose();
        }
        if (this.dataChannel != null) {
            this.dataChannel.b(e.class, (Object) 0);
            this.dataChannel.b(a.class, (Object) false);
        }
        this.f12655e = false;
        if (this.f12651a != null) {
            getLifecycle().b(this.f12651a);
            this.f12651a.onDestroy();
        }
        if (this.dataChannel != null) {
            this.dataChannel.b(e.class, (Object) 0);
            this.dataChannel.b(a.class, (Object) false);
            this.dataChannel.b(this);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (this.dataChannel.b(di.class) != null) {
            g.b(new i(this), this);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.a
    public final void a(ah ahVar, IFrameSlot.SlotViewModel slotViewModel) {
        final ab abVar = ahVar.f12758b;
        this.f12652b = (IFrameSlot) abVar.f();
        this.f12653c = slotViewModel;
        slotViewModel.f12709a.observe(this, new u<Pair<Boolean, String>>() {
            /* class com.bytedance.android.live.slot.FrameL2SlotWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7050);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                MethodCollector.i(10099);
                Pair<Boolean, String> pair2 = pair;
                if (FrameL2SlotWidget.this.getView() == null || pair2 == null) {
                    MethodCollector.o(10099);
                    return;
                }
                if (Boolean.TRUE.equals(pair2.first)) {
                    if ((FrameL2SlotWidget.this.getView() instanceof ViewGroup) && (!FrameL2SlotWidget.this.isShowing() || ((ViewGroup) Objects.requireNonNull(FrameL2SlotWidget.this.getView())).getChildCount() <= 0)) {
                        ((ViewGroup) FrameL2SlotWidget.this.getView()).removeAllViews();
                        FrameL2SlotWidget frameL2SlotWidget = FrameL2SlotWidget.this;
                        frameL2SlotWidget.f12654d = frameL2SlotWidget.f12652b.a(FrameL2SlotWidget.this.getContext());
                        if (FrameL2SlotWidget.this.f12654d != null) {
                            ((ViewGroup) FrameL2SlotWidget.this.getView()).addView(FrameL2SlotWidget.this.f12654d);
                            if (!FrameL2SlotWidget.this.f12655e) {
                                abVar.a("during_live");
                                FrameL2SlotWidget.this.show();
                                if (FrameL2SlotWidget.this.dataChannel != null) {
                                    FrameL2SlotWidget.this.dataChannel.b(a.class, (Object) true);
                                }
                                FrameL2SlotWidget.this.f12654d.startAnimation(FrameL2SlotWidget.this.f12652b.a());
                                if (!FrameL2SlotWidget.this.f12654d.hasOnClickListeners()) {
                                    FrameL2SlotWidget.this.f12654d.setOnClickListener(new View.OnClickListener() {
                                        /* class com.bytedance.android.live.slot.FrameL2SlotWidget.AnonymousClass2.AnonymousClass1 */

                                        static {
                                            Covode.recordClassIndex(7051);
                                        }

                                        public final void onClick(View view) {
                                            if (!TextUtils.isEmpty(null)) {
                                                ((IHostAction) com.bytedance.android.live.t.a.a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameL2SlotWidget.this.getContext());
                                            }
                                        }
                                    });
                                }
                                FrameL2SlotWidget.this.f12654d.post(new Runnable() {
                                    /* class com.bytedance.android.live.slot.FrameL2SlotWidget.AnonymousClass2.AnonymousClass2 */

                                    static {
                                        Covode.recordClassIndex(7052);
                                    }

                                    public final void run() {
                                        if (FrameL2SlotWidget.this.dataChannel != null) {
                                            FrameL2SlotWidget.this.dataChannel.b(e.class, Integer.valueOf(FrameL2SlotWidget.this.f12654d.getHeight()));
                                        }
                                    }
                                });
                                MethodCollector.o(10099);
                                return;
                            }
                        }
                    }
                } else if (FrameL2SlotWidget.this.f12654d != null && FrameL2SlotWidget.this.isShowing()) {
                    Animation b2 = FrameL2SlotWidget.this.f12652b.b();
                    if ("visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                        if (FrameL2SlotWidget.this.getView() instanceof ViewGroup) {
                            ((ViewGroup) FrameL2SlotWidget.this.getView()).removeAllViews();
                            FrameL2SlotWidget.this.hide();
                        }
                        if (FrameL2SlotWidget.this.dataChannel != null) {
                            FrameL2SlotWidget.this.dataChannel.b(e.class, (Object) 0);
                            FrameL2SlotWidget.this.dataChannel.b(a.class, (Object) false);
                            MethodCollector.o(10099);
                            return;
                        }
                    } else {
                        b2.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.slot.FrameL2SlotWidget.AnonymousClass2.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(7053);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                View view = FrameL2SlotWidget.this.getView();
                                if (view != null) {
                                    view.post(new l(this, view));
                                }
                                if (FrameL2SlotWidget.this.dataChannel != null) {
                                    FrameL2SlotWidget.this.dataChannel.b(e.class, (Object) 0);
                                    FrameL2SlotWidget.this.dataChannel.b(a.class, (Object) false);
                                }
                            }
                        });
                        FrameL2SlotWidget.this.f12654d.startAnimation(b2);
                    }
                }
                MethodCollector.o(10099);
            }
        });
    }
}
