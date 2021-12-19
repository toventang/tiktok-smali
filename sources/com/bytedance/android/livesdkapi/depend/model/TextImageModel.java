package com.bytedance.android.livesdkapi.depend.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public class TextImageModel extends ImageModel {

    /* renamed from: a  reason: collision with root package name */
    public String f22991a;

    /* renamed from: b  reason: collision with root package name */
    public int f22992b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f22993c;

    /* renamed from: d  reason: collision with root package name */
    public int f22994d;

    static {
        Covode.recordClassIndex(13624);
    }

    public TextImageModel(ImageModel imageModel, int i2) {
        setAvgColor(imageModel.getAvgColor());
        setUri(imageModel.getUri());
        setUrls(imageModel.getUrls());
        setWidth(imageModel.getWidth());
        setHeight(imageModel.getHeight());
        this.f22993c = i2;
    }
}
