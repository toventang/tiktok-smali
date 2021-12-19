package com.bytedance.android.livesdkapi.g;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f.a> f23202a = new HashSet();

    static {
        Covode.recordClassIndex(13761);
    }

    public abstract void a(long j2);

    @Override // com.bytedance.android.livesdkapi.g.f
    public void a(Room room) {
    }

    public String b(long j2) {
        return "";
    }

    public abstract List<Room> b();

    public abstract void b(int i2);

    @Override // com.bytedance.android.livesdkapi.g.f
    public abstract Room c(int i2);

    public void c() {
        this.f23202a.clear();
    }

    public List<Room> d() {
        return new ArrayList();
    }

    public final void f() {
        for (f.a aVar : this.f23202a) {
            aVar.c();
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final void a(f.a aVar) {
        this.f23202a.add(aVar);
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final void b(f.a aVar) {
        this.f23202a.remove(aVar);
    }
}
