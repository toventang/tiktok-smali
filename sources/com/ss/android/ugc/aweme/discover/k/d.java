package com.ss.android.ugc.aweme.discover.k;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final b f81404a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final d f81405b = new d();

    public static final class a implements Serializable {
        @c(a = "schema")
        private String schema = "";
        @c(a = "search_type")
        private String searchType = "";

        static {
            Covode.recordClassIndex(50593);
        }

        public final String getSchema() {
            return this.schema;
        }

        public final String getSearchType() {
            return this.searchType;
        }

        public final void setSchema(String str) {
            l.d(str, "");
            this.schema = str;
        }

        public final void setSearchType(String str) {
            l.d(str, "");
            this.searchType = str;
        }
    }

    public static final class b implements Serializable {
        @c(a = "feedback_list")
        private List<a> feedbackList = new ArrayList();

        static {
            Covode.recordClassIndex(50594);
        }

        public final List<a> getFeedbackList() {
            return this.feedbackList;
        }

        public final void setFeedbackList(List<a> list) {
            l.d(list, "");
            this.feedbackList = list;
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(50592);
    }

    private static b a() {
        return (b) SettingsManager.a().a("search_user_feedback", b.class, f81404a);
    }

    public static final a a(String str) {
        List<a> feedbackList;
        l.d(str, "");
        b a2 = a();
        if (a2 == null || (feedbackList = a2.getFeedbackList()) == null) {
            return null;
        }
        for (T t : feedbackList) {
            if (l.a((Object) t.getSearchType(), (Object) str)) {
                return t;
            }
        }
        return null;
    }
}
