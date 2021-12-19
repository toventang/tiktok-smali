package com.bytedance.android.livesdk.chatroom.detail;

import android.util.Pair;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import f.a.t;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public Pair<Integer, String> f15227a;

    /* renamed from: b  reason: collision with root package name */
    final a f15228b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15229c;

    /* renamed from: d  reason: collision with root package name */
    public Room f15230d;

    /* renamed from: e  reason: collision with root package name */
    private f.a.b.b f15231e;

    public interface a {
        static {
            Covode.recordClassIndex(8434);
        }

        void a(int i2, String str);

        void a(Room room);
    }

    static {
        Covode.recordClassIndex(8433);
    }

    /* access modifiers changed from: package-private */
    public abstract t<d<Room>> c();

    public final void b() {
        this.f15229c = false;
        f.a.b.b bVar = this.f15231e;
        if (bVar != null && !bVar.isDisposed()) {
            this.f15231e.dispose();
        }
    }

    public final void a() {
        if (!this.f15229c) {
            this.f15229c = true;
            this.f15231e = c().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this), new d(this));
        }
    }

    b(a aVar) {
        this.f15228b = aVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        this.f15227a = new Pair<>(Integer.valueOf(i2), str);
        this.f15229c = false;
        this.f15228b.a(i2, str);
    }
}
