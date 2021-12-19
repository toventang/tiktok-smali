package com.ss.android.ugc.aweme.services.external.ability;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.f.a.m;
import h.f.a.r;
import h.z;
import java.nio.ByteBuffer;
import java.util.List;

public interface IAVInfoService {

    public interface IFilterMedia<T> {
        static {
            Covode.recordClassIndex(79654);
        }

        boolean filter(T t);
    }

    public interface IGetInfoCallback<T> {
        static {
            Covode.recordClassIndex(79655);
        }

        void finish(T t);
    }

    public interface VEFrameAvailableListener {
        static {
            Covode.recordClassIndex(79656);
        }

        boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4);
    }

    static {
        Covode.recordClassIndex(79653);
    }

    void audioLegal(Context context, List<? extends MusicModel> list, IFilterMedia<Integer> iFilterMedia, IGetInfoCallback<List<MusicModel>> iGetInfoCallback);

    void audioLegal(String str, int i2, IGetInfoCallback<Integer> iGetInfoCallback);

    void audioLegal(List<String> list, IGetInfoCallback<List<Integer>> iGetInfoCallback);

    void importLegal(Context context, String str, boolean z, int i2, int i3, m<? super String, ? super Long, z> mVar, r<? super String, ? super Long, ? super Integer, ? super String, z> rVar);

    void mp3Legal(Context context, String str, IGetInfoCallback<Integer> iGetInfoCallback);

    void mp3Legal(String str, IGetInfoCallback<Integer> iGetInfoCallback);

    int[] photoInfo(String str);

    void videoCover(c cVar, IGetInfoCallback<Bitmap> iGetInfoCallback);

    void videoFrame(String str, int[] iArr, VEFrameAvailableListener vEFrameAvailableListener);

    void videoInfo(String str, boolean z, IGetInfoCallback<int[]> iGetInfoCallback);
}
