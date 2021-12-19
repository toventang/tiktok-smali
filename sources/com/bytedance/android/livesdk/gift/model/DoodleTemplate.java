package com.bytedance.android.livesdk.gift.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class DoodleTemplate {
    @c(a = "template_id")
    public long id;
    @c(a = "image")
    public ImageModel image;
    public boolean selected;

    static {
        Covode.recordClassIndex(9928);
    }

    public long getId() {
        return this.id;
    }

    public ImageModel getImage() {
        return this.image;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setId(long j2) {
        this.id = j2;
    }

    public void setImage(ImageModel imageModel) {
        this.image = imageModel;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }
}
