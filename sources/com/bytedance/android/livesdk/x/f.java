package com.bytedance.android.livesdk.x;

import com.bytedance.android.live.core.d.c;
import com.bytedance.android.livesdk.ac.b.a;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMsgTypeAlogDurationSetting;
import com.bytedance.android.livesdk.livesetting.message.LiveMsgTypeAlogEnableSetting;
import com.bytedance.android.livesdk.model.message.i;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import f.a.b.b;
import f.a.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class f implements IInterceptor {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f22905a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final b f22906b = t.a((long) LiveMsgTypeAlogDurationSetting.INSTANCE.getValue(), (long) LiveMsgTypeAlogDurationSetting.INSTANCE.getValue(), TimeUnit.SECONDS).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).d(new g(this));

    /* renamed from: c  reason: collision with root package name */
    private boolean f22907c = true;

    static {
        Covode.recordClassIndex(13536);
    }

    public final void b() {
        b bVar = this.f22906b;
        if (bVar != null) {
            bVar.dispose();
        }
        a();
        this.f22907c = true;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f22905a.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f22905a);
            this.f22905a.clear();
            t.a(new h(arrayList)).b(f.a.h.a.b(f.a.k.a.f158006c)).g();
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (LiveMsgTypeAlogEnableSetting.INSTANCE.getValue() && (iMessage instanceof a) && !(iMessage instanceof i)) {
            a aVar = (a) iMessage;
            if (!aVar.f13611c) {
                this.f22905a.add(aVar);
                if (this.f22905a.size() > LiveMaxRetainAlogMessageSizeSetting.INSTANCE.getValue()) {
                    if (this.f22907c) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("message_count_exceed_limit", true);
                        c.a("ttlive_broadcast_action_all", 0, hashMap);
                        this.f22907c = false;
                    }
                    a();
                }
            }
        }
        return false;
    }
}
