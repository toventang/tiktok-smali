package com.ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.core.h.v;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.draft.model.c;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.setting.bx;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity;
import com.ss.android.ugc.aweme.tools.draft.a.a;
import com.ss.android.ugc.aweme.utils.d;
import com.ss.android.ugc.tools.f.b;
import com.ss.android.ugc.tools.utils.k;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class i extends a<c> {

    /* renamed from: a  reason: collision with root package name */
    TextView f139790a;

    /* renamed from: b  reason: collision with root package name */
    TextView f139791b;

    /* renamed from: c  reason: collision with root package name */
    boolean f139792c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f139793d;

    /* renamed from: e  reason: collision with root package name */
    Context f139794e;

    static {
        Covode.recordClassIndex(91373);
    }

    i(boolean z, View view) {
        super(view);
        this.f139792c = z;
        this.f139794e = view.getContext();
        this.f139790a = (TextView) v.c(view, (int) R.id.f37);
        this.f139791b = (TextView) v.c(view, (int) R.id.ev_);
    }

    static /* synthetic */ z a(e eVar, c cVar, Boolean bool, String str) {
        String musicId;
        if (!bool.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(R.string.dcb).a();
            } else {
                new com.ss.android.ugc.aweme.tux.a.i.a(eVar).a(str).a();
            }
            return null;
        } else if (c.C1870c.f80046a.a()) {
            q.d("app is running background");
            return null;
        } else {
            com.ss.android.ugc.aweme.shortvideo.c clone = cVar.f83185f.clone();
            b a2 = new b().a("shoot_way", "draft_again").a("shoot_entrance", "draft_again").a("enter_method", "draft_again");
            if (clone == null) {
                musicId = "";
            } else {
                musicId = clone.getMusicId();
            }
            d.a("shoot", a2.a("music_id", musicId).a("is_ui_shoot", true).f149193a);
            if (clone != null) {
                clone.setMusicPriority(99);
                cr.a().a(clone);
                String str2 = cVar.f83187h;
                int i2 = cVar.n;
                com.ss.android.ugc.aweme.df.e.a("toVideoRecord() called with: path = [" + str2 + "], context = [], musicModel = [" + clone + "], start = [" + i2 + "]");
                try {
                    new JSONObject().put("route", "1");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                ah.f109483a = "draft_page";
                if (bx.a()) {
                    String musicId2 = clone.getMusicId();
                    String str3 = cVar.O;
                    if (l.f115658a.e().c()) {
                        g.a().A().a();
                    }
                    a(eVar, musicId2, str2, i2, str3);
                } else {
                    a(eVar, clone.getMusicId(), str2, i2, "");
                }
            }
            return null;
        }
    }

    private static void a(Context context, String str, String str2, int i2, String str3) {
        String uuid = UUID.randomUUID().toString();
        ArrayList<String> a2 = com.ss.android.ugc.aweme.sticker.p.g.a(str3);
        b a3 = new b().a("creation_id", uuid).a("shoot_way", "draft_again").a("shoot_entrance", "draft_again").a("enter_method", "draft_again").a("music_id", str).a("is_ui_shoot", false).a("group_id", dv.a());
        if (!k.a(a2) && !TextUtils.isEmpty(a2.get(0))) {
            a3.a("prop_id", a2.get(0));
        }
        d.a("shoot", a3.f149193a);
        com.ss.android.ugc.aweme.df.e.a("toVideoActivity() called with: context = [ ], path = [" + str2 + "], musicStart = [" + i2 + "]");
        Intent intent = new Intent();
        intent.putExtra("path", str2);
        intent.putExtra("music_start", i2);
        intent.putExtra("record_from", 1);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", "draft_again");
        intent.putExtra("creation_id", uuid);
        intent.putExtra("extra_sticker_from", "draft");
        intent.putStringArrayListExtra("reuse_sticker_ids", com.ss.android.ugc.aweme.sticker.p.g.a(str3));
        cr.a().g();
        intent.setClass(context, VideoRecordPermissionActivity.class);
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
    }
}
