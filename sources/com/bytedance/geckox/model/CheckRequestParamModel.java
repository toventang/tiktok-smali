package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.a.c;
import java.util.List;

public class CheckRequestParamModel {
    @c(a = "group_name")
    private String group;
    @c(a = "target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    static {
        Covode.recordClassIndex(17368);
    }

    public String getGroup() {
        return this.group;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public CheckRequestParamModel(String str) {
        this.group = str;
    }

    public CheckRequestParamModel(String str, List<CheckRequestBodyModel.TargetChannel> list) {
        this.group = str;
        this.targetChannels = list;
    }
}
