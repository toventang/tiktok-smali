package com.ss.android.ugc.aweme.discover.hitrank;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f81199a;

    /* renamed from: b  reason: collision with root package name */
    public static String f81200b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f81201c = "";

    /* renamed from: d  reason: collision with root package name */
    public static final b f81202d = new b();

    /* renamed from: e  reason: collision with root package name */
    private static boolean f81203e;

    private b() {
    }

    static {
        Covode.recordClassIndex(50471);
    }

    public static void a(BaseShortVideoContext baseShortVideoContext) {
        l.d(baseShortVideoContext, "");
        List<AVTextExtraStruct> list = baseShortVideoContext.structList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AVTextExtraStruct aVTextExtraStruct : list) {
                l.b(aVTextExtraStruct, "");
                if (aVTextExtraStruct.getType() == 1) {
                    String hashTagName = aVTextExtraStruct.getHashTagName();
                    l.b(hashTagName, "");
                    arrayList.add(hashTagName);
                }
            }
            if (f81203e && arrayList.size() > 0 && !TextUtils.isEmpty(f81200b)) {
                d.a(f81200b, f81201c, 9, arrayList);
            }
        }
        f81203e = false;
    }
}
