package com.ss.android.ugc.aweme.discover.alading.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.a.ag;
import com.ss.android.ugc.aweme.discover.alading.a.b;
import com.ss.android.ugc.aweme.discover.alading.a.d;
import com.ss.android.ugc.aweme.discover.helper.n;
import com.ss.android.ugc.aweme.discover.helper.t;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.k.ak;
import com.ss.android.ugc.aweme.search.k.r;
import com.ss.android.ugc.aweme.search.k.s;
import com.ss.android.ugc.aweme.utils.ay;
import com.ss.android.ugc.aweme.utils.by;
import com.ss.android.ugc.aweme.utils.cb;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.iu;
import com.zhiliaoapp.musically.R;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.j.h;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    public static String f80707f;

    /* renamed from: g  reason: collision with root package name */
    public static final int f80708g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f80709h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final C1882a f80710i = new C1882a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<? extends Aweme> f80711a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    final t<Aweme> f80712b = new t<>(this);

    /* renamed from: c  reason: collision with root package name */
    public final Context f80713c;

    /* renamed from: d  reason: collision with root package name */
    public final c f80714d;

    /* renamed from: e  reason: collision with root package name */
    public r f80715e;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.alading.a.a$a  reason: collision with other inner class name */
    public static final class C1882a {
        static {
            Covode.recordClassIndex(50196);
        }

        private C1882a() {
        }

        public /* synthetic */ C1882a(byte b2) {
            this();
        }
    }

    public static final class b implements h.f.a.b<Aweme, Aweme> {
        static {
            Covode.recordClassIndex(50197);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* bridge */ /* synthetic */ Aweme invoke(Aweme aweme) {
            return aweme;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f80711a.size();
    }

    static {
        Covode.recordClassIndex(50195);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (((Aweme) this.f80711a.get(i2)).isLive()) {
            return f80709h;
        }
        return f80708g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        UrlModel urlModel;
        long j2;
        Drawable a2;
        boolean z;
        VideoTag videoTag;
        int i3;
        Drawable a3;
        String str;
        String str2;
        Video video;
        VideoTag videoTag2;
        l.d(viewHolder, "");
        Aweme aweme = (Aweme) this.f80711a.get(i2);
        int i4 = 0;
        Long l2 = null;
        UrlModel urlModel2 = null;
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            r rVar = this.f80715e;
            l.d(aweme, "");
            l.d(rVar, "");
            bVar.f80724g = aweme;
            if (ag.a()) {
                bVar.f80722e.getLayoutParams().height = (int) by.a(32);
                View view = bVar.f80722e;
                View view2 = bVar.itemView;
                l.b(view2, "");
                view.setBackground(androidx.core.content.b.a(view2.getContext(), (int) R.drawable.bec));
            } else if (ag.b() || ag.c()) {
                bVar.f80722e.getLayoutParams().height = (int) by.a(32);
                View view3 = bVar.f80722e;
                View view4 = bVar.itemView;
                l.b(view4, "");
                view3.setBackground(androidx.core.content.b.a(view4.getContext(), (int) R.drawable.bed));
            } else {
                View view5 = bVar.f80722e;
                View view6 = bVar.itemView;
                l.b(view6, "");
                view5.setBackground(androidx.core.content.b.a(view6.getContext(), (int) R.drawable.bee));
            }
            TextView textView = bVar.f80720c;
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                j2 = statistics.getDiggCount();
            } else {
                j2 = 0;
            }
            textView.setText(com.ss.android.ugc.aweme.i18n.b.a(j2));
            if (ag.c()) {
                iu.a(bVar.f80720c);
                View view7 = bVar.itemView;
                l.b(view7, "");
                a2 = n.a(aweme, view7.getContext(), 2131233608);
            } else {
                View view8 = bVar.itemView;
                l.b(view8, "");
                a2 = n.a(aweme, view8.getContext(), 2131233607);
            }
            if (bVar.f80723f) {
                bVar.f80720c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
            } else {
                bVar.f80720c.setCompoundDrawablesWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            if (aweme.getNewLabel() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar.f80721d.setVisibility(0);
                Video video2 = aweme.getVideo();
                if (!(video2 == null || (videoTag = video2.getVideoTag()) == null)) {
                    String title = videoTag.getTitle();
                    if (title == null || title.length() == 0) {
                        bVar.f80721d.setVisibility(8);
                    } else {
                        Integer a4 = ay.a(videoTag.getBackgroundColor());
                        Integer a5 = ay.a(videoTag.getFontColor());
                        TextView textView2 = bVar.f80721d;
                        textView2.setText(videoTag.getTitle());
                        textView2.setAlpha(((float) h.a(videoTag.getOpacity(), 0, 100)) / 100.0f);
                        if (a5 != null) {
                            i3 = a5.intValue();
                        } else {
                            i3 = -1;
                        }
                        textView2.setTextColor(i3);
                        if (a4 != null) {
                            a3 = cb.a(a4.intValue(), b.f80716i);
                        } else {
                            a3 = androidx.core.content.b.a(textView2.getContext(), (int) R.drawable.bc7);
                        }
                        textView2.setBackground(a3);
                        if (aweme.getNewLabel() == 1) {
                            str = "New";
                        } else {
                            str = "";
                        }
                        if (!TextUtils.isEmpty(str)) {
                            Video video3 = aweme.getVideo();
                            if (video3 == null || (videoTag2 = video3.getVideoTag()) == null) {
                                str2 = null;
                            } else {
                                str2 = videoTag2.getTitle();
                            }
                            if (TextUtils.isEmpty(str2) && (video = aweme.getVideo()) != null) {
                                VideoTag videoTag3 = new VideoTag();
                                videoTag3.setTitle(str);
                                video.setVideoTag(videoTag3);
                            }
                        }
                    }
                }
            } else {
                bVar.f80721d.setVisibility(8);
            }
            Video video4 = aweme.getVideo();
            if (video4 != null) {
                urlModel2 = video4.getCover();
            }
            v a6 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel2)).a("AwemeCardListAdapter");
            a6.E = bVar.f80719b;
            a6.c();
            bVar.f80718a.setOnClickListener(new b.View$OnClickListenerC1883b(bVar, aweme));
            c cVar = this.f80714d;
            View view9 = viewHolder.itemView;
            l.b(view9, "");
            cVar.b(i2, view9, aweme, this.f80711a);
        } else if (viewHolder instanceof d) {
            d dVar = (d) viewHolder;
            r rVar2 = this.f80715e;
            l.d(aweme, "");
            l.d(rVar2, "");
            dVar.f80730c = aweme;
            User author = aweme.getAuthor();
            if (author == null || (urlModel = author.roomCover) == null) {
                User author2 = aweme.getAuthor();
                l.b(author2, "");
                urlModel = author2.getAvatarLarger();
            }
            v a7 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.aweme.base.v.a(urlModel)).a("AwemeCardListAdapter");
            a7.E = dVar.f80729b;
            a7.c();
            dVar.f80728a.setOnClickListener(new d.a(dVar, aweme, rVar2));
            HashMap hashMap = new HashMap();
            hashMap.put("sdk_version", "2160");
            hashMap.put("_param_live_platform", "live");
            hashMap.put("list_item_id", String.valueOf(aweme.getAuthor().roomId));
            ak akVar = (ak) new s().r(rVar2.f121272g).p("live_cover");
            User author3 = aweme.getAuthor();
            if (author3 != null) {
                l2 = Long.valueOf(author3.roomId);
            }
            s sVar = (s) akVar.s(String.valueOf(l2)).e(aweme.getAuthor().getUid()).q("click").a(rVar2.f121274i).f(rVar2.f121269d).b(rVar2.f121271f).g(aweme.getAuthor().getUid()).n(aweme.getRequestId());
            User author4 = aweme.getAuthor();
            if (author4 != null) {
                i4 = author4.getFollowStatus();
            }
            sVar.a(i4).a(hashMap).f();
            c cVar2 = this.f80714d;
            View view10 = viewHolder.itemView;
            l.b(view10, "");
            cVar2.b(i2, view10, aweme, this.f80711a);
        }
    }

    public a(Context context, c cVar, r rVar) {
        l.d(context, "");
        l.d(cVar, "");
        l.d(rVar, "");
        this.f80713c = context;
        this.f80714d = cVar;
        this.f80715e = rVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements q<View, Integer, Aweme, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50198);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(3);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(View view, Integer num, Aweme aweme) {
            View view2 = view;
            int intValue = num.intValue();
            Aweme aweme2 = aweme;
            l.d(view2, "");
            l.d(aweme2, "");
            List<? extends Aweme> list = this.this$0.f80711a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.isLive()) {
                    arrayList.add(t);
                }
            }
            this.this$0.f80714d.a(intValue, view2, aweme2, arrayList);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements q<View, Integer, Aweme, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(50199);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(3);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(View view, Integer num, Aweme aweme) {
            View view2 = view;
            int intValue = num.intValue();
            Aweme aweme2 = aweme;
            l.d(view2, "");
            l.d(aweme2, "");
            List<? extends Aweme> list = this.this$0.f80711a;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (!t.isLive()) {
                    arrayList.add(t);
                }
            }
            this.this$0.f80714d.a(intValue, view2, aweme2, arrayList);
            return z.f158842a;
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(3359);
        l.d(viewGroup, "");
        if (i2 == f80709h) {
            viewHolder = new d(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.avl), new c(aVar));
        } else {
            viewHolder = new b(com.ss.android.ugc.aweme.search.l.m.a(viewGroup, R.layout.ava), new d(aVar));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(3359);
        return viewHolder;
    }
}
