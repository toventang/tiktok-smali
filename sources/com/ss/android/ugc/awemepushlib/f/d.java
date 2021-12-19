package com.ss.android.ugc.awemepushlib.f;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f145396a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(95071);
    }

    public static int a() {
        return (b.a().a(true, "push_sound_type", 0) + 2) / 3;
    }

    public static boolean b() {
        int a2 = b.a().a(true, "push_sound_type", 0);
        if (a2 == 0 || a2 == 1 || a2 == 4 || a2 == 7) {
            return false;
        }
        return true;
    }

    public static String[] c() {
        int a2 = b.a().a(true, "push_sound_type", 0);
        if (a2 == 0) {
            return new String[0];
        }
        int i2 = a2 % 3;
        if (i2 == 2) {
            return new String[]{"comment_push", "follow_push", "digg_push", "im_push"};
        }
        if (i2 == 0) {
            return new String[]{"recommend_video_push", "follow_new_video_push", "live_push"};
        }
        return new String[0];
    }

    public static Uri a(Context context, int i2) {
        l.d(context, "");
        String str = "android.resource://" + context.getPackageName() + "/";
        Uri uri = null;
        if (i2 != 2) {
            return null;
        }
        try {
            uri = Uri.parse(str + R.raw.tiktok_new_customezed_tone);
            return uri;
        } catch (Exception e2) {
            e2.printStackTrace();
            return uri;
        }
    }
}
