package com.ss.android.ugc.aweme.choosemusic.c;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import h.f.b.l;

public final class ai {
    static {
        Covode.recordClassIndex(43437);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Fragment a(Intent intent, int i2) {
        String str;
        boolean z;
        if (intent == null) {
            return null;
        }
        String a2 = a(intent, "cid");
        String a3 = a(intent, StringSet.name);
        String a4 = a(intent, "is_hot");
        boolean booleanExtra = intent.getBooleanExtra("music_category_is_hot", false);
        if (!TextUtils.isEmpty(a4)) {
            try {
                booleanExtra = Boolean.valueOf(a4).booleanValue();
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(a2)) {
            str = a(intent, "music_class_id");
        } else {
            str = a2;
        }
        if (TextUtils.isEmpty(a3)) {
            a3 = a(intent, "music_class_name");
        }
        int intExtra = intent.getIntExtra("music_class_level", 0);
        String a5 = a(intent, "music_class_enter_method");
        int intExtra2 = intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        String a6 = a(intent, "musicType");
        if (!TextUtils.isEmpty(a6)) {
            try {
                intExtra2 = Integer.valueOf(a6).intValue();
            } catch (Exception unused2) {
                intExtra2 = 2;
            }
        }
        if (intent.hasExtra("enter_method")) {
            a5 = a(intent, "enter_method");
        } else if (!TextUtils.isEmpty(a2)) {
            a5 = "click_banner";
        }
        if (intent.hasExtra("previous_page")) {
            b.f70718a = a(intent, "previous_page");
        }
        String a7 = a(intent, "track_id");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (intExtra == 1) {
            l.d(str, "");
            l.d(a3, "");
            l.d("change_music_page_detail", "");
            l.d(a5, "");
            am amVar = new am();
            Bundle bundle = new Bundle();
            bundle.putString("music_class_id", str);
            bundle.putString("music_class_name", a3);
            bundle.putString("music_class_enter_from", "change_music_page_detail");
            bundle.putBoolean("music_class_is_hot", booleanExtra);
            bundle.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", intExtra2);
            bundle.putString("music_class_enter_method", a5);
            bundle.putInt("music_class_level", intExtra);
            bundle.putInt("sound_page_scene", i2);
            amVar.setArguments(bundle);
            return amVar;
        }
        if (TextUtils.isEmpty(intent.getScheme()) || intent.getBooleanExtra("is_from_self", false)) {
            z = false;
        } else {
            z = true;
        }
        return af.a(str, a3, "change_music_page_detail", intExtra2, booleanExtra, a5, intExtra, null, i2, a7, z);
    }
}
