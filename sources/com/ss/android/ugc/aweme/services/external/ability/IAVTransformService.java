package com.ss.android.ugc.aweme.services.external.ability;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.services.upload.ExternalUploadVideoConfig;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

public interface IAVTransformService {

    public interface ITransformCallback<T> {
        static {
            Covode.recordClassIndex(79664);
        }

        void finish(T t);
    }

    public interface ITransformProgress {
        static {
            Covode.recordClassIndex(79665);
        }

        void update(int i2);
    }

    static {
        Covode.recordClassIndex(79663);
    }

    void audio2wavebean(String str, ITransformCallback<MusicWaveBean> iTransformCallback);

    ExternalUploadVideoConfig parseUploadVideoConfig(String str);

    void video2gif(VideoShare2GifEditContext videoShare2GifEditContext, ITransformProgress iTransformProgress, ITransformCallback<Boolean> iTransformCallback);

    void video2webp(String str, String str2, int i2, int i3, ITransformCallback<Integer> iTransformCallback, ITransformProgress iTransformProgress);
}
