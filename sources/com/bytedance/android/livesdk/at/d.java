package com.bytedance.android.livesdk.at;

import com.bytedance.android.livesdk.at.a;
import com.bytedance.covode.number.Covode;

public class d extends a {

    /* renamed from: b  reason: collision with root package name */
    String f14134b;

    /* renamed from: c  reason: collision with root package name */
    String f14135c;

    /* renamed from: d  reason: collision with root package name */
    String f14136d;

    /* renamed from: e  reason: collision with root package name */
    public long f14137e;

    /* renamed from: f  reason: collision with root package name */
    String f14138f;

    static {
        Covode.recordClassIndex(7831);
    }

    public static final class b<T extends a<T>> extends a<T> {
        static {
            Covode.recordClassIndex(7833);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.a.AbstractC0307a, com.bytedance.android.livesdk.at.d.a
        public final /* bridge */ /* synthetic */ a.AbstractC0307a a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.d.a
        public final T b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.at.d.a
        public final d c() {
            return new d(this);
        }
    }

    public static final class c extends a<c> {
        static {
            Covode.recordClassIndex(7834);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.a.AbstractC0307a, com.bytedance.android.livesdk.at.d.a
        public final /* bridge */ /* synthetic */ a.AbstractC0307a a() {
            return this;
        }

        /* Return type fixed from 'com.bytedance.android.livesdk.at.d$a' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.d.a
        public final /* bridge */ /* synthetic */ c b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.at.d.a
        public final d c() {
            return new d(this);
        }
    }

    public static abstract class a<T extends a<T>> extends a.AbstractC0307a<a<T>> {

        /* renamed from: b  reason: collision with root package name */
        String f14139b = "";

        /* renamed from: c  reason: collision with root package name */
        String f14140c = "";

        /* renamed from: d  reason: collision with root package name */
        String f14141d = "";

        /* renamed from: e  reason: collision with root package name */
        long f14142e;

        /* renamed from: f  reason: collision with root package name */
        String f14143f = "";

        static {
            Covode.recordClassIndex(7832);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T a();

        public abstract d c();

        public final T b(long j2) {
            this.f14142e = j2;
            return a();
        }

        public final T c(String str) {
            this.f14141d = str;
            return a();
        }

        public final T d(String str) {
            this.f14143f = str;
            return a();
        }

        public final T a(String str) {
            this.f14139b = str;
            return a();
        }

        public final T b(String str) {
            this.f14140c = str;
            return a();
        }
    }

    d(a aVar) {
        super(aVar);
        this.f14134b = aVar.f14139b;
        this.f14135c = aVar.f14140c;
        this.f14136d = aVar.f14141d;
        this.f14137e = aVar.f14142e;
        this.f14138f = aVar.f14143f;
    }
}
