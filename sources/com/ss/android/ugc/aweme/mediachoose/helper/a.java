package com.ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import c.b.e;
import c.b.f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.tools.utils.d;
import com.ss.android.ugc.tools.utils.h;
import h.f.b.l;
import h.m.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f109402a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f109403b = new a();

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.a$a  reason: collision with other inner class name */
    public static final class C2807a {

        /* renamed from: a  reason: collision with root package name */
        public final String f109404a;

        /* renamed from: b  reason: collision with root package name */
        public final long f109405b;

        /* renamed from: c  reason: collision with root package name */
        public final long f109406c;

        /* renamed from: d  reason: collision with root package name */
        public final String f109407d;

        /* renamed from: e  reason: collision with root package name */
        public final String f109408e;

        /* renamed from: f  reason: collision with root package name */
        public final String[] f109409f;

        static {
            Covode.recordClassIndex(70071);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2807a)) {
                return false;
            }
            C2807a aVar = (C2807a) obj;
            return l.a(this.f109404a, aVar.f109404a) && this.f109405b == aVar.f109405b && this.f109406c == aVar.f109406c && l.a(this.f109407d, aVar.f109407d) && l.a(this.f109408e, aVar.f109408e) && l.a(this.f109409f, aVar.f109409f);
        }

        public final int hashCode() {
            String str = this.f109404a;
            int i2 = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            long j2 = this.f109405b;
            long j3 = this.f109406c;
            int i3 = ((((hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            String str2 = this.f109407d;
            int hashCode2 = (i3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f109408e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String[] strArr = this.f109409f;
            if (strArr != null) {
                i2 = Arrays.hashCode(strArr);
            }
            return hashCode3 + i2;
        }

        public final String toString() {
            return "MediaQueryParams(selectAlbumPath=" + this.f109404a + ", startTime=" + this.f109405b + ", endTime=" + this.f109406c + ", order=" + this.f109407d + ", selection=" + this.f109408e + ", selectionArgs=" + Arrays.toString(this.f109409f) + ")";
        }

        private /* synthetic */ C2807a() {
            this("DESC");
        }

        private C2807a(String str) {
            l.d(str, "");
            this.f109404a = null;
            this.f109405b = -1;
            this.f109406c = -1;
            this.f109407d = str;
            this.f109408e = null;
            this.f109409f = null;
        }
    }

    static {
        Covode.recordClassIndex(70070);
    }

    /* access modifiers changed from: package-private */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f109410a = "DESC";

        /* renamed from: b  reason: collision with root package name */
        public String f109411b = "";

        /* renamed from: c  reason: collision with root package name */
        public String f109412c;

        /* renamed from: d  reason: collision with root package name */
        public List<String> f109413d = new ArrayList();

        static {
            Covode.recordClassIndex(70072);
        }

        public final void a(String str) {
            l.d(str, "");
            this.f109410a = str;
        }

        public final void b(String str) {
            l.d(str, "");
            this.f109411b = str;
        }

        public final void a(List<String> list) {
            l.d(list, "");
            this.f109413d = list;
        }
    }

    static b a(C2807a aVar, int i2, int i3) {
        String concat = "date_modified ".concat("DESC");
        String str = " LIMIT " + i3 + " OFFSET " + (i2 * i3);
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (!TextUtils.isEmpty(null)) {
            arrayList.add("%" + ((String) null) + '%');
            str2 = "_data like ?";
        }
        b bVar = new b();
        bVar.a(concat);
        bVar.b(str);
        bVar.f109412c = str2;
        bVar.a(arrayList);
        return bVar;
    }

    public static final List<MediaModel> a(Context context, int i2, int i3) {
        List<MediaModel> b2;
        l.d(context, "");
        String[] strArr = null;
        b a2 = a((C2807a) null, i3, i2);
        if (a2.f109413d.size() > 0) {
            Object[] array = a2.f109413d.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            strArr = (String[]) array;
        }
        if (i2 == -1) {
            if (h.f149997b) {
                b2 = b(context, a2.f109412c, strArr, a2.f109410a, -1, -1);
            } else {
                b2 = b(context, a2.f109412c, strArr, a2.f109410a);
            }
        } else if (h.f149997b) {
            b2 = b(context, a2.f109412c, strArr, a2.f109410a, i2, i3 * i2);
        } else {
            b2 = b(context, a2.f109412c, strArr, a2.f109410a + a2.f109411b);
        }
        h.a("FileAdapterAndroidR video media list:" + b2.size() + "," + h.f149997b + ", trace:" + Log.getStackTraceString(new Throwable()));
        return b2;
    }

    static List<MediaModel> a(Context context, String str, String[] strArr, String str2) {
        String str3;
        boolean z;
        MethodCollector.i(4958);
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = {"_id", "_data", "date_modified", "mime_type", "_size", "_data", "date_modified", "width", "height"};
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr2, str, strArr, str2);
            if (query == null) {
                MethodCollector.o(4958);
                return arrayList;
            }
            while (query.moveToNext()) {
                long j2 = query.getLong(0);
                String string = query.getString(1);
                long j3 = query.getLong(2);
                String string2 = query.getString(3);
                long j4 = query.getLong(4);
                String string3 = query.getString(5);
                long j5 = (long) query.getInt(6);
                int i2 = query.getInt(7);
                int i3 = query.getInt(8);
                if (j4 > 0) {
                    MediaModel mediaModel = new MediaModel(j2);
                    mediaModel.f109390b = string;
                    mediaModel.f109391c = string;
                    mediaModel.f109394f = j3;
                    mediaModel.f109397i = j4;
                    mediaModel.f109399k = string3;
                    mediaModel.n = j5;
                    if (f109402a) {
                        mediaModel.f109400l = i2;
                        mediaModel.f109401m = i3;
                    }
                    try {
                        l.b(string, "");
                        String str4 = File.separator;
                        l.b(str4, "");
                        List<String> split = new h.m.l(str4).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : split) {
                            if (t.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                            mediaModel.f109393e = str3;
                            if (string2 != null || !p.e((CharSequence) string2, (CharSequence) "gif")) {
                                mediaModel.f109395g = 1;
                                if (!f109402a || mediaModel.f109400l <= 0 || mediaModel.f109401m <= 0) {
                                    l.b(string, "");
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    h.a(string, options);
                                    Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                                    Object obj = pair.first;
                                    l.b(obj, "");
                                    mediaModel.f109400l = ((Number) obj).intValue();
                                    Object obj2 = pair.second;
                                    l.b(obj2, "");
                                    mediaModel.f109401m = ((Number) obj2).intValue();
                                }
                            } else {
                                int i4 = Build.VERSION.SDK_INT;
                                mediaModel.f109395g = 2;
                            }
                            arrayList.add(mediaModel);
                        }
                    } catch (Exception unused) {
                    }
                    str3 = "";
                    mediaModel.f109393e = str3;
                    if (string2 != null) {
                    }
                    mediaModel.f109395g = 1;
                    l.b(string, "");
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    h.a(string, options2);
                    Pair pair2 = new Pair(Integer.valueOf(options2.outWidth), Integer.valueOf(options2.outHeight));
                    Object obj3 = pair2.first;
                    l.b(obj3, "");
                    mediaModel.f109400l = ((Number) obj3).intValue();
                    Object obj22 = pair2.second;
                    l.b(obj22, "");
                    mediaModel.f109401m = ((Number) obj22).intValue();
                    arrayList.add(mediaModel);
                }
            }
            query.close();
            MethodCollector.o(4958);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4958);
            throw th;
        }
    }

    private static List<MediaModel> b(Context context, String str, String[] strArr, String str2) {
        String str3;
        boolean z;
        MethodCollector.i(4966);
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = {"_id", "_data", "date_modified", "mime_type", "duration", "_size", "_data", "width", "height"};
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, strArr2, str, strArr, str2);
            if (query == null) {
                MethodCollector.o(4966);
                return arrayList;
            }
            while (query.moveToNext()) {
                long j2 = query.getLong(0);
                String string = query.getString(1);
                long j3 = query.getLong(2);
                String string2 = query.getString(3);
                long j4 = query.getLong(4);
                long j5 = query.getLong(5);
                String string3 = query.getString(6);
                int i2 = query.getInt(7);
                int i3 = query.getInt(8);
                if (!TextUtils.isEmpty(string) && j4 > 0 && j5 > 0) {
                    MediaModel mediaModel = new MediaModel(j2);
                    mediaModel.f109390b = string;
                    mediaModel.f109391c = string;
                    mediaModel.f109394f = j3;
                    mediaModel.f109398j = string2;
                    mediaModel.f109396h = j4;
                    mediaModel.f109397i = j5;
                    mediaModel.f109395g = 4;
                    mediaModel.f109399k = string3;
                    mediaModel.f109400l = i2;
                    mediaModel.f109401m = i3;
                    try {
                        l.b(string, "");
                        String str4 = File.separator;
                        l.b(str4, "");
                        List<String> split = new h.m.l(str4).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : split) {
                            if (t.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                            mediaModel.f109393e = str3;
                            arrayList.add(mediaModel);
                        }
                    } catch (Exception unused) {
                    }
                    str3 = "";
                    mediaModel.f109393e = str3;
                    arrayList.add(mediaModel);
                }
            }
            query.close();
            MethodCollector.o(4966);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.o(4966);
            throw th;
        }
    }

    public static final List<MediaModel> a(Context context, boolean z, int i2, int i3) {
        List<MediaModel> a2;
        boolean z2;
        l.d(context, "");
        String[] strArr = null;
        b a3 = a((C2807a) null, i3, i2);
        if (!z) {
            String str = a3.f109412c;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str2 = "mime_type not like ?";
            if (!z2) {
                String str3 = a3.f109412c;
                if (str3 != null) {
                    str2 = b.a(str3, str2);
                } else {
                    str2 = null;
                }
            }
            a3.f109412c = str2;
            a3.f109413d.add("%gif%");
        }
        if (a3.f109413d.size() > 0) {
            Object[] array = a3.f109413d.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            strArr = (String[]) array;
        }
        if (i2 <= 0) {
            if (h.f149997b) {
                a2 = a(context, a3.f109412c, strArr, a3.f109410a, -1, -1);
            } else {
                a2 = a(context, a3.f109412c, strArr, a3.f109410a);
            }
        } else if (h.f149997b) {
            a2 = a(context, a3.f109412c, strArr, a3.f109410a, i2, i3 * i2);
        } else {
            a2 = a(context, a3.f109412c, strArr, a3.f109410a + a3.f109411b);
        }
        h.a("FileAdapterAndroidR image media list:" + a2.size() + "," + h.f149997b + ", trace:" + Log.getStackTraceString(new Throwable()));
        return a2;
    }

    private static List<MediaModel> b(Context context, String str, String[] strArr, String str2, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        List<f> a2 = e.a(context, str, strArr, str2, i2, i3);
        if (d.a(a2)) {
            return arrayList;
        }
        for (f fVar : a2) {
            String str3 = "";
            l.b(fVar, str3);
            if (fVar.f4901g > 0) {
                MediaModel mediaModel = new MediaModel(fVar.f4895a);
                mediaModel.f109390b = fVar.f4905k.toString();
                mediaModel.f109391c = fVar.f4906l;
                mediaModel.f109392d = fVar.f4896b;
                mediaModel.f109394f = fVar.f4898d;
                mediaModel.f109397i = fVar.f4901g;
                mediaModel.n = fVar.f4897c;
                mediaModel.f109398j = fVar.f4899e;
                mediaModel.f109400l = fVar.f4902h;
                mediaModel.f109401m = fVar.f4903i;
                mediaModel.f109396h = fVar.f4900f;
                mediaModel.f109395g = 4;
                if (!TextUtils.isEmpty(mediaModel.f109391c)) {
                    try {
                        String str4 = mediaModel.f109391c;
                        l.b(str4, str3);
                        String str5 = File.separator;
                        l.b(str5, str3);
                        List<String> split = new h.m.l(str5).split(str4, 0);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = split.iterator();
                        while (true) {
                            boolean z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (next.length() <= 0) {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(next);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        h.a("MediaHelper ===> image ablum exception :" + h.f149997b + ", trace:" + Log.getStackTraceString(e2));
                    }
                    mediaModel.f109393e = str3;
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081 A[SYNTHETIC, Splitter:B:18:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel> a(android.content.Context r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mediachoose.helper.a.a(android.content.Context, java.lang.String, java.lang.String[], java.lang.String, int, int):java.util.List");
    }
}
