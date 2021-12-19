package com.bytedance.android.live.slot;

import android.os.Handler;
import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.n;
import com.bytedance.android.live.gift.r;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.model.message.a.a;
import com.bytedance.android.livesdk.util.rxutils.autodispose.e;
import com.bytedance.android.livesdk.util.rxutils.autodispose.z;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import h.f.a.b;

public class BarrageWidget extends LiveRecyclableWidget implements au, OnMessageListener {

    /* renamed from: a  reason: collision with root package name */
    protected IMessageManager f12608a;

    /* renamed from: b  reason: collision with root package name */
    public View f12609b;

    /* renamed from: c  reason: collision with root package name */
    int f12610c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12611d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f12612e = new Handler();

    static {
        Covode.recordClassIndex(7034);
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public BarrageWidget() {
        a();
    }

    private void a() {
        this.f12610c = y.d(R.dimen.yx);
        this.f12611d = false;
        this.f12609b = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onUnload() {
        this.f12612e.removeCallbacksAndMessages(null);
        this.dataChannel.c(r.class);
        View view = this.f12609b;
        if (view != null) {
            view.setVisibility(8);
        }
        this.dataChannel.b(this);
        a();
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        this.f12608a = (IMessageManager) this.dataChannel.b(cg.class);
        this.dataChannel.a((m) this, n.class, (b) new d(this));
        IMessageManager iMessageManager = this.f12608a;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(a.BARRAGE_MESSAGE.getIntType(), this);
        }
        ((z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.event.m.class).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(e.a(this))).a(new e(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015d, code lost:
        if (r1 == null) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0161, code lost:
        if (r2 != null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0169, code lost:
        r5 = com.bytedance.android.livesdk.chatroom.f.c.a(r2, r3, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x016d, code lost:
        r4.setText(r5);
        r4 = r11.f19599a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        if (r4 == null) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0174, code lost:
        r3 = new java.util.HashMap(r4.f19604b);
        r3.put("enter_from_merge", com.bytedance.android.livesdk.ab.e.a());
        r3.put("enter_method", com.bytedance.android.livesdk.ab.e.d());
        r3.put("room_id", java.lang.String.valueOf(com.bytedance.android.livesdk.ab.e.i()));
        r3.put("anchor_id", java.lang.String.valueOf(com.bytedance.android.livesdk.ab.e.h()));
        r3.put("action_type", com.bytedance.android.livesdk.ab.e.e());
        com.bytedance.android.livesdk.ab.b.a.a(r4.f19603a).a((java.util.Map<java.lang.String, java.lang.String>) r3).b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bd, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(9900);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01c4, code lost:
        return;
     */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r11) {
        /*
        // Method dump skipped, instructions count: 456
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.slot.BarrageWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
