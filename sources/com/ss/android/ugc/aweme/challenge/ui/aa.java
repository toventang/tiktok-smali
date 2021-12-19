package com.ss.android.ugc.aweme.challenge.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.challenge.model.RelatedChallengeMusic;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.List;

public final class aa extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    Context f70109a;

    /* renamed from: b  reason: collision with root package name */
    String f70110b;

    /* renamed from: c  reason: collision with root package name */
    String f70111c;

    /* renamed from: d  reason: collision with root package name */
    private List<RelatedChallengeMusic> f70112d;

    static {
        Covode.recordClassIndex(43242);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (b.a((Collection) this.f70112d)) {
            return 0;
        }
        return this.f70112d.size();
    }

    /* access modifiers changed from: package-private */
    public static class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        TextView f70113a;

        /* renamed from: b  reason: collision with root package name */
        LinearLayout f70114b;

        static {
            Covode.recordClassIndex(43243);
        }

        a(View view) {
            super(view);
            this.f70113a = (TextView) view.findViewById(R.id.csg);
            this.f70114b = (LinearLayout) view.findViewById(R.id.dkb);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        RelatedChallengeMusic relatedChallengeMusic = this.f70112d.get(i2);
        if (relatedChallengeMusic == null) {
            return super.getItemViewType(i2);
        }
        int i3 = relatedChallengeMusic.categoryType;
        int i4 = 1;
        if (i3 != 1) {
            i4 = 2;
            if (i3 != 2) {
                return 0;
            }
        }
        return i4;
    }

    private void a(a aVar, Music music) {
        if (music != null) {
            aVar.f70113a.setText(music.getMusicName());
            Context context = this.f70109a;
            if (!MusicService.m().a(music.convertToMusicModel(), context, true)) {
                aVar.f70114b.setOnClickListener(new ab(this, music));
            } else {
                aVar.f70114b.setOnClickListener(null);
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        a aVar2 = aVar;
        RelatedChallengeMusic relatedChallengeMusic = this.f70112d.get(i2);
        if (relatedChallengeMusic != null) {
            int itemViewType = getItemViewType(i2);
            if (itemViewType == 1) {
                a(aVar2, relatedChallengeMusic.music);
            } else if (itemViewType != 2) {
                Music music = relatedChallengeMusic.music;
                if (music != null) {
                    a(aVar2, music);
                    return;
                }
                Challenge challenge = relatedChallengeMusic.challenge;
                if (challenge != null) {
                    a(aVar2, challenge);
                }
            } else {
                a(aVar2, relatedChallengeMusic.challenge);
            }
        }
    }

    private void a(a aVar, Challenge challenge) {
        if (challenge != null) {
            aVar.f70113a.setText("#" + challenge.getChallengeName());
            aVar.f70114b.setOnClickListener(new ac(this, challenge));
            r.a("related_tag_show", new d().a("related_tag_id", challenge.getCid()).a("tag_id", this.f70110b).f66730a);
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        MethodCollector.i(12266);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i3 = R.layout.w2;
        boolean z = true;
        if (i2 == 1) {
            i3 = R.layout.w8;
        }
        a aVar = new a(com.a.a(from, i3, viewGroup, false));
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
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
        MethodCollector.o(12266);
        return aVar;
    }

    public aa(Context context, List<RelatedChallengeMusic> list, String str, String str2) {
        this.f70109a = context;
        this.f70112d = list;
        this.f70110b = str;
        this.f70111c = str2;
    }
}
