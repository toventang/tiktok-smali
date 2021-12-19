package com.bytedance.ies.im.core.api.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a.e;
import com.bytedance.ies.im.core.api.f.c;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f33955a = new a((byte) 0);

    public interface b {
        static {
            Covode.recordClassIndex(20204);
        }

        b a(c cVar);

        b a(ReferenceInfo referenceInfo);

        b a(String str);

        b a(List<? extends c> list);

        b a(Map<String, String> map);

        void a();

        void a(e eVar);

        b b(String str);
    }

    static {
        Covode.recordClassIndex(20202);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(20203);
        }

        private a() {
        }

        public static b a() {
            return com.bytedance.ies.im.core.api.c.f33958a.a();
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }
}
