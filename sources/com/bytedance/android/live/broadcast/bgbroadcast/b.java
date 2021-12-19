package com.bytedance.android.live.broadcast.bgbroadcast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f7723a = "BgBroadcastFragment";

    /* renamed from: b  reason: collision with root package name */
    public final Activity f7724b;

    /* renamed from: c  reason: collision with root package name */
    public final Room f7725c;

    /* renamed from: d  reason: collision with root package name */
    public final f f7726d;

    /* renamed from: e  reason: collision with root package name */
    public final DataChannel f7727e;

    static {
        Covode.recordClassIndex(3810);
    }

    public abstract void a();

    public void a(int i2, int i3, Intent intent) {
    }

    public void a(Bundle bundle) {
        l.d(bundle, "");
    }

    public abstract void a(a aVar);

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public b(Room room, f fVar, DataChannel dataChannel) {
        l.d(room, "");
        l.d(fVar, "");
        l.d(dataChannel, "");
        this.f7725c = room;
        this.f7726d = fVar;
        this.f7727e = dataChannel;
        Activity i2 = fVar.i();
        l.b(i2, "");
        this.f7724b = i2;
    }
}
