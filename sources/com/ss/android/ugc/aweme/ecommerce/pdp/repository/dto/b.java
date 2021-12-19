package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.ab.j;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class b extends com.ss.android.ugc.aweme.ecommerce.api.model.a<a> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f86684b = (j.b().f84212a * 1000);

    /* renamed from: c  reason: collision with root package name */
    public static final a f86685c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f86686a;

    public static final class a {
        static {
            Covode.recordClassIndex(54286);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ b() {
        this(-1, null, null);
    }

    static {
        Covode.recordClassIndex(54285);
    }

    public final boolean b() {
        if (SystemClock.elapsedRealtime() - this.f86686a > ((long) f86684b)) {
            return true;
        }
        return false;
    }

    public final boolean a() {
        T t;
        List<ProductPackStruct> list;
        ProductPackStruct productPackStruct;
        Integer num;
        if (!isCodeOK() || (t = this.data) == null || (list = t.f86678a) == null || list.isEmpty() || (productPackStruct = (ProductPackStruct) n.h((List) this.data.f86678a)) == null || (num = productPackStruct.f86639c) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final b a(b bVar) {
        a aVar;
        l.d(bVar, "");
        int i2 = this.code;
        String str = this.message;
        T t = this.data;
        if (t != null) {
            aVar = t.a(bVar.data);
        } else {
            aVar = null;
        }
        b bVar2 = new b(i2, str, aVar);
        bVar2.f86686a = this.f86686a;
        return bVar2;
    }

    private b(int i2, String str, a aVar) {
        super(i2, str, aVar);
        this.f86686a = SystemClock.elapsedRealtime();
    }
}
