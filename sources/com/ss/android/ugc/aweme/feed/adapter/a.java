package com.ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.c;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.i;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class a extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public int f91580a = -1;

    static {
        Covode.recordClassIndex(57667);
    }

    private static boolean a() {
        try {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            c d2 = s.d();
            l.b(d2, "");
            return d2.s().a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view) {
        super(view);
        l.d(view, "");
    }

    private static String a(Context context) {
        l.d(context, "");
        try {
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, "");
            c d2 = s.d();
            l.b(d2, "");
            String a2 = d2.r().a(context);
            l.b(a2, "");
            return a2;
        } catch (Exception unused) {
            return "LIVE";
        }
    }

    /* access modifiers changed from: protected */
    public final void a(TextView textView) {
        String str;
        l.d(textView, "");
        try {
            if (a()) {
                Context context = textView.getContext();
                l.b(context, "");
                str = a(context);
            } else {
                str = "LIVE";
            }
            textView.setText(str);
            a(textView, str, 12.0f);
        } catch (Exception unused) {
            textView.setText("LIVE");
            a(textView, "LIVE", 12.0f);
        }
    }

    private static void a(TextView textView, String str, float f2) {
        do {
            textView.setTextSize(1, f2);
            if (textView.getPaint().measureText(str) > n.b(textView.getContext(), 46.0f)) {
                f2 -= 1.0f;
            } else {
                return;
            }
        } while (f2 >= 10.0f);
    }

    public final void a(Context context, k kVar, List<k> list, int... iArr) {
        User user;
        String str;
        String str2;
        l.d(context, "");
        l.d(iArr, "");
        if (kVar != null && (user = kVar.getUser()) != null) {
            long j2 = user.roomId;
            String str3 = kVar.getUser().roomData;
            if (str3 != null) {
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(it.next().getUser().roomId));
                    }
                }
                Rect rect = new Rect();
                int[] a2 = i.a(new Integer[]{0, 0});
                this.itemView.getLocationOnScreen(a2);
                rect.left = a2[0];
                rect.top = a2[1];
                rect.right = a2[0] + a2[0];
                rect.bottom = a2[1] + a2[1];
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f23299c.G = rect;
                enterRoomConfig.f23299c.H = h.a.n.f((Collection<Long>) arrayList);
                enterRoomConfig.f23299c.L = "live_cover";
                EnterRoomConfig.LogData logData = enterRoomConfig.f23298b;
                User user2 = kVar.getUser();
                if (user2 == null || (str = user2.getUid()) == null) {
                    str = "0";
                }
                logData.f23310b = str;
                enterRoomConfig.f23299c.ab = "click";
                EnterRoomConfig.LogData logData2 = enterRoomConfig.f23298b;
                LogPbBean logPbBean = kVar.getLogPbBean();
                if (logPbBean != null) {
                    str2 = logPbBean.getImprId();
                } else {
                    str2 = null;
                }
                logData2.f23309a = String.valueOf(str2);
                enterRoomConfig.f23299c.R = j2;
                enterRoomConfig.f23299c.J = "homepage_follow";
                enterRoomConfig.f23299c.H = h.a.n.f((Collection<Long>) arrayList);
                enterRoomConfig.f23298b.M = this.f91580a;
                ILiveOuterService s = LiveOuterService.s();
                l.b(s, "");
                s.i().a(context, enterRoomConfig, str3);
                r.a("click_play_following_window", new d().a("is_live", "1").f66730a);
            }
        }
    }
}
