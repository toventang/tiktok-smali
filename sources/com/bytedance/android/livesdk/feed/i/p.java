package com.bytedance.android.livesdk.feed.i;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.m;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.ui.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.android.livesdkapi.a.a;
import com.bytedance.android.livesdkapi.depend.model.live.e;
import com.bytedance.android.livesdkapi.host.f;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import f.a.l.c;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

public final class p extends b<FeedItem> {

    /* renamed from: a  reason: collision with root package name */
    public FeedItem f17549a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17550b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17551c;

    /* renamed from: d  reason: collision with root package name */
    com.bytedance.android.livesdkapi.a.b f17552d;

    /* renamed from: e  reason: collision with root package name */
    protected final h f17553e;

    /* renamed from: f  reason: collision with root package name */
    protected final FeedDataKey f17554f;

    /* renamed from: g  reason: collision with root package name */
    private HSImageView f17555g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f17556h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f17557i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f17558j;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f17559k;

    /* renamed from: l  reason: collision with root package name */
    private int f17560l = -1;

    /* renamed from: m  reason: collision with root package name */
    private View f17561m;
    private boolean n;
    private boolean o;
    private a p;
    private c<Object> q;
    private c<Object> r;

    static {
        Covode.recordClassIndex(9716);
    }

    private void f() {
        com.bytedance.android.live.t.a.a(f.class);
        this.itemView.getContext();
        this.itemView.hashCode();
    }

