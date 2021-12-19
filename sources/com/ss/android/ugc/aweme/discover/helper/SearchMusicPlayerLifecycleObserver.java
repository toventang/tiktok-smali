package com.ss.android.ugc.aweme.discover.helper;

import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.metrics.ah;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.search.l.k;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.tux.a.i.a;
import com.zhiliaoapp.musically.R;

public class SearchMusicPlayerLifecycleObserver implements au {

    /* renamed from: a  reason: collision with root package name */
    public e f81023a;

    /* renamed from: b  reason: collision with root package name */
    public MusicPlayHelper f81024b;

    /* renamed from: c  reason: collision with root package name */
    public d f81025c;

    /* renamed from: d  reason: collision with root package name */
    public u f81026d = new u<o>() {
        /* class com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.AnonymousClass1 */

        static {
            Covode.recordClassIndex(50367);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(o oVar) {
            o oVar2 = oVar;
            if (oVar2 != null) {
                int i2 = oVar2.f81156a;
                if (i2 == 1) {
                    if (SearchMusicPlayerLifecycleObserver.this.f81025c == null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = SearchMusicPlayerLifecycleObserver.this;
                        searchMusicPlayerLifecycleObserver.f81025c = d.a(searchMusicPlayerLifecycleObserver.f81023a, SearchMusicPlayerLifecycleObserver.this.f81023a.getResources().getString(R.string.dba));
                    }
                    SearchMusicPlayerLifecycleObserver.this.f81025c.setIndeterminate(false);
                } else if (i2 == 2) {
                    if (SearchMusicPlayerLifecycleObserver.this.f81025c == null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver2 = SearchMusicPlayerLifecycleObserver.this;
                        searchMusicPlayerLifecycleObserver2.f81025c = d.a(searchMusicPlayerLifecycleObserver2.f81023a, SearchMusicPlayerLifecycleObserver.this.f81023a.getResources().getString(R.string.dba));
                        SearchMusicPlayerLifecycleObserver.this.f81025c.setIndeterminate(false);
                    }
                    SearchMusicPlayerLifecycleObserver.this.f81025c.setProgress(oVar2.f81157b);
                } else if (i2 == 3) {
                    if (SearchMusicPlayerLifecycleObserver.this.f81025c != null) {
                        SearchMusicPlayerLifecycleObserver.this.f81025c.setProgress(100);
                    }
                    SearchMusicPlayerLifecycleObserver.this.a();
                    if (oVar2.f81159d != null && !TextUtils.isEmpty(oVar2.f81159d.f81076a) && oVar2.f81159d.f81077b != null) {
                        SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver3 = SearchMusicPlayerLifecycleObserver.this;
                        String str = oVar2.f81159d.f81076a;
                        MusicModel musicModel = oVar2.f81159d.f81077b;
                        ah.f109483a = "search_result";
                        AVExternalServiceImpl.a().asyncService("SearchMusic", new SimpleServiceLoadCallback(new RecordConfig.Builder().shootWay("search_music").translationType(3).musicPath(str).musicOrigin("search_result").build(), musicModel) {
                            /* class com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.AnonymousClass2 */

                            /* renamed from: a  reason: collision with root package name */
                            final /* synthetic */ RecordConfig f81028a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ MusicModel f81029b;

                            static {
                                Covode.recordClassIndex(50368);
                            }

                            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j2) {
                                asyncAVService.uiService().recordService().startRecord(SearchMusicPlayerLifecycleObserver.this.f81023a, this.f81028a, this.f81029b, false);
                            }

                            {
                                this.f81028a = r2;
                                this.f81029b = r3;
                            }
                        });
                    }
                } else if (i2 == 4) {
                    SearchMusicPlayerLifecycleObserver.this.a();
                    if (oVar2.f81158c > 0) {
                        new a(SearchMusicPlayerLifecycleObserver.this.f81023a).a(oVar2.f81158c).a();
                    }
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(50366);
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void a() {
        d dVar = this.f81025c;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f81025c = null;
    }

    @v(a = i.a.ON_CREATE)
    public void onCreate() {
        k.INSTANCE.async(new Runnable() {
            /* class com.ss.android.ugc.aweme.discover.helper.SearchMusicPlayerLifecycleObserver.AnonymousClass3 */

            static {
                Covode.recordClassIndex(50369);
            }

            public final void run() {
                SearchMusicPlayerLifecycleObserver searchMusicPlayerLifecycleObserver = SearchMusicPlayerLifecycleObserver.this;
                searchMusicPlayerLifecycleObserver.f81024b = (MusicPlayHelper) ae.a(searchMusicPlayerLifecycleObserver.f81023a, (ad.b) null).a(MusicPlayHelper.class);
                SearchMusicPlayerLifecycleObserver.this.f81024b.f81006d.a(SearchMusicPlayerLifecycleObserver.this.f81023a, SearchMusicPlayerLifecycleObserver.this.f81026d, false);
            }
        });
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
        a();
        MusicPlayHelper musicPlayHelper = this.f81024b;
        if (musicPlayHelper != null) {
            musicPlayHelper.f81006d.removeObserver(this.f81026d);
        }
    }

    public SearchMusicPlayerLifecycleObserver(e eVar) {
        this.f81023a = eVar;
    }
}
