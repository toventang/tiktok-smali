package com.ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.g;
import java.io.Serializable;

public final class o implements Serializable {
    public static final a Companion = new a((byte) 0);
    @c(a = "aweme_id")
    private final String awemeId;
    @c(a = "creative_id")
    private final String creativeId;
    @c(a = "item_type")
    private final int itemType;
    @c(a = "repack_aweme")
    private final Aweme repackAweme;

    static {
        Covode.recordClassIndex(46180);
    }

    public o() {
        this(null, 0, null, null, 15, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(46181);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final int getItemType() {
        return this.itemType;
    }

    public final Aweme getRepackAweme() {
        return this.repackAweme;
    }

    public o(String str, int i2, String str2, Aweme aweme) {
        this.awemeId = str;
        this.itemType = i2;
        this.creativeId = str2;
        this.repackAweme = aweme;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i2, String str2, Aweme aweme, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str2, (i3 & 8) != 0 ? null : aweme);
    }
}
