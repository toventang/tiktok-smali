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
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.u.g;
import com.bytedance.android.livesdk.aq.c;
import com.bytedance.android.livesdk.chatroom.viewmodule.bq;
import com.bytedance.android.livesdk.chatroom.viewmodule.br;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.b;

public class FrameL3SlotWidget extends LiveRecyclableWidget implements IFrameSlot.a, bq, WeakHandler.IHandler, au {

    /* renamed from: a  reason: collision with root package name */
    FrameSlotController f12664a;

    /* renamed from: b  reason: collision with root package name */
    public IFrameSlot f12665b;

    /* renamed from: c  reason: collision with root package name */
    IFrameSlot.SlotViewModel f12666c;

    /* renamed from: d  reason: collision with root package name */
    View f12667d;

    /* renamed from: e  reason: collision with root package name */
    b f12668e;

    /* renamed from: f  reason: collision with root package name */
    b f12669f;

    /* renamed from: g  reason: collision with root package name */
    boolean f12670g;

    /* renamed from: h  reason: collision with root package name */
    int f12671h;

    static {
        Covode.recordClassIndex(7054);
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

    /* access modifiers changed from: package-private */
    public final void a() {
        IFrameSlot.SlotViewModel slotViewModel;
        if (getView() != null && this.f12667d != null && (slotViewModel = this.f12666c) != null && slotViewModel.f12709a.getValue() != null && ((Boolean) this.f12666c.f12709a.getValue().first).booleanValue()) {
            final boolean z = true;
            if (this.f12671h > 1 || this.f12670g) {
                z = false;
                hide();
            } else {
                show();
            }
            this.dataChannel.b(c.class, Boolean.valueOf(z));
            this.f12667d.post(new Runnable() {
                /* class com.bytedance.android.live.slot.FrameL3SlotWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(7055);
                }

                public final void run() {
                    int i2;
                    if (FrameL3SlotWidget.this.dataChannel != null) {
                        DataChannel dataChannel = FrameL3SlotWidget.this.dataChannel;
                        if (z) {
                            i2 = FrameL3SlotWidget.this.f12667d.getHeight();
                        } else {
                            i2 = 0;
                        }
                        dataChannel.b(com.bytedance.android.livesdk.aq.b.class, Integer.valueOf(i2));
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        IFrameSlot.SlotViewModel slotViewModel = this.f12666c;
        if (slotViewModel != null) {
            slotViewModel.a(this);
        }
        b bVar = this.f12668e;
        if (bVar != null) {
            bVar.dispose();
        }
        b bVar2 = this.f12669f;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        if (this.dataChannel != null) {
            this.dataChannel.b(c.class, (Object) false);
            this.dataChannel.b(com.bytedance.android.livesdk.aq.b.class, (Object) 0);
        }
        this.f12670g = false;
        this.f12671h = 0;
        if (this.f12664a != null) {
            getLifecycle().b(this.f12664a);
            this.f12664a.onDestroy();
        }
        if (this.dataChannel != null) {
            this.dataChannel.b(c.class, (Object) false);
            this.dataChannel.b(com.bytedance.android.livesdk.aq.b.class, (Object) 0);
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
            g.b(new m(this), this);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (getView() != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getView().getLayoutParams();
            marginLayoutParams.bottomMargin = Math.max(y.d(R.dimen.zc), i2);
            getView().setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot.a
    public final void a(ah ahVar, IFrameSlot.SlotViewModel slotViewModel) {
        final ab abVar = ahVar.f12758b;
        this.f12665b = (IFrameSlot) abVar.f();
        this.f12666c = slotViewModel;
        slotViewModel.f12709a.observe(this, new u<Pair<Boolean, String>>() {
            /* class com.bytedance.android.live.slot.FrameL3SlotWidget.AnonymousClass2 */

            static {
                Covode.recordClassIndex(7056);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.u
            public final /* synthetic */ void onChanged(Pair<Boolean, String> pair) {
                MethodCollector.i(10096);
                Pair<Boolean, String> pair2 = pair;
                if (FrameL3SlotWidget.this.getView() == null || pair2 == null) {
                    MethodCollector.o(10096);
                    return;
                }
                if (Boolean.TRUE.equals(pair2.first)) {
                    if ((FrameL3SlotWidget.this.getView() instanceof ViewGroup) && (!FrameL3SlotWidget.this.isShowing() || ((ViewGroup) FrameL3SlotWidget.this.getView()).getChildCount() <= 0)) {
                        ((ViewGroup) FrameL3SlotWidget.this.getView()).removeAllViews();
                        FrameL3SlotWidget frameL3SlotWidget = FrameL3SlotWidget.this;
                        frameL3SlotWidget.f12667d = frameL3SlotWidget.f12665b.a(FrameL3SlotWidget.this.getContext());
                        if (FrameL3SlotWidget.this.f12667d != null) {
                            ((ViewGroup) FrameL3SlotWidget.this.getView()).addView(FrameL3SlotWidget.this.f12667d);
                            if (FrameL3SlotWidget.this.f12670g || FrameL3SlotWidget.this.f12671h > 1) {
                                MethodCollector.o(10096);
                                return;
                            }
                            abVar.a("during_live");
                            FrameL3SlotWidget.this.show();
                            if (FrameL3SlotWidget.this.dataChannel != null) {
                                FrameL3SlotWidget.this.dataChannel.b(c.class, (Object) true);
                            }
                            FrameL3SlotWidget.this.f12667d.startAnimation(FrameL3SlotWidget.this.f12665b.a());
                            if (!FrameL3SlotWidget.this.f12667d.hasOnClickListeners()) {
                                FrameL3SlotWidget.this.f12667d.setOnClickListener(new View.OnClickListener() {
                                    /* class com.bytedance.android.live.slot.FrameL3SlotWidget.AnonymousClass2.AnonymousClass1 */

                                    static {
                                        Covode.recordClassIndex(7057);
                                    }

                                    public final void onClick(View view) {
                                        if (!TextUtils.isEmpty(null)) {
                                            ((IHostAction) a.a(IHostAction.class)).openLiveBrowser((String) null, new Bundle(), FrameL3SlotWidget.this.getContext());
                                        }
                                    }
                                });
                            }
                            FrameL3SlotWidget.this.f12667d.post(new Runnable() {
                                /* class com.bytedance.android.live.slot.FrameL3SlotWidget.AnonymousClass2.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(7058);
                                }

                                public final void run() {
                                    if (FrameL3SlotWidget.this.dataChannel != null) {
                                        FrameL3SlotWidget.this.dataChannel.b(com.bytedance.android.livesdk.aq.b.class, Integer.valueOf(FrameL3SlotWidget.this.f12667d.getHeight()));
                                    }
                                }
                            });
                            MethodCollector.o(10096);
                            return;
                        }
                    }
                } else if (FrameL3SlotWidget.this.isShowing() && FrameL3SlotWidget.this.f12667d != null) {
                    Animation b2 = FrameL3SlotWidget.this.f12665b.b();
                    if ("visibility_reason_conflict".equals(pair2.second) || "visibility_reason_dispose".equals(pair2.second)) {
                        if (FrameL3SlotWidget.this.getView() instanceof ViewGroup) {
                            ((ViewGroup) FrameL3SlotWidget.this.getView()).removeAllViews();
                            FrameL3SlotWidget.this.hide();
                        }
                        if (FrameL3SlotWidget.this.dataChannel != null) {
                            FrameL3SlotWidget.this.dataChannel.b(c.class, (Object) false);
                            FrameL3SlotWidget.this.dataChannel.b(com.bytedance.android.livesdk.aq.b.class, (Object) 0);
                            MethodCollector.o(10096);
                            return;
                        }
                    } else {
                        b2.setAnimationListener(new Animation.AnimationListener() {
                            /* class com.bytedance.android.live.slot.FrameL3SlotWidget.AnonymousClass2.AnonymousClass3 */

                            static {
                                Covode.recordClassIndex(7059);
                            }

                            public final void onAnimationRepeat(Animation animation) {
                            }

                            public final void onAnimationStart(Animation animation) {
                            }

                            public final void onAnimationEnd(Animation animation) {
                                View view = FrameL3SlotWidget.this.getView();
                                if (view != null) {
                                    view.post(new r(this, view));
                                }
                                if (FrameL3SlotWidget.this.dataChannel != null) {
                                    FrameL3SlotWidget.this.dataChannel.b(c.class, (Object) false);
                                    FrameL3SlotWidget.this.dataChannel.b(com.bytedance.android.livesdk.aq.b.class, (Object) 0);
                                }
                            }
                        });
                        FrameL3SlotWidget.this.f12667d.startAnimation(b2);
                    }
                }
                MethodCollector.o(10096);
            }
        });
    }
}
