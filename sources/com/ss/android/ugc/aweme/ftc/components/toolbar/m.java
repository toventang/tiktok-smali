package com.ss.android.ugc.aweme.ftc.components.toolbar;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ah;
import com.bytedance.tux.tooltip.h;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.k;
import com.ss.android.ugc.aweme.shortvideo.edit.w;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    com.bytedance.tux.tooltip.a f98252a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.fragment.app.e f98253b;

    /* renamed from: c  reason: collision with root package name */
    final com.bytedance.scene.group.b f98254c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a.b.a f98255d = new f.a.b.a();

    /* renamed from: e  reason: collision with root package name */
    private final List<p<LiveData<Object>, u<Object>>> f98256e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final VideoPublishEditModel f98257f;

    /* renamed from: g  reason: collision with root package name */
    private final FTCEditToolbarViewModel f98258g;

    static {
        Covode.recordClassIndex(62488);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        com.bytedance.tux.tooltip.a aVar = this.f98252a;
        if (aVar != null && aVar.isShowing()) {
            aVar.dismiss();
        }
    }

    public final void a() {
        this.f98255d.a();
        for (T t : this.f98256e) {
            ((LiveData) t.getFirst()).removeObserver((u) t.getSecond());
        }
        this.f98256e.clear();
        b();
    }

    static final class c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f98259a;

        static {
            Covode.recordClassIndex(62491);
        }

        c(View view) {
            this.f98259a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                this.f98259a.setEnabled(booleanValue);
                if (booleanValue) {
                    view = this.f98259a;
                    f2 = 1.0f;
                } else {
                    view = this.f98259a;
                    f2 = 0.5f;
                }
                view.setAlpha(f2);
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f98263a;

        static {
            Covode.recordClassIndex(62493);
        }

        e(View view) {
            this.f98263a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            View view;
            float f2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    view = this.f98263a;
                    f2 = 1.0f;
                } else {
                    view = this.f98263a;
                    f2 = 0.5f;
                }
                view.setAlpha(f2);
            }
        }
    }

    static final class f<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f98264a;

        static {
            Covode.recordClassIndex(62494);
        }

        f(View view) {
            this.f98264a = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                View view = this.f98264a;
                if (booleanValue) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                view.setVisibility(i2);
            }
        }
    }

    public final void b(Map<Integer, ? extends View> map) {
        l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            t<Boolean> tVar = this.f98258g.i().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f98253b, new c(view));
            }
        }
    }

    public final void c(Map<Integer, ? extends View> map) {
        l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            t<Boolean> tVar = this.f98258g.j().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f98253b, new e(view));
            }
        }
    }

    public final void d(Map<Integer, ? extends View> map) {
        l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            t<Boolean> tVar = this.f98258g.k().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f98253b, new d(this, intValue, view));
            }
        }
    }

    public final void a(Map<Integer, ? extends View> map) {
        l.d(map, "");
        for (Map.Entry<Integer, ? extends View> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            View view = (View) entry.getValue();
            t<Boolean> tVar = this.f98258g.h().get(Integer.valueOf(intValue));
            if (tVar != null) {
                a(tVar, this.f98253b, new f(view));
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f98260a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f98261b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f98262c;

        static {
            Covode.recordClassIndex(62492);
        }

        d(m mVar, int i2, View view) {
            this.f98260a = mVar;
            this.f98261b = i2;
            this.f98262c = view;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            p pVar;
            View view;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                m mVar = this.f98260a;
                int i3 = this.f98261b;
                View view2 = this.f98262c;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 6 && booleanValue) {
                                    com.bytedance.tux.tooltip.b a2 = new com.bytedance.tux.tooltip.a.b.a(mVar.f98253b).e(R.string.bk7).a(5000L).a(true).a(h.START);
                                    if (view2.getHeight() == 0) {
                                        d dVar = (d) mVar.f98254c.a("FTCEditTitleBarScene");
                                        if (dVar != null && (pVar = dVar.f98233g) != null && (view = pVar.f98268b) != null) {
                                            a2.b(view);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        View findViewById = view2.findViewById(R.id.a00);
                                        if (findViewById != null) {
                                            a2.b(findViewById);
                                        } else {
                                            a2.b(view2);
                                        }
                                    }
                                    a2.d().a();
                                    w.b("voice");
                                }
                            } else if (booleanValue) {
                                if (w.b()) {
                                    i2 = R.string.ay2;
                                } else {
                                    i2 = R.string.bk6;
                                }
                                new com.bytedance.tux.tooltip.a.b.a(mVar.f98253b).e(i2).a(5000L).a(true).b(view2).a(h.TOP).d().a();
                                if (w.b()) {
                                    w.b("custom_sticker");
                                } else {
                                    w.b("sticker");
                                }
                            }
                        } else if (booleanValue) {
                            ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(mVar.f98253b).b(view2).a(h.TOP)).e(R.string.ayd).a(true).a(5000L).d().a();
                            w.b("text");
                        }
                    } else if (booleanValue) {
                        if (mVar.f98252a == null) {
                            mVar.f98252a = new com.bytedance.tux.tooltip.a.b.a(mVar.f98253b).e(R.string.bk3).a(5000L).b(view2).a(h.TOP).d();
                        }
                        com.bytedance.tux.tooltip.a aVar = mVar.f98252a;
                        if (aVar != null) {
                            aVar.a();
                        }
                        w.b("effect");
                    } else {
                        mVar.b();
                    }
                } else if (booleanValue) {
                    ((com.bytedance.tux.tooltip.a.b.a) new com.bytedance.tux.tooltip.a.b.a(mVar.f98253b).b(view2).a(h.TOP)).e(R.string.bk4).a(true).a(5000L).d().a();
                    w.b("music");
                }
            }
        }
    }

    static final class a extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, String, z> {
        final /* synthetic */ k $item;

        static {
            Covode.recordClassIndex(62489);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(k kVar) {
            super(2);
            this.$item = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, String str) {
            String str2 = str;
            l.d(bVar, "");
            l.d(str2, "");
            this.$item.setText(str2);
            return z.f158842a;
        }
    }

    static final class b extends h.f.b.m implements h.f.a.m<com.bytedance.jedi.arch.b, Drawable, z> {
        final /* synthetic */ k $item;

        static {
            Covode.recordClassIndex(62490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(k kVar) {
            super(2);
            this.$item = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.b bVar, Drawable drawable) {
            Drawable drawable2 = drawable;
            l.d(bVar, "");
            l.d(drawable2, "");
            this.$item.setIcon(drawable2);
            return z.f158842a;
        }
    }

    public final void a(com.bytedance.jedi.arch.b bVar, k kVar) {
        l.d(bVar, "");
        l.d(kVar, "");
        bVar.selectNonNullSubscribe(this.f98258g, n.f98265a, new ah(), new a(kVar));
        bVar.selectNonNullSubscribe(this.f98258g, o.f98266a, new ah(), new b(kVar));
    }

    private final <T> void a(LiveData<T> liveData, androidx.lifecycle.m mVar, u<T> uVar) {
        liveData.observe(mVar, uVar);
        List<p<LiveData<Object>, u<Object>>> list = this.f98256e;
        Objects.requireNonNull(liveData, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        list.add(new p<>(liveData, uVar));
    }

    public m(androidx.fragment.app.e eVar, VideoPublishEditModel videoPublishEditModel, FTCEditToolbarViewModel fTCEditToolbarViewModel, com.bytedance.scene.group.b bVar) {
        l.d(eVar, "");
        l.d(videoPublishEditModel, "");
        l.d(fTCEditToolbarViewModel, "");
        l.d(bVar, "");
        this.f98253b = eVar;
        this.f98257f = videoPublishEditModel;
        this.f98258g = fTCEditToolbarViewModel;
        this.f98254c = bVar;
    }
}
