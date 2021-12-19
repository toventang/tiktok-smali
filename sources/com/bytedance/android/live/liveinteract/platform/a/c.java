package com.bytedance.android.live.liveinteract.platform.a;

import com.bytedance.android.live.liveinteract.api.c.f;
import com.bytedance.android.live.liveinteract.platform.a.a.a;
import com.bytedance.android.live.liveinteract.platform.a.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@f(a = "LINKER_MANAGER")
public final class c {

    /* renamed from: j  reason: collision with root package name */
    public static final a f11873j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f11874a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11875b;

    /* renamed from: c  reason: collision with root package name */
    public DataChannel f11876c;

    /* renamed from: d  reason: collision with root package name */
    public b f11877d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f11878e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<b> f11879f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<b> f11880g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public HashMap<a.EnumC0247a, b> f11881h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public a.EnumC0247a f11882i = a.EnumC0247a.NONE;

    static {
        Covode.recordClassIndex(6480);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6481);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final b a() {
        return this.f11881h.get(this.f11882i);
    }

    public final b b(a.EnumC0247a aVar) {
        l.d(aVar, "");
        return this.f11881h.get(aVar);
    }

    public final void a(a.EnumC0247a aVar) {
        l.d(aVar, "");
        if (this.f11881h.containsKey(aVar)) {
            this.f11881h.remove(aVar);
            if (this.f11882i == aVar) {
                this.f11877d = null;
                this.f11882i = a.EnumC0247a.NONE;
            }
        }
    }

    private static b a(long j2, DataChannel dataChannel, a.EnumC0247a aVar) {
        int i2 = d.f11885b[aVar.ordinal()];
        if (i2 == 1) {
            return new com.bytedance.android.live.liveinteract.cohost.b.a(j2, dataChannel);
        }
        if (i2 != 2) {
            return null;
        }
        return new com.bytedance.android.live.liveinteract.multiguest.b.a(j2, dataChannel);
    }

    public final void a(long j2, a.EnumC0247a aVar, DataChannel dataChannel, b bVar) {
        l.d(aVar, "");
        if (!this.f11881h.containsKey(aVar) || this.f11881h.get(aVar) == null) {
            this.f11881h.put(aVar, a(j2, dataChannel, aVar));
        }
        b bVar2 = this.f11881h.get(aVar);
        if (bVar2 != null) {
            this.f11878e.clear();
            List<b> list = this.f11878e;
            l.b(bVar2, "");
            list.add(bVar2);
            bVar2.f11864g = bVar.f11858b;
            bVar2.f11865h = bVar.f11859c;
        } else {
            bVar2 = null;
        }
        this.f11877d = bVar2;
        this.f11876c = dataChannel;
        this.f11882i = aVar;
    }
}
