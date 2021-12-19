package com.ss.android.ugc.aweme.shortvideo.sticker.b;

import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.c;
import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import java.util.ArrayList;

public final class a implements v {

    /* renamed from: a  reason: collision with root package name */
    private final e f130229a;

    static {
        Covode.recordClassIndex(85424);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a() {
    }

    public a(e eVar) {
        l.d(eVar, "");
        this.f130229a = eVar;
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.v
    public final void a(int i2, int i3, Intent intent) {
        ArrayList parcelableArrayListExtra;
        l.d(intent, "");
        if (i3 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && !parcelableArrayListExtra.isEmpty() && !TextUtils.isEmpty(((MediaModel) parcelableArrayListExtra.get(0)).f109390b)) {
            c.f109414a.b();
            MediaModel mediaModel = (MediaModel) parcelableArrayListExtra.get(0);
            Effect effect = (Effect) intent.getParcelableExtra("key_custom_effect_sticker");
            String a2 = a(intent, "shoot_way");
            if (a2 == null) {
                a2 = "";
            }
            l.b(a2, "");
            String a3 = a(intent, "content_source");
            if (a3 == null) {
                a3 = "";
            }
            l.b(a3, "");
            String a4 = a(intent, "content_type");
            if (a4 == null) {
                a4 = "";
            }
            l.b(a4, "");
            String a5 = a(intent, "creation_id");
            if (a5 == null) {
                a5 = "";
            }
            l.b(a5, "");
            com.ss.android.ugc.aweme.shortvideo.r.a.a().a(this.f130229a, mediaModel, effect, new ShortVideoCommonParams(a2, a3, a4, a5));
        }
    }
}
