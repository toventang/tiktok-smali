package com.ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import com.ss.android.ugc.effectmanager.disklrucache.DiskLruCache;
import com.ss.android.ugc.tools.utils.i;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.z;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

public final class t<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f126078c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f126079a;

    /* renamed from: b  reason: collision with root package name */
    public final String f126080b;

    /* renamed from: d  reason: collision with root package name */
    private final h f126081d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f126082e;

    /* renamed from: f  reason: collision with root package name */
    private final c<T> f126083f;

    static {
        Covode.recordClassIndex(82800);
    }

    private final DiskLruCache b() {
        return (DiskLruCache) this.f126081d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(82801);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<DiskLruCache> {
        final /* synthetic */ t this$0;

        static {
            Covode.recordClassIndex(82802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(t tVar) {
            super(0);
            this.this$0 = tVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DiskLruCache invoke() {
            return DiskLruCache.open(new File(this.this$0.f126080b), 1, 1, this.this$0.f126079a);
        }
    }

    public final void a() {
        try {
            b().delete();
            DiskLruCache b2 = b();
            l.b(b2, "");
            a(b2.getDirectory());
        } catch (Exception unused) {
        }
    }

    public final y<T> a(String str) {
        l.d(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        DiskLruCache.Snapshot snapshot = b().get(MD5Utils.getMD5String(str));
        if (snapshot == null) {
            return null;
        }
        try {
            InputStream inputStream = snapshot.getInputStream(0);
            l.b(inputStream, "");
            y<T> a2 = this.f126083f.a(inputStream);
            inputStream.close();
            return a2;
        } finally {
            snapshot.close();
        }
    }

    public final boolean b(String str) {
        DiskLruCache.Snapshot snapshot;
        l.d(str, "");
        if (TextUtils.isEmpty(str) || (snapshot = b().get(MD5Utils.getMD5String(str))) == null) {
            return false;
        }
        snapshot.close();
        return true;
    }

    private static boolean a(File file) {
        MethodCollector.i(5474);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.b(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(5474);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(5474);
        return delete;
    }

    public t(Context context, String str, c<T> cVar) {
        l.d(context, "");
        l.d(str, "");
        l.d(cVar, "");
        this.f126082e = context;
        this.f126080b = str;
        this.f126083f = cVar;
        long a2 = i.a(context);
        long j2 = 13107200;
        if (a2 > 52428800) {
            j2 = 52428800;
        } else if (a2 > 26214400) {
            j2 = 26214400;
        } else if (a2 <= 13107200) {
            j2 = 10485760;
        }
        this.f126079a = j2;
        this.f126081d = h.i.a((h.f.a.a) new b(this));
    }

    public final void a(String str, y<T> yVar, h.f.a.b<? super Boolean, z> bVar) {
        OutputStream newOutputStream;
        l.d(str, "");
        l.d(yVar, "");
        l.d(bVar, "");
        if (TextUtils.isEmpty(str)) {
            bVar.invoke(false);
            return;
        }
        DiskLruCache.Editor editor = null;
        try {
            DiskLruCache.Editor edit = b().edit(MD5Utils.getMD5String(str));
            if (edit != null && (newOutputStream = edit.newOutputStream(0)) != null) {
                this.f126083f.a(newOutputStream, yVar);
                newOutputStream.flush();
                newOutputStream.close();
                edit.commit();
                bVar.invoke(true);
                b().flush();
            }
        } catch (Exception unused) {
            if (0 != 0) {
                try {
                    editor.abort();
                } catch (Exception unused2) {
                }
            }
            bVar.invoke(false);
        }
    }
}
