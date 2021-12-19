package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import androidx.core.g.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.List;

public interface h {
    static {
        Covode.recordClassIndex(82834);
    }

    void a();

    void a(e<Float, Float> eVar, List<VideoSegment> list);

    void a(e<Float, Float> eVar, boolean z);

    void a(List<VideoSegment> list);

    void a(boolean z);

    boolean a(androidx.fragment.app.e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, VideoEditViewModel videoEditViewModel, List<VideoSegment> list, int i2);

    boolean a(androidx.fragment.app.e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, String str);

    boolean a(androidx.fragment.app.e eVar, CutMultiVideoViewModel cutMultiVideoViewModel, List<MediaModel> list);

    void b();

    void c();

    boolean d();

    void e();

    void f();

    boolean g();

    int getCurrentRotate();

    float getCurrentSpeed();

    int getEditState();

    long getLeftSeekingValue();

    long getMaxCutDuration();

    long getMultiPlayingPosition();

    long getMultiSeekTime();

    e<Long, Long> getPlayBoundary();

    long getPlayingPosition();

    long getRightSeekingValue();

    float getSelectedTime();

    long getSinglePlayingPosition();

    long getSingleSeekTime();

    e<Float, Float> getSlideX();

    void setCurrentRotate(int i2);

    void setDefaultMode(boolean z);

    void setExtractFramesInRoughMode(boolean z);

    void setLoadThumbnailDirectly(boolean z);

    void setMaxVideoLength(long j2);

    void setMinVideoLength(long j2);

    void setMultiEditEnableForStickPointMode(boolean z);
}