    private void g() {
        FeedItem feedItem;
        if (this.f17552d != null && (feedItem = this.f17549a) != null && feedItem.item != null && (this.f17549a.item instanceof e)) {
            ((e) this.f17549a.item).a();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void a() {
        super.a();
        FeedItem feedItem = this.f17549a;
        if (!(feedItem == null || feedItem.item == null || !(this.f17549a.item instanceof e))) {
            e eVar = (e) this.f17549a.item;
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
            eVar.getId();
            eVar.a("");
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
            Object[] objArr = new Object[2];
            JSONObject jSONObject = this.f17549a.adJSONObject;
        }
        g();
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void e() {
        super.e();
        if (this.f17549a != null) {
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
            this.itemView.hashCode();
        }
        if (this.o) {
            this.o = false;
            if (this.f17549a != null) {
                com.bytedance.android.live.t.a.a(f.class);
                this.itemView.getContext();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.b
    public final void b() {
        FeedItem feedItem;
        super.b();
        if (this.f17552d != null && (feedItem = this.f17549a) != null && feedItem.item != null && (this.f17549a.item instanceof e)) {
            e eVar = (e) this.f17549a.item;
            try {
                com.bytedance.android.livesdkapi.a.b bVar = this.f17552d;
                eVar.a();
                JSONObject a2 = bVar.a();
                JSONObject a3 = eVar.a("");
                if (a2 != null) {
                    long optLong = a2.optLong("duration", 0);
                    a2.put("play_50", a2.optLong("play_100", 0));
                    a2.remove("duration");
                    a3.put("duration", optLong);
                    a3.put("ad_extra_data", a2);
                }
                com.bytedance.android.live.t.a.a(f.class);
                this.itemView.getContext();
                eVar.getId();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        f();
        g();
        if (this.f17550b) {
            this.f17553e.a(this.f17554f, String.valueOf(this.f17549a.item.getId()));
            ao.a(this.itemView.getContext(), (int) R.string.gnt);
            this.f17550b = false;
            this.f17550b = false;
        }
        if (this.f17551c) {
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
        }
        if (this.f17552d != null) {
            ((e) this.f17549a.item).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(FeedItem feedItem) {
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof e)) {
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(PopupWindow popupWindow) {
        this.f17553e.a(this.f17554f, String.valueOf(this.f17549a.item.getId()));
        com.bytedance.android.live.t.a.a(f.class);
        this.itemView.getContext();
        ao.a(this.itemView.getContext(), (int) R.string.gnt);
        popupWindow.dismiss();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        FeedItem feedItem = this.f17549a;
        if (feedItem != null && feedItem.item != null && (this.f17549a.item instanceof e)) {
            e eVar = (e) this.f17549a.item;
            if (eVar.f23111b.equals("app")) {
                com.bytedance.android.live.t.a.a(f.class);
                this.itemView.getContext();
                return;
            }
            eVar.a(str);
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
            eVar.getId();
            com.bytedance.android.live.t.a.a(f.class);
            this.itemView.getContext();
            Object[] objArr = new Object[2];
            JSONObject jSONObject = this.f17549a.adJSONObject;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
    @Override // com.bytedance.android.livesdk.ui.b
    public final /* synthetic */ void a(FeedItem feedItem, int i2) {
        FeedItem feedItem2 = feedItem;
        this.f17549a = feedItem2;
        if (!this.o) {
            this.o = true;
            if (feedItem2 != null) {
                com.bytedance.android.live.t.a.a(f.class);
                this.itemView.getContext();
                Object[] objArr = new Object[1];
                new Object() {
                    /* class com.bytedance.android.livesdk.feed.i.p.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(9717);
                    }
                };
            }
        }
        if (this.f17560l <= 0) {
            this.f17560l = n.a(this.f17555g.getContext());
        }
        HSImageView hSImageView = this.f17555g;
        int i3 = this.f17560l;
        hSImageView.setLayoutParams(new RelativeLayout.LayoutParams(i3, i3));
        if (feedItem2 != null && (feedItem2.item instanceof e)) {
            e eVar = (e) feedItem2.item;
            this.f17556h.setOnClickListener(new r(this, feedItem2));
            this.itemView.setOnClickListener(new t(this, feedItem2));
            if (this.n) {
                this.itemView.setOnLongClickListener(new u(this));
            } else {
                this.itemView.setOnLongClickListener(null);
            }
            this.f17561m.setOnClickListener(new v(this, feedItem2));
            if (!com.bytedance.common.utility.collection.b.a((Collection) eVar.f23113d) && eVar.f23113d.get(0) != null && !com.bytedance.common.utility.collection.b.a((Collection) eVar.f23113d.get(0).f23127c)) {
                this.f17555g.setImageURI(eVar.f23113d.get(0).f23127c.get(0));
            }
            if (!TextUtils.isEmpty(eVar.A)) {
                this.f17556h.setText(eVar.A);
                this.f17556h.setVisibility(0);
            } else {
                this.f17556h.setVisibility(8);
            }
            if (!TextUtils.isEmpty(eVar.B)) {
                this.f17558j.setText(eVar.B);
            }
            this.f17557i.setText(eVar.o);
            f();
            c<Object> cVar = this.q;
            if (cVar != null) {
                a(cVar.a(new w(this), x.f17574a));
            }
            c<Object> cVar2 = this.r;
            if (cVar2 != null) {
                a(cVar2.a(new y(this), z.f17576a));
            }
        }
    }

    public p(View view, h hVar, FeedDataKey feedDataKey, m mVar, c<Object> cVar, c<Object> cVar2) {
        super(view);
        boolean z;
        this.f17555g = (HSImageView) view.findViewById(R.id.btk);
        this.f17556h = (TextView) view.findViewById(R.id.title);
        this.f17557i = (TextView) view.findViewById(R.id.ev8);
        this.f17559k = (ImageView) view.findViewById(R.id.byk);
        this.f17561m = view.findViewById(R.id.gx);
        this.f17558j = (TextView) view.findViewById(R.id.ez);
        this.p = new q(this);
        if (feedDataKey == null || mVar == null || !mVar.b(feedDataKey.f17459c)) {
            z = false;
        } else {
            z = true;
        }
        this.n = z;
        this.f17553e = hVar;
        this.f17554f = feedDataKey;
        this.q = cVar;
        this.r = cVar2;
        this.f17552d = ((f) com.bytedance.android.live.t.a.a(f.class)).a();
    }
}
