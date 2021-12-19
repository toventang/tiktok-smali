package com.ss.android.ugc.aweme.tools.extract.video;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.o;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.publish.f.d;
import com.ss.android.ugc.aweme.setting.w;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.upload.ad;
import com.ss.android.ugc.aweme.tools.extract.ab;
import com.ss.android.ugc.aweme.tools.extract.j;
import com.ss.android.ugc.aweme.uploader.f;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import com.ss.android.ugc.tools.utils.u;
import com.ss.ttuploader.UploadEventManager;
import h.f.b.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l.b.c;
import l.b.e;
import org.json.JSONArray;

public class VideoFramesUploadService extends o {

    /* renamed from: a  reason: collision with root package name */
    static final String f140115a = VideoFramesUploadService.class.getSimpleName();

    /* access modifiers changed from: package-private */
    public interface FramesUploadApi {
        static {
            Covode.recordClassIndex(91560);
        }

        @l.b.o(a = "/aweme/v2/aweme/vframe/update/")
        @e
        i<BaseResponse> uploadFrame(@c(a = "aweme_id") String str, @c(a = "video_id") String str2, @c(a = "vframe_uri") String str3);

        @l.b.o(a = "/aweme/v2/aweme/vframe/update/")
        @e
        i<BaseResponse> uploadFrame(@c(a = "aweme_id") String str, @c(a = "video_id") String str2, @c(a = "vframe_uri") String str3, @c(a = "stickers") String str4);

        @l.b.o(a = "/tiktok/v1/multi/vframe/update/")
        @e
        i<BaseResponse> uploadMultiFrame(@c(a = "vframe_requests") JSONArray jSONArray);
    }

    @Override // androidx.core.app.f
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(i iVar) {
        if (iVar.c()) {
            a(15, "failed total: " + iVar.e().getMessage());
            iVar.e().printStackTrace();
        }
        return null;
    }

    private static void a(n nVar, String str, int i2) {
        j jVar = new j();
        jVar.f140090a = nVar.f140145a;
        jVar.f140094e = Boolean.valueOf(nVar.f140155k);
        jVar.f140093d = Boolean.valueOf(nVar.f140153i);
        jVar.f140091b = nVar.f140152h;
        jVar.f140092c = Integer.valueOf(nVar.f140154j);
        boolean z = true;
        if (nVar.f140156l <= 1) {
            z = false;
        }
        jVar.f140097h = Boolean.valueOf(z);
        jVar.a(str);
        jVar.f140096g = 0;
        jVar.f140095f = Integer.valueOf(i2);
        ab.a(jVar);
    }

    /* access modifiers changed from: package-private */
    public final i<o> a(o oVar, com.ss.android.ugc.aweme.publish.f.e eVar) {
        for (n nVar : oVar.f140169a) {
            try {
                i<n> a2 = a(nVar, eVar);
                a2.f();
                if (a2.c() || a2.b()) {
                    g.a().o().k().a("extract_frame", "upload failed for awemeId: " + nVar.f140145a + ", reason: " + Log.getStackTraceString(a2.e()));
                } else {
                    g.a().o().k().a("extract_frame", "upload uri: " + nVar.f140147c + ", awemeId: " + nVar.f140145a + " success");
                }
            } catch (InterruptedException e2) {
                g.a().o().k().a("extract_frame", "upload interrupted for awemeId: " + nVar.f140145a + ", reason: " + Log.getStackTraceString(e2));
            }
        }
        return i.a(oVar);
    }

    static boolean a() {
        return g.a().A() != null && g.a().A().a();
    }

    static {
        Covode.recordClassIndex(91558);
    }

    private static void a(n nVar) {
        boolean z;
        j jVar = new j();
        jVar.f140090a = nVar.f140145a;
        jVar.f140094e = Boolean.valueOf(nVar.f140155k);
        jVar.f140093d = Boolean.valueOf(nVar.f140153i);
        jVar.f140091b = nVar.f140152h;
        jVar.f140092c = Integer.valueOf(nVar.f140154j);
        if (nVar.f140156l > 1) {
            z = true;
        } else {
            z = false;
        }
        jVar.f140097h = Boolean.valueOf(z);
        jVar.f140096g = 1;
        ab.a(jVar);
    }

