package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.x.b.g;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.Set;

public class af implements Serializable {
    @c(a = "icon_click")
    private a iconClick;
    @c(a = "static_resource")
    private Set<String> staticResource;
    @c(a = "icon_view_tracking")
    private Set<String> viewTracking;

    static {
        Covode.recordClassIndex(46151);
    }

    public static class a implements Serializable {
        @c(a = "click_through")
        private String clickThrough;
        @c(a = "click_tracking")
        private Set<String> clickTracking;

        static {
            Covode.recordClassIndex(46152);
        }

        public String getClickThrough() {
            return this.clickThrough;
        }

        public Set<String> getClickTracking() {
            return this.clickTracking;
        }

        public g toVideoClick() {
            g gVar = new g();
            gVar.clickThrough = this.clickThrough;
            gVar.clickTracking = this.clickTracking;
            return gVar;
        }

        public void setClickThrough(String str) {
            this.clickThrough = str;
        }

        public void setClickTracking(Set<String> set) {
            this.clickTracking = set;
        }
    }

    public a getIconClick() {
        return this.iconClick;
    }

    public Set<String> getStaticResource() {
        return this.staticResource;
    }

    public Set<String> getViewTracking() {
        return this.viewTracking;
    }

    public void setIconClick(a aVar) {
        this.iconClick = aVar;
    }

    public void setStaticResource(Set<String> set) {
        this.staticResource = set;
    }

    public void setViewTracking(Set<String> set) {
        this.viewTracking = set;
    }

    public com.bytedance.x.b.c toIcon(String str) {
        com.bytedance.x.b.c cVar = new com.bytedance.x.b.c();
        cVar.program = str;
        cVar.staticResource = this.staticResource;
        cVar.viewTracking = this.viewTracking;
        if (this.iconClick != null) {
            cVar.clickList = new LinkedList();
            cVar.clickList.add(this.iconClick.toVideoClick());
        }
        return cVar;
    }
}
