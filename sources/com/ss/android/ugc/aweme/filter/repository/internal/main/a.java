package com.ss.android.ugc.aweme.filter.repository.internal.main;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.c.a.q;
import com.ss.android.ugc.aweme.filter.repository.a.a.b;
import com.ss.android.ugc.aweme.filter.repository.a.f;
import com.ss.android.ugc.aweme.filter.repository.internal.d;
import com.ss.android.ugc.aweme.filter.repository.internal.e;
import com.ss.android.ugc.aweme.filter.repository.internal.utils.c;
import com.ss.android.ugc.tools.utils.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f95636a;

    /* renamed from: b  reason: collision with root package name */
    public final q<b> f95637b;

    /* renamed from: c  reason: collision with root package name */
    private final h f95638c = i.a((h.f.a.a) new C2308a(this));

    /* renamed from: d  reason: collision with root package name */
    private final String f95639d;

    /* renamed from: e  reason: collision with root package name */
    private final int f95640e;

    /* renamed from: f  reason: collision with root package name */
    private final List<p<int[], String>> f95641f;

    /* renamed from: g  reason: collision with root package name */
    private final AndroidResourceFilterBackupPreferences f95642g;

    static {
        Covode.recordClassIndex(60611);
    }

    /* access modifiers changed from: protected */
    public final b c() {
        return (b) this.f95638c.getValue();
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e
    public final void b() {
        this.f95642g.setResourcesVersion(-1);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.a$a  reason: collision with other inner class name */
    static final class C2308a extends m implements h.f.a.a<b> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(60612);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2308a(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return this.this$0.f95637b.b();
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.f95640e != this.f95642g.getResourcesVersion()) {
            for (T t : this.f95641f) {
                n.a(this.f95636a, (int[]) t.getFirst(), (String) t.getSecond());
            }
            this.f95642g.setResourcesVersion(this.f95640e);
        }
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e
    public List<f> a() {
        List list;
        d();
        String[] strArr = c().f95643a;
        String[] strArr2 = c().f95644b;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str = strArr[i2];
            int i4 = i3 + 1;
            int intValue = c().f95645c[i3].intValue();
            int i5 = -1 - i3;
            String valueOf = String.valueOf(i5);
            String str2 = strArr2[i3];
            if (i3 == 0) {
                list = h.a.n.c("normal");
            } else {
                list = z.INSTANCE;
            }
            arrayList.add(new f(i5, valueOf, str, str2, null, list, null, Uri.parse("res://" + this.f95636a.getPackageName() + '/' + intValue), ""));
            i2++;
            i3 = i4;
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e
    public final boolean a(f fVar) {
        l.d(fVar, "");
        if (fVar.f95550a < 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final String b(int i2) {
        return b.a(this.f95639d) + c().f95646d[i2];
    }

    @Override // com.ss.android.ugc.aweme.filter.repository.internal.e
    public d a(int i2) {
        File parentFile;
        String a2 = c.a(b(-1 - i2));
        String str = "";
        l.d(a2, str);
        if (!TextUtils.isEmpty(a2)) {
            File file = new File(a2);
            if (file.exists() && file.isFile() && (parentFile = file.getParentFile().getParentFile()) != null && parentFile.exists() && parentFile.isDirectory()) {
                String absolutePath = parentFile.getAbsolutePath();
                l.b(absolutePath, str);
                str = absolutePath;
            }
        }
        return new d(a2, str);
    }

    public a(Context context, String str, int i2, List<p<int[], String>> list, q<b> qVar, AndroidResourceFilterBackupPreferences androidResourceFilterBackupPreferences) {
        l.d(context, "");
        l.d(str, "");
        l.d(list, "");
        l.d(qVar, "");
        l.d(androidResourceFilterBackupPreferences, "");
        this.f95636a = context;
        this.f95639d = str;
        this.f95640e = i2;
        this.f95641f = list;
        this.f95637b = qVar;
        this.f95642g = androidResourceFilterBackupPreferences;
    }
}
