package com.bytedance.android.live.broadcast.preview;

import android.net.Uri;
import androidx.fragment.app.d;
import com.bytedance.android.live.b.m;
import com.bytedance.android.live.broadcast.c;
import com.bytedance.android.live.broadcast.model.f;
import com.bytedance.android.live.broadcast.model.i;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.broadcast.z;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePermissionApplyLynx;
import com.bytedance.android.livesdkapi.depend.model.live.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;
import java.util.Map;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f8292a = new u();

    private u() {
    }

    static {
        Covode.recordClassIndex(4220);
    }

    public static d a(DataChannel dataChannel, String str) {
        l.d(dataChannel, "");
        l.d(str, "");
        return a(LivePermissionApplyLynx.INSTANCE.getValue(), dataChannel, str);
    }

    public static void b(DataChannel dataChannel, String str) {
        String str2;
        i.a aVar;
        i.a aVar2;
        l.d(dataChannel, "");
        l.d(str, "");
        Map map = (Map) dataChannel.b(z.class);
        int i2 = 0;
        if (!(map == null || (aVar2 = (i.a) map.get(str)) == null || aVar2.f7915a < aVar2.f7917c)) {
            i2 = 1;
        }
        b a2 = b.a.a("livesdk_anchor_live_access_apply_show").a(dataChannel).a("apply_threshold", i2);
        com.bytedance.android.livesdkapi.depend.model.live.i iVar = (com.bytedance.android.livesdkapi.depend.model.live.i) dataChannel.b(x.class);
        Integer num = null;
        if (iVar != null) {
            str2 = j.a(iVar);
        } else {
            str2 = null;
        }
        b a3 = a2.a("live_type", str2);
        Map map2 = (Map) dataChannel.b(z.class);
        if (!(map2 == null || (aVar = (i.a) map2.get(str)) == null)) {
            num = Integer.valueOf(aVar.f7915a);
        }
        a3.a("fans_cnt ", String.valueOf(num)).b();
    }

    private static int a(Uri uri, String str, int i2) {
        String queryParameter;
        if (uri == null || (queryParameter = uri.getQueryParameter(str)) == null) {
            return i2;
        }
        return Integer.parseInt(queryParameter);
    }

    private static d a(String str, DataChannel dataChannel, String str2) {
        int i2;
        boolean z;
        String str3;
        Uri.Builder a2 = a(str2, str, (Map) dataChannel.b(z.class), (f) dataChannel.b(c.class));
        Uri parse = Uri.parse(a2.toString());
        m a3 = ((com.bytedance.android.live.b.f) a.a(com.bytedance.android.live.b.f.class)).createLynxDialogBuilder(a2.toString(), "").a(8, 8);
        if (str2.equals("live")) {
            i2 = 438;
        } else {
            i2 = 482;
        }
        boolean z2 = false;
        m e2 = a3.b(a(parse, "height", i2)).a(a(parse, "width", (int) y.e(y.c()))).c(a(parse, "margin", 0)).e(80);
        if (a(parse, "show_close", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        m e3 = e2.d(z).b(true).e("0.5");
        if (parse == null || (str3 = parse.toString()) == null) {
            str3 = "";
        }
        l.b(str3, "");
        m c2 = e3.c(str3);
        if (a(parse, "landscape_custom_height", 0) == 1) {
            z2 = true;
        }
        return c2.a(z2).a();
    }

    private static Uri.Builder a(String str, String str2, Map<String, ? extends i.a> map, f fVar) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        Integer num8;
        Boolean bool;
        i.a aVar;
        i.a aVar2;
        i.a aVar3;
        i.a aVar4;
        i.a aVar5;
        i.a aVar6;
        i.a aVar7;
        i.a aVar8;
        Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
        Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("permission_type", str);
        Long l2 = null;
        if (map == null || (aVar8 = (i.a) map.get(str)) == null) {
            num = null;
        } else {
            num = Integer.valueOf(aVar8.f7915a);
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("anchor_fans_num", String.valueOf(num));
        if (map == null || (aVar7 = (i.a) map.get(str)) == null) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(aVar7.f7916b);
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("forbidden_apply_countdown", String.valueOf(num2));
        if (map == null || (aVar6 = (i.a) map.get(str)) == null) {
            num3 = null;
        } else {
            num3 = Integer.valueOf(aVar6.f7917c);
        }
        Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("apply_need_fans_num", String.valueOf(num3));
        if (map == null || (aVar5 = (i.a) map.get(str)) == null) {
            num4 = null;
        } else {
            num4 = Integer.valueOf(aVar5.f7918d);
        }
        Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("target_live_time", String.valueOf(num4));
        if (map == null || (aVar4 = (i.a) map.get(str)) == null) {
            num5 = null;
        } else {
            num5 = Integer.valueOf(aVar4.f7919e);
        }
        Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("forbidden_apply_days", String.valueOf(num5));
        if (map == null || (aVar3 = (i.a) map.get(str)) == null) {
            num6 = null;
        } else {
            num6 = Integer.valueOf(aVar3.f7920f);
        }
        Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("apply_invalid_time", String.valueOf(num6));
        if (map == null || (aVar2 = (i.a) map.get(str)) == null) {
            num7 = null;
        } else {
            num7 = Integer.valueOf(aVar2.f7921g);
        }
        Uri.Builder appendQueryParameter8 = appendQueryParameter7.appendQueryParameter("need_live_time", String.valueOf(num7));
        if (map == null || (aVar = (i.a) map.get(str)) == null) {
            num8 = null;
        } else {
            num8 = Integer.valueOf(aVar.f7922h);
        }
        Uri.Builder appendQueryParameter9 = appendQueryParameter8.appendQueryParameter("apply_status", String.valueOf(num8));
        if (fVar != null) {
            bool = Boolean.valueOf(fVar.a());
        } else {
            bool = null;
        }
        Uri.Builder appendQueryParameter10 = appendQueryParameter9.appendQueryParameter("can_receive_gift", String.valueOf(bool));
        com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
        if (b2 != null) {
            l2 = Long.valueOf(b2.c());
        }
        appendQueryParameter10.appendQueryParameter("user_id", String.valueOf(l2));
        l.b(buildUpon, "");
        return buildUpon;
    }
}
