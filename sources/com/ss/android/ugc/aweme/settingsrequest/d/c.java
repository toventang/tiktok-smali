package com.ss.android.ugc.aweme.settingsrequest.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

public final class c extends BaseResponse {
    @com.google.gson.a.c(a = "show_time")

    /* renamed from: a  reason: collision with root package name */
    public int f123190a;
    @com.google.gson.a.c(a = "count")

    /* renamed from: b  reason: collision with root package name */
    public int f123191b;
    @com.google.gson.a.c(a = "popupBatch")

    /* renamed from: c  reason: collision with root package name */
    public int f123192c;
    @com.google.gson.a.c(a = "text")

    /* renamed from: d  reason: collision with root package name */
    public C3190c f123193d;
    @com.google.gson.a.c(a = "id")

    /* renamed from: e  reason: collision with root package name */
    public String f123194e;
    @com.google.gson.a.c(a = "show_interval")

    /* renamed from: f  reason: collision with root package name */
    public int f123195f;

    public static class a {
        @com.google.gson.a.c(a = "action_type")

        /* renamed from: a  reason: collision with root package name */
        public int f123196a;
        @com.google.gson.a.c(a = "target")

        /* renamed from: b  reason: collision with root package name */
        public String f123197b;

        static {
            Covode.recordClassIndex(80915);
        }
    }

    public static class b {
        @com.google.gson.a.c(a = "text")

        /* renamed from: a  reason: collision with root package name */
        public String f123198a;
        @com.google.gson.a.c(a = "style")

        /* renamed from: b  reason: collision with root package name */
        public d f123199b;
        @com.google.gson.a.c(a = "action")

        /* renamed from: c  reason: collision with root package name */
        public a f123200c;

        static {
            Covode.recordClassIndex(80916);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.d.c$c  reason: collision with other inner class name */
    public static class C3190c {
        @com.google.gson.a.c(a = "title")

        /* renamed from: a  reason: collision with root package name */
        public String f123201a;
        @com.google.gson.a.c(a = "context")

        /* renamed from: b  reason: collision with root package name */
        public String f123202b;
        @com.google.gson.a.c(a = "buttons")

        /* renamed from: c  reason: collision with root package name */
        public List<b> f123203c;
        @com.google.gson.a.c(a = "labels")

        /* renamed from: d  reason: collision with root package name */
        public List<b> f123204d;
        @com.google.gson.a.c(a = "image")

        /* renamed from: e  reason: collision with root package name */
        public e f123205e;

        static {
            Covode.recordClassIndex(80917);
        }
    }

    public static class e {
        @com.google.gson.a.c(a = "uri")

        /* renamed from: a  reason: collision with root package name */
        public String f123207a;
        @com.google.gson.a.c(a = "url_list")

        /* renamed from: b  reason: collision with root package name */
        public String[] f123208b;
        @com.google.gson.a.c(a = "width")

        /* renamed from: c  reason: collision with root package name */
        public int f123209c;
        @com.google.gson.a.c(a = "height")

        /* renamed from: d  reason: collision with root package name */
        public int f123210d;
        @com.google.gson.a.c(a = "url_key")

        /* renamed from: e  reason: collision with root package name */
        public String f123211e;

        static {
            Covode.recordClassIndex(80919);
        }
    }

    static {
        Covode.recordClassIndex(80914);
    }

    public final String a() {
        try {
            return this.f123193d.f123201a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String b() {
        try {
            return this.f123193d.f123202b;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String c() {
        try {
            return this.f123193d.f123203c.get(0).f123198a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String d() {
        try {
            return this.f123193d.f123203c.get(0).f123200c.f123197b;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String e() {
        try {
            return this.f123193d.f123203c.get(1).f123198a;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String f() {
        try {
            return this.f123193d.f123203c.get(1).f123200c.f123197b;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public enum d {
        STYLE_ACTION(1),
        STYLE_NORMAL(2),
        STYLE_GREY(3);
        
        private int value;

        static {
            Covode.recordClassIndex(80918);
        }

        private d(int i2) {
            this.value = i2;
        }
    }
}
