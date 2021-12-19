package com.ss.android.ugc.aweme.d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.p;
import h.v;
import java.util.ArrayList;
import java.util.List;

public abstract class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f79335a;

    static {
        Covode.recordClassIndex(49250);
    }

    public abstract void a(a aVar);

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<p<Integer, Integer>> f79336a = new ArrayList();

        static {
            Covode.recordClassIndex(49251);
        }

        public final void a() {
            e.this.a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        public final a a(int i2, int i3) {
            this.f79336a.add(v.a(Integer.valueOf(i2), Integer.valueOf(i3)));
            return this;
        }
    }

    public final a a() {
        return new a();
    }

    public e(Activity activity) {
        l.c(activity, "");
        this.f79335a = activity;
    }
}
