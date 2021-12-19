package com.ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.a;
import com.google.gson.a.c;
import java.util.List;

public class UgActivityTasks {
    @c(a = "finish_push")
    private String finishPush;
    @c(a = "frame")
    private List<List<Integer>> frame;
    private Boolean reported = false;
    @c(a = "show")
    private Boolean show;
    private Boolean succeed = false;
    @c(a = "task_id")
    private String taskId;
    @c(a = "task_type")
    private Integer taskType;
    @c(a = "time")
    private Integer time;
    @c(a = "url_list")
    private List<String> urlList;

    static {
        Covode.recordClassIndex(63087);
    }

    public List<List<Integer>> getFrame() {
        return this.frame;
    }

    public Boolean getReported() {
        return this.reported;
    }

    public Boolean getShow() {
        return this.show;
    }

    public Boolean getSucceed() {
        return this.succeed;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public String getFinishPush() {
        String str = this.finishPush;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public String getTaskId() {
        String str = this.taskId;
        if (str != null) {
            return str;
        }
        throw new a();
    }

    public Integer getTaskType() {
        Integer num = this.taskType;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public Integer getTime() {
        Integer num = this.time;
        if (num != null) {
            return num;
        }
        throw new a();
    }

    public UgActivityTasks clone() {
        UgActivityTasks ugActivityTasks = new UgActivityTasks();
        ugActivityTasks.taskId = this.taskId;
        ugActivityTasks.taskType = this.taskType;
        ugActivityTasks.time = this.time;
        ugActivityTasks.finishPush = this.finishPush;
        return ugActivityTasks;
    }

    public void setFrame(List<List<Integer>> list) {
        this.frame = list;
    }

    public void setReported(Boolean bool) {
        this.reported = bool;
    }

    public void setShow(Boolean bool) {
        this.show = bool;
    }

    public void setSucceed(Boolean bool) {
        this.succeed = bool;
    }

    public void setTime(Integer num) {
        this.time = num;
    }

    public UgActivityTasks clone(Integer num) {
        UgActivityTasks clone = clone();
        if (num != null) {
            clone.time = num;
        }
        return clone;
    }
}
