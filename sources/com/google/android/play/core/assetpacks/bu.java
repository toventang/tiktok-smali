package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.a;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import com.google.android.play.core.b.r;
import com.google.android.play.core.tasks.d;
import com.google.android.play.core.tasks.f;
import com.google.android.play.core.tasks.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

final class bu implements dj {

    /* renamed from: a  reason: collision with root package name */
    static final b f52918a = new b("FakeAssetPackService");

    /* renamed from: i  reason: collision with root package name */
    private static final AtomicInteger f52919i = new AtomicInteger(1);

    /* renamed from: b  reason: collision with root package name */
    final w f52920b;

    /* renamed from: c  reason: collision with root package name */
    final Context f52921c;

    /* renamed from: d  reason: collision with root package name */
    final cg f52922d;

    /* renamed from: e  reason: collision with root package name */
    final Handler f52923e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    private final String f52924f;

    /* renamed from: g  reason: collision with root package name */
    private final ay f52925g;

    /* renamed from: h  reason: collision with root package name */
    private final bg<Executor> f52926h;

    static {
        Covode.recordClassIndex(32713);
    }

    bu(File file, w wVar, ay ayVar, Context context, cg cgVar, bg<Executor> bgVar) {
        this.f52924f = file.getAbsolutePath();
        this.f52920b = wVar;
        this.f52925g = ayVar;
        this.f52921c = context;
        this.f52922d = cgVar;
        this.f52926h = bgVar;
    }

    static String a(File file) {
        try {
            return bw.a(Arrays.asList(file));
        } catch (NoSuchAlgorithmException e2) {
            throw new com.google.android.play.core.common.b("SHA256 algorithm not supported.", e2);
        } catch (IOException e3) {
            throw new com.google.android.play.core.common.b(a.a("Could not digest file: %s.", new Object[]{file}), e3);
        }
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final d<List<String>> a(Map<String, Long> map) {
        f52918a.d("syncPacks()", new Object[0]);
        return f.a(new ArrayList());
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a() {
        f52918a.d("keepAlive", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2) {
        f52918a.d("notifySessionFailed", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2, String str) {
        f52918a.d("notifyModuleCompleted", new Object[0]);
        this.f52926h.a().execute(new br(this, i2, str));
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(int i2, String str, String str2, int i3) {
        f52918a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final void a(List<String> list) {
        f52918a.d("cancelDownload(%s)", list);
    }

    /* access modifiers changed from: package-private */
    public final File[] a(String str) {
        File file = new File(this.f52924f);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new bs(str));
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    int i2 = 0;
                    while (!r.a(listFiles[i2]).equals(str)) {
                        i2++;
                        if (i2 >= length) {
                            throw new com.google.android.play.core.common.b(a.a("No master slice available for pack '%s'.", new Object[]{str}));
                        }
                    }
                    return listFiles;
                }
                throw new com.google.android.play.core.common.b(a.a("No APKs available for pack '%s'.", new Object[]{str}));
            }
            throw new com.google.android.play.core.common.b(a.a("Failed fetching APKs for pack '%s'.", new Object[]{str}));
        }
        throw new com.google.android.play.core.common.b(a.a("Local testing directory '%s' not found.", new Object[]{file}));
    }

    @Override // com.google.android.play.core.assetpacks.dj
    public final d<ParcelFileDescriptor> b(int i2, String str, String str2, int i3) {
        f52918a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i2), str, str2, Integer.valueOf(i3));
        m mVar = new m();
        try {
            File[] a2 = a(str);
            for (File file : a2) {
                if (r.a(file).equals(str2)) {
                    mVar.f53383a.a(ParcelFileDescriptor.open(file, 268435456));
                    return mVar.f53383a;
                }
            }
            throw new com.google.android.play.core.common.b(a.a("Local testing slice for '%s' not found.", new Object[]{str2}));
        } catch (FileNotFoundException e2) {
            f52918a.e("getChunkFileDescriptor failed", e2);
            mVar.a((Exception) new com.google.android.play.core.common.b("Asset Slice file not found.", e2));
        } catch (com.google.android.play.core.common.b e3) {
            f52918a.e("getChunkFileDescriptor failed", e3);
            mVar.a((Exception) e3);
        }
    }
}
