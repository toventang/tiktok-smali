package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.a;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.kids.choosemusic.g.c;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class b extends a {

    /* renamed from: b  reason: collision with root package name */
    protected Context f105671b;

    /* renamed from: c  reason: collision with root package name */
    public List<o> f105672c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f105673d;

    /* renamed from: e  reason: collision with root package name */
    TextView f105674e;

    /* renamed from: f  reason: collision with root package name */
    LinearLayout f105675f;

    /* renamed from: g  reason: collision with root package name */
    View f105676g;

    /* renamed from: h  reason: collision with root package name */
    int f105677h;

    /* renamed from: i  reason: collision with root package name */
    com.ss.android.ugc.aweme.kids.choosemusic.a f105678i;

    static {
        Covode.recordClassIndex(67678);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void a(o oVar);

    public final void a(final String str) {
        String a2;
        SpannableString spannableString;
        int measuredWidth = this.f105674e.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.f105674e.post(new Runnable() {
                /* class com.ss.android.ugc.aweme.kids.choosemusic.h.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(67679);
                }

                public final void run() {
                    b.this.a(str);
                }
            });
            return;
        }
        String concat = "#".concat(String.valueOf(str));
        TextPaint paint = this.f105674e.getPaint();
        String string = this.f105671b.getString(R.string.f9c);
        float measureText = ((float) measuredWidth) - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(concat) > measureText) {
            a2 = com.a.a(string, new Object[]{TextUtils.ellipsize(concat, paint, measureText, TextUtils.TruncateAt.END)});
            spannableString = new SpannableString(a2);
        } else {
            a2 = com.a.a(string, new Object[]{concat});
            spannableString = new SpannableString(a2);
        }
        spannableString.setSpan(new StyleSpan(1), string.indexOf("%s"), ((string.indexOf("%s") + 2) + a2.length()) - string.length(), 17);
        this.f105674e.setText(spannableString);
    }

    public b(View view, int i2) {
        super(view);
        this.f105671b = view.getContext();
        this.f105673d = (LinearLayout) view.findViewById(R.id.cel);
        this.f105674e = (TextView) view.findViewById(R.id.f_w);
        this.f105675f = (LinearLayout) view.findViewById(R.id.cem);
        this.f105676g = view.findViewById(R.id.flj);
        this.f105677h = i2;
        a();
        this.f105678i = new com.ss.android.ugc.aweme.kids.choosemusic.a("change_music_page", "attached_song", "", c.f105649a);
    }

    public final void a(Challenge challenge, List<MusicModel> list, int i2, int i3, String str, k kVar, com.ss.android.ugc.aweme.kids.a.a.c<com.ss.android.ugc.aweme.kids.choosemusic.b.b> cVar) {
        boolean z;
        String str2;
        if (challenge != null) {
            LayoutInflater from = LayoutInflater.from(this.f105671b);
            a(challenge.getChallengeName());
            this.f105678i.f105438g = str;
            int size = list.size() - this.f105675f.getChildCount();
            for (int i4 = 0; i4 < size; i4++) {
                o oVar = new o(com.a.a(from, R.layout.adm, this.f105675f, false), this.f105677h);
                this.f105672c.add(oVar);
                a(oVar);
                this.f105675f.addView(oVar.itemView);
            }
            for (int i5 = 0; i5 < this.f105672c.size(); i5++) {
                o oVar2 = this.f105672c.get(i5);
                MusicModel musicModel = list.get(i5);
                if (i2 == -2 && i5 == i3) {
                    z = true;
                } else {
                    z = false;
                }
                oVar2.a(musicModel, false, z, 0, i5, this.f105678i);
                oVar2.a(kVar, cVar);
                MusicModel musicModel2 = list.get(i5);
                com.ss.android.ugc.aweme.kids.choosemusic.a aVar = this.f105678i;
                if (musicModel2 != null) {
                    str2 = musicModel2.getMusicId();
                } else {
                    str2 = "";
                }
                c.a(aVar, str2, i5, true);
            }
            String shootWay = AVExternalServiceImpl.a().publishService().getShootWay();
            AVChallenge curChallenge = AVExternalServiceImpl.a().publishService().getCurChallenge();
            if (TextUtils.equals(shootWay, "challenge") && curChallenge != null && !com.bytedance.common.utility.collection.b.a((Collection) list) && curChallenge.isCommerce) {
                ArrayList arrayList = new ArrayList();
                for (MusicModel musicModel3 : list) {
                    if (musicModel3 != null) {
                        arrayList.add(musicModel3.getMusicId());
                    }
                }
                com.bytedance.apm.b.a("music_recommendations_monitor", 0, new com.ss.android.ugc.aweme.app.f.c().a("shoot_way", shootWay).a("challenge_id", curChallenge.cid).a("music_ids", arrayList.toString()).a());
            }
        }
    }
}
