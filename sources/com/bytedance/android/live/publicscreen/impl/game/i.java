package com.bytedance.android.live.publicscreen.impl.game;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.publicscreen.a.d;
import com.bytedance.android.live.publicscreen.a.d.k;
import com.bytedance.android.live.publicscreen.impl.model.e;
import com.bytedance.android.livesdk.chatroom.ui.GameMsgLinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameFloatMsgPanelConfigSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class i extends com.bytedance.android.live.publicscreen.a.c.b {

    /* renamed from: d  reason: collision with root package name */
    public static int f12393d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f12394e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public final h f12395b;

    /* renamed from: c  reason: collision with root package name */
    public int f12396c;

    /* renamed from: f  reason: collision with root package name */
    private e f12397f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f12398g;

    /* renamed from: h  reason: collision with root package name */
    private final h f12399h = h.i.a((h.f.a.a) c.f12408a);

    /* renamed from: i  reason: collision with root package name */
    private boolean f12400i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12401j;

    /* renamed from: k  reason: collision with root package name */
    private int f12402k;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<Integer> f12403l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f12404m;
    private final Context n;
    private final com.bytedance.android.live.publicscreen.a.c.a o;
    private HashMap p;

    static {
        Covode.recordClassIndex(6810);
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final View a(int i2) {
        if (this.p == null) {
            this.p = new HashMap();
        }
        View view = (View) this.p.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.p.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final int getMaxListSize() {
        return ((Number) this.f12399h.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6813);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final Context getActivity() {
        return this.n;
    }

    public final com.bytedance.android.live.publicscreen.a.c.a getCallback() {
        return this.o;
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final int getState() {
        return this.f12402k;
    }

    public final void a(boolean z, List<? extends k<? extends com.bytedance.android.livesdk.ac.b.a>> list, boolean z2) {
        int size;
        if (z) {
            try {
                this.f12395b.f12390b.clear();
            } catch (Throwable unused) {
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if ((t2 instanceof com.bytedance.android.live.publicscreen.impl.model.chat.b) || (t2 instanceof e)) {
                arrayList.add(t);
            }
        }
        this.f12395b.f12390b.addAll(list);
        h hVar = this.f12395b;
        hVar.f12391c = hVar.f12390b.isEmpty() ? null : (com.bytedance.android.live.publicscreen.a.d.h) n.i((List) this.f12395b.f12390b);
        try {
            d();
            e eVar = this.f12397f;
            if (eVar != null) {
                eVar.notifyDataSetChanged();
            }
        } catch (Exception unused2) {
            ((GameMsgRecyclerView) a(R.id.djs)).getRecycledViewPool().clear();
            e eVar2 = this.f12397f;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
        } catch (Throwable unused3) {
        }
        int i2 = this.f12395b.f12392d;
        h hVar2 = this.f12395b;
        hVar2.f12392d = hVar2.f12390b.size();
        if (getState() == 1 && i2 < this.f12395b.f12392d) {
            GameMsgRecyclerView gameMsgRecyclerView = (GameMsgRecyclerView) a(R.id.djs);
            l.b(gameMsgRecyclerView, "");
            if (gameMsgRecyclerView.getMeasuredHeight() < ((int) i.a.a.a.a.b.a(154.0f))) {
                this.o.c();
            }
        }
        a(false);
        if (z2) {
            this.o.b();
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) this.f12395b.f12390b) && (size = this.f12395b.f12390b.size()) > 0 && !((GameMsgRecyclerView) a(R.id.djs)).canScrollVertically(1)) {
            ((GameMsgRecyclerView) a(R.id.djs)).b(size - 1);
        }
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final boolean a() {
        if (this.f12396c != 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final void c() {
        f.a.b.b bVar = this.f12398g;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12408a = new c();

        static {
            Covode.recordClassIndex(6815);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(LiveGameFloatMsgPanelConfigSetting.INSTANCE.getValue().f16718a);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        f.a.b.b bVar = this.f12398g;
        if (bVar != null) {
            bVar.dispose();
        }
        super.onDetachedFromWindow();
    }

    private final boolean getCollapsed() {
        if (getState() == 3 || getState() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final void b() {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ah;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ai;
        l.b(bVar2, "");
        Boolean a3 = bVar2.a();
        if (!l.a(a2, Boolean.valueOf(this.f12400i)) || !l.a(a3, Boolean.valueOf(this.f12401j))) {
            l.b(a2, "");
            this.f12400i = a2.booleanValue();
            l.b(a3, "");
            this.f12401j = a3.booleanValue();
            a(true, a(this.f12395b.f12389a), false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (getCollapsed()) {
            EdgeTransparentView edgeTransparentView = (EdgeTransparentView) a(R.id.adg);
            l.b(edgeTransparentView, "");
            i.a.a.a.a.b.a(edgeTransparentView);
            if (a()) {
                if (getState() == 3) {
                    ((RelativeLayout) a(R.id.dox)).setPadding((int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(8.0f), (int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(8.0f));
                } else {
                    ((RelativeLayout) a(R.id.dox)).setPadding((int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(4.0f), (int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(4.0f));
                }
                RelativeLayout relativeLayout = (RelativeLayout) a(R.id.dox);
                l.b(relativeLayout, "");
                i.a.a.a.a.b.c(relativeLayout);
                LiveTextView liveTextView = (LiveTextView) a(R.id.aw2);
                l.b(liveTextView, "");
                i.a.a.a.a.b.a(liveTextView);
                View a2 = a(R.id.aj8);
                l.b(a2, "");
                i.a.a.a.a.b.a(a2);
                View a3 = a(R.id.aj4);
                l.b(a3, "");
                i.a.a.a.a.b.a(a3);
                View a4 = a(R.id.aj3);
                l.b(a4, "");
                i.a.a.a.a.b.a(a4);
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.dox);
            l.b(relativeLayout2, "");
            i.a.a.a.a.b.a(relativeLayout2);
            com.bytedance.android.live.publicscreen.a.d.h hVar = this.f12395b.f12391c;
            if (hVar instanceof com.bytedance.android.live.publicscreen.impl.model.chat.b) {
                a((com.bytedance.android.live.publicscreen.impl.model.chat.b) hVar);
            } else if (hVar instanceof e) {
                a((e) hVar);
            } else {
                if (getState() == 2) {
                    LiveTextView liveTextView2 = (LiveTextView) a(R.id.aw2);
                    l.b(liveTextView2, "");
                    i.a.a.a.a.b.c(liveTextView2);
                } else {
                    LiveTextView liveTextView3 = (LiveTextView) a(R.id.aw2);
                    l.b(liveTextView3, "");
                    i.a.a.a.a.b.a(liveTextView3);
                }
                View a5 = a(R.id.aj8);
                l.b(a5, "");
                i.a.a.a.a.b.a(a5);
                View a6 = a(R.id.aj4);
                l.b(a6, "");
                i.a.a.a.a.b.a(a6);
                View a7 = a(R.id.aj3);
                l.b(a7, "");
                i.a.a.a.a.b.a(a7);
            }
        } else {
            if (a()) {
                ((RelativeLayout) a(R.id.dox)).setPadding((int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(4.0f), (int) i.a.a.a.a.b.a(10.0f), (int) i.a.a.a.a.b.a(4.0f));
                RelativeLayout relativeLayout3 = (RelativeLayout) a(R.id.dox);
                l.b(relativeLayout3, "");
                i.a.a.a.a.b.c(relativeLayout3);
                EdgeTransparentView edgeTransparentView2 = (EdgeTransparentView) a(R.id.adg);
                l.b(edgeTransparentView2, "");
                ViewGroup.LayoutParams layoutParams = edgeTransparentView2.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, 0, 0, (int) i.a.a.a.a.b.a(8.0f));
            } else {
                RelativeLayout relativeLayout4 = (RelativeLayout) a(R.id.dox);
                l.b(relativeLayout4, "");
                i.a.a.a.a.b.a(relativeLayout4);
                EdgeTransparentView edgeTransparentView3 = (EdgeTransparentView) a(R.id.adg);
                l.b(edgeTransparentView3, "");
                ViewGroup.LayoutParams layoutParams2 = edgeTransparentView3.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                ((LinearLayout.LayoutParams) layoutParams2).setMargins(0, (int) i.a.a.a.a.b.a(8.0f), 0, (int) i.a.a.a.a.b.a(8.0f));
            }
            EdgeTransparentView edgeTransparentView4 = (EdgeTransparentView) a(R.id.adg);
            l.b(edgeTransparentView4, "");
            i.a.a.a.a.b.c(edgeTransparentView4);
            LiveTextView liveTextView4 = (LiveTextView) a(R.id.aw2);
            l.b(liveTextView4, "");
            i.a.a.a.a.b.a(liveTextView4);
            View a8 = a(R.id.aj8);
            l.b(a8, "");
            i.a.a.a.a.b.a(a8);
            View a9 = a(R.id.aj4);
            l.b(a9, "");
            i.a.a.a.a.b.a(a9);
            View a10 = a(R.id.aj3);
            l.b(a10, "");
            i.a.a.a.a.b.a(a10);
        }
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f12407a;

        static {
            Covode.recordClassIndex(6814);
        }

        b(i iVar) {
            this.f12407a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<? extends k<? extends com.bytedance.android.livesdk.ac.b.a>> list = (List) obj;
            LiveTextView liveTextView = (LiveTextView) this.f12407a.a(R.id.exo);
            l.b(liveTextView, "");
            liveTextView.setText(y.a((int) R.string.gof, com.bytedance.android.live.core.f.b.b((long) i.f12393d)));
            if (list != null && !list.isEmpty()) {
                this.f12407a.f12395b.f12389a.addAll(list);
                int size = this.f12407a.f12395b.f12389a.size() - this.f12407a.getMaxListSize();
                if (size > 0) {
                    this.f12407a.f12395b.f12389a.subList(0, size).clear();
                    i iVar = this.f12407a;
                    iVar.a(true, iVar.a(iVar.f12395b.f12389a), true);
                    return;
                }
                i iVar2 = this.f12407a;
                iVar2.a(false, iVar2.a(list), true);
            }
        }
    }

    private final void a(com.bytedance.android.live.publicscreen.impl.model.chat.b bVar) {
        ImageModel imageModel;
        LiveTextView liveTextView = (LiveTextView) a(R.id.aw2);
        l.b(liveTextView, "");
        i.a.a.a.a.b.a(liveTextView);
        View a2 = a(R.id.aj8);
        l.b(a2, "");
        i.a.a.a.a.b.a(a2);
        View a3 = a(R.id.aj4);
        l.b(a3, "");
        i.a.a.a.a.b.a(a3);
        View a4 = a(R.id.aj3);
        l.b(a4, "");
        i.a.a.a.a.b.c(a4);
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.fdm);
        l.b(liveTextView2, "");
        liveTextView2.setText(bVar.v());
        HSImageView hSImageView = (HSImageView) a(R.id.fcu);
        User b2 = bVar.b();
        if (b2 != null) {
            imageModel = b2.getAvatarThumb();
        } else {
            imageModel = null;
        }
        com.bytedance.android.live.core.f.k.a(hSImageView, imageModel);
        LiveTextView liveTextView3 = (LiveTextView) a(R.id.a4w);
        l.b(liveTextView3, "");
        liveTextView3.setText(bVar.z());
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final void setState(int i2) {
        if (i2 != this.f12402k) {
            this.f12402k = i2;
            if (i2 == 1) {
                d();
                RelativeLayout relativeLayout = (RelativeLayout) a(R.id.rg);
                l.b(relativeLayout, "");
                i.a.a.a.a.b.c(relativeLayout);
            } else if (i2 == 2) {
                d();
                RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.rg);
                l.b(relativeLayout2, "");
                i.a.a.a.a.b.c(relativeLayout2);
            } else if (i2 == 3) {
                RelativeLayout relativeLayout3 = (RelativeLayout) a(R.id.rg);
                l.b(relativeLayout3, "");
                i.a.a.a.a.b.a(relativeLayout3);
                d();
            }
            a(true);
            this.o.a(getState());
        }
    }

    private final void a(e eVar) {
        LiveTextView liveTextView = (LiveTextView) a(R.id.aw2);
        l.b(liveTextView, "");
        i.a.a.a.a.b.a(liveTextView);
        View a2 = a(R.id.aj3);
        l.b(a2, "");
        i.a.a.a.a.b.a(a2);
        View a3 = a(R.id.aj8);
        l.b(a3, "");
        i.a.a.a.a.b.a(a3);
        View a4 = a(R.id.aj4);
        l.b(a4, "");
        i.a.a.a.a.b.c(a4);
        LiveTextView liveTextView2 = (LiveTextView) a(R.id.bbd);
        l.b(liveTextView2, "");
        f.a(liveTextView2, eVar);
    }

    private final void a(boolean z) {
        if (z) {
            int state = getState();
            if (state == 1) {
                ImageView imageView = (ImageView) a(R.id.bts);
                l.b(imageView, "");
                i.a.a.a.a.b.c(imageView);
                ((ImageView) a(R.id.bts)).setImageResource(2131234436);
            } else if (state == 2) {
                ((ImageView) a(R.id.bts)).setImageResource(2131234435);
                if (this.f12395b.f12390b.size() > 1) {
                    ImageView imageView2 = (ImageView) a(R.id.bts);
                    l.b(imageView2, "");
                    i.a.a.a.a.b.c(imageView2);
                    return;
                }
                ImageView imageView3 = (ImageView) a(R.id.bts);
                l.b(imageView3, "");
                i.a.a.a.a.b.b(imageView3);
            } else if (state == 3) {
                ImageView imageView4 = (ImageView) a(R.id.bts);
                l.b(imageView4, "");
                i.a.a.a.a.b.b(imageView4);
            }
        } else if (this.f12395b.f12390b.size() <= 1 || getState() == 3) {
            ImageView imageView5 = (ImageView) a(R.id.bts);
            l.b(imageView5, "");
            i.a.a.a.a.b.b(imageView5);
        } else {
            ImageView imageView6 = (ImageView) a(R.id.bts);
            l.b(imageView6, "");
            i.a.a.a.a.b.c(imageView6);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.List<? extends com.bytedance.android.live.publicscreen.a.d.k<? extends com.bytedance.android.livesdk.ac.b.a>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<k<? extends com.bytedance.android.livesdk.ac.b.a>> a(List<? extends k<? extends com.bytedance.android.livesdk.ac.b.a>> list) {
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ah;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ai;
        l.b(bVar2, "");
        Boolean a3 = bVar2.a();
        l.b(a2, "");
        if (a2.booleanValue()) {
            l.b(a3, "");
            if (a3.booleanValue()) {
                return list;
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            int intType = kVar.f12190d.getIntType();
            if ((a2.booleanValue() || intType == com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType() || intType == com.bytedance.android.livesdk.model.message.a.a.DOODLE_GIFT.getIntType()) && ((a3.booleanValue() || !(intType == com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType() || intType == com.bytedance.android.livesdk.model.message.a.a.DOODLE_GIFT.getIntType())) && this.f12403l.contains(Integer.valueOf(intType)))) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.publicscreen.a.c.b
    public final void a(d dVar) {
        l.d(dVar, "");
        if (this.f12404m) {
            com.bytedance.android.live.core.c.a.a(6, "LiveGameMsgView", "bindTextPresenter already binded");
            return;
        }
        t<List<k<? extends com.bytedance.android.livesdk.ac.b.a>>> a2 = dVar.a();
        if (a2 == null) {
            com.bytedance.android.live.core.c.a.a(6, "LiveGameMsgView", "bindTextPresenter observeFloatWindowMsgList return null");
            return;
        }
        this.f12404m = true;
        this.f12398g = a2.a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this), com.bytedance.android.livesdk.util.rxutils.i.f22196a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context, int i2, com.bytedance.android.live.publicscreen.a.c.a aVar) {
        super(context, i2);
        l.d(context, "");
        l.d(aVar, "");
        MethodCollector.i(7998);
        this.n = context;
        this.o = aVar;
        com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.ah;
        l.b(bVar, "");
        Boolean a2 = bVar.a();
        l.b(a2, "");
        this.f12400i = a2.booleanValue();
        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.ai;
        l.b(bVar2, "");
        Boolean a3 = bVar2.a();
        l.b(a3, "");
        this.f12401j = a3.booleanValue();
        h hVar = new h();
        this.f12395b = hVar;
        this.f12402k = i2;
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.GIFT.getIntType()));
        arrayList.add(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.DOODLE_GIFT.getIntType()));
        arrayList.add(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.CHAT.getIntType()));
        arrayList.add(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.MEMBER.getIntType()));
        arrayList.add(Integer.valueOf(com.bytedance.android.livesdk.model.message.a.a.SCREEN.getIntType()));
        this.f12403l = arrayList;
        View.inflate(context, R.layout.bes, this);
        f12393d = 0;
        ((ImageView) a(R.id.bts)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.game.i.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f12405a;

            static {
                Covode.recordClassIndex(6811);
            }

            {
                this.f12405a = r1;
            }

            public final void onClick(View view) {
                int state = this.f12405a.getState();
                if (state == 1) {
                    this.f12405a.setState(2);
                } else if (state == 2) {
                    this.f12405a.setState(1);
                } else if (state == 3) {
                    ImageView imageView = (ImageView) this.f12405a.a(R.id.bts);
                    l.b(imageView, "");
                    i.a.a.a.a.b.b(imageView);
                }
            }
        });
        setState(i2);
        d();
        a(true);
        EdgeTransparentView edgeTransparentView = (EdgeTransparentView) a(R.id.adg);
        float a4 = i.a.a.a.a.b.a(20.0f);
        edgeTransparentView.f12370a = 1;
        edgeTransparentView.f12371b = a4;
        edgeTransparentView.invalidate();
        this.f12397f = new e(context, hVar.f12390b);
        GameMsgLinearLayoutManager gameMsgLinearLayoutManager = new GameMsgLinearLayoutManager();
        ((GameMsgRecyclerView) a(R.id.djs)).setMaxHeight((int) i.a.a.a.a.b.a(154.0f));
        RecyclerView recyclerView = (RecyclerView) a(R.id.djs);
        l.b(recyclerView, "");
        recyclerView.setLayoutManager(gameMsgLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djs);
        l.b(recyclerView2, "");
        recyclerView2.setItemAnimator(null);
        RecyclerView recyclerView3 = (RecyclerView) a(R.id.djs);
        l.b(recyclerView3, "");
        recyclerView3.setAdapter(this.f12397f);
        ((LiveTextView) a(R.id.f5s)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.android.live.publicscreen.impl.game.i.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f12406a;

            static {
                Covode.recordClassIndex(6812);
            }

            {
                this.f12406a = r1;
            }

            public final void onClick(View view) {
                this.f12406a.getCallback().a();
                i iVar = this.f12406a;
                if (iVar.f12396c == iVar.f12396c) {
                    iVar.f12396c = 0;
                    iVar.d();
                }
            }
        });
        LiveTextView liveTextView = (LiveTextView) a(R.id.exo);
        l.b(liveTextView, "");
        liveTextView.setText(y.a((int) R.string.gof, com.bytedance.android.live.core.f.b.b((long) f12393d)));
        MethodCollector.o(7998);
    }
}
