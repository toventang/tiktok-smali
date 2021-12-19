package com.bytedance.android.live.liveinteract.platform.common.view;

import android.view.View;
import com.bytedance.android.live.liveinteract.platform.common.view.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private View f12066a;

    /* renamed from: b  reason: collision with root package name */
    private DataChannel f12067b;

    /* renamed from: c  reason: collision with root package name */
    private Set<b> f12068c = new HashSet();

    static {
        Covode.recordClassIndex(6572);
    }

    public final void a() {
        for (b bVar : this.f12068c) {
            bVar.f12069a.b(bVar);
            bVar.f12071c.clear();
        }
        this.f12068c.clear();
    }

    private <V extends View> b.a<V> a(V v) {
        return new b.a<>(this.f12067b, v, this);
    }

    /* access modifiers changed from: package-private */
    public final void a(b bVar) {
        this.f12068c.add(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.android.live.liveinteract.platform.common.view.a */
    /* JADX WARN: Multi-variable type inference failed */
    public final <V extends View> b.a<V> a(int i2) {
        View view = this.f12066a;
        if (view != null) {
            return a(view.findViewById(i2));
        }
        throw new IllegalStateException("Unable to find view by id due to null root view.");
    }

    public a(DataChannel dataChannel, View view) {
        this.f12067b = dataChannel;
        this.f12066a = view;
    }
}
