package com.facebook.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.j;
import com.facebook.m;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final String f48690a = x.class.getName();

    /* renamed from: b  reason: collision with root package name */
    private static File f48691b;

    private x() {
    }

    private static boolean a(File file) {
        MethodCollector.i(939);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(939);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(939);
        return delete;
    }

    static {
        Covode.recordClassIndex(29357);
    }

    private static synchronized File a() {
        File file;
        synchronized (x.class) {
            MethodCollector.i(984);
            if (f48691b == null) {
                ae.a();
                Context context = m.f48921g;
                if (d.f107194b == null || !d.f107197e) {
                    d.f107194b = context.getCacheDir();
                }
                f48691b = new File(d.f107194b, "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f48691b;
            MethodCollector.o(984);
        }
        return file;
    }

    public static void a(Collection<a> collection) {
        InputStream inputStream;
        MethodCollector.i(927);
        if (collection == null || collection.size() == 0) {
            MethodCollector.o(927);
            return;
        }
        if (f48691b == null) {
            ad.a(a());
        }
        a().mkdirs();
        ArrayList<File> arrayList = new ArrayList();
        try {
            for (a aVar : collection) {
                if (aVar.f48698g) {
                    File a2 = a(aVar.f48692a, aVar.f48694c, true);
                    arrayList.add(a2);
                    if (aVar.f48695d != null) {
                        Bitmap bitmap = aVar.f48695d;
                        FileOutputStream fileOutputStream = new FileOutputStream(a2);
                        try {
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            ad.a(fileOutputStream);
                        } catch (Throwable th) {
                            ad.a(fileOutputStream);
                            MethodCollector.o(927);
                            throw th;
                        }
                    } else if (aVar.f48696e != null) {
                        Uri uri = aVar.f48696e;
                        boolean z = aVar.f48697f;
                        FileOutputStream fileOutputStream2 = new FileOutputStream(a2);
                        if (!z) {
                            try {
                                inputStream = new FileInputStream(uri.getPath());
                            } catch (Throwable th2) {
                                ad.a(fileOutputStream2);
                                MethodCollector.o(927);
                                throw th2;
                            }
                        } else {
                            ae.a();
                            inputStream = m.f48921g.getContentResolver().openInputStream(uri);
                        }
                        ad.a(inputStream, (OutputStream) fileOutputStream2);
                        ad.a(fileOutputStream2);
                    }
                }
            }
            MethodCollector.o(927);
        } catch (IOException e2) {
            for (File file : arrayList) {
                try {
                    a(file);
                } catch (Exception unused) {
                }
            }
            j jVar = new j(e2);
            MethodCollector.o(927);
            throw jVar;
        }
    }

    public static a a(UUID uuid, Bitmap bitmap) {
        ae.a(uuid, "callId");
        ae.a(bitmap, "attachmentBitmap");
        return new a(uuid, bitmap, null, (byte) 0);
    }

    public static a a(UUID uuid, Uri uri) {
        ae.a(uuid, "callId");
        ae.a(uri, "attachmentUri");
        return new a(uuid, null, uri, (byte) 0);
    }

    public static File a(UUID uuid, String str) {
        if (ad.a(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }

    public static File a(UUID uuid, boolean z) {
        if (f48691b == null) {
            return null;
        }
        File file = new File(f48691b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f48692a;

        /* renamed from: b  reason: collision with root package name */
        public final String f48693b;

        /* renamed from: c  reason: collision with root package name */
        public final String f48694c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap f48695d;

        /* renamed from: e  reason: collision with root package name */
        public Uri f48696e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f48697f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f48698g;

        static {
            Covode.recordClassIndex(29358);
        }

        private a(UUID uuid, Bitmap bitmap, Uri uri) {
            String uuid2;
            String a2;
            boolean z;
            this.f48692a = uuid;
            this.f48695d = bitmap;
            this.f48696e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f48697f = true;
                    if (uri.getAuthority() == null || uri.getAuthority().startsWith("media")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f48698g = z;
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.f48698g = true;
                } else if (!ad.b(uri)) {
                    throw new j("Unsupported scheme for media Uri : ".concat(String.valueOf(scheme)));
                }
            } else if (bitmap != null) {
                this.f48698g = true;
            } else {
                throw new j("Cannot share media without a bitmap or Uri set");
            }
            if (!this.f48698g) {
                uuid2 = null;
            } else {
                uuid2 = UUID.randomUUID().toString();
            }
            this.f48694c = uuid2;
            if (!this.f48698g) {
                a2 = this.f48696e.toString();
            } else {
                ae.a();
                a2 = com.a.a("%s%s/%s/%s", new Object[]{"content://com.facebook.app.FacebookContentProvider", m.f48915a, uuid.toString(), uuid2});
            }
            this.f48693b = a2;
        }

        /* synthetic */ a(UUID uuid, Bitmap bitmap, Uri uri, byte b2) {
            this(uuid, bitmap, uri);
        }
    }

    private static File a(UUID uuid, String str, boolean z) {
        File a2 = a(uuid, z);
        if (a2 == null) {
            return null;
        }
        try {
            return new File(a2, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
