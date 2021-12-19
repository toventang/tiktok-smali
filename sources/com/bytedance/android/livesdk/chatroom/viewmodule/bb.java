package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.ui.b.c;
import com.bytedance.android.livesdk.model.av;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
public final /* synthetic */ class bb implements f {

    /* renamed from: a  reason: collision with root package name */
    private final DecorationWrapperWidget f16482a;

    /* renamed from: b  reason: collision with root package name */
    private final av f16483b;

    static {
        Covode.recordClassIndex(9119);
    }

    bb(DecorationWrapperWidget decorationWrapperWidget, av avVar) {
        this.f16482a = decorationWrapperWidget;
        this.f16483b = avVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str;
        DecorationWrapperWidget decorationWrapperWidget = this.f16482a;
        av avVar = this.f16483b;
        c.f15929b = true;
        if (avVar != null) {
            boolean z = avVar.f19005g == 1;
            long id = decorationWrapperWidget.f16293g != null ? decorationWrapperWidget.f16293g.getId() : 0;
            HashMap hashMap = new HashMap();
            hashMap.put("room_id", String.valueOf(id));
            hashMap.put("prop_id", String.valueOf(avVar.f19006h));
            if (z) {
                hashMap.put("words", avVar.f19002d);
            }
            if (!(decorationWrapperWidget.f16293g == null || decorationWrapperWidget.f16293g.getOwner() == null)) {
                hashMap.put("anchor_id", String.valueOf(decorationWrapperWidget.f16293g.getOwner().getId()));
            }
            if (z) {
                str = "livesdk_live_character_prop_effective_use";
            } else {
                str = "livesdk_live_picture_prop_effective_use";
            }
            b.a.a(str).a((Map<String, String>) hashMap).d("live_take_detail").b("live_take").a(decorationWrapperWidget.dataChannel).b();
            if (z) {
                decorationWrapperWidget.f16288b = true;
            } else {
                decorationWrapperWidget.f16287a = true;
            }
        }
    }
}
