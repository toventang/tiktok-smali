package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f103135a;

    /* renamed from: b  reason: collision with root package name */
    public long f103136b;

    /* renamed from: c  reason: collision with root package name */
    public long f103137c;

    /* renamed from: d  reason: collision with root package name */
    public int f103138d;

    /* renamed from: e  reason: collision with root package name */
    public int f103139e;

    /* renamed from: f  reason: collision with root package name */
    public int f103140f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a f103141g;

    /* renamed from: h  reason: collision with root package name */
    public final long f103142h;

    /* renamed from: i  reason: collision with root package name */
    public final long f103143i;

    /* renamed from: j  reason: collision with root package name */
    private final h f103144j = i.a((h.f.a.a) a.f103145a);

    static {
        Covode.recordClassIndex(66133);
    }

    public final List<String> a() {
        return (List) this.f103144j.getValue();
    }

    static final class a extends m implements h.f.a.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103145a = new a();

        static {
            Covode.recordClassIndex(66134);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<String> invoke() {
            return new ArrayList();
        }
    }

    public final String toString() {
        int size = a().size();
        String str = "[";
        for (int i2 = 0; i2 < size; i2++) {
            str = str + a().get(i2) + ',';
            if (i2 == 1) {
                break;
            }
        }
        return "RelationFetchResult{fetchScene=" + this.f103141g + ", initMaxTime=" + this.f103142h + ", initMinTime=" + this.f103143i + ", fullSuccess=" + this.f103135a + ", fetchedMaxTime=" + this.f103136b + ", fetchedMinTime=" + this.f103137c + ", fetchedSize=" + this.f103138d + ", updatedSize=" + this.f103139e + ", fetchTimes=" + this.f103140f + ", logIdList=" + (str + "]") + '}';
    }

    public b(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a aVar, long j2, long j3) {
        l.d(aVar, "");
        this.f103141g = aVar;
        this.f103142h = j2;
        this.f103143i = j3;
    }
}
