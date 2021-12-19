package com.bytedance.android.livesdk.feed.i;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.d.c;
import com.bytedance.android.live.core.f.a.g;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.feed.f.a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.feed.t;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class k extends a {

    /* renamed from: k  reason: collision with root package name */
    TextView f17522k;

    /* renamed from: l  reason: collision with root package name */
    protected HSImageView f17523l;

    /* renamed from: m  reason: collision with root package name */
    HSImageView f17524m;
    View n;
    LiveTextView o;
    HSImageView p;
    TextView q;
    protected View r;
    ImageView s;
    View t;
    TextView u;
    String v = y.a((int) R.string.go3);
    t w;
    View x;
    View y;

    static {
        Covode.recordClassIndex(9706);
    }

    /* access modifiers changed from: protected */
    public void a(ImageModel imageModel) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(FeedItem feedItem);

    private static void a(View view, int i2) {
        if (view != null) {
            view.setVisibility(i2);
        }
    }

    private void a(final HSImageView hSImageView, ImageModel imageModel) {
        if (imageModel == null || h.a(imageModel.getUrls())) {
            hSImageView.setVisibility(8);
            return;
        }
        hSImageView.setVisibility(0);
        com.bytedance.android.live.core.f.k.a(hSImageView, imageModel, new p.a() {
            /* class com.bytedance.android.livesdk.feed.i.k.AnonymousClass2 */

            static {
                Covode.recordClassIndex(9708);
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel) {
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, Exception exc) {
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, int i2, int i3) {
                ViewGroup.LayoutParams layoutParams = hSImageView.getLayoutParams();
                layoutParams.width = (int) (((float) layoutParams.height) * (((float) i2) / ((float) i3)));
                hSImageView.setLayoutParams(layoutParams);
            }
        }, imageModel.isAnimated());
    }

    public void a(ImageModel imageModel, final Room room) {
        final String str;
        final long[] jArr = new long[1];
        if (a.t != null) {
            str = a.t.getEvent();
        } else {
            str = "live_live";
        }
        this.w = new t();
        k.a aVar = new k.a(imageModel);
        aVar.f9094i = true;
        aVar.f9093h = false;
        aVar.f9088c = 300;
        aVar.f9092g = new p.a() {
            /* class com.bytedance.android.livesdk.feed.i.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(9707);
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel) {
                jArr[0] = SystemClock.currentThreadTimeMillis();
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a.a("live_cover_show_start").a((Map<String, String>) hashMap).b();
                k.this.w.f17654b = SystemClock.uptimeMillis();
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, Exception exc) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "0");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a.a("live_cover_show_finish").a((Map<String, String>) hashMap).b();
                t tVar = k.this.w;
                String uri = imageModel.getUri();
                tVar.a();
                JSONObject jSONObject = new JSONObject();
                String message = exc.getMessage();
                t.a(jSONObject, "error_code", 0L);
                t.a(jSONObject, "error_msg", message);
                t.a(jSONObject, "url", uri);
                c.b("ttlive_feed_image_load_all", 1, jSONObject);
                c.a("ttlive_feed_image_load_error", 1, jSONObject);
            }

            @Override // com.bytedance.android.live.core.f.p.a
            public final void a(ImageModel imageModel, int i2, int i3) {
                String uri;
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "live_merge");
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", room.getRequestId());
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", "1");
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - jArr[0]));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "core");
                hashMap.put("event_module", str);
                b.a.a("live_cover_show_finish").a((Map<String, String>) hashMap).b();
                t tVar = k.this.w;
                if (imageModel == null) {
                    uri = "";
                } else {
                    uri = imageModel.getUri();
                }
                long a2 = tVar.a();
                JSONObject jSONObject = new JSONObject();
                t.a(jSONObject, "url", uri);
                c.a("ttlive_feed_image_load_all", 0, a2, jSONObject);
            }
        };
        com.bytedance.android.live.core.f.k.a(this.f17523l, aVar.f9086a, aVar.f9087b, aVar.f9089d, aVar.f9090e, aVar.f9091f, aVar.f9092g, aVar.f9093h, aVar.f9094i);
        g a2 = g.a();
        List<String> urls = imageModel.getUrls();
        if (urls != null) {
            for (String str2 : urls) {
                a2.f9045a.put(str2, 2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(FeedItem feedItem, Room room, View view) {
        a(feedItem);
        com.bytedance.android.livesdk.feed.j.a b2 = com.bytedance.android.livesdk.feed.j.a.b();
        if (room != null && view != null) {
            JSONObject jSONObject = new JSONObject();
            User owner = room.getOwner();
            if (owner != null) {
                String title = room.title();
                String nickName = owner.getNickName();
                try {
                    jSONObject.put("title", title);
                    jSONObject.put("nickName", nickName);
                    jSONObject.put("action", "View#onClick()");
                    jSONObject.put("className", view.getClass().getName());
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                b2.a("ttlive_page", jSONObject);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0133  */
    @Override // com.bytedance.android.livesdk.feed.i.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.bytedance.android.livesdk.model.FeedItem r11, com.bytedance.android.livesdkapi.depend.model.live.Room r12, int r13) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.i.k.a(com.bytedance.android.livesdk.model.FeedItem, com.bytedance.android.livesdkapi.depend.model.live.Room, int):void");
    }

    public k(View view, com.bytedance.android.livesdk.feed.dislike.a aVar, com.bytedance.android.livesdk.feed.h hVar, FeedDataKey feedDataKey, m mVar, com.bytedance.android.livesdkapi.g.g gVar, f.a.l.c<FeedItem> cVar, f.a.l.c<Boolean> cVar2, f.a.l.c<Object> cVar3, f.a.l.c<Object> cVar4) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.x = view.findViewById(R.id.cko);
        this.y = view.findViewById(R.id.ckx);
        this.f17522k = (TextView) view.findViewById(R.id.title);
        this.f17523l = (HSImageView) view.findViewById(R.id.ccc);
        this.f17524m = (HSImageView) view.findViewById(R.id.cdo);
        this.n = view.findViewById(R.id.c9l);
        this.o = (LiveTextView) view.findViewById(R.id.c9n);
        this.p = (HSImageView) view.findViewById(R.id.c9m);
        this.q = (TextView) view.findViewById(R.id.n6);
        this.r = view.findViewById(R.id.byx);
        this.s = (ImageView) view.findViewById(R.id.ce4);
        this.t = view.findViewById(R.id.cdy);
        this.u = (TextView) view.findViewById(R.id.cdx);
    }
}
