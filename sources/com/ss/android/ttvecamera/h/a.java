package com.ss.android.ttvecamera.h;

import android.media.MediaCodec;
import android.media.MediaMetadataRetriever;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ttvecamera.o;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public final class a {

    /* renamed from: k  reason: collision with root package name */
    private static final SparseIntArray f61554k;

    /* renamed from: a  reason: collision with root package name */
    public MediaRecorder f61555a = new MediaRecorder();

    /* renamed from: b  reason: collision with root package name */
    public String f61556b;

    /* renamed from: c  reason: collision with root package name */
    public HandlerThread f61557c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f61558d;

    /* renamed from: e  reason: collision with root package name */
    public Size f61559e = new Size(1280, 720);

    /* renamed from: f  reason: collision with root package name */
    public int f61560f = 30;

    /* renamed from: g  reason: collision with root package name */
    public int f61561g = 10000000;

    /* renamed from: h  reason: collision with root package name */
    public AbstractC1341a f61562h;

    /* renamed from: i  reason: collision with root package name */
    private int f61563i = -1;

    /* renamed from: j  reason: collision with root package name */
    private Surface f61564j;

    /* renamed from: l  reason: collision with root package name */
    private int f61565l = 0;

    /* renamed from: com.ss.android.ttvecamera.h.a$a  reason: collision with other inner class name */
    public interface AbstractC1341a {
        static {
            Covode.recordClassIndex(37892);
        }

        void a();
    }

    public final Surface b() {
        if (this.f61564j == null) {
            this.f61564j = MediaCodec.createPersistentInputSurface();
        }
        return this.f61564j;
    }

    static {
        Covode.recordClassIndex(37891);
        SparseIntArray sparseIntArray = new SparseIntArray();
        f61554k = sparseIntArray;
        sparseIntArray.append(0, 90);
        sparseIntArray.append(1, 0);
        sparseIntArray.append(2, 270);
        sparseIntArray.append(3, LiveFeedRefreshTimeSetting.DEFAULT);
    }

    public a() {
        HandlerThread handlerThread = new HandlerThread("MediaRecorderBackground");
        this.f61557c = handlerThread;
        handlerThread.start();
        this.f61558d = new Handler(this.f61557c.getLooper());
    }

    public final void a() {
        String str = this.f61556b;
        if (str != null && !str.isEmpty()) {
            File file = new File(this.f61556b);
            o.b("TEMediaRecorder", "file length = " + file.length());
            if (!file.exists() || file.length() != 0) {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(this.f61556b);
                    Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
                } catch (IllegalArgumentException unused) {
                    String str2 = this.f61556b;
                    if (str2 != null && !str2.isEmpty()) {
                        File file2 = new File(this.f61556b);
                        o.b("TEMediaRecorder", "file length = " + file2.length());
                        if (file2.exists()) {
                            a(file2);
                            this.f61556b = "";
                            o.b("TEMediaRecorder", "invalid video file deleted!");
                        }
                    }
                    o.d("TEMediaRecorder", "cannot access the file");
                }
                mediaMetadataRetriever.release();
                return;
            }
            a(file);
            this.f61556b = "";
            o.b("TEMediaRecorder", "invalid video file deleted!");
        }
    }

    private static boolean a(File file) {
        MethodCollector.i(125);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(125);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(125);
        return delete;
    }
}
