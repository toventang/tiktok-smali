package com.ss.videoarch.strategy.b;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    final String f154426a;

    /* renamed from: b  reason: collision with root package name */
    final b f154427b;

    /* renamed from: c  reason: collision with root package name */
    final List<Pair<String, String>> f154428c;

    /* renamed from: d  reason: collision with root package name */
    final ThreadPoolExecutor f154429d;

    static {
        Covode.recordClassIndex(102924);
    }

    static class b implements b {
        static {
            Covode.recordClassIndex(102926);
        }

        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        @Override // com.ss.videoarch.strategy.b.b
        public final String a(String str, byte[] bArr, String str2) {
            throw new RuntimeException("no implementation");
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f154430a;

        /* renamed from: b  reason: collision with root package name */
        public b f154431b;

        /* renamed from: c  reason: collision with root package name */
        public ThreadPoolExecutor f154432c;

        static {
            Covode.recordClassIndex(102925);
        }

        public final d a() {
            return new d(this, (byte) 0);
        }
    }

    private d(a aVar) {
        this.f154426a = aVar.f154430a;
        if (aVar.f154431b == null) {
            this.f154427b = new b((byte) 0);
        } else {
            this.f154427b = aVar.f154431b;
        }
        this.f154428c = new ArrayList();
        this.f154429d = aVar.f154432c;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
