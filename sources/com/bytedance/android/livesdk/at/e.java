package com.bytedance.android.livesdk.at;

import android.app.Activity;
import com.bytedance.android.livesdk.at.a;
import com.bytedance.android.livesdk.at.d;
import com.bytedance.covode.number.Covode;

public final class e extends d {

    /* renamed from: g  reason: collision with root package name */
    Activity f14144g;

    /* renamed from: h  reason: collision with root package name */
    String f14145h;

    /* renamed from: i  reason: collision with root package name */
    String f14146i;

    static {
        Covode.recordClassIndex(7835);
    }

    public static final class b<T extends a<T>> extends a<T> {
        static {
            Covode.recordClassIndex(7837);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.a.AbstractC0307a, com.bytedance.android.livesdk.at.d.a, com.bytedance.android.livesdk.at.e.a
        public final /* bridge */ /* synthetic */ a.AbstractC0307a a() {
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.d.a, com.bytedance.android.livesdk.at.e.a
        public final /* bridge */ /* synthetic */ d.a b() {
            return this;
        }

        @Override // com.bytedance.android.livesdk.at.d.a, com.bytedance.android.livesdk.at.e.a
        public final /* synthetic */ d c() {
            return c();
        }

        @Override // com.bytedance.android.livesdk.at.e.a
        public final e d() {
            return new e(this, (byte) 0);
        }
    }

    public static abstract class a<T extends d.a<T>> extends d.a<T> {

        /* renamed from: g  reason: collision with root package name */
        Activity f14147g;

        /* renamed from: h  reason: collision with root package name */
        String f14148h;

        /* renamed from: i  reason: collision with root package name */
        String f14149i;

        static {
            Covode.recordClassIndex(7836);
        }

        /* access modifiers changed from: package-private */
        @Override // com.bytedance.android.livesdk.at.d.a
        /* renamed from: b */
        public abstract T a();

        /* renamed from: d */
        public abstract e c();

        public final T e(String str) {
            this.f14148h = str;
            return a();
        }

        public final T f(String str) {
            this.f14149i = str;
            return a();
        }

        public final T a(Activity activity) {
            this.f14147g = activity;
            return a();
        }
    }

    private e(a aVar) {
        super(aVar);
        this.f14144g = aVar.f14147g;
        this.f14145h = aVar.f14148h;
        this.f14146i = aVar.f14149i;
    }

    /* synthetic */ e(a aVar, byte b2) {
        this(aVar);
    }
}
