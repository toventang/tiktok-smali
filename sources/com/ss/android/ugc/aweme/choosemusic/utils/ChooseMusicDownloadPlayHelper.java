package com.ss.android.ugc.aweme.choosemusic.utils;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.choosemusic.b;
import com.ss.android.ugc.aweme.choosemusic.model.ai;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.music.ui.be;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.musicprovider.interfaces.c;

public class ChooseMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements au {

    /* renamed from: a  reason: collision with root package name */
    public b f70711a;

    /* renamed from: b  reason: collision with root package name */
    public a f70712b;
    private Handler v;
    private HandlerThread w;
    private ai x;

    public interface a {
        static {
            Covode.recordClassIndex(43598);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(43593);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void b() {
        this.f111796f.a(new a(this));
        this.f111796f.a(new com.ss.android.ugc.musicprovider.interfaces.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43595);
            }

            @Override // com.ss.android.ugc.musicprovider.interfaces.a
            public final void a() {
                if (ChooseMusicDownloadPlayHelper.this.f70712b != null) {
                    ChooseMusicDownloadPlayHelper.this.f70712b.a();
                }
                if (ChooseMusicDownloadPlayHelper.this.f70711a.f70386h) {
                    b.a(ChooseMusicDownloadPlayHelper.this.o.getMusicId());
                    b.a(ChooseMusicDownloadPlayHelper.this.o.getMusicId(), ChooseMusicDownloadPlayHelper.this.f70711a, ChooseMusicDownloadPlayHelper.this.o);
                }
            }
        });
        this.f111796f.a(new com.ss.android.ugc.musicprovider.interfaces.b() {
            /* class com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43596);
            }

            @Override // com.ss.android.ugc.musicprovider.interfaces.b
            public final void a() {
                if (ChooseMusicDownloadPlayHelper.this.f70712b != null) {
                    ChooseMusicDownloadPlayHelper.this.f70712b.b();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void ao_() {
        super.ao_();
        if (this.o != null && this.f70711a != null) {
            b.a(this.o.getMusicId());
            b.a(this.o.getMusicId(), this.f70711a, this.o);
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void c() {
        if (this.q != null) {
            this.q.cancel();
        }
        if (this.v != null) {
            Message obtain = Message.obtain();
            obtain.what = 2;
            this.v.sendMessage(obtain);
        } else if (this.f111796f != null) {
            this.f111796f.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void d() {
        super.d();
        HandlerThread handlerThread = this.w;
        if (handlerThread != null) {
            handlerThread.quit();
            this.w = null;
        }
        Handler handler = this.v;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.v = null;
        }
        if (this.f111796f != null) {
            this.f111796f.a((com.ss.android.ugc.musicprovider.interfaces.a) null);
            this.f111796f.a((com.ss.android.ugc.musicprovider.interfaces.b) null);
            this.f111796f.a((c) null);
            this.f111796f.a();
        }
        this.f70712b = null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i2) {
        String str;
        if (this.o != null) {
            MusicModel musicModel = this.o;
            if (this.q != null) {
                this.q.cancel();
            }
            if (musicModel.getDuration() != musicModel.getAuditionDuration().intValue()) {
                this.q = new CountDownTimer((long) musicModel.getRealAuditionDuration()) {
                    /* class com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(43597);
                    }

                    public final void onTick(long j2) {
                    }

                    public final void onFinish() {
                        ChooseMusicDownloadPlayHelper.this.f111796f.b();
                        if (ChooseMusicDownloadPlayHelper.this.f70712b != null) {
                            ChooseMusicDownloadPlayHelper.this.f70712b.a();
                        }
                    }
                };
                this.q.start();
            }
        }
        b bVar = this.f70711a;
        MusicModel musicModel2 = this.o;
        if (!(bVar == null || musicModel2 == null || musicModel2.getMusicType() == MusicModel.MusicType.LOCAL || b.f70720c == -1)) {
            d dVar = new d();
            dVar.a("enter_from", bVar.f70379a).a("music_id", musicModel2.getMusicId()).a("category_name", bVar.f70380b).a("enter_method", bVar.f70381c).a("previous_page", bVar.f70382d).a("order", b.f70720c).a("creation_id", b.f70721d);
            if (!TextUtils.isEmpty(bVar.f70385g)) {
                dVar.a("tag_id", bVar.f70385g);
            }
            if (!TextUtils.isEmpty(bVar.f70384f)) {
                dVar.a("prop_id", bVar.f70384f);
            }
            if (!TextUtils.isEmpty(bVar.f70383e)) {
                dVar.a("category_id", bVar.f70383e);
            }
            if (bVar.f70387i != null) {
                dVar.a("log_pb", bVar.f70387i);
                if (!TextUtils.isEmpty(bVar.f70387i.getImprId())) {
                    str = bVar.f70387i.getImprId();
                } else {
                    str = "";
                }
                dVar.a("impr_id", str);
            }
            if (TextUtils.equals(bVar.f70379a, "search_music")) {
                dVar.a("search_keyword", b.f70719b);
                dVar.a("log_pb", new f().b(musicModel2.getLogPb()));
                dVar.a("search_id", musicModel2.getSearchId());
                dVar.a("search_result_id", musicModel2.getId());
                if (b.a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a("play_music", be.a(dVar.f66730a));
            } else {
                if (b.a()) {
                    dVar.a("is_commercial", "1");
                }
                r.a("play_music", dVar.f66730a);
            }
        }
        String musicId = this.o.getMusicId();
        if (b.f70723f == null) {
            b.f70723f = new e();
        }
        b.f70723f.a(musicId, i2);
        String musicId2 = this.o.getMusicId();
        ai aiVar = this.x;
        if (aiVar != null && TextUtils.equals(musicId2, aiVar.f70623a)) {
            com.bytedance.apm.b.a("time_from_click_music_to_start_play", new com.ss.android.ugc.aweme.app.f.c().a("duration", Long.valueOf(System.currentTimeMillis() - this.x.f70624b)).a());
        }
        if (this.n && this.f111796f != null) {
            c();
        }
        if (!(this.f111793c == null || this.f111793c.h() == null || i2 == 0)) {
            this.f111793c.h().setDuration(i2);
        }
        super.g();
    }

    public ChooseMusicDownloadPlayHelper(com.ss.android.ugc.aweme.music.ui.m mVar, a aVar) {
        super(mVar);
        this.f70712b = aVar;
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void a(MusicModel musicModel, int i2, boolean z) {
        f fVar = new f(musicModel, i2, z);
        if (musicModel != null) {
            this.x = new ai(musicModel.getMusicId(), System.currentTimeMillis());
        }
        if (this.w == null) {
            HandlerThread handlerThread = new HandlerThread("play_music");
            this.w = handlerThread;
            handlerThread.start();
        }
        if (this.v == null) {
            this.v = new Handler(this.w.getLooper()) {
                /* class com.ss.android.ugc.aweme.choosemusic.utils.ChooseMusicDownloadPlayHelper.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(43594);
                }

                public final void handleMessage(Message message) {
                    if (message.what == 2) {
                        if (ChooseMusicDownloadPlayHelper.this.f111796f != null) {
                            ChooseMusicDownloadPlayHelper.this.f111796f.b();
                        }
                    } else if (message.what == 1) {
                        f fVar = (f) message.obj;
                        ChooseMusicDownloadPlayHelper.super.a((ChooseMusicDownloadPlayHelper) fVar.f70745a, (MusicModel) fVar.f70746b, (int) fVar.f70747c);
                    }
                }
            };
        }
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = fVar;
        this.v.sendMessage(obtain);
    }
}
