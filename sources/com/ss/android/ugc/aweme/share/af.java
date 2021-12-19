package com.ss.android.ugc.aweme.share;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class af {

    /* renamed from: i  reason: collision with root package name */
    public static final b f123329i = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f123330a;

    /* renamed from: b  reason: collision with root package name */
    public String f123331b;

    /* renamed from: c  reason: collision with root package name */
    public int f123332c;

    /* renamed from: d  reason: collision with root package name */
    public int f123333d;

    /* renamed from: e  reason: collision with root package name */
    public String f123334e;

    /* renamed from: f  reason: collision with root package name */
    public String f123335f;

    /* renamed from: g  reason: collision with root package name */
    public String f123336g;

    /* renamed from: h  reason: collision with root package name */
    public String f123337h;

    static {
        Covode.recordClassIndex(81004);
    }

    public static final class b {
        static {
            Covode.recordClassIndex(81006);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    private af() {
        this.f123330a = "";
        this.f123331b = "";
        this.f123334e = "";
        this.f123335f = "";
        this.f123336g = "";
        this.f123337h = "";
    }

    public /* synthetic */ af(byte b2) {
        this();
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final af f123338a = new af((byte) 0);

        static {
            Covode.recordClassIndex(81005);
        }

        public final a a(String str) {
            if (str != null) {
                this.f123338a.f123330a = str;
            }
            return this;
        }

        public final a b(String str) {
            if (str != null) {
                this.f123338a.f123331b = str;
            }
            return this;
        }
    }

    public final Bundle a(Bundle bundle) {
        l.d(bundle, "");
        bundle.putString("tab_name", this.f123330a);
        bundle.putString("impr_id", this.f123331b);
        bundle.putInt("screen_orientation", this.f123332c);
        bundle.putInt("video_share_page_type", this.f123333d);
        String str = this.f123334e;
        if (!(str == null || str.length() == 0)) {
            bundle.putString("search_id", this.f123334e);
        }
        String str2 = this.f123335f;
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("search_result_id", this.f123335f);
        }
        String str3 = this.f123336g;
        if (!(str3 == null || str3.length() == 0)) {
            bundle.putString("tag_id", this.f123336g);
        }
        String str4 = this.f123337h;
        if (!(str4 == null || str4.length() == 0)) {
            bundle.putString("extra_parent_tag_id", this.f123337h);
        }
        return bundle;
    }
}