    private static void b(o oVar) {
        for (n nVar : oVar.f140169a) {
            j jVar = new j();
            jVar.f140090a = nVar.f140145a;
            jVar.f140094e = Boolean.valueOf(nVar.f140155k);
            jVar.f140093d = Boolean.valueOf(nVar.f140153i);
            jVar.f140091b = nVar.f140152h;
            jVar.f140092c = Integer.valueOf(nVar.f140154j);
            boolean z = true;
            if (nVar.f140156l <= 1) {
                z = false;
            }
            jVar.f140097h = Boolean.valueOf(z);
            jVar.f140096g = 0;
            jVar.f140095f = -4001;
            ab.c(jVar);
        }
    }

    static i<BaseResponse> a(o oVar) {
        i<BaseResponse> uploadFrame;
        try {
            FramesUploadApi framesUploadApi = (FramesUploadApi) RetrofitFactory.a().a(AVApiImpl.b().a()).a(FramesUploadApi.class);
            if (oVar.f140169a.isEmpty()) {
                return i.a((Exception) new IllegalStateException("VideoFramesUploadModel is empty"));
            }
            if (oVar.f140169a.size() > 1) {
                i<BaseResponse> uploadMultiFrame = framesUploadApi.uploadMultiFrame(l.a(oVar));
                uploadMultiFrame.f();
                for (n nVar : oVar.f140169a) {
                    if (!uploadMultiFrame.a()) {
                        a(nVar, "task fail with exception : " + Log.getStackTraceString(uploadMultiFrame.e()), -3003);
                    } else if (uploadMultiFrame.d().status_code == 0) {
                        a(nVar);
                    } else {
                        a(nVar, "response: " + uploadMultiFrame.d().toString(), -3003);
                    }
                }
                return uploadMultiFrame;
            }
            n nVar2 = oVar.f140169a.get(0);
            if (nVar2.f140149e == null || nVar2.f140149e.getStickerIds() == null) {
                uploadFrame = framesUploadApi.uploadFrame(nVar2.f140145a, nVar2.f140146b, nVar2.f140147c);
            } else {
                uploadFrame = framesUploadApi.uploadFrame(nVar2.f140145a, nVar2.f140146b, nVar2.f140147c, nVar2.f140149e.getStickerIds());
            }
            uploadFrame.f();
            if (!uploadFrame.a()) {
                a(nVar2, "task fail with exception : " + Log.getStackTraceString(uploadFrame.e()), -3002);
            } else if (uploadFrame.d().status_code == 0) {
                a(nVar2);
            } else {
                a(nVar2, "response: " + uploadFrame.d().toString(), -3002);
            }
            return uploadFrame;
        } catch (Exception e2) {
            return i.a(e2);
        }
    }

