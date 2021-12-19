package com.ss.android.ugc.aweme.choosemusic.c;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.view.q;
import com.ss.android.ugc.aweme.keyword.b;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;

public final class v extends a {
    public static final a w = new a((byte) 0);
    private HashMap y;

    static {
        Covode.recordClassIndex(43479);
    }

    public static final v a(int i2, String str, MusicModel musicModel, d.a aVar, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i3) {
        return a.a(i2, str, musicModel, aVar, z, z2, bundle, str2, str3, i3);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43480);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static v a(int i2, String str, MusicModel musicModel, d.a aVar, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i3) {
            v vVar = new v();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            bundle2.putSerializable("challenge", str);
            bundle2.putSerializable("music_model", musicModel);
            bundle2.putSerializable("music_style", aVar);
            bundle2.putBoolean("music_allow_clear", z);
            bundle2.putString("creation_id", str3);
            bundle2.putString("shoot_way", str2);
            bundle2.putBoolean("music_is_photomv", z2);
            bundle2.putInt("sound_page_scene", i3);
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            vVar.setArguments(bundle2);
            return vVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.choosemusic.c.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.y;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.c.a
    public final void d() {
        this.r.b().setValue(this.s.a().f105233a);
        this.r.a().setValue(2);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.choosemusic.c.a
    public final void a(Editable editable) {
        String valueOf = String.valueOf(editable);
        this.s.a(new b(valueOf, null, 2));
        if (!TextUtils.equals(this.t, valueOf)) {
            this.t = valueOf;
            if (TextUtils.isEmpty(valueOf)) {
                q qVar = this.f70406e;
                qVar.f70817h.setVisibility(0);
                qVar.f70814e.setVisibility(4);
                qVar.f70816g.setVisibility(8);
                if (qVar.r != null) {
                    qVar.r.setVisibility(0);
                }
                if (qVar.s != null) {
                    qVar.s.setVisibility(8);
                }
                c();
            } else if (this.r.f() != 0) {
                q qVar2 = this.f70406e;
                qVar2.f70817h.setVisibility(4);
                qVar2.f70814e.setVisibility(0);
                qVar2.f70816g.setVisibility(8);
                if (qVar2.r != null) {
                    qVar2.r.setVisibility(0);
                }
                if (qVar2.s != null) {
                    qVar2.s.setVisibility(8);
                }
                d();
            }
        }
    }
}
