package com.bytedance.android.livesdkapi.host;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public interface e extends com.bytedance.android.live.base.a {

    public static class a {
        static {
            Covode.recordClassIndex(13805);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(13806);
        }

        void a(Bitmap bitmap);
    }

    static {
        Covode.recordClassIndex(13804);
    }

    a a(ImageModel imageModel, b bVar);

    String a(ImageModel imageModel);
}
