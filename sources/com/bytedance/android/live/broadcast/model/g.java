package com.bytedance.android.live.broadcast.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public final class g implements Serializable {
    @c(a = "category_app_android")
    private List<String> categoryAppAndroid;
    @c(a = "category_id")
    private Long categoryId;
    @c(a = "icon")
    private ImageModel icon;
    @c(a = "is_removed")
    private boolean isRemoved;
    @c(a = "orientation")
    private int orientation;
    @c(a = "sub_categorys")
    private List<g> subCategories;
    @c(a = "title")
    private String title;

    static {
        Covode.recordClassIndex(3919);
    }

    public final List<String> getCategoryAppAndroid() {
        return this.categoryAppAndroid;
    }

    public final Long getCategoryId() {
        return this.categoryId;
    }

    public final ImageModel getIcon() {
        return this.icon;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final List<g> getSubCategories() {
        return this.subCategories;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isRemoved() {
        return this.isRemoved;
    }

    public final void setCategoryAppAndroid(List<String> list) {
        this.categoryAppAndroid = list;
    }

    public final void setCategoryId(Long l2) {
        this.categoryId = l2;
    }

    public final void setIcon(ImageModel imageModel) {
        this.icon = imageModel;
    }

    public final void setOrientation(int i2) {
        this.orientation = i2;
    }

    public final void setRemoved(boolean z) {
        this.isRemoved = z;
    }

    public final void setSubCategories(List<g> list) {
        this.subCategories = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
