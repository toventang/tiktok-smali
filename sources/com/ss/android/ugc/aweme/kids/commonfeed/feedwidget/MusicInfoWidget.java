package com.ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.MarqueeView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;

public final class MusicInfoWidget extends AbsFeedWidget {
    static {
        Covode.recordClassIndex(67857);
    }

    public static final class a extends com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a implements u<b> {

        /* renamed from: a  reason: collision with root package name */
        public MarqueeView f106083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f106084b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f106085c;

        static {
            Covode.recordClassIndex(67858);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final String b() {
            return "music_info";
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final Map<String, String> c() {
            String str;
            Music music;
            HashMap hashMap = new HashMap();
            Aweme aweme = this.f106099d;
            if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
                str = "";
            }
            hashMap.put("music_id", str);
            return hashMap;
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(DataCenter dataCenter) {
            DataCenter a2;
            DataCenter a3;
            if (dataCenter != null && (a2 = dataCenter.a("start_animation", (u<b>) this)) != null && (a3 = a2.a("pause_animation", (u<b>) this)) != null) {
                a3.a("stop_animation", (u<b>) this);
            }
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(View view) {
            MethodCollector.i(8418);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ad3, (ViewGroup) null);
                this.f106083a = (MarqueeView) inflate.findViewById(R.id.b26);
                frameLayout.addView(inflate);
            }
            MethodCollector.o(8418);
        }

        @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a
        public final void a(com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.a.a aVar) {
            String str;
            Music music;
            super.a(aVar);
            this.f106085c = false;
            MarqueeView marqueeView = this.f106083a;
            if (marqueeView != null) {
                Aweme aweme = this.f106099d;
                if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMusicName()) == null) {
                    str = "";
                }
                marqueeView.setText(str);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(b bVar) {
            b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f67014a;
                int hashCode = str.hashCode();
                if (hashCode != -463583257) {
                    if (hashCode != -301890681) {
                        if (hashCode == 64864379 && str.equals("pause_animation") && this.f106085c) {
                            MarqueeView marqueeView = this.f106083a;
                            if (marqueeView != null) {
                                marqueeView.b();
                            }
                            this.f106085c = false;
                        }
                    } else if (str.equals("stop_animation") && this.f106085c) {
                        MarqueeView marqueeView2 = this.f106083a;
                        if (marqueeView2 != null) {
                            marqueeView2.c();
                        }
                        this.f106085c = false;
                    }
                } else if (str.equals("start_animation") && !this.f106085c) {
                    MarqueeView marqueeView3 = this.f106083a;
                    if (marqueeView3 != null) {
                        marqueeView3.a();
                    }
                    this.f106085c = true;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, View view2) {
            super(view2);
            this.f106084b = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    public final com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.b.a b(View view) {
        return new a(view, view);
    }
}
