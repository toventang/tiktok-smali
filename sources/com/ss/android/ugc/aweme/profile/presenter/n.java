package com.ss.android.ugc.aweme.profile.presenter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public String f116590a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f116591b = "";

    /* renamed from: c  reason: collision with root package name */
    public int f116592c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f116593d;

    /* renamed from: e  reason: collision with root package name */
    public int f116594e = -1;

    /* renamed from: f  reason: collision with root package name */
    public String f116595f;

    /* renamed from: g  reason: collision with root package name */
    public String f116596g;

    /* renamed from: h  reason: collision with root package name */
    public Aweme f116597h;

    /* renamed from: i  reason: collision with root package name */
    public String f116598i;

    /* renamed from: j  reason: collision with root package name */
    public int f116599j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f116600k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Map<String, String> f116601l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f116602m;

    static {
        Covode.recordClassIndex(75322);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f116603a = new n();

        static {
            Covode.recordClassIndex(75323);
        }

        public final n a() {
            if (this.f116603a.f116592c != -1) {
                return this.f116603a;
            }
            throw new IllegalStateException("You must set an action.".toString());
        }

        public final a a(int i2) {
            this.f116603a.f116592c = i2;
            return this;
        }

        public final a b(int i2) {
            this.f116603a.f116593d = i2;
            return this;
        }

        public final a c(int i2) {
            this.f116603a.f116594e = i2;
            return this;
        }

        public final a d(int i2) {
            this.f116603a.f116600k = i2;
            return this;
        }

        public final a e(String str) {
            this.f116603a.f116598i = str;
            return this;
        }

        public final a a(Aweme aweme) {
            this.f116603a.f116597h = aweme;
            return this;
        }

        public final a b(String str) {
            n nVar = this.f116603a;
            if (str == null) {
                str = "";
            }
            nVar.f116591b = str;
            return this;
        }

        public final a c(String str) {
            this.f116603a.f116595f = str;
            return this;
        }

        public final a d(String str) {
            this.f116603a.f116596g = str;
            return this;
        }

        public final a a(String str) {
            n nVar = this.f116603a;
            if (str == null) {
                str = "";
            }
            nVar.f116590a = str;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f116603a.f116601l = map;
            return this;
        }

        public final a a(boolean z) {
            this.f116603a.f116602m = z;
            return this;
        }
    }
}
