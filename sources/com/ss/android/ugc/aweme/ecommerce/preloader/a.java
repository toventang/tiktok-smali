package com.ss.android.ugc.aweme.ecommerce.preloader;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;

public abstract class a extends com.ss.android.ugc.aweme.ecommerce.track.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2091a f86946a = new C2091a((byte) 0);

    static {
        Covode.recordClassIndex(54508);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.preloader.a$a  reason: collision with other inner class name */
    public static final class C2091a {
        static {
            Covode.recordClassIndex(54509);
        }

        private C2091a() {
        }

        public /* synthetic */ C2091a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.track.a
    public final HashMap<String, Object> a() {
        return new HashMap<>();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(str);
        l.d(str, "");
        this.f87523k.put("EVENT_ORIGIN_FEATURE", "TEMAI");
    }
}
