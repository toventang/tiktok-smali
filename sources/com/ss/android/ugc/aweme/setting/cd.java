package com.ss.android.ugc.aweme.setting;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.setting.model.n;

public final class cd {

    /* renamed from: a  reason: collision with root package name */
    public static int f122157a = 10800000;

    /* renamed from: b  reason: collision with root package name */
    public static cd f122158b = new cd();

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<n> f122159c = new SparseArray<>(4);

    public interface a {
        static {
            Covode.recordClassIndex(80084);
        }

        void cz_();
    }

    private cd() {
    }

    public static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(80083);
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f122159c.size(); i2++) {
            n valueAt = this.f122159c.valueAt(i2);
            if (valueAt != null && System.currentTimeMillis() - valueAt.f122340b > ((long) f122157a)) {
                valueAt.f122342d.cz_();
            }
        }
    }

    public final void a(int i2, a aVar) {
        this.f122159c.put(i2, new n(System.currentTimeMillis(), aVar));
    }

    public final void a(int i2, boolean z) {
        if (this.f122159c.get(i2) != null) {
            this.f122159c.get(i2).f122340b = System.currentTimeMillis();
            this.f122159c.get(i2).f122339a = z;
            if (z) {
                this.f122159c.get(i2).f122341c = 0;
            }
        }
    }
}
