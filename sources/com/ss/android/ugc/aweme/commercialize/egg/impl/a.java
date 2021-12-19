package com.ss.android.ugc.aweme.commercialize.egg.impl;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.EditHint;
import com.ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.commercialize.egg.d.a f73966a;

    /* renamed from: b  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.commercialize.egg.d.a f73967b;

    /* renamed from: c  reason: collision with root package name */
    public static List<com.ss.android.ugc.aweme.commercialize.egg.d.a> f73968c;

    /* renamed from: d  reason: collision with root package name */
    public static List<? extends EditHint> f73969d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f73970e = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(45558);
    }

    public static boolean a(ItemCommentEggData itemCommentEggData) {
        if (itemCommentEggData == null) {
            return false;
        }
        String[] strArr = {itemCommentEggData.getEggId(), itemCommentEggData.getFileType(), itemCommentEggData.getMaterialUrl(), itemCommentEggData.getRegex()};
        int i2 = 0;
        while (!TextUtils.isEmpty(strArr[i2])) {
            i2++;
            if (i2 >= 4) {
                return true;
            }
        }
        return false;
    }
}
