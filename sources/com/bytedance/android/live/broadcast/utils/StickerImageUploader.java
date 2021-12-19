package com.bytedance.android.live.broadcast.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.network.response.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.mime.TypedOutput;
import f.a.ab;
import f.a.h;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class StickerImageUploader {

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f8601a;

    /* renamed from: b  reason: collision with root package name */
    public f.a.b.b f8602b;

    /* renamed from: c  reason: collision with root package name */
    boolean f8603c;

    /* renamed from: d  reason: collision with root package name */
    public b<c> f8604d;

    interface UploadStickerImageApi {
        static {
            Covode.recordClassIndex(4402);
        }

        @t(a = "/webcast/review/upload_green_screen/")
        ab<d<Object>> upload(@com.bytedance.retrofit2.b.b TypedOutput typedOutput, @z(a = "room_id") long j2, @z(a = "user_id") long j3);
    }

    static {
        Covode.recordClassIndex(4401);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static StickerImageUploader f8605a = new StickerImageUploader((byte) 0);

        static {
            Covode.recordClassIndex(4403);
        }
    }

    private StickerImageUploader() {
        this.f8604d = new b<>();
    }

    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<T> f8606a = Collections.synchronizedList(new ArrayList(20));

        /* renamed from: b  reason: collision with root package name */
        final int f8607b = 20;

        static {
            Covode.recordClassIndex(4404);
        }

        public final T a() {
            if (this.f8606a.size() == 0) {
                return null;
            }
            return this.f8606a.remove(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.f8603c) {
            this.f8603c = true;
            c a2 = this.f8604d.a();
            if (a2 == null) {
                this.f8603c = false;
            } else if (!new File(a2.f8609b).exists()) {
                this.f8603c = false;
            } else {
                this.f8602b = h.a((Callable) new j(this, a2)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new k(this, a2), new l(this, a2));
            }
        }
    }

    /* synthetic */ StickerImageUploader(byte b2) {
        this();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        String f8608a;

        /* renamed from: b  reason: collision with root package name */
        String f8609b;

        /* renamed from: c  reason: collision with root package name */
        long f8610c;

        /* renamed from: d  reason: collision with root package name */
        long f8611d;

        static {
            Covode.recordClassIndex(4405);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            return TextUtils.equals(((c) obj).f8609b, this.f8609b);
        }

        public c(String str, String str2, long j2, long j3) {
            this.f8608a = str;
            this.f8609b = str2;
            this.f8610c = j2;
            this.f8611d = j3;
        }
    }

    private static Bitmap a(Bitmap bitmap) {
        MethodCollector.i(6371);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i2 = 90;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 300) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
            i2 -= 10;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()), null, null);
        MethodCollector.o(6371);
        return decodeStream;
    }

    public static File a(String str) {
        MethodCollector.i(6285);
        File file = new File(str);
        if (file.length() / 1024 < 300) {
            MethodCollector.o(6285);
            return file;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i4 && i3 > 600) {
            i2 = i3 / 600;
        } else if (i3 < i4 && i4 > 800) {
            i2 = i4 / 800;
        }
        options.inSampleSize = i2;
        Bitmap a2 = a(BitmapFactory.decodeFile(str, options));
        try {
            Context e2 = y.e();
            StringBuilder sb = new StringBuilder();
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = e2.getCacheDir();
            }
            File file2 = new File(sb.append(com.ss.android.ugc.aweme.lancet.d.f107194b).append(File.separator).append(UUID.randomUUID().toString()).append(".jpg").toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            a2.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            MethodCollector.o(6285);
            return file2;
        } catch (Exception unused) {
            MethodCollector.o(6285);
            return null;
        }
    }

    public final void a(c cVar) {
        b<c> bVar = this.f8604d;
        if (bVar.f8606a.indexOf(cVar) != -1) {
            bVar.f8606a.remove(cVar);
        }
        if (bVar.f8607b <= bVar.f8606a.size()) {
            bVar.f8606a.remove(bVar.f8607b - 1);
        }
        bVar.f8606a.add(0, cVar);
        if (this.f8604d.f8606a.size() != 0) {
            a();
        }
    }
}
