package com.ss.android.ugc.aweme.im.sdk.chat.ui.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final c f101134a;

    static {
        Covode.recordClassIndex(64698);
    }

    d(c cVar) {
        this.f101134a = cVar;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.feature.selectmsg.b
    public final void a(boolean z, int i2) {
        Object obj;
        c cVar = this.f101134a;
        if (cVar.o != null && i2 < cVar.f101101b.size() && i2 >= 0 && (obj = cVar.f101101b.get(i2)) != null) {
            List<ai> value = cVar.o.getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            boolean contains = value.contains(obj);
            if (z) {
                if (!contains) {
                    value.add(obj);
                    cVar.o.setValue(value);
                }
            } else if (contains) {
                value.remove(obj);
                cVar.o.setValue(value);
            }
        }
    }
}