    @Override // androidx.core.app.f
    public void onHandleWork(Intent intent) {
        String str;
        if (!com.ss.android.ugc.aweme.port.in.c.u.a()) {
            Context applicationContext = getApplicationContext();
            if (a.f107168c && applicationContext == null) {
                applicationContext = a.f107166a;
            }
            m a2 = m.a(applicationContext);
            if (intent != null) {
                str = a(intent, "authkey");
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                d dVar = null;
                try {
                    dVar = (d) new com.google.gson.g().b().a(str, d.class);
                } catch (Exception unused) {
                }
                if (!(dVar == null || dVar.f118725d == null)) {
                    List<n> a3 = a2.a();
                    l.d(a3, "");
                    ArrayList arrayList = new ArrayList();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (T t : a3) {
                        String str2 = t.f140151g;
                        Object obj = linkedHashMap.get(str2);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(str2, obj);
                        }
                        ((List) obj).add(t);
                    }
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List<n> list = (List) entry.getValue();
                        if (str3 == null || str3.length() == 0) {
                            for (n nVar : list) {
                                arrayList.add(new o().a(nVar));
                            }
                        } else {
                            o oVar = new o();
                            for (n nVar2 : list) {
                                oVar.a(nVar2);
                            }
                            arrayList.add(oVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        g.a().o().k().a("extract_frame", "task is empty");
                        return;
                    }
                    if (w.a()) {
                        a2.a(arrayList);
                    }
                    g.a().o().k().a("extract_frame", "pending task count: " + arrayList.size());
                    for (o oVar2 : arrayList) {
                        if (!oVar2.f140169a.isEmpty()) {
                            if (System.currentTimeMillis() - oVar2.f140169a.get(0).f140150f > 21600000) {
                                b(oVar2);
                                a(oVar2, a2);
                            } else {
                                try {
                                    b(oVar2, a2).b(new p(this, a2, oVar2, dVar)).b(new q(this, a2)).a(new r(this, oVar2, a2)).a(new s(this)).f();
                                    g.a().o().k().a("extract_frame", "upload extract frame success.");
                                } catch (InterruptedException e2) {
                                    a(15, "failed interrupt: " + e2.getMessage());
                                    e2.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    static void a(o oVar, m mVar) {
        for (n nVar : oVar.f140169a) {
            a(nVar, mVar);
        }
    }

    public static void a(int i2, String str) {
        g.a().o().k().a("extract_frame", "msg = ".concat(String.valueOf(str)));
        ab.a((Object) null, -1, i2, str);
        g.a();
    }

    private i<n> a(final n nVar, com.ss.android.ugc.aweme.publish.f.e eVar) {
        if (a()) {
            return i.a((Exception) new IllegalStateException("stop task manually for specified case"));
        }
        if (!TextUtils.isEmpty(nVar.f140147c)) {
            g.a().o().k().a("extract_frame", "skip upload");
            return i.a(nVar);
        }
        final b.j jVar = new b.j();
        try {
            final AbstractImageUploader a2 = com.ss.android.ugc.aweme.uploader.factory.a.a(eVar);
            a2.a(new AbstractImageUploader.a() {
                /* class com.ss.android.ugc.aweme.tools.extract.video.VideoFramesUploadService.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(91559);
                }

                @Override // com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader.a
                public final void a(int i2, long j2, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                    JSONArray popAllImageEvents;
                    if (i2 == a2.a()) {
                        a2.d();
                        nVar.f140147c = imageUploadInfo.getMImageToskey();
                        jVar.b(nVar);
                    } else if (i2 == a2.b()) {
                        if (f.a()) {
                            popAllImageEvents = new JSONArray();
                        } else {
                            popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
                            l.b(popAllImageEvents, "");
                        }
                        VideoFramesUploadService.a(15, "upload zip file failed video id = " + nVar.f140146b + ", msg: " + imageUploadInfo.getMExtra() + ", code: " + imageUploadInfo.getMErrorCode());
                        a2.d();
                        VideoFramesUploadService.a(nVar, imageUploadInfo.getMErrorCode(), "what : " + i2 + ", code: " + imageUploadInfo.getMErrorCode() + ", events: " + popAllImageEvents.toString());
                        jVar.b((Exception) new IllegalStateException("upload zip file failed"));
                    }
                }
            });
            ad adVar = new ad();
            adVar.a(eVar);
            a2.a(adVar.a());
            a2.a(new String[]{nVar.f140148d});
            try {
                a2.c();
            } catch (Exception e2) {
                a(15, "upload zip file exception step 1 video id = " + nVar.f140146b + ", msg: " + Log.getStackTraceString(e2));
                a2.d();
                a(nVar, 0, Log.getStackTraceString(e2));
                throw e2;
            }
        } catch (Throwable th) {
            a(15, "upload zip file exception step 2 video id = " + nVar.f140146b + ", msg: " + Log.getStackTraceString(th));
            a(nVar, 0, Log.getStackTraceString(th));
            jVar.b(new Exception(th));
        }
        return jVar.f4869a;
    }

    private i<o> b(o oVar, m mVar) {
        i iVar;
        g.a().o().k().a("extract_frame", "ready to package zip");
        Iterator<n> it = oVar.f140169a.iterator();
        while (it.hasNext()) {
            n next = it.next();
            if (next == null) {
                try {
                    a(14, "model == null");
                    iVar = i.a((Exception) new IllegalStateException("the upload model is null"));
                } catch (InterruptedException e2) {
                    g.a().o().k().a("extract_frame", "zip interrupted for awemeId: " + next.f140145a + ", reason: " + Log.getStackTraceString(e2));
                }
            } else {
                if (TextUtils.isEmpty(next.f140148d) || !new File(next.f140148d).exists()) {
                    ExtractFramesModel extractFramesModel = next.f140149e;
                    if (extractFramesModel == null) {
                        iVar = i.a((Exception) new IllegalStateException("the upload frameModel is null"));
                    } else {
                        List<FrameItem> allFrames = next.f140149e.getAllFrames();
                        if (allFrames.isEmpty()) {
                            iVar = i.a((Exception) new IllegalStateException("the upload frames is empty"));
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (FrameItem frameItem : allFrames) {
                                if (!com.ss.android.ugc.aweme.video.e.b(frameItem.getPath())) {
                                    a(14, "extract file does not exist, video id = " + next.f140146b + ", dir:" + frameItem.getPath());
                                } else if (!arrayList.contains(frameItem.getPath())) {
                                    arrayList.add(frameItem.getPath());
                                }
                            }
                            next.f140148d = u.a(extractFramesModel.getExtractFramesDir(), arrayList);
                            if (next.f140148d == null || !com.ss.android.ugc.aweme.video.e.b(next.f140148d)) {
                                a(14, "upload zipPath is empty video id = " + next.f140146b + " , zipPath: " + next.f140148d);
                                iVar = i.a((Exception) new IllegalStateException("the upload zipPath is empty"));
                            } else {
                                long length = new File(next.f140148d).length();
                                if (length < 100) {
                                    a(15, "upload zip size == " + length + " video id = " + next.f140146b);
                                }
                            }
                        }
                    }
                }
                iVar = i.a(next);
            }
            iVar.f();
            if (iVar.c() || iVar.b()) {
                it.remove();
                a(next, mVar);
                g.a().o().k().a("extract_frame", "zip failed for awemeId: " + next.f140145a + ", reason: " + Log.getStackTraceString(iVar.e()));
                j jVar = new j();
                jVar.f140090a = next.f140145a;
                jVar.f140094e = Boolean.valueOf(next.f140155k);
                jVar.f140093d = Boolean.valueOf(next.f140153i);
                jVar.f140091b = next.f140152h;
                jVar.f140092c = Integer.valueOf(next.f140154j);
                boolean z = true;
                if (next.f140156l <= 1) {
                    z = false;
                }
                jVar.f140097h = Boolean.valueOf(z);
                jVar.f140096g = 0;
                jVar.a(Log.getStackTraceString(iVar.e()));
                jVar.f140095f = -2001;
                ab.a(jVar);
            } else {
                g.a().o().k().a("extract_frame", "zip path: " + next.f140148d + ", awemeId: " + next.f140145a + " success");
            }
        }
        return i.a(oVar);
    }

    private static void a(n nVar, m mVar) {
        mVar.a(nVar.f140145a);
        if (nVar.f140149e != null) {
            com.ss.android.ugc.aweme.video.e.e(nVar.f140149e.getExtractFramesDir());
            com.ss.android.ugc.aweme.video.e.c(nVar.f140149e.getExtractFramesDir());
        }
        g.a().o().k().a("extract_frame", "cleanup frame, awemeId: " + nVar.f140145a);
    }

    public static void a(n nVar, long j2, String str) {
        j jVar = new j();
        jVar.f140090a = nVar.f140145a;
        jVar.f140094e = Boolean.valueOf(nVar.f140155k);
        jVar.f140093d = Boolean.valueOf(nVar.f140153i);
        jVar.f140091b = nVar.f140152h;
        jVar.f140092c = Integer.valueOf(nVar.f140154j);
        boolean z = true;
        if (nVar.f140156l <= 1) {
            z = false;
        }
        jVar.f140097h = Boolean.valueOf(z);
        jVar.f140098i = j2;
        jVar.f140096g = 0;
        jVar.a(str);
        jVar.f140095f = -3001;
        ab.a(jVar);
    }
}
