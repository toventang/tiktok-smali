package com.ss.android.ugc.aweme.choosemusic.c;

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
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.a;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.f.a;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.m;
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
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public abstract class i<T> extends a implements u<b>, a.AbstractC1507a<T>, com.ss.android.ugc.aweme.choosemusic.d.b, k<c>, m, org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    protected ChooseMusicDownloadPlayHelper f70464a;

    /* renamed from: b  reason: collision with root package name */
    protected MusicModel f70465b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f70466c = true;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.choosemusic.model.b f70467d;

    /* renamed from: e  reason: collision with root package name */
    public DataCenter f70468e;

    /* renamed from: j  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.arch.c<T> f70469j;

    /* renamed from: k  reason: collision with root package name */
    protected int f70470k;

    /* renamed from: l  reason: collision with root package name */
    protected int f70471l;

    /* renamed from: m  reason: collision with root package name */
    private com.ss.android.ugc.aweme.arch.a f70472m;

    static {
        Covode.recordClassIndex(43455);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, long j2) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(MusicModel musicModel, Exception exc) {
    }

    /* access modifiers changed from: protected */
    public abstract com.ss.android.ugc.aweme.arch.c<T> b(View view);

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void c(MusicModel musicModel) {
    }

    /* access modifiers changed from: protected */
    public boolean g() {
        return true;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(52, new g(i.class, "onMusicCollectEvent", com.ss.android.ugc.aweme.music.f.b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public abstract int o();

    /* access modifiers changed from: protected */
    public abstract String p();

    /* access modifiers changed from: protected */
    public abstract int q();

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void r() {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final MusicModel h() {
        return this.f70465b;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final void a(String str, MusicModel musicModel, String str2) {
        e activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AVExternalServiceImpl.a().publishService().setCurMusic(musicModel, true, false);
            a(str, musicModel, str2, activity);
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, final MusicModel musicModel, String str2, final Activity activity) {
        if (this.f70471l == 1) {
            final RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.musicOrigin(str2).musicModel(musicModel).musicPath(str).shootWay("single_song");
            AVExternalServiceImpl.a().asyncService("BaseMuiscList", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.choosemusic.c.i.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(43457);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(activity, builder.build(), musicModel, true);
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

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final boolean bN_() {
        return ab_();
    }

    @Override // com.ss.android.ugc.aweme.music.ui.m
    public final Activity i() {
        return getActivity();
    }

    public RecyclerView.a k() {
        com.ss.android.ugc.aweme.arch.c<T> cVar = this.f70469j;
        if (cVar != null) {
            return cVar.c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final ShareInfo n() {
        DataCenter dataCenter = this.f70468e;
        if (dataCenter != null) {
            return (ShareInfo) dataCenter.a("data_share_info");
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70464a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
            this.f70464a.d();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70464a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.n = false;
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
        this.f70467d = new com.ss.android.ugc.aweme.choosemusic.model.b(getContext(), this.f70468e);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70464a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
            this.f70464a.n = true;
        }
        RecyclerView.a k2 = k();
        if (k2 instanceof com.ss.android.ugc.aweme.choosemusic.a.b) {
            ((com.ss.android.ugc.aweme.choosemusic.a.b) k2).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public DataCenter e() {
        if (this.f70468e == null) {
            this.f70468e = DataCenter.a(ae.a(this, (ad.b) null), this);
        }
        this.f70468e.a("music_collect_status", (u<b>) this).a("play_compeleted", (u<b>) this);
        this.f70468e.a("music_loading", (u<b>) this);
        this.f70468e.a("data_share_info", (u<b>) this);
        return this.f70468e;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicDownloadPlayHelper.a aVar) {
        this.f70464a.f111798h = aVar;
    }

    @Override // com.ss.android.ugc.aweme.arch.a.AbstractC1507a
    public final com.ss.android.ugc.aweme.arch.c<T> a(View view) {
        if (this.f70469j == null) {
            this.f70469j = b(view);
        }
        return this.f70469j;
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void b(MusicModel musicModel) {
        this.f70464a.f111801k = p();
        this.f70464a.a(musicModel, o(), true, l());
    }

    /* access modifiers changed from: protected */
    public void a(com.ss.android.ugc.aweme.choosemusic.b.a aVar) {
        int i2;
        if (aVar.f70389a == 1) {
            if (aVar.f70392d == 1) {
                i2 = R.string.ahj;
            } else {
                i2 = R.string.a9i;
            }
        } else if (aVar.f70392d == 1) {
            i2 = R.string.aho;
        } else {
            i2 = R.string.a9j;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(i2).a();
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = 1;
        if (getArguments() != null) {
            i2 = getArguments().getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
        }
        this.f70471l = i2;
        int i3 = 0;
        if (getArguments() != null) {
            i3 = getArguments().getInt("sound_page_scene", 0);
        }
        this.f70470k = i3;
    }

    @r(b = true)
    public void onMusicCollectEvent(com.ss.android.ugc.aweme.music.f.b bVar) {
        if (this.f70468e != null && bVar != null && "music_detail".equals(bVar.f111485c)) {
            this.f70468e.a("music_collect_status", new com.ss.android.ugc.aweme.choosemusic.b.a(0, bVar.f111483a, -1, -1, bVar.f111484b));
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel) {
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = this.f70464a;
        if (chooseMusicDownloadPlayHelper != null) {
            chooseMusicDownloadPlayHelper.ao_();
        }
    }

    /* renamed from: a */
    public void onChanged(b bVar) {
        MusicModel.CollectionType collectionType;
        if (bVar != null) {
            String str = bVar.f67014a;
            str.hashCode();
            switch (str.hashCode()) {
                case -2102085437:
                    if (str.equals("data_share_info")) {
                        com.ss.android.ugc.aweme.arch.c<T> cVar = this.f70469j;
                        if (cVar instanceof com.ss.android.ugc.aweme.choosemusic.view.u) {
                            com.ss.android.ugc.aweme.choosemusic.view.u uVar = (com.ss.android.ugc.aweme.choosemusic.view.u) cVar;
                            if (!CommerceMediaServiceImpl.f().b() && !CommerceMediaServiceImpl.f().e()) {
                                uVar.f70840a.setEndBtnIcon(2131232360);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                case -1635157503:
                    if (str.equals("music_collect_status")) {
                        com.ss.android.ugc.aweme.choosemusic.b.a aVar = (com.ss.android.ugc.aweme.choosemusic.b.a) bVar.a();
                        com.ss.android.ugc.aweme.arch.c<T> cVar2 = this.f70469j;
                        if (!(cVar2 == null || cVar2.c() == null)) {
                            List<T> e2 = this.f70469j.c().e();
                            if (!com.bytedance.common.utility.collection.b.a((Collection) e2)) {
                                if (aVar.f70389a == 1) {
                                    if (e2.size() > aVar.f70391c) {
                                        this.f70469j.c().notifyItemChanged(aVar.f70391c);
                                    }
                                } else if (aVar.f70391c == -1) {
                                    MusicModel a2 = com.ss.android.ugc.aweme.choosemusic.utils.c.a(e2, aVar.f70393e.getMusicId());
                                    if (a2 != null) {
                                        if (aVar.f70392d == 1) {
                                            collectionType = MusicModel.CollectionType.COLLECTED;
                                        } else {
                                            collectionType = MusicModel.CollectionType.NOT_COLLECTED;
                                        }
                                        a2.setCollectionType(collectionType);
                                        int indexOf = e2.indexOf(a2);
                                        if (indexOf >= 0 && indexOf < e2.size() && g()) {
                                            this.f70469j.c().notifyItemChanged(indexOf);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        if (getUserVisibleHint()) {
                            a(aVar);
                            return;
                        }
                        return;
                    }
                    return;
                case -1322093457:
                    if (str.equals("play_compeleted") && (k() instanceof com.ss.android.ugc.aweme.choosemusic.a.b)) {
                        ((com.ss.android.ugc.aweme.choosemusic.a.b) k()).a();
                        return;
                    }
                    return;
                case 502104354:
                    if (str.equals("music_loading") && this.f70469j != null) {
                        Integer num = (Integer) this.f70468e.a("music_position");
                        if (num != null) {
                            num.intValue();
                        }
                        ((com.ss.android.ugc.aweme.choosemusic.a.b) k()).a(((Boolean) this.f70468e.a("music_loading")).booleanValue());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.music.b.k
    public final /* synthetic */ void a(c cVar) {
        c cVar2 = cVar;
        String str = cVar2.f70396b;
        MusicModel musicModel = cVar2.f70395a;
        if ("follow_type".equals(str)) {
            this.f70467d.a(musicModel, musicModel.getMusicId(), 1, cVar2.f70397c, cVar2.f70398d);
        } else if ("unfollow_type".equals(str)) {
            this.f70467d.a(musicModel, musicModel.getMusicId(), 0, cVar2.f70397c, cVar2.f70398d);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f70472m == null) {
            this.f70472m = new com.ss.android.ugc.aweme.arch.a(this);
        }
        this.f70472m.a(view);
        ChooseMusicDownloadPlayHelper chooseMusicDownloadPlayHelper = new ChooseMusicDownloadPlayHelper(this, new ChooseMusicDownloadPlayHelper.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.c.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43456);
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void a() {
                if (i.this.f70465b != null) {
                    i.this.f70468e.a("play_compeleted", i.this.f70465b.getMusicId());
                }
            }

            @Override // com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.a
            public final void b() {
                if (i.this.f70465b != null) {
                    i.this.f70468e.a("play_error", i.this.f70465b.getMusicId());
                }
            }
        });
        this.f70464a = chooseMusicDownloadPlayHelper;
        chooseMusicDownloadPlayHelper.b();
        this.f70464a.b(this.f70471l);
        RecyclerView.a k2 = k();
        if (k2 instanceof com.ss.android.ugc.aweme.choosemusic.a.b) {
            this.f70464a.f70711a = ((com.ss.android.ugc.aweme.choosemusic.a.b) k2).f70284e;
        }
    }

    @Override // com.ss.android.ugc.aweme.choosemusic.d.b
    public final void a(MusicModel musicModel, com.ss.android.ugc.aweme.choosemusic.b bVar) {
        this.f70465b = musicModel;
        this.f70468e.a("music_loading", (Object) true);
        if (this.f70466c) {
            this.f70464a.f70711a = bVar;
            this.f70464a.a(musicModel, o(), false);
            return;
        }
        this.f70464a.a(musicModel, o(), true, l());
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, q(), viewGroup, false);
    }
}
