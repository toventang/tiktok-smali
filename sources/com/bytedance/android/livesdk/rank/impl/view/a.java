package com.bytedance.android.livesdk.rank.impl.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.gift.d.b;
import com.bytedance.android.livesdk.gift.model.t;
import com.bytedance.android.livesdk.rank.api.model.f;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import j.a.a.c;
import java.util.ArrayList;

public final class a extends c<f, C0443a> {
    static {
        Covode.recordClassIndex(12433);
    }

    /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a  reason: collision with other inner class name */
    public static final class C0443a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        HSImageView f21059a;

        /* renamed from: b  reason: collision with root package name */
        public LiveTextView f21060b;

        /* renamed from: c  reason: collision with root package name */
        public View f21061c;

        /* renamed from: d  reason: collision with root package name */
        public LiveTextView f21062d;

        /* renamed from: e  reason: collision with root package name */
        LiveGiftBoostCountDownView f21063e;

        /* renamed from: f  reason: collision with root package name */
        f.a.b.a f21064f = new f.a.b.a();

        static {
            Covode.recordClassIndex(12434);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$b */
        static final class b<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0443a f21066a;

            static {
                Covode.recordClassIndex(12436);
            }

            b(C0443a aVar) {
                this.f21066a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                CharSequence charSequence;
                View findViewById = this.f21066a.itemView.findViewById(R.id.ug);
                l.b(findViewById, "");
                findViewById.setVisibility(8);
                View view = this.f21066a.f21061c;
                if (view != null) {
                    view.setVisibility(0);
                }
                LiveTextView liveTextView = this.f21066a.f21062d;
                if (liveTextView != null) {
                    LiveTextView liveTextView2 = this.f21066a.f21060b;
                    if (liveTextView2 != null) {
                        charSequence = liveTextView2.getText();
                    } else {
                        charSequence = null;
                    }
                    liveTextView.setText(charSequence);
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$a  reason: collision with other inner class name */
        static final class C0444a<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0443a f21065a;

            static {
                Covode.recordClassIndex(12435);
            }

            C0444a(C0443a aVar) {
                this.f21065a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Resources resources;
                Resources resources2;
                com.bytedance.android.livesdk.gift.d.c cVar = (com.bytedance.android.livesdk.gift.d.c) obj;
                LiveTextView liveTextView = this.f21065a.f21062d;
                if (liveTextView != null) {
                    String str = null;
                    if (!y.g()) {
                        View view = this.f21065a.itemView;
                        l.b(view, "");
                        Context context = view.getContext();
                        if (!(context == null || (resources2 = context.getResources()) == null)) {
                            str = resources2.getString(R.string.ehu, String.valueOf(cVar.f17847a));
                        }
                    } else {
                        View view2 = this.f21065a.itemView;
                        l.b(view2, "");
                        Context context2 = view2.getContext();
                        if (!(context2 == null || (resources = context2.getResources()) == null)) {
                            str = resources.getString(R.string.ehv, String.valueOf(cVar.f17847a));
                        }
                    }
                    liveTextView.setText(str);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0443a(View view) {
            super(view);
            l.d(view, "");
            this.f21059a = (HSImageView) view.findViewById(R.id.uj);
            this.f21063e = (LiveGiftBoostCountDownView) view.findViewById(R.id.up);
            this.f21061c = view.findViewById(R.id.uo);
            this.f21060b = (LiveTextView) view.findViewById(R.id.ur);
            this.f21062d = (LiveTextView) view.findViewById(R.id.ui);
        }

        /* renamed from: com.bytedance.android.livesdk.rank.impl.view.a$a$c */
        static final class c<T> implements f.a.d.f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0443a f21067a;

            static {
                Covode.recordClassIndex(12437);
            }

            c(C0443a aVar) {
                this.f21067a = aVar;
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                LiveTextView liveTextView;
                Resources resources;
                Resources resources2;
                ArrayList<Long> arrayList = ((com.bytedance.android.livesdk.gift.d.a) obj).f17845a;
                int size = arrayList.size();
                if (size > 0 && (liveTextView = this.f21067a.f21060b) != null) {
                    String str = null;
                    if (!y.g()) {
                        View view = this.f21067a.itemView;
                        l.b(view, "");
                        Context context = view.getContext();
                        if (!(context == null || (resources2 = context.getResources()) == null)) {
                            Long l2 = arrayList.get(size - 1);
                            l.b(l2, "");
                            str = resources2.getString(R.string.ehu, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(l2.longValue()));
                        }
                    } else {
                        View view2 = this.f21067a.itemView;
                        l.b(view2, "");
                        Context context2 = view2.getContext();
                        if (!(context2 == null || (resources = context2.getResources()) == null)) {
                            Long l3 = arrayList.get(size - 1);
                            l.b(l3, "");
                            str = resources.getString(R.string.ehv, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(l3.longValue()));
                        }
                    }
                    liveTextView.setText(str);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // j.a.a.c
    public final /* synthetic */ void b(C0443a aVar) {
        C0443a aVar2 = aVar;
        l.d(aVar2, "");
        aVar2.f21064f.a();
        com.bytedance.android.livesdk.an.a.a().a(new b(false));
        aVar2.f21064f.a();
        super.b(aVar2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(C0443a aVar) {
        Resources resources;
        Resources resources2;
        C0443a aVar2 = aVar;
        l.d(aVar2, "");
        super.a(aVar2);
        com.bytedance.android.live.base.a a2 = com.bytedance.android.live.t.a.a(IGiftService.class);
        l.b(a2, "");
        t boostChartInfo = ((IGiftService) a2).getBoostChartInfo();
        if (boostChartInfo.f17940b) {
            HSImageView hSImageView = aVar2.f21059a;
            if (hSImageView != null) {
                k.a(hSImageView, "tiktok_live_basic_resource", boostChartInfo.f17943e);
            }
            View view = aVar2.f21061c;
            if (view != null) {
                view.setVisibility(0);
            }
            LiveTextView liveTextView = aVar2.f21062d;
            if (liveTextView != null) {
                String str = null;
                if (!y.g()) {
                    View view2 = aVar2.itemView;
                    l.b(view2, "");
                    Context context = view2.getContext();
                    if (!(context == null || (resources2 = context.getResources()) == null)) {
                        str = resources2.getString(R.string.ehu, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(boostChartInfo.f17939a));
                    }
                } else {
                    View view3 = aVar2.itemView;
                    l.b(view3, "");
                    Context context2 = view3.getContext();
                    if (!(context2 == null || (resources = context2.getResources()) == null)) {
                        str = resources.getString(R.string.ehv, ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(boostChartInfo.f17939a));
                    }
                }
                liveTextView.setText(str);
            }
            aVar2.f21064f.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.c.class).d(new C0443a.C0444a(aVar2)));
        } else if (boostChartInfo.f17941c) {
            View findViewById = aVar2.itemView.findViewById(R.id.ug);
            l.b(findViewById, "");
            findViewById.setVisibility(0);
            HSImageView hSImageView2 = aVar2.f21059a;
            if (hSImageView2 != null) {
                k.a(hSImageView2, "tiktok_live_basic_resource", boostChartInfo.f17943e);
            }
            LiveGiftBoostCountDownView liveGiftBoostCountDownView = aVar2.f21063e;
            if (liveGiftBoostCountDownView != null) {
                liveGiftBoostCountDownView.setTimer(boostChartInfo.f17942d);
            }
            aVar2.f21064f.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.rank.api.a.b.class).d(new C0443a.b(aVar2)));
            aVar2.f21064f.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.gift.d.a.class).d(new C0443a.c(aVar2)));
            com.bytedance.android.livesdk.an.a.a().a(new b(true));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    @Override // j.a.a.c
    public final /* synthetic */ void a(C0443a aVar, f fVar) {
        l.d(aVar, "");
        l.d(fVar, "");
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // j.a.a.c
    public final /* synthetic */ C0443a a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        l.d(layoutInflater, "");
        l.d(viewGroup, "");
        View a2 = com.a.a(layoutInflater, R.layout.b_x, viewGroup, false);
        l.b(a2, "");
        return new C0443a(a2);
    }
}
