package com.ss.android.ugc.aweme.choosemusic.model;

import android.app.Activity;
import android.database.Cursor;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.music.k.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class u {

    /* renamed from: f  reason: collision with root package name */
    private static final String f70686f = u.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    DataCenter f70687a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f70688b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70689c;

    /* renamed from: d  reason: collision with root package name */
    int f70690d;

    /* renamed from: e  reason: collision with root package name */
    Cursor f70691e;

    static {
        Covode.recordClassIndex(43582);
    }

    public u(DataCenter dataCenter) {
        this.f70687a = dataCenter;
    }

    public final void a(WeakReference<Activity> weakReference) {
        d(weakReference).a(new w(this, weakReference, System.currentTimeMillis()), i.f4826c, null);
    }

    public final void c(WeakReference<Activity> weakReference) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.f70689c) {
            this.f70689c = true;
            b(weakReference).a(new y(this, weakReference, currentTimeMillis), i.f4826c, null);
        }
    }

    private static i<List<MusicModel>> d(WeakReference<Activity> weakReference) {
        j jVar = new j();
        a.a(2, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                d.a(weakReference.get(), arrayList, new v(jVar));
            } catch (Exception e2) {
                a.b("Local Sound", "Scan Music throw a Exception");
                a.a((Throwable) e2);
            }
        }
        return jVar.f4869a;
    }

    public final i<List<MusicModel>> b(WeakReference<Activity> weakReference) {
        j jVar = new j();
        a.a(2, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                g.a().execute(new x(this, weakReference, arrayList, jVar));
            } catch (Exception e2) {
                a.b("Local Sound", "Scan Music throw a Exception");
                a.a((Throwable) e2);
            }
        }
        return jVar.f4869a;
    }

    public static String a(List<MusicModel> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(com.a.a("count: %s  \n", new Object[]{Integer.valueOf(list.size())}));
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(com.a.a("name %d: title: %s.\n", new Object[]{Integer.valueOf(i2), list.get(i2).getName()}));
        }
        return sb.toString();
    }
}
