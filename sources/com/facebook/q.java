package com.facebook;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class q extends AbstractList<GraphRequest> {

    /* renamed from: g  reason: collision with root package name */
    private static AtomicInteger f49008g = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public Handler f49009a;

    /* renamed from: b  reason: collision with root package name */
    public List<GraphRequest> f49010b;

    /* renamed from: c  reason: collision with root package name */
    public int f49011c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49012d;

    /* renamed from: e  reason: collision with root package name */
    public List<a> f49013e;

    /* renamed from: f  reason: collision with root package name */
    public String f49014f;

    public interface a {
        static {
            Covode.recordClassIndex(29526);
        }

        void a();
    }

    public interface b extends a {
        static {
            Covode.recordClassIndex(29527);
        }
    }

    public final p a() {
        return GraphRequest.b(this);
    }

    public final void clear() {
        this.f49010b.clear();
    }

    public final int size() {
        return this.f49010b.size();
    }

    static {
        Covode.recordClassIndex(29525);
    }

    public q() {
        this.f49010b = new ArrayList();
        this.f49011c = 0;
        this.f49012d = Integer.valueOf(f49008g.incrementAndGet()).toString();
        this.f49013e = new ArrayList();
        this.f49010b = new ArrayList();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ GraphRequest remove(int i2) {
        return this.f49010b.remove(i2);
    }

    /* renamed from: a */
    public final GraphRequest get(int i2) {
        return this.f49010b.get(i2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList
    public final /* bridge */ /* synthetic */ boolean add(GraphRequest graphRequest) {
        return this.f49010b.add(graphRequest);
    }

    public final void a(a aVar) {
        if (!this.f49013e.contains(aVar)) {
            this.f49013e.add(aVar);
        }
    }

    public q(Collection<GraphRequest> collection) {
        this.f49010b = new ArrayList();
        this.f49011c = 0;
        this.f49012d = Integer.valueOf(f49008g.incrementAndGet()).toString();
        this.f49013e = new ArrayList();
        this.f49010b = new ArrayList(collection);
    }

    public q(GraphRequest... graphRequestArr) {
        this.f49010b = new ArrayList();
        this.f49011c = 0;
        this.f49012d = Integer.valueOf(f49008g.incrementAndGet()).toString();
        this.f49013e = new ArrayList();
        this.f49010b = Arrays.asList(graphRequestArr);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ void add(int i2, GraphRequest graphRequest) {
        this.f49010b.add(i2, graphRequest);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, java.util.AbstractList
    public final /* bridge */ /* synthetic */ GraphRequest set(int i2, GraphRequest graphRequest) {
        return this.f49010b.set(i2, graphRequest);
    }
}
