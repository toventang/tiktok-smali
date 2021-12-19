package com.ss.android.ugc.aweme.discover.mob;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.j;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f81933a = new m();

    private m() {
    }

    static {
        Covode.recordClassIndex(50860);
    }

    public static final String a(int i2) {
        if (i2 < 0) {
            return null;
        }
        if (i2 == j.f121154b) {
            return "general";
        }
        if (i2 == j.f121156d) {
            return "video";
        }
        if (i2 == j.f121155c) {
            return "user";
        }
        if (i2 == j.f121157e) {
            return "music";
        }
        if (i2 == j.f121158f) {
            return "shop";
        }
        if (i2 == j.f121159g) {
            return "challenge";
        }
        if (i2 == j.f121160h) {
            return "live";
        }
        return null;
    }

    public static final String b(int i2) {
        if (i2 < 0) {
            return "";
        }
        if (i2 == j.f121154b) {
            return "general";
        }
        if (i2 == j.f121156d) {
            return "video";
        }
        if (i2 == j.f121155c) {
            return "user";
        }
        if (i2 == j.f121157e) {
            return "music";
        }
        if (i2 == j.f121158f) {
            return "shop";
        }
        if (i2 == j.f121159g) {
            return "tag";
        }
        if (i2 == j.f121160h) {
            return "live";
        }
        return "";
    }

    public static final String c(int i2) {
        if (i2 < 0) {
            return "";
        }
        if (i2 == j.f121154b) {
            return "general_search";
        }
        if (i2 == j.f121156d) {
            return "video";
        }
        if (i2 == j.f121155c) {
            return "user";
        }
        if (i2 == j.f121159g) {
            return "tag";
        }
        if (i2 == j.f121157e) {
            return "music";
        }
        if (i2 == j.f121158f) {
            return "shop";
        }
        if (i2 == j.f121160h) {
            return "live";
        }
        return "";
    }
}
