package com.ss.android.ugc.aweme.kids.choosemusic.c;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.a.h.d;
import com.ss.android.ugc.aweme.kids.choosemusic.g.a;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class d<T> extends a implements u<b>, a.AbstractC1507a<T>, c<com.ss.android.ugc.aweme.kids.choosemusic.b.b>, com.ss.android.ugc.aweme.kids.a.h.c, com.ss.android.ugc.aweme.kids.choosemusic.d.b, i, j {

    /* renamed from: a  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.kids.choosemusic.g.a f105527a;

    /* renamed from: b  reason: collision with root package name */
    protected MusicModel f105528b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f105529c = true;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.kids.choosemusic.e.a f105530d;

    /* renamed from: e  reason: collision with root package name */
    public DataCenter f105531e;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.arch.c<T> f105532j;

    /* renamed from: k  reason: collision with root package name */
    protected int f105533k;

    /* renamed from: l  reason: collision with root package name */
    private com.ss.android.ugc.aweme.arch.a f105534l;

    static {
        Covode.recordClassIndex(67604);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.aweme.arch.c<T> b(View view);

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(288, new g(d.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.kids.a.d.a.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract int n();

    /* access modifiers changed from: protected */
    public abstract String o();

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final MusicModel h() {
        return this.f105528b;
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final Activity i() {
        return getActivity();
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final boolean j() {
        return ab_();
    }

    public RecyclerView.a k() {
        com.ss.android.ugc.aweme.arch.c<T> cVar = this.f105532j;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.f105527a;
        if (aVar != null) {
            aVar.a();
            this.f105527a.d();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.f105527a;
        if (aVar != null) {
            aVar.f105361k = false;
        }
    }

    private boolean l() {
        if (getActivity().getIntent() != null) {
            return getActivity().getIntent().getBooleanExtra("extra_beat_music_sticker", false);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public void a() {
        this.f105530d = new com.ss.android.ugc.aweme.kids.choosemusic.e.a(getContext(), this.f105531e);
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public DataCenter e() {
        if (this.f105531e == null) {
            this.f105531e = DataCenter.a(ae.a(this, (ad.b) null), this);
        }
        this.f105531e.a("music_collect_status", (u<b>) this).a("play_compeleted", (u<b>) this);
        return this.f105531e;
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.f105527a;
        if (aVar != null) {
            aVar.a();
            this.f105527a.f105361k = true;
        }
        RecyclerView.a k2 = k();
        if (k2 instanceof com.ss.android.ugc.aweme.kids.choosemusic.a.b) {
            ((com.ss.android.ugc.aweme.kids.choosemusic.a.b) k2).l();
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void a(d.a aVar) {
        this.f105527a.f105358h = aVar;
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final com.ss.android.ugc.aweme.arch.c<T> a(View view) {
        if (this.f105532j == null) {
            this.f105532j = b(view);
        }
        return this.f105532j;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void b(MusicModel musicModel) {
        this.f105527a.f105359i = o();
        this.f105527a.c(musicModel, n(), l());
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f105533k = i2;
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void a(MusicModel musicModel) {
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = this.f105527a;
        if (aVar != null) {
            aVar.a();
        }
    }

    @r(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.kids.a.d.a aVar) {
        if (this.f105531e != null && aVar != null && "music_detail".equals(aVar.f105302c)) {
            this.f105531e.a("music_collect_status", new com.ss.android.ugc.aweme.kids.choosemusic.b.a(0, aVar.f105300a, -1, -1, aVar.f105301b));
        }
    }

    /* renamed from: a */
    public void onChanged(b bVar) {
        int i2;
        int i3;
        MusicModel.CollectionType collectionType;
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            if (str.equals("music_collect_status")) {
                com.ss.android.ugc.aweme.kids.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.kids.choosemusic.b.a) bVar.a();
                com.ss.android.ugc.aweme.arch.c<T> cVar = this.f105532j;
                if (!(cVar == null || cVar.c() == null)) {
                    List<T> e2 = this.f105532j.c().e();
                    if (com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                        return;
                    }
                    if (aVar.f105496a == 1) {
                        if (e2.size() > aVar.f105498c) {
                            this.f105532j.c().notifyItemChanged(aVar.f105498c);
                        }
                    } else if (aVar.f105498c == -1) {
                        String musicId = aVar.f105500e.getMusicId();
                        if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                            for (T t : e2) {
                                if (t != null && m.a(t.getMusicId(), musicId)) {
                                    if (aVar.f105499d == 1) {
                                        collectionType = MusicModel.CollectionType.COLLECTED;
                                    } else {
                                        collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                    }
                                    t.setCollectionType(collectionType);
                                    int indexOf = e2.indexOf(t);
                                    if (indexOf >= 0 && indexOf < e2.size() && g()) {
                                        this.f105532j.c().notifyItemChanged(indexOf);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if (getUserVisibleHint()) {
                    if (aVar.f105496a == 1) {
                        if (aVar.f105499d == 1) {
                            i3 = R.string.ahj;
                        } else {
                            i3 = R.string.a9i;
                        }
                        new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(i3).a();
                        return;
                    }
                    if (aVar.f105499d == 1) {
                        i2 = R.string.aho;
                    } else {
                        i2 = R.string.a9j;
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(i2).a();
                }
            } else if (str.equals("play_compeleted") && (k() instanceof com.ss.android.ugc.aweme.kids.choosemusic.a.b)) {
                ((com.ss.android.ugc.aweme.kids.choosemusic.a.b) k()).l();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.kids.a.a.c
    public final /* synthetic */ void a(com.ss.android.ugc.aweme.kids.choosemusic.b.b bVar) {
        com.ss.android.ugc.aweme.kids.choosemusic.b.b bVar2 = bVar;
        String str = bVar2.f105502b;
        MusicModel musicModel = bVar2.f105501a;
        if ("follow_type".equals(str)) {
            this.f105530d.a(musicModel, musicModel.getMusicId(), 1, bVar2.f105503c, bVar2.f105504d);
        } else if ("unfollow_type".equals(str)) {
            this.f105530d.a(musicModel, musicModel.getMusicId(), 0, bVar2.f105503c, bVar2.f105504d);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f105534l == null) {
            this.f105534l = new com.ss.android.ugc.aweme.arch.a(this);
        }
        this.f105534l.a(view);
        com.ss.android.ugc.aweme.kids.choosemusic.g.a aVar = new com.ss.android.ugc.aweme.kids.choosemusic.g.a(this, new a.AbstractC2696a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.c.d.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67605);
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.g.a.AbstractC2696a
            public final void a() {
                if (d.this.f105528b != null) {
                    d.this.f105531e.a("play_compeleted", d.this.f105528b.getMusicId());
                }
            }

            @Override // com.ss.android.ugc.aweme.kids.choosemusic.g.a.AbstractC2696a
            public final void b() {
                if (d.this.f105528b != null) {
                    d.this.f105531e.a("play_error", d.this.f105528b.getMusicId());
                }
            }
        });
        this.f105527a = aVar;
        aVar.c();
        this.f105527a.b(this.f105533k);
        RecyclerView.a k2 = k();
        if (k2 instanceof com.ss.android.ugc.aweme.kids.choosemusic.a.b) {
            this.f105527a.f105642a = ((com.ss.android.ugc.aweme.kids.choosemusic.a.b) k2).f105454e;
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.choosemusic.d.b
    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.kids.choosemusic.a aVar) {
        this.f105528b = musicModel;
        if (this.f105529c) {
            this.f105527a.f105642a = aVar;
            this.f105527a.a(musicModel, n(), false);
            return;
        }
        this.f105527a.c(musicModel, n(), l());
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.adi, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.kids.a.h.c
    public final void a(String str, MusicModel musicModel, String str2) {
        final e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            com.ss.android.ugc.aweme.kids.a.i.c.a(musicModel);
            AVExternalServiceImpl.a().publishService().setCurMusic(musicModel, true, false);
            if (this.f105533k == 1) {
                final RecordConfig.Builder builder = new RecordConfig.Builder();
                builder.musicOrigin(str2).musicModel(musicModel).musicPath(str);
                AVExternalServiceImpl.a().asyncService("BaseMuiscList", new SimpleServiceLoadCallback() {
                    /* class com.ss.android.ugc.aweme.kids.choosemusic.c.d.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(67606);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j2) {
                        asyncAVService.uiService().recordService().startRecord(activity, builder.build());
                        activity.finish();
                    }
                });
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("path", str);
            intent.putExtra("music_model", musicModel);
            intent.putExtra("music_origin", str2);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
