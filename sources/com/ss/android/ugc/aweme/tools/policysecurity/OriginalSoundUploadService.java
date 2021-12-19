package com.ss.android.ugc.aweme.tools.policysecurity;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.o;
import b.i;
import b.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.setting.w;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.tools.AVApi;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.aweme.tools.policysecurity.a;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import com.ss.android.vesdk.VEUtils;
import com.ss.ttuploader.UploadEventManager;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OriginalSoundUploadService extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140978a = new a((byte) 0);

    public interface AudioUploadApi {
        static {
            Covode.recordClassIndex(92040);
        }

        @l.b.o(a = "/aweme/v2/aweme/audiotrack/update/")
        @l.b.e
        i<BaseResponse> uploadAudio(@l.b.c(a = "aweme_id") String str, @l.b.c(a = "audiotrack_uri") String str2);

        @l.b.o(a = "/tiktok/v1/multi/audiotrack/update/")
        @l.b.e
        i<BaseResponse> uploadMultiAudio(@l.b.c(a = "audio_requests") JSONArray jSONArray);
    }

    static {
        Covode.recordClassIndex(92039);
    }

    @Override // androidx.core.app.f
    public final int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(92041);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static void a(b bVar, a aVar) {
        MethodCollector.i(11923);
        for (T t : bVar.f141005a) {
            String str = t.f140992a;
            l.d(str, "");
            aVar.getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{str});
            a(new File(t.f140994c));
            g.a().o().k().a("original_sound", "cleanup original sound, awemeId: " + t.f140992a);
        }
        MethodCollector.o(11923);
    }

    private static boolean a(File file) {
        MethodCollector.i(12072);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, com.ss.android.ugc.aweme.cs.g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(12072);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(12072);
        return delete;
    }

    public static final class b implements AbstractVideoUploader.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadService f140979a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.publish.f.g f140980b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.e f140981c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadTask f140982d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f140983e;

        static {
            Covode.recordClassIndex(92042);
        }

        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader.b
        public final int a() {
            return com.ss.android.ugc.aweme.shortvideo.upload.b.a(this.f140980b, "OriginalSoundUpload");
        }

        @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader.b
        public final void a(int i2, long j2, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
            if (i2 == 0) {
                this.f140982d.f140997f = videoUploadInfo.getMVideoId();
                this.f140981c.element.b();
                this.f140983e.b(this.f140982d);
            } else if (i2 == 2) {
                JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
                OriginalSoundUploadService.a("upload failed. error code is " + Long.valueOf(videoUploadInfo.getMErrorCode()) + " video id = " + this.f140982d.f140997f);
                this.f140981c.element.b();
                this.f140983e.b((Exception) new IllegalArgumentException("upload failed " + j2 + '.'));
                OriginalSoundUploadService.a(this.f140982d, "upload errcode: " + Long.valueOf(videoUploadInfo.getMErrorCode()) + " extra : " + videoUploadInfo.getMExtra() + " events: " + popAllEvents + ' ', Long.valueOf(videoUploadInfo.getMErrorCode()));
            }
        }

        b(OriginalSoundUploadService originalSoundUploadService, com.ss.android.ugc.aweme.publish.f.g gVar, z.e eVar, OriginalSoundUploadTask originalSoundUploadTask, j jVar) {
            this.f140979a = originalSoundUploadService;
            this.f140980b = gVar;
            this.f140981c = eVar;
            this.f140982d = originalSoundUploadTask;
            this.f140983e = jVar;
        }
    }

    public static void a(String str) {
        ab.a(null, 16, str);
        g.a();
    }

    static final class c<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadService f140984a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f140985b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.publish.f.g f140986c;

        static {
            Covode.recordClassIndex(92043);
        }

        c(OriginalSoundUploadService originalSoundUploadService, a aVar, com.ss.android.ugc.aweme.publish.f.g gVar) {
            this.f140984a = originalSoundUploadService;
            this.f140985b = aVar;
            this.f140986c = gVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            if (iVar.c() || iVar.b()) {
                Exception e2 = iVar.e();
                l.b(e2, "");
                throw e2;
            }
            a aVar = this.f140985b;
            Object d2 = iVar.d();
            l.b(d2, "");
            b bVar = (b) d2;
            l.d(bVar, "");
            Iterator<T> it = bVar.f141005a.iterator();
            while (it.hasNext()) {
                aVar.a((OriginalSoundUploadTask) it.next());
            }
            Object d3 = iVar.d();
            l.b(d3, "");
            return OriginalSoundUploadService.a((b) d3);
        }
    }

    static final class d<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140987a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OriginalSoundUploadService f140988b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f140989c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.publish.f.g f140990d;

        static {
            Covode.recordClassIndex(92044);
        }

        d(b bVar, OriginalSoundUploadService originalSoundUploadService, a aVar, com.ss.android.ugc.aweme.publish.f.g gVar) {
            this.f140987a = bVar;
            this.f140988b = originalSoundUploadService;
            this.f140989c = aVar;
            this.f140990d = gVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            if (!iVar.c() && !iVar.b()) {
                OriginalSoundUploadService.a(this.f140987a, this.f140989c);
            } else if (iVar.c()) {
                if ((iVar.e() instanceof IllegalStateException) && iVar.e().getMessage() != null) {
                    String message = iVar.e().getMessage();
                    if (message == null) {
                        l.b();
                    }
                    if (p.b(message, "file error", false)) {
                        OriginalSoundUploadService.a(this.f140987a, this.f140989c);
                    }
                }
                Exception e2 = iVar.e();
                l.b(e2, "");
                throw e2;
            }
            return h.z.f158842a;
        }
    }

    private static void b(b bVar) {
        for (T t : bVar.f141005a) {
            com.ss.android.ugc.aweme.tools.extract.j jVar = new com.ss.android.ugc.aweme.tools.extract.j();
            jVar.f140090a = t.f140992a;
            jVar.f140094e = Boolean.valueOf(t.f141001j);
            jVar.f140093d = Boolean.valueOf(t.f140999h);
            jVar.f140091b = t.f140998g;
            jVar.f140092c = Integer.valueOf(t.f141000i);
            boolean z = true;
            if (t.f141002k <= 1) {
                z = false;
            }
            jVar.f140097h = Boolean.valueOf(z);
            jVar.f140096g = 0;
            jVar.f140095f = -4002;
            ab.c(jVar);
        }
    }

    static final class e<TTaskResult, TContinuationResult> implements b.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f140991a;

        static {
            Covode.recordClassIndex(92045);
        }

        e(b bVar) {
            this.f140991a = bVar;
        }

        @Override // b.g
        public final /* synthetic */ Object then(i iVar) {
            l.b(iVar, "");
            if (iVar.c()) {
                for (T t : this.f140991a.f141005a) {
                    Exception e2 = iVar.e();
                    l.b(e2, "");
                    com.ss.android.ugc.aweme.base.o.b("aweme_movie_publish_log", "upload_audio", com.ss.android.ugc.aweme.tools.c.a.a(ag.a(v.a("success", "0"), v.a("success_mid", t.f140993b), v.a("aweme_id", t.f140992a), v.a("errorDesc", com.ss.android.ugc.aweme.tools.c.b.a(e2)))));
                }
            } else {
                for (T t2 : this.f140991a.f141005a) {
                    com.ss.android.ugc.aweme.base.o.b("aweme_movie_publish_log", "upload_audio", com.ss.android.ugc.aweme.tools.c.a.a(ag.a(v.a("success", "1"), v.a("success_mid", t2.f140993b), v.a("aweme_id", t2.f140992a))));
                }
            }
            return h.z.f158842a;
        }
    }

    public static i<BaseResponse> a(b bVar) {
        IRetrofitFactory a2 = RetrofitFactory.a();
        AVApi b2 = AVApiImpl.b();
        l.b(b2, "");
        AudioUploadApi audioUploadApi = (AudioUploadApi) a2.a(b2.a()).a(AudioUploadApi.class);
        if (bVar.f141005a.size() > 1) {
            l.d(bVar, "");
            JSONArray jSONArray = new JSONArray();
            for (T t : bVar.f141005a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aweme_id", t.f140992a);
                jSONObject.put("audiotrack_uri", t.f140997f);
                jSONArray.put(jSONObject);
            }
            i<BaseResponse> uploadMultiAudio = audioUploadApi.uploadMultiAudio(jSONArray);
            uploadMultiAudio.f();
            for (OriginalSoundUploadTask originalSoundUploadTask : bVar.f141005a) {
                if (!uploadMultiAudio.a()) {
                    String stackTraceString = Log.getStackTraceString(uploadMultiAudio.e());
                    l.b(stackTraceString, "");
                    a(originalSoundUploadTask, stackTraceString, -3003, 0);
                } else if (uploadMultiAudio.d().error_code != 0) {
                    String baseResponse = uploadMultiAudio.d().toString();
                    l.b(baseResponse, "");
                    a(originalSoundUploadTask, baseResponse, -3003, 0);
                } else {
                    a(originalSoundUploadTask, "", 0, 1);
                }
            }
            return uploadMultiAudio;
        }
        OriginalSoundUploadTask originalSoundUploadTask2 = bVar.f141005a.get(0);
        String str = originalSoundUploadTask2.f140992a;
        String str2 = originalSoundUploadTask2.f140997f;
        if (str2 == null) {
            l.b();
        }
        i<BaseResponse> uploadAudio = audioUploadApi.uploadAudio(str, str2);
        uploadAudio.f();
        if (!uploadAudio.a()) {
            String stackTraceString2 = Log.getStackTraceString(uploadAudio.e());
            l.b(stackTraceString2, "");
            a(originalSoundUploadTask2, stackTraceString2, -3003, 0);
        } else if (uploadAudio.d().error_code != 0) {
            String baseResponse2 = uploadAudio.d().toString();
            l.b(baseResponse2, "");
            a(originalSoundUploadTask2, baseResponse2, -3003, 0);
        } else {
            a(originalSoundUploadTask2, "", 0, 1);
        }
        return uploadAudio;
    }

    @Override // androidx.core.app.f
    public final void onHandleWork(Intent intent) {
        l.d(intent, "");
        Context applicationContext = getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        l.b(applicationContext, "");
        a a2 = a.C3732a.a(applicationContext);
        String sdkV4AuthKey = g.a().e().getSdkV4AuthKey("");
        if (!TextUtils.isEmpty(sdkV4AuthKey)) {
            com.ss.android.ugc.aweme.publish.f.d dVar = (com.ss.android.ugc.aweme.publish.f.d) g.a().C().getRetrofitFactoryGson().a(sdkV4AuthKey, com.ss.android.ugc.aweme.publish.f.d.class);
            l.b(dVar, "");
            com.ss.android.ugc.aweme.publish.f.g gVar = dVar.f118722a;
            if (gVar != null) {
                l.b(gVar, "");
                ArrayList<OriginalSoundUploadTask> a3 = a2.a();
                l.d(a3, "");
                ArrayList<b> arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (T t : a3) {
                    String str = t.f140996e;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).add(t);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<OriginalSoundUploadTask> list = (List) entry.getValue();
                    if (str2 == null || str2.length() == 0) {
                        for (OriginalSoundUploadTask originalSoundUploadTask : list) {
                            arrayList.add(new b().a(originalSoundUploadTask));
                        }
                    } else {
                        b bVar = new b();
                        for (OriginalSoundUploadTask originalSoundUploadTask2 : list) {
                            bVar.a(originalSoundUploadTask2);
                        }
                        arrayList.add(bVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (System.currentTimeMillis() - ((OriginalSoundUploadTask) n.g((List) ((b) obj2).f141005a)).f140995d > 21600000) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList<b> arrayList3 = arrayList2;
                arrayList.removeAll(arrayList3);
                for (b bVar2 : arrayList3) {
                    a(bVar2, a2);
                    b(bVar2);
                }
                g.a().o().k().a("original_sound", "pending task count: " + arrayList.size());
                for (b bVar3 : arrayList) {
                    if (w.a()) {
                        a2.b(bVar3);
                    }
                    a(bVar3, gVar).b(new c(this, a2, gVar)).a(new d(bVar3, this, a2, gVar)).a(new e(bVar3)).f();
                    g.a().o().k().a("original_sound", "original sound upload success.");
                }
            }
        }
    }

    private final i<OriginalSoundUploadTask> a(OriginalSoundUploadTask originalSoundUploadTask, com.ss.android.ugc.aweme.publish.f.g gVar) {
        if (originalSoundUploadTask.f140997f != null) {
            i<OriginalSoundUploadTask> a2 = i.a(originalSoundUploadTask);
            l.b(a2, "");
            return a2;
        }
        int checkAudioFile = VEUtils.checkAudioFile(originalSoundUploadTask.f140994c);
        if (checkAudioFile != 0) {
            a("file error, " + originalSoundUploadTask.f140994c + " checkResult = " + checkAudioFile + " video id = " + originalSoundUploadTask.f140997f);
            i<OriginalSoundUploadTask> a3 = i.a((Exception) new IllegalStateException("file error, " + originalSoundUploadTask.f140994c + " checkResult = " + checkAudioFile));
            l.b(a3, "");
            return a3;
        }
        j jVar = new j();
        z.e eVar = new z.e();
        eVar.element = null;
        try {
            eVar.element = (T) com.ss.android.ugc.aweme.uploader.factory.b.a(gVar, AbstractVideoUploader.a.NORMAL);
            eVar.element.a(new b(this, gVar, eVar, originalSoundUploadTask, jVar));
            eVar.element.a(originalSoundUploadTask.f140994c);
            eVar.element.a();
        } catch (Exception e2) {
            a("exception, video id = " + originalSoundUploadTask.f140997f);
            T t = eVar.element;
            if (t != null) {
                t.b();
            }
            String stackTraceString = Log.getStackTraceString(e2);
            l.b(stackTraceString, "");
            a(originalSoundUploadTask, stackTraceString, 0L);
            jVar.b(e2);
        }
        i<TResult> iVar = jVar.f4869a;
        l.b(iVar, "");
        return iVar;
    }

    private final i<b> a(b bVar, com.ss.android.ugc.aweme.publish.f.g gVar) {
        for (T t : bVar.f141005a) {
            try {
                i<OriginalSoundUploadTask> a2 = a((OriginalSoundUploadTask) t, gVar);
                a2.f();
                if (a2.c() || a2.b()) {
                    g.a().o().k().a("original_sound", "upload failed for awemeId: " + t.f140992a + ", reason: " + Log.getStackTraceString(a2.e()));
                } else {
                    g.a().o().k().a("original_sound", "upload uri: " + t.f140997f + ", awemeId: " + t.f140992a + " success");
                }
            } catch (Exception e2) {
                String str = "upload interrupted for awemeId: " + t.f140992a + ", reason: " + Log.getStackTraceString(e2);
                a(str);
                g.a().o().k().a("original_sound", str);
            }
        }
        i<b> a3 = i.a(bVar);
        l.b(a3, "");
        return a3;
    }

    public static void a(OriginalSoundUploadTask originalSoundUploadTask, String str, Long l2) {
        long j2;
        com.ss.android.ugc.aweme.tools.extract.j jVar = new com.ss.android.ugc.aweme.tools.extract.j();
        jVar.f140090a = originalSoundUploadTask.f140992a;
        jVar.f140094e = Boolean.valueOf(originalSoundUploadTask.f141001j);
        jVar.f140093d = Boolean.valueOf(originalSoundUploadTask.f140999h);
        jVar.f140091b = originalSoundUploadTask.f140998g;
        jVar.f140092c = Integer.valueOf(originalSoundUploadTask.f141000i);
        boolean z = true;
        if (originalSoundUploadTask.f141002k <= 1) {
            z = false;
        }
        jVar.f140097h = Boolean.valueOf(z);
        jVar.f140096g = 0;
        jVar.a(str);
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        jVar.f140098i = j2;
        jVar.f140095f = -3001;
        ab.b(jVar);
    }

    private static void a(OriginalSoundUploadTask originalSoundUploadTask, String str, int i2, int i3) {
        com.ss.android.ugc.aweme.tools.extract.j jVar = new com.ss.android.ugc.aweme.tools.extract.j();
        jVar.f140090a = originalSoundUploadTask.f140992a;
        jVar.f140094e = Boolean.valueOf(originalSoundUploadTask.f141001j);
        jVar.f140093d = Boolean.valueOf(originalSoundUploadTask.f140999h);
        jVar.f140091b = originalSoundUploadTask.f140998g;
        jVar.f140092c = Integer.valueOf(originalSoundUploadTask.f141000i);
        boolean z = true;
        if (originalSoundUploadTask.f141002k <= 1) {
            z = false;
        }
        jVar.f140097h = Boolean.valueOf(z);
        jVar.f140096g = i3;
        jVar.a(str);
        jVar.f140095f = Integer.valueOf(i2);
        ab.b(jVar);
    }
}
