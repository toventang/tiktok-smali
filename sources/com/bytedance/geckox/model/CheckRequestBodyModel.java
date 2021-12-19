package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckRequestBodyModel {
    @c(a = "common")
    private Common common;
    @c(a = "custom")
    private Map<String, Map<String, Object>> custom;
    @c(a = "deployment")
    private Map<String, List<ChannelInfo>> deployment;
    @c(a = "deployments")
    private Map<String, Object> deployments;
    @c(a = "local")
    private Map<String, Map<String, LocalChannel>> local;
    @c(a = "req_meta")
    private RequestMeta requestMeta;

    public static class Channels {
        @c(a = "channels")
        public List<Channel> channels = new ArrayList();

        static {
            Covode.recordClassIndex(17361);
        }
    }

    public static class Group {
        @c(a = "group_name")
        public String groupName;
        @c(a = "target_channels")
        public List<TargetChannel> targetChannels;

        static {
            Covode.recordClassIndex(17362);
        }
    }

    public static class LocalChannel {
        @c(a = "l_v")
        public Long localVersion;

        static {
            Covode.recordClassIndex(17364);
        }
    }

    public static class ProcessorParams {
        @c(a = "domain")
        public String domain;

        static {
            Covode.recordClassIndex(17365);
        }
    }

    static {
        Covode.recordClassIndex(17358);
    }

    public enum GroupType {
        NORMAL("normal"),
        HIGHPRIORITY("high_priority");
        
        private String value;

        public final String getValue() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(17363);
        }

        private GroupType(String str) {
            this.value = str;
        }
    }

    public static class RequestMeta {
        @c(a = "combine_level")
        private String combineLevel;
        @c(a = "req_type")
        private int reqType;
        @c(a = "sync_task_id")
        private int syncTaskId;

        static {
            Covode.recordClassIndex(17366);
        }

        public String getCombineLevel() {
            return this.combineLevel;
        }

        public int getReqType() {
            return this.reqType;
        }

        public int getSyncTaskId() {
            return this.syncTaskId;
        }

        public void setCombineLevel(String str) {
            this.combineLevel = str;
        }

        public void setReqType(int i2) {
            this.reqType = i2;
        }

        public void setSyncTaskId(int i2) {
            this.syncTaskId = i2;
        }

        public RequestMeta(int i2) {
            this.reqType = i2;
        }
    }

    public static class TargetChannel {
        @c(a = "c")
        public String channelName;
        @c(a = "from")
        public List<String> from;
        @c(a = "t_v")
        public Long targetVersion;

        static {
            Covode.recordClassIndex(17367);
        }

        public TargetChannel() {
        }

        public TargetChannel(String str) {
            this.channelName = str;
        }

        public TargetChannel(String str, Long l2) {
            this.channelName = str;
            this.targetVersion = l2;
        }
    }

    public void setCommon(Common common2) {
        this.common = common2;
    }

    public void setCustom(Map<String, Map<String, Object>> map) {
        this.custom = map;
    }

    public void setDeployments(Map<String, Object> map) {
        this.deployments = map;
    }

    public void setLocal(Map<String, Map<String, LocalChannel>> map) {
        this.local = map;
    }

    public void setRequestMeta(RequestMeta requestMeta2) {
        this.requestMeta = requestMeta2;
    }

    public static class Channel {
        @c(a = "c")
        String channelName;
        @c(a = "l_v")
        public String localVersion;

        static {
            Covode.recordClassIndex(17359);
        }

        public Channel(String str) {
            this.channelName = str;
        }
    }

    public static class ChannelInfo {
        @c(a = "channel")
        private String channel;
        @c(a = "local_version")
        private long localVersion;

        static {
            Covode.recordClassIndex(17360);
        }

        public ChannelInfo(String str, long j2) {
            this.channel = str;
            this.localVersion = j2;
        }
    }

    public void putChannelInfo(String str, List<ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new HashMap();
        }
        this.deployment.put(str, list);
    }
}
