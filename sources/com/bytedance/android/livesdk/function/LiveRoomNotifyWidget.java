package com.bytedance.android.livesdk.function;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.h.b.b;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.bl;
import com.bytedance.android.livesdk.chatroom.b.c;
import com.bytedance.android.livesdk.event.f;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.android.livesdk.j.av;
import com.bytedance.android.livesdk.j.ba;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.dk;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.android.livesdk.model.message.by;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.b.a;

public class LiveRoomNotifyWidget extends LiveRecyclableWidget implements au {

    /* renamed from: h  reason: collision with root package name */
    private static final int f17759h = y.a(8.0f);

    /* renamed from: i  reason: collision with root package name */
    private static final int f17760i = y.a(14.0f);

    /* renamed from: a  reason: collision with root package name */
    public ImageView f17761a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f17762b;

    /* renamed from: c  reason: collision with root package name */
    int f17763c;

    /* renamed from: d  reason: collision with root package name */
    public AnimatorSet f17764d;

    /* renamed from: e  reason: collision with root package name */
    public AnimatorSet f17765e;

    /* renamed from: f  reason: collision with root package name */
    public long f17766f = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    /* renamed from: g  reason: collision with root package name */
    public by f17767g;

    /* renamed from: j  reason: collision with root package name */
    private ImageView f17768j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f17769k;

    /* renamed from: l  reason: collision with root package name */
    private AnimatorSet f17770l;

    /* renamed from: m  reason: collision with root package name */
    private final a f17771m = new a();
    private boolean n;

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.bco;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    static {
        Covode.recordClassIndex(9859);
    }

