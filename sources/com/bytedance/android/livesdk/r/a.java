package com.bytedance.android.livesdk.r;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.live.gift.s;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.h;
import com.bytedance.android.livesdk.j.cp;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.r.k;
import com.bytedance.android.livesdk.service.animation.view.LiveNewSendGiftAnimationView;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.a.b;
import h.z;

public final class a extends FrameLayout implements k.a {

    /* renamed from: a  reason: collision with root package name */
    k f20549a;

    /* renamed from: b  reason: collision with root package name */
    LiveNewSendGiftAnimationView f20550b;

    /* renamed from: c  reason: collision with root package name */
    boolean f20551c;

    /* renamed from: d  reason: collision with root package name */
    LiveAutoRtlTextView f20552d;

    /* renamed from: e  reason: collision with root package name */
    private LiveAutoRtlImageView f20553e;

    /* renamed from: f  reason: collision with root package name */
    private DataChannel f20554f;

    /* renamed from: g  reason: collision with root package name */
    private u f20555g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f20556h;

    /* renamed from: i  reason: collision with root package name */
    private b<Boolean, z> f20557i;

    static {
        Covode.recordClassIndex(12137);
    }

    public final Context getActivityContext() {
        return getContext();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        DataChannel dataChannel = this.f20554f;
        if (dataChannel != null) {
            dataChannel.b(this);
        }
        k kVar = this.f20549a;
        if (kVar != null) {
            if (kVar.f20576c != null) {
                kVar.f20576c.a();
            }
            kVar.f20577d = null;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        long j2;
        boolean z;
        Room room;
        DataChannel dataChannel = this.f20554f;
        if (dataChannel != null && !((Boolean) dataChannel.b(cp.class)).booleanValue()) {
            this.f20554f.c(s.class);
        }
        b.a.a("shortcut_gift_click").a().b("live").c("click").d("live_detail").e("bottom_tab").b();
        e eVar = e.f21319i;
        u uVar = this.f20555g;
        if (uVar != null) {
            j2 = uVar.f19761d;
        } else {
            j2 = 0;
        }
        u uVar2 = this.f20555g;
        if (uVar2 == null || !uVar2.a()) {
            z = false;
        } else {
            z = true;
        }
        Boolean.valueOf(false);
        eVar.a(j2, true, z, "convenient_icon", "", "click");
        k kVar = this.f20549a;
        if (kVar.f20575b != null && kVar.f20574a != null && (room = (Room) kVar.f20575b.b(df.class)) != null) {
            d dVar = new d(GiftDialogViewModel.a.GIFT, kVar.f20574a.f19761d, kVar.f20574a.a());
            dVar.f21290f = kVar.f20574a.f19763f;
            dVar.q = kVar.f20574a.J;
            dVar.f21294j = "convenient_gift";
            dVar.f21293i = room.getOwner();
            dVar.s = true;
            kVar.f20575b.c(az.class, dVar);
        }
    }

    @Override // com.bytedance.android.livesdk.r.k.a
    public final void setImageDrawable(int i2) {
        LiveAutoRtlImageView liveAutoRtlImageView = this.f20553e;
        if (liveAutoRtlImageView != null) {
            liveAutoRtlImageView.setImageResource(i2);
        }
    }

    @Override // com.bytedance.android.livesdk.r.k.a
    public final void a(u uVar) {
        if (uVar != null) {
            this.f20555g = uVar;
            if (this.f20551c) {
                g.a(this.f20553e, uVar.f19759b, y.a(24.0f), y.a(24.0f), 0);
                String str = uVar.f19758a;
                if (str == null) {
                    str = y.a((int) R.string.edn);
                }
                this.f20552d.setText(str);
            } else {
                g.a(this.f20553e, uVar.f19759b, y.a(26.0f), y.a(26.0f), 0);
            }
            if (!this.f20556h) {
                this.f20556h = true;
                if (isShown()) {
                    com.bytedance.android.livesdk.service.c.h.a.a();
                }
            }
        }
    }

    public a(Context context, DataChannel dataChannel) {
        super(context);
        MethodCollector.i(10387);
        b bVar = new b(this);
        this.f20557i = bVar;
        this.f20554f = dataChannel;
        if (dataChannel != null) {
            dataChannel.a(this, h.class, bVar);
            this.f20551c = Boolean.TRUE.equals(dataChannel.b(ea.class));
        }
        if (this.f20551c) {
            View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bgu, null, false);
            this.f20553e = (LiveAutoRtlImageView) a2.findViewById(R.id.enf);
            this.f20552d = (LiveAutoRtlTextView) a2.findViewById(R.id.enr);
            a2.setOnClickListener(new d(this));
            addView(a2);
        } else {
            setBackgroundResource(R.drawable.c8b);
            LiveAutoRtlImageView liveAutoRtlImageView = new LiveAutoRtlImageView(getContext());
            this.f20553e = liveAutoRtlImageView;
            liveAutoRtlImageView.setOnClickListener(new c(this));
            int b2 = (int) n.b(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y.a(26.0f), y.a(26.0f));
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b2;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(b2);
            this.f20553e.setLayoutParams(layoutParams);
            addView(this.f20553e);
        }
        if (getContext() != null) {
            addView(com.bytedance.android.b.a(R.layout.bgt, null));
            LiveNewSendGiftAnimationView liveNewSendGiftAnimationView = (LiveNewSendGiftAnimationView) findViewById(R.id.b0b);
            this.f20550b = liveNewSendGiftAnimationView;
            liveNewSendGiftAnimationView.setAnimationType(LiveNewSendGiftAnimationView.a.Fast);
            this.f20550b.setVisibility(8);
            this.f20550b.setScaleX(0.5f);
            this.f20550b.setScaleY(0.5f);
        }
        com.bytedance.android.live.u.g.c(new e(this, dataChannel));
        this.f20555g = null;
        setClipChildren(false);
        this.f20556h = false;
        MethodCollector.o(10387);
    }
}
