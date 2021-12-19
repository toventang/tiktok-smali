package com.ss.android.ugc.aweme.dsp.common.arch.a;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, a> f83288d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final C1960a f83289e = new C1960a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final String f83290a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.dsp.playerservice.a f83291b;

    /* renamed from: c  reason: collision with root package name */
    public final String f83292c;

    /* renamed from: com.ss.android.ugc.aweme.dsp.common.arch.a.a$a  reason: collision with other inner class name */
    public static final class C1960a {
        static {
            Covode.recordClassIndex(51929);
        }

        private C1960a() {
        }

        public /* synthetic */ C1960a(byte b2) {
            this();
        }

        public static a a(String str) {
            l.d(str, "");
            a aVar = a.f83288d.get(str);
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("TTDspPlayerPage not be null");
        }
    }

    static {
        Covode.recordClassIndex(51928);
    }

    public a(String str, com.ss.android.ugc.aweme.dsp.playerservice.a aVar, String str2) {
        l.d(str, "");
        l.d(aVar, "");
        this.f83290a = str;
        this.f83291b = aVar;
        this.f83292c = str2;
    }
}
