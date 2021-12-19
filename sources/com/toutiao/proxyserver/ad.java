package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import com.toutiao.proxyserver.g.b;
import java.util.ArrayDeque;
import java.util.List;
import java.util.NoSuchElementException;

public final class ad {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f154769a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<a> f154770b;

    /* renamed from: c  reason: collision with root package name */
    private final ArrayDeque<a> f154771c;

    static {
        Covode.recordClassIndex(103101);
    }

    class a {

        /* renamed from: a  reason: collision with root package name */
        final String f154772a;

        /* renamed from: b  reason: collision with root package name */
        boolean f154773b = true;

        static {
            Covode.recordClassIndex(103102);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (this.f154773b) {
                ad.this.f154770b.addLast(this);
                this.f154773b = false;
            }
        }

        a(String str) {
            this.f154772a = str;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (!this.f154771c.isEmpty() || !this.f154770b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final a b() {
        if (!this.f154771c.isEmpty()) {
            return this.f154771c.removeFirst();
        }
        if (!this.f154770b.isEmpty()) {
            return this.f154770b.removeFirst();
        }
        throw new NoSuchElementException();
    }

    public ad(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("urls is empty");
        }
        int size = list.size();
        this.f154769a = list;
        this.f154771c = new ArrayDeque<>(size);
        this.f154770b = new ArrayDeque<>(size);
        for (String str : list) {
            if (b.a(str)) {
                this.f154771c.add(new a(str));
            }
        }
    }
}
