package com.bytedance.sdk.b.b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public List<C1050a> f43505a;

    static {
        Covode.recordClassIndex(26638);
    }

    /* renamed from: com.bytedance.sdk.b.b.a$a  reason: collision with other inner class name */
    public static class C1050a implements Serializable {
        private String content;
        private String iconUrl;
        private String planId;
        private String title;
        private String url;

        static {
            Covode.recordClassIndex(26639);
        }

        public final String getContent() {
            return this.content;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getPlanId() {
            return this.planId;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getUrl() {
            return this.url;
        }

        public final String toString() {
            return "DataPlanEntity{planId='" + this.planId + '\'' + ", title='" + this.title + '\'' + ", content='" + this.content + '\'' + ", iconUrl='" + this.iconUrl + '\'' + ", url='" + this.url + '\'' + '}';
        }

        public final void setContent(String str) {
            this.content = str;
        }

        public final void setIconUrl(String str) {
            this.iconUrl = str;
        }

        public final void setPlanId(String str) {
            this.planId = str;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final void setUrl(String str) {
            this.url = str;
        }
    }
}
