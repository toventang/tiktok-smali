package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.chatroom.c.n;
import com.bytedance.android.livesdk.chatroom.g.e;
import com.bytedance.android.livesdk.event.g;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final MessageBlockWidget f16670a;

    static {
        Covode.recordClassIndex(9248);
    }

    r(MessageBlockWidget messageBlockWidget) {
        this.f16670a = messageBlockWidget;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        Drawable drawable;
        MessageBlockWidget messageBlockWidget = this.f16670a;
        g gVar = (g) obj;
        SparseBooleanArray sparseBooleanArray = gVar.f17192a;
        boolean z = false;
        boolean z2 = sparseBooleanArray.get(0);
        boolean z3 = sparseBooleanArray.get(2);
        boolean z4 = sparseBooleanArray.get(1);
        if (z2 || z3) {
            z = true;
        }
        e.a(messageBlockWidget.context, messageBlockWidget.getView(), !z, gVar.f17194c);
        n nVar = new n();
        nVar.f15132b = gVar.f17193b;
        nVar.f15131a = gVar.f17192a;
        nVar.f15133c = gVar.f17194c;
        a.a().a(nVar);
        if (messageBlockWidget.getContext() != null) {
            if (z4) {
                if (Build.VERSION.SDK_INT >= 21) {
                    drawable = messageBlockWidget.getContext().getDrawable(2131234632);
                }
            } else if (Build.VERSION.SDK_INT >= 21) {
                drawable = messageBlockWidget.getContext().getDrawable(2131234717);
            }
            if (!(drawable == null || messageBlockWidget.f16587a == null)) {
                messageBlockWidget.f16587a.setImageDrawable(drawable);
            }
        }
        if (gVar.f17193b == 1) {
            b.a.a("livesdk_landscape_mute_gift_barrage_click").a(messageBlockWidget.dataChannel).b("live").c("click").d("live_landscape").a("room_orientation", "landscape").a("mute_barrage_type", sparseBooleanArray.get(1) ? "close" : "open").b();
        }
    }
}
