package com.ss.android.ugc.tools.utils;

import android.app.Application;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import b.f;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.Callable;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static Application f149996a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f149997b;

    /* renamed from: c  reason: collision with root package name */
    public static a f149998c;

    /* renamed from: d  reason: collision with root package name */
    public static final h f149999d = new h();

    /* renamed from: e  reason: collision with root package name */
    private static String f150000e = "content";

    /* renamed from: f  reason: collision with root package name */
    private static String[] f150001f = {"png", "jpg", "jpeg", "bmp", "heif", "heic"};

    /* renamed from: g  reason: collision with root package name */
    private static String[] f150002g = {"gif", "webp"};

    public interface a {
        static {
            Covode.recordClassIndex(98746);
        }

        void a(int i2, String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(98747);
        }

        void a(Object obj);
    }

    private h() {
    }

    public static final boolean a(String str, b bVar) {
        boolean z = false;
        if (b(str)) {
            a();
            if (bVar == null) {
                try {
                    z = c.b.e.c(f149996a, Uri.parse(str));
                    return z;
                } catch (Exception e2) {
                    if (f149998c != null) {
                        Log.getStackTraceString(e2);
                    }
                    a aVar = f149998c;
                    if (aVar == null) {
                        return z;
                    }
                    aVar.a(9, "path:" + str + ", " + Log.getStackTraceString(e2));
                    return z;
                }
            } else {
                z.a aVar2 = new z.a();
                aVar2.element = false;
                Uri parse = Uri.parse(str);
                f fVar = new f();
                i.a((Callable) new c(parse, str)).a(new d(aVar2, bVar), i.f4826c, fVar.b());
                new Handler(Looper.getMainLooper()).postDelayed(new e(aVar2, fVar, bVar, parse), 100);
            }
        }
        return false;
    }

    public static final boolean a(String str, boolean z) {
        if (z) {
            return j(k(str));
        }
        return j(g(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x005f A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0066 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0089 A[SYNTHETIC, Splitter:B:48:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008e A[Catch:{ Exception -> 0x0092 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a1 A[SYNTHETIC, Splitter:B:61:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00a6 A[Catch:{ Exception -> 0x00aa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(java.lang.String r9, java.lang.String r10) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.h.a(java.lang.String, java.lang.String):boolean");
    }

    private static void a() {
        if (f149996a == null) {
            throw new IllegalArgumentException("invalid application info to set AdapterAndroidRUtils.application");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Uri f150003a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f150004b;

        static {
            Covode.recordClassIndex(98748);
        }

        c(Uri uri, String str) {
            this.f150003a = uri;
            this.f150004b = str;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            boolean z;
            try {
                z = c.b.e.c(h.f149996a, this.f150003a);
            } catch (Exception e2) {
                if (h.f149998c != null) {
                    Log.getStackTraceString(e2);
                }
                a aVar = h.f149998c;
                if (aVar != null) {
                    aVar.a(9, "path:" + this.f150004b + ", " + Log.getStackTraceString(e2));
                }
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f150007a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f150008b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f150009c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Uri f150010d;

        static {
            Covode.recordClassIndex(98750);
        }

        e(z.a aVar, f fVar, b bVar, Uri uri) {
            this.f150007a = aVar;
            this.f150008b = fVar;
            this.f150009c = bVar;
            this.f150010d = uri;
        }

        public final void run() {
            if (!this.f150007a.element) {
                this.f150008b.c();
                this.f150009c.a(Boolean.valueOf(new File(c.d.a.a(h.f149996a, this.f150010d)).exists()));
            }
        }
    }

    static {
        Covode.recordClassIndex(98745);
    }

    private static final String k(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            a(str, options);
            return options.outMimeType;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static File a(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    /* access modifiers changed from: package-private */
    public static final class d<TTaskResult, TContinuationResult> implements g<Boolean, h.z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z.a f150005a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f150006b;

        static {
            Covode.recordClassIndex(98749);
        }

        d(z.a aVar, b bVar) {
            this.f150005a = aVar;
            this.f150006b = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // b.g
        public final /* synthetic */ h.z then(i<Boolean> iVar) {
            this.f150005a.element = true;
            b bVar = this.f150006b;
            l.b(iVar, "");
            bVar.a(Boolean.valueOf(l.a((Object) iVar.d(), (Object) true)));
            return h.z.f158842a;
        }
    }

    public static final Uri d(String str) {
        if (b(str)) {
            Uri parse = Uri.parse(str);
            l.b(parse, "");
            return parse;
        }
        Uri parse2 = Uri.parse("file://".concat(String.valueOf(str)));
        l.b(parse2, "");
        return parse2;
    }

    public static final String h(String str) {
        a();
        try {
            if (b(str)) {
                return c.b.e.b(f149996a, Uri.parse(str));
            }
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(g(str));
        } catch (Exception unused) {
            return "";
        }
    }

    public static final long i(String str) {
        a();
        try {
            if (b(str)) {
                return c.b.e.a(f149996a, Uri.parse(str));
            }
            return new File(str).length();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean j(String str) {
        if (str != null) {
            for (String str2 : f150001f) {
                if (p.a((CharSequence) str, (CharSequence) str2, true)) {
                    return true;
                }
            }
            for (String str3 : f150002g) {
                if (p.a((CharSequence) str, (CharSequence) str3, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void a(String str) {
        a aVar = f149998c;
        if (aVar != null) {
            aVar.a(-2, str);
        }
    }

    public static final String b(MediaModel mediaModel) {
        if (mediaModel == null) {
            return "";
        }
        if (b(mediaModel.f109390b)) {
            StringBuilder sb = new StringBuilder();
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            l.b(externalStorageDirectory, "");
            return sb.append(externalStorageDirectory.getPath()).append(File.separator).append(mediaModel.f109391c).append(mediaModel.f109392d).toString();
        }
        String str = mediaModel.f109390b;
        l.b(str, "");
        return str;
    }

    public static final ExifInterface c(String str) {
        a();
        try {
            if (b(str) && Build.VERSION.SDK_INT >= 24) {
                ParcelFileDescriptor a2 = c.b.d.a(f149996a, Uri.parse(str), "r");
                l.b(a2, "");
                return new ExifInterface(a2.getFileDescriptor());
            } else if (str != null) {
                return new ExifInterface(str);
            } else {
                return null;
            }
        } catch (Exception e2) {
            if (f149998c != null) {
                Log.getStackTraceString(e2);
            }
            a aVar = f149998c;
            if (aVar != null) {
                aVar.a(1, "path:" + str + ", " + Log.getStackTraceString(e2));
            }
            return null;
        }
    }

    public static final MediaMetadataRetriever e(String str) {
        a();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (b(str)) {
                mediaMetadataRetriever.setDataSource(f149996a, Uri.parse(str));
            } else {
                mediaMetadataRetriever.setDataSource(str);
            }
        } catch (Exception e2) {
            if (f149998c != null) {
                Log.getStackTraceString(e2);
            }
            a aVar = f149998c;
            if (aVar != null) {
                aVar.a(3, "path:" + str + ", " + Log.getStackTraceString(e2));
            }
        }
        return mediaMetadataRetriever;
    }

    public static final FileInputStream f(String str) {
        MethodCollector.i(2340);
        a();
        try {
            if (b(str)) {
                ParcelFileDescriptor a2 = c.b.d.a(f149996a, Uri.parse(str), "r");
                l.b(a2, "");
                FileInputStream fileInputStream = new FileInputStream(a2.getFileDescriptor());
                MethodCollector.o(2340);
                return fileInputStream;
            }
            FileInputStream fileInputStream2 = new FileInputStream(str);
            MethodCollector.o(2340);
            return fileInputStream2;
        } catch (Exception e2) {
            if (f149998c != null) {
                Log.getStackTraceString(e2);
            }
            a aVar = f149998c;
            if (aVar != null) {
                aVar.a(4, "path:" + str + ", " + Log.getStackTraceString(e2));
            }
            MethodCollector.o(2340);
            return null;
        }
    }

    public static final boolean b(String str) {
        String str2;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String str3 = f150000e;
            if (parse != null) {
                str2 = parse.getScheme();
            } else {
                str2 = null;
            }
            if (l.a((Object) str3, (Object) str2)) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            if (f149998c != null) {
                Log.getStackTraceString(e2);
            }
            a aVar = f149998c;
            if (aVar != null) {
                aVar.a(0, "path:" + str + ", " + Log.getStackTraceString(e2));
            }
        }
    }

    public static final String g(String str) {
        String str2;
        a();
        String str3 = "";
        if (b(str)) {
            try {
                str2 = c.b.e.b(f149996a, Uri.parse(str));
                l.b(str2, str3);
            } catch (Exception unused) {
                a aVar = f149998c;
                if (aVar != null) {
                    aVar.a(-10, "file path:".concat(String.valueOf(str)));
                }
                str2 = str3;
            }
            if (!TextUtils.isEmpty(str2)) {
                if (p.a((CharSequence) str2, (CharSequence) "image", true)) {
                    List<String> b2 = p.b(str2, new String[]{"image/"});
                    if (b2.size() > 1) {
                        return b2.get(1);
                    }
                } else if (p.a((CharSequence) str2, (CharSequence) "video", true)) {
                    List<String> b3 = p.b(str2, new String[]{"video/"});
                    if (b3.size() > 1) {
                        return b3.get(1);
                    }
                }
                return str3;
            }
            a aVar2 = f149998c;
            if (aVar2 != null) {
                aVar2.a(-10, "file path:".concat(String.valueOf(str)));
            }
            return str3;
        } else if (str == null) {
            return str3;
        } else {
            try {
                String substring = str.substring(p.a((CharSequence) str, ".") + 1, str.length());
                l.b(substring, str3);
                str3 = substring;
                return str3;
            } catch (Exception e2) {
                if (f149998c != null) {
                    Log.getStackTraceString(e2);
                }
                a aVar3 = f149998c;
                if (aVar3 == null) {
                    return str3;
                }
                aVar3.a(5, "path:" + str + ", " + Log.getStackTraceString(e2));
                return str3;
            }
        }
    }

    public static final boolean a(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        if (!j(g(mediaModel.f109390b)) || !j(mediaModel.f109398j)) {
            return a(mediaModel.f109390b, true);
        }
        return true;
    }

    public static final String a(Context context, String str) {
        l.d(context, "");
        if (str == null || !b(str)) {
            return str;
        }
        String b2 = b(context, str);
        if (a(str, b2)) {
            return b2;
        }
        a aVar = f149998c;
        if (aVar == null) {
            return str;
        }
        aVar.a(-1, "copy file failed path:".concat(String.valueOf(b2)));
        return str;
    }

    private static String b(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
        StringBuilder sb = new StringBuilder();
        File a2 = a(context);
        l.b(a2, "");
        return sb.append(a2.getAbsolutePath()).append("/tools/temMedia/").append(str.hashCode()).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r6 != null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap a(java.lang.String r9, android.graphics.BitmapFactory.Options r10) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.h.a(java.lang.String, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        if (r9 == null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003d, code lost:
        if (r9 == null) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.io.FileInputStream r9, java.io.FileOutputStream r10) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.h.a(java.io.FileInputStream, java.io.FileOutputStream):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x007d A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0084 A[Catch:{ all -> 0x00b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a8 A[SYNTHETIC, Splitter:B:58:0x00a8] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ad A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c0 A[SYNTHETIC, Splitter:B:71:0x00c0] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00c5 A[Catch:{ Exception -> 0x00c9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.net.Uri a(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tools.utils.h.a(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }
}
