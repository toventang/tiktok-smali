package com.bytedance.android.livesdk.list;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.h;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.android.livesdkapi.g.m;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class g extends h implements m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f18639a;

    /* renamed from: b  reason: collision with root package name */
    public final List<EnterRoomConfig> f18640b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public i f18641c;

    /* renamed from: d  reason: collision with root package name */
    public final EnterRoomConfig f18642d;

    /* renamed from: e  reason: collision with root package name */
    private final a f18643e = new a(this);

    static {
        Covode.recordClassIndex(10442);
    }

    @Override // com.bytedance.android.livesdkapi.g.h, com.bytedance.android.livesdkapi.g.f
    public final Room c(int i2) {
        return null;
    }

    public static final class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f18644a;

        static {
            Covode.recordClassIndex(10443);
        }

        @Override // com.bytedance.android.livesdkapi.g.i.a
        public final void a() {
            this.f18644a.f18639a = false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(g gVar) {
            this.f18644a = gVar;
        }

        @Override // com.bytedance.android.livesdkapi.g.i.a
        public final void a(List<EnterRoomConfig> list) {
            l.d(list, "");
            this.f18644a.f18639a = false;
            this.f18644a.f18640b.addAll(list);
            this.f18644a.f();
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a() {
        return this.f18640b.size();
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final List<Room> b() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void c() {
        super.c();
        i iVar = this.f18641c;
        if (iVar != null) {
            iVar.b();
        }
        this.f18640b.clear();
    }

    private final void e() {
        List<EnterRoomConfig> a2;
        this.f18640b.clear();
        i iVar = this.f18641c;
        if (!(iVar == null || (a2 = iVar.a()) == null)) {
            for (EnterRoomConfig enterRoomConfig : a2) {
                if (enterRoomConfig.f23299c.R == this.f18642d.f23299c.R) {
                    this.f18640b.add(this.f18642d);
                } else {
                    this.f18640b.add(enterRoomConfig);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final EnterRoomConfig a(int i2) {
        return this.f18640b.get(i2);
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void b(int i2) {
        if (!this.f18639a) {
            this.f18639a = true;
            i iVar = this.f18641c;
            if (iVar != null) {
                iVar.a(this.f18640b.size() + i2, this.f18643e);
            }
        }
    }

    @Override // com.bytedance.android.livesdkapi.g.f
    public final int a(EnterRoomConfig enterRoomConfig) {
        l.d(enterRoomConfig, "");
        long j2 = enterRoomConfig.f23299c.R;
        int size = this.f18640b.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f18640b.get(i2).f23299c.R == j2) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.bytedance.android.livesdkapi.g.h
    public final void a(long j2) {
        i iVar = this.f18641c;
        if (iVar != null) {
            iVar.a(j2);
        }
        for (T t : this.f18640b) {
            if (t.f23299c.R == j2) {
                this.f18640b.remove(t);
                return;
            }
        }
    }

    public g(EnterRoomConfig enterRoomConfig, i iVar) {
        l.d(enterRoomConfig, "");
        l.d(iVar, "");
        this.f18642d = enterRoomConfig;
        this.f18641c = iVar;
        e();
    }
}
