package com.ss.android.ugc.aweme.video.hashtag;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.common.LogPbBean;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.shortvideo.view.q;
import com.ss.android.ugc.aweme.shortvideo.view.s;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f143404a;

    /* renamed from: b  reason: collision with root package name */
    public String f143405b;

    /* renamed from: c  reason: collision with root package name */
    public LogPbBean f143406c;

    /* renamed from: d  reason: collision with root package name */
    private List<b> f143407d;

    /* renamed from: e  reason: collision with root package name */
    private Context f143408e;

    /* renamed from: f  reason: collision with root package name */
    private d f143409f;

    /* renamed from: g  reason: collision with root package name */
    private HashTagMobHelper f143410g;

    static {
        Covode.recordClassIndex(93847);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f143407d.size();
    }

    /* access modifiers changed from: package-private */
    public static class b extends s<q> {
        static {
            Covode.recordClassIndex(93852);
        }

        public b(q qVar) {
            super(qVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return this.f143407d.get(i2).f143398b;
    }

    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f143421a;

        /* renamed from: b  reason: collision with root package name */
        ImageView f143422b;

        /* renamed from: c  reason: collision with root package name */
        TextView f143423c;

        /* renamed from: d  reason: collision with root package name */
        LinearLayout f143424d;

        /* renamed from: e  reason: collision with root package name */
        ImageView f143425e;

        static {
            Covode.recordClassIndex(93851);
        }

        public a(View view) {
            super(view);
            this.f143421a = (TextView) view.findViewById(R.id.bel);
            this.f143422b = (ImageView) view.findViewById(R.id.bei);
            this.f143423c = (TextView) view.findViewById(R.id.bek);
            this.f143424d = (LinearLayout) view.findViewById(R.id.adh);
            this.f143425e = (ImageView) view.findViewById(R.id.bn0);
        }
    }

    private void a(b bVar, int i2) {
        HashTagMobHelper hashTagMobHelper = this.f143410g;
        if (hashTagMobHelper != null) {
            hashTagMobHelper.a(bVar, Integer.valueOf(i2));
            if (TextUtils.equals(bVar.f143402f, "search")) {
                this.f143410g.b(bVar, Integer.valueOf(i2));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i2) {
        final b bVar;
        int i3;
        if (i2 < 0 || i2 >= this.f143407d.size()) {
            bVar = null;
        } else {
            bVar = this.f143407d.get(i2);
        }
        final String str = "";
        if ((viewHolder instanceof a) && bVar != null) {
            String challengeName = bVar.f143397a.getChallengeName();
            if (challengeName == null) {
                challengeName = str;
            }
            if (!challengeName.startsWith("#")) {
                challengeName = "#".concat(String.valueOf(challengeName));
            }
            if (TextUtils.equals(bVar.f143402f, "search")) {
                str = "search_hashtag";
            } else if (TextUtils.equals(bVar.f143402f, "history")) {
                str = "history_hashtag";
            } else if (TextUtils.equals(bVar.f143402f, "recommendation")) {
                str = "thumb_up_hashtag";
            }
            a aVar = (a) viewHolder;
            final boolean a2 = AVCommerceServiceImpl.h().a(this.f143408e, challengeName, aVar.f143421a, true, str);
            AVChallenge aVChallenge = bVar.f143397a;
            String str2 = this.f143405b;
            int i4 = 0;
            if (i2 != 0 || !aVChallenge.isNew(str2)) {
                String a3 = com.ss.android.ugc.aweme.i18n.b.a(aVChallenge.getViewCount());
                aVar.f143423c.setText(aVar.f143423c.getResources().getQuantityString(R.plurals.d0, (int) aVChallenge.getViewCount(), a3));
                aVar.f143423c.setTextColor(aVar.f143423c.getResources().getColor(R.color.c5));
            } else {
                aVar.f143423c.setText(R.string.fi0);
                aVar.f143423c.setTextColor(aVar.f143423c.getResources().getColor(R.color.bi));
            }
            TextView textView = aVar.f143423c;
            if (!bVar.f143400d) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
            aVar.f143425e.setVisibility(4);
            int i5 = bVar.f143399c;
            ImageView imageView = aVar.f143422b;
            if (!this.f143404a || i5 <= 0) {
                i4 = 8;
            }
            imageView.setVisibility(i4);
            if (i5 > 0) {
                aVar.f143422b.setImageResource(i5);
            }
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.video.hashtag.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(93848);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    c.this.a(bVar, i2, a2, str);
                }
            });
            if (bVar.f143401e != null) {
                bVar.f143401e.a(this.f143408e, i2);
            }
            if (bVar.f143398b == 2) {
                aVar.f143424d.setOnTouchListener(new View.OnTouchListener() {
                    /* class com.ss.android.ugc.aweme.video.hashtag.c.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(93849);
                    }

                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            ((a) viewHolder).f143424d.setAlpha(0.5f);
                            return false;
                        } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                            return false;
                        } else {
                            ((a) viewHolder).f143424d.setAlpha(1.0f);
                            return false;
                        }
                    }
                });
            }
            a(bVar, i2);
        } else if ((viewHolder instanceof b) && bVar != null) {
            String challengeName2 = bVar.f143397a.getChallengeName();
            if (challengeName2 != null) {
                str = challengeName2;
            }
            if (!str.startsWith("#")) {
                str = "#".concat(String.valueOf(str));
            }
            s sVar = (s) viewHolder;
            ((q) sVar.f132669a).setTagName(str);
            ((q) sVar.f132669a).setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.video.hashtag.c.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(93850);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    c.this.a(bVar, i2, false, "");
                }
            });
            a(bVar, i2);
        }
    }

    public c(Context context, List list, d dVar) {
        if (context instanceof e) {
            this.f143410g = (HashTagMobHelper) ae.a((e) context, (ad.b) null).a(HashTagMobHelper.class);
        }
        this.f143407d = list;
        this.f143408e = context;
        this.f143409f = dVar;
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(8691);
        if (i2 == 2) {
            viewHolder = new a(com.a.a(LayoutInflater.from(cVar.f143408e), R.layout.a_n, viewGroup, false));
        } else if (i2 != 3) {
            viewHolder = null;
        } else {
            viewHolder = new b(new q(cVar.f143408e));
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
        MethodCollector.o(8691);
        return viewHolder;
    }

    public final void a(b bVar, int i2, boolean z, String str) {
        String str2;
        if (z) {
            AVCommerceServiceImpl.h().a(str, bVar.f143397a.challengeName);
        }
        d dVar = this.f143409f;
        if (dVar != null) {
            dVar.a(bVar.f143397a);
        }
        if (bVar.f143401e != null) {
            bVar.f143401e.b(this.f143408e, i2);
        }
        HashTagMobHelper hashTagMobHelper = this.f143410g;
        if (hashTagMobHelper != null) {
            String str3 = null;
            hashTagMobHelper.a("click_tag_button", bVar, Integer.valueOf(i2), null);
            if (TextUtils.equals(bVar.f143402f, "search")) {
                HashTagMobHelper hashTagMobHelper2 = this.f143410g;
                Integer valueOf = Integer.valueOf(i2);
                if (valueOf != null) {
                    valueOf.intValue();
                    String str4 = bVar.f143397a.cid;
                    com.ss.android.ugc.aweme.common.s a2 = new com.ss.android.ugc.aweme.common.s().a("words_content", bVar.f143397a.challengeName).a("words_position", String.valueOf(valueOf.intValue())).a("words_source", "sug").a("search_position", "challenge_create").a("raw_query", hashTagMobHelper2.f128462d).a("rank", "-1");
                    RecommendWordMob recommendWordMob = hashTagMobHelper2.f128461c;
                    if (recommendWordMob != null) {
                        str2 = recommendWordMob.getQueryId();
                    } else {
                        str2 = null;
                    }
                    com.ss.android.ugc.aweme.common.s a3 = a2.a("query_id", str2).a("group_id", str4);
                    if (hashTagMobHelper2.f128460b != null && !bVar.f143403g) {
                        LogPbBean logPbBean = hashTagMobHelper2.f128460b;
                        if (logPbBean != null) {
                            str3 = logPbBean.getImprId();
                        }
                    } else {
                        str3 = "";
                    }
                    r.a("trending_words_click", a3.a("impr_id", str3).a());
                }
            }
        }
    }
}
