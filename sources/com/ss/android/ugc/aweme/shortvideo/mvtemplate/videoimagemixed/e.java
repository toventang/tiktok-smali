package com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed;

import android.app.Application;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import h.z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Callable;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f129495a = 35;

    /* renamed from: b  reason: collision with root package name */
    public static final e f129496b = new e();

    private e() {
    }

    public static int a() {
        if (com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d) {
            return f129495a;
        }
        return 12;
    }

    public static boolean c() {
        if (!d() || !com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d) {
            return false;
        }
        return true;
    }

    static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final c f129499a = new c();

        static {
            Covode.recordClassIndex(84997);
        }

        c() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (!com.ss.android.ugc.aweme.video.e.b(e.b())) {
                return null;
            }
            e.f129496b.a(new File(e.b()));
            return null;
        }
    }

    static {
        Covode.recordClassIndex(84994);
    }

    /* access modifiers changed from: package-private */
    public static final class d<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f129500a;

        static {
            Covode.recordClassIndex(84998);
        }

        d(List list) {
            this.f129500a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!new File(e.b()).exists()) {
                new File(e.b()).mkdirs();
            }
            for (MediaModel mediaModel : this.f129500a) {
                String a2 = e.a(mediaModel.f109390b);
                if (a2 != null) {
                    mediaModel.f109390b = a2;
                }
            }
            return z.f158842a;
        }
    }

    public static final class f<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f129502a;

        static {
            Covode.recordClassIndex(85000);
        }

        public f(List list) {
            this.f129502a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!new File(e.b()).exists()) {
                new File(e.b()).mkdirs();
            }
            for (VideoSegment videoSegment : this.f129502a) {
                String a2 = e.a(videoSegment.a(false));
                if (a2 != null) {
                    videoSegment.a(a2);
                }
            }
            return z.f158842a;
        }
    }

    public static String b() {
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        return sb.append(filesDir.getAbsolutePath()).append(File.separator).append("videoimage_mixed_resize").append(File.separator).toString();
    }

    private static boolean d() {
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        l.b(createIAVServiceProxybyMonsterPlugin, "");
        if (!createIAVServiceProxybyMonsterPlugin.getStoryService().e() || com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
            return false;
        }
        return true;
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f129497a;

        static {
            Covode.recordClassIndex(84995);
        }

        a(List list) {
            this.f129497a = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i2;
            List<MediaModel> list = this.f129497a;
            if (list == null) {
                l.b();
            }
            for (MediaModel mediaModel : list) {
                if (!h.a(mediaModel.f109390b, true)) {
                    if (mediaModel.f109400l <= 0 || mediaModel.f109401m <= 0) {
                        int[] iArr = new int[10];
                        String str = mediaModel.f109390b;
                        l.b(str, "");
                        if (com.ss.android.ugc.aweme.tools.c.c.a(str, iArr) == 0) {
                            mediaModel.f109400l = iArr[0];
                            mediaModel.f109401m = iArr[1];
                        }
                    }
                    if (mediaModel.f109400l > mediaModel.f109401m) {
                        i2 = mediaModel.f109401m;
                    } else {
                        i2 = mediaModel.f109400l;
                    }
                    if (i2 > 1100) {
                        return mediaModel.f109390b;
                    }
                }
            }
            return null;
        }
    }

    public static boolean b(String str) {
        return h.a(str, true);
    }

    public static boolean c(String str) {
        return h.a(str, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e$e  reason: collision with other inner class name */
    public static final class C3373e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g f129501a;

        static {
            Covode.recordClassIndex(84999);
        }

        C3373e(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g gVar) {
            this.f129501a = gVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g gVar = this.f129501a;
            if (gVar == null) {
                return null;
            }
            gVar.a();
            return null;
        }
    }

    public static final class g<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g f129503a;

        static {
            Covode.recordClassIndex(85001);
        }

        public g(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g gVar) {
            this.f129503a = gVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(b.i iVar) {
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g gVar = this.f129503a;
            if (gVar == null) {
                return null;
            }
            gVar.a();
            return null;
        }
    }

    static final class b<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a f129498a;

        static {
            Covode.recordClassIndex(84996);
        }

        b(com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a aVar) {
            this.f129498a = aVar;
        }

        @Override // b.g
        public final Object then(b.i<String> iVar) {
            if (iVar == null || iVar.d() == null) {
                com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a aVar = this.f129498a;
                if (aVar == null) {
                    return null;
                }
                aVar.a(false);
                return null;
            }
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a aVar2 = this.f129498a;
            if (aVar2 == null) {
                return null;
            }
            iVar.d();
            aVar2.a(true);
            return null;
        }
    }

    public static boolean a(int i2) {
        if (i2 == 11) {
            return false;
        }
        if (i2 == 6) {
            return true;
        }
        if (!com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.f.f125945d || i2 == 3 || i2 == 4 || i2 == 10 || i2 == 12) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r5 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r5) {
        /*
            if (r5 == 0) goto L_0x0033
            android.content.res.Resources r1 = r5.getResources()
            if (r1 == 0) goto L_0x0033
            r0 = 2131823050(0x7f1109ca, float:1.9278889E38)
            java.lang.String r5 = r1.getString(r0)
            if (r5 != 0) goto L_0x0014
        L_0x0011:
            h.f.b.l.b()
        L_0x0014:
            java.lang.String r4 = ""
            h.f.b.l.b(r5, r4)
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r1 = 0
            int r0 = a()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2[r1] = r0
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r0 = com.a.a(r5, r0)
            h.f.b.l.b(r0, r4)
            return r0
        L_0x0033:
            r5 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(android.content.Context):java.lang.String");
    }

    public static String a(String str) {
        Bitmap a2;
        if (!h.a(str, true) || (a2 = com.ss.android.ugc.aweme.ci.a.a(str, 720, 1280, com.ss.android.ugc.aweme.ci.a.b(str), 4)) == null) {
            return null;
        }
        StringBuilder append = new StringBuilder().append(b());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        l.b(instance, "");
        String sb = append.append(simpleDateFormat.format(instance.getTime()) + ".png").toString();
        com.ss.android.ugc.tools.utils.c.a(a2, new File(sb), 50, Bitmap.CompressFormat.PNG);
        com.ss.android.ugc.aweme.ci.a.a(a2);
        return sb;
    }

    private static boolean b(File file) {
        MethodCollector.i(2658);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(2658);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(2658);
        return delete;
    }

    public final boolean a(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                a(file2);
            }
        }
        return b(file);
    }

    public static void a(List<? extends MediaModel> list, com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.a aVar) {
        if (k.a(list)) {
            aVar.a(false);
        } else {
            b.i.b(new a(list), b.i.f4824a).a(new b(aVar), b.i.f4826c, null);
        }
    }

    public static void a(List<? extends MediaModel> list, com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.a.g gVar) {
        l.d(list, "");
        if (k.a(list)) {
            gVar.a();
        } else {
            b.i.b(new d(list), b.i.f4824a).a(new C3373e(gVar), b.i.f4826c, null);
        }
    }
}
