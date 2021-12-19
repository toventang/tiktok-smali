package com.ss.android.ugc.aweme.notification.e.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2899a f113341a = new C2899a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public static final a f113342b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f113343c = i.a((h.f.a.a) b.f113346a);

    public static C2899a a() {
        return (C2899a) f113343c.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.e.a.a$a  reason: collision with other inner class name */
    public static final class C2899a {
        @c(a = "enable")

        /* renamed from: a  reason: collision with root package name */
        public final boolean f113344a;
        @c(a = "enable_slardar")

        /* renamed from: b  reason: collision with root package name */
        public final boolean f113345b;

        static {
            Covode.recordClassIndex(72905);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2899a)) {
                return false;
            }
            C2899a aVar = (C2899a) obj;
            return this.f113344a == aVar.f113344a && this.f113345b == aVar.f113345b;
        }

        public final int hashCode() {
            boolean z = this.f113344a;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = i3 * 31;
            if (!this.f113345b) {
                i2 = 0;
            }
            return i6 + i2;
        }

        public final String toString() {
            return "Meta(enable=" + this.f113344a + ", enableSlardar=" + this.f113345b + ")";
        }

        private C2899a() {
            this.f113344a = true;
            this.f113345b = false;
        }

        public /* synthetic */ C2899a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<C2899a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f113346a = new b();

        static {
            Covode.recordClassIndex(72906);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C2899a invoke() {
            Object a2 = SettingsManager.a().a("inbox_adapter_notify_fixer", C2899a.class, a.f113341a);
            if (a2 == null) {
                return new C2899a((byte) 0);
            }
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(72904);
    }
}
