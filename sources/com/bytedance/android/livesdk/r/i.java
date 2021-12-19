package com.bytedance.android.livesdk.r;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlImageView;
import com.bytedance.android.live.design.widget.rtl.LiveAutoRtlTextView;
import com.bytedance.android.livesdk.chatroom.c.h;
import com.bytedance.android.livesdk.j.ea;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.r.g;
import com.bytedance.android.livesdk.service.c.h.a;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class i extends FrameLayout implements g.a {

    /* renamed from: a  reason: collision with root package name */
    private LiveAutoRtlImageView f20569a;

    /* renamed from: b  reason: collision with root package name */
    private g f20570b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f20571c;

    /* renamed from: d  reason: collision with root package name */
    private LiveAutoRtlTextView f20572d;

    static {
        Covode.recordClassIndex(12146);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        g gVar = this.f20570b;
        if (!(gVar == null || gVar.f20566c == null)) {
            gVar.f20566c.a();
        }
        super.onDetachedFromWindow();
    }

    @Override // com.bytedance.android.livesdk.r.g.a
    public final void a(u uVar) {
        if (uVar != null) {
            if (this.f20571c) {
                LiveAutoRtlTextView liveAutoRtlTextView = this.f20572d;
                if (liveAutoRtlTextView != null) {
                    String str = uVar.f19758a;
                    if (str == null) {
                        str = y.a((int) R.string.edn);
                    }
                    liveAutoRtlTextView.setText(str);
                }
                com.bytedance.android.livesdk.chatroom.g.g.a(this.f20569a, uVar.f19759b, y.a(24.0f), y.a(24.0f), 0);
            } else {
                com.bytedance.android.livesdk.chatroom.g.g.a(this.f20569a, uVar.f19759b, y.a(26.0f), y.a(26.0f), 0);
            }
            if (isShown()) {
                a.a();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, DataChannel dataChannel) {
        super(context);
        boolean z;
        l.d(context, "");
        l.d(dataChannel, "");
        MethodCollector.i(11119);
        Boolean bool = (Boolean) dataChannel.b(ea.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.f20571c = z;
        if (z) {
            View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.bgu, null, false);
            this.f20569a = (LiveAutoRtlImageView) a2.findViewById(R.id.enf);
            this.f20572d = (LiveAutoRtlTextView) a2.findViewById(R.id.enr);
            addView(a2);
        } else {
            setBackgroundResource(R.drawable.c8b);
            this.f20569a = new LiveAutoRtlImageView(getContext());
            int b2 = (int) n.b(getContext(), 5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(y.a(26.0f), y.a(26.0f));
            layoutParams.topMargin = b2;
            layoutParams.leftMargin = b2;
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.setMarginStart(b2);
            LiveAutoRtlImageView liveAutoRtlImageView = this.f20569a;
            if (liveAutoRtlImageView == null) {
                l.b();
            }
            liveAutoRtlImageView.setLayoutParams(layoutParams);
            addView(this.f20569a);
        }
        g gVar = new g(dataChannel);
        this.f20570b = gVar;
        gVar.f20567d = this;
        gVar.f20566c.a(com.bytedance.android.livesdk.an.a.a().a(h.class).d(new h(gVar)));
        setClipChildren(false);
        MethodCollector.o(11119);
    }
}
