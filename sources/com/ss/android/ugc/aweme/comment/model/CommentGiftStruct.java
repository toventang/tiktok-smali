package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

public final class CommentGiftStruct implements Serializable {
    @c(a = "id")
    private final long id;
    @c(a = "image")
    private final UrlModel image;

    static {
        Covode.recordClassIndex(44297);
    }

    public final long getId() {
        return this.id;
    }

    public final UrlModel getImage() {
        return this.image;
    }
}
