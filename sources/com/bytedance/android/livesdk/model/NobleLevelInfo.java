package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class NobleLevelInfo {
    @c(a = "expire_time")
    public long expireTime;
    @c(a = "noble_background")
    ImageModel nobleBackground;
    @c(a = "noble_background_color")
    public List<String> nobleBackgroundColor;
    @c(a = "noble_big_icon")
    ImageModel nobleBigIcon;
    @c(a = "noble_boarder")
    public ImageModel nobleBoarder;
    @c(a = "noble_icon")
    ImageModel nobleIcon;
    @c(a = "noble_icon_with_back")
    ImageModel nobleIconWithBack;
    @c(a = "noble_level")
    long nobleLevel;
    @c(a = "noble_name")
    String nobleName;

    static {
        Covode.recordClassIndex(11285);
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j2) {
        this.expireTime = j2;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j2) {
        this.nobleLevel = j2;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }
}
