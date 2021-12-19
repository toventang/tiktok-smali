package com.ss.android.ugc.aweme.photo;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.ss.android.ugc.tools.utils.h;
import java.io.Serializable;

public class PhotoContext implements Serializable {
    public int mHeight;
    public String mPhotoLocalPath;
    public int mWidth;

    static {
        Covode.recordClassIndex(73868);
    }

    private PhotoContext() {
    }

    public Uri getPhotoUri() {
        return h.d(this.mPhotoLocalPath);
    }

    public static PhotoContext fromUpload(String str, int i2, int i3) {
        k.a(str);
        PhotoContext photoContext = new PhotoContext();
        photoContext.mPhotoLocalPath = str;
        photoContext.mWidth = i2;
        photoContext.mHeight = i3;
        return photoContext;
    }
}
