package com.ss.android.ugc.aweme.miniapp.media;

import android.app.Activity;
import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.miniapp_api.model.a;
import com.ss.android.ugc.aweme.profile.f.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    p f109660a;

    /* renamed from: b  reason: collision with root package name */
    private Activity f109661b;

    static {
        Covode.recordClassIndex(70187);
    }

    public static int a(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public final List<a.C2808a> a(Intent intent) {
        ArrayList arrayList = new ArrayList();
        List<Uri> parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_result_selection");
        if (parcelableArrayListExtra == null) {
            parcelableArrayListExtra = new LinkedList();
        }
        for (Uri uri : parcelableArrayListExtra) {
            arrayList.add(new a.C2808a(c.d.a.a(this.f109661b, uri), "", 0, 0, 0, 0, ""));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083 A[SYNTHETIC, Splitter:B:30:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC, Splitter:B:41:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.graphics.Bitmap r7) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.miniapp.media.b.a(android.graphics.Bitmap):java.lang.String");
    }

    public b(Activity activity, Fragment fragment) {
        this.f109661b = activity;
        this.f109660a = new p(activity, fragment, null, null);
    }
}
