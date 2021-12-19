package com.ss.avframework.livestreamv2.core.interact.video;

import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.ILayerControl;
import com.ss.avframework.livestreamv2.core.interact.model.Config;
import java.nio.ByteBuffer;

public interface VideoSink {
    static {
        Covode.recordClassIndex(100305);
    }

    int consumeDualGameVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, int i5, long j2);

    String getInteractId();

    ILayerControl.ILayer getRenderLayer();

    SurfaceView getSurfaceView();

    int getTextureID();

    TextureView getTextureView();

    boolean isValid();

    void onByteBufferVideoFrame(ByteBuffer byteBuffer, Config.VideoOutputFormat videoOutputFormat, int i2, int i3, int i4, int i5, long j2);

    void onTextureVideoFrame(int i2, Config.VideoOutputFormat videoOutputFormat, int i3, int i4, float[] fArr, int i5, long j2);

    void setFitMode(boolean z);

    void setRenderAble(boolean z);
}
