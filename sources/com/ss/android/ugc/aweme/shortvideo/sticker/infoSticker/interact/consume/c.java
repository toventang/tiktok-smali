package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.t;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class c {
    static {
        Covode.recordClassIndex(85472);
    }

    public static final class a extends com.google.gson.b.a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85473);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85474);
        }

        b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c$c  reason: collision with other inner class name */
    public static final class C3399c extends com.google.gson.b.a<List<? extends NormalTrackTimeStamp>> {
        static {
            Covode.recordClassIndex(85475);
        }

        C3399c() {
        }
    }

    public static final boolean a(Context context) {
        l.d(context, "");
        return d.a(context, "test_data", 0).getBoolean("sp_interact_stickers_test", false);
    }

    public static final StickerAttrStruct b(InteractStickerStruct interactStickerStruct) {
        if (interactStickerStruct == null) {
            return null;
        }
        try {
            return (StickerAttrStruct) GsonHolder.c().b().a(interactStickerStruct.getAttr(), StickerAttrStruct.class);
        } catch (t unused) {
            return null;
        }
    }

    public static final String a(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAid();
        }
        Aweme forwardItem = aweme.getForwardItem();
        l.b(forwardItem, "");
        return forwardItem.getAid();
    }

    public static final User b(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        if (aweme.getAwemeType() != 13 || aweme.getForwardItem() == null) {
            return aweme.getAuthor();
        }
        Aweme forwardItem = aweme.getForwardItem();
        l.b(forwardItem, "");
        return forwardItem.getAuthor();
    }

    public static final String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, "webview")) {
            return "web_url";
        }
        return "open_url";
    }

    public static final List<NormalTrackTimeStamp> a(InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> list;
        String str;
        try {
            f b2 = GsonHolder.c().b();
            if (interactStickerStruct != null) {
                str = interactStickerStruct.getTrackList();
            } else {
                str = null;
            }
            list = (List) b2.a(str, new b().type);
        } catch (t e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("InteractStickerUtils.kt : e ".concat(String.valueOf(e2)));
            list = null;
        }
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            return null;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006e, code lost:
        if (r3.getEndTime() >= r1) goto L_0x0053;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp> b(long r7, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r9) {
        /*
        // Method dump skipped, instructions count: 119
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.c.b(long, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct):java.util.List");
    }

    public static final List<NormalTrackTimeStamp> a(long j2, InteractStickerStruct interactStickerStruct) {
        List list;
        long j3;
        boolean z;
        try {
            list = (List) GsonHolder.c().b().a(interactStickerStruct != null ? interactStickerStruct.getTrackList() : null, new a().type);
        } catch (t e2) {
            com.ss.android.ugc.aweme.framework.a.a.a("InteractStickerUtils.kt : e ".concat(String.valueOf(e2)));
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BaseTrackTimeStamp baseTrackTimeStamp = (BaseTrackTimeStamp) obj;
            if (baseTrackTimeStamp != null) {
                j3 = (long) baseTrackTimeStamp.getPts();
            } else {
                j3 = 0;
            }
            long j4 = j2 - j3;
            if (-160 <= j4 && 160 >= j4) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
