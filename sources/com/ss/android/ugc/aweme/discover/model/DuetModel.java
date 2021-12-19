package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

public final class DuetModel implements Serializable {
    @c(a = "can_shoot")
    private Boolean canShoot = true;
    @c(a = "cid")
    private String cid;
    @c(a = "duet_awemes")
    private List<? extends Aweme> duetAwemes;
    @c(a = "enter_from")
    private String enterFrom;
    @c(a = "shoot_way")
    private String shootWay;
    @c(a = "sticker_id")
    private String stickerId;
    @c(a = "task_id")
    private String taskId;

    static {
        Covode.recordClassIndex(50896);
    }

    public final Boolean getCanShoot() {
        return this.canShoot;
    }

    public final String getCid() {
        return this.cid;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    public final List<Aweme> getDuetAwemes() {
        return this.duetAwemes;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public final void setCanShoot(Boolean bool) {
        this.canShoot = bool;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setDuetAwemes(List<? extends Aweme> list) {
        this.duetAwemes = list;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTaskId(String str) {
        this.taskId = str;
    }
}
