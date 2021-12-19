package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import com.bytedance.android.livesdkapi.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import java.util.HashMap;
import java.util.Map;

public final class r implements com.bytedance.android.livesdkapi.host.b {

    /* renamed from: a  reason: collision with root package name */
    private final com.bytedance.android.livesdkapi.d.b f108493a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final e f108494b = new b(d.a());

    static {
        Covode.recordClassIndex(69525);
    }

    @Override // com.bytedance.android.live.base.a
    public final void onInit() {
    }

    static class a implements com.bytedance.android.livesdkapi.d.b {
        static {
            Covode.recordClassIndex(69526);
        }

        private a() {
        }

        @Override // com.bytedance.android.livesdkapi.d.b
        public final void a() {
            com.bytedance.android.livesdkapi.d.a.f22941c.a(true);
        }

        @Override // com.bytedance.android.livesdkapi.d.b
        public final boolean b() {
            return SharePrefCache.inst().isEnableMessagePb2Json().c().booleanValue();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.b
    public final com.bytedance.android.livesdkapi.d.b a() {
        return this.f108493a;
    }

    @Override // com.bytedance.android.livesdkapi.host.b
    public final e b() {
        return this.f108494b;
    }

    r() {
    }

    static class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private com.bytedance.ies.f.b f108495a;

        /* renamed from: b  reason: collision with root package name */
        private Map<String, Object> f108496b = new HashMap();

        static {
            Covode.recordClassIndex(69527);
        }

        private static void a(boolean z) {
            if (!z) {
                throw new IllegalArgumentException();
            }
        }

        b(Context context) {
            this.f108495a = com.bytedance.ies.f.b.a(context, "live-app-core-sdk");
        }

        @Override // com.bytedance.android.livesdkapi.e
        public final void b(e.a aVar) {
            boolean z;
            if (aVar.type() == e.b.Boolean) {
                z = true;
            } else {
                z = false;
            }
            a(z);
            this.f108496b.put(aVar.key(), Boolean.TRUE);
            if (aVar.supportPersist()) {
                this.f108495a.f33819a.edit().putBoolean(aVar.key(), true).apply();
            }
        }

        @Override // com.bytedance.android.livesdkapi.e
        public final boolean a(e.a aVar) {
            boolean z;
            if (aVar.type() == e.b.Boolean) {
                z = true;
            } else {
                z = false;
            }
            a(z);
            Boolean bool = (Boolean) this.f108496b.get(aVar.key());
            if (bool == null) {
                if (aVar.supportPersist()) {
                    bool = Boolean.valueOf(this.f108495a.a(aVar.key(), ((Boolean) aVar.defValue()).booleanValue()));
                } else {
                    bool = (Boolean) aVar.defValue();
                }
                this.f108496b.put(aVar.key(), bool);
            }
            return bool.booleanValue();
        }

        @Override // com.bytedance.android.livesdkapi.e
        public final int c(e.a aVar) {
            boolean z;
            if (aVar.type() == e.b.Integer) {
                z = true;
            } else {
                z = false;
            }
            a(z);
            Integer num = (Integer) this.f108496b.get(aVar.key());
            if (num == null) {
                if (aVar.supportPersist()) {
                    num = Integer.valueOf(this.f108495a.a(aVar.key(), ((Integer) aVar.defValue()).intValue()));
                } else {
                    num = (Integer) aVar.defValue();
                }
                this.f108496b.put(aVar.key(), num);
            }
            return num.intValue();
        }

        @Override // com.bytedance.android.livesdkapi.e
        public final void a(e.a aVar, int i2) {
            boolean z;
            if (aVar.type() == e.b.Integer) {
                z = true;
            } else {
                z = false;
            }
            a(z);
            this.f108496b.put(aVar.key(), Integer.valueOf(i2));
            if (aVar.supportPersist()) {
                this.f108495a.f33819a.edit().putInt(aVar.key(), i2).apply();
            }
        }
    }
}
