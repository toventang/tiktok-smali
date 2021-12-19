package com.bytedance.geckox.policy.v4.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;

public class V4DeploymentModel {
    @c(a = "group_name")
    private List<a> groupName;
    @c(a = "target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    static {
        Covode.recordClassIndex(17418);
    }

    public static class a {
        @c(a = StringSet.name)

        /* renamed from: a  reason: collision with root package name */
        public String f30025a;
        @c(a = "from")

        /* renamed from: b  reason: collision with root package name */
        public String f30026b;

        static {
            Covode.recordClassIndex(17419);
        }

        public a() {
        }

        public a(String str) {
            this.f30025a = str;
        }
    }

    public List<a> getGroupName() {
        return this.groupName;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public V4DeploymentModel() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public V4DeploymentModel(List<a> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
