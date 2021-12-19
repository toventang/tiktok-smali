package com.ss.android.socialbase.downloader.segment;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final long f60927a;

    /* renamed from: b  reason: collision with root package name */
    final AtomicLong f60928b;

    /* renamed from: c  reason: collision with root package name */
    public long f60929c;

    /* renamed from: d  reason: collision with root package name */
    public int f60930d;

    /* renamed from: e  reason: collision with root package name */
    volatile l f60931e;

    /* renamed from: f  reason: collision with root package name */
    public int f60932f;

    /* renamed from: g  reason: collision with root package name */
    public JSONObject f60933g;

    /* renamed from: h  reason: collision with root package name */
    private volatile long f60934h;

    static {
        Covode.recordClassIndex(37563);
    }

    public final long a() {
        return this.f60928b.get() - this.f60927a;
    }

    public final long d() {
        l lVar = this.f60931e;
        if (lVar != null) {
            long j2 = lVar.f60960g;
            if (j2 > this.f60934h) {
                return j2;
            }
        }
        return this.f60934h;
    }

    public final long b() {
        long j2 = this.f60929c;
        if (j2 >= this.f60927a) {
            return (j2 - d()) + 1;
        }
        return -1;
    }

    public final long c() {
        long j2 = this.f60928b.get();
        long j3 = this.f60929c;
        if (j3 > 0) {
            long j4 = j3 + 1;
            if (j2 > j4) {
                return j4;
            }
        }
        return j2;
    }

    public final String toString() {
        return "Segment{startOffset=" + this.f60927a + ",\t currentOffset=" + this.f60928b + ",\t currentOffsetRead=" + d() + ",\t endOffset=" + this.f60929c + '}';
    }

    public final void c(long j2) {
        if (j2 >= this.f60928b.get()) {
            this.f60934h = j2;
        }
    }

    public final void a(long j2) {
        long j3 = this.f60927a;
        if (j2 < j3) {
            j2 = j3;
        }
        long j4 = this.f60929c;
        if (j4 > 0) {
            long j5 = j4 + 1;
            if (j2 > j5) {
                j2 = j5;
            }
        }
        this.f60928b.set(j2);
    }

    public i(i iVar) {
        AtomicLong atomicLong = new AtomicLong();
        this.f60928b = atomicLong;
        this.f60932f = 0;
        this.f60927a = iVar.f60927a;
        this.f60929c = iVar.f60929c;
        atomicLong.set(iVar.f60928b.get());
        this.f60934h = atomicLong.get();
        this.f60930d = iVar.f60930d;
    }

    public static String a(List<i> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Collections.sort(list, new Comparator<i>() {
            /* class com.ss.android.socialbase.downloader.segment.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37564);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(i iVar, i iVar2) {
                return (int) (iVar.f60927a - iVar2.f60927a);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (i iVar : list) {
            sb.append(iVar).append("\r\n");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final void b(long j2) {
        if (j2 >= this.f60927a) {
            this.f60929c = j2;
        } else if (j2 == -1) {
            this.f60929c = j2;
        }
    }

    public i(JSONObject jSONObject) {
        this.f60928b = new AtomicLong();
        this.f60932f = 0;
        this.f60927a = jSONObject.optLong("st");
        b(jSONObject.optLong("en"));
        a(jSONObject.optLong("cu"));
        c(c());
    }

    public i(long j2, long j3) {
        AtomicLong atomicLong = new AtomicLong();
        this.f60928b = atomicLong;
        this.f60932f = 0;
        this.f60927a = j2;
        atomicLong.set(j2);
        this.f60934h = j2;
        if (j3 >= j2) {
            this.f60929c = j3;
        } else {
            this.f60929c = -1;
        }
    }
}
