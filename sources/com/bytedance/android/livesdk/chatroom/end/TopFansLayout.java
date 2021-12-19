package com.bytedance.android.livesdk.chatroom.end;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.at.f;
import com.bytedance.android.livesdk.at.j;
import com.bytedance.android.livesdk.chatroom.end.g;
import com.bytedance.android.livesdk.model.ay;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.au;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopFansLayout extends LinearLayout implements g.a, au {

    /* renamed from: a  reason: collision with root package name */
    List<ay> f15393a;

    /* renamed from: b  reason: collision with root package name */
    public List<b> f15394b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final f.a.b.a f15395c = new f.a.b.a();

    /* renamed from: d  reason: collision with root package name */
    Activity f15396d;

    /* renamed from: e  reason: collision with root package name */
    Fragment f15397e;

    /* renamed from: f  reason: collision with root package name */
    public Room f15398f;

    /* renamed from: g  reason: collision with root package name */
    View.OnClickListener f15399g;

    /* renamed from: h  reason: collision with root package name */
    public g f15400h;

    /* renamed from: i  reason: collision with root package name */
    public String f15401i;

    /* renamed from: j  reason: collision with root package name */
    public View f15402j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f15403k = true;

    /* renamed from: l  reason: collision with root package name */
    View.OnClickListener f15404l = new View.OnClickListener() {
        /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.AnonymousClass3 */

        static {
            Covode.recordClassIndex(8512);
        }

        public final void onClick(View view) {
            ay ayVar;
            User user;
            if (view.getId() == R.id.bx4 && (user = (ayVar = (ay) view.getTag(R.id.esx)).f19026b) != null) {
                TopFansLayout.this.f15402j = view;
                if (!u.a().b().e()) {
                    f b2 = u.a().b();
                    Context context = TopFansLayout.this.getContext();
                    j.a a2 = j.a();
                    a2.f14158a = com.bytedance.android.livesdk.ao.a.a();
                    a2.f14159b = com.bytedance.android.livesdk.ao.a.b();
                    a2.f14162e = "live_detail";
                    a2.f14163f = "follow";
                    a2.f14161d = "live";
                    a2.f14160c = 1;
                    b2.a(context, a2.a()).b(new com.bytedance.android.livesdk.at.g<com.bytedance.android.live.base.model.user.b>() {
                        /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.AnonymousClass3.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(8513);
                        }

                        @Override // com.bytedance.android.livesdk.at.g, f.a.z, f.a.ae
                        public final void onSubscribe(f.a.b.b bVar) {
                            super.onSubscribe(bVar);
                            TopFansLayout.this.f15395c.a(bVar);
                        }
                    });
                    return;
                }
                TopFansLayout.this.f15400h.a(user.getId(), TopFansLayout.this.f15398f, TopFansLayout.this.f15401i, TopFansLayout.this);
                TopFansLayout.a("pm_live_take_anchor_follow_audience", ayVar);
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    private a f15405m;
    private DataChannel n;

    public interface a {
        static {
            Covode.recordClassIndex(8514);
        }
    }

    static {
        Covode.recordClassIndex(8509);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        this.f15395c.a();
        this.f15400h.f15443a.a();
    }

    public final void a() {
        for (b bVar : this.f15394b) {
            final User user = ((ay) bVar.f15413c.getTag(R.id.esx)).f19026b;
            u.a().b().b(user.getId()).a_(new ae<com.bytedance.android.live.base.model.user.b>() {
                /* class com.bytedance.android.livesdk.chatroom.end.TopFansLayout.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(8511);
                }

                @Override // f.a.ae
                public final void onError(Throwable th) {
                }

                @Override // f.a.ae
                public final void onSubscribe(f.a.b.b bVar) {
                    TopFansLayout.this.f15395c.a(bVar);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // f.a.ae
                public final /* synthetic */ void onSuccess(com.bytedance.android.live.base.model.user.b bVar) {
                    if (!TopFansLayout.this.f15394b.isEmpty()) {
                        for (b bVar2 : TopFansLayout.this.f15394b) {
                            ay ayVar = (ay) bVar2.f15413c.getTag(R.id.esx);
                            User user = ayVar.f19026b;
                            if (user != null && user.getId() == user.getId()) {
                                ayVar.f19026b = User.from(user);
                                bVar2.f15413c.setTag(R.id.esx, ayVar);
                                bVar2.f15411a.setTag(R.id.esx, ayVar);
                                if (user.getId() == u.a().b().c() || user.isFollowing() || !TopFansLayout.this.f15403k) {
                                    bVar2.f15411a.setVisibility(8);
                                    return;
                                } else {
                                    bVar2.f15411a.setVisibility(0);
                                    return;
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.n = dataChannel;
    }

    public void setFollowVisible(boolean z) {
        this.f15403k = z;
    }

    public void setTopFansCallBack(a aVar) {
        this.f15405m = aVar;
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.g.a
    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        if (this.f15396d != null) {
            View view = this.f15402j;
            if (view != null && view.getVisibility() == 0) {
                this.f15402j.setVisibility(8);
            }
            ao.a(this.f15396d, (int) R.string.gqv);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f15411a;

        /* renamed from: b  reason: collision with root package name */
        public View f15412b;

        /* renamed from: c  reason: collision with root package name */
        public VHeadView f15413c;

        /* renamed from: d  reason: collision with root package name */
        public TextView f15414d;

        /* renamed from: e  reason: collision with root package name */
        public TextView f15415e;

        static {
            Covode.recordClassIndex(8515);
        }

        private b(View view) {
            this.f15412b = view;
            this.f15411a = view.findViewById(R.id.bx4);
            this.f15413c = (VHeadView) view.findViewById(R.id.bf0);
            this.f15414d = (TextView) view.findViewById(R.id.eph);
            this.f15415e = (TextView) view.findViewById(R.id.epg);
        }

        /* synthetic */ b(View view, byte b2) {
            this(view);
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.end.g.a
    public final void a(Throwable th) {
        Activity activity = this.f15396d;
        if (activity != null && th != null) {
            if (th instanceof com.bytedance.android.live.a.a.b.a) {
                ao.a(activity, ((com.bytedance.android.live.a.a.b.a) th).getPrompt(), 0);
            } else {
                ao.a(activity, (int) R.string.gqu);
            }
        }
    }

    public TopFansLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.i(3047);
        MethodCollector.o(3047);
    }

    public static void a(String str, ay ayVar) {
        String str2;
        if (!TextUtils.isEmpty(str) && ayVar != null) {
            if (ayVar.f19027c == 1) {
                str2 = "no.1";
            } else if (ayVar.f19027c == 2) {
                str2 = "no.2";
            } else {
                str2 = "no.3";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_belong", "live_take");
            hashMap.put("event_type", "click");
            hashMap.put("event_page", "anchor_live_ending");
            hashMap.put("people", str2);
            b.a.a(str).a((Map<String, String>) hashMap).b();
        }
    }
}
