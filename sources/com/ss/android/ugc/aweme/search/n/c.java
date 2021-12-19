package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import com.bytedance.track.b;
import h.f.b.l;
import java.util.UUID;

public final class c implements b<c> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f121542c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public b f121543a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final int f121544b;

    /* renamed from: d  reason: collision with root package name */
    private final String f121545d;

    static {
        Covode.recordClassIndex(79166);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(79167);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.provider.h
    public final String getSourceId() {
        return this.f121545d;
    }

    /* Return type fixed from 'com.bytedance.provider.h' to match base method */
    @Override // com.bytedance.track.b
    public final /* synthetic */ c makeCopy() {
        c cVar = new c(this.f121544b);
        b bVar = this.f121543a;
        String str = bVar.f121540a;
        String str2 = bVar.f121541b;
        l.d(str, "");
        l.d(str2, "");
        cVar.f121543a = new b(str, str2);
        return cVar;
    }

    public c(int i2) {
        this.f121544b = i2;
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        this.f121545d = uuid;
    }
}
