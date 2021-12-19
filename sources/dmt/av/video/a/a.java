package dmt.av.video.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.property.cu;
import com.ss.android.ugc.aweme.shortvideo.dj;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.tools.utils.q;
import h.a.n;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.h;
import h.i;
import h.m.p;
import h.r;
import h.z;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.am;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    static final h f156751a = i.a((h.f.a.a) c.f156758a);

    /* renamed from: b  reason: collision with root package name */
    public static final a f156752b = new a();

    /* renamed from: c  reason: collision with root package name */
    private static final h f156753c = i.a((h.f.a.a) C4142a.f156754a);

    public static com.ss.android.ugc.aweme.cs.h.c a() {
        return (com.ss.android.ugc.aweme.cs.h.c) f156753c.getValue();
    }

    private a() {
    }

    /* renamed from: dmt.av.video.a.a$a  reason: collision with other inner class name */
    static final class C4142a extends m implements h.f.a.a<com.ss.android.ugc.aweme.cs.h.c> {

        /* renamed from: a  reason: collision with root package name */
        public static final C4142a f156754a = new C4142a();

        static {
            Covode.recordClassIndex(104106);
        }

        C4142a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.cs.h.c invoke() {
            return g.a().g().c();
        }
    }

    static final class c extends m implements h.f.a.a<Long> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f156758a = new c();

        static {
            Covode.recordClassIndex(104110);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(a());
        }

        private static long a() {
            try {
                IESSettingsProxy iESSettingsProxy = com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b;
                l.b(iESSettingsProxy, "");
                return ((long) iESSettingsProxy.getLocalVideoCacheMaxAge().intValue()) * 60000;
            } catch (com.bytedance.ies.a unused) {
                return 259200000;
            }
        }
    }

    static {
        Covode.recordClassIndex(104105);
    }

    public static final void a(String str) {
        l.d(str, "");
        if (cu.a()) {
            b(str);
        }
    }

    private static void b(String str) {
        q.d("CleanRecordIntermediateFileUtils: scene = ".concat(String.valueOf(str)));
        bz unused = kotlinx.coroutines.i.a(bs.f159054a, bf.f159041b, null, new b(str, null), 2);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ String $scene;
        int label;

        static {
            Covode.recordClassIndex(104107);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String str, d dVar) {
            super(2, dVar);
            this.$scene = str;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$scene, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        private static boolean a(File file) {
            MethodCollector.i(12016);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
                if (e.a(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
                }
                if (e.c(file.getAbsolutePath(), cVar)) {
                    e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                    MethodCollector.o(12016);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(12016);
            return delete;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            if (this.label == 0) {
                r.a(obj);
                final long currentTimeMillis = System.currentTimeMillis();
                List<com.ss.android.ugc.aweme.draft.model.c> queryAllDraftList = AVServiceImpl.a().draftService().queryAllDraftList(false);
                l.b(queryAllDraftList, "");
                ArrayList arrayList3 = new ArrayList(n.a((Iterable) queryAllDraftList, 10));
                for (T t : queryAllDraftList) {
                    com.ss.android.ugc.aweme.port.internal.c c2 = g.a().c();
                    l.b(t, "");
                    String draftDir = c2.b(t, "CleanRecordIntermediateFileUtils").draftDir();
                    EditPreviewInfo h2 = com.ss.android.ugc.aweme.draft.model.d.h(t);
                    if (h2 != null) {
                        List<EditVideoSegment> videoList = h2.getVideoList();
                        if (videoList != null) {
                            ArrayList arrayList4 = new ArrayList(n.a((Iterable) videoList, 10));
                            Iterator<T> it = videoList.iterator();
                            while (it.hasNext()) {
                                arrayList4.add(it.next().getVideoPath());
                            }
                            arrayList = arrayList4;
                            ArrayList arrayList5 = new ArrayList(n.a((Iterable) videoList, 10));
                            Iterator<T> it2 = videoList.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add(it2.next().getAudioPath());
                            }
                            arrayList2 = arrayList5;
                            l.b(draftDir, "");
                            b bVar = new b(arrayList, arrayList2, draftDir);
                            q.d("CleanRecordIntermediateFileUtils:item: " + bVar.toString());
                            arrayList3.add(bVar);
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList2 = new ArrayList();
                    l.b(draftDir, "");
                    b bVar2 = new b(arrayList, arrayList2, draftDir);
                    q.d("CleanRecordIntermediateFileUtils:item: " + bVar2.toString());
                    arrayList3.add(bVar2);
                }
                final ArrayList arrayList6 = arrayList3;
                q.d("CleanRecordIntermediateFileUtils: get draft list size = " + arrayList6.size() + ", elapsedTime = " + (System.currentTimeMillis() - currentTimeMillis));
                com.ss.android.ugc.aweme.cs.h.c a2 = a.a();
                String str = dj.f126461d;
                l.b(str, "");
                File g2 = a2.g(str);
                z.d dVar = new z.d();
                dVar.element = 0;
                z.d dVar2 = new z.d();
                dVar2.element = 0;
                if (g2.exists() && g2.isDirectory()) {
                    File[] listFiles = g2.listFiles(new FileFilter() {
                        /* class dmt.av.video.a.a.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(104108);
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
                            if (h.m.p.c(r6, "-concat-a", false) == false) goto L_0x0065;
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final boolean accept(java.io.File r12) {
                            /*
                            // Method dump skipped, instructions count: 215
                            */
                            throw new UnsupportedOperationException("Method not decompiled: dmt.av.video.a.a.b.AnonymousClass1.accept(java.io.File):boolean");
                        }
                    });
                    l.b(listFiles, "");
                    for (File file : listFiles) {
                        long length = file.length();
                        if (a(file)) {
                            dVar.element++;
                            dVar2.element += length;
                            q.d("CleanRecordIntermediateFileUtils: delete file = ".concat(String.valueOf(file)));
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                q.d("CleanRecordIntermediateFileUtils: delete file size = " + dVar.element + ", length = " + dVar2.element + ", elapsedTime = " + currentTimeMillis2);
                com.ss.android.ugc.aweme.cs.h.c a3 = a.a();
                String str2 = dj.f126463f;
                l.b(str2, "");
                File g3 = a3.g(str2);
                z.d dVar3 = new z.d();
                dVar3.element = 0;
                z.d dVar4 = new z.d();
                dVar4.element = 0;
                if (g3.exists() && g3.isDirectory()) {
                    File[] listFiles2 = g3.listFiles(new FileFilter() {
                        /* class dmt.av.video.a.a.b.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(104109);
                        }

                        public final boolean accept(File file) {
                            Object obj;
                            File[] listFiles;
                            l.b(file, "");
                            if (file.isDirectory()) {
                                Iterator it = arrayList6.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    String str = ((b) obj).f156761c;
                                    String name = file.getName();
                                    l.b(name, "");
                                    if (p.c(str, name, false)) {
                                        break;
                                    }
                                }
                                if (obj == null && (listFiles = file.listFiles()) != null) {
                                    boolean z = false;
                                    boolean z2 = false;
                                    boolean z3 = false;
                                    for (File file2 : listFiles) {
                                        l.b(file2, "");
                                        if (l.a((Object) file2.getName(), (Object) "data.txt")) {
                                            z = true;
                                        }
                                        String name2 = file2.getName();
                                        l.b(name2, "");
                                        if (p.c(name2, "_frag_a", false)) {
                                            z2 = true;
                                        }
                                        String name3 = file2.getName();
                                        l.b(name3, "");
                                        if (p.c(name3, "_frag_v", false)) {
                                            z3 = true;
                                        }
                                    }
                                    if ((!z || !z2 || z3) && (listFiles.length != 1 || !z)) {
                                        return false;
                                    }
                                    return true;
                                }
                            }
                            return false;
                        }
                    });
                    l.b(listFiles2, "");
                    for (File file2 : listFiles2) {
                        l.b(file2, "");
                        long d2 = com.ss.android.ugc.aweme.video.e.d(file2.getPath());
                        com.ss.android.ugc.aweme.video.e.b(file2);
                        dVar3.element++;
                        dVar4.element += d2;
                        com.ss.android.ugc.aweme.draft.k.a("[internalCleanInvalidIntermediateFile] : delete draft dir = ".concat(String.valueOf(file2)));
                        q.d("CleanRecordIntermediateFileUtils: delete draft dir = ".concat(String.valueOf(file2)));
                    }
                }
                long currentTimeMillis3 = (System.currentTimeMillis() - currentTimeMillis) - currentTimeMillis2;
                q.d("CleanRecordIntermediateFileUtils: delete dir size = " + dVar3.element + ", length = " + dVar4.element + ",  elapsedTime = " + currentTimeMillis3);
                com.ss.android.ugc.aweme.utils.d.a("tool_performance_clean_record_intermediate_file", new com.ss.android.ugc.tools.f.b().a("scene", this.$scene).a("clean_delete_file_size", dVar.element).a("clean_delete_file_length", dVar2.element).a("clean_delete_file_time", currentTimeMillis2).a("clean_delete_dir_size", dVar3.element).a("clean_delete_dir_length", dVar4.element).a("clean_delete_dir_time", currentTimeMillis3).f149193a);
                return h.z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
