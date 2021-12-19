package com.bytedance.android.livesdk.y;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Integer, a> f22911a;

    /* renamed from: b  reason: collision with root package name */
    public ConcurrentHashMap<Integer, Integer> f22912b;

    /* renamed from: c  reason: collision with root package name */
    public ConcurrentHashMap<Integer, Integer> f22913c;

    /* renamed from: d  reason: collision with root package name */
    public int[][] f22914d;

    /* renamed from: e  reason: collision with root package name */
    public a f22915e;

    /* renamed from: f  reason: collision with root package name */
    public Thread f22916f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f22917g;

    static {
        Covode.recordClassIndex(13541);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static b f22918a = new b((byte) 0);

        static {
            Covode.recordClassIndex(13542);
        }
    }

    private b() {
        this.f22911a = new ConcurrentHashMap<>();
        this.f22912b = new ConcurrentHashMap<>();
        this.f22913c = new ConcurrentHashMap<>();
        this.f22917g = new Handler(Looper.getMainLooper());
    }

    public final void b() {
        if (!(this.f22915e == null || Thread.currentThread() == Looper.getMainLooper().getThread())) {
            this.f22916f = Thread.currentThread();
            for (a aVar = this.f22915e; aVar != null; aVar = aVar.mNextTask) {
                aVar.start();
            }
            this.f22916f = null;
        }
    }

    public final void a() {
        if (this.f22915e != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
            for (a aVar = this.f22915e; aVar != null; aVar = aVar.mNextTask) {
                Iterator<Integer> it = aVar.preTasks().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        if (!(next.intValue() == aVar.getTaskId() || this.f22911a.get(next).isFinished())) {
                            break;
                        }
                    } else if (aVar.isIDLE()) {
                        aVar.start();
                    }
                }
            }
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(int i2, a aVar) {
        if (!this.f22911a.containsKey(Integer.valueOf(i2))) {
            this.f22911a.put(Integer.valueOf(i2), aVar);
            int size = this.f22912b.size();
            this.f22912b.put(Integer.valueOf(i2), Integer.valueOf(size));
            this.f22913c.put(Integer.valueOf(size), Integer.valueOf(i2));
        }
    }

    public final boolean a(int i2, int[] iArr, Stack stack) {
        iArr[i2] = -1;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (this.f22914d[i2][i3] == 1) {
                if (iArr[i3] < 0) {
                    return false;
                }
                if (iArr[i3] != 1 && !a(i3, iArr, stack)) {
                    return false;
                }
            }
        }
        iArr[i2] = 1;
        stack.push(Integer.valueOf(i2));
        return true;
    }
}
