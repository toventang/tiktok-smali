package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class b extends a {

    /* renamed from: b  reason: collision with root package name */
    protected Context f70801b;

    /* renamed from: c  reason: collision with root package name */
    public List<s> f70802c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f70803d;

    /* renamed from: e  reason: collision with root package name */
    TextView f70804e;

    /* renamed from: f  reason: collision with root package name */
    TextView f70805f;

    /* renamed from: g  reason: collision with root package name */
    LinearLayout f70806g;

    /* renamed from: h  reason: collision with root package name */
    View f70807h;

    /* renamed from: i  reason: collision with root package name */
    int f70808i;

    /* renamed from: j  reason: collision with root package name */
    com.ss.android.ugc.aweme.choosemusic.b f70809j;

    static {
        Covode.recordClassIndex(43633);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(s sVar);

    private static void a(List<MusicModel> list) {
        String shootWay = AVExternalServiceImpl.a().publishService().getShootWay();
        AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
        if (TextUtils.equals(shootWay, "challenge") && curChallenge != null && !com.bytedance.common.utility.collection.b.a((Collection) list) && curChallenge.isCommerce) {
            ArrayList arrayList = new ArrayList();
            for (MusicModel musicModel : list) {
                if (musicModel != null) {
                    arrayList.add(musicModel.getMusicId());
                }
            }
            com.bytedance.apm.b.a("music_recommendations_monitor", 0, new c().a("shoot_way", shootWay).a("challenge_id", curChallenge.cid).a("music_ids", arrayList.toString()).a());
        }
    }

    public b(View view, int i2) {
        super(view);
        this.f70801b = view.getContext();
        this.f70803d = (LinearLayout) view.findViewById(R.id.cel);
        this.f70804e = (TextView) view.findViewById(R.id.f_w);
        this.f70805f = (TextView) view.findViewById(R.id.f0b);
        this.f70806g = (LinearLayout) view.findViewById(R.id.cem);
        this.f70807h = view.findViewById(R.id.flj);
        this.f70808i = i2;
        a();
        this.f70809j = new com.ss.android.ugc.aweme.choosemusic.b("change_music_page", "attached_song", "", com.ss.android.ugc.aweme.choosemusic.utils.b.f70718a);
    }

    public final void a(Challenge challenge, List<MusicModel> list, int i2, int i3, String str, s sVar, k<com.ss.android.ugc.aweme.choosemusic.b.c> kVar) {
        boolean z;
        String str2;
        if (challenge != null) {
            LayoutInflater from = LayoutInflater.from(this.f70801b);
            String challengeName = challenge.getChallengeName();
            this.f70804e.setText(this.f70801b.getString(R.string.f9c).replace("%s", ""));
            if (gb.a(this.f70801b)) {
                this.f70805f.setGravity(5);
            }
            String concat = "#".concat(String.valueOf(challengeName));
            UrlModel a2 = CommerceChallengeServiceImpl.e().a(concat, true, true);
            if (a2 != null) {
                concat = concat + " ";
            }
            SpannableString spannableString = new SpannableString(concat);
            spannableString.setSpan(new StyleSpan(1), 0, concat.length(), 17);
            if (a2 != null) {
                CommerceChallengeServiceImpl.e().a(this.f70801b, challengeName, a2, spannableString, this.f70805f, "basedon_music_hashtag");
            } else {
                this.f70805f.setText(spannableString);
            }
            this.f70809j.f70385g = str;
            int size = list.size() - this.f70806g.getChildCount();
            for (int i4 = 0; i4 < size; i4++) {
                s sVar2 = new s(com.a.a(from, R.layout.aa2, this.f70806g, false), this.f70808i);
                this.f70802c.add(sVar2);
                a(sVar2);
                this.f70806g.addView(sVar2.itemView);
            }
            for (int i5 = 0; i5 < this.f70802c.size(); i5++) {
                s sVar3 = this.f70802c.get(i5);
                MusicModel musicModel = list.get(i5);
                if (i2 == -2 && i5 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                sVar3.a(musicModel, false, false, z, 0, i5, this.f70809j);
                sVar3.a(sVar, kVar);
                MusicModel musicModel2 = list.get(i5);
                com.ss.android.ugc.aweme.choosemusic.b bVar = this.f70809j;
                if (musicModel2 != null) {
                    str2 = musicModel2.getMusicId();
                } else {
                    str2 = "";
                }
                com.ss.android.ugc.aweme.choosemusic.utils.b.a(bVar, str2, i5);
            }
            a(list);
        }
    }
}
