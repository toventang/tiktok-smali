package com.bytedance.b.c.d;

import android.util.Pair;
import com.bytedance.b.j.e.a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

public final class a implements com.bytedance.b.j.e.a {

    /* renamed from: a  reason: collision with root package name */
    public double f26111a;

    /* renamed from: b  reason: collision with root package name */
    public double f26112b;

    /* renamed from: c  reason: collision with root package name */
    private Pair<Long, LinkedList<a.C0560a>> f26113c;

    /* renamed from: d  reason: collision with root package name */
    private Pair<Long, LinkedList<a.C0560a>> f26114d;

    static {
        Covode.recordClassIndex(15189);
    }

    @Override // com.bytedance.b.j.e.a
    public final double a() {
        return this.f26111a;
    }

    @Override // com.bytedance.b.j.e.a
    public final double b() {
        return this.f26112b;
    }

    /* renamed from: com.bytedance.b.c.d.a$a  reason: collision with other inner class name */
    public static final class C0557a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f26115a = new a((byte) 0);

        static {
            Covode.recordClassIndex(15190);
        }
    }

    private a() {
        this.f26111a = -1.0d;
        this.f26112b = -1.0d;
        this.f26113c = new Pair<>(0L, new LinkedList());
        this.f26114d = new Pair<>(0L, new LinkedList());
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final synchronized void a(LinkedList<a.C0560a> linkedList) {
        this.f26113c = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }

    public final synchronized void b(LinkedList<a.C0560a> linkedList) {
        this.f26114d = new Pair<>(Long.valueOf(System.currentTimeMillis()), linkedList);
    }
}
