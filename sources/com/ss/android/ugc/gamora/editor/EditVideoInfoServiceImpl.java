package com.ss.android.ugc.gamora.editor;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.b;
import h.f.b.l;

public final class EditVideoInfoServiceImpl implements IEditVideoInfoService {

    /* renamed from: a  reason: collision with root package name */
    private final int f145659a = 10;

    /* renamed from: b  reason: collision with root package name */
    private final LruCache<String, Long> f145660b = new LruCache<>(10);

    /* renamed from: c  reason: collision with root package name */
    private final LruCache<String, VideoInfoData> f145661c = new LruCache<>(10);

    static {
        Covode.recordClassIndex(95664);
    }

    public static IEditVideoInfoService a() {
        MethodCollector.i(5068);
        Object a2 = b.a(IEditVideoInfoService.class, false);
        if (a2 != null) {
            IEditVideoInfoService iEditVideoInfoService = (IEditVideoInfoService) a2;
            MethodCollector.o(5068);
            return iEditVideoInfoService;
        }
        if (b.eH == null) {
            synchronized (IEditVideoInfoService.class) {
                try {
                    if (b.eH == null) {
                        b.eH = new EditVideoInfoServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5068);
                    throw th;
                }
            }
        }
        EditVideoInfoServiceImpl editVideoInfoServiceImpl = (EditVideoInfoServiceImpl) b.eH;
        MethodCollector.o(5068);
        return editVideoInfoServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final VideoInfoData getVideoInfoData(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f145661c.get(str);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final Long getVideoLength(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return this.f145660b.get(str);
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoInfoData(String str, VideoInfoData videoInfoData) {
        l.d(videoInfoData, "");
        if (!TextUtils.isEmpty(str)) {
            this.f145661c.put(str, videoInfoData);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService
    public final void setVideoLength(String str, long j2) {
        if (!TextUtils.isEmpty(str)) {
            this.f145660b.put(str, Long.valueOf(j2));
        }
    }
}
