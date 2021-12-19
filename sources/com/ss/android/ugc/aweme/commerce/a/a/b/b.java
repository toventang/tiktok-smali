package com.ss.android.ugc.aweme.commerce.a.a.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final long f73333a;

    /* renamed from: b  reason: collision with root package name */
    public final String f73334b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f73335c;

    /* renamed from: d  reason: collision with root package name */
    public a f73336d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<a> f73337e = new ArrayList<>();

    static {
        Covode.recordClassIndex(45152);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f73338a;

        /* renamed from: b  reason: collision with root package name */
        public final int f73339b;

        /* renamed from: c  reason: collision with root package name */
        public final int f73340c;

        /* renamed from: d  reason: collision with root package name */
        public final int f73341d;

        static {
            Covode.recordClassIndex(45153);
        }

        public final int a() {
            return (this.f73341d - this.f73339b) * (this.f73340c - this.f73338a);
        }

        public final a a(a aVar) {
            return new a(Math.max(this.f73338a, aVar.f73338a), Math.max(this.f73339b, aVar.f73339b), Math.min(this.f73340c, aVar.f73340c), Math.min(this.f73341d, aVar.f73341d));
        }

        public a(int i2, int i3, int i4, int i5) {
            this.f73338a = i2;
            this.f73339b = i3;
            this.f73340c = i4;
            this.f73341d = i5;
        }
    }

    public b(long j2, String str) {
        this.f73333a = j2;
        this.f73334b = str;
    }
}
