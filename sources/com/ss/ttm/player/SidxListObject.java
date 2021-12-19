package com.ss.ttm.player;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public class SidxListObject extends NativeObject {

    /* renamed from: a  reason: collision with root package name */
    public int f151965a;

    /* renamed from: b  reason: collision with root package name */
    public int f151966b;

    /* renamed from: c  reason: collision with root package name */
    public int f151967c;

    /* renamed from: d  reason: collision with root package name */
    public int f151968d;

    /* renamed from: e  reason: collision with root package name */
    public long f151969e;

    /* renamed from: f  reason: collision with root package name */
    public String f151970f;

    /* renamed from: g  reason: collision with root package name */
    private List<a> f151971g = new ArrayList();

    static {
        Covode.recordClassIndex(101315);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f151972a;

        /* renamed from: b  reason: collision with root package name */
        public long f151973b;

        /* renamed from: c  reason: collision with root package name */
        public long f151974c;

        /* renamed from: d  reason: collision with root package name */
        public long f151975d;

        /* renamed from: e  reason: collision with root package name */
        public long f151976e;

        static {
            Covode.recordClassIndex(101316);
        }

        public a(int i2, long j2, long j3, long j4, long j5) {
            this.f151972a = i2;
            this.f151973b = j2;
            this.f151974c = j3;
            this.f151975d = j4;
            this.f151976e = j5;
        }
    }

    public void addItem(int i2, long j2, long j3, long j4, long j5) {
        this.f151971g.add(new a(i2, j2, j3, j4, j5));
    }

    public SidxListObject(int i2, int i3, int i4, int i5, long j2, String str) {
        this.f151965a = i2;
        this.f151966b = i3;
        this.f151967c = i4;
        this.f151968d = i5;
        this.f151969e = j2;
        this.f151970f = str;
    }
}
