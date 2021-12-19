package com.facebook.common.l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.InputStream;

public interface b {

    public interface a {
        static {
            Covode.recordClassIndex(28685);
        }
    }

    static {
        Covode.recordClassIndex(28684);
    }

    Bitmap decodeFileDescriptor(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);

    Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    void setBitmapCreator(a aVar);

    void setWebpErrorLogger(a aVar);
}
