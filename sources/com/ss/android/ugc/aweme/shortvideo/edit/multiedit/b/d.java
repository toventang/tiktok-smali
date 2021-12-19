package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b;

import android.app.Application;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.shortvideo.di;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.tools.utils.k;
import h.f.b.l;
import h.m.p;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f127867a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final String f127868b;

    private d() {
    }

    public static void b() {
        String str = di.f126462e;
        if (e.b(str)) {
            e.e(str);
        }
    }

    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f127869a;

        static {
            Covode.recordClassIndex(83815);
        }

        public a(c cVar) {
            this.f127869a = cVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            if (!e.b(this.f127869a.p())) {
                return null;
            }
            a(new File(this.f127869a.p()));
            return null;
        }

        private static boolean a(File file) {
            MethodCollector.i(2697);
            try {
                e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
                if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
                }
                if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                    com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                    MethodCollector.o(2697);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.o(2697);
            return delete;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f127870a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f127871b;

        static {
            Covode.recordClassIndex(83816);
        }

        b(String str, Bitmap bitmap) {
            this.f127870a = str;
            this.f127871b = bitmap;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            BufferedOutputStream bufferedOutputStream;
            Throwable th;
            Exception e2;
            MethodCollector.i(3319);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(this.f127870a)));
                try {
                    this.f127871b.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                } catch (Exception e3) {
                    e2 = e3;
                }
            } catch (Exception e4) {
                e2 = e4;
                bufferedOutputStream = null;
                try {
                    e2.printStackTrace();
                    com.ss.android.ugc.tools.utils.c.a(bufferedOutputStream);
                    MethodCollector.o(3319);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    com.ss.android.ugc.tools.utils.c.a(bufferedOutputStream);
                    MethodCollector.o(3319);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
                com.ss.android.ugc.tools.utils.c.a(bufferedOutputStream);
                MethodCollector.o(3319);
                throw th;
            }
            com.ss.android.ugc.tools.utils.c.a(bufferedOutputStream);
            MethodCollector.o(3319);
            return null;
        }
    }

    public static String a() {
        String str = f127868b;
        if (!com.ss.android.ugc.aweme.video.e.b(str)) {
            new File(str).mkdirs();
        }
        return str + System.currentTimeMillis() + "_cover_img.png";
    }

    static {
        Covode.recordClassIndex(83814);
        StringBuilder sb = new StringBuilder();
        Application application = i.f115645a;
        l.b(application, "");
        File filesDir = application.getFilesDir();
        l.b(filesDir, "");
        f127868b = sb.append(filesDir.getAbsolutePath()).append(File.separator).append("multi_edit").append(File.separator).toString();
    }

    public static void a(Bitmap bitmap, String str) {
        l.d(str, "");
        if (bitmap != null && !bitmap.isRecycled()) {
            b.i.b(new b(str, bitmap), b.i.f4824a);
        }
    }

    public static MultiEditVideoRecordData a(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null) {
            return new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData2 == null) {
            MultiEditVideoRecordData cloneData = multiEditVideoRecordData.cloneData();
            l.b(cloneData, "");
            return cloneData;
        }
        multiEditVideoRecordData2.concatVideo = multiEditVideoRecordData.concatVideo;
        multiEditVideoRecordData2.concatAudio = multiEditVideoRecordData.concatAudio;
        multiEditVideoRecordData2.useMusic = multiEditVideoRecordData.useMusic;
        multiEditVideoRecordData2.startTime = multiEditVideoRecordData.startTime;
        multiEditVideoRecordData2.endTime = multiEditVideoRecordData.endTime;
        multiEditVideoRecordData2.leftSlideX = multiEditVideoRecordData.leftSlideX;
        multiEditVideoRecordData2.rightSlideX = multiEditVideoRecordData.rightSlideX;
        multiEditVideoRecordData2.curRecordingDir = multiEditVideoRecordData.curRecordingDir;
        multiEditVideoRecordData2.segmentDataList = new ArrayList();
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData.segmentDataList) {
            multiEditVideoRecordData2.segmentDataList.add(multiEditVideoSegmentRecordData.cloneData());
        }
        multiEditVideoRecordData2.musicPath = multiEditVideoRecordData.musicPath;
        multiEditVideoRecordData2.originVolume = multiEditVideoRecordData.originVolume;
        multiEditVideoRecordData2.musicVolume = multiEditVideoRecordData.musicVolume;
        multiEditVideoRecordData2.hasRetake = multiEditVideoRecordData.hasRetake;
        multiEditVideoRecordData2.musicTrimIn = multiEditVideoRecordData.musicTrimIn;
        multiEditVideoRecordData2.musicDuration = multiEditVideoRecordData.musicDuration;
        multiEditVideoRecordData2.preVideoDuration = multiEditVideoRecordData.preVideoDuration;
        multiEditVideoRecordData2.coverPath = multiEditVideoRecordData.coverPath;
        return multiEditVideoRecordData2;
    }

    public static MultiEditVideoRecordData b(MultiEditVideoRecordData multiEditVideoRecordData, MultiEditVideoRecordData multiEditVideoRecordData2) {
        if (multiEditVideoRecordData == null || multiEditVideoRecordData2 == null || k.a(multiEditVideoRecordData2.segmentDataList) || k.a(multiEditVideoRecordData.segmentDataList)) {
            return multiEditVideoRecordData;
        }
        multiEditVideoRecordData.copyData(multiEditVideoRecordData2);
        for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : multiEditVideoRecordData2.segmentDataList) {
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 : multiEditVideoRecordData.segmentDataList) {
                if (multiEditVideoSegmentRecordData != null && !TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath) && l.a((Object) multiEditVideoSegmentRecordData.videoPath, (Object) multiEditVideoSegmentRecordData2.videoPath)) {
                    multiEditVideoSegmentRecordData2.copyData(multiEditVideoSegmentRecordData);
                }
            }
        }
        return multiEditVideoRecordData;
    }

    private static void b(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, String str, String str2) {
        if (multiEditVideoSegmentRecordData != null) {
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.audioPath)) {
                String str3 = multiEditVideoSegmentRecordData.audioPath;
                l.b(str3, "");
                multiEditVideoSegmentRecordData.draftAudioPath = p.a(str3, str, str2, false);
            }
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.videoPath)) {
                String str4 = multiEditVideoSegmentRecordData.videoPath;
                l.b(str4, "");
                multiEditVideoSegmentRecordData.draftVideoPath = p.a(str4, str, str2, false);
            }
        }
    }

    private static void a(MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData, String str, String str2) {
        if (multiEditVideoSegmentRecordData != null) {
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftAudioPath)) {
                String str3 = multiEditVideoSegmentRecordData.draftAudioPath;
                l.b(str3, "");
                multiEditVideoSegmentRecordData.audioPath = p.a(str3, str, str2, false);
            }
            if (!TextUtils.isEmpty(multiEditVideoSegmentRecordData.draftVideoPath)) {
                String str4 = multiEditVideoSegmentRecordData.draftVideoPath;
                l.b(str4, "");
                multiEditVideoSegmentRecordData.videoPath = p.a(str4, str, str2, false);
            }
        }
    }

    public static final void b(String str, String str2, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        l.d(str, "");
        l.d(str2, "");
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData == null || (list2 = multiEditVideoRecordData.segmentDataList) == null)) {
                for (T t : list2) {
                    a(t, str, str2);
                    com.ss.android.ugc.aweme.draft.k.a("[setMultiRecordVideoPath]: video path = " + t.videoPath + " draft video path = " + t.draftVideoPath);
                }
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData2 == null || (list = multiEditVideoRecordData2.segmentDataList) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next(), str, str2);
                }
            }
        }
    }

    public static void a(String str, String str2, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        List<MultiEditVideoSegmentRecordData> list;
        List<MultiEditVideoSegmentRecordData> list2;
        l.d(str, "");
        l.d(str2, "");
        if (multiEditVideoStatusRecordData != null) {
            MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData == null || (list2 = multiEditVideoRecordData.segmentDataList) == null)) {
                for (T t : list2) {
                    b(t, str, str2);
                    com.ss.android.ugc.aweme.draft.k.a("[setMultiRecordDraftPath]: video path = " + t.videoPath + " draft video path = " + t.draftVideoPath);
                }
            }
            MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
            if (!(multiEditVideoRecordData2 == null || (list = multiEditVideoRecordData2.segmentDataList) == null)) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    b(it.next(), str, str2);
                }
            }
        }
    }
}
