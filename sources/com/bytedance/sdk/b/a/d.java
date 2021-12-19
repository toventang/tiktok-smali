package com.bytedance.sdk.b.a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.ExecutorService;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Context f43484a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43485b;

    /* renamed from: c  reason: collision with root package name */
    public c f43486c;

    /* renamed from: d  reason: collision with root package name */
    public b f43487d;

    /* renamed from: e  reason: collision with root package name */
    public a f43488e;

    /* renamed from: f  reason: collision with root package name */
    public Set<String> f43489f;

    /* renamed from: g  reason: collision with root package name */
    public String f43490g;

    /* renamed from: h  reason: collision with root package name */
    public ExecutorService f43491h;

    /* renamed from: i  reason: collision with root package name */
    public int f43492i;

    /* renamed from: j  reason: collision with root package name */
    public com.bytedance.sdk.b.b.d f43493j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f43494k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public c f43495a;

        /* renamed from: b  reason: collision with root package name */
        public Context f43496b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f43497c;

        /* renamed from: d  reason: collision with root package name */
        public b f43498d;

        /* renamed from: e  reason: collision with root package name */
        public a f43499e;

        /* renamed from: f  reason: collision with root package name */
        public Set<String> f43500f;

        /* renamed from: g  reason: collision with root package name */
        public String f43501g;

        /* renamed from: h  reason: collision with root package name */
        public ExecutorService f43502h;

        /* renamed from: i  reason: collision with root package name */
        public int f43503i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f43504j = true;

        static {
            Covode.recordClassIndex(26635);
        }
    }

    static {
        Covode.recordClassIndex(26634);
    }

    private d() {
        this.f43494k = true;
    }

    private d(a aVar) {
        this.f43494k = true;
        this.f43486c = aVar.f43495a;
        this.f43484a = aVar.f43496b;
        this.f43485b = aVar.f43497c;
        this.f43487d = aVar.f43498d;
        this.f43488e = aVar.f43499e;
        this.f43489f = aVar.f43500f;
        this.f43490g = aVar.f43501g;
        this.f43491h = aVar.f43502h;
        int i2 = aVar.f43503i;
        this.f43492i = i2;
        if (i2 <= 0) {
            this.f43492i = 1800;
        }
        this.f43494k = aVar.f43504j;
    }

    public /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
