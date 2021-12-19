package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class Hashtag {
    public static final a Companion = new a((byte) 0);
    @c(a = "id")
    public Long id;
    @c(a = "image")
    public ImageModel image;
    @c(a = "title")
    public String title;

    static {
        Covode.recordClassIndex(11280);
    }

    public Hashtag() {
        this(null, null, null, 7, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11281);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String toString() {
        return "Hashtag(id=" + this.id + ", title=" + this.title + ", image=" + this.image + ')';
    }

    public Hashtag(Long l2, String str, ImageModel imageModel) {
        this.id = l2;
        this.title = str;
        this.image = imageModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hashtag(Long l2, String str, ImageModel imageModel, int i2, g gVar) {
        this((i2 & 1) != 0 ? 0L : l2, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : imageModel);
    }
}
