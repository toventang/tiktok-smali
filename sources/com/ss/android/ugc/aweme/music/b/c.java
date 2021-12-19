package com.ss.android.ugc.aweme.music.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class c extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    List<RelatedChallengeMusic> f111310a;

    /* renamed from: b  reason: collision with root package name */
    public String f111311b;

    /* renamed from: c  reason: collision with root package name */
    public Context f111312c;

    /* renamed from: d  reason: collision with root package name */
    public String f111313d;

    static {
        Covode.recordClassIndex(71533);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (b.a((Collection) this.f111310a)) {
            return 0;
        }
        return this.f111310a.size();
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f111317a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f111318b;

        static {
            Covode.recordClassIndex(71535);
        }

        a(View view) {
            super(view);
            this.f111317a = (TextView) view.findViewById(R.id.csg);
            this.f111318b = (LinearLayout) view.findViewById(R.id.dkb);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        RelatedChallengeMusic relatedChallengeMusic = this.f111310a.get(i2);
        if (relatedChallengeMusic != null) {
            int i3 = relatedChallengeMusic.categoryType;
            if (i3 == 1) {
                return 1;
            }
            if (i3 == 2) {
                return 2;
            }
        }
        return super.getItemViewType(i2);
    }

    public c(List<RelatedChallengeMusic> list, Context context) {
        this.f111310a = list;
        this.f111312c = context;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        Music music;
        a aVar2 = aVar;
        final int itemViewType = getItemViewType(i2);
        final RelatedChallengeMusic relatedChallengeMusic = this.f111310a.get(i2);
        if (relatedChallengeMusic != null) {
            if (itemViewType == 2) {
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    aVar2.f111317a.setText(challenge.getChallengeName());
                }
            } else if (itemViewType == 1 && (music = relatedChallengeMusic.music) != null) {
                aVar2.f111317a.setText(music.getMusicName());
            }
            aVar2.f111318b.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.ugc.aweme.music.b.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(71534);
                }

                public final void onClick(View view) {
                    Challenge challenge;
                    ClickAgent.onClick(view);
                    int i2 = itemViewType;
                    if (i2 == 1) {
                        Music music = relatedChallengeMusic.music;
                        if (music == null) {
                            return;
                        }
                        if (MusicService.m().a(music.convertToMusicModel(), c.this.f111312c, true)) {
                            r.onEvent(MobClick.obtain().setEventName("choose_music").setLabelName(c.this.f111313d).setValue(music.getMid()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("host", c.this.f111311b).a()));
                            SmartRouter.buildRoute(view.getContext(), "aweme://music/detail/").withParam("id", music.getMid()).withParam("extra_music_from", "from_related_tag").open();
                        }
                    } else if (i2 == 2 && (challenge = relatedChallengeMusic.challenge) != null) {
                        CommerceChallengeServiceImpl.e().a(challenge);
                        r.onEvent(MobClick.obtain().setEventName("choose_challenge").setLabelName(c.this.f111313d).setValue(challenge.getCid()).setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("host", c.this.f111311b).a()));
                        SmartRouter.buildRoute(c.this.f111312c, "//challenge/detail").withParam("aweme_id", "").withParam("id", challenge.getCid()).withParam("extra_challenge_from", "from_related_tag").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("extra_challenge_is_hashtag", false).open();
                    }
                }
            });
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View a2;
        boolean a3;
        MethodCollector.i(11018);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 2) {
            a2 = com.a.a(from, R.layout.w1, viewGroup, false);
        } else {
            a2 = com.a.a(from, R.layout.w8, viewGroup, false);
        }
        a aVar = new a(a2);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a3 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a3) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(11018);
        return aVar;
    }
}
