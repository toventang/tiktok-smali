package com.bytedance.android.livesdk.at;

import android.app.Activity;
import com.bytedance.android.livesdk.at.a;
import com.bytedance.covode.number.Covode;

public final class k extends a {

    /* renamed from: b  reason: collision with root package name */
    public int f14164b;

    /* renamed from: c  reason: collision with root package name */
    String f14165c;

    /* renamed from: d  reason: collision with root package name */
    public Activity f14166d;

    /* renamed from: e  reason: collision with root package name */
    public long f14167e;

    public static final class c extends a<c> {
        static {
            Covode.recordClassIndex(7847);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.a.AbstractC0307a, com.bytedance.android.livesdk.at.k.a
        public final /* bridge */ /* synthetic */ a.AbstractC0307a a() {
            return this;
        }

        /* Return type fixed from 'com.bytedance.android.livesdk.at.k$a' to match base method */
        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.k.a
        public final /* bridge */ /* synthetic */ c b() {
            return this;
        }
    }

    static {
        Covode.recordClassIndex(7844);
    }

    public static final class b<T extends b<T>> extends a<T> {
        static {
            Covode.recordClassIndex(7846);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.a.AbstractC0307a, com.bytedance.android.livesdk.at.k.a
        public final /* bridge */ /* synthetic */ a.AbstractC0307a a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.k.a
        public final /* bridge */ /* synthetic */ a b() {
            return this;
        }

        public final k c() {
            return new k(this);
        }
    }

    public static abstract class a<T extends a<T>> extends a.AbstractC0307a<T> {

        /* renamed from: b  reason: collision with root package name */
        int f14168b;

        /* renamed from: c  reason: collision with root package name */
        String f14169c = "";

        /* renamed from: d  reason: collision with root package name */
        Activity f14170d;

        /* renamed from: e  reason: collision with root package name */
        long f14171e;

        static {
            Covode.recordClassIndex(7845);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract T a();

        public final T b(long j2) {
            this.f14171e = j2;
            return a();
        }

        public final T a(int i2) {
            this.f14168b = i2;
            return a();
        }

        public final T a(Activity activity) {
            this.f14170d = activity;
            return a();
        }

        public final T a(String str) {
            this.f14169c = str;
            return a();
        }
    }

    public k(a aVar) {
        super(aVar);
        this.f14165c = aVar.f14169c;
        this.f14164b = aVar.f14168b;
        this.f14166d = aVar.f14170d;
        this.f14167e = aVar.f14171e;
    }
}
