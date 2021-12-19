package androidx.core.e;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.c.e;
import androidx.c.g;
import androidx.core.content.a.f;
import androidx.core.e.c;
import androidx.core.graphics.l;
import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final e<String, Typeface> f2307a = new e<>(16);

    /* renamed from: b  reason: collision with root package name */
    static final Object f2308b = new Object();

    /* renamed from: c  reason: collision with root package name */
    static final g<String, ArrayList<c.a<c>>> f2309c = new g<>();

    /* renamed from: d  reason: collision with root package name */
    private static final c f2310d = new c("fonts");

    /* renamed from: e  reason: collision with root package name */
    private static final Comparator<byte[]> f2311e = new Comparator<byte[]>() {
        /* class androidx.core.e.b.AnonymousClass4 */

        static {
            Covode.recordClassIndex(740);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            int i2;
            int i3;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                int length = bArr3.length;
                i3 = bArr4.length;
                i2 = length;
            } else {
                for (int i4 = 0; i4 < bArr3.length; i4++) {
                    if (bArr3[i4] != bArr4[i4]) {
                        byte b2 = bArr3[i4];
                        i3 = bArr4[i4];
                        i2 = b2;
                    }
                }
                return 0;
            }
            return (i2 == 1 ? 1 : 0) - (i3 == 1 ? 1 : 0);
        }
    };

    private static C0030b[] a(Context context, a aVar, String str) {
        Uri uri;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f2303c}, null, null);
            if (query != null) {
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("result_code");
                    arrayList = new ArrayList();
                    int columnIndex2 = query.getColumnIndex("_id");
                    int columnIndex3 = query.getColumnIndex("file_id");
                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                    int columnIndex5 = query.getColumnIndex("font_weight");
                    int columnIndex6 = query.getColumnIndex("font_italic");
                    while (query.moveToNext()) {
                        int i3 = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                        int i4 = columnIndex4 != -1 ? query.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, query.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, query.getLong(columnIndex3));
                        }
                        arrayList.add(new C0030b(uri, i4, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i3));
                    }
                }
                query.close();
            }
            return (C0030b[]) arrayList.toArray(new C0030b[0]);
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    static {
        Covode.recordClassIndex(736);
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f2319a;

        /* renamed from: b  reason: collision with root package name */
        public final C0030b[] f2320b;

        static {
            Covode.recordClassIndex(741);
        }

        public a(int i2, C0030b[] bVarArr) {
            this.f2319a = i2;
            this.f2320b = bVarArr;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f2326a;

        /* renamed from: b  reason: collision with root package name */
        final int f2327b;

        static {
            Covode.recordClassIndex(743);
        }

        c(Typeface typeface, int i2) {
            this.f2326a = typeface;
            this.f2327b = i2;
        }
    }

    private static List<List<byte[]>> a(a aVar, Resources resources) {
        if (aVar.f2304d != null) {
            return aVar.f2304d;
        }
        return androidx.core.content.a.c.a(resources, aVar.f2305e);
    }

    public static a a(Context context, a aVar) {
        ProviderInfo a2 = a(context.getPackageManager(), aVar, context.getResources());
        if (a2 == null) {
            return new a(1, null);
        }
        return new a(0, a(context, aVar, a2.authority));
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static ProviderInfo a(PackageManager packageManager, a aVar, Resources resources) {
        String str = aVar.f2301a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(String.valueOf(str)));
        } else if (resolveContentProvider.packageName.equals(aVar.f2302b)) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, f2311e);
            List<List<byte[]>> a3 = a(aVar, resources);
            for (int i2 = 0; i2 < a3.size(); i2++) {
                ArrayList arrayList = new ArrayList(a3.get(i2));
                Collections.sort(arrayList, f2311e);
                if (a(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar.f2302b);
        }
    }

    static c a(Context context, a aVar, int i2) {
        try {
            a a2 = a(context, aVar);
            int i3 = -3;
            if (a2.f2319a == 0) {
                Typeface a3 = androidx.core.graphics.e.a(context, a2.f2320b, i2);
                if (a3 != null) {
                    i3 = 0;
                }
                return new c(a3, i3);
            }
            if (a2.f2319a == 1) {
                i3 = -2;
            }
            return new c(null, i3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new c(null, -1);
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, C0030b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C0030b bVar : bVarArr) {
            if (bVar.f2325e == 0) {
                Uri uri = bVar.f2321a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, l.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: androidx.core.e.b$b  reason: collision with other inner class name */
    public static class C0030b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f2321a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2322b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2323c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f2324d;

        /* renamed from: e  reason: collision with root package name */
        public final int f2325e;

        static {
            Covode.recordClassIndex(742);
        }

        public C0030b(Uri uri, int i2, int i3, boolean z, int i4) {
            this.f2321a = (Uri) androidx.core.g.g.a(uri);
            this.f2322b = i2;
            this.f2323c = i3;
            this.f2324d = z;
            this.f2325e = i4;
        }
    }

    public static Typeface a(final Context context, final a aVar, final f.a aVar2, Handler handler, boolean z, int i2, final int i3) {
        AnonymousClass2 r3;
        final String str = aVar.f2306f + "-" + i3;
        Typeface a2 = f2307a.a(str);
        if (a2 != null) {
            if (aVar2 != null) {
                aVar2.a(a2);
            }
            return a2;
        } else if (!z || i2 != -1) {
            AnonymousClass1 r4 = new Callable<c>() {
                /* class androidx.core.e.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(737);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ c call() {
                    c a2 = b.a(context, aVar, i3);
                    if (a2.f2326a != null) {
                        b.f2307a.a(str, a2.f2326a);
                    }
                    return a2;
                }
            };
            if (z) {
                try {
                    return ((c) f2310d.a(r4, i2)).f2326a;
                } catch (InterruptedException unused) {
                    return null;
                }
            } else {
                if (aVar2 == null) {
                    r3 = null;
                } else {
                    r3 = new c.a<c>(null) {
                        /* class androidx.core.e.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(738);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // androidx.core.e.c.a
                        public final /* bridge */ /* synthetic */ void a(c cVar) {
                            c cVar2 = cVar;
                            if (cVar2 == null) {
                                f.a.this.a(1, null);
                            } else if (cVar2.f2327b == 0) {
                                f.a.this.a(cVar2.f2326a, null);
                            } else {
                                f.a.this.a(cVar2.f2327b, null);
                            }
                        }
                    };
                }
                synchronized (f2308b) {
                    g<String, ArrayList<c.a<c>>> gVar = f2309c;
                    ArrayList<c.a<c>> arrayList = gVar.get(str);
                    if (arrayList != null) {
                        if (r3 != null) {
                            arrayList.add(r3);
                        }
                        return null;
                    }
                    if (r3 != null) {
                        ArrayList<c.a<c>> arrayList2 = new ArrayList<>();
                        arrayList2.add(r3);
                        gVar.put(str, arrayList2);
                    }
                    c cVar = f2310d;
                    cVar.a(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0097: INVOKE  
                          (r3v2 'cVar' androidx.core.e.c)
                          (wrap: androidx.core.e.c$2 : 0x0094: CONSTRUCTOR  (r0v10 androidx.core.e.c$2) = 
                          (r3v2 'cVar' androidx.core.e.c)
                          (r4v0 'r4' androidx.core.e.b$1)
                          (wrap: android.os.Handler : 0x008f: CONSTRUCTOR  (r1v3 android.os.Handler) =  call: android.os.Handler.<init>():void type: CONSTRUCTOR)
                          (wrap: androidx.core.e.b$3 : 0x008a: CONSTRUCTOR  (r2v1 androidx.core.e.b$3) = (r6v0 'str' java.lang.String A[SKIP_ARG]) call: androidx.core.e.b.3.<init>(java.lang.String):void type: CONSTRUCTOR)
                         call: androidx.core.e.c.2.<init>(androidx.core.e.c, java.util.concurrent.Callable, android.os.Handler, androidx.core.e.c$a):void type: CONSTRUCTOR)
                         type: VIRTUAL call: androidx.core.e.c.a(java.lang.Runnable):void in method: androidx.core.e.b.a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:249)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:71)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:157)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:176)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:153)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0094: CONSTRUCTOR  (r0v10 androidx.core.e.c$2) = 
                          (r3v2 'cVar' androidx.core.e.c)
                          (r4v0 'r4' androidx.core.e.b$1)
                          (wrap: android.os.Handler : 0x008f: CONSTRUCTOR  (r1v3 android.os.Handler) =  call: android.os.Handler.<init>():void type: CONSTRUCTOR)
                          (wrap: androidx.core.e.b$3 : 0x008a: CONSTRUCTOR  (r2v1 androidx.core.e.b$3) = (r6v0 'str' java.lang.String A[SKIP_ARG]) call: androidx.core.e.b.3.<init>(java.lang.String):void type: CONSTRUCTOR)
                         call: androidx.core.e.c.2.<init>(androidx.core.e.c, java.util.concurrent.Callable, android.os.Handler, androidx.core.e.c$a):void type: CONSTRUCTOR in method: androidx.core.e.b.a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 37 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.core.e.c, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 43 more
                        */
                    /*
                    // Method dump skipped, instructions count: 158
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.core.e.b.a(android.content.Context, androidx.core.e.a, androidx.core.content.a.f$a, android.os.Handler, boolean, int, int):android.graphics.Typeface");
                }
            }
