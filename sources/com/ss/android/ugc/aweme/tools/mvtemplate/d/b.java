package com.ss.android.ugc.aweme.tools.mvtemplate.d;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.port.in.at;
import com.ss.android.ugc.aweme.services.upload.IServiceMusicResDownListener;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a;
import com.ss.android.ugc.tools.utils.k;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public abstract class b implements at {

    /* renamed from: a  reason: collision with root package name */
    private final h f140816a = i.a((h.f.a.a) new a(this));

    static {
        Covode.recordClassIndex(91946);
    }

    public abstract Intent a(CutSameEditData cutSameEditData);

    static final class a extends m implements h.f.a.a<AnonymousClass1> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(91947);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnonymousClass1 invoke() {
            return new at.a(this) {
                /* class com.ss.android.ugc.aweme.tools.mvtemplate.d.b.a.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ a f140817a;

                static {
                    Covode.recordClassIndex(91948);
                }

                /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b$a$1$b  reason: collision with other inner class name */
                public static final class C3726b implements com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ IServiceMusicResDownListener f140820a;

                    static {
                        Covode.recordClassIndex(91950);
                    }

                    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b
                    public final void a() {
                        IServiceMusicResDownListener iServiceMusicResDownListener = this.f140820a;
                        if (iServiceMusicResDownListener != null) {
                            iServiceMusicResDownListener.onFailed();
                        }
                    }

                    C3726b(IServiceMusicResDownListener iServiceMusicResDownListener) {
                        this.f140820a = iServiceMusicResDownListener;
                    }

                    @Override // com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b
                    public final void a(MusicModel musicModel, String str, boolean z) {
                        l.d(musicModel, "");
                        l.d(str, "");
                        IServiceMusicResDownListener iServiceMusicResDownListener = this.f140820a;
                        if (iServiceMusicResDownListener != null) {
                            iServiceMusicResDownListener.onSuccess(musicModel, str);
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final String b() {
                    String b2 = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b("mvres");
                    l.b(b2, "");
                    return b2;
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final String c() {
                    String b2 = com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b();
                    l.b(b2, "");
                    return b2;
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void d() {
                    b.i.b(new CallableC3725a(this, new LinkedHashSet()), b.i.f4824a);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final String a() {
                    String str = (com.ss.android.ugc.aweme.tools.mvtemplate.e.b.a("cover_tmp") + File.separator) + com.ss.android.ugc.aweme.tools.mvtemplate.e.b.c(".png");
                    l.b(str, "");
                    return str;
                }

                /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.b$a$1$a  reason: collision with other inner class name */
                static final class CallableC3725a<V> implements Callable {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f140818a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ Set f140819b;

                    static {
                        Covode.recordClassIndex(91949);
                    }

                    CallableC3725a(AnonymousClass1 r1, Set set) {
                        this.f140818a = r1;
                        this.f140819b = set;
                    }

                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        List<c> queryAllDraftList = AVServiceImpl.a().draftService().queryAllDraftList(false);
                        l.b(queryAllDraftList, "");
                        for (T t : queryAllDraftList) {
                            l.b(t, "");
                            d dVar = t.W.M;
                            if (dVar != null) {
                                Set set = this.f140819b;
                                String str = dVar.mvResUnzipPath;
                                l.b(str, "");
                                set.add(str);
                                Set set2 = this.f140819b;
                                String str2 = dVar.videoCoverImgPath;
                                l.b(str2, "");
                                set2.add(str2);
                                Set set3 = this.f140819b;
                                ArrayList<String> arrayList = dVar.selectMediaList;
                                l.b(arrayList, "");
                                ArrayList arrayList2 = new ArrayList(n.a((Iterable) arrayList, 10));
                                Iterator<T> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().toString());
                                }
                                set3.addAll(arrayList2);
                                ArrayList<MvNetFileBean> arrayList3 = dVar.newMaskFileData;
                                l.b(arrayList3, "");
                                Iterator<T> it2 = arrayList3.iterator();
                                while (it2.hasNext()) {
                                    this.f140819b.add(it2.next().getFilePath());
                                }
                            }
                        }
                        File file = new File(com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b("resize_bitmap_tmp"));
                        File file2 = new File(com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b("cover_tmp"));
                        File file3 = new File(com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b("mvres"));
                        File file4 = new File(com.ss.android.ugc.aweme.tools.mvtemplate.e.b.b("origin_resize_file"));
                        b.a(file3.listFiles(), this.f140819b);
                        b.b(file.listFiles(), this.f140819b);
                        b.b(file2.listFiles(), this.f140819b);
                        b.b(file4.listFiles(), this.f140819b);
                        return z.f158842a;
                    }
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f140817a = r1;
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final Intent a(CutSameEditData cutSameEditData) {
                    l.d(cutSameEditData, "");
                    return this.f140817a.this$0.a(cutSameEditData);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void b(e eVar) {
                    l.d(eVar, "");
                    new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar).a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, (String) null, "slideshoweffect", false, (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c) new a.e(new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a())).a(null);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void c(e eVar) {
                    l.d(eVar, "");
                    com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a aVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar);
                    com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a();
                    aVar.a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, (String) null, "singlepiceffect", false, (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c) new a.f(aVar2)).a(null);
                    aVar.a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, (String) null, "slideshoweffect", false, (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c) new a.g(aVar2)).a(null);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void a(e eVar) {
                    l.d(eVar, "");
                    new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar).a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, (String) null, "singlepiceffect", false, (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c) new a.h(new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a())).a(null);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void b(c cVar) {
                    l.d(cVar, "");
                    if (cVar != null && cVar.W.M != null) {
                        ArrayList<String> arrayList = cVar.W.M.photoToSave;
                        String str = cVar.W.M.mvAutoSaveToast;
                        if (!k.a(arrayList) && !TextUtils.isEmpty(str)) {
                            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.port.in.c.f115622a).a(str).a();
                            b.i.b(new com.ss.android.ugc.aweme.tools.mvtemplate.e.c(arrayList), b.i.f4824a).a(com.ss.android.ugc.aweme.tools.mvtemplate.e.d.f140825a, b.i.f4824a, null);
                        }
                    }
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void a(c cVar) {
                    l.d(cVar, "");
                    if (cVar != null && cVar.W.M != null) {
                        b.i.b(new com.ss.android.ugc.aweme.tools.mvtemplate.e.e(cVar), b.i.f4824a);
                    }
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void a(e eVar, String str, String str2) {
                    String str3 = "";
                    l.d(eVar, str3);
                    com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a aVar = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar);
                    com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a aVar2 = new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b.a();
                    if (str2 != null) {
                        str3 = str2;
                    }
                    aVar.a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, str, str3, false, (com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c) new a.i(str2, aVar2)).a(null);
                }

                @Override // com.ss.android.ugc.aweme.port.in.at.a
                public final void a(e eVar, MusicModel musicModel, IServiceMusicResDownListener iServiceMusicResDownListener, String str) {
                    l.d(eVar, "");
                    new com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a(eVar).a((com.ss.android.ugc.aweme.tools.mvtemplate.a.d) null, musicModel, new C3726b(iServiceMusicResDownListener), (List<String>) null, str).a(null);
                }
            };
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.at
    public final at.a a() {
        return (at.a) this.f140816a.getValue();
    }

    private static boolean a(File file) {
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                return false;
            }
        } catch (Throwable unused) {
        }
        return file.delete();
    }

    public static void a(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (file.exists()) {
                    String absolutePath = file.getAbsolutePath();
                    l.b(absolutePath, "");
                    if (absolutePath.length() == 0) {
                        return;
                    }
                    if (file.isDirectory() && !set.contains(absolutePath)) {
                        com.ss.android.ugc.aweme.video.e.e(absolutePath);
                        a(file);
                    }
                }
            }
        }
    }

    public static void b(File[] fileArr, Set<String> set) {
        if (!(fileArr == null || fileArr.length == 0)) {
            for (File file : fileArr) {
                if (file.exists()) {
                    String absolutePath = file.getAbsolutePath();
                    l.b(absolutePath, "");
                    if (absolutePath.length() == 0) {
                        return;
                    }
                    if (file.isFile() && !set.contains(absolutePath)) {
                        com.ss.android.ugc.aweme.video.e.c(absolutePath);
                    }
                }
            }
        }
    }
}
