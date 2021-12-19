package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.depend.model.a.d;
import com.bytedance.android.livesdkapi.depend.model.a.g;
import com.bytedance.android.livesdkapi.depend.model.a.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ak implements h {

    /* renamed from: a  reason: collision with root package name */
    private List<g> f8113a;

    static {
        Covode.recordClassIndex(4038);
    }

    public ak() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f8113a = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new o());
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a() {
        for (g gVar : this.f8113a) {
            if (gVar instanceof d) {
                ((d) gVar).a();
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.g
    public void onStartLive() {
        for (g gVar : this.f8113a) {
            gVar.onStartLive();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.h
    public final void b(g gVar) {
        this.f8113a.remove(gVar);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.h
    public final void a(g gVar) {
        if (!this.f8113a.contains(gVar)) {
            this.f8113a.add(gVar);
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a(int i2) {
        for (g gVar : this.f8113a) {
            if (gVar instanceof d) {
                ((d) gVar).a(i2);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void b(int i2, DataChannel dataChannel) {
        for (g gVar : this.f8113a) {
            if (gVar instanceof d) {
                ((d) gVar).b(i2, dataChannel);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.a.d
    public final void a(int i2, DataChannel dataChannel) {
        for (g gVar : this.f8113a) {
            if (gVar instanceof d) {
                ((d) gVar).a(i2, dataChannel);
            }
        }
    }
}
