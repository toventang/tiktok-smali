package com.ss.android.ugc.aweme.ci;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.port.in.i;
import h.c.b.a.k;
import h.c.d;
import h.f.a.m;
import h.f.b.l;
import h.r;
import h.z;
import java.io.File;
import java.util.concurrent.Callable;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f71080a;

    /* renamed from: b  reason: collision with root package name */
    private static final String f71081b;

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f71082a = new a();

        static {
            Covode.recordClassIndex(43757);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.bytedance.common.utility.d.b.a(b.f71080a);
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(43756);
        l.d("resize_bitmap_tmp", "");
        l.d("resize_bitmap_tmp", "");
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        String sb3 = sb.append(sb2.append(filesDir.getAbsolutePath()).append(File.separator).append("upload_pic_sticker").toString()).append(File.separator).append("resize_bitmap_tmp").toString();
        if (!new File(sb3).exists()) {
            new File(sb3).mkdirs();
        }
        String a2 = l.a(sb3, (Object) File.separator);
        f71081b = a2;
        f71080a = a2 + "PixelLoopResize.bmp";
    }

    /* renamed from: com.ss.android.ugc.aweme.ci.b$b  reason: collision with other inner class name */
    static final class C1603b extends k implements m<am, d<? super z>, Object> {
        final /* synthetic */ int[] $compileSize;
        final /* synthetic */ String $newPath;
        final /* synthetic */ String $originPath;
        final /* synthetic */ h.f.a.b $resultProcessor;
        int label;

        static {
            Covode.recordClassIndex(43758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1603b(String str, String str2, int[] iArr, h.f.a.b bVar, d dVar) {
            super(2, dVar);
            this.$originPath = str;
            this.$newPath = str2;
            this.$compileSize = iArr;
            this.$resultProcessor = bVar;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new C1603b(this.$originPath, this.$newPath, this.$compileSize, this.$resultProcessor, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((C1603b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                String str = this.$originPath;
                String str2 = this.$newPath;
                int[] iArr = this.$compileSize;
                int i3 = iArr[0];
                int i4 = iArr[1];
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                this.label = 1;
                obj = kotlinx.coroutines.i.a(bf.f159041b, new c(str, i3, i4, 4, str2, compressFormat, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!((Boolean) obj).booleanValue() || !com.ss.android.ugc.tools.utils.i.a(this.$newPath)) {
                this.$resultProcessor.invoke(this.$originPath);
            } else {
                this.$resultProcessor.invoke(this.$newPath);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends k implements m<am, d<? super Boolean>, Object> {
        final /* synthetic */ String $destPath;
        final /* synthetic */ Bitmap.CompressFormat $saveFormat;
        final /* synthetic */ String $srcPath;
        final /* synthetic */ int $targetH;
        final /* synthetic */ int $targetW;
        final /* synthetic */ int $type;
        int label;

        static {
            Covode.recordClassIndex(43759);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(String str, int i2, int i3, int i4, String str2, Bitmap.CompressFormat compressFormat, d dVar) {
            super(2, dVar);
            this.$srcPath = str;
            this.$targetW = i2;
            this.$targetH = i3;
            this.$type = i4;
            this.$destPath = str2;
            this.$saveFormat = compressFormat;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new c(this.$srcPath, this.$targetW, this.$targetH, this.$type, this.$destPath, this.$saveFormat, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super Boolean> dVar) {
            return ((c) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                if (!com.ss.android.ugc.tools.utils.i.a(this.$srcPath)) {
                    return false;
                }
                Bitmap a2 = a.a(this.$srcPath, this.$targetW, this.$targetH, a.b(this.$srcPath), this.$type);
                if (a2 == null) {
                    return false;
                }
                return Boolean.valueOf(a.a(a2, new File(this.$destPath), this.$saveFormat));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final void a(String str, String str2, h.f.a.b<? super String, z> bVar) {
        l.d(str, "");
        l.d(str2, "");
        l.d(bVar, "");
        int[] h2 = com.ss.android.ugc.aweme.property.b.h();
        if (h2 == null) {
            h2 = new int[]{720, 1280};
        }
        l.b(h2, "");
        if (TextUtils.isEmpty(str) || !com.ss.android.ugc.tools.utils.i.a(str) || h2.length < 2) {
            bVar.invoke(str);
        } else {
            bz unused = kotlinx.coroutines.i.a(bs.f159054a, com.ss.android.ugc.asve.editor.d.f62009a, null, new C1603b(str, str2, h2, bVar, null), 2);
        }
    }
}
