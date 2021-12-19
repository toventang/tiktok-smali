package com.ss.android.ugc.aweme.servicimpl;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.o;
import com.ss.android.ugc.aweme.port.in.bl;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.a;
import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.c.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.m.p;
import java.util.List;
import org.json.JSONObject;

public final class af implements bl {
    static {
        Covode.recordClassIndex(79909);
    }

    @Override // com.ss.android.ugc.aweme.port.in.bl
    public final Dialog a(Effect effect, DialogInterface.OnDismissListener onDismissListener, Handler handler, Activity activity) {
        l.d(effect, "");
        l.d(onDismissListener, "");
        l.d(handler, "");
        l.d(activity, "");
        if (effect == null || !c.f135964d) {
            return null;
        }
        String a2 = o.a(i.f115645a, com.ss.android.ugc.aweme.port.in.l.f115658a.s().a()).a("upload_pic_sticker_show", "");
        if (!TextUtils.isEmpty(a2)) {
            l.b(a2, "");
            if (p.a((CharSequence) a2, (CharSequence) effect.getEffectId(), false)) {
                return null;
            }
        }
        a aVar = new a();
        List<String> list = c.f135961a;
        l.d(list, "");
        aVar.f135969d = list;
        l.d(effect, "");
        try {
            JSONObject jSONObject = new JSONObject(effect.getExtra());
            aVar.f135968c = jSONObject.optString("pixaloop_text");
            aVar.f135966a = jSONObject.optString("pixaloop_picture_cover");
            aVar.f135967b = jSONObject.optString("pixaloop_video_cover");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b bVar = new b(activity, effect, aVar);
        l.d(handler, "");
        bVar.f135972b = handler;
        bVar.setOnDismissListener(onDismissListener);
        return bVar;
    }
}
