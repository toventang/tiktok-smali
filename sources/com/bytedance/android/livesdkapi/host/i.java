package com.bytedance.android.livesdkapi.host;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public interface i extends com.bytedance.android.live.base.a {

    /* renamed from: a  reason: collision with root package name */
    public static final i f23246a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a f23247b = new a((byte) 0);

    void a(String str, String str2);

    public static final class a {
        static {
            Covode.recordClassIndex(13814);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements i {
        static {
            Covode.recordClassIndex(13815);
        }

        @Override // com.bytedance.android.livesdkapi.host.i
        public final void a(String str, String str2) {
            l.d(str, "");
            l.d(str2, "");
        }

        @Override // com.bytedance.android.live.base.a
        public final void onInit() {
        }

        b() {
        }
    }

    static {
        Covode.recordClassIndex(13813);
    }
}
