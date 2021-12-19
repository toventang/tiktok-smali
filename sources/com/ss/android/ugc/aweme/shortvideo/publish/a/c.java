package com.ss.android.ugc.aweme.shortvideo.publish.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f129681a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SynthetiseResult f129682b;

    /* renamed from: c  reason: collision with root package name */
    private a f129683c;

    /* renamed from: d  reason: collision with root package name */
    private String f129684d;

    static {
        Covode.recordClassIndex(85138);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85139);
        }

        private a() {
        }

        public static c a() {
            return new c((byte) 0);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final ee a() {
        ee eeVar = new ee(this.f129684d, this.f129682b);
        eeVar.setCancelCause(this.f129683c);
        return eeVar;
    }

    private c() {
        this.f129682b = new SynthetiseResult();
        this.f129683c = b.a.a().a();
        this.f129684d = "";
    }

    public /* synthetic */ c(byte b2) {
        this();
    }

    public final c a(SynthetiseResult synthetiseResult) {
        if (synthetiseResult != null) {
            this.f129682b = synthetiseResult;
        }
        return this;
    }

    public final c a(a aVar) {
        if (aVar != null) {
            this.f129683c = aVar;
        }
        return this;
    }

    public final c a(String str) {
        if (str != null) {
            this.f129684d = str;
        }
        return this;
    }
}
