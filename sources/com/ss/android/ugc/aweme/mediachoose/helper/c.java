package com.ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.mediachoose.a.c;
import com.ss.android.ugc.aweme.mediachoose.d;
import com.ss.android.ugc.aweme.mediachoose.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static c f109414a;

    /* renamed from: b  reason: collision with root package name */
    Context f109415b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, MediaModel> f109416c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    final HashMap<Integer, List<MediaModel>> f109417d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    final List<MediaModel> f109418e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final Set<a> f109419f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f109420g = true;

    public interface a {
        static {
            Covode.recordClassIndex(70075);
        }

        void a(boolean z, List<MediaModel> list);
    }

    static {
        Covode.recordClassIndex(70074);
    }

    public final void b() {
        this.f109418e.clear();
    }

    public final List<MediaModel> c() {
        return new ArrayList(this.f109418e);
    }

    public final List<MediaModel> a() {
        List<MediaModel> list = this.f109417d.get(4);
        if (list != null) {
            return new ArrayList(list);
        }
        return new ArrayList();
    }

    public final void a(MediaModel mediaModel) {
        if (mediaModel != null && !this.f109418e.contains(mediaModel)) {
            this.f109418e.add(mediaModel);
        }
    }

    private c(Context context, boolean z) {
        this.f109420g = z;
        this.f109415b = context;
    }

    public static synchronized void a(Context context, boolean z) {
        synchronized (c.class) {
            MethodCollector.i(11678);
            if (f109414a == null) {
                f109414a = new c(context, z);
            }
            MethodCollector.o(11678);
        }
    }

    public final void a(int i2, int i3, int i4, e eVar) {
        i.b(new f(this, i2, i3, i4), i.f4824a).a(new g(this, i3, eVar, i2), i.f4826c, null);
    }

    public static void a(int i2, int i3, int i4, e eVar, d dVar) {
        c.a.a().a(new com.ss.android.ugc.aweme.mediachoose.a.e(i2, i3, i4), dVar).a(new d(eVar, dVar), new e(eVar, i2, dVar));
    }
}
