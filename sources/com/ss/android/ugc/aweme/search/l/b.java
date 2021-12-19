package com.ss.android.ugc.aweme.search.l;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<T> f121377a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<T> f121378b;

    /* renamed from: c  reason: collision with root package name */
    private final a<T> f121379c = new a<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f121380d;

    static {
        Covode.recordClassIndex(79082);
    }

    public final ArrayList<T> a() {
        if (!this.f121380d) {
            return this.f121377a;
        }
        if (this.f121378b == null) {
            this.f121378b = new ArrayList<>(this.f121377a);
        }
        return this.f121378b;
    }

    public final a<T> b() {
        if (!this.f121380d) {
            this.f121380d = true;
            this.f121378b = null;
            this.f121379c.f121381a = this.f121377a;
            this.f121379c.f121382b = this.f121377a.size();
            return this.f121379c;
        }
        throw new IllegalStateException("Iteration already started");
    }

    public final void c() {
        if (this.f121380d) {
            this.f121380d = false;
            ArrayList<T> arrayList = this.f121378b;
            if (arrayList != null) {
                this.f121377a = arrayList;
                this.f121379c.f121381a.clear();
                this.f121379c.f121382b = 0;
            }
            this.f121378b = null;
            return;
        }
        throw new IllegalStateException("Iteration not started");
    }

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<T> f121381a;

        /* renamed from: b  reason: collision with root package name */
        public int f121382b;

        static {
            Covode.recordClassIndex(79083);
        }

        public final T a(int i2) {
            return this.f121381a.get(i2);
        }
    }
}
