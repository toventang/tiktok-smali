package com.ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.a;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final c f109426a;

    /* renamed from: b  reason: collision with root package name */
    private final int f109427b;

    /* renamed from: c  reason: collision with root package name */
    private final int f109428c;

    /* renamed from: d  reason: collision with root package name */
    private final int f109429d;

    static {
        Covode.recordClassIndex(70078);
    }

    f(c cVar, int i2, int i3, int i4) {
        this.f109426a = cVar;
        this.f109427b = i2;
        this.f109428c = i3;
        this.f109429d = i4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        List<MediaModel> a2;
        c cVar = this.f109426a;
        int i2 = this.f109427b;
        int i3 = this.f109428c;
        int i4 = this.f109429d;
        q.a("MediaManager", "start load media " + System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        if (1 == i2) {
            arrayList.addAll(a.a(cVar.f109415b, true, i3, i4));
        } else if (4 == i2) {
            arrayList.addAll(a.a(cVar.f109415b, i3, i4));
        } else if (3 == i2) {
            arrayList.addAll(a.a(cVar.f109415b, false, i3, i4));
        } else if (2 == i2) {
            Context context = cVar.f109415b;
            l.d(context, "");
            new ArrayList();
            int i5 = Build.VERSION.SDK_INT;
            String[] strArr = null;
            a.b a3 = a.a((a.C2807a) null, i4, i3);
            String str = a3.f109412c;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            String str2 = "mime_type like ?";
            if (!z) {
                String str3 = a3.f109412c;
                str2 = str3 != null ? b.a(str3, str2) : null;
            }
            a3.f109412c = str2;
            a3.f109413d.add("%gif%");
            if (a3.f109413d.size() > 0) {
                Object[] array = a3.f109413d.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                strArr = (String[]) array;
            }
            if (i3 == -1) {
                if (h.f149997b) {
                    a2 = a.a(context, a3.f109412c, strArr, a3.f109410a, -1, -1);
                } else {
                    a2 = a.a(context, a3.f109412c, strArr, a3.f109410a);
                }
            } else if (h.f149997b) {
                a2 = a.a(context, a3.f109412c, strArr, a3.f109410a, i3, i4 * i3);
            } else {
                a2 = a.a(context, a3.f109412c, strArr, a3.f109410a + a3.f109411b);
            }
            arrayList.addAll(a2);
        } else if (i2 == 0) {
            arrayList.addAll(a.a(cVar.f109415b, i3, i4));
            arrayList.addAll(a.a(cVar.f109415b, true, i3, i4));
            Collections.sort(arrayList);
        }
        q.a("MediaManager", "end load media " + System.currentTimeMillis());
        return arrayList;
    }
}
