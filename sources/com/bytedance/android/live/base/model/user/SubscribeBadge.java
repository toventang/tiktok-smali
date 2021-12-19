package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class SubscribeBadge {
    @c(a = "origin_img")
    ImageModel originImage;
    @c(a = "preview_img")
    ImageModel previewImage;

    static {
        Covode.recordClassIndex(3626);
    }

    public ImageModel getOriginImage() {
        return this.originImage;
    }

    public ImageModel getPreviewImage() {
        return this.previewImage;
    }

    public void setOriginImage(ImageModel imageModel) {
        this.originImage = imageModel;
    }

    public void setPreviewImage(ImageModel imageModel) {
        this.previewImage = imageModel;
    }
}