    private void b() {
        AnimatorSet animatorSet = this.f17770l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f17764d;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.f17765e;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        if (this.dataChannel != null) {
            this.dataChannel.b(av.class, (Object) false);
        }
        getView().setAlpha(1.0f);
        hide();
        b();
        this.f17770l = null;
        this.f17764d = null;
        this.f17765e = null;
        this.f17771m.a();
        this.f17767g = null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        ObjectAnimator ofFloat3;
        if (this.f17770l == null || this.f17765e == null || this.f17764d == null) {
            if (com.bytedance.android.live.uikit.c.a.a(this.context)) {
                ofFloat = ObjectAnimator.ofFloat(getView(), "translationX", (float) (-this.f17763c), 12.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(getView(), "translationX", (float) this.f17763c, -12.0f);
            }
            ofFloat.setInterpolator(b.a(0.01f, 0.34f, 0.07f, 1.12f));
            ofFloat.setDuration(1500L);
            if (com.bytedance.android.live.uikit.c.a.a(this.context)) {
                ofFloat2 = ObjectAnimator.ofFloat(getView(), "translationX", 12.0f, 0.0f);
            } else {
                ofFloat2 = ObjectAnimator.ofFloat(getView(), "translationX", -12.0f, 0.0f);
            }
            ofFloat2.setInterpolator(b.a(0.01f, 0.34f, 0.07f, 1.12f));
            ofFloat2.setDuration(200L);
            if (com.bytedance.android.live.uikit.c.a.a(this.context)) {
                ofFloat3 = ObjectAnimator.ofFloat(getView(), "translationX", 0.0f, (float) this.f17763c);
            } else {
                ofFloat3 = ObjectAnimator.ofFloat(getView(), "translationX", 0.0f, (float) (-this.f17763c));
            }
            ofFloat3.setInterpolator(b.a(0.4f, 0.0f, 0.68f, 0.06f));
            ofFloat3.setDuration(1000L);
            this.f17770l = new AnimatorSet();
            this.f17765e = new AnimatorSet();
            this.f17764d = new AnimatorSet();
            this.f17770l.playSequentially(ofFloat);
            this.f17765e.playSequentially(ofFloat2);
            this.f17764d.playSequentially(ofFloat3);
            this.f17770l.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(9860);
                }

                public final void onAnimationStart(Animator animator) {
                    LiveRoomNotifyWidget.this.show();
                }

                public final void onAnimationEnd(Animator animator) {
                    int i2;
                    long j2;
                    if (LiveRoomNotifyWidget.this.isViewValid()) {
                        if (LiveRoomNotifyWidget.this.f17765e != null) {
                            LiveRoomNotifyWidget.this.f17765e.start();
                        }
                        boolean z = false;
                        if (LiveRoomNotifyWidget.this.f17762b.getLayout() != null) {
                            i2 = ((int) LiveRoomNotifyWidget.this.f17762b.getLayout().getLineWidth(0)) - ((LiveRoomNotifyWidget.this.f17762b.getWidth() - LiveRoomNotifyWidget.this.f17762b.getPaddingLeft()) - LiveRoomNotifyWidget.this.f17762b.getPaddingRight());
                            if (i2 > 0) {
                                z = true;
                            }
                        } else {
                            i2 = 0;
                        }
                        LiveRoomNotifyWidget.this.f17766f -= 1700;
                        if (!z) {
                            View view = LiveRoomNotifyWidget.this.getView();
                            g gVar = new g(this);
                            if (LiveRoomNotifyWidget.this.f17766f > 0) {
                                j2 = LiveRoomNotifyWidget.this.f17766f;
                            } else {
                                j2 = InteractFirstFrameTimeOutDurationSetting.DEFAULT;
                            }
                            view.postDelayed(gVar, j2);
                            return;
                        }
                        LiveRoomNotifyWidget.this.getView().postDelayed(new h(this, i2), 500);
                    }
                }
            });
            this.f17764d.addListener(new AnimatorListenerAdapter() {
                /* class com.bytedance.android.livesdk.function.LiveRoomNotifyWidget.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(9862);
                }

                public final void onAnimationEnd(Animator animator) {
                    LiveRoomNotifyWidget.this.hide();
                    LiveRoomNotifyWidget.this.f17767g = null;
                    c.INSTANCE.onMessageFinish();
                    if (LiveRoomNotifyWidget.this.dataChannel != null) {
                        LiveRoomNotifyWidget.this.dataChannel.b(av.class, (Object) false);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object... objArr) {
        this.f17761a = (ImageView) findViewById(R.id.qq);
        this.f17762b = (TextView) findViewById(R.id.cy5);
        this.f17768j = (ImageView) findViewById(R.id.m4);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object... objArr) {
        int i2;
        this.n = ((Boolean) this.dataChannel.b(cp.class)).booleanValue();
        this.f17763c = n.a(this.context);
        this.dataChannel.a((m) this, ba.class, (h.f.a.b) new a(this)).a((m) this, dk.class, (h.f.a.b) new b(this));
        if (!bl.f14211a) {
            a();
        }
        this.f17771m.a(com.bytedance.android.livesdk.an.a.a().a(f.class).d(e.f17792a));
        if (getView() != null) {
            if (this.n) {
                i2 = f17759h;
            } else {
                i2 = f17760i;
            }
            getView().setPadding(i2, 0, i2, 0);
        }
        if (!((Boolean) this.dataChannel.b(cp.class)).booleanValue()) {
            this.f17771m.a(((z) com.bytedance.android.livesdk.an.a.a().a(g.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(WidgetExtendsKt.autoDispose(this))).a(new c(this)));
        }
        this.contentView.setOnClickListener(new d(this));
    }

    public final void a(by byVar) {
        String str;
        if (byVar != null) {
            if ((TextUtils.equals(byVar.f19392k, "hourly_rank") || TextUtils.equals(byVar.f19392k, "weekly_rank")) && this.dataChannel != null) {
                this.dataChannel.b(av.class, (Object) true);
            }
            if (!TextUtils.equals(byVar.f19392k, "weekly_rank") && TextUtils.isEmpty(byVar.f19389h)) {
                findViewById(R.id.bat).setVisibility(8);
                this.f17768j.setVisibility(8);
            } else if (TextUtils.equals(byVar.f19392k, "gift_broadcast")) {
                findViewById(R.id.bat).setVisibility(0);
                this.f17768j.setVisibility(8);
            } else {
                findViewById(R.id.bat).setVisibility(8);
                this.f17768j.setVisibility(0);
            }
            this.f17769k = (ImageView) findViewById(R.id.bb7);
            if (TextUtils.equals(byVar.f19392k, "gift_broadcast")) {
                this.f17769k.setVisibility(0);
                p.b(this.f17769k, byVar.n);
            } else {
                this.f17769k.setVisibility(8);
            }
            if (byVar.a()) {
                com.bytedance.android.livesdk.model.message.c.b bVar = byVar.O.f23218j;
                String str2 = bVar.f19422b;
                if (!TextUtils.isEmpty(bVar.f19421a)) {
                    str = com.bytedance.android.livesdk.i18n.b.a().a(bVar.f19421a);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    str2 = str;
                }
                this.f17762b.setText(com.bytedance.android.livesdk.chatroom.f.c.a(str2, bVar, null));
            } else if (!(byVar.f19390i == null || byVar.f19390i.f19107c == null)) {
                this.f17762b.setText(byVar.f19390i.f19107c.a());
            }
            if (byVar.f19390i != null) {
                this.f17766f = byVar.f19390i.f19108d * 1000;
            }
            b();
            if (TextUtils.equals(byVar.f19392k, "gift_broadcast")) {
                ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).monitorBroadcastMonitor(byVar.f19393l, byVar.f19394m);
            }
            AnimatorSet animatorSet = this.f17770l;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
    }
}
