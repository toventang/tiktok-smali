package com.ss.android.ugc.aweme.shortvideo.publish;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.publish.ai;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public final class z {

    /* renamed from: c  reason: collision with root package name */
    public static final a f129908c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h f129909a = i.a((h.f.a.a) new d(this));

    /* renamed from: b  reason: collision with root package name */
    public final Context f129910b;

    /* renamed from: d  reason: collision with root package name */
    private final ai f129911d;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f129912e;

    /* renamed from: f  reason: collision with root package name */
    private final h f129913f = i.a((h.f.a.a) new c(this));

    /* renamed from: g  reason: collision with root package name */
    private String f129914g;

    /* renamed from: h  reason: collision with root package name */
    private final f f129915h;

    static {
        Covode.recordClassIndex(85260);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(85261);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<com.ss.android.ugc.aweme.photo.a> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(85264);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.photo.a invoke() {
            return new com.ss.android.ugc.aweme.photo.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z f129919a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f129920b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AtomicInteger f129921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f129922d;

        static {
            Covode.recordClassIndex(85265);
        }

        e(z zVar, ArrayList arrayList, AtomicInteger atomicInteger, ArrayList arrayList2) {
            this.f129919a = zVar;
            this.f129920b = arrayList;
            this.f129921c = atomicInteger;
            this.f129922d = arrayList2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f129919a.a(this.f129920b, this.f129921c, this.f129922d);
            return h.z.f158842a;
        }
    }

    static final class c extends m implements h.f.a.a<String> {
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(85263);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(z zVar) {
            super(0);
            this.this$0 = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            String a2;
            Resources resources = this.this$0.f129910b.getResources();
            Object[] objArr = new Object[1];
            com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
            if (e2 == null) {
                a2 = "illegal usr state";
            } else {
                a2 = e2.a();
                if (TextUtils.isEmpty(a2)) {
                    a2 = e2.b();
                    l.b(a2, "");
                } else {
                    l.b(a2, "");
                }
            }
            objArr[0] = a2;
            String string = resources.getString(R.string.blu, objArr);
            l.b(string, "");
            return string;
        }
    }

    public final void a(List<b> list) {
        if (!list.isEmpty()) {
            com.ss.android.ugc.aweme.shortvideo.sticker.e.b(this.f129914g);
        }
        this.f129915h.a(list);
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<Boolean, h.z> {
        final /* synthetic */ AtomicInteger $index;
        final /* synthetic */ b $photoData;
        final /* synthetic */ List $photoDatas;
        final /* synthetic */ ArrayList $successSavePhotos;
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(85267);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(z zVar, ArrayList arrayList, b bVar, AtomicInteger atomicInteger, List list) {
            super(1);
            this.this$0 = zVar;
            this.$successSavePhotos = arrayList;
            this.$photoData = bVar;
            this.$index = atomicInteger;
            this.$photoDatas = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.$successSavePhotos.add(this.$photoData);
                this.$index.incrementAndGet();
                this.this$0.a(this.$photoDatas, this.$index, this.$successSavePhotos);
            } else {
                this.this$0.a(this.$successSavePhotos);
            }
            return h.z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<Bitmap, h.z> {
        final /* synthetic */ h.f.a.b $callback;
        final /* synthetic */ b $photoData;
        final /* synthetic */ z this$0;

        static {
            Covode.recordClassIndex(85266);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(z zVar, h.f.a.b bVar, b bVar2) {
            super(1);
            this.this$0 = zVar;
            this.$callback = bVar;
            this.$photoData = bVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            if (bitmap2 == null) {
                this.$callback.invoke(false);
            } else {
                File file = new File(this.$photoData.f129916a);
                StringBuilder sb = new StringBuilder();
                File parentFile = file.getParentFile();
                l.b(parentFile, "");
                File file2 = new File(((com.ss.android.ugc.aweme.photo.a) this.this$0.f129909a.getValue()).f114835a + File.separator + sb.append(parentFile.getName()).append("_").append(file.getName()).toString());
                boolean a2 = com.ss.android.ugc.tools.utils.c.a(bitmap2, file2, 100, Bitmap.CompressFormat.PNG);
                com.ss.android.ugc.tools.utils.c.a(bitmap2);
                if (a2) {
                    file2.getPath();
                    com.ss.android.ugc.aweme.photo.b.a.a(this.this$0.f129910b, file2.getPath());
                }
                this.$callback.invoke(Boolean.valueOf(a2));
            }
            return h.z.f158842a;
        }
    }

    public final void a(com.ss.android.ugc.aweme.draft.model.c cVar) {
        ArrayList<TimeSpeedModelExtension> a2;
        String stickerToast;
        if (cVar != null && cVar.x == 0) {
            if (TextUtils.isEmpty(cVar.K)) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = cVar.W.ax;
                if (com.bytedance.common.utility.h.a(multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.editCutSegments : null)) {
                    return;
                }
            }
            if (com.ss.android.ugc.aweme.port.in.c.D.c().a(this.f129910b) == 0) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = cVar.W.ax;
                if (com.bytedance.common.utility.h.b(multiEditVideoStatusRecordData2 != null ? multiEditVideoStatusRecordData2.editCutSegments : null)) {
                    a2 = cVar.W.ax.editCutSegments;
                } else {
                    a2 = CameraComponentModel.a(cVar.K);
                }
                this.f129914g = cVar.f();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (a2 != null) {
                    for (T t : a2) {
                        SavePhotoStickerInfo savePhotoStickerInfo = t.getSavePhotoStickerInfo();
                        List<String> capturedPhotoPaths = savePhotoStickerInfo != null ? savePhotoStickerInfo.getCapturedPhotoPaths() : null;
                        if (!k.a(capturedPhotoPaths)) {
                            String stickerId = t.getStickerId();
                            String str = "";
                            l.b(stickerId, str);
                            String c2 = com.ss.android.ugc.aweme.shortvideo.sticker.e.c(stickerId);
                            SavePhotoStickerInfo savePhotoStickerInfo2 = t.getSavePhotoStickerInfo();
                            if (!(savePhotoStickerInfo2 == null || (stickerToast = savePhotoStickerInfo2.getStickerToast()) == null)) {
                                str = stickerToast;
                            }
                            if (capturedPhotoPaths != null) {
                                for (T t2 : capturedPhotoPaths) {
                                    if (new File((String) t2).exists()) {
                                        arrayList2.add(new b(t2, c2, str));
                                    }
                                }
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    b.i.b(new e(this, arrayList2, new AtomicInteger(0), arrayList), b.i.f4824a);
                }
            }
        }
    }

    public z(Context context, f fVar) {
        l.d(context, "");
        l.d(fVar, "");
        this.f129910b = context;
        this.f129915h = fVar;
        this.f129911d = new ai(context);
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f129916a;

        /* renamed from: b  reason: collision with root package name */
        public final String f129917b;

        /* renamed from: c  reason: collision with root package name */
        public final String f129918c;

        static {
            Covode.recordClassIndex(85262);
        }

        public b(String str, String str2, String str3) {
            l.d(str, "");
            l.d(str3, "");
            this.f129916a = str;
            this.f129917b = str2;
            this.f129918c = str3;
        }
    }

    public final void a(List<b> list, AtomicInteger atomicInteger, ArrayList<b> arrayList) {
        if (!this.f129912e) {
            int i2 = atomicInteger.get();
            if (i2 >= list.size()) {
                a(arrayList);
                return;
            }
            b bVar = list.get(i2);
            g gVar = new g(this, arrayList, bVar, atomicInteger, list);
            ai aiVar = this.f129911d;
            String str = bVar.f129916a;
            String str2 = bVar.f129917b;
            String str3 = (String) this.f129913f.getValue();
            f fVar = new f(this, gVar, bVar);
            l.d(str, "");
            l.d(str3, "");
            l.d(fVar, "");
            ai.a(str, new ai.b(aiVar, fVar, str3, str2));
        }
    }
}
